package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.3gr  reason: invalid class name and case insensitive filesystem */
public final class C247753gr {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LL(this, 7));

    public C247753gr(View view) {
        0qQ.A0B(view, 1);
        this.A01 = view;
        View requireViewById = view.requireViewById(R.id.indicator_background_view);
        0qQ.A07(requireViewById);
        this.A00 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.indicator_icon_view);
        0qQ.A07(requireViewById2);
        this.A02 = (ImageView) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.indicator_text_view);
        0qQ.A07(requireViewById3);
        this.A03 = (TextView) requireViewById3;
    }
}
