package X;

import java.io.IOException;
import java.util.ArrayList;

public final class D2B {
    public static CGY parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("active_fundraiser_sections".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C43855CFv parseFromJson = C44970Co9.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r0.A02 = arrayList;
                } else if ("searched_charities_section_title".equals(A17)) {
                    r0.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("nullstate_charities_sections".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C43856CFw parseFromJson2 = C44971CoA.parseFromJson(r4);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    r0.A03 = arrayList;
                } else if ("followed_charities".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1E(r4, arrayList);
                        }
                    }
                    r0.A04 = arrayList;
                } else if ("suggested_charities".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1E(r4, arrayList);
                        }
                    }
                    r0.A06 = arrayList;
                } else if ("searched_charities".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1E(r4, arrayList);
                        }
                    }
                    r0.A05 = arrayList;
                } else if (C41845B3m.A1H(A17)) {
                    r0.A00 = AnonymousClass7TG.A0l(r4);
                } else if ("is_more_available".equals(A17)) {
                    r0.A07 = r4.A0d();
                } else {
                    1XY.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
