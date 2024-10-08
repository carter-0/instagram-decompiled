package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.SMBSupportStickerDictIntf;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.StorySmbSupportStickerObject;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XWJ {
    public static Map A00(StorySmbSupportStickerObject storySmbSupportStickerObject) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (storySmbSupportStickerObject.Ad0() != null) {
            C21053XCe.A1V(storySmbSupportStickerObject.Ad0(), A1H);
        }
        if (storySmbSupportStickerObject.AdC() != null) {
            C21053XCe.A1Y(storySmbSupportStickerObject.AdC(), A1H);
        }
        if (storySmbSupportStickerObject.Auy() != null) {
            C21053XCe.A1Z(storySmbSupportStickerObject.Auy(), A1H);
        }
        if (storySmbSupportStickerObject.AyE() != null) {
            C21053XCe.A1W(storySmbSupportStickerObject.AyE(), A1H);
        }
        if (storySmbSupportStickerObject.B1i() != null) {
            C41846B3n.A1Q(storySmbSupportStickerObject.B1i(), A1H);
        }
        if (storySmbSupportStickerObject.BCt() != null) {
            C41846B3n.A1O(storySmbSupportStickerObject.BCt(), A1H);
        }
        if (storySmbSupportStickerObject.getId() != null) {
            C41845B3m.A0x(storySmbSupportStickerObject.getId(), A1H);
        }
        if (storySmbSupportStickerObject.CTN() != null) {
            C21053XCe.A1X(storySmbSupportStickerObject.CTN(), A1H);
        }
        if (storySmbSupportStickerObject.CUa() != null) {
            C21053XCe.A1R(storySmbSupportStickerObject.CUa(), A1H);
        }
        if (storySmbSupportStickerObject.CZ9() != null) {
            C21053XCe.A1S(storySmbSupportStickerObject.CZ9(), A1H);
        }
        if (storySmbSupportStickerObject.CcV() != null) {
            C21053XCe.A1U(storySmbSupportStickerObject.CcV(), A1H);
        }
        if (storySmbSupportStickerObject.getMediaType() != null) {
            C21053XCe.A1T(storySmbSupportStickerObject.getMediaType(), A1H);
        }
        if (storySmbSupportStickerObject.Bof() != null) {
            C41846B3n.A1P(storySmbSupportStickerObject.Bof(), A1H);
        }
        String str = null;
        if (storySmbSupportStickerObject.Bx3() != null) {
            SMBSupportStickerDictIntf Bx3 = storySmbSupportStickerObject.Bx3();
            if (Bx3 != null) {
                treeUpdaterJNI = Bx3.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(1824), treeUpdaterJNI);
        }
        if (storySmbSupportStickerObject.Byt() != null) {
            C41846B3n.A1R(storySmbSupportStickerObject.Byt(), A1H);
        }
        if (storySmbSupportStickerObject.Bzj() != null) {
            C21053XCe.A1a(storySmbSupportStickerObject.Bzj(), A1H);
        }
        if (storySmbSupportStickerObject.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(storySmbSupportStickerObject.C2V()), A1H);
        }
        if (storySmbSupportStickerObject.C3E() != null) {
            StickerTraySurface C3E = storySmbSupportStickerObject.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (storySmbSupportStickerObject.CGX() != null) {
            C41846B3n.A1N(storySmbSupportStickerObject.CGX(), A1H);
        }
        if (storySmbSupportStickerObject.CGt() != null) {
            C41846B3n.A1K(storySmbSupportStickerObject.CGt(), A1H);
        }
        if (storySmbSupportStickerObject.CHS() != null) {
            C41846B3n.A1L(storySmbSupportStickerObject.CHS(), A1H);
        }
        if (storySmbSupportStickerObject.CHZ() != null) {
            C41846B3n.A1M(storySmbSupportStickerObject.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
