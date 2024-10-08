package X;

/* renamed from: X.IaW  reason: case insensitive filesystem */
public final class C57426IaW implements C227182im {
    public final int A00;
    public final Object A01;

    public C57426IaW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DmH(int i, int i2) {
        if (this.A00 != 0) {
            C52043GCp gCp = (C52043GCp) this.A01;
            gCp.A03.A05(gCp.A05, 0sn.A00, gCp.A06, ((float) gCp.A01) + ((float) i), true);
            return;
        }
        GBQ gbq = (GBQ) this.A01;
        gbq.A03 = i;
        gbq.A02 = i2;
        gbq.A00 = gbq.A07.A00 - (((gbq.A05 + gbq.A04) + i) + i2);
    }
}
