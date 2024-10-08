package X;

public final class MEU extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEU(Object obj, AnonymousClass4D7 r3, int i, int i2, boolean z) {
        super(2, r3);
        this.A01 = i2;
        this.A03 = obj;
        this.A04 = z;
        this.A02 = i;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MEU, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        boolean z;
        int i;
        int i2;
        int i3 = this.A01;
        Object obj2 = this.A03;
        AnonymousClass4D7 r2 = r8;
        if (i3 != 0) {
            i = this.A02;
            z = this.A04;
            i2 = 1;
        } else {
            z = this.A04;
            i = this.A02;
            i2 = 0;
        }
        return new MEU(obj2, r2, i, i2, z);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.MEU, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0093 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.A01
            X.1Hj r3 = X.1Hj.A02
            if (r0 == 0) goto L_0x0024
            int r0 = r14.A00
            r4 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r4) goto L_0x00a7
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0012:
            X.0eS.A00(r15)
            java.lang.Object r5 = r14.A03
            X.3jv r5 = (X.C249523jv) r5
            int r2 = r14.A02
            boolean r1 = r14.A04
            r0 = 6
            X.MfE r6 = new X.MfE
            r6.<init>((int) r2, (boolean) r1, (int) r0)
            goto L_0x008b
        L_0x0024:
            int r0 = r14.A00
            r2 = 2
            r4 = 1
            if (r0 != 0) goto L_0x00a7
            X.0eS.A00(r15)
            java.lang.Object r7 = r14.A03
            X.Jiz r7 = (X.C60301Jiz) r7
            X.05G r0 = r7.A07
            java.lang.Object r1 = r0.getValue()
            X.MPr r1 = (X.C66385MPr) r1
            boolean r0 = r1 instanceof X.C61143Jxt
            if (r0 == 0) goto L_0x0097
            X.Jxt r1 = (X.C61143Jxt) r1
            X.Gn3 r0 = r1.A00
            X.Jw9 r0 = X.C60301Jiz.A00(r0)
        L_0x0045:
            if (r0 == 0) goto L_0x00a0
            boolean r13 = r14.A04
            int r11 = r14.A02
            if (r13 == 0) goto L_0x0094
            X.Khq r2 = X.C62560Khq.FullScreenEducation
        L_0x004f:
            X.LPB r6 = r7.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            X.Jr7 r5 = X.LPB.A00(r2, r6, r1)
            X.JTR.A1K(r5, r11)
            java.util.List r2 = r6.A00
            java.lang.String r1 = "gift_options"
            r5.A07(r1, r2)
            X.LRb r2 = r6.A02
            com.instagram.appreciation.analytics.LoggingFanData r1 = r6.A01
            X.C64160LRb.A01(r5, r1, r2)
            X.3ju r5 = r7.A05
            com.instagram.appreciation.gifting.repository.AppreciationGiftingRepository r1 = r7.A04
            java.lang.String r7 = r1.A03
            java.lang.Object r2 = r0.A01
            X.N4E r2 = (X.N4E) r2
            int r12 = r2.A01
            java.lang.Object r1 = r0.A00
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            java.lang.String r8 = X.JTP.A0o(r1)
            java.lang.Object r0 = r0.A04
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            java.lang.String r9 = X.JTP.A0o(r0)
            java.lang.String r10 = r2.A05
            X.Jxr r6 = new X.Jxr
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
        L_0x008b:
            r14.A00 = r4
            java.lang.Object r0 = r5.ELH(r6, r14)
        L_0x0091:
            if (r0 != r3) goto L_0x00aa
            return r3
        L_0x0094:
            X.Khq r2 = X.C62560Khq.Gift
            goto L_0x004f
        L_0x0097:
            boolean r0 = r1 instanceof X.C61142Jxs
            if (r0 == 0) goto L_0x00a0
            X.Jxs r1 = (X.C61142Jxs) r1
            X.Jw9 r0 = r1.A01
            goto L_0x0045
        L_0x00a0:
            r14.A00 = r2
            java.lang.Object r0 = X.C60301Jiz.A01(r7, r14)
            goto L_0x0091
        L_0x00a7:
            X.0eS.A00(r15)
        L_0x00aa:
            X.0gF r3 = X.C60340gF.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MEU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MEU) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
