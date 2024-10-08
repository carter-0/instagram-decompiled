package X;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

public final class JAG extends 0Yg implements 0sL {
    public final /* synthetic */ float A00;
    public final /* synthetic */ AnonymousClass6Gj A01;
    public final /* synthetic */ C304836Fk A02;
    public final /* synthetic */ JLC A03;
    public final /* synthetic */ LazyStaggeredGridState A04;
    public final /* synthetic */ C285855Sz A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ C262224Cq A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JAG(AnonymousClass6Gj r2, C304836Fk r3, JLC jlc, LazyStaggeredGridState lazyStaggeredGridState, C285855Sz r6, C62320sa r7, C262224Cq r8, float f, boolean z) {
        super(2);
        this.A04 = lazyStaggeredGridState;
        this.A01 = r2;
        this.A03 = jlc;
        this.A06 = r7;
        this.A02 = r3;
        this.A08 = z;
        this.A00 = f;
        this.A07 = r8;
        this.A05 = r6;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C304826Fj r10;
        float f;
        float f2;
        float f3;
        int A012;
        long A002;
        int i;
        int A013;
        0sP r8;
        C305586Iq r5 = (C305586Iq) obj;
        long j = ((Constraints) obj2).A00;
        LazyStaggeredGridState lazyStaggeredGridState = this.A04;
        lazyStaggeredGridState.A0H.getValue();
        AnonymousClass6Gj r9 = this.A01;
        AnonymousClass6J2.A00(r9, j);
        IFO ifo = (IFO) this.A03;
        C55580Hk0 hk0 = ifo.A02;
        if (hk0 != null && ifo.A01 == j && ifo.A00 == r5.AwL()) {
            0qQ.A0A(hk0);
        } else {
            ifo.A01 = j;
            ifo.A00 = r5.AwL();
            hk0 = (C55580Hk0) ifo.A03.invoke(r5, new Constraints(j));
            ifo.A02 = hk0;
        }
        boolean A1W = AnonymousClass7TF.A1W(r9, AnonymousClass6Gj.Vertical);
        C59664JSj jSj = (C59664JSj) this.A06.invoke();
        C304836Fk r102 = this.A02;
        boolean z = this.A08;
        int ordinal = r9.ordinal();
        if (ordinal == 0) {
            r10 = (C304826Fj) r102;
            if (z) {
                f = r10.A00;
            } else {
                f = r10.A03;
            }
        } else if (ordinal == 1) {
            r10 = (C304826Fj) r102;
            if (z) {
                f = r10.A01;
            } else {
                f = r10.A02;
            }
        } else {
            throw AnonymousClass7TE.A1K();
        }
        int EJS = r5.EJS(f);
        if (ordinal != 0) {
            if (z) {
                f2 = r10.A02;
            } else {
                f2 = r10.A01;
            }
        } else if (z) {
            f2 = r10.A03;
        } else {
            f2 = r10.A00;
        }
        int EJS2 = r5.EJS(f2);
        if (ordinal != 0) {
            f3 = r10.A03;
        } else {
            f3 = r10.A02;
        }
        int EJS3 = r5.EJS(f3);
        if (A1W) {
            A012 = Constraints.A00(j);
        } else {
            A012 = Constraints.A01(j);
        }
        int i2 = (A012 - EJS) - EJS2;
        if (A1W) {
            A002 = AnonymousClass5TW.A00(EJS3, EJS);
        } else {
            A002 = AnonymousClass5TW.A00(EJS, EJS3);
        }
        int EJS4 = r5.EJS(r10.A02 + r10.A01);
        int EJS5 = r5.EJS(r10.A03 + r10.A00);
        List A003 = AnonymousClass6J6.A00(lazyStaggeredGridState.A08, jSj, lazyStaggeredGridState.A0A);
        long A042 = Constraints.A04(AnonymousClass5SF.A03(j, EJS4), Constraints.A01(j), AnonymousClass5SF.A02(j, EJS5), Constraints.A00(j));
        int EJS6 = r5.EJS(this.A00);
        C56013HrL hrL = new C56013HrL(r5, jSj, hk0, lazyStaggeredGridState, this.A05, A003, this.A07, i2, EJS, EJS2, EJS6, A042, A002, A1W, z);
        I48 i48 = lazyStaggeredGridState.A0D;
        int[] iArr = i48.A02;
        int A004 = AnonymousClass6J5.A00(jSj, i48.A00, C51967G9n.A04(03t.A04(iArr, 0), 0));
        if (!03t.A0P(iArr, A004)) {
            i48.A04.A00(A004);
            Snapshot A022 = AnonymousClass5PH.A02();
            if (A022 != null) {
                r8 = A022.A05();
            } else {
                r8 = null;
            }
            Snapshot A032 = AnonymousClass5PH.A03(A022);
            try {
                iArr = (int[]) i48.A07.invoke(Integer.valueOf(A004), Integer.valueOf(iArr.length));
                AnonymousClass5PH.A06(A022, A032, r8);
                i48.A02 = iArr;
                i48.A05.EZz(I48.A00(iArr));
            } catch (Throwable th) {
                AnonymousClass5PH.A06(A022, A032, r8);
                throw th;
            }
        }
        int[] iArr2 = i48.A03;
        int length = iArr.length;
        int i3 = hrL.A02;
        if (length != i3) {
            I24 i24 = hrL.A09;
            i24.A03();
            int[] iArr3 = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                if (i4 >= length || (A013 = iArr[i4]) == -1) {
                    if (i4 == 0) {
                        A013 = 0;
                    } else {
                        A013 = C56627I5g.A01(iArr3, (((long) i4) & 4294967295L) | C51971G9r.A0J()) + 1;
                    }
                }
                iArr3[i4] = A013;
                i24.A05(A013, i4);
            }
            iArr = iArr3;
        }
        int length2 = iArr2.length;
        if (length2 != i3) {
            int[] iArr4 = new int[i3];
            for (int i5 = 0; i5 < i3; i5++) {
                if (i5 < length2) {
                    i = iArr2[i5];
                } else if (i5 == 0) {
                    i = 0;
                } else {
                    i = iArr4[i5 - 1];
                }
                iArr4[i5] = i;
            }
            iArr2 = iArr4;
        }
        IGX A023 = C56627I5g.A02(hrL, iArr, iArr2, Math.round(lazyStaggeredGridState.A00), true);
        lazyStaggeredGridState.A02(A023, false);
        return A023;
    }
}
