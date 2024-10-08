package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.XVz  reason: case insensitive filesystem */
public abstract /* synthetic */ class C21325XVz {
    public static Map A00(C22571YBl yBl) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yBl.Ad0() != null) {
            C21053XCe.A1V(yBl.Ad0(), A1H);
        }
        if (yBl.AdC() != null) {
            C21053XCe.A1Y(yBl.AdC(), A1H);
        }
        if (yBl.Auy() != null) {
            C21053XCe.A1Z(yBl.Auy(), A1H);
        }
        if (yBl.AyE() != null) {
            C21053XCe.A1W(yBl.AyE(), A1H);
        }
        if (yBl.B1i() != null) {
            C41846B3n.A1Q(yBl.B1i(), A1H);
        }
        String str = null;
        if (yBl.B48() != null) {
            C46310DUn B48 = yBl.B48();
            if (B48 != null) {
                treeUpdaterJNI = B48.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(1344), treeUpdaterJNI);
        }
        if (yBl.BCt() != null) {
            C41846B3n.A1O(yBl.BCt(), A1H);
        }
        if (yBl.getId() != null) {
            C41845B3m.A0x(yBl.getId(), A1H);
        }
        if (yBl.CTN() != null) {
            C21053XCe.A1X(yBl.CTN(), A1H);
        }
        if (yBl.CUa() != null) {
            C21053XCe.A1R(yBl.CUa(), A1H);
        }
        if (yBl.CZ9() != null) {
            C21053XCe.A1S(yBl.CZ9(), A1H);
        }
        if (yBl.CcV() != null) {
            C21053XCe.A1U(yBl.CcV(), A1H);
        }
        if (yBl.getMediaType() != null) {
            C21053XCe.A1T(yBl.getMediaType(), A1H);
        }
        if (yBl.Bof() != null) {
            C41846B3n.A1P(yBl.Bof(), A1H);
        }
        if (yBl.Byt() != null) {
            C41846B3n.A1R(yBl.Byt(), A1H);
        }
        if (yBl.Bzj() != null) {
            C21053XCe.A1a(yBl.Bzj(), A1H);
        }
        if (yBl.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yBl.C2V()), A1H);
        }
        if (yBl.C3E() != null) {
            StickerTraySurface C3E = yBl.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yBl.CGX() != null) {
            C41846B3n.A1N(yBl.CGX(), A1H);
        }
        if (yBl.CGt() != null) {
            C41846B3n.A1K(yBl.CGt(), A1H);
        }
        if (yBl.CHS() != null) {
            C41846B3n.A1L(yBl.CHS(), A1H);
        }
        if (yBl.CHZ() != null) {
            C41846B3n.A1M(yBl.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
