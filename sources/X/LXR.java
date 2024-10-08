package X;

import android.view.View;
import com.instagram.user.model.User;

public final /* synthetic */ class LXR implements View.OnClickListener {
    public final /* synthetic */ KI1 A00;
    public final /* synthetic */ C323366xN A01;
    public final /* synthetic */ User A02;

    public /* synthetic */ LXR(KI1 ki1, C323366xN r2, User user) {
        this.A01 = r2;
        this.A00 = ki1;
        this.A02 = user;
    }

    public final void onClick(View view) {
        C323366xN r3 = this.A01;
        KI1 ki1 = this.A00;
        User user = this.A02;
        if (r3.A06 != null && !ki1.A06.get()) {
            C46766Dkt dkt = r3.A06;
            String id = user.getId();
            MGE.A01(dkt, id, C51975G9x.A0R(dkt, id), 12);
        }
    }
}
