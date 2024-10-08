package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

public final class SAH {
    public static C8745R7j parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C8745R7j r7j = new C8745R7j();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (DialogModule.KEY_ITEMS.equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            1Xx parseFromJson = AnonymousClass1Xw.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r7j.A01 = arrayList;
                } else if ("metadata".equals(A17)) {
                    r7j.A00 = AnonymousClass55P.parseFromJson(r5);
                } else {
                    1XY.A01(r5, r7j, A17);
                }
                r5.A0z();
            }
            return r7j;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
