package X;

import android.util.Pair;

/* renamed from: X.9kz  reason: invalid class name and case insensitive filesystem */
public final class C386679kz extends 0ng {
    public final /* synthetic */ AnonymousClass8HJ A00;
    public final /* synthetic */ AnonymousClass8HG A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386679kz(AnonymousClass8HJ r4, AnonymousClass8HG r5) {
        super(77, 3, false, false);
        this.A01 = r5;
        this.A00 = r4;
    }

    public final void run() {
        Pair pair;
        AnonymousClass8HG r4 = this.A01;
        AnonymousClass8HT r1 = r4.A06;
        AnonymousClass8HJ r3 = this.A00;
        r1.A01(r3.A00);
        if (r4 instanceof AnonymousClass8HF) {
            AnonymousClass8HF r42 = (AnonymousClass8HF) r4;
            C39735A7b a7b = (C39735A7b) r42.A0L.get(r42.A0T);
            if (a7b != null) {
                pair = new Pair(Float.valueOf(a7b.A00), Float.valueOf(a7b.A01));
            } else {
                pair = null;
            }
            r42.A0T = r3;
            AnonymousClass8HF.A00(pair, r42);
            return;
        }
        ((C387389m8) r4).A04 = r3;
    }
}
