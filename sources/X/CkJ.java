package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ShoppingSwipeUpCTATextIcon;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.feed.media.ReelCTAIntf;
import com.instagram.model.shopping.reels.ProductCollectionLinkIntf;
import com.instagram.model.shopping.reels.ProfileShopLinkIntf;
import com.instagram.model.shopping.reels.ReelMultiProductLinkIntf;
import com.instagram.model.shopping.reels.ReelProductLinkIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CkJ {
    public static Map A00(ReelCTAIntf reelCTAIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI3;
        ArrayList arrayList2;
        TreeUpdaterJNI treeUpdaterJNI4;
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI5 = null;
        if (reelCTAIntf.AtJ() != null) {
            ShoppingSwipeUpCTATextIcon AtJ = reelCTAIntf.AtJ();
            if (AtJ != null) {
                str = AtJ.A00;
            } else {
                str = null;
            }
            A1H.put(AnonymousClass000.A00(4678), str);
        }
        if (reelCTAIntf.AtK() != null) {
            A1H.put(AnonymousClass000.A00(4679), reelCTAIntf.AtK());
        }
        if (reelCTAIntf.AtL() != null) {
            A1H.put(AnonymousClass000.A00(4680), reelCTAIntf.AtL());
        }
        if (reelCTAIntf.AtU() != null) {
            A1H.put("cta_type", reelCTAIntf.AtU());
        }
        if (reelCTAIntf.B0A() != null) {
            EffectPreviewIntf B0A = reelCTAIntf.B0A();
            if (B0A != null) {
                treeUpdaterJNI4 = B0A.FHC();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1H.put("effect_preview", treeUpdaterJNI4);
        }
        if (reelCTAIntf.B5a() != null) {
            A1H.put(AnonymousClass000.A00(4781), reelCTAIntf.B5a());
        }
        if (reelCTAIntf.B5b() != null) {
            A1H.put(AnonymousClass000.A00(3131), reelCTAIntf.B5b());
        }
        if (reelCTAIntf.BBN() != null) {
            A1H.put(AnonymousClass000.A00(4825), reelCTAIntf.BBN());
        }
        if (reelCTAIntf.BN4() != null) {
            List BN4 = reelCTAIntf.BN4();
            if (BN4 != null) {
                arrayList2 = AnonymousClass7TE.A1C();
                Iterator it = BN4.iterator();
                while (it.hasNext()) {
                    C41847B3o.A1V(arrayList2, it);
                }
            } else {
                arrayList2 = null;
            }
            A1H.put("links", arrayList2);
        }
        if (reelCTAIntf.BUd() != null) {
            ReelMultiProductLinkIntf BUd = reelCTAIntf.BUd();
            if (BUd != null) {
                treeUpdaterJNI3 = BUd.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1H.put(AnonymousClass000.A00(1606), treeUpdaterJNI3);
        }
        if (reelCTAIntf.BXk() != null) {
            A1H.put(AnonymousClass000.A00(3684), reelCTAIntf.BXk());
        }
        if (reelCTAIntf.Bfy() != null) {
            List Bfy = reelCTAIntf.Bfy();
            if (Bfy != null) {
                arrayList = AnonymousClass7TE.A1C();
                Iterator it2 = Bfy.iterator();
                while (it2.hasNext()) {
                    C41847B3o.A1V(arrayList, it2);
                }
            } else {
                arrayList = null;
            }
            A1H.put(AnonymousClass000.A00(1705), arrayList);
        }
        if (reelCTAIntf.Bg1() != null) {
            ProductCollectionLinkIntf Bg1 = reelCTAIntf.Bg1();
            if (Bg1 != null) {
                treeUpdaterJNI2 = Bg1.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put(AnonymousClass000.A00(1706), treeUpdaterJNI2);
        }
        if (reelCTAIntf.BgL() != null) {
            ReelProductLinkIntf BgL = reelCTAIntf.BgL();
            if (BgL != null) {
                treeUpdaterJNI = BgL.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(1708), treeUpdaterJNI);
        }
        if (reelCTAIntf.BhE() != null) {
            ProfileShopLinkIntf BhE = reelCTAIntf.BhE();
            if (BhE != null) {
                treeUpdaterJNI5 = BhE.FHC();
            }
            A1H.put(C273654mx.A00(3172), treeUpdaterJNI5);
        }
        return 0Yt.A0B(A1H);
    }
}
