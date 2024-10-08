package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class B7E {
    public static C61079JwH parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            ArrayList arrayList = null;
            while (r11.A1J() != 16L.A09) {
                String A0q = r11.A0q();
                r11.A1J();
                if ("section_header".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("selector_type".equals(A0q)) {
                    String A1Q = r11.A1Q();
                    0qQ.A0B(A1Q, 0);
                    num = AnonymousClass05K.A00;
                    if (!A1Q.equals("radio")) {
                        num = AnonymousClass05K.A01;
                        if (!A1Q.equals("check")) {
                            num = AnonymousClass05K.A0C;
                            if (!A1Q.equals("toggle")) {
                                num = null;
                            }
                        }
                    }
                } else if ("included_filters".equals(A0q)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r11.A1J() != 16L.A08) {
                            C46539Dgg parseFromJson = B7F.parseFromJson(r11);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r11.A0z();
            }
            if (str == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("section_header", r11, "FilteringHeader");
            } else if (num == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("selector_type", r11, "FilteringHeader");
            } else if (arrayList != null || !(r11 instanceof 0c9)) {
                return new C61079JwH(num, str, (List) arrayList, 20);
            } else {
                AnonymousClass7TF.A1L("included_filters", r11, "FilteringHeader");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
