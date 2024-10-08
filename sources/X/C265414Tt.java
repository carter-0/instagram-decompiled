package X;

import java.util.Iterator;

/* renamed from: X.4Tt  reason: invalid class name and case insensitive filesystem */
public final class C265414Tt implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C263694Mz A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public C265414Tt(C263694Mz r1, long j, long j2, boolean z, boolean z2, boolean z3) {
        this.A02 = r1;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = z;
        this.A05 = z2;
        this.A04 = z3;
    }

    public final void run() {
        Iterator it = this.A02.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).DnM(this.A01, this.A00, this.A03, this.A05, this.A04);
        }
    }
}
