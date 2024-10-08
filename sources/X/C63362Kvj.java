package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Kvj  reason: case insensitive filesystem */
public abstract class C63362Kvj {
    public static C61069Jw7 parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            C61069Jw7 jw7 = new C61069Jw7(0);
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                ArrayList arrayList = null;
                if (AnonymousClass000.A00(1932).equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            arrayList.add(new Float(r6.A0U()));
                        }
                    }
                    jw7.A01 = arrayList;
                } else if (AnonymousClass000.A00(1933).equals(A17)) {
                    jw7.A02 = AnonymousClass7TF.A0X(r6);
                } else if (AnonymousClass000.A00(808).equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C61079JwH parseFromJson = C64014LJb.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    jw7.A00 = arrayList;
                }
                r6.A0z();
            }
            return jw7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
