package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class L8C {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final C64162LRd A03;

    public L8C(View view, UserSession userSession) {
        this.A01 = DbS.A0G(view, R.id.icon);
        this.A02 = DbU.A0G(view, R.id.candidate_names);
        View requireViewById = view.requireViewById(R.id.blast_list_candidates_container);
        this.A00 = requireViewById;
        this.A03 = new C64162LRd(requireViewById, userSession, AnonymousClass05K.A0Y);
    }
}
