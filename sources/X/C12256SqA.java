package X;

/* renamed from: X.SqA  reason: case insensitive filesystem */
public final class C12256SqA implements C13578Td3 {
    public final SFM A00;

    public final int Aek() {
        int i;
        SFM sfm = this.A00;
        synchronized (sfm) {
            int A09 = Pxe.A09(SFM.A05.get(sfm.A03.get()));
            i = 900;
            if (A09 <= 900) {
                i = Math.max(A09, 60);
            }
        }
        return i;
    }

    public C12256SqA(SFM sfm) {
        this.A00 = sfm;
    }
}
