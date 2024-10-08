package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.OQb  reason: case insensitive filesystem */
public final class C70884OQb {
    public static NH7 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            NH7 nh7 = new NH7();
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
                            C70825OMx parseFromJson = O0K.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    nh7.A00 = arrayList;
                } else if (AnonymousClass000.A00(5069).equals(A17)) {
                    nh7.A01 = r5.A0d();
                } else if ("epoch_derivation_set".equals(A17)) {
                    C41846B3n.A1A(r5);
                } else {
                    1XY.A01(r5, nh7, A17);
                }
                r5.A0z();
            }
            return nh7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
