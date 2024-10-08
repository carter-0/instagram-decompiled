package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6EN  reason: invalid class name */
public final class AnonymousClass6EN extends AtomicReference implements 1aL, C65051aA {
    public static final AnonymousClass6ER[] A04 = new AnonymousClass6ER[0];
    public static final AnonymousClass6ER[] A05 = new AnonymousClass6ER[0];
    public boolean A00;
    public final AnonymousClass6EP A01;
    public final AtomicBoolean A02 = new AtomicBoolean();
    public final AtomicReference A03 = new AtomicReference(A04);

    public final void A00(AnonymousClass6ER r9) {
        AtomicReference atomicReference;
        AnonymousClass6ER[] r6;
        AnonymousClass6ER[] r1;
        do {
            atomicReference = this.A03;
            r6 = (AnonymousClass6ER[]) atomicReference.get();
            int length = r6.length;
            if (length != 0) {
                int i = 0;
                while (!r6[i].equals(r9)) {
                    i++;
                    if (i >= length) {
                        return;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    r1 = A04;
                } else {
                    r1 = new AnonymousClass6ER[(length - 1)];
                    System.arraycopy(r6, 0, r1, 0, i);
                    System.arraycopy(r6, i + 1, r1, i, (length - i) - 1);
                }
            } else {
                return;
            }
        } while (!1FH.A00(r6, r1, atomicReference));
    }

    public final void DUK(Object obj) {
        if (!this.A00) {
            AnonymousClass6EP r4 = this.A01;
            AnonymousClass6EO r2 = (AnonymousClass6EO) r4;
            AnonymousClass6EQ r1 = new AnonymousClass6EQ(obj);
            r2.A01.set(r1);
            r2.A01 = r1;
            int i = r2.A00 + 1;
            r2.A00 = i;
            if (i > r2.A02) {
                r2.A00--;
                r2.set(((AtomicReference) r2.get()).get());
            }
            for (AnonymousClass6ER EFP : (AnonymousClass6ER[]) this.A03.get()) {
                r4.EFP(EFP);
            }
        }
    }

    public final void dispose() {
        this.A03.set(A05);
        1af.A01(this);
    }

    public final void onComplete() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass6EP r4 = this.A01;
            AnonymousClass6EO r3 = (AnonymousClass6EO) r4;
            AnonymousClass6EQ r1 = new AnonymousClass6EQ(1ai.A01);
            r3.A01.set(r1);
            r3.A01 = r1;
            r3.A00++;
            AnonymousClass6EQ r2 = (AnonymousClass6EQ) r3.get();
            if (r2.A00 != null) {
                AnonymousClass6EQ r12 = new AnonymousClass6EQ((Object) null);
                r12.lazySet(r2.get());
                r3.set(r12);
            }
            for (AnonymousClass6ER EFP : (AnonymousClass6ER[]) this.A03.getAndSet(A05)) {
                r4.EFP(EFP);
            }
        }
    }

    public final void onError(Throwable th) {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass6EP r4 = this.A01;
            AnonymousClass6EO r3 = (AnonymousClass6EO) r4;
            AnonymousClass6EQ r1 = new AnonymousClass6EQ(new 1aj(th));
            r3.A01.set(r1);
            r3.A01 = r1;
            r3.A00++;
            AnonymousClass6EQ r2 = (AnonymousClass6EQ) r3.get();
            if (r2.A00 != null) {
                AnonymousClass6EQ r12 = new AnonymousClass6EQ((Object) null);
                r12.lazySet(r2.get());
                r3.set(r12);
            }
            for (AnonymousClass6ER EFP : (AnonymousClass6ER[]) this.A03.getAndSet(A05)) {
                r4.EFP(EFP);
            }
            return;
        }
        C318176oW.A01(th);
    }

    public AnonymousClass6EN(AnonymousClass6EP r3) {
        this.A01 = r3;
    }

    public final void Do4(C65051aA r6) {
        if (1af.A03(r6, this)) {
            for (AnonymousClass6ER EFP : (AnonymousClass6ER[]) this.A03.get()) {
                this.A01.EFP(EFP);
            }
        }
    }
}
