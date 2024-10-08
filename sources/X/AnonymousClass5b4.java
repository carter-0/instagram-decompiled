package X;

import androidx.compose.animation.core.Animatable$runAnimation$2;
import androidx.compose.animation.core.Animatable$snapTo$2;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.5b4  reason: invalid class name */
public final class AnonymousClass5b4 {
    public Object A00;
    public C287725af A01;
    public C287725af A02;
    public Object A03;
    public final C287955b5 A04;
    public final AnonymousClass5b6 A05 = new AnonymousClass5b6();
    public final C287965b7 A06;
    public final C287805an A07;
    public final C284945Oz A08;
    public final C284945Oz A09;
    public final C287725af A0A;
    public final C287725af A0B;
    public final Object A0C;

    public final Object A03(AnonymousClass5b9 r7, Object obj, Object obj2, AnonymousClass4D7 r10) {
        return A04(r7, obj, obj2, r10, (0sP) null);
    }

    public final Object A04(AnonymousClass5b9 r14, Object obj, Object obj2, AnonymousClass4D7 r17, 0sP r18) {
        C287955b5 r1 = this.A04;
        Object value = r1.A05.getValue();
        C287805an r10 = this.A07;
        Object obj3 = obj2;
        C3025864f r7 = new C3025864f(r14, (C287725af) ((C287795am) r10).A01.invoke(obj3), r10, value, obj);
        long j = r1.A01;
        return 19E.A00(r17, new AnonymousClass9KT(this.A05, AnonymousClass05K.A00, (AnonymousClass4D7) null, new Animatable$runAnimation$2(this, r7, obj3, (AnonymousClass4D7) null, r18, j)));
    }

    public static final Object A00(AnonymousClass5b4 r8, Object obj) {
        if (!0qQ.A0K(r8.A01, r8.A0A) || !0qQ.A0K(r8.A02, r8.A0B)) {
            C287795am r6 = (C287795am) r8.A07;
            C287725af r5 = (C287725af) r6.A01.invoke(obj);
            int A012 = r5.A01();
            boolean z = false;
            for (int i = 0; i < A012; i++) {
                float A002 = r5.A00(i);
                C287725af r7 = r8.A01;
                if (A002 < r7.A00(i) || r5.A00(i) > r8.A02.A00(i)) {
                    r5.A03(i, C229632nm.A02(r5.A00(i), r7.A00(i), r8.A02.A00(i)));
                    z = true;
                }
            }
            if (z) {
                return r6.A00.invoke(r5);
            }
        }
        return obj;
    }

    public static final void A01(AnonymousClass5b4 r3) {
        C287955b5 r2 = r3.A04;
        r2.A02.A02();
        r2.A01 = Long.MIN_VALUE;
        r3.A08.Epw(false);
    }

    public final Object A02() {
        return ((C287795am) this.A07).A00.invoke(this.A04.A02);
    }

    public final Object A05(Object obj, AnonymousClass4D7 r7) {
        Object A002 = 19E.A00(r7, new AnonymousClass9KT(this.A05, AnonymousClass05K.A00, (AnonymousClass4D7) null, new Animatable$snapTo$2(this, obj, (AnonymousClass4D7) null)));
        if (A002 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A002;
    }

    public final Object A06(AnonymousClass4D7 r6) {
        Object A002 = 19E.A00(r6, new AnonymousClass9KT(this.A05, AnonymousClass05K.A00, (AnonymousClass4D7) null, new C58081IlI(this, (AnonymousClass4D7) null, 0)));
        if (A002 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A002;
    }

    public final void A07(Object obj, Object obj2) {
        C287725af r5;
        C287725af r4;
        if (obj == null || (r5 = (C287725af) ((C287795am) this.A07).A01.invoke(obj)) == null) {
            r5 = this.A0A;
        }
        if (obj2 == null || (r4 = (C287725af) ((C287795am) this.A07).A01.invoke(obj2)) == null) {
            r4 = this.A0B;
        }
        int A012 = r5.A01();
        int i = 0;
        while (i < A012) {
            if (r5.A00(i) <= r4.A00(i)) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: ");
                sb.append(r5);
                sb.append(" is greater than upper bound ");
                sb.append(r4);
                sb.append(" on index ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        this.A01 = r5;
        this.A02 = r4;
        this.A00 = obj2;
        this.A03 = obj;
        if (!((Boolean) this.A08.getValue()).booleanValue()) {
            C284945Oz r2 = this.A04.A05;
            Object A002 = A00(this, r2.getValue());
            if (!0qQ.A0K(A002, r2.getValue())) {
                r2.Epw(A002);
            }
        }
    }

    public AnonymousClass5b4(C287805an r11, Object obj, Object obj2) {
        C287725af r3;
        C287725af r0;
        this.A07 = r11;
        this.A0C = obj2;
        this.A04 = new C287955b5((C287725af) null, r11, obj, Long.MIN_VALUE, Long.MIN_VALUE, false);
        C284885Or r2 = C284885Or.A00;
        0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        AnonymousClass0eM r02 = C284905Ot.A01;
        this.A08 = new ParcelableSnapshotMutableState(r2, false);
        0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A09 = new ParcelableSnapshotMutableState(r2, obj);
        this.A06 = new C287965b7(obj2, 1.0f, 1500.0f);
        C287725af r1 = this.A04.A02;
        if (r1 instanceof C287715ae) {
            r3 = C287705ad.A00;
        } else if (r1 instanceof C287735ag) {
            r3 = C287705ad.A02;
        } else if (r1 instanceof C287745ah) {
            r3 = C287705ad.A04;
        } else {
            r3 = C287705ad.A06;
        }
        0qQ.A0C(r3, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.A0A = r3;
        C287725af r12 = this.A04.A02;
        if (r12 instanceof C287715ae) {
            r0 = C287705ad.A01;
        } else if (r12 instanceof C287735ag) {
            r0 = C287705ad.A03;
        } else if (r12 instanceof C287745ah) {
            r0 = C287705ad.A05;
        } else {
            r0 = C287705ad.A07;
        }
        0qQ.A0C(r0, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.A0B = r0;
        this.A01 = r3;
        this.A02 = r0;
    }
}
