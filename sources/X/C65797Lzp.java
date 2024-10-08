package X;

/* renamed from: X.Lzp  reason: case insensitive filesystem */
public final class C65797Lzp implements MT6 {
    public final int A00;
    public final Object A01;

    public C65797Lzp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onSearchCleared(String str) {
        switch (this.A00) {
            case 0:
                DbS.A1C(((JZL) this.A01).A04);
                return;
            case 1:
                ((K5H) this.A01).A0C("");
                return;
            default:
                ((NdC) ((C68468NJg) this.A01).A07.getValue()).A0S("");
                return;
        }
    }
}
