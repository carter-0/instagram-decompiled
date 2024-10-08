package X;

public final class GQa {
    public final int A00;
    public final long A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GQa) {
                long j = this.A02;
                GQa gQa = (GQa) obj;
                long j2 = gQa.A02;
                long j3 = AnonymousClass5Z5.A01;
                if (!(j == j2 && this.A01 == gQa.A01 && this.A00 == gQa.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A02;
        long j2 = AnonymousClass5Z5.A01;
        return AnonymousClass7TF.A01(this.A01, C51967G9n.A02(j)) + this.A00;
    }

    public GQa(long j, long j2, int i) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = i;
        if (!(!AnonymousClass5Z7.A02(j))) {
            throw new IllegalArgumentException("width cannot be TextUnit.Unspecified");
        } else if (!(!AnonymousClass5Z7.A02(j2))) {
            throw new IllegalArgumentException("height cannot be TextUnit.Unspecified");
        }
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Placeholder(width=");
        A1A.append(AnonymousClass5Z5.A02(this.A02));
        A1A.append(", height=");
        A1A.append(AnonymousClass5Z5.A02(this.A01));
        A1A.append(", placeholderVerticalAlign=");
        int i = this.A00;
        if (i == 4) {
            str = "Center";
        } else if (i == 5) {
            str = "TextTop";
        } else if (i == 6) {
            str = "TextBottom";
        } else {
            str = "TextCenter";
        }
        return AnonymousClass7TG.A0n(str, A1A);
    }
}
