package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class VBQ {
    /* JADX WARNING: type inference failed for: r3v0, types: [X.5ts, java.lang.Object] */
    public static C298695ts parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("tabs".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C18479VsV parseFromJson = VBP.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A02 = arrayList;
                } else if ("selected".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r4);
                }
                r4.A0z();
            }
            C16672Uz8 uz8 = (C16672Uz8) C16672Uz8.A01.get(obj.A01);
            if (uz8 == null) {
                uz8 = C16672Uz8.UNSPECIFIED;
            }
            obj.A00 = uz8;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
