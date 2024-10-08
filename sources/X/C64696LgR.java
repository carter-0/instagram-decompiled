package X;

/* renamed from: X.LgR  reason: case insensitive filesystem */
public final class C64696LgR implements 1wn {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C64696LgR(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj4;
        this.A01 = obj2;
        this.A04 = obj3;
        this.A02 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a8 A[LOOP:0: B:25:0x00a2->B:27:0x00a8, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            if (r0 == 0) goto L_0x005c
            r0 = -1167107441(0xffffffffba6f5a8f, float:-9.130621E-4)
            int r6 = X.AnonymousClass0fD.A03(r0)
            X.INk r9 = (X.C57070INk) r9
            r0 = 1473158057(0x57ce9ba9, float:4.54335901E14)
            int r4 = X.AnonymousClass7TG.A0D(r9, r0)
            java.lang.String r1 = r9.A00
            java.lang.Object r0 = r8.A03
            X.5Ev r0 = (X.C282815Ev) r0
            X.1Xj r5 = r0.A02
            X.1Xy r0 = r5.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x005a
            X.3l8 r0 = r0.Ata()
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = r0.BEx()
        L_0x002e:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x004d
            java.lang.Object r3 = r8.A01
            X.2Wa r3 = (X.2Wa) r3
            java.lang.Object r2 = r8.A04
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r0 = r8.A02
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            android.content.Context r1 = X.C243803a8.A00(r0)
            boolean r0 = r9.A01
            java.lang.String r0 = X.1sx.A05(r1, r2, r5, r0)
            r3.A01(r0)
        L_0x004d:
            r0 = 1726405829(0x66e6dcc5, float:5.451084E23)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 2038092076(0x797ad12c, float:8.1394795E34)
        L_0x0056:
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        L_0x005a:
            r0 = 0
            goto L_0x002e
        L_0x005c:
            r0 = -340918123(0xffffffffebae0095, float:-4.207117E26)
            int r6 = X.AnonymousClass0fD.A03(r0)
            X.Lg2 r9 = (X.C64676Lg2) r9
            r0 = -2091765061(0xffffffff835232bb, float:-6.177169E-37)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r4 = 0
            X.0qQ.A0B(r9, r4)
            X.1Xj r2 = r9.A00
            if (r2 == 0) goto L_0x00ba
            java.lang.String r0 = r2.A30()
            if (r0 == 0) goto L_0x00ba
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00ba
            X.1iA r1 = r2.BR7()
            java.lang.Object r0 = r8.A02
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            X.1iA r0 = r0.A1G
            if (r1 != r0) goto L_0x0098
            java.lang.Object r3 = r8.A01
            X.4D7 r3 = (X.AnonymousClass4D7) r3
            X.0eR r0 = new X.0eR
            r0.<init>(r2)
        L_0x0095:
            r3.resumeWith(r0)
        L_0x0098:
            java.lang.Object r7 = r8.A04
            com.instagram.creation.capture.assetpicker.cutout.services.CutoutStickerUploadService r7 = (com.instagram.creation.capture.assetpicker.cutout.services.CutoutStickerUploadService) r7
            java.util.List r4 = r7.A01
            java.util.Iterator r3 = r4.iterator()
        L_0x00a2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00d4
            java.lang.Object r2 = r3.next()
            X.1wn r2 = (X.1wn) r2
            com.instagram.common.session.UserSession r0 = r7.A00
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.Lg2> r0 = X.C64676Lg2.class
            r1.A02(r2, r0)
            goto L_0x00a2
        L_0x00ba:
            java.lang.Object r3 = r8.A01
            X.4D7 r3 = (X.AnonymousClass4D7) r3
            java.lang.String r2 = r9.A02
            java.lang.Integer r1 = r9.A01
            X.Kko r0 = new X.Kko
            r0.<init>(r2, r1)
            X.0qQ.A0B(r0, r4)
            X.0eQ r1 = X.JTO.A1B(r0)
            X.0eR r0 = new X.0eR
            r0.<init>(r1)
            goto L_0x0095
        L_0x00d4:
            java.lang.Object r0 = r8.A03
            X.1ua r0 = (X.1ua) r0
            r0.A0K(r7)
            r4.clear()
            r0 = 11034689(0xa86041, float:1.5462893E-38)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -2087183607(0xffffffff83981b09, float:-8.939964E-37)
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64696LgR.onEvent(java.lang.Object):void");
    }
}
