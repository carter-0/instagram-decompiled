package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Mne  reason: case insensitive filesystem */
public abstract class C67423Mne {
    public static C67424Mnf parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C67424Mnf mnf = new C67424Mnf();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("places".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C69158Nfh parseFromJson = C70325O2d.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    mnf.A00 = arrayList;
                }
                r5.A0z();
            }
            return mnf;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
