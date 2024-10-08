package X;

import android.graphics.Path;
import java.util.List;

public final class S05 {
    public final List A00 = AnonymousClass7TE.A1C();

    public final void A00(Path path) {
        List list = this.A00;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C11783SgV sgV = (C11783SgV) list.get(size);
                if (sgV != null && !sgV.A05) {
                    SSo.A03(path, ((QGR) sgV.A02).A0B() / 100.0f, ((QGR) sgV.A00).A0B() / 100.0f, ((QGR) sgV.A01).A0B() / 360.0f);
                }
            } else {
                return;
            }
        }
    }
}
