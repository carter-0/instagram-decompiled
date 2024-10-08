package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.shopping.model.destination.home.DestinationContentType;
import com.instagram.shopping.model.destination.home.DestinationSignalType;
import java.io.IOException;
import java.util.HashMap;

public abstract class VHC {
    public static C61069Jw7 parseFromJson(16F r8) {
        String str;
        String str2;
        0qQ.A0B(r8, 0);
        try {
            16L A11 = r8.A11();
            16L r5 = 16L.A0D;
            if (A11 != r5) {
                r8.A0z();
                return null;
            }
            DestinationContentType destinationContentType = null;
            HashMap hashMap = null;
            DestinationSignalType destinationSignalType = null;
            while (true) {
                16L A1J = r8.A1J();
                16L r7 = 16L.A09;
                if (A1J == r7) {
                    return new C61069Jw7(8, destinationSignalType, destinationContentType, hashMap);
                }
                String A17 = AnonymousClass7TE.A17(r8);
                if (TraceFieldType.ContentType.equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                    destinationContentType = (DestinationContentType) DestinationContentType.A01.get(str2);
                    if (destinationContentType == null) {
                        destinationContentType = DestinationContentType.UNRECOGNIZED;
                    }
                } else if ("extra_data".equals(A17)) {
                    if (r8.A11() == r5) {
                        hashMap = new HashMap();
                        while (r8.A1J() != r7) {
                            C41847B3o.A1M(r8, hashMap);
                        }
                    } else {
                        hashMap = null;
                    }
                } else if ("signal_type".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    destinationSignalType = (DestinationSignalType) DestinationSignalType.A01.get(str);
                    if (destinationSignalType == null) {
                        destinationSignalType = DestinationSignalType.UNRECOGNIZED;
                    }
                }
                r8.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
