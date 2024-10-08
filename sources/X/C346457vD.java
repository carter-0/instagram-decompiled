package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.7vD  reason: invalid class name and case insensitive filesystem */
public final class C346457vD extends 02Z {
    public final /* synthetic */ C362048hG A00;
    public final /* synthetic */ String A01;

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        0qQ.A0B(view, 0);
        0qQ.A0B(accessibilityNodeInfoCompat, 1);
        C346457vD.super.A0Y(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.mInfo.setText(this.A00.A0O.getString(2131952862, new Object[]{this.A01}));
    }

    public C346457vD(C362048hG r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}
