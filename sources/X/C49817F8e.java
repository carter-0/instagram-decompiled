package X;

import com.instagram.api.schemas.ScreenTimeScreenType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.F8e  reason: case insensitive filesystem */
public final class C49817F8e {
    public static Dw2 parseFromJson(16F r5) {
        String str;
        0qQ.A0B(r5, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("aggregated_screen_time_per_day".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41847B3o.A1L(r5, arrayList);
                        }
                    }
                    r0.A02 = arrayList;
                } else if ("screen_time_by_screen_keys".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            if (r5.A11() == 16L.A0G) {
                                str = null;
                            } else {
                                str = r5.A1P();
                            }
                            ScreenTimeScreenType screenTimeScreenType = (ScreenTimeScreenType) ScreenTimeScreenType.A01.get(str);
                            if (screenTimeScreenType == null) {
                                screenTimeScreenType = ScreenTimeScreenType.A05;
                            }
                            A1C.add(screenTimeScreenType);
                        }
                        arrayList = A1C;
                    }
                    r0.A00 = arrayList;
                } else if ("screen_time_by_screen_values".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41847B3o.A1L(r5, arrayList);
                        }
                    }
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
