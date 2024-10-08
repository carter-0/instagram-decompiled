package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

public final class UD8 extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final VNN A02;

    public UD8(View view, VNN vnn) {
        super(view);
        this.A02 = vnn;
        this.A01 = DbW.A0B(view, R.id.recommend_accounts_header_title);
        this.A00 = AnonymousClass7TE.A0b(view, R.id.recommend_accounts_button);
    }
}
