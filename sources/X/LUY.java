package X;

import android.content.DialogInterface;

public final class LUY implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public LUY(C293505kq r1, K66 k66, String str, String str2, int i, boolean z) {
        this.A00 = i;
        this.A02 = k66;
        this.A05 = z;
        this.A03 = str;
        this.A01 = r1;
        this.A04 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        K66 k66;
        switch (this.A00) {
            case 0:
                k66 = (K66) this.A02;
                K66.A03(k66).CkT("not_now");
                break;
            case 1:
                k66 = (K66) this.A02;
                break;
            default:
                return;
        }
        boolean z = this.A05;
        K66.A0D((C293505kq) this.A01, k66, this.A03, this.A04, z);
    }
}
