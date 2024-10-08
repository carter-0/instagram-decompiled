package X;

import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.6Ev  reason: invalid class name and case insensitive filesystem */
public abstract class C304696Ev {
    public static final AnonymousClass6F1 A00(LazyListState lazyListState, C286575Wy r7) {
        C304706Ew r2 = C304706Ew.A00;
        if (0fL.A02()) {
            0fL.A01(-1641625064, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:115)");
        }
        boolean z = true;
        if (!r7.AGu(lazyListState)) {
            z = false;
        }
        Object ECw = r7.ECw();
        if (z || ECw == AnonymousClass5XT.A00) {
            ECw = new C304726Ey(r2, lazyListState);
            ((C286565Wx) r7).A0Q(ECw);
        }
        C304736Ez r5 = (C304736Ez) ECw;
        if (0fL.A02()) {
            0fL.A01(-1159999346, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:256)");
        }
        C286565Wx r6 = (C286565Wx) r7;
        Object A01 = C286615Xc.A01(AnonymousClass5YA.A01, C286565Wx.A04(r6));
        boolean z2 = false;
        AnonymousClass6HR A00 = AnonymousClass6HL.A00(r7);
        if (r7.AGu(r5)) {
            z2 = true;
        }
        boolean AGu = r7.AGu(A00) | z2 | r7.AGu(A01);
        Object ECw2 = r7.ECw();
        if (AGu || ECw2 == AnonymousClass5XT.A00) {
            ECw2 = new SnapFlingBehavior(new C287965b7((Object) null, 1.0f, 400.0f), A00, r5);
            r6.A0Q(ECw2);
        }
        AnonymousClass6F1 r1 = (AnonymousClass6F1) ECw2;
        if (0fL.A02()) {
            0fL.A00(-954141855);
        }
        if (0fL.A02()) {
            0fL.A00(1413808976);
        }
        return r1;
    }
}
