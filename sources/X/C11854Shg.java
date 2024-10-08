package X;

import java.security.MessageDigest;

/* renamed from: X.Shg  reason: case insensitive filesystem */
public final class C11854Shg implements C13892TjF {
    public final C13892TjF A00;
    public final C13892TjF A01;

    public final void FK7(MessageDigest messageDigest) {
        this.A01.FK7(messageDigest);
        this.A00.FK7(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11854Shg)) {
            return false;
        }
        C11854Shg shg = (C11854Shg) obj;
        if (!this.A01.equals(shg.A01) || !this.A00.equals(shg.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public C11854Shg(C13892TjF tjF, C13892TjF tjF2) {
        this.A01 = tjF;
        this.A00 = tjF2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DataCacheKey{sourceKey=");
        A1A.append(this.A01);
        A1A.append(", signature=");
        return Pxg.A0p(this.A00, A1A);
    }
}
