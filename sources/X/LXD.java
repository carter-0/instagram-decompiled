package X;

import android.view.View;
import com.instagram.user.model.User;

public final class LXD implements View.OnClickListener {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C317116mk A01;

    public LXD(C255773uh r1, C317116mk r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        String A002;
        int A05 = AnonymousClass0fD.A05(46180497);
        C255773uh r3 = this.A00;
        User user = r3.A0i;
        if (!(user == null || (A002 = AnonymousClass3ZA.A00(user)) == null)) {
            this.A01.Do8(A002, r3.A0Q);
        }
        AnonymousClass0fD.A0C(326956789, A05);
    }
}
