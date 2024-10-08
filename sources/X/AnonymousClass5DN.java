package X;

import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger;

/* renamed from: X.5DN  reason: invalid class name */
public final class AnonymousClass5DN implements Handler.Callback {
    public final /* synthetic */ 1Ou A00;

    public AnonymousClass5DN(1Ou r1) {
        this.A00 = r1;
    }

    public final boolean handleMessage(Message message) {
        String A02;
        IGFOAMessagingSendToSentLogger A002;
        int i = message.what;
        if (i == 1) {
            1Ou r3 = this.A00;
            IntentFilter intentFilter = 1Ou.A0W;
            1OS r0 = (1OS) r3.A0H.getAndSet((Object) null);
            if (!(r0 == null || (A002 = AnonymousClass7G0.A00(r3.A08, r0.A05.hashCode())) == null)) {
                A002.onLogFirstMutationSystemDispatchEnd(r3.A0N);
            }
            while (r3.A0N) {
                r3.A0N = false;
                Pair A003 = 1Ou.A00(r3);
                2Dm r5 = (2Dm) r3.A0L.get();
                if (A003 == null) {
                    A02 = "null";
                } else {
                    A02 = ((1OS) A003.first).A02();
                }
                r5.CnE(002.A0R("HandleSendNextMutation-", A02));
                while (A003 != null) {
                    1OS r9 = (1OS) A003.first;
                    int hashCode = r9.A05.hashCode();
                    UserSession userSession = r3.A08;
                    IGFOAMessagingSendToSentLogger A004 = AnonymousClass7G0.A00(userSession, hashCode);
                    if (A004 != null) {
                        A004.onLogSendMutationStart();
                    }
                    0fh.A01(002.A0R("SendMutation-", r9.A02()), -379606193);
                    AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
                    C69643NpQ.A00 = awakeTimeSinceBootClock.now();
                    C69643NpQ.A03 = r9.A02();
                    C66655MaO A01 = C66655MaO.A01((C74248Prc) A003.second);
                    A01.A04("executing");
                    C66656MaP maP = new C66656MaP(A01);
                    AnonymousClass5DE r1 = r3.A0A;
                    synchronized (r1) {
                        r1.A03(r9, maP);
                        r3.A0G.incrementAndGet();
                    }
                    0xF r7 = new 0xF();
                    ((AnonymousClass1cH) r3.A09.A01(r9.A02()).A04.getValue()).EM9(r7, new C66673Mag(userSession, r3, r9, maP), r9);
                    long now = awakeTimeSinceBootClock.now();
                    C69643NpQ.A02 = C69643NpQ.A00;
                    C69643NpQ.A01 = now;
                    C69643NpQ.A04 = C69643NpQ.A03;
                    C69643NpQ.A00 = 0;
                    C69643NpQ.A03 = null;
                    if (A004 != null) {
                        A004.onLogSendMutationEnd();
                        A004.onLogExecuteMutationStart();
                    }
                    for (2Ag r52 : r3.A0E) {
                        boolean z = false;
                        if (maP.A00 > 0) {
                            z = true;
                        }
                        r52.DTK(r7, r9, z);
                    }
                    if (A004 != null) {
                        A004.onLogExecuteMutationEnd();
                    }
                    A003 = 1Ou.A00(r3);
                    0fh.A00(-1339394569);
                }
                if (r3.A0G.get() == 0) {
                    11Z.A02(r3.A0B);
                }
            }
            return true;
        } else if (i == 2) {
            1Ou r12 = this.A00;
            IntentFilter intentFilter2 = 1Ou.A0W;
            AnonymousClass5DE r13 = r12.A0A;
            synchronized (r13) {
                r13.A03.clear();
            }
            return true;
        } else {
            throw new IllegalStateException(002.A0c("Message with what = ", AnonymousClass000.A00(396), i));
        }
    }
}
