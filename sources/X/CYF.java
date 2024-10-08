package X;

import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CYF {
    public static C42043BEv parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            User user = null;
            ArrayList arrayList = null;
            Integer num = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("featured_user_list".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            C41846B3n.A1E(r9, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("group".equals(A17)) {
                    user = C41845B3m.A0a(r9, false);
                } else {
                    num = C41847B3o.A13(r9, num, A17, "num_total_notes");
                }
                r9.A0z();
            }
            if (user != null || !(r9 instanceof 0c9)) {
                return new C42043BEv(user, num, arrayList);
            }
            AnonymousClass7TF.A1L("group", r9, "GroupNoteResponseInfoImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
