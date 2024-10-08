package X;

import com.instagram.api.schemas.BwPIconOverlayType;
import com.instagram.api.schemas.BwPPostClickLandingExperineceType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.RgK  reason: case insensitive filesystem */
public abstract /* synthetic */ class C9762RgK {
    public static Map A00(C13902TjP tjP) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (tjP.B7k() != null) {
            A1H.put(AnonymousClass000.A00(1374), tjP.B7k());
        }
        String str = null;
        if (tjP.BEH() != null) {
            List<BwPIconOverlayType> BEH = tjP.BEH();
            if (BEH != null) {
                arrayList = AnonymousClass7TG.A0r(BEH);
                for (BwPIconOverlayType bwPIconOverlayType : BEH) {
                    0qQ.A0B(bwPIconOverlayType, 0);
                    arrayList.add(bwPIconOverlayType.A00);
                }
            } else {
                arrayList = null;
            }
            A1H.put("icon_overlays", arrayList);
        }
        if (tjP.Be0() != null) {
            BwPPostClickLandingExperineceType Be0 = tjP.Be0();
            if (Be0 != null) {
                str = Be0.A00;
            }
            A1H.put("post_click_landing_experience", str);
        }
        if (tjP.Be1() != null) {
            A1H.put("post_click_url", tjP.Be1());
        }
        if (tjP.Bfb() != null) {
            A1H.put("primary_text", tjP.Bfb());
        }
        if (tjP.getSecondaryText() != null) {
            A1H.put("secondary_text", tjP.getSecondaryText());
        }
        return 0Yt.A0B(A1H);
    }
}
