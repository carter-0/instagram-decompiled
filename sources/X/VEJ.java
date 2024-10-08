package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

public abstract class VEJ {
    /* JADX WARNING: type inference failed for: r0v5, types: [X.V3i, java.lang.Object] */
    public static C16725V3i parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Long l = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if (!"subtitle".equals(A17)) {
                    l = C41847B3o.A14(r10, l, A17, "countdown_date");
                } else if (r10.A11() == 16L.A0G) {
                    str2 = null;
                } else {
                    str2 = r10.A1P();
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r10, "VotingInfoHeader");
            } else if (str2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("subtitle", r10, "VotingInfoHeader");
            } else if (l != null || !(r10 instanceof 0c9)) {
                long longValue = l.longValue();
                ? obj = new Object();
                obj.A02 = str;
                obj.A01 = str2;
                obj.A00 = longValue;
                return obj;
            } else {
                AnonymousClass7TF.A1L("countdown_date", r10, "VotingInfoHeader");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
