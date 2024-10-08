package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.security.attestation.playintegrity.worker.PlayIntegrityAttestationWorker;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3ij  reason: invalid class name and case insensitive filesystem */
public final class C248873ij extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248873ij(2Lk r7) {
        super("AttestationPlayIntegrityPeriodic", 718484570, 3, true, true);
        this.A00 = r7;
    }

    public final void loggedRun() {
        0f9 AEf;
        String str;
        2Lk r2 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        C375759Ex r1 = C375749Ew.A00;
        Context context = r2.A01;
        0qQ.A0B(context, 0);
        try {
            UserSession A08 = 09i.A0A.A08(r1);
            0Tu r6 = 0Tu.A05;
            boolean A06 = 182.A06(r6, A08, 2342160874711881335L);
            long A01 = 182.A01(r6, A08, 36599340474764793L);
            long A012 = 182.A01(r6, A08, 36599340474633719L);
            long A013 = 182.A01(r6, A08, 36599340474699256L);
            long A014 = 182.A01(r6, A08, 36599340475026939L);
            long A015 = 182.A01(r6, A08, 36599340474961402L);
            String A002 = AnonymousClass000.A00(2410);
            if (A01 < A012) {
                AEf = 0wj.A01.AEf(A002, 817896512);
                str = "Play Integrity attestation scheduling failed due to incorrect intervals";
            } else if (A015 < 10000) {
                AEf = 0wj.A01.AEf(A002, 817896512);
                str = "Play Integrity attestation scheduling failed due to incorrect retry wait duration";
            } else {
                try {
                    C375569Ed r13 = new C375569Ed();
                    r13.A01(AnonymousClass05K.A01);
                    r13.A03 = A06;
                    C255343ty A003 = r13.A00();
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    C375589Ef r4 = new C375589Ef(PlayIntegrityAttestationWorker.class);
                    r4.A00.A01(timeUnit.toMillis(A01 * 60), timeUnit.toMillis(A012 * 60));
                    r4.A01(A013, timeUnit);
                    r4.A02(A003);
                    if (A014 > 0) {
                        r4.A03(AnonymousClass05K.A00, TimeUnit.MILLISECONDS, A015);
                    }
                    C375669Eo.A00(r4.A00(), AnonymousClass385.A00(context), A002);
                    return;
                } catch (UnsupportedOperationException e) {
                    0f9 AEf2 = 0wj.A01.AEf(A002, 817896512);
                    AEf2.ABQ("error", "Play Integrity attestation scheduling failed due to unsupported operation");
                    AEf2.ERJ(e);
                    AEf2.report();
                    return;
                }
            }
            AEf.ABQ("error", str);
            AEf.report();
        } catch (IllegalStateException unused) {
        }
    }
}
