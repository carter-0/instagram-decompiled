package X;

/* renamed from: X.7fu  reason: invalid class name and case insensitive filesystem */
public final class C337217fu {
    public int A00;
    public long A01;
    public final int A02;

    public static final void A00(C337217fu r6) {
        long j = r6.A01;
        if (j != 0 && j != -1) {
            long currentTimeMillis = System.currentTimeMillis();
            r6.A01 = currentTimeMillis;
            r6.A00 += (int) (currentTimeMillis - j);
        }
    }

    public C337217fu(int i) {
        this.A02 = i;
    }
}
