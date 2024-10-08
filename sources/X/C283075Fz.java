package X;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: X.5Fz  reason: invalid class name and case insensitive filesystem */
public final class C283075Fz implements Runnable {
    public final /* synthetic */ C282905Ff A00;
    public final /* synthetic */ String A01;

    public C283075Fz(C282905Ff r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void run() {
        try {
            C282905Ff r1 = this.A00;
            C282935Fi r0 = (C282935Fi) r1.A0F.get();
            if (r0 == null) {
                AnonymousClass389.A00();
                Log.e(C282905Ff.A0I, 002.A0R(r1.A08.A0I, " returned a null result. Treating it as a failure."));
            } else {
                AnonymousClass389.A00();
                r1.A02 = r0;
            }
        } catch (CancellationException unused) {
            AnonymousClass389.A00();
        } catch (InterruptedException | ExecutionException e) {
            AnonymousClass389.A00();
            Log.e(C282905Ff.A0I, 002.A0R(this.A01, " failed because it threw an exception/error"), e);
        } catch (Throwable th) {
            this.A00.A02();
            throw th;
        }
        this.A00.A02();
    }
}
