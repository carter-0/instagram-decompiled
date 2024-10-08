package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XWH {
    public static Map A00(YC1 yc1) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yc1.Ad0() != null) {
            C21053XCe.A1V(yc1.Ad0(), A1H);
        }
        if (yc1.AdC() != null) {
            C21053XCe.A1Y(yc1.AdC(), A1H);
        }
        if (yc1.Auy() != null) {
            C21053XCe.A1Z(yc1.Auy(), A1H);
        }
        if (yc1.AyE() != null) {
            C21053XCe.A1W(yc1.AyE(), A1H);
        }
        if (yc1.B1i() != null) {
            C41846B3n.A1Q(yc1.B1i(), A1H);
        }
        if (yc1.BCt() != null) {
            C41846B3n.A1O(yc1.BCt(), A1H);
        }
        if (yc1.getId() != null) {
            C41845B3m.A0x(yc1.getId(), A1H);
        }
        if (yc1.CTN() != null) {
            C21053XCe.A1X(yc1.CTN(), A1H);
        }
        if (yc1.CUa() != null) {
            C21053XCe.A1R(yc1.CUa(), A1H);
        }
        if (yc1.CZ9() != null) {
            C21053XCe.A1S(yc1.CZ9(), A1H);
        }
        if (yc1.CcV() != null) {
            C21053XCe.A1U(yc1.CcV(), A1H);
        }
        if (yc1.getMediaType() != null) {
            C21053XCe.A1T(yc1.getMediaType(), A1H);
        }
        if (yc1.Bof() != null) {
            C41846B3n.A1P(yc1.Bof(), A1H);
        }
        String str = null;
        if (yc1.Bs9() != null) {
            DV0 Bs9 = yc1.Bs9();
            if (Bs9 != null) {
                treeUpdaterJNI = Bs9.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(3950), treeUpdaterJNI);
        }
        if (yc1.Byt() != null) {
            C41846B3n.A1R(yc1.Byt(), A1H);
        }
        if (yc1.Bzj() != null) {
            C21053XCe.A1a(yc1.Bzj(), A1H);
        }
        if (yc1.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yc1.C2V()), A1H);
        }
        if (yc1.C3E() != null) {
            StickerTraySurface C3E = yc1.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yc1.CGX() != null) {
            C41846B3n.A1N(yc1.CGX(), A1H);
        }
        if (yc1.CGt() != null) {
            C41846B3n.A1K(yc1.CGt(), A1H);
        }
        if (yc1.CHS() != null) {
            C41846B3n.A1L(yc1.CHS(), A1H);
        }
        if (yc1.CHZ() != null) {
            C41846B3n.A1M(yc1.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
