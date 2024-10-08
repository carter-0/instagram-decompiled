package X;

import com.instagram.api.schemas.PopularReelWithFollowersInsightMetadataImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cbc  reason: case insensitive filesystem */
public abstract class C44241Cbc {
    public static PopularReelWithFollowersInsightMetadataImpl parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            ArrayList arrayList = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("like_count".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r11);
                } else if ("media_ids".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r11, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("play_count".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r11);
                } else {
                    num3 = C41847B3o.A13(r11, num3, A17, "reshare_count");
                }
                r11.A0z();
            }
            if (num == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("like_count", r11, "PopularReelWithFollowersInsightMetadataImpl");
            } else if (num2 == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("play_count", r11, "PopularReelWithFollowersInsightMetadataImpl");
            } else if (num3 != null || !(r11 instanceof 0c9)) {
                return new PopularReelWithFollowersInsightMetadataImpl(arrayList, num.intValue(), num2.intValue(), num3.intValue());
            } else {
                AnonymousClass7TF.A1L("reshare_count", r11, "PopularReelWithFollowersInsightMetadataImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
