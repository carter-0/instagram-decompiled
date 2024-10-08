package X;

import com.instagram.model.androidlink.AndroidLink;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CyF  reason: case insensitive filesystem */
public abstract class C45541CyF {
    public static C42028BEd parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            ArrayList arrayList2 = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("android_links".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C41846B3n.A1C(r6, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("dynamic_item_id".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if ("ios_links".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C41846B3n.A1C(r6, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                r6.A0z();
            }
            return new C42028BEd(arrayList, arrayList2, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C42028BEd bEd) {
        r2.A0c();
        List list = bEd.A01;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r2, "android_links", list);
            while (A0s.hasNext()) {
                AndroidLink androidLink = (AndroidLink) A0s.next();
                if (androidLink != null) {
                    C250113kv.A00(r2, androidLink.FES());
                }
            }
            r2.A0Y();
        }
        String str = bEd.A00;
        if (str != null) {
            r2.A0R("dynamic_item_id", str);
        }
        List list2 = bEd.A02;
        if (list2 != null) {
            Iterator A0s2 = C41845B3m.A0s(r2, "ios_links", list2);
            while (A0s2.hasNext()) {
                AndroidLink androidLink2 = (AndroidLink) A0s2.next();
                if (androidLink2 != null) {
                    C250113kv.A00(r2, androidLink2.FES());
                }
            }
            r2.A0Y();
        }
        r2.A0Z();
    }
}
