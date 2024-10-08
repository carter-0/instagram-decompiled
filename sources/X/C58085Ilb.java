package X;

/* renamed from: X.Ilb  reason: case insensitive filesystem */
public final class C58085Ilb extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final float A01;
    public final int A02;
    public final Object A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58085Ilb(Object obj, AnonymousClass4D7 r3, float f, int i, boolean z) {
        super(2, r3);
        this.A02 = i;
        this.A03 = obj;
        this.A01 = f;
        this.A04 = z;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Ilb, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        boolean z;
        Object obj2;
        float f;
        int i;
        AnonymousClass4D7 r2 = r8;
        if (this.A02 != 0) {
            obj2 = this.A03;
            f = this.A01;
            z = this.A04;
            i = 1;
        } else {
            z = this.A04;
            obj2 = this.A03;
            f = this.A01;
            i = 0;
        }
        return new C58085Ilb(obj2, r2, f, i, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.GQC} */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.5b9] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A02
            X.1Hj r4 = X.1Hj.A02
            if (r0 == 0) goto L_0x0062
            int r0 = r11.A00
            r5 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 != r5) goto L_0x0099
            X.0eS.A00(r12)
        L_0x0010:
            java.lang.Object r0 = r11.A03
            X.5WL r0 = (X.AnonymousClass5WL) r0
            X.AnonymousClass5WL.A00(r0)
        L_0x0017:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x001a:
            X.0eS.A00(r12)
            java.lang.Object r3 = r11.A03
            X.5WL r3 = (X.AnonymousClass5WL) r3
            X.5b4 r7 = r3.A0D
            float r0 = r3.A02
            java.lang.Float r1 = X.C51965G9l.A0q(r0)
            r6 = 0
            java.lang.Object r0 = r7.A00
            r7.A07(r1, r0)
            float r0 = r11.A01
            java.lang.Float r9 = X.C51965G9l.A0q(r0)
            boolean r2 = r11.A04
            if (r2 == 0) goto L_0x005f
            float r1 = r3.A01
        L_0x003b:
            r0 = 1056964608(0x3f000000, float:0.5)
            X.5b7 r8 = X.C51965G9l.A0F(r6, r0, r1)
            if (r2 != 0) goto L_0x005d
            boolean r0 = r3.A0A
            if (r0 != 0) goto L_0x005d
            float r0 = r3.A00
        L_0x0049:
            java.lang.Float r10 = X.C51965G9l.A0q(r0)
            r0 = 44
            X.J6I r12 = new X.J6I
            r12.<init>(r3, r0)
            r11.A00 = r5
            java.lang.Object r0 = r7.A04(r8, r9, r10, r11, r12)
            if (r0 != r4) goto L_0x0010
            return r4
        L_0x005d:
            r0 = 0
            goto L_0x0049
        L_0x005f:
            float r1 = r3.A03
            goto L_0x003b
        L_0x0062:
            int r0 = r11.A00
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L_0x006c
            X.0eS.A00(r12)
            goto L_0x0017
        L_0x006c:
            X.0eS.A00(r12)
            boolean r1 = r11.A04
            java.lang.Object r3 = r11.A03
            X.5b4 r3 = (X.AnonymousClass5b4) r3
            float r0 = r11.A01
            java.lang.Float r2 = X.C51965G9l.A0q(r0)
            if (r1 == 0) goto L_0x0091
            r1 = 400(0x190, float:5.6E-43)
            r0 = 0
            X.GQC r1 = X.GQC.A00(r1, r0)
            r11.A00 = r5
        L_0x0086:
            java.lang.Object r0 = r3.A02()
            java.lang.Object r0 = r3.A03(r1, r2, r0, r11)
            if (r0 != r4) goto L_0x0017
            return r4
        L_0x0091:
            X.IEQ r1 = new X.IEQ
            r1.<init>()
            r11.A00 = r6
            goto L_0x0086
        L_0x0099:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58085Ilb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C58085Ilb) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
