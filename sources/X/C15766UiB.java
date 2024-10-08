package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.UiB  reason: case insensitive filesystem */
public final class C15766UiB extends C232222tE {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A09 = DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.upcoming_event_cta_row_item, false);
        Object A0U = C13988Tno.A0U(A09, new UCP(A09));
        0qQ.A0C(A0U, "null cannot be cast to non-null type com.instagram.upcomingevents.bottomsheet.adapter.definition.UpcomingEventReminderCtaViewBinder.ViewHolder");
        return (C249703kE) A0U;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r11, C249703kE r12) {
        Context context;
        int i;
        C19284WSs wSs = (C19284WSs) r11;
        UCP ucp = (UCP) r12;
        boolean A1Z = AnonymousClass7TG.A1Z(wSs, ucp);
        UserSession userSession = this.A00;
        boolean A1Y = C51970G9q.A1Y(userSession);
        IgdsListCell igdsListCell = ucp.A00;
        C17288VPp vPp = wSs.A01;
        int A0M = AnonymousClass7TE.A0M(wSs.A00.A00);
        if (A0M == A1Y) {
            igdsListCell.A05(R.drawable.instagram_alert_check_new_pano_outline_24);
            context = igdsListCell.getContext();
            i = 2131976021;
        } else if (A0M == A1Z) {
            igdsListCell.A05(R.drawable.instagram_alert_new_pano_outline_24);
            context = igdsListCell.getContext();
            i = 2131976020;
        } else {
            throw new RuntimeException();
        }
        igdsListCell.A0I(AnonymousClass7TE.A16(context, i));
        igdsListCell.A0C(new C244023aW(userSession, (String) null, (C62320sa) null, new MP8(vPp, 26), A1Z));
        vPp.A00.A09(igdsListCell);
    }

    public final Class modelClass() {
        return C19284WSs.class;
    }

    public C15766UiB(UserSession userSession) {
        this.A00 = userSession;
    }
}
