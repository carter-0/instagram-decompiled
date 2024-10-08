package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Ck6  reason: case insensitive filesystem */
public abstract class C44738Ck6 {
    public static BIO parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            ArrayList arrayList = null;
            Boolean bool = null;
            String str = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("clips_spins".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            C41846B3n.A1D(r9, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("more_spins_available".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r9);
                } else if ("paging_cursor".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (arrayList == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("clips_spins", r9, "GetClipsSpinsResponse");
            } else if (bool != null || !(r9 instanceof 0c9)) {
                return new BIO(str, arrayList, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("more_spins_available", r9, "GetClipsSpinsResponse");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
