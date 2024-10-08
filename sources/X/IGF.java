package X;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.ui.Modifier;

public final class IGF implements C288835cZ, C288865cc, C288855cb {
    public final C284945Oz A00;
    public final C284945Oz A01;
    public final WindowInsets A02;

    public final /* synthetic */ boolean AB4(0sP r2) {
        return C287455aA.A00(this, r2);
    }

    public final /* synthetic */ Modifier Ezh(Modifier modifier) {
        return C285235Qj.A00(this, modifier);
    }

    public final AnonymousClass5VK BJr() {
        return C56382Hxb.A00;
    }

    public final C289145d6 Cny(C268074ci r8, C268004cb r9, long j) {
        C284945Oz r2 = this.A01;
        int BMH = ((WindowInsets) r2.getValue()).BMH(r9, r9.getLayoutDirection());
        int C8K = ((WindowInsets) r2.getValue()).C8K(r9);
        int BoT = ((WindowInsets) r2.getValue()).BoT(r9, r9.getLayoutDirection()) + BMH;
        int AhD = ((WindowInsets) r2.getValue()).AhD(r9) + C8K;
        C267974cY Cnz = r8.Cnz(AnonymousClass5SF.A06(j, -BoT, -AhD));
        return C51969G9p.A0a(r9, new C58746Iwt(Cnz, C8K, BMH, 1), AnonymousClass5SF.A03(j, Cnz.A01 + BoT), AnonymousClass5SF.A02(j, Cnz.A00 + AhD));
    }

    public final void DSH(C268814e2 r5) {
        WindowInsets windowInsets = (WindowInsets) r5.Atk(C56382Hxb.A00);
        WindowInsets windowInsets2 = this.A02;
        this.A01.Epw(new C56852IEz(windowInsets2, windowInsets));
        this.A00.Epw(new IF0(windowInsets, windowInsets2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IGF)) {
            return false;
        }
        return 0qQ.A0K(((IGF) obj).A02, this.A02);
    }

    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00.getValue();
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public IGF(WindowInsets windowInsets) {
        this.A02 = windowInsets;
        this.A01 = C51970G9q.A0S(windowInsets);
        this.A00 = C51969G9p.A0S(windowInsets);
    }

    public final /* synthetic */ Object AW8(Object obj, 0sL r3) {
        return r3.invoke(obj, this);
    }

    public final /* synthetic */ int CmX(C268084cj r2, C268014cc r3, int i) {
        return C56609I4j.A00(r2, r3, this, i);
    }

    public final /* synthetic */ int Cma(C268084cj r2, C268014cc r3, int i) {
        return C56609I4j.A01(r2, r3, this, i);
    }

    public final /* synthetic */ int CoQ(C268084cj r2, C268014cc r3, int i) {
        return C56609I4j.A02(r2, r3, this, i);
    }

    public final /* synthetic */ int CoT(C268084cj r2, C268014cc r3, int i) {
        return C56609I4j.A03(r2, r3, this, i);
    }
}
