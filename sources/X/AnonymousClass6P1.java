package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.6P1  reason: invalid class name */
public final class AnonymousClass6P1 implements C2365734g {
    public final /* synthetic */ AnonymousClass6P0 A00;

    public AnonymousClass6P1(AnonymousClass6P0 r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        TextView textView;
        0qQ.A0B(view, 0);
        AnonymousClass6P0 r2 = this.A00;
        View requireViewById = view.requireViewById(R.id.popularity_proof_container);
        0qQ.A0B(requireViewById, 0);
        r2.A00 = requireViewById;
        ImageView imageView = (ImageView) view.requireViewById(R.id.popularity_proof_icon);
        0qQ.A0B(imageView, 0);
        r2.A01 = imageView;
        TextView textView2 = (TextView) view.requireViewById(R.id.popularity_proof_text);
        0qQ.A0B(textView2, 0);
        r2.A03 = textView2;
        if (r2.A05 == AnonymousClass05K.A0C) {
            textView = (TextView) view.requireViewById(R.id.popularity_proof_bullet);
        } else {
            textView = null;
        }
        r2.A02 = textView;
        if (textView != null) {
            textView.setText(" • ");
        }
    }
}
