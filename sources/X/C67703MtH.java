package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.MtH  reason: case insensitive filesystem */
public final class C67703MtH extends 02Z {
    public final int A00;

    public C67703MtH(int i) {
        this.A00 = i;
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        CharSequence charSequence;
        int i;
        switch (this.A00) {
            case 0:
                AnonymousClass7TG.A1N(view, accessibilityNodeInfoCompat);
                C67703MtH.super.A0Y(view, accessibilityNodeInfoCompat);
                charSequence = view.getResources().getText(2131973082);
                0qQ.A07(charSequence);
                i = 16;
                break;
            case 1:
                AnonymousClass7TG.A1N(view, accessibilityNodeInfoCompat);
                C67703MtH.super.A0Y(view, accessibilityNodeInfoCompat);
                charSequence = AnonymousClass7TF.A0d(view.getResources(), 2131966195);
                i = 32;
                break;
            case 2:
            case 3:
                AnonymousClass7TG.A1N(view, accessibilityNodeInfoCompat);
                C67703MtH.super.A0Y(view, accessibilityNodeInfoCompat);
                2eS.A05(accessibilityNodeInfoCompat, AnonymousClass05K.A15);
                return;
            default:
                C67703MtH.super.A0Y(view, accessibilityNodeInfoCompat);
                return;
        }
        accessibilityNodeInfoCompat.addAction(new 04x(i, charSequence));
    }
}
