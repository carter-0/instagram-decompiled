package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Ckx  reason: case insensitive filesystem */
public abstract class C44786Ckx {
    public static C45399Cvf parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45399Cvf cvf = new C45399Cvf();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                ArrayList arrayList = null;
                if (C41846B3n.A1Y(r4, A0q)) {
                    cvf.A01 = AnonymousClass7TG.A0l(r4);
                } else if (C41845B3m.A1C(A0q)) {
                    cvf.A00 = (C62596KiT) EnumHelper.A00(r4.A1Q(), C62596KiT.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("int_values".equals(A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            Integer A0X = AnonymousClass7TF.A0X(r4);
                            if (A0X != null) {
                                arrayList.add(A0X);
                            }
                        }
                    }
                    cvf.A03 = arrayList;
                } else if ("float_values".equals(A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            Double A0e = C41846B3n.A0e(r4);
                            if (A0e != null) {
                                arrayList.add(A0e);
                            }
                        }
                    }
                    cvf.A02 = arrayList;
                } else if ("string_values".equals(A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    }
                    cvf.A04 = arrayList;
                }
                r4.A0z();
            }
            return cvf;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
