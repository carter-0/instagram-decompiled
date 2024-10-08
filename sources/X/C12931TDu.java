package X;

import com.google.common.collect.EvictingQueue;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.TDu  reason: case insensitive filesystem */
public final class C12931TDu implements Runnable {
    public final /* synthetic */ C242143Su A00;

    public C12931TDu(C242143Su r1) {
        this.A00 = r1;
    }

    public final void run() {
        C242143Su r4 = this.A00;
        UserSession userSession = r4.A02;
        String A002 = AnonymousClass000.A00(952);
        if (userSession == null) {
            0KC.A0C(A002, "Can't upload locations without a user session");
            return;
        }
        EvictingQueue evictingQueue = r4.A06;
        if (!evictingQueue.isEmpty()) {
            try {
                if (C61970qY.A0E(r4.A04)) {
                    ArrayList A1D = AnonymousClass7TE.A1D(evictingQueue);
                    evictingQueue.clear();
                    int size = A1D.size();
                    Integer num = AnonymousClass05K.A00;
                    C298215t4 A003 = C298215t4.A00((Boolean) null, num, r4.A08, r4.A09, A1D, (List) null);
                    C239123Fb A01 = C46479Dfi.A01(r4.A02);
                    A01.A09(A003);
                    1OC A07 = A01.A07(num);
                    A07.A00 = new C298355tI(r4, size);
                    1ES.A03(A07);
                }
            } catch (Exception e) {
                0wb.A06(A002, "location-upload", e);
            }
        }
    }
}
