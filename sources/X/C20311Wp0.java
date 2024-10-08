package X;

import com.instagram.user.model.User;

/* renamed from: X.Wp0  reason: case insensitive filesystem */
public final class C20311Wp0 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C15401Uc7 A01;
    public final /* synthetic */ User A02;

    public C20311Wp0(C15401Uc7 uc7, User user, int i) {
        this.A01 = uc7;
        this.A02 = user;
        this.A00 = i;
    }

    public final void run() {
        C15401Uc7 uc7 = this.A01;
        User user = this.A02;
        int i = this.A00;
        if (uc7.A0D) {
            C15401Uc7.A01(uc7, user, i);
            return;
        }
        C15401Uc7.A00(uc7, user, i);
        X76 x76 = uc7.A05;
        if (x76 != null) {
            x76.AAN(user, false);
        }
    }
}
