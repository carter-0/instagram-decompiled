package X;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: X.Pbv  reason: case insensitive filesystem */
public final class C73398Pbv implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ C69271NiX A02;
    public final /* synthetic */ OW5 A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Integer A05;

    public C73398Pbv(Activity activity, Bundle bundle, C69271NiX niX, OW5 ow5, Integer num, Integer num2) {
        this.A03 = ow5;
        this.A00 = activity;
        this.A05 = num;
        this.A02 = niX;
        this.A04 = num2;
        this.A01 = bundle;
    }

    public final void run() {
        OW5 ow5 = this.A03;
        C72203OyT oyT = ow5.A01;
        Activity activity = this.A00;
        Integer num = this.A05;
        C69358Njy A002 = C71073Oas.A00(activity, (AnonymousClass65E) ow5.A03.getValue(), oyT, num);
        if (A002 != null) {
            ow5.A01(activity, this.A01, A002, this.A02, num, AnonymousClass05K.A00, this.A04);
        }
    }
}
