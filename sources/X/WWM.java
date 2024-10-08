package X;

import android.app.Activity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

public final class WWM implements C229132mt {
    public final Activity A00;
    public final AnonymousClass07i A01;
    public final UserSession A02;
    public final AnonymousClass8MO A03;
    public final C19733Wea A04;
    public final UAB A05;

    public final void A00(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        recyclerView.setAdapter(this.A05);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.A00);
        recyclerView.setLayoutManager(linearLayoutManager);
        JTQ.A0y(linearLayoutManager, recyclerView, this, C3251771i.A04);
    }

    public final void ACw() {
        C19733Wea wea = this.A04;
        if (wea.A00.A06()) {
            wea.A00(false);
        }
    }

    public WWM(Activity activity, AnonymousClass07i r4, UserSession userSession, AnonymousClass8MO r6, String str) {
        AnonymousClass7TG.A1Q(userSession, r4);
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = r4;
        this.A03 = r6;
        C19733Wea wea = new C19733Wea(activity, r4, userSession, this);
        this.A04 = wea;
        this.A05 = new UAB(userSession, this, wea, str);
    }
}
