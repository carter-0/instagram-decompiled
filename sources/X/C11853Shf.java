package X;

import java.security.MessageDigest;

/* renamed from: X.Shf  reason: case insensitive filesystem */
public final class C11853Shf implements C13892TjF {
    public final Object A00;

    public final void FK7(MessageDigest messageDigest) {
        messageDigest.update(this.A00.toString().getBytes(C13892TjF.A00));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11853Shf) {
            return this.A00.equals(((C11853Shf) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C11853Shf(Object obj) {
        C9217RTu.A00(obj);
        this.A00 = obj;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ObjectKey{object=");
        return Pxg.A0p(this.A00, A1A);
    }
}
