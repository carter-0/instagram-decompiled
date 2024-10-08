package X;

import com.instagram.api.schemas.InstagramProfileCallToActionDestinations;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class V84 {
    public static C59721JVf parseFromJson(16F r8) {
        String str;
        String str2;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("eligible_ctas".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r8.A1J() != 16L.A08) {
                            if (r8.A11() == 16L.A0G) {
                                str2 = null;
                            } else {
                                str2 = r8.A1P();
                            }
                            InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations = (InstagramProfileCallToActionDestinations) InstagramProfileCallToActionDestinations.A01.get(str2);
                            if (instagramProfileCallToActionDestinations == null) {
                                instagramProfileCallToActionDestinations = InstagramProfileCallToActionDestinations.UNRECOGNIZED;
                            }
                            arrayList.add(instagramProfileCallToActionDestinations);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("enabled_ctas".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r8.A1J() != 16L.A08) {
                            if (r8.A11() == 16L.A0G) {
                                str = null;
                            } else {
                                str = r8.A1P();
                            }
                            InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations2 = (InstagramProfileCallToActionDestinations) InstagramProfileCallToActionDestinations.A01.get(str);
                            if (instagramProfileCallToActionDestinations2 == null) {
                                instagramProfileCallToActionDestinations2 = InstagramProfileCallToActionDestinations.UNRECOGNIZED;
                            }
                            arrayList2.add(instagramProfileCallToActionDestinations2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                r8.A0z();
            }
            if (arrayList == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("eligible_ctas", r8, "ProfileSecondaryCallToActionInfo");
            } else if (arrayList2 != null || !(r8 instanceof 0c9)) {
                return new C59721JVf((List) arrayList, (List) arrayList2, 15);
            } else {
                AnonymousClass7TF.A1L("enabled_ctas", r8, "ProfileSecondaryCallToActionInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
