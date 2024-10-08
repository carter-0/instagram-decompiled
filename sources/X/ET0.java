package X;

import android.text.Editable;

public final class ET0 extends W7f {
    public final /* synthetic */ C47712EDv A00;
    public final /* synthetic */ C307786Rm A01;
    public final /* synthetic */ C276544tV A02;
    public final /* synthetic */ C277014uI A03;

    public ET0(C47712EDv eDv, C307786Rm r2, C276544tV r3, C277014uI r4) {
        this.A00 = eDv;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }

    public final void afterTextChanged(Editable editable) {
        C276544tV r3 = this.A02;
        C277014uI r2 = this.A03;
        C308276Tl A0P = DbS.A0P();
        A0P.A01(editable.toString());
        C307886Rw.A03(this.A01, r3, A0P.A00(), r2);
    }
}
