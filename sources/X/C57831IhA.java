package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;

/* renamed from: X.IhA  reason: case insensitive filesystem */
public final class C57831IhA implements Runnable {
    public final /* synthetic */ C3254872q A00;
    public final /* synthetic */ AnonymousClass2uE A01;

    public C57831IhA(C3254872q r1, AnonymousClass2uE r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass2uE r9 = this.A01;
        UserSession userSession = r9.A0T;
        UserSession userSession2 = userSession;
        C233822wX.A0Q(userSession2, r9.A07(), r9, (C249763kK) null, Integer.valueOf(r9.A01), Integer.valueOf(this.A00.A0G.A0N.getCurrentScans().get()), "profile_button", r9.A00);
        1Xj A07 = r9.A07();
        C271794jb r6 = new C271794jb(userSession, r9.A07());
        r6.A00 = r9.A00;
        User A2A = r9.A07().A2A(userSession);
        if (A2A != null) {
            boolean A2Q = A2A.A2Q();
            C233822wX.A0K(userSession, r6, HLF.BRAND, A07, r9, r9.A0a, Integer.valueOf(r9.A00), "peek", A2Q);
            1a1 A02 = C46447Df9.A02();
            User A2A2 = r9.A07().A2A(userSession);
            if (A2A2 != null) {
                Fragment A022 = A02.A02(userSession, C46474Dfc.A01(userSession, A2A2.getId(), "peek", r9.A0X.getModuleName()));
                if (r9.A0G) {
                    Bundle bundle = A022.mArguments;
                    Activity activity = r9.A0O;
                    AnonymousClass6W8 A0b = DbS.A0b(activity, bundle, userSession, ModalActivity.class, "profile");
                    A0b.A05 = r9.getModuleName();
                    A0b.A0C(activity);
                } else {
                    C309516Yo A0H = DbW.A0H(r9.A0R, userSession);
                    A0H.A0B((Bundle) null, A022);
                    A0H.A0B = r9.getModuleName();
                    A0H.A04();
                }
                r9.A0G = false;
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
