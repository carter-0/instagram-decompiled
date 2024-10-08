package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class GVN {
    public static Map A00(AnonymousClass41Z r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        TreeUpdaterJNI treeUpdaterJNI5;
        TreeUpdaterJNI treeUpdaterJNI6;
        TreeUpdaterJNI treeUpdaterJNI7;
        TreeUpdaterJNI treeUpdaterJNI8;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI9 = null;
        if (r4.At8() != null) {
            C270854hQ At8 = r4.At8();
            if (At8 != null) {
                treeUpdaterJNI8 = At8.FHC();
            } else {
                treeUpdaterJNI8 = null;
            }
            A1H.put("cta", treeUpdaterJNI8);
        }
        if (r4.B1Z() != null) {
            C270854hQ B1Z = r4.B1Z();
            if (B1Z != null) {
                treeUpdaterJNI7 = B1Z.FHC();
            } else {
                treeUpdaterJNI7 = null;
            }
            A1H.put("end_scene", treeUpdaterJNI7);
        }
        if (r4.B7C() != null) {
            C270854hQ B7C = r4.B7C();
            if (B7C != null) {
                treeUpdaterJNI6 = B7C.FHC();
            } else {
                treeUpdaterJNI6 = null;
            }
            A1H.put("footer", treeUpdaterJNI6);
        }
        if (r4.B9S() != null) {
            C270854hQ B9S = r4.B9S();
            if (B9S != null) {
                treeUpdaterJNI5 = B9S.FHC();
            } else {
                treeUpdaterJNI5 = null;
            }
            A1H.put("glados", treeUpdaterJNI5);
        }
        if (r4.BCd() != null) {
            C270854hQ BCd = r4.BCd();
            if (BCd != null) {
                treeUpdaterJNI4 = BCd.FHC();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1H.put("header", treeUpdaterJNI4);
        }
        if (r4.BDx() != null) {
            C270854hQ BDx = r4.BDx();
            if (BDx != null) {
                treeUpdaterJNI3 = BDx.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1H.put("iab", treeUpdaterJNI3);
        }
        if (r4.BSw() != null) {
            C270854hQ BSw = r4.BSw();
            if (BSw != null) {
                treeUpdaterJNI2 = BSw.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("mid_card", treeUpdaterJNI2);
        }
        if (r4.Bgh() != null) {
            C270854hQ Bgh = r4.Bgh();
            if (Bgh != null) {
                treeUpdaterJNI = Bgh.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(1713), treeUpdaterJNI);
        }
        if (r4.C89() != null) {
            C270854hQ C89 = r4.C89();
            if (C89 != null) {
                treeUpdaterJNI9 = C89.FHC();
            }
            A1H.put("tool_tip", treeUpdaterJNI9);
        }
        return 0Yt.A0B(A1H);
    }
}
