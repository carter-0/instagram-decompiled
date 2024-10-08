package X;

import java.util.List;

/* renamed from: X.JrN  reason: case insensitive filesystem */
public final class C60792JrN extends C62698Kky {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60792JrN) {
                C60792JrN jrN = (C60792JrN) obj;
                if (!0qQ.A0K(this.A02, jrN.A02) || !0qQ.A0K(this.A03, jrN.A03) || this.A01 != jrN.A01 || this.A00 != jrN.A00 || !0qQ.A0K(this.A04, jrN.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + this.A01) * 31) + this.A00) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public C60792JrN(String str, String str2, List list, int i, int i2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = list;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("OutputSpec(id=");
        A1A.append(this.A02);
        A1A.append(", name=");
        A1A.append(this.A03);
        A1A.append(", width=");
        A1A.append(this.A01);
        A1A.append(", height=");
        A1A.append(this.A00);
        A1A.append(C273654mx.A00(445));
        return AnonymousClass7TG.A0n(this.A04, A1A);
    }
}
