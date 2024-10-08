package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.XDn  reason: case insensitive filesystem */
public final class C21074XDn extends AtomicReference implements 1aL, C65051aA {
    public final C21099XEn A00;
    public final 1aL A01;
    public final AtomicReference A02 = new AtomicReference();
    public final AtomicReference A03 = new AtomicReference();

    public final void Do4(C65051aA r2) {
        1af.A03(r2, this.A03);
    }

    public final void dispose() {
        1af.A01(this.A03);
        1af.A01(this.A02);
    }

    public final void onComplete() {
        1af.A01(this.A02);
        this.A01.onComplete();
    }

    public final void onError(Throwable th) {
        1af.A01(this.A02);
        this.A01.onError(th);
    }

    public C21074XDn(C21099XEn xEn, 1aL r3) {
        this.A01 = r3;
        this.A00 = xEn;
    }

    public final void DUK(Object obj) {
        Object obj2 = get();
        if (obj2 != null) {
            try {
                Object apply = this.A00.A00.apply(obj, obj2);
                1aP.A01(apply, "The combiner returned a null value");
                this.A01.DUK(apply);
            } catch (Throwable th) {
                C9877Riq.A00(th);
                dispose();
                this.A01.onError(th);
            }
        }
    }
}
