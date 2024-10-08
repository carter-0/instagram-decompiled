package X;

public final class FAA {
    public final int A00;
    public final CharSequence A01;

    public FAA(CharSequence charSequence, int i) {
        this.A01 = charSequence;
        this.A00 = i;
    }

    public FAA() {
        this((CharSequence) null, 0);
    }
}
