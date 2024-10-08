package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.68e  reason: invalid class name and case insensitive filesystem */
public final class C3032968e implements C65071aK {
    public final C3032868d A00;
    public final AtomicReference A01;

    public final void Eyt(1aL r8) {
        AtomicReference atomicReference;
        AnonymousClass6EN r6;
        AtomicReference atomicReference2;
        AnonymousClass6ER[] r3;
        AnonymousClass6ER[] r0;
        do {
            atomicReference = this.A01;
            r6 = (AnonymousClass6EN) atomicReference.get();
            if (r6 != null) {
                break;
            }
            r6 = new AnonymousClass6EN(new AnonymousClass6EO(1));
        } while (!1FH.A00((Object) null, r6, atomicReference));
        AnonymousClass6ER r5 = new AnonymousClass6ER(r8, r6);
        r8.Do4(r5);
        do {
            atomicReference2 = r6.A03;
            r3 = (AnonymousClass6ER[]) atomicReference2.get();
            if (r3 == AnonymousClass6EN.A05) {
                break;
            }
            int length = r3.length;
            r0 = new AnonymousClass6ER[(length + 1)];
            System.arraycopy(r3, 0, r0, 0, length);
            r0[length] = r5;
        } while (!1FH.A00(r3, r0, atomicReference2));
        if (r5.A03) {
            r6.A00(r5);
        } else {
            r6.A01.EFP(r5);
        }
    }

    public C3032968e(C3032868d r1, AtomicReference atomicReference) {
        this.A01 = atomicReference;
        this.A00 = r1;
    }
}
