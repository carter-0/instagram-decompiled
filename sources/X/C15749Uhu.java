package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Uhu  reason: case insensitive filesystem */
public final class C15749Uhu extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A09 = DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.upcoming_event_reminder_text_row_item, false);
        Object A0U = C13988Tno.A0U(A09, new UCQ(A09));
        0qQ.A0C(A0U, "null cannot be cast to non-null type com.instagram.upcomingevents.bottomsheet.adapter.definition.UpcomingEventReminderTextRowItemViewBinder.ViewHolder");
        return (C249703kE) A0U;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C19264WRx wRx = (C19264WRx) r4;
        UCQ ucq = (UCQ) r5;
        AnonymousClass7TG.A1N(wRx, ucq);
        IgTextView igTextView = ucq.A00;
        igTextView.setText(C66909Mes.A00(AnonymousClass7TE.A0S(igTextView), (C266444Yx) wRx.A00.A00));
    }

    public final Class modelClass() {
        return C19264WRx.class;
    }
}
