package X;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.RfZ  reason: case insensitive filesystem */
public abstract class C9716RfZ {
    public static List A00(C13647TeE teE, List list) {
        if (list instanceof RandomAccess) {
            return new C13259TRz(teE, list);
        }
        return new TSA(teE, list);
    }
}
