package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XW2 {
    public static Map A00(C22573YBn yBn) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yBn.Ad0() != null) {
            C21053XCe.A1V(yBn.Ad0(), A1H);
        }
        if (yBn.AdC() != null) {
            C21053XCe.A1Y(yBn.AdC(), A1H);
        }
        if (yBn.Auy() != null) {
            C21053XCe.A1Z(yBn.Auy(), A1H);
        }
        if (yBn.AyE() != null) {
            C21053XCe.A1W(yBn.AyE(), A1H);
        }
        if (yBn.B1i() != null) {
            C41846B3n.A1Q(yBn.B1i(), A1H);
        }
        String str = null;
        if (yBn.B4q() != null) {
            C46261DSq B4q = yBn.B4q();
            if (B4q != null) {
                treeUpdaterJNI = B4q.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(C273654mx.A00(283), treeUpdaterJNI);
        }
        if (yBn.BCt() != null) {
            C41846B3n.A1O(yBn.BCt(), A1H);
        }
        if (yBn.getId() != null) {
            C41845B3m.A0x(yBn.getId(), A1H);
        }
        if (yBn.CTN() != null) {
            C21053XCe.A1X(yBn.CTN(), A1H);
        }
        if (yBn.CUa() != null) {
            C21053XCe.A1R(yBn.CUa(), A1H);
        }
        if (yBn.CZ9() != null) {
            C21053XCe.A1S(yBn.CZ9(), A1H);
        }
        if (yBn.CcV() != null) {
            C21053XCe.A1U(yBn.CcV(), A1H);
        }
        if (yBn.getMediaType() != null) {
            C21053XCe.A1T(yBn.getMediaType(), A1H);
        }
        if (yBn.Bof() != null) {
            C41846B3n.A1P(yBn.Bof(), A1H);
        }
        if (yBn.Byt() != null) {
            C41846B3n.A1R(yBn.Byt(), A1H);
        }
        if (yBn.Bzj() != null) {
            C21053XCe.A1a(yBn.Bzj(), A1H);
        }
        if (yBn.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yBn.C2V()), A1H);
        }
        if (yBn.C3E() != null) {
            StickerTraySurface C3E = yBn.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yBn.CGX() != null) {
            C41846B3n.A1N(yBn.CGX(), A1H);
        }
        if (yBn.CGt() != null) {
            C41846B3n.A1K(yBn.CGt(), A1H);
        }
        if (yBn.CHS() != null) {
            C41846B3n.A1L(yBn.CHS(), A1H);
        }
        if (yBn.CHZ() != null) {
            C41846B3n.A1M(yBn.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
