package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.XVw  reason: case insensitive filesystem */
public abstract /* synthetic */ class C21323XVw {
    public static Map A00(C22568YBi yBi) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yBi.Ad0() != null) {
            C21053XCe.A1V(yBi.Ad0(), A1H);
        }
        if (yBi.AdC() != null) {
            C21053XCe.A1Y(yBi.AdC(), A1H);
        }
        String str = null;
        if (yBi.Amc() != null) {
            C21039XAs Amc = yBi.Amc();
            if (Amc != null) {
                treeUpdaterJNI = Amc.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(2778), treeUpdaterJNI);
        }
        if (yBi.Auy() != null) {
            C21053XCe.A1Z(yBi.Auy(), A1H);
        }
        if (yBi.AyE() != null) {
            C21053XCe.A1W(yBi.AyE(), A1H);
        }
        if (yBi.B1i() != null) {
            C41846B3n.A1Q(yBi.B1i(), A1H);
        }
        if (yBi.BCt() != null) {
            C41846B3n.A1O(yBi.BCt(), A1H);
        }
        if (yBi.getId() != null) {
            C41845B3m.A0x(yBi.getId(), A1H);
        }
        if (yBi.CTN() != null) {
            C21053XCe.A1X(yBi.CTN(), A1H);
        }
        if (yBi.CUa() != null) {
            C21053XCe.A1R(yBi.CUa(), A1H);
        }
        if (yBi.CZ9() != null) {
            C21053XCe.A1S(yBi.CZ9(), A1H);
        }
        if (yBi.CcV() != null) {
            C21053XCe.A1U(yBi.CcV(), A1H);
        }
        if (yBi.getMediaType() != null) {
            C21053XCe.A1T(yBi.getMediaType(), A1H);
        }
        if (yBi.Bof() != null) {
            C41846B3n.A1P(yBi.Bof(), A1H);
        }
        if (yBi.Byt() != null) {
            C41846B3n.A1R(yBi.Byt(), A1H);
        }
        if (yBi.Bzj() != null) {
            C21053XCe.A1a(yBi.Bzj(), A1H);
        }
        if (yBi.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yBi.C2V()), A1H);
        }
        if (yBi.C3E() != null) {
            StickerTraySurface C3E = yBi.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yBi.CGX() != null) {
            C41846B3n.A1N(yBi.CGX(), A1H);
        }
        if (yBi.CGt() != null) {
            C41846B3n.A1K(yBi.CGt(), A1H);
        }
        if (yBi.CHS() != null) {
            C41846B3n.A1L(yBi.CHS(), A1H);
        }
        if (yBi.CHZ() != null) {
            C41846B3n.A1M(yBi.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
