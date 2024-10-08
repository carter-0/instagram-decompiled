package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

public final class LHH {
    public static K1I parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            K1I k1i = new K1I();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if (DialogModule.KEY_ITEMS.equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1D(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    k1i.A01 = arrayList;
                } else if ("day_reel_info".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            L3L parseFromJson = C63055Kqk.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    k1i.A00 = arrayList;
                } else {
                    1XY.A01(r5, k1i, A17);
                }
                r5.A0z();
            }
            return k1i;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
