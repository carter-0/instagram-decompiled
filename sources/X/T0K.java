package X;

import java.util.concurrent.atomic.AtomicReference;

public final class T0K implements 2IR {
    public final AtomicReference A00;
    public final AnonymousClass2hV A01;

    public final void onFailure(Throwable th) {
        S21 s21;
        AnonymousClass5A7 r2 = (AnonymousClass5A7) this.A00.getAndSet((Object) null);
        if (r2 != null) {
            try {
                s21 = C11097S9y.A01((Throwable) this.A01.apply(th));
            } catch (Exception e) {
                s21 = C11097S9y.A01(e);
            } catch (Throwable th2) {
                r2.DvN(C11097S9y.A01(th));
                throw th2;
            }
            r2.DvN(s21);
        }
    }

    public final void onSuccess(Object obj) {
        S21 A012;
        AnonymousClass5A7 r1 = (AnonymousClass5A7) this.A00.getAndSet((Object) null);
        if (r1 != null) {
            if (obj != null) {
                A012 = C11097S9y.A00(obj);
            } else {
                A012 = C11097S9y.A01(AnonymousClass7TE.A0z("Result is null on onSuccess"));
            }
            r1.DvN(A012);
        }
    }

    public T0K(AnonymousClass5A7 r2, AnonymousClass2hV r3) {
        this.A00 = new AtomicReference(r2);
        this.A01 = r3;
    }
}
