package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.compose.core.ui.IgClickableTextKt;

public abstract class I2Y {
    public static final void A02(C286575Wy r9, Modifier modifier, String str, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        String str2 = str;
        0qQ.A0B(str, 0);
        r9.ExV(-1499458369);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r9, str) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r9, modifier);
        }
        if ((i3 & 19) != 18 || !r9.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1110168010, "com.instagram.compose.igds.components.textcell.IgdsFooter (IgdsFooter.kt:24)");
            }
            AnonymousClass5ZZ.A09(r9, C287195Zj.A0B(modifier2, C287645aX.A00(r9), C287645aX.A01(r9, R.dimen.abc_button_padding_horizontal_material), C287645aX.A00(r9), C287645aX.A00(r9)), A00(r9), str, i3 & 14);
            if (0fL.A02()) {
                0fL.A00(1208942205);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59139J7v(modifier2, str2, i4, i5, 6);
        }
    }

    public static final void A01(C286575Wy r17, Modifier modifier, C286025Tq r19, 0sP r20, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        0sP r11 = r20;
        C286025Tq r9 = r19;
        AnonymousClass7TF.A1B(r9, 0, r11);
        C286575Wy r7 = r17;
        r7.ExV(328979171);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r7, r9) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r7, modifier2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r7, r11);
        }
        if ((i3 & 147) != 146 || !r7.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1506042761, "com.instagram.compose.igds.components.textcell.IgdsFooterWithClickableText (IgdsFooter.kt:43)");
            }
            IgClickableTextKt.A02(r7, C287195Zj.A0B(modifier2, C287645aX.A00(r7), C287645aX.A01(r7, R.dimen.abc_button_padding_horizontal_material), C287645aX.A00(r7), C287645aX.A00(r7)), r9, A00(r7), r11, 0, i3 & 14, (i3 << 6) & 57344, 112636, 0);
            if (0fL.A02()) {
                0fL.A00(-2121738058);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i5, i4, 22, r9, r11, modifier2);
        }
    }

    public static final AnonymousClass5Z4 A00(C286575Wy r4) {
        if (C51967G9n.A1U(r4, 2057586684)) {
            0fL.A01(1121024972, "com.instagram.compose.igds.components.textcell.<get-footerStyle> (IgdsFooter.kt:60)");
        }
        AnonymousClass5Z4 A05 = AnonymousClass5Z4.A00((C291805hu) null, (C289645dx) null, C51966G9m.A0b(r4), (C268454dQ) null, (AnonymousClass5ZD) null, (C291825hw) null, 0, 0, 0, 6291454, C51966G9m.A0M(r4), 0, 0, 0);
        if (0fL.A02()) {
            0fL.A00(525813645);
        }
        C51965G9l.A1X(r4, false);
        return A05;
    }
}
