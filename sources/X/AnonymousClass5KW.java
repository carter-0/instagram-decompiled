package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.5KW  reason: invalid class name */
public final class AnonymousClass5KW extends 0Yg implements 0sL {
    public static final AnonymousClass5KW A00 = new AnonymousClass5KW();

    public AnonymousClass5KW() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C268284d7 r3 = (C268284d7) obj;
        Throwable th = (Throwable) obj2;
        0qQ.A0B(r3, 0);
        if (r3 instanceof C268304d9) {
            C241063Ns r1 = ((C268304d9) r3).A03;
            if (th == null) {
                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            r1.A0U(th);
        }
        return C60340gF.A00;
    }
}
