package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class CUJ {
    public static BDn parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("medias_dict".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            C41846B3n.A1D(r8, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("sound_sync_infos".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            C53465Gox parseFromJson = C44363Cdj.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                r8.A0z();
            }
            if (arrayList == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("medias_dict", r8, "ACRClientStitchMetadata");
            } else if (arrayList2 != null || !(r8 instanceof 0c9)) {
                return new BDn(arrayList, arrayList2);
            } else {
                AnonymousClass7TF.A1L("sound_sync_infos", r8, "ACRClientStitchMetadata");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
