package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3lL  reason: invalid class name and case insensitive filesystem */
public abstract class C250373lL {
    public static AnonymousClass3I1 parseFromJson(16F r6) {
        String A1P;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                if ("cross_surface".equals(A0q)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r6.A1J() != 16L.A08) {
                            C250453lT parseFromJson = C250383lM.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("local_surface".equals(A0q)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r6.A1J() != 16L.A08) {
                            C250453lT parseFromJson2 = C250383lM.parseFromJson(r6);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("meta_ids".equals(A0q)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList3 = new ArrayList();
                        while (r6.A1J() != 16L.A08) {
                            if (!(r6.A11() == 16L.A0G || (A1P = r6.A1P()) == null)) {
                                arrayList3.add(A1P);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                }
                r6.A0z();
            }
            return new AnonymousClass3I1(arrayList, arrayList2, arrayList3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, AnonymousClass3I1 r3) {
        r2.A0c();
        List<C250453lT> list = r3.A00;
        if (list != null) {
            16P.A03(r2, "cross_surface");
            for (C250453lT r0 : list) {
                if (r0 != null) {
                    C250383lM.A00(r2, r0);
                }
            }
            r2.A0Y();
        }
        List<C250453lT> list2 = r3.A01;
        if (list2 != null) {
            16P.A03(r2, "local_surface");
            for (C250453lT r02 : list2) {
                if (r02 != null) {
                    C250383lM.A00(r2, r02);
                }
            }
            r2.A0Y();
        }
        List<String> list3 = r3.A02;
        if (list3 != null) {
            16P.A03(r2, "meta_ids");
            for (String str : list3) {
                if (str != null) {
                    r2.A0t(str);
                }
            }
            r2.A0Y();
        }
        r2.A0Z();
    }
}
