package X;

public final class HHJ extends C54715HPu {
    public final float A00;
    public final float A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HHJ) {
                HHJ hhj = (HHJ) obj;
                if (!(Float.compare(this.A01, hhj.A01) == 0 && this.A02 == hhj.A02 && Float.compare(this.A00, hhj.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51966G9m.A02((G9w.A00(this.A01) + this.A02) * 31, this.A00);
    }

    public HHJ(float f, int i, float f2) {
        this.A01 = f;
        this.A02 = i;
        this.A00 = f2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CardWithBorders(cornerRadius=");
        A1A.append(this.A01);
        A1A.append(AnonymousClass000.A00(839));
        A1A.append(this.A02);
        A1A.append(AnonymousClass000.A00(2003));
        A1A.append(this.A00);
        return AnonymousClass7TG.A0p(A1A);
    }
}
