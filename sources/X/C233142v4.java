package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2v4  reason: invalid class name and case insensitive filesystem */
public final class C233142v4 implements AnonymousClass2v2 {
    public long A00 = -1;
    public C233072uu A01;
    public final UserSession A02;

    public final void CNK(1Xj r22, Integer num, int i) {
        String A0F;
        C250513lZ injected;
        C250183l2 AaH;
        C269894fr B5T;
        1Xj r3 = r22;
        0qQ.A0B(r3, 0);
        if (this.A01 != null && (A0F = C231122qu.A0F(this.A02, r3)) != null && (injected = r3.A0C.getInjected()) != null && (AaH = injected.AaH()) != null && (B5T = AaH.B5T()) != null) {
            int i2 = i + 1;
            C57281IVq iVq = new C57281IVq(B5T, r3, A0F, i2, this.A00);
            1Xg r4 = new 1Xg(iVq, 1UQ.A08, iVq.getId());
            AnonymousClass3PG r32 = AnonymousClass3PG.NETWORK;
            C233462vl r7 = new C233462vl((C67241sS) null, (C233492vo) null, (String) null, 0, 0, 0, 0, 0, 16383, false, false, false, false);
            r7.A0B(i2);
            String A002 = AnonymousClass1FM.A00();
            AnonymousClass1FM.A00();
            AnonymousClass4EB r0 = new AnonymousClass4EB(new AnonymousClass9J8(1FI.A0M, A002), r4, r32, r7);
            C233072uu r2 = this.A01;
            if (r2 != null) {
                List singletonList = Collections.singletonList(r0);
                0qQ.A07(singletonList);
                r2.Dlz(AnonymousClass05K.A00, singletonList);
            }
        }
    }

    public final void EEY() {
        this.A01 = null;
    }

    public final boolean EsQ(1Xj r5) {
        C250513lZ injected;
        C250183l2 AaH;
        0qQ.A0B(r5, 0);
        if (!r5.CcK() || (injected = r5.A0C.getInjected()) == null || (AaH = injected.AaH()) == null || AaH.B5T() == null) {
            return false;
        }
        boolean A06 = 182.A06(0Tu.A05, this.A02, 36328736060161598L);
        0qQ.A0A(Boolean.valueOf(A06));
        return A06;
    }

    public C233142v4(UserSession userSession) {
        this.A02 = userSession;
    }

    public final void Eir(C233072uu r1) {
        this.A01 = r1;
    }
}
