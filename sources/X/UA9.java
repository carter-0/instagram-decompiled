package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.loadmore.LoadMoreButton;
import com.instagram.user.model.UpcomingEvent;
import java.util.ArrayList;
import java.util.List;

public final class UA9 extends 2Rw {
    public final List A00 = new ArrayList();
    public final UserSession A01;
    public final C229122ms A02;
    public final AnonymousClass8MS A03;

    public UA9(UserSession userSession, C229122ms r3, AnonymousClass8MS r4) {
        0qQ.A0B(r3, 3);
        this.A01 = userSession;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final void onBindViewHolder(C249703kE r8, int i) {
        if (JTP.A07(this, r8, 0, i) != 0) {
            ((UCS) r8).A00.A03(this.A02, (C230682q1) null);
            return;
        }
        C14872UDa uDa = (C14872UDa) r8;
        UpcomingEvent upcomingEvent = (UpcomingEvent) this.A00.get(i);
        0qQ.A0B(upcomingEvent, 0);
        if (!upcomingEvent.equals(uDa.A00)) {
            uDa.A00 = upcomingEvent;
            uDa.A03.A02();
            ImageView imageView = uDa.A01;
            Context A0S = AnonymousClass7TE.A0S(imageView);
            UpcomingEvent upcomingEvent2 = uDa.A00;
            if (upcomingEvent2 != null) {
                Integer num = AnonymousClass05K.A00;
                imageView.setImageDrawable(new C299325uw(A0S, uDa.A02, upcomingEvent2, num, num));
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        if (i == 0) {
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C14872UDa(DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.upcoming_event_sticker_list_item, false), this.A01, this.A03);
        } else if (i == 1) {
            int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new UCS(LoadMoreButton.A00(viewGroup.getContext(), R.layout.layout_empty_state_view, viewGroup));
        } else {
            throw new IllegalArgumentException("unsupported view type");
        }
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1530454933);
        int size = this.A00.size() + (this.A02.CWV() ? 1 : 0);
        AnonymousClass0fD.A0A(2037069425, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(669956213);
        int i2 = 1;
        if (i < this.A00.size()) {
            i2 = 0;
        }
        AnonymousClass0fD.A0A(158393736, A032);
        return i2;
    }
}
