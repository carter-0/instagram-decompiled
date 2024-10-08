package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6Hz  reason: invalid class name and case insensitive filesystem */
public final class C305436Hz implements AnonymousClass5Y2, AnonymousClass6I0 {
    public final C284945Oz A00;
    public final AnonymousClass5Y2 A01;
    public final Set A02 = new LinkedHashSet();

    public final boolean AFI(Object obj) {
        return this.A01.AFI(obj);
    }

    public final Object AJV(String str) {
        return this.A01.AJV(str);
    }

    public final C305556In EC0(String str, C62320sa r3) {
        return this.A01.EC0(str, r3);
    }

    public C305436Hz(AnonymousClass5Y2 r4, Map map) {
        this.A01 = new AnonymousClass5Y1(map, new AnonymousClass9L6(r4, 23));
        C284885Or r1 = C284885Or.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A00 = new ParcelableSnapshotMutableState(r1, (Object) null);
    }

    public final Map E2c() {
        AnonymousClass6I0 r2 = (AnonymousClass6I0) this.A00.getValue();
        if (r2 != null) {
            for (Object EEf : this.A02) {
                r2.EEf(EEf);
            }
        }
        return this.A01.E2c();
    }

    public final void EEf(Object obj) {
        AnonymousClass6I0 r0 = (AnonymousClass6I0) this.A00.getValue();
        if (r0 != null) {
            r0.EEf(obj);
            return;
        }
        throw new IllegalArgumentException("null wrappedHolder");
    }

    public final void A6s(C286575Wy r10, Object obj, 0sL r12, int i) {
        int i2;
        r10.ExV(-697180401);
        int i3 = i;
        Object obj2 = obj;
        if ((i & 6) == 0) {
            int i4 = 2;
            if (r10.AGw(obj)) {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        0sL r8 = r12;
        if ((i & 48) == 0) {
            int i5 = 16;
            if (r10.AGw(r12)) {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            int i6 = 128;
            if (r10.AGw(this)) {
                i6 = 256;
            }
            i2 |= i6;
        }
        if ((i2 & 147) != 146 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1947073440, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
            }
            AnonymousClass6I0 r2 = (AnonymousClass6I0) this.A00.getValue();
            if (r2 != null) {
                r2.A6s(r10, obj, r12, (i2 & 112) | (i2 & 14));
                boolean AGw = r10.AGw(this) | r10.AGw(obj);
                Object ECw = r10.ECw();
                if (AGw || ECw == AnonymousClass5XT.A00) {
                    ECw = new C377469Ly(3, (Object) this, obj);
                    r10.FLL(ECw);
                }
                C286645Xf.A03(r10, obj, (0sP) ECw);
                if (0fL.A02()) {
                    0fL.A00(-2076601886);
                }
            } else {
                throw new IllegalArgumentException("null wrappedHolder");
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new AnonymousClass9MK(i3, 0, this, obj2, r8);
        }
    }
}
