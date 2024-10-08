package X;

import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XVr {
    public static Map A00(YCB ycb) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (ycb.Ad0() != null) {
            C21053XCe.A1V(ycb.Ad0(), A1H);
        }
        if (ycb.AdC() != null) {
            C21053XCe.A1Y(ycb.AdC(), A1H);
        }
        if (ycb.Auy() != null) {
            C21053XCe.A1Z(ycb.Auy(), A1H);
        }
        if (ycb.AyE() != null) {
            C21053XCe.A1W(ycb.AyE(), A1H);
        }
        if (ycb.B1i() != null) {
            C41846B3n.A1Q(ycb.B1i(), A1H);
        }
        if (ycb.BCt() != null) {
            C41846B3n.A1O(ycb.BCt(), A1H);
        }
        if (ycb.getId() != null) {
            C41845B3m.A0x(ycb.getId(), A1H);
        }
        if (ycb.CTN() != null) {
            C21053XCe.A1X(ycb.CTN(), A1H);
        }
        if (ycb.CUa() != null) {
            C21053XCe.A1R(ycb.CUa(), A1H);
        }
        if (ycb.CZ9() != null) {
            C21053XCe.A1S(ycb.CZ9(), A1H);
        }
        if (ycb.CcV() != null) {
            C21053XCe.A1U(ycb.CcV(), A1H);
        }
        if (ycb.getMediaType() != null) {
            C21053XCe.A1T(ycb.getMediaType(), A1H);
        }
        if (ycb.BRr() != null) {
            A1H.put("merchant_id", ycb.BRr());
        }
        if (ycb.BgD() != null) {
            A1H.put("product_ids", ycb.BgD());
        }
        if (ycb.BnY() != null) {
            A1H.put(AnonymousClass000.A00(767), ycb.BnY());
        }
        if (ycb.Bof() != null) {
            C41846B3n.A1P(ycb.Bof(), A1H);
        }
        if (ycb.Byt() != null) {
            C41846B3n.A1R(ycb.Byt(), A1H);
        }
        if (ycb.Bzj() != null) {
            C21053XCe.A1a(ycb.Bzj(), A1H);
        }
        if (ycb.getStorefrontAttributionUsername() != null) {
            A1H.put(AnonymousClass000.A00(5284), ycb.getStorefrontAttributionUsername());
        }
        String str = null;
        if (ycb.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(ycb.C2V()), A1H);
        }
        if (ycb.C3E() != null) {
            StickerTraySurface C3E = ycb.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (ycb.CGX() != null) {
            C41846B3n.A1N(ycb.CGX(), A1H);
        }
        if (ycb.CGt() != null) {
            C41846B3n.A1K(ycb.CGt(), A1H);
        }
        if (ycb.CHS() != null) {
            C41846B3n.A1L(ycb.CHS(), A1H);
        }
        if (ycb.CHZ() != null) {
            C41846B3n.A1M(ycb.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
