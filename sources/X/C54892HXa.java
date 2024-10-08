package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.PainterElement;
import com.instagram.android.R;

/* renamed from: X.HXa  reason: case insensitive filesystem */
public abstract class C54892HXa {
    public static final void A00(Modifier modifier, C286575Wy r16, int i, int i2) {
        int i3;
        C286575Wy r5 = r16;
        r5.ExV(-102115042);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r5, modifier) | i;
        } else {
            i3 = i6;
        }
        if ((i3 & 3) != 2 || !r5.Bwn()) {
            if (i5 != 0) {
                modifier = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1014048449, "com.instagram.compose.ui.notificationbadge.ListNewBadge (ListNewBadge.kt:20)");
            }
            AnonymousClass2DO A0J = C51967G9n.A0J(r5, R.drawable.list_new_badge_background);
            String A00 = C288035bG.A00(r5, 2131968264);
            AnonymousClass5ZZ.A0Y(r5, C287195Zj.A09(modifier.Ezh(new PainterElement(C287215Zl.A09, (C288195bW) null, A0J, C288075bK.A01, 1.0f)), 6.0f, 4.0f), AnonymousClass5ZD.A03, A00, 199680, 32720, C51966G9m.A0I(r5), AnonymousClass5Z7.A01(10));
            if (0fL.A02()) {
                0fL.A00(-809185127);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            JGH.A01(ASQ, modifier, i4, i6, 11);
        }
    }
}
