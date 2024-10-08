package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.model.shopping.reels.ProductStickerIntf;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XWD {
    public static Map A00(C22583YBx yBx) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yBx.Ad0() != null) {
            C21053XCe.A1V(yBx.Ad0(), A1H);
        }
        if (yBx.AdC() != null) {
            C21053XCe.A1Y(yBx.AdC(), A1H);
        }
        if (yBx.Auy() != null) {
            C21053XCe.A1Z(yBx.Auy(), A1H);
        }
        if (yBx.AyE() != null) {
            C21053XCe.A1W(yBx.AyE(), A1H);
        }
        if (yBx.B1i() != null) {
            C41846B3n.A1Q(yBx.B1i(), A1H);
        }
        if (yBx.BCt() != null) {
            C41846B3n.A1O(yBx.BCt(), A1H);
        }
        if (yBx.getId() != null) {
            C41845B3m.A0x(yBx.getId(), A1H);
        }
        if (yBx.CTN() != null) {
            C21053XCe.A1X(yBx.CTN(), A1H);
        }
        if (yBx.CUa() != null) {
            C21053XCe.A1R(yBx.CUa(), A1H);
        }
        if (yBx.CZ9() != null) {
            C21053XCe.A1S(yBx.CZ9(), A1H);
        }
        if (yBx.CcV() != null) {
            C21053XCe.A1U(yBx.CcV(), A1H);
        }
        if (yBx.getMediaType() != null) {
            C21053XCe.A1T(yBx.getMediaType(), A1H);
        }
        String str = null;
        if (yBx.BgS() != null) {
            ProductStickerIntf BgS = yBx.BgS();
            if (BgS != null) {
                treeUpdaterJNI = BgS.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(3791), treeUpdaterJNI);
        }
        if (yBx.Bof() != null) {
            C41846B3n.A1P(yBx.Bof(), A1H);
        }
        if (yBx.Byt() != null) {
            C41846B3n.A1R(yBx.Byt(), A1H);
        }
        if (yBx.Bzj() != null) {
            C21053XCe.A1a(yBx.Bzj(), A1H);
        }
        if (yBx.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yBx.C2V()), A1H);
        }
        if (yBx.C3E() != null) {
            StickerTraySurface C3E = yBx.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yBx.CGX() != null) {
            C41846B3n.A1N(yBx.CGX(), A1H);
        }
        if (yBx.CGt() != null) {
            C41846B3n.A1K(yBx.CGt(), A1H);
        }
        if (yBx.CHS() != null) {
            C41846B3n.A1L(yBx.CHS(), A1H);
        }
        if (yBx.CHZ() != null) {
            C41846B3n.A1M(yBx.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
