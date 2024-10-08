package X;

import com.instagram.user.model.User;

/* renamed from: X.Ap7  reason: case insensitive filesystem */
public final /* synthetic */ class C41147Ap7 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C39963ALf A01;
    public final /* synthetic */ User A02;

    public /* synthetic */ C41147Ap7(C39963ALf aLf, User user, int i) {
        this.A01 = aLf;
        this.A02 = user;
        this.A00 = i;
    }

    public final void run() {
        C39963ALf aLf = this.A01;
        User user = this.A02;
        int i = this.A00;
        aLf.A0B = false;
        aLf.A0M.E3H(new Object());
        C39963ALf.A01(aLf, user, i);
    }
}
