package X;

import com.instagram.api.schemas.GatingResponseType;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cyb  reason: case insensitive filesystem */
public abstract class C45563Cyb {
    public static C278074wE parseFromJson(16F r25) {
        String str;
        16F r4 = r25;
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayList2 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            GatingResponseType gatingResponseType = null;
            Long l = null;
            Integer num = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            Boolean bool = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("alert_buttons".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("alert_description".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r4.A1P();
                    }
                } else if ("alert_title".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r4.A1P();
                    }
                } else if ("blocks_logging_data".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r4.A1P();
                    }
                } else if ("buttons".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("center_button".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r4.A1P();
                    }
                } else if ("date_gated_formatted".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r4.A1P();
                    }
                } else if (C41845B3m.A1Q(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r4.A1P();
                    }
                } else if ("gating_type".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    gatingResponseType = (GatingResponseType) GatingResponseType.A01.get(str);
                    if (gatingResponseType == null) {
                        gatingResponseType = GatingResponseType.UNRECOGNIZED;
                    }
                } else if ("media_igid".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r4);
                } else if ("misinformation_type".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r4);
                } else if ("over_text".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r4.A1P();
                    }
                } else if ("post_reveal_cta".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r4.A1P();
                    }
                } else if (Dbk.A01(0, 10, 78).equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r4.A1P();
                    }
                } else if ("show_notice".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r4);
                } else if ("time_gated".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r4.A1P();
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r4.A1P();
                    }
                } else if ("under_text".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str13 = null;
                    } else {
                        str13 = r4.A1P();
                    }
                }
                r4.A0z();
            }
            return new C278074wE(gatingResponseType, bool, num, l, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r4, C278074wE r5) {
        r4.A0c();
        List list = r5.A0G;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r4, "alert_buttons", list);
            while (A0s.hasNext()) {
                C41846B3n.A18(r4, A0s);
            }
            r4.A0Y();
        }
        String str = r5.A04;
        if (str != null) {
            r4.A0R("alert_description", str);
        }
        String str2 = r5.A05;
        if (str2 != null) {
            r4.A0R("alert_title", str2);
        }
        String str3 = r5.A06;
        if (str3 != null) {
            r4.A0R("blocks_logging_data", str3);
        }
        List list2 = r5.A0H;
        if (list2 != null) {
            Iterator A0s2 = C41845B3m.A0s(r4, "buttons", list2);
            while (A0s2.hasNext()) {
                C41846B3n.A18(r4, A0s2);
            }
            r4.A0Y();
        }
        String str4 = r5.A07;
        if (str4 != null) {
            r4.A0R("center_button", str4);
        }
        String str5 = r5.A08;
        if (str5 != null) {
            r4.A0R("date_gated_formatted", str5);
        }
        String str6 = r5.A09;
        if (str6 != null) {
            r4.A0R(DevServerEntity.COLUMN_DESCRIPTION, str6);
        }
        GatingResponseType gatingResponseType = r5.A00;
        if (gatingResponseType != null) {
            r4.A0R("gating_type", gatingResponseType.A00);
        }
        Long l = r5.A03;
        if (l != null) {
            r4.A0Q("media_igid", l.longValue());
        }
        Integer num = r5.A02;
        if (num != null) {
            r4.A0P("misinformation_type", num.intValue());
        }
        String str7 = r5.A0A;
        if (str7 != null) {
            r4.A0R("over_text", str7);
        }
        String str8 = r5.A0B;
        if (str8 != null) {
            r4.A0R("post_reveal_cta", str8);
        }
        String str9 = r5.A0C;
        if (str9 != null) {
            r4.A0R(Dbk.A01(0, 10, 78), str9);
        }
        Boolean bool = r5.A01;
        if (bool != null) {
            r4.A0S("show_notice", bool.booleanValue());
        }
        String str10 = r5.A0D;
        if (str10 != null) {
            r4.A0R("time_gated", str10);
        }
        C41846B3n.A10(r4, r5.A0E);
        String str11 = r5.A0F;
        if (str11 != null) {
            r4.A0R("under_text", str11);
        }
        r4.A0Z();
    }
}
