package X;

import java.util.Iterator;

/* renamed from: X.WpF  reason: case insensitive filesystem */
public final class C20320WpF implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C263694Mz A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ byte[] A03;

    public C20320WpF(C263694Mz r1, String str, byte[] bArr, long j) {
        this.A01 = r1;
        this.A03 = bArr;
        this.A02 = str;
        this.A00 = j;
    }

    public final void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).DKJ(this.A02, this.A03, this.A00);
        }
    }
}
