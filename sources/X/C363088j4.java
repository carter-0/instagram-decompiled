package X;

import java.util.concurrent.Executor;

/* renamed from: X.8j4  reason: invalid class name and case insensitive filesystem */
public final class C363088j4 implements 1vo {
    public 0lg A00;

    public final AnonymousClass1EO ATL(2Kw r2, AnonymousClass2Kv r3, 1Ef r4) {
        return ATM(r2, r3, r4, (Executor) null);
    }

    public final AnonymousClass1EO ATM(2Kw r5, AnonymousClass2Kv r6, 1Ef r7, Executor executor) {
        boolean z = false;
        if (executor == null) {
            z = true;
        }
        17k.A0E(z);
        C239123Fb A01 = C46479Dfi.A01(this.A00);
        A01.A08(r7);
        1OC A06 = A01.A06();
        A06.A00 = new AnonymousClass9R9(r5, r6, this);
        1ES.A03(A06);
        if (!r7.isMutation()) {
            1t3.A02(r7.getSchema(), "IGGraphQLWWWLegacyQueryExecutor", r7.getCallName());
        }
        return new AnonymousClass9RA(A06);
    }

    public static synchronized C363088j4 A00(0lg r2) {
        C363088j4 r0;
        Class<C363088j4> cls = C363088j4.class;
        synchronized (cls) {
            r0 = (C363088j4) r2.A01(cls, new C363098j5(r2));
        }
        return r0;
    }
}
