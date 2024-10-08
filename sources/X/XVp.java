package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MediaVCRTappableDataIntf;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XVp {
    public static Map A00(C22563YBd yBd) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yBd.Ad0() != null) {
            C21053XCe.A1V(yBd.Ad0(), A1H);
        }
        if (yBd.AdC() != null) {
            C21053XCe.A1Y(yBd.AdC(), A1H);
        }
        if (yBd.Auy() != null) {
            C21053XCe.A1Z(yBd.Auy(), A1H);
        }
        if (yBd.AyE() != null) {
            C21053XCe.A1W(yBd.AyE(), A1H);
        }
        if (yBd.B1i() != null) {
            C41846B3n.A1Q(yBd.B1i(), A1H);
        }
        if (yBd.BCt() != null) {
            C41846B3n.A1O(yBd.BCt(), A1H);
        }
        if (yBd.getId() != null) {
            C41845B3m.A0x(yBd.getId(), A1H);
        }
        if (yBd.CTN() != null) {
            C21053XCe.A1X(yBd.CTN(), A1H);
        }
        if (yBd.CUa() != null) {
            C21053XCe.A1R(yBd.CUa(), A1H);
        }
        if (yBd.CZ9() != null) {
            C21053XCe.A1S(yBd.CZ9(), A1H);
        }
        if (yBd.CcV() != null) {
            C21053XCe.A1U(yBd.CcV(), A1H);
        }
        if (yBd.getMediaType() != null) {
            C21053XCe.A1T(yBd.getMediaType(), A1H);
        }
        if (yBd.Bof() != null) {
            C41846B3n.A1P(yBd.Bof(), A1H);
        }
        if (yBd.Byt() != null) {
            C41846B3n.A1R(yBd.Byt(), A1H);
        }
        if (yBd.Bzj() != null) {
            C21053XCe.A1a(yBd.Bzj(), A1H);
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (yBd.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yBd.C2V()), A1H);
        }
        if (yBd.C3E() != null) {
            StickerTraySurface C3E = yBd.C3E();
            if (C3E != null) {
                str = C3E.A00;
            } else {
                str = null;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yBd.CDa() != null) {
            MediaVCRTappableDataIntf CDa = yBd.CDa();
            if (CDa != null) {
                treeUpdaterJNI = CDa.FHC();
            }
            A1H.put("vcr_sticker", treeUpdaterJNI);
        }
        if (yBd.CGX() != null) {
            C41846B3n.A1N(yBd.CGX(), A1H);
        }
        if (yBd.CGt() != null) {
            C41846B3n.A1K(yBd.CGt(), A1H);
        }
        if (yBd.CHS() != null) {
            C41846B3n.A1L(yBd.CHS(), A1H);
        }
        if (yBd.CHZ() != null) {
            C41846B3n.A1M(yBd.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
