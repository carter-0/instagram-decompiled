package X;

import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.KxA  reason: case insensitive filesystem */
public abstract class C63445KxA {
    public static C61069Jw7 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C61069Jw7 jw7 = new C61069Jw7(10);
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("header".equals(A17)) {
                    ShoppingTaggingFeedHeader parseFromJson = C63444Kx9.parseFromJson(r5);
                    0qQ.A0B(parseFromJson, 0);
                    jw7.A00 = parseFromJson;
                } else if ("logging_meta".equals(A17)) {
                    C61062Jw0 parseFromJson2 = C63441Kx6.parseFromJson(r5);
                    0qQ.A0B(parseFromJson2, 0);
                    jw7.A01 = parseFromJson2;
                } else if ("selection_limits".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C61079JwH parseFromJson3 = C63442Kx7.parseFromJson(r5);
                            if (parseFromJson3 != null) {
                                arrayList.add(parseFromJson3);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    jw7.A02 = arrayList;
                }
                r5.A0z();
            }
            return jw7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
