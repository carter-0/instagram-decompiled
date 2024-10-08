package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.KqA  reason: case insensitive filesystem */
public abstract /* synthetic */ class C63019KqA {
    public static Map A00(C2816258t r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.Aiu() != null) {
            A1H.put(C273654mx.A00(244), r3.Aiu());
        }
        if (r3.getDescription() != null) {
            A1H.put(DevServerEntity.COLUMN_DESCRIPTION, r3.getDescription());
        }
        return 0Yt.A0B(A1H);
    }
}
