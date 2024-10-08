package X;

import com.facebook.systrace.Systrace;
import java.util.Iterator;

/* renamed from: X.3oS  reason: invalid class name and case insensitive filesystem */
public final class C252033oS implements Runnable {
    public final /* synthetic */ 1GP A00;
    public final /* synthetic */ AnonymousClass2ZK A01;

    public C252033oS(1GP r1, AnonymousClass2ZK r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        1GP r6 = this.A00;
        AnonymousClass2ZK r5 = this.A01;
        if (Systrace.A0E(1)) {
            0fS.A01("StreamingHttpRequestTask.onComplete", 2083656444);
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
                    r1.D58(r0, r5);
                }
            }
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1027097029);
            }
        }
    }
}
