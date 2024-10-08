package X;

import com.instagram.igtv.persistence.draft.IGTVBrandedContentTags;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Kuf  reason: case insensitive filesystem */
public abstract class C63296Kuf {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.instagram.igtv.persistence.draft.IGTVBrandedContentTags] */
    public static IGTVBrandedContentTags parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ? obj = new Object();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("branded_content_tags".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            BrandedContentTag parseFromJson = LJX.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    obj.A01 = arrayList;
                } else if ("branded_content_project_metadata".equals(A17)) {
                    obj.A00 = LGt.parseFromJson(r5);
                }
                r5.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
