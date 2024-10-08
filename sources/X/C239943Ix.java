package X;

/* renamed from: X.3Ix  reason: invalid class name and case insensitive filesystem */
public final class C239943Ix {
    public float A00;
    public int A01;

    public final synchronized void A00(long j) {
        if (j >= 100) {
            this.A00 += ((float) j) / 1048576.0f;
            this.A01++;
        }
    }
}
