package X;

import com.instagram.api.schemas.ReelsMediaInteractivityType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.B7r  reason: case insensitive filesystem */
public abstract class C41940B7r {
    public static C41937B7o parseFromJson(16F r10) {
        String str;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Boolean bool = null;
            String str2 = null;
            Integer num = null;
            String str3 = null;
            ArrayList arrayList = null;
            while (r10.A1J() != 16L.A09) {
                String A0q = r10.A0q();
                r10.A1J();
                if ("display_uri".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("duration_in_ms".equals(A0q)) {
                    num = Integer.valueOf(r10.A1D());
                } else if ("headline".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                } else if ("is_eligible_for_tappable_tooltip".equals(A0q)) {
                    bool = Boolean.valueOf(r10.A0d());
                } else if ("media_interactivity_types".equals(A0q)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r10.A1J() != 16L.A08) {
                            if (r10.A11() == 16L.A0G) {
                                str = null;
                            } else {
                                str = r10.A1P();
                            }
                            ReelsMediaInteractivityType reelsMediaInteractivityType = (ReelsMediaInteractivityType) ReelsMediaInteractivityType.A01.get(str);
                            if (reelsMediaInteractivityType == null) {
                                reelsMediaInteractivityType = ReelsMediaInteractivityType.UNRECOGNIZED;
                            }
                            arrayList.add(reelsMediaInteractivityType);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r10.A0z();
            }
            if (bool != null || !(r10 instanceof 0c9)) {
                return new C41937B7o(num, str2, str3, arrayList, bool.booleanValue());
            }
            AnonymousClass7TF.A1L("is_eligible_for_tappable_tooltip", r10, "ReelsTappableTooltipImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
