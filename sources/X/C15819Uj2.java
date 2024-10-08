package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Uj2  reason: case insensitive filesystem */
public final class C15819Uj2 extends C232232tF {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A09 = DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.upcoming_event_dual_cta, false);
        Object A0U = C13988Tno.A0U(A09, new C14865UCt(A09));
        0qQ.A0C(A0U, "null cannot be cast to non-null type com.instagram.upcomingevents.bottomsheet.adapter.definition.UpcomingEventDualCtaViewBinder.ViewHolder");
        return (C249703kE) A0U;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r12, C249703kE r13) {
        int i;
        C19285WSt wSt = (C19285WSt) r12;
        C14865UCt uCt = (C14865UCt) r13;
        boolean A1Z = AnonymousClass7TG.A1Z(wSt, uCt);
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 2);
        C61082JwK jwK = wSt.A00;
        if (jwK.A01 && !C61670oa.A00()) {
            IgdsButton igdsButton = uCt.A00;
            1QG r1 = 1QG.A03;
            igdsButton.setOverridePrismVariant(r1);
            uCt.A01.setOverridePrismVariant(r1);
        }
        IgdsButton igdsButton2 = uCt.A00;
        C17286VPn vPn = wSt.A02;
        int A0M = AnonymousClass7TE.A0M(jwK.A00);
        if (A0M == 0) {
            igdsButton2.setStyle(C273014lo.SECONDARY);
            O33.A00(igdsButton2, R.drawable.instagram_alert_check_pano_filled_24);
            igdsButton2.setText(igdsButton2.getContext().getString(2131976021));
            i = 31;
        } else if (A0M == A1Z) {
            igdsButton2.setStyle(C273014lo.PRIMARY);
            O33.A00(igdsButton2, R.drawable.instagram_alert_pano_outline_24);
            igdsButton2.setText(igdsButton2.getContext().getString(2131976020));
            i = 32;
        } else {
            throw new RuntimeException();
        }
        WB0.A00(igdsButton2, i, vPn);
        C15374UbS ubS = vPn.A00;
        ubS.A09(igdsButton2);
        IgdsButton igdsButton3 = uCt.A01;
        igdsButton3.setStyle(C273014lo.SECONDARY);
        C61076JwE jwE = wSt.A01;
        int A0M2 = AnonymousClass7TE.A0M(jwE.A00);
        if (A0M2 == 0) {
            O33.A00(igdsButton3, R.drawable.instagram_link_pano_outline_24);
            igdsButton3.setText(jwE.A01);
            AnonymousClass0fU.A00(new C244023aW(userSession, (String) null, (C62320sa) null, new MP8(vPn, 23), A1Z), igdsButton3);
            ubS.A08(igdsButton3);
        } else if (A0M2 == A1Z) {
            O33.A00(igdsButton3, R.drawable.instagram_new_story_pano_outline_24);
            igdsButton3.setText(igdsButton3.getContext().getString(2131976008));
            WB0.A00(igdsButton3, 33, vPn);
        }
    }

    public final Class modelClass() {
        return C19285WSt.class;
    }

    public C15819Uj2(UserSession userSession) {
        this.A00 = userSession;
    }
}
