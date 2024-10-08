package X;

import com.instagram.clips.model.ClipsCreationToolsResponse$ContentFundingDeal;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.KrZ  reason: case insensitive filesystem */
public abstract class C63106KrZ {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.L7h, java.lang.Object] */
    public static C63801L7h parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("selected_deal_description".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r4);
                } else if ("selected_deal_program".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("is_selected_deal_bonus".equals(A17)) {
                    obj.A03 = r4.A0d();
                } else if ("deals".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            ClipsCreationToolsResponse$ContentFundingDeal parseFromJson = C63105KrY.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A02 = arrayList;
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
