package X;

import com.instagram.api.schemas.BrandedContentGatingCountryMinimumAge;
import com.instagram.api.schemas.BrandedContentGatingCountryMinimumAgeImpl;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cxm  reason: case insensitive filesystem */
public abstract class C45512Cxm {
    public static BrandedContentGatingInfo parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            16L A11 = r10.A11();
            16L r2 = 16L.A0D;
            if (A11 != r2) {
                r10.A0z();
                return null;
            }
            HashMap hashMap = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            Integer num = null;
            String str = null;
            while (true) {
                16L A1J = r10.A1J();
                16L r3 = 16L.A09;
                if (A1J == r3) {
                    return new BrandedContentGatingInfo(num, str, hashMap, arrayList, arrayList2);
                }
                String A17 = AnonymousClass7TE.A17(r10);
                if ("country_age_data".equals(A17)) {
                    if (r10.A11() == r2) {
                        hashMap = AnonymousClass7TE.A1E();
                        while (r10.A1J() != r3) {
                            C41847B3o.A1N(r10, hashMap);
                        }
                    } else {
                        hashMap = null;
                    }
                } else if ("country_age_list".equals(A17)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r10.A1J() != 16L.A08) {
                            BrandedContentGatingCountryMinimumAgeImpl parseFromJson = CV6.parseFromJson(r10);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("country_block_data".equals(A17)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r10.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r10, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("default_age".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if ("selected_category".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                }
                r10.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r4, BrandedContentGatingInfo brandedContentGatingInfo) {
        r4.A0c();
        HashMap hashMap = brandedContentGatingInfo.A02;
        if (hashMap != null) {
            r4.A0q("country_age_data");
            r4.A0c();
            Iterator A0s = AnonymousClass7TF.A0s(hashMap);
            while (A0s.hasNext()) {
                Map.Entry entry = (Map.Entry) A0s.next();
                if (!16P.A04(r4, entry)) {
                    r4.A0g(AnonymousClass7TE.A0M(entry.getValue()));
                }
            }
            r4.A0Z();
        }
        List list = brandedContentGatingInfo.A03;
        if (list != null) {
            Iterator A0s2 = C41845B3m.A0s(r4, "country_age_list", list);
            while (A0s2.hasNext()) {
                BrandedContentGatingCountryMinimumAge brandedContentGatingCountryMinimumAge = (BrandedContentGatingCountryMinimumAge) A0s2.next();
                if (brandedContentGatingCountryMinimumAge != null) {
                    BrandedContentGatingCountryMinimumAgeImpl F0w = brandedContentGatingCountryMinimumAge.F0w();
                    r4.A0c();
                    String str = F0w.A01;
                    if (str != null) {
                        r4.A0R("country_code", str);
                    }
                    Integer num = F0w.A00;
                    if (num != null) {
                        r4.A0P("minimum_age", num.intValue());
                    }
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        List list2 = brandedContentGatingInfo.A04;
        if (list2 != null) {
            Iterator A0s3 = C41845B3m.A0s(r4, "country_block_data", list2);
            while (A0s3.hasNext()) {
                C41846B3n.A18(r4, A0s3);
            }
            r4.A0Y();
        }
        Integer num2 = brandedContentGatingInfo.A00;
        if (num2 != null) {
            r4.A0P("default_age", num2.intValue());
        }
        String str2 = brandedContentGatingInfo.A01;
        if (str2 != null) {
            r4.A0R("selected_category", str2);
        }
        r4.A0Z();
    }
}
