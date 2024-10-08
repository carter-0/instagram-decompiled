package X;

import com.google.android.exoplayer2.util.Util;
import java.util.UUID;

/* renamed from: X.4Tk  reason: invalid class name and case insensitive filesystem */
public final class C265324Tk implements AnonymousClass4TD {
    public boolean A00;
    public final int A01;
    public final AnonymousClass4TP A02;
    public final C265984Xc A03;
    public final /* synthetic */ AnonymousClass4TP A04;

    public final void Cnj() {
    }

    public C265324Tk(C265984Xc r1, AnonymousClass4TP r2, AnonymousClass4TP r3, int i) {
        this.A04 = r2;
        this.A02 = r3;
        this.A03 = r1;
        this.A01 = i;
    }

    private void A00() {
        if (!this.A00) {
            AnonymousClass4TP r2 = this.A04;
            C265174Sv r3 = r2.A0H;
            int[] iArr = r2.A0S;
            int i = this.A01;
            r3.A06(r2.A0T[i], (Object) null, iArr[i], 0, r2.A01);
            this.A00 = true;
        }
    }

    public final long C96(int i) {
        long j = ((AnonymousClass4XN) this.A04.A0K).A07;
        UUID uuid = AnonymousClass4T7.A04;
        return Util.A08(j);
    }

    public final boolean CaO() {
        AnonymousClass4TP r2 = this.A04;
        if (r2.A04() || !this.A03.A0E(r2.A0B)) {
            return false;
        }
        return true;
    }

    public final int E6J(AnonymousClass4PO r4, AnonymousClass4PQ r5, int i) {
        AnonymousClass4TP r2 = this.A04;
        if (r2.A04()) {
            return -3;
        }
        A00();
        return this.A03.A04(r4, r5, i, r2.A0B);
    }

    public final int Evj(long j) {
        AnonymousClass4TP r2 = this.A04;
        if (r2.A04()) {
            return 0;
        }
        C265984Xc r1 = this.A03;
        int A032 = r1.A03(j, r2.A0B);
        r1.A0A(A032);
        if (A032 <= 0) {
            return A032;
        }
        A00();
        return A032;
    }
}
