package X;

import java.io.File;

/* renamed from: X.JrH  reason: case insensitive filesystem */
public final class C60786JrH extends C62696Kkw {
    public final File A00;
    public final String A01;

    public C60786JrH(String str, File file) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = file;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60786JrH) {
                C60786JrH jrH = (C60786JrH) obj;
                if (!0qQ.A0K(this.A01, jrH.A01) || !0qQ.A0K(this.A00, jrH.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TemplateExistEvent(message=");
        A1A.append(this.A01);
        A1A.append(", file=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
