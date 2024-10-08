package X;

import java.util.Iterator;
import java.util.List;

public final class TGI implements Runnable {
    public final /* synthetic */ C10416Rrs A00;
    public final /* synthetic */ C11376SQm A01;

    public TGI(C10416Rrs rrs, C11376SQm sQm) {
        this.A00 = rrs;
        this.A01 = sQm;
    }

    public final void run() {
        C8901REt rEt = (C8901REt) this.A01.A04.A01();
        C10416Rrs rrs = this.A00;
        ST9 st9 = rrs.A01;
        List list = st9.A0H.A00;
        synchronized (list) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass7TE.A11("onMqttNetworkConnectionFailed");
            }
        }
        if (rEt.equals(C8901REt.FAILED_CONNECTION_REFUSED_SERVER_SHEDDING_LOAD) || rEt.equals(C8901REt.FAILED_CONNECTION_REFUSED_NOT_AUTHORIZED)) {
            C11262SHw sHw = st9.A0V;
            synchronized (sHw) {
                sHw.A0A = true;
            }
        }
        if (st9.A0w == rrs.A00) {
            Integer num = AnonymousClass05K.A00;
            if (rEt.equals(C8901REt.FAILED_CONNECTION_REFUSED_BAD_USER_NAME_OR_PASSWORD)) {
                st9.A0I.clear();
            } else if (rEt.equals(C8901REt.FAILED_CONNECTION_REFUSED_REVOKED_PUBLIC_KEY)) {
                st9.A0R.E2Y();
                throw null;
            }
            ST9.A01(new C7861Qbl(rEt), st9, num);
        }
        ((C12249Sq3) st9.A0D.A05(C7862Qbm.class)).A03(RJ1.A07, rEt.name());
    }
}
