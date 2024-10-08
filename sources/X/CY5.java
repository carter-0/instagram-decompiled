package X;

import com.instagram.api.schemas.GenAIPersonaBannerDictImpl;
import com.instagram.api.schemas.GenAIPersonaBannersResponseImpl;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CY5 {
    public static GenAIPersonaBannersResponseImpl parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (r6.A1J() != 16L.A09) {
                if (C41846B3n.A1b(r6, "banners")) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            GenAIPersonaBannerDictImpl parseFromJson = CY3.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r6.A0z();
            }
            if (arrayList != null || !(r6 instanceof 0c9)) {
                return new GenAIPersonaBannersResponseImpl(arrayList);
            }
            AnonymousClass7TF.A1L("banners", r6, "GenAIPersonaBannersResponseImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
