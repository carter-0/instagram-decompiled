package X;

/* renamed from: X.00z  reason: invalid class name and case insensitive filesystem */
public final class C585300z {
    public int A00;
    public int A01;
    public int A02;
    public int[] A03;

    public C585300z() {
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.A00 = highestOneBit - 1;
        this.A03 = new int[highestOneBit];
    }
}
