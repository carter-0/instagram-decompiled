package X;

import android.view.View;
import android.widget.TextView;

/* renamed from: X.9m9  reason: invalid class name and case insensitive filesystem */
public final class C387399m9 extends C3497981v {
    public final TextView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C387399m9(View view, TextView textView) {
        super(view);
        0qQ.A0B(textView, 2);
        this.A00 = textView;
    }

    public final void A01(int i) {
        TextView textView = this.A00;
        textView.setText(String.valueOf(i));
        textView.setContentDescription(C55148Hcw.A00(AnonymousClass7TE.A0S(textView), Integer.valueOf(i)));
    }
}
