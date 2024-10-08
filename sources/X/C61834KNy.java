package X;

/* renamed from: X.KNy  reason: case insensitive filesystem */
public final class C61834KNy extends C62779KmH {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C61834KNy) && 0qQ.A0K(this.A00, ((C61834KNy) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public C61834KNy(Integer num) {
        this.A00 = num;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TitleRowItem(titleResId=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }

    public C61834KNy() {
        this((Integer) null);
    }
}
