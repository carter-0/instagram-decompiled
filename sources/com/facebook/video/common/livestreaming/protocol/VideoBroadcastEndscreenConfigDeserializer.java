package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

public class VideoBroadcastEndscreenConfigDeserializer extends FbJsonDeserializer {
    public static Map A00;

    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        A00.put(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c4, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c7, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c9, code lost:
        X.SS5.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d0, code lost:
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
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfigDeserializer> r2 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfigDeserializer.class
            monitor-enter(r2)
            java.util.Map r0 = A00     // Catch:{ all -> 0x00d1 }
            if (r0 != 0) goto L_0x000e
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x00d1 }
            A00 = r0     // Catch:{ all -> 0x00d1 }
            goto L_0x0019
        L_0x000e:
            java.lang.Object r1 = r0.get(r4)     // Catch:{ all -> 0x00d1 }
            com.facebook.common.json.FbJsonField r1 = (com.facebook.common.json.FbJsonField) r1     // Catch:{ all -> 0x00d1 }
            if (r1 == 0) goto L_0x0019
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x00d1 }
            goto L_0x00c4
        L_0x0019:
            int r0 = r4.hashCode()     // Catch:{ Exception -> 0x00c8 }
            switch(r0) {
                case -509784193: goto L_0x00af;
                case -426471967: goto L_0x00a0;
                case 24103219: goto L_0x0091;
                case 72680724: goto L_0x0081;
                case 1212423419: goto L_0x0071;
                case 1668418280: goto L_0x0061;
                case 1711367039: goto L_0x0051;
                case 1815243521: goto L_0x0042;
                case 1824663458: goto L_0x0033;
                case 1941006174: goto L_0x0022;
                default: goto L_0x0020;
            }     // Catch:{ Exception -> 0x00c8 }
        L_0x0020:
            goto L_0x00c5
        L_0x0022:
            java.lang.String r1 = "wasLiveDeletionEnabled"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x00c8 }
            if (r0 == 0) goto L_0x00c5
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00bd
        L_0x0033:
            java.lang.String r1 = "force30dRetention"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x00c8 }
            if (r0 == 0) goto L_0x00c5
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00bd
        L_0x0042:
            java.lang.String r1 = "disableForeverLiveTTL"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x00c8 }
            if (r0 == 0) goto L_0x00c5
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00bd
        L_0x0051:
            java.lang.String r1 = "useKeepForTextForOptions"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x00c8 }
            if (r0 == 0) goto L_0x00c5
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00bd
        L_0x0061:
            java.lang.String r1 = "showBusinessSuiteText"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x00c8 }
            if (r0 == 0) goto L_0x00c5
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00bd
        L_0x0071:
            java.lang.String r1 = "shouldConfirmForeverLiveTTLOption"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x00c8 }
            if (r0 == 0) goto L_0x00c5
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00bd
        L_0x0081:
            java.lang.String r1 = "optionalTTLSelectScreen"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x00c8 }
            if (r0 == 0) goto L_0x00c5
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00bd
        L_0x0091:
            java.lang.String r1 = "disableSixMonthsLiveTTL"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x00c8 }
            if (r0 == 0) goto L_0x00c5
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00bd
        L_0x00a0:
            java.lang.String r1 = "defaultTTLSelection"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x00c8 }
            if (r0 == 0) goto L_0x00c5
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00bd
        L_0x00af:
            java.lang.String r1 = "liveToReelsBottomsheetEnabled"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x00c8 }
            if (r0 == 0) goto L_0x00c5
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfig.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x00c8 }
        L_0x00bd:
            java.util.Map r0 = A00     // Catch:{ all -> 0x00d1 }
            r0.put(r4, r1)     // Catch:{ all -> 0x00d1 }
            goto L_0x0016
        L_0x00c4:
            return r1
        L_0x00c5:
            r0 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x00d1 }
            return r0
        L_0x00c8:
            r0 = move-exception
            X.SS5.A02(r0)     // Catch:{ all -> 0x00d1 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x00d1 }
            throw r0     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00d1 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.common.livestreaming.protocol.VideoBroadcastEndscreenConfigDeserializer.A0N(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public VideoBroadcastEndscreenConfigDeserializer() {
        this.A00 = VideoBroadcastEndscreenConfig.class;
    }
}
