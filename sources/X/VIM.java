package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class VIM {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.WUk, java.lang.Object] */
    public static C19328WUk parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("background_color".equals(A17)) {
                    obj.A00 = r4.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("serializable_paths".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C306506Mk parseFromJson = VIE.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        obj.A02 = arrayList;
                    } else if ("text_emphasis_mode".equals(A17)) {
                        obj.A01 = A1S.A00(AnonymousClass7TG.A0l(r4));
                    }
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
