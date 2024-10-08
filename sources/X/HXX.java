package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;

public abstract class HXX {
    public static final void A00(C286575Wy r23, Modifier modifier, C62320sa r25, int i, int i2, long j) {
        int i3;
        C288185bV A0R;
        long j2 = j;
        Modifier modifier2 = modifier;
        C62320sa r4 = r25;
        0qQ.A0B(r4, 0);
        C286575Wy r10 = r23;
        r10.ExV(-978104369);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r10, r4) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r10, modifier2);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0D(r10, j2);
        }
        if ((i3 & 147) != 146 || !r10.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                j2 = AnonymousClass5RW.A08;
            }
            if (0fL.A02()) {
                0fL.A01(1474083035, "com.instagram.compose.ui.loading.RetryImage (RetryImage.kt:26)");
            }
            C287605aT r5 = (C287605aT) C51974G9v.A0V(r10, 1675951265);
            C51965G9l.A1X(r10, false);
            boolean A1W = C51971G9r.A1W(C54738HQv.A00(r5, r10, 6));
            int i8 = R.drawable.loadmore_icon_refresh;
            if (A1W) {
                i8 = R.drawable.loadmore_icon_refresh_pressed;
            }
            AnonymousClass2DO A00 = C287975bA.A00(r10, i8, 0);
            String A002 = C288035bG.A00(r10, 2131972371);
            if (j2 == AnonymousClass5RW.A08) {
                A0R = null;
            } else {
                A0R = C51968G9o.A0R(j2);
            }
            AnonymousClass6G3.A00(r10, (Alignment) null, C287635aW.A00((C287095Yz) null, r5, modifier2, C51965G9l.A0R(0), (String) null, r4, true), A0R, A00, C288075bK.A05, A002, 0.0f, 24576, 40);
            if (0fL.A02()) {
                0fL.A00(-626596230);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8P(i5, i4, 2, j2, r4, modifier2);
        }
    }
}
