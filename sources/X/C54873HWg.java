package X;

/* renamed from: X.HWg  reason: case insensitive filesystem */
public abstract class C54873HWg {
    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a8, code lost:
        if (X.0qQ.A0K(X.C51968G9o.A15(r7.A0A), r1) != false) goto L_0x00aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r55, X.C335867df r56, X.C333777a7 r57, com.instagram.common.typedurl.ImageUrl r58, com.instagram.user.model.FollowStatus r59, com.instagram.user.model.User r60, java.lang.Long r61, java.lang.String r62, X.0sP r63, X.0sP r64, X.0sK r65, int r66, int r67, int r68, boolean r69, boolean r70, boolean r71, boolean r72, boolean r73) {
        /*
            r21 = r64
            r20 = 1
            r19 = 2
            r51 = r65
            r52 = r63
            r53 = r62
            r3 = r19
            r2 = r53
            r1 = r52
            r0 = r51
            X.C51973G9u.A0t(r3, r2, r1, r0)
            r18 = 13
            r0 = -338597289(0xffffffffebd16a57, float:-5.0633534E26)
            r2 = r55
            r2.ExV(r0)
            r50 = r68
            r0 = r50
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x002b
            r21 = 0
        L_0x002b:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0039
            r1 = -1638981713(0xffffffff9e4f1faf, float:-1.0965041E-20)
            java.lang.String r0 = "com.instagram.comments.mvvm.view.compose.CommentAuthorHeader (CommentAuthorHeader.kt:67)"
            X.0fL.A01(r1, r0)
        L_0x0039:
            X.4bM r4 = X.C286955Yl.A00
            java.lang.Object r14 = r2.AJO(r4)
            X.0lg r14 = (X.0lg) r14
            r55 = r60
            java.lang.String r1 = r55.getId()
            boolean r11 = r55.isVerified()
            java.lang.String r10 = r55.getUsername()
            boolean r9 = r55.A2Q()
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0061
            r3 = 1928708765(0x72f5c29d, float:9.735565E30)
            java.lang.String r0 = "com.instagram.comments.mvvm.view.compose.linkifyCommentAuthorText (CommentAuthorHeader.kt:196)"
            X.0fL.A01(r3, r0)
        L_0x0061:
            r23 = 0
            X.6Bd r5 = X.C51969G9p.A0b()
            java.lang.Object r8 = r2.AJO(r4)
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            r7 = r57
            if (r57 == 0) goto L_0x00f3
            java.lang.String r6 = r7.A0I
            java.lang.String r4 = r7.A0D
            r0 = r20
            X.Dba.A0j(r0, r8, r6)
            X.1wP r3 = X.1wN.A00(r8)
            boolean r0 = X.C67741wV.A00
            if (r0 != 0) goto L_0x008e
            java.util.Map r0 = r3.A00
            java.lang.Object r0 = r0.get(r6)
            X.3OA r0 = (X.AnonymousClass3OA) r0
            if (r0 == 0) goto L_0x008e
            java.lang.String r4 = r0.A0U
        L_0x008e:
            boolean r0 = r7.A0h
            boolean r0 = X.C231122qu.A0X(r8, r6, r0)
            if (r0 == 0) goto L_0x00f3
            if (r4 == 0) goto L_0x00f3
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x00f3
            com.instagram.user.model.User r0 = r7.A0A
            java.lang.String r0 = X.C51968G9o.A15(r0)
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x00f3
        L_0x00aa:
            X.7df r1 = X.C335867df.RESTRICT_SENSITIVITY_SCREEN
            r0 = r56
            if (r0 != r1) goto L_0x00e3
            r0 = 1348907704(0x5066b2b8, float:1.54818888E10)
            r2.ExS(r0)
            r3 = 0
            long r31 = X.C51966G9m.A0M(r2)
            X.5Wx r6 = X.C51965G9l.A0H(r2, r3)
        L_0x00bf:
            X.4dT r25 = X.C268454dQ.A00
            X.5ZD r28 = X.AnonymousClass5ZD.A03
            r41 = 0
            X.5hl r1 = new X.5hl
            r1.<init>(r3)
            r30 = 65490(0xffd2, float:9.1771E-41)
            X.5ZB r0 = new X.5ZB
            r24 = r0
            r26 = r1
            r27 = r23
            r29 = r23
            r33 = r41
            r35 = r41
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r33, r35)
            int r1 = r5.A00(r0)
            goto L_0x00f5
        L_0x00e3:
            r0 = -1757600057(0xffffffff973d26c7, float:-6.111814E-25)
            r2.ExS(r0)
            r3 = 0
            long r31 = X.C51966G9m.A0H(r2)
            X.5Wx r6 = X.C51965G9l.A0H(r2, r3)
            goto L_0x00bf
        L_0x00f3:
            r4 = r10
            goto L_0x00aa
        L_0x00f5:
            java.lang.String r0 = X.C46476Dff.A01()     // Catch:{ all -> 0x0353 }
            r5.A01(r0, r4)     // Catch:{ all -> 0x0353 }
            r5.A09(r4)     // Catch:{ all -> 0x0353 }
            r5.A04(r1)
            java.lang.String r0 = " "
            if (r9 == 0) goto L_0x0345
            r5.A09(r0)
        L_0x0109:
            X.5Tq r24 = r5.A02()
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0119
            r0 = 544426805(0x20734b35, float:2.0607785E-19)
            X.0fL.A00(r0)
        L_0x0119:
            r0 = 353559099(0x1512e23b, float:2.966293E-26)
            java.lang.Object r5 = X.C51967G9n.A0m(r2, r0)
            java.lang.Object r9 = X.AnonymousClass5XT.A00
            r54 = r61
            if (r5 != r9) goto L_0x0133
            r1 = r52
            r0 = r54
            java.lang.Object r5 = r1.invoke(r0)
            java.lang.String r5 = (java.lang.String) r5
            r2.FLL(r5)
        L_0x0133:
            java.lang.String r5 = (java.lang.String) r5
            X.C286565Wx.A0L(r6, r3)
            X.5Qk r13 = androidx.compose.ui.Modifier.A00
            r12 = 1082130432(0x40800000, float:4.0)
            r4 = 0
            androidx.compose.ui.Modifier r8 = X.C287195Zj.A0B(r13, r4, r4, r4, r12)
            X.5Zp r10 = X.C287215Zl.A04
            X.5Zu r1 = X.C287275Zs.A01
            r17 = 48
            r0 = r17
            X.5RD r10 = X.C287395a4.A02(r1, r2, r10, r0)
            int r1 = X.C287425a7.A00(r2)
            X.5RM r0 = X.C286565Wx.A04(r6)
            androidx.compose.ui.Modifier r8 = X.C287435a8.A01(r2, r8)
            X.C51973G9u.A0y(r2, r6)
            X.C51971G9r.A12(r2, r10, r0)
            X.0sL r10 = X.C287485aD.A02
            boolean r0 = r6.A0K
            if (r0 != 0) goto L_0x016b
            boolean r0 = X.C51972G9s.A1Q(r2, r1)
            if (r0 != 0) goto L_0x016e
        L_0x016b:
            X.C51971G9r.A13(r2, r10, r1)
        L_0x016e:
            X.C51965G9l.A18(r2, r8)
            r45 = r69
            if (r69 == 0) goto L_0x033a
            r0 = 2003318329(0x77683639, float:4.709815E33)
            long r15 = X.C51970G9q.A0L(r2, r0)
        L_0x017c:
            X.C286565Wx.A0L(r6, r3)
            X.5Z4 r25 = X.C51966G9m.A0f(r2)
            X.5Z4 r0 = X.C51966G9m.A0c(r2)
            X.5ZB r0 = r0.A02
            long r0 = r0.A01
            r29 = r0
            X.5Z4 r0 = X.C51966G9m.A0c(r2)
            X.5ZB r0 = r0.A02
            long r10 = r0.A01
            r31 = 7
            X.GQa r1 = new X.GQa
            r26 = r1
            r27 = r29
            r29 = r10
            r26.<init>(r27, r29, r31)
            X.0sK r8 = X.C55318Hfl.A00
            X.GQb r0 = new X.GQb
            r0.<init>(r1, r8)
            java.lang.String r1 = "verified"
            X.0eP[] r8 = X.DbW.A1b(r1, r0)
            X.6G6 r1 = X.AnonymousClass6G6.A03
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>"
            X.0qQ.A0C(r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.collections.immutable.PersistentMap<K of kotlinx.collections.immutable.ExtensionsKt.mutate, V of kotlinx.collections.immutable.ExtensionsKt.mutate>"
            X.0qQ.A0C(r1, r0)
            X.XDy r0 = new X.XDy
            r0.<init>(r1)
            X.0Yt.A0H(r0, r8)
            X.6Du r31 = r0.AEL()
            r10 = 15
            X.PmT r11 = new X.PmT
            r8 = r51
            r1 = r55
            r0 = r53
            r11.<init>(r8, r1, r0, r10)
            r36 = 805306368(0x30000000, float:4.656613E-10)
            r37 = 6
            r38 = 102906(0x191fa, float:1.44202E-40)
            r26 = r23
            r27 = r23
            r28 = r23
            r29 = r11
            r30 = r23
            r32 = r3
            r33 = r3
            r34 = r20
            r35 = r19
            r39 = r15
            r43 = r3
            r44 = r3
            r22 = r2
            com.instagram.compose.core.ui.IgClickableTextKt.A01(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r43, r44)
            r0 = 2003348720(0x7768acf0, float:4.7192205E33)
            r2.ExS(r0)
            if (r5 == 0) goto L_0x021f
            androidx.compose.ui.Modifier r25 = X.C287195Zj.A0B(r13, r12, r4, r4, r4)
            long r34 = X.C51966G9m.A0M(r2)
            r28 = 5
            X.5Z4 r26 = X.C51966G9m.A0b(r2)
            r32 = 390(0x186, float:5.47E-43)
            r33 = 11128(0x2b78, float:1.5594E-41)
            r24 = r2
            r27 = r5
            r29 = r20
            r30 = r19
            r31 = r17
            X.AnonymousClass5ZZ.A0B(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
        L_0x021f:
            X.C286565Wx.A0L(r6, r3)
            if (r57 == 0) goto L_0x0337
            com.instagram.user.model.User r8 = r7.A0A
        L_0x0226:
            r35 = r59
            int r1 = r35.ordinal()
            r0 = 4
            if (r1 == r0) goto L_0x0333
            r0 = 3
            if (r1 == r0) goto L_0x032f
            X.DgM r1 = X.C46519DgM.UNKNOWN
        L_0x0234:
            r0 = 2003364829(0x7768ebdd, float:4.724206E33)
            java.lang.Object r0 = X.C51967G9n.A0m(r2, r0)
            if (r0 != r9) goto L_0x0241
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.G9t.A0o(r2, r1)
        L_0x0241:
            X.5Oz r5 = X.C51965G9l.A0J(r6, r0, r3)
            r0 = 2003367273(0x7768f569, float:4.7249624E33)
            java.lang.Object r4 = X.C51967G9n.A0m(r2, r0)
            if (r4 != r9) goto L_0x0259
            X.Ins r4 = new X.Ins
            r0 = r18
            r4.<init>(r0, r5, r1)
            X.5TX r4 = X.C51969G9p.A0R(r2, r4)
        L_0x0259:
            X.4gU r4 = (X.C270284gU) r4
            X.C286565Wx.A0L(r6, r3)
            r0 = 2003391497(0x77695409, float:4.7324594E33)
            r2.ExS(r0)
            r49 = r73
            if (r8 == 0) goto L_0x0270
            if (r73 != 0) goto L_0x0306
            boolean r0 = X.C51971G9r.A1X(r4)
            if (r0 != 0) goto L_0x0306
        L_0x0270:
            X.C286565Wx.A0L(r6, r3)
            r0 = 2003424029(0x7769d31d, float:4.7425276E33)
            r2.ExS(r0)
            r47 = r71
            if (r71 == 0) goto L_0x0283
            X.C54888HWv.A00(r2, r3)
            X.C54887HWu.A00(r2, r3)
        L_0x0283:
            X.C286565Wx.A0L(r6, r3)
            r46 = r70
            if (r70 == 0) goto L_0x02ff
            X.0Tu r4 = X.0Tu.A05
            r0 = 36321073838498880(0x8109d300012440, double:3.032931576467383E-306)
            boolean r0 = X.182.A06(r4, r14, r0)
            if (r0 == 0) goto L_0x02f2
            r0 = 1976851346(0x75d45b92, float:5.3839072E32)
            r2.ExS(r0)
            X.C54890HWx.A00(r2, r3)
        L_0x02a0:
            X.C286565Wx.A0L(r6, r3)
            r0 = 2003437173(0x776a0675, float:4.7465954E33)
            r2.ExS(r0)
            r48 = r72
            r34 = r58
            if (r72 == 0) goto L_0x02bd
            X.C54888HWv.A00(r2, r3)
            if (r58 != 0) goto L_0x02ef
            java.lang.String r0 = ""
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.DbS.A0V(r0)
        L_0x02ba:
            X.C54889HWw.A00(r2, r0, r3)
        L_0x02bd:
            boolean r0 = X.C51971G9r.A1S(r2, r6, r3)
            if (r0 == 0) goto L_0x02c9
            r0 = -638767745(0xffffffffd9ed2d7f, float:-8.3449491E15)
            X.0fL.A00(r0)
        L_0x02c9:
            X.5Xd r1 = r2.ASQ()
            if (r1 == 0) goto L_0x02ee
            X.JDD r0 = new X.JDD
            r43 = r67
            r42 = r66
            r31 = r0
            r32 = r56
            r33 = r7
            r36 = r55
            r37 = r54
            r38 = r53
            r39 = r52
            r40 = r21
            r41 = r51
            r44 = r50
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            r1.A06 = r0
        L_0x02ee:
            return
        L_0x02ef:
            r0 = r34
            goto L_0x02ba
        L_0x02f2:
            r0 = 1976905968(0x75d530f0, float:5.405038E32)
            r2.ExS(r0)
            X.C54888HWv.A00(r2, r3)
            X.C54891HWy.A00(r2, r3)
            goto L_0x02a0
        L_0x02ff:
            r0 = 1976971316(0x75d63034, float:5.4303184E32)
            r2.ExS(r0)
            goto L_0x02a0
        L_0x0306:
            X.DgM r0 = X.C46519DgM.FOLLOW
            if (r1 == r0) goto L_0x030e
            X.DgM r0 = X.C46519DgM.FOLLOWING
            if (r1 != r0) goto L_0x0270
        L_0x030e:
            X.C54888HWv.A00(r2, r3)
            java.lang.Object r9 = r5.getValue()
            X.DgM r9 = (X.C46519DgM) r9
            X.GSN r25 = X.GSN.LINK_BUTTON
            X.Iw5 r4 = new X.Iw5
            r1 = r21
            r0 = r17
            r4.<init>(r0, r5, r8, r1)
            r27 = 384(0x180, float:5.38E-43)
            r24 = r9
            r26 = r4
            r28 = r19
            X.GR2.A00(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0270
        L_0x032f:
            X.DgM r1 = X.C46519DgM.FOLLOW
            goto L_0x0234
        L_0x0333:
            X.DgM r1 = X.C46519DgM.FOLLOWING
            goto L_0x0234
        L_0x0337:
            r8 = 0
            goto L_0x0226
        L_0x033a:
            r0 = 2003319355(0x77683a3b, float:4.7101325E33)
            X.5Yw r0 = X.C51967G9n.A0a(r2, r0)
            long r15 = r0.A0t
            goto L_0x017c
        L_0x0345:
            if (r11 == 0) goto L_0x0109
            r5.A09(r0)
            java.lang.String r1 = "verified"
            java.lang.String r0 = "�"
            X.C52422GSa.A00(r5, r1, r0)
            goto L_0x0109
        L_0x0353:
            r0 = move-exception
            r5.A04(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54873HWg.A00(X.5Wy, X.7df, X.7a7, com.instagram.common.typedurl.ImageUrl, com.instagram.user.model.FollowStatus, com.instagram.user.model.User, java.lang.Long, java.lang.String, X.0sP, X.0sP, X.0sK, int, int, int, boolean, boolean, boolean, boolean, boolean):void");
    }
}
