package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ContextualLinkCtaType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CWN {
    public static Map A00(C46306DUj dUj) {
        ArrayList arrayList;
        TreeUpdaterJNI FHC;
        ArrayList arrayList2;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (dUj.AqV() != null) {
            AnonymousClass1s2 AqV = dUj.AqV();
            if (AqV != null) {
                treeUpdaterJNI2 = AqV.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("content_appreciation_info", treeUpdaterJNI2);
        }
        if (dUj.ArC() != null) {
            ContextualLinkCtaType ArC = dUj.ArC();
            0qQ.A0B(ArC, 0);
            A1H.put("contextual_link_type", ArC.A00);
        }
        if (dUj.BP1() != null) {
            C67161s9 BP1 = dUj.BP1();
            if (BP1 != null) {
                treeUpdaterJNI = BP1.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("mashup_info", treeUpdaterJNI);
        }
        if (dUj.Bhr() != null) {
            List<AnonymousClass5B2> Bhr = dUj.Bhr();
            if (Bhr != null) {
                arrayList2 = AnonymousClass7TE.A1C();
                for (AnonymousClass5B2 r0 : Bhr) {
                    if (r0 != null) {
                        arrayList2.add(r0.FHC());
                    }
                }
            } else {
                arrayList2 = null;
            }
            A1H.put("prompt_stickers_info", arrayList2);
        }
        if (dUj.BoE() != null) {
            List<C248923io> BoE = dUj.BoE();
            if (BoE != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C248923io r02 : BoE) {
                    if (!(r02 == null || (FHC = r02.FHC()) == null)) {
                        arrayList.add(FHC);
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put("reusable_text_info", arrayList);
        }
        if (dUj.C4a() != null) {
            C270564gw C4a = dUj.C4a();
            if (C4a != null) {
                treeUpdaterJNI3 = C4a.FHC();
            }
            A1H.put("template_info", treeUpdaterJNI3);
        }
        return 0Yt.A0B(A1H);
    }
}
