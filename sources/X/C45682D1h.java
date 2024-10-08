package X;

import com.instagram.model.shopping.clips.ClipsShoppingCTABar;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.D1h  reason: case insensitive filesystem */
public abstract class C45682D1h {
    public static ClipsShoppingCTABar parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            Float f = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            ArrayList arrayList = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("animation_time_sec".equals(A17)) {
                    f = AnonymousClass7TF.A0U(r13);
                } else if ("cta_bar_type".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("destination".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("dominant_color".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                } else if ("dwell_time_sec".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r13);
                } else if ("product_names".equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r13, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C41845B3m.A1L(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r13.A1P();
                    }
                } else if ("toggled_destination".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r13.A1P();
                    }
                } else if ("toggled_title".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r13.A1P();
                    }
                }
                r13.A0z();
            }
            return new ClipsShoppingCTABar(f, num, str, str2, str3, str4, str5, str6, str7, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, ClipsShoppingCTABar clipsShoppingCTABar) {
        r2.A0c();
        Float f = clipsShoppingCTABar.A00;
        if (f != null) {
            r2.A0O("animation_time_sec", f.floatValue());
        }
        String str = clipsShoppingCTABar.A02;
        if (str != null) {
            r2.A0R("cta_bar_type", str);
        }
        String str2 = clipsShoppingCTABar.A03;
        if (str2 != null) {
            r2.A0R("destination", str2);
        }
        String str3 = clipsShoppingCTABar.A04;
        if (str3 != null) {
            r2.A0R("dominant_color", str3);
        }
        Integer num = clipsShoppingCTABar.A01;
        if (num != null) {
            r2.A0P("dwell_time_sec", num.intValue());
        }
        List list = clipsShoppingCTABar.A09;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r2, "product_names", list);
            while (A0s.hasNext()) {
                C41846B3n.A18(r2, A0s);
            }
            r2.A0Y();
        }
        String str4 = clipsShoppingCTABar.A05;
        if (str4 != null) {
            r2.A0R("subtitle", str4);
        }
        C41846B3n.A10(r2, clipsShoppingCTABar.A06);
        String str5 = clipsShoppingCTABar.A07;
        if (str5 != null) {
            r2.A0R("toggled_destination", str5);
        }
        String str6 = clipsShoppingCTABar.A08;
        if (str6 != null) {
            r2.A0R("toggled_title", str6);
        }
        r2.A0Z();
    }
}
