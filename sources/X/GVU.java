package X;

public final class GVU extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public Object A02;
    public boolean A03;
    public final int A04 = 1;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GVU(C53044Ghc ghc, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A05 = ghc;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.4D7, X.GVU] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.4D7, X.GVU] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        AnonymousClass4D7 r3 = r9;
        if (this.A04 == 0) {
            return new GVU((C60282Jid) this.A05, r3, (byte[]) this.A02, this.A00, this.A03);
        }
        ? gvu = new GVU((C53044Ghc) this.A05, r9);
        gvu.A02 = obj;
        return gvu;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.A04
            X.1Hj r3 = X.1Hj.A02
            if (r0 == 0) goto L_0x00e3
            int r0 = r12.A01
            r9 = 1
            if (r0 == 0) goto L_0x0041
            boolean r5 = r12.A03
            int r8 = r12.A00
            java.lang.Object r7 = r12.A02
            X.GVR r7 = (X.GVR) r7
            X.0eS.A00(r13)
        L_0x0016:
            if (r5 != 0) goto L_0x0034
            X.46i r0 = r7.A01()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r4 = r12.A05
            X.2YL r4 = (X.2YL) r4
            if (r8 != 0) goto L_0x0025
            r9 = 0
        L_0x0025:
            X.6oS r3 = X.C318116oQ.A00(r4)
            r2 = 0
            r1 = 21
            X.MGB r0 = new X.MGB
            r0.<init>(r4, r2, r1, r9)
            X.AnonymousClass7TE.A1Z(r0, r3)
        L_0x0034:
            X.N49 r1 = r7.A02
            if (r1 == 0) goto L_0x003e
            java.lang.Object r0 = r12.A05
            X.Ghc r0 = (X.C53044Ghc) r0
            r0.A00 = r1
        L_0x003e:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0041:
            X.0eS.A00(r13)
            java.lang.Object r6 = r12.A02
            X.HPG r6 = (X.HPG) r6
            boolean r0 = r6 instanceof X.C52228GJt
            if (r0 == 0) goto L_0x005c
            java.lang.Object r1 = r12.A05
            X.Ghc r1 = (X.C53044Ghc) r1
            X.05G r0 = r1.A0O
            X.AnonymousClass7TF.A1O(r0, r9)
        L_0x0055:
            X.05G r1 = r1.A0N
            r0 = 0
            X.AnonymousClass7TF.A1O(r1, r0)
            goto L_0x003e
        L_0x005c:
            boolean r0 = r6 instanceof X.C52263GLe
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r1 = r12.A05
            X.Ghc r1 = (X.C53044Ghc) r1
            X.05G r0 = r1.A0P
            java.lang.Boolean r2 = X.AnonymousClass7TE.A0u()
            r0.Epw(r2)
            X.05G r0 = r1.A0O
            r0.Epw(r2)
            X.GLe r6 = (X.C52263GLe) r6
            X.5u7 r0 = r6.A01
            X.GVR r0 = (X.GVR) r0
            X.GVR r7 = r0.A06
            if (r7 != 0) goto L_0x007d
            r7 = r0
        L_0x007d:
            X.46i r0 = r7.A01()
            if (r0 == 0) goto L_0x00bb
            boolean r8 = r0.COz()
        L_0x0087:
            boolean r0 = r6.A0D
            if (r0 == 0) goto L_0x0055
            boolean r0 = r6.A0G
            if (r0 != 0) goto L_0x0055
            X.05G r0 = r1.A0N
            X.AnonymousClass7TF.A1O(r0, r9)
            X.05G r0 = r1.A0L
            r0.Epw(r7)
            boolean r5 = r7.CPt()
            X.3ju r4 = r1.A0H
            java.lang.String r2 = r1.A0D
            java.util.List r0 = r6.A09
            int r1 = r0.size()
            X.HJ8 r0 = new X.HJ8
            r0.<init>(r2, r8, r5, r1)
            r12.A02 = r7
            r12.A00 = r8
            r12.A03 = r5
            r12.A01 = r9
            java.lang.Object r0 = r4.ELH(r0, r12)
            if (r0 != r3) goto L_0x0016
            return r3
        L_0x00bb:
            r8 = 0
            goto L_0x0087
        L_0x00bd:
            boolean r0 = r6 instanceof X.H3D
            if (r0 == 0) goto L_0x003e
            java.lang.Object r2 = r12.A05
            X.Ghc r2 = (X.C53044Ghc) r2
            X.05G r0 = r2.A0P
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            r0.Epw(r1)
            X.05G r0 = r2.A0O
            r0.Epw(r1)
            X.05G r0 = r2.A0N
            r0.Epw(r1)
            X.6uZ r1 = r2.A09
            X.H3D r6 = (X.H3D) r6
            X.4dm r0 = r6.A01
            r1.A0T(r0)
            goto L_0x003e
        L_0x00e3:
            int r0 = r12.A01
            r11 = 1
            if (r0 == 0) goto L_0x00ed
            X.0eS.A00(r13)
            goto L_0x003e
        L_0x00ed:
            X.0eS.A00(r13)
            java.lang.Object r1 = r12.A05
            X.Jid r1 = (X.C60282Jid) r1
            java.lang.Object r5 = r12.A02
            byte[] r5 = (byte[]) r5
            int r4 = r12.A00
            boolean r2 = r12.A03
            int r0 = r5.length
            r6 = 0
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeByteArray(r5, r6, r0)
            X.0qQ.A0A(r5)
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            float r0 = (float) r4
            r10.postRotate(r0)
            int r8 = r5.getWidth()
            int r9 = r5.getHeight()
            X.0fO.A03(r5)
            r7 = r6
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)
            X.0qQ.A07(r5)
            if (r2 == 0) goto L_0x0141
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r10.preScale(r2, r0)
            int r8 = r5.getWidth()
            int r9 = r5.getHeight()
            X.0fO.A03(r5)
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)
            X.0qQ.A0A(r5)
        L_0x0141:
            java.lang.String r4 = X.2RR.A01()
            r0 = 4091(0xffb, float:5.733E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r4, r2)
            X.1MF.A0M(r5, r0)
            java.lang.String r4 = r0.getPath()
            X.0qQ.A07(r4)
            X.0V2 r2 = r1.A04
            java.lang.String r1 = r1.A02
            X.LmC r0 = new X.LmC
            r0.<init>(r4, r1)
            r12.A01 = r11
            java.lang.Object r0 = r2.emit(r0, r12)
            if (r0 != r3) goto L_0x003e
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GVU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GVU) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GVU(C60282Jid jid, AnonymousClass4D7 r3, byte[] bArr, int i, boolean z) {
        super(2, r3);
        this.A05 = jid;
        this.A02 = bArr;
        this.A00 = i;
        this.A03 = z;
    }
}
