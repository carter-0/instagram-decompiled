package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.model.reels.netego.ShoppingNetegoInStoryIconType;
import com.instagram.model.reels.netego.ShoppingNetegoInStorySuggestionType;
import com.instagram.model.reels.netego.ShoppingNetegoType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cmq  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44900Cmq {
    public static Map A00(C239683Hp r5) {
        String str;
        TreeUpdaterJNI treeUpdaterJNI;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        String str3;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI5 = null;
        if (r5.AhJ() != null) {
            C66565MWt AhJ = r5.AhJ();
            if (AhJ != null) {
                treeUpdaterJNI4 = AhJ.FHC();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1H.put("bottom_cta", treeUpdaterJNI4);
        }
        if (r5.AwS() != null) {
            C66565MWt AwS = r5.AwS();
            if (AwS != null) {
                treeUpdaterJNI3 = AwS.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1H.put("description_header", treeUpdaterJNI3);
        }
        if (r5.AwT() != null) {
            C66565MWt AwT = r5.AwT();
            if (AwT != null) {
                treeUpdaterJNI2 = AwT.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("description_text", treeUpdaterJNI2);
        }
        if (r5.AzH() != null) {
            A1H.put(TraceFieldType.Duration, r5.AzH());
        }
        if (r5.BE8() != null) {
            ShoppingNetegoInStoryIconType BE8 = r5.BE8();
            if (BE8 != null) {
                str3 = BE8.A00;
            } else {
                str3 = null;
            }
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, str3);
        }
        if (r5.BEY() != null) {
            C41845B3m.A0x(r5.BEY(), A1H);
        }
        if (r5.Cdn() != null) {
            A1H.put("is_unit_dismissable", r5.Cdn());
        }
        if (r5.BVs() != null) {
            ShoppingNetegoType BVs = r5.BVs();
            if (BVs != null) {
                str2 = BVs.A00;
            } else {
                str2 = null;
            }
            A1H.put("netego_type", str2);
        }
        if (r5.Bga() != null) {
            List<C46304DUh> Bga = r5.Bga();
            if (Bga != null) {
                arrayList2 = AnonymousClass7TE.A1C();
                for (C46304DUh dUh : Bga) {
                    if (dUh != null) {
                        arrayList2.add(dUh.FHC());
                    }
                }
            } else {
                arrayList2 = null;
            }
            A1H.put("products", arrayList2);
        }
        if (r5.Btt() != null) {
            List<DUX> Btt = r5.Btt();
            if (Btt != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (DUX dux : Btt) {
                    if (dux != null) {
                        arrayList.add(dux.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put("shops", arrayList);
        }
        if (r5.C2a() != null) {
            C66565MWt C2a = r5.C2a();
            if (C2a != null) {
                treeUpdaterJNI = C2a.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("subtitle", treeUpdaterJNI);
        }
        if (r5.C2s() != null) {
            ShoppingNetegoInStorySuggestionType C2s = r5.C2s();
            if (C2s != null) {
                str = C2s.A00;
            } else {
                str = null;
            }
            A1H.put("suggestion_type", str);
        }
        if (r5.C7m() != null) {
            C66565MWt C7m = r5.C7m();
            if (C7m != null) {
                treeUpdaterJNI5 = C7m.FHC();
            }
            C41845B3m.A12(treeUpdaterJNI5, A1H);
        }
        if (r5.C9L() != null) {
            A1H.put("tracking_token", r5.C9L());
        }
        if (r5.CBA() != null) {
            A1H.put("ui_variant", r5.CBA());
        }
        return 0Yt.A0B(A1H);
    }
}
