package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XVq {
    public static Map A00(C22564YBe yBe) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yBe.Ad0() != null) {
            C21053XCe.A1V(yBe.Ad0(), A1H);
        }
        if (yBe.AdC() != null) {
            C21053XCe.A1Y(yBe.AdC(), A1H);
        }
        if (yBe.Auy() != null) {
            C21053XCe.A1Z(yBe.Auy(), A1H);
        }
        if (yBe.AyE() != null) {
            C21053XCe.A1W(yBe.AyE(), A1H);
        }
        if (yBe.B1i() != null) {
            C41846B3n.A1Q(yBe.B1i(), A1H);
        }
        if (yBe.BCt() != null) {
            C41846B3n.A1O(yBe.BCt(), A1H);
        }
        if (yBe.getId() != null) {
            C41845B3m.A0x(yBe.getId(), A1H);
        }
        if (yBe.CTN() != null) {
            C21053XCe.A1X(yBe.CTN(), A1H);
        }
        if (yBe.CUa() != null) {
            C21053XCe.A1R(yBe.CUa(), A1H);
        }
        if (yBe.CZ9() != null) {
            C21053XCe.A1S(yBe.CZ9(), A1H);
        }
        if (yBe.CcV() != null) {
            C21053XCe.A1U(yBe.CcV(), A1H);
        }
        if (yBe.getMediaType() != null) {
            C21053XCe.A1T(yBe.getMediaType(), A1H);
        }
        String str = null;
        if (yBe.BiD() != null) {
            DS2 BiD = yBe.BiD();
            if (BiD != null) {
                treeUpdaterJNI = BiD.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(C273654mx.A00(179), treeUpdaterJNI);
        }
        if (yBe.Bof() != null) {
            C41846B3n.A1P(yBe.Bof(), A1H);
        }
        if (yBe.Byt() != null) {
            C41846B3n.A1R(yBe.Byt(), A1H);
        }
        if (yBe.Bzj() != null) {
            C21053XCe.A1a(yBe.Bzj(), A1H);
        }
        if (yBe.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yBe.C2V()), A1H);
        }
        if (yBe.C3E() != null) {
            StickerTraySurface C3E = yBe.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yBe.CGX() != null) {
            C41846B3n.A1N(yBe.CGX(), A1H);
        }
        if (yBe.CGt() != null) {
            C41846B3n.A1K(yBe.CGt(), A1H);
        }
        if (yBe.CHS() != null) {
            C41846B3n.A1L(yBe.CHS(), A1H);
        }
        if (yBe.CHZ() != null) {
            C41846B3n.A1M(yBe.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
