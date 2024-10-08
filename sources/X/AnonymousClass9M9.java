package X;

import android.content.Context;

/* renamed from: X.9M9  reason: invalid class name */
public final class AnonymousClass9M9 extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj2;
        Object obj4 = obj;
        if (this.A00 != 0) {
            C262804Gb r6 = (C262804Gb) obj4;
            AnonymousClass3W1 r8 = (AnonymousClass3W1) obj3;
            0qQ.A0B(r6, 0);
            0qQ.A0B(r8, 1);
            C262804Gb r3 = r6;
            ((C274134nl) this.A04).A01.Alq().Dl4(r3, (1Xj) this.A03, (GQ0) null, r8, this.A02, this.A01);
            return C60340gF.A00;
        }
        C262804Gb r62 = (C262804Gb) obj4;
        AnonymousClass3W1 r82 = (AnonymousClass3W1) obj3;
        0qQ.A0B(r62, 0);
        0qQ.A0B(r82, 1);
        Context context = r62.A0F.getContext();
        0qQ.A07(context);
        C274134nl r1 = (C274134nl) this.A04;
        return new C274204ns(context, r1.A01.Alq(), r62, (1Xj) this.A03, r82, this.A02, this.A01, 182.A06(0Tu.A05, r1.A00, 36330625845773002L));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9M9(Object obj, int i, Object obj2, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A04 = obj;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = obj2;
    }
}
