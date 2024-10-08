package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class VCN {
    public static VY4 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            VY4 vy4 = new VY4();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("has_audio".equals(A17)) {
                    vy4.A03 = r4.A0d();
                } else if ("video_duration".equals(A17)) {
                    r4.A1D();
                } else {
                    ArrayList arrayList = null;
                    if (C41845B3m.A17(A17)) {
                        vy4.A01 = AnonymousClass7TG.A0l(r4);
                    } else if ("image_versions2".equals(A17)) {
                        vy4.A00 = VCM.parseFromJson(r4);
                    } else if (AnonymousClass000.A00(1927).equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                VY5 parseFromJson = VCO.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        vy4.A02 = arrayList;
                    }
                }
                r4.A0z();
            }
            return vy4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
