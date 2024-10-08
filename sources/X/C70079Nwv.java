package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Nwv  reason: case insensitive filesystem */
public abstract class C70079Nwv {
    public static N2T parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            N2T n2t = new N2T();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if (C273654mx.A00(3013).equals(A17)) {
                    n2t.A00 = AnonymousClass7TG.A0l(r5);
                } else if (C273654mx.A00(3014).equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            N49 parseFromJson = C70080Nww.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    n2t.A01 = arrayList;
                }
                r5.A0z();
            }
            return n2t;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
