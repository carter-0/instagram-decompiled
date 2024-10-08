package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XWA {
    public static Map A00(C22580YBu yBu) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yBu.Ad0() != null) {
            C21053XCe.A1V(yBu.Ad0(), A1H);
        }
        if (yBu.AdC() != null) {
            C21053XCe.A1Y(yBu.AdC(), A1H);
        }
        if (yBu.Auy() != null) {
            C21053XCe.A1Z(yBu.Auy(), A1H);
        }
        if (yBu.AyE() != null) {
            C21053XCe.A1W(yBu.AyE(), A1H);
        }
        if (yBu.B1i() != null) {
            C41846B3n.A1Q(yBu.B1i(), A1H);
        }
        if (yBu.BCt() != null) {
            C41846B3n.A1O(yBu.BCt(), A1H);
        }
        if (yBu.getId() != null) {
            C41845B3m.A0x(yBu.getId(), A1H);
        }
        if (yBu.CTN() != null) {
            C21053XCe.A1X(yBu.CTN(), A1H);
        }
        if (yBu.CUa() != null) {
            C21053XCe.A1R(yBu.CUa(), A1H);
        }
        if (yBu.CZ9() != null) {
            C21053XCe.A1S(yBu.CZ9(), A1H);
        }
        if (yBu.CcV() != null) {
            C21053XCe.A1U(yBu.CcV(), A1H);
        }
        if (yBu.getMediaType() != null) {
            C21053XCe.A1T(yBu.getMediaType(), A1H);
        }
        String str = null;
        if (yBu.Bc2() != null) {
            C46256DSl Bc2 = yBu.Bc2();
            if (Bc2 != null) {
                treeUpdaterJNI = Bc2.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(3742), treeUpdaterJNI);
        }
        if (yBu.Bof() != null) {
            C41846B3n.A1P(yBu.Bof(), A1H);
        }
        if (yBu.Byt() != null) {
            C41846B3n.A1R(yBu.Byt(), A1H);
        }
        if (yBu.Bzj() != null) {
            C21053XCe.A1a(yBu.Bzj(), A1H);
        }
        if (yBu.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yBu.C2V()), A1H);
        }
        if (yBu.C3E() != null) {
            StickerTraySurface C3E = yBu.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yBu.CGX() != null) {
            C41846B3n.A1N(yBu.CGX(), A1H);
        }
        if (yBu.CGt() != null) {
            C41846B3n.A1K(yBu.CGt(), A1H);
        }
        if (yBu.CHS() != null) {
            C41846B3n.A1L(yBu.CHS(), A1H);
        }
        if (yBu.CHZ() != null) {
            C41846B3n.A1M(yBu.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
