package X;

/* renamed from: X.5Ze  reason: invalid class name and case insensitive filesystem */
public final class C287145Ze implements AnonymousClass5ZA {
    public final C298605tj A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C287145Ze) {
                C287145Ze r5 = (C287145Ze) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || Float.compare(this.A01, r5.A01) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + Float.floatToIntBits(this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BrushStyle(value=");
        sb.append(this.A00);
        sb.append(", alpha=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public final float AbF() {
        return this.A01;
    }

    public final C304786Ff AiJ() {
        return this.A00;
    }

    public final long Aoz() {
        return AnonymousClass5RW.A08;
    }

    public C287145Ze(C298605tj r1, float f) {
        this.A00 = r1;
        this.A01 = f;
    }
}
