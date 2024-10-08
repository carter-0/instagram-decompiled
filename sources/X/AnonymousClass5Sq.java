package X;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* renamed from: X.5Sq  reason: invalid class name */
public final class AnonymousClass5Sq implements View.OnAttachStateChangeListener {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat A00;

    public AnonymousClass5Sq(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.A00 = androidComposeViewAccessibilityDelegateCompat;
    }

    public final void onViewAttachedToWindow(View view) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A00;
        01K r0 = AndroidComposeViewAccessibilityDelegateCompat.A0Y;
        AccessibilityManager accessibilityManager = androidComposeViewAccessibilityDelegateCompat.A0O;
        accessibilityManager.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.A0M);
        accessibilityManager.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.A0N);
    }

    public final void onViewDetachedFromWindow(View view) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A00;
        01K r0 = AndroidComposeViewAccessibilityDelegateCompat.A0Y;
        androidComposeViewAccessibilityDelegateCompat.A0L.removeCallbacks(androidComposeViewAccessibilityDelegateCompat.A0T);
        AccessibilityManager accessibilityManager = androidComposeViewAccessibilityDelegateCompat.A0O;
        accessibilityManager.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.A0M);
        accessibilityManager.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.A0N);
    }
}
