package X;

import java.io.IOException;

/* renamed from: X.Nrc  reason: case insensitive filesystem */
public abstract class C69753Nrc {
    public static C15033UKm parseFromJson(16F r25) {
        16F r9 = r25;
        0qQ.A0B(r9, 0);
        try {
            Boolean bool = null;
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            Float f = null;
            Float f2 = null;
            Float f3 = null;
            C70645OEr oEr = null;
            Float f4 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("is_nearby".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r9);
                } else if ("map_response".equals(A17)) {
                    oEr = C69750NrZ.parseFromJson(r9);
                } else if ("mapview_bottom_lat".equals(A17)) {
                    f = AnonymousClass7TF.A0V(r9);
                } else if ("mapview_display_name".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("mapview_left_lng".equals(A17)) {
                    f2 = AnonymousClass7TF.A0V(r9);
                } else if ("mapview_query_type".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if ("mapview_query_value".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r9.A1P();
                    }
                } else if ("mapview_right_lng".equals(A17)) {
                    f3 = AnonymousClass7TF.A0V(r9);
                } else if ("mapview_top_lat".equals(A17)) {
                    f4 = AnonymousClass7TF.A0V(r9);
                } else if ("typecode".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (bool == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_nearby", r9, "PlacesHCMData");
            } else if (oEr == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("map_response", r9, "PlacesHCMData");
            } else if (f == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("mapview_bottom_lat", r9, "PlacesHCMData");
            } else if (f2 == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("mapview_left_lng", r9, "PlacesHCMData");
            } else if (f3 == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("mapview_right_lng", r9, "PlacesHCMData");
            } else if (f4 == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("mapview_top_lat", r9, "PlacesHCMData");
            } else if (str4 != null || !(r9 instanceof 0c9)) {
                return new C15033UKm(oEr, str, str2, str3, str4, f.floatValue(), f2.floatValue(), f3.floatValue(), f4.floatValue(), bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("typecode", r9, "PlacesHCMData");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
