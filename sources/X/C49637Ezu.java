package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Ezu  reason: case insensitive filesystem */
public final class C49637Ezu {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;

    public C49637Ezu(View view) {
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A04 = AnonymousClass7TG.A0R(view, R.id.link_option_text);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.link_option_sub_text);
        this.A01 = DbX.A0J(view, R.id.link_option_icon);
        this.A02 = DbX.A0J(view, R.id.link_option_overflow_icon);
    }
}
