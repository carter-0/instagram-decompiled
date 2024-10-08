package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class VIV {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.WUp, java.lang.Object] */
    public static C19333WUp parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("duplication_offset".equals(A17)) {
                    obj.A00 = (float) r4.A0U();
                } else if ("text_color".equals(A17)) {
                    obj.A02 = r4.A1D();
                } else if ("background_color".equals(A17)) {
                    obj.A01 = r4.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("text_emphasis_mode".equals(A17)) {
                        obj.A03 = A1S.A00(AnonymousClass7TG.A0l(r4));
                    } else if ("line_coordinates".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C17397VTy parseFromJson = VIU.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        obj.A04 = arrayList;
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
