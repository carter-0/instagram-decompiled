package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VCb  reason: case insensitive filesystem */
public abstract class C16949VCb {
    public static VSE parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            VSE vse = new VSE();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("avatar_sdk_ar_effect_transparent_thumbnail".equals(A17)) {
                    vse.A00 = C16948VCa.parseFromJson(r4);
                } else if ("avatar_sdk_ar_effects".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C17737Vd6 parseFromJson = C16961VCn.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    vse.A01 = arrayList;
                }
                r4.A0z();
            }
            return vse;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
