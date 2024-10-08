package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3ko  reason: invalid class name and case insensitive filesystem */
public abstract class C250043ko {
    public static C233492vo parseFromJson(16F r22) {
        16F r3 = r22;
        0qQ.A0B(r3, 0);
        try {
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            ArrayList arrayList = null;
            Integer num4 = null;
            Integer num5 = null;
            Boolean bool = null;
            Integer num6 = null;
            Integer num7 = null;
            Integer num8 = null;
            Integer num9 = null;
            Integer num10 = null;
            C250533lb r5 = null;
            Integer num11 = null;
            Integer num12 = null;
            Integer num13 = null;
            Integer num14 = null;
            Float f = null;
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("carry_over_highest_position_rule".equals(A0q)) {
                    num = Integer.valueOf(r3.A1D());
                } else if ("consumed_media_gap_to_previous_ad".equals(A0q)) {
                    num2 = Integer.valueOf(r3.A1D());
                } else if ("consumed_media_gap_to_previous_netego".equals(A0q)) {
                    num3 = Integer.valueOf(r3.A1D());
                } else if ("dnf".equals(A0q)) {
                    if (r3.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r3.A1J() != 16L.A08) {
                            C42142BIx parseFromJson = C45096CqE.parseFromJson(r3);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("highest_ad_position_rule_value".equals(A0q)) {
                    num4 = Integer.valueOf(r3.A1D());
                } else if ("highest_position_rule".equals(A0q)) {
                    num5 = Integer.valueOf(r3.A1D());
                } else if ("is_media_based_hp_enabled".equals(A0q)) {
                    bool = Boolean.valueOf(r3.A0d());
                } else if ("max_reel_gap_to_previous_item".equals(A0q)) {
                    num6 = Integer.valueOf(r3.A1D());
                } else if ("min_container_gap_to_previous_ad".equals(A0q)) {
                    num7 = Integer.valueOf(r3.A1D());
                } else if ("min_container_gap_to_previous_overlay_ad".equals(A0q)) {
                    num8 = Integer.valueOf(r3.A1D());
                } else if ("min_media_gap_to_previous_item".equals(A0q)) {
                    num9 = Integer.valueOf(r3.A1D());
                } else if ("pool_refresh_ttl_in_sec".equals(A0q)) {
                    num10 = Integer.valueOf(r3.A1D());
                } else if ("push_up_client_gap_rules".equals(A0q)) {
                    r5 = C250523la.parseFromJson(r3);
                } else if ("reel_gap_to_previous_ad".equals(A0q)) {
                    num11 = Integer.valueOf(r3.A1D());
                } else if ("reel_gap_to_previous_netego".equals(A0q)) {
                    num12 = Integer.valueOf(r3.A1D());
                } else if ("self_pog_chaining_highest_position_rule".equals(A0q)) {
                    num13 = Integer.valueOf(r3.A1D());
                } else if ("target_insertion_position".equals(A0q)) {
                    num14 = Integer.valueOf(r3.A1D());
                } else if ("time_gap_to_previous_item_in_sec".equals(A0q)) {
                    f = new Float(r3.A0U());
                }
                r3.A0z();
            }
            return new C233492vo(r5, bool, f, num, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, num14, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r5, C233492vo r6) {
        r5.A0c();
        Integer num = r6.A03;
        if (num != null) {
            r5.A0P("carry_over_highest_position_rule", num.intValue());
        }
        Integer num2 = r6.A04;
        if (num2 != null) {
            r5.A0P("consumed_media_gap_to_previous_ad", num2.intValue());
        }
        Integer num3 = r6.A05;
        if (num3 != null) {
            r5.A0P("consumed_media_gap_to_previous_netego", num3.intValue());
        }
        List<C42142BIx> list = r6.A0H;
        if (list != null) {
            16P.A03(r5, "dnf");
            for (C42142BIx bIx : list) {
                if (bIx != null) {
                    r5.A0c();
                    List<C42143BIy> list2 = bIx.A00;
                    if (list2 != null) {
                        16P.A03(r5, "exp");
                        for (C42143BIy bIy : list2) {
                            if (bIy != null) {
                                r5.A0c();
                                Integer num4 = bIy.A01;
                                if (num4 != null) {
                                    r5.A0P("op", num4.intValue());
                                }
                                Integer num5 = bIy.A02;
                                if (num5 != null) {
                                    r5.A0P("p", num5.intValue());
                                }
                                Float f = bIy.A00;
                                if (f != null) {
                                    r5.A0O("v", f.floatValue());
                                }
                                r5.A0Z();
                            }
                        }
                        r5.A0Y();
                    }
                    r5.A0Z();
                }
            }
            r5.A0Y();
        }
        Integer num6 = r6.A06;
        if (num6 != null) {
            r5.A0P("highest_ad_position_rule_value", num6.intValue());
        }
        Integer num7 = r6.A07;
        if (num7 != null) {
            r5.A0P("highest_position_rule", num7.intValue());
        }
        Boolean bool = r6.A01;
        if (bool != null) {
            r5.A0S("is_media_based_hp_enabled", bool.booleanValue());
        }
        Integer num8 = r6.A08;
        if (num8 != null) {
            r5.A0P("max_reel_gap_to_previous_item", num8.intValue());
        }
        Integer num9 = r6.A09;
        if (num9 != null) {
            r5.A0P("min_container_gap_to_previous_ad", num9.intValue());
        }
        Integer num10 = r6.A0A;
        if (num10 != null) {
            r5.A0P("min_container_gap_to_previous_overlay_ad", num10.intValue());
        }
        Integer num11 = r6.A0B;
        if (num11 != null) {
            r5.A0P("min_media_gap_to_previous_item", num11.intValue());
        }
        Integer num12 = r6.A0C;
        if (num12 != null) {
            r5.A0P("pool_refresh_ttl_in_sec", num12.intValue());
        }
        C67241sS r1 = r6.A00;
        if (r1 != null) {
            r5.A0q("push_up_client_gap_rules");
            C250523la.A00(r5, r1.F8M());
        }
        Integer num13 = r6.A0D;
        if (num13 != null) {
            r5.A0P("reel_gap_to_previous_ad", num13.intValue());
        }
        Integer num14 = r6.A0E;
        if (num14 != null) {
            r5.A0P("reel_gap_to_previous_netego", num14.intValue());
        }
        Integer num15 = r6.A0F;
        if (num15 != null) {
            r5.A0P("self_pog_chaining_highest_position_rule", num15.intValue());
        }
        Integer num16 = r6.A0G;
        if (num16 != null) {
            r5.A0P("target_insertion_position", num16.intValue());
        }
        Float f2 = r6.A02;
        if (f2 != null) {
            r5.A0O("time_gap_to_previous_item_in_sec", f2.floatValue());
        }
        r5.A0Z();
    }
}
