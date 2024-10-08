package X;

import java.util.concurrent.Future;

/* renamed from: X.TYu  reason: case insensitive filesystem */
public final class C13410TYu extends C64851Wn {
    public final Future A00;

    public final void A05(Throwable th) {
        if (th != null) {
            this.A00.cancel(false);
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A05((Throwable) obj);
        return C60340gF.A00;
    }

    public C13410TYu(Future future) {
        this.A00 = future;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CancelFutureOnCancel[");
        A1A.append(this.A00);
        return Pxg.A0w(A1A);
    }
}
