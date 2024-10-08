package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

public final class U7I extends 02Z {
    public final /* synthetic */ Boolean A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AnonymousClass7TF.A1H(view, accessibilityNodeInfoCompat);
        U7I.super.A0Y(view, accessibilityNodeInfoCompat);
        2eS.A05(accessibilityNodeInfoCompat, this.A01);
        accessibilityNodeInfoCompat.setClickable(false);
        accessibilityNodeInfoCompat.mInfo.setLongClickable(false);
        accessibilityNodeInfoCompat.removeAction(04x.A08);
        accessibilityNodeInfoCompat.removeAction(04x.A0L);
        String str = this.A02;
        if (str != null) {
            accessibilityNodeInfoCompat.mInfo.setHintText(str);
        }
        String str2 = this.A03;
        if (str2 != null) {
            accessibilityNodeInfoCompat.mInfo.setText(str2);
        }
        Boolean bool = this.A00;
        if (bool != null) {
            accessibilityNodeInfoCompat.mInfo.setHeading(bool.booleanValue());
        }
    }

    public U7I(Boolean bool, Integer num, String str, String str2) {
        this.A01 = num;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = bool;
    }
}
