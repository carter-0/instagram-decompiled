package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Ecg  reason: case insensitive filesystem */
public abstract class C48323Ecg {
    public static C47189Dsb parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (r6.A1J() != 16L.A09) {
                if ("interests".equals(AnonymousClass7TE.A17(r6))) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C47216Dt3 parseFromJson = C48352Ed9.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r6.A0z();
            }
            if (arrayList != null || !(r6 instanceof 0c9)) {
                return new C47189Dsb(arrayList);
            }
            AnonymousClass7TF.A1L("interests", r6, "BioInterestsResponseImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
