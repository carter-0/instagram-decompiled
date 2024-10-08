package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Ckc  reason: case insensitive filesystem */
public abstract class C44765Ckc {
    public static C45290Ctt parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45290Ctt ctt = new C45290Ctt();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("header".equals(A17)) {
                    ctt.A00 = AnonymousClass7TG.A0l(r4);
                } else if ("points".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C45289Cts parseFromJson = C44764Ckb.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    ctt.A01 = arrayList;
                }
                r4.A0z();
            }
            return ctt;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
