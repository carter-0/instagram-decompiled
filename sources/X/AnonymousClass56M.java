package X;

import com.instagram.api.schemas.CornerStyle;
import com.instagram.model.androidlink.AndroidLinkImpl;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.56M  reason: invalid class name */
public abstract class AnonymousClass56M {
    public static AnonymousClass56O parseFromJson(16F r9) {
        String str;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            ArrayList arrayList = null;
            CornerStyle cornerStyle = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            String str2 = null;
            while (r9.A1J() != 16L.A09) {
                String A0q = r9.A0q();
                r9.A1J();
                if ("android_links".equals(A0q)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r9.A1J() != 16L.A08) {
                            AndroidLinkImpl parseFromJson = C250113kv.parseFromJson(r9);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("corner_style".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                    cornerStyle = (CornerStyle) CornerStyle.A01.get(str);
                    if (cornerStyle == null) {
                        cornerStyle = CornerStyle.UNRECOGNIZED;
                    }
                } else if ("ios_links".equals(A0q)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r9.A1J() != 16L.A08) {
                            AndroidLinkImpl parseFromJson2 = C250113kv.parseFromJson(r9);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("links".equals(A0q)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList3 = new ArrayList();
                        while (r9.A1J() != 16L.A08) {
                            AndroidLinkImpl parseFromJson3 = C250113kv.parseFromJson(r9);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("product".equals(A0q)) {
                    productDetailsProductItemDict = C275404q6.parseFromJson(r9);
                } else if ("product_name".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            return new AnonymousClass56O(cornerStyle, productDetailsProductItemDict, str2, arrayList, arrayList2, arrayList3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
