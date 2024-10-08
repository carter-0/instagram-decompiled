package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XW7 {
    public static Map A00(C22577YBr yBr) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yBr.Ad0() != null) {
            C21053XCe.A1V(yBr.Ad0(), A1H);
        }
        if (yBr.AdC() != null) {
            C21053XCe.A1Y(yBr.AdC(), A1H);
        }
        if (yBr.Auy() != null) {
            C21053XCe.A1Z(yBr.Auy(), A1H);
        }
        if (yBr.AyE() != null) {
            C21053XCe.A1W(yBr.AyE(), A1H);
        }
        if (yBr.B1i() != null) {
            C41846B3n.A1Q(yBr.B1i(), A1H);
        }
        if (yBr.BCt() != null) {
            C41846B3n.A1O(yBr.BCt(), A1H);
        }
        if (yBr.getId() != null) {
            C41845B3m.A0x(yBr.getId(), A1H);
        }
        String str = null;
        if (yBr.BIV() != null) {
            C46240DRv BIV = yBr.BIV();
            if (BIV != null) {
                treeUpdaterJNI = BIV.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(3401), treeUpdaterJNI);
        }
        if (yBr.CTN() != null) {
            C21053XCe.A1X(yBr.CTN(), A1H);
        }
        if (yBr.CUa() != null) {
            C21053XCe.A1R(yBr.CUa(), A1H);
        }
        if (yBr.CZ9() != null) {
            C21053XCe.A1S(yBr.CZ9(), A1H);
        }
        if (yBr.CcV() != null) {
            C21053XCe.A1U(yBr.CcV(), A1H);
        }
        if (yBr.getMediaType() != null) {
            C21053XCe.A1T(yBr.getMediaType(), A1H);
        }
        if (yBr.Bof() != null) {
            C41846B3n.A1P(yBr.Bof(), A1H);
        }
        if (yBr.Byt() != null) {
            C41846B3n.A1R(yBr.Byt(), A1H);
        }
        if (yBr.Bzj() != null) {
            C21053XCe.A1a(yBr.Bzj(), A1H);
        }
        if (yBr.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yBr.C2V()), A1H);
        }
        if (yBr.C3E() != null) {
            StickerTraySurface C3E = yBr.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yBr.CGX() != null) {
            C41846B3n.A1N(yBr.CGX(), A1H);
        }
        if (yBr.CGt() != null) {
            C41846B3n.A1K(yBr.CGt(), A1H);
        }
        if (yBr.CHS() != null) {
            C41846B3n.A1L(yBr.CHS(), A1H);
        }
        if (yBr.CHZ() != null) {
            C41846B3n.A1M(yBr.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
