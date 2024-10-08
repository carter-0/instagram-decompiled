package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.9Y6  reason: invalid class name */
public final class AnonymousClass9Y6 extends 02Z {
    public final /* synthetic */ AnonymousClass5Gv A00;

    public AnonymousClass9Y6(AnonymousClass5Gv r1) {
        this.A00 = r1;
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AnonymousClass7TG.A1N(view, accessibilityNodeInfoCompat);
        AnonymousClass9Y6.super.A0Y(view, accessibilityNodeInfoCompat);
        AnonymousClass5Gv r1 = this.A00;
        C284395Mi r2 = r1.A05;
        if (r2 instanceof C369058tl) {
            CharSequence charSequence = r1.A0B;
            if (charSequence == null) {
                0qQ.A0C(r2, "null cannot be cast to non-null type com.instagram.igds.components.tooltip.template.BaseTextViewBinder.Holder");
                charSequence = ((C369058tl) r2).A00.getText();
            }
            accessibilityNodeInfoCompat.mInfo.setTooltipText(charSequence);
        }
    }
}
