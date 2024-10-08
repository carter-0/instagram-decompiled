package X;

import com.instagram.api.schemas.LiveNoteResponseInfo;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CZy  reason: case insensitive filesystem */
public abstract class C44211CZy {
    public static LiveNoteResponseInfo parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Long l = null;
            ArrayList arrayList = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if (!"subscribed_users".equals(A17)) {
                    l = C41847B3o.A14(r7, l, A17, "timer_end_timestamp");
                } else if (r7.A11() == 16L.A0C) {
                    arrayList = AnonymousClass7TE.A1C();
                    while (r7.A1J() != 16L.A08) {
                        C41846B3n.A1E(r7, arrayList);
                    }
                } else {
                    arrayList = null;
                }
                r7.A0z();
            }
            if (l != null || !(r7 instanceof 0c9)) {
                return new LiveNoteResponseInfo(arrayList, l.longValue());
            }
            AnonymousClass7TF.A1L("timer_end_timestamp", r7, "LiveNoteResponseInfo");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
