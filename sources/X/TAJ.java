package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public final class TAJ implements Iterable {
    public Map A00;

    public final Iterator iterator() {
        Map map = this.A00;
        if (map == null) {
            return Collections.emptyList().iterator();
        }
        return AnonymousClass7TF.A0v(map);
    }
}
