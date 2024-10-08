package X;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* renamed from: X.5Sw  reason: invalid class name and case insensitive filesystem */
public final class C285825Sw implements C285835Sx {
    public final AccessibilityManager A00;

    public C285825Sw(Context context) {
        Object systemService = context.getSystemService("accessibility");
        0qQ.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.A00 = (AccessibilityManager) systemService;
    }
}
