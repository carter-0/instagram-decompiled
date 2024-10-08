package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CmZ  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44883CmZ {
    public static Map A00(C239703Hr r5) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (r5.Ast() != null) {
            List Ast = r5.Ast();
            if (Ast != null) {
                arrayList = AnonymousClass7TE.A1C();
                Iterator it = Ast.iterator();
                while (it.hasNext()) {
                    C41847B3o.A1Y(arrayList, it);
                }
            } else {
                arrayList = null;
            }
            A1H.put("crop_rect", arrayList);
        }
        if (r5.Asx() != null) {
            A1H.put(C273654mx.A00(262), r5.Asx().FHC());
        }
        if (r5.B8L() != null) {
            C294075lo B8L = r5.B8L();
            if (B8L != null) {
                treeUpdaterJNI = B8L.FHC();
            }
            A1H.put(C273654mx.A00(292), treeUpdaterJNI);
        }
        if (r5.getMediaId() != null) {
            C41845B3m.A13(r5.getMediaId(), A1H);
        }
        if (r5.CCA() != null) {
            A1H.put("upload_id", r5.CCA());
        }
        return 0Yt.A0B(A1H);
    }
}
