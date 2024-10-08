package X;

import androidx.fragment.app.Fragment;

public final class FdK implements C358618bC {
    public final int A00;
    public final Object A01;

    public FdK(ESF esf, int i) {
        this.A00 = i;
        this.A01 = esf;
    }

    public final boolean onToggle(boolean z) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            ESF esf = (ESF) obj;
            if (z) {
                return true;
            }
            if (!esf.A01.A1x()) {
                C358248ab A0I = Dba.A0I(esf);
                A0I.A09(2131953376);
                A0I.A08(2131953375);
                A0I.A0I(new SVE(esf, 44), 2131953383);
                A0I.A05();
                DbT.A1V(A0I);
                return false;
            }
            esf.A01.A1f(false);
            return true;
        }
        Fragment fragment = (Fragment) obj;
        if (z) {
            return z;
        }
        C358248ab A0I2 = Dba.A0I(fragment);
        A0I2.A09(2131953384);
        A0I2.A08(2131953382);
        A0I2.A0I(new SVE(fragment, 45), 2131953383);
        A0I2.A05();
        DbT.A1V(A0I2);
        return z;
    }
}
