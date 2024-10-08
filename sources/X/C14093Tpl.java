package X;

import java.util.Iterator;

/* renamed from: X.Tpl  reason: case insensitive filesystem */
public final class C14093Tpl implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C263694Mz A01;
    public final /* synthetic */ C263684My A02;
    public final /* synthetic */ C263674Mx A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public C14093Tpl(C263694Mz r1, C263684My r2, C263674Mx r3, String str, String str2, String str3, String str4, long j, boolean z) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A00 = j;
        this.A08 = z;
        this.A07 = str4;
    }

    public final void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            C263674Mx r4 = this.A03;
            ((C263654Mv) it.next()).DxA(this.A02, r4, this.A05, this.A06, this.A04, this.A07, this.A00, this.A08);
        }
    }
}
