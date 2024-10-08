package X;

import java.util.List;

/* renamed from: X.Vwv  reason: case insensitive filesystem */
public final class C18697Vwv {
    public static final Long A00(String str) {
        List A18;
        String str2;
        if (str == null || (A18 = DbV.A18(str, "_")) == null || (str2 = (String) 00k.A0J(A18)) == null) {
            return null;
        }
        return AnonymousClass7TE.A10(str2);
    }

    public static void A01(0Aj r2, String str) {
        Long A00 = A00(str);
        if (r2.isSampled() && A00 != null) {
            r2.A9F("media_id", A00);
            r2.AAJ("entrypoint", "media_edit");
            r2.Cgf();
        }
    }
}
