package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Bf  reason: invalid class name and case insensitive filesystem */
public final class C327547Bf extends 0ng {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C239473Gp A01;
    public final /* synthetic */ 1Xc A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C327547Bf(UserSession userSession, C239473Gp r4, 1Xc r5, String str, int i) {
        super(337, i, false, false);
        this.A02 = r5;
        this.A01 = r4;
        this.A00 = userSession;
        this.A03 = str;
    }

    public final void run() {
        C239473Gp r2 = this.A01;
        r2.ASb();
        r2.EEC(this.A00, this.A03);
    }
}
