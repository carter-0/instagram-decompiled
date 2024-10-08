package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MoreInfoProductTagType;
import com.instagram.api.schemas.MoreInfoSUGPositionType;
import com.instagram.api.schemas.MoreInfoStickerCTAType;
import com.instagram.api.schemas.MoreInfoTextStyle;
import com.instagram.api.schemas.MoreInfoType;
import com.instagram.sponsored.signals.model.AdsRatingInfoIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cag  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44219Cag {
    public static Map A00(C270854hQ r5) {
        String str;
        ArrayList arrayList;
        String str2;
        String str3;
        TreeUpdaterJNI treeUpdaterJNI;
        String str4;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        String str5 = null;
        if (r5.Aa4() != null) {
            AdsRatingInfoIntf Aa4 = r5.Aa4();
            if (Aa4 != null) {
                treeUpdaterJNI2 = Aa4.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put(AnonymousClass000.A00(4440), treeUpdaterJNI2);
        }
        if (r5.AtM() != null) {
            MoreInfoStickerCTAType AtM = r5.AtM();
            if (AtM != null) {
                str4 = AtM.A00;
            } else {
                str4 = null;
            }
            A1H.put("cta_sticker_style", str4);
        }
        if (r5.AyB() != null) {
            A1H.put("display_string", r5.AyB());
        }
        if (r5.B3b() != null) {
            C275704rk B3b = r5.B3b();
            if (B3b != null) {
                treeUpdaterJNI = B3b.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("facepile", treeUpdaterJNI);
        }
        if (r5.BDH() != null) {
            A1H.put("hide_sug", r5.BDH());
        }
        if (r5.CVd() != null) {
            A1H.put(AnonymousClass000.A00(3438), r5.CVd());
        }
        if (r5.BUD() != null) {
            MoreInfoType BUD = r5.BUD();
            if (BUD != null) {
                str3 = BUD.A00;
            } else {
                str3 = null;
            }
            A1H.put("more_info_type", str3);
        }
        if (r5.BgU() != null) {
            MoreInfoProductTagType BgU = r5.BgU();
            if (BgU != null) {
                str2 = BgU.A00;
            } else {
                str2 = null;
            }
            A1H.put("product_tag_type", str2);
        }
        if (r5.C2F() != null) {
            List<C46253DSi> C2F = r5.C2F();
            if (C2F != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C46253DSi dSi : C2F) {
                    if (dSi != null) {
                        arrayList.add(dSi.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put("subitems", arrayList);
        }
        if (r5.C2j() != null) {
            MoreInfoSUGPositionType C2j = r5.C2j();
            if (C2j != null) {
                str = C2j.A00;
            } else {
                str = null;
            }
            A1H.put("sug_position", str);
        }
        if (r5.C5h() != null) {
            MoreInfoTextStyle C5h = r5.C5h();
            if (C5h != null) {
                str5 = C5h.A00;
            }
            A1H.put("text_style", str5);
        }
        if (r5.CD7() != null) {
            A1H.put(C66579MXk.A00(178), r5.CD7());
        }
        return 0Yt.A0B(A1H);
    }
}
