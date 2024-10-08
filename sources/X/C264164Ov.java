package X;

import java.util.Iterator;

/* renamed from: X.4Ov  reason: invalid class name and case insensitive filesystem */
public final class C264164Ov implements Runnable {
    public final /* synthetic */ C263694Mz A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C264164Ov(C263694Mz r1, String str, String str2) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = str2;
    }

    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).DWg(this.A02, this.A01);
        }
    }
}
