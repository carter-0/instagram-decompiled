package X;

import java.io.IOException;
import java.util.ArrayList;

public final class D1Y {
    public static CGD parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            CGD cgd = new CGD();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if (C41845B3m.A19(A17)) {
                    cgd.A08 = AnonymousClass7TG.A0l(r4);
                } else if ("media_count".equals(A17)) {
                    cgd.A01 = r4.A1D();
                } else if ("formatted_media_count".equals(A17)) {
                    cgd.A06 = AnonymousClass7TG.A0l(r4);
                } else if (C41845B3m.A17(A17)) {
                    cgd.A07 = AnonymousClass7TG.A0l(r4);
                } else {
                    if ("profile_pic_url".equals(A17)) {
                        if (r4.A11() == 16L.A0G) {
                        }
                    } else if ("following".equals(A17)) {
                        cgd.A00 = r4.A1D();
                    } else if ("allow_following".equals(A17)) {
                        cgd.A0B = r4.A0d();
                    } else if ("allow_muting_story".equals(A17)) {
                        cgd.A0C = r4.A0d();
                    } else if ("non_violating".equals(A17)) {
                        cgd.A0F = r4.A0d();
                    } else if (C41845B3m.A1L(A17)) {
                        if (r4.A11() == 16L.A0G) {
                        }
                    } else if ("social_context_profile_links".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                C253813rS parseFromJson = C253803rR.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        cgd.A0A = arrayList;
                    } else if ("social_context_facepile_users".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                C41846B3n.A1E(r4, arrayList);
                            }
                        }
                        cgd.A09 = arrayList;
                    } else if ("follow_button_text".equals(A17)) {
                        cgd.A05 = AnonymousClass7TG.A0l(r4);
                    } else if ("show_follow_drop_down".equals(A17)) {
                        cgd.A0G = r4.A0d();
                    } else if (C41845B3m.A1Q(A17)) {
                        if (r4.A11() == 16L.A0G) {
                        }
                    } else if ("destination_info".equals(A17)) {
                        cgd.A02 = C44863CmE.parseFromJson(r4);
                    } else if (C273654mx.A00(2914).equals(A17)) {
                        cgd.A0E = r4.A0d();
                    } else if ("fresh_topic_metadata".equals(A17)) {
                        cgd.A03 = C44864CmF.parseFromJson(r4);
                    } else if ("promo_banner".equals(A17)) {
                        cgd.A04 = C44865CmG.parseFromJson(r4);
                    } else if (C273654mx.A00(2447).equals(A17)) {
                        cgd.A0D = r4.A0d();
                    } else {
                        1XY.A01(r4, cgd, A17);
                    }
                    r4.A1P();
                }
                r4.A0z();
            }
            return cgd;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
