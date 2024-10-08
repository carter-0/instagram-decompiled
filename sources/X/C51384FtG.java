package X;

import com.instagram.user.model.User;

/* renamed from: X.FtG  reason: case insensitive filesystem */
public final class C51384FtG implements Runnable {
    public final /* synthetic */ C47669ECd A00;
    public final /* synthetic */ User A01;

    public C51384FtG(C47669ECd eCd, User user) {
        this.A00 = eCd;
        this.A01 = user;
    }

    public final void run() {
        C47669ECd eCd = this.A00;
        AnonymousClass4DH r2 = eCd.A02;
        String id = this.A01.getId();
        C50144FRb.A04(r2, eCd.A03, eCd.A06.A01(), (Integer) null, AnonymousClass05K.A00, id);
    }
}
