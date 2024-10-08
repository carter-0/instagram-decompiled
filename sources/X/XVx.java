package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XVx {
    public static Map A00(C22569YBj yBj) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yBj.Ad0() != null) {
            C21053XCe.A1V(yBj.Ad0(), A1H);
        }
        if (yBj.AdC() != null) {
            C21053XCe.A1Y(yBj.AdC(), A1H);
        }
        String str = null;
        if (yBj.Arg() != null) {
            DV4 Arg = yBj.Arg();
            if (Arg != null) {
                treeUpdaterJNI = Arg.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(572), treeUpdaterJNI);
        }
        if (yBj.Auy() != null) {
            C21053XCe.A1Z(yBj.Auy(), A1H);
        }
        if (yBj.AyE() != null) {
            C21053XCe.A1W(yBj.AyE(), A1H);
        }
        if (yBj.B1i() != null) {
            C41846B3n.A1Q(yBj.B1i(), A1H);
        }
        if (yBj.BCt() != null) {
            C41846B3n.A1O(yBj.BCt(), A1H);
        }
        if (yBj.getId() != null) {
            C41845B3m.A0x(yBj.getId(), A1H);
        }
        if (yBj.CTN() != null) {
            C21053XCe.A1X(yBj.CTN(), A1H);
        }
        if (yBj.CUa() != null) {
            C21053XCe.A1R(yBj.CUa(), A1H);
        }
        if (yBj.CZ9() != null) {
            C21053XCe.A1S(yBj.CZ9(), A1H);
        }
        if (yBj.CcV() != null) {
            C21053XCe.A1U(yBj.CcV(), A1H);
        }
        if (yBj.getMediaType() != null) {
            C21053XCe.A1T(yBj.getMediaType(), A1H);
        }
        if (yBj.Bof() != null) {
            C41846B3n.A1P(yBj.Bof(), A1H);
        }
        if (yBj.Byt() != null) {
            C41846B3n.A1R(yBj.Byt(), A1H);
        }
        if (yBj.Bzj() != null) {
            C21053XCe.A1a(yBj.Bzj(), A1H);
        }
        if (yBj.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yBj.C2V()), A1H);
        }
        if (yBj.C3E() != null) {
            StickerTraySurface C3E = yBj.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yBj.CGX() != null) {
            C41846B3n.A1N(yBj.CGX(), A1H);
        }
        if (yBj.CGt() != null) {
            C41846B3n.A1K(yBj.CGt(), A1H);
        }
        if (yBj.CHS() != null) {
            C41846B3n.A1L(yBj.CHS(), A1H);
        }
        if (yBj.CHZ() != null) {
            C41846B3n.A1M(yBj.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
