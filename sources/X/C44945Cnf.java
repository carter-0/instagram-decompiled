package X;

import java.util.List;

/* renamed from: X.Cnf  reason: case insensitive filesystem */
public abstract class C44945Cnf {
    public static final String A00(C42133BIn bIn) {
        List list = bIn.A07;
        if (list == null || list.isEmpty()) {
            throw AnonymousClass7TE.A0z("non-empty stickers expected");
        }
        String str = ((BHN) list.get(0)).A00;
        if (str == null) {
            return "";
        }
        return str;
    }
}
