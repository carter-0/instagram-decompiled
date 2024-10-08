package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.instagram.android.R;

public final class F0M {
    public final ImageView A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final View A04;
    public final CardView A05;

    public F0M(View view) {
        0qQ.A0B(view, 1);
        this.A04 = view;
        CardView cardView = (CardView) AnonymousClass7TF.A0F(view, R.id.card_view);
        this.A05 = cardView;
        this.A03 = AnonymousClass7TG.A0R(view, R.id.link_title);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.link_sub_title);
        this.A01 = DbX.A0J(view, R.id.link_icon);
        this.A00 = DbX.A0J(view, R.id.chevron_icon);
        cardView.setCardElevation(0.0f);
    }
}
