package X;

import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;

/* renamed from: X.IEn  reason: case insensitive filesystem */
public final class C56840IEn implements JNQ {
    public final AnonymousClass5b9 A00;

    public C56840IEn(AnonymousClass5b9 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object ACE(AnonymousClass6H1 r9, Object obj, Object obj2, AnonymousClass4D7 r12, 0sP r13) {
        float A04 = AnonymousClass7TE.A04(obj);
        float A042 = AnonymousClass7TE.A04(obj2);
        return SnapFlingBehaviorKt.A00(this.A00, GQU.A00(0.0f, A042), r9, r12, r13, Math.abs(A04) * Math.signum(A042), A04);
    }
}
