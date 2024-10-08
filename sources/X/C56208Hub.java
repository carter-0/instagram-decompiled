package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Hub  reason: case insensitive filesystem */
public final class C56208Hub {
    public static C54049GyY parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            1XQ r2 = new 1XQ();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                ArrayList arrayList = null;
                if ("suggested_hidden_words".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r8, arrayList);
                        }
                    }
                    r2.A04 = arrayList;
                } else if ("upsell_style".equals(A17)) {
                    r2.A01 = AnonymousClass7TG.A0l(r8);
                } else if ("upsell_type".equals(A17)) {
                    r2.A02 = AnonymousClass7TG.A0l(r8);
                } else if ("upsell_variant".equals(A17)) {
                    r2.A03 = AnonymousClass7TG.A0l(r8);
                } else if ("users_to_block".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            Long A0Z = AnonymousClass7TF.A0Z(r8);
                            if (A0Z != null) {
                                arrayList.add(A0Z);
                            }
                        }
                    }
                    r2.A05 = arrayList;
                } else {
                    1XY.A01(r8, r2, A17);
                }
                r8.A0z();
            }
            List list = r2.A04;
            String str = r2.A01;
            String str2 = r2.A02;
            0qQ.A0A(str2);
            r2.A00 = new C53438GoW(str, str2, r2.A03, list, r2.A05);
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
