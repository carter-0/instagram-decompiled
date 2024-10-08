package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Alignment;

/* renamed from: X.5WJ  reason: invalid class name */
public final class AnonymousClass5WJ extends AnonymousClass5WK {
    public long A00 = AnonymousClass5SF.A05(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
    public AnonymousClass5b9 A01;
    public Alignment A02;
    public boolean A03;
    public long A04 = AnonymousClass6C8.A00;
    public final C284945Oz A05;

    public final void A0D() {
        this.A05.Epw((Object) null);
    }

    public final void A0E() {
        this.A04 = AnonymousClass6C8.A00;
        this.A03 = false;
    }

    public final C289145d6 Cny(C268074ci r22, C268004cb r23, long j) {
        C267974cY Cnz;
        long A07;
        C268004cb r12 = r23;
        C268074ci r3 = r22;
        long j2 = j;
        if (r12.CWf()) {
            this.A00 = j2;
            this.A03 = true;
            Cnz = r3.Cnz(j2);
        } else {
            long j3 = j2;
            if (this.A03) {
                j3 = this.A00;
            }
            Cnz = r3.Cnz(j3);
        }
        long A002 = C289155d7.A00(Cnz.A01, Cnz.A00);
        if (r12.CWf()) {
            this.A04 = A002;
            A07 = A002;
        } else {
            long j4 = this.A04;
            if (j4 == AnonymousClass6C8.A00) {
                j4 = A002;
            }
            C284945Oz r11 = this.A05;
            C304476Dp r10 = (C304476Dp) r11.getValue();
            boolean z = true;
            if (r10 != null) {
                AnonymousClass5b4 r14 = r10.A01;
                C284945Oz r13 = r14.A04.A05;
                if (j4 == ((C289005cr) r13.getValue()).A00 || ((Boolean) r14.A08.getValue()).booleanValue()) {
                    z = false;
                }
                if (j4 != ((C289005cr) r14.A09.getValue()).A00 || z) {
                    r10.A00 = ((C289005cr) r13.getValue()).A00;
                    C262224Cq A052 = A05();
                    AnonymousClass9K5 r15 = new AnonymousClass9K5(r10, this, (AnonymousClass4D7) null, j4);
                    1Eo.A03(AnonymousClass05K.A00, 19B.A00, r15, A052);
                }
            } else {
                r10 = new C304476Dp(new AnonymousClass5b4(C287765aj.A04, new C289005cr(j4), new C289005cr(1 | (1 << 32))), j4);
            }
            r11.Epw(r10);
            A07 = AnonymousClass5SF.A07(j2, ((C289005cr) r10.A01.A04.A05.getValue()).A00);
        }
        int i = (int) (A07 >> 32);
        int A003 = C289005cr.A00(A07);
        return r12.Cfi(0Yt.A0E(), new C304486Dq(this, r12, Cnz, i, A003, A002), i, A003);
    }

    public AnonymousClass5WJ(AnonymousClass5b9 r4, Alignment alignment) {
        this.A01 = r4;
        this.A02 = alignment;
        C284885Or r1 = C284885Or.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A05 = new ParcelableSnapshotMutableState(r1, (Object) null);
    }
}
