package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4hZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C270894hZ implements Runnable {
    public final /* synthetic */ 2If A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C270894hZ(2If r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.0Js] */
    public final void run() {
        2If r9 = this.A00;
        String str = this.A01;
        AtomicReference atomicReference = new AtomicReference();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        UserSession userSession = r9.A01;
        if (userSession != null) {
            if (r9.A04()) {
                for (String A0A : AnonymousClass0BO.A00(userSession).BNy((String) null)) {
                    ? obj = new Object();
                    C72932PPq pPq = new C72932PPq(r9, atomicReference);
                    09i.A0A.A0A(obj, (0Jv) null, pPq, A0A);
                }
            } else {
                atomicReference.set(2J7.A00(userSession));
            }
        }
        r9.A03.execute(new C270904ha(r9, str, atomicInteger, atomicReference));
    }
}
