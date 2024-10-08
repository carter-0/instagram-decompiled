package X;

import java.util.List;

public abstract class V5Y {
    public static AnonymousClass8KU A00(List list) {
        int width;
        int height;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass8KU r3 = (AnonymousClass8KU) list.get(i);
            if (C16767V5a.A00(r3)) {
                width = r3.getHeight();
                height = r3.getWidth();
            } else {
                width = r3.getWidth();
                height = r3.getHeight();
            }
            if (width > 1 && height > 1) {
                return r3;
            }
        }
        return null;
    }
}
