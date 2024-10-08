package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.NzS  reason: case insensitive filesystem */
public abstract class C70236NzS {
    public static AnonymousClass1j7 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass1j7 r0 = new AnonymousClass1j7();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("optimistic_data".equals(A17)) {
                    r0.A00 = C70064Nwg.parseFromJson(r4);
                } else {
                    ArrayList arrayList = null;
                    if ("question_text".equals(A17)) {
                        r0.A01 = AnonymousClass7TG.A0l(r4);
                    } else if ("options".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                AnonymousClass7TG.A1F(r4, arrayList);
                            }
                        }
                        r0.A02 = arrayList;
                    } else if ("is_xac_thread".equals(A17)) {
                        r0.A03 = r4.A0d();
                    } else {
                        C66893Meb.A01(r4, r0, A17);
                    }
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
