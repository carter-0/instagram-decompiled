package X;

import java.util.Iterator;

/* renamed from: X.8qn  reason: invalid class name and case insensitive filesystem */
public final class C367468qn implements Runnable {
    public final /* synthetic */ C341877nf A00;
    public final /* synthetic */ String A01;

    public C367468qn(C341877nf r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C340247kw) it.next()).Dd3(this.A01);
        }
    }
}
