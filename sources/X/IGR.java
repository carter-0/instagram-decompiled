package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

public final class IGR implements AnonymousClass5RD {
    public static final IGR A00 = new IGR();

    public final /* synthetic */ int CmW(C268014cc r2, List list, int i) {
        return C52407GRi.A00(r2, this, list, i);
    }

    public final /* synthetic */ int CmZ(C268014cc r2, List list, int i) {
        return C52407GRi.A01(r2, this, list, i);
    }

    public final C289145d6 Cnx(C268004cb r14, List list, long j) {
        C267974cY r12;
        C267974cY r11;
        int i;
        int i2;
        C267974cY r10;
        C268074ci r2 = (C268074ci) 00k.A0O(list, AnonymousClass7TF.A1U(0, r14, list) ? 1 : 0);
        long j2 = j;
        if (r2 != null) {
            r12 = r2.Cnz(j2);
        } else {
            r12 = null;
        }
        C268074ci r22 = (C268074ci) 00k.A0O(list, 2);
        if (r22 != null) {
            r11 = r22.Cnz(j2);
        } else {
            r11 = null;
        }
        int i3 = 0;
        if (r12 != null) {
            i = r12.A00;
        } else {
            i = 0;
        }
        if (r11 != null) {
            i2 = r11.A00;
        } else {
            i2 = 0;
        }
        int A03 = Constraints.A03(j2);
        int A01 = Constraints.A01(j2);
        long A04 = Constraints.A04(A03, A01, Constraints.A02(j2), (Constraints.A00(j2) - i) - i2);
        C268074ci r3 = (C268074ci) 00k.A0O(list, 0);
        if (r3 != null) {
            r10 = r3.Cnz(A04);
            if (r10 != null) {
                i3 = r10.A00;
            }
        } else {
            r10 = null;
        }
        return C51969G9p.A0a(r14, new C59093J6a(i2, 4, (Object) r10, (Object) r11, (Object) r12), A01, i3 + i + i2);
    }

    public final /* synthetic */ int CoP(C268014cc r2, List list, int i) {
        return C52407GRi.A02(r2, this, list, i);
    }

    public final /* synthetic */ int CoS(C268014cc r2, List list, int i) {
        return C52407GRi.A03(r2, this, list, i);
    }
}
