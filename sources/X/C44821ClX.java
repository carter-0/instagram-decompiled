package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ClX  reason: case insensitive filesystem */
public abstract class C44821ClX {
    public static C61079JwH parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            String str = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("ssrcGroups".equals(A17)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r10.A1J() != 16L.A08) {
                            C61076JwE parseFromJson = C44822ClY.parseFromJson(r10);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("media".equals(A17)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r10.A1J() != 16L.A08) {
                            BBE parseFromJson2 = C44818ClU.parseFromJson(r10);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("sourceKey".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (arrayList == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("ssrcGroups", r10, "MwsServerMediaUpdate");
            } else if (arrayList2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("media", r10, "MwsServerMediaUpdate");
            } else if (str != null || !(r10 instanceof 0c9)) {
                return new C61079JwH((List) arrayList, (List) arrayList2, str);
            } else {
                AnonymousClass7TF.A1L("sourceKey", r10, "MwsServerMediaUpdate");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
