package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

public final class U7H extends 02Z {
    public final int A00;
    public final Object A01;
    public final String A02;

    public U7H(String str, Object obj, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = obj;
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.A00 != 0) {
            AnonymousClass7TG.A1N(view, accessibilityNodeInfoCompat);
            U7H.super.A0Y(view, accessibilityNodeInfoCompat);
            C13989Tnp.A1C(accessibilityNodeInfoCompat, this.A02);
            accessibilityNodeInfoCompat.setContentDescription(((C60629Joc) this.A01).A01.getText());
            2eS.A05(accessibilityNodeInfoCompat, AnonymousClass05K.A01);
            return;
        }
        AnonymousClass7TF.A1H(view, accessibilityNodeInfoCompat);
        U7H.super.A0Y(view, accessibilityNodeInfoCompat);
        2eS.A05(accessibilityNodeInfoCompat, (Integer) this.A01);
        String str = this.A02;
        if (str == null || str.length() == 0) {
            accessibilityNodeInfoCompat.setClickable(false);
            accessibilityNodeInfoCompat.mInfo.setLongClickable(false);
            accessibilityNodeInfoCompat.removeAction(04x.A08);
            accessibilityNodeInfoCompat.removeAction(04x.A0L);
            return;
        }
        C13989Tnp.A1C(accessibilityNodeInfoCompat, str);
    }
}
