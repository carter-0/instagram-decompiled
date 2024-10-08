package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cz8  reason: case insensitive filesystem */
public final class C45596Cz8 {
    public static CEZ parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("incentive_platform_onboarding_config".equals(A17)) {
                    r1.A00 = C44190CZd.parseFromJson(r7);
                } else {
                    ArrayList arrayList = null;
                    if ("next_steps".equals(A17)) {
                        if (r7.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r7.A1J() != 16L.A08) {
                                C47208Dsv parseFromJson = C48342Ecz.parseFromJson(r7);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        r1.A05 = arrayList;
                    } else if ("product_config".equals(A17)) {
                        r1.A02 = Cb6.parseFromJson(r7);
                    } else if ("product_type".equals(A17)) {
                        r1.A04 = C272504kq.A00(AnonymousClass7TG.A0l(r7));
                    } else if ("revshare_onboarding_config".equals(A17)) {
                        r1.A03 = C44321Cd3.parseFromJson(r7);
                    } else {
                        1XY.A01(r7, r1, A17);
                    }
                }
                r7.A0z();
            }
            C61084JwM jwM = r1.A00;
            List list = r1.A05;
            0qQ.A0A(list);
            Cb5 cb5 = r1.A02;
            UserMonetizationProductType userMonetizationProductType = r1.A04;
            0qQ.A0A(userMonetizationProductType);
            r1.A01 = new C47155DrW(jwM, cb5, r1.A03, userMonetizationProductType, list);
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
