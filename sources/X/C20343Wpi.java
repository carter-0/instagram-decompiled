package X;

import java.util.Iterator;

/* renamed from: X.Wpi  reason: case insensitive filesystem */
public final class C20343Wpi implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C263694Mz A01;
    public final /* synthetic */ C284815Oa A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C20343Wpi(C263694Mz r1, C284815Oa r2, String str, String str2, String str3, long j) {
        this.A01 = r1;
        this.A00 = j;
        this.A05 = str;
        this.A02 = r2;
        this.A03 = str2;
        this.A04 = str3;
    }

    public final void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            long j = this.A00;
            ((C263654Mv) it.next()).DCz(this.A02, this.A05, this.A03, this.A04, j);
        }
    }
}
