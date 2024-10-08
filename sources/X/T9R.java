package X;

import java.io.Serializable;
import java.util.Collections;
import java.util.Set;

public final class T9R implements Serializable {
    public final Set A00;
    public final Set A01;

    public final boolean A00(Object obj) {
        Set set = this.A01;
        if ((set == null || set.contains(obj)) && !this.A00.contains(obj)) {
            return false;
        }
        return true;
    }

    public T9R(Set set, Set set2) {
        this.A00 = set == null ? Collections.emptySet() : set;
        this.A01 = set2;
    }
}
