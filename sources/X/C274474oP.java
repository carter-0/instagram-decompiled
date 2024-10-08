package X;

import com.instagram.api.schemas.TIFUAppDestinationEnum;
import java.io.IOException;

/* renamed from: X.4oP  reason: invalid class name and case insensitive filesystem */
public abstract class C274474oP {
    public static C274514oU parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C274494oS r1 = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            C274494oS r3 = null;
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("installed_destination".equals(A0q)) {
                    r1 = C274484oQ.parseFromJson(r4);
                } else if ("uninstalled_destination".equals(A0q)) {
                    r3 = C274484oQ.parseFromJson(r4);
                }
                r4.A0z();
            }
            return new C274514oU(r1, r3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, C274514oU r4) {
        r3.A0c();
        C274504oT r1 = r4.A00;
        if (r1 != null) {
            r3.A0q("installed_destination");
            C274494oS FCI = r1.FCI();
            r3.A0c();
            TIFUAppDestinationEnum tIFUAppDestinationEnum = FCI.A00;
            if (tIFUAppDestinationEnum != null) {
                r3.A0R("landing_site", tIFUAppDestinationEnum.A00);
            }
            String str = FCI.A01;
            if (str != null) {
                r3.A0R("url", str);
            }
            r3.A0Z();
        }
        C274504oT r12 = r4.A01;
        if (r12 != null) {
            r3.A0q("uninstalled_destination");
            C274494oS FCI2 = r12.FCI();
            r3.A0c();
            TIFUAppDestinationEnum tIFUAppDestinationEnum2 = FCI2.A00;
            if (tIFUAppDestinationEnum2 != null) {
                r3.A0R("landing_site", tIFUAppDestinationEnum2.A00);
            }
            String str2 = FCI2.A01;
            if (str2 != null) {
                r3.A0R("url", str2);
            }
            r3.A0Z();
        }
        r3.A0Z();
    }
}
