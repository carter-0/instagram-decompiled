package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CiA  reason: case insensitive filesystem */
public abstract class C44632CiA {
    public static C45208CsL parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C45208CsL csL = new C45208CsL();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if ("prompts".equals(AnonymousClass7TE.A17(r5))) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C45274Ctd parseFromJson = C44631Ci9.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    csL.A00 = arrayList;
                }
                r5.A0z();
            }
            return csL;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
