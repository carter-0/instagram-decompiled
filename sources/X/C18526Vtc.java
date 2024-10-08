package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vtc  reason: case insensitive filesystem */
public final class C18526Vtc {
    public static final C18526Vtc A00 = new Object();

    public final C265674Vs A00(Context context, WindowLayoutInfo windowLayoutInfo) {
        2YG AIh;
        C18547Vtz vtz;
        C18546Vty vty;
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            AIh = AnonymousClass2YC.A00.AIi(context);
        } else if (i2 < 29 || !(context instanceof Activity)) {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        } else {
            AIh = AnonymousClass2YC.A00.AIh((Activity) context);
        }
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList A15 = DbV.A15(displayFeatures);
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                0qQ.A05(foldingFeature);
                FoldingFeature foldingFeature2 = foldingFeature;
                0qQ.A0B(foldingFeature2, 1);
                int type = foldingFeature2.getType();
                if (type == 1) {
                    vtz = C18547Vtz.A01;
                } else if (type == 2) {
                    vtz = C18547Vtz.A02;
                }
                int state = foldingFeature2.getState();
                if (state == 1) {
                    vty = C18546Vty.A01;
                } else if (state == 2) {
                    vty = C18546Vty.A02;
                }
                Rect bounds = foldingFeature2.getBounds();
                0qQ.A07(bounds);
                2YF r8 = new 2YF(bounds);
                Rect A002 = AIh.A00();
                int i3 = r8.A00 - r8.A03;
                if (!(i3 == 0 && r8.A02 - r8.A01 == 0) && (((i = r8.A02 - r8.A01) == A002.width() || i3 == A002.height()) && ((i >= A002.width() || i3 >= A002.height()) && !(i == A002.width() && i3 == A002.height())))) {
                    Rect bounds2 = foldingFeature2.getBounds();
                    0qQ.A07(bounds2);
                    A15.add(new C18958WEl(new 2YF(bounds2), vty, vtz));
                }
            }
        }
        return new C265674Vs(A15);
    }
}
