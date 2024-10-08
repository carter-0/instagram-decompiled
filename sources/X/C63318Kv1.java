package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Kv1  reason: case insensitive filesystem */
public abstract class C63318Kv1 {
    public static C61219JzC parseFromJson(16F r8) {
        String A00;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Boolean bool = null;
            ArrayList arrayList = null;
            while (true) {
                16L A1J = r8.A1J();
                16L r3 = 16L.A09;
                A00 = AnonymousClass000.A00(C11152SCh.MAX_FACTORIAL);
                if (A1J == r3) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r8);
                if ("hide_likes".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r8);
                } else if (A00.equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            C61218JzB parseFromJson = C63316Kuz.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r8.A0z();
            }
            if (bool == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("hide_likes", r8, "MediaKitPostSection");
            } else if (arrayList != null || !(r8 instanceof 0c9)) {
                return new C61219JzC(arrayList, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L(A00, r8, "MediaKitPostSection");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
