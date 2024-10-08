package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.5dl  reason: invalid class name and case insensitive filesystem */
public abstract class C289535dl {
    public static final void A00(C286575Wy r14, Modifier modifier, C376459Ib r16, int i, int i2) {
        int i3;
        long j;
        long j2;
        Modifier modifier2 = modifier;
        C376459Ib r4 = r16;
        0qQ.A0B(r4, 0);
        C286575Wy r8 = r14;
        r14.ExV(1262085229);
        int i4 = i2;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i5 = 2;
            if (r14.AGu(r4)) {
                i5 = 4;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i7 = 16;
            if (r14.AGu(modifier2)) {
                i7 = 32;
            }
            i3 |= i7;
        }
        if ((i3 & 19) != 18 || !r14.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1391489086, "com.instagram.feed.adapter.row.ufi.compose.ComposeMediaCarouselIndicatorComponent (ComposeMediaCarouselIndicatorComponent.kt:19)");
            }
            C289485df r11 = (C289485df) r4.A01;
            AnonymousClass5RW r1 = (AnonymousClass5RW) r4.A00;
            r14.ExS(-826865342);
            if (r1 == null) {
                j = AnonymousClass5aQ.A00(r14).A0l;
            } else {
                j = r1.A00;
            }
            C286565Wx r7 = (C286565Wx) r8;
            C286565Wx.A0L(r7, false);
            AnonymousClass5RW r12 = (AnonymousClass5RW) r4.A02;
            r14.ExS(-826862592);
            if (r12 == null) {
                j2 = AnonymousClass5aQ.A00(r14).A0w;
            } else {
                j2 = r12.A00;
            }
            C286565Wx.A0L(r7, false);
            C289555dn.A00(r8, modifier2, new C289545dm(j, j2), r11, 0.0f, (i3 & 112) | 8, 8);
            if (0fL.A02()) {
                0fL.A00(-365730772);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new GSJ(modifier2, i4, r16, i, 32);
        }
    }
}
