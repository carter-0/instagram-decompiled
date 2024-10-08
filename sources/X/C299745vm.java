package X;

import java.util.Iterator;

/* renamed from: X.5vm  reason: invalid class name and case insensitive filesystem */
public final class C299745vm implements Runnable {
    public final /* synthetic */ C263694Mz A00;
    public final /* synthetic */ C297475ro A01;
    public final /* synthetic */ C263684My A02;
    public final /* synthetic */ C263674Mx A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public C299745vm(C263694Mz r1, C297475ro r2, C263684My r3, C263674Mx r4, Integer num, String str, String str2, String str3, boolean z, boolean z2) {
        this.A00 = r1;
        this.A03 = r4;
        this.A05 = str;
        this.A06 = str2;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = num;
        this.A09 = z;
        this.A08 = z2;
        this.A07 = str3;
    }

    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            C263674Mx r5 = this.A03;
            String str = this.A05;
            String str2 = this.A06;
            C263684My r4 = this.A02;
            ((C263654Mv) it.next()).DxH(this.A01, r4, r5, this.A04, str, str2, this.A07, this.A09, this.A08);
        }
    }
}
