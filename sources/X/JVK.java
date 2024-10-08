package X;

import com.instagram.api.schemas.ACRType;
import java.io.IOException;

public abstract class JVK {
    public static C53401GnY parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C53401GnY gnY = new C53401GnY();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                String str = null;
                if ("collection_id".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    gnY.A03 = str;
                } else if ("media_id".equals(A0q)) {
                    gnY.A01 = Long.valueOf(r4.A0y());
                } else if ("medium_id".equals(A0q)) {
                    gnY.A02 = Long.valueOf(r4.A0y());
                } else if ("acr_type".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    gnY.A00 = C378199Ow.A00(str);
                } else if ("template_clips_media_id".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    gnY.A04 = str;
                }
                r4.A0z();
            }
            return gnY;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(C53401GnY gnY, 17Z r4) {
        r4.A0c();
        String str = gnY.A03;
        if (str != null) {
            r4.A0R("collection_id", str);
        }
        Number number = (Number) gnY.A01;
        if (number != null) {
            r4.A0Q("media_id", number.longValue());
        }
        Number number2 = (Number) gnY.A02;
        if (number2 != null) {
            r4.A0Q("medium_id", number2.longValue());
        }
        ACRType aCRType = (ACRType) gnY.A00;
        if (aCRType != null) {
            r4.A0R("acr_type", aCRType.A00);
        }
        String str2 = gnY.A04;
        if (str2 != null) {
            r4.A0R("template_clips_media_id", str2);
        }
        r4.A0Z();
    }
}
