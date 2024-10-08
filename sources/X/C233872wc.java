package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.2wc  reason: invalid class name and case insensitive filesystem */
public final class C233872wc implements AnonymousClass2v2 {
    public long A00 = -1;
    public C233072uu A01;
    public final long A02;
    public final long A03;
    public final UserSession A04;

    public C233872wc(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        0Tu r2 = 0Tu.A05;
        this.A02 = 182.A01(r2, userSession, 36604996946564261L);
        this.A03 = 182.A01(r2, userSession, 36604996946629798L);
    }

    public final void CNK(1Xj r22, Integer num, int i) {
        String A0F;
        C250513lZ injected;
        C250183l2 AaH;
        C269904fs BIQ;
        1Xj r4 = r22;
        0qQ.A0B(r4, 0);
        if (this.A01 != null && (A0F = C231122qu.A0F(this.A04, r4)) != null && (injected = r4.A0C.getInjected()) != null && (AaH = injected.AaH()) != null && (BIQ = AaH.BIQ()) != null) {
            int i2 = i + 1;
            C57280IVp iVp = new C57280IVp(BIQ, r4, A0F, i2);
            1Xg r5 = new 1Xg(iVp, 1UQ.A07, iVp.getId());
            AnonymousClass3PG r42 = AnonymousClass3PG.NETWORK;
            C233462vl r7 = new C233462vl((C67241sS) null, (C233492vo) null, (String) null, 0, 0, 0, 0, 0, 16383, false, false, false, false);
            r7.A0B(i2);
            String A002 = AnonymousClass1FM.A00();
            AnonymousClass1FM.A00();
            AnonymousClass4EB r0 = new AnonymousClass4EB(new AnonymousClass9J8(1FI.A0M, A002), r5, r42, r7);
            C233072uu r2 = this.A01;
            if (r2 != null) {
                r2.Dlz(AnonymousClass05K.A00, 0sr.A1M(new AnonymousClass4EB[]{r0}));
            }
            this.A00 = System.currentTimeMillis();
        }
    }

    public final void EEY() {
        this.A01 = null;
    }

    public final boolean EsQ(1Xj r9) {
        C250513lZ injected;
        C250183l2 AaH;
        C269904fs BIQ;
        int i;
        0qQ.A0B(r9, 0);
        if (r9.CcK()) {
            long j = this.A00;
            if (!((j >= 0 && System.currentTimeMillis() < j + this.A02) || (injected = r9.A0C.getInjected()) == null || (AaH = injected.AaH()) == null || (BIQ = AaH.BIQ()) == null)) {
                List BIP = BIQ.BIP();
                if (BIP != null) {
                    i = BIP.size();
                } else {
                    i = 0;
                }
                if (((long) i) >= this.A03) {
                    boolean A06 = 182.A06(0Tu.A05, this.A04, 36323521969794287L);
                    0qQ.A0A(Boolean.valueOf(A06));
                    return A06;
                }
            }
        }
        return false;
    }

    public final void Eir(C233072uu r1) {
        this.A01 = r1;
    }
}
