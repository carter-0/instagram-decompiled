package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.model.shopping.reels.MultiProductStickerIntf;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XW8 {
    public static Map A00(C22578YBs yBs) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yBs.Ad0() != null) {
            C21053XCe.A1V(yBs.Ad0(), A1H);
        }
        if (yBs.AdC() != null) {
            C21053XCe.A1Y(yBs.AdC(), A1H);
        }
        if (yBs.Auy() != null) {
            C21053XCe.A1Z(yBs.Auy(), A1H);
        }
        if (yBs.AyE() != null) {
            C21053XCe.A1W(yBs.AyE(), A1H);
        }
        if (yBs.B1i() != null) {
            C41846B3n.A1Q(yBs.B1i(), A1H);
        }
        if (yBs.BCt() != null) {
            C41846B3n.A1O(yBs.BCt(), A1H);
        }
        if (yBs.getId() != null) {
            C41845B3m.A0x(yBs.getId(), A1H);
        }
        if (yBs.CTN() != null) {
            C21053XCe.A1X(yBs.CTN(), A1H);
        }
        if (yBs.CUa() != null) {
            C21053XCe.A1R(yBs.CUa(), A1H);
        }
        if (yBs.CZ9() != null) {
            C21053XCe.A1S(yBs.CZ9(), A1H);
        }
        if (yBs.CcV() != null) {
            C21053XCe.A1U(yBs.CcV(), A1H);
        }
        if (yBs.getMediaType() != null) {
            C21053XCe.A1T(yBs.getMediaType(), A1H);
        }
        String str = null;
        if (yBs.BUe() != null) {
            MultiProductStickerIntf BUe = yBs.BUe();
            if (BUe != null) {
                treeUpdaterJNI = BUe.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(3612), treeUpdaterJNI);
        }
        if (yBs.Bof() != null) {
            C41846B3n.A1P(yBs.Bof(), A1H);
        }
        if (yBs.Byt() != null) {
            C41846B3n.A1R(yBs.Byt(), A1H);
        }
        if (yBs.Bzj() != null) {
            C21053XCe.A1a(yBs.Bzj(), A1H);
        }
        if (yBs.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yBs.C2V()), A1H);
        }
        if (yBs.C3E() != null) {
            StickerTraySurface C3E = yBs.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yBs.CGX() != null) {
            C41846B3n.A1N(yBs.CGX(), A1H);
        }
        if (yBs.CGt() != null) {
            C41846B3n.A1K(yBs.CGt(), A1H);
        }
        if (yBs.CHS() != null) {
            C41846B3n.A1L(yBs.CHS(), A1H);
        }
        if (yBs.CHZ() != null) {
            C41846B3n.A1M(yBs.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
