package X;

/* renamed from: X.Xvb  reason: case insensitive filesystem */
public final class C22111Xvb implements C13511Tbc {
    public final long A00;
    public final /* synthetic */ C22105XvV A01;

    public C22111Xvb(C22105XvV xvV, long j) {
        this.A01 = xvV;
        this.A00 = j;
    }

    public final S5O Br9(long j) {
        C22105XvV xvV = this.A01;
        S5O A002 = xvV.A08[0].A00(j);
        int i = 1;
        while (true) {
            C21471Xc3[] xc3Arr = xvV.A08;
            if (i >= xc3Arr.length) {
                return A002;
            }
            S5O A003 = xc3Arr[i].A00(j);
            if (A003.A00.A00 < A002.A00.A00) {
                A002 = A003;
            }
            i++;
        }
    }
}
