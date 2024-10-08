package X;

/* renamed from: X.PfK  reason: case insensitive filesystem */
public final class C73558PfK extends AnonymousClass1Ek implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73558PfK(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, AnonymousClass4D7 r9, int i, boolean z, boolean z2) {
        super(2, r9);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A05 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A06 = str;
        this.A07 = str2;
        this.A08 = z;
        this.A09 = z2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.PfK, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        String str;
        String str2;
        boolean z;
        boolean z2;
        int i;
        AnonymousClass4D7 r8 = r14;
        if (this.A00 != 0) {
            obj3 = this.A01;
            obj4 = this.A05;
            obj5 = this.A03;
            obj6 = this.A04;
            str = this.A06;
            str2 = this.A07;
            z = this.A08;
            z2 = this.A09;
            obj2 = this.A02;
            i = 1;
        } else {
            obj2 = this.A02;
            obj3 = this.A01;
            obj4 = this.A05;
            obj5 = this.A03;
            obj6 = this.A04;
            str = this.A06;
            str2 = this.A07;
            z = this.A08;
            z2 = this.A09;
            i = 0;
        }
        return new C73558PfK(obj2, obj3, obj4, obj5, obj6, str, str2, r8, i, z, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r7 = ((X.C72198OyK) r0.A05).A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.A00
            if (r1 == 0) goto L_0x007c
            X.0eS.A00(r22)
            java.lang.Object r6 = r0.A01
            X.1Xj r6 = (X.1Xj) r6
            java.lang.String r5 = r6.A2U()
            if (r5 == 0) goto L_0x00ea
            java.lang.Object r4 = r0.A02
            java.io.File r4 = (java.io.File) r4
            java.lang.Object r3 = r0.A05
            X.OyK r3 = (X.C72198OyK) r3
            r1 = -1
            com.instagram.common.session.UserSession r7 = r3.A01
            java.io.File r1 = X.C59730JVo.A07(r7, r4, r5, r1)
            if (r1 == 0) goto L_0x00ea
            java.lang.String r8 = X.JTP.A0t(r1)
            long r9 = r6.A1B()
            long r11 = r6.A1B()
            com.instagram.pendingmedia.model.ClipInfo r4 = X.Q0X.A03(r7, r8, r9, r11)
            int r1 = r4.A09
            float r2 = (float) r1
            int r1 = r4.A06
            float r1 = (float) r1
            float r2 = r2 / r1
            r4.A00 = r2
            java.lang.Object r1 = r0.A03
            X.7Z7 r1 = (X.AnonymousClass7Z7) r1
            X.PEN r11 = X.C72198OyK.A01(r1)
            java.lang.Object r1 = r0.A04
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1
            java.lang.String r13 = r0.A06
            java.lang.String r8 = r0.A07
            boolean r9 = r0.A09
            r0 = 0
            X.DbZ.A0t(r0, r1, r13, r8)
            X.9HR r12 = X.C66583MXo.A0X(r1)
            X.6EZ r0 = r11.A01
            X.6Ea r3 = r0.A00
            X.1a8 r0 = r11.A00
            r5 = 0
            X.1aU r1 = X.C304566Ea.A01(r3, r12)
            X.OvN r2 = new X.OvN
            r6 = r5
            r7 = r5
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.1aU r4 = X.C66581MXm.A0M(r2, r1)
            r15 = 1
            X.FpC r9 = new X.FpC
            r10 = r3
            r14 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15)
        L_0x0076:
            r0.A02(r4, r9)
        L_0x0079:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x007c:
            X.0eS.A00(r22)
            java.lang.Object r2 = r0.A02
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            com.instagram.model.mediasize.ExtendedImageUrl r8 = r2.A1n(r1)
            if (r8 == 0) goto L_0x0079
            java.lang.Object r7 = r0.A05
            X.OyK r7 = (X.C72198OyK) r7
            java.lang.Object r5 = r0.A03
            X.7Z7 r5 = (X.AnonymousClass7Z7) r5
            java.lang.Object r6 = r0.A04
            com.instagram.model.direct.DirectShareTarget r6 = (com.instagram.model.direct.DirectShareTarget) r6
            java.lang.String r3 = r0.A06
            java.lang.String r2 = r0.A07
            boolean r4 = r0.A09
            X.1NK r1 = X.1NK.A00()
            java.lang.String r0 = "direct"
            android.graphics.Bitmap r8 = r1.A0H(r8, r0)
            if (r8 == 0) goto L_0x00ef
            X.PEN r1 = X.C72198OyK.A01(r5)
            com.instagram.common.session.UserSession r10 = r7.A01
            java.lang.String r11 = X.2RR.A01()
            java.lang.String r5 = "direct_temp_photo"
            java.lang.String r0 = ".jpg"
            java.lang.String r12 = X.AnonymousClass45F.A04(r5, r0)
            r9 = 0
            r13 = 0
            r14 = r13
            X.8Cl r7 = X.C39908AIz.A03(r8, r9, r10, r11, r12, r13, r14)
            X.DbZ.A0t(r13, r6, r3, r2)
            X.9HR r6 = X.C66583MXo.A0X(r6)
            X.6EZ r0 = r1.A01
            X.6Ea r5 = r0.A00
            X.1a8 r0 = r1.A00
            r8 = r9
            r10 = r2
            r11 = r4
            X.1aU r4 = r5.A07(r6, r7, r8, r9, r10, r11)
            X.FpC r9 = new X.FpC
            r14 = r9
            r15 = r5
            r16 = r1
            r17 = r6
            r18 = r3
            r19 = r2
            r20 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20)
            goto L_0x0076
        L_0x00ea:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00ef:
            java.lang.String r0 = "Failed to get bitmap."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73558PfK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C73558PfK) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
