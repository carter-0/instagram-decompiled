package X;

import java.io.IOException;
import java.util.ArrayList;

public final class LK6 {
    public static C61289K1a parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("comments".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            M0V parseFromJson = C63476Kxf.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r1.A04 = arrayList;
                } else if ("system_comments".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            M0U parseFromJson2 = C63479Kxi.parseFromJson(r4);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    r1.A05 = arrayList;
                } else if (AnonymousClass000.A00(140).equals(A17)) {
                    r4.A1D();
                } else if ("pinned_comment".equals(A17)) {
                    r1.A03 = C63476Kxf.parseFromJson(r4);
                } else if ("live_seconds_per_comment".equals(A17)) {
                    r1.A00 = r4.A1D();
                } else if ("comment_muted".equals(A17)) {
                    r1.A08 = r4.A0d();
                } else if (C273654mx.A00(2951).equals(A17)) {
                    r1.A09 = r4.A0d();
                } else if ("user_pay_supporters_info".equals(A17)) {
                    r1.A01 = C63480Kxj.parseFromJson(r4);
                } else if ("join_request_counts".equals(A17)) {
                    r1.A02 = LK7.parseFromJson(r4);
                } else if ("visible_comments".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            M0V parseFromJson3 = C63476Kxf.parseFromJson(r4);
                            if (parseFromJson3 != null) {
                                arrayList.add(parseFromJson3);
                            }
                        }
                    }
                    r1.A06 = arrayList;
                } else if ("visible_comments_like_info".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            M0V parseFromJson4 = C63476Kxf.parseFromJson(r4);
                            if (parseFromJson4 != null) {
                                arrayList.add(parseFromJson4);
                            }
                        }
                    }
                    r1.A07 = arrayList;
                } else {
                    1XY.A01(r4, r1, A17);
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
