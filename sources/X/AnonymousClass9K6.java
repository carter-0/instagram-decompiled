package X;

import androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1;

/* renamed from: X.9K6  reason: invalid class name */
public final class AnonymousClass9K6 extends AnonymousClass1Ek implements 0sK {
    public int A00;
    public long A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9K6(Object obj, AnonymousClass4D7 r3, int i) {
        super(3, r3);
        this.A03 = i;
        this.A04 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.A03;
        long j = ((C289295dM) obj2).A00;
        AnonymousClass4D7 r8 = (AnonymousClass4D7) obj3;
        Object obj4 = this.A04;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        AnonymousClass9K6 r1 = new AnonymousClass9K6(obj4, r8, i);
        r1.A02 = obj;
        r1.A01 = j;
        return r1.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.9K6, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            MX4 mx4 = (MX4) this.A02;
            long j = this.A01;
            AnonymousClass5WI r4 = (AnonymousClass5WI) this.A04;
            if (r4.A07) {
                this.A00 = 1;
                C287605aT r6 = r4.A02;
                if (r6 != null && 19E.A00(this, new AbstractClickableNode$handlePressInteraction$2$1(r4, mx4, r6, (AnonymousClass4D7) null, j)) == r2) {
                    return r2;
                }
            }
        }
        return C60340gF.A00;
    }
}
