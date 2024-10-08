package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XW4 {
    public static Map A00(C22575YBp yBp) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yBp.Ad0() != null) {
            C21053XCe.A1V(yBp.Ad0(), A1H);
        }
        if (yBp.AdC() != null) {
            C21053XCe.A1Y(yBp.AdC(), A1H);
        }
        if (yBp.Auy() != null) {
            C21053XCe.A1Z(yBp.Auy(), A1H);
        }
        if (yBp.AyE() != null) {
            C21053XCe.A1W(yBp.AyE(), A1H);
        }
        if (yBp.B1i() != null) {
            C41846B3n.A1Q(yBp.B1i(), A1H);
        }
        String str = null;
        if (yBp.B8Y() != null) {
            AnonymousClass8YG B8Y = yBp.B8Y();
            if (B8Y != null) {
                treeUpdaterJNI = B8Y.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(3175), treeUpdaterJNI);
        }
        if (yBp.BCt() != null) {
            C41846B3n.A1O(yBp.BCt(), A1H);
        }
        if (yBp.getId() != null) {
            C41845B3m.A0x(yBp.getId(), A1H);
        }
        if (yBp.CTN() != null) {
            C21053XCe.A1X(yBp.CTN(), A1H);
        }
        if (yBp.CUa() != null) {
            C21053XCe.A1R(yBp.CUa(), A1H);
        }
        if (yBp.CZ9() != null) {
            C21053XCe.A1S(yBp.CZ9(), A1H);
        }
        if (yBp.CcV() != null) {
            C21053XCe.A1U(yBp.CcV(), A1H);
        }
        if (yBp.getMediaType() != null) {
            C21053XCe.A1T(yBp.getMediaType(), A1H);
        }
        if (yBp.Bof() != null) {
            C41846B3n.A1P(yBp.Bof(), A1H);
        }
        if (yBp.Byt() != null) {
            C41846B3n.A1R(yBp.Byt(), A1H);
        }
        if (yBp.Bzj() != null) {
            C21053XCe.A1a(yBp.Bzj(), A1H);
        }
        if (yBp.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yBp.C2V()), A1H);
        }
        if (yBp.C3E() != null) {
            StickerTraySurface C3E = yBp.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yBp.CGX() != null) {
            C41846B3n.A1N(yBp.CGX(), A1H);
        }
        if (yBp.CGt() != null) {
            C41846B3n.A1K(yBp.CGt(), A1H);
        }
        if (yBp.CHS() != null) {
            C41846B3n.A1L(yBp.CHS(), A1H);
        }
        if (yBp.CHZ() != null) {
            C41846B3n.A1M(yBp.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
