package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3gX  reason: invalid class name and case insensitive filesystem */
public abstract class C247553gX {
    public static final C262224Cq A00(AnonymousClass3XH r7) {
        AtomicReference atomicReference;
        AnonymousClass19G r4;
        AnonymousClass134 A0P;
        C247563gY r2;
        C262224Cq r1;
        do {
            atomicReference = r7.A04;
            Object obj = atomicReference.get();
            if ((obj instanceof C262224Cq) && (r1 = (C262224Cq) obj) != null) {
                return r1;
            }
            r4 = new AnonymousClass19G((C262204Co) null);
            AnonymousClass4CZ r0 = AnonymousClass12W.A01;
            A0P = AnonymousClass12y.A00.A0P();
            r2 = new C247563gY(r7, r4.plus(A0P));
        } while (!1FH.A00((Object) null, r2, atomicReference));
        1Eo.A03(AnonymousClass05K.A00, A0P, new C376879Jr(r2, (AnonymousClass4D7) null, 4), r2);
        r4.CO3(new C377469Ly(23, (Object) r7, (Object) r2));
        return r2;
    }
}
