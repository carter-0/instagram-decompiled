package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class EGC extends C232222tE {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final String A02 = E7J.__redex_internal_original_name;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C46989Doh(DbU.A09(layoutInflater, viewGroup, R.layout.user_pay_earnings_header, false));
    }

    public EGC(FragmentActivity fragmentActivity, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r14, C249703kE r15) {
        FY8 fy8 = (FY8) r14;
        C46989Doh doh = (C46989Doh) r15;
        AnonymousClass7TF.A1H(fy8, doh);
        Context A07 = DbS.A07(doh);
        doh.A03.setText(fy8.A01);
        doh.A01.setText(2131976270);
        doh.A00.setText(fy8.A00);
        UserSession userSession = this.A01;
        if (182.A06(DbS.A0J(userSession, 0), userSession, 36312973530760772L)) {
            String A16 = AnonymousClass7TE.A16(A07, 2131976274);
            FragmentActivity fragmentActivity = this.A00;
            String str = this.A02;
            F6T.A00(doh.A02, fragmentActivity, userSession, 2EG.A2k, str, DbY.A0c(A07, A16, 2131976273), A16, "https://help.instagram.com/907314980182940", (C62320sa) null);
            return;
        }
        DbX.A13(A07, doh.A02, "", 2131976273);
    }

    public final Class modelClass() {
        return FY8.class;
    }
}
