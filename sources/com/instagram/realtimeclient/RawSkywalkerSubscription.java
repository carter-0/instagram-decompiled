package com.instagram.realtimeclient;

import X.002;

public class RawSkywalkerSubscription {
    public static final String REALTIME_USER_TOPIC_PREFIX = "ig/u/v1/";

    public static String getUserTopicSubscription(String str) {
        return 002.A0R(REALTIME_USER_TOPIC_PREFIX, str);
    }
}
