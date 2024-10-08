package X;

import android.widget.RadioGroup;
import com.instagram.api.schemas.IGLiveNotificationPreference;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class FQX implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ C47419E1n A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ String A02;

    public FQX(C47419E1n e1n, User user, String str) {
        this.A01 = user;
        this.A00 = e1n;
        this.A02 = str;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        IGLiveNotificationPreference iGLiveNotificationPreference = (IGLiveNotificationPreference) C47419E1n.A01.get(i);
        User user = this.A01;
        user.A03.EcS(iGLiveNotificationPreference);
        C47419E1n e1n = this.A00;
        AnonymousClass0eM r1 = e1n.A00;
        user.A0d(DbT.A0X(r1));
        UserSession A0l = AnonymousClass7TE.A0l(r1);
        0qQ.A0A(iGLiveNotificationPreference);
        C319976rX.A06(e1n, A0l, DbV.A0e(user), C48994EnW.A00(iGLiveNotificationPreference), user.getId(), this.A02);
        C2601144i.A00().A02(user.A0A(), AnonymousClass7TE.A0l(r1), user.getId());
    }
}
