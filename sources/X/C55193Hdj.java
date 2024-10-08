package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Hdj  reason: case insensitive filesystem */
public abstract class C55193Hdj {
    public static final void A00(C286575Wy r21, C55663HlM hlM, C62320sa r23, int i) {
        int i2;
        C286575Wy r11 = r21;
        r11.ExV(911372226);
        int i3 = i;
        C55663HlM hlM2 = hlM;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r11, hlM2) | i;
        } else {
            i2 = i3;
        }
        C62320sa r9 = r23;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r11, r9);
        }
        if ((i2 & 19) != 18 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1228088320, "com.instagram.wonderwall.ui.bottomsheet.NuxContent (WallNuxBottomSheetFragment.kt:123)");
            }
            C285245Qk r16 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r16);
            AnonymousClass5RD A02 = C291495hO.A02(C287275Zs.A07, r11, C287215Zl.A02, 0);
            int A00 = C287425a7.A00(r11);
            C286565Wx r5 = (C286565Wx) r11;
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r11, A0T);
            C62320sa r14 = C287485aD.A00;
            C51973G9u.A0z(r11, r5, r14);
            0sL r13 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r11, A02, A04, r13);
            0sL r12 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r11, A00)) {
                C51971G9r.A13(r11, r12, A00);
            }
            0sL A1K = C51966G9m.A1K(r11, A01);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A002 = C287425a7.A00(r11);
            AnonymousClass5RM A042 = C286565Wx.A04(r5);
            Modifier A012 = C287435a8.A01(r11, A0T);
            C51973G9u.A0z(r11, r5, r14);
            C287595aO.A00(r11, A0a, r13);
            if (C51965G9l.A1Y(r11, r5, A042, A0w) || !C51972G9s.A1Q(r11, A002)) {
                C51971G9r.A13(r11, r12, A002);
            }
            C287595aO.A00(r11, A012, A1K);
            I7M.A03(r11, A0T, new C53512Gpi(R.drawable.ig_illustrations_illo_boards, 100.0f), (CharSequence) null, C304346Dc.A00(r11, hlM2.A00), 48, 4084);
            r11.ASN();
            r11.ExS(-1724655177);
            List list = hlM2.A01;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C55664HlN hlN = (C55664HlN) list.get(i4);
                C56649I6e.A05(r11, new C53508Gpe(C304346Dc.A00(r11, hlN.A01), 0), hlN.A00);
                C51967G9n.A13(r11, r16, 12.0f);
            }
            C286565Wx.A0L(r5, false);
            I7L.A0B(r9, C304346Dc.A00(r11, 2131976740), r11, i2 & 112);
            if (C51967G9n.A1R(r11)) {
                0fL.A00(-1400741900);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            JGM.A01(ASQ, r9, hlM2, i3, 16);
        }
    }
}
