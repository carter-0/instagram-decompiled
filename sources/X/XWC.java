package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XWC {
    public static Map A00(C22582YBw yBw) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yBw.Ad0() != null) {
            C21053XCe.A1V(yBw.Ad0(), A1H);
        }
        if (yBw.AdC() != null) {
            C21053XCe.A1Y(yBw.AdC(), A1H);
        }
        if (yBw.Auy() != null) {
            C21053XCe.A1Z(yBw.Auy(), A1H);
        }
        if (yBw.AyE() != null) {
            C21053XCe.A1W(yBw.AyE(), A1H);
        }
        if (yBw.B1i() != null) {
            C41846B3n.A1Q(yBw.B1i(), A1H);
        }
        if (yBw.BCt() != null) {
            C41846B3n.A1O(yBw.BCt(), A1H);
        }
        if (yBw.getId() != null) {
            C41845B3m.A0x(yBw.getId(), A1H);
        }
        if (yBw.CTN() != null) {
            C21053XCe.A1X(yBw.CTN(), A1H);
        }
        if (yBw.CUa() != null) {
            C21053XCe.A1R(yBw.CUa(), A1H);
        }
        if (yBw.CZ9() != null) {
            C21053XCe.A1S(yBw.CZ9(), A1H);
        }
        if (yBw.CcV() != null) {
            C21053XCe.A1U(yBw.CcV(), A1H);
        }
        if (yBw.getMediaType() != null) {
            C21053XCe.A1T(yBw.getMediaType(), A1H);
        }
        String str = null;
        if (yBw.BdX() != null) {
            C272034jz BdX = yBw.BdX();
            if (BdX != null) {
                treeUpdaterJNI = BdX.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(5123), treeUpdaterJNI);
        }
        if (yBw.Bof() != null) {
            C41846B3n.A1P(yBw.Bof(), A1H);
        }
        if (yBw.Byt() != null) {
            C41846B3n.A1R(yBw.Byt(), A1H);
        }
        if (yBw.Bzj() != null) {
            C21053XCe.A1a(yBw.Bzj(), A1H);
        }
        if (yBw.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yBw.C2V()), A1H);
        }
        if (yBw.C3E() != null) {
            StickerTraySurface C3E = yBw.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yBw.CGX() != null) {
            C41846B3n.A1N(yBw.CGX(), A1H);
        }
        if (yBw.CGt() != null) {
            C41846B3n.A1K(yBw.CGt(), A1H);
        }
        if (yBw.CHS() != null) {
            C41846B3n.A1L(yBw.CHS(), A1H);
        }
        if (yBw.CHZ() != null) {
            C41846B3n.A1M(yBw.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
