package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.XVy  reason: case insensitive filesystem */
public abstract /* synthetic */ class C21324XVy {
    public static Map A00(C22570YBk yBk) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yBk.Ad0() != null) {
            C21053XCe.A1V(yBk.Ad0(), A1H);
        }
        if (yBk.AdC() != null) {
            C21053XCe.A1Y(yBk.AdC(), A1H);
        }
        if (yBk.Auy() != null) {
            C21053XCe.A1Z(yBk.Auy(), A1H);
        }
        if (yBk.AyE() != null) {
            C21053XCe.A1W(yBk.AyE(), A1H);
        }
        String str = null;
        if (yBk.B0O() != null) {
            DT6 B0O = yBk.B0O();
            if (B0O != null) {
                treeUpdaterJNI = B0O.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(C273654mx.A00(270), treeUpdaterJNI);
        }
        if (yBk.B1i() != null) {
            C41846B3n.A1Q(yBk.B1i(), A1H);
        }
        if (yBk.BCt() != null) {
            C41846B3n.A1O(yBk.BCt(), A1H);
        }
        if (yBk.getId() != null) {
            C41845B3m.A0x(yBk.getId(), A1H);
        }
        if (yBk.CTN() != null) {
            C21053XCe.A1X(yBk.CTN(), A1H);
        }
        if (yBk.CUa() != null) {
            C21053XCe.A1R(yBk.CUa(), A1H);
        }
        if (yBk.CZ9() != null) {
            C21053XCe.A1S(yBk.CZ9(), A1H);
        }
        if (yBk.CcV() != null) {
            C21053XCe.A1U(yBk.CcV(), A1H);
        }
        if (yBk.getMediaType() != null) {
            C21053XCe.A1T(yBk.getMediaType(), A1H);
        }
        if (yBk.Bof() != null) {
            C41846B3n.A1P(yBk.Bof(), A1H);
        }
        if (yBk.Byt() != null) {
            C41846B3n.A1R(yBk.Byt(), A1H);
        }
        if (yBk.Bzj() != null) {
            C21053XCe.A1a(yBk.Bzj(), A1H);
        }
        if (yBk.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yBk.C2V()), A1H);
        }
        if (yBk.C3E() != null) {
            StickerTraySurface C3E = yBk.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yBk.CGX() != null) {
            C41846B3n.A1N(yBk.CGX(), A1H);
        }
        if (yBk.CGt() != null) {
            C41846B3n.A1K(yBk.CGt(), A1H);
        }
        if (yBk.CHS() != null) {
            C41846B3n.A1L(yBk.CHS(), A1H);
        }
        if (yBk.CHZ() != null) {
            C41846B3n.A1M(yBk.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
