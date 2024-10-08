package X;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

public final class KG7 extends C232222tE {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r9, C249703kE r10) {
        C64773Lhp lhp = (C64773Lhp) r9;
        C60525Jmw jmw = (C60525Jmw) r10;
        boolean A1U = AnonymousClass7TF.A1U(0, lhp, jmw);
        UserSession userSession = this.A00;
        int i = lhp.A00;
        MSP msp = lhp.A01;
        IgTextView igTextView = jmw.A00;
        Context context = igTextView.getContext();
        if (userSession == null || msp == null) {
            DbT.A18(context, igTextView, i);
        } else {
            Spanned fromHtml = Html.fromHtml(context.getResources().getString(i));
            0qQ.A07(fromHtml);
            C253003q3 r1 = new C253003q3(DbS.A0C(fromHtml), userSession);
            r1.A0B = msp;
            r1.A0b = A1U;
            r1.A04 = DbV.A02(context);
            DbX.A1G(igTextView, r1.A00());
        }
        igTextView.setPadding(44, 0, 44, 0);
        DbT.A17(context, igTextView, 2Yu.A08(context));
    }

    public final Class modelClass() {
        return C64773Lhp.class;
    }

    public KG7(UserSession userSession) {
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C60525Jmw(new IgTextView(JTU.A06(viewGroup)));
    }

    public KG7() {
        this((UserSession) null);
    }
}
