package X;

/* renamed from: X.Cow  reason: case insensitive filesystem */
public abstract class C45019Cow {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.N3n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.N3n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.N3n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: X.Urd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.N3n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: X.VYf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: X.N3n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: X.N3n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: X.N3n} */
    /* JADX WARNING: type inference failed for: r5v5, types: [X.Urd] */
    /* JADX WARNING: type inference failed for: r5v7, types: [X.VYf] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.WSU A00(com.instagram.common.session.UserSession r24, X.C45406Cvm r25) {
        /*
            r8 = 0
            r0 = r25
            X.0qQ.A0B(r0, r8)
            java.lang.Integer r7 = r0.A02
            r5 = 0
            if (r7 != 0) goto L_0x000c
            return r5
        L_0x000c:
            java.lang.String r3 = r0.A03
            X.CwF r10 = r0.A00
            boolean r2 = r0.A04
            X.BBG r9 = r0.A01
            int r0 = r9.A01
            r6 = 1
            r4 = 0
            if (r0 <= 0) goto L_0x001b
            r4 = 1
        L_0x001b:
            boolean r1 = r9.A03
            int r0 = r9.A00
            if (r0 > 0) goto L_0x0022
            r6 = 0
        L_0x0022:
            boolean r0 = r9.A02
            X.Vsa r15 = new X.Vsa
            r15.<init>(r4, r1, r6, r0)
            int r0 = r7.intValue()
            java.lang.String r6 = "ProductDetailsPageParser"
            java.lang.String r4 = "Required value was null."
            switch(r0) {
                case 2: goto L_0x0250;
                case 3: goto L_0x021d;
                case 4: goto L_0x01cd;
                case 7: goto L_0x0125;
                case 8: goto L_0x00ea;
                case 11: goto L_0x00af;
                case 13: goto L_0x006f;
                case 23: goto L_0x0053;
                case 25: goto L_0x0044;
                case 28: goto L_0x0158;
                default: goto L_0x0034;
            }
        L_0x0034:
            java.lang.String r2 = "Unsupported section response of type "
            java.lang.String r1 = X.VHG.A00(r7)
            java.lang.String r0 = " parsed with parseSectionModel"
            java.lang.String r0 = X.002.A0g(r2, r1, r0)
            X.0wb.A03(r6, r0)
            return r5
        L_0x0044:
            X.0qQ.A0A(r3)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0I
            X.UrL r14 = new X.UrL
            r14.<init>(r15, r0, r3, r2)
            return r14
        L_0x0053:
            X.Cv6 r0 = r10.A0G
            if (r0 == 0) goto L_0x006a
            java.lang.String r4 = r0.A01
            java.lang.Integer r1 = r0.A00
            boolean r0 = r0.A02
            X.UrO r14 = new X.UrO
            r5 = r14
            r6 = r15
            r7 = r1
            r8 = r3
            r9 = r4
            r10 = r2
            r11 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r14
        L_0x006a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x006f:
            X.Cvt r8 = r10.A0B
            if (r8 == 0) goto L_0x00aa
            X.0qQ.A0A(r3)
            java.lang.String r7 = r8.A04
            X.0qQ.A06(r7)
            java.lang.Integer r6 = r8.A03
            X.0qQ.A0A(r6)
            X.1XO r5 = r8.A00
            X.UXi r4 = r8.A02
            X.Ct9 r0 = r8.A01
            if (r0 == 0) goto L_0x008c
            java.lang.Integer r1 = r0.A00
            if (r1 != 0) goto L_0x008e
        L_0x008c:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x008e:
            boolean r0 = r8.A05
            X.UrR r14 = new X.UrR
            r16 = r14
            r17 = r5
            r18 = r4
            r19 = r15
            r20 = r6
            r21 = r1
            r22 = r3
            r23 = r7
            r24 = r2
            r25 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r14
        L_0x00aa:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x00af:
            X.Cvl r7 = r10.A0A
            if (r7 == 0) goto L_0x00e5
            X.CvY r0 = r7.A00
            if (r0 == 0) goto L_0x00c6
            java.lang.Integer r6 = r0.A01
            if (r6 == 0) goto L_0x00c6
            java.lang.String r4 = r0.A03
            java.lang.String r1 = r0.A02
            com.instagram.shopping.model.pdp.link.secondarytext.SecondaryTextContent r0 = r0.A00
            X.VYf r5 = new X.VYf
            r5.<init>(r0, r6, r4, r1)
        L_0x00c6:
            java.lang.String r6 = r7.A04
            java.lang.Integer r4 = r7.A03
            X.0qQ.A0A(r4)
            X.CwS r1 = r7.A02
            X.CuN r0 = r7.A01
            X.UrQ r14 = new X.UrQ
            r16 = r0
            r17 = r5
            r18 = r1
            r19 = r4
            r20 = r3
            r21 = r6
            r22 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            return r14
        L_0x00e5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x00ea:
            r7 = r24
            if (r24 != 0) goto L_0x00f4
            java.lang.String r0 = "Tried to parse HERO_CAROUSEL section with null userSession"
            X.0wb.A03(r6, r0)
            return r5
        L_0x00f4:
            X.CuJ r1 = r10.A09
            if (r1 == 0) goto L_0x0120
            java.util.List r0 = r1.A01
            X.0qQ.A06(r0)
            java.util.ArrayList r18 = X.C45894D9x.A02(r7, r0)
            X.Cvi r1 = r1.A00
            if (r1 == 0) goto L_0x010f
            com.instagram.model.shopping.ProductArEffectMetadata r0 = r1.A00
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x010f
            X.Urd r5 = X.C45894D9x.A00(r1, r0)
        L_0x010f:
            X.0qQ.A0A(r3)
            X.UrN r14 = new X.UrN
            r16 = r5
            r17 = r3
            r19 = r2
            r20 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20)
            return r14
        L_0x0120:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x0125:
            X.0qQ.A0A(r3)
            X.CvX r0 = r10.A08
            X.0qQ.A0A(r0)
            java.lang.String r5 = r0.A02
            X.0qQ.A06(r5)
            X.CvX r0 = r10.A08
            X.0qQ.A0A(r0)
            boolean r4 = r0.A03
            X.CvX r0 = r10.A08
            X.0qQ.A0A(r0)
            java.lang.Integer r1 = r0.A00
            X.CvX r0 = r10.A08
            X.0qQ.A0A(r0)
            java.lang.Integer r0 = r0.A01
            X.0qQ.A06(r0)
            X.UrP r14 = new X.UrP
            r6 = r14
            r7 = r15
            r8 = r1
            r9 = r0
            r10 = r3
            r11 = r5
            r12 = r2
            r13 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return r14
        L_0x0158:
            X.0qQ.A0A(r3)
            X.Cv4 r0 = r10.A07
            X.N8v r13 = r0.A00
            X.0qQ.A06(r13)
            X.Cv4 r0 = r10.A07
            X.CvW r0 = r0.A02
            X.CuM r12 = r0.A02
            X.0qQ.A06(r12)
            X.Cv4 r0 = r10.A07
            X.CvW r0 = r0.A02
            X.CuM r11 = r0.A00
            X.0qQ.A06(r11)
            X.Cv4 r0 = r10.A07
            X.CvW r0 = r0.A02
            X.CuM r9 = r0.A01
            X.0qQ.A06(r9)
            X.Cv4 r0 = r10.A07
            X.CvW r0 = r0.A02
            java.lang.String r8 = r0.A03
            X.0qQ.A06(r8)
            X.Cv4 r0 = r10.A07
            X.Cvj r0 = r0.A01
            if (r0 == 0) goto L_0x01b3
            int r7 = r0.A00
            java.lang.String r6 = r0.A04
            X.0qQ.A06(r6)
            java.lang.String r4 = r0.A03
            X.0qQ.A06(r4)
            java.lang.String r1 = r0.A01
            X.0qQ.A06(r1)
            java.lang.String r0 = r0.A02
            X.0qQ.A06(r0)
            X.N3n r5 = new X.N3n
            r16 = r5
            r17 = r6
            r18 = r4
            r19 = r7
            r20 = r1
            r21 = r0
            r16.<init>(r17, r18, r19, r20, r21)
        L_0x01b3:
            X.UrS r14 = new X.UrS
            r16 = r14
            r17 = r5
            r18 = r13
            r19 = r15
            r20 = r12
            r21 = r11
            r22 = r9
            r23 = r3
            r24 = r8
            r25 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r14
        L_0x01cd:
            X.0qQ.A0A(r3)
            X.Cvs r0 = r10.A05
            X.0qQ.A0A(r0)
            java.lang.String r9 = r0.A02
            X.0qQ.A06(r9)
            X.Cvs r0 = r10.A05
            X.0qQ.A0A(r0)
            java.lang.String r7 = r0.A04
            X.0qQ.A06(r7)
            X.Cvs r0 = r10.A05
            X.0qQ.A0A(r0)
            java.lang.String r6 = r0.A03
            X.Cvs r0 = r10.A05
            X.0qQ.A0A(r0)
            boolean r4 = r0.A05
            X.Cvs r0 = r10.A05
            X.0qQ.A0A(r0)
            java.lang.Integer r1 = r0.A01
            X.0qQ.A06(r1)
            X.Cvs r0 = r10.A05
            X.0qQ.A0A(r0)
            X.VWk r0 = r0.A00
            X.UrT r14 = new X.UrT
            r25 = r8
            r20 = r7
            r21 = r6
            r22 = r5
            r23 = r2
            r24 = r4
            r17 = r1
            r18 = r3
            r19 = r9
            r16 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r14
        L_0x021d:
            X.Ct4 r0 = r10.A04
            if (r0 == 0) goto L_0x024b
            X.CuI r1 = r0.A00
            X.4hR r0 = r1.A00
            if (r0 != 0) goto L_0x0237
            java.lang.String r0 = r1.A01
            X.0qQ.A06(r0)
            X.4hR r0 = X.C276404tH.A01(r0)
            if (r0 != 0) goto L_0x0237
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x0237:
            X.3ew r0 = r0.A01()
            X.68u r0 = X.C3034368u.A02(r5, r0)
            X.0qQ.A0A(r3)
            X.0qQ.A0A(r0)
            X.UrM r14 = new X.UrM
            r14.<init>(r0, r15, r3, r2)
            return r14
        L_0x024b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x0250:
            X.0qQ.A0A(r3)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.UrK r14 = new X.UrK
            r14.<init>(r15, r0, r3, r2)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45019Cow.A00(com.instagram.common.session.UserSession, X.Cvm):X.WSU");
    }
}
