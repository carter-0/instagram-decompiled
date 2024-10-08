package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.6FU  reason: invalid class name */
public abstract class AnonymousClass6FU {
    public static final void A00(C286575Wy r16, Modifier modifier, float f, int i, int i2) {
        int i3;
        float f2 = f;
        Modifier modifier2 = modifier;
        C286575Wy r5 = r16;
        r5.ExV(-1945465930);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i7 = 2;
            if (r5.AGu(modifier2)) {
                i7 = 4;
            }
            i3 = i7 | i;
        } else {
            i3 = i6;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i9 = 16;
            if (r5.AGr(f2)) {
                i9 = 32;
            }
            i3 |= i9;
        }
        if ((i3 & 19) != 18 || !r5.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i8 != 0) {
                f2 = 14.0f;
            }
            if (0fL.A02()) {
                0fL.A01(-496119611, "com.instagram.compose.ui.badge.VerifiedBadge (Verified.kt:18)");
            }
            AnonymousClass2DO A00 = C287975bA.A00(r5, R.drawable.instagram_verified_pano_filled_24, 0);
            String A002 = C288035bG.A00(r5, 2131976380);
            C288165bT.A06(r5, C287205Zk.A0C(modifier2, f2), A00, (C288095bM) null, A002, 0, 16, C285595Rx.A02(AnonymousClass5RX.A0K[(int) (AnonymousClass5aQ.A00(r5).A0J & 63)], AnonymousClass5RW.A03(AnonymousClass5aQ.A00(r5).A0J), AnonymousClass5RW.A02(AnonymousClass5aQ.A00(r5).A0J), AnonymousClass5RW.A01(AnonymousClass5aQ.A00(r5).A0J), ((Number) C286615Xc.A01(AnonymousClass6CK.A00, C286565Wx.A04((C286565Wx) r5))).floatValue()));
            if (0fL.A02()) {
                0fL.A00(-2077174639);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59129J7l(modifier2, f2, i6, i4, 0);
        }
    }
}
