package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;

public final class IGD implements C288835cZ {
    public final int A00;
    public final I4L A01;
    public final C56072HsL A02;
    public final C62320sa A03;

    public final /* synthetic */ boolean AB4(0sP r2) {
        return C287455aA.A00(this, r2);
    }

    public final /* synthetic */ Modifier Ezh(Modifier modifier) {
        return C285235Qj.A00(this, modifier);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGD) {
                IGD igd = (IGD) obj;
                if (!0qQ.A0K(this.A01, igd.A01) || this.A00 != igd.A00 || !0qQ.A0K(this.A02, igd.A02) || !0qQ.A0K(this.A03, igd.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A03, AnonymousClass7TF.A07(this.A02, (AnonymousClass7TE.A0K(this.A01) + this.A00) * 31));
    }

    public IGD(I4L i4l, C56072HsL hsL, C62320sa r3, int i) {
        this.A01 = i4l;
        this.A00 = i;
        this.A02 = hsL;
        this.A03 = r3;
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

    public final C289145d6 Cny(C268074ci r7, C268004cb r8, long j) {
        C267974cY Cnz = r7.Cnz(Constraints.A04(Constraints.A03(j), Constraints.A01(j), Constraints.A02(j), Integer.MAX_VALUE));
        int min = Math.min(Cnz.A00, Constraints.A00(j));
        return C51969G9p.A0a(r8, new C59093J6a(min, 1, (Object) Cnz, (Object) r8, (Object) this), Cnz.A01, min);
    }

    public final /* synthetic */ int CoQ(C268084cj r2, C268014cc r3, int i) {
        return C56609I4j.A02(r2, r3, this, i);
    }

    public final /* synthetic */ int CoT(C268084cj r2, C268014cc r3, int i) {
        return C56609I4j.A03(r2, r3, this, i);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VerticalScrollLayoutModifier(scrollerPosition=");
        A1A.append(this.A01);
        A1A.append(", cursorOffset=");
        A1A.append(this.A00);
        A1A.append(", transformedText=");
        A1A.append(this.A02);
        A1A.append(", textLayoutResultProvider=");
        return AnonymousClass7TG.A0n(this.A03, A1A);
    }
}
