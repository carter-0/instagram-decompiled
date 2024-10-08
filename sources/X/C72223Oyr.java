package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Oyr  reason: case insensitive filesystem */
public final class C72223Oyr implements AnonymousClass11X {
    public final UserSession A00;
    public final String A01;
    public final List A02;

    public final String getName() {
        return "RefreshStaleMessagesTask";
    }

    public final int getRunnableId() {
        return 839614350;
    }

    public final void onCancel() {
    }

    public final void onFinish() {
    }

    public final void onStart() {
    }

    public final void run() {
        C331247Qd.A02(this.A00, this.A01, this.A02);
    }

    public C72223Oyr(UserSession userSession, String str, List list) {
        this.A00 = userSession;
        this.A01 = str;
        this.A02 = list;
    }
}
