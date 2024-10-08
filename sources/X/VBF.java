package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class VBF {
    public static GNY parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            GNY gny = new GNY();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("tokens".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C15092UOk parseFromJson = C18191Vn5.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    gny.A01 = arrayList;
                } else if ("confidence".equals(A17)) {
                    gny.A00 = (float) r5.A0U();
                }
                r5.A0z();
            }
            return gny;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
