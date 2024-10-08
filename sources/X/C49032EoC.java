package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent;
import java.io.IOException;

/* renamed from: X.EoC  reason: case insensitive filesystem */
public abstract class C49032EoC {
    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent, java.lang.Object] */
    public static FXCalAgeRestrictionScreenContent parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1E(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if (Pxd.A00(98).equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("source_age_info".equals(A17)) {
                    obj.A00 = C49031EoB.parseFromJson(r3);
                } else if ("target_age_info".equals(A17)) {
                    obj.A01 = C49031EoB.parseFromJson(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
