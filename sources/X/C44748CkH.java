package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CkH  reason: case insensitive filesystem */
public abstract class C44748CkH {
    public static BIS parseFromJson(16F r18) {
        16F r3 = r18;
        0qQ.A0B(r3, 0);
        try {
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            ArrayList arrayList = null;
            Long l = null;
            ArrayList arrayList2 = null;
            BFT bft = null;
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("audience".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r3);
                } else if (AnonymousClass000.A00(272).equals(A17)) {
                    if (r3.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r3.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r3, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("expiring_at".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r3);
                } else if ("media_count".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r3);
                } else if ("preview_medias".equals(A17)) {
                    if (r3.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r3.A1J() != 16L.A08) {
                            C41846B3n.A1D(r3, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("prompt_data".equals(A17)) {
                    bft = C45593Cz5.parseFromJson(r3);
                } else {
                    num3 = C41847B3o.A13(r3, num3, A17, "streak_count");
                }
                r3.A0z();
            }
            if (num == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("audience", r3, "PotatoContainerMediaInfoImpl");
            } else if (num2 == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("media_count", r3, "PotatoContainerMediaInfoImpl");
            } else if (arrayList2 == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("preview_medias", r3, "PotatoContainerMediaInfoImpl");
            } else if (num3 != null || !(r3 instanceof 0c9)) {
                return new BIS(bft, l, arrayList, arrayList2, num.intValue(), num2.intValue(), num3.intValue());
            } else {
                AnonymousClass7TF.A1L("streak_count", r3, "PotatoContainerMediaInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
