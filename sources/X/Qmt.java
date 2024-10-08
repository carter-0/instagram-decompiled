package X;

import android.view.View;

public final class Qmt extends C11188SEo {
    public final int A00;
    public final int A01;
    public final int A02;
    public final View.OnClickListener A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public static Qmt A00(Qmk qmk, Integer num) {
        C10442RsJ rsJ = new C10442RsJ();
        rsJ.A00 = num;
        qmk.A02 = new SEE(rsJ);
        return new Qmt(qmk);
    }

    public Qmt(Qmk qmk) {
        super((C9130RQe) qmk);
        this.A05 = qmk.A05;
        this.A02 = qmk.A02;
        this.A01 = qmk.A01;
        this.A04 = qmk.A04;
        this.A00 = qmk.A00;
        this.A06 = qmk.A06;
        this.A07 = qmk.A07;
        this.A08 = qmk.A08;
        this.A03 = qmk.A03;
    }
}
