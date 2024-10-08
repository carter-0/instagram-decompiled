package X;

import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.O1t  reason: case insensitive filesystem */
public abstract class C70315O1t {
    public static final void A00(C306606Mu r2) {
        0qQ.A0B(r2, 0);
        r2.A00();
        ImageView imageView = r2.A01;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.share_check);
            r2.A00();
            TextView textView = r2.A03;
            if (textView != null) {
                textView.setText(2131971452);
                r2.A00();
                TextView textView2 = r2.A02;
                if (textView2 != null) {
                    textView2.setText(2131971451);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0y();
    }
}
