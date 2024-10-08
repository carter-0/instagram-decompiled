package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.XEr  reason: case insensitive filesystem */
public final class C21102XEr extends AtomicReference implements Runnable, C3033868n {
    public long A00;
    public boolean A01;
    public boolean A02;
    public final C21093XEh A03;

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C65051aA r4 = (C65051aA) obj;
        1af.A00(r4, this);
        C21093XEh xEh = this.A03;
        synchronized (xEh) {
            if (this.A02) {
                1FH.A00(r4, (Object) null, ((C3033068f) xEh.A03).A03);
            }
        }
    }

    public final void run() {
        this.A03.A04(this);
    }

    public C21102XEr(C21093XEh xEh) {
        this.A03 = xEh;
    }
}
