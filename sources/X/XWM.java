package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.StoryThenAndNowStickerDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XWM {
    public static Map A00(YC5 yc5) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yc5.Ad0() != null) {
            C21053XCe.A1V(yc5.Ad0(), A1H);
        }
        if (yc5.AdC() != null) {
            C21053XCe.A1Y(yc5.AdC(), A1H);
        }
        String str = null;
        if (yc5.Aff() != null) {
            StoryThenAndNowStickerDictIntf Aff = yc5.Aff();
            if (Aff != null) {
                treeUpdaterJNI = Aff.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(2694), treeUpdaterJNI);
        }
        if (yc5.Auy() != null) {
            C21053XCe.A1Z(yc5.Auy(), A1H);
        }
        if (yc5.AyE() != null) {
            C21053XCe.A1W(yc5.AyE(), A1H);
        }
        if (yc5.B1i() != null) {
            C41846B3n.A1Q(yc5.B1i(), A1H);
        }
        if (yc5.BCt() != null) {
            C41846B3n.A1O(yc5.BCt(), A1H);
        }
        if (yc5.getId() != null) {
            C41845B3m.A0x(yc5.getId(), A1H);
        }
        if (yc5.CTN() != null) {
            C21053XCe.A1X(yc5.CTN(), A1H);
        }
        if (yc5.CUa() != null) {
            C21053XCe.A1R(yc5.CUa(), A1H);
        }
        if (yc5.CZ9() != null) {
            C21053XCe.A1S(yc5.CZ9(), A1H);
        }
        if (yc5.CcV() != null) {
            C21053XCe.A1U(yc5.CcV(), A1H);
        }
        if (yc5.getMediaType() != null) {
            C21053XCe.A1T(yc5.getMediaType(), A1H);
        }
        if (yc5.Bof() != null) {
            C41846B3n.A1P(yc5.Bof(), A1H);
        }
        if (yc5.Byt() != null) {
            C41846B3n.A1R(yc5.Byt(), A1H);
        }
        if (yc5.Bzj() != null) {
            C21053XCe.A1a(yc5.Bzj(), A1H);
        }
        if (yc5.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yc5.C2V()), A1H);
        }
        if (yc5.C3E() != null) {
            StickerTraySurface C3E = yc5.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yc5.CGX() != null) {
            C41846B3n.A1N(yc5.CGX(), A1H);
        }
        if (yc5.CGt() != null) {
            C41846B3n.A1K(yc5.CGt(), A1H);
        }
        if (yc5.CHS() != null) {
            C41846B3n.A1L(yc5.CHS(), A1H);
        }
        if (yc5.CHZ() != null) {
            C41846B3n.A1M(yc5.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
