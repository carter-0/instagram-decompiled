package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

public class VideoBroadcastLiveOnlineEventConfigDeserializer extends FbJsonDeserializer {
    public static Map A00;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r1 != null) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.common.json.FbJsonField A0N(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveOnlineEventConfigDeserializer> r3 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveOnlineEventConfigDeserializer.class
            monitor-enter(r3)
            java.util.Map r0 = A00     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x000e
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x0049 }
            A00 = r0     // Catch:{ all -> 0x0049 }
            goto L_0x0018
        L_0x000e:
            java.lang.Object r1 = r0.get(r5)     // Catch:{ all -> 0x0049 }
            com.facebook.common.json.FbJsonField r1 = (com.facebook.common.json.FbJsonField) r1     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0018
        L_0x0016:
            monitor-exit(r3)     // Catch:{ all -> 0x0049 }
            goto L_0x003c
        L_0x0018:
            int r1 = r5.hashCode()     // Catch:{ Exception -> 0x0040 }
            r0 = 2015319165(0x781f547d, float:1.2926388E34)
            if (r1 != r0) goto L_0x003d
            java.lang.String r1 = "creationEntryPoint"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0040 }
            if (r0 == 0) goto L_0x003d
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveOnlineEventConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveOnlineEventConfig.class
            java.lang.reflect.Field r2 = r0.getDeclaredField(r1)     // Catch:{ Exception -> 0x0040 }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0 = 0
            com.facebook.common.json.FbJsonField r1 = com.facebook.common.json.FbJsonField.jsonField((java.lang.reflect.Field) r2, (java.lang.Class) r1, (X.TA4) r0)     // Catch:{ Exception -> 0x0040 }
            java.util.Map r0 = A00     // Catch:{ all -> 0x0049 }
            r0.put(r5, r1)     // Catch:{ all -> 0x0049 }
            goto L_0x0016
        L_0x003c:
            return r1
        L_0x003d:
            r0 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x0049 }
            return r0
        L_0x0040:
            r0 = move-exception
            X.SS5.A02(r0)     // Catch:{ all -> 0x0049 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x0049 }
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0049 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveOnlineEventConfigDeserializer.A0N(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public VideoBroadcastLiveOnlineEventConfigDeserializer() {
        this.A00 = VideoBroadcastLiveOnlineEventConfig.class;
    }
}
