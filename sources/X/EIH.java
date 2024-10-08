package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;
import java.util.List;

public final class EIH extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1OE A01;
    public final /* synthetic */ C239753Ia A02;
    public final /* synthetic */ 1KS A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EIH(1OE r4, C239753Ia r5, 1KS r6, int i, boolean z) {
        super(399, 1, false, true);
        this.A03 = r6;
        this.A01 = r4;
        this.A02 = r5;
        this.A04 = z;
        this.A00 = i;
    }

    public final void run() {
        UserSession userSession = this.A03.A03;
        ReelStore A05 = 1OP.A05(userSession);
        1OE r4 = this.A01;
        C239753Ia r0 = this.A02;
        List A012 = AnonymousClass3P8.A01(userSession, r0);
        List A002 = AnonymousClass3P8.A00(userSession, r0);
        A05.A0Z(r0.A04, r4, DbT.A0j(userSession), A012, A002, this.A00, this.A04, AnonymousClass3P8.A02(r0));
    }
}
