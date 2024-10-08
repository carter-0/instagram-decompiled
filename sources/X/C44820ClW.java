package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ClW  reason: case insensitive filesystem */
public abstract class C44820ClW {
    public static C61084JwM parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            ArrayList arrayList = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("fromVersion".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r6);
                } else if ("toVersion".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r6);
                } else if ("mediaUpdates".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C61079JwH parseFromJson = C44821ClX.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r6.A0z();
            }
            return new C61084JwM(num, num2, (List) arrayList, 47);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
