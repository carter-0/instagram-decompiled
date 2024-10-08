package X;

import com.instagram.user.model.ProductCollectionImpl;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.D9t  reason: case insensitive filesystem */
public abstract class C45890D9t {
    public static C61062Jw0 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C61062Jw0 jw0 = new C61062Jw0();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("products".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            BBU parseFromJson = C44625Chx.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    jw0.A01 = arrayList;
                } else if ("product_collection_id".equals(A17)) {
                    jw0.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("product_collection".equals(A17)) {
                    jw0.A00 = C45710D2j.parseFromJson(r4);
                } else if ("shopping_tagging_session_id".equals(A17)) {
                    jw0.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("merchant_id".equals(A17)) {
                    jw0.A02 = AnonymousClass7TG.A0l(r4);
                }
                r4.A0z();
            }
            return jw0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static String A00(C61062Jw0 jw0) {
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A01(jw0, A0A);
        A0A.close();
        return stringWriter.toString();
    }

    public static void A01(C61062Jw0 jw0, 17Z r5) {
        r5.A0c();
        if (jw0.A01 != null) {
            16P.A03(r5, "products");
            for (BBU bbu : (List) jw0.A01) {
                if (bbu != null) {
                    r5.A0c();
                    String str = bbu.A04;
                    if (str != null) {
                        r5.A0R("product_id", str);
                    }
                    C41846B3n.A14(r5, bbu.A03);
                    String str2 = bbu.A05;
                    if (str2 != null) {
                        r5.A0R("product_name", str2);
                    }
                    ProductDetailsProductItemDict productDetailsProductItemDict = (ProductDetailsProductItemDict) bbu.A00;
                    if (productDetailsProductItemDict != null) {
                        r5.A0q("product_data");
                        C275404q6.A00(r5, productDetailsProductItemDict);
                    }
                    String str3 = bbu.A02;
                    if (str3 != null) {
                        r5.A0R("affiliate_campaign_id", str3);
                    }
                    String str4 = bbu.A07;
                    if (str4 != null) {
                        r5.A0R("waterfall_id", str4);
                    }
                    String str5 = bbu.A06;
                    if (str5 != null) {
                        r5.A0R(C66579MXk.A00(26), str5);
                    }
                    C62565Khv khv = (C62565Khv) bbu.A01;
                    if (khv != null) {
                        r5.A0R("tag_mode", khv.A00);
                    }
                    r5.A0Z();
                }
            }
            r5.A0Y();
        }
        String str6 = jw0.A03;
        if (str6 != null) {
            r5.A0R("product_collection_id", str6);
        }
        if (jw0.A00 != null) {
            r5.A0q("product_collection");
            C45710D2j.A00(r5, (ProductCollectionImpl) jw0.A00);
        }
        String str7 = jw0.A04;
        if (str7 != null) {
            r5.A0R("shopping_tagging_session_id", str7);
        }
        C41846B3n.A14(r5, jw0.A02);
        r5.A0Z();
    }
}
