package X;

import com.instagram.api.schemas.BusinessProfileDictImpl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

public abstract class CVD {
    public static BusinessProfileDictImpl parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            SimpleImageUrl simpleImageUrl = null;
            String str2 = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                if (C41846B3n.A1Y(r6, A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if ("profile_pic_url".equals(A0q)) {
                    simpleImageUrl = 16h.A00(r6);
                } else if (Dbk.A00().equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                }
                r6.A0z();
            }
            return new BusinessProfileDictImpl(simpleImageUrl, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
