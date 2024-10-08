package X;

/* renamed from: X.VIt  reason: case insensitive filesystem */
public abstract class C17123VIt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.Tt8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: X.Um3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: X.Um4} */
    /* JADX WARNING: type inference failed for: r4v2, types: [X.Um1, X.Tt7] */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0133, code lost:
        if (r1 == 710) goto L_0x0135;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig, code=X.4a2, for r15v0, types: [com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.filterkit.filter.VideoFilter A00(android.content.Context r11, android.graphics.Bitmap r12, com.instagram.common.session.UserSession r13, com.instagram.common.util.gradient.BackgroundGradientColors r14, X.C266624a2 r15, X.VNI r16, X.AnonymousClass3QG r17) {
        /*
            r8 = 2
            r9 = r17
            X.0qQ.A0B(r9, r8)
            X.1Yt r1 = X.C353948Ka.A00(r13)
            int r0 = r9.A01
            X.8Kd r7 = r1.A01(r0)
            r6 = 0
            X.0qQ.A0B(r7, r6)
            java.lang.Integer r0 = r7.A02
            if (r0 == 0) goto L_0x013f
            int r1 = r0.intValue()
            r5 = 1
            if (r1 == r5) goto L_0x0069
            if (r1 == r8) goto L_0x0063
            r0 = 3
            if (r1 == r0) goto L_0x005d
            r0 = 4
            if (r1 == r0) goto L_0x005d
            r0 = 5
            if (r1 != r0) goto L_0x013f
            X.Um4 r4 = new X.Um4
            r0 = r16
            r4.<init>(r0)
        L_0x0031:
            com.instagram.filterkit.filter.VideoFilter r2 = new com.instagram.filterkit.filter.VideoFilter
            r2.<init>(r11, r4, r7)
            int r0 = r9.A00
            r2.A03 = r0
            if (r14 == 0) goto L_0x004c
            int r0 = r14.A01
            int r1 = r14.A00
            float[] r0 = com.instagram.filterkit.filter.VideoFilter.A00(r0)
            r2.A0I = r0
            float[] r0 = com.instagram.filterkit.filter.VideoFilter.A00(r1)
            r2.A0H = r0
        L_0x004c:
            if (r12 == 0) goto L_0x0050
            r2.A05 = r12
        L_0x0050:
            if (r15 != 0) goto L_0x0057
            X.Tss r15 = new X.Tss
            r15.<init>()
        L_0x0057:
            X.4a2 r15 = (X.C266624a2) r15
            r2.A02(r15)
            return r2
        L_0x005d:
            X.Um3 r4 = new X.Um3
            r4.<init>()
            goto L_0x0031
        L_0x0063:
            X.Tt8 r4 = new X.Tt8
            r4.<init>()
            goto L_0x0031
        L_0x0069:
            X.Um1 r4 = new X.Um1
            r4.<init>()
            r0 = 0
            r4.A0C = r0
            r4.A0D = r0
            r4.A07 = r0
            r4.A09 = r0
            r4.A0B = r0
            r4.A0F = r0
            r4.A06 = r0
            r4.A08 = r0
            r4.A05 = r0
            r4.A0E = r0
            r4.A0G = r0
            r4.A0A = r0
            r3 = 0
            r4.A02 = r3
            r1 = 4
            float[] r0 = new float[r1]
            r0 = {1065353216, 1065353216, 1065353216, 1065353216} // fill-array
            r4.A0H = r0
            float[] r0 = new float[r1]
            r0 = {1065353216, 1065353216, 1065353216, 1065353216} // fill-array
            r4.A0J = r0
            r4.A01 = r3
            r10 = 1065353216(0x3f800000, float:1.0)
            r4.A03 = r10
            r4.A00 = r3
            float[] r0 = new float[r1]
            r0 = {0, 0, 0, 0} // fill-array
            r4.A0I = r0
            float[] r2 = new float[r1]
            r2 = {0, 0, 0, 0} // fill-array
            r4.A0K = r2
            long r0 = java.lang.System.currentTimeMillis()
            r4.A04 = r0
            int r1 = r7.A00
            r0 = 702(0x2be, float:9.84E-43)
            if (r1 != r0) goto L_0x00e2
            X.VC6.A00(r4)
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            r4.A01 = r0
            r0 = 1068708659(0x3fb33333, float:1.4)
        L_0x00c6:
            r4.A03 = r0
            r0 = 1051361018(0x3eaa7efa, float:0.333)
            r4.A00 = r0
        L_0x00cd:
            float[] r0 = r4.A0I
            r0[r6] = r3
            r0[r5] = r3
            r0[r8] = r3
            r10 = 3
            r0[r10] = r3
        L_0x00d8:
            r2[r6] = r3
            r2[r5] = r3
            r2[r8] = r3
            r2[r10] = r3
            goto L_0x0031
        L_0x00e2:
            r0 = 703(0x2bf, float:9.85E-43)
            if (r1 == r0) goto L_0x011f
            r0 = 705(0x2c1, float:9.88E-43)
            if (r1 == r0) goto L_0x011f
            r0 = 706(0x2c2, float:9.9E-43)
            if (r1 != r0) goto L_0x00fa
            X.VC6.A00(r4)
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            r4.A01 = r0
            r0 = 1070386381(0x3fcccccd, float:1.6)
            goto L_0x00c6
        L_0x00fa:
            r0 = 707(0x2c3, float:9.91E-43)
            if (r1 != r0) goto L_0x012d
            X.VC6.A00(r4)
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            r4.A01 = r0
            r4.A03 = r10
            r0 = 1051361018(0x3eaa7efa, float:0.333)
            r4.A00 = r0
            r10 = 1176256512(0x461c4000, float:10000.0)
            r1 = 1036831949(0x3dcccccd, float:0.1)
            float[] r0 = r4.A0I
            r0[r6] = r10
            r0[r5] = r10
            r0[r8] = r10
            r10 = 3
            r0[r10] = r1
            goto L_0x00d8
        L_0x011f:
            X.VC6.A00(r4)
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            r4.A01 = r0
            r0 = 1070386381(0x3fcccccd, float:1.6)
            r4.A03 = r0
            goto L_0x013c
        L_0x012d:
            r0 = 709(0x2c5, float:9.94E-43)
            if (r1 == r0) goto L_0x0135
            r0 = 710(0x2c6, float:9.95E-43)
            if (r1 != r0) goto L_0x0031
        L_0x0135:
            X.VC6.A00(r4)
            r4.A01 = r3
            r4.A03 = r3
        L_0x013c:
            r4.A00 = r3
            goto L_0x00cd
        L_0x013f:
            X.Um2 r4 = new X.Um2
            r4.<init>()
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17123VIt.A00(android.content.Context, android.graphics.Bitmap, com.instagram.common.session.UserSession, com.instagram.common.util.gradient.BackgroundGradientColors, com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig, X.VNI, X.3QG):com.instagram.filterkit.filter.VideoFilter");
    }
}
