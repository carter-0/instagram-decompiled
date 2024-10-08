package X;

public abstract class DdI {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: X.BBV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: X.BBV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v1, resolved type: X.9J6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: X.BBV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: X.BBV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: X.BBV} */
    /* JADX WARNING: type inference failed for: r14v2, types: [X.9J6] */
    /* JADX WARNING: type inference failed for: r12v1, types: [X.GRe] */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01fd, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36322658681366873L) != false) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02aa, code lost:
        if (r0.A04.A00 != com.instagram.api.schemas.PrivateReplyStatus.A06) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0393, code lost:
        if (r5 == r2) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008f, code lost:
        if (r0.A03.A00 != 0) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0196, code lost:
        if (r2 != true) goto L_0x0198;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x03e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C52389GQo A00(android.content.Context r30, com.instagram.common.session.UserSession r31, X.C283155Gi r32, boolean r33, boolean r34, boolean r35) {
        /*
            r13 = 0
            r0 = r32
            if (r32 == 0) goto L_0x013b
            X.5Gj r1 = r0.A04
            java.lang.String r4 = r1.A0n
            r8 = r30
            if (r4 != 0) goto L_0x001a
            X.5Gm r2 = r0.A05
            X.5Gm r1 = X.C283195Gm.GROUPED_FRIEND_REQUEST
            if (r2 != r1) goto L_0x005e
            r1 = 2131963228(0x7f132d5c, float:1.9563203E38)
            java.lang.String r4 = r8.getString(r1)
        L_0x001a:
            X.5Gj r1 = r0.A04
            java.lang.String r3 = r1.A0j
            java.lang.String r2 = r1.A0o
            java.util.List r1 = r1.A0w
            if (r1 == 0) goto L_0x002a
            X.62P r26 = X.AnonymousClass62Q.A00(r1)
            if (r26 != 0) goto L_0x002c
        L_0x002a:
            X.62M r26 = X.AnonymousClass62M.A01
        L_0x002c:
            java.lang.Double r22 = r0.A05()
            X.5Gj r1 = r0.A04
            java.util.List r9 = r1.A11
            if (r9 != 0) goto L_0x0038
            X.0sn r9 = X.0sn.A00
        L_0x0038:
            int r1 = r9.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r1)
            int r6 = r9.size()
            r5 = 0
        L_0x0046:
            if (r5 >= r6) goto L_0x0060
            java.lang.Object r1 = r9.get(r5)
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            boolean r10 = r1.isVerified()
            if (r10 == 0) goto L_0x005b
            java.lang.String r1 = r1.getId()
            r7.add(r1)
        L_0x005b:
            int r5 = r5 + 1
            goto L_0x0046
        L_0x005e:
            r4 = r13
            goto L_0x001a
        L_0x0060:
            X.YCQ r27 = X.AnonymousClass62Q.A02(r7)
            X.5Gl r1 = r0.A03
            boolean r1 = r1.A02
            X.GQR r21 = new X.GQR
            r23 = r3
            r24 = r2
            r25 = r4
            r28 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            boolean r1 = r0.A0H()
            if (r34 == 0) goto L_0x03fe
            if (r1 == 0) goto L_0x0091
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            X.5Gj r1 = r0.A04
            java.lang.Boolean r1 = r1.A03
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0091
        L_0x0089:
            X.5Gl r1 = r0.A03
            int r1 = r1.A00
            r26 = 1
            if (r1 == 0) goto L_0x0093
        L_0x0091:
            r26 = 0
        L_0x0093:
            r4 = 0
            r35 = 1
            X.0Tu r5 = X.0Tu.A06
            r1 = 36330874953810749(0x8112bd0000433d, double:3.039129841256533E-306)
            r3 = r31
            boolean r9 = X.182.A06(r5, r3, r1)
            r1 = 36330874953941822(0x8112bd0002433e, double:3.039129841339424E-306)
            boolean r11 = X.182.A06(r5, r3, r1)
            X.5Gj r1 = r0.A04
            com.instagram.common.typedurl.ImageUrl r1 = r1.A0E
            boolean r1 = X.C253833rU.A02(r1)
            r2 = r1 ^ 1
            java.lang.String r1 = "Required value was null."
            r14 = 0
            if (r2 == 0) goto L_0x0312
            X.DdG r5 = new X.DdG
            r5.<init>(r3)
            X.5Gj r2 = r0.A04
            com.instagram.common.typedurl.ImageUrl r2 = r2.A0G
            boolean r2 = X.C253833rU.A02(r2)
            if (r2 == 0) goto L_0x030f
            com.instagram.model.reels.Reel r6 = r5.A00(r0)
        L_0x00ce:
            X.5Gj r5 = r0.A04
            com.instagram.common.typedurl.ImageUrl r15 = r5.A0E
            if (r15 == 0) goto L_0x0418
            com.instagram.common.typedurl.ImageUrl r2 = r5.A0G
            r18 = 0
            if (r6 == 0) goto L_0x00dc
            r18 = 1
        L_0x00dc:
            if (r9 == 0) goto L_0x00e0
            X.BBV r14 = r5.A0C
        L_0x00e0:
            X.GQz r12 = new X.GQz
            r17 = r13
            r20 = r4
            r16 = r2
            r19 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x00ed:
            X.5Gm r5 = r0.A05
            X.5Gm r2 = X.C283195Gm.GROUPED_FRIEND_REQUEST
            if (r5 != r2) goto L_0x02ff
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r4 = 2131962574(0x7f132ace, float:1.9561877E38)
            X.GKO r5 = new X.GKO
            r5.<init>(r6, r4)
        L_0x00fd:
            X.5Gj r6 = r0.A04
            java.lang.String r9 = r6.A0W
            java.lang.Boolean r4 = r6.A0K
            if (r4 == 0) goto L_0x02fb
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x02fb
        L_0x010b:
            r17 = 0
            if (r35 != 0) goto L_0x026c
            X.5Gl r4 = r0.A03
            boolean r4 = r4.A01
            if (r4 != 0) goto L_0x026c
            r23 = r13
        L_0x0117:
            r4 = 1
            X.5Gm r6 = r0.A05
            if (r6 != r2) goto L_0x013c
            X.5Gj r1 = r0.A04
            com.instagram.common.typedurl.ImageUrl r1 = r1.A0E
            boolean r1 = X.C253833rU.A02(r1)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0268
            X.Dgc r3 = X.C46535Dgc.A00
        L_0x012a:
            X.GQo r13 = new X.GQo
            r18 = r13
            r19 = r5
            r20 = r0
            r22 = r3
            r24 = r12
            r25 = r9
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x013b:
            return r13
        L_0x013c:
            X.5Gj r2 = r0.A04
            X.JV7 r7 = r2.A0D
            r2 = 0
            if (r7 == 0) goto L_0x0144
            r2 = 1
        L_0x0144:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0166
            if (r7 == 0) goto L_0x0406
            java.lang.String r4 = r7.A02
            if (r4 == 0) goto L_0x0406
            java.lang.Object r3 = r7.A00
            X.EXC r2 = X.EXC.PRIMARY
            r1 = 2130970263(0x7f040697, float:1.7549231E38)
            if (r3 != r2) goto L_0x0160
            r1 = 2130970270(0x7f04069e, float:1.7549245E38)
        L_0x0160:
            X.HCK r3 = new X.HCK
            r3.<init>(r4, r1)
            goto L_0x012a
        L_0x0166:
            X.5Gm r2 = X.C283195Gm.ICON_WITH_INLINE_BUTTON
            if (r6 == r2) goto L_0x0268
            int r7 = r0.A00
            r2 = 159(0x9f, float:2.23E-43)
            if (r7 == r2) goto L_0x0232
            r2 = 1519(0x5ef, float:2.129E-42)
            if (r7 == r2) goto L_0x0232
            r2 = 459(0x1cb, float:6.43E-43)
            if (r7 == r2) goto L_0x0232
            X.5Gm r2 = X.C283195Gm.FOLLOW_REQUEST
            r7 = 0
            if (r6 != r2) goto L_0x01a1
            com.instagram.user.model.User r2 = r0.A04()
            if (r2 == 0) goto L_0x01a1
            boolean r2 = r2.A2D()
            if (r2 != r4) goto L_0x01a1
            com.instagram.user.model.User r1 = r0.A04()
            if (r1 == 0) goto L_0x0198
            boolean r2 = r1.A1e()
            r1 = 2131972388(0x7f135124, float:1.9581782E38)
            if (r2 == r4) goto L_0x019b
        L_0x0198:
            r1 = 2131956481(0x7f131301, float:1.9549519E38)
        L_0x019b:
            X.GRn r3 = new X.GRn
            r3.<init>(r1)
            goto L_0x012a
        L_0x01a1:
            com.instagram.user.model.User r2 = r0.A04()
            if (r2 == 0) goto L_0x0200
            X.5Gj r1 = r0.A04
            X.9Ii r1 = r1.A08
            if (r1 == 0) goto L_0x01f1
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Object r1 = r1.A01
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01f1
        L_0x01b7:
            r2 = 1
        L_0x01b8:
            com.instagram.user.model.User r1 = r0.A04()
            if (r1 == 0) goto L_0x01c2
            com.instagram.user.model.FollowStatus r13 = r1.B6o()
        L_0x01c2:
            if (r2 == 0) goto L_0x01e2
            com.instagram.user.model.User r1 = r0.A04()
            if (r1 == 0) goto L_0x01e2
            boolean r1 = r1.A2A()
            if (r1 != r4) goto L_0x01e2
        L_0x01d0:
            r7 = 1
        L_0x01d1:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            X.DgM r2 = X.DdK.A00(r13, r1)
            X.GVy r1 = X.C52521GVy.A00
            X.GQx r3 = new X.GQx
            r3.<init>(r2, r1)
            goto L_0x012a
        L_0x01e2:
            java.lang.String r2 = "remove_follower"
            X.5Gj r1 = r0.A04
            java.util.List r1 = r1.A0t
            if (r1 == 0) goto L_0x01d1
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x01d1
            goto L_0x01d0
        L_0x01f1:
            X.0Tu r6 = X.0Tu.A05
            r1 = 36322658681366873(0x810b4400002959, double:3.033933837478752E-306)
            boolean r1 = X.182.A06(r6, r3, r1)
            r2 = 0
            if (r1 == 0) goto L_0x01b8
            goto L_0x01b7
        L_0x0200:
            com.instagram.common.typedurl.ImageUrl r2 = r0.A01()
            boolean r2 = X.C253833rU.A02(r2)
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0228
            int r4 = r0.A00
            r3 = 1643(0x66b, float:2.302E-42)
            com.instagram.common.typedurl.ImageUrl r2 = r0.A01()
            if (r4 != r3) goto L_0x021f
            if (r2 == 0) goto L_0x040c
            X.HCJ r3 = new X.HCJ
            r3.<init>(r2)
            goto L_0x012a
        L_0x021f:
            if (r2 == 0) goto L_0x0412
            X.GQq r3 = new X.GQq
            r3.<init>(r2)
            goto L_0x012a
        L_0x0228:
            boolean r1 = r0.A0G()
            if (r1 == 0) goto L_0x0268
            X.ENJ r3 = X.ENJ.A00
            goto L_0x012a
        L_0x0232:
            java.util.Map r3 = r0.A0D()
            if (r3 == 0) goto L_0x0264
            java.lang.String r1 = "lat"
            java.lang.Object r2 = r3.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = "long"
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r2 == 0) goto L_0x0264
            if (r1 == 0) goto L_0x0264
            double r3 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x0264 }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ NumberFormatException -> 0x0264 }
            java.lang.String r2 = X.DdU.A00(r8, r3, r1)
            com.instagram.common.typedurl.SimpleImageUrl r1 = new com.instagram.common.typedurl.SimpleImageUrl
            r1.<init>(r2)
            X.GQq r3 = new X.GQq
            r3.<init>(r1)
            goto L_0x012a
        L_0x0264:
            X.GVx r3 = X.C52520GVx.A00
            goto L_0x012a
        L_0x0268:
            X.GVx r3 = X.C52520GVx.A00
            goto L_0x012a
        L_0x026c:
            java.lang.String r4 = r6.A06
            r11 = 2131963842(0x7f132fc2, float:1.9564449E38)
            if (r4 != 0) goto L_0x0276
            r11 = 2131963839(0x7f132fbf, float:1.9564443E38)
        L_0x0276:
            int r7 = r0.A00
            r4 = 101(0x65, float:1.42E-43)
            r10 = 0
            if (r7 != r4) goto L_0x027e
            r10 = 1
        L_0x027e:
            com.instagram.api.schemas.PrivateReplyStatus r6 = r6.A00
            if (r6 == 0) goto L_0x02f9
            com.instagram.api.schemas.PrivateReplyStatus r4 = com.instagram.api.schemas.PrivateReplyStatus.A04
            if (r6 == r4) goto L_0x02f9
            X.0eE r4 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r4 = r4.A01(r3)
            boolean r4 = X.2Ek.A03(r4)
            if (r4 != 0) goto L_0x0294
            if (r10 == 0) goto L_0x02f9
        L_0x0294:
            r6 = 1
        L_0x0295:
            X.5Gj r4 = r0.A04
            java.lang.String r4 = r4.A0f
            if (r4 == 0) goto L_0x02f7
            boolean r4 = X.DdN.A00(r3, r4)
        L_0x029f:
            if (r6 == 0) goto L_0x02f2
            X.5Gj r4 = r0.A04
            com.instagram.api.schemas.PrivateReplyStatus r7 = r4.A00
            com.instagram.api.schemas.PrivateReplyStatus r6 = com.instagram.api.schemas.PrivateReplyStatus.A06
            r4 = 2131963837(0x7f132fbd, float:1.9564439E38)
            if (r7 == r6) goto L_0x02af
        L_0x02ac:
            r4 = 2131963836(0x7f132fbc, float:1.9564437E38)
        L_0x02af:
            java.lang.Integer r16 = java.lang.Integer.valueOf(r4)
        L_0x02b3:
            X.5Gj r6 = r0.A04
            java.lang.String r4 = r6.A0b
            if (r4 == 0) goto L_0x02dd
            java.lang.String r4 = r6.A0c
            if (r4 == 0) goto L_0x02dd
            java.lang.String r4 = r6.A0f
            if (r4 == 0) goto L_0x02dd
            java.lang.String r4 = r6.A0h
            if (r4 == 0) goto L_0x02dd
            com.instagram.common.typedurl.ImageUrl r4 = r6.A0E
            if (r4 == 0) goto L_0x02dd
            X.0Tu r4 = X.0Tu.A05
            r6 = 36330260773487143(0x81122e00004227, double:3.038741431146779E-306)
            boolean r4 = X.182.A06(r4, r3, r6)
            if (r4 == 0) goto L_0x02dd
            r4 = 2131968669(0x7f13429d, float:1.957424E38)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r4)
        L_0x02dd:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            boolean r18 = r0.A0F()
            r19 = r10 ^ 1
            X.GRh r23 = new X.GRh
            r14 = r23
            r20 = r19
            r14.<init>(r15, r16, r17, r18, r19, r20)
            goto L_0x0117
        L_0x02f2:
            if (r4 != 0) goto L_0x02ac
            r16 = r13
            goto L_0x02b3
        L_0x02f7:
            r4 = 0
            goto L_0x029f
        L_0x02f9:
            r6 = 0
            goto L_0x0295
        L_0x02fb:
            r35 = 0
            goto L_0x010b
        L_0x02ff:
            X.5Gj r4 = r0.A04
            java.lang.String r4 = r4.A0r
            if (r4 == 0) goto L_0x030c
            X.GKw r5 = new X.GKw
            r5.<init>(r4)
            goto L_0x00fd
        L_0x030c:
            r5 = 0
            goto L_0x00fd
        L_0x030f:
            r6 = r13
            goto L_0x00ce
        L_0x0312:
            boolean r2 = r0.A0G()
            if (r2 == 0) goto L_0x0341
            r6 = 2131238293(0x7f081d95, float:1.809286E38)
        L_0x031b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            if (r2 == 0) goto L_0x039e
            int r5 = r2.intValue()
            int r6 = r0.A00
            r2 = 159(0x9f, float:2.23E-43)
            if (r6 == r2) goto L_0x032f
            r2 = 1519(0x5ef, float:2.129E-42)
            if (r6 != r2) goto L_0x03ea
        L_0x032f:
            r2 = 2130970214(0x7f040666, float:1.7549132E38)
        L_0x0332:
            int r2 = X.2Yu.A0H(r8, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            X.GRe r12 = new X.GRe
            r12.<init>(r5, r2)
            goto L_0x00ed
        L_0x0341:
            int r5 = r0.A00
            r2 = 159(0x9f, float:2.23E-43)
            if (r5 == r2) goto L_0x03f9
            r2 = 459(0x1cb, float:6.43E-43)
            if (r5 == r2) goto L_0x03f4
            r2 = 504(0x1f8, float:7.06E-43)
            if (r5 == r2) goto L_0x03f9
            r2 = 1519(0x5ef, float:2.129E-42)
            if (r5 == r2) goto L_0x03f9
            r2 = 1520(0x5f0, float:2.13E-42)
            if (r5 == r2) goto L_0x03ef
            X.5Gm r5 = r0.A05
            if (r5 == 0) goto L_0x039e
            X.DgZ r2 = X.C46532DgZ.$redex_init_class
            int r5 = r5.ordinal()
            r2 = 5
            if (r5 == r2) goto L_0x0399
            r2 = 11
            if (r5 != r2) goto L_0x039e
            java.lang.String r2 = "coupon_offer_id"
            java.lang.String r2 = r0.A09(r2)
            if (r2 == 0) goto L_0x037a
            int r2 = r2.length()
            if (r2 == 0) goto L_0x037a
            r6 = 2131231467(0x7f0802eb, float:1.8079016E38)
            goto L_0x031b
        L_0x037a:
            X.DgL r5 = X.C46518DgL.A2M
            X.DgL r2 = r0.A03()
            if (r5 == r2) goto L_0x0395
            X.DgL r5 = X.C46518DgL.A09
            X.DgL r2 = r0.A03()
            if (r5 == r2) goto L_0x0395
            X.DgL r5 = X.C46518DgL.A2K
            X.DgL r2 = r0.A03()
            r6 = 2131238469(0x7f081e45, float:1.8093218E38)
            if (r5 != r2) goto L_0x031b
        L_0x0395:
            r6 = 2131238667(0x7f081f0b, float:1.809362E38)
            goto L_0x031b
        L_0x0399:
            r6 = 2131238947(0x7f082023, float:1.8094187E38)
            goto L_0x031b
        L_0x039e:
            X.5Gj r10 = r0.A04
            com.instagram.common.typedurl.ImageUrl r7 = r10.A01
            boolean r2 = X.C253833rU.A02(r7)
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x03e7
            if (r7 == 0) goto L_0x041e
            com.instagram.common.typedurl.ImageUrl r6 = r10.A0F
            if (r9 == 0) goto L_0x03e5
            X.BBV r5 = r10.A0C
        L_0x03b2:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            java.lang.Boolean r2 = r10.A0M
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x03e2
            r2 = 2130970273(0x7f0406a1, float:1.7549251E38)
            int r2 = X.2Yu.A0H(r8, r2)
            java.lang.Integer r32 = java.lang.Integer.valueOf(r2)
        L_0x03c7:
            if (r11 == 0) goto L_0x03cd
            X.5Gj r2 = r0.A04
            X.9J6 r14 = r2.A09
        L_0x03cd:
            X.GQz r12 = new X.GQz
            r27 = r12
            r28 = r14
            r29 = r5
            r30 = r7
            r31 = r6
            r33 = r4
            r34 = r4
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x00ed
        L_0x03e2:
            r32 = r13
            goto L_0x03c7
        L_0x03e5:
            r5 = r13
            goto L_0x03b2
        L_0x03e7:
            r5 = 2131238465(0x7f081e41, float:1.809321E38)
        L_0x03ea:
            r2 = 2130970273(0x7f0406a1, float:1.7549251E38)
            goto L_0x0332
        L_0x03ef:
            r6 = 2131238465(0x7f081e41, float:1.809321E38)
            goto L_0x031b
        L_0x03f4:
            r6 = 2131238199(0x7f081d37, float:1.809267E38)
            goto L_0x031b
        L_0x03f9:
            r6 = 2131238261(0x7f081d75, float:1.8092796E38)
            goto L_0x031b
        L_0x03fe:
            if (r1 == 0) goto L_0x0091
            if (r33 == 0) goto L_0x0091
            if (r35 != 0) goto L_0x0091
            goto L_0x0089
        L_0x0406:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x040c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0412:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0418:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x041e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DdI.A00(android.content.Context, com.instagram.common.session.UserSession, X.5Gi, boolean, boolean, boolean):X.GQo");
    }
}
