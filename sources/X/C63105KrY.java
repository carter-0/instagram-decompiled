package X;

import com.instagram.clips.model.ClipsCreationToolsResponse$ContentFundingDeal;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;

/* renamed from: X.KrY  reason: case insensitive filesystem */
public abstract class C63105KrY {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, com.instagram.clips.model.ClipsCreationToolsResponse$ContentFundingDeal] */
    public static ClipsCreationToolsResponse$ContentFundingDeal parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("deal_id".equals(A17)) {
                    obj.A00 = r4.A0y();
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r4);
                } else if (AnonymousClass000.A00(2975).equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r4);
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
