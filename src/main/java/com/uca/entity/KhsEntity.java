package com.uca.entity;

import javax.websocket.Session;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author puyijun
 * @ClassName KhsEntity
 * @date 2018-01-11
 * @time 16:53
 * @Description 客服单例集合
 **/

public class KhsEntity {

    private static List<Map<String,Session>> khs = new ArrayList<Map<String,Session>>();//客户

    private KhsEntity() {
    }

    public static List<Map<String,Session>> hqKhs(){
        return khs;
    }
}
