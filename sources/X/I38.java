package X;

import androidx.compose.ui.Modifier;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;

public abstract class I38 {
    public static final void A00(C286575Wy r15, ImmutableList immutableList, C62320sa r17, C62320sa r18, int i) {
        int i2;
        ImmutableList immutableList2 = immutableList;
        C62320sa r8 = r17;
        C62320sa r1 = r18;
        C51973G9u.A1E(r8, r1, immutableList2);
        C286575Wy r5 = r15;
        r15.ExV(-1857429841);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r5, r8) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r5, r1);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0Q(r5, immutableList2);
        }
        if ((i2 & 147) != 146 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1376698781, "com.instagram.schools.management.ui.SchoolOnboardingAddSchoolContent (SchoolOnboardingAddSchoolContent.kt:30)");
            }
            I58.A03(r5, immutableList2, HMD.ADD_SCHOOL, r8, C58488Isj.A00, (C62320sa) null, (C62320sa) null, AnonymousClass5PI.A01(r5, new JGX(r1, 0), 39681834), 1597488 | (i2 & 14) | ((i2 << 9) & 458752), 12);
            if (0fL.A02()) {
                0fL.A00(817684214);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59135J7r(i3, 8, r17, immutableList2, r1);
        }
    }

    public static final void A01(C62320sa r9, C286575Wy r10, int i) {
        int i2;
        r10.ExV(-1458782500);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r10, r9) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(978284730, "com.instagram.schools.management.ui.BulletList (SchoolOnboardingAddSchoolContent.kt:63)");
            }
            String A00 = C288035bG.A00(r10, 2131964884);
            String A14 = C51968G9o.A14(r10, A00, 2131968795);
            long A0D = C51966G9m.A0D(r10);
            Object A0m = C51967G9n.A0m(r10, 1153297467);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = I58.A00((AnonymousClass5ZD) null, A00, A14, A0D);
                r10.FLL(A0m);
            }
            C286025Tq r4 = (C286025Tq) A0m;
            C286565Wx A0H = C51965G9l.A0H(r10, false);
            Modifier A0U = C51969G9p.A0U();
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r10, 0);
            int A002 = C287425a7.A00(r10);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r10, A0U);
            C51973G9u.A0y(r10, A0H);
            C51971G9r.A12(r10, A0Z, A04);
            0sL r1 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r10, A002)) {
                C51971G9r.A13(r10, r1, A002);
            }
            C51965G9l.A18(r10, A01);
            r10.ExS(766758560);
            boolean A1Q = C51968G9o.A1Q(i2);
            Object ECw = r10.ECw();
            if (A1Q || ECw == obj) {
                ECw = new C74180PqM(r9, 33);
                r10.FLL(ECw);
            }
            C56649I6e.A05(r10, new C53506Gpc(r4, C51965G9l.A0z(A0H, ECw)), R.drawable.instagram_eye_off_pano_outline_24);
            C56649I6e.A05(r10, C53508Gpe.A00(r10, 2131968794), R.drawable.instagram_cap_pano_outline_24);
            C56649I6e.A05(r10, C53508Gpe.A00(r10, 2131968796), R.drawable.instagram_exit_pano_outline_24);
            if (C51967G9n.A1R(r10)) {
                0fL.A00(1191210427);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, r9, i, 44);
        }
    }

    public static final void A02(C62320sa r13, C286575Wy r14, int i) {
        int i2;
        C286575Wy r6 = r14;
        r14.ExV(1484981370);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r14, r13) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(489204572, "com.instagram.schools.management.ui.IntroPageContent (SchoolOnboardingAddSchoolContent.kt:43)");
            }
            Modifier A0T = C51966G9m.A0T(Modifier.A00);
            Modifier A02 = I28.A02(r14, A0T);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r14, 0);
            int A00 = C287425a7.A00(r14);
            C286565Wx r3 = (C286565Wx) r6;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r14, A02);
            C51973G9u.A0y(r14, r3);
            C51971G9r.A12(r14, A0Z, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r14, A00)) {
                C51971G9r.A13(r14, r1, A00);
            }
            C51965G9l.A18(r14, A01);
            I7M.A03(r6, A0T, new C53512Gpi(R.drawable.instagram_illustrations_product_illustration_pi_plus_schools_add_school, 96.0f), (CharSequence) null, C288035bG.A00(r14, 2131968791), 48, 4084);
            A01(r13, r14, i2 & 14);
            if (C51967G9n.A1R(r14)) {
                0fL.A00(855939334);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, r13, i, 45);
        }
    }
}
