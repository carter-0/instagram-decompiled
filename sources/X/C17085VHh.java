package X;

import com.instagram.api.schemas.TextWithEntitiesBlockDict;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VHh  reason: case insensitive filesystem */
public abstract class C17085VHh {
    public static C61054Jvs parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C61054Jvs jvs = new C61054Jvs();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if ("blocks".equals(AnonymousClass7TE.A17(r5))) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            TextWithEntitiesBlockDict parseFromJson = C44534CgU.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    jvs.A00 = arrayList;
                }
                r5.A0z();
            }
            return jvs;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
