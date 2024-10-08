package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.70a  reason: invalid class name */
public final class AnonymousClass70a extends 02Z {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ String A02;

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        0qQ.A0B(view, 0);
        0qQ.A0B(accessibilityNodeInfoCompat, 1);
        AnonymousClass70a.super.A0Y(view, accessibilityNodeInfoCompat);
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01.getText());
        sb.append(this.A02);
        accessibilityNodeInfoCompat.setContentDescription(sb.toString());
        accessibilityNodeInfoCompat.setClassName((CharSequence) null);
        accessibilityNodeInfoCompat.setRoleDescription(this.A00.getString(2131954408));
    }

    public AnonymousClass70a(Context context, TextView textView, String str) {
        this.A01 = textView;
        this.A02 = str;
        this.A00 = context;
    }
}
