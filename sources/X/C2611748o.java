package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.48o  reason: invalid class name and case insensitive filesystem */
public final class C2611748o implements Runnable {
    public final /* synthetic */ 2EN A00;
    public final /* synthetic */ 2ED A01;

    public C2611748o(2EN r1, 2ED r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        2EN r2;
        List singletonList;
        2ED r3 = this.A01;
        UserSession userSession = r3.A09;
        if ((2El.A0E(userSession) || 2El.A03(userSession)) && (r2 = this.A00) == 2EN.A05) {
            singletonList = 0sr.A1P(new 2EN[]{r2, 2EN.A06});
        } else {
            r2 = this.A00;
            singletonList = Collections.singletonList(r2);
            0qQ.A07(singletonList);
        }
        ArrayList A0R = r3.A0A.A0R(singletonList);
        if (r2.A01) {
            Object obj = r3.A0F.get(r2);
            if (obj != null) {
                ((1aT) obj).accept(A0R);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Check failed.");
    }
}
