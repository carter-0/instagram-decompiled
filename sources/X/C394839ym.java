package X;

import android.content.Context;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.9ym  reason: invalid class name and case insensitive filesystem */
public abstract class C394839ym {
    public static final void A00(Context context, String str) {
        AccessibilityManager accessibilityManager;
        0qQ.A0B(context, 0);
        Object systemService = context.getSystemService("accessibility");
        if ((systemService instanceof AccessibilityManager) && (accessibilityManager = (AccessibilityManager) systemService) != null && 2eO.A02(accessibilityManager, true)) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            0qQ.A07(obtain);
            obtain.setEventType(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
            obtain.getText().add(AnonymousClass7TF.A0e(context.getResources(), str, 2131956282));
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }
}
