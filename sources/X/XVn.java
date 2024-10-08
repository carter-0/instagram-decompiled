package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XVn {
    public static Map A00(C22562YBc yBc) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yBc.Ad0() != null) {
            C21053XCe.A1V(yBc.Ad0(), A1H);
        }
        if (yBc.AdC() != null) {
            C21053XCe.A1Y(yBc.AdC(), A1H);
        }
        if (yBc.Auy() != null) {
            C21053XCe.A1Z(yBc.Auy(), A1H);
        }
        if (yBc.AyE() != null) {
            C21053XCe.A1W(yBc.AyE(), A1H);
        }
        if (yBc.B1i() != null) {
            C41846B3n.A1Q(yBc.B1i(), A1H);
        }
        if (yBc.BCt() != null) {
            C41846B3n.A1O(yBc.BCt(), A1H);
        }
        if (yBc.getId() != null) {
            C41845B3m.A0x(yBc.getId(), A1H);
        }
        if (yBc.CTN() != null) {
            C21053XCe.A1X(yBc.CTN(), A1H);
        }
        if (yBc.CUa() != null) {
            C21053XCe.A1R(yBc.CUa(), A1H);
        }
        if (yBc.CZ9() != null) {
            C21053XCe.A1S(yBc.CZ9(), A1H);
        }
        if (yBc.CcV() != null) {
            C21053XCe.A1U(yBc.CcV(), A1H);
        }
        String str = null;
        if (yBc.BJo() != null) {
            C46297DUa BJo = yBc.BJo();
            if (BJo != null) {
                treeUpdaterJNI = BJo.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(3480), treeUpdaterJNI);
        }
        if (yBc.getMediaType() != null) {
            C21053XCe.A1T(yBc.getMediaType(), A1H);
        }
        if (yBc.Bof() != null) {
            C41846B3n.A1P(yBc.Bof(), A1H);
        }
        if (yBc.Byt() != null) {
            C41846B3n.A1R(yBc.Byt(), A1H);
        }
        if (yBc.Bzj() != null) {
            C21053XCe.A1a(yBc.Bzj(), A1H);
        }
        if (yBc.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yBc.C2V()), A1H);
        }
        if (yBc.C3E() != null) {
            StickerTraySurface C3E = yBc.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yBc.CGX() != null) {
            C41846B3n.A1N(yBc.CGX(), A1H);
        }
        if (yBc.CGt() != null) {
            C41846B3n.A1K(yBc.CGt(), A1H);
        }
        if (yBc.CHS() != null) {
            C41846B3n.A1L(yBc.CHS(), A1H);
        }
        if (yBc.CHZ() != null) {
            C41846B3n.A1M(yBc.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
