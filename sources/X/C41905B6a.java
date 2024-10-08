package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.B6a  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41905B6a {
    public static Map A00(C270564gw r5) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        TreeUpdaterJNI treeUpdaterJNI5;
        TreeUpdaterJNI treeUpdaterJNI6;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        ArrayList arrayList = null;
        if (r5.Ad4() != null) {
            C279484yi Ad4 = r5.Ad4();
            if (Ad4 != null) {
                treeUpdaterJNI6 = Ad4.FHC();
            } else {
                treeUpdaterJNI6 = null;
            }
            A1H.put("attribution_info", treeUpdaterJNI6);
        }
        if (r5.B0L() != null) {
            C279514yl B0L = r5.B0L();
            if (B0L != null) {
                treeUpdaterJNI5 = B0L.FHC();
            } else {
                treeUpdaterJNI5 = null;
            }
            A1H.put("effects_info", treeUpdaterJNI5);
        }
        if (r5.BT9() != null) {
            A1H.put("min_num_segments", r5.BT9());
        }
        if (r5.BoA() != null) {
            DSI BoA = r5.BoA();
            if (BoA != null) {
                treeUpdaterJNI4 = BoA.FHC();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1H.put("reusable_media_assets_info", treeUpdaterJNI4);
        }
        if (r5.BrX() != null) {
            List<C279454yf> BrX = r5.BrX();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C279454yf r0 : BrX) {
                if (r0 != null) {
                    A1C.add(r0.FHC());
                }
            }
            A1H.put("segments_info", A1C);
        }
        if (r5.BuB() != null) {
            A1H.put("should_hide_cta", r5.BuB());
        }
        if (r5.Bwy() != null) {
            DSG Bwy = r5.Bwy();
            if (Bwy != null) {
                treeUpdaterJNI3 = Bwy.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1H.put("smart_template_info", treeUpdaterJNI3);
        }
        r5.getTemplateClipsMediaId();
        A1H.put("template_clips_media_id", Long.valueOf(r5.getTemplateClipsMediaId()));
        if (r5.C7R() != null) {
            DSS C7R = r5.C7R();
            if (C7R != null) {
                treeUpdaterJNI2 = C7R.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("timed_stickers_info", treeUpdaterJNI2);
        }
        if (r5.C7S() != null) {
            C279544yo C7S = r5.C7S();
            if (C7S != null) {
                treeUpdaterJNI = C7S.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("timed_texts_info", treeUpdaterJNI);
        }
        if (r5.C9U() != null) {
            List<AnonymousClass58M> C9U = r5.C9U();
            if (C9U != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (AnonymousClass58M r02 : C9U) {
                    if (r02 != null) {
                        arrayList.add(r02.FHC());
                    }
                }
            }
            A1H.put("transition_effects_info", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
