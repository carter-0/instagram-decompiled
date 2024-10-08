package X;

import com.instagram.nux.cal.model.FxAccountInfo;
import java.io.IOException;

/* renamed from: X.EoD  reason: case insensitive filesystem */
public abstract class C49033EoD {
    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.nux.cal.model.FxAccountInfo, java.lang.Object] */
    public static FxAccountInfo parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("account_type".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("display_name".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("profile_pic_url".equals(A17)) {
                    obj.A00 = 16h.A00(r3);
                } else if (AnonymousClass000.A00(3750).equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
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
