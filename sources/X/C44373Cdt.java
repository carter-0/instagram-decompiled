package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cdt  reason: case insensitive filesystem */
public abstract class C44373Cdt {
    public static AnonymousClass5GI parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayList = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("button_action".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("button_text".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if (C41845B3m.A1Q(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                } else if ("end_card_type".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r10.A1P();
                    }
                } else if ("image_urls".equals(A17)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r10.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r10, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r10.A0z();
            }
            if (str4 != null || !(r10 instanceof 0c9)) {
                return new AnonymousClass5GI(str, str2, str3, str4, arrayList);
            }
            AnonymousClass7TF.A1L("end_card_type", r10, "StoriesTrayEndCardServerModelImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
