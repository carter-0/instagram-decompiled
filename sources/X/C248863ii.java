package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.security.attestation.keystore.worker.KeyAttestationWorker;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3ii  reason: invalid class name and case insensitive filesystem */
public final class C248863ii extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248863ii(2Lk r7) {
        super("AttestationKeystorePeriodic", 1800671267, 3, true, true);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r2 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        C375559Ec r1 = AnonymousClass9Eb.A00;
        Context context = r2.A01;
        0qQ.A0B(context, 0);
        try {
            UserSession A08 = 09i.A0A.A08(r1);
            0Tu r6 = 0Tu.A05;
            boolean A06 = 182.A06(r6, A08, 2342160565474235726L);
            long A01 = 182.A01(r6, A08, 36599031237119355L);
            long A012 = 182.A01(r6, A08, 36599031236988281L);
            long A013 = 182.A01(r6, A08, 36599031237053818L);
            String A002 = AnonymousClass000.A00(2341);
            if (A01 < A012) {
                0f9 AEf = 0wj.A01.AEf(A002, 817903298);
                AEf.ABQ("error", "Key attestation scheduling failed due to incorrect intervals");
                AEf.report();
                return;
            }
            try {
                C375569Ed r5 = new C375569Ed();
                r5.A01(AnonymousClass05K.A01);
                r5.A03 = A06;
                C255343ty A003 = r5.A00();
                TimeUnit timeUnit = TimeUnit.MINUTES;
                C375589Ef r52 = new C375589Ef(KeyAttestationWorker.class);
                r52.A00.A01(timeUnit.toMillis(A01 * 60), timeUnit.toMillis(A012 * 60));
                r52.A01(A013, timeUnit);
                r52.A02(A003);
                C375669Eo.A00(r52.A00(), AnonymousClass385.A00(context), A002);
            } catch (UnsupportedOperationException e) {
                0f9 AEf2 = 0wj.A01.AEf(A002, 817903298);
                AEf2.ABQ("error", "Key attestation scheduling failed due to unsupported operation");
                AEf2.ERJ(e);
                AEf2.report();
            }
        } catch (IllegalStateException unused) {
        }
    }
}
