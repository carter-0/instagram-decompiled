package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cdi  reason: case insensitive filesystem */
public abstract class C44362Cdi {
    public static AnonymousClass3IL parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            Integer num = null;
            Long l = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayList = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if (AnonymousClass000.A00(1646).equals(A17)) {
                    num = AnonymousClass7TF.A0X(r12);
                } else if (AnonymousClass000.A00(1825).equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r12);
                } else if (AnonymousClass000.A00(1826).equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if (AnonymousClass000.A00(1827).equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if (AnonymousClass000.A00(1828).equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                } else if ("stories".equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            C41846B3n.A1D(r12, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AnonymousClass000.A00(1897).equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r12);
                } else if (C273654mx.A00(414).equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r12);
                } else {
                    num4 = C41847B3o.A13(r12, num4, A17, AnonymousClass000.A00(1898));
                }
                r12.A0z();
            }
            return new AnonymousClass3IL(num, num2, num3, num4, l, str, str2, str3, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
