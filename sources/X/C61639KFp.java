package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.KFp  reason: case insensitive filesystem */
public final class C61639KFp extends C232222tE {
    public final UserSession A00;
    public final C63685L2v A01;
    public final boolean A02 = true;

    public C61639KFp(UserSession userSession, C63685L2v l2v) {
        this.A00 = userSession;
        this.A01 = l2v;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        C64770Lhm lhm = (C64770Lhm) r8;
        C60647Jou jou = (C60647Jou) r9;
        AnonymousClass7TG.A1N(lhm, jou);
        UserSession userSession = this.A00;
        boolean z = this.A02;
        C63685L2v l2v = this.A01;
        AnonymousClass7TF.A1D(userSession, 0, l2v);
        IgTextView igTextView = jou.A03;
        UpcomingEvent upcomingEvent = lhm.A00;
        igTextView.setText(upcomingEvent.getTitle());
        IgTextView igTextView2 = jou.A02;
        Context context = jou.A00;
        0qQ.A07(context);
        igTextView2.setText(C14240TsN.A02(context, userSession, C18810W3l.A02(upcomingEvent)));
        LY7.A00(jou.A01, 64, l2v, lhm);
        View view = jou.itemView;
        if (z) {
            LY7.A00(view, 65, l2v, lhm);
        } else {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public final Class modelClass() {
        return C64770Lhm.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C60647Jou(DbT.A0D(layoutInflater, viewGroup, R.layout.live_scheduling_management_row, false));
    }
}
