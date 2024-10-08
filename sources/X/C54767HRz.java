package X;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: X.HRz  reason: case insensitive filesystem */
public abstract class C54767HRz {
    public static final ArrayList A00(AnonymousClass6Tm r6) {
        Object A03 = r6.A03(0);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        Object A02 = r6.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        ArrayList A1C = AnonymousClass7TE.A1C();
        String quote = Pattern.quote((String) A02);
        0qQ.A07(quote);
        for (String add : DbU.A1b(DbW.A0o((String) A03, quote), 0)) {
            A1C.add(add);
        }
        return A1C;
    }
}
