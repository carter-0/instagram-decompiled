package com.instagram.realtimeclient;

import X.16F;
import X.16L;
import X.16P;
import X.AnonymousClass1FD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.realtimeclient.RealtimeOperation;

public final class RealtimeOperation__JsonHelper {
    public static RealtimeOperation parseFromJson(16F r1) {
        return (RealtimeOperation) 16P.A01(r1, new AnonymousClass1FD() {
            public RealtimeOperation invoke(16F r2) {
                return RealtimeOperation__JsonHelper.unsafeParseFromJson(r2);
            }
        });
    }

    public static boolean processSingleField(RealtimeOperation realtimeOperation, String str, 16F r4) {
        if ("op".equals(str)) {
            realtimeOperation.op = RealtimeOperation.Type.valueOf(r4.A1P());
            return true;
        } else if ("path".equals(str)) {
            realtimeOperation.path = AnonymousClass7TG.A0l(r4);
            return true;
        } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(str)) {
            realtimeOperation.value = AnonymousClass7TG.A0l(r4);
            return true;
        } else if (!"ts".equals(str)) {
            return false;
        } else {
            realtimeOperation.timestamp = AnonymousClass7TG.A0l(r4);
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, com.instagram.realtimeclient.RealtimeOperation] */
    public static RealtimeOperation unsafeParseFromJson(16F r3) {
        ? obj = new Object();
        if (r3.A11() != 16L.A0D) {
            r3.A0z();
            return null;
        }
        while (r3.A1J() != 16L.A09) {
            processSingleField(obj, AnonymousClass7TE.A17(r3), r3);
            r3.A0z();
        }
        return obj;
    }

    public static RealtimeOperation parseFromJson(String str) {
        return parseFromJson(16P.A00(str));
    }
}
