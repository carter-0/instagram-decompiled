package X;

import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.KxO  reason: case insensitive filesystem */
public abstract class C63459KxO {
    /* JADX WARNING: type inference failed for: r1v1, types: [X.Koi, java.lang.Object] */
    public static C62930Koi parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            Integer num = null;
            ArrayList arrayList = null;
            String str = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("upload_id".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("media_id".equals(A17) || AnonymousClass000.A00(322).equals(A17)) {
                    num = AnonymousClass7TF.A0X(r9);
                } else if ("detected_products".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            MediaSuggestedProductTag parseFromJson = C63458KxN.parseFromJson(r9);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r9.A0z();
            }
            if (num == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("media_id", r9, "MediaSuggestedProductTagsContainer");
            } else if (arrayList != null || !(r9 instanceof 0c9)) {
                int intValue = num.intValue();
                ? obj = new Object();
                obj.A01 = str;
                obj.A00 = intValue;
                obj.A02 = arrayList;
                return obj;
            } else {
                AnonymousClass7TF.A1L("detected_products", r9, "MediaSuggestedProductTagsContainer");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
