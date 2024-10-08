package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.5dY  reason: invalid class name and case insensitive filesystem */
public final class C289415dY extends ViewOutlineProvider {
    public final void getOutline(View view, Outline outline) {
        0qQ.A0C(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
        boolean z = C289385dV.A0H;
        Outline A01 = ((C289385dV) view).A09.A01();
        0qQ.A0A(A01);
        outline.set(A01);
    }
}
