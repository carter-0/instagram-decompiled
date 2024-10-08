package X;

import androidx.lifecycle.CoroutineLiveData;

/* renamed from: X.3EW  reason: invalid class name */
public final class AnonymousClass3EW implements AnonymousClass3EX {
    public CoroutineLiveData A00;
    public final C262094Cc A01;

    public AnonymousClass3EW(CoroutineLiveData coroutineLiveData, C262094Cc r3) {
        0qQ.A0B(coroutineLiveData, 1);
        0qQ.A0B(r3, 2);
        this.A00 = coroutineLiveData;
        AnonymousClass4CZ r0 = AnonymousClass12W.A01;
        this.A01 = r3.plus(AnonymousClass12y.A00.A0P());
    }

    public final Object emit(Object obj, AnonymousClass4D7 r6) {
        Object A002 = 1Eo.A00(r6, this.A01, new AnonymousClass9K3((Object) this, obj, (AnonymousClass4D7) null, 16));
        if (A002 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A002;
    }
}
