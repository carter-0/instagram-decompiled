package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;

/* renamed from: X.K2m  reason: case insensitive filesystem */
public final class C61325K2m extends LEL implements C66422MRc {
    public static final void A00(C61325K2m k2m) {
        try {
            ViewGroup viewGroup = k2m.A06;
            Bitmap A0B = AnonymousClass7TF.A0B(viewGroup.getWidth(), (viewGroup.getHeight() - k2m.A01) - k2m.A00);
            Canvas A0B2 = JTO.A0B(A0B);
            A0B2.translate(0.0f, -((float) k2m.A02));
            k2m.A01();
            viewGroup.draw(A0B2);
            View view = k2m.A05;
            if (view != null) {
                view.setVisibility(0);
            }
            CirclePageIndicator circlePageIndicator = k2m.A0B;
            if (circlePageIndicator != null) {
                circlePageIndicator.setVisibility(0);
            }
            View view2 = k2m.A04;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            C290815g0 A00 = MB7.A00(A0B, k2m, 1);
            A00.A00 = k2m.A0A;
            1ES.A03(A00);
        } catch (Exception unused) {
        }
    }

    public final void FNd() {
        if (Build.VERSION.SDK_INT < 33) {
            Context context = this.A03;
            if (!1DL.A07(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                C64729Lh6 lh6 = new C64729Lh6(0, new C66069MAc(this, 1), this);
                JTO.A1Z(context);
                JTP.A11((Activity) context, lh6, "android.permission.WRITE_EXTERNAL_STORAGE");
                return;
            }
        }
        A00(this);
    }
}
