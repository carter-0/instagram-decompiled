package X;

import com.instagram.api.schemas.InspirationSignalType;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Ca5 {
    public static BFN parseFromJson(16F r6) {
        String str;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (r6.A1J() != 16L.A09) {
                if (C41846B3n.A1b(r6, "signal_types")) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            if (r6.A11() == 16L.A0G) {
                                str = null;
                            } else {
                                str = r6.A1P();
                            }
                            InspirationSignalType inspirationSignalType = (InspirationSignalType) InspirationSignalType.A01.get(str);
                            if (inspirationSignalType == null) {
                                inspirationSignalType = InspirationSignalType.UNRECOGNIZED;
                            }
                            arrayList.add(inspirationSignalType);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r6.A0z();
            }
            if (arrayList != null || !(r6 instanceof 0c9)) {
                return new BFN(arrayList);
            }
            AnonymousClass7TF.A1L("signal_types", r6, "LumenLoggingInfoImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
