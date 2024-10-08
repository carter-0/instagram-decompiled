package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

public class VideoBroadcastLiveWithConfigDeserializer extends FbJsonDeserializer {
    public static Map A00;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0064, code lost:
        X.SS5.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006b, code lost:
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
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveWithConfigDeserializer> r2 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveWithConfigDeserializer.class
            monitor-enter(r2)
            java.util.Map r0 = A00     // Catch:{ all -> 0x006c }
            if (r0 != 0) goto L_0x000e
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x006c }
            A00 = r0     // Catch:{ all -> 0x006c }
            goto L_0x0018
        L_0x000e:
            java.lang.Object r1 = r0.get(r4)     // Catch:{ all -> 0x006c }
            com.facebook.common.json.FbJsonField r1 = (com.facebook.common.json.FbJsonField) r1     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x0018
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x006c }
            goto L_0x005f
        L_0x0018:
            int r1 = r4.hashCode()     // Catch:{ Exception -> 0x0063 }
            r0 = 540947080(0x203e3288, float:1.6110345E-19)
            if (r1 == r0) goto L_0x0049
            r0 = 1137806104(0x43d18b18, float:419.08667)
            if (r1 == r0) goto L_0x003a
            r0 = 1328403556(0x4f2dd464, float:2.9163776E9)
            if (r1 != r0) goto L_0x0060
            java.lang.String r1 = "isCenterCropOutputFrameEnabled"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x0063 }
            if (r0 == 0) goto L_0x0060
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveWithConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveWithConfig.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0059
        L_0x003a:
            java.lang.String r1 = "isMuteModerationEnabled"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x0063 }
            if (r0 == 0) goto L_0x0060
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveWithConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveWithConfig.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0059
        L_0x0049:
            java.lang.String r0 = "isUseRtmpDimensionsForLiveswapEnabled"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x0063 }
            if (r0 == 0) goto L_0x0060
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveWithConfig> r1 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveWithConfig.class
            java.lang.String r0 = "isUseRtmpDimensionsForLiveSwapEnabled"
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r1, r0)     // Catch:{ Exception -> 0x0063 }
        L_0x0059:
            java.util.Map r0 = A00     // Catch:{ all -> 0x006c }
            r0.put(r4, r1)     // Catch:{ all -> 0x006c }
            goto L_0x0016
        L_0x005f:
            return r1
        L_0x0060:
            r0 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x006c }
            return r0
        L_0x0063:
            r0 = move-exception
            X.SS5.A02(r0)     // Catch:{ all -> 0x006c }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x006c }
            throw r0     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveWithConfigDeserializer.A0N(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public VideoBroadcastLiveWithConfigDeserializer() {
        this.A00 = VideoBroadcastLiveWithConfig.class;
    }
}
