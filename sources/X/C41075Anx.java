package X;

import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;

/* renamed from: X.Anx  reason: case insensitive filesystem */
public final class C41075Anx implements Runnable {
    public final /* synthetic */ AnonymousClass7VX A00;
    public final /* synthetic */ User A01;

    public C41075Anx(AnonymousClass7VX r1, User user) {
        this.A00 = r1;
        this.A01 = user;
    }

    public final void run() {
        this.A00.A05.CqM(MessagingUser.A00(this.A01), "direct_thread_verified_user_dialog");
    }
}
