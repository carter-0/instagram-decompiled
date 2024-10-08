package X;

import android.content.Context;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.gestures.ScrollableElement;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: X.6Hn  reason: invalid class name and case insensitive filesystem */
public abstract class C305346Hn {
    public static final Modifier A00(JS2 js2, AnonymousClass6HS r8, AnonymousClass6Gj r9, C305096Gn r10, C287605aT r11, C286575Wy r12, Modifier modifier, int i, boolean z, boolean z2) {
        C305386Hs r6;
        Modifier modifier2;
        if ((i & 64) != 0) {
            js2 = null;
        }
        if (0fL.A02()) {
            0fL.A01(1013264376, "androidx.compose.foundation.scrollingContainer (ScrollingContainer.kt:40)");
        }
        if (0fL.A02()) {
            0fL.A01(838754084, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:583)");
        }
        if (0fL.A02()) {
            0fL.A01(1070059059, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.android.kt:63)");
        }
        C286565Wx r4 = (C286565Wx) r12;
        Context context = (Context) C286615Xc.A01(AndroidCompositionLocals_androidKt.A01, C286565Wx.A04(r4));
        C305376Hq r2 = (C305376Hq) C286615Xc.A01(C305356Ho.A00, C286565Wx.A04(r4));
        if (r2 != null) {
            r12.ExS(1586021609);
            boolean AGu = r12.AGu(context) | r12.AGu(r2);
            Object ECw = r12.ECw();
            if (AGu || ECw == AnonymousClass5XT.A00) {
                ECw = new AndroidEdgeEffectOverscrollEffect(context, r2);
                r4.A0Q(ECw);
            }
            r6 = (AndroidEdgeEffectOverscrollEffect) ECw;
            C286565Wx.A0L(r4, false);
        } else {
            r12.ExS(1586120933);
            C286565Wx.A0I(r4);
            r6 = C56829IEa.A00;
        }
        C305386Hs r62 = r6;
        if (0fL.A02()) {
            0fL.A00(-2142619774);
        }
        if (0fL.A02()) {
            0fL.A00(1056081614);
        }
        AnonymousClass6Gj r3 = AnonymousClass6Gj.Vertical;
        if (r9 == r3) {
            modifier2 = C305396Hu.A01;
        } else {
            modifier2 = C305396Hu.A00;
        }
        Modifier Ezh = modifier.Ezh(modifier2).Ezh(r62.B04());
        boolean z3 = !z2;
        if (C286615Xc.A01(AnonymousClass5YA.A07, C286565Wx.A04(r4)) == AnonymousClass5Q8.Rtl && r9 != r3) {
            z3 = !z3;
        }
        Modifier Ezh2 = Ezh.Ezh(new ScrollableElement(r62, js2, r8, r9, r10, r11, z, z3));
        if (0fL.A02()) {
            0fL.A00(-896437404);
        }
        return Ezh2;
    }
}
