package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cpf  reason: case insensitive filesystem */
public abstract class C45062Cpf {
    public static C61083JwL parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            ArrayList arrayList = null;
            C61069Jw7 jw7 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("decorations".equals(A17)) {
                    jw7 = C45058Cpb.parseFromJson(r7);
                } else if ("labels".equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r7.A1J() != 16L.A08) {
                            C61078JwG parseFromJson = C45059Cpc.parseFromJson(r7);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r7.A0z();
            }
            if (arrayList != null || !(r7 instanceof 0c9)) {
                return new C61083JwL(jw7, (List) arrayList);
            }
            AnonymousClass7TF.A1L("labels", r7, "DestinationItemMetadata");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
