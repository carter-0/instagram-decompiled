package X;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;

/* renamed from: X.IlA  reason: case insensitive filesystem */
public final class C58078IlA extends C267894cP implements 0sL {
    public int A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58078IlA(int i, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A02 = i;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.IlA, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        int i;
        switch (this.A02) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            default:
                i = 2;
                break;
        }
        ? ilA = new C58078IlA(i, r4);
        ilA.A01 = obj;
        return ilA;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.IlA, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
            return obj;
        }
        0eS.A00(obj);
        this.A00 = 1;
        Object A002 = TapGestureDetectorKt.A00((AnonymousClass6GK) this.A01, GWN.Main, this);
        if (A002 != r2) {
            return A002;
        }
        return r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C58078IlA) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
