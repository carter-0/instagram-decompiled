package X;

/* renamed from: X.TzB  reason: case insensitive filesystem */
public final class C14605TzB implements C13690Tf8 {
    public final Object A00;
    public final int A01;
    public final C13690Tf8 A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C14605TzB) {
                C14605TzB tzB = (C14605TzB) obj;
                if (!0qQ.A0K(this.A02, tzB.A02) || !0qQ.A0K(this.A00, tzB.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer BeT() {
        return null;
    }

    public final int Bpr() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A02) + AnonymousClass7TG.A0C(this.A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ConfigWithLayoutData(config=");
        sb.append(this.A02);
        sb.append(", layoutData=");
        return AnonymousClass7TG.A0n(this.A00, sb);
    }

    public C14605TzB(C13690Tf8 tf8, Object obj) {
        this.A02 = tf8;
        this.A00 = obj;
        this.A01 = tf8.Bpr();
    }
}
