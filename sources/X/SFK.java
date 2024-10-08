package X;

import java.util.Collections;
import java.util.List;

public final class SFK {
    public static final SFK A04 = new SFK((SDw) null, (C10455RsW) null, "", Collections.unmodifiableList(AnonymousClass7TE.A1C()));
    public final SDw A00;
    public final C10455RsW A01;
    public final String A02;
    public final List A03;

    public SFK(SDw sDw, C10455RsW rsW, String str, List list) {
        this.A01 = rsW;
        this.A03 = list;
        this.A00 = sDw;
        this.A02 = str;
    }
}
