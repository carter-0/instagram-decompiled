package X;

import com.instagram.user.model.User;

/* renamed from: X.FtS  reason: case insensitive filesystem */
public final class C51396FtS implements Runnable {
    public final /* synthetic */ C51028FnK A00;
    public final /* synthetic */ User A01;

    public C51396FtS(C51028FnK fnK, User user) {
        this.A00 = fnK;
        this.A01 = user;
    }

    public final void run() {
        this.A00.A07.FJ9(this.A01, C48088EVg.PROFILE_FOLLOWING_SHEET);
    }
}
