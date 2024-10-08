package X;

/* renamed from: X.5wt  reason: invalid class name and case insensitive filesystem */
public abstract class C300305wt {
    /* JADX WARNING: type inference failed for: r7v14, types: [X.68E, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v16, types: [X.68E, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x02c4, code lost:
        if (r1.A01() == false) goto L_0x02c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x02d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass68G A00(X.C300185wg r64, com.instagram.common.session.UserSession r65, java.lang.String r66, int r67, int r68) {
        /*
            r2 = 0
            r6 = 1
            r3 = r64
            X.0qQ.A0B(r3, r6)
            r0 = r65
            X.2HN r1 = X.2HM.A00(r0)
            java.util.Locale r5 = X.AnonymousClass1Q2.A02()
            X.0eK r4 = r1.A1U
            java.lang.Object r4 = r4.get()
            X.0qQ.A07(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            X.5wu r10 = new X.5wu
            r10.<init>(r4)
            android.content.Context r13 = r3.A01
            com.facebook.msys.mci.AuthData r19 = X.C300325ww.A00(r0)
            java.lang.String r4 = r19.getFacebookUserID()
            if (r4 == 0) goto L_0x00eb
            com.facebook.msys.mci.AuthData r4 = X.C300325ww.A00(r0)
            java.lang.String r9 = r4.getFacebookUserID()
            if (r9 == 0) goto L_0x00e8
            java.lang.String r4 = "msys_database_"
            java.lang.String r7 = X.002.A0R(r4, r9)
            java.io.File r11 = r13.getDatabasePath(r7)
            boolean r4 = r11.exists()
            if (r4 == 0) goto L_0x0059
            java.lang.Object[] r8 = new java.lang.Object[]{r7}
            java.lang.String r7 = "IgMsysDatabaseHelper"
            java.lang.String r4 = "Deleted old database file: %s"
            X.0KC.A0O(r7, r4, r8)
            r11.delete()
        L_0x0059:
            java.lang.String r4 = "ig_msys_dual_send_database_"
            java.lang.String r7 = X.002.A0R(r4, r9)
            java.io.File r9 = r13.getDatabasePath(r7)
            boolean r4 = r9.exists()
            if (r4 == 0) goto L_0x00e8
            java.lang.Object[] r8 = new java.lang.Object[]{r7}
            java.lang.String r7 = "IgMsysDatabaseHelper"
            java.lang.String r4 = "Deleted old database file: %s"
            X.0KC.A0O(r7, r4, r8)
            r9.delete()
            X.0t1 r4 = X.0eE.A00(r0)
            com.instagram.user.model.User r4 = r4.A00()
            java.lang.Long r8 = r4.BST()
            java.lang.String r9 = X.C300285wr.A00()
            if (r8 == 0) goto L_0x00c3
            if (r9 == 0) goto L_0x00c3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            java.lang.String r4 = "echo/AdvancedCrypto/"
            r7.append(r4)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.io.File r4 = new java.io.File
            r4.<init>(r7)
            X.C300285wr.A01(r4)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            java.lang.String r4 = "media_bank/AdvancedCrypto/"
            r7.append(r4)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.io.File r4 = new java.io.File
            r4.<init>(r7)
            X.C300285wr.A01(r4)
        L_0x00c3:
            com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession r8 = X.1y0.A00(r0)
            r4 = 4
            X.Plm r7 = new X.Plm
            r7.<init>(r0, r4)
            java.lang.Class<X.O7w> r4 = X.C70471O7w.class
            java.lang.Object r4 = r8.A01(r4, r7)
            X.O7w r4 = (X.C70471O7w) r4
            X.0wc r8 = r4.A00
            java.lang.String r7 = "direct_armadillo_database_delete"
            X.0kJ r4 = r8.A00
            X.0Aj r7 = r8.A00(r4, r7)
            boolean r4 = r7.isSampled()
            if (r4 == 0) goto L_0x00e8
            r7.Cgf()
        L_0x00e8:
            X.C300335wx.A00()
        L_0x00eb:
            r4 = 34
            r65 = 0
            com.facebook.msys.mci.TraceLogger.addConfig(r4, r6, r6, r2)
            com.facebook.msys.mci.AuthData r4 = X.C300325ww.A00(r0)
            java.lang.String r7 = r4.getFacebookUserID()
            if (r7 != 0) goto L_0x00fe
            java.lang.String r7 = ""
        L_0x00fe:
            java.lang.String r31 = "ig_msys_database_"
            r4 = r31
            java.lang.String r21 = X.002.A0R(r4, r7)
            r4 = 0
            if (r67 != 0) goto L_0x010a
            r4 = 1
        L_0x010a:
            com.facebook.msys.mci.AccountSession r18 = X.C300345wy.A02(r0, r4)
            X.690 r35 = new X.690
            r35.<init>()
            X.691 r30 = new X.691
            r4 = r30
            r4.<init>(r5)
            java.lang.String r5 = "7572135699556019"
            X.5wn r29 = new X.5wn
            r4 = r29
            r4.<init>(r5)
            X.65w r16 = X.C3028365p.A00
            X.5wz r15 = X.C300345wy.A00(r1)
            r18.getClass()
            r16.getClass()
            X.2HR r4 = r1.A0p
            java.lang.Object r5 = r4.get()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r23 = r5.booleanValue()
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r6)
            java.lang.Object r4 = r4.get()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r22 = r4.booleanValue()
            X.692 r32 = new X.692
            r14 = r32
            r17 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r18 = 0
            r19 = 0
            java.lang.Boolean r60 = java.lang.Boolean.valueOf(r2)
            X.694 r28 = new X.694
            r2 = r28
            r2.<init>(r1)
            X.695 r3 = new X.695
            r3.<init>()
            X.5wn r27 = new X.5wn
            r2 = r27
            r2.<init>(r3)
            X.697 r38 = new X.697
            r38.<init>()
            java.util.List r3 = X.AnonymousClass698.A00(r0, r1)
            X.5wn r26 = new X.5wn
            r2 = r26
            r2.<init>(r3)
            X.0Tu r4 = X.0Tu.A05
            r2 = 36319785348964001(0x8108a7000b1ea1, double:3.032116730497195E-306)
            boolean r2 = X.182.A06(r4, r0, r2)
            if (r2 != 0) goto L_0x0328
            X.0sn r3 = X.0sn.A00
        L_0x018c:
            X.5wn r25 = new X.5wn
            r2 = r25
            r2.<init>(r3)
            r2 = 36319785348439706(0x8108a700031e9a, double:3.0321167301656286E-306)
            boolean r2 = X.182.A06(r4, r0, r2)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            X.5wn r24 = new X.5wn
            r2 = r24
            r2.<init>(r3)
            X.5wn r23 = new X.5wn
            r2 = r23
            r2.<init>(r10)
            long r2 = X.C64031Cc.A02()
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
            X.5wn r22 = new X.5wn
            r2 = r22
            r2.<init>(r3)
            X.699 r21 = new X.699
            r2 = r21
            r2.<init>(r1)
            X.69A r20 = new X.69A
            r3 = r68
            r2 = r20
            r2.<init>(r3)
            X.69B r33 = new X.69B
            r33.<init>()
            X.686 r15 = new X.686
            r15.<init>(r0)
            X.687 r14 = new X.687
            r14.<init>(r0)
            if (r67 != 0) goto L_0x01f0
            r2 = 36325965807760810(0x810e46001835aa, double:3.036025277527007E-306)
            boolean r2 = X.182.A06(r4, r0, r2)
            if (r2 != 0) goto L_0x01f0
            X.NBu r19 = new X.NBu
            r2 = r19
            r2.<init>(r0)
        L_0x01f0:
            r3 = r66
            if (r66 == 0) goto L_0x01fb
            X.5wn r18 = new X.5wn
            r2 = r18
            r2.<init>(r3)
        L_0x01fb:
            X.2FF r12 = X.AnonymousClass2FF.A0A()
            X.688 r2 = new X.688
            r2.<init>(r12)
            X.5wn r11 = new X.5wn
            r11.<init>(r2)
            X.689 r2 = new X.689
            r2.<init>(r0, r1)
            X.5wn r10 = new X.5wn
            r10.<init>(r2)
            X.68A r43 = new X.68A
            r43.<init>()
            X.68B r9 = new X.68B
            r9.<init>(r1)
            X.2HR r2 = r1.A0N
            java.lang.Object r2 = r2.A00()
            java.lang.Number r2 = (java.lang.Number) r2
            long r4 = r2.longValue()
            r16 = 0
            int r3 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            r2 = 0
            if (r3 <= 0) goto L_0x0231
            r2 = 1
        L_0x0231:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            X.5wn r6 = new X.5wn
            r6.<init>(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            X.5wn r5 = new X.5wn
            r5.<init>(r2)
            X.2HR r2 = r1.A0O
            java.lang.Object r2 = r2.A00()
            java.lang.Number r2 = (java.lang.Number) r2
            long r7 = r2.longValue()
            int r3 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            r2 = 0
            if (r3 <= 0) goto L_0x0255
            r2 = 1
        L_0x0255:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            X.5wn r4 = new X.5wn
            r4.<init>(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            X.5wn r3 = new X.5wn
            r3.<init>(r2)
            X.2HR r2 = r1.A1J
            java.lang.Object r7 = r2.get()
            X.5wn r2 = new X.5wn
            r2.<init>(r7)
            X.2HR r7 = r1.A1G
            java.lang.Object r7 = r7.get()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0325
            com.facebook.msys.mci.AuthData r0 = X.C300325ww.A00(r0)
            java.lang.String r7 = r0.getFacebookUserID()
            if (r7 != 0) goto L_0x028c
            java.lang.String r7 = ""
        L_0x028c:
            r0 = r31
            java.lang.String r8 = X.002.A0R(r0, r7)
            java.io.File r0 = r13.getDatabasePath(r8)
            java.io.File r0 = r0.getParentFile()
            if (r0 == 0) goto L_0x0325
            java.lang.String r7 = r0.getPath()
            X.Q7g r0 = new X.Q7g
            r0.<init>(r8, r7)
        L_0x02a5:
            X.2HR r7 = r1.A1F
            java.lang.Object r7 = r7.get()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r8 = r7.booleanValue()
            X.68E r7 = X.AnonymousClass68C.A00
            if (r7 != 0) goto L_0x02bc
            X.68D r7 = new X.68D
            r7.<init>()
            X.AnonymousClass68C.A00 = r7
        L_0x02bc:
            if (r8 != 0) goto L_0x02c6
            boolean r7 = r1.A01()
            r64 = 1
            if (r7 != 0) goto L_0x02c8
        L_0x02c6:
            r64 = 0
        L_0x02c8:
            X.68E r7 = X.AnonymousClass68C.A00
            if (r7 != 0) goto L_0x02d3
            X.68D r7 = new X.68D
            r7.<init>()
            X.AnonymousClass68C.A00 = r7
        L_0x02d3:
            if (r8 == 0) goto L_0x02d7
            r65 = 1
        L_0x02d7:
            X.68F r31 = new X.68F
            r36 = r27
            r37 = r23
            r39 = r21
            r40 = r25
            r41 = r6
            r42 = r4
            r44 = r15
            r45 = r28
            r46 = r14
            r47 = r2
            r48 = r9
            r49 = r5
            r50 = r3
            r51 = r30
            r52 = r11
            r53 = r19
            r54 = r10
            r55 = r26
            r56 = r20
            r57 = r29
            r58 = r22
            r59 = r24
            r61 = r60
            r62 = r60
            r63 = r60
            r34 = r18
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63)
            boolean r63 = r1.A02()
            X.2HR r1 = r1.A0M
            r1.get()
            X.68G r59 = new X.68G
            r60 = r0
            r61 = r31
            r62 = r12
            r59.<init>(r60, r61, r62, r63, r64, r65)
            return r59
        L_0x0325:
            r0 = 0
            goto L_0x02a5
        L_0x0328:
            java.util.List r2 = X.AnonymousClass698.A00(r0, r1)
            java.util.Set r5 = X.00k.A0j(r2)
            r2 = 36319785348832928(0x8108a700091ea0, double:3.032116730414304E-306)
            boolean r2 = X.182.A06(r4, r0, r2)
            r11 = 2
            if (r2 != 0) goto L_0x0365
            r2 = 16
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            r2 = 27
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r2 = 44
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r2 = 106(0x6a, float:1.49E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r2 = 202(0xca, float:2.83E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer[] r2 = new java.lang.Integer[]{r9, r8, r7, r3, r2}
            java.util.Set r2 = X.0sc.A07(r2)
            r5.removeAll(r2)
        L_0x0365:
            r2 = 36319785348308632(0x8108a700011e98, double:3.032116730082737E-306)
            boolean r2 = X.182.A06(r4, r0, r2)
            if (r2 != 0) goto L_0x0377
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r5.remove(r2)
        L_0x0377:
            r2 = 36319785348505243(0x8108a700041e9b, double:3.0321167302070744E-306)
            boolean r2 = X.182.A06(r4, r0, r2)
            if (r2 != 0) goto L_0x0389
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r5.remove(r2)
        L_0x0389:
            r2 = 36319785348570780(0x8108a700051e9c, double:3.03211673024852E-306)
            boolean r2 = X.182.A06(r4, r0, r2)
            if (r2 != 0) goto L_0x039d
            r2 = 95
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.remove(r2)
        L_0x039d:
            r2 = 36319785348636317(0x8108a700061e9d, double:3.032116730289966E-306)
            boolean r2 = X.182.A06(r4, r0, r2)
            if (r2 != 0) goto L_0x03b0
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.remove(r2)
        L_0x03b0:
            r2 = 36319785348243095(0x8108a700001e97, double:3.032116730041291E-306)
            boolean r2 = X.182.A06(r4, r0, r2)
            if (r2 != 0) goto L_0x03cd
            r2 = 108(0x6c, float:1.51E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.remove(r2)
            r2 = 198(0xc6, float:2.77E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.remove(r2)
        L_0x03cd:
            r2 = 36319785348701854(0x8108a700071e9e, double:3.032116730331412E-306)
            boolean r2 = X.182.A06(r4, r0, r2)
            if (r2 != 0) goto L_0x03e1
            r2 = 28
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.remove(r2)
        L_0x03e1:
            r2 = 36319785348374169(0x8108a700021e99, double:3.032116730124183E-306)
            boolean r2 = X.182.A06(r4, r0, r2)
            if (r2 != 0) goto L_0x03f5
            r2 = 89
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.remove(r2)
        L_0x03f5:
            r2 = 36319785348767391(0x8108a700081e9f, double:3.032116730372858E-306)
            boolean r2 = X.182.A06(r4, r0, r2)
            if (r2 != 0) goto L_0x0409
            r2 = 197(0xc5, float:2.76E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.remove(r2)
        L_0x0409:
            java.util.List r3 = X.00k.A0a(r5)
            goto L_0x018c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C300305wt.A00(X.5wg, com.instagram.common.session.UserSession, java.lang.String, int, int):X.68G");
    }
}
