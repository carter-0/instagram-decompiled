package X;

import android.net.NetworkInfo;

public final class IP4 implements AnonymousClass0qK {
    public final int A00;
    public final Object A01;

    public IP4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onConnectionChanged(NetworkInfo networkInfo) {
        NetworkInfo.State state;
        boolean z;
        JRN A02;
        switch (this.A00) {
            case 0:
                C71142Ods ods = ((OWA) this.A01).A03;
                if (ods != null) {
                    String str = null;
                    if (!(networkInfo == null || (state = networkInfo.getState()) == null)) {
                        str = state.name();
                    }
                    C71142Ods.A03(new C72785PJz(str), ods);
                    return;
                }
                return;
            case 1:
                if (networkInfo != null && networkInfo.isConnected()) {
                    GE3 ge3 = (GE3) this.A01;
                    ge3.A04.post(new C57791IgW(ge3));
                    return;
                }
                return;
            default:
                C52016GBn gBn = (C52016GBn) this.A01;
                C52078GDy A022 = C52019GBq.A02(gBn);
                if (A022 != null) {
                    JRN A023 = C52016GBn.A02(gBn, A022);
                    if (A023 != null) {
                        z = A023.CeZ();
                    } else {
                        z = false;
                    }
                    if (!z && networkInfo != null && networkInfo.isConnected() && (A02 = C52016GBn.A02(gBn, A022)) != null) {
                        A02.EJE();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
