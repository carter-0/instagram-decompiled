package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.8EC  reason: invalid class name */
public final class AnonymousClass8EC implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass8EA A00;

    public AnonymousClass8EC(AnonymousClass8EA r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(2076908100);
        AnonymousClass8EA r9 = this.A00;
        2cs r8 = r9.A0B;
        boolean z = false;
        if (r8.A01 == 1.0d) {
            z = true;
        }
        if (z) {
            r8.A04();
            UserSession userSession = r9.A02;
            if (userSession != null) {
                AnonymousClass8EF.A01(userSession, false);
            }
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
        r8.A06(1.0d);
        UserSession userSession2 = r9.A02;
        if (userSession2 != null) {
            AnonymousClass8EF.A01(userSession2, true);
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
        AnonymousClass0fD.A0C(876277955, A05);
    }
}
