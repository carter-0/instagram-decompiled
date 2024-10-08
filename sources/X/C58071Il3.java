package X;

import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import com.instagram.barcelona.common.ui.toast.ToastDragDismissState;

/* renamed from: X.Il3  reason: case insensitive filesystem */
public final class C58071Il3 extends C64101El {
    public float A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58071Il3(ToastDragDismissState toastDragDismissState, AnonymousClass4D7 r3) {
        super(r3);
        this.A04 = toastDragDismissState;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.Il3, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        if (this.A05 != 0) {
            this.A03 = obj;
            this.A01 |= AnonymousClass972.MUTABLE_FLAG_MASK;
            return ((ToastDragDismissState) this.A04).A00((C284945Oz) null, this, 0.0f);
        }
        this.A04 = obj;
        this.A01 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return SnapFlingBehaviorKt.A01((C287955b5) null, (AnonymousClass6HR) null, (AnonymousClass6H1) null, this, (0sP) null, 0.0f);
    }

    public C58071Il3(AnonymousClass4D7 r2) {
        super(r2);
    }
}
