package X;

import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollingLogic;

/* renamed from: X.Ila  reason: case insensitive filesystem */
public final class C58084Ila extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58084Ila(Object obj, AnonymousClass4D7 r3, float f, float f2, int i) {
        super(2, r3);
        this.A03 = i;
        this.A04 = obj;
        this.A01 = f;
        this.A02 = f2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Ila, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        int i;
        int i2 = this.A03;
        Object obj2 = this.A04;
        float f = this.A01;
        float f2 = this.A02;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new C58084Ila(obj2, r8, f, f2, i);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.Ila, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        Object A002;
        int i = this.A03;
        1Hj r5 = 1Hj.A02;
        int i2 = this.A00;
        if (i != 0) {
            if (i2 == 0) {
                0eS.A00(obj);
                0V2 r3 = ((C53033GhO) this.A04).A08;
                C56084HsX hsX = new C56084HsX(this.A01, this.A02);
                this.A00 = 1;
                A002 = r3.emit(hsX, this);
            }
            0eS.A00(obj);
            return C60340gF.A00;
        }
        if (i2 == 0) {
            0eS.A00(obj);
            ScrollingLogic scrollingLogic = ((AnonymousClass6IS) this.A04).A09;
            long A003 = C289325dP.A00(this.A01, this.A02);
            this.A00 = 1;
            A002 = ScrollableKt.A00(scrollingLogic, this, A003);
        }
        0eS.A00(obj);
        return C60340gF.A00;
        if (A002 == r5) {
            return r5;
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C58084Ila) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
