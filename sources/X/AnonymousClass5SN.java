package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5SN  reason: invalid class name */
public final class AnonymousClass5SN extends AnonymousClass5RC {
    public static final AnonymousClass5SN A00 = new AnonymousClass5SN();

    public AnonymousClass5SN() {
        super("Undefined intrinsics block and it is required");
    }

    public final C289145d6 Cnx(C268004cb r8, List list, long j) {
        int A03;
        int A02;
        0sP j6m;
        0sP r2;
        if (list.isEmpty()) {
            A03 = Constraints.A03(j);
            A02 = Constraints.A02(j);
            r2 = C378019Oe.A00;
        } else {
            if (list.size() == 1) {
                C267974cY Cnz = ((C268074ci) list.get(0)).Cnz(j);
                A03 = AnonymousClass5SF.A03(j, Cnz.A01);
                A02 = AnonymousClass5SF.A02(j, Cnz.A00);
                r2 = new AnonymousClass9L6(Cnz, 49);
            } else {
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(((C268074ci) list.get(i)).Cnz(j));
                }
                int size2 = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < size2; i4++) {
                    C267974cY r1 = (C267974cY) arrayList.get(i4);
                    i2 = Math.max(r1.A01, i2);
                    i3 = Math.max(r1.A00, i3);
                }
                A03 = AnonymousClass5SF.A03(j, i2);
                A02 = AnonymousClass5SF.A02(j, i3);
                j6m = new J6M(arrayList, 34);
                return r8.Cfi(0Yt.A0E(), j6m, A03, A02);
            }
        }
        j6m = r2;
        return r8.Cfi(0Yt.A0E(), j6m, A03, A02);
    }
}
