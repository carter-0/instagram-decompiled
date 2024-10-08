package com.facebook.spherical.util;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

public class QuaternionDeserializer extends FbJsonDeserializer {
    public static Map A00;

    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        A00.put(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006a, code lost:
        X.SS5.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0071, code lost:
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
            java.lang.Class<com.facebook.spherical.util.QuaternionDeserializer> r2 = com.facebook.spherical.util.QuaternionDeserializer.class
            monitor-enter(r2)
            java.util.Map r0 = A00     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x000e
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x0072 }
            A00 = r0     // Catch:{ all -> 0x0072 }
            goto L_0x0018
        L_0x000e:
            java.lang.Object r1 = r0.get(r4)     // Catch:{ all -> 0x0072 }
            com.facebook.common.json.FbJsonField r1 = (com.facebook.common.json.FbJsonField) r1     // Catch:{ all -> 0x0072 }
            if (r1 == 0) goto L_0x0018
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x0072 }
            goto L_0x0065
        L_0x0018:
            int r0 = r4.hashCode()     // Catch:{ Exception -> 0x0069 }
            switch(r0) {
                case 119: goto L_0x0050;
                case 120: goto L_0x0040;
                case 121: goto L_0x0030;
                case 122: goto L_0x0020;
                default: goto L_0x001f;
            }     // Catch:{ Exception -> 0x0069 }
        L_0x001f:
            goto L_0x0066
        L_0x0020:
            java.lang.String r1 = "z"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x0069 }
            if (r0 == 0) goto L_0x0066
            java.lang.Class<com.facebook.spherical.util.Quaternion> r0 = com.facebook.spherical.util.Quaternion.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x0069 }
            goto L_0x005f
        L_0x0030:
            java.lang.String r1 = "y"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x0069 }
            if (r0 == 0) goto L_0x0066
            java.lang.Class<com.facebook.spherical.util.Quaternion> r0 = com.facebook.spherical.util.Quaternion.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x0069 }
            goto L_0x005f
        L_0x0040:
            java.lang.String r1 = "x"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x0069 }
            if (r0 == 0) goto L_0x0066
            java.lang.Class<com.facebook.spherical.util.Quaternion> r0 = com.facebook.spherical.util.Quaternion.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x0069 }
            goto L_0x005f
        L_0x0050:
            java.lang.String r1 = "w"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x0069 }
            if (r0 == 0) goto L_0x0066
            java.lang.Class<com.facebook.spherical.util.Quaternion> r0 = com.facebook.spherical.util.Quaternion.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x0069 }
        L_0x005f:
            java.util.Map r0 = A00     // Catch:{ all -> 0x0072 }
            r0.put(r4, r1)     // Catch:{ all -> 0x0072 }
            goto L_0x0016
        L_0x0065:
            return r1
        L_0x0066:
            r0 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x0072 }
            return r0
        L_0x0069:
            r0 = move-exception
            X.SS5.A02(r0)     // Catch:{ all -> 0x0072 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x0072 }
            throw r0     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0072 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.spherical.util.QuaternionDeserializer.A0N(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public QuaternionDeserializer() {
        this.A00 = Quaternion.class;
    }
}
