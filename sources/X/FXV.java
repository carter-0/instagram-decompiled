package X;

import java.lang.ref.WeakReference;

public final class FXV implements 1wn {
    public final 0lg A00;
    public final String A01;
    public final String A02;
    public final WeakReference A03;

    public FXV(C307446Qd r2, 0lg r3, String str, String str2) {
        0qQ.A0B(str2, 4);
        this.A00 = r3;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = new WeakReference(r2);
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1134397147);
        1qJ r8 = (1qJ) obj;
        int A033 = AnonymousClass0fD.A03(-1615561305);
        0qQ.A0B(r8, 0);
        C307446Qd r3 = (C307446Qd) this.A03.get();
        if (r3 == null) {
            AnonymousClass1Nd.A00(this.A00).A02(this, 1qJ.class);
        } else {
            1Xj r2 = r8.A00;
            if (00p.A0j(r2.getId(), this.A01, false)) {
                C307446Qd.A03(new Q4K(r3, C54854HVl.A00(r2), this.A02));
            }
        }
        AnonymousClass0fD.A0A(-2015625496, A033);
        AnonymousClass0fD.A0A(10810100, A032);
    }
}
