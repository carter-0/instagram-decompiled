package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XWF {
    public static Map A00(C22585YBz yBz) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yBz.Ad0() != null) {
            C21053XCe.A1V(yBz.Ad0(), A1H);
        }
        if (yBz.AdC() != null) {
            C21053XCe.A1Y(yBz.AdC(), A1H);
        }
        if (yBz.Auy() != null) {
            C21053XCe.A1Z(yBz.Auy(), A1H);
        }
        if (yBz.AyE() != null) {
            C21053XCe.A1W(yBz.AyE(), A1H);
        }
        if (yBz.B1i() != null) {
            C41846B3n.A1Q(yBz.B1i(), A1H);
        }
        if (yBz.BCt() != null) {
            C41846B3n.A1O(yBz.BCt(), A1H);
        }
        if (yBz.getId() != null) {
            C41845B3m.A0x(yBz.getId(), A1H);
        }
        if (yBz.CTN() != null) {
            C21053XCe.A1X(yBz.CTN(), A1H);
        }
        if (yBz.CUa() != null) {
            C21053XCe.A1R(yBz.CUa(), A1H);
        }
        if (yBz.CZ9() != null) {
            C21053XCe.A1S(yBz.CZ9(), A1H);
        }
        if (yBz.CcV() != null) {
            C21053XCe.A1U(yBz.CcV(), A1H);
        }
        if (yBz.getMediaType() != null) {
            C21053XCe.A1T(yBz.getMediaType(), A1H);
        }
        String str = null;
        if (yBz.Bix() != null) {
            C21045XAz Bix = yBz.Bix();
            if (Bix != null) {
                treeUpdaterJNI = Bix.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(1737), treeUpdaterJNI);
        }
        if (yBz.Bof() != null) {
            C41846B3n.A1P(yBz.Bof(), A1H);
        }
        if (yBz.Byt() != null) {
            C41846B3n.A1R(yBz.Byt(), A1H);
        }
        if (yBz.Bzj() != null) {
            C21053XCe.A1a(yBz.Bzj(), A1H);
        }
        if (yBz.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yBz.C2V()), A1H);
        }
        if (yBz.C3E() != null) {
            StickerTraySurface C3E = yBz.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yBz.CGX() != null) {
            C41846B3n.A1N(yBz.CGX(), A1H);
        }
        if (yBz.CGt() != null) {
            C41846B3n.A1K(yBz.CGt(), A1H);
        }
        if (yBz.CHS() != null) {
            C41846B3n.A1L(yBz.CHS(), A1H);
        }
        if (yBz.CHZ() != null) {
            C41846B3n.A1M(yBz.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
