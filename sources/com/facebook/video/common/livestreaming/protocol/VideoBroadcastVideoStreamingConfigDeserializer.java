package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

public class VideoBroadcastVideoStreamingConfigDeserializer extends FbJsonDeserializer {
    public static Map A00;

    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        A00.put(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0084, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0086, code lost:
        X.SS5.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008d, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r1 != null) goto L_0x0016;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.common.json.FbJsonField A0N(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfigDeserializer> r2 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfigDeserializer.class
            monitor-enter(r2)
            java.util.Map r0 = A00     // Catch:{ all -> 0x008e }
            if (r0 != 0) goto L_0x000e
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x008e }
            A00 = r0     // Catch:{ all -> 0x008e }
            goto L_0x0018
        L_0x000e:
            java.lang.Object r1 = r0.get(r4)     // Catch:{ all -> 0x008e }
            com.facebook.common.json.FbJsonField r1 = (com.facebook.common.json.FbJsonField) r1     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x0018
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            goto L_0x0081
        L_0x0018:
            int r0 = r4.hashCode()     // Catch:{ Exception -> 0x0085 }
            switch(r0) {
                case -1221029593: goto L_0x006d;
                case -456581970: goto L_0x005d;
                case -103223411: goto L_0x004e;
                case 113126854: goto L_0x003e;
                case 545057773: goto L_0x002f;
                case 1538135913: goto L_0x0020;
                default: goto L_0x001f;
            }     // Catch:{ Exception -> 0x0085 }
        L_0x001f:
            goto L_0x0082
        L_0x0020:
            java.lang.String r1 = "iFrameInterval"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x0085 }
            if (r0 == 0) goto L_0x0082
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x0085 }
            goto L_0x007b
        L_0x002f:
            java.lang.String r1 = "frameRate"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x0085 }
            if (r0 == 0) goto L_0x0082
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x0085 }
            goto L_0x007b
        L_0x003e:
            java.lang.String r1 = "width"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x0085 }
            if (r0 == 0) goto L_0x0082
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x0085 }
            goto L_0x007b
        L_0x004e:
            java.lang.String r1 = "bitRate"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x0085 }
            if (r0 == 0) goto L_0x0082
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x0085 }
            goto L_0x007b
        L_0x005d:
            java.lang.String r1 = "videoProfile"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x0085 }
            if (r0 == 0) goto L_0x0082
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x0085 }
            goto L_0x007b
        L_0x006d:
            java.lang.String r1 = "height"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x0085 }
            if (r0 == 0) goto L_0x0082
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x0085 }
        L_0x007b:
            java.util.Map r0 = A00     // Catch:{ all -> 0x008e }
            r0.put(r4, r1)     // Catch:{ all -> 0x008e }
            goto L_0x0016
        L_0x0081:
            return r1
        L_0x0082:
            r0 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            return r0
        L_0x0085:
            r0 = move-exception
            X.SS5.A02(r0)     // Catch:{ all -> 0x008e }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x008e }
            throw r0     // Catch:{ all -> 0x008e }
        L_0x008e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfigDeserializer.A0N(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public VideoBroadcastVideoStreamingConfigDeserializer() {
        this.A00 = VideoBroadcastVideoStreamingConfig.class;
    }
}
