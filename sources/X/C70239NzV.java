package X;

import com.instagram.save.model.SavedCollection;
import java.io.IOException;

/* renamed from: X.NzV  reason: case insensitive filesystem */
public abstract class C70239NzV {
    public static C66131jj parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            C66131jj r0 = new C66131jj();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C66580MXl.A1Z(A17)) {
                    r0.A00 = C66580MXl.A0h(r4);
                } else if ("collection".equals(A17)) {
                    SavedCollection parseFromJson = C18689Vwn.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A01 = parseFromJson;
                } else if (C41845B3m.A1A(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    r0.A02 = str;
                } else {
                    C66893Meb.A01(r4, r0, A17);
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
