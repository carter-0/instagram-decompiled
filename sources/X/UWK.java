package X;

public final class UWK extends C309276Xq {
    public int A00;
    public int A01;
    public boolean A02;

    public final void A00() {
        if (this.A00 != 0) {
            return;
        }
        if (this.A03 > 0) {
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        } else if (this.A05.length < 3) {
            throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
        }
    }
}
