package X;

import java.util.List;

/* renamed from: X.5LR  reason: invalid class name */
public abstract class AnonymousClass5LR {
    public static final AnonymousClass5LR A00 = new Object();
    public static final AnonymousClass5LR A01 = new Object();

    public final List A01(Object obj, long j) {
        if (!(this instanceof AnonymousClass5LT)) {
            return AnonymousClass5LS.A00(obj, 10, j);
        }
        C13980TnW tnW = (C13980TnW) C284115La.A01.A06(obj, j);
        if (((C13248TRo) tnW).A00) {
            return tnW;
        }
        int size = tnW.size();
        int i = size * 2;
        if (size == 0) {
            i = 10;
        }
        C13980TnW Con = tnW.Con(i);
        C284115La.A0A(obj, j, Con);
        return Con;
    }
}
