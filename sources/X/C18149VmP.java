package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VmP  reason: case insensitive filesystem */
public final class C18149VmP {
    public static C15255UXp parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("has_next".equals(A17)) {
                    r0.A07 = r4.A0d();
                } else if ("has_created_lead_ad".equals(A17)) {
                    r0.A06 = r4.A0d();
                } else if ("error".equals(A17)) {
                    r0.A03 = C44284CcS.parseFromJson(r4);
                } else {
                    ArrayList arrayList = null;
                    if ("promotions".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C19176WOi parseFromJson = VAU.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        r0.A05 = arrayList;
                    } else if ("draft_promotions".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C19175WOh parseFromJson2 = VAN.parseFromJson(r4);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        r0.A04 = arrayList;
                    } else if ("total_promotions_for_section".equals(A17)) {
                        r0.A00 = r4.A1D();
                    } else if ("total_promotions_for_user".equals(A17)) {
                        r0.A01 = r4.A1D();
                    } else if ("total_unread_leads_count".equals(A17)) {
                        r0.A02 = r4.A1D();
                    } else {
                        1XY.A01(r4, r0, A17);
                    }
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
