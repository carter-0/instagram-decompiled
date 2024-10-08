package X;

import android.content.res.Resources;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.TtQ  reason: case insensitive filesystem */
public final class C14292TtQ extends 02Z {
    public final /* synthetic */ Resources A00;

    public C14292TtQ(Resources resources) {
        this.A00 = resources;
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AnonymousClass7TG.A1N(view, accessibilityNodeInfoCompat);
        C14292TtQ.super.A0Y(view, accessibilityNodeInfoCompat);
        04x r0 = 04x.A08;
        Resources resources = this.A00;
        C13989Tnp.A1C(accessibilityNodeInfoCompat, resources.getString(2131954895));
        accessibilityNodeInfoCompat.addAction(new 04x(32, resources.getString(2131954896)));
    }
}
