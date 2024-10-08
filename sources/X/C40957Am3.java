package X;

import java.util.List;

/* renamed from: X.Am3  reason: case insensitive filesystem */
public final class C40957Am3 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C346047uV A01;

    public C40957Am3(C346047uV r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public final void run() {
        C341837nb r0 = this.A01.A00.A0G;
        if (r0 != null) {
            long j = this.A00;
            List list = r0.A00.A01.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass9PJ.A00(((C340317l4) list.get(i)).A00.A0J).A05(j);
            }
        }
    }
}
