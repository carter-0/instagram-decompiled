package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;

/* renamed from: X.Mja  reason: case insensitive filesystem */
public final class C67178Mja extends C232222tE {
    public final Context A00;
    public final C67162MjK A01;
    public final UserSession A02;

    /* JADX WARNING: type inference failed for: r1v1, types: [X.3kE, X.MwB] */
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        boolean A1U = AnonymousClass7TF.A1U(0, viewGroup, layoutInflater);
        View A09 = DbU.A09(layoutInflater, viewGroup, R.layout.direct_empty_inbox_header, false);
        0qQ.A0B(A09, A1U ? 1 : 0);
        ? r1 = new C249703kE(A09);
        r1.A00 = Dba.A0E(A09, R.id.title_text);
        r1.A01 = (IgView) AnonymousClass7TE.A0b(A09, R.id.divider);
        return r1;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        C67867MwB mwB = (C67867MwB) r8;
        0qQ.A0B(mwB, 1);
        IgTextView igTextView = mwB.A00;
        igTextView.setVisibility(0);
        mwB.A01.setVisibility(8);
        Context context = this.A00;
        String A16 = AnonymousClass7TE.A16(context, 2131959466);
        String A162 = AnonymousClass7TE.A16(context, 2131959465);
        SpannableStringBuilder A0C = DbS.A0C(C66580MXl.A10(A16, A162));
        AnonymousClass7AV.A05(A0C, new C69194Ngs(this, AnonymousClass7TF.A03(context, R.attr.igds_color_gradient_blue)), A162);
        DbX.A1G(igTextView, A0C);
    }

    public final Class modelClass() {
        return C68597NOt.class;
    }

    public C67178Mja(Context context, UserSession userSession, C67162MjK mjK) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = mjK;
    }
}
