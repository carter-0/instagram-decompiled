package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.8wp  reason: invalid class name and case insensitive filesystem */
public abstract class C370648wp {
    public static C370658wq parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (r13.A1J() != 16L.A09) {
                String A0q = r13.A0q();
                r13.A1J();
                if ("fifty".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("icon_images".equals(A0q)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r13.A1J() != 16L.A08) {
                            ExtendedImageUrl parseFromJson = 16W.parseFromJson(r13);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("one_hundred".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("seventy_five".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                } else if ("two_hundred".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                }
                r13.A0z();
            }
            if (str == null && (r13 instanceof 0c9)) {
                ((0c9) r13).A03.A00("fifty", "ThemeIconAssetImpl");
            } else if (str2 == null && (r13 instanceof 0c9)) {
                ((0c9) r13).A03.A00("one_hundred", "ThemeIconAssetImpl");
            } else if (str3 == null && (r13 instanceof 0c9)) {
                ((0c9) r13).A03.A00("seventy_five", "ThemeIconAssetImpl");
            } else if (str4 != null || !(r13 instanceof 0c9)) {
                return new C370658wq(str, str2, str3, str4, arrayList);
            } else {
                ((0c9) r13).A03.A00("two_hundred", "ThemeIconAssetImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
