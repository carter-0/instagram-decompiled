package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.Old  reason: case insensitive filesystem */
public final /* synthetic */ class C71488Old implements AnonymousClass03Q {
    public final 04k Cvn(View view, 04k r5) {
        02M A05 = r5.A00.A05(3);
        if (view instanceof FrameLayout) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.bottomMargin = A05.A00;
            marginLayoutParams.topMargin = A05.A03;
        }
        return 04k.A01;
    }
}
