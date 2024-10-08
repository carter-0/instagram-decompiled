package X;

import java.util.Map;

public abstract class PzN {
    public static final C9553Rcq A04 = new Object();
    public static final C62320sa A05 = PzO.A00;
    public final String A00;
    public final String A01;
    public final String A02;
    public final Map A03;

    public final String toString() {
        return 0rw.A0u(002.A18("\n      |[DebugEvent]\n      |  type = '", this.A02, "',\n      |  renderStateId = '", this.A00, "',\n      |  thread = '", this.A01, "',\n      |  attributes = ", 00k.A0P(",\n", "{\n", "\n|  }", this.A03.entrySet(), C13362TWw.A00), "\n    "), "|");
    }

    public PzN(String str, String str2, String str3, Map map) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = map;
    }
}
