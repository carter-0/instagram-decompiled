package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.4ot  reason: invalid class name and case insensitive filesystem */
public abstract class C274684ot {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.4ou, java.lang.Object] */
    public static C274694ou parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                String str = null;
                if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A05 = str;
                } else if ("payload".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A03 = str;
                } else if ("is_default".equals(A0q)) {
                    obj.A00 = Boolean.valueOf(r4.A0d());
                } else if ("vertical".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A06 = str;
                } else if ("subvertical".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A04 = str;
                } else if ("ib_id".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A02 = str;
                } else if ("ib_cta_type".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A01 = str;
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C274694ou r3) {
        r2.A0c();
        String str = r3.A05;
        if (str != null) {
            r2.A0R(DialogModule.KEY_TITLE, str);
        }
        String str2 = r3.A03;
        if (str2 != null) {
            r2.A0R("payload", str2);
        }
        Boolean bool = r3.A00;
        if (bool != null) {
            r2.A0S("is_default", bool.booleanValue());
        }
        String str3 = r3.A06;
        if (str3 != null) {
            r2.A0R("vertical", str3);
        }
        String str4 = r3.A04;
        if (str4 != null) {
            r2.A0R("subvertical", str4);
        }
        String str5 = r3.A02;
        if (str5 != null) {
            r2.A0R("ib_id", str5);
        }
        String str6 = r3.A01;
        if (str6 != null) {
            r2.A0R("ib_cta_type", str6);
        }
        r2.A0Z();
    }
}
