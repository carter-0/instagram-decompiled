package X;

public final class S5A {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof S5A) && 0qQ.A0K(this.A00, ((S5A) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public S5A(Integer num) {
        this.A00 = num;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("StickerInfo(maxSavedCutoutStickerLimit=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
