package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

public abstract class VHU {
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.WWJ] */
    public static WWJ parseFromJson(16F r13) {
        String str;
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            Boolean bool = null;
            Integer num = null;
            String str2 = null;
            ArrayList arrayList = null;
            String str3 = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("catalog_source".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                    num = VHV.A00(str);
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("catalogs".equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r13.A1J() != 16L.A08) {
                            C17462VWp parseFromJson = VHX.parseFromJson(r13);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("more_available".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r13);
                } else if ("next_max_id".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                }
                r13.A0z();
            }
            if (num == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("catalog_source", r13, "CatalogSection");
            } else if (str2 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r13, "CatalogSection");
            } else if (arrayList == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("catalogs", r13, "CatalogSection");
            } else if (bool != null || !(r13 instanceof 0c9)) {
                boolean booleanValue = bool.booleanValue();
                ? obj = new Object();
                obj.A01 = AnonymousClass05K.A00;
                obj.A04 = new ArrayList();
                obj.A00 = AnonymousClass05K.A0C;
                obj.A01 = num;
                obj.A03 = str2;
                obj.A04 = arrayList;
                obj.A05 = booleanValue;
                obj.A02 = str3;
                return obj;
            } else {
                AnonymousClass7TF.A1L("more_available", r13, "CatalogSection");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
