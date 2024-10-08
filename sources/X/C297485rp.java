package X;

import java.util.Iterator;

/* renamed from: X.5rp  reason: invalid class name and case insensitive filesystem */
public final class C297485rp implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C263694Mz A02;
    public final /* synthetic */ C297475ro A03;
    public final /* synthetic */ C263684My A04;
    public final /* synthetic */ C263674Mx A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ boolean A0C;

    public C297485rp(C263694Mz r1, C297475ro r2, C263684My r3, C263674Mx r4, Integer num, String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z) {
        this.A02 = r1;
        this.A05 = r4;
        this.A07 = str;
        this.A08 = str2;
        this.A04 = r3;
        this.A03 = r2;
        this.A01 = j;
        this.A06 = num;
        this.A00 = j2;
        this.A09 = str3;
        this.A0A = str4;
        this.A0C = z;
        this.A0B = str5;
    }

    public final void run() {
        Iterator it = this.A02.A00.iterator();
        while (it.hasNext()) {
            C263674Mx r6 = this.A05;
            String str = this.A07;
            String str2 = this.A08;
            C263684My r5 = this.A04;
            C297475ro r4 = this.A03;
            long j = this.A01;
            Integer num = this.A06;
            long j2 = this.A00;
            ((C263654Mv) it.next()).Dxb(r4, r5, r6, num, str, str2, this.A09, this.A0A, this.A0B, j, j2, this.A0C);
        }
    }
}
