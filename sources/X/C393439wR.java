package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.NotePogImageDictIntf;
import com.instagram.api.schemas.NotePogVideoDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9wR  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C393439wR {
    public static Map A00(AnonymousClass60D r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (r4.BG4() != null) {
            NotePogImageDictIntf BG4 = r4.BG4();
            if (BG4 != null) {
                treeUpdaterJNI = BG4.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(3324), treeUpdaterJNI);
        }
        if (r4.CDx() != null) {
            NotePogVideoDictIntf CDx = r4.CDx();
            if (CDx != null) {
                treeUpdaterJNI2 = CDx.FHC();
            }
            A1H.put(AnonymousClass000.A00(4190), treeUpdaterJNI2);
        }
        return 0Yt.A0B(A1H);
    }
}
