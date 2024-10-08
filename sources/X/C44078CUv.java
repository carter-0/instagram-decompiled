package X;

import java.io.IOException;

/* renamed from: X.CUv  reason: case insensitive filesystem */
public abstract class C44078CUv {
    public static C61070Jw8 parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            Integer num = null;
            Integer num2 = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                if (C41846B3n.A1Y(r7, A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if (AnonymousClass000.A00(1509).equals(A0q)) {
                    bool = AnonymousClass7TF.A0S(r7);
                } else if (AnonymousClass000.A00(1540).equals(A0q)) {
                    num = AnonymousClass7TF.A0X(r7);
                } else {
                    num2 = C41847B3o.A13(r7, num2, A0q, AnonymousClass000.A00(1545));
                }
                r7.A0z();
            }
            return new C61070Jw8((Object) bool, (Object) num, (Object) num2, str, 1);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
