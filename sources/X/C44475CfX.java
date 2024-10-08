package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CfX  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44475CfX {
    public static Map A00(DV2 dv2) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dv2.Ad0() != null) {
            A1H.put("attribution", dv2.Ad0());
        }
        if (dv2.B1i() != null) {
            C41846B3n.A1Q(dv2.B1i(), A1H);
        }
        if (dv2.BCt() != null) {
            C41846B3n.A1O(dv2.BCt(), A1H);
        }
        if (dv2.CTN() != null) {
            A1H.put("is_fb_sticker", dv2.CTN());
        }
        if (dv2.CUa() != null) {
            A1H.put("is_hidden", dv2.CUa());
        }
        if (dv2.CZ9() != null) {
            A1H.put("is_pinned", dv2.CZ9());
        }
        if (dv2.CcV() != null) {
            A1H.put("is_sticker", dv2.CcV());
        }
        if (dv2.Bof() != null) {
            C41846B3n.A1P(dv2.Bof(), A1H);
        }
        if (dv2.Byt() != null) {
            C41846B3n.A1R(dv2.Byt(), A1H);
        }
        if (dv2.CGS() != null) {
            DSB CGS = dv2.CGS();
            if (CGS != null) {
                treeUpdaterJNI = CGS.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("whatsapp_sticker", treeUpdaterJNI);
        }
        if (dv2.CGX() != null) {
            C41846B3n.A1N(dv2.CGX(), A1H);
        }
        if (dv2.CGt() != null) {
            C41846B3n.A1K(dv2.CGt(), A1H);
        }
        if (dv2.CHS() != null) {
            C41846B3n.A1L(dv2.CHS(), A1H);
        }
        if (dv2.CHZ() != null) {
            C41846B3n.A1M(dv2.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
