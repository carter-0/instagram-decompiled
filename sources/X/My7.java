package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

public final class My7 extends C249703kE {
    public final TextView A00;
    public final View A01;
    public final TextView A02;

    public My7(View view) {
        super(view);
        this.A01 = view;
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.keyword_name);
        this.A00 = A0R;
        TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.see_all);
        this.A02 = A0R2;
        A0R.setFocusable(true);
        A0R2.setFocusable(true);
        2eS.A01(A0R2);
    }
}
