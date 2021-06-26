package com.example.mvc_demo.config;



import com.example.mvc_demo.entity.BgpData;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


/**
 * @author zhangkun.d
 */
@Configuration
@ConfigurationProperties("bgp")
public class PlotBackgroundConfig {
    private List<BgpData> list = new ArrayList<>();

    public List<BgpData> getList() {
        return list;
    }

    public void setList(List<BgpData> list) {
        this.list = list;
    }
}
