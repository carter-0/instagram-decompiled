package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.XVt  reason: case insensitive filesystem */
public abstract /* synthetic */ class C21320XVt {
    public static Map A00(C22565YBf yBf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        String str = null;
        if (yBf.Abx() != null) {
            C46286DTp Abx = yBf.Abx();
            if (Abx != null) {
                treeUpdaterJNI = Abx.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(2610), treeUpdaterJNI);
        }
        if (yBf.Ad0() != null) {
            C21053XCe.A1V(yBf.Ad0(), A1H);
        }
        if (yBf.AdC() != null) {
            C21053XCe.A1Y(yBf.AdC(), A1H);
        }
        if (yBf.Auy() != null) {
            C21053XCe.A1Z(yBf.Auy(), A1H);
        }
        if (yBf.AyE() != null) {
            C21053XCe.A1W(yBf.AyE(), A1H);
        }
        if (yBf.B1i() != null) {
            C41846B3n.A1Q(yBf.B1i(), A1H);
        }
        if (yBf.BCt() != null) {
            C41846B3n.A1O(yBf.BCt(), A1H);
        }
        if (yBf.getId() != null) {
            C41845B3m.A0x(yBf.getId(), A1H);
        }
        if (yBf.CTN() != null) {
            C21053XCe.A1X(yBf.CTN(), A1H);
        }
        if (yBf.CUa() != null) {
            C21053XCe.A1R(yBf.CUa(), A1H);
        }
        if (yBf.CZ9() != null) {
            C21053XCe.A1S(yBf.CZ9(), A1H);
        }
        if (yBf.CcV() != null) {
            C21053XCe.A1U(yBf.CcV(), A1H);
        }
        if (yBf.getMediaType() != null) {
            C21053XCe.A1T(yBf.getMediaType(), A1H);
        }
        if (yBf.Bof() != null) {
            C41846B3n.A1P(yBf.Bof(), A1H);
        }
        if (yBf.Byt() != null) {
            C41846B3n.A1R(yBf.Byt(), A1H);
        }
        if (yBf.Bzj() != null) {
            C21053XCe.A1a(yBf.Bzj(), A1H);
        }
        if (yBf.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yBf.C2V()), A1H);
        }
        if (yBf.C3E() != null) {
            StickerTraySurface C3E = yBf.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yBf.CGX() != null) {
            C41846B3n.A1N(yBf.CGX(), A1H);
        }
        if (yBf.CGt() != null) {
            C41846B3n.A1K(yBf.CGt(), A1H);
        }
        if (yBf.CHS() != null) {
            C41846B3n.A1L(yBf.CHS(), A1H);
        }
        if (yBf.CHZ() != null) {
            C41846B3n.A1M(yBf.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
