package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class NOX extends C232222tE {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C69375NkF A02;
    public final C70489O8o A03;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67980My5(DbT.A0D(layoutInflater, viewGroup, R.layout.pending_threads_spam_folder_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r10, C249703kE r11) {
        String str;
        C2611948q r0;
        C71975Ou0 ou0 = (C71975Ou0) r10;
        C67980My5 my5 = (C67980My5) r11;
        boolean A1Z = AnonymousClass7TG.A1Z(ou0, my5);
        my5.A02.setText(ou0.A01);
        int i = ou0.A00;
        if (JTQ.A1P(i, 20)) {
            str = "+";
        } else {
            str = "";
        }
        my5.A01.setText(002.A03(i, str));
        boolean z = ou0.A02;
        String str2 = null;
        View view = my5.A00;
        if (z) {
            C71402Ok1.A00(view, 41, this);
        } else {
            view.setOnClickListener((View.OnClickListener) null);
        }
        UserSession userSession = this.A01;
        AnonymousClass0iw r2 = this.A00;
        Dba.A0j(A1Z ? 1 : 0, userSession, r2);
        OTI oti = (OTI) userSession.A01(OTI.class, new C73667Phg(44, r2, userSession));
        C69375NkF nkF = this.A02;
        if (!(nkF == null || (r0 = nkF.A02) == null)) {
            str2 = r0.A00;
        }
        OTI.A00(oti, "filter_tap", str2, (String) null, (String) null, -1);
    }

    public final Class modelClass() {
        return C71975Ou0.class;
    }

    public NOX(AnonymousClass0iw r1, UserSession userSession, C69375NkF nkF, C70489O8o o8o) {
        this.A03 = o8o;
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = nkF;
    }
}
