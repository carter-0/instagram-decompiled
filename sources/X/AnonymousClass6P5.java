package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.6P5  reason: invalid class name */
public final class AnonymousClass6P5 implements C2365734g {
    public final /* synthetic */ AnonymousClass6P4 A00;

    public AnonymousClass6P5(AnonymousClass6P4 r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0B(view, 0);
        AnonymousClass6P4 r1 = this.A00;
        r1.A00 = view;
        TextView textView = (TextView) view.requireViewById(R.id.product_pill_header);
        0qQ.A0B(textView, 0);
        r1.A02 = textView;
        TextView textView2 = (TextView) view.requireViewById(R.id.product_pill_header_more_products);
        0qQ.A0B(textView2, 0);
        r1.A01 = textView2;
    }
}
