package X;

import java.util.Iterator;

/* renamed from: X.4Yc  reason: invalid class name and case insensitive filesystem */
public final class C266244Yc implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C263694Mz A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public C266244Yc(C263694Mz r1, String str, long j, boolean z) {
        this.A01 = r1;
        this.A02 = str;
        this.A03 = z;
        this.A00 = j;
    }

    public final void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).D7z(this.A00, this.A02, this.A03);
        }
    }
}
