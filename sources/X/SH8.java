package X;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

public final class SH8 {
    public static final SH8 $redex_init_class = null;
    public final long A00;
    public final Uri A01;
    public final Map A02;

    static {
        C11312SMg.A00("media3.datasource");
    }

    public SH8(Uri uri, Map map, long j) {
        C11366SPh.A01(Pxf.A1R((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        C11366SPh.A01(Pxf.A1R((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        this.A01 = uri;
        this.A02 = Collections.unmodifiableMap(Pxe.A19(map));
        this.A00 = j;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DataSpec[");
        A1A.append("GET");
        A1A.append(" ");
        A1A.append(this.A01);
        A1A.append(", ");
        A1A.append(this.A00);
        A1A.append(", ");
        A1A.append(-1);
        A1A.append(", ");
        A1A.append((String) null);
        A1A.append(", ");
        A1A.append(6);
        return AnonymousClass7TF.A0l("]", A1A);
    }
}
