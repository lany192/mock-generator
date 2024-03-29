package com.github.lany192.generator;


import com.github.lany192.generator.entity.Area;
import com.github.lany192.generator.entity.CityBean;
import com.github.lany192.generator.utils.JsonUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CityHelper {
    private volatile static CityHelper instance = null;
    private final List<Area> items = new ArrayList<>();

    private CityHelper() {
        try {
            String json = getJson();
            CityBean cityBean = JsonUtils.json2object(json, CityBean.class);
            items.clear();
            items.addAll(cityBean.getData());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CityHelper getInstance() {
        if (instance == null) {
            synchronized (CityHelper.class) {
                if (instance == null) {
                    instance = new CityHelper();
                }
            }
        }
        return instance;
    }
    /**
     * 获取resource目录下的文件路径
     * 需要这样做的原因是：程序打包成jar包后用ResourceUtils.getFile()获得的路径一部分包含在jar里面，所以无法识别
     */
    private String getFilePath(String path) {
        InputStream is = null;
        try {
            ClassPathResource resource = new ClassPathResource(path);
            is = resource.getInputStream();
            File tmpFile = File.createTempFile("tmp-", ".tmp");
            FileUtils.copyInputStreamToFile(is, tmpFile);
            return tmpFile.getPath();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(is);
        }
        return path;
    }

    public String getJson() throws IOException {
        String dbPath = getFilePath("city.json");
        System.out.println(dbPath);
        File file = new File(dbPath);
        String content = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
        return content;
    }

    /**
     * 获取省份
     */
    public List<Area> getProvinces() {
        return items;
    }

    /**
     * 获取城市列表
     */
    public List<Area> getCities(long provinceId) {
        List<Area> items = new ArrayList<>();
        if (provinceId == 0) {
            return items;
        }
        for (Area info : this.items) {
            if (info.getId() == provinceId) {
                items.addAll(info.getSubarea());
            }
        }
        return items;
    }

    /**
     * 获取地区列表
     */
    public List<Area> getAreas(long provinceId, long cityId) {
        List<Area> items = new ArrayList<>();
        if (provinceId == 0 || cityId == 0) {
            return items;
        }
        List<Area> cities = getCities(provinceId);
        for (Area info : cities) {
            if (info.getId() == cityId) {
                items.addAll(info.getSubarea());
            }
        }
        return items;
    }

    /**
     * 获取省份
     */
    public Area getProvince(long provinceId) {
        if (provinceId == 0) {
            return null;
        }
        for (Area info : items) {
            if (info.getId() == provinceId) {
                return info;
            }
        }
        return null;
    }

    /**
     * 获取城市
     */
    public Area getCity(long provinceId, long cityId) {
        if (provinceId == 0 || cityId == 0) {
            return null;
        }
        List<Area> cities = getCities(provinceId);
        for (Area info : cities) {
            if (info.getId() == cityId) {
                return info;
            }
        }
        return null;
    }

    /**
     * 获取地区
     */
    public Area getArea(long provinceId, long cityId, long areaId) {
        if (provinceId == 0 || cityId == 0 || areaId == 0) {
            return null;
        }
        List<Area> cities = getCities(provinceId);
        for (Area info : cities) {
            if (info.getId() == cityId) {
                List<Area> items = info.getSubarea();
                for (Area item : items) {
                    if (areaId == item.getId()) {
                        return item;
                    }
                }
            }
        }
        return null;
    }
}
