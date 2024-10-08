package X;

import com.instagram.model.direct.DirectThreadKey;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CjZ {
    public static C65571eI parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C65571eI r0 = new C65571eI();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("thread_key".equals(A17)) {
                    DirectThreadKey parseFromJson = C254733sx.parseFromJson(r5);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A00 = parseFromJson;
                } else {
                    ArrayList arrayList = null;
                    if ("locationId".equals(A17)) {
                        String A0l = AnonymousClass7TG.A0l(r5);
                        0qQ.A0B(A0l, 0);
                        r0.A01 = A0l;
                    } else if ("header_title_text".equals(A17)) {
                        r0.A02 = AnonymousClass7TG.A0l(r5);
                    } else if ("location_share_xma".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                C41848B3p.A1P(r5, arrayList);
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        r0.A03 = arrayList;
                    } else {
                        C66893Meb.A01(r5, r0, A17);
                    }
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
