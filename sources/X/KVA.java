package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

public final class KVA extends C60518Jmp {
    public final TextView A00;

    public KVA(View view) {
        super(view);
        view.setBackgroundResource(0);
        Dbb.A0t(view, R.id.row_search_for_x_container, 0);
        TextView A0G = DbU.A0G(view, R.id.row_search_for_x_textview);
        this.A00 = A0G;
        DbT.A17(JTQ.A06(this), A0G, 2Yu.A0E(JTQ.A06(this)));
        ImageView A0J = DbX.A0J(view, R.id.search_loading_spinner);
        A0J.setColorFilter(AnonymousClass37O.A00(2Yu.A05(JTQ.A06(this))));
        A0J.setVisibility(0);
    }
}
