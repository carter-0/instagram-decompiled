package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.XVv  reason: case insensitive filesystem */
public abstract /* synthetic */ class C21322XVv {
    public static Map A00(C22567YBh yBh) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yBh.Ad0() != null) {
            C21053XCe.A1V(yBh.Ad0(), A1H);
        }
        if (yBh.AdC() != null) {
            C21053XCe.A1Y(yBh.AdC(), A1H);
        }
        String str = null;
        if (yBh.AgS() != null) {
            C46309DUm AgS = yBh.AgS();
            if (AgS != null) {
                treeUpdaterJNI = AgS.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(C273654mx.A00(125), treeUpdaterJNI);
        }
        if (yBh.Auy() != null) {
            C21053XCe.A1Z(yBh.Auy(), A1H);
        }
        if (yBh.AyE() != null) {
            C21053XCe.A1W(yBh.AyE(), A1H);
        }
        if (yBh.B1i() != null) {
            C41846B3n.A1Q(yBh.B1i(), A1H);
        }
        if (yBh.BCt() != null) {
            C41846B3n.A1O(yBh.BCt(), A1H);
        }
        if (yBh.getId() != null) {
            C41845B3m.A0x(yBh.getId(), A1H);
        }
        if (yBh.CTN() != null) {
            C21053XCe.A1X(yBh.CTN(), A1H);
        }
        if (yBh.CUa() != null) {
            C21053XCe.A1R(yBh.CUa(), A1H);
        }
        if (yBh.CZ9() != null) {
            C21053XCe.A1S(yBh.CZ9(), A1H);
        }
        if (yBh.CcV() != null) {
            C21053XCe.A1U(yBh.CcV(), A1H);
        }
        if (yBh.getMediaType() != null) {
            C21053XCe.A1T(yBh.getMediaType(), A1H);
        }
        if (yBh.Bof() != null) {
            C41846B3n.A1P(yBh.Bof(), A1H);
        }
        if (yBh.Byt() != null) {
            C41846B3n.A1R(yBh.Byt(), A1H);
        }
        if (yBh.Bzj() != null) {
            C21053XCe.A1a(yBh.Bzj(), A1H);
        }
        if (yBh.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yBh.C2V()), A1H);
        }
        if (yBh.C3E() != null) {
            StickerTraySurface C3E = yBh.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yBh.CGX() != null) {
            C41846B3n.A1N(yBh.CGX(), A1H);
        }
        if (yBh.CGt() != null) {
            C41846B3n.A1K(yBh.CGt(), A1H);
        }
        if (yBh.CHS() != null) {
            C41846B3n.A1L(yBh.CHS(), A1H);
        }
        if (yBh.CHZ() != null) {
            C41846B3n.A1M(yBh.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
