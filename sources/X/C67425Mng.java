package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Mng  reason: case insensitive filesystem */
public abstract class C67425Mng {
    public static C67426Mnh parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C67426Mnh mnh = new C67426Mnh();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("hashtags".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C69160Nfj parseFromJson = C70322O2a.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    mnh.A00 = arrayList;
                }
                r5.A0z();
            }
            return mnh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
