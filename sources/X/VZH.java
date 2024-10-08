package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

public final class VZH {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;

    public VZH(View view) {
        this.A00 = view;
        this.A04 = DbW.A0B(view, R.id.title);
        this.A01 = DbW.A0B(view, R.id.body);
        this.A02 = DbW.A0B(view, R.id.text_link);
        this.A03 = DbW.A0B(view, R.id.text_link_2);
    }
}
