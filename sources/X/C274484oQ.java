package X;

import com.instagram.api.schemas.TIFUAppDestinationEnum;
import java.io.IOException;

/* renamed from: X.4oQ  reason: invalid class name and case insensitive filesystem */
public abstract class C274484oQ {
    public static C274494oS parseFromJson(16F r5) {
        String str;
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            TIFUAppDestinationEnum tIFUAppDestinationEnum = null;
            String str2 = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("landing_site".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    tIFUAppDestinationEnum = (TIFUAppDestinationEnum) TIFUAppDestinationEnum.A01.get(str);
                    if (tIFUAppDestinationEnum == null) {
                        tIFUAppDestinationEnum = TIFUAppDestinationEnum.UNRECOGNIZED;
                    }
                } else if ("url".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                }
                r5.A0z();
            }
            return new C274494oS(tIFUAppDestinationEnum, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
