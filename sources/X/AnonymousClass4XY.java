package X;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.4XY  reason: invalid class name */
public final class AnonymousClass4XY implements AnonymousClass4T1 {
    public static final AnonymousClass4XZ A04 = new AnonymousClass4XZ(2, -9223372036854775807L);
    public static final AnonymousClass4XZ A05 = new AnonymousClass4XZ(3, -9223372036854775807L);
    public 27s A00;
    public AnonymousClass4Y3 A01;
    public IOException A02;
    public final ExecutorService A03;

    public final void A01(Looper looper, AnonymousClass4TQ r13, C266204Xy r14, int i) {
        boolean z = false;
        Looper looper2 = looper;
        if (looper != null) {
            z = true;
        }
        C256703wD.A04(z);
        this.A02 = null;
        AnonymousClass4Y3 r3 = new AnonymousClass4Y3(looper2, r13, r14, this, i, SystemClock.elapsedRealtime());
        AnonymousClass4XY r2 = r3.A0A;
        boolean z2 = false;
        if (r2.A01 == null) {
            z2 = true;
        }
        C256703wD.A04(z2);
        r2.A01 = r3;
        AnonymousClass4Y3.A00(r3);
    }

    public final void A00() {
        AnonymousClass4Y3 r1 = this.A01;
        C256703wD.A01(r1);
        r1.A01(false);
    }

    public final void A03(AnonymousClass4TR r3) {
        AnonymousClass4Y3 r1 = this.A01;
        if (r1 != null) {
            r1.A01(true);
        }
        if (r3 != null) {
            this.A03.execute(new C291245gq(r3));
        }
        this.A03.shutdown();
    }

    public final void Cnj() {
        IOException iOException = this.A02;
        if (iOException == null) {
            AnonymousClass4Y3 r0 = this.A01;
            if (r0 != null) {
                int i = r0.A06;
                IOException iOException2 = r0.A02;
                if (iOException2 != null && r0.A00 > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public AnonymousClass4XY(String str) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new C265974Xa(str));
        0qQ.A07(newSingleThreadExecutor);
        this.A03 = newSingleThreadExecutor;
        2BY.A02(2BQ.A0v);
    }

    public final void A02(AnonymousClass4TQ r2, C266204Xy r3, int i) {
        Looper myLooper = Looper.myLooper();
        C256703wD.A01(myLooper);
        A01(myLooper, r2, r3, i);
    }
}
