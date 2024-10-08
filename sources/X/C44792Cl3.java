package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cl3  reason: case insensitive filesystem */
public abstract class C44792Cl3 {
    public static C45382CvO parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45382CvO cvO = new C45382CvO();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("advertiser_privacy_policy_name".equals(A17)) {
                    cvO.A00 = AnonymousClass7TG.A0l(r4);
                } else if ("disclaimer_title".equals(A17)) {
                    cvO.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("checkboxes".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C45381CvN parseFromJson = C44788Ckz.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    cvO.A02 = arrayList;
                } else if ("disclaimer_body".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C45296Ctz parseFromJson2 = C44791Cl2.parseFromJson(r4);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    cvO.A03 = arrayList;
                }
                r4.A0z();
            }
            return cvO;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
