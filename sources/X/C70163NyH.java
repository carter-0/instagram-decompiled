package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.NyH  reason: case insensitive filesystem */
public abstract class C70163NyH {
    public static PE0 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            PE0 pe0 = new PE0();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("reshared_content_items".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C45281Ctk parseFromJson = C44686CjD.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    pe0.A01 = arrayList;
                } else if ("has_more".equals(A17)) {
                    pe0.A02 = r5.A0d();
                } else if ("next_offset".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    pe0.A00 = A0l;
                }
                r5.A0z();
            }
            return pe0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
