package X;

import com.instagram.common.session.UserSession;

public final class RAN extends 0ng {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C40242AXg A01;
    public final /* synthetic */ C13672Teh A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RAN(UserSession userSession, C40242AXg aXg, C13672Teh teh) {
        super(426, 4, false, false);
        this.A01 = aXg;
        this.A00 = userSession;
        this.A02 = teh;
    }

    public final void run() {
        try {
            this.A01.A03();
        } finally {
            if (182.A06(0Tu.A05, this.A00, 36320133240594484L)) {
                this.A02.DMc();
            }
        }
    }
}
