package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XWO {
    public static Map A00(YC7 yc7) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yc7.Ad0() != null) {
            C21053XCe.A1V(yc7.Ad0(), A1H);
        }
        if (yc7.AdC() != null) {
            C21053XCe.A1Y(yc7.AdC(), A1H);
        }
        if (yc7.Auy() != null) {
            C21053XCe.A1Z(yc7.Auy(), A1H);
        }
        if (yc7.AyE() != null) {
            C21053XCe.A1W(yc7.AyE(), A1H);
        }
        if (yc7.B1i() != null) {
            C41846B3n.A1Q(yc7.B1i(), A1H);
        }
        if (yc7.BCt() != null) {
            C41846B3n.A1O(yc7.BCt(), A1H);
        }
        if (yc7.getId() != null) {
            C41845B3m.A0x(yc7.getId(), A1H);
        }
        if (yc7.CTN() != null) {
            C21053XCe.A1X(yc7.CTN(), A1H);
        }
        if (yc7.CUa() != null) {
            C21053XCe.A1R(yc7.CUa(), A1H);
        }
        if (yc7.CZ9() != null) {
            C21053XCe.A1S(yc7.CZ9(), A1H);
        }
        if (yc7.CcV() != null) {
            C21053XCe.A1U(yc7.CcV(), A1H);
        }
        if (yc7.getMediaType() != null) {
            C21053XCe.A1T(yc7.getMediaType(), A1H);
        }
        if (yc7.Bof() != null) {
            C41846B3n.A1P(yc7.Bof(), A1H);
        }
        if (yc7.Byt() != null) {
            C41846B3n.A1R(yc7.Byt(), A1H);
        }
        if (yc7.Bzj() != null) {
            C21053XCe.A1a(yc7.Bzj(), A1H);
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (yc7.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yc7.C2V()), A1H);
        }
        if (yc7.C3E() != null) {
            StickerTraySurface C3E = yc7.C3E();
            if (C3E != null) {
                str = C3E.A00;
            } else {
                str = null;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yc7.C5f() != null) {
            C46318DUv C5f = yc7.C5f();
            if (C5f != null) {
                treeUpdaterJNI = C5f.FHC();
            }
            A1H.put(AnonymousClass000.A00(379), treeUpdaterJNI);
        }
        if (yc7.CGX() != null) {
            C41846B3n.A1N(yc7.CGX(), A1H);
        }
        if (yc7.CGt() != null) {
            C41846B3n.A1K(yc7.CGt(), A1H);
        }
        if (yc7.CHS() != null) {
            C41846B3n.A1L(yc7.CHS(), A1H);
        }
        if (yc7.CHZ() != null) {
            C41846B3n.A1M(yc7.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
