package X;

import android.content.Context;

public final class KAN extends 1P0 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ LAG A01;
    public final /* synthetic */ boolean A02;

    public KAN(Context context, LAG lag, boolean z) {
        this.A01 = lag;
        this.A00 = context;
        this.A02 = z;
    }

    public final void onFail(C268654dm r7) {
        int A03 = AnonymousClass0fD.A03(915601102);
        0qQ.A0B(r7, 0);
        KAN.super.onFail(r7);
        LAG lag = this.A01;
        1Xj r2 = lag.A02;
        C246353eS.A04(this.A00, r2, 2131974093);
        AnonymousClass3YP r0 = AnonymousClass3YP.NOT_SHARED;
        r2.A49(r0);
        C246353eS.A06(lag, r0, false);
        AnonymousClass0fD.A0A(270707102, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(1627406168);
        int A0D = AnonymousClass7TG.A0D(obj, 504864791);
        KAN.super.onSuccess(obj);
        LAG lag = this.A01;
        1Xj r4 = lag.A02;
        AnonymousClass3YP r1 = AnonymousClass3YP.SHARED;
        r4.A49(r1);
        lag.A01.DkF(r1);
        Context context = this.A00;
        Integer num = lag.A03;
        boolean z = this.A02;
        Integer num2 = AnonymousClass05K.A00;
        if (z) {
            i = 2131971815;
            if (num == num2) {
                i = 2131971816;
            }
        } else {
            i = 2131971817;
            if (num == num2) {
                i = 2131971818;
            }
        }
        C246353eS.A04(context, r4, i);
        AnonymousClass0fD.A0A(-300612463, A0D);
        AnonymousClass0fD.A0A(2019462459, A03);
    }
}
