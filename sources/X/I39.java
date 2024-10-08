package X;

import androidx.compose.ui.Modifier;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.compose.core.ui.IgClickableTextKt;
import com.instagram.schools.management.data.SchoolAddress;
import com.instagram.schools.management.data.SchoolInfo;

public abstract class I39 {
    public static final void A00(C286575Wy r16, ImmutableList immutableList, SchoolInfo schoolInfo, Integer num, Integer num2, C62320sa r21, C62320sa r22, C62320sa r23, C62320sa r24, int i) {
        int i2;
        C62320sa r4 = r21;
        C62320sa r10 = r22;
        C62320sa r3 = r23;
        C62320sa r9 = r24;
        C51974G9v.A1O(r4, r10, r3, r9);
        ImmutableList immutableList2 = immutableList;
        0qQ.A0B(immutableList2, 7);
        C286575Wy r12 = r16;
        r12.ExV(-177614741);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r12, r4) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r12, r10);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r12, r3);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r12, r9);
        }
        SchoolInfo schoolInfo2 = schoolInfo;
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r12, schoolInfo2);
        }
        Integer num3 = num;
        if ((196608 & i) == 0) {
            i2 |= G9t.A0T(r12, num3);
        }
        Integer num4 = num2;
        if ((1572864 & i) == 0) {
            i2 |= G9t.A0U(r12, num4);
        }
        if ((12582912 & i) == 0) {
            i2 |= G9t.A0V(r12, immutableList2);
        }
        if ((4793491 & i2) != 4793490 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(2011416094, "com.instagram.schools.management.ui.SchoolOnboardingGradudationDateContent (SchoolOnboardingGraduationDateContent.kt:39)");
            }
            ImmutableList immutableList3 = immutableList2;
            C62320sa r15 = r4;
            I58.A03(r12, immutableList3, HMD.GRADUATION_DATE, r15, C58491Ism.A00, (C62320sa) null, (C62320sa) null, AnonymousClass5PI.A01(r12, new JHF(immutableList2, schoolInfo2, num3, num4, r10, r3, r9), -1037255642), 1597488 | (i2 & 14) | (458752 & (i2 >> 6)), 12);
            if (0fL.A02()) {
                0fL.A00(-1301534583);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JBG(r3, r4, num4, num3, immutableList2, schoolInfo2, r9, r10, i3, 5);
        }
    }

    public static final void A01(C286575Wy r27, SchoolInfo schoolInfo, Integer num, Integer num2, C62320sa r31, C62320sa r32, C62320sa r33, int i, boolean z) {
        int i2;
        int i3;
        Object[] objArr;
        char c;
        C286575Wy r4 = r27;
        r4.ExV(1995169110);
        int i4 = i;
        C62320sa r13 = r31;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r4, r13) | i;
        } else {
            i2 = i4;
        }
        C62320sa r10 = r32;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r4, r10);
        }
        C62320sa r9 = r33;
        if ((i4 & 384) == 0) {
            i2 |= G9t.A0G(r4, r9);
        }
        SchoolInfo schoolInfo2 = schoolInfo;
        if ((i4 & 3072) == 0) {
            i2 |= G9t.A0H(r4, schoolInfo2);
        }
        boolean z2 = z;
        if ((i4 & 24576) == 0) {
            i2 |= G9t.A0c(r4, z2);
        }
        Integer num3 = num;
        if ((196608 & i) == 0) {
            i2 |= G9t.A0T(r4, num3);
        }
        Integer num4 = num2;
        if ((1572864 & i) == 0) {
            i2 |= G9t.A0U(r4, num4);
        }
        if ((599187 & i2) != 599186 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-674424670, "com.instagram.schools.management.ui.GraduationDateContent (SchoolOnboardingGraduationDateContent.kt:70)");
            }
            Modifier A0T = C51966G9m.A0T(Modifier.A00);
            Modifier A02 = I28.A02(r4, A0T);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r4, 0);
            int A00 = C287425a7.A00(r4);
            C286565Wx r0 = (C286565Wx) r4;
            AnonymousClass5RM A04 = C286565Wx.A04(r0);
            Modifier A01 = C287435a8.A01(r4, A02);
            C51973G9u.A0y(r4, r0);
            C51971G9r.A12(r4, A0Z, A04);
            0sL r8 = C287485aD.A02;
            if (r0.A0K || !C51972G9s.A1Q(r4, A00)) {
                C51971G9r.A13(r4, r8, A00);
            }
            C51965G9l.A18(r4, A01);
            SchoolAddress schoolAddress = schoolInfo2.A00;
            String str = schoolAddress.A02;
            if (str.length() == 0) {
                r4.ExS(-32094206);
                i3 = 2131972707;
                objArr = new Object[2];
                objArr[0] = schoolAddress.A00;
                str = schoolAddress.A01;
                c = 1;
            } else {
                r4.ExS(-31979320);
                i3 = 2131972708;
                objArr = new Object[3];
                objArr[0] = schoolAddress.A00;
                objArr[1] = schoolAddress.A01;
                c = 2;
            }
            objArr[c] = str;
            String A012 = C288035bG.A01(r4, objArr, i3);
            C286565Wx.A0L(r0, false);
            if (z2) {
                r4.ExS(-31746262);
                String str2 = schoolInfo2.A02;
                String str3 = str2;
                C286575Wy r18 = r4;
                Modifier modifier = A0T;
                C53512Gpi gpi = new C53512Gpi(R.drawable.instagram_illustrations_product_illustration_pi_plus_schools_when_will_you_graduate, 96.0f);
                I7M.A01(r18, modifier, gpi, (HL5) null, (HL6) null, A012, (CharSequence) null, str3, C288035bG.A00(r4, 2131961425), r13, (0sP) null, (0sP) null, 48, (i2 << 3) & 112, 1508, 0);
            } else {
                r4.ExS(-31169166);
                I7M.A03(r4, A0T, new C53512Gpi(R.drawable.instagram_illustrations_product_illustration_pi_plus_schools_when_will_you_graduate, 96.0f), A012, schoolInfo2.A02, 48, 4068);
            }
            C286565Wx.A0L(r0, false);
            int i5 = ((i2 >> 6) & 14) | (i2 & 112);
            A02(r4, num3, num4, r9, r10, C51969G9p.A04(i2 >> 9, i5));
            if (C51967G9n.A1R(r4)) {
                0fL.A00(-701494503);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59204JAi(r13, r10, r9, schoolInfo2, num3, num4, i4, 1, z2);
        }
    }

    public static final void A02(C286575Wy r13, Integer num, Integer num2, C62320sa r16, C62320sa r17, int i) {
        int i2;
        C286575Wy r6 = r13;
        r13.ExV(188767171);
        int i3 = i;
        C62320sa r5 = r16;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r13, r5) | i;
        } else {
            i2 = i3;
        }
        C62320sa r4 = r17;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r13, r4);
        }
        Integer num3 = num;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0Q(r13, num);
        }
        Integer num4 = num2;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0R(r13, num2);
        }
        if ((i2 & 1171) != 1170 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-478715301, "com.instagram.schools.management.ui.DatePicker (SchoolOnboardingGraduationDateContent.kt:123)");
            }
            String A00 = C288035bG.A00(r13, 2131964884);
            String A14 = C51968G9o.A14(r6, A00, 2131968803);
            long A0D = C51966G9m.A0D(r6);
            Object A0m = C51967G9n.A0m(r6, -1565994633);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = I58.A00((AnonymousClass5ZD) null, A00, A14, A0D);
                r6.FLL(A0m);
            }
            C286025Tq r0 = (C286025Tq) A0m;
            C286565Wx A0H = C51965G9l.A0H(r6, false);
            C285245Qk r11 = Modifier.A00;
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r6, 0);
            int A002 = C287425a7.A00(r6);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r6, r11);
            C51973G9u.A0y(r6, A0H);
            C51971G9r.A12(r6, A0Z, A04);
            0sL r132 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r6, A002)) {
                C51971G9r.A13(r6, r132, A002);
            }
            C51965G9l.A18(r6, A01);
            AnonymousClass5ZZ.A05(r6, C287195Zj.A08(r11, 14.0f), C51965G9l.A0S(r6), C288035bG.A00(r6, 2131968804));
            boolean A1X = C51974G9v.A1X(r6, -1610844236, i2);
            Object ECw = r6.ECw();
            if (A1X || ECw == obj) {
                ECw = C58681Ivq.A00(r6, r5, 15);
            }
            Modifier A05 = C287635aW.A05(r11, (C287625aV) null, (String) null, C51965G9l.A0y(A0H, ECw, false), true);
            int i4 = i2 >> 3;
            I37.A02(r6, A05, num3, num4, (i4 & 112) | (i4 & 896), 0);
            Modifier A08 = C287195Zj.A08(r11, 8.0f);
            AnonymousClass5Z4 A0b = C51966G9m.A0b(r6);
            long A0M = C51966G9m.A0M(r6);
            r6.ExS(-1610833448);
            boolean A1M = C51972G9s.A1M(i2);
            Object ECw2 = r6.ECw();
            if (A1M || ECw2 == obj) {
                ECw2 = new C74180PqM(r4, 34);
                r6.FLL(ECw2);
            }
            C286575Wy r9 = r6;
            IgClickableTextKt.A03(r9, A08, r0, A0b, C51965G9l.A0z(A0H, ECw2), 54, 112632, A0M);
            if (C51967G9n.A1R(r6)) {
                0fL.A00(-66163086);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG7(num4, num3, r4, r5, i3, 21);
        }
    }
}
