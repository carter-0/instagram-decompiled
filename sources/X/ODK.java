package X;

import java.util.Map;

public final class ODK {
    public final long A00 = System.currentTimeMillis();
    public final String A01;
    public final Map A02;

    public ODK(String str, Map map) {
        this.A01 = str;
        this.A02 = map;
    }
}
