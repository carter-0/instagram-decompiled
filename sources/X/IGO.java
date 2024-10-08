package X;

import java.util.ArrayList;
import java.util.List;

public final class IGO implements AnonymousClass5RD {
    public static final IGO A00 = new IGO();

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

    public final C289145d6 Cnx(C268004cb r8, List list, long j) {
        ArrayList A0m = C51970G9q.A0m(list);
        int size = list.size();
        Integer num = 0;
        for (int i = 0; i < size; i++) {
            A0m.add(((C268074ci) list.get(i)).Cnz(j));
        }
        int size2 = A0m.size();
        Integer num2 = num;
        for (int i2 = 0; i2 < size2; i2++) {
            num2 = Integer.valueOf(Math.max(num2.intValue(), ((C267974cY) A0m.get(i2)).A01));
        }
        int intValue = num2.intValue();
        int size3 = A0m.size();
        for (int i3 = 0; i3 < size3; i3++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((C267974cY) A0m.get(i3)).A00));
        }
        return C51969G9p.A0a(r8, J6M.A00(A0m, 17), intValue, num.intValue());
    }
}
