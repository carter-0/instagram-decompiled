package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

public class VideoBroadcastAudioStreamingConfigDeserializer extends FbJsonDeserializer {
    public static Map A00;

    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        A00.put(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0073, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0076, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0077, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        X.SS5.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007f, code lost:
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
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfigDeserializer> r2 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfigDeserializer.class
            monitor-enter(r2)
            java.util.Map r0 = A00     // Catch:{ all -> 0x0080 }
            if (r0 != 0) goto L_0x000e
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x0080 }
            A00 = r0     // Catch:{ all -> 0x0080 }
            goto L_0x0018
        L_0x000e:
            java.lang.Object r1 = r0.get(r4)     // Catch:{ all -> 0x0080 }
            com.facebook.common.json.FbJsonField r1 = (com.facebook.common.json.FbJsonField) r1     // Catch:{ all -> 0x0080 }
            if (r1 == 0) goto L_0x0018
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x0080 }
            goto L_0x0073
        L_0x0018:
            int r0 = r4.hashCode()     // Catch:{ Exception -> 0x0077 }
            switch(r0) {
                case -2037875358: goto L_0x005e;
                case -309425751: goto L_0x004e;
                case -103223411: goto L_0x003f;
                case 143085994: goto L_0x002f;
                case 1432626128: goto L_0x0020;
                default: goto L_0x001f;
            }     // Catch:{ Exception -> 0x0077 }
        L_0x001f:
            goto L_0x0074
        L_0x0020:
            java.lang.String r1 = "channels"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x0077 }
            if (r0 == 0) goto L_0x0074
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfig.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x0077 }
            goto L_0x006d
        L_0x002f:
            java.lang.String r1 = "sampleRate"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x0077 }
            if (r0 == 0) goto L_0x0074
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfig.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x0077 }
            goto L_0x006d
        L_0x003f:
            java.lang.String r1 = "bitRate"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x0077 }
            if (r0 == 0) goto L_0x0074
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfig.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x0077 }
            goto L_0x006d
        L_0x004e:
            java.lang.String r1 = "profile"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x0077 }
            if (r0 == 0) goto L_0x0074
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfig.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x0077 }
            goto L_0x006d
        L_0x005e:
            java.lang.String r1 = "useAudioASC"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x0077 }
            if (r0 == 0) goto L_0x0074
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfig> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfig.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x0077 }
        L_0x006d:
            java.util.Map r0 = A00     // Catch:{ all -> 0x0080 }
            r0.put(r4, r1)     // Catch:{ all -> 0x0080 }
            goto L_0x0016
        L_0x0073:
            return r1
        L_0x0074:
            r0 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x0080 }
            return r0
        L_0x0077:
            r0 = move-exception
            X.SS5.A02(r0)     // Catch:{ all -> 0x0080 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x0080 }
            throw r0     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0080 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfigDeserializer.A0N(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public VideoBroadcastAudioStreamingConfigDeserializer() {
        this.A00 = VideoBroadcastAudioStreamingConfig.class;
    }
}
