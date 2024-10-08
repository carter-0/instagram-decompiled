package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CiS  reason: case insensitive filesystem */
public abstract class C44648CiS {
    public static C45209CsM parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C45209CsM csM = new C45209CsM();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if ("gif_tray_saved_gif".equals(AnonymousClass7TE.A17(r5))) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C68137N2b parseFromJson = C70894OQm.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    csM.A00 = arrayList;
                }
                r5.A0z();
            }
            return csM;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
