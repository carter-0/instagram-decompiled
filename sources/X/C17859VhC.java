package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.VhC  reason: case insensitive filesystem */
public final class C17859VhC {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;

    public final void A00(UserSession userSession, C249693kD r10) {
        int[] A022 = C297825sP.A02(userSession, r10);
        C13988Tno.A15(this.A01, A022[0]);
        C13988Tno.A15(this.A03, A022[1]);
        C272024jy A002 = C297825sP.A00(r10);
        A002.getClass();
        List A012 = AnonymousClass9OX.A01(A002);
        TextView textView = this.A00;
        textView.setText(C15565Uet.A00(textView.getResources(), (C272014jx) A012.get(0), A022[0]));
        TextView textView2 = this.A02;
        textView2.setText(C15565Uet.A00(textView2.getResources(), (C272014jx) A012.get(1), A022[1]));
    }

    public C17859VhC(View view) {
        this.A01 = DbU.A0G(view, R.id.dashboard_poll_result_first_option_tally);
        this.A00 = DbU.A0G(view, R.id.dashboard_poll_result_first_option);
        this.A03 = DbU.A0G(view, R.id.dashboard_poll_result_second_option_tally);
        this.A02 = DbU.A0G(view, R.id.dashboard_poll_result_second_option);
    }
}
