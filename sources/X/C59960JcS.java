package X;

import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.JcS  reason: case insensitive filesystem */
public final class C59960JcS implements AnonymousClass0lh {
    public final 1Ng A00;
    public final 1wn A01;
    public final Queue A02 = new LinkedList();
    public final AnonymousClass0eK A03;

    public C59960JcS(1Ng r3, AnonymousClass0eK r4) {
        0qQ.A0B(r3, 2);
        this.A03 = r4;
        this.A00 = r3;
        C64698LgT A002 = C64698LgT.A00(this, 63);
        this.A01 = A002;
        r3.A01(A002, AnonymousClass2Ny.class);
    }

    public static final synchronized void A00(C59960JcS jcS) {
        synchronized (jcS) {
            Iterator it = jcS.A02.iterator();
            while (it.hasNext()) {
                C66486MTp mTp = (C66486MTp) it.next();
                AnonymousClass3Q2 A032 = ((PendingMediaStore) jcS.A03.get()).A03(mTp.BbR());
                if (A032 != null && A032.A5l) {
                    mTp.AIz(A032);
                    it.remove();
                }
            }
        }
    }

    public final synchronized void A01(C66486MTp mTp) {
        this.A02.add(mTp);
        A00(this);
    }

    public final void onSessionWillEnd() {
        this.A00.A02(this.A01, AnonymousClass2Ny.class);
    }
}
