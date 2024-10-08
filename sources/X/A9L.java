package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.HashMap;

public final class A9L {
    public final HashMap A00 = AnonymousClass7TE.A1E();
    public final UserSession A01;

    public A9L(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void A01(Context context, 2Cn r9, String str, boolean z) {
        String str2 = str;
        AnonymousClass7TF.A1H(context, str);
        File A002 = A00(str);
        if (A002 != null) {
            r9.onSuccess(A002);
            return;
        }
        C290815g0 A03 = C59730JVo.A03(context, this.A01, new C11211SFl(str2, "DirectVisualMessageRepository", z, false, false));
        A03.A00 = new C385909jj(r9, this, str, 0);
        1ES.A03(A03);
    }

    public final File A00(String str) {
        File file;
        Boolean bool;
        String str2 = (String) this.A00.get(str);
        if (str2 != null) {
            file = AnonymousClass7TE.A0t(str2);
            bool = Boolean.valueOf(file.exists());
        } else {
            file = null;
            bool = null;
        }
        if (AnonymousClass7TF.A1Y(bool, true)) {
            return file;
        }
        return null;
    }
}
