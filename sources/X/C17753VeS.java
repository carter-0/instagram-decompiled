package X;

import java.util.HashMap;

/* renamed from: X.VeS  reason: case insensitive filesystem */
public final class C17753VeS {
    public final 1Ln A00(0wc r5, C16655Uyr uyr, String str, String str2, boolean z) {
        HashMap hashMap = new HashMap();
        if (uyr != null) {
            hashMap.put("preference", AnonymousClass7TF.A0j(DbT.A10(uyr)));
        }
        if (str2 == null) {
            if (z) {
                str2 = "BPAT";
            } else {
                str2 = "FBAT";
            }
        }
        hashMap.put("token_info", str2);
        hashMap.put("has_permission", String.valueOf(z));
        1Ln r2 = new 1Ln(AnonymousClass7TE.A0e(r5, "fulcrum_event"), 154);
        r2.A0l(str);
        r2.A00.A9H("selected_values", hashMap);
        return r2;
    }
}
