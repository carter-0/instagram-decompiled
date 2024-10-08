package X;

import android.content.Context;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.6Pu  reason: invalid class name and case insensitive filesystem */
public final class C307356Pu extends 02Z {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        0qQ.A0B(view, 0);
        0qQ.A0B(accessibilityNodeInfoCompat, 1);
        C307356Pu.super.A0Y(view, accessibilityNodeInfoCompat);
        Context context = this.A00;
        accessibilityNodeInfoCompat.setContentDescription(context.getString(2131971750, new Object[]{this.A01}));
        accessibilityNodeInfoCompat.setRoleDescription(context.getString(2131954408));
        04x r0 = 04x.A04;
        accessibilityNodeInfoCompat.addAction(new 04x(16, context.getString(2131971749)));
    }

    public C307356Pu(Context context, String str) {
        this.A00 = context;
        this.A01 = str;
    }
}
