package X;

import java.util.LinkedList;

/* renamed from: X.R9u  reason: case insensitive filesystem */
public final class C8793R9u extends 0ng {
    public final /* synthetic */ C252023oR A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8793R9u(C252023oR r2) {
        super(552);
        this.A00 = r2;
    }

    public final void run() {
        C252013oQ r1;
        boolean remove;
        C252023oR r3 = this.A00;
        1Iq r0 = r3.A02;
        synchronized (r0.A02) {
            LinkedList linkedList = r0.A03;
            r1 = r3.A01;
            remove = linkedList.remove(r1);
        }
        if (remove) {
            r1.A02.A04(r3.A03, JTO.A0u("request cancelled"));
        }
    }
}
