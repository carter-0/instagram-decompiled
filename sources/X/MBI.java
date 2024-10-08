package X;

import com.instagram.common.session.UserSession;

public final class MBI implements AnonymousClass0eL, C62320sa {
    public final int A00;
    public final Object A01;

    public MBI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.LQZ, java.lang.Object] */
    public final Object invoke() {
        switch (this.A00) {
            case 0:
                return new C64184LSr((UserSession) this.A01);
            case 1:
                ? obj = new Object();
                obj.A00 = (UserSession) this.A01;
                obj.A02 = AnonymousClass7TE.A1C();
                obj.A03 = AnonymousClass7TE.A1C();
                obj.A04 = AnonymousClass7TE.A1C();
                obj.A05 = AnonymousClass7TE.A1C();
                return obj;
            case 2:
                return new LS7((UserSession) this.A01);
            default:
                C310236ae r2 = (C310236ae) this.A01;
                r2.A07.runOnUiThread(new C65942M5f(r2));
                return null;
        }
    }
}
