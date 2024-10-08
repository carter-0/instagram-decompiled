package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.KxG  reason: case insensitive filesystem */
public abstract class C63451KxG {
    /* JADX WARNING: type inference failed for: r3v1, types: [X.Kot, java.lang.Object] */
    public static C62941Kot parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            ArrayList arrayList6 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("emoji".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r9, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("giphy".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            C39746A7m parseFromJson = A0I.parseFromJson(r9);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("giphy_gifs".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList3 = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            C39746A7m parseFromJson2 = A0I.parseFromJson(r9);
                            if (parseFromJson2 != null) {
                                arrayList3.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("stickers".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList4 = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            C317876nz parseFromJson3 = C369248u6.parseFromJson(r9);
                            if (parseFromJson3 != null) {
                                arrayList4.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("avatar_stickers".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList5 = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            C317966o8 parseFromJson4 = C369258u7.parseFromJson(r9);
                            if (parseFromJson4 != null) {
                                arrayList5.add(parseFromJson4);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if ("cutout_stickers".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList6 = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            C317966o8 parseFromJson5 = C369258u7.parseFromJson(r9);
                            if (parseFromJson5 != null) {
                                arrayList6.add(parseFromJson5);
                            }
                        }
                    } else {
                        arrayList6 = null;
                    }
                }
                r9.A0z();
            }
            ? obj = new Object();
            obj.A03 = arrayList;
            obj.A05 = arrayList2;
            obj.A04 = arrayList3;
            obj.A06 = arrayList4;
            obj.A00 = arrayList5;
            obj.A01 = arrayList6;
            if (arrayList != null) {
                obj.A02 = AnonymousClass7TE.A1C();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    obj.A02.add(C336957fS.A01(AnonymousClass7TE.A18(it)));
                }
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
