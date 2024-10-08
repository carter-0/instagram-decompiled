package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cas  reason: case insensitive filesystem */
public abstract class C44231Cas {
    public static C42053BFg parseFromJson(16F r30) {
        16F r1 = r30;
        0qQ.A0B(r1, 0);
        try {
            Boolean bool = null;
            if (r1.A11() != 16L.A0D) {
                r1.A0z();
                return null;
            }
            Long l = null;
            1Xj r14 = null;
            Long l2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            C233492vo r15 = null;
            ArrayList arrayList = null;
            Boolean bool2 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            C41936B7n b7n = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            while (r1.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r1);
                if ("background_media".equals(A17)) {
                    r14 = 1Xj.A00(r1);
                } else if ("brs_threshold".equals(A17)) {
                    l2 = AnonymousClass7TF.A0Z(r1);
                } else if ("button_bloks_action".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r1.A1P();
                    }
                } else if ("button_bloks_params".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r1.A1P();
                    }
                } else if ("button_text".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r1.A1P();
                    }
                } else if ("client_gap_rules".equals(A17)) {
                    r15 = C250043ko.parseFromJson(r1);
                } else if ("clips".equals(A17)) {
                    if (r1.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r1.A1J() != 16L.A08) {
                            C41846B3n.A1F(r1, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("has_dismiss".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r1);
                } else if ("has_dismiss_v2".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r1);
                } else if ("icon_url".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r1.A1P();
                    }
                } else if ("item_type".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r1);
                } else if ("media_id".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r1.A1P();
                    }
                } else if (DialogModule.KEY_MESSAGE.equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r1.A1P();
                    }
                } else if ("netego_service_client_dict".equals(A17)) {
                    b7n = C44232Cat.parseFromJson(r1);
                } else if ("netego_type".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r1.A1P();
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r1.A1P();
                    }
                } else if ("tracking_token".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r1.A1P();
                    }
                }
                r1.A0z();
            }
            if (r15 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("client_gap_rules", r1, "NetEgoMediaItem");
            } else if (bool == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("has_dismiss_v2", r1, "NetEgoMediaItem");
            } else if (l == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("item_type", r1, "NetEgoMediaItem");
            } else if (str5 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("media_id", r1, "NetEgoMediaItem");
            } else if (str7 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("netego_type", r1, "NetEgoMediaItem");
            } else if (str9 != null || !(r1 instanceof 0c9)) {
                return new C42053BFg(b7n, r14, r15, bool2, l2, str, str2, str3, str4, str5, str6, str7, str8, str9, arrayList, l.longValue(), bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("tracking_token", r1, "NetEgoMediaItem");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
