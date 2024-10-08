package X;

import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* renamed from: X.5SS  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5SS implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat A00;

    public /* synthetic */ AnonymousClass5SS(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.A00 = androidComposeViewAccessibilityDelegateCompat;
    }

    public final void onTouchExplorationStateChanged(boolean z) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A00;
        01K r0 = AndroidComposeViewAccessibilityDelegateCompat.A0Y;
        androidComposeViewAccessibilityDelegateCompat.A0E = androidComposeViewAccessibilityDelegateCompat.A0O.getEnabledAccessibilityServiceList(-1);
    }
}
