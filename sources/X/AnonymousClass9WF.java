package X;

import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;

/* renamed from: X.9WF  reason: invalid class name */
public final class AnonymousClass9WF implements C344747sM, C346287uv {
    public C41787B0q A00;
    public C365358my A01;
    public final C40153ATt A02 = new C40153ATt(this);
    public final C40153ATt A03 = new C40153ATt(this);
    public final C364958mI A04;
    public final SurfaceCropFilter A05;
    public final C364808m2 A06;
    public final boolean A07;

    public final void ACn(C345897uG r1) {
    }

    public final void CMa(C344567s4 r1) {
    }

    public final void release() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass9WF r6) {
        /*
            X.8my r0 = r6.A01
            if (r0 != 0) goto L_0x0095
            X.8mI r2 = r6.A04     // Catch:{ RuntimeException -> 0x0014 }
            if (r2 == 0) goto L_0x0014
            boolean r0 = r6.A07     // Catch:{ RuntimeException -> 0x0014 }
            r2.A04 = r0     // Catch:{ RuntimeException -> 0x0014 }
            com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter r1 = r6.A05     // Catch:{ RuntimeException -> 0x0014 }
            r0 = 0
            X.8my r1 = r2.A05(r1, r0)     // Catch:{ RuntimeException -> 0x0014 }
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            r6.A01 = r1
            if (r1 != 0) goto L_0x007c
            X.8m2 r5 = r6.A06
            java.lang.String r2 = r5.AvM()
            r1 = 0
            if (r2 == 0) goto L_0x0032
            boolean r0 = r5.CW0()
            if (r0 == 0) goto L_0x0032
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x0061
            boolean r0 = r5.Cdi()
            if (r0 == 0) goto L_0x0061
        L_0x0032:
            r6.A01 = r1
            if (r1 != 0) goto L_0x007c
            java.lang.String r0 = r5.AvM()
            r1 = 0
            if (r0 == 0) goto L_0x0054
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r0)
        L_0x0041:
            if (r2 == 0) goto L_0x0049
            boolean r0 = r6.A07
            X.8my r1 = X.AnonymousClass9S9.A03(r2, r0)
        L_0x0049:
            r6.A01 = r1
            if (r1 != 0) goto L_0x007c
            java.lang.String r0 = "Failed to create input surface"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x0054:
            byte[] r3 = r5.BG2()
            if (r3 == 0) goto L_0x0049
            r2 = 0
            int r0 = r3.length
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r3, r2, r0)
            goto L_0x0041
        L_0x0061:
            com.instagram.util.jpeg.NativeImage r4 = X.C365128mZ.A00(r1, r1, r2)     // Catch:{ IOException -> 0x0032 }
            r4.getClass()     // Catch:{ IOException -> 0x0032 }
            r0 = 6408(0x1908, float:8.98E-42)
            int r3 = com.instagram.util.jpeg.JpegBridge.uploadTexture(r4, r0)
            int r2 = r4.width
            int r0 = r4.height
            X.8mx r1 = X.C365338mw.A01(r1, r3, r2, r0)
            int r0 = r4.bufferId
            com.instagram.util.jpeg.JpegBridge.releaseNativeBuffer(r0)
            goto L_0x0032
        L_0x007c:
            X.ATt r0 = r6.A03
            r0.A00(r1)
            X.ATt r1 = r6.A02
            X.8my r0 = r6.A01
            X.8qj r0 = r0.B8o()
            r1.A00(r0)
            X.B0q r1 = r6.A00
            if (r1 == 0) goto L_0x0095
            X.8my r0 = r6.A01
            r1.DK2(r0)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9WF.A00(X.9WF):void");
    }

    public final void detach() {
        C365358my r0 = this.A01;
        if (r0 != null) {
            r0.cleanup();
            this.A01 = null;
        }
        this.A03.A00.A04 = null;
        this.A02.A00.A04 = null;
    }

    public AnonymousClass9WF(C364958mI r2, SurfaceCropFilter surfaceCropFilter, C364808m2 r4, boolean z) {
        this.A06 = r4;
        this.A07 = z;
        this.A04 = r2;
        this.A05 = surfaceCropFilter;
    }

    public final /* bridge */ /* synthetic */ Object BHO() {
        A00(this);
        C40153ATt aTt = this.A03;
        A00(aTt.A01);
        return aTt.A00;
    }
}
