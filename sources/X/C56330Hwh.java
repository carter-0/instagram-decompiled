package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.Hwh  reason: case insensitive filesystem */
public abstract class C56330Hwh {
    public static final void A01(C286575Wy r18, Modifier modifier, C62320sa r20, int i) {
        int i2;
        Modifier modifier2 = modifier;
        C62320sa r7 = r20;
        AnonymousClass7TF.A1H(r7, modifier2);
        C286575Wy r13 = r18;
        r13.ExV(-2032106940);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r13, r7) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r13, modifier2);
        }
        if ((i2 & 19) != 18 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(888621936, "com.instagram.opal.impl.ui.OpalUnshipNuxContent (OpalUnshipNuxContent.kt:38)");
            }
            0lg A0j = C51969G9p.A0j(r13);
            Object A0m = C51967G9n.A0m(r13, 1604248288);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = A00(DbS.A0J(A0j, 0), A0j, 36884032383943210L);
                r13.FLL(A0m);
            }
            C286565Wx A0H = C51965G9l.A0H(r13, false);
            Object A0m2 = C51967G9n.A0m(r13, 1604250913);
            if (A0m2 == obj) {
                A0m2 = A00(DbS.A0J(A0j, 0), A0j, 36884032383877673L);
                r13.FLL(A0m2);
            }
            C286565Wx.A0L(A0H, false);
            Modifier A02 = I28.A02(r13, modifier2);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r13, 0);
            int A00 = C287425a7.A00(r13);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r13, A02);
            C51973G9u.A0y(r13, A0H);
            C51971G9r.A12(r13, A0Z, A04);
            0sL r5 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r13, A00)) {
                C51971G9r.A13(r13, r5, A00);
            }
            C51965G9l.A18(r13, A01);
            C304676Et r6 = C304676Et.A00;
            String A002 = C288035bG.A00(r13, 2131968917);
            Modifier A0U = C51969G9p.A0U();
            AnonymousClass5ZZ.A07(r13, AnonymousClass5R5.A00(C51966G9m.A0S(r6, C287195Zj.A0A(A0U, 16.0f, 24.0f, 16.0f)), J4F.A00, false), C51966G9m.A0e(r13), A002);
            C52636GaA.A0C(r13, A0U, C287975bA.A00(r13, R.drawable.instagram_key_pano_outline_24, 0), C288035bG.A00(r13, 2131968912), C51968G9o.A14(r13, A0m, 2131968911), C51966G9m.A0M(r13));
            C52636GaA.A0C(r13, A0U, C287975bA.A00(r13, R.drawable.instagram_history_pano_outline_24, 0), C288035bG.A00(r13, 2131968914), C288035bG.A00(r13, 2131968913), C51966G9m.A0M(r13));
            C52636GaA.A0C(r13, A0U, C287975bA.A00(r13, R.drawable.instagram_download_pano_outline_24, 0), C288035bG.A00(r13, 2131968916), C51968G9o.A14(r13, A0m2, 2131968915), C51966G9m.A0M(r13));
            C56618I4t.A02(r13, C287195Zj.A0B(A0U, 0.0f, 16.0f, 0.0f, 0.0f), 0.0f, 6, 4, AnonymousClass5aQ.A00(r13).A0D);
            AnonymousClass6CE.A05(r13, C287195Zj.A07(A0U, 16.0f), C51965G9l.A0m(r13), C288035bG.A00(r13, 2131968772), r7, (i2 & 14) | 1573248);
            if (C51967G9n.A1R(r13)) {
                0fL.A00(-1059985507);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, modifier2, r7, i3, 36);
        }
    }

    public static String A00(0Tu r1, 0lg r2, long j) {
        String A04 = 182.A04(r1, r2, j);
        if (A04.length() == 0) {
            return "";
        }
        String format = new SimpleDateFormat(AnonymousClass000.A00(61), Locale.getDefault()).format(new Date(Long.parseLong(A04) * 1000));
        0qQ.A0A(format);
        return format;
    }
}
