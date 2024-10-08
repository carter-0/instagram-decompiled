package X;

import android.view.View;

/* renamed from: X.FOt  reason: case insensitive filesystem */
public final class C50103FOt implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C50103FOt(G88 g88, AnonymousClass3UM r2, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = g88;
        this.A03 = r2;
        this.A01 = i;
        this.A04 = str;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                A05 = AnonymousClass0fD.A05(-488445070);
                ((G88) this.A02).D9T((AnonymousClass3UM) this.A03, this.A04, this.A01);
                i = -689743048;
                break;
            case 1:
                A05 = A00(this, 527962089);
                i = -515853076;
                break;
            case 2:
                A05 = AnonymousClass0fD.A05(-1814080569);
                G88 g88 = (G88) this.A02;
                AnonymousClass3UM r2 = (AnonymousClass3UM) this.A03;
                Integer Auv = g88.Auv(DbU.A0q(r2));
                if (Auv != null) {
                    i2 = Auv.intValue();
                } else {
                    i2 = this.A01;
                }
                g88.Dw1(r2, this.A04, i2);
                i = 1520467018;
                break;
            case 3:
                A05 = A00(this, 1232303299);
                i = -867578199;
                break;
            case 4:
                A05 = A00(this, 24521966);
                i = -2059340078;
                break;
            case 5:
                A05 = A00(this, -785086011);
                i = 1592326319;
                break;
            default:
                A05 = A00(this, -1521863877);
                i = 1595732382;
                break;
        }
        AnonymousClass0fD.A0C(i, A05);
    }

    public static int A00(C50103FOt fOt, int i) {
        int A05 = AnonymousClass0fD.A05(i);
        ((G88) fOt.A02).Dw1((AnonymousClass3UM) fOt.A03, fOt.A04, fOt.A01);
        return A05;
    }
}
