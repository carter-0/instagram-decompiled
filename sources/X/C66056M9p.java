package X;

import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.M9p  reason: case insensitive filesystem */
public final class C66056M9p implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C65164LoT A02;
    public final /* synthetic */ FilterGroupModel A03;
    public final /* synthetic */ 0sP A04;

    public C66056M9p(C65164LoT loT, FilterGroupModel filterGroupModel, 0sP r3, int i, int i2) {
        this.A02 = loT;
        this.A03 = filterGroupModel;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = r3;
    }

    public final void run() {
        C65164LoT loT = this.A02;
        UserSession userSession = loT.A0C;
        C364808m2 r7 = loT.A0I;
        C65164LoT.A00(new AUU(userSession, loT.A0H, this.A03, r7, new C66312MMv(25, this.A04, loT), this.A01, this.A00), loT);
    }
}
