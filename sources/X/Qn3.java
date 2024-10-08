package X;

import android.os.Bundle;

public final class Qn3 extends QCW implements C13613Tdf {
    public C8602Qxj A00;
    public C8269QnB A01;

    public final boolean DGj(Bundle bundle, int i, boolean z) {
        C8602Qxj qxj = this.A00;
        if (qxj != null) {
            qxj.dismiss();
        }
        return super.DGj(bundle, i, z);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, X.QCW, java.lang.Object, X.Qn3] */
    public final void A00() {
        super.A00();
        C11652Sdu.A02(this, this.A01.A0A, 62);
        C11652Sdu.A02(this, this.A01.A0B, 63);
        C11651Sdt.A01(this, this.A01.A09, C11652Sdu.A00(this, 64), 20);
    }

    public final void A01() {
        super.A01();
        this.A01 = (C8269QnB) this.A04;
    }

    public final void onDestroyView() {
        int A02 = AnonymousClass0fD.A02(526805403);
        super.onDestroyView();
        C8602Qxj qxj = this.A00;
        if (qxj != null) {
            qxj.dismiss();
        }
        AnonymousClass0fD.A09(585951228, A02);
    }
}
