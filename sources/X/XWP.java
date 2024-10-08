package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XWP {
    public static Map A00(YC8 yc8) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yc8.Ad0() != null) {
            C21053XCe.A1V(yc8.Ad0(), A1H);
        }
        if (yc8.AdC() != null) {
            C21053XCe.A1Y(yc8.AdC(), A1H);
        }
        if (yc8.Auy() != null) {
            C21053XCe.A1Z(yc8.Auy(), A1H);
        }
        if (yc8.AyE() != null) {
            C21053XCe.A1W(yc8.AyE(), A1H);
        }
        if (yc8.B1i() != null) {
            C41846B3n.A1Q(yc8.B1i(), A1H);
        }
        if (yc8.BCt() != null) {
            C41846B3n.A1O(yc8.BCt(), A1H);
        }
        if (yc8.getId() != null) {
            C41845B3m.A0x(yc8.getId(), A1H);
        }
        if (yc8.CTN() != null) {
            C21053XCe.A1X(yc8.CTN(), A1H);
        }
        if (yc8.CUa() != null) {
            C21053XCe.A1R(yc8.CUa(), A1H);
        }
        if (yc8.CZ9() != null) {
            C21053XCe.A1S(yc8.CZ9(), A1H);
        }
        if (yc8.CcV() != null) {
            C21053XCe.A1U(yc8.CcV(), A1H);
        }
        if (yc8.getMediaType() != null) {
            C21053XCe.A1T(yc8.getMediaType(), A1H);
        }
        if (yc8.Bof() != null) {
            C41846B3n.A1P(yc8.Bof(), A1H);
        }
        if (yc8.Byt() != null) {
            C41846B3n.A1R(yc8.Byt(), A1H);
        }
        if (yc8.Bzj() != null) {
            C21053XCe.A1a(yc8.Bzj(), A1H);
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (yc8.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yc8.C2V()), A1H);
        }
        if (yc8.C3E() != null) {
            StickerTraySurface C3E = yc8.C3E();
            if (C3E != null) {
                str = C3E.A00;
            } else {
                str = null;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yc8.CFz() != null) {
            DUV CFz = yc8.CFz();
            if (CFz != null) {
                treeUpdaterJNI = CFz.FHC();
            }
            A1H.put(C273654mx.A00(429), treeUpdaterJNI);
        }
        if (yc8.CGX() != null) {
            C41846B3n.A1N(yc8.CGX(), A1H);
        }
        if (yc8.CGt() != null) {
            C41846B3n.A1K(yc8.CGt(), A1H);
        }
        if (yc8.CHS() != null) {
            C41846B3n.A1L(yc8.CHS(), A1H);
        }
        if (yc8.CHZ() != null) {
            C41846B3n.A1M(yc8.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
