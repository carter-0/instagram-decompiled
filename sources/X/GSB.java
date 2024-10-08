package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

public final class GSB implements AnonymousClass5RD {
    public final C62320sa A00;
    public final C62320sa A01;

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

    public GSB(C62320sa r1, C62320sa r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final C289145d6 Cnx(C268004cb r13, List list, long j) {
        ArrayList arrayList;
        ArrayList A0m = C51970G9q.A0m(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (!(((C268084cj) obj).BaX() instanceof IGZ)) {
                A0m.add(obj);
            }
        }
        List list2 = (List) this.A00.invoke();
        if (list2 != null) {
            arrayList = C51970G9q.A0m(list2);
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                AnonymousClass5VN r8 = (AnonymousClass5VN) list2.get(i2);
                if (r8 != null) {
                    float f = r8.A02;
                    float f2 = r8.A01;
                    float f3 = r8.A00;
                    float f4 = r8.A03;
                    arrayList.add(new 0eP(((C268074ci) A0m.get(i2)).Cnz(AnonymousClass5SF.A04(0, (int) ((float) Math.floor((double) (f - f2))), 0, (int) ((float) Math.floor((double) (f3 - f4))))), new C289165d8(AnonymousClass5TW.A00(Math.round(f2), Math.round(f4)))));
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList A0m2 = C51970G9q.A0m(list);
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object obj2 = list.get(i3);
            if (((C268084cj) obj2).BaX() instanceof IGZ) {
                A0m2.add(obj2);
            }
        }
        ArrayList A002 = C291525hS.A00(A0m2, this.A01);
        return C51969G9p.A0a(r13, new J6U(40, arrayList, A002), Constraints.A01(j), Constraints.A00(j));
    }
}
