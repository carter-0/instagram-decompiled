package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cl4  reason: case insensitive filesystem */
public abstract class C44793Cl4 {
    public static C45297Cu0 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45297Cu0 cu0 = new C45297Cu0();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("conditionals".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    }
                    cu0.A00 = arrayList;
                } else if ("primitives".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C45399Cvf parseFromJson = C44786Ckx.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    cu0.A01 = arrayList;
                }
                r4.A0z();
            }
            return cu0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
