package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cfm  reason: case insensitive filesystem */
public abstract class C44490Cfm {
    public static AnonymousClass3IP parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Integer num = null;
            ArrayList arrayList = null;
            String str = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if (AnonymousClass000.A00(1691).equals(A17)) {
                    num = AnonymousClass7TF.A0X(r6);
                } else if (AnonymousClass000.A00(1867).equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C42101BHe parseFromJson = C44487Cfj.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AnonymousClass000.A00(1868).equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                }
                r6.A0z();
            }
            return new AnonymousClass3IP(num, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
