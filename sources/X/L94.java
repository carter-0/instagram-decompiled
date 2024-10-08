package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

public final class L94 {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;

    public L94(View view) {
        0qQ.A0B(view, 1);
        this.A01 = view;
        this.A04 = AnonymousClass7TG.A0R(view, R.id.row_venue_title);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.row_venue_subtitle);
        this.A02 = DbX.A0J(view, R.id.row_place_icon);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.row_divider);
    }
}
