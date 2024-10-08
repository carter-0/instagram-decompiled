package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Tsb  reason: case insensitive filesystem */
public abstract class C14253Tsb {
    public static final List A00 = Collections.emptyList();

    public static List A00(List list) {
        if (list == null || list.isEmpty()) {
            return A00;
        }
        return Collections.unmodifiableList(new ArrayList(list));
    }
}
