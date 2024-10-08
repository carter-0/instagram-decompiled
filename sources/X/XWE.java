package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XWE {
    public static Map A00(C22584YBy yBy) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yBy.Ad0() != null) {
            C21053XCe.A1V(yBy.Ad0(), A1H);
        }
        if (yBy.AdC() != null) {
            C21053XCe.A1Y(yBy.AdC(), A1H);
        }
        if (yBy.Auy() != null) {
            C21053XCe.A1Z(yBy.Auy(), A1H);
        }
        if (yBy.AyE() != null) {
            C21053XCe.A1W(yBy.AyE(), A1H);
        }
        if (yBy.B1i() != null) {
            C41846B3n.A1Q(yBy.B1i(), A1H);
        }
        if (yBy.BCt() != null) {
            C41846B3n.A1O(yBy.BCt(), A1H);
        }
        if (yBy.getId() != null) {
            C41845B3m.A0x(yBy.getId(), A1H);
        }
        if (yBy.CTN() != null) {
            C21053XCe.A1X(yBy.CTN(), A1H);
        }
        if (yBy.CUa() != null) {
            C21053XCe.A1R(yBy.CUa(), A1H);
        }
        if (yBy.CZ9() != null) {
            C21053XCe.A1S(yBy.CZ9(), A1H);
        }
        if (yBy.CcV() != null) {
            C21053XCe.A1U(yBy.CcV(), A1H);
        }
        if (yBy.getMediaType() != null) {
            C21053XCe.A1T(yBy.getMediaType(), A1H);
        }
        String str = null;
        if (yBy.BgR() != null) {
            C46271DTa BgR = yBy.BgR();
            if (BgR != null) {
                treeUpdaterJNI = BgR.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(C273654mx.A00(89), treeUpdaterJNI);
        }
        if (yBy.Bof() != null) {
            C41846B3n.A1P(yBy.Bof(), A1H);
        }
        if (yBy.Byt() != null) {
            C41846B3n.A1R(yBy.Byt(), A1H);
        }
        if (yBy.Bzj() != null) {
            C21053XCe.A1a(yBy.Bzj(), A1H);
        }
        if (yBy.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yBy.C2V()), A1H);
        }
        if (yBy.C3E() != null) {
            StickerTraySurface C3E = yBy.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yBy.CGX() != null) {
            C41846B3n.A1N(yBy.CGX(), A1H);
        }
        if (yBy.CGt() != null) {
            C41846B3n.A1K(yBy.CGt(), A1H);
        }
        if (yBy.CHS() != null) {
            C41846B3n.A1L(yBy.CHS(), A1H);
        }
        if (yBy.CHZ() != null) {
            C41846B3n.A1M(yBy.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
