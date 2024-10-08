package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityManager;

/* renamed from: X.5nk  reason: invalid class name and case insensitive filesystem */
public final class C295195nk {
    public boolean A00;
    public final Context A01;
    public final C295205nl A02;

    public final void A00(Canvas canvas) {
        if (this.A00) {
            C295205nl r3 = this.A02;
            if (r3.A00 != 0.0f) {
                Object systemService = this.A01.getSystemService("accessibility");
                0qQ.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
                AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
                if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                    canvas.drawColor(((int) (128.0f * r3.A00)) * 16777216);
                }
            }
        }
    }

    public C295195nk(View view) {
        Context context = view.getContext();
        0qQ.A07(context);
        this.A01 = context;
        this.A02 = new C295205nl(view);
    }
}
