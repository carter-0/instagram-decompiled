package X;

import com.instagram.api.schemas.BwPIconOverlayType;
import com.instagram.api.schemas.BwPPostClickLandingExperineceType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.RgL  reason: case insensitive filesystem */
public abstract class C9763RgL {
    public static QPb parseFromJson(16F r9) {
        String str;
        String str2;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str3 = null;
            ArrayList arrayList = null;
            BwPPostClickLandingExperineceType bwPPostClickLandingExperineceType = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if (AnonymousClass000.A00(1374).equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r9.A1P();
                    }
                } else if ("icon_overlays".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            if (r9.A11() == 16L.A0G) {
                                str2 = null;
                            } else {
                                str2 = r9.A1P();
                            }
                            BwPIconOverlayType bwPIconOverlayType = (BwPIconOverlayType) BwPIconOverlayType.A01.get(str2);
                            if (bwPIconOverlayType == null) {
                                bwPIconOverlayType = BwPIconOverlayType.UNRECOGNIZED;
                            }
                            arrayList.add(bwPIconOverlayType);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("post_click_landing_experience".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                    bwPPostClickLandingExperineceType = (BwPPostClickLandingExperineceType) BwPPostClickLandingExperineceType.A01.get(str);
                    if (bwPPostClickLandingExperineceType == null) {
                        bwPPostClickLandingExperineceType = BwPPostClickLandingExperineceType.UNRECOGNIZED;
                    }
                } else if ("post_click_url".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r9.A1P();
                    }
                } else if ("primary_text".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r9.A1P();
                    }
                } else if ("secondary_text".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            return new QPb(bwPPostClickLandingExperineceType, str3, str4, str5, str6, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
