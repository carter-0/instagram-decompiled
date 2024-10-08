package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3la  reason: invalid class name and case insensitive filesystem */
public abstract class C250523la {
    public static C250533lb parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            Boolean bool = null;
            Double d = null;
            String str = null;
            String str2 = null;
            Double d2 = null;
            String str3 = null;
            Double d3 = null;
            ArrayList arrayList = null;
            while (r11.A1J() != 16L.A09) {
                String A0q = r11.A0q();
                r11.A1J();
                if ("enable_user_engagement_base_insertion".equals(A0q)) {
                    bool = Boolean.valueOf(r11.A0d());
                } else if ("max_xout_prediction_threshold".equals(A0q)) {
                    d = Double.valueOf(r11.A0U());
                } else if ("post_gap_to_previous_ad".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("post_gap_to_previous_netego".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if ("predicted_xout_rate".equals(A0q)) {
                    d2 = Double.valueOf(r11.A0U());
                } else if ("push_up_min_gap".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if ("time_based_insertion_gap_in_seconds".equals(A0q)) {
                    d3 = Double.valueOf(r11.A0U());
                } else if ("user_engagement_based_insertion_settings".equals(A0q)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r11.A1J() != 16L.A08) {
                            BI7 parseFromJson = C44564Cgy.parseFromJson(r11);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r11.A0z();
            }
            return new C250533lb(bool, d, d2, d3, str, str2, str3, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r6, C250533lb r7) {
        r6.A0c();
        Boolean bool = r7.A00;
        if (bool != null) {
            r6.A0S("enable_user_engagement_base_insertion", bool.booleanValue());
        }
        Double d = r7.A01;
        if (d != null) {
            r6.A0N("max_xout_prediction_threshold", d.doubleValue());
        }
        String str = r7.A04;
        if (str != null) {
            r6.A0R("post_gap_to_previous_ad", str);
        }
        String str2 = r7.A05;
        if (str2 != null) {
            r6.A0R("post_gap_to_previous_netego", str2);
        }
        Double d2 = r7.A02;
        if (d2 != null) {
            r6.A0N("predicted_xout_rate", d2.doubleValue());
        }
        String str3 = r7.A06;
        if (str3 != null) {
            r6.A0R("push_up_min_gap", str3);
        }
        Double d3 = r7.A03;
        if (d3 != null) {
            r6.A0N("time_based_insertion_gap_in_seconds", d3.doubleValue());
        }
        List<BI7> list = r7.A07;
        if (list != null) {
            16P.A03(r6, "user_engagement_based_insertion_settings");
            for (BI7 bi7 : list) {
                if (bi7 != null) {
                    r6.A0c();
                    List<BI8> list2 = bi7.A01;
                    if (list2 != null) {
                        16P.A03(r6, AnonymousClass000.A00(1297));
                        for (BI8 bi8 : list2) {
                            if (bi8 != null) {
                                r6.A0c();
                                String str4 = bi8.A01;
                                if (str4 != null) {
                                    r6.A0R(AnonymousClass000.A00(1822), str4);
                                }
                                String str5 = bi8.A02;
                                if (str5 != null) {
                                    r6.A0R("signal_type", str5);
                                }
                                Double d4 = bi8.A00;
                                if (d4 != null) {
                                    r6.A0N("time_based_insertion_gap_in_seconds", d4.doubleValue());
                                }
                                r6.A0Z();
                            }
                        }
                        r6.A0Y();
                    }
                    String str6 = bi7.A00;
                    if (str6 != null) {
                        r6.A0R(AnonymousClass000.A00(1600), str6);
                    }
                    r6.A0Z();
                }
            }
            r6.A0Y();
        }
        r6.A0Z();
    }
}
