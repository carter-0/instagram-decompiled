package X;

import java.util.Iterator;

/* renamed from: X.4TY  reason: invalid class name */
public final class AnonymousClass4TY implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C263694Mz A01;
    public final /* synthetic */ C263684My A02;
    public final /* synthetic */ C263674Mx A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public AnonymousClass4TY(C263694Mz r1, C263684My r2, C263674Mx r3, String str, long j, boolean z, boolean z2) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
        this.A06 = z;
        this.A05 = z2;
        this.A00 = j;
        this.A04 = str;
    }

    public final void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            C263674Mx r4 = this.A03;
            C263684My r3 = this.A02;
            boolean z = this.A06;
            boolean z2 = this.A05;
            ((C263654Mv) it.next()).DmQ(r3, r4, this.A04, this.A00, z, z2);
        }
    }
}
