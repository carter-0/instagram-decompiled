package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.NzJ  reason: case insensitive filesystem */
public abstract class C70227NzJ {
    public static AnonymousClass1fF parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass1fF r1 = new AnonymousClass1fF();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("hscroll_share".equals(A17) || AnonymousClass000.A00(3193).equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C254873tC parseFromJson = C254863tB.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r1.A01 = arrayList;
                } else if (AnonymousClass000.A00(746).equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    }
                    r1.A02 = arrayList;
                } else if ("merchant_id".equals(A17)) {
                    r1.A00 = AnonymousClass7TG.A0l(r4);
                } else {
                    C66893Meb.A01(r4, r1, A17);
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
