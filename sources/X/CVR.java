package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class CVR {
    public static AnonymousClass493 parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            Boolean bool = null;
            ArrayList arrayList = null;
            String str2 = null;
            Integer num2 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("duration_in_ms".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r9);
                } else if ("indicator_style".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("should_enable_autoadvance".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r9);
                } else if ("showcase_links".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            C41846B3n.A1C(r9, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (!"thumbnail_position".equals(A17)) {
                    num2 = C41847B3o.A13(r9, num2, A17, "thumbnail_width");
                } else if (r9.A11() == 16L.A0G) {
                    str2 = null;
                } else {
                    str2 = r9.A1P();
                }
                r9.A0z();
            }
            return new AnonymousClass493(bool, num, num2, str, str2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
