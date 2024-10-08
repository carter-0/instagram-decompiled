package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

public class FacecastShareToPublicChannelDeserializer extends FbJsonDeserializer {
    public static Map A00;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        X.SS5.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
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
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.FacecastShareToPublicChannelDeserializer> r2 = com.facebook.video.common.livestreaming.protocol.FacecastShareToPublicChannelDeserializer.class
            monitor-enter(r2)
            java.util.Map r0 = A00     // Catch:{ all -> 0x0057 }
            if (r0 != 0) goto L_0x000e
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x0057 }
            A00 = r0     // Catch:{ all -> 0x0057 }
            goto L_0x0018
        L_0x000e:
            java.lang.Object r1 = r0.get(r4)     // Catch:{ all -> 0x0057 }
            com.facebook.common.json.FbJsonField r1 = (com.facebook.common.json.FbJsonField) r1     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x0018
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x0057 }
            goto L_0x004a
        L_0x0018:
            int r1 = r4.hashCode()     // Catch:{ Exception -> 0x004e }
            r0 = -1185159243(0xffffffffb95be7b5, float:-2.0971785E-4)
            if (r1 == r0) goto L_0x0035
            r0 = 65596345(0x3e8ebb9, float:1.3689854E-36)
            if (r1 != r0) goto L_0x004b
            java.lang.String r1 = "initialToggleState"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x004e }
            if (r0 == 0) goto L_0x004b
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.FacecastShareToPublicChannel> r0 = com.facebook.video.common.livestreaming.protocol.FacecastShareToPublicChannel.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x004e }
            goto L_0x0044
        L_0x0035:
            java.lang.String r1 = "threadName"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x004e }
            if (r0 == 0) goto L_0x004b
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.FacecastShareToPublicChannel> r0 = com.facebook.video.common.livestreaming.protocol.FacecastShareToPublicChannel.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x004e }
        L_0x0044:
            java.util.Map r0 = A00     // Catch:{ all -> 0x0057 }
            r0.put(r4, r1)     // Catch:{ all -> 0x0057 }
            goto L_0x0016
        L_0x004a:
            return r1
        L_0x004b:
            r0 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x0057 }
            return r0
        L_0x004e:
            r0 = move-exception
            X.SS5.A02(r0)     // Catch:{ all -> 0x0057 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x0057 }
            throw r0     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0057 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.common.livestreaming.protocol.FacecastShareToPublicChannelDeserializer.A0N(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public FacecastShareToPublicChannelDeserializer() {
        this.A00 = FacecastShareToPublicChannel.class;
    }
}
