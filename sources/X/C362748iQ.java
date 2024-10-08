package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.8iQ  reason: invalid class name and case insensitive filesystem */
public final class C362748iQ implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C232362ta A01;
    public final /* synthetic */ C362388ho A02;
    public final /* synthetic */ AnonymousClass2tB A03;
    public final /* synthetic */ List A04;

    public C362748iQ(C232362ta r1, C362388ho r2, AnonymousClass2tB r3, List list, long j) {
        this.A02 = r2;
        this.A00 = j;
        this.A04 = list;
        this.A01 = r1;
        this.A03 = r3;
    }

    public final void run() {
        C362388ho r5 = this.A02;
        if (r5.A03.get() == this.A00) {
            List list = this.A04;
            C232362ta r1 = this.A01;
            r5.A01 = Collections.unmodifiableList(list);
            r1.A02(r5.A00);
            this.A03.DvY();
        }
    }
}
