package X;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.List;

/* renamed from: X.5SR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5SR implements AccessibilityManager.AccessibilityStateChangeListener {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat A00;

    public /* synthetic */ AnonymousClass5SR(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.A00 = androidComposeViewAccessibilityDelegateCompat;
    }

    public final void onAccessibilityStateChanged(boolean z) {
        List<AccessibilityServiceInfo> list;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A00;
        01K r0 = AndroidComposeViewAccessibilityDelegateCompat.A0Y;
        if (z) {
            list = androidComposeViewAccessibilityDelegateCompat.A0O.getEnabledAccessibilityServiceList(-1);
        } else {
            list = 0sn.A00;
        }
        androidComposeViewAccessibilityDelegateCompat.A0E = list;
    }
}
