package X;

import androidx.compose.foundation.lazy.LazyListState;
import java.util.List;

/* renamed from: X.6Gw  reason: invalid class name and case insensitive filesystem */
public final class C305186Gw implements C305196Gx {
    public final LazyListState A00;

    public final float AEw(int i) {
        Object obj;
        LazyListState lazyListState = this.A00;
        C305076Gk r5 = (C305076Gk) lazyListState.A02();
        List list = r5.A0D;
        if (list.isEmpty()) {
            return 0.0f;
        }
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (((AnonymousClass6JK) ((AnonymousClass6JM) obj)).A07 == i) {
                break;
            }
            i2++;
        }
        AnonymousClass6JM r1 = (AnonymousClass6JM) obj;
        if (r1 != null) {
            return (float) ((AnonymousClass6JK) r1).A02;
        }
        int size2 = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            i3 += ((AnonymousClass6JK) ((AnonymousClass6JM) list.get(i4))).A09;
        }
        return ((float) (((i3 / list.size()) + r5.A05) * (i - lazyListState.A00()))) - ((float) lazyListState.A01());
    }

    public final int B6I() {
        return this.A00.A00();
    }

    public final int B6J() {
        return this.A00.A01();
    }

    public final int BLP() {
        AnonymousClass6JM r0 = (AnonymousClass6JM) 00k.A0L(((C305076Gk) this.A00.A02()).A0D);
        if (r0 != null) {
            return ((AnonymousClass6JK) r0).A07;
        }
        return 0;
    }

    public final Object EKU(AnonymousClass4D7 r3, 0sL r4) {
        Object EKT = this.A00.EKT(C54609HKs.A01, r3, r4);
        if (EKT != 1Hj.A02) {
            return C60340gF.A00;
        }
        return EKT;
    }

    public final void Evv(AnonymousClass6H1 r2, int i, int i2) {
        this.A00.A05(i, i2);
    }

    public final int getItemCount() {
        return ((C305076Gk) this.A00.A02()).A06;
    }

    public C305186Gw(LazyListState lazyListState) {
        this.A00 = lazyListState;
    }
}
