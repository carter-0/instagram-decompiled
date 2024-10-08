package X;

/* renamed from: X.Lb3  reason: case insensitive filesystem */
public class C64386Lb3 implements C13816Thj, C13885Tj8 {
    public int A00;
    public long A01;
    public long A02 = -1;
    public long A03 = -1;
    public String A04;
    public final AnonymousClass4MS A05 = new AnonymousClass4MS();
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(MLI.A00);

    public final void D0e() {
    }

    public final void D5G(C11286SJe sJe) {
    }

    public final void DEX(C8989RKf rKf) {
    }

    public final void DaE(float f) {
        float min = Math.min(Math.max(f, 0.0f), 1.0f);
        long j = this.A03;
        long j2 = (long) (min * ((float) j));
        this.A01 = j2;
        onBytesTransferred(j2, j);
    }

    public final void onStart() {
    }

    public void onBytesTransferred(long j, long j2) {
        this.A01 = j;
        this.A03 = j2;
        if (AnonymousClass7TF.A1Z(this.A06)) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
