package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikConstants;
import com.instagram.android.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.HuP  reason: case insensitive filesystem */
public abstract class C56196HuP {
    public static final void A01(C286575Wy r48, C66499MUd mUd, Integer num, String str, List list, Map map, C62320sa r54, C62320sa r55, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        int i5;
        int i6;
        String str2;
        String str3;
        boolean z4;
        boolean z5;
        String A00;
        boolean z6;
        String str4;
        String A002;
        boolean z7;
        boolean z8;
        Map map2 = map;
        0qQ.A0B(map2, 0);
        String str5 = str;
        0qQ.A0B(str5, 1);
        C62320sa r43 = r54;
        C62320sa r42 = r55;
        C51972G9s.A1F(r43, r42);
        C286575Wy r0 = r48;
        r0.ExV(-1842762188);
        int i7 = i3;
        if ((i3 & 6) == 0) {
            i5 = C41848B3p.A01(r0, map2) | i3;
        } else {
            i5 = i7;
        }
        if ((i3 & 48) == 0) {
            i5 |= G9t.A0P(r0, str5);
        }
        Integer num2 = num;
        if ((i7 & 384) == 0) {
            i5 |= G9t.A0Q(r0, num2);
        }
        int i8 = i;
        if ((i7 & 3072) == 0) {
            i5 |= G9t.A08(r0, i8);
        }
        boolean z9 = z;
        if ((i7 & 24576) == 0) {
            i5 |= G9t.A0c(r0, z9);
        }
        boolean z10 = z2;
        if ((196608 & i3) == 0) {
            i5 |= G9t.A0d(r0, z10);
        }
        boolean z11 = z3;
        if ((1572864 & i3) == 0) {
            i5 |= G9t.A0e(r0, z11);
        }
        int i9 = i2;
        if ((i3 & 12582912) == 0) {
            int i10 = 4194304;
            if (r0.AGs(i9)) {
                i10 = DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE;
            }
            i5 |= i10;
        }
        List list2 = list;
        if ((i3 & 100663296) == 0) {
            i5 |= G9t.A0M(r0, list2);
        }
        C66499MUd mUd2 = mUd;
        if ((i3 & 805306368) == 0) {
            int i11 = 268435456;
            if (G9t.A1V(r0, mUd2, i7, SN3.MAX_SIGNED_POWER_OF_TWO)) {
                i11 = 536870912;
            }
            i5 |= i11;
        }
        int i12 = i4;
        if ((i4 & 6) == 0) {
            i6 = i4 | C41848B3p.A01(r0, r43);
        } else {
            i6 = i12;
        }
        if ((i4 & 48) == 0) {
            i6 |= G9t.A0F(r0, r42);
        }
        if ((i5 & 306783379) == 306783378 && (i6 & 19) == 18 && r0.Bwn()) {
            r0.Evl();
        } else {
            if (0fL.A02()) {
                0fL.A01(1022215064, "com.instagram.aistudio.editor.AiAudienceSelectionScreen (AiAudienceSelectionScreen.kt:50)");
            }
            boolean A1W = AnonymousClass7TF.A1W(AnonymousClass7TF.A0Q(C51968G9o.A0h(r0)).A0N(), AnonymousClass05K.A01);
            C285245Qk r20 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r20);
            Modifier A02 = I28.A02(r0, A0T);
            C287265Zr r10 = C287215Zl.A02;
            C287325Zx r9 = C287275Zs.A07;
            AnonymousClass5RD A003 = C291495hO.A00(r9, r0, r10);
            int A004 = C287425a7.A00(r0);
            C286565Wx r1 = (C286565Wx) r0;
            AnonymousClass5RM A04 = C286565Wx.A04(r1);
            Modifier A01 = C287435a8.A01(r0, A02);
            C62320sa r14 = C287485aD.A00;
            C51973G9u.A0z(r0, r1, r14);
            0sL r13 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A003, A04, r13);
            0sL r12 = C287485aD.A02;
            if (r1.A0K || !C51972G9s.A1Q(r0, A004)) {
                C51971G9r.A13(r0, r12, A004);
            }
            0sL r11 = C287485aD.A04;
            C287595aO.A00(r0, A01, r11);
            AnonymousClass5RD A022 = C291495hO.A02(r9, r0, r10, 0);
            int A005 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(r1);
            Modifier A012 = C287435a8.A01(r0, r20);
            C51973G9u.A0z(r0, r1, r14);
            C287595aO.A00(r0, A022, r13);
            if (C51965G9l.A1Y(r0, r1, A042, A0w) || !C51972G9s.A1Q(r0, A005)) {
                C51971G9r.A13(r0, r12, A005);
            }
            C287595aO.A00(r0, A012, r11);
            C52636GaA.A0S(r0, C288035bG.A00(r0, 2131952709));
            Context A0N = C51970G9q.A0N(r0);
            Iterator A17 = C51968G9o.A17(r0, list2, -891589861);
            while (A17.hasNext()) {
                String A18 = AnonymousClass7TE.A18(A17);
                C62626Kix kix = (C62626Kix) map2.get(A18);
                if (kix != null) {
                    int ordinal = kix.ordinal();
                    if (ordinal == 8) {
                        r0.ExS(25680264);
                        String A006 = C288035bG.A00(r0, 2131952779);
                        r0.ExS(-1661731790);
                        if ((i5 & 1879048192) == 536870912 || ((i5 & SN3.MAX_SIGNED_POWER_OF_TWO) != 0 && r0.AGw(mUd2))) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        Object ECw = r0.ECw();
                        if (z5 || ECw == AnonymousClass5XT.A00) {
                            ECw = G9w.A0q(r0, mUd2, 17);
                        }
                        A00(r0, (Modifier) null, (AnonymousClass5RW) null, A18, str5, A006, (C62320sa) null, C51965G9l.A0z(r1, ECw), R.drawable.instagram_users_pano_filled_24, i5 & 112, 112);
                        C286565Wx.A0L(r1, false);
                    } else if (ordinal == 7) {
                        r0.ExS(26136615);
                        int i13 = R.drawable.instagram_users_pano_filled_24;
                        if (num != null) {
                            i13 = R.drawable.instagram_user_following_pano_filled_24;
                        }
                        r0.ExS(-1661717931);
                        if (num != null) {
                            Resources resources = A0N.getResources();
                            if (resources != null) {
                                str4 = resources.getQuantityString(R.plurals.x_people, num2.intValue(), new Object[]{num2});
                            } else {
                                str4 = null;
                            }
                            A00 = String.valueOf(str4);
                        } else {
                            A00 = C288035bG.A00(r0, 2131952779);
                        }
                        C286565Wx.A0L(r1, false);
                        r0.ExS(-1661704762);
                        if ((i5 & 1879048192) == 536870912 || ((i5 & SN3.MAX_SIGNED_POWER_OF_TWO) != 0 && r0.AGw(mUd2))) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        Object ECw2 = r0.ECw();
                        if (z6 || ECw2 == AnonymousClass5XT.A00) {
                            ECw2 = G9w.A0q(r0, mUd2, 18);
                        }
                        A00(r0, (Modifier) null, (AnonymousClass5RW) null, A18, str5, A00, (C62320sa) null, C51965G9l.A0z(r1, ECw2), i13, i5 & 112, 112);
                        C286565Wx.A0L(r1, false);
                    } else if (ordinal == 2) {
                        r0.ExS(26979784);
                        if (i > 0) {
                            r0.ExS(27154748);
                            A002 = C288035bG.A01(r0, AnonymousClass7TF.A1b(i8), 2131952707);
                            C286565Wx.A0L(r1, false);
                        } else {
                            r0.ExS(27341089);
                            A002 = C288035bG.A00(r0, 2131952706);
                            C286565Wx.A0L(r1, false);
                        }
                        AnonymousClass5RW A0N2 = C51965G9l.A0N(AnonymousClass5aQ.A00(r0).A0U);
                        Modifier A0C = C287205Zk.A0C(C287195Zj.A0B(r20, 0.0f, 12.0f, 12.0f, 12.0f), 44.0f);
                        long A0J = C51966G9m.A0J(r0);
                        AnonymousClass5ZQ r92 = AnonymousClass5ZN.A00;
                        Modifier A0B = C287195Zj.A0B(C304766Fd.A01(C304816Fi.A03(A0C, r92, 1.0f, A0J), r92, AnonymousClass5aQ.A00(r0).A0L), 12.0f, 0.0f, 0.0f, 0.0f);
                        r0.ExS(-1661667488);
                        if ((i5 & 1879048192) == 536870912 || ((i5 & SN3.MAX_SIGNED_POWER_OF_TWO) != 0 && r0.AGw(mUd2))) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        Object ECw3 = r0.ECw();
                        if (z7 || ECw3 == AnonymousClass5XT.A00) {
                            ECw3 = new C66308MMr(mUd2, 19);
                            r0.FLL(ECw3);
                        }
                        A00(r0, A0B, A0N2, A18, str5, A002, r43, C51965G9l.A0z(r1, ECw3), R.drawable.instagram_star_pano_filled_24, (i5 & 112) | (3670016 & (i6 << 18)), 0);
                        C286565Wx.A0L(r1, false);
                    } else if (ordinal == 5) {
                        r0.ExS(28098605);
                        r0.ExS(-1661656352);
                        if ((i5 & 1879048192) == 536870912 || ((i5 & SN3.MAX_SIGNED_POWER_OF_TWO) != 0 && r0.AGw(mUd2))) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        Object ECw4 = r0.ECw();
                        if (z8 || ECw4 == AnonymousClass5XT.A00) {
                            ECw4 = G9w.A0q(r0, mUd2, 20);
                        }
                        A00(r0, (Modifier) null, (AnonymousClass5RW) null, A18, str5, (String) null, (C62320sa) null, C51965G9l.A0z(r1, ECw4), R.drawable.instagram_user_circle_pano_filled_24, i5 & 112, 120);
                        C286565Wx.A0L(r1, false);
                    }
                }
                r0.ExS(28401041);
                C286565Wx.A0L(r1, false);
            }
            C286565Wx.A0L(r1, false);
            r0.ExS(-891497377);
            if (z || z2) {
                C286575Wy r30 = r0;
                C56618I4t.A02(r30, C287205Zk.A08(C287195Zj.A09(A0T, 0.0f, 16.0f), 6.0f), 0.0f, 6, 4, C51966G9m.A0C(r0));
                C52636GaA.A0S(r0, C288035bG.A00(r0, 2131952711));
                r0.ExS(-891487257);
                if (z) {
                    AnonymousClass2DO A007 = C287975bA.A00(r0, R.drawable.instagram_user_circle_pano_outline_24, 0);
                    String A008 = C288035bG.A00(r0, 2131952703);
                    r0.ExS(-891474869);
                    if ((i5 & 1879048192) == 536870912 || ((i5 & SN3.MAX_SIGNED_POWER_OF_TWO) != 0 && r0.AGw(mUd2))) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Object ECw5 = r0.ECw();
                    if (z4 || ECw5 == AnonymousClass5XT.A00) {
                        ECw5 = G9w.A0q(r0, mUd2, 21);
                    }
                    C52636GaA.A0M(r0, A007, C57125IPo.A00(r1, ECw5, z11), A008);
                }
                C286565Wx.A0L(r1, false);
                if (z2) {
                    Resources resources2 = A0N.getResources();
                    if (resources2 != null) {
                        str3 = resources2.getQuantityString(R.plurals.discoverability_selected_apps_text, i9, AnonymousClass7TF.A1b(i2 - 1));
                    } else {
                        str3 = null;
                    }
                    String valueOf = String.valueOf(str3);
                    boolean A1Y = C51974G9v.A1Y(r0, -891457906, i6);
                    Object ECw6 = r0.ECw();
                    if (A1Y || ECw6 == AnonymousClass5XT.A00) {
                        ECw6 = new C66301MMk(r42, 14);
                        r0.FLL(ECw6);
                    }
                    C52636GaA.A03(r0, C287635aW.A05(r20, (C287625aV) null, (String) null, C51965G9l.A0y(r1, ECw6, false), true), C287975bA.A00(r0, R.drawable.instagram_search_pano_outline_24, 0), new C52748Gc0(valueOf, true), C304346Dc.A00(r0, 2131952701));
                }
            }
            C286565Wx.A0L(r1, false);
            r0.ASN();
            if (A1W) {
                str2 = "public";
            } else {
                str2 = "private";
            }
            String A14 = C51968G9o.A14(r0, str2, 2131952708);
            C286575Wy r5 = r0;
            AnonymousClass5ZZ.A0Q(r5, C287195Zj.A0B(A0T, 16.0f, 10.0f, 16.0f, 10.0f), C51966G9m.A0b(r0), A14, C51966G9m.A0M(r0));
            if (C51967G9n.A1R(r0)) {
                0fL.A00(181616709);
            }
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JCO(mUd2, num2, str5, list2, map2, r43, r42, i8, i9, i7, i12, z9, z10, z11);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r28, androidx.compose.ui.Modifier r29, X.AnonymousClass5RW r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, X.C62320sa r34, X.0sP r35, int r36, int r37, int r38) {
        /*
            r9 = r34
            r16 = r29
            r20 = r30
            r26 = r33
            r0 = 2101957629(0x7d4953fd, float:1.6725682E37)
            r7 = r28
            r7.ExV(r0)
            r2 = r38
            r0 = r38 & 1
            r6 = r31
            r3 = r37
            if (r0 == 0) goto L_0x01c7
            r8 = r37 | 6
        L_0x001c:
            r0 = r38 & 2
            r13 = r32
            if (r0 == 0) goto L_0x01bc
            r8 = r8 | 48
        L_0x0024:
            r0 = r38 & 4
            r4 = r36
            if (r0 == 0) goto L_0x01b1
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x002c:
            r14 = r38 & 8
            if (r14 == 0) goto L_0x01a4
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x0032:
            r12 = r38 & 16
            if (r12 == 0) goto L_0x0197
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
        L_0x0038:
            r11 = r38 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r11 != 0) goto L_0x0048
            r0 = r0 & r37
            if (r0 != 0) goto L_0x0049
            r0 = r16
            int r0 = X.G9t.A0T(r7, r0)
        L_0x0048:
            r8 = r8 | r0
        L_0x0049:
            r10 = r38 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r10 != 0) goto L_0x0057
            r0 = r37 & r0
            if (r0 != 0) goto L_0x0058
            int r0 = X.G9t.A0K(r7, r9)
        L_0x0057:
            r8 = r8 | r0
        L_0x0058:
            r1 = r2 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r35
            if (r1 != 0) goto L_0x0068
            r0 = r37 & r0
            if (r0 != 0) goto L_0x0069
            int r0 = X.G9t.A0L(r7, r5)
        L_0x0068:
            r8 = r8 | r0
        L_0x0069:
            r1 = 4793491(0x492493, float:6.717112E-39)
            r1 = r1 & r8
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r0) goto L_0x009e
            boolean r0 = r7.Bwn()
            if (r0 == 0) goto L_0x009e
            r7.Evl()
        L_0x007b:
            X.5Xd r1 = r7.ASQ()
            if (r1 == 0) goto L_0x009d
            X.JAs r0 = new X.JAs
            r14 = r0
            r15 = r16
            r16 = r20
            r17 = r6
            r18 = r13
            r19 = r26
            r20 = r9
            r21 = r5
            r22 = r4
            r23 = r3
            r24 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1.A06 = r0
        L_0x009d:
            return
        L_0x009e:
            r0 = 0
            if (r14 == 0) goto L_0x00a3
            r26 = r0
        L_0x00a3:
            if (r12 == 0) goto L_0x00a7
            r20 = r0
        L_0x00a7:
            if (r11 == 0) goto L_0x00ab
            r16 = r0
        L_0x00ab:
            if (r10 == 0) goto L_0x00ae
            r9 = r0
        L_0x00ae:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00bc
            r1 = -853575035(0xffffffffcd1f7a85, float:-1.67225424E8)
            java.lang.String r0 = "com.instagram.aistudio.editor.AudienceListCell (AiAudienceSelectionScreen.kt:194)"
            X.0fL.A01(r1, r0)
        L_0x00bc:
            r0 = 258157051(0xf6329fb, float:1.1200049E-29)
            r7.ExS(r0)
            if (r16 != 0) goto L_0x0193
            X.5Qk r0 = androidx.compose.ui.Modifier.A00
            r14 = 1094713344(0x41400000, float:12.0)
            r12 = 0
            androidx.compose.ui.Modifier r1 = X.C287195Zj.A0B(r0, r12, r14, r14, r14)
            r0 = 1110441984(0x42300000, float:44.0)
            androidx.compose.ui.Modifier r0 = X.C287205Zk.A0C(r1, r0)
            X.5ZQ r15 = X.AnonymousClass5ZN.A00
            androidx.compose.ui.Modifier r11 = X.AnonymousClass6FZ.A01(r0, r15)
            r10 = 1056964608(0x3f000000, float:0.5)
            long r0 = X.C51966G9m.A0F(r7)
            androidx.compose.ui.Modifier r0 = X.C304816Fi.A03(r11, r15, r10, r0)
            androidx.compose.ui.Modifier r19 = X.C287195Zj.A0B(r0, r14, r12, r12, r12)
        L_0x00e7:
            r12 = r7
            X.5Wx r12 = (X.C286565Wx) r12
            r1 = 0
            X.C286565Wx.A0L(r12, r1)
            int r0 = r8 >> 6
            X.2DO r21 = X.C51966G9m.A0Y(r7, r0, r4)
            boolean r11 = X.0qQ.A0K(r13, r6)
            r0 = 258177643(0xf637a6b, float:1.1215541E-29)
            r7.ExS(r0)
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r10 = r8 & r0
            r15 = 1
            r0 = 8388608(0x800000, float:1.17549435E-38)
            boolean r0 = X.AnonymousClass7TF.A1S(r10, r0)
            r14 = r8 & 14
            boolean r10 = X.C51972G9s.A1I(r14)
            r10 = r10 | r0
            java.lang.Object r0 = r7.ECw()
            if (r10 != 0) goto L_0x011a
            java.lang.Object r10 = X.AnonymousClass5XT.A00
            if (r0 != r10) goto L_0x0124
        L_0x011a:
            r10 = 35
            X.Phj r0 = new X.Phj
            r0.<init>(r6, r5, r10)
            r7.FLL(r0)
        L_0x0124:
            X.0sa r10 = X.C51965G9l.A0y(r12, r0, r1)
            X.IPm r0 = new X.IPm
            r0.<init>(r11, r10)
            r18 = 0
            r10 = 258171867(0xf6363db, float:1.12111956E-29)
            r7.ExS(r10)
            r11 = 3670016(0x380000, float:5.142788E-39)
            r11 = r11 & r8
            r10 = 1048576(0x100000, float:1.469368E-39)
            if (r11 == r10) goto L_0x013d
            r15 = 0
        L_0x013d:
            java.lang.Object r11 = r7.ECw()
            if (r15 != 0) goto L_0x0147
            java.lang.Object r10 = X.AnonymousClass5XT.A00
            if (r11 != r10) goto L_0x0151
        L_0x0147:
            r10 = 15
            X.MMk r11 = new X.MMk
            r11.<init>(r9, r10)
            r7.FLL(r11)
        L_0x0151:
            X.0sa r29 = X.C51965G9l.A0y(r12, r11, r1)
            r33 = 57344(0xe000, float:8.0356E-41)
            int r10 = r8 << 3
            r33 = r33 & r10
            r33 = r33 | r14
            int r10 = r8 << 9
            r8 = 29360128(0x1c00000, float:7.052966E-38)
            r10 = r10 & r8
            r33 = r33 | r10
            r35 = 114190(0x1be0e, float:1.60014E-40)
            r36 = 0
            r22 = r18
            r23 = r18
            r25 = r6
            r27 = r18
            r28 = r18
            r30 = r1
            r31 = r1
            r32 = r1
            r34 = r1
            r38 = r1
            r17 = r7
            r24 = r0
            X.C52636GaA.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x007b
            r0 = 2011174436(0x77e01624, float:9.090028E33)
            X.0fL.A00(r0)
            goto L_0x007b
        L_0x0193:
            r19 = r16
            goto L_0x00e7
        L_0x0197:
            r0 = r3 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0038
            r0 = r20
            int r0 = X.G9t.A0S(r7, r0)
            r8 = r8 | r0
            goto L_0x0038
        L_0x01a4:
            r0 = r3 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0032
            r0 = r26
            int r0 = X.G9t.A0R(r7, r0)
            r8 = r8 | r0
            goto L_0x0032
        L_0x01b1:
            r0 = r3 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x002c
            int r0 = X.G9t.A07(r7, r4)
            r8 = r8 | r0
            goto L_0x002c
        L_0x01bc:
            r0 = r37 & 48
            if (r0 != 0) goto L_0x0024
            int r0 = X.G9t.A0P(r7, r13)
            r8 = r8 | r0
            goto L_0x0024
        L_0x01c7:
            r0 = r37 & 6
            if (r0 != 0) goto L_0x01d3
            int r8 = X.G9t.A0O(r7, r6)
            r8 = r8 | r37
            goto L_0x001c
        L_0x01d3:
            r8 = r3
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56196HuP.A00(X.5Wy, androidx.compose.ui.Modifier, X.5RW, java.lang.String, java.lang.String, java.lang.String, X.0sa, X.0sP, int, int, int):void");
    }
}
