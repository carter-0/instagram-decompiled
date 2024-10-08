package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CYO {
    public static BBH parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            Long l = null;
            C42044BEx bEx = null;
            String str = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            String str2 = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("attachment".equals(A17)) {
                    bEx = CYL.parseFromJson(r13);
                } else if (C41845B3m.A1Q(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r13);
                } else if ("media_items".equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            C41846B3n.A1D(r13, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("mixed_media_items".equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            BIR parseFromJson = D1H.parseFromJson(r13);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                }
                r13.A0z();
            }
            if (l == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r13, "GuideItem");
            } else if (arrayList != null || !(r13 instanceof 0c9)) {
                return new BBH(bEx, str, str2, arrayList, arrayList2, l.longValue());
            } else {
                AnonymousClass7TF.A1L("media_items", r13, "GuideItem");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
