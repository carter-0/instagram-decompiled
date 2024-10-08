package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.NPl  reason: case insensitive filesystem */
public final class C68615NPl extends C232232tF {
    public final UserSession A00;

    public C68615NPl(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new My2(DbT.A0D(layoutInflater, viewGroup, R.layout.daily_prompts_response_list_header, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        NP8 np8 = (NP8) r6;
        My2 my2 = (My2) r7;
        AnonymousClass7TG.A1N(np8, my2);
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 0);
        my2.A01.setText(np8.A00);
        if (np8.A01) {
            IgTextView igTextView = my2.A00;
            igTextView.setVisibility(0);
            int i = 2131958873;
            if (182.A06(0Tu.A05, userSession, 36328164829772840L)) {
                i = 2131958874;
            }
            igTextView.setText(i);
            return;
        }
        my2.A00.setVisibility(8);
    }

    public final Class modelClass() {
        return NP8.class;
    }
}
