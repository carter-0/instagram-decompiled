package X;

import com.instagram.user.model.User;

/* renamed from: X.FtO  reason: case insensitive filesystem */
public final class C51392FtO implements Runnable {
    public final /* synthetic */ AnonymousClass70J A00;
    public final /* synthetic */ User A01;

    public C51392FtO(AnonymousClass70J r1, User user) {
        this.A00 = r1;
        this.A01 = user;
    }

    public final void run() {
        AnonymousClass70J r4 = this.A00;
        if (r4 != null) {
            User user = this.A01;
            C48088EVg eVg = C48088EVg.PROFILE_HEADER;
            r4.Ck8(user, eVg, "click", "unrestrict_profile_header");
            r4.FJ9(user, eVg);
        }
    }
}
