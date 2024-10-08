package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

public class LiveWithSocialTabDeserializer extends FbJsonDeserializer {
    public static Map A00;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        X.SS5.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0058, code lost:
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
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.LiveWithSocialTabDeserializer> r2 = com.facebook.video.common.livestreaming.protocol.LiveWithSocialTabDeserializer.class
            monitor-enter(r2)
            java.util.Map r0 = A00     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x000e
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x0059 }
            A00 = r0     // Catch:{ all -> 0x0059 }
            goto L_0x0018
        L_0x000e:
            java.lang.Object r1 = r0.get(r4)     // Catch:{ all -> 0x0059 }
            com.facebook.common.json.FbJsonField r1 = (com.facebook.common.json.FbJsonField) r1     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x0018
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x0059 }
            goto L_0x004c
        L_0x0018:
            int r1 = r4.hashCode()     // Catch:{ Exception -> 0x0050 }
            r0 = 40834(0x9f82, float:5.722E-41)
            if (r1 == r0) goto L_0x0036
            r0 = 110371416(0x6942258, float:5.5721876E-35)
            if (r1 != r0) goto L_0x004d
            java.lang.String r1 = "title"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x0050 }
            if (r0 == 0) goto L_0x004d
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.LiveWithSocialTab> r0 = com.facebook.video.common.livestreaming.protocol.LiveWithSocialTab.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x0050 }
            goto L_0x0046
        L_0x0036:
            java.lang.String r0 = "'id"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x0050 }
            if (r0 == 0) goto L_0x004d
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.LiveWithSocialTab> r1 = com.facebook.video.common.livestreaming.protocol.LiveWithSocialTab.class
            java.lang.String r0 = "id"
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r1, r0)     // Catch:{ Exception -> 0x0050 }
        L_0x0046:
            java.util.Map r0 = A00     // Catch:{ all -> 0x0059 }
            r0.put(r4, r1)     // Catch:{ all -> 0x0059 }
            goto L_0x0016
        L_0x004c:
            return r1
        L_0x004d:
            r0 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x0059 }
            return r0
        L_0x0050:
            r0 = move-exception
            X.SS5.A02(r0)     // Catch:{ all -> 0x0059 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x0059 }
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0059 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.common.livestreaming.protocol.LiveWithSocialTabDeserializer.A0N(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public LiveWithSocialTabDeserializer() {
        this.A00 = LiveWithSocialTab.class;
    }
}
