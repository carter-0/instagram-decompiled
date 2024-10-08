package X;

import java.util.Set;

/* renamed from: X.2zB  reason: invalid class name and case insensitive filesystem */
public abstract class C235042zB implements C250603lj {
    public final long A00;

    public void A00(Object obj, long j, Object obj2) {
        String str;
        1Xj BPf;
        1Xj BPf2;
        C235032zA r3 = (C235032zA) this;
        C245833dY r9 = (C245833dY) obj2;
        0qQ.A0B(r9, 1);
        C247733gp r4 = r9.A01;
        if (!r4.A03() && r4.A06 == C252883pr.Success) {
            Set set = r3.A02;
            if (!set.contains(r4.A0G) && (str = r4.A0G) != null && str.length() != 0) {
                set.add(str);
                r3.A00.A02(r4, r9.A02);
                C269874fp r1 = r4.A0W;
                if (r1 != null && (BPf = r1.BPf()) != null && BPf.A5G() && (BPf2 = r1.BPf()) != null) {
                    new C55915Hpc(r3.A01).A00(BPf2);
                }
            }
        }
    }

    public final void ATF(AnonymousClass30Y r7, C252093oY r8) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(r8, 1);
        if (r8.CEk(r7) == AnonymousClass05K.A0C) {
            long B0M = r8.B0M(r7);
            if (B0M >= this.A00) {
                A00(r7.A03, B0M, r7.A04);
            }
        }
    }

    public C235042zB(long j) {
        this.A00 = j;
    }
}
