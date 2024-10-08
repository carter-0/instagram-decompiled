package X;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.KpH  reason: case insensitive filesystem */
public abstract class C62965KpH {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        Object obj;
        Object A0e = DbW.A0e(r7);
        C307786Rm r0 = r6.A03;
        if (r0 != null) {
            obj = r0.A00.getSystemService("accessibility");
        } else {
            obj = null;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) obj;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
            obtain.getText().add(A0e);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
        return null;
    }
}
