package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class B4O {
    public static Map A00(AnonymousClass1s2 r3) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        r3.getEnabled();
        A1H.put("enabled", Boolean.valueOf(r3.getEnabled()));
        if (r3.B21() != null) {
            C245423cs B21 = r3.B21();
            if (B21 != null) {
                treeUpdaterJNI = B21.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("entry_point_container", treeUpdaterJNI);
        }
        return 0Yt.A0B(A1H);
    }
}
