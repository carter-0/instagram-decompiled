package X;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

public final class JYV extends C232222tE {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60557JnS(DbT.A0D(layoutInflater, viewGroup, R.layout.partnerships_inbox_header_row_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        SpannableStringBuilder A002;
        JYS jys = (JYS) r8;
        C60557JnS jnS = (C60557JnS) r9;
        boolean A1U = AnonymousClass7TF.A1U(0, jys, jnS);
        boolean z = jys.A01;
        IgTextView igTextView = jnS.A00;
        Context context = igTextView.getContext();
        if (z) {
            String A16 = AnonymousClass7TE.A16(context, 2131976653);
            A002 = DbY.A0D(context, A16, 2131957104);
            AnonymousClass7AV.A05(A002, new C60016JdP(0, context, this), A16);
        } else {
            Spanned fromHtml = Html.fromHtml(context.getResources().getString(2131957101));
            0qQ.A07(fromHtml);
            C253003q3 r1 = new C253003q3(DbS.A0C(fromHtml), this.A00);
            r1.A0B = jys.A00;
            r1.A0b = A1U;
            r1.A04 = DbV.A02(context);
            A002 = r1.A00();
        }
        DbX.A1G(igTextView, A002);
    }

    public final Class modelClass() {
        return JYS.class;
    }

    public JYV(UserSession userSession) {
        this.A00 = userSession;
    }
}
