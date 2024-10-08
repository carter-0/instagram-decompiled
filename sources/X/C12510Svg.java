package X;

/* renamed from: X.Svg  reason: case insensitive filesystem */
public final class C12510Svg implements AnonymousClass5A7 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C12510Svg(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void DvN(Object obj) {
        switch (this.A00) {
            case 0:
                C11010S5h s5h = (C11010S5h) this.A01;
                0qQ.A0C(s5h, "null cannot be cast to non-null type com.fbpay.util.observable.FBPayObservableMediator.MediatorEntry<kotlin.Any?, T of com.fbpay.util.observable.FBPayObservableMediator>");
                ((C2818659w) this.A02).A02(s5h.A01.invoke(obj));
                return;
            case 1:
                AnonymousClass5A7 r1 = (AnonymousClass5A7) this.A01;
                if (r1 != null) {
                    r1.DvN(((0sP) this.A02).invoke(obj));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
