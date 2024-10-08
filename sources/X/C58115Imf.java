package X;

/* renamed from: X.Imf  reason: case insensitive filesystem */
public final class C58115Imf extends AnonymousClass1Ek implements 0sI {
    public Object A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58115Imf(Object obj, AnonymousClass4D7 r3, int i) {
        super(5, r3);
        this.A04 = i;
        this.A05 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2 = this.A04;
        boolean A1a = AnonymousClass7TE.A1a(obj);
        boolean A1a2 = AnonymousClass7TE.A1a(obj2);
        boolean A1a3 = AnonymousClass7TE.A1a(obj4);
        AnonymousClass4D7 r11 = (AnonymousClass4D7) obj5;
        Object obj6 = this.A05;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        C58115Imf imf = new C58115Imf(obj6, r11, i);
        imf.A01 = A1a;
        imf.A02 = A1a2;
        imf.A00 = obj3;
        imf.A03 = A1a3;
        return imf.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        if (r3 == null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r5 == null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.A04
            X.0eS.A00(r13)
            if (r0 == 0) goto L_0x006f
            boolean r8 = r12.A01
            boolean r9 = r12.A02
            java.lang.Object r3 = r12.A00
            X.GVR r3 = (X.GVR) r3
            boolean r11 = r12.A03
            r2 = 0
            if (r3 == 0) goto L_0x0056
            java.lang.String r6 = r3.A08
            X.46i r5 = r3.A01()
            if (r5 != 0) goto L_0x0028
        L_0x001c:
            java.lang.Object r0 = r12.A05
            X.Ghc r0 = (X.C53044Ghc) r0
            X.0eM r0 = r0.A0F
            java.lang.Object r5 = r0.getValue()
            X.46i r5 = (X.C2606046i) r5
        L_0x0028:
            if (r3 == 0) goto L_0x0058
            boolean r10 = r3.A0E
            X.Hm6 r0 = r3.A05
            if (r0 == 0) goto L_0x0054
            X.1ro r4 = r0.A02
        L_0x0032:
            java.util.List r0 = r3.A0C
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x003c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r1 = r2.next()
            java.util.Map r0 = com.instagram.api.schemas.MusicPageTabType.A01
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x0050
            com.instagram.api.schemas.MusicPageTabType r0 = com.instagram.api.schemas.MusicPageTabType.UNRECOGNIZED
        L_0x0050:
            r7.add(r0)
            goto L_0x003c
        L_0x0054:
            r4 = 0
            goto L_0x0032
        L_0x0056:
            r6 = r2
            goto L_0x001c
        L_0x0058:
            r10 = 0
            r4 = r2
            X.0sn r7 = X.0sn.A00
            goto L_0x0063
        L_0x005d:
            X.JVf r2 = r3.A01
            X.N49 r3 = r3.A02
            if (r3 != 0) goto L_0x0069
        L_0x0063:
            java.lang.Object r0 = r12.A05
            X.Ghc r0 = (X.C53044Ghc) r0
            X.N49 r3 = r0.A00
        L_0x0069:
            X.Gm1 r1 = new X.Gm1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
        L_0x006f:
            boolean r4 = r12.A01
            boolean r1 = r12.A02
            java.lang.Object r0 = r12.A00
            X.87G r0 = (X.AnonymousClass87G) r0
            boolean r3 = r12.A03
            r2 = 1
            if (r4 == 0) goto L_0x009b
            if (r1 == 0) goto L_0x009b
            if (r0 == 0) goto L_0x009b
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A00()
            if (r0 == 0) goto L_0x009b
            java.util.Map r1 = r0.A0Z
            r0 = 977(0x3d1, float:1.369E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x009b
            if (r3 != 0) goto L_0x009b
        L_0x0096:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            return r1
        L_0x009b:
            r2 = 0
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58115Imf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
