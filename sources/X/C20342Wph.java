package X;

import java.util.Iterator;

/* renamed from: X.Wph  reason: case insensitive filesystem */
public final class C20342Wph implements Runnable {
    public final /* synthetic */ C263694Mz A00;
    public final /* synthetic */ C297475ro A01;
    public final /* synthetic */ C284815Oa A02;
    public final /* synthetic */ C263684My A03;
    public final /* synthetic */ C263674Mx A04;
    public final /* synthetic */ String A05;

    public C20342Wph(C263694Mz r1, C297475ro r2, C284815Oa r3, C263684My r4, C263674Mx r5, String str) {
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = str;
    }

    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            C263674Mx r6 = this.A04;
            ((C263654Mv) it.next()).DXX(this.A01, this.A02, this.A03, r6, this.A05);
        }
    }
}
