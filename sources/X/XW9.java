package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XW9 {
    public static Map A00(C22579YBt yBt) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yBt.Ad0() != null) {
            C21053XCe.A1V(yBt.Ad0(), A1H);
        }
        if (yBt.AdC() != null) {
            C21053XCe.A1Y(yBt.AdC(), A1H);
        }
        if (yBt.Auy() != null) {
            C21053XCe.A1Z(yBt.Auy(), A1H);
        }
        if (yBt.AyE() != null) {
            C21053XCe.A1W(yBt.AyE(), A1H);
        }
        if (yBt.B1i() != null) {
            C41846B3n.A1Q(yBt.B1i(), A1H);
        }
        if (yBt.BCt() != null) {
            C41846B3n.A1O(yBt.BCt(), A1H);
        }
        if (yBt.getId() != null) {
            C41845B3m.A0x(yBt.getId(), A1H);
        }
        if (yBt.CTN() != null) {
            C21053XCe.A1X(yBt.CTN(), A1H);
        }
        if (yBt.CUa() != null) {
            C21053XCe.A1R(yBt.CUa(), A1H);
        }
        if (yBt.CZ9() != null) {
            C21053XCe.A1S(yBt.CZ9(), A1H);
        }
        if (yBt.CcV() != null) {
            C21053XCe.A1U(yBt.CcV(), A1H);
        }
        if (yBt.getMediaType() != null) {
            C21053XCe.A1T(yBt.getMediaType(), A1H);
        }
        String str = null;
        if (yBt.BWi() != null) {
            DS7 BWi = yBt.BWi();
            if (BWi != null) {
                treeUpdaterJNI = BWi.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(C273654mx.A00(85), treeUpdaterJNI);
        }
        if (yBt.Bof() != null) {
            C41846B3n.A1P(yBt.Bof(), A1H);
        }
        if (yBt.Byt() != null) {
            C41846B3n.A1R(yBt.Byt(), A1H);
        }
        if (yBt.Bzj() != null) {
            C21053XCe.A1a(yBt.Bzj(), A1H);
        }
        if (yBt.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yBt.C2V()), A1H);
        }
        if (yBt.C3E() != null) {
            StickerTraySurface C3E = yBt.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yBt.CGX() != null) {
            C41846B3n.A1N(yBt.CGX(), A1H);
        }
        if (yBt.CGt() != null) {
            C41846B3n.A1K(yBt.CGt(), A1H);
        }
        if (yBt.CHS() != null) {
            C41846B3n.A1L(yBt.CHS(), A1H);
        }
        if (yBt.CHZ() != null) {
            C41846B3n.A1M(yBt.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
