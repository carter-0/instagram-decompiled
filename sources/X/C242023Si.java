package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3Si  reason: invalid class name and case insensitive filesystem */
public abstract class C242023Si {
    public static C242033Sj parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            ArrayList arrayList = null;
            Boolean bool = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if ("has_public_channels".equals(A0q)) {
                    bool = Boolean.valueOf(r7.A0d());
                } else if ("pinned_channels_list".equals(A0q)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r7.A1J() != 16L.A08) {
                            C2609147n parseFromJson = C2608747j.parseFromJson(r7);
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
                return new C242033Sj(bool, arrayList);
            }
            ((0c9) r7).A03.A00("pinned_channels_list", "PinnedChannelsInfoDictImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
