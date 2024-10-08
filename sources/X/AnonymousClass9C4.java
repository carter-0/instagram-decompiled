package X;

import java.util.List;

/* renamed from: X.9C4  reason: invalid class name */
public abstract class AnonymousClass9C4 {
    public static final AnonymousClass9C4 A00 = new Object();
    public static final AnonymousClass9C4 A01 = new Object();

    public final List A01(Object obj, long j) {
        if (!(this instanceof AnonymousClass9C6)) {
            return AnonymousClass9C5.A00(obj, 10, j);
        }
        AnonymousClass978 r2 = (AnonymousClass978) AnonymousClass9CA.A01.A06(obj, j);
        if (((AnonymousClass977) r2).A00) {
            return r2;
        }
        int size = r2.size();
        int i = size * 2;
        if (size == 0) {
            i = 10;
        }
        AnonymousClass978 Coo = r2.Coo(i);
        AnonymousClass9CA.A05(obj, j, Coo);
        return Coo;
    }
}
