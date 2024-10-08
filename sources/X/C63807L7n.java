package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.L7n  reason: case insensitive filesystem */
public final class C63807L7n {
    public SearchEditText A00;
    public final RecyclerView A01;
    public final UA8 A02;
    public final C249403jg A03;

    public C63807L7n(Context context, View view, UserSession userSession, AnonymousClass86E r8) {
        0qQ.A0B(userSession, 2);
        RecyclerView A0c = JTR.A0c(view, R.id.effect_search_null_state_recycler_view);
        this.A01 = A0c;
        UA8 ua8 = new UA8(context, userSession, r8);
        this.A02 = ua8;
        C60473Jm5 jm5 = new C60473Jm5(this, 6);
        this.A03 = jm5;
        DbV.A1B(context, A0c);
        A0c.setAdapter(ua8);
        A0c.A15(jm5);
    }
}
