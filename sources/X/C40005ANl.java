package X;

import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.ANl  reason: case insensitive filesystem */
public final class C40005ANl implements View.OnClickListener {
    public final /* synthetic */ C70968OTp A00;
    public final /* synthetic */ User A01;

    public C40005ANl(C70968OTp oTp, User user) {
        this.A01 = user;
        this.A00 = oTp;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(860879418);
        User user = this.A01;
        if (user != null) {
            this.A00.A07.De4(user.getId());
        }
        AnonymousClass0fD.A0C(-1368919042, A05);
    }
}
