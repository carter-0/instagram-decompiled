package X;

import androidx.compose.ui.Modifier;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.schools.management.data.SchoolAddress;
import com.instagram.schools.management.data.SchoolInfo;

public abstract class I59 {
    public static final void A01(C286575Wy r15, ImmutableList immutableList, SchoolInfo schoolInfo, C62320sa r18, C62320sa r19, int i) {
        int i2;
        C62320sa r8 = r18;
        C62320sa r9 = r19;
        boolean A1Z = AnonymousClass7TG.A1Z(r8, r9);
        ImmutableList immutableList2 = immutableList;
        0qQ.A0B(immutableList2, 3);
        C286575Wy r5 = r15;
        r15.ExV(1584190153);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r15, r8) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r15, r9);
        }
        SchoolInfo schoolInfo2 = schoolInfo;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r5, schoolInfo2);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0R(r5, immutableList2);
        }
        if ((i2 & 1171) != 1170 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1806231565, "com.instagram.schools.management.ui.SchoolOnboardingSwitchSchoolContent (SchoolOnboardingSwitchSchoolContent.kt:31)");
            }
            I58.A03(r5, immutableList2, HMD.SWITCH_SCHOOL, r8, r9, (C62320sa) null, (C62320sa) null, AnonymousClass5PI.A01(r5, new JGX(schoolInfo2, A1Z ? 1 : 0), 1965348782), 1597440 | (i2 & 14) | (i2 & 112) | ((i2 << 6) & 458752), 12);
            if (0fL.A02()) {
                0fL.A00(1152792653);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG7(schoolInfo2, immutableList, r9, r18, i3, 22);
        }
    }

    public static final void A00(C286575Wy r6, int i) {
        r6.ExV(873723329);
        if (i != 0 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1746435281, "com.instagram.schools.management.ui.BulletList (SchoolOnboardingSwitchSchoolContent.kt:80)");
            }
            Modifier A0U = C51969G9p.A0U();
            AnonymousClass5RD A02 = C291495hO.A02(C287275Zs.A07, r6, C287215Zl.A02, 0);
            int A00 = C287425a7.A00(r6);
            C286565Wx r3 = (C286565Wx) r6;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r6, A0U);
            C51973G9u.A0y(r6, r3);
            C51971G9r.A12(r6, A02, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r6, A00)) {
                C51971G9r.A13(r6, r1, A00);
            }
            C51965G9l.A18(r6, A01);
            C56649I6e.A05(r6, C53508Gpe.A00(r6, 2131974857), R.drawable.instagram_cap_pano_outline_24);
            C56649I6e.A05(r6, C53508Gpe.A00(r6, 2131974856), R.drawable.instagram_edit_pano_outline_24);
            C56649I6e.A05(r6, C53508Gpe.A00(r6, 2131974855), R.drawable.instagram_circle_x_pano_outline_24);
            if (C51967G9n.A1R(r6)) {
                0fL.A00(-1235030046);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGA.A01(ASQ, i, 8);
        }
    }

    public static final void A02(C286575Wy r10, SchoolInfo schoolInfo, int i) {
        int i2;
        C286575Wy r4 = r10;
        r10.ExV(-917996850);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r10, schoolInfo) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1934135502, "com.instagram.schools.management.ui.SchoolInfoHeader (SchoolOnboardingSwitchSchoolContent.kt:60)");
            }
            SchoolAddress schoolAddress = schoolInfo.A00;
            String A01 = C288035bG.A01(r10, new Object[]{schoolAddress.A00, schoolAddress.A01, schoolAddress.A02}, 2131972707);
            I7M.A03(r4, C51969G9p.A0U(), new C53512Gpi(R.drawable.instagram_illustrations_product_illustration_pi_plus_schools_add_school, 96.0f), A01, schoolInfo.A02, 48, 4068);
            if (0fL.A02()) {
                0fL.A00(-2047824345);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, schoolInfo, i, 47);
        }
    }

    public static final void A03(C286575Wy r7, SchoolInfo schoolInfo, int i) {
        int i2;
        r7.ExV(-758036524);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r7, schoolInfo) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1114807169, "com.instagram.schools.management.ui.SwitchSchoolContent (SchoolOnboardingSwitchSchoolContent.kt:52)");
            }
            Modifier A02 = I28.A02(r7, Modifier.A00);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r7, 0);
            int A00 = C287425a7.A00(r7);
            C286565Wx r3 = (C286565Wx) r7;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r7, A02);
            C51973G9u.A0y(r7, r3);
            C51971G9r.A12(r7, A0Z, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r7, A00)) {
                C51971G9r.A13(r7, r1, A00);
            }
            C51965G9l.A18(r7, A01);
            A02(r7, schoolInfo, i2 & 14);
            A00(r7, 0);
            if (C51967G9n.A1R(r7)) {
                0fL.A00(-334691664);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, schoolInfo, i, 48);
        }
    }
}
