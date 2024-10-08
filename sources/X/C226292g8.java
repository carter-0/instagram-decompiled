package X;

import androidx.lifecycle.CoroutineLiveData;

/* renamed from: X.2g8  reason: invalid class name and case insensitive filesystem */
public abstract class C226292g8 {
    public static final CoroutineLiveData A00(C262094Cc r4, AnonymousClass0r6 r5) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(r4, 1);
        CoroutineLiveData A00 = AnonymousClass2g9.A00(r4, new AnonymousClass9K3((Object) r5, (AnonymousClass4D7) null, 14, 42));
        if (r5 instanceof AnonymousClass0Ud) {
            boolean A03 = C21057XCj.A00().A03();
            Object value = ((AnonymousClass0Ud) r5).getValue();
            if (A03) {
                A00.A0B(value);
            } else {
                A00.A0A(value);
                return A00;
            }
        }
        return A00;
    }

    public static final AnonymousClass0r6 A01(2Fk r4) {
        return 11M.A00(AnonymousClass05K.A00, AnonymousClass0Zq.A00(new AnonymousClass9K3((Object) r4, (AnonymousClass4D7) null, 13, 42)), -1);
    }
}
