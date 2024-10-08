package X;

import com.facebook.msys.mci.FileManager;
import java.util.Comparator;
import java.util.Map;

public final /* synthetic */ class TLj implements Comparator {
    public final /* synthetic */ Map A00;

    public /* synthetic */ TLj(Map map) {
        this.A00 = map;
    }

    public final int compare(Object obj, Object obj2) {
        Map map = this.A00;
        boolean z = FileManager.sInitialized;
        return (AnonymousClass7TE.A0R(Pxe.A0r(obj2, map)) > AnonymousClass7TE.A0R(Pxe.A0r(obj, map)) ? 1 : (AnonymousClass7TE.A0R(Pxe.A0r(obj2, map)) == AnonymousClass7TE.A0R(Pxe.A0r(obj, map)) ? 0 : -1));
    }
}
