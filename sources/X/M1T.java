package X;

public final class M1T implements 1aV {
    public final int A00;
    public final Object A01;

    public M1T(C329897Kq r1, int i) {
        this.A00 = i;
        if (5 - i != 0) {
            this.A01 = r1;
        } else {
            this.A01 = r1;
        }
    }

    public static void A00(1aU r1, 1a8 r2, Object obj, int i) {
        r2.A02(r1, new M1T(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0242, code lost:
        r0.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0245, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r0.Epw(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d7, code lost:
        r3.A02(r0.A07, r0.A06, r0.A09);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b9, code lost:
        r1.Epw(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bc, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01d0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0202  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x01a6;
                case 1: goto L_0x0005;
                case 2: goto L_0x0187;
                case 3: goto L_0x00e1;
                case 4: goto L_0x0005;
                case 5: goto L_0x00c5;
                case 6: goto L_0x017f;
                case 7: goto L_0x00af;
                case 8: goto L_0x01bd;
                case 9: goto L_0x0074;
                case 10: goto L_0x0173;
                case 11: goto L_0x00e9;
                case 12: goto L_0x005b;
                case 13: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A01
            X.Jfc r0 = (X.C60096Jfc) r0
            X.05G r0 = r0.A06
        L_0x000b:
            r0.Epw(r9)
        L_0x000e:
            return
        L_0x000f:
            X.3xP r9 = (X.C257443xP) r9
            boolean r0 = r9.A06()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r9.A03()
            X.1XQ r0 = (X.1XQ) r0
            boolean r0 = r0.isOk()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r3 = r8.A01
            X.2Fk r3 = (X.2Fk) r3
            java.lang.Object r2 = r3.A02()
            X.Jtp r2 = (X.C60931Jtp) r2
            if (r2 == 0) goto L_0x0059
            java.lang.Object r0 = r9.A03()
            X.K1V r0 = (X.K1V) r0
            java.util.List r1 = r0.A01
            if (r1 == 0) goto L_0x003e
            java.util.ArrayList r0 = r2.A01
            r0.addAll(r1)
        L_0x003e:
            java.lang.Object r0 = r9.A03()
            X.K1V r0 = (X.K1V) r0
            java.lang.String r0 = r0.A00
            r2.A00 = r0
            r0 = 0
            r2.A03 = r0
            java.lang.Object r0 = r9.A03()
            X.K1V r0 = (X.K1V) r0
            boolean r0 = r0.A02
            r2.A02 = r0
        L_0x0055:
            r3.A0A(r2)
            return
        L_0x0059:
            r2 = 0
            goto L_0x0055
        L_0x005b:
            X.QP6 r9 = (X.QP6) r9
            java.lang.Object r2 = r9.A04
            java.lang.Object r0 = r8.A01
            X.6gj r0 = (X.C313616gj) r0
            X.LEK r1 = r0.A08
            if (r1 == 0) goto L_0x000e
            X.RFg r0 = X.C8913RFg.IN_PROGRESS
            if (r2 != r0) goto L_0x0071
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
        L_0x006d:
            r1.A00(r0)
            return
        L_0x0071:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x006d
        L_0x0074:
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r4 = r8.A01
            X.JjW r4 = (X.C60327JjW) r4
            java.util.ArrayList r3 = r4.A0B
            X.0qQ.A0A(r9)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r9.iterator()
        L_0x0087:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009d
            java.lang.Object r0 = r1.next()
            X.2Eq r0 = (X.2Eq) r0
            java.lang.String r0 = r0.C6C()
            if (r0 == 0) goto L_0x0087
            r2.add(r0)
            goto L_0x0087
        L_0x009d:
            r0 = 3
            java.util.List r0 = X.00k.A0d(r2, r0)
            r3.addAll(r0)
            boolean r0 = X.AnonymousClass7TE.A1b(r9)
            if (r0 == 0) goto L_0x000e
            X.1a8 r0 = r4.A02
            goto L_0x0242
        L_0x00af:
            X.3xP r9 = (X.C257443xP) r9
            boolean r0 = r9.A06()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r9.A03()
            X.0qQ.A07(r0)
            X.N2L r0 = (X.N2L) r0
            java.lang.Object r3 = r8.A01
            X.7Kq r3 = (X.C329897Kq) r3
            goto L_0x00d7
        L_0x00c5:
            java.lang.Object r3 = r8.A01
            X.7Kq r3 = (X.C329897Kq) r3
            X.3xP r9 = (X.C257443xP) r9
            boolean r0 = r9.A06()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r9.A03()
            X.N2L r0 = (X.N2L) r0
        L_0x00d7:
            byte[] r2 = r0.A09
            java.lang.String r1 = r0.A07
            java.lang.String r0 = r0.A06
            r3.A02(r1, r0, r2)
            return
        L_0x00e1:
            java.lang.Object r0 = r8.A01
            X.Jfc r0 = (X.C60096Jfc) r0
            X.05G r0 = r0.A05
            goto L_0x000b
        L_0x00e9:
            X.3xP r9 = (X.C257443xP) r9
            r3 = 0
            X.0qQ.A0B(r9, r3)
            java.lang.Object r2 = r8.A01
            X.DlI r2 = (X.C46788DlI) r2
            X.2Fj r1 = r2.A02
            java.lang.Object r0 = r1.A02()
            X.Dr0 r0 = (X.Dr0) r0
            if (r0 == 0) goto L_0x00ff
            r0.A05 = r3
        L_0x00ff:
            java.lang.Object r0 = r1.A02()
            r1.A0A(r0)
            boolean r0 = r9.A06()
            if (r0 == 0) goto L_0x016f
            java.lang.Object r0 = r9.A03()
            X.1XQ r0 = (X.1XQ) r0
            boolean r0 = r0.isOk()
            if (r0 == 0) goto L_0x016f
            java.lang.Object r0 = r9.A03()
            X.CG3 r0 = (X.CG3) r0
            java.lang.String r1 = r0.A01
            com.instagram.api.schemas.IGRevShareProductType r0 = com.instagram.api.schemas.IGRevShareProductType.PROFILE_ADS
            java.lang.String r0 = r0.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L_0x0144
            com.instagram.monetization.repository.MonetizationRepository r1 = r2.A06
            java.lang.Object r0 = r9.A03()
            X.CG3 r0 = (X.CG3) r0
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x0165
            r1.A01 = r0
        L_0x013a:
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 26
            X.C51645Fy4.A01(r2, r1, r0)
            return
        L_0x0144:
            java.lang.Object r0 = r9.A03()
            X.CG3 r0 = (X.CG3) r0
            java.lang.String r1 = r0.A01
            com.instagram.api.schemas.IGRevShareProductType r0 = com.instagram.api.schemas.IGRevShareProductType.REELS_OVERLAY_ADS
            java.lang.String r0 = r0.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x013a
            com.instagram.monetization.repository.MonetizationRepository r1 = r2.A06
            java.lang.Object r0 = r9.A03()
            X.CG3 r0 = (X.CG3) r0
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x016a
            r1.A00 = r0
            goto L_0x013a
        L_0x0165:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x016a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x016f:
            X.C46788DlI.A00(r2)
            return
        L_0x0173:
            X.JV7 r9 = (X.JV7) r9
            java.lang.Object r0 = r8.A01
            X.DlE r0 = (X.C46786DlE) r0
            r0.A00 = r9
            r0.A01()
            return
        L_0x017f:
            java.lang.Object r0 = r8.A01
            X.3jv r0 = (X.C249523jv) r0
            X.C301205yj.A00(r9, r0)
            return
        L_0x0187:
            X.NTt r0 = X.C68707NTt.A00
            boolean r0 = X.0qQ.A0K(r9, r0)
            if (r0 == 0) goto L_0x0196
            java.lang.Object r1 = r8.A01
            X.05G r1 = (X.05G) r1
            X.KQR r0 = X.KQR.A00
            goto L_0x01b9
        L_0x0196:
            boolean r0 = r9 instanceof X.C68708NTu
            if (r0 == 0) goto L_0x01a1
            java.lang.Object r1 = r8.A01
            X.05G r1 = (X.05G) r1
            X.KQQ r0 = X.KQQ.A00
            goto L_0x01b9
        L_0x01a1:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01a6:
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r0 = r8.A01
            com.instagram.brandedcontent.repository.BrandedContentSettingsRepository r0 = (com.instagram.brandedcontent.repository.BrandedContentSettingsRepository) r0
            X.05G r1 = r0.A05
            X.0qQ.A0A(r9)
            boolean r0 = X.AnonymousClass7TE.A1b(r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x01b9:
            r1.Epw(r0)
            return
        L_0x01bd:
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r5 = r8.A01
            X.Ji2 r5 = (X.C60245Ji2) r5
            X.05G r4 = r5.A0C
            X.0qQ.A0A(r9)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r9.iterator()
        L_0x01d0:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x023d
            java.lang.Object r0 = r7.next()
            X.2Et r0 = (X.2Et) r0
            java.util.List r0 = r0.BRZ()
            java.util.Iterator r2 = r0.iterator()
        L_0x01e4:
            boolean r0 = r2.hasNext()
            r6 = 0
            if (r0 == 0) goto L_0x01fe
            java.lang.Object r6 = r2.next()
            r1 = r6
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            com.instagram.common.session.UserSession r0 = r5.A03
            java.lang.String r0 = r0.A06
            boolean r0 = X.DbV.A1Z(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01e4
        L_0x01fe:
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            if (r6 == 0) goto L_0x01d0
            r1 = 0
            r0 = 1
            X.Jva r2 = new X.Jva
            r2.<init>(r6, r1, r0)
            X.05G r0 = r5.A0B
            java.lang.Iterable r1 = X.JTO.A0x(r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0220
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0220
        L_0x021c:
            r3.add(r2)
            goto L_0x01d0
        L_0x0220:
            java.util.Iterator r1 = r1.iterator()
        L_0x0224:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x021c
            java.lang.Object r0 = r1.next()
            X.Jva r0 = (X.C61036Jva) r0
            com.instagram.user.model.User r0 = r0.A02
            java.lang.String r0 = r0.getId()
            boolean r0 = X.DbV.A1Z(r6, r0)
            if (r0 == 0) goto L_0x0224
            goto L_0x01d0
        L_0x023d:
            r4.Epw(r3)
            X.1a8 r0 = r5.A02
        L_0x0242:
            r0.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M1T.accept(java.lang.Object):void");
    }

    public M1T(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
