package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VnY  reason: case insensitive filesystem */
public abstract class C18208VnY {
    public static WXY parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            WXY wxy = new WXY();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("branch_default_page_index".equals(A17)) {
                    wxy.A00 = r4.A1D();
                } else if ("branch_subquestion_index_int".equals(A17)) {
                    wxy.A01 = r4.A1D();
                } else if ("direct_next_page_index_int".equals(A17)) {
                    wxy.A02 = r4.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("branch_question_id".equals(A17)) {
                        wxy.A03 = AnonymousClass7TG.A0l(r4);
                    } else if ("node_type".equals(A17)) {
                        wxy.A04 = AnonymousClass7TG.A0l(r4);
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
                        wxy.A06 = arrayList;
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
                        wxy.A05 = arrayList;
                    }
                }
                r4.A0z();
            }
            return wxy;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r4, WXY wxy) {
        r4.A0c();
        r4.A0P("branch_default_page_index", wxy.A00);
        r4.A0P("branch_subquestion_index_int", wxy.A01);
        r4.A0P("direct_next_page_index_int", wxy.A02);
        String str = wxy.A03;
        if (str != null) {
            r4.A0R("branch_question_id", str);
        }
        String str2 = wxy.A04;
        if (str2 != null) {
            r4.A0R("node_type", str2);
        }
        if (wxy.A06 != null) {
            16P.A03(r4, "random_next_page_indices");
            for (Number number : wxy.A06) {
                if (number != null) {
                    r4.A0g(number.intValue());
                }
            }
            r4.A0Y();
        }
        if (wxy.A05 != null) {
            16P.A03(r4, "branch_response_maps");
            for (C17350VSd vSd : wxy.A05) {
                if (vSd != null) {
                    r4.A0c();
                    r4.A0P("page_index", vSd.A00);
                    r4.A0P("response_option_numeric_value", vSd.A01);
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        r4.A0Z();
    }
}
