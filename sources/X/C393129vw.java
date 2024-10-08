package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9vw  reason: invalid class name and case insensitive filesystem */
public abstract class C393129vw {
    public static final ArrayList A00(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        int size = list.size() - 1;
        for (int i = 1; i < size; i++) {
            if (AnonymousClass7TG.A00(list, i) >= AnonymousClass7TG.A00(list, i - 1) && AnonymousClass7TG.A00(list, i) >= AnonymousClass7TG.A00(list, i + 1)) {
                AnonymousClass7TF.A1M(A1C, i);
            }
        }
        return A1C;
    }
}
