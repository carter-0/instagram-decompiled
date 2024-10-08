package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HwD  reason: case insensitive filesystem */
public final class C56300HwD {
    public static C54066Gyp parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("earliest_request_position".equals(A17)) {
                    r0.A00 = AnonymousClass7TF.A0X(r5);
                } else if ("ads_pool_threshold_for_next_request".equals(A17)) {
                    r5.A1D();
                } else if ("injected_medias".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C55627Hkm parseFromJson = C54967HZx.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r0.A01 = arrayList;
                } else {
                    1XY.A01(r5, r0, A17);
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
