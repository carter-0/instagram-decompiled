package X;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* renamed from: X.A4t  reason: case insensitive filesystem */
public final class C39677A4t {
    public final Exception A00;
    public final Map A01;

    public C39677A4t(Exception exc, Map map) {
        Map copyOf;
        this.A00 = exc;
        if (map == null) {
            copyOf = null;
        } else {
            copyOf = ImmutableMap.copyOf(map);
        }
        this.A01 = copyOf;
    }
}
