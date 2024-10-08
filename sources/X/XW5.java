package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.StoryGroupMentionTappableDataIntf;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XW5 {
    public static Map A00(C22576YBq yBq) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yBq.Ad0() != null) {
            C21053XCe.A1V(yBq.Ad0(), A1H);
        }
        if (yBq.AdC() != null) {
            C21053XCe.A1Y(yBq.AdC(), A1H);
        }
        if (yBq.Auy() != null) {
            C21053XCe.A1Z(yBq.Auy(), A1H);
        }
        if (yBq.AyE() != null) {
            C21053XCe.A1W(yBq.AyE(), A1H);
        }
        if (yBq.B1i() != null) {
            C41846B3n.A1Q(yBq.B1i(), A1H);
        }
        String str = null;
        if (yBq.BA2() != null) {
            StoryGroupMentionTappableDataIntf BA2 = yBq.BA2();
            if (BA2 != null) {
                treeUpdaterJNI = BA2.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(3204), treeUpdaterJNI);
        }
        if (yBq.BCt() != null) {
            C41846B3n.A1O(yBq.BCt(), A1H);
        }
        if (yBq.getId() != null) {
            C41845B3m.A0x(yBq.getId(), A1H);
        }
        if (yBq.CTN() != null) {
            C21053XCe.A1X(yBq.CTN(), A1H);
        }
        if (yBq.CUa() != null) {
            C21053XCe.A1R(yBq.CUa(), A1H);
        }
        if (yBq.CZ9() != null) {
            C21053XCe.A1S(yBq.CZ9(), A1H);
        }
        if (yBq.CcV() != null) {
            C21053XCe.A1U(yBq.CcV(), A1H);
        }
        if (yBq.getMediaType() != null) {
            C21053XCe.A1T(yBq.getMediaType(), A1H);
        }
        if (yBq.Bof() != null) {
            C41846B3n.A1P(yBq.Bof(), A1H);
        }
        if (yBq.Byt() != null) {
            C41846B3n.A1R(yBq.Byt(), A1H);
        }
        if (yBq.Bzj() != null) {
            C21053XCe.A1a(yBq.Bzj(), A1H);
        }
        if (yBq.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yBq.C2V()), A1H);
        }
        if (yBq.C3E() != null) {
            StickerTraySurface C3E = yBq.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yBq.CGX() != null) {
            C41846B3n.A1N(yBq.CGX(), A1H);
        }
        if (yBq.CGt() != null) {
            C41846B3n.A1K(yBq.CGt(), A1H);
        }
        if (yBq.CHS() != null) {
            C41846B3n.A1L(yBq.CHS(), A1H);
        }
        if (yBq.CHZ() != null) {
            C41846B3n.A1M(yBq.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
