package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

public final class S3O {
    public ExecutionException A00;
    public boolean A01;
    public boolean A02 = true;
    public final Context A03;
    public final UserSession A04;
    public final AnonymousClass3Q2 A05;
    public final String A06;
    public final CountDownLatch A07 = new CountDownLatch(1);
    public final ExecutorService A08;
    public final boolean A09;

    public S3O(Context context, UserSession userSession, AnonymousClass3Q2 r5, String str, ExecutorService executorService, boolean z) {
        this.A08 = executorService;
        this.A06 = str;
        this.A05 = r5;
        this.A09 = z;
        this.A03 = context;
        this.A04 = userSession;
    }

    public final synchronized void A00() {
        AnonymousClass3Q2 r2 = this.A05;
        String str = r2.A3V;
        if (str != null) {
            try {
                AnonymousClass7TE.A0t(str).delete();
            } catch (RuntimeException unused) {
            } catch (Throwable th) {
                r2.A0i((String) null);
                r2.A0h((String) null);
                r2.A0P();
                throw th;
            }
            r2.A0i((String) null);
            r2.A0h((String) null);
            r2.A0P();
        }
        this.A08.shutdownNow();
        this.A02 = false;
        this.A01 = false;
        this.A07.countDown();
    }
}
