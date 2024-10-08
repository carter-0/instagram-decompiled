package X;

/* renamed from: X.1ah  reason: invalid class name and case insensitive filesystem */
public final class C65121ah {
    public int A00;
    public int A01;
    public int A02;
    public Object[] A03;

    public C65121ah() {
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
        this.A00 = numberOfLeadingZeros - 1;
        this.A01 = (int) (0.75f * ((float) numberOfLeadingZeros));
        this.A03 = new Object[numberOfLeadingZeros];
    }
}
