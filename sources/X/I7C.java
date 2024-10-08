package X;

import android.content.Context;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;
import com.instagram.api.schemas.ReelAutoArchiveSettingStr;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public abstract class I7C {
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.C286575Wy r34, androidx.compose.ui.Modifier r35, com.instagram.common.typedurl.SimpleImageUrl r36, java.lang.String r37, X.0sP r38, X.YCQ r39, int r40, int r41, int r42, long r43, boolean r45) {
        /*
            r19 = r35
            r0 = 319056755(0x13046b73, float:1.6713719E-27)
            r6 = r34
            r6.ExV(r0)
            r4 = r42
            r2 = r42 & 1
            r5 = r41
            if (r2 == 0) goto L_0x0238
            r12 = r41 | 6
        L_0x0014:
            r0 = r42 & 2
            if (r0 == 0) goto L_0x022b
            r12 = r12 | 48
        L_0x001a:
            r0 = r42 & 4
            r22 = r40
            if (r0 == 0) goto L_0x021e
            r12 = r12 | 384(0x180, float:5.38E-43)
        L_0x0022:
            r0 = r42 & 8
            r31 = r43
            if (r0 == 0) goto L_0x0211
            r12 = r12 | 3072(0xc00, float:4.305E-42)
        L_0x002a:
            r0 = r42 & 16
            r35 = r37
            if (r0 == 0) goto L_0x0201
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
        L_0x0032:
            r0 = r42 & 32
            r33 = r39
            if (r0 == 0) goto L_0x01f3
            r0 = 196608(0x30000, float:2.75506E-40)
        L_0x003a:
            r12 = r12 | r0
        L_0x003b:
            r0 = r42 & 64
            r21 = r45
            if (r0 == 0) goto L_0x01e5
            r0 = 1572864(0x180000, float:2.204052E-39)
        L_0x0043:
            r12 = r12 | r0
        L_0x0044:
            r0 = r4 & 128(0x80, float:1.794E-43)
            r20 = 29360128(0x1c00000, float:7.052966E-38)
            r34 = r38
            if (r0 == 0) goto L_0x01d9
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x004e:
            r12 = r12 | r0
        L_0x004f:
            r1 = 23967451(0x16db6db, float:4.3661218E-38)
            r1 = r1 & r12
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r0) goto L_0x0081
            boolean r0 = r6.Bwn()
            if (r0 == 0) goto L_0x0081
            r6.Evl()
        L_0x0061:
            X.5Xd r0 = r6.ASQ()
            if (r0 == 0) goto L_0x0080
            X.JAt r3 = new X.JAt
            r6 = r35
            r7 = r34
            r8 = r33
            r9 = r22
            r10 = r5
            r11 = r4
            r12 = r31
            r14 = r21
            r4 = r19
            r5 = r36
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r14)
            r0.A06 = r3
        L_0x0080:
            return
        L_0x0081:
            if (r2 == 0) goto L_0x0085
            X.5Qk r19 = androidx.compose.ui.Modifier.A00
        L_0x0085:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0093
            r1 = 1954535818(0x747fd98a, float:8.1082026E31)
            java.lang.String r0 = "com.instagram.archive.ui.ArchiveStoryGridItem (ArchiveReelComposeFragment.kt:764)"
            X.0fL.A01(r1, r0)
        L_0x0093:
            X.5Qk r18 = androidx.compose.ui.Modifier.A00
            r3 = 0
            long r0 = X.C51966G9m.A0B(r6)
            r8 = 0
            X.5S2 r17 = X.AnonymousClass5S0.A00
            r7 = r18
            r2 = r17
            androidx.compose.ui.Modifier r1 = X.C304766Fd.A01(r7, r2, r0)
            r0 = r19
            androidx.compose.ui.Modifier r7 = r0.Ezh(r1)
            X.5RD r1 = X.C51966G9m.A0a(r3)
            int r9 = X.C287425a7.A00(r6)
            r2 = r6
            X.5Wx r2 = (X.C286565Wx) r2
            X.5RM r0 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r7 = X.C287435a8.A01(r6, r7)
            X.C51973G9u.A0y(r6, r2)
            X.C51971G9r.A12(r6, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r2.A0K
            if (r0 != 0) goto L_0x00d0
            boolean r0 = X.C51972G9s.A1Q(r6, r9)
            if (r0 != 0) goto L_0x00d3
        L_0x00d0:
            X.C51971G9r.A13(r6, r1, r9)
        L_0x00d3:
            X.C51965G9l.A18(r6, r7)
            X.5dj r16 = X.C289515dj.A00
            X.4bM r0 = X.AnonymousClass5ZU.A00
            X.5Oz r1 = X.C51968G9o.A0M(r6, r0)
            r0 = 1916053957(0x7234a9c5, float:3.5784026E30)
            java.lang.Object r0 = X.C51967G9n.A0m(r6, r0)
            java.lang.Object r11 = X.AnonymousClass5XT.A00
            if (r0 != r11) goto L_0x00ed
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.G9t.A0o(r6, r8)
        L_0x00ed:
            X.5Oz r14 = X.C51965G9l.A0J(r2, r0, r3)
            r30 = 1
            androidx.compose.ui.Modifier r15 = X.C51966G9m.A0U(r18)
            r0 = 1916059319(0x7234beb7, float:3.5800232E30)
            java.lang.Object r13 = X.C51974G9v.A0W(r6, r11, r0)
            X.5aT r13 = (X.C287605aT) r13
            X.C286565Wx.A0L(r2, r3)
            java.lang.Object r10 = r1.getValue()
            X.5Yz r10 = (X.C287095Yz) r10
            r0 = 1916062194(0x7234c9f2, float:3.580892E30)
            r6.ExS(r0)
            r9 = r12 & r20
            r8 = 8388608(0x800000, float:1.17549435E-38)
            boolean r0 = X.AnonymousClass7TF.A1S(r9, r8)
            java.lang.Object r1 = r6.ECw()
            if (r0 != 0) goto L_0x011f
            if (r1 != r11) goto L_0x012b
        L_0x011f:
            r7 = 46
            X.MMZ r1 = new X.MMZ
            r0 = r34
            r1.<init>((X.C284945Oz) r14, (X.0sP) r0, (int) r7)
            r6.FLL(r1)
        L_0x012b:
            X.0sa r0 = X.C51965G9l.A0y(r2, r1, r3)
            androidx.compose.ui.Modifier r7 = X.C287635aW.A02(r10, r13, r15, r0)
            r0 = 1916066377(0x7234da49, float:3.5821563E30)
            java.lang.Object r1 = X.C51967G9n.A0m(r6, r0)
            if (r1 != r11) goto L_0x0146
            r0 = 49
            X.MP6 r1 = new X.MP6
            r1.<init>(r14, r0)
            r6.FLL(r1)
        L_0x0146:
            androidx.compose.ui.Modifier r10 = X.C51973G9u.A0E(r2, r7, r1)
            int r0 = r12 >> 3
            r1 = r0 & 14
            r0 = r36
            X.2DN r7 = X.1zC.A01(r6, r0, r1)
            r1 = 1572920(0x180038, float:2.20413E-39)
            r0 = 56
            X.AnonymousClass6G3.A07(r6, r10, r7, r1, r0)
            r0 = 1916072718(0x7234f30e, float:3.5840728E30)
            r6.ExS(r0)
            if (r40 != 0) goto L_0x016d
            int r0 = r12 >> 9
            r7 = r0 & 14
            r0 = r31
            A05(r6, r7, r0)
        L_0x016d:
            X.C286565Wx.A0L(r2, r3)
            r1 = r33
            r0 = r35
            boolean r29 = X.00k.A0u(r1, r0)
            r0 = 1916078002(0x723507b2, float:3.5856697E30)
            r6.ExS(r0)
            if (r45 == 0) goto L_0x01cb
            r0 = 1916079882(0x72350f0a, float:3.586238E30)
            boolean r0 = X.C51972G9s.A1R(r6, r0, r9, r8)
            java.lang.Object r7 = r6.ECw()
            if (r0 != 0) goto L_0x018f
            if (r7 != r11) goto L_0x019b
        L_0x018f:
            r1 = 48
            X.MP6 r7 = new X.MP6
            r0 = r34
            r7.<init>(r0, r1)
            r6.FLL(r7)
        L_0x019b:
            X.0sP r26 = X.C51965G9l.A0z(r2, r7)
            androidx.compose.ui.Modifier r7 = X.C287195Zj.A02(r18)
            androidx.compose.ui.Alignment r1 = X.C287215Zl.A07
            r0 = r16
            androidx.compose.ui.Modifier r24 = r0.AAz(r1, r7)
            X.HLW r25 = X.HLW.ON_MEDIA
            r27 = 27648(0x6c00, float:3.8743E-41)
            r23 = r6
            r28 = r3
            X.HXJ.A00(r23, r24, r25, r26, r27, r28, r29, r30)
            if (r29 == 0) goto L_0x01cb
            long r0 = X.C51965G9l.A09(r6)
            r7 = 1056964608(0x3f000000, float:0.5)
            long r0 = X.C285595Rx.A02(X.AnonymousClass5RX.A0K[(int) (r0 & 63)], X.AnonymousClass5RW.A03(r0), X.AnonymousClass5RW.A02(r0), X.AnonymousClass5RW.A01(r0), r7)
            r7 = r17
            androidx.compose.ui.Modifier r0 = X.C304766Fd.A01(r15, r7, r0)
            X.C287675aa.A02(r6, r0, r3)
        L_0x01cb:
            boolean r0 = X.C51971G9r.A1S(r6, r2, r3)
            if (r0 == 0) goto L_0x0061
            r0 = 1328088928(0x4f290760, float:2.83583283E9)
            X.0fL.A00(r0)
            goto L_0x0061
        L_0x01d9:
            r0 = r41 & r20
            if (r0 != 0) goto L_0x004f
            r0 = r34
            int r0 = X.G9t.A0L(r6, r0)
            goto L_0x004e
        L_0x01e5:
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r41
            if (r0 != 0) goto L_0x0044
            r0 = r21
            int r0 = X.G9t.A0e(r6, r0)
            goto L_0x0043
        L_0x01f3:
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r41
            if (r0 != 0) goto L_0x003b
            r0 = r33
            int r0 = X.G9t.A0T(r6, r0)
            goto L_0x003a
        L_0x0201:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r41
            if (r0 != 0) goto L_0x0032
            r0 = r35
            int r0 = X.G9t.A0S(r6, r0)
            r12 = r12 | r0
            goto L_0x0032
        L_0x0211:
            r0 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x002a
            r0 = r31
            int r0 = X.G9t.A0E(r6, r0)
            r12 = r12 | r0
            goto L_0x002a
        L_0x021e:
            r0 = r5 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0022
            r0 = r22
            int r0 = X.G9t.A07(r6, r0)
            r12 = r12 | r0
            goto L_0x0022
        L_0x022b:
            r0 = r41 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x001a
            r0 = r36
            int r0 = X.G9t.A0P(r6, r0)
            r12 = r12 | r0
            goto L_0x001a
        L_0x0238:
            r0 = r41 & 14
            if (r0 != 0) goto L_0x0246
            r0 = r19
            int r12 = X.G9t.A0O(r6, r0)
            r12 = r12 | r41
            goto L_0x0014
        L_0x0246:
            r12 = r5
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7C.A06(X.5Wy, androidx.compose.ui.Modifier, com.instagram.common.typedurl.SimpleImageUrl, java.lang.String, X.0sP, X.YCQ, int, int, int, long, boolean):void");
    }

    public static float A00(C284945Oz r0, float f) {
        return C61380mr.A00((Context) r0.getValue(), f);
    }

    public static final AnonymousClass5Q8 A01(C270284gU r1) {
        int ordinal = ((AnonymousClass5Q8) r1.getValue()).ordinal();
        if (ordinal == 0) {
            return AnonymousClass5Q8.Rtl;
        }
        if (ordinal == 1) {
            return AnonymousClass5Q8.Ltr;
        }
        throw AnonymousClass7TE.A1K();
    }

    public static final void A02(C287295Zu r12, C287325Zx r13, JNR jnr, LazyGridState lazyGridState, C286575Wy r16, Modifier modifier, 0sP r18, int i) {
        int i2;
        C286575Wy r2 = r16;
        r2.ExV(2122283218);
        int i3 = i;
        LazyGridState lazyGridState2 = lazyGridState;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r2, lazyGridState) | i;
        } else {
            i2 = i3;
        }
        Modifier modifier2 = modifier;
        if ((i & 112) == 0) {
            i2 |= G9t.A0P(r2, modifier2);
        }
        JNR jnr2 = jnr;
        if ((i3 & 896) == 0) {
            i2 |= G9t.A0Q(r2, jnr);
        }
        C287325Zx r6 = r13;
        if ((i3 & 7168) == 0) {
            i2 |= G9t.A0R(r2, r13);
        }
        C287295Zu r9 = r12;
        if ((57344 & i) == 0) {
            i2 |= G9t.A0S(r2, r12);
        }
        0sP r8 = r18;
        if ((458752 & i) == 0) {
            i2 |= G9t.A0J(r2, r8);
        }
        if ((374491 & i2) != 74898 || !r2.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1118511004, "com.instagram.archive.ui.InvertedLazyGrid (ArchiveReelComposeFragment.kt:737)");
            }
            C267314bM r4 = AnonymousClass5YA.A07;
            C284945Oz A0M = C51968G9o.A0M(r2, r4);
            Object A0m = C51967G9n.A0m(r2, 1872493512);
            if (A0m == AnonymousClass5XT.A00) {
                A0m = A01(A0M);
                r2.FLL(A0m);
            }
            C51965G9l.A1V(r2);
            C51971G9r.A11(r2, r4.A02(A0m), new J9J(1, modifier2, r6, r8, jnr2, lazyGridState2, r9), -597693422);
            if (0fL.A02()) {
                0fL.A00(-711813137);
            }
        } else {
            r2.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JA2(lazyGridState2, r6, modifier2, r8, r9, jnr2, i3, 2);
        }
    }

    public static final void A03(C286575Wy r6, int i) {
        r6.ExV(1387826154);
        if (i != 0 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(731809018, "com.instagram.archive.ui.LoadingComponent (ArchiveReelComposeFragment.kt:1245)");
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
                0fL.A00(-845247320);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JG9.A01(ASQ, i, 11);
        }
    }

    public static final void A04(C286575Wy r12, int i) {
        C286575Wy r2 = r12;
        r12.ExV(593901808);
        if (i != 0 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-733727034, "com.instagram.archive.ui.PrivacyFooter (ArchiveReelComposeFragment.kt:835)");
            }
            AnonymousClass5ZZ.A0C(r2, C287195Zj.A07(Modifier.A00, 15.0f), C51966G9m.A0c(r12), C288035bG.A00(r12, 2131974351), 3, 2, 48, 6, 15224, C51966G9m.A0M(r12));
            if (0fL.A02()) {
                0fL.A00(-1782966741);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            JG9.A01(ASQ, i, 12);
        }
    }

    public static final void A05(C286575Wy r8, int i, long j) {
        int i2;
        r8.ExV(-547874152);
        if ((i & 14) == 0) {
            i2 = C51970G9q.A05(r8.AGt(j) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-883072474, "com.instagram.archive.ui.CalendarHeader (ArchiveReelComposeFragment.kt:808)");
            }
            Modifier A0B = C287195Zj.A0B(C287205Zk.A0G(Modifier.A00, 44.0f, 44.0f), 8.0f, 8.0f, 0.0f, 0.0f);
            AnonymousClass5aQ.A02(r8);
            Modifier A0p = G9t.A0p(r8, AnonymousClass6FZ.A01(A0B, AnonymousClass5ZM.A01));
            AnonymousClass5RD A0M = G9w.A0M(r8);
            int A00 = C287425a7.A00(r8);
            C286565Wx r5 = (C286565Wx) r8;
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r8, A0p);
            C51973G9u.A0y(r8, r5);
            C51971G9r.A12(r8, A0M, A04);
            0sL r1 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r8, A00)) {
                C51971G9r.A13(r8, r1, A00);
            }
            C51965G9l.A18(r8, A01);
            Date date = new Date(1000 * j);
            boolean A1Y = C51967G9n.A1Y(r8, date, -684485777);
            Object ECw = r8.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                TimeZone timeZone = C14240TsN.A03;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d", Locale.getDefault());
                simpleDateFormat.setTimeZone(C14240TsN.A03);
                ECw = simpleDateFormat.format(date);
                r8.FLL(ECw);
            }
            String str = (String) ECw;
            C286565Wx.A0L(r5, false);
            boolean A1Y2 = C51967G9n.A1Y(r8, date, -684482991);
            Object ECw2 = r8.ECw();
            if (A1Y2 || ECw2 == AnonymousClass5XT.A00) {
                TimeZone timeZone2 = C14240TsN.A03;
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMM", Locale.getDefault());
                simpleDateFormat2.setTimeZone(C14240TsN.A03);
                ECw2 = simpleDateFormat2.format(date);
                r8.FLL(ECw2);
            }
            String str2 = (String) ECw2;
            C286565Wx.A0L(r5, false);
            0qQ.A0A(str);
            AnonymousClass5ZZ.A0q(r8, C51966G9m.A0h(r8), str, C51966G9m.A0H(r8));
            0qQ.A0A(str2);
            AnonymousClass5ZZ.A0q(r8, C51966G9m.A0b(r8), str2, C51966G9m.A0H(r8));
            if (C51967G9n.A1R(r8)) {
                0fL.A00(-1968722369);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59107J6p(j, i);
        }
    }

    public static final void A08(C286575Wy r39, C66709MbG mbG, 0sP r41, 0sP r42, 0sL r43, float f, float f2, int i, boolean z) {
        int i2;
        C286575Wy r9 = r39;
        r9.ExV(80251959);
        int i3 = i;
        C66709MbG mbG2 = mbG;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r9, mbG2) | i;
        } else {
            i2 = i3;
        }
        float f3 = f;
        if ((i & 112) == 0) {
            i2 |= G9t.A00(r9, f3);
        }
        float f4 = f2;
        if ((i3 & 896) == 0) {
            i2 |= G9t.A01(r9, f4);
        }
        boolean z2 = z;
        if ((i3 & 7168) == 0) {
            i2 |= G9t.A0b(r9, z2);
        }
        if ((i & 57344) == 0) {
            i2 |= G9t.A0I(r9, r41);
        }
        0sL r392 = r43;
        if ((458752 & i) == 0) {
            i2 |= G9t.A0J(r9, r392);
        }
        0sP r40 = r42;
        if ((i & 3670016) == 0) {
            i2 |= G9t.A0K(r9, r40);
        }
        if ((2995931 & i2) != 599186 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-158608625, "com.instagram.archive.ui.OnThisDayMedia (ArchiveReelComposeFragment.kt:854)");
            }
            C284945Oz A0M = C51968G9o.A0M(r9, AndroidCompositionLocals_androidKt.A01);
            r392.invoke(mbG2.A02, Boolean.valueOf(z2));
            C285245Qk r5 = Modifier.A00;
            Modifier A0B = C287195Zj.A0B(r5, 16.0f, 0.0f, 0.0f, 16.0f);
            C287325Zx r25 = C287275Zs.A07;
            C287265Zr r24 = C287215Zl.A02;
            AnonymousClass5RD A02 = C291495hO.A02(r25, r9, r24, 0);
            int A00 = C287425a7.A00(r9);
            C286565Wx r2 = (C286565Wx) r9;
            AnonymousClass5RM A04 = C286565Wx.A04(r2);
            Modifier A01 = C287435a8.A01(r9, A0B);
            C62320sa r12 = C287485aD.A00;
            C51973G9u.A0z(r9, r2, r12);
            0sL r11 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r9, A02, A04, r11);
            0sL r10 = C287485aD.A02;
            if (r2.A0K || !C51972G9s.A1Q(r9, A00)) {
                C51971G9r.A13(r9, r10, A00);
            }
            0sL A1K = C51966G9m.A1K(r9, A01);
            Modifier A0T = C51966G9m.A0T(r5);
            Modifier A08 = C287205Zk.A08(A0T, 48.0f);
            C287355a0 r14 = C287275Zs.A04;
            C287245Zp r20 = C287215Zl.A04;
            AnonymousClass5RD A002 = C287395a4.A00(r14, r9, r20);
            int A003 = C287425a7.A00(r9);
            AnonymousClass5RM A042 = C286565Wx.A04(r2);
            Modifier A012 = C287435a8.A01(r9, A08);
            C51973G9u.A0z(r9, r2, r12);
            C287595aO.A00(r9, A002, r11);
            if (C51965G9l.A1Y(r9, r2, A042, A0w) || !C51972G9s.A1Q(r9, A003)) {
                C51971G9r.A13(r9, r10, A003);
            }
            C287595aO.A00(r9, A012, A1K);
            String A004 = C288035bG.A00(r9, 2131953145);
            AnonymousClass5ZZ.A0q(r9, C51966G9m.A0d(r9), A004, C51966G9m.A0H(r9));
            AnonymousClass2DO A005 = C287975bA.A00(r9, R.drawable.instagram_x_pano_filled_24, 0);
            Modifier A07 = C287195Zj.A07(r5, 16.0f);
            int i4 = i2 & 14;
            boolean A1Y = C51967G9n.A1Y(r9, A0M, -437567679) | C51972G9s.A1I(i4) | C51973G9u.A1M(i2, 3670016);
            Object ECw = r9.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                ECw = C58696Iw5.A00(r9, A0M, mbG2, r40, 34);
            }
            C288165bT.A01(r9, C287635aW.A05(A07, (C287625aV) null, (String) null, C51965G9l.A0y(r2, ECw, false), true), A005, 56, C51966G9m.A0L(r9));
            r9.ASN();
            AnonymousClass5RD A006 = C287395a4.A00(C287275Zs.A01, r9, r20);
            int A007 = C287425a7.A00(r9);
            AnonymousClass5RM A043 = C286565Wx.A04(r2);
            Modifier A013 = C287435a8.A01(r9, A0T);
            C51973G9u.A0z(r9, r2, r12);
            C287595aO.A00(r9, A006, r11);
            if (C51965G9l.A1Y(r9, r2, A043, A0w) || !C51972G9s.A1Q(r9, A007)) {
                C51971G9r.A13(r9, r10, A007);
            }
            C287595aO.A00(r9, A013, A1K);
            ImageUrl imageUrl = (ImageUrl) mbG2.A03;
            r9.ExS(-437550129);
            if (imageUrl != null) {
                AnonymousClass2DN A008 = 1zC.A00(r9, new SimpleImageUrl(imageUrl));
                Modifier A009 = C54739HQw.A00(C287205Zk.A0D(r5, f4), f3, false);
                r9.ExS(-437541219);
                boolean A1S = AnonymousClass7TF.A1S(i2 & 57344, Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) | AnonymousClass7TF.A1S(i4, 4);
                Object ECw2 = r9.ECw();
                if (A1S || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = new MMZ(47, (Object) mbG2, (Object) r41);
                    r9.FLL(ECw2);
                }
                AnonymousClass6G3.A07(r9, C287635aW.A05(A009, (C287625aV) null, (String) null, C51965G9l.A0y(r2, ECw2, false), true), A008, 1572920, 56);
            }
            C286565Wx.A0L(r2, false);
            Modifier A0B2 = C287195Zj.A0B(r5, 16.0f, 0.0f, 0.0f, 0.0f);
            AnonymousClass5RD A022 = C291495hO.A02(r25, r9, r24, 0);
            int A0010 = C287425a7.A00(r9);
            AnonymousClass5RM A044 = C286565Wx.A04(r2);
            Modifier A014 = C287435a8.A01(r9, A0B2);
            C51973G9u.A0z(r9, r2, r12);
            C287595aO.A00(r9, A022, r11);
            if (C51965G9l.A1Y(r9, r2, A044, A0w) || !C51972G9s.A1Q(r9, A0010)) {
                C51971G9r.A13(r9, r10, A0010);
            }
            C287595aO.A00(r9, A014, A1K);
            String format = new SimpleDateFormat("yyyy", C14240TsN.A05()).format(Long.valueOf(mbG2.A01 * 1000));
            0qQ.A07(format);
            boolean z3 = true;
            int parseInt = Calendar.getInstance().get(1) - Integer.parseInt(format);
            boolean z4 = true;
            AnonymousClass5ZZ.A0q(r9, C51965G9l.A0S(r9), C288035bG.A00(r9, 2131968790), C51966G9m.A0H(r9));
            String A0d = DbY.A0d(((Context) A0M.getValue()).getResources(), parseInt, R.plurals.on_this_day_subtitle);
            0qQ.A07(A0d);
            AnonymousClass5ZZ.A0q(r9, C51966G9m.A0g(r9), A0d, C51966G9m.A0M(r9));
            r9.ExS(219034930);
            if ((i2 & 57344) != 16384) {
                z3 = false;
            }
            if (i4 != 4) {
                z4 = false;
            }
            boolean z5 = z3 | z4;
            Object ECw3 = r9.ECw();
            if (z5 || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = G9w.A0v(r9, mbG2, r41, 48);
            }
            C62320sa A0y = C51965G9l.A0y(r2, ECw3, false);
            AnonymousClass6CE.A02(r9, C287195Zj.A0B(r5, 0.0f, 12.0f, 0.0f, 0.0f), C51965G9l.A0m(r9), C288035bG.A00(r9, 2131973441), A0y);
            r9.ASN();
            if (C51971G9r.A1R(r9)) {
                0fL.A00(-344324634);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9W(mbG2, r41, r40, r392, f3, f4, i3, z2);
        }
    }

    public static final void A09(C286575Wy r18, C62320sa r19, C62320sa r20, int i) {
        int i2;
        C286575Wy r7 = r18;
        r7.ExV(-1951185729);
        int i3 = i;
        C62320sa r2 = r19;
        if ((i & 14) == 0) {
            i2 = C41848B3p.A01(r7, r2) | i;
        } else {
            i2 = i3;
        }
        C62320sa r1 = r20;
        if ((i & 112) == 0) {
            i2 |= G9t.A0F(r7, r1);
        }
        if ((i2 & 91) != 18 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(377270042, "com.instagram.archive.ui.EmptyArchiveView (ArchiveReelComposeFragment.kt:1213)");
            }
            C53511Gph gph = new C53511Gph(96.0f, R.drawable.empty_state_private);
            ReelAutoArchiveSettingStr BkX = AnonymousClass0t1.A01.A01((UserSession) C51968G9o.A0M(r7, C286955Yl.A00).getValue()).A03.BkX();
            if (BkX == null) {
                BkX = ReelAutoArchiveSettingStr.A07;
            }
            int ordinal = BkX.ordinal();
            if (ordinal == 1) {
                r7.ExS(-290243505);
                String A00 = C288035bG.A00(r7, 2131974259);
                String A002 = C288035bG.A00(r7, 2131974257);
                String A003 = C288035bG.A00(r7, 2131974255);
                boolean A1S = C51975G9x.A1S(r7, 821933822, i2);
                Object ECw = r7.ECw();
                if (A1S || ECw == AnonymousClass5XT.A00) {
                    ECw = new MME(r1, 34);
                    r7.FLL(ECw);
                }
                C286565Wx A0H = C51965G9l.A0H(r7, false);
                I7M.A02(r7, (Modifier) null, gph, (HL5) null, A002, A00, A003, (C62320sa) ECw, 0, 1510, 0);
                C286565Wx.A0L(A0H, false);
            } else if (ordinal != 2) {
                if (ordinal == 3) {
                    r7.ExS(-289137549);
                    C286575Wy r8 = r7;
                    I7M.A08(r8, gph, C288035bG.A00(r7, 2131974258), C288035bG.A00(r7, 2131974258), 0, 4070);
                } else if (ordinal == 0) {
                    r7.ExS(821965967);
                    I7M.A08(r7, gph, (CharSequence) null, "", 6, 4086);
                } else {
                    throw C51973G9u.A0n(r7, 821918386);
                }
                C51965G9l.A1X(r7, false);
            } else {
                r7.ExS(-289767066);
                String A004 = C288035bG.A00(r7, 2131974258);
                String A005 = C288035bG.A00(r7, 2131974256);
                String A006 = C288035bG.A00(r7, 2131974254);
                r7.ExS(821948013);
                boolean A1Q = C51968G9o.A1Q(i2);
                Object ECw2 = r7.ECw();
                if (A1Q || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = new MME(r2, 35);
                    r7.FLL(ECw2);
                }
                C286565Wx A0H2 = C51965G9l.A0H(r7, false);
                I7M.A02(r7, (Modifier) null, gph, (HL5) null, A005, A004, A006, (C62320sa) ECw2, 0, 1510, 0);
                C286565Wx.A0L(A0H2, false);
            }
            if (0fL.A02()) {
                0fL.A00(-1528964122);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGL(r2, r1, i3, 17);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v121, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v122, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v270, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v271, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v278, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v279, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v415, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v416, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v504, resolved type: X.IyL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r79v3, resolved type: X.IyL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v4, resolved type: X.5Z4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v505, resolved type: X.IyK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v506, resolved type: com.instagram.archive.ui.ArchiveReelComposeFragmentKt$fastScroll$6$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r64v3, resolved type: com.instagram.archive.ui.ArchiveReelComposeFragmentKt$fastScroll$6$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r94v2, resolved type: X.IyK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r100v2, resolved type: X.5Z4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v507, resolved type: X.JTZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v3, resolved type: X.JTZ} */
    /* JADX WARNING: type inference failed for: r49v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03b5, code lost:
        if (r0 == r5) goto L_0x03b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03b7, code lost:
        r35 = new X.JTZ(r120, r51, (X.AnonymousClass4D7) null, r116, 2);
        r2.FLL(r35);
        r35 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03cb, code lost:
        X.AnonymousClass7TE.A1Z(X.C51965G9l.A10(r4, r0), r84);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x049d, code lost:
        if (X.C51971G9r.A1W(r67) != false) goto L_0x049f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04a1, code lost:
        if (r11 == false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04a3, code lost:
        r0 = X.C51971G9r.A1W(r67);
        r1 = org.webrtc.CameraCapturer.OPEN_CAMERA_DELAY_MS;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04a9, code lost:
        if (r0 == false) goto L_0x04ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04ab, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04ac, code lost:
        r43 = X.I69.A02(X.GQC.A00(r1, 1200), r2, (X.0sP) null, r71, 3072, 20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04c4, code lost:
        if (X.C51971G9r.A03(r43) != 0.0f) goto L_0x0595;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04c6, code lost:
        r28 = X.C289575dp.A01(r28, X.J0S.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04d2, code lost:
        if (X.0fL.A02() == false) goto L_0x04da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04d4, code lost:
        r0 = 1772235304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x055c, code lost:
        if (r0 != r5) goto L_0x0578;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x055e, code lost:
        r79 = new X.C58836IyL(r80, r81, r53, r52, r54, r85, r86, r87, r88, r89, r90, r29, r92, r93, r32, r27, r115, r55);
        r2.FLL(r79);
        r79 = r79;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0578, code lost:
        A02(r23, r24, r9, r51, r2, r28, X.C51965G9l.A0z(r4, r0), 27648);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x058b, code lost:
        if (X.0fL.A02() == false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x058d, code lost:
        X.0fL.A00(-1007775905);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0595, code lost:
        r15 = X.C51968G9o.A0M(r2, r15);
        r62 = X.C51967G9n.A0m(r2, 617107689);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x05a2, code lost:
        if (r62 != r5) goto L_0x05ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x05a4, code lost:
        r62 = X.C287705ad.A00(0.0f);
        r2.FLL(r62);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x05ad, code lost:
        r62 = (X.AnonymousClass5b4) r62;
        X.C286565Wx.A0L(r4, false);
        r0 = X.C51967G9n.A0m(r2, 617109322);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x05bd, code lost:
        if (r0 != r5) goto L_0x05d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x05bf, code lost:
        r0 = java.lang.Float.valueOf(((float) r79) - A00(r15, 5.0f + 8.0f));
        r2.FLL(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x05d0, code lost:
        r99 = X.AnonymousClass7TE.A04(r0);
        X.C286565Wx.A0L(r4, false);
        r0 = X.C51967G9n.A0m(r2, 617112941);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x05de, code lost:
        if (r0 != r5) goto L_0x05e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x05e0, code lost:
        r0 = X.G9t.A0o(r2, java.lang.Float.valueOf(0.0f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x05e8, code lost:
        r42 = X.C51965G9l.A0J(r4, r0, false);
        r0 = X.C51967G9n.A0m(r2, 617116972);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x05f3, code lost:
        if (r0 != r5) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x05f5, code lost:
        r0 = X.G9t.A0o(r2, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x05fd, code lost:
        r41 = X.C51965G9l.A0J(r4, r0, false);
        r2.ExS(617123174);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x060d, code lost:
        if (((r14 & 7168) ^ 3072) <= 2048) goto L_0x0615;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0613, code lost:
        if (r2.AGs(r6) != false) goto L_0x061a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0615, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0618, code lost:
        if ((r14 & 3072) != 2048) goto L_0x061b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x061a, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x061b, code lost:
        r0 = r2.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x061f, code lost:
        if (r7 != false) goto L_0x0623;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0621, code lost:
        if (r0 != r5) goto L_0x0634;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0623, code lost:
        r0 = java.lang.Integer.valueOf((int) ((float) java.lang.Math.ceil((double) (((float) r6) / 3.0f))));
        r2.FLL(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0634, code lost:
        r61 = X.AnonymousClass7TE.A0M(r0);
        X.C286565Wx.A0L(r4, false);
        r6 = java.lang.Long.valueOf(((X.C55977Hqi) X.00k.A0K(r117)).A01);
        r1 = X.C51971G9r.A0B(r41);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x064b, code lost:
        if (r1 < 0) goto L_0x0677;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x064f, code lost:
        if (r1 >= r61) goto L_0x0677;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0651, code lost:
        r1 = (X.C55977Hqi) r117.get(X.C229632nm.A03(X.C51971G9r.A0B(r41) * 3, 0, r117.size() - 1));
        r0 = r1.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x066b, code lost:
        if (r0 == null) goto L_0x0b94;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x066f, code lost:
        if (r0.A0b == null) goto L_0x0b94;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0671, code lost:
        r6 = java.lang.Long.valueOf(r1.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0677, code lost:
        if (r6 == null) goto L_0x0b91;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0679, code lost:
        r11 = 1000 * r6.longValue();
        r13 = new java.util.Date(r11);
        r0 = X.C14240TsN.A03;
        r7 = new java.text.SimpleDateFormat("MMM", java.util.Locale.getDefault());
        r7.setTimeZone(X.C14240TsN.A03);
        r13 = r7.format(r13);
        r7 = new java.text.SimpleDateFormat("yyyy", X.C14240TsN.A05()).format(java.lang.Long.valueOf(r11));
        X.0qQ.A07(r7);
        r1 = X.002.A0T(r13, r7, ' ');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x06ba, code lost:
        r0 = X.C51967G9n.A1Y(r2, r6, 617141033);
        r46 = r2.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x06c5, code lost:
        if (r0 != false) goto L_0x06cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x06c9, code lost:
        if (r46 != r5) goto L_0x06d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x06cb, code lost:
        if (r1 != null) goto L_0x06cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x06cd, code lost:
        r1 = r49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x06cf, code lost:
        r2.FLL(r1);
        r46 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x06d4, code lost:
        r46 = (java.lang.String) r46;
        X.C286565Wx.A0L(r4, false);
        r0 = X.C54750HRi.A00(r2);
        r49 = X.C51967G9n.A0m(r2, 617145038);
        r1 = r49;
        r49 = r49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x06ec, code lost:
        if (r1 != r5) goto L_0x070f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x06ee, code lost:
        r100 = new X.AnonymousClass5Z4((X.AnonymousClass5Z2) null, (X.C268454dQ) null, X.AnonymousClass5ZD.A01, 0, 1, 4194297, 0, X.AnonymousClass5Z7.A01(14), 0, 0);
        r2.FLL(r100);
        r100 = r100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x070f, code lost:
        r49 = r49;
        X.C286565Wx.A0L(r4, false);
        r1 = X.C51967G9n.A0m(r2, 617149874);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x071f, code lost:
        if (r1 != r5) goto L_0x0753;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0721, code lost:
        r6 = X.0sn.A00;
        r7 = new X.C286025Tq(r6, r6, r46);
        r75 = X.AnonymousClass5SF.A05(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        r1 = new X.C289005cr(r0.A01(r7, r49, r0.A00, r0.A01, r0.A02, r6, r75).A02);
        r2.FLL(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0753, code lost:
        r68 = ((X.C289005cr) r1).A00;
        X.C286565Wx.A0L(r4, false);
        r0 = X.C51967G9n.A0m(r2, 617153752);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0763, code lost:
        if (r0 != r5) goto L_0x077e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0765, code lost:
        r0 = java.lang.Float.valueOf(X.C288025bF.A02(X.C289155d7.A01(r68)) + (A00(r15, 20.0f) * 2.0f));
        r2.FLL(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x077e, code lost:
        r100 = X.AnonymousClass7TE.A04(r0);
        X.C286565Wx.A0L(r4, false);
        r0 = X.C51967G9n.A0m(r2, 617158173);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x078c, code lost:
        if (r0 != r5) goto L_0x07a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x078e, code lost:
        r0 = java.lang.Float.valueOf((((float) r79) - A00(r15, (8.0f + 5.0f) + 18.0f)) - r100);
        r2.FLL(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x07a5, code lost:
        r59 = X.AnonymousClass7TE.A04(r0);
        X.C286565Wx.A0L(r4, false);
        r63 = r62.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x07b8, code lost:
        if (X.C51975G9x.A01(r63) != 0.0f) goto L_0x07cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x07ba, code lost:
        X.AnonymousClass7TE.A1Z(new X.C59714JUx(r62, (X.AnonymousClass4D7) null, r59, 4), r84);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x07cc, code lost:
        r0 = X.C51967G9n.A0m(r2, 617168573);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x07d3, code lost:
        if (r0 != r5) goto L_0x07e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x07d5, code lost:
        r0 = java.lang.Float.valueOf(((float) r77) - A00(r15, (r19 + 8.0f) + r19));
        r2.FLL(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x07e8, code lost:
        r58 = X.AnonymousClass7TE.A04(r0);
        X.C286565Wx.A0L(r4, false);
        r1 = X.C51967G9n.A1V(r2, 617173797, r61);
        r0 = r2.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x07fc, code lost:
        if (r1 != false) goto L_0x0800;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x07fe, code lost:
        if (r0 != r5) goto L_0x080b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0800, code lost:
        r0 = java.lang.Float.valueOf(((float) r61) * r9);
        r2.FLL(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x080b, code lost:
        r7 = X.AnonymousClass7TE.A04(r0);
        X.C286565Wx.A0L(r4, false);
        r2.ExS(617176524);
        r11 = r2.AGr(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0823, code lost:
        if (((r14 & 234881024) ^ 100663296) <= 67108864) goto L_0x082d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x082b, code lost:
        if (r2.AGr(r64) != false) goto L_0x0831;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x082d, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x082f, code lost:
        if ((r14 & 100663296) != 67108864) goto L_0x0832;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0831, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0832, code lost:
        r6 = r6 | r11;
        r0 = r2.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0837, code lost:
        if (r6 != false) goto L_0x083b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0839, code lost:
        if (r0 != r5) goto L_0x0846;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x083b, code lost:
        r0 = java.lang.Float.valueOf((r7 + r65) + r64);
        r2.FLL(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0846, code lost:
        r6 = X.AnonymousClass7TE.A04(r0);
        X.C286565Wx.A0L(r4, false);
        r2.ExS(617182886);
        r1 = r2.AGr(r6);
        r0 = r2.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x085b, code lost:
        if (r1 != false) goto L_0x085f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x085d, code lost:
        if (r0 != r5) goto L_0x086b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x085f, code lost:
        r0 = java.lang.Float.valueOf(r6 - ((float) r24));
        r2.FLL(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x086b, code lost:
        r12 = X.AnonymousClass7TE.A04(r0);
        X.C286565Wx.A0L(r4, false);
        r0 = X.C51967G9n.A0m(r2, 617187262);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0879, code lost:
        if (r0 != r5) goto L_0x0886;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x087b, code lost:
        r0 = java.lang.Float.valueOf(r59 - 200.0f);
        r2.FLL(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0886, code lost:
        r1 = X.AnonymousClass7TE.A04(r0);
        X.C286565Wx.A0L(r4, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0891, code lost:
        if (X.C51971G9r.A1W(r67) == false) goto L_0x0b7a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0899, code lost:
        if (X.C51975G9x.A01(r63) != r59) goto L_0x0b7a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x089b, code lost:
        r11 = java.lang.Float.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x089f, code lost:
        X.AnonymousClass7TE.A1Z(new X.MHD((java.lang.Object) r62, (java.lang.Object) r11, (X.AnonymousClass4D7) null, 33), r84);
        r2.ExS(617206265);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x08b9, code lost:
        if (X.C51971G9r.A1W(r67) == false) goto L_0x0b15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x08bb, code lost:
        r14 = (X.C51971G9r.A02(r42) - A00(r15, 8.0f)) / (r58 - A00(r15, 8.0f));
        r6 = r6 * r14;
        r12 = (int) (r12 * r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x08d4, code lost:
        if (r6 >= r9) goto L_0x0b0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x08d6, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x08d7, code lost:
        X.C51967G9n.A15(r41, r1);
        r0 = (float) r12;
        r6 = r61 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x08e3, code lost:
        if (r0 < (((float) r6) * r9)) goto L_0x0af7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x08e5, code lost:
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x08e6, code lost:
        r7 = 0;
        r0 = (X.AnonymousClass7TF.A1R(r1) ? 1.0f : 0.0f) * r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x08ed, code lost:
        if (r1 <= 0) goto L_0x08f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x08ef, code lost:
        r7 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x08f1, code lost:
        r11 = ((int) (r0 + (((float) r7) * r9))) - r12;
        r0 = X.C51967G9n.A0m(r2, 617245316);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x08fd, code lost:
        if (r0 != r5) goto L_0x0911;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x08ff, code lost:
        r0 = java.lang.Integer.valueOf((int) ((float) java.lang.Math.floor((double) (((float) r24) / r9))));
        r2.FLL(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0911, code lost:
        r7 = X.AnonymousClass7TE.A0M(r0);
        X.C286565Wx.A0L(r4, false);
        r6 = r6 - X.C229632nm.A03(r1 + r7, 0, r6);
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0923, code lost:
        if (r14 == 1.0f) goto L_0x092a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0925, code lost:
        r12 = (r6 * 3) + (!r146);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x092a, code lost:
        r0 = (((float) r24) - (((float) r11) + r9)) - (((float) (r7 - 1)) * r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0937, code lost:
        if (r14 != 1.0f) goto L_0x0af3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0939, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x093a, code lost:
        r7.invoke(java.lang.Integer.valueOf(r12), java.lang.Integer.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0947, code lost:
        X.C286565Wx.A0L(r4, false);
        r40 = X.C289325dP.A00(X.C51975G9x.A01(r63), X.C51971G9r.A02(r42));
        r13 = X.C51975G9x.A01(r63) + A00(r15, 20.0f);
        r12 = X.C51971G9r.A02(r42) + X.C51967G9n.A00(A00(r15, r19), (float) X.C289005cr.A00(r68));
        r11 = (0.0f - A00(r15, 4.0f)) + X.C51975G9x.A01(r63);
        r16 = (0.0f - X.C61380mr.A00((android.content.Context) r15.getValue(), 4.0f)) + X.C51971G9r.A02(r42);
        r7 = (X.C51975G9x.A01(r63) + r100) + A00(r15, 4.0f);
        r9 = X.C61380mr.A00((android.content.Context) r15.getValue(), 4.0f + r19) + X.C51971G9r.A02(r42);
        r0 = X.C51967G9n.A0m(r2, 617330710);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x09bd, code lost:
        if (r0 != r5) goto L_0x09ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x09bf, code lost:
        r0 = java.lang.Float.valueOf(r59 - A00(r15, 50.0f));
        r2.FLL(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x09ce, code lost:
        r70 = X.AnonymousClass7TE.A04(r0);
        X.C286565Wx.A0L(r4, false);
        r0 = X.C51967G9n.A0m(r2, 617333723);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x09dc, code lost:
        if (r0 != r5) goto L_0x09ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x09de, code lost:
        r0 = X.G9t.A0o(r2, java.lang.Float.valueOf(r16 - A00(r15, 50.0f)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x09ee, code lost:
        r65 = X.C51965G9l.A0J(r4, r0, false);
        r0 = X.C51967G9n.A0m(r2, 617336900);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x09f9, code lost:
        if (r0 != r5) goto L_0x0a0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x09fb, code lost:
        r0 = X.G9t.A0o(r2, java.lang.Float.valueOf(A00(r15, 50.0f) + r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0a0a, code lost:
        r66 = X.C51965G9l.A0J(r4, r0, false);
        r2.ExS(617342100);
        r1 = X.C51975G9x.A1R(r2, r13, r12, X.C51968G9o.A1U(r2, r46, (X.C51975G9x.A1R(r2, r7, r9, X.C51975G9x.A1R(r2, r11, r16, (X.C51968G9o.A1U(r2, r43, (X.C51970G9q.A1U(r2.AGt(r38)) | X.G9t.A1S(r2, 5.0f)) | X.G9t.A1S(r2, r19), X.G9t.A1S(r2, 3.0f)) | X.G9t.A1S(r2, r31)) | X.C51970G9q.A1U(r2.AGt(r82)))) | X.G9t.A1S(r2, 15.0f)) | X.C51970G9q.A1U(r2.AGt(r36)), r2.AGt(r40)));
        r0 = r2.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0a7a, code lost:
        if (r1 != false) goto L_0x0a7e;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0a7c, code lost:
        if (r0 != r5) goto L_0x0aa4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0a7e, code lost:
        r94 = new X.C58835IyK(r42, r43, r49, r46, r99, r100, r11, r16, r7, r9, r13, r12, r38, r36, r40, r82);
        r2.FLL(r94);
        r94 = r94;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0aa4, code lost:
        r6 = X.C51975G9x.A0I(r4, r28, r0, false);
        r1 = X.C60340gF.A00;
        r2.ExS(617395444);
        r7 = (X.G9t.A1S(r2, 8.0f) | X.G9t.A1S(r2, 50.0f)) | X.G9t.A1S(r2, r19);
        r0 = r2.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0aca, code lost:
        if (r7 != false) goto L_0x0ace;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0acc, code lost:
        if (r0 != r5) goto L_0x0ae4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0ace, code lost:
        r64 = new com.instagram.archive.ui.ArchiveReelComposeFragmentKt$fastScroll$6$1(r65, r66, r67, r42, (X.AnonymousClass4D7) null, r70, 8.0f, r58, 50.0f, r19);
        r2.FLL(r64);
        r64 = r64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0ae4, code lost:
        r28 = X.C51969G9p.A0W(r4, r6, r0, r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0aec, code lost:
        if (X.0fL.A02() == false) goto L_0x04da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0aee, code lost:
        r0 = -1190696513;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0af3, code lost:
        r0 = (int) (r9 - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0af9, code lost:
        if (r0 >= r9) goto L_0x0afe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0afb, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0afe, code lost:
        r1 = ((int) ((float) java.lang.Math.floor((double) ((r0 - r9) / r9)))) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0b0b, code lost:
        r1 = (int) ((float) java.lang.Math.floor((double) (r6 / r9)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0b15, code lost:
        r11 = (r61 - 1) - ((int) ((float) java.lang.Math.floor((double) (((float) r60.intValue()) / 3.0f))));
        r6 = r9 - ((float) (r24 - r34.intValue()));
        r1 = 0;
        r0 = (X.AnonymousClass7TF.A1R(r11) ? 1.0f : 0.0f) * r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0b38, code lost:
        if (r11 <= 0) goto L_0x0b3c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0b3a, code lost:
        r1 = r11 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0b3c, code lost:
        r11 = X.C229632nm.A01(java.math.BigDecimal.valueOf((double) ((((float) ((int) (r0 + (((float) r1) * r9)))) + r6) / r12)).setScale(5, java.math.RoundingMode.HALF_UP).floatValue());
        X.C51967G9n.A14(r42, X.C229632nm.A02(r58 * r11, A00(r15, 8.0f), r58));
        X.C51967G9n.A15(r41, (int) ((float) java.lang.Math.floor((double) ((r7 * r11) / r9))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0b7e, code lost:
        if (X.C51971G9r.A1W(r67) != false) goto L_0x0b8e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0b86, code lost:
        if (X.C51975G9x.A01(r63) != r1) goto L_0x0b8e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0b88, code lost:
        r11 = java.lang.Float.valueOf(r59);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0b8e, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0b91, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0b94, code lost:
        r6 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.C286575Wy r122, X.C66709MbG r123, java.lang.String r124, X.C62320sa r125, X.0sP r126, X.0sP r127, X.0sP r128, X.0sP r129, X.0sP r130, X.0sP r131, X.0sP r132, X.0sP r133, X.0sL r134, X.0sL r135, X.0sJ r136, X.AnonymousClass62P r137, X.YCQ r138, int r139, int r140, int r141, int r142, boolean r143, boolean r144, boolean r145, boolean r146, boolean r147) {
        /*
            r0 = 323124079(0x13427b6f, float:2.45471E-27)
            r2 = r122
            r2.ExV(r0)
            r18 = r140
            r0 = r140 & 14
            r117 = r137
            if (r0 != 0) goto L_0x0bc4
            r0 = r117
            int r8 = X.G9t.A0O(r2, r0)
            r8 = r8 | r140
        L_0x0018:
            r0 = r140 & 112(0x70, float:1.57E-43)
            r1 = 16
            r92 = r138
            if (r0 != 0) goto L_0x0027
            r0 = r92
            int r0 = X.G9t.A0P(r2, r0)
            r8 = r8 | r0
        L_0x0027:
            r0 = r18
            r0 = r0 & 896(0x380, float:1.256E-42)
            r54 = r123
            if (r0 != 0) goto L_0x0036
            r0 = r54
            int r0 = X.G9t.A0Q(r2, r0)
            r8 = r8 | r0
        L_0x0036:
            r0 = r18
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r57 = r143
            if (r0 != 0) goto L_0x0045
            r0 = r57
            int r0 = X.G9t.A0b(r2, r0)
            r8 = r8 | r0
        L_0x0045:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r140 & r0
            r116 = r139
            if (r0 != 0) goto L_0x0055
            r0 = r116
            int r0 = X.G9t.A09(r2, r0)
            r8 = r8 | r0
        L_0x0055:
            r23 = 458752(0x70000, float:6.42848E-40)
            r0 = r140 & r23
            r56 = r144
            if (r0 != 0) goto L_0x0064
            r0 = r56
            int r0 = X.G9t.A0d(r2, r0)
            r8 = r8 | r0
        L_0x0064:
            r30 = 3670016(0x380000, float:5.142788E-39)
            r0 = r140 & r30
            r55 = r145
            if (r0 != 0) goto L_0x0073
            r0 = r55
            int r0 = X.G9t.A0e(r2, r0)
            r8 = r8 | r0
        L_0x0073:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r140 & r0
            if (r0 != 0) goto L_0x0080
            r0 = r124
            int r0 = X.G9t.A0V(r2, r0)
            r8 = r8 | r0
        L_0x0080:
            r20 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r140 & r20
            r32 = r146
            if (r0 != 0) goto L_0x008f
            r0 = r32
            int r0 = X.G9t.A0g(r2, r0)
            r8 = r8 | r0
        L_0x008f:
            r21 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r140 & r21
            r115 = r147
            if (r0 != 0) goto L_0x009e
            r0 = r115
            int r0 = X.G9t.A0h(r2, r0)
            r8 = r8 | r0
        L_0x009e:
            r17 = r141
            r0 = r141 & 14
            r86 = r126
            if (r0 != 0) goto L_0x0bc0
            r0 = r86
            int r0 = X.C41848B3p.A01(r2, r0)
            r10 = r141 | r0
        L_0x00ae:
            r0 = r141 & 112(0x70, float:1.57E-43)
            r85 = r125
            if (r0 != 0) goto L_0x00bb
            r0 = r85
            int r0 = X.G9t.A0F(r2, r0)
            r10 = r10 | r0
        L_0x00bb:
            r0 = r17
            r0 = r0 & 896(0x380, float:1.256E-42)
            r123 = r127
            if (r0 != 0) goto L_0x00ca
            r0 = r123
            int r0 = X.G9t.A0G(r2, r0)
            r10 = r10 | r0
        L_0x00ca:
            r0 = r17
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r122 = r128
            if (r0 != 0) goto L_0x00d9
            r0 = r122
            int r0 = X.G9t.A0H(r2, r0)
            r10 = r10 | r0
        L_0x00d9:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r141 & r0
            r121 = r129
            if (r0 != 0) goto L_0x00e9
            r0 = r121
            int r0 = X.G9t.A0I(r2, r0)
            r10 = r10 | r0
        L_0x00e9:
            r0 = r141 & r23
            r120 = r130
            if (r0 != 0) goto L_0x00f6
            r0 = r120
            int r0 = X.G9t.A0J(r2, r0)
            r10 = r10 | r0
        L_0x00f6:
            r0 = r141 & r30
            r119 = r131
            if (r0 != 0) goto L_0x0103
            r0 = r119
            int r0 = X.G9t.A0K(r2, r0)
            r10 = r10 | r0
        L_0x0103:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r141 & r0
            r118 = r132
            if (r0 != 0) goto L_0x0112
            r0 = r118
            int r0 = X.G9t.A0L(r2, r0)
            r10 = r10 | r0
        L_0x0112:
            r0 = r141 & r20
            r88 = r134
            if (r0 != 0) goto L_0x011f
            r0 = r88
            int r0 = X.G9t.A0M(r2, r0)
            r10 = r10 | r0
        L_0x011f:
            r0 = r141 & r21
            r87 = r133
            if (r0 != 0) goto L_0x012c
            r0 = r87
            int r0 = X.G9t.A0N(r2, r0)
            r10 = r10 | r0
        L_0x012c:
            r78 = r142
            r0 = r142 & 14
            r89 = r135
            if (r0 != 0) goto L_0x0bbc
            r0 = r89
            int r0 = X.C41848B3p.A01(r2, r0)
            r22 = r142 | r0
        L_0x013c:
            r0 = r142 & 112(0x70, float:1.57E-43)
            r90 = r136
            if (r0 != 0) goto L_0x014e
            r0 = r90
            boolean r0 = r2.AGw(r0)
            if (r0 == 0) goto L_0x014c
            r1 = 32
        L_0x014c:
            r22 = r22 | r1
        L_0x014e:
            r3 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r1 = r8 & r3
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r0) goto L_0x01aa
            r3 = r3 & r10
            if (r3 != r0) goto L_0x01aa
            r1 = r22 & 91
            r0 = 18
            if (r1 != r0) goto L_0x01aa
            boolean r0 = r2.Bwn()
            if (r0 == 0) goto L_0x01aa
            r2.Evl()
        L_0x016a:
            X.5Xd r1 = r2.ASQ()
            if (r1 == 0) goto L_0x01a9
            X.JDl r0 = new X.JDl
            r58 = r0
            r59 = r54
            r60 = r124
            r61 = r85
            r62 = r86
            r63 = r123
            r64 = r122
            r65 = r121
            r66 = r120
            r67 = r119
            r68 = r118
            r69 = r87
            r70 = r88
            r71 = r89
            r72 = r90
            r73 = r117
            r74 = r92
            r75 = r116
            r76 = r18
            r77 = r17
            r79 = r57
            r80 = r56
            r81 = r55
            r82 = r32
            r83 = r115
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83)
            r1.A06 = r0
        L_0x01a9:
            return
        L_0x01aa:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x01b8
            r1 = -78919113(0xfffffffffb4bca37, float:-1.0581377E36)
            java.lang.String r0 = "com.instagram.archive.ui.ArchiveStoryGrid (ArchiveReelComposeFragment.kt:517)"
            X.0fL.A01(r1, r0)
        L_0x01b8:
            X.4bM r15 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A01
            X.5Oz r7 = X.C51968G9o.A0M(r2, r15)
            X.4bM r0 = X.AnonymousClass5YA.A01
            X.5Oz r53 = X.C51968G9o.A0M(r2, r0)
            X.4bM r0 = X.C286955Yl.A00
            X.5Oz r52 = X.C51968G9o.A0M(r2, r0)
            java.lang.Object r0 = r2.ECw()
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            java.lang.Object r0 = X.C51974G9v.A0Y(r2, r0, r5)
            X.6FV r0 = (X.AnonymousClass6FV) r0
            X.4Cq r0 = r0.A00
            r84 = r0
            r50 = 3
            r3 = 0
            androidx.compose.foundation.lazy.grid.LazyGridState r51 = X.C56383Hxc.A00(r2)
            r1 = -291008258(0xffffffffeea790fe, float:-2.592964E28)
            r0 = r51
            boolean r0 = X.C51967G9n.A1Y(r2, r0, r1)
            java.lang.Object r1 = r2.ECw()
            if (r0 != 0) goto L_0x01f2
            if (r1 != r5) goto L_0x01fe
        L_0x01f2:
            r4 = 33
            X.MME r1 = new X.MME
            r0 = r51
            r1.<init>(r0, r4)
            r2.FLL(r1)
        L_0x01fe:
            X.0sa r1 = (X.C62320sa) r1
            X.5Wx r4 = X.C51965G9l.A0H(r2, r3)
            r48 = 0
            r0 = r48
            X.5TX r19 = X.C51965G9l.A0I(r0, r1)
            r1 = 23592979(0x1680013, float:4.2611723E-38)
            r27 = 0
            r0 = r51
            X.C52384GQj.A01(r0, r2, r1, r3)
            r0 = -291004001(0xffffffffeea7a19f, float:-2.5939692E28)
            java.lang.Object r0 = X.C51967G9n.A0m(r2, r0)
            if (r0 != r5) goto L_0x0228
            r0 = 0
            X.5d0 r0 = X.C51965G9l.A0T(r0)
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.G9t.A0o(r2, r0)
        L_0x0228:
            X.5Oz r80 = X.C51965G9l.A0J(r4, r0, r3)
            r0 = -291002113(0xffffffffeea7a8ff, float:-2.594415E28)
            java.lang.Object r0 = X.C51967G9n.A0m(r2, r0)
            if (r0 != r5) goto L_0x023e
            r0 = 0
            X.5d0 r0 = X.C51965G9l.A0T(r0)
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.G9t.A0o(r2, r0)
        L_0x023e:
            X.5Oz r81 = X.C51965G9l.A0J(r4, r0, r3)
            r0 = -291000155(0xffffffffeea7b0a5, float:-2.5948773E28)
            java.lang.Object r0 = X.C51967G9n.A0m(r2, r0)
            if (r0 != r5) goto L_0x025d
            java.lang.Object r0 = r7.getValue()
            android.content.Context r0 = (android.content.Context) r0
            X.0nA.A0H(r0)
            r0 = 1058013184(0x3f100000, float:0.5625)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.FLL(r0)
        L_0x025d:
            float r93 = X.AnonymousClass7TE.A04(r0)
            X.C286565Wx.A0L(r4, r3)
            if (r54 == 0) goto L_0x0272
            r0 = r54
            java.lang.Object r0 = r0.A02
            if (r0 == 0) goto L_0x0272
            if (r144 == 0) goto L_0x0272
            if (r143 != 0) goto L_0x0272
            r27 = 1
        L_0x0272:
            r0 = -290991516(0xffffffffeea7d264, float:-2.5969172E28)
            boolean r0 = X.C51974G9v.A1X(r2, r0, r8)
            java.lang.Object r29 = r2.ECw()
            if (r0 != 0) goto L_0x0283
            r0 = r29
            if (r0 != r5) goto L_0x0290
        L_0x0283:
            java.util.List r0 = X.00k.A0Y(r117)
            X.62P r29 = X.AnonymousClass62Q.A00(r0)
            r0 = r29
            r2.FLL(r0)
        L_0x0290:
            r0 = r29
            X.62P r0 = (X.AnonymousClass62P) r0
            r29 = r0
            X.C286565Wx.A0L(r4, r3)
            X.IGW r9 = X.C51975G9x.A0C(r51)
            X.5d6 r0 = r9.A0G
            long r11 = X.G9t.A0m(r0)
            r66 = 32
            long r0 = r11 >> r66
            int r6 = (int) r0
            r79 = r6
            int r24 = X.C289005cr.A00(r11)
            int r6 = r9.A06
            int r0 = r9.A07
            r77 = r0
            java.util.List r14 = r9.A0C
            java.lang.Object r11 = X.00k.A0L(r14)
            X.MW2 r11 = (X.MW2) r11
            java.lang.Object r0 = X.00k.A0J(r14)
            X.MW2 r0 = (X.MW2) r0
            X.0rm r9 = X.C51965G9l.A11()
            if (r11 == 0) goto L_0x0bb9
            r1 = r11
            X.IFG r1 = (X.IFG) r1
            int r1 = r1.A08
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x02d1:
            r9.A00 = r1
            X.0rm r1 = X.C51965G9l.A11()
            if (r0 == 0) goto L_0x0bb6
            X.IFG r0 = (X.IFG) r0
            int r0 = r0.A08
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x02e1:
            r1.A00 = r0
            if (r11 == 0) goto L_0x0bb2
            X.IFG r11 = (X.IFG) r11
            long r11 = r11.A05
            int r11 = X.C51968G9o.A02(r11)
            java.lang.Integer r34 = java.lang.Integer.valueOf(r11)
        L_0x02f1:
            if (r6 <= 0) goto L_0x0318
            java.lang.Object r11 = r9.A00
            if (r11 == 0) goto L_0x0318
            if (r0 == 0) goto L_0x0318
            r12 = r146 ^ 1
            if (r27 == 0) goto L_0x02ff
            int r12 = r12 + 1
        L_0x02ff:
            int r6 = r6 - r12
            int r0 = X.AnonymousClass7TE.A0M(r11)
            int r0 = r0 - r12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.A00 = r0
            java.lang.Object r0 = r1.A00
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r0 = r0 - r12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
        L_0x0318:
            r0 = -290953859(0xffffffffeea8657d, float:-2.6058087E28)
            java.lang.Object r0 = X.C51967G9n.A0m(r2, r0)
            if (r0 != r5) goto L_0x0329
            java.lang.Float r0 = X.C51967G9n.A0g()
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.G9t.A0o(r2, r0)
        L_0x0329:
            X.5Oz r13 = X.C51965G9l.A0J(r4, r0, r3)
            r0 = -290951875(0xffffffffeea86d3d, float:-2.6062771E28)
            java.lang.Object r0 = X.C51967G9n.A0m(r2, r0)
            if (r0 != r5) goto L_0x033e
            java.lang.Float r0 = X.C51967G9n.A0g()
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.G9t.A0o(r2, r0)
        L_0x033e:
            X.5Oz r12 = X.C51965G9l.A0J(r4, r0, r3)
            r0 = 0
            if (r146 != 0) goto L_0x0347
            r0 = 1106247680(0x41f00000, float:30.0)
        L_0x0347:
            float r0 = A00(r7, r0)
            X.C51967G9n.A14(r13, r0)
            if (r27 == 0) goto L_0x0baf
            r11 = 1115684864(0x42800000, float:64.0)
            java.lang.Object r0 = r81.getValue()
            X.5d0 r0 = (X.C289095d0) r0
            float r0 = r0.A00
            float r11 = r11 + r0
        L_0x035b:
            java.lang.Object r0 = r7.getValue()
            android.content.Context r0 = (android.content.Context) r0
            float r0 = X.C61380mr.A00(r0, r11)
            X.C51967G9n.A14(r12, r0)
            if (r145 == 0) goto L_0x0387
            r11 = r92
            r0 = r123
            boolean r0 = X.0qQ.A0K(r11, r0)
            if (r0 != 0) goto L_0x0387
            java.lang.Object r11 = r52.getValue()
            com.instagram.common.session.UserSession r11 = (com.instagram.common.session.UserSession) r11
            r0 = r124
            com.instagram.model.reels.Reel r11 = X.Dba.A0L(r11, r0)
            if (r11 == 0) goto L_0x0ba8
            r0 = r122
            r0.invoke(r11)
        L_0x0387:
            r0 = -290926332(0xffffffffeea8d104, float:-2.6123083E28)
            r2.ExS(r0)
            r11 = -1
            r0 = r116
            if (r0 == r11) goto L_0x03d4
            r11 = -290924941(0xffffffffeea8d673, float:-2.6126367E28)
            r0 = r51
            boolean r11 = X.C51967G9n.A1Y(r2, r0, r11)
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r8
            boolean r16 = X.C51972G9s.A1K(r0)
            r16 = r16 | r11
            r11 = r10 & r23
            r0 = 131072(0x20000, float:1.83671E-40)
            boolean r0 = X.AnonymousClass7TF.A1S(r11, r0)
            r16 = r16 | r0
            java.lang.Object r0 = r2.ECw()
            if (r16 != 0) goto L_0x03b7
            if (r0 != r5) goto L_0x03cb
        L_0x03b7:
            r40 = 2
            X.JTZ r0 = new X.JTZ
            r35 = r0
            r36 = r120
            r37 = r51
            r38 = r48
            r39 = r116
            r35.<init>(r36, r37, r38, r39, r40)
            r2.FLL(r0)
        L_0x03cb:
            X.0sL r11 = X.C51965G9l.A10(r4, r0)
            r0 = r84
            X.AnonymousClass7TE.A1Z(r11, r0)
        L_0x03d4:
            X.C286565Wx.A0L(r4, r3)
            java.lang.Object r11 = r1.A00
            r47 = 4
            X.JVZ r0 = new X.JVZ
            r35 = r0
            r36 = r52
            r37 = r1
            r38 = r14
            r39 = r29
            r40 = r9
            r41 = r119
            r42 = r118
            r43 = r48
            r44 = r47
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r1 = r117
            X.C286645Xf.A02(r2, r1, r11, r0)
            X.5Qk r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r28 = X.G9t.A0p(r2, r0)
            java.lang.Object r0 = r9.A00
            r60 = r0
            r0 = r60
            java.lang.Number r0 = (java.lang.Number) r0
            r60 = r0
            java.lang.Object r0 = r81.getValue()
            X.5d0 r0 = (X.C289095d0) r0
            float r0 = r0.A00
            float r9 = A00(r7, r0)
            float r65 = X.C51971G9r.A02(r13)
            float r64 = X.C51971G9r.A02(r12)
            java.lang.Object r0 = r19.getValue()
            boolean r11 = X.AnonymousClass7TE.A1a(r0)
            X.JG1 r40 = new X.JG1
            r7 = r40
            r1 = r84
            r0 = r51
            r7.<init>(r3, r0, r1)
            int r0 = r8 << 6
            r0 = r0 & 896(0x380, float:1.256E-42)
            r14 = r0 | 64
            int r0 = r8 << 3
            r0 = r0 & r21
            r14 = r14 | r0
            r0 = 1754909386(0x6899caca, float:5.810103E24)
            X.5Yw r0 = X.C51967G9n.A0a(r2, r0)
            long r0 = r0.A0n
            r7 = 1058642330(0x3f19999a, float:0.6)
            r16 = 0
            r63 = 14
            long r38 = X.C285595Rx.A02(X.AnonymousClass5RX.A0K[(int) (r0 & 63)], X.AnonymousClass5RW.A03(r0), X.AnonymousClass5RW.A02(r0), X.AnonymousClass5RW.A01(r0), r7)
            r25 = 1084227584(0x40a00000, float:5.0)
            r26 = 1077936128(0x40400000, float:3.0)
            long r36 = X.C51965G9l.A09(r2)
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r2)
            long r0 = r0.A0y
            r82 = r0
            r23 = 1082130432(0x40800000, float:4.0)
            r44 = 1097859072(0x41700000, float:15.0)
            r59 = 1099956224(0x41900000, float:18.0)
            r35 = 1101004800(0x41a00000, float:20.0)
            r0 = 2131965491(0x7f133633, float:1.9567793E38)
            java.lang.String r49 = X.C288035bG.A00(r2, r0)
            r58 = 1090519040(0x41000000, float:8.0)
            r45 = 1112014848(0x42480000, float:50.0)
            r33 = 1090519040(0x41000000, float:8.0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0ba2
            r1 = 560240499(0x21649773, float:7.7449846E-19)
            r31 = 1102053376(0x41b00000, float:22.0)
            java.lang.String r0 = "com.instagram.archive.ui.fastScroll (ArchiveReelComposeFragment.kt:953)"
            r19 = 1106247680(0x41f00000, float:30.0)
            X.0fL.A01(r1, r0)
        L_0x0486:
            if (r60 == 0) goto L_0x0b97
            if (r34 == 0) goto L_0x0b97
            r0 = 617087728(0x24c802f0, float:8.674115E-17)
            java.lang.Object r0 = X.C51974G9v.A0X(r2, r5, r0, r3)
            X.5Oz r67 = X.C51965G9l.A0J(r4, r0, r3)
            if (r11 != 0) goto L_0x049f
            boolean r0 = X.C51971G9r.A1W(r67)
            r71 = 0
            if (r0 == 0) goto L_0x04a3
        L_0x049f:
            r71 = 1065353216(0x3f800000, float:1.0)
            if (r11 != 0) goto L_0x04ab
        L_0x04a3:
            boolean r0 = X.C51971G9r.A1W(r67)
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 == 0) goto L_0x04ac
        L_0x04ab:
            r1 = 0
        L_0x04ac:
            r0 = 1200(0x4b0, float:1.682E-42)
            X.GQC r68 = X.GQC.A00(r1, r0)
            r72 = 3072(0xc00, float:4.305E-42)
            r73 = 20
            r69 = r2
            r70 = r48
            X.4gU r43 = X.I69.A02(r68, r69, r70, r71, r72, r73)
            float r0 = X.C51971G9r.A03(r43)
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x0595
            X.J0S r1 = X.J0S.A00
            r0 = r28
            androidx.compose.ui.Modifier r28 = X.C289575dp.A01(r0, r1)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x04da
            r0 = 1772235304(0x69a22a28, float:2.4505633E25)
        L_0x04d7:
            X.0fL.A00(r0)
        L_0x04da:
            X.C286565Wx.A0L(r4, r3)
            X.IF4 r9 = new X.IF4
            r0 = r50
            r9.<init>(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            X.6Fc r24 = X.C287275Zs.A01(r0)
            X.6Fc r23 = X.C287275Zs.A01(r0)
            r0 = -290840775(0xffffffffeeaa1f39, float:-2.6325099E28)
            r2.ExS(r0)
            r0 = r8 & r20
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            boolean r1 = X.AnonymousClass7TF.A1S(r0, r7)
            r0 = r27
            boolean r6 = r2.AGv(r0)
            r6 = r6 | r1
            boolean r0 = X.C51973G9u.A1I(r8)
            r6 = r6 | r0
            r0 = r8 & r21
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r3)
            r6 = r6 | r0
            r1 = r10 & 14
            r0 = r47
            boolean r0 = X.AnonymousClass7TF.A1S(r1, r0)
            r6 = r6 | r0
            r0 = r20
            boolean r0 = X.C51972G9s.A1P(r10, r0, r7)
            r6 = r6 | r0
            r0 = r21
            boolean r1 = X.C51972G9s.A1P(r10, r0, r3)
            r0 = r29
            boolean r3 = X.C51968G9o.A1U(r2, r0, r6, r1)
            r0 = r30
            boolean r1 = X.C51973G9u.A1M(r8, r0)
            r0 = r52
            boolean r3 = X.C51968G9o.A1U(r2, r0, r3, r1)
            r1 = r22 & 14
            r0 = r47
            boolean r0 = X.AnonymousClass7TF.A1S(r1, r0)
            r3 = r3 | r0
            boolean r0 = X.C51972G9s.A1L(r10)
            r3 = r3 | r0
            boolean r1 = X.C51972G9s.A1L(r22)
            r0 = r53
            boolean r1 = X.C51968G9o.A1U(r2, r0, r3, r1)
            boolean r0 = X.C51972G9s.A1L(r8)
            r1 = r1 | r0
            java.lang.Object r0 = r2.ECw()
            if (r1 != 0) goto L_0x055e
            if (r0 != r5) goto L_0x0578
        L_0x055e:
            X.IyL r0 = new X.IyL
            r79 = r0
            r82 = r53
            r83 = r52
            r84 = r54
            r91 = r29
            r94 = r32
            r95 = r27
            r96 = r115
            r97 = r55
            r79.<init>(r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97)
            r2.FLL(r0)
        L_0x0578:
            X.0sP r29 = X.C51965G9l.A0z(r4, r0)
            r30 = 27648(0x6c00, float:3.8743E-41)
            r25 = r9
            r26 = r51
            r27 = r2
            A02(r23, r24, r25, r26, r27, r28, r29, r30)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x016a
            r0 = -1007775905(0xffffffffc3ee8f5f, float:-477.1201)
            X.0fL.A00(r0)
            goto L_0x016a
        L_0x0595:
            X.5Oz r15 = X.C51968G9o.A0M(r2, r15)
            r0 = 617107689(0x24c850e9, float:8.687324E-17)
            java.lang.Object r62 = X.C51967G9n.A0m(r2, r0)
            r0 = r62
            if (r0 != r5) goto L_0x05ad
            X.5b4 r62 = X.C287705ad.A00(r16)
            r0 = r62
            r2.FLL(r0)
        L_0x05ad:
            r0 = r62
            X.5b4 r0 = (X.AnonymousClass5b4) r0
            r62 = r0
            X.C286565Wx.A0L(r4, r3)
            r0 = 617109322(0x24c8574a, float:8.688405E-17)
            java.lang.Object r0 = X.C51967G9n.A0m(r2, r0)
            if (r0 != r5) goto L_0x05d0
            r0 = r79
            float r1 = (float) r0
            float r0 = r25 + r58
            float r0 = A00(r15, r0)
            float r1 = r1 - r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r2.FLL(r0)
        L_0x05d0:
            float r99 = X.AnonymousClass7TE.A04(r0)
            X.C286565Wx.A0L(r4, r3)
            r0 = 617112941(0x24c8656d, float:8.6907996E-17)
            java.lang.Object r0 = X.C51967G9n.A0m(r2, r0)
            if (r0 != r5) goto L_0x05e8
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.G9t.A0o(r2, r0)
        L_0x05e8:
            X.5Oz r42 = X.C51965G9l.A0J(r4, r0, r3)
            r0 = 617116972(0x24c8752c, float:8.693467E-17)
            java.lang.Object r0 = X.C51967G9n.A0m(r2, r0)
            if (r0 != r5) goto L_0x05fd
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.G9t.A0o(r2, r0)
        L_0x05fd:
            X.5Oz r41 = X.C51965G9l.A0J(r4, r0, r3)
            r0 = 617123174(0x24c88d66, float:8.697571E-17)
            r2.ExS(r0)
            r0 = r14 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 ^ 3072(0xc00, float:4.305E-42)
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 <= r1) goto L_0x0615
            boolean r0 = r2.AGs(r6)
            if (r0 != 0) goto L_0x061a
        L_0x0615:
            r0 = r14 & 3072(0xc00, float:4.305E-42)
            r7 = 0
            if (r0 != r1) goto L_0x061b
        L_0x061a:
            r7 = 1
        L_0x061b:
            java.lang.Object r0 = r2.ECw()
            if (r7 != 0) goto L_0x0623
            if (r0 != r5) goto L_0x0634
        L_0x0623:
            float r0 = (float) r6
            float r0 = r0 / r26
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r6 = (float) r0
            int r0 = (int) r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.FLL(r0)
        L_0x0634:
            int r61 = X.AnonymousClass7TE.A0M(r0)
            X.C286565Wx.A0L(r4, r3)
            java.lang.Object r0 = X.00k.A0K(r117)
            X.Hqi r0 = (X.C55977Hqi) r0
            long r0 = r0.A01
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            int r1 = X.C51971G9r.A0B(r41)
            if (r1 < 0) goto L_0x0677
            r0 = r61
            if (r1 >= r0) goto L_0x0677
            int r0 = X.C51971G9r.A0B(r41)
            int r1 = r0 * 3
            int r0 = r117.size()
            r6 = 1
            int r0 = r0 - r6
            int r1 = X.C229632nm.A03(r1, r3, r0)
            r0 = r117
            java.lang.Object r1 = r0.get(r1)
            X.Hqi r1 = (X.C55977Hqi) r1
            X.3uh r0 = r1.A03
            if (r0 == 0) goto L_0x0b94
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x0b94
            long r0 = r1.A01
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
        L_0x0677:
            if (r6 == 0) goto L_0x0b91
            long r0 = r6.longValue()
            r11 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r0
            java.util.Date r13 = new java.util.Date
            r13.<init>(r11)
            java.util.TimeZone r0 = X.C14240TsN.A03
            java.util.Locale r46 = java.util.Locale.getDefault()
            java.lang.String r0 = "MMM"
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat
            r1 = r0
            r0 = r46
            r7.<init>(r1, r0)
            java.util.TimeZone r0 = X.C14240TsN.A03
            r7.setTimeZone(r0)
            java.lang.String r13 = r7.format(r13)
            java.util.Locale r0 = X.C14240TsN.A05()
            java.lang.String r7 = "yyyy"
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r7, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            java.lang.String r7 = r1.format(r0)
            X.0qQ.A07(r7)
            r0 = r66
            java.lang.String r1 = X.002.A0T(r13, r7, r0)
        L_0x06ba:
            r0 = 617141033(0x24c8d329, float:8.709389E-17)
            boolean r0 = X.C51967G9n.A1Y(r2, r6, r0)
            java.lang.Object r46 = r2.ECw()
            if (r0 != 0) goto L_0x06cb
            r0 = r46
            if (r0 != r5) goto L_0x06d4
        L_0x06cb:
            if (r1 != 0) goto L_0x06cf
            r1 = r49
        L_0x06cf:
            r2.FLL(r1)
            r46 = r1
        L_0x06d4:
            r0 = r46
            java.lang.String r0 = (java.lang.String) r0
            r46 = r0
            X.C286565Wx.A0L(r4, r3)
            r105 = 1
            X.I0i r0 = X.C54750HRi.A00(r2)
            r1 = 617145038(0x24c8e2ce, float:8.7120396E-17)
            java.lang.Object r49 = X.C51967G9n.A0m(r2, r1)
            r1 = r49
            if (r1 != r5) goto L_0x070f
            X.5ZD r103 = X.AnonymousClass5ZD.A01
            long r109 = X.AnonymousClass5Z7.A01(r63)
            r107 = 0
            r106 = 4194297(0x3ffff9, float:5.877462E-39)
            X.5Z4 r49 = new X.5Z4
            r100 = r49
            r101 = r48
            r102 = r48
            r104 = r3
            r111 = r107
            r113 = r107
            r100.<init>(r101, r102, r103, r104, r105, r106, r107, r109, r111, r113)
            r1 = r49
            r2.FLL(r1)
        L_0x070f:
            r1 = r49
            X.5Z4 r1 = (X.AnonymousClass5Z4) r1
            r49 = r1
            X.C286565Wx.A0L(r4, r3)
            r1 = 617149874(0x24c8f5b2, float:8.71524E-17)
            java.lang.Object r1 = X.C51967G9n.A0m(r2, r1)
            if (r1 != r5) goto L_0x0753
            X.0sn r6 = X.0sn.A00
            X.5Tq r7 = new X.5Tq
            r1 = r46
            r7.<init>(r6, r6, r1)
            r1 = 2147483647(0x7fffffff, float:NaN)
            long r75 = X.AnonymousClass5SF.A05(r3, r1, r3, r1)
            X.5Q8 r12 = r0.A02
            X.4cd r11 = r0.A01
            X.5Uu r1 = r0.A00
            r68 = r0
            r69 = r7
            r70 = r49
            r71 = r1
            r72 = r11
            r73 = r12
            r74 = r6
            X.62f r0 = r68.A01(r69, r70, r71, r72, r73, r74, r75)
            long r6 = r0.A02
            X.5cr r1 = new X.5cr
            r1.<init>(r6)
            r2.FLL(r1)
        L_0x0753:
            X.5cr r1 = (X.C289005cr) r1
            long r0 = r1.A00
            r68 = r0
            X.C286565Wx.A0L(r4, r3)
            r0 = 617153752(0x24c904d8, float:8.717806E-17)
            java.lang.Object r0 = X.C51967G9n.A0m(r2, r0)
            if (r0 != r5) goto L_0x077e
            long r0 = X.C289155d7.A01(r68)
            float r6 = X.C288025bF.A02(r0)
            r0 = r35
            float r1 = A00(r15, r0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r0
            float r6 = r6 + r1
            java.lang.Float r0 = java.lang.Float.valueOf(r6)
            r2.FLL(r0)
        L_0x077e:
            float r100 = X.AnonymousClass7TE.A04(r0)
            X.C286565Wx.A0L(r4, r3)
            r0 = 617158173(0x24c9161d, float:8.7207316E-17)
            java.lang.Object r0 = X.C51967G9n.A0m(r2, r0)
            if (r0 != r5) goto L_0x07a5
            r0 = r79
            float r1 = (float) r0
            float r58 = r58 + r25
            float r58 = r58 + r59
            r0 = r58
            float r0 = A00(r15, r0)
            float r1 = r1 - r0
            float r1 = r1 - r100
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r2.FLL(r0)
        L_0x07a5:
            float r59 = X.AnonymousClass7TE.A04(r0)
            X.C286565Wx.A0L(r4, r3)
            r0 = r62
            X.5b5 r0 = r0.A04
            r63 = r0
            float r0 = X.C51975G9x.A01(r63)
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x07cc
            X.JUx r11 = new X.JUx
            r7 = r62
            r6 = r48
            r1 = r59
            r0 = r47
            r11.<init>(r7, r6, r1, r0)
            r0 = r84
            X.AnonymousClass7TE.A1Z(r11, r0)
        L_0x07cc:
            r0 = 617168573(0x24c93ebd, float:8.727614E-17)
            java.lang.Object r0 = X.C51967G9n.A0m(r2, r0)
            if (r0 != r5) goto L_0x07e8
            r0 = r77
            float r1 = (float) r0
            float r0 = r19 + r33
            float r0 = r0 + r19
            float r0 = A00(r15, r0)
            float r1 = r1 - r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r2.FLL(r0)
        L_0x07e8:
            float r58 = X.AnonymousClass7TE.A04(r0)
            X.C286565Wx.A0L(r4, r3)
            r1 = 617173797(0x24c95325, float:8.731071E-17)
            r0 = r61
            boolean r1 = X.C51967G9n.A1V(r2, r1, r0)
            java.lang.Object r0 = r2.ECw()
            if (r1 != 0) goto L_0x0800
            if (r0 != r5) goto L_0x080b
        L_0x0800:
            r0 = r61
            float r0 = (float) r0
            float r0 = r0 * r9
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.FLL(r0)
        L_0x080b:
            float r7 = X.AnonymousClass7TE.A04(r0)
            X.C286565Wx.A0L(r4, r3)
            r0 = 617176524(0x24c95dcc, float:8.732875E-17)
            r2.ExS(r0)
            boolean r11 = r2.AGr(r7)
            r0 = r14 & r20
            r6 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 ^ r6
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            if (r0 <= r1) goto L_0x082d
            r0 = r64
            boolean r0 = r2.AGr(r0)
            if (r0 != 0) goto L_0x0831
        L_0x082d:
            r14 = r14 & r6
            r6 = 0
            if (r14 != r1) goto L_0x0832
        L_0x0831:
            r6 = 1
        L_0x0832:
            r6 = r6 | r11
            java.lang.Object r0 = r2.ECw()
            if (r6 != 0) goto L_0x083b
            if (r0 != r5) goto L_0x0846
        L_0x083b:
            float r0 = r7 + r65
            float r0 = r0 + r64
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.FLL(r0)
        L_0x0846:
            float r6 = X.AnonymousClass7TE.A04(r0)
            X.C286565Wx.A0L(r4, r3)
            r0 = 617182886(0x24c976a6, float:8.737085E-17)
            r2.ExS(r0)
            boolean r1 = r2.AGr(r6)
            java.lang.Object r0 = r2.ECw()
            if (r1 != 0) goto L_0x085f
            if (r0 != r5) goto L_0x086b
        L_0x085f:
            r0 = r24
            float r0 = (float) r0
            float r0 = r6 - r0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.FLL(r0)
        L_0x086b:
            float r12 = X.AnonymousClass7TE.A04(r0)
            X.C286565Wx.A0L(r4, r3)
            r0 = 617187262(0x24c987be, float:8.739981E-17)
            java.lang.Object r0 = X.C51967G9n.A0m(r2, r0)
            if (r0 != r5) goto L_0x0886
            r0 = 1128792064(0x43480000, float:200.0)
            float r0 = r59 - r0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.FLL(r0)
        L_0x0886:
            float r1 = X.AnonymousClass7TE.A04(r0)
            X.C286565Wx.A0L(r4, r3)
            boolean r0 = X.C51971G9r.A1W(r67)
            if (r0 == 0) goto L_0x0b7a
            float r0 = X.C51975G9x.A01(r63)
            int r0 = (r0 > r59 ? 1 : (r0 == r59 ? 0 : -1))
            if (r0 != 0) goto L_0x0b7a
            java.lang.Float r11 = java.lang.Float.valueOf(r1)
        L_0x089f:
            r14 = 33
            X.MHD r13 = new X.MHD
            r1 = r62
            r0 = r48
            r13.<init>((java.lang.Object) r1, (java.lang.Object) r11, (X.AnonymousClass4D7) r0, (int) r14)
            r0 = r84
            X.AnonymousClass7TE.A1Z(r13, r0)
            r0 = 617206265(0x24c9d1f9, float:8.752556E-17)
            r2.ExS(r0)
            boolean r0 = X.C51971G9r.A1W(r67)
            if (r0 == 0) goto L_0x0b15
            float r14 = X.C51971G9r.A02(r42)
            r0 = r33
            float r0 = A00(r15, r0)
            float r14 = r14 - r0
            r0 = r33
            float r0 = A00(r15, r0)
            float r0 = r58 - r0
            float r14 = r14 / r0
            float r6 = r6 * r14
            float r12 = r12 * r14
            int r12 = (int) r12
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0b0b
            r1 = 0
        L_0x08d7:
            r0 = r41
            X.C51967G9n.A15(r0, r1)
            float r0 = (float) r12
            int r6 = r61 + -1
            float r1 = (float) r6
            float r1 = r1 * r9
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0af7
            r1 = r6
        L_0x08e6:
            r7 = 0
            boolean r0 = X.AnonymousClass7TF.A1R(r1)
            float r0 = (float) r0
            float r0 = r0 * r9
            if (r1 <= 0) goto L_0x08f1
            int r7 = r1 + -1
        L_0x08f1:
            float r7 = (float) r7
            float r7 = r7 * r9
            float r0 = r0 + r7
            int r11 = (int) r0
            int r11 = r11 - r12
            r0 = 617245316(0x24ca6a84, float:8.778398E-17)
            java.lang.Object r0 = X.C51967G9n.A0m(r2, r0)
            if (r0 != r5) goto L_0x0911
            r0 = r24
            float r0 = (float) r0
            float r0 = r0 / r9
            double r12 = (double) r0
            double r12 = java.lang.Math.floor(r12)
            float r0 = (float) r12
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.FLL(r0)
        L_0x0911:
            int r7 = X.AnonymousClass7TE.A0M(r0)
            X.C286565Wx.A0L(r4, r3)
            int r1 = r1 + r7
            int r0 = X.C229632nm.A03(r1, r3, r6)
            int r6 = r6 - r0
            r13 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            r12 = 0
            if (r0 == 0) goto L_0x092a
            int r12 = r6 * 3
            r0 = r146 ^ 1
            int r12 = r12 + r0
        L_0x092a:
            r0 = r24
            float r0 = (float) r0
            float r1 = (float) r11
            float r1 = r1 + r9
            float r0 = r0 - r1
            int r7 = r7 - r105
            float r1 = (float) r7
            float r1 = r1 * r9
            float r0 = r0 - r1
            int r1 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r1 != 0) goto L_0x0af3
            r0 = 0
        L_0x093a:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = r40
            r0.invoke(r6, r1)
        L_0x0947:
            X.C286565Wx.A0L(r4, r3)
            float r1 = X.C51975G9x.A01(r63)
            float r0 = X.C51971G9r.A02(r42)
            long r40 = X.C289325dP.A00(r1, r0)
            float r13 = X.C51975G9x.A01(r63)
            r0 = r35
            float r0 = A00(r15, r0)
            float r13 = r13 + r0
            float r12 = X.C51971G9r.A02(r42)
            r0 = r19
            float r1 = A00(r15, r0)
            int r0 = X.C289005cr.A00(r68)
            float r0 = (float) r0
            float r0 = X.C51967G9n.A00(r1, r0)
            float r12 = r12 + r0
            r0 = r23
            float r0 = A00(r15, r0)
            float r11 = r16 - r0
            float r0 = X.C51975G9x.A01(r63)
            float r11 = r11 + r0
            java.lang.Object r1 = r15.getValue()
            android.content.Context r1 = (android.content.Context) r1
            r0 = r23
            float r0 = X.C61380mr.A00(r1, r0)
            float r16 = r16 - r0
            float r0 = X.C51971G9r.A02(r42)
            float r16 = r16 + r0
            float r7 = X.C51975G9x.A01(r63)
            float r7 = r7 + r100
            r0 = r23
            float r0 = A00(r15, r0)
            float r7 = r7 + r0
            float r6 = X.C51971G9r.A02(r42)
            float r23 = r23 + r19
            java.lang.Object r1 = r15.getValue()
            android.content.Context r1 = (android.content.Context) r1
            r0 = r23
            float r9 = X.C61380mr.A00(r1, r0)
            float r9 = r9 + r6
            r0 = 617330710(0x24cbb816, float:8.834907E-17)
            java.lang.Object r0 = X.C51967G9n.A0m(r2, r0)
            if (r0 != r5) goto L_0x09ce
            r0 = r45
            float r0 = A00(r15, r0)
            float r59 = r59 - r0
            java.lang.Float r0 = java.lang.Float.valueOf(r59)
            r2.FLL(r0)
        L_0x09ce:
            float r70 = X.AnonymousClass7TE.A04(r0)
            X.C286565Wx.A0L(r4, r3)
            r0 = 617333723(0x24cbc3db, float:8.836901E-17)
            java.lang.Object r0 = X.C51967G9n.A0m(r2, r0)
            if (r0 != r5) goto L_0x09ee
            r0 = r45
            float r0 = A00(r15, r0)
            float r0 = r16 - r0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.G9t.A0o(r2, r0)
        L_0x09ee:
            X.5Oz r65 = X.C51965G9l.A0J(r4, r0, r3)
            r0 = 617336900(0x24cbd044, float:8.839003E-17)
            java.lang.Object r0 = X.C51967G9n.A0m(r2, r0)
            if (r0 != r5) goto L_0x0a0a
            r0 = r45
            float r0 = A00(r15, r0)
            float r0 = r0 + r9
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.G9t.A0o(r2, r0)
        L_0x0a0a:
            X.5Oz r66 = X.C51965G9l.A0J(r4, r0, r3)
            r0 = 617342100(0x24cbe494, float:8.842444E-17)
            r2.ExS(r0)
            r0 = r38
            boolean r0 = r2.AGt(r0)
            boolean r1 = X.C51970G9q.A1U(r0)
            r0 = r25
            boolean r0 = X.G9t.A1S(r2, r0)
            r1 = r1 | r0
            r0 = r19
            boolean r0 = X.G9t.A1S(r2, r0)
            r1 = r1 | r0
            r0 = r26
            boolean r6 = X.G9t.A1S(r2, r0)
            r0 = r43
            boolean r6 = X.C51968G9o.A1U(r2, r0, r1, r6)
            r0 = r31
            boolean r0 = X.G9t.A1S(r2, r0)
            r6 = r6 | r0
            r0 = r82
            boolean r0 = r2.AGt(r0)
            boolean r0 = X.C51970G9q.A1U(r0)
            r6 = r6 | r0
            r0 = r16
            boolean r0 = X.C51975G9x.A1R(r2, r11, r0, r6)
            boolean r6 = X.C51975G9x.A1R(r2, r7, r9, r0)
            r0 = r44
            boolean r0 = X.G9t.A1S(r2, r0)
            r6 = r6 | r0
            r0 = r36
            boolean r0 = r2.AGt(r0)
            boolean r0 = X.C51970G9q.A1U(r0)
            r6 = r6 | r0
            r0 = r40
            boolean r1 = r2.AGt(r0)
            r0 = r46
            boolean r0 = X.C51968G9o.A1U(r2, r0, r6, r1)
            boolean r1 = X.C51975G9x.A1R(r2, r13, r12, r0)
            java.lang.Object r0 = r2.ECw()
            if (r1 != 0) goto L_0x0a7e
            if (r0 != r5) goto L_0x0aa4
        L_0x0a7e:
            X.IyK r0 = new X.IyK
            r94 = r0
            r95 = r42
            r96 = r43
            r97 = r49
            r98 = r46
            r101 = r11
            r102 = r16
            r103 = r7
            r104 = r9
            r105 = r13
            r106 = r12
            r107 = r38
            r109 = r36
            r111 = r40
            r113 = r82
            r94.<init>(r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r109, r111, r113)
            r2.FLL(r0)
        L_0x0aa4:
            r1 = r28
            androidx.compose.ui.Modifier r6 = X.C51975G9x.A0I(r4, r1, r0, r3)
            X.0gF r1 = X.C60340gF.A00
            r0 = 617395444(0x24ccb4f4, float:8.8777444E-17)
            r2.ExS(r0)
            r0 = r33
            boolean r7 = X.G9t.A1S(r2, r0)
            r0 = r45
            boolean r0 = X.G9t.A1S(r2, r0)
            r7 = r7 | r0
            r0 = r19
            boolean r0 = X.G9t.A1S(r2, r0)
            r7 = r7 | r0
            java.lang.Object r0 = r2.ECw()
            if (r7 != 0) goto L_0x0ace
            if (r0 != r5) goto L_0x0ae4
        L_0x0ace:
            com.instagram.archive.ui.ArchiveReelComposeFragmentKt$fastScroll$6$1 r0 = new com.instagram.archive.ui.ArchiveReelComposeFragmentKt$fastScroll$6$1
            r64 = r0
            r68 = r42
            r69 = r48
            r71 = r33
            r72 = r58
            r73 = r45
            r74 = r19
            r64.<init>(r65, r66, r67, r68, r69, r70, r71, r72, r73, r74)
            r2.FLL(r0)
        L_0x0ae4:
            androidx.compose.ui.Modifier r28 = X.C51969G9p.A0W(r4, r6, r0, r1, r3)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x04da
            r0 = -1190696513(0xffffffffb90769bf, float:-1.2913997E-4)
            goto L_0x04d7
        L_0x0af3:
            float r9 = r9 - r0
            int r0 = (int) r9
            goto L_0x093a
        L_0x0af7:
            int r1 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r1 >= 0) goto L_0x0afe
            r1 = 0
            goto L_0x08e6
        L_0x0afe:
            float r0 = r0 - r9
            float r0 = r0 / r9
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            float r7 = (float) r0
            int r0 = (int) r7
            int r1 = r0 + 1
            goto L_0x08e6
        L_0x0b0b:
            float r6 = r6 / r9
            double r0 = (double) r6
            double r0 = java.lang.Math.floor(r0)
            float r6 = (float) r0
            int r1 = (int) r6
            goto L_0x08d7
        L_0x0b15:
            int r0 = r60.intValue()
            float r0 = (float) r0
            float r0 = r0 / r26
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            float r6 = (float) r0
            int r0 = (int) r6
            int r11 = r61 + -1
            int r11 = r11 - r0
            int r0 = r34.intValue()
            int r24 = r24 - r0
            r0 = r24
            float r0 = (float) r0
            float r6 = r9 - r0
            r1 = 0
            boolean r0 = X.AnonymousClass7TF.A1R(r11)
            float r0 = (float) r0
            float r0 = r0 * r9
            if (r11 <= 0) goto L_0x0b3c
            int r1 = r11 + -1
        L_0x0b3c:
            float r1 = (float) r1
            float r1 = r1 * r9
            float r0 = r0 + r1
            int r0 = (int) r0
            float r0 = (float) r0
            float r0 = r0 + r6
            float r0 = r0 / r12
            double r0 = (double) r0
            java.math.BigDecimal r6 = java.math.BigDecimal.valueOf(r0)
            java.math.RoundingMode r1 = java.math.RoundingMode.HALF_UP
            r0 = 5
            java.math.BigDecimal r0 = r6.setScale(r0, r1)
            float r0 = r0.floatValue()
            float r11 = X.C229632nm.A01(r0)
            float r6 = r58 * r11
            r0 = r33
            float r1 = A00(r15, r0)
            r0 = r58
            float r1 = X.C229632nm.A02(r6, r1, r0)
            r0 = r42
            X.C51967G9n.A14(r0, r1)
            float r7 = r7 * r11
            float r7 = r7 / r9
            double r0 = (double) r7
            double r0 = java.lang.Math.floor(r0)
            float r6 = (float) r0
            int r1 = (int) r6
            r0 = r41
            X.C51967G9n.A15(r0, r1)
            goto L_0x0947
        L_0x0b7a:
            boolean r0 = X.C51971G9r.A1W(r67)
            if (r0 != 0) goto L_0x0b8e
            float r0 = X.C51975G9x.A01(r63)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0b8e
            java.lang.Float r11 = java.lang.Float.valueOf(r59)
            goto L_0x089f
        L_0x0b8e:
            r11 = 0
            goto L_0x089f
        L_0x0b91:
            r1 = 0
            goto L_0x06ba
        L_0x0b94:
            r6 = 0
            goto L_0x0677
        L_0x0b97:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x04da
            r0 = 380666837(0x16b083d5, float:2.8517531E-25)
            goto L_0x04d7
        L_0x0ba2:
            r31 = 1102053376(0x41b00000, float:22.0)
            r19 = 1106247680(0x41f00000, float:30.0)
            goto L_0x0486
        L_0x0ba8:
            r11 = r121
            r11.invoke(r0)
            goto L_0x0387
        L_0x0baf:
            r11 = 0
            goto L_0x035b
        L_0x0bb2:
            r34 = 0
            goto L_0x02f1
        L_0x0bb6:
            r0 = 0
            goto L_0x02e1
        L_0x0bb9:
            r1 = 0
            goto L_0x02d1
        L_0x0bbc:
            r22 = r78
            goto L_0x013c
        L_0x0bc0:
            r10 = r17
            goto L_0x00ae
        L_0x0bc4:
            r8 = r18
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7C.A07(X.5Wy, X.MbG, java.lang.String, X.0sa, X.0sP, X.0sP, X.0sP, X.0sP, X.0sP, X.0sP, X.0sP, X.0sP, X.0sL, X.0sL, X.0sJ, X.62P, X.YCQ, int, int, int, int, boolean, boolean, boolean, boolean, boolean):void");
    }
}
