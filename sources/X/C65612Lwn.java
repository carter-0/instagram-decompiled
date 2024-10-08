package X;

import java.util.List;

/* renamed from: X.Lwn  reason: case insensitive filesystem */
public final class C65612Lwn implements X8a {
    public final int A00;
    public final Object A01;

    public C65612Lwn(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r10v3, types: [X.Tx9, X.Tre] */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02c8, code lost:
        if (X.AnonymousClass7TE.A1b(r9.A07) != false) goto L_0x02ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C14198Trd E39() {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0047;
                case 1: goto L_0x00ea;
                case 2: goto L_0x011f;
                case 3: goto L_0x020e;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 0
            X.Tx9 r10 = new X.Tx9
            r10.<init>(r0)
            java.lang.Object r0 = r1.A01
            X.Dkq r0 = (X.C46763Dkq) r0
            X.0Ud r0 = r0.A0E
            java.lang.Object r1 = r0.getValue()
            X.KnJ r1 = (X.C62843KnJ) r1
            boolean r0 = r1 instanceof X.C62007KVg
            if (r0 == 0) goto L_0x031a
            X.KVg r1 = (X.C62007KVg) r1
            java.util.List r0 = r1.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x0025:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x031a
            com.instagram.user.model.User r0 = X.DbT.A0k(r3)
            X.Ma1 r2 = new X.Ma1
            r2.<init>(r0)
            X.Mfz r1 = new X.Mfz
            r1.<init>()
            java.lang.String r0 = "server"
            r1.A09 = r0
            r0 = 2131963673(0x7f132f19, float:1.9564106E38)
            X.JTT.A1R(r1, r0)
            r10.A03(r1, r2)
            goto L_0x0025
        L_0x0047:
            r4 = 0
            X.Tx9 r10 = new X.Tx9
            r10.<init>(r4)
            java.lang.Object r3 = r1.A01
            X.K8a r3 = (X.C61446K8a) r3
            java.util.List r0 = r3.A06
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x00b7
            java.util.List r0 = r3.A06
            int r0 = r0.size()
            r6 = 2
            if (r0 <= r6) goto L_0x00ab
            java.util.List r0 = r3.A05
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x00ab
            r0 = 2131954164(0x7f1309f4, float:1.954482E38)
            java.lang.String r0 = X.DbU.A0m(r3, r0)
            X.GKw r5 = new X.GKw
            r5.<init>(r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.Jw7 r0 = new X.Jw7
            r0.<init>((X.C266444Yx) r5, (java.lang.Integer) r2, (java.lang.Integer) r1)
        L_0x007f:
            X.JTT.A1Q(r10, r0)
            java.util.List r0 = r3.A05
            boolean r1 = X.AnonymousClass7TE.A1b(r0)
            java.util.List r0 = r3.A06
            int r2 = r0.size()
            if (r1 == 0) goto L_0x0094
            int r2 = java.lang.Math.min(r2, r6)
        L_0x0094:
            if (r4 >= r2) goto L_0x00b7
            java.util.List r0 = r3.A06
            com.instagram.user.model.User r0 = X.DbS.A0g(r0, r4)
            X.Ma1 r1 = new X.Ma1
            r1.<init>(r0)
            X.Mfz r0 = X.C61446K8a.A00(r3, r0)
            r10.A03(r0, r1)
            int r4 = r4 + 1
            goto L_0x0094
        L_0x00ab:
            r0 = 2131954164(0x7f1309f4, float:1.954482E38)
            java.lang.String r0 = X.DbU.A0m(r3, r0)
            X.Jw7 r0 = X.C18690Vwo.A02(r0)
            goto L_0x007f
        L_0x00b7:
            java.util.List r0 = r3.A05
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x031a
            r0 = 2131954138(0x7f1309da, float:1.9544767E38)
            java.lang.String r0 = X.DbU.A0m(r3, r0)
            X.Jw7 r0 = X.C18690Vwo.A02(r0)
            X.JTT.A1Q(r10, r0)
            java.util.List r0 = r3.A05
            java.util.Iterator r2 = r0.iterator()
        L_0x00d3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x031a
            com.instagram.user.model.User r0 = X.DbT.A0k(r2)
            X.Ma1 r1 = new X.Ma1
            r1.<init>(r0)
            X.Mfz r0 = X.C61446K8a.A00(r3, r0)
            r10.A03(r0, r1)
            goto L_0x00d3
        L_0x00ea:
            java.lang.Object r1 = r1.A01
            X.K8Z r1 = (X.K8Z) r1
            X.0eM r0 = r1.A05
            java.lang.Object r9 = r0.getValue()
            X.JjM r9 = (X.C60318JjM) r9
            r0 = 16
            X.Iwb r3 = new X.Iwb
            r3.<init>(r1, r0)
            r2 = 0
            X.Tx9 r10 = new X.Tx9
            r10.<init>(r2)
            java.util.Map r0 = r9.A09
            java.util.ArrayList r14 = X.JTQ.A0f(r0)
            java.util.Iterator r1 = X.AnonymousClass7TF.A0u(r0)
        L_0x010d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02b9
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r1)
            java.lang.Object r0 = r0.getKey()
            r14.add(r0)
            goto L_0x010d
        L_0x011f:
            r6 = 0
            X.Tx9 r10 = new X.Tx9
            r10.<init>(r6)
            java.lang.Object r3 = r1.A01
            X.K8c r3 = (X.C61448K8c) r3
            java.util.List r0 = r3.A01
            boolean r0 = r0.isEmpty()
            r4 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01b8
            java.util.List r0 = r3.A01
            int r5 = r0.size()
            java.lang.String r8 = "https://help.instagram.com/866719006830114"
            r7 = 2
            if (r5 <= r7) goto L_0x01ac
            java.util.List r0 = r3.A02
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x01ac
            r0 = 2131953101(0x7f1305cd, float:1.9542663E38)
            java.lang.String r0 = X.DbU.A0m(r3, r0)
            X.GKw r9 = new X.GKw
            r9.<init>(r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.Jw7 r0 = new X.Jw7
            r0.<init>((X.C266444Yx) r9, (java.lang.Integer) r2, (java.lang.Integer) r1)
        L_0x015c:
            X.JTT.A1Q(r10, r0)
            r2 = 2131953099(0x7f1305cb, float:1.954266E38)
            r1 = 2131954140(0x7f1309dc, float:1.954477E38)
            java.lang.String r0 = r3.getString(r1)
            java.lang.String r2 = X.DbV.A0z(r3, r0, r2)
            X.0qQ.A07(r2)
            java.lang.String r0 = r3.getString(r1)
            X.Jw7 r1 = new X.Jw7
            r1.<init>((java.lang.CharSequence) r2, (java.lang.CharSequence) r0, (java.lang.CharSequence) r8)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r10.A04(r0, r1)
            java.util.List r0 = r3.A02
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x018a
            int r5 = java.lang.Math.min(r5, r7)
        L_0x018a:
            if (r6 >= r5) goto L_0x01b8
            java.util.List r0 = r3.A01
            com.instagram.user.model.User r0 = X.DbS.A0g(r0, r6)
            X.Ma1 r2 = new X.Ma1
            r2.<init>(r0)
            X.Mfz r1 = new X.Mfz
            r1.<init>()
            java.lang.String r0 = "approval_search_item_state_source"
            r1.A09 = r0
            r0 = 2131953089(0x7f1305c1, float:1.954264E38)
            X.JTT.A1R(r1, r0)
            r10.A03(r1, r2)
            int r6 = r6 + 1
            goto L_0x018a
        L_0x01ac:
            r0 = 2131953101(0x7f1305cd, float:1.9542663E38)
            java.lang.String r0 = X.DbU.A0m(r3, r0)
            X.Jw7 r0 = X.C18690Vwo.A02(r0)
            goto L_0x015c
        L_0x01b8:
            java.util.List r0 = r3.A02
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x031a
            r0 = 2131971335(0x7f134d07, float:1.9579646E38)
            java.lang.String r0 = X.DbU.A0m(r3, r0)
            X.Jw7 r0 = X.C18690Vwo.A02(r0)
            X.JTT.A1Q(r10, r0)
            r0 = 2131971336(0x7f134d08, float:1.9579648E38)
            java.lang.String r2 = X.DbU.A0m(r3, r0)
            r0 = 0
            X.Jw7 r1 = new X.Jw7
            r1.<init>((java.lang.CharSequence) r2, (java.lang.CharSequence) r0, (java.lang.CharSequence) r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r10.A04(r0, r1)
            java.util.List r0 = r3.A02
            java.util.Iterator r3 = r0.iterator()
        L_0x01e6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x031a
            com.instagram.user.model.User r0 = X.DbT.A0k(r3)
            X.Ma1 r2 = new X.Ma1
            r2.<init>(r0)
            X.Mfz r1 = new X.Mfz
            r1.<init>()
            java.lang.String r0 = "request_search_item_state_source"
            r1.A09 = r0
            r0 = 2131953084(0x7f1305bc, float:1.954263E38)
            X.JTT.A1R(r1, r0)
            X.4lo r0 = X.C273014lo.PRIMARY
            r1.A03 = r0
            r1.A0I = r4
            r10.A03(r1, r2)
            goto L_0x01e6
        L_0x020e:
            r5 = 0
            X.Tx9 r10 = new X.Tx9
            r10.<init>(r5)
            java.lang.Object r4 = r1.A01
            X.K8b r4 = (X.C61447K8b) r4
            java.util.List r0 = r4.A01
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0285
            java.util.List r0 = r4.A01
            int r0 = r0.size()
            r6 = 2
            if (r0 <= r6) goto L_0x0279
            java.util.List r0 = r4.A00
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0279
            r0 = 2131954164(0x7f1309f4, float:1.954482E38)
            java.lang.String r0 = X.DbU.A0m(r4, r0)
            X.GKw r3 = new X.GKw
            r3.<init>(r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.Jw7 r0 = new X.Jw7
            r0.<init>((X.C266444Yx) r3, (java.lang.Integer) r2, (java.lang.Integer) r1)
        L_0x0246:
            X.JTT.A1Q(r10, r0)
            java.util.List r0 = r4.A00
            boolean r1 = X.AnonymousClass7TE.A1b(r0)
            java.util.List r0 = r4.A01
            int r3 = r0.size()
            if (r1 == 0) goto L_0x025b
            int r3 = java.lang.Math.min(r3, r6)
        L_0x025b:
            if (r5 >= r3) goto L_0x0285
            java.util.List r0 = r4.A01
            com.instagram.user.model.User r0 = X.DbS.A0g(r0, r5)
            X.Ma1 r2 = new X.Ma1
            r2.<init>(r0)
            X.Mfz r1 = new X.Mfz
            r1.<init>()
            r0 = 2131969279(0x7f1344ff, float:1.9575476E38)
            X.JTT.A1R(r1, r0)
            r10.A03(r1, r2)
            int r5 = r5 + 1
            goto L_0x025b
        L_0x0279:
            r0 = 2131954164(0x7f1309f4, float:1.954482E38)
            java.lang.String r0 = X.DbU.A0m(r4, r0)
            X.Jw7 r0 = X.C18690Vwo.A02(r0)
            goto L_0x0246
        L_0x0285:
            java.util.List r0 = r4.A00
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x031a
            r0 = 2131954138(0x7f1309da, float:1.9544767E38)
            java.lang.String r0 = X.DbU.A0m(r4, r0)
            X.Jw7 r0 = X.C18690Vwo.A02(r0)
            X.JTT.A1Q(r10, r0)
            java.util.List r0 = r4.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x02a1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x031a
            com.instagram.user.model.User r0 = X.DbT.A0k(r2)
            X.Ma1 r1 = new X.Ma1
            r1.<init>(r0)
            X.Mfz r0 = new X.Mfz
            r0.<init>()
            r10.A03(r0, r1)
            goto L_0x02a1
        L_0x02b9:
            java.util.List r1 = r9.A06
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 != 0) goto L_0x02ca
            java.util.List r0 = r9.A07
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            r15 = 0
            if (r0 == 0) goto L_0x02cb
        L_0x02ca:
            r15 = 1
        L_0x02cb:
            r0 = 2131954146(0x7f1309e2, float:1.9544783E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r12 = r3.invoke(r0)
            java.lang.String r12 = (java.lang.String) r12
            r0 = 2131954145(0x7f1309e1, float:1.954478E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r13 = r3.invoke(r0)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            X.C60318JjM.A02(r9, r10, r11, r12, r13, r14, r15)
            java.util.List r14 = r9.A07
            boolean r15 = X.AnonymousClass7TE.A1b(r1)
            r0 = 2131969279(0x7f1344ff, float:1.9575476E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r12 = r3.invoke(r0)
            java.lang.String r12 = (java.lang.String) r12
            r13 = 0
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            X.C60318JjM.A02(r9, r10, r11, r12, r13, r14, r15)
            r0 = 2131954138(0x7f1309da, float:1.9544767E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.String r0 = (java.lang.String) r0
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r0
            r7 = r13
            r8 = r1
            r9 = r2
            X.C60318JjM.A02(r3, r4, r5, r6, r7, r8, r9)
        L_0x031a:
            X.Trd r0 = r10.A01()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65612Lwn.E39():X.Trd");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0090, code lost:
        if (((X.C62007KVg) r2).A00.size() < X.DbS.A04(X.0Tu.A05, r9.A02, 36597304662166291L)) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00dd, code lost:
        if (r0 != 4) goto L_0x00df;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C14198Trd E3A(java.lang.String r14, java.lang.String r15, java.util.List r16, java.util.List r17) {
        /*
            r13 = this;
            int r0 = r13.A00
            r2 = r16
            r1 = r17
            switch(r0) {
                case 0: goto L_0x0192;
                case 1: goto L_0x015d;
                case 2: goto L_0x0112;
                case 3: goto L_0x009d;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.AnonymousClass7TG.A1O(r2, r1)
            r0 = 0
            X.Tre r4 = new X.Tre
            r4.<init>(r0)
            java.lang.Object r9 = r13.A01
            X.Dkq r9 = (X.C46763Dkq) r9
            X.0Ud r8 = r9.A0E
            java.lang.Object r7 = r8.getValue()
            X.KnJ r7 = (X.C62843KnJ) r7
            boolean r0 = r7 instanceof X.C62007KVg
            if (r0 == 0) goto L_0x01bf
            java.util.ArrayList r0 = X.00k.A0S(r1, r2)
            java.util.Iterator r12 = r0.iterator()
        L_0x002a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01bf
            java.lang.Object r11 = r12.next()
            X.Ma1 r11 = (X.C66632Ma1) r11
            r0 = r7
            X.KVg r0 = (X.C62007KVg) r0
            java.util.List r1 = r0.A00
            com.instagram.user.model.User r0 = r11.A06()
            boolean r1 = r1.contains(r0)
            java.lang.String r0 = "server"
            X.Mfz r10 = new X.Mfz
            r10.<init>()
            r10.A09 = r0
            if (r1 == 0) goto L_0x005c
            r0 = 2131963673(0x7f132f19, float:1.9564106E38)
            X.JTT.A1R(r10, r0)
            X.4lo r0 = X.C273014lo.SECONDARY
        L_0x0056:
            r10.A03 = r0
            r4.A02(r10, r11)
            goto L_0x002a
        L_0x005c:
            r0 = 2131963672(0x7f132f18, float:1.9564104E38)
            X.JTT.A1R(r10, r0)
            java.lang.Object r2 = r8.getValue()
            X.KnJ r2 = (X.C62843KnJ) r2
            boolean r0 = r2 instanceof X.C62008KVh
            r6 = 0
            if (r0 != 0) goto L_0x0093
            boolean r0 = r2 instanceof X.C62007KVg
            if (r0 == 0) goto L_0x0098
            java.lang.String r0 = r9.A08
            if (r0 != 0) goto L_0x0092
            com.instagram.api.schemas.IGRevShareProductType r1 = r9.A01
            com.instagram.api.schemas.IGRevShareProductType r0 = com.instagram.api.schemas.IGRevShareProductType.PROFILE_ADS
            if (r1 != r0) goto L_0x0092
            X.KVg r2 = (X.C62007KVg) r2
            java.util.List r0 = r2.A00
            int r5 = r0.size()
            com.instagram.common.session.UserSession r3 = r9.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36597304662166291(0x82050e00200b13, double:3.207621061646902E-306)
            int r0 = X.DbS.A04(r2, r3, r0)
            if (r5 >= r0) goto L_0x0093
        L_0x0092:
            r6 = 1
        L_0x0093:
            r10.A0C = r6
            X.4lo r0 = X.C273014lo.PRIMARY
            goto L_0x0056
        L_0x0098:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x009d:
            r0 = 1
            r6 = 5
            X.0qQ.A0B(r2, r0)
            r0 = 2
            r5 = 4
            X.0qQ.A0B(r1, r0)
            r3 = 0
            X.Tre r4 = new X.Tre
            r4.<init>(r3)
            java.util.ArrayList r0 = X.00k.A0S(r1, r2)
            java.util.Iterator r7 = r0.iterator()
        L_0x00b5:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01bf
            java.lang.Object r2 = r7.next()
            X.Ma1 r2 = (X.C66632Ma1) r2
            com.instagram.user.model.User r0 = r2.A06()
            boolean r0 = r0.A1v()
            if (r0 != 0) goto L_0x0100
            com.instagram.user.model.User r0 = r2.A06()
            X.4Cl r0 = r0.A03
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r0 = r0.AcG()
            if (r0 == 0) goto L_0x00df
            int r0 = r0.ordinal()
            if (r0 == r6) goto L_0x00f2
            if (r0 == r5) goto L_0x0100
        L_0x00df:
            X.Mfz r1 = new X.Mfz
            r1.<init>()
            r0 = 2131972226(0x7f135082, float:1.9581454E38)
            X.JTT.A1R(r1, r0)
            X.4lo r0 = X.C273014lo.PRIMARY
        L_0x00ec:
            r1.A03 = r0
        L_0x00ee:
            r4.A02(r1, r2)
            goto L_0x00b5
        L_0x00f2:
            X.Mfz r1 = new X.Mfz
            r1.<init>()
            r0 = 2131969279(0x7f1344ff, float:1.9575476E38)
            X.JTT.A1R(r1, r0)
            X.4lo r0 = X.C273014lo.SECONDARY
            goto L_0x00ec
        L_0x0100:
            X.Mfz r1 = new X.Mfz
            r1.<init>()
            r0 = 2131953089(0x7f1305c1, float:1.954264E38)
            X.JTT.A1R(r1, r0)
            X.4lo r0 = X.C273014lo.SECONDARY
            r1.A03 = r0
            r1.A0C = r3
            goto L_0x00ee
        L_0x0112:
            X.AnonymousClass7TG.A1O(r2, r1)
            r0 = 0
            X.Tre r4 = new X.Tre
            r4.<init>(r0)
            java.util.ArrayList r0 = X.00k.A0S(r1, r2)
            java.util.Iterator r6 = r0.iterator()
        L_0x0123:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01bf
            java.lang.Object r5 = r6.next()
            X.Ma1 r5 = (X.C66632Ma1) r5
            com.instagram.user.model.User r0 = r5.A06()
            X.4Cl r0 = r0.A03
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r3 = r0.Afa()
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r2 = com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_ONCE_GRANTED
            java.lang.String r0 = "approval_search_item_state_source"
            X.Mfz r1 = new X.Mfz
            r1.<init>()
            r1.A09 = r0
            if (r3 != r2) goto L_0x0154
            r0 = 2131953089(0x7f1305c1, float:1.954264E38)
            X.JTT.A1R(r1, r0)
            X.4lo r0 = X.C273014lo.SECONDARY
        L_0x014e:
            r1.A03 = r0
            r4.A02(r1, r5)
            goto L_0x0123
        L_0x0154:
            r0 = 2131953084(0x7f1305bc, float:1.954263E38)
            X.JTT.A1R(r1, r0)
            X.4lo r0 = X.C273014lo.PRIMARY
            goto L_0x014e
        L_0x015d:
            X.AnonymousClass7TG.A1O(r2, r1)
            java.lang.Object r0 = r13.A01
            X.K8Z r0 = (X.K8Z) r0
            X.0eM r0 = r0.A05
            java.lang.Object r3 = r0.getValue()
            X.JjM r3 = (X.C60318JjM) r3
            java.util.ArrayList r1 = X.00k.A0S(r1, r2)
            r0 = 0
            X.Tre r4 = new X.Tre
            r4.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x017a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01bf
            java.lang.Object r1 = r2.next()
            X.Ma1 r1 = (X.C66632Ma1) r1
            com.instagram.user.model.User r0 = r1.A06()
            X.Mfz r0 = X.C60318JjM.A00(r3, r0)
            r4.A02(r0, r1)
            goto L_0x017a
        L_0x0192:
            X.AnonymousClass7TG.A1O(r2, r1)
            r0 = 0
            X.Tre r4 = new X.Tre
            r4.<init>(r0)
            java.util.ArrayList r0 = X.00k.A0S(r1, r2)
            java.util.Iterator r3 = r0.iterator()
        L_0x01a3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01bf
            java.lang.Object r2 = r3.next()
            X.Ma1 r2 = (X.C66632Ma1) r2
            java.lang.Object r1 = r13.A01
            X.K8a r1 = (X.C61446K8a) r1
            com.instagram.user.model.User r0 = r2.A06()
            X.Mfz r0 = X.C61446K8a.A00(r1, r0)
            r4.A02(r0, r2)
            goto L_0x01a3
        L_0x01bf:
            X.Trd r0 = r4.A01()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65612Lwn.E3A(java.lang.String, java.lang.String, java.util.List, java.util.List):X.Trd");
    }

    public final /* synthetic */ C14198Trd E38(String str, List list) {
        return VGD.A00(this, str);
    }

    public final /* synthetic */ void Dhi(UKV ukv) {
    }
}
