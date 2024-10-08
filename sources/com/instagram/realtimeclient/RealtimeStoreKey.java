package com.instagram.realtimeclient;

import X.002;
import X.16P;

public class RealtimeStoreKey {

    public class ShimValueWithId {
        public String id;
    }

    public static String getKey(RealtimeOperation realtimeOperation) {
        String str;
        String str2 = realtimeOperation.path;
        if (!str2.startsWith(RealtimeProtocol.DIRECT_V2)) {
            ShimValueWithId shimValueWithId = null;
            try {
                shimValueWithId = RealtimeStoreKey_ShimValueWithId__JsonHelper.parseFromJson(16P.A00(realtimeOperation.value));
            } catch (Exception unused) {
            }
            if (!(shimValueWithId == null || (str = shimValueWithId.id) == null)) {
                return 002.A0g(str2, "/", str);
            }
        }
        return str2;
    }
}
