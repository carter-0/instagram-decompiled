package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

public final class GSZ implements AnonymousClass5RD {
    public static final GSZ A00 = new GSZ();

    public final /* synthetic */ int CmW(C268014cc r2, List list, int i) {
        return C52407GRi.A00(r2, this, list, i);
    }

    public final /* synthetic */ int CmZ(C268014cc r2, List list, int i) {
        return C52407GRi.A01(r2, this, list, i);
    }

    public final /* synthetic */ int CoP(C268014cc r2, List list, int i) {
        return C52407GRi.A02(r2, this, list, i);
    }

    public final /* synthetic */ int CoS(C268014cc r2, List list, int i) {
        return C52407GRi.A03(r2, this, list, i);
    }

    public final C289145d6 Cnx(C268004cb r5, List list, long j) {
        ArrayList A0m = C51970G9q.A0m(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A0m.add(((C268074ci) list.get(i)).Cnz(j));
        }
        return C51969G9p.A0a(r5, J6M.A00(A0m, 1), Constraints.A01(j), Constraints.A00(j));
    }
}
