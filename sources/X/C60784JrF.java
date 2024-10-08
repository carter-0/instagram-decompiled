package X;

import java.io.File;

/* renamed from: X.JrF  reason: case insensitive filesystem */
public final class C60784JrF extends C62696Kkw {
    public final File A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C60784JrF) && 0qQ.A0K(this.A00, ((C60784JrF) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C60784JrF(File file) {
        this.A00 = file;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CDLSuccessEvent(file=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
