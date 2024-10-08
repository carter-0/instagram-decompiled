package X;

import java.util.Queue;

/* renamed from: X.Sir  reason: case insensitive filesystem */
public final class C11918Sir implements C13533Tc5 {
    public int A00;
    public Class A01;
    public final QH4 A02;

    public final void CsZ() {
        Queue queue = this.A02.A00;
        if (queue.size() < 20) {
            queue.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11918Sir)) {
            return false;
        }
        C11918Sir sir = (C11918Sir) obj;
        if (this.A00 == sir.A00 && this.A01 == sir.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.A00 * 31) + C51971G9r.A0E(this.A01);
    }

    public C11918Sir(QH4 qh4) {
        this.A02 = qh4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Key{size=");
        A1A.append(this.A00);
        A1A.append("array=");
        return Pxg.A0p(this.A01, A1A);
    }
}
