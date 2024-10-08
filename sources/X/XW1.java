package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XW1 {
    public static Map A00(C22572YBm yBm) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yBm.Ad0() != null) {
            C21053XCe.A1V(yBm.Ad0(), A1H);
        }
        if (yBm.AdC() != null) {
            C21053XCe.A1Y(yBm.AdC(), A1H);
        }
        if (yBm.Auy() != null) {
            C21053XCe.A1Z(yBm.Auy(), A1H);
        }
        if (yBm.AyE() != null) {
            C21053XCe.A1W(yBm.AyE(), A1H);
        }
        if (yBm.B1i() != null) {
            C41846B3n.A1Q(yBm.B1i(), A1H);
        }
        String str = null;
        if (yBm.B4Y() != null) {
            DUB B4Y = yBm.B4Y();
            if (B4Y != null) {
                treeUpdaterJNI = B4Y.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(1346), treeUpdaterJNI);
        }
        if (yBm.BCt() != null) {
            C41846B3n.A1O(yBm.BCt(), A1H);
        }
        if (yBm.getId() != null) {
            C41845B3m.A0x(yBm.getId(), A1H);
        }
        if (yBm.CTN() != null) {
            C21053XCe.A1X(yBm.CTN(), A1H);
        }
        if (yBm.CUa() != null) {
            C21053XCe.A1R(yBm.CUa(), A1H);
        }
        if (yBm.CZ9() != null) {
            C21053XCe.A1S(yBm.CZ9(), A1H);
        }
        if (yBm.CcV() != null) {
            C21053XCe.A1U(yBm.CcV(), A1H);
        }
        if (yBm.getMediaType() != null) {
            C21053XCe.A1T(yBm.getMediaType(), A1H);
        }
        if (yBm.Bof() != null) {
            C41846B3n.A1P(yBm.Bof(), A1H);
        }
        if (yBm.Byt() != null) {
            C41846B3n.A1R(yBm.Byt(), A1H);
        }
        if (yBm.Bzj() != null) {
            C21053XCe.A1a(yBm.Bzj(), A1H);
        }
        if (yBm.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yBm.C2V()), A1H);
        }
        if (yBm.C3E() != null) {
            StickerTraySurface C3E = yBm.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yBm.CGX() != null) {
            C41846B3n.A1N(yBm.CGX(), A1H);
        }
        if (yBm.CGt() != null) {
            C41846B3n.A1K(yBm.CGt(), A1H);
        }
        if (yBm.CHS() != null) {
            C41846B3n.A1L(yBm.CHS(), A1H);
        }
        if (yBm.CHZ() != null) {
            C41846B3n.A1M(yBm.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
