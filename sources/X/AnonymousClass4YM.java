package X;

/* renamed from: X.4YM  reason: invalid class name */
public final class AnonymousClass4YM {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public AnonymousClass4YB A05;
    public AnonymousClass4YD A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public int[] A0A = new int[0];
    public int[] A0B = new int[0];
    public long[] A0C = new long[0];
    public long[] A0D = new long[0];
    public boolean[] A0E = new boolean[0];
    public boolean[] A0F = new boolean[0];
    public final AnonymousClass4XV A0G = new AnonymousClass4XV();

    public final void A00(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (this.A0B.length < i) {
            this.A0D = new long[i];
            this.A0B = new int[i];
        }
        if (this.A0A.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.A0A = new int[i3];
            this.A0C = new long[i3];
            this.A0F = new boolean[i3];
            this.A0E = new boolean[i3];
        }
    }
}
