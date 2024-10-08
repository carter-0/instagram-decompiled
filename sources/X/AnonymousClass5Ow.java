package X;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5Ow  reason: invalid class name */
public abstract class AnonymousClass5Ow implements C284925Ox {
    public final C268494dV A00 = new AtomicInteger(0);

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(int r4) {
        /*
            r3 = this;
        L_0x0000:
            X.4dV r2 = r3.A00
            int r1 = r2.get()
            r0 = r1 & r4
            if (r0 != 0) goto L_0x0012
            r0 = r1 | r4
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x0000
        L_0x0012:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Ow.A01(int):void");
    }

    public /* synthetic */ AnonymousClass5P2 CoB(AnonymousClass5P2 r6, AnonymousClass5P2 r7, AnonymousClass5P2 r8) {
        int i;
        if (this instanceof ParcelableSnapshotMutableState) {
            0qQ.A0C(r6, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
            0qQ.A0C(r7, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
            0qQ.A0C(r8, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
            if (((ParcelableSnapshotMutableState) this).A01.ASs(((AnonymousClass5P1) r7).A00, ((AnonymousClass5P1) r8).A00)) {
                return r7;
            }
            return null;
        }
        if (this instanceof ParcelableSnapshotMutableLongState) {
            0qQ.A0C(r7, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            0qQ.A0C(r8, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            i = (((C3017960c) r7).A00 > ((C3017960c) r8).A00 ? 1 : (((C3017960c) r7).A00 == ((C3017960c) r8).A00 ? 0 : -1));
        } else if (this instanceof ParcelableSnapshotMutableIntState) {
            0qQ.A0C(r7, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            0qQ.A0C(r8, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            if (((AnonymousClass5XI) r7).A00 == ((AnonymousClass5XI) r8).A00) {
                return r7;
            }
            return null;
        } else if (!(this instanceof ParcelableSnapshotMutableFloatState)) {
            return null;
        } else {
            0qQ.A0C(r7, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            0qQ.A0C(r8, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            i = (((C284955Pa) r7).A00 > ((C284955Pa) r8).A00 ? 1 : (((C284955Pa) r7).A00 == ((C284955Pa) r8).A00 ? 0 : -1));
        }
        if (i == 0) {
            return r7;
        }
        return null;
    }
}
