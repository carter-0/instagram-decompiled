package X;

import java.util.List;

public final /* synthetic */ class IXM implements JOV {
    public final /* synthetic */ H15 A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ List A02;

    public /* synthetic */ IXM(H15 h15, Runnable runnable, List list) {
        this.A00 = h15;
        this.A02 = list;
        this.A01 = runnable;
    }

    public final void ALd(String str, int i) {
        H15 h15 = this.A00;
        List list = this.A02;
        Runnable runnable = this.A01;
        I1X i1x = h15.A0G;
        str.getClass();
        i1x.A03(new FIi(h15, list, runnable, str, i, 2), str, list.size());
    }
}
