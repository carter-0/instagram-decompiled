package X;

import android.util.Pair;

/* renamed from: X.8F2  reason: invalid class name */
public final class AnonymousClass8F2 implements C3495480u {
    public final /* synthetic */ AnonymousClass8E8 A00;

    public AnonymousClass8F2(AnonymousClass8E8 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        AnonymousClass8EL r1;
        Pair pair = (Pair) obj;
        0qQ.A0B(pair, 0);
        AnonymousClass8EA r0 = this.A00.A00;
        if (r0 != null && (r1 = (AnonymousClass8EL) r0.A0D.get(pair.first)) != null) {
            Object obj2 = pair.second;
            0qQ.A06(obj2);
            r1.A08((C3494580l) obj2);
        }
    }
}
