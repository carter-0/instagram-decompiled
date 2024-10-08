package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: X.5Yn  reason: invalid class name and case insensitive filesystem */
public abstract class C286975Yn {
    public static final C267314bM A00 = new C267304bL(C286985Yo.A00);

    public static final void A00(C286575Wy r7, 0sL r8, int i) {
        int i2;
        0qQ.A0B(r8, 0);
        r7.ExV(820577390);
        if ((i & 6) == 0) {
            int i3 = 2;
            if (r7.AGw(r8)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-212137391, "com.meta.compose.resources.ProvideCachingResourceResolver (ProvideResourcesCache.kt:18)");
            }
            C286565Wx r4 = (C286565Wx) r7;
            Context context = (Context) C286615Xc.A01(AndroidCompositionLocals_androidKt.A01, C286565Wx.A04(r4));
            Object A01 = C286615Xc.A01(AndroidCompositionLocals_androidKt.A00, C286565Wx.A04(r4));
            Resources.Theme theme = context.getTheme();
            r7.ExS(-1666340002);
            boolean AGu = r7.AGu(A01) | r7.AGu(theme);
            Object ECw = r7.ECw();
            if (AGu || ECw == AnonymousClass5XT.A00) {
                ECw = new C286995Yp(context);
                r4.A0Q(ECw);
            }
            C286565Wx.A0L(r4, false);
            C286715Xm.A00(r7, A00.A02(ECw), r8, ((i2 << 3) & 112) | 8);
            if (0fL.A02()) {
                0fL.A00(235370032);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C377329Lk(r8, i, 3);
        }
    }
}
