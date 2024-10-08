package X;

import android.content.Context;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.6qf  reason: invalid class name and case insensitive filesystem */
public final class C319476qf extends 02Z {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public C319476qf(Context context, String str, boolean z) {
        this.A01 = str;
        this.A02 = z;
        this.A00 = context;
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C319476qf.super.A0Y(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.addAction(new 04x(16, this.A01));
        if (this.A02) {
            accessibilityNodeInfoCompat.addAction(new 04x(32, this.A00.getString(2131954991)));
        }
    }
}
