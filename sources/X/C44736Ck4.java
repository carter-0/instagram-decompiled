package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Ck4  reason: case insensitive filesystem */
public abstract class C44736Ck4 {
    public static BIN parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("image_tags".equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r7.A1J() != 16L.A08) {
                            C257553xa parseFromJson = C2605846g.parseFromJson(r7);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C41845B3m.A1J(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if (AnonymousClass000.A00(184).equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r7.A1J() != 16L.A08) {
                            C41846B3n.A1D(r7, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("product_picker_page_info".equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList3 = AnonymousClass7TE.A1C();
                        while (r7.A1J() != 16L.A08) {
                            C42071BFz parseFromJson2 = Cc4.parseFromJson(r7);
                            if (parseFromJson2 != null) {
                                arrayList3.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                }
                r7.A0z();
            }
            return new BIN(str, arrayList, arrayList2, arrayList3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
