package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CoR  reason: case insensitive filesystem */
public abstract class C44988CoR {
    public static C45244Csz parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C45244Csz csz = new C45244Csz();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if ("participations".equals(AnonymousClass7TE.A17(r5))) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C61122JxY parseFromJson = C44424Cei.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    csz.A00 = arrayList;
                }
                r5.A0z();
            }
            return csz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
