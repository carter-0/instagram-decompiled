package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VnW  reason: case insensitive filesystem */
public abstract class C18206VnW {
    public static WXZ parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            WXZ wxz = new WXZ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("branch_default_page_index".equals(A17)) {
                    wxz.A00 = r4.A1D();
                } else if ("branch_subquestion_index_int".equals(A17)) {
                    wxz.A01 = r4.A1D();
                } else if ("direct_next_page_index_int".equals(A17)) {
                    wxz.A02 = r4.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("branch_question_id".equals(A17)) {
                        wxz.A04 = AnonymousClass7TG.A0l(r4);
                    } else if ("node_type".equals(A17)) {
                        wxz.A05 = AnonymousClass7TG.A0l(r4);
                    } else if ("composite_control_node".equals(A17)) {
                        wxz.A03 = C18208VnY.parseFromJson(r4);
                    } else if ("random_next_page_indices".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                Integer A0X = AnonymousClass7TF.A0X(r4);
                                if (A0X != null) {
                                    arrayList.add(A0X);
                                }
                            }
                        }
                        wxz.A08 = arrayList;
                    } else if ("branch_response_maps".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C17350VSd parseFromJson = C16997VDx.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        wxz.A06 = arrayList;
                    } else if ("composite_page_nodes".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                WXY parseFromJson2 = C18208VnY.parseFromJson(r4);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        wxz.A07 = arrayList;
                    }
                }
                r4.A0z();
            }
            return wxz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r4, WXZ wxz) {
        r4.A0c();
        r4.A0P("branch_default_page_index", wxz.A00);
        r4.A0P("branch_subquestion_index_int", wxz.A01);
        r4.A0P("direct_next_page_index_int", wxz.A02);
        String str = wxz.A04;
        if (str != null) {
            r4.A0R("branch_question_id", str);
        }
        String str2 = wxz.A05;
        if (str2 != null) {
            r4.A0R("node_type", str2);
        }
        if (wxz.A03 != null) {
            r4.A0q("composite_control_node");
            C18208VnY.A00(r4, wxz.A03);
        }
        if (wxz.A08 != null) {
            16P.A03(r4, "random_next_page_indices");
            for (Number number : wxz.A08) {
                if (number != null) {
                    r4.A0g(number.intValue());
                }
            }
            r4.A0Y();
        }
        if (wxz.A06 != null) {
            16P.A03(r4, "branch_response_maps");
            for (C17350VSd vSd : wxz.A06) {
                if (vSd != null) {
                    r4.A0c();
                    r4.A0P("page_index", vSd.A00);
                    r4.A0P("response_option_numeric_value", vSd.A01);
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        if (wxz.A07 != null) {
            16P.A03(r4, "composite_page_nodes");
            for (WXY wxy : wxz.A07) {
                if (wxy != null) {
                    C18208VnY.A00(r4, wxy);
                }
            }
            r4.A0Y();
        }
        r4.A0Z();
    }
}
