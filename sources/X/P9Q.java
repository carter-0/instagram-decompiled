package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.messaginguser.MessagingUser;

public final class P9Q implements AnonymousClass7VW {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;

    public final void CfT(ImageUrl imageUrl, MessagingUser messagingUser) {
    }

    public final void Cq2(View view, MessagingUser messagingUser) {
    }

    public final void CqM(MessagingUser messagingUser, String str) {
        AnonymousClass7TF.A1H(messagingUser, str);
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        C48838El0.A00(fragmentActivity, this.A01, userSession, messagingUser, str, (String) null, false, false);
    }

    public P9Q(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = r2;
    }
}
