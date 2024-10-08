package X;

/* renamed from: X.HIn  reason: case insensitive filesystem */
public final class C54552HIn extends HQ8 {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C54552HIn) && this.A00 == ((C54552HIn) obj).A00);
    }

    public final int hashCode() {
        Integer num = this.A00;
        return C51971G9r.A0D(num, I3J.A02(num));
    }

    public final String toString() {
        String str;
        Integer num = this.A00;
        if (num != null) {
            str = I3J.A02(num);
        } else {
            str = "null";
        }
        return G9w.A0k("WriteFeedbackSurface(writeWithAISurface=", str);
    }

    public C54552HIn(Integer num) {
        this.A00 = num;
    }
}
