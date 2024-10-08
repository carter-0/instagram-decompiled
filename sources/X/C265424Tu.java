package X;

import java.util.Iterator;

/* renamed from: X.4Tu  reason: invalid class name and case insensitive filesystem */
public final class C265424Tu implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C263694Mz A01;
    public final /* synthetic */ C263684My A02;
    public final /* synthetic */ C263674Mx A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;

    public C265424Tu(C263694Mz r1, C263684My r2, C263674Mx r3, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
        this.A01 = r1;
        this.A03 = r3;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = r2;
        this.A0C = z;
        this.A0B = z2;
        this.A0A = str3;
        this.A06 = str4;
        this.A00 = j;
        this.A07 = str5;
        this.A08 = str6;
        this.A09 = str7;
    }

    public final void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            C263674Mx r5 = this.A03;
            String str = this.A04;
            String str2 = this.A05;
            C263684My r4 = this.A02;
            boolean z = this.A0C;
            boolean z2 = this.A0B;
            ((C263654Mv) it.next()).DyV(r4, r5, str, str2, this.A0A, this.A06, this.A07, this.A08, this.A09, this.A00, z, z2);
        }
    }
}
