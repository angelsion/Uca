package com.uca.entity;

import com.sun.org.apache.xerces.internal.xs.StringList;

import javax.websocket.Session;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author puyijun
 * @ClassName KfsEntity
 * @date 2018-01-11
 * @time 16:50
 * @Description 客服单例集合
 **/

public class KfsEntity {

    private static List<Map<String,Session>> kfs = new ArrayList<Map<String,Session>>();//客服

    private KfsEntity() {

    }

    public static List<Map<String,Session>> hqKfs(){

        return kfs;

    }
}
