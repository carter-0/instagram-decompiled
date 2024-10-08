package X;

import com.facebook.systrace.Systrace;
import java.util.Iterator;

/* renamed from: X.3Uu  reason: invalid class name */
public final class AnonymousClass3Uu implements Runnable {
    public final /* synthetic */ 1XR A00;
    public final /* synthetic */ 1GP A01;
    public final /* synthetic */ AnonymousClass2ZK A02;

    public AnonymousClass3Uu(1XR r1, 1GP r2, AnonymousClass2ZK r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void run() {
        1GP r7 = this.A01;
        AnonymousClass2ZK r6 = this.A02;
        1XR r5 = this.A00;
        if (Systrace.A0E(1)) {
            0fS.A01("StreamingHttpRequestTask.internalOnNewData.immediateCallback", 1746856);
        }
        try {
            if (!r7.A0A) {
                Iterator it = r7.A04.iterator();
                while (it.hasNext()) {
                    AnonymousClass1GR r1 = (AnonymousClass1GR) it.next();
                    AnonymousClass1QW r0 = r7.A01;
                    if (r0 == null) {
                        0qQ.A0F("action");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    r1.DTw(r5, r0, r6);
                }
            }
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(662919681);
            }
        }
    }
}
