package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.6PE  reason: invalid class name */
public final class AnonymousClass6PE implements C2365734g {
    public final /* synthetic */ AnonymousClass6PD A00;

    public AnonymousClass6PE(AnonymousClass6PD r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0B(view, 0);
        AnonymousClass6PD r1 = this.A00;
        View requireViewById = view.requireViewById(R.id.social_context_container);
        requireViewById.setTag(r1);
        r1.A00 = requireViewById;
        ImageView imageView = (ImageView) view.requireViewById(R.id.social_context_facepile);
        0qQ.A0B(imageView, 0);
        r1.A01 = imageView;
        TextView textView = (TextView) view.requireViewById(R.id.social_context_text);
        0qQ.A0B(textView, 0);
        r1.A02 = textView;
    }
}
