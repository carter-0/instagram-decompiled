package X;

/* renamed from: X.JqU  reason: case insensitive filesystem */
public final class C60737JqU extends C62694Kku {
    public final String A00;
    public final Throwable A01;

    public C60737JqU(String str, Throwable th) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = th;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60737JqU) {
                C60737JqU jqU = (C60737JqU) obj;
                if (!0qQ.A0K(this.A00, jqU.A00) || !0qQ.A0K(this.A01, jqU.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A00) + AnonymousClass7TG.A0C(this.A01);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Failure(errorMessage=");
        A1A.append(this.A00);
        A1A.append(C273654mx.A00(98));
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
