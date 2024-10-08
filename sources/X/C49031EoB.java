package X;

import com.instagram.nux.cal.model.FXCalAgeInfo;
import java.io.IOException;

/* renamed from: X.EoB  reason: case insensitive filesystem */
public abstract class C49031EoB {
    /* JADX WARNING: type inference failed for: r0v4, types: [com.instagram.nux.cal.model.FXCalAgeInfo, java.lang.Object] */
    public static FXCalAgeInfo parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (Dbj.A03().equals(A17)) {
                    obj.A06 = AnonymousClass7TG.A0l(r3);
                } else if ("account_id".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("birthdate".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("account_type".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("is_default_selected".equals(A17)) {
                    obj.A01 = AnonymousClass7TF.A0S(r3);
                } else if ("subtitle".equals(A17)) {
                    obj.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("age".equals(A17)) {
                    obj.A00 = r3.A1D();
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
