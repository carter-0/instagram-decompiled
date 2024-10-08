package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;

public abstract class I7A {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.Iy3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: X.Iy3} */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012a, code lost:
        if (r2 == X.AnonymousClass5XT.A00) goto L_0x012c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C286575Wy r28, androidx.compose.ui.Modifier r29, X.C49725F3p r30, X.F2T r31, X.C231002qi r32, X.C62320sa r33, X.C62320sa r34, X.C62320sa r35, X.0sL r36, X.AnonymousClass62P r37, int r38) {
        /*
            r5 = 0
            r13 = r29
            r15 = r32
            r7 = r37
            boolean r25 = X.C51973G9u.A1b(r7, r13, r15)
            r4 = 3
            r32 = r30
            r12 = r31
            r0 = r32
            int r3 = X.C51970G9q.A08(r4, r0, r12)
            r11 = r33
            r10 = r34
            r8 = r36
            X.C51974G9v.A1N(r8, r11, r10)
            r0 = 8
            r9 = r35
            X.0qQ.A0B(r9, r0)
            r0 = -687929874(0xffffffffd6ff05ee, float:-1.40200466E14)
            r14 = r28
            r14.ExV(r0)
            r6 = r38
            r0 = r38 & 6
            if (r0 != 0) goto L_0x0162
            int r16 = X.G9t.A0O(r14, r7)
            r16 = r16 | r38
        L_0x003a:
            r0 = r38 & 48
            if (r0 != 0) goto L_0x0044
            int r0 = X.G9t.A0P(r14, r13)
            r16 = r16 | r0
        L_0x0044:
            r0 = r6 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x004e
            int r0 = X.G9t.A0Q(r14, r15)
            r16 = r16 | r0
        L_0x004e:
            r0 = r6 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x005a
            r0 = r32
            int r0 = X.G9t.A0R(r14, r0)
            r16 = r16 | r0
        L_0x005a:
            r0 = r6 & 24576(0x6000, float:3.4438E-41)
            r2 = 32768(0x8000, float:4.5918E-41)
            if (r0 != 0) goto L_0x006d
            boolean r1 = X.G9t.A1V(r14, r12, r6, r2)
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x006b
            r0 = 16384(0x4000, float:2.2959E-41)
        L_0x006b:
            r16 = r16 | r0
        L_0x006d:
            r0 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 & r38
            if (r0 != 0) goto L_0x0079
            int r0 = X.G9t.A0J(r14, r8)
            r16 = r16 | r0
        L_0x0079:
            r0 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 & r38
            if (r0 != 0) goto L_0x0085
            int r0 = X.G9t.A0K(r14, r11)
            r16 = r16 | r0
        L_0x0085:
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 & r38
            if (r0 != 0) goto L_0x0091
            int r0 = X.G9t.A0L(r14, r10)
            r16 = r16 | r0
        L_0x0091:
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 & r38
            if (r0 != 0) goto L_0x009d
            int r0 = X.G9t.A0M(r14, r9)
            r16 = r16 | r0
        L_0x009d:
            r1 = 38347923(0x2492493, float:1.4777644E-37)
            r1 = r1 & r16
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r0) goto L_0x00d1
            boolean r0 = r14.Bwn()
            if (r0 == 0) goto L_0x00d1
            r14.Evl()
        L_0x00b0:
            X.5Xd r0 = r14.ASQ()
            if (r0 == 0) goto L_0x00d0
            X.JBn r14 = new X.JBn
            r23 = r15
            r24 = r6
            r21 = r11
            r22 = r10
            r19 = r9
            r20 = r8
            r17 = r7
            r18 = r13
            r15 = r12
            r16 = r32
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0.A06 = r14
        L_0x00d0:
            return
        L_0x00d1:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00df
            r1 = -474139226(0xffffffffe3bd35a6, float:-6.980601E21)
            java.lang.String r0 = "com.instagram.newsfeed.followrequests.ui.compose.LoadedFollowRequests (FollowRequestsCompose.kt:59)"
            X.0fL.A01(r1, r0)
        L_0x00df:
            androidx.compose.foundation.lazy.LazyListState r1 = X.C305066Gi.A00(r14, r5, r5, r5, r4)
            r0 = -1775357397(0xffffffff962e322b, float:-1.4071438E-25)
            r14.ExS(r0)
            r0 = r16 & 14
            boolean r4 = X.AnonymousClass7TF.A1S(r0, r3)
            boolean r0 = X.C51973G9u.A1J(r16)
            r4 = r4 | r0
            boolean r0 = X.C51973G9u.A1K(r16)
            r4 = r4 | r0
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r16
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r3 == r0) goto L_0x010c
            r0 = r16 & r2
            if (r0 == 0) goto L_0x0160
            boolean r0 = r14.AGw(r12)
            if (r0 == 0) goto L_0x0160
        L_0x010c:
            r0 = 1
        L_0x010d:
            r4 = r4 | r0
            boolean r0 = X.C51974G9v.A1T(r16)
            r4 = r4 | r0
            boolean r0 = X.C51974G9v.A1V(r16)
            r4 = r4 | r0
            boolean r0 = X.C51973G9u.A1L(r16)
            r4 = r4 | r0
            boolean r0 = X.C51972G9s.A1N(r16)
            r4 = r4 | r0
            java.lang.Object r2 = r14.ECw()
            if (r4 != 0) goto L_0x012c
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r2 != r0) goto L_0x0146
        L_0x012c:
            X.Iy3 r2 = new X.Iy3
            r26 = r2
            r27 = r5
            r28 = r12
            r29 = r8
            r30 = r7
            r31 = r9
            r33 = r10
            r34 = r11
            r35 = r15
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r14.FLL(r2)
        L_0x0146:
            X.0sP r2 = (X.0sP) r2
            X.C51965G9l.A1X(r14, r5)
            int r0 = r16 >> 3
            r0 = r0 & 14
            A01(r1, r14, r13, r2, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00b0
            r0 = 1676535856(0x63ede830, float:8.7772184E21)
            X.0fL.A00(r0)
            goto L_0x00b0
        L_0x0160:
            r0 = 0
            goto L_0x010d
        L_0x0162:
            r16 = r6
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7A.A04(X.5Wy, androidx.compose.ui.Modifier, X.F3p, X.F2T, X.2qi, X.0sa, X.0sa, X.0sa, X.0sL, X.62P, int):void");
    }

    public static final C46519DgM A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return C46519DgM.ADMIN;
            case 1:
                return C46519DgM.FOLLOW;
            case 2:
                return C46519DgM.FOLLOW_BACK;
            case 3:
                return C46519DgM.FOLLOWING;
            case 4:
                return C46519DgM.JOIN;
            case 5:
            case 6:
                return C46519DgM.LOADING;
            case 7:
                return C46519DgM.REQUESTED;
            case 8:
                return C46519DgM.UNBLOCK;
            default:
                return C46519DgM.UNKNOWN;
        }
    }

    public static final void A01(LazyListState lazyListState, C286575Wy r13, Modifier modifier, 0sP r15, int i) {
        int i2;
        C286575Wy r5 = r13;
        r13.ExV(820032622);
        int i3 = i;
        Modifier modifier2 = modifier;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r13, modifier) | i;
        } else {
            i2 = i3;
        }
        LazyListState lazyListState2 = lazyListState;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r13, lazyListState);
        }
        0sP r7 = r15;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r13, r15);
        }
        if ((i2 & 147) != 146 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1118789937, "com.instagram.newsfeed.followrequests.ui.compose.FollowRequestsLazyColumn (FollowRequestsCompose.kt:178)");
            }
            C52384GQj.A00(lazyListState, r13, 23598336, (i2 >> 3) & 14);
            AnonymousClass6HY.A03(new C304826Fj(0.0f, 0.0f, 0.0f, 36.0f), lazyListState2, r5, modifier2, r7, 12583296 | (i2 & 14) | (i2 & 112) | ((i2 << 18) & 234881024), 120, true);
            if (0fL.A02()) {
                0fL.A00(84804893);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59135J7r(i3, 3, modifier, lazyListState2, r15);
        }
    }

    public static final void A02(C286575Wy r2, int i) {
        r2.ExV(414805140);
        if (i != 0 || !r2.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(127304758, "com.instagram.newsfeed.followrequests.ui.compose.LoadMoreSpinner (FollowRequestsCompose.kt:260)");
            }
            GQD.A01(r2, C287195Zj.A03(C51969G9p.A0U()));
            if (0fL.A02()) {
                0fL.A00(846721786);
            }
        } else {
            r2.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            JGA.A01(ASQ, i, 0);
        }
    }

    public static final void A03(C286575Wy r8, int i) {
        C286575Wy r3 = r8;
        r8.ExV(-856571330);
        if (i != 0 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-807594545, "com.instagram.newsfeed.followrequests.ui.compose.PrivateToPublicHeader (FollowRequestsCompose.kt:265)");
            }
            String A00 = C288035bG.A00(r8, 2131968326);
            AnonymousClass5ZZ.A0S(r3, C287195Zj.A09(Modifier.A00, 28.0f, 12.0f), C51966G9m.A0b(r8), A00, C51966G9m.A0M(r8));
            if (0fL.A02()) {
                0fL.A00(1493484544);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            JGA.A01(ASQ, i, 1);
        }
    }

    public static final void A05(C286575Wy r26, C49725F3p f3p, JPS jps, F2T f2t, C231002qi r30, C62320sa r31, C62320sa r32, C62320sa r33, 0sL r34, int i) {
        int i2;
        C286575Wy r1 = r26;
        r1.ExV(-1145755880);
        int i3 = i;
        JPS jps2 = jps;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r1, jps2) | i;
        } else {
            i2 = i3;
        }
        C49725F3p f3p2 = f3p;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r1, f3p2);
        }
        C62320sa r15 = r31;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r1, r15);
        }
        F2T f2t2 = f2t;
        if ((i3 & 3072) == 0) {
            int i4 = 1024;
            if (C51972G9s.A1V(r1, f2t2, i3 & 4096)) {
                i4 = C249703kE.FLAG_MOVED;
            }
            i2 |= i4;
        }
        0sL r6 = r34;
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r1, r6);
        }
        C62320sa r8 = r32;
        if ((196608 & i) == 0) {
            i2 |= G9t.A0J(r1, r8);
        }
        C62320sa r7 = r33;
        if ((1572864 & i) == 0) {
            i2 |= G9t.A0K(r1, r7);
        }
        int i5 = 12582912 & i;
        C231002qi r35 = r30;
        if (i5 == 0) {
            i2 |= G9t.A0V(r1, r35);
        }
        if ((4793491 & i2) != 4793490 || !r1.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-908172166, "com.instagram.newsfeed.followrequests.ui.compose.FollowRequestItemContent (FollowRequestsCompose.kt:88)");
            }
            if (C47261Dtp.A00(0, jps2)) {
                r1.ExS(240660219);
                C47261Dtp dtp = (C47261Dtp) jps2;
                C53329GmF gmF = (C53329GmF) dtp.A01;
                Object A0m = C51967G9n.A0m(r1, -1931898409);
                if (A0m == AnonymousClass5XT.A00) {
                    A0m = new C49491EwW(f3p2, gmF);
                    r1.FLL(A0m);
                }
                C51965G9l.A1X(r1, false);
                String str = gmF.A07;
                String str2 = gmF.A06;
                String str3 = gmF.A08;
                String str4 = gmF.A0A;
                boolean z = gmF.A0C;
                boolean z2 = gmF.A0D;
                boolean z3 = gmF.A0E;
                C56453Hyl.A00(r1, (C49491EwW) A0m, gmF.A04, str, str2, str3, str4, dtp.BK1(), AnonymousClass5PI.A01(r1, new JG2(39, f3p2, gmF), -1340421556), 805306368, 6, z, z2, z3);
            } else if (jps2 instanceof C53550GqL) {
                r1.ExS(-1931869951);
                C53550GqL gqL = (C53550GqL) jps2;
                C55064HbZ.A00(C288035bG.A00(r1, gqL.A01), C288035bG.A00(r1, gqL.A00), r1, 0);
            } else if (C47261Dtp.A00(1, jps2)) {
                r1.ExS(-1931863373);
                A06(r1, (Integer) ((C47261Dtp) jps2).A01, r15, (i2 >> 3) & 112);
            } else if (jps2 instanceof C50588Fex) {
                r1.ExS(-1931858640);
                A03(r1, 0);
            } else if (C47261Dtp.A00(3, jps2)) {
                r1.ExS(242031845);
                C47261Dtp dtp2 = (C47261Dtp) jps2;
                C53324GmA gmA = (C53324GmA) dtp2.A01;
                Object A0m2 = C51967G9n.A0m(r1, -1931854334);
                Object obj = AnonymousClass5XT.A00;
                if (A0m2 == obj) {
                    A0m2 = new C50583Fes(f2t2, gmA, r6);
                    r1.FLL(A0m2);
                }
                MVE mve = (MVE) A0m2;
                C286565Wx A0H = C51965G9l.A0H(r1, false);
                String str5 = gmA.A06;
                String str6 = gmA.A05;
                String str7 = gmA.A07;
                String str8 = gmA.A08;
                String str9 = gmA.A04;
                String str10 = gmA.A03;
                boolean z4 = gmA.A09;
                boolean z5 = gmA.A0A;
                boolean z6 = gmA.A0B;
                boolean z7 = gmA.A0C;
                C46519DgM A00 = A00(gmA.A02);
                Object A0m3 = C51967G9n.A0m(r1, -1931828676);
                if (A0m3 == obj) {
                    A0m3 = new MJ7(17, f2t2, gmA);
                    r1.FLL(A0m3);
                }
                boolean z8 = z4;
                boolean z9 = z5;
                boolean z10 = z6;
                boolean z11 = z7;
                C286575Wy r16 = r1;
                MVE mve2 = mve;
                String str11 = str5;
                String str12 = str6;
                GS4.A01(r16, A00, mve2, str11, str12, str7, str8, str9, str10, dtp2.BK1(), C51965G9l.A0y(A0H, A0m3, false), 0, 3456, z8, z9, z10, z11);
            } else if (jps2 instanceof C50590Fez) {
                r1.ExS(-1931819406);
                GS4.A00(r1, 0);
            } else if (jps2 instanceof C50591Ff0) {
                r1.ExS(-1931816295);
                A07(r8, r1, (i2 >> 15) & 14);
            } else if (C47261Dtp.A00(2, jps2)) {
                r1.ExS(-1931812375);
                C231002qi r9 = r35;
                I30.A01(r1, r9, (AnonymousClass4UC) ((C47261Dtp) jps2).A01, (i2 >> 18) & 112);
            } else if (jps2 instanceof C50587Few) {
                r1.ExS(-1931806166);
                A02(r1, 0);
            } else if (C53551GqM.A00(0, jps2)) {
                r1.ExS(243642729);
                String A002 = C288035bG.A00(r1, 2131974105);
                int i6 = ((C53551GqM) jps2).A01;
                String A02 = C288035bG.A02(r1, AnonymousClass7TF.A1b(i6), R.plurals.spam_follow_requests_subtitle, i6);
                C286575Wy r162 = r1;
                C52636GaA.A07(r162, C287635aW.A05(Modifier.A00, (C287625aV) null, (String) null, r7, true), C287975bA.A00(r1, R.drawable.instagram_warning_pano_outline_24, 0), C57124IPn.A00, A002, A02, 130764);
            } else {
                r1.ExS(-1931786915);
            }
            if (C51970G9q.A1a(r1, false)) {
                0fL.A00(-1344067625);
            }
        } else {
            r1.Evl();
        }
        C286625Xd ASQ = r1.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JBG(f3p2, jps2, f2t2, r35, r15, r8, r6, r7, i3, 3);
        }
    }

    public static final void A06(C286575Wy r5, Integer num, C62320sa r7, int i) {
        int i2;
        String A01;
        r5.ExV(-1645070522);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r5, num) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r5, r7);
        }
        if ((i2 & 19) != 18 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1290513258, "com.instagram.newsfeed.followrequests.ui.compose.FollowRequestsViewAllCta (FollowRequestsCompose.kt:252)");
            }
            r5.ExS(1928479146);
            if (num == null) {
                A01 = null;
            } else {
                A01 = C288035bG.A01(r5, AnonymousClass7TF.A1b(num.intValue()), 2131972980);
            }
            C286565Wx A0H = C51965G9l.A0H(r5, false);
            r5.ExS(1928478884);
            if (A01 == null) {
                A01 = C288035bG.A00(r5, 2131972971);
            }
            C286565Wx.A0L(A0H, false);
            A08(r7, A01, r5, i2 & 112);
            if (0fL.A02()) {
                0fL.A00(1909129698);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, r7, num, i, 27);
        }
    }

    public static final void A07(C62320sa r3, C286575Wy r4, int i) {
        int i2;
        r4.ExV(-1485400205);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r4, r3) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1505657578, "com.instagram.newsfeed.followrequests.ui.compose.SuggestedUsersViewAllCta (FollowRequestsCompose.kt:275)");
            }
            A08(r3, C288035bG.A00(r4, 2131972979), r4, (i2 << 3) & 112);
            if (0fL.A02()) {
                0fL.A00(1588989796);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, r3, i, 28);
        }
    }

    public static final void A08(C62320sa r11, String str, C286575Wy r13, int i) {
        int i2;
        C286575Wy r4 = r13;
        r13.ExV(-1260532673);
        String str2 = str;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r13, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r13, r11);
        }
        if ((i2 & 19) != 18 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1588710995, "com.instagram.newsfeed.followrequests.ui.compose.ViewAllCta (FollowRequestsCompose.kt:280)");
            }
            int i3 = i2 & 14;
            AnonymousClass5ZZ.A0L(r4, C287205Zk.A01(C287215Zl.A04, C287195Zj.A03(C287205Zk.A09(C51966G9m.A0V(C287635aW.A05(Modifier.A00, (C287625aV) null, (String) null, r11, true)), 48.0f))), C51966G9m.A0c(r13), str2, i3, C51966G9m.A0N(r13));
            if (0fL.A02()) {
                0fL.A00(-1465803951);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            JGJ.A01(ASQ, r11, str, i, 12);
        }
    }
}
