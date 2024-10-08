package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Uhv  reason: case insensitive filesystem */
public final class C15750Uhv extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A09 = DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.upcoming_event_button, false);
        Object A0U = C13988Tno.A0U(A09, new UCR(A09));
        0qQ.A0C(A0U, "null cannot be cast to non-null type com.instagram.upcomingevents.bottomsheet.adapter.definition.UpcomingEventShareToStoryButtonViewBinder.ViewHolder");
        return (C249703kE) A0U;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        WSG wsg = (WSG) r4;
        UCR ucr = (UCR) r5;
        AnonymousClass7TG.A1N(wsg, ucr);
        IgdsButton igdsButton = ucr.A00;
        if (wsg.A01) {
            O33.A00(igdsButton, R.drawable.instagram_new_story_pano_outline_24);
        }
        igdsButton.setText(igdsButton.getContext().getString(2131976008));
        WB0.A00(igdsButton, 36, wsg);
    }

    public final Class modelClass() {
        return WSG.class;
    }
}
