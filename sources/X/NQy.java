package X;

import android.view.View;

public final class NQy extends C339867kI {
    public final int A00;
    public final Object A01;

    public NQy(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean Dqe(View view) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(view, 0);
                return C51971G9r.A1a(view, (0sP) this.A01);
            case 1:
                C66828MdM mdM = (C66828MdM) this.A01;
                C66859Mds mds = mdM.A00;
                if (mds == null) {
                    return true;
                }
                mdM.A00(mds);
                return true;
            default:
                ((OD8) this.A01).A01.A04.A0G();
                return true;
        }
    }
}
