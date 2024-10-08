package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.UiA  reason: case insensitive filesystem */
public final class C15765UiA extends C232222tE {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A09 = DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.upcoming_event_button, false);
        Object A0U = C13988Tno.A0U(A09, new UCO(A09));
        0qQ.A0C(A0U, "null cannot be cast to non-null type com.instagram.upcomingevents.bottomsheet.adapter.definition.UpcomingEventReminderButtonViewBinder.ViewHolder");
        return (C249703kE) A0U;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        int i;
        C19286WSu wSu = (C19286WSu) r7;
        UCO uco = (UCO) r8;
        boolean A1U = AnonymousClass7TF.A1U(0, wSu, uco);
        IgdsButton igdsButton = uco.A00;
        C61082JwK jwK = wSu.A00;
        if (jwK.A01 && !C61670oa.A00()) {
            igdsButton.setOverridePrismVariant(1QG.A03);
        }
        C17287VPo vPo = wSu.A01;
        int A0M = AnonymousClass7TE.A0M(jwK.A00);
        if (A0M == 0) {
            if (wSu.A02) {
                O33.A00(igdsButton, R.drawable.instagram_alert_check_pano_filled_24);
            }
            igdsButton.setStyle(C273014lo.SECONDARY);
            igdsButton.setText(igdsButton.getContext().getString(2131976021));
            i = 34;
        } else if (A0M == A1U) {
            if (wSu.A02) {
                O33.A00(igdsButton, R.drawable.instagram_alert_pano_outline_24);
            }
            igdsButton.setStyle(C273014lo.PRIMARY);
            igdsButton.setText(igdsButton.getContext().getString(2131976020));
            i = 35;
        } else {
            throw new RuntimeException();
        }
        WB0.A00(igdsButton, i, vPo);
        vPo.A00.A09(igdsButton);
    }

    public final Class modelClass() {
        return C19286WSu.class;
    }

    public C15765UiA(UserSession userSession) {
        this.A00 = userSession;
    }
}
