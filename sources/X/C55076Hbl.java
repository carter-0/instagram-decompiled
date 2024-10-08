package X;

import android.text.Html;
import android.text.Spanned;
import android.text.style.StyleSpan;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.compose.core.ui.IgClickableTextKt;

/* renamed from: X.Hbl  reason: case insensitive filesystem */
public abstract class C55076Hbl {
    public static final void A00(C286575Wy r40, C51913G7h g7h, int i) {
        int i2;
        boolean z;
        C286575Wy r0 = r40;
        r0.ExV(1458211374);
        int i3 = i;
        C51913G7h g7h2 = g7h;
        if ((i & 6) == 0) {
            i2 = C51970G9q.A05(G9t.A1T(r0, g7h2, i3) ? 1 : 0) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-154376895, "com.instagram.opal.impl.ui.OpalNuxBottomsheetContent (OpalNuxFragment.kt:206)");
            }
            Object A16 = C51966G9m.A16(r0);
            Object A0r = C51965G9l.A0r(r0);
            C285245Qk r8 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r8);
            Modifier A02 = I28.A02(r0, A0T);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r0, 0);
            int A00 = C287425a7.A00(r0);
            C286565Wx r11 = (C286565Wx) r0;
            AnonymousClass5RM A04 = C286565Wx.A04(r11);
            Modifier A01 = C287435a8.A01(r0, A02);
            C51973G9u.A0y(r0, r11);
            C51971G9r.A12(r0, A0Z, A04);
            0sL r3 = C287485aD.A02;
            if (r11.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r3, A00);
            }
            C51965G9l.A18(r0, A01);
            C304676Et r17 = C304676Et.A00;
            AnonymousClass2DO A002 = C287975bA.A00(r0, R.drawable.ig_illustrations_illo_key_refresh_dark, 0);
            Modifier A0C = C287205Zk.A0C(C287195Zj.A0B(r8, 16.0f, 24.0f, 16.0f, 12.0f), 96.0f);
            C287265Zr r9 = C287215Zl.A00;
            C287265Zr r42 = r9;
            AnonymousClass6G3.A03(r0, r17.AB0(r9, A0C), A002);
            AnonymousClass5ZZ.A07(r0, AnonymousClass5R5.A00(r17.AB0(r9, C287195Zj.A0A(A0T, 16.0f, 0.0f, 16.0f)), J4B.A00, false), C51966G9m.A0e(r0), C304346Dc.A00(r0, 2131968874));
            C286575Wy r24 = r0;
            Modifier modifier = A0T;
            C52636GaA.A0B(r24, modifier, C287975bA.A00(r0, R.drawable.instagram_user_circle_pano_outline_24, 0), C304346Dc.A00(r0, 2131968895), C51966G9m.A0M(r0));
            C52636GaA.A0B(r24, modifier, C287975bA.A00(r0, R.drawable.instagram_key_pano_outline_24, 0), C304346Dc.A00(r0, 2131968896), C51966G9m.A0M(r0));
            C52636GaA.A0B(r24, modifier, C287975bA.A00(r0, R.drawable.instagram_new_post_pano_outline_24, 0), C304346Dc.A00(r0, 2131968897), C51966G9m.A0M(r0));
            C56618I4t.A02(r24, C287195Zj.A0B(A0T, 0.0f, 16.0f, 0.0f, 0.0f), 0.0f, 6, 4, AnonymousClass5aQ.A00(r0).A0D);
            r0.ExS(2082915821);
            int i4 = i2 & 14;
            if (i4 == 4 || ((i2 & 8) != 0 && r0.AGw(g7h2))) {
                z = true;
            } else {
                z = false;
            }
            Object ECw = r0.ECw();
            if (z || ECw == AnonymousClass5XT.A00) {
                ECw = new C51791G2a(g7h2, 1);
                r0.FLL(ECw);
            }
            boolean z2 = false;
            AnonymousClass6CE.A02(r0, C287195Zj.A07(A0T, 16.0f), C51965G9l.A0m(r0), C304346Dc.A00(r0, 2131968894), C51965G9l.A0y(r11, ECw, false));
            r0.ExS(2082925094);
            if (i4 == 4 || ((i2 & 8) != 0 && r0.AGw(g7h2))) {
                z2 = true;
            }
            Object ECw2 = r0.ECw();
            if (z2 || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C51791G2a(g7h2, 2);
                r0.FLL(ECw2);
            }
            C286575Wy r33 = r0;
            AnonymousClass6CE.A01(r33, C287195Zj.A0A(A0T, 16.0f, 0.0f, 16.0f), (AnonymousClass6CD) null, (AnonymousClass6CC) null, C304346Dc.A00(r0, 2131973916), C51965G9l.A0y(r11, ECw2, false), 384, 504, false);
            String A003 = C304346Dc.A00(r0, 2131968853);
            String A0h = G9w.A0h(r0, A003, 2131968893);
            long A0N = C51966G9m.A0N(r0);
            0qQ.A0B(A0h, 0);
            0qQ.A0B(A003, 1);
            Spanned fromHtml = Html.fromHtml(A0h, 63);
            0qQ.A07(fromHtml);
            C303876Bd A0b = C51969G9p.A0b();
            String obj = fromHtml.toString();
            A0b.A09(obj);
            Object[] spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
            if (spans != null) {
                for (Object obj2 : spans) {
                    Integer valueOf = Integer.valueOf(fromHtml.getSpanStart(obj2));
                    int spanEnd = fromHtml.getSpanEnd(obj2);
                    if (valueOf != null && (obj2 instanceof StyleSpan) && ((StyleSpan) obj2).getStyle() == 1) {
                        int intValue = valueOf.intValue();
                        CharSequence subSequence = obj.subSequence(intValue, spanEnd);
                        if (0qQ.A0K(subSequence, A003)) {
                            A0b.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65534, A0N, 0, 0), intValue, spanEnd);
                            A0b.A0A("community_guidelines", subSequence.toString(), intValue, spanEnd);
                        }
                    }
                }
            }
            C286025Tq A022 = A0b.A02();
            Modifier AB0 = r17.AB0(r42, C287195Zj.A07(A0T, 16.0f));
            long A0M = C51966G9m.A0M(r0);
            AnonymousClass5Z4 A0b2 = C51966G9m.A0b(r0);
            boolean A1U = C51966G9m.A1U(r0, A0r, G9t.A1Y(r0, A022, A16, 2082953557));
            Object ECw3 = r0.ECw();
            if (A1U || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = C59104J6m.A00(r0, A16, A022, A0r, 18);
            }
            IgClickableTextKt.A06(r0, AB0, A022, A0b2, C51965G9l.A0z(r11, ECw3), A0M);
            if (C51967G9n.A1R(r0)) {
                0fL.A00(-1764187146);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, g7h2, i3, 34);
        }
    }
}
