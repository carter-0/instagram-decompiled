package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.io.File;

public final class AZ8 implements MTS {
    public final /* synthetic */ AnonymousClass8H3 A00;

    public final void onFailure(Exception exc) {
    }

    public AZ8(AnonymousClass8H3 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        File file = (File) obj;
        0qQ.A0B(file, 0);
        AnonymousClass8H3 r4 = this.A00;
        Activity activity = r4.A06;
        0qQ.A07(activity);
        UserSession userSession = r4.A07;
        0qQ.A07(userSession);
        LI5.A00(activity, C282665Eg.A03(file, 1, 0), userSession, r4.A0B);
    }
}
