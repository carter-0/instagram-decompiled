package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.MtI  reason: case insensitive filesystem */
public final class C67704MtI extends 02Z {
    public final int A00;
    public final String A01;

    public C67704MtI(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        switch (this.A00) {
            case 0:
                break;
            case 1:
            case 2:
                AnonymousClass7TG.A1N(view, accessibilityNodeInfoCompat);
                break;
            default:
                C67704MtI.super.A0Y(view, accessibilityNodeInfoCompat);
                return;
        }
        C67704MtI.super.A0Y(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.addAction(new 04x(16, this.A01));
    }
}
