package X;

import java.util.Iterator;

/* renamed from: X.WoT  reason: case insensitive filesystem */
public final class C20278WoT implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C263694Mz A01;
    public final /* synthetic */ byte[] A02;

    public C20278WoT(C263694Mz r1, byte[] bArr, long j) {
        this.A01 = r1;
        this.A02 = bArr;
        this.A00 = j;
    }

    public final void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).DTt(this.A02, this.A00);
        }
    }
}
