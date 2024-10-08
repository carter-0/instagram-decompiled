package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

public final class U7D extends 02Z {
    public final int A00;

    public U7D(int i) {
        this.A00 = i;
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        String str;
        switch (this.A00) {
            case 0:
                U7D.super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.mInfo.setSelected(true);
                return;
            case 1:
                AnonymousClass7TG.A1N(view, accessibilityNodeInfoCompat);
                U7D.super.A0Y(view, accessibilityNodeInfoCompat);
                str = "android.widget.Button";
                break;
            case 2:
                AnonymousClass7TG.A1N(view, accessibilityNodeInfoCompat);
                U7D.super.A0Y(view, accessibilityNodeInfoCompat);
                str = null;
                break;
            case 3:
                AnonymousClass7TG.A1N(view, accessibilityNodeInfoCompat);
                U7D.super.A0Y(view, accessibilityNodeInfoCompat);
                2eS.A05(accessibilityNodeInfoCompat, AnonymousClass05K.A0C);
                return;
            default:
                AnonymousClass7TG.A1N(view, accessibilityNodeInfoCompat);
                U7D.super.A0Y(view, accessibilityNodeInfoCompat);
                CharSequence text = view.getResources().getText(2131962479);
                0qQ.A07(text);
                C13989Tnp.A1C(accessibilityNodeInfoCompat, text);
                return;
        }
        accessibilityNodeInfoCompat.setClassName(str);
    }
}
