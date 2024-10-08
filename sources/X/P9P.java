package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.messaginguser.MessagingUser;

public final class P9P implements AnonymousClass7VW {
    public final /* synthetic */ C68495NKo A00;

    public final void CfT(ImageUrl imageUrl, MessagingUser messagingUser) {
    }

    public final void Cq2(View view, MessagingUser messagingUser) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.0iw, java.lang.Object] */
    public final void CqM(MessagingUser messagingUser, String str) {
        AnonymousClass7TF.A1H(messagingUser, str);
        C68495NKo nKo = this.A00;
        FragmentActivity requireActivity = nKo.requireActivity();
        UserSession A0l = AnonymousClass7TE.A0l(nKo.A0S);
        C48838El0.A00(requireActivity, new Object(), A0l, messagingUser, str, (String) null, false, false);
    }

    public P9P(C68495NKo nKo) {
        this.A00 = nKo;
    }
}
