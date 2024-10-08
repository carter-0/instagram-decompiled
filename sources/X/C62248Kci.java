package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: X.Kci  reason: case insensitive filesystem */
public final class C62248Kci extends C60687JpY {
    public C240913Nc A00;
    public C240913Nc A01;
    public C240913Nc A02;

    public final void A00() {
        super.A00();
        C240913Nc r1 = this.A00;
        if (r1.A01()) {
            r1.A00().setOnClickListener((View.OnClickListener) null);
            r1.A00().setVisibility(8);
        }
        C240913Nc r12 = this.A02;
        if (r12.A01()) {
            r12.A00().setVisibility(8);
        }
        C240913Nc r13 = this.A01;
        if (r13.A01()) {
            r13.A00().setVisibility(8);
        }
        TextView textView = this.A07;
        textView.setEllipsize((TextUtils.TruncateAt) null);
        textView.setSingleLine(false);
        LinearLayout linearLayout = this.A06;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (layoutParams2.weight == 1.0f && layoutParams2.width == 0) {
            layoutParams2.weight = 0.0f;
            layoutParams2.width = -2;
            linearLayout.setLayoutParams(layoutParams2);
        }
    }
}
