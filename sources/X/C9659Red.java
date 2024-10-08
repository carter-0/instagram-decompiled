package X;

import android.content.Context;
import android.widget.ImageView;

/* renamed from: X.Red  reason: case insensitive filesystem */
public abstract class C9659Red {
    public static final void A00(Context context, ImageView imageView, RH3 rh3) {
        int i = rh3.A00;
        int i2 = rh3.A01;
        SPB A0A = AnonymousClass2E0.A0A();
        if (context == null) {
            context = imageView.getContext();
        }
        0qQ.A0A(context);
        imageView.setImageDrawable(A0A.A05(context, i, i2));
    }
}
