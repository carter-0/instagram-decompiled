package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.XVm  reason: case insensitive filesystem */
public abstract /* synthetic */ class C21319XVm {
    public static Map A00(C22561YBb yBb) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (yBb.Ad0() != null) {
            C21053XCe.A1V(yBb.Ad0(), A1H);
        }
        if (yBb.AdC() != null) {
            C21053XCe.A1Y(yBb.AdC(), A1H);
        }
        if (yBb.Auy() != null) {
            C21053XCe.A1Z(yBb.Auy(), A1H);
        }
        if (yBb.AyE() != null) {
            C21053XCe.A1W(yBb.AyE(), A1H);
        }
        if (yBb.B1i() != null) {
            C41846B3n.A1Q(yBb.B1i(), A1H);
        }
        String str = null;
        if (yBb.B2x() != null) {
            C46236DRr B2x = yBb.B2x();
            if (B2x != null) {
                treeUpdaterJNI = B2x.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(C273654mx.A00(278), treeUpdaterJNI);
        }
        if (yBb.BCt() != null) {
            C41846B3n.A1O(yBb.BCt(), A1H);
        }
        if (yBb.getId() != null) {
            C41845B3m.A0x(yBb.getId(), A1H);
        }
        if (yBb.CTN() != null) {
            C21053XCe.A1X(yBb.CTN(), A1H);
        }
        if (yBb.CUa() != null) {
            C21053XCe.A1R(yBb.CUa(), A1H);
        }
        if (yBb.CZ9() != null) {
            C21053XCe.A1S(yBb.CZ9(), A1H);
        }
        if (yBb.CcV() != null) {
            C21053XCe.A1U(yBb.CcV(), A1H);
        }
        if (yBb.getMediaType() != null) {
            C21053XCe.A1T(yBb.getMediaType(), A1H);
        }
        if (yBb.Bof() != null) {
            C41846B3n.A1P(yBb.Bof(), A1H);
        }
        if (yBb.Byt() != null) {
            C41846B3n.A1R(yBb.Byt(), A1H);
        }
        if (yBb.Bzj() != null) {
            C21053XCe.A1a(yBb.Bzj(), A1H);
        }
        if (yBb.C2V() != null) {
            C21053XCe.A1b(C21053XCe.A09(yBb.C2V()), A1H);
        }
        if (yBb.C3E() != null) {
            StickerTraySurface C3E = yBb.C3E();
            if (C3E != null) {
                str = C3E.A00;
            }
            C21053XCe.A1Q(str, A1H);
        }
        if (yBb.CGX() != null) {
            C41846B3n.A1N(yBb.CGX(), A1H);
        }
        if (yBb.CGt() != null) {
            C41846B3n.A1K(yBb.CGt(), A1H);
        }
        if (yBb.CHS() != null) {
            C41846B3n.A1L(yBb.CHS(), A1H);
        }
        if (yBb.CHZ() != null) {
            C41846B3n.A1M(yBb.CHZ(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
