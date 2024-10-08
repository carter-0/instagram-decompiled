package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Ckp  reason: case insensitive filesystem */
public abstract class C44778Ckp {
    public static C45293Ctw parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45293Ctw ctw = new C45293Ctw();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if (AnonymousClass000.A00(3132).equals(A17)) {
                    ctw.A00 = AnonymousClass7TG.A0l(r4);
                } else if ("values".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    }
                    ctw.A01 = arrayList;
                }
                r4.A0z();
            }
            return ctw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
