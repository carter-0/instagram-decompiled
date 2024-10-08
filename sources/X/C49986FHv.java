package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FHv  reason: case insensitive filesystem */
public final class C49986FHv implements DialogInterface.OnClickListener {
    public final /* synthetic */ C293975le A00;

    public C49986FHv(C293975le r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C293975le r4 = this.A00;
        User user = r4.A00;
        if (user != null) {
            AnonymousClass4D6 r2 = r4.A05;
            C49868FAl fAl = C49274EsH.A00;
            UserSession userSession = r4.A04;
            AnonymousClass0iw r6 = r4.A03;
            Integer num = AnonymousClass05K.A0N;
            1OC A01 = fAl.A01(r6, userSession, num, AnonymousClass7TE.A1C(), AnonymousClass7TE.A1I(user.getId()));
            EDV.A00(A01, user, r4, 45);
            r2.schedule(A01);
            r4.A01 = num;
            C293975le.A01(r4);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
