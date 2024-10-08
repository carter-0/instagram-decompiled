package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.KsP  reason: case insensitive filesystem */
public abstract class C63156KsP {
    public static C61077JwF parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C61077JwF jwF = new C61077JwF();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("shortwaveId".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    jwF.A01 = A0l;
                } else if ("characterBased".equals(A17)) {
                    jwF.A02 = r5.A0d();
                } else if ("detailedTranscriptions".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            GNY parseFromJson = VBF.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    jwF.A00 = arrayList;
                }
                r5.A0z();
            }
            return jwF;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
