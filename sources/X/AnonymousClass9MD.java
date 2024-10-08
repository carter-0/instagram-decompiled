package X;

import android.view.View;

/* renamed from: X.9MD  reason: invalid class name */
public final class AnonymousClass9MD extends 0Yg implements 0sK {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MD(int i, Object obj, Object obj2, Object obj3) {
        super(3);
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4 = obj3;
        Object obj5 = obj2;
        Object obj6 = obj;
        if (this.A00 != 0) {
            View view = (View) obj6;
            C54512HGy hGy = (C54512HGy) obj5;
            C55865Hom hom = (C55865Hom) obj4;
            0qQ.A0B(view, 0);
            0qQ.A0B(hGy, 1);
            0qQ.A0B(hom, 2);
            return Boolean.valueOf(((AnonymousClass339) this.A01).E0m(view, (1Xj) this.A02, hom, (AnonymousClass3W1) this.A03, hGy));
        }
        0qQ.A0B(obj, 0);
        0qQ.A0B(obj2, 1);
        0qQ.A0B(obj4, 2);
        Object obj7 = this.A03;
        C243273Yc.A00("setupAutomatedLogging", new C58223IoR(6, obj5, obj6, this.A02, obj4, this.A01, obj7));
        return C60340gF.A00;
    }
}
