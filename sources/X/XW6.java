package X;

import com.instagram.api.schemas.InstapalCharacterType;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XW6 {
    public static Map A00(YCA yca) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yca.Ad0() != null) {
            C21053XCe.A1V(yca.Ad0(), A1H);
        }
        if (yca.AdC() != null) {
            C21053XCe.A1Y(yca.AdC(), A1H);
        }
        String str2 = null;
        if (yca.Ams() != null) {
            InstapalCharacterType Ams = yca.Ams();
            if (Ams != null) {
                str = Ams.A00;
            } else {
                str = null;
            }
            A1H.put(AnonymousClass000.A00(266), str);
        }
        if (yca.Auy() != null) {
            C21053XCe.A1Z(yca.Auy(), A1H);
        }
        if (yca.AyE() != null) {
            C21053XCe.A1W(yca.AyE(), A1H);
        }
        if (yca.B1i() != null) {
            C41846B3n.A1Q(yca.B1i(), A1H);
        }
        if (yca.BCt() != null) {
            C41846B3n.A1O(yca.BCt(), A1H);
        }
        if (yca.getId() != null) {
            C41845B3m.A0x(yca.getId(), A1H);
        }
        if (yca.CTN() != null) {
            C21053XCe.A1X(yca.CTN(), A1H);
        }
        if (yca.CUa() != null) {
            C21053XCe.A1R(yca.CUa(), A1H);
        }
        if (yca.CZ9() != null) {
            C21053XCe.A1S(yca.CZ9(), A1H);
        }
        if (yca.CcV() != null) {
            C21053XCe.A1U(yca.CcV(), A1H);
        }
        if (yca.getMediaType() != null) {
            C21053XCe.A1T(yca.getMediaType(), A1H);
        }
        if (yca.Bof() != null) {
            C41846B3n.A1P(yca.Bof(), A1H);
        }
        if (yca.Byt() != null) {
            C41846B3n.A1R(yca.Byt(), A1H);
        }
        if (yca.Bzj() != null) {
            C21053XCe.A1a(yca.Bzj(), A1H);
        }
        if (yca.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yca.C2V()), A1H);
        }
        if (yca.C3E() != null) {
            StickerTraySurface C3E = yca.C3E();
            if (C3E != null) {
                str2 = C3E.A00;
            }
            C21053XCe.A1Q(str2, A1H);
        }
        if (yca.getText() != null) {
            A1H.put("text", yca.getText());
        }
        if (yca.CGX() != null) {
            C41846B3n.A1N(yca.CGX(), A1H);
        }
        if (yca.CGt() != null) {
            C41846B3n.A1K(yca.CGt(), A1H);
        }
        if (yca.CHS() != null) {
            C41846B3n.A1L(yca.CHS(), A1H);
        }
        if (yca.CHZ() != null) {
            C41846B3n.A1M(yca.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
