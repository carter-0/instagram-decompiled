package X;

import com.instagram.model.shopping.productfeed.MultiProductComponent;
import java.io.IOException;
import java.util.ArrayList;

public final class D2X {
    public static CG7 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            CG7 cg7 = new CG7();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("merchant_bag_infos".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C45393CvZ parseFromJson = C45056CpZ.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cg7.A02 = arrayList;
                } else if ("bags".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C18622VvF parseFromJson2 = VH8.parseFromJson(r5);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cg7.A01 = arrayList;
                } else if (AnonymousClass000.A00(3781).equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            MultiProductComponent parseFromJson3 = VF1.parseFromJson(r5);
                            if (parseFromJson3 != null) {
                                arrayList.add(parseFromJson3);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cg7.A03 = arrayList;
                } else if (AnonymousClass000.A00(639).equals(A17)) {
                    cg7.A00 = C63336KvJ.parseFromJson(r5);
                } else {
                    1XY.A01(r5, cg7, A17);
                }
                r5.A0z();
            }
            return cg7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
