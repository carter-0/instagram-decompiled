package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HSr  reason: case insensitive filesystem */
public abstract class C54784HSr {
    public static final void A00(C286575Wy r36, C61014JvE jvE, C62626Kix kix, String str, 0sP r40, int i) {
        int i2;
        int i3;
        int i4;
        Integer[] numArr;
        int i5;
        String A00;
        String str2 = str;
        0qQ.A0B(str2, 0);
        C61014JvE jvE2 = jvE;
        C62626Kix kix2 = kix;
        int A02 = DbW.A02(1, kix2, jvE2);
        0sP r10 = r40;
        0qQ.A0B(r10, 3);
        C286575Wy r2 = r36;
        r2.ExV(1988035923);
        int i6 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r2, str2) | i;
        } else {
            i2 = i6;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r2, kix2);
        }
        if ((i6 & 3072) == 0) {
            i2 |= G9t.A0H(r2, r10);
        }
        if ((i2 & 1043) != 1042 || !r2.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(488482646, "com.instagram.aistudio.editor.PublicStatusChangeConfirmationScreen (AiPublicStatusChangeConfirmationScreen.kt:29)");
            }
            int ordinal = kix2.ordinal();
            if (ordinal != 7) {
                i3 = 2131952827;
                i4 = 2131952826;
                if (ordinal != 1) {
                    i3 = 2131952831;
                    i4 = 2131952830;
                    numArr = new Integer[]{2131952828, 2131952829};
                } else {
                    numArr = new Integer[3];
                    G9w.A1Z(numArr, 2131952823, 0);
                    G9w.A1Z(numArr, 2131952824, 1);
                    i5 = 2131952825;
                    G9w.A1Z(numArr, i5, A02);
                }
            } else {
                i3 = 2131952836;
                i4 = 2131952835;
                numArr = new Integer[3];
                G9w.A1Z(numArr, 2131952832, 0);
                G9w.A1Z(numArr, 2131952833, 1);
                i5 = 2131952834;
                G9w.A1Z(numArr, i5, A02);
            }
            List A1P = 0sr.A1P(numArr);
            r2.ExS(-831004434);
            if (kix2 == C62626Kix.PUBLIC || kix2 == C62626Kix.ANYONE_WITH_LINK) {
                A00 = C288035bG.A00(r2, 2131952822);
            } else {
                A00 = null;
            }
            C286565Wx A0H = C51965G9l.A0H(r2, false);
            C285245Qk r9 = Modifier.A00;
            Modifier A022 = I28.A02(r2, C51966G9m.A0T(r9));
            AnonymousClass5RD A002 = C291495hO.A00(C287275Zs.A07, r2, C287215Zl.A02);
            int A003 = C287425a7.A00(r2);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r2, A022);
            C51973G9u.A0y(r2, A0H);
            C51971G9r.A12(r2, A002, A04);
            0sL r8 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r2, A003)) {
                C51971G9r.A13(r2, r8, A003);
            }
            C51965G9l.A18(r2, A01);
            C304676Et r82 = C304676Et.A00;
            C287265Zr r7 = C287215Zl.A00;
            I7M.A02(r2, r82.AB0(r7, r9), (C59486JLk) null, HL5.DEFAULT, C288035bG.A00(r2, i4), C288035bG.A00(r2, i3), (String) null, (C62320sa) null, 384, 4072, 0);
            Iterator A17 = C51968G9o.A17(r2, A1P, -51177178);
            while (A17.hasNext()) {
                C56649I6e.A02(r2, C287975bA.A00(r2, R.drawable.primary_text_bullet_point, 0), C53508Gpe.A00(r2, AnonymousClass7TG.A0F(A17)));
            }
            C286565Wx.A0L(A0H, false);
            Modifier AB0 = r82.AB0(r7, r9);
            String A004 = C288035bG.A00(r2, 2131952821);
            boolean A1a = C51974G9v.A1a(r2, -51166314, i2) | C51970G9q.A1V(i2 & 14);
            Object ECw = r2.ECw();
            if (A1a || ECw == AnonymousClass5XT.A00) {
                ECw = new C73670Phj(str2, r10, 39);
                r2.FLL(ECw);
            }
            I7L.A02(r2, AB0, A00, A004, (String) null, C51965G9l.A0y(A0H, ECw, false), (C62320sa) null, 0, 23544, false, true);
            r2.ASN();
            Object AJO = r2.AJO(AnonymousClass5YA.A0A);
            C60340gF r83 = C60340gF.A00;
            boolean A1Y = C51967G9n.A1Y(r2, AJO, -830962396);
            Object ECw2 = r2.ECw();
            if (A1Y || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C59712JUv(AJO, (AnonymousClass4D7) null, 43);
                r2.FLL(ECw2);
            }
            if (C51972G9s.A1S(r2, A0H, ECw2, r83)) {
                0fL.A00(-334725443);
            }
        } else {
            r2.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59144J8a(r10, jvE2, kix2, str2, i6, 1);
        }
    }
}
