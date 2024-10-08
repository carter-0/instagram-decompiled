package X;

import android.content.res.Resources;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.8xT  reason: invalid class name and case insensitive filesystem */
public final class C371038xT extends 02Z {
    public final /* synthetic */ C370978xN A00;

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        0qQ.A0B(view, 0);
        0qQ.A0B(accessibilityNodeInfoCompat, 1);
        C371038xT.super.A0Y(view, accessibilityNodeInfoCompat);
        2eS.A05(accessibilityNodeInfoCompat, AnonymousClass05K.A01);
        04x r0 = 04x.A08;
        Resources resources = this.A00.A07.getResources();
        04x r3 = new 04x(16, resources.getString(2131973885));
        04x r02 = new 04x(32, resources.getString(2131973886));
        accessibilityNodeInfoCompat.addAction(r3);
        accessibilityNodeInfoCompat.addAction(r02);
    }

    public C371038xT(C370978xN r1) {
        this.A00 = r1;
    }
}
