package X;

import java.io.IOException;

/* renamed from: X.5jH  reason: invalid class name and case insensitive filesystem */
public abstract class C292635jH {
    public static C298895uD parseFromJson(16F r9) {
        String A00;
        String A002;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            String str2 = null;
            while (true) {
                16L A1J = r9.A1J();
                16L r6 = 16L.A09;
                A00 = AnonymousClass000.A00(3926);
                A002 = AnonymousClass000.A00(1393);
                if (A1J == r6) {
                    break;
                }
                String A0q = r9.A0q();
                r9.A1J();
                if (A002.equals(A0q)) {
                    num = Integer.valueOf(r9.A1D());
                } else if (A00.equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if (AnonymousClass000.A00(3927).equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (num == null && (r9 instanceof 0c9)) {
                ((0c9) r9).A03.A00(A002, "SchoolsBadgeMetadataDictImpl");
            } else if (str != null || !(r9 instanceof 0c9)) {
                return new C298895uD(num.intValue(), str, str2);
            } else {
                ((0c9) r9).A03.A00(A00, "SchoolsBadgeMetadataDictImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
