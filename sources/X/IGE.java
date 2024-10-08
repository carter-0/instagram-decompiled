package X;

import androidx.compose.ui.Modifier;

public final class IGE implements C288835cZ {
    public final C270284gU A00;
    public final C55959HqQ A01;
    public final /* synthetic */ IES A02;

    public final /* synthetic */ boolean AB4(0sP r2) {
        return C287455aA.A00(this, r2);
    }

    public final /* synthetic */ Modifier Ezh(Modifier modifier) {
        return C285235Qj.A00(this, modifier);
    }

    public IGE(IES ies, C55959HqQ hqQ, C270284gU r3) {
        this.A02 = ies;
        this.A01 = hqQ;
        this.A00 = r3;
    }

    public final /* synthetic */ Object AW8(Object obj, 0sL r3) {
        return r3.invoke(obj, this);
    }

    public final int CmX(C268084cj r2, C268014cc r3, int i) {
        return r2.CmV(i);
    }

    public final int Cma(C268084cj r2, C268014cc r3, int i) {
        return r2.CmY(i);
    }

    public final C289145d6 Cny(C268074ci r9, C268004cb r10, long j) {
        long j2;
        C267974cY Cnz = r9.Cnz(j);
        C55959HqQ hqQ = this.A01;
        IES ies = this.A02;
        C56866IFn A002 = hqQ.A00(new J6U(1, ies, this), J6G.A00(ies, 1));
        ies.A00 = A002;
        if (r10.CWf()) {
            j2 = C289155d7.A00(Cnz.A01, Cnz.A00);
        } else {
            j2 = ((C289005cr) A002.getValue()).A00;
        }
        return C51969G9p.A0a(r10, new C58749Iww(j2, ies, Cnz, 0), C51965G9l.A04(j2), C289005cr.A00(j2));
    }

    public final int CoQ(C268084cj r2, C268014cc r3, int i) {
        return r2.CoO(i);
    }

    public final int CoT(C268084cj r2, C268014cc r3, int i) {
        return r2.CoR(i);
    }

    public IGE() {
    }
}
