package com.instagram.realtimeclient;

import X.16F;
import X.16L;
import X.16P;
import X.AnonymousClass1FD;
import X.C41846B3n;
import com.instagram.realtimeclient.RealtimeStoreKey;

public final class RealtimeStoreKey_ShimValueWithId__JsonHelper {
    public static RealtimeStoreKey.ShimValueWithId parseFromJson(16F r1) {
        return (RealtimeStoreKey.ShimValueWithId) 16P.A01(r1, new AnonymousClass1FD() {
            public RealtimeStoreKey.ShimValueWithId invoke(16F r2) {
                return RealtimeStoreKey_ShimValueWithId__JsonHelper.unsafeParseFromJson(r2);
            }
        });
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.realtimeclient.RealtimeStoreKey$ShimValueWithId, java.lang.Object] */
    public static RealtimeStoreKey.ShimValueWithId unsafeParseFromJson(16F r4) {
        if (r4.A11() != 16L.A0D) {
            r4.A0z();
            return null;
        }
        String str = null;
        while (r4.A1J() != 16L.A09) {
            String A0q = r4.A0q();
            if (C41846B3n.A1Y(r4, A0q) || "pk".equals(A0q) || "item_id".equals(A0q)) {
                if (r4.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r4.A1P();
                }
            }
            r4.A0z();
        }
        ? obj = new Object();
        if (str != null) {
            obj.id = str;
        }
        return obj;
    }

    public static RealtimeStoreKey.ShimValueWithId parseFromJson(String str) {
        return parseFromJson(16P.A00(str));
    }
}
