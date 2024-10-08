package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CVu  reason: case insensitive filesystem */
public abstract class C44103CVu {
    public static AnonymousClass60J parseFromJson(16F r8) {
        String A00;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            while (true) {
                16L A1J = r8.A1J();
                16L r2 = 16L.A09;
                A00 = C273654mx.A00(1220);
                if (A1J == r2) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r8);
                if ("collaborators".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            BEK parseFromJson = C44102CVt.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("invitees".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            C41846B3n.A1E(r8, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                r8.A0z();
            }
            if (arrayList == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("collaborators", r8, A00);
            } else if (arrayList2 != null || !(r8 instanceof 0c9)) {
                return new AnonymousClass60J(arrayList, arrayList2);
            } else {
                AnonymousClass7TF.A1L("invitees", r8, A00);
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
