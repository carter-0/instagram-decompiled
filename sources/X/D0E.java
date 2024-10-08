package X;

import com.instagram.api.schemas.TextEntityType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class D0E {
    public static C42120BHy parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("entities".equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r7.A1J() != 16L.A08) {
                            C42114BHs parseFromJson = C44521CgH.parseFromJson(r7);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("text".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                }
                r7.A0z();
            }
            if (str != null || !(r7 instanceof 0c9)) {
                return new C42120BHy(arrayList, str);
            }
            AnonymousClass7TF.A1L("text", r7, "TextWithEntities");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r5, C42120BHy bHy) {
        r5.A0c();
        List list = bHy.A01;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r5, "entities", list);
            while (A0s.hasNext()) {
                C42114BHs bHs = (C42114BHs) A0s.next();
                if (bHs != null) {
                    r5.A0c();
                    C42113BHr bHr = bHs.A01;
                    if (bHr != null) {
                        r5.A0q("entity");
                        r5.A0c();
                        String str = bHr.A01;
                        if (str != null) {
                            r5.A0R("display_text", str);
                        }
                        TextEntityType textEntityType = bHr.A00;
                        if (textEntityType != null) {
                            r5.A0R("entity_type", textEntityType.A00);
                        }
                        C41846B3n.A0y(r5, bHr.A02);
                        String str2 = bHr.A03;
                        if (str2 != null) {
                            r5.A0R("url", str2);
                        }
                        r5.A0Z();
                    }
                    Integer num = bHs.A02;
                    if (num != null) {
                        r5.A0P("length", num.intValue());
                    }
                    r5.A0P("offset", bHs.A00);
                    r5.A0Z();
                }
            }
            r5.A0Y();
        }
        C41846B3n.A0z(r5, bHy.A00);
        r5.A0Z();
    }
}
