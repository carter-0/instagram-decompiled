package X;

import com.instagram.api.schemas.HallpassDetailsDictImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.372  reason: invalid class name */
public final class AnonymousClass372 {
    public static C2372736z parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("hallpass_data_dicts".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            HallpassDetailsDictImpl parseFromJson = CYT.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r3.A01 = arrayList;
                } else {
                    1XY.A01(r4, r3, A0q);
                }
                r4.A0z();
            }
            List list = r3.A01;
            0qQ.A0A(list);
            r3.A00 = new C239933Iv(list);
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
