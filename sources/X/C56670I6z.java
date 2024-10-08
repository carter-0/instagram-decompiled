package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.instagram.android.R;
import com.instagram.api.schemas.GraphGuardianContent;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.compose.core.ui.IgClickableTextKt;
import com.instagram.user.model.FollowStatus;

/* renamed from: X.I6z  reason: case insensitive filesystem */
public abstract class C56670I6z {
    public static final void A02(C286575Wy r19, Modifier modifier, GSY gsy, C62320sa r22, int i, int i2) {
        int i3;
        AnonymousClass2DN A00;
        Modifier modifier2 = modifier;
        C286575Wy r9 = r19;
        r9.ExV(-1400876314);
        int i4 = i2;
        int i5 = i;
        GSY gsy2 = gsy;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = G9t.A0O(r9, gsy2) | i;
        } else {
            i3 = i5;
        }
        C62320sa r15 = r22;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= G9t.A0F(r9, r15);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= G9t.A0Q(r9, modifier2);
        }
        if ((i3 & 731) != 146 || !r9.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-655931772, "com.instagram.user.userlist.ui.CTA (LikesListComposeFragment.kt:565)");
            }
            Alignment alignment = C287215Zl.A06;
            C285245Qk r7 = Modifier.A00;
            AnonymousClass5RD A002 = C287675aa.A00(alignment, false);
            int A003 = C287425a7.A00(r9);
            C286565Wx r5 = (C286565Wx) r9;
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r9, r7);
            C51973G9u.A0y(r9, r5);
            C51971G9r.A12(r9, A002, A04);
            0sL r1 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r9, A003)) {
                C51971G9r.A13(r9, r1, A003);
            }
            C51965G9l.A18(r9, A01);
            String str = gsy2.A02;
            ImageUrl imageUrl = (ImageUrl) gsy2.A01;
            r9.ExS(-571059358);
            AnonymousClass5RW r11 = null;
            if (imageUrl == null) {
                A00 = null;
            } else {
                A00 = 1zC.A00(r9, imageUrl);
            }
            C286565Wx.A0L(r5, false);
            String str2 = gsy2.A03;
            Number number = (Number) gsy2.A00;
            if (number != null) {
                r11 = C51967G9n.A0I((long) number.intValue());
            }
            C54893HXb.A00(r9, modifier2, r11, A00, str, str2, r15, (i3 & 112) | 4096 | (i3 & 896), 32, 0);
            if (C51967G9n.A1R(r9)) {
                0fL.A00(-476397294);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i5, i4, 39, gsy2, r15, modifier2);
        }
    }

    public static final void A00(C286575Wy r6, int i) {
        r6.ExV(1814811677);
        if (i != 0 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1249080324, "com.instagram.user.userlist.ui.LoadingScreen (LikesListComposeFragment.kt:248)");
            }
            C285245Qk r5 = Modifier.A00;
            AnonymousClass5RD A0Y = C51970G9q.A0Y();
            int A00 = C287425a7.A00(r6);
            C286565Wx r3 = (C286565Wx) r6;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r6, r5);
            C51973G9u.A0y(r6, r3);
            C51971G9r.A12(r6, A0Y, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r6, A00)) {
                C51971G9r.A13(r6, r1, A00);
            }
            GQD.A03(r6, r5, A01);
            if (0fL.A02()) {
                0fL.A00(-1376414839);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGA.A01(ASQ, i, 16);
        }
    }

    public static final void A01(C286575Wy r10, int i, int i2) {
        int i3;
        r10.ExV(-424666504);
        if ((i2 & 14) == 0) {
            i3 = G9t.A05(r10, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) != 2 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1901218237, "com.instagram.user.userlist.ui.LikesRow (LikesListComposeFragment.kt:429)");
            }
            C285245Qk r7 = Modifier.A00;
            Modifier A00 = AnonymousClass5R5.A00(C287195Zj.A0B(C51966G9m.A0T(r7), 16.0f, 16.0f, 16.0f, 0.0f), C59046J4f.A00, false);
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A04, r10, C287215Zl.A05, 6);
            int A002 = C287425a7.A00(r10);
            C286565Wx r6 = (C286565Wx) r10;
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r10, A00);
            C51973G9u.A0y(r10, r6);
            C51971G9r.A12(r10, A02, A04);
            0sL r1 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r10, A002)) {
                C51971G9r.A13(r10, r1, A002);
            }
            C51965G9l.A18(r10, A01);
            String A003 = C288035bG.A00(r10, 2131964947);
            C292205iZ r3 = C292185iX.A00;
            AnonymousClass5ZZ.A06(r10, r7.Ezh(new WithAlignmentLineElement(r3)), AnonymousClass5Z4.A00((C291805hu) null, (C289645dx) null, C51965G9l.A0S(r10), (C268454dQ) null, (AnonymousClass5ZD) null, (C291825hw) null, 0, 0, 0, 6291454, C51966G9m.A0H(r10), 0, 0, 0), A003);
            Resources A0B = C51975G9x.A0B(r10);
            Object A0m = C51967G9n.A0m(r10, -1470975251);
            if (A0m == AnonymousClass5XT.A00) {
                0qQ.A0A(A0B);
                A0m = AnonymousClass3f0.A00(A0B, i);
                r10.FLL(A0m);
            }
            C286565Wx.A0L(r6, false);
            AnonymousClass5ZZ.A09(r10, r7.Ezh(new WithAlignmentLineElement(r3)), AnonymousClass5Z4.A00((C291805hu) null, (C289645dx) null, C51966G9m.A0c(r10), (C268454dQ) null, (AnonymousClass5ZD) null, (C291825hw) null, 0, 0, 0, 6291454, C51966G9m.A0M(r10), 0, 0, 0), (String) A0m, 6);
            if (C51967G9n.A1R(r10)) {
                0fL.A00(-59267692);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            C59347JFz.A00(ASQ, i, i2, 10);
        }
    }

    public static final void A03(C286575Wy r13, GraphGuardianContent graphGuardianContent, int i) {
        C286575Wy r2 = r13;
        if (C51967G9n.A1T(r13, -1241756060)) {
            0fL.A01(-1900335179, "com.instagram.user.userlist.ui.SpecialEmptyStateScreen (LikesListComposeFragment.kt:253)");
        }
        Modifier A07 = C287195Zj.A07(Modifier.A00, 32.0f);
        HL5 hl5 = HL5.EMPHASIZED;
        String title = graphGuardianContent.getTitle();
        String str = "";
        if (title == null) {
            title = str;
        }
        String Agd = graphGuardianContent.Agd();
        if (Agd != null) {
            str = Agd;
        }
        I7M.A02(r2, A07, (C59486JLk) null, hl5, str, title, (String) null, (C62320sa) null, 432, 4072, 0);
        if (0fL.A02()) {
            0fL.A00(197329445);
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            JGE.A01(ASQ, graphGuardianContent, i, 1);
        }
    }

    public static final void A04(C286575Wy r24, ImageUrl imageUrl, FollowStatus followStatus, String str, String str2, String str3, C62320sa r30, C62320sa r31, 0sP r32, int i, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        int i4;
        C286575Wy r8 = r24;
        r8.ExV(-782445859);
        int i5 = i;
        ImageUrl imageUrl2 = imageUrl;
        if ((i & 14) == 0) {
            i3 = G9t.A0O(r8, imageUrl2) | i;
        } else {
            i3 = i5;
        }
        String str4 = str;
        if ((i & 112) == 0) {
            i3 |= G9t.A0P(r8, str4);
        }
        String str5 = str2;
        if ((i5 & 896) == 0) {
            i3 |= G9t.A0Q(r8, str5);
        }
        String str6 = str3;
        if ((i5 & 7168) == 0) {
            i3 |= G9t.A0R(r8, str6);
        }
        boolean z4 = z;
        if ((i & 57344) == 0) {
            i3 |= G9t.A0c(r8, z4);
        }
        FollowStatus followStatus2 = followStatus;
        if ((i & 458752) == 0) {
            i3 |= G9t.A0T(r8, followStatus2);
        }
        boolean z5 = z2;
        if ((i & 3670016) == 0) {
            i3 |= G9t.A0e(r8, z5);
        }
        boolean z6 = z3;
        if ((i & 29360128) == 0) {
            i3 |= G9t.A0f(r8, z6);
        }
        0sP r10 = r32;
        if ((234881024 & i) == 0) {
            i3 |= G9t.A0M(r8, r10);
        }
        C62320sa r13 = r30;
        if ((i & 1879048192) == 0) {
            i3 |= G9t.A0N(r8, r13);
        }
        C62320sa r5 = r31;
        if ((i2 & 14) == 0) {
            i4 = i2 | C51971G9r.A08(r8, r5);
        } else {
            i4 = i2;
        }
        if ((i3 & 1533916891) == 306783378 && (i4 & 11) == 2 && r8.Bwn()) {
            r8.Evl();
        } else {
            if (0fL.A02()) {
                0fL.A01(388191063, "com.instagram.user.userlist.ui.UserRow (LikesListComposeFragment.kt:536)");
            }
            int i6 = i3 << 6;
            C286575Wy r19 = r8;
            GS8.A07(r19, C51966G9m.A0o(r8, imageUrl2, i3), str4, str5, str6, r13, r10, AnonymousClass5PI.A01(r8, new C59360JGm(12, r5, followStatus2, z4), 73086588), (i3 & 112) | 8 | (i6 & 57344) | (i6 & 458752) | (i3 & 3670016) | (i3 & 29360128), 196608 | ((i3 >> 18) & 7168) | ((i3 >> 12) & 57344), 7948, z5, z6, false, false);
            if (0fL.A02()) {
                0fL.A00(1088012997);
            }
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JCH(imageUrl2, followStatus2, str4, str5, str6, r13, r5, r10, i5, i2, z, z2, z3);
        }
    }

    public static final void A05(C286575Wy r28, C49723F3m f3m, C62320sa r30, int i) {
        int i2;
        C286625Xd ASQ;
        int i3;
        C286575Wy r2 = r28;
        r2.ExV(-888406198);
        int i4 = i;
        C49723F3m f3m2 = f3m;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r2, f3m2) | i;
        } else {
            i2 = i4;
        }
        int i5 = i & 112;
        C62320sa r31 = r30;
        if (i5 == 0) {
            i2 |= G9t.A0F(r2, r31);
        }
        if ((i2 & 91) != 18 || !r2.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-601902497, "com.instagram.user.userlist.ui.FeedbackFromFacebookRow (LikesListComposeFragment.kt:467)");
            }
            if ((f3m2 instanceof ER7) || (f3m2 instanceof ER8)) {
                if (0fL.A02()) {
                    0fL.A00(-629288086);
                }
                ASQ = r2.ASQ();
                if (ASQ != null) {
                    i3 = 12;
                    JGM.A01(ASQ, f3m2, r31, i4, i3);
                }
                return;
            }
            r2.ExS(1514183594);
            C303876Bd A0b = C51969G9p.A0b();
            String A00 = C288035bG.A00(r2, 2131973485);
            C267314bM r4 = AndroidCompositionLocals_androidKt.A01;
            Resources resources = ((Context) r2.AJO(r4)).getResources();
            0qQ.A0A(resources);
            String A03 = f3m2.A03(resources, A00);
            A0b.A07(A03);
            r2.ExS(1514191464);
            if (00l.A0d(A03, A00, false)) {
                0qQ.A0B(A03, 0);
                int A0G = C51971G9r.A0G(A03, A00);
                int A05 = C51966G9m.A05(A00, A0G);
                A0b.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, AnonymousClass5ZD.A03, (C291795ht) null, 65530, C51966G9m.A0D(r2), 0, 0), A0G, A05);
                A0b.A0A("learn_more", "Clickable learn more link", A0G, A05);
            }
            C286565Wx A0H = C51965G9l.A0H(r2, false);
            C286025Tq A02 = A0b.A02();
            C286565Wx.A0L(A0H, false);
            GS7 gs7 = GS7.A03;
            C285245Qk r9 = Modifier.A00;
            Modifier A09 = C287205Zk.A09(C287195Zj.A00(gs7.A01, C51966G9m.A0T(r9)), 72.0f);
            AnonymousClass5RD A022 = C287395a4.A02(C287275Zs.A01, r2, C287215Zl.A04, 48);
            int A002 = C287425a7.A00(r2);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r2, A09);
            C62320sa r13 = C287485aD.A00;
            C51973G9u.A0z(r2, A0H, r13);
            0sL r12 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r2, A022, A04, r12);
            0sL r10 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r2, A002)) {
                C51971G9r.A13(r2, r10, A002);
            }
            0sL A1K = C51966G9m.A1K(r2, A01);
            JSI jsi = gs7.A02;
            Modifier A0C = C287205Zk.A0C(r9, jsi.AeN());
            AnonymousClass5RD A0Z = C51966G9m.A0Z(false);
            int A003 = C287425a7.A00(r2);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r2, A0C);
            C51973G9u.A0z(r2, A0H, r13);
            C287595aO.A00(r2, A0Z, r12);
            if (C51965G9l.A1Y(r2, A0H, A042, A0w) || !C51972G9s.A1Q(r2, A003)) {
                C51971G9r.A13(r2, r10, A003);
            }
            C287595aO.A00(r2, A012, A1K);
            boolean z = true;
            AnonymousClass6G3.A02(r2, C51971G9r.A0Q(r9, jsi.AeO()), C51968G9o.A0R(AnonymousClass5aQ.A00(r2).A0F), C287995bC.A00(f3m2.A00((Context) r2.AJO(r4)), r2), 56);
            r2.ASN();
            Modifier A0B = C287195Zj.A0B(r9, 12.0f, 0.0f, 0.0f, 0.0f);
            AnonymousClass5Z4 A0c = C51966G9m.A0c(r2);
            boolean A1Y = C51967G9n.A1Y(r2, A02, 2024461539);
            if ((i2 & 112) != 32) {
                z = false;
            }
            boolean z2 = A1Y | z;
            Object ECw = r2.ECw();
            if (z2 || ECw == AnonymousClass5XT.A00) {
                ECw = new J6T(15, (Object) A02, (Object) r31);
                r2.FLL(ECw);
            }
            IgClickableTextKt.A03(r2, A0B, A02, A0c, C51965G9l.A0z(A0H, ECw), 48, 112636, 0);
            if (C51967G9n.A1R(r2)) {
                0fL.A00(2141747553);
            }
        } else {
            r2.Evl();
        }
        ASQ = r2.ASQ();
        if (ASQ != null) {
            i3 = 13;
            JGM.A01(ASQ, f3m2, r31, i4, i3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: X.Gc4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: X.Gc4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.C286575Wy r36, X.C47178Drt r37, X.C62320sa r38, X.C62320sa r39, X.0sP r40, X.0sP r41, X.0sP r42, X.0sP r43, X.0sL r44, int r45) {
        /*
            r0 = 1474525118(0x57e377be, float:5.00206857E14)
            r3 = r36
            r3.ExV(r0)
            r2 = r45
            r0 = r45 & 14
            if (r0 != 0) goto L_0x021a
            r0 = r37
            int r10 = X.G9t.A0O(r3, r0)
            r10 = r10 | r45
        L_0x0016:
            r0 = r45 & 112(0x70, float:1.57E-43)
            r35 = r40
            if (r0 != 0) goto L_0x0023
            r0 = r35
            int r0 = X.G9t.A0F(r3, r0)
            r10 = r10 | r0
        L_0x0023:
            r0 = r2 & 896(0x380, float:1.256E-42)
            r34 = r41
            if (r0 != 0) goto L_0x0030
            r0 = r34
            int r0 = X.G9t.A0G(r3, r0)
            r10 = r10 | r0
        L_0x0030:
            r0 = r2 & 7168(0x1c00, float:1.0045E-41)
            r32 = r44
            if (r0 != 0) goto L_0x003d
            r0 = r32
            int r0 = X.G9t.A0H(r3, r0)
            r10 = r10 | r0
        L_0x003d:
            r16 = 57344(0xe000, float:8.0356E-41)
            r0 = r45 & r16
            r33 = r42
            if (r0 != 0) goto L_0x004d
            r0 = r33
            int r0 = X.G9t.A0I(r3, r0)
            r10 = r10 | r0
        L_0x004d:
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r45 & r0
            r15 = r38
            if (r0 != 0) goto L_0x005a
            int r0 = X.G9t.A0J(r3, r15)
            r10 = r10 | r0
        L_0x005a:
            r9 = 3670016(0x380000, float:5.142788E-39)
            r0 = r45 & r9
            r36 = r39
            if (r0 != 0) goto L_0x0069
            r0 = r36
            int r0 = X.G9t.A0K(r3, r0)
            r10 = r10 | r0
        L_0x0069:
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r45 & r1
            r13 = r43
            if (r0 != 0) goto L_0x0076
            int r0 = X.G9t.A0L(r3, r13)
            r10 = r10 | r0
        L_0x0076:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r4 = r10 & r0
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r4 != r0) goto L_0x00a9
            boolean r0 = r3.Bwn()
            if (r0 == 0) goto L_0x00a9
            r3.Evl()
        L_0x0089:
            X.5Xd r1 = r3.ASQ()
            if (r1 == 0) goto L_0x00a8
            r14 = 8
            X.JBG r0 = new X.JBG
            r4 = r0
            r5 = r15
            r6 = r36
            r7 = r37
            r8 = r34
            r9 = r13
            r10 = r35
            r11 = r32
            r12 = r33
            r13 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.A06 = r0
        L_0x00a8:
            return
        L_0x00a9:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00b7
            r4 = -1411380415(0xffffffffabe00b41, float:-1.5919281E-12)
            java.lang.String r0 = "com.instagram.user.userlist.ui.LikesListScreen (LikesListComposeFragment.kt:272)"
            X.0fL.A01(r4, r0)
        L_0x00b7:
            r0 = 3163384(0x3044f8, float:4.432845E-39)
            java.lang.Object r8 = X.C51967G9n.A0m(r3, r0)
            java.lang.Object r7 = X.AnonymousClass5XT.A00
            r11 = 0
            if (r8 != r7) goto L_0x00c7
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = X.G9t.A0o(r3, r11)
        L_0x00c7:
            r6 = r3
            X.5Wx r6 = (X.C286565Wx) r6
            r5 = 0
            X.C286565Wx.A0L(r6, r5)
            X.07T r18 = X.07T.ON_PAUSE
            r0 = 3166076(0x304f7c, float:4.436617E-39)
            java.lang.Object r0 = X.C51967G9n.A0m(r3, r0)
            if (r0 != r7) goto L_0x00e2
            r4 = 5
            X.PhT r0 = new X.PhT
            r0.<init>(r8, r4)
            r3.FLL(r0)
        L_0x00e2:
            X.0sa r20 = X.C51965G9l.A0y(r6, r0, r5)
            r21 = 390(0x186, float:5.47E-43)
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r26 = 2
            r17 = r3
            r19 = r11
            r22 = r26
            X.C54764HRw.A00(r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.lazy.LazyListState r4 = X.C51967G9n.A0A(r3)
            r12 = 3169696(0x305da0, float:4.44169E-39)
            boolean r12 = X.C51967G9n.A1Y(r3, r4, r12)
            boolean r1 = X.C51972G9s.A1P(r10, r1, r0)
            r1 = r1 | r12
            java.lang.Object r0 = r3.ECw()
            if (r1 != 0) goto L_0x010d
            if (r0 != r7) goto L_0x0117
        L_0x010d:
            r1 = 15
            X.MGD r0 = new X.MGD
            r0.<init>(r4, r13, r11, r1)
            r3.FLL(r0)
        L_0x0117:
            X.C51968G9o.A1E(r3, r6, r0, r4)
            r0 = 23606367(0x168345f, float:4.2649245E-38)
            X.C52384GQj.A00(r4, r3, r0, r5)
            X.4bM r0 = X.C286955Yl.A00
            X.5Oz r12 = X.C51968G9o.A0M(r3, r0)
            r0 = 3184132(0x309604, float:4.461919E-39)
            java.lang.Object r0 = X.C51967G9n.A0m(r3, r0)
            if (r0 != r7) goto L_0x013d
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            X.5bF r14 = new X.5bF
            r14.<init>(r0)
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.G9t.A0o(r3, r14)
        L_0x013d:
            X.C286565Wx.A0L(r6, r5)
            X.5Qk r14 = androidx.compose.ui.Modifier.A00
            r1 = 3501(0xdad, float:4.906E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            androidx.compose.ui.Modifier r27 = X.C51969G9p.A0Y(r14, r1)
            r1 = 3191739(0x30b3bb, float:4.472579E-39)
            boolean r1 = X.C51974G9v.A1X(r3, r1, r10)
            boolean r14 = X.C51973G9u.A1H(r10)
            r1 = r1 | r14
            boolean r9 = X.C51973G9u.A1M(r10, r9)
            boolean r9 = X.C51968G9o.A1U(r3, r12, r1, r9)
            boolean r1 = X.C51973G9u.A1J(r10)
            r9 = r9 | r1
            boolean r1 = X.C51973G9u.A1I(r10)
            r9 = r9 | r1
            r10 = r10 & r16
            boolean r1 = X.C51972G9s.A1K(r10)
            r1 = r1 | r9
            java.lang.Object r9 = r3.ECw()
            if (r1 != 0) goto L_0x01fb
            if (r9 == r7) goto L_0x01fb
            r1 = 1
        L_0x017a:
            X.0sP r28 = X.C51965G9l.A0z(r6, r9)
            r29 = 12582918(0xc00006, float:1.7632424E-38)
            r30 = 124(0x7c, float:1.74E-43)
            r25 = r4
            r26 = r3
            r31 = r1
            X.AnonymousClass6HY.A04(r25, r26, r27, r28, r29, r30, r31)
            r4 = r37
            X.JwC r4 = r4.A01
            if (r4 == 0) goto L_0x01ed
            java.lang.Object r8 = r4.A00
            if (r8 == 0) goto L_0x01ed
            r4 = -2106828259(0xffffffff826c5a1d, float:-1.7364403E-37)
            java.lang.Object r4 = X.C51967G9n.A0m(r3, r4)
            java.lang.Object r7 = X.C51976G9y.A0J(r3, r4, r7, r1)
            X.GeI r7 = (X.C52882GeI) r7
            X.C286565Wx.A0L(r6, r5)
            X.J4e r9 = X.C59045J4e.A00
            X.5b7 r6 = X.C51976G9y.A0A()
            X.Htd r1 = X.C56151Htd.A00
            X.HsI r4 = new X.HsI
            r4.<init>(r6, r9)
            X.0sm r21 = X.0Yt.A0E()
            X.I1o r1 = new X.I1o
            r16 = r1
            r17 = r11
            r18 = r11
            r19 = r11
            r20 = r4
            r22 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.GeF r6 = new X.GeF
            r6.<init>(r1)
            r5 = -976701303(0xffffffffc5c8b889, float:-6423.067)
            r4 = 22
            X.JGn r1 = new X.JGn
            r1.<init>(r4, r8, r15, r0)
            X.5PJ r22 = X.AnonymousClass5PI.A01(r3, r1, r5)
            r23 = 196992(0x30180, float:2.76045E-40)
            r24 = 26
            r18 = r7
            r19 = r3
            r20 = r11
            r21 = r11
            r16 = r6
            X.C56663I6s.A02(r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x01ed:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0089
            r0 = 1948074123(0x741d408b, float:4.9835186E31)
            X.0fL.A00(r0)
            goto L_0x0089
        L_0x01fb:
            X.Gc4 r9 = new X.Gc4
            r1 = 1
            r25 = r34
            r16 = r9
            r17 = r12
            r18 = r0
            r19 = r35
            r20 = r32
            r21 = r36
            r22 = r37
            r23 = r33
            r24 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r3.FLL(r9)
            goto L_0x017a
        L_0x021a:
            r10 = r2
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56670I6z.A06(X.5Wy, X.Drt, X.0sa, X.0sa, X.0sP, X.0sP, X.0sP, X.0sP, X.0sL, int):void");
    }

    public static final void A07(C286575Wy r15, JMH jmh, int i) {
        C286575Wy r3 = r15;
        if (C51967G9n.A1T(r15, 821153859)) {
            0fL.A01(-470392167, "com.instagram.user.userlist.ui.ViewsRow (LikesListComposeFragment.kt:385)");
        }
        C267314bM r9 = AndroidCompositionLocals_androidKt.A01;
        Resources resources = ((Context) r15.AJO(r9)).getResources();
        C285245Qk r8 = Modifier.A00;
        Modifier A09 = C287195Zj.A09(C51966G9m.A0T(r8), 0.0f, 32.0f);
        AnonymousClass5RD A00 = C287395a4.A00(C287275Zs.A02, r15, C287215Zl.A04);
        int A002 = C287425a7.A00(r15);
        C286565Wx r4 = (C286565Wx) r3;
        AnonymousClass5RM A04 = C286565Wx.A04(r4);
        Modifier A01 = C287435a8.A01(r15, A09);
        C51973G9u.A0y(r15, r4);
        C51971G9r.A12(r15, A00, A04);
        0sL r1 = C287485aD.A02;
        if (r4.A0K || !C51972G9s.A1Q(r15, A002)) {
            C51971G9r.A13(r15, r1, A002);
        }
        C51965G9l.A18(r15, A01);
        AnonymousClass6G3.A02(r15, C287195Zj.A09(r8, 4.0f, 0.0f), C51968G9o.A0R(C51966G9m.A0G(r15)), C287995bC.A00(C323656xt.A00((Context) r15.AJO(r9), R.drawable.instagram_play_pano_outline_16), r15), 440);
        Object A0m = C51967G9n.A0m(r15, -239390720);
        JMH jmh2 = jmh;
        if (A0m == AnonymousClass5XT.A00) {
            if (jmh2 instanceof C57446Iaq) {
                0qQ.A0A(resources);
                A0m = AnonymousClass3f0.A02(resources, Integer.valueOf(((C57446Iaq) jmh2).A00));
            } else if (jmh2 instanceof C57447Iar) {
                0qQ.A0A(resources);
                A0m = AnonymousClass3f0.A03(resources, Integer.valueOf(((C57447Iar) jmh2).A00), 2131968488);
            } else {
                throw AnonymousClass7TE.A1K();
            }
            r15.FLL(A0m);
        }
        C286565Wx.A0L(r4, false);
        AnonymousClass5ZZ.A0i(r3, AnonymousClass5Z4.A00((C291805hu) null, (C289645dx) null, AnonymousClass5aQ.A01(r3).A08, (C268454dQ) null, AnonymousClass5ZD.A04, (C291825hw) null, 0, 0, 0, 6291450, C51966G9m.A0H(r3), 0, 0, 0), (String) A0m, 6, 16382);
        r3.ASN();
        C56618I4t.A00(r3);
        if (0fL.A02()) {
            0fL.A00(-235000243);
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            JGE.A01(ASQ, jmh2, i, 2);
        }
    }
}
