package com.instagram.realtimeclient;

import java.util.HashMap;
import java.util.Map;

public class EventRouter {
    public static String fill(String str, Map map) {
        String[] split = str.split("/");
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            if (str2.startsWith(":")) {
                sb.append((String) map.get(str2.substring(1)));
            } else {
                sb.append(str2);
            }
            sb.append("/");
        }
        String obj = sb.toString();
        return obj.substring(0, obj.length() - 1);
    }

    public static Map match(String str, String str2) {
        String[] split = str.split("/");
        String[] split2 = str2.split("/");
        int length = split.length;
        int length2 = split2.length;
        if (length > length2 || (length < length2 && !split[length - 1].equals("*"))) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < length; i++) {
            if (!split[i].equals("*")) {
                String str3 = split[i];
                if (str3.startsWith(":")) {
                    hashMap.put(str3.substring(1), split2[i]);
                } else if (!str3.equals(split2[i])) {
                    return null;
                }
            }
        }
        return hashMap;
    }
}
