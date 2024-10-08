package X;

import java.util.List;

/* renamed from: X.RdB  reason: case insensitive filesystem */
public abstract class C9571RdB {
    public static AnonymousClass0cm A00(List list) {
        int size = list.size();
        if (size == 0) {
            return C9950Rk3.A00;
        }
        if (size != 1) {
            return new 0P6((AnonymousClass0cm[]) list.toArray(new AnonymousClass0cm[size]));
        }
        return (AnonymousClass0cm) AnonymousClass7TE.A13(list);
    }
}
