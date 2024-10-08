package X;

import com.instagram.api.schemas.CameraTool;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9z0  reason: invalid class name and case insensitive filesystem */
public abstract class C394979z0 {
    public static final List A00(C352218Cl r3) {
        Long valueOf;
        List<CameraTool> A08 = r3.A08();
        ArrayList arrayList = null;
        if (A08 != null) {
            arrayList = AnonymousClass7TE.A1C();
            for (CameraTool A05 : A08) {
                AnonymousClass80P A052 = 2AL.A05(A05);
                if (!(A052 == null || (valueOf = Long.valueOf(A052.A00)) == null)) {
                    arrayList.add(valueOf);
                }
            }
        }
        return arrayList;
    }
}
