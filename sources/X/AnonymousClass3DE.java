package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.3DE  reason: invalid class name */
public final class AnonymousClass3DE implements Runnable {
    public final /* synthetic */ AnonymousClass3D9 A00;
    public final /* synthetic */ C232362ta A01;

    public AnonymousClass3DE(AnonymousClass3D9 r1, C232362ta r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass3D9 r2 = this.A00;
        C231422re r4 = r2.A01;
        if (r4.A00 == r2.A00) {
            List list = r2.A03;
            C232362ta r3 = this.A01;
            Runnable runnable = r2.A02;
            List list2 = r4.A02;
            r4.A01 = list;
            r4.A02 = Collections.unmodifiableList(list);
            r3.A02(r4.A05);
            C231422re.A00(r4, runnable, list2);
        }
    }
}
