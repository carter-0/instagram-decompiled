package X;

import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/* renamed from: X.7Pa  reason: invalid class name and case insensitive filesystem */
public final class C330987Pa extends C249703kE {
    public final TextView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C330987Pa(TextView textView) {
        super(textView);
        0qQ.A0B(textView, 1);
        this.A00 = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
    }
}
