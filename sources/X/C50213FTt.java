package X;

import java.util.List;

/* renamed from: X.FTt  reason: case insensitive filesystem */
public final class C50213FTt implements C51894G6k {
    public final /* synthetic */ C51894G6k A00;
    public final /* synthetic */ F2O A01;

    public final void Dp3(C47340Dva dva) {
        F2O f2o = this.A01;
        boolean z = true;
        f2o.A02 = true;
        String str = dva.A00;
        if (str == null) {
            str = "";
        }
        f2o.A00 = str;
        List list = dva.A01;
        if (list == null || list.isEmpty()) {
            z = false;
        }
        f2o.A03 = z;
        f2o.A01 = false;
        this.A00.Dp3(dva);
    }

    public C50213FTt(C51894G6k g6k, F2O f2o) {
        this.A01 = f2o;
        this.A00 = g6k;
    }

    public final void Dp2() {
        F2O f2o = this.A01;
        f2o.A02 = true;
        f2o.A01 = true;
        this.A00.Dp2();
    }
}
