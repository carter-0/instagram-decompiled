package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5jZ  reason: invalid class name and case insensitive filesystem */
public abstract class C292815jZ {
    public static C239693Hq parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            ArrayList arrayList = null;
            C294065ln r5 = null;
            C294065ln r6 = null;
            String str = null;
            String str2 = null;
            while (r10.A1J() != 16L.A09) {
                String A0q = r10.A0q();
                r10.A1J();
                if ("crop_rect".equals(A0q)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r10.A1J() != 16L.A08) {
                            arrayList.add(new Float(r10.A0U()));
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("cropped_image_version".equals(A0q)) {
                    r5 = C292825ja.parseFromJson(r10);
                } else if ("full_image_version".equals(A0q)) {
                    r6 = C292825ja.parseFromJson(r10);
                } else if ("media_id".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("upload_id".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (r5 != null || !(r10 instanceof 0c9)) {
                return new C239693Hq(r5, r6, str, str2, arrayList);
            }
            ((0c9) r10).A03.A00("cropped_image_version", "ReelCoverMedia");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
