package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public abstract class UEW extends C249703kE {
    public ImageView A00;
    public TextView A01;
    public final View A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UEW(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A02 = view;
    }

    public final ImageView A00() {
        if (this instanceof Us7) {
            return ((Us7) this).A01;
        }
        ImageView imageView = this.A00;
        if (imageView != null) {
            return imageView;
        }
        0qQ.A0F("button");
        throw AnonymousClass00P.createAndThrow();
    }

    public final TextView A01() {
        if (this instanceof Us7) {
            return ((Us7) this).A02;
        }
        TextView textView = this.A01;
        if (textView != null) {
            return textView;
        }
        0qQ.A0F("labelView");
        throw AnonymousClass00P.createAndThrow();
    }
}
