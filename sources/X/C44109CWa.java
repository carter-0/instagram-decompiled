package X;

import com.instagram.api.schemas.CreatorDigestSignalInfoImpl;
import com.instagram.api.schemas.InspirationSignalType;
import java.io.IOException;

/* renamed from: X.CWa  reason: case insensitive filesystem */
public abstract class C44109CWa {
    public static CreatorDigestSignalInfoImpl parseFromJson(16F r6) {
        String str;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            InspirationSignalType inspirationSignalType = null;
            String str2 = null;
            String str3 = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("signal_type".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                    inspirationSignalType = (InspirationSignalType) InspirationSignalType.A01.get(str);
                    if (inspirationSignalType == null) {
                        inspirationSignalType = InspirationSignalType.UNRECOGNIZED;
                    }
                } else if (C41845B3m.A1L(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r6.A1P();
                    }
                }
                r6.A0z();
            }
            return new CreatorDigestSignalInfoImpl(inspirationSignalType, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
