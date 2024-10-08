package X;

import com.instagram.barcelona.common.ui.toast.ToastDragDismissState;

/* renamed from: X.ImY  reason: case insensitive filesystem */
public final class C58109ImY extends AnonymousClass1Ek implements 0sK {
    public float A00;
    public int A01;
    public final int A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58109ImY(ToastDragDismissState toastDragDismissState, AnonymousClass4D7 r3, int i) {
        super(3, r3);
        this.A02 = i;
        this.A03 = toastDragDismissState;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.A02;
        float A04 = AnonymousClass7TE.A04(obj2);
        AnonymousClass4D7 r7 = (AnonymousClass4D7) obj3;
        ToastDragDismissState toastDragDismissState = (ToastDragDismissState) this.A03;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        C58109ImY imY = new C58109ImY(toastDragDismissState, r7, i);
        imY.A00 = A04;
        return imY.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.ImY, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        float f;
        ToastDragDismissState toastDragDismissState;
        C284945Oz r0;
        int i = this.A02;
        1Hj r4 = 1Hj.A02;
        int i2 = this.A01;
        if (i != 0) {
            if (i2 == 0) {
                0eS.A00(obj);
                f = this.A00;
                toastDragDismissState = (ToastDragDismissState) this.A03;
                r0 = toastDragDismissState.A04;
            }
            0eS.A00(obj);
            return C60340gF.A00;
        }
        if (i2 == 0) {
            0eS.A00(obj);
            f = this.A00;
            toastDragDismissState = (ToastDragDismissState) this.A03;
            r0 = toastDragDismissState.A03;
        }
        0eS.A00(obj);
        return C60340gF.A00;
        this.A01 = 1;
        if (toastDragDismissState.A00(r0, this, f) == r4) {
            return r4;
        }
        return C60340gF.A00;
    }
}
