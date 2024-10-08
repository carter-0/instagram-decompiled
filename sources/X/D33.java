package X;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public abstract class D33 {
    /* JADX WARNING: type inference failed for: r0v48, types: [X.3xe, java.lang.Object] */
    public static DDv parseFromJson(16F r7) {
        C270044g6 r0;
        0qQ.A0B(r7, 0);
        try {
            DDv dDv = new DDv();
            16L A11 = r7.A11();
            16L r2 = 16L.A0D;
            if (A11 != r2) {
                r7.A0z();
                return null;
            }
            while (true) {
                16L A1J = r7.A1J();
                16L r5 = 16L.A09;
                if (A1J == r5) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r7);
                HashMap hashMap = null;
                if ("bloks_app".equals(A17)) {
                    dDv.A06 = AnonymousClass7TG.A0l(r7);
                } else if ("show_tooltip_count".equals(A17)) {
                    dDv.A00 = r7.A1D();
                } else if (C41845B3m.A17(A17)) {
                    dDv.A09 = AnonymousClass7TG.A0l(r7);
                } else if ("bloks_data".equals(A17)) {
                    if (11Z.A07()) {
                        0wb.A01(0kg.A0A, "BloksRenderResponse", "BloksRenderResponse is being parsed on the UI thread, move this to a background thread");
                    }
                    C61081JwJ parseFromJson = Ci2.parseFromJson(r7);
                    String str = parseFromJson.A01;
                    ? obj = new Object();
                    obj.A00 = (R9S) parseFromJson.A00;
                    obj.A01 = str;
                    dDv.A03 = obj;
                } else if ("bloks_parameters".equals(A17)) {
                    if (r7.A11() == r2) {
                        hashMap = AnonymousClass7TE.A1E();
                        while (r7.A1J() != r5) {
                            C41847B3o.A1M(r7, hashMap);
                        }
                    }
                    0qQ.A0B(hashMap, 0);
                    dDv.A0A = hashMap;
                } else if ("bloks_sticker_type".equals(A17)) {
                    dDv.A07 = AnonymousClass7TG.A0l(r7);
                } else if ("nux_tooltip_text".equals(A17)) {
                    dDv.A08 = AnonymousClass7TG.A0l(r7);
                } else if ("action_tooltip_text".equals(A17)) {
                    dDv.A05 = AnonymousClass7TG.A0l(r7);
                } else if ("ring_spec".equals(A17)) {
                    dDv.A01 = C45620CzW.parseFromJson(r7);
                } else if ("ring_glyph".equals(A17)) {
                    dDv.A04 = D2M.parseFromJson(r7);
                } else if ("sticker_specific_sharing_info".equals(A17)) {
                    if (r7.A11() == r2) {
                        hashMap = AnonymousClass7TE.A1E();
                        while (r7.A1J() != r5) {
                            C41847B3o.A1M(r7, hashMap);
                        }
                    }
                    0qQ.A0B(hashMap, 0);
                    dDv.A0B = hashMap;
                } else if ("sticker_specific_sharing_json_objects".equals(A17)) {
                    if (r7.A11() == r2) {
                        hashMap = AnonymousClass7TE.A1E();
                        while (r7.A1J() != r5) {
                            C41847B3o.A1M(r7, hashMap);
                        }
                    }
                    0qQ.A0B(hashMap, 0);
                    dDv.A0C = hashMap;
                } else if ("should_preload".equals(A17)) {
                    dDv.A0D = r7.A0d();
                }
                r7.A0z();
            }
            C257593xe r02 = dDv.A03;
            if (r02 != null) {
                r0 = Ci1.A00(r02);
            } else {
                r0 = null;
            }
            dDv.A02 = r0;
            return dDv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, DDv dDv) {
        r3.A0c();
        String str = dDv.A06;
        if (str != null) {
            r3.A0R("bloks_app", str);
        }
        r3.A0P("show_tooltip_count", dDv.A00);
        C41846B3n.A0y(r3, dDv.A09);
        if (dDv.A03 != null) {
            r3.A0q("bloks_data");
            C45662D0m.A00(r3, dDv.A03);
        }
        if (dDv.A0A != null) {
            r3.A0q("bloks_parameters");
            r3.A0c();
            Iterator A0s = AnonymousClass7TF.A0s(dDv.A0A);
            while (A0s.hasNext()) {
                C41847B3o.A1K(r3, A0s);
            }
            r3.A0Z();
        }
        String str2 = dDv.A07;
        if (str2 != null) {
            r3.A0R("bloks_sticker_type", str2);
        }
        String str3 = dDv.A08;
        if (str3 != null) {
            r3.A0R("nux_tooltip_text", str3);
        }
        String str4 = dDv.A05;
        if (str4 != null) {
            r3.A0R("action_tooltip_text", str4);
        }
        if (dDv.A01 != null) {
            r3.A0q("ring_spec");
            C45620CzW.A00(r3, dDv.A01);
        }
        if (dDv.A04 != null) {
            r3.A0q("ring_glyph");
            D2M.A00(r3, dDv.A04, true);
        }
        if (dDv.A0B != null) {
            r3.A0q("sticker_specific_sharing_info");
            r3.A0c();
            Iterator A0s2 = AnonymousClass7TF.A0s(dDv.A0B);
            while (A0s2.hasNext()) {
                C41847B3o.A1K(r3, A0s2);
            }
            r3.A0Z();
        }
        if (dDv.A0C != null) {
            r3.A0q("sticker_specific_sharing_json_objects");
            r3.A0c();
            Iterator A0s3 = AnonymousClass7TF.A0s(dDv.A0C);
            while (A0s3.hasNext()) {
                C41847B3o.A1K(r3, A0s3);
            }
            r3.A0Z();
        }
        r3.A0S("should_preload", dDv.A0D);
        r3.A0Z();
    }
}
