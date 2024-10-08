package X;

import androidx.compose.ui.Modifier;
import kotlin.Deprecated;

public abstract class HXF {
    @Deprecated(message = "Use this Composable as a temporary solution when porting over Views to Compose. Consider migrating to Jetpack Compose whenever possible instead.")
    public static final void A00(C286575Wy r18, Modifier modifier, JPH jph, Object obj, int i, int i2) {
        int i3;
        JPH jph2 = jph;
        Object obj2 = obj;
        Modifier modifier2 = modifier;
        AnonymousClass7TG.A1N(jph2, obj2);
        C286575Wy r11 = r18;
        r11.ExV(29032054);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r11, jph2) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= C51970G9q.A06(G9t.A1U(r11, obj2, i5) ? 1 : 0);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r11, modifier2);
        }
        if ((i3 & 147) != 146 || !r11.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-937197111, "com.instagram.compose.core.viewinterop.IgAndroidView (IgAndroidView.kt:21)");
            }
            r11.ExS(1720961360);
            int i7 = i3 & 14;
            boolean z = false;
            boolean A1S = AnonymousClass7TF.A1S(i7, 4);
            Object ECw = r11.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = J6I.A00(r11, jph2, 30);
            }
            0sP r13 = (0sP) ECw;
            C286565Wx A0H = C51965G9l.A0H(r11, false);
            boolean A1R = C51972G9s.A1R(r11, 1720964368, i7, 4);
            Object ECw2 = r11.ECw();
            if (A1R || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = J6I.A00(r11, jph2, 31);
            }
            0sP A0z = C51965G9l.A0z(A0H, ECw2);
            boolean A1R2 = C51972G9s.A1R(r11, 1720962741, i7, 4);
            if ((i3 & 112) == 32 || ((i3 & 64) != 0 && r11.AGw(obj2))) {
                z = true;
            }
            boolean z2 = A1R2 | z;
            Object ECw3 = r11.ECw();
            if (z2 || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = new C66312MMv(4, jph2, obj2);
                r11.FLL(ECw3);
            }
            C286565Wx.A0I(A0H);
            I63.A03(r11, modifier2, r13, (0sP) null, A0z, (0sP) ECw3, (i3 >> 3) & 112, 4);
            if (0fL.A02()) {
                0fL.A00(1770743219);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i5, i4, 18, jph2, obj2, modifier2);
        }
    }
}
