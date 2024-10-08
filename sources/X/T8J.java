package X;

import com.instagram.common.session.UserSession;

public final class T8J implements C332277Ui {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ Q03 A01;
    public final /* synthetic */ String A02;

    public final void D9a() {
    }

    public T8J(1Xj r1, Q03 q03, String str) {
        this.A01 = q03;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void D9V() {
        SGU sgu = SGU.A00;
        Q03 q03 = this.A01;
        UserSession userSession = q03.A10;
        sgu.A00(q03.A0z, userSession, this.A00, q03.A0W, this.A02, q03.A12.getModuleName());
    }
}
