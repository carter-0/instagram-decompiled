package X;

import com.instagram.user.model.User;

/* renamed from: X.FtF  reason: case insensitive filesystem */
public final class C51383FtF implements Runnable {
    public final /* synthetic */ EQ2 A00;
    public final /* synthetic */ User A01;

    public C51383FtF(EQ2 eq2, User user) {
        this.A00 = eq2;
        this.A01 = user;
    }

    public final void run() {
        EQ2 eq2 = this.A00;
        02m r2 = eq2.A03;
        r2.markerPoint(4197923, "navigate_to_next_screen");
        AnonymousClass4DH r4 = eq2.A01;
        String id = this.A01.getId();
        C50144FRb.A04(r4, eq2.A02, eq2.A07, eq2.A06.A02(), AnonymousClass05K.A00, id);
        r2.markerEnd(4197923, 2);
    }
}
