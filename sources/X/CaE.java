package X;

import com.instagram.api.schemas.MediaNoteMimicryTrigger;
import com.instagram.api.schemas.MediaNoteMimicryType;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CaE {
    public static BFR parseFromJson(16F r5) {
        String str;
        String str2;
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            ArrayList arrayList = null;
            MediaNoteMimicryType mediaNoteMimicryType = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("triggers".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            if (r5.A11() == 16L.A0G) {
                                str2 = null;
                            } else {
                                str2 = r5.A1P();
                            }
                            MediaNoteMimicryTrigger mediaNoteMimicryTrigger = (MediaNoteMimicryTrigger) MediaNoteMimicryTrigger.A01.get(str2);
                            if (mediaNoteMimicryTrigger == null) {
                                mediaNoteMimicryTrigger = MediaNoteMimicryTrigger.UNRECOGNIZED;
                            }
                            arrayList.add(mediaNoteMimicryTrigger);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C41845B3m.A1C(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    mediaNoteMimicryType = (MediaNoteMimicryType) MediaNoteMimicryType.A01.get(str);
                    if (mediaNoteMimicryType == null) {
                        mediaNoteMimicryType = MediaNoteMimicryType.UNRECOGNIZED;
                    }
                }
                r5.A0z();
            }
            return new BFR(mediaNoteMimicryType, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
