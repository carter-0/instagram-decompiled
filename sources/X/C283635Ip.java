package X;

import com.facebook.systrace.Systrace;
import java.util.Iterator;

/* renamed from: X.5Ip  reason: invalid class name and case insensitive filesystem */
public final class C283635Ip implements Runnable {
    public final /* synthetic */ C268654dm A00;
    public final /* synthetic */ 1GP A01;

    public C283635Ip(C268654dm r1, 1GP r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        1GP r6 = this.A01;
        C268654dm r5 = this.A00;
        if (Systrace.A0E(1)) {
            0fS.A01("StreamingHttpRequestTask.onFailed", -695690867);
        }
        try {
            if (!r6.A0A) {
                Iterator it = r6.A04.iterator();
                while (it.hasNext()) {
                    AnonymousClass1GR r1 = (AnonymousClass1GR) it.next();
                    AnonymousClass1QW r0 = r6.A01;
                    if (r0 == null) {
                        0qQ.A0F("action");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    r1.DEO(r5, r0);
                }
            }
            r6.A0A = true;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-464720926);
            }
        }
    }
}
