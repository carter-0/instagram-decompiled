package X;

import java.util.Iterator;

/* renamed from: X.WpX  reason: case insensitive filesystem */
public final class C20334WpX implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C263694Mz A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ byte[] A04;

    public C20334WpX(C263694Mz r1, String str, byte[] bArr, long j, long j2) {
        this.A02 = r1;
        this.A04 = bArr;
        this.A03 = str;
        this.A00 = j;
        this.A01 = j2;
    }

    public final void run() {
        Iterator it = this.A02.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).DNr(this.A03, this.A04, this.A00, this.A01);
        }
    }
}
