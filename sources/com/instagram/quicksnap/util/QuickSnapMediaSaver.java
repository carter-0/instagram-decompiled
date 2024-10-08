package com.instagram.quicksnap.util;

import X.0qQ;
import android.content.Context;

public final class QuickSnapMediaSaver {
    public final Context A00;

    public QuickSnapMediaSaver(Context context) {
        0qQ.A0B(context, 1);
        this.A00 = context;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.common.typedurl.ImageUrl r6, com.instagram.quicksnap.util.QuickSnapMediaSaver r7, X.AnonymousClass4D7 r8, int r9) {
        /*
            r3 = 35
            boolean r0 = X.C66138MDq.A02(r3, r8)
            if (r0 == 0) goto L_0x0079
            r5 = r8
            X.MDq r5 = (X.C66138MDq) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0079
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r0 = 1
            if (r1 == 0) goto L_0x0049
            if (r1 != r0) goto L_0x007f
            java.lang.Object r7 = r5.A01
            com.instagram.quicksnap.util.QuickSnapMediaSaver r7 = (com.instagram.quicksnap.util.QuickSnapMediaSaver) r7
            X.0eS.A00(r3)
        L_0x0028:
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            if (r3 == 0) goto L_0x0046
            android.content.Context r2 = r7.A00
            java.lang.String r0 = ".png"
            java.io.File r1 = X.0qc.A00(r2, r0)
            if (r1 == 0) goto L_0x0046
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
            X.1MF.A0K(r2, r0, r3, r1)
            X.C59730JVo.A08(r2, r1)
            r1 = 2131971103(0x7f134c1f, float:1.9579176E38)
            java.lang.String r0 = "quick_snap_archive_preview_save"
            X.C59689JTv.A0F(r2, r0, r1)
        L_0x0046:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0049:
            X.0eS.A00(r3)
            if (r6 == 0) goto L_0x0046
            r5.A01 = r7
            r5.A00 = r0
            X.1IW r3 = X.JTS.A0s(r5)
            X.1NK r1 = X.1NK.A00()
            java.lang.String r0 = ""
            X.1OO r2 = r1.A0J(r6, r0)
            r0 = 48
            X.G4S r1 = new X.G4S
            r1.<init>(r3, r0)
            X.Lf5 r0 = new X.Lf5
            r0.<init>(r7, r1, r9)
            r2.A02(r0)
            r2.A01()
            java.lang.Object r3 = r3.A0E()
            if (r3 != r4) goto L_0x0028
            return r4
        L_0x0079:
            X.MDq r5 = new X.MDq
            r5.<init>(r7, r8, r3)
            goto L_0x0016
        L_0x007f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.util.QuickSnapMediaSaver.A00(com.instagram.common.typedurl.ImageUrl, com.instagram.quicksnap.util.QuickSnapMediaSaver, X.4D7, int):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME6, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.util.List r7, X.AnonymousClass4D7 r8, int r9) {
        /*
            r6 = this;
            r3 = 48
            boolean r0 = X.ME6.A02(r3, r8)
            if (r0 == 0) goto L_0x004a
            r5 = r8
            X.ME6 r5 = (X.ME6) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004a
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 == r2) goto L_0x003c
            if (r0 != r3) goto L_0x0052
            X.0eS.A00(r1)
        L_0x0027:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x002a:
            X.0eS.A00(r1)
            r1 = 0
            X.MH5 r0 = new X.MH5
            r0.<init>((com.instagram.quicksnap.util.QuickSnapMediaSaver) r6, (java.util.List) r7, (X.AnonymousClass4D7) r1, (int) r9)
            r5.A00 = r2
            java.lang.Object r1 = X.19E.A00(r5, r0)
            if (r1 != r4) goto L_0x003f
            return r4
        L_0x003c:
            X.0eS.A00(r1)
        L_0x003f:
            java.util.Collection r1 = (java.util.Collection) r1
            r5.A00 = r3
            java.lang.Object r0 = X.AnonymousClass42T.A00(r1, r5)
            if (r0 != r4) goto L_0x0027
            return r4
        L_0x004a:
            r0 = 42
            X.ME6 r5 = new X.ME6
            r5.<init>(r6, r8, r3, r0)
            goto L_0x0016
        L_0x0052:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.util.QuickSnapMediaSaver.A01(java.util.List, X.4D7, int):java.lang.Object");
    }
}
