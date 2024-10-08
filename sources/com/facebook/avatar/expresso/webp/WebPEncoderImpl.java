package com.facebook.avatar.expresso.webp;

import X.0qQ;
import X.C262094Cc;
import com.facebook.onecamera.modules.videoencoding.webp.WebPEncoder;

public final class WebPEncoderImpl {
    public final int A00;
    public final WebPEncoder A01 = new WebPEncoder();
    public final C262094Cc A02;

    public WebPEncoderImpl(C262094Cc r2, int i) {
        0qQ.A0B(r2, 1);
        this.A02 = r2;
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDl, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0091 A[Catch:{ IOException -> 0x00a2 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.facebook.quicklog.QuickPerformanceLogger r9, java.io.File r10, X.AnonymousClass4D7 r11, int r12) {
        /*
            r8 = this;
            r6 = 2
            boolean r0 = X.C66133MDl.A01(r6, r11)
            if (r0 == 0) goto L_0x0031
            r5 = r11
            X.MDl r5 = (X.C66133MDl) r5
            int r2 = r5.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0031
            int r2 = r2 - r1
            r5.A01 = r2
        L_0x0015:
            java.lang.Object r1 = r5.A05
            X.1Hj r0 = X.1Hj.A02
            int r3 = r5.A01
            r2 = 1
            if (r3 == 0) goto L_0x004b
            if (r3 == r2) goto L_0x003c
            if (r3 != r6) goto L_0x0037
            int r12 = r5.A00
            java.lang.Object r7 = r5.A04
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r5.A03
            com.facebook.quicklog.QuickPerformanceLogger r9 = (com.facebook.quicklog.QuickPerformanceLogger) r9
            java.lang.Object r10 = r5.A02
            java.io.File r10 = (java.io.File) r10
            goto L_0x0092
        L_0x0031:
            X.MDl r5 = new X.MDl
            r5.<init>(r8, r11, r6)
            goto L_0x0015
        L_0x0037:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x003c:
            int r12 = r5.A00
            java.lang.Object r9 = r5.A04
            com.facebook.quicklog.QuickPerformanceLogger r9 = (com.facebook.quicklog.QuickPerformanceLogger) r9
            java.lang.Object r10 = r5.A03
            java.io.File r10 = (java.io.File) r10
            java.lang.Object r2 = r5.A02
            com.facebook.avatar.expresso.webp.WebPEncoderImpl r2 = (com.facebook.avatar.expresso.webp.WebPEncoderImpl) r2
            goto L_0x0072
        L_0x004b:
            X.0eS.A00(r1)
            r5.A02 = r8     // Catch:{ IOException -> 0x00a2 }
            r5.A03 = r10     // Catch:{ IOException -> 0x00a2 }
            r5.A04 = r9     // Catch:{ IOException -> 0x00a2 }
            r5.A00 = r12     // Catch:{ IOException -> 0x00a2 }
            r5.A01 = r2     // Catch:{ IOException -> 0x00a2 }
            com.facebook.onecamera.modules.videoencoding.webp.WebPEncoder r1 = r8.A01     // Catch:{ IOException -> 0x00a2 }
            java.nio.ByteBuffer r7 = r1.assemble()     // Catch:{ IOException -> 0x00a2 }
            X.0qQ.A07(r7)     // Catch:{ IOException -> 0x00a2 }
            X.4Cc r4 = r8.A02     // Catch:{ IOException -> 0x00a2 }
            r3 = 0
            r2 = 7
            X.JTi r1 = new X.JTi     // Catch:{ IOException -> 0x00a2 }
            r1.<init>(r7, r10, r3, r2)     // Catch:{ IOException -> 0x00a2 }
            java.lang.Object r1 = X.JTR.A0y(r0, r5, r4, r1)     // Catch:{ IOException -> 0x00a2 }
            if (r1 == r0) goto L_0x00aa
            r2 = r8
            goto L_0x0075
        L_0x0072:
            X.0eS.A00(r1)     // Catch:{ IOException -> 0x00a2 }
        L_0x0075:
            java.lang.String r7 = "file_size"
            X.4Cc r4 = r2.A02     // Catch:{ IOException -> 0x00a2 }
            r3 = 0
            r2 = 27
            X.JUv r1 = new X.JUv     // Catch:{ IOException -> 0x00a2 }
            r1.<init>(r10, r3, r2)     // Catch:{ IOException -> 0x00a2 }
            r5.A02 = r10     // Catch:{ IOException -> 0x00a2 }
            r5.A03 = r9     // Catch:{ IOException -> 0x00a2 }
            r5.A04 = r7     // Catch:{ IOException -> 0x00a2 }
            r5.A00 = r12     // Catch:{ IOException -> 0x00a2 }
            r5.A01 = r6     // Catch:{ IOException -> 0x00a2 }
            java.lang.Object r1 = X.1Eo.A00(r5, r4, r1)     // Catch:{ IOException -> 0x00a2 }
            if (r1 != r0) goto L_0x0095
            return r0
        L_0x0092:
            X.0eS.A00(r1)     // Catch:{ IOException -> 0x00a2 }
        L_0x0095:
            long r0 = X.AnonymousClass7TE.A0R(r1)     // Catch:{ IOException -> 0x00a2 }
            r9.markerAnnotate(r12, r7, r0)     // Catch:{ IOException -> 0x00a2 }
            X.Jrf r0 = new X.Jrf     // Catch:{ IOException -> 0x00a2 }
            r0.<init>(r10)     // Catch:{ IOException -> 0x00a2 }
            return r0
        L_0x00a2:
            r2 = move-exception
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.Jri r0 = new X.Jri
            r0.<init>(r2, r1)
        L_0x00aa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.webp.WebPEncoderImpl.A00(com.facebook.quicklog.QuickPerformanceLogger, java.io.File, X.4D7, int):java.lang.Object");
    }
}
