package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.Hch  reason: case insensitive filesystem */
public abstract class C55133Hch {
    public static final void A00(C286575Wy r32, String str, C62320sa r34, C62320sa r35, C62320sa r36, int i) {
        int i2;
        C62320sa r14 = r34;
        0qQ.A0B(r14, 0);
        String str2 = str;
        C62320sa r13 = r35;
        C62320sa r12 = r36;
        AnonymousClass7TG.A1U(r13, r12, str2);
        C286575Wy r15 = r32;
        r15.ExV(187209338);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r15, r14) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r15, r13);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r15, r12);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0R(r15, str2);
        }
        if ((i2 & 1171) != 1170 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-841384543, "com.instagram.schools.management.ui.SchoolOnboardingAddCompletionBottomSheetContent (SchoolOnboardingAddCompletionBottomSheetContent.kt:27)");
            }
            String A00 = C288035bG.A00(r15, 2131964884);
            String A01 = C288035bG.A01(r15, new Object[]{str2, A00}, 2131972706);
            long A0D = C51966G9m.A0D(r15);
            Object A0m = C51967G9n.A0m(r15, -2049960004);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                C303876Bd A0L = C51972G9s.A0L(A01);
                int length = A01.length() - 1;
                int A07 = 00l.A07(A01, str2, length);
                int A05 = C51966G9m.A05(str2, A07);
                A0L.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, AnonymousClass5ZD.A01, (C291795ht) null, 65531, 0, 0, 0), A07, A05);
                A0L.A0A("tag_span", A01, A07, A05);
                int A072 = 00l.A07(A01, A00, length);
                int A052 = DbX.A05(A00) + A072;
                A0L.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65530, A0D, 0, 0), A072, A052);
                A0m = C51967G9n.A0K(A0L, "tag_span", A01, A072, A052);
                r15.FLL(A0m);
            }
            C286025Tq r2 = (C286025Tq) A0m;
            C286565Wx A0H = C51965G9l.A0H(r15, false);
            C285245Qk r6 = Modifier.A00;
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r15, 0);
            int A002 = C287425a7.A00(r15);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r15, r6);
            C51973G9u.A0y(r15, A0H);
            C51971G9r.A12(r15, A0Z, A04);
            0sL r4 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r15, A002)) {
                C51971G9r.A13(r15, r4, A002);
            }
            C51965G9l.A18(r15, A012);
            String A003 = C288035bG.A00(r15, 2131976981);
            C53512Gpi gpi = new C53512Gpi(R.drawable.instagram_illustrations_product_illustration_pi_plus_schools_youre_in, 156.0f);
            boolean A1Z = C51974G9v.A1Z(r15, 973928161, i2);
            Object ECw = r15.ECw();
            if (A1Z || ECw == obj) {
                ECw = new C74180PqM(r12, 32);
                r15.FLL(ECw);
            }
            I7M.A01(r15, (Modifier) null, gpi, (HL5) null, (HL6) null, r2, (CharSequence) null, A003, (String) null, (C62320sa) null, C51965G9l.A0z(A0H, ECw), (0sP) null, 24576, 0, 4006, 0);
            I7L.A08(r15, C288035bG.A00(r15, 2131973010), C288035bG.A00(r15, 2131968513), r14, r13, ((i2 << 3) & 112) | ((i2 << 15) & 3670016));
            if (C51967G9n.A1R(r15)) {
                0fL.A00(738785390);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r15.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59144J8a(r13, r14, r12, str2, i3, 6);
        }
    }
}
