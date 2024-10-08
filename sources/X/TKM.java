package X;

import android.content.Context;
import android.os.Bundle;

public final class TKM implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass07i A02;
    public final /* synthetic */ AnonymousClass11X A03;
    public final /* synthetic */ Integer A04;

    public TKM(Context context, AnonymousClass07i r2, AnonymousClass11X r3, Integer num, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = context;
        this.A03 = r3;
        this.A04 = num;
    }

    public final void run() {
        AnonymousClass07i r3 = this.A02;
        int i = this.A00;
        r3.A02((Bundle) null, new C228932mZ(this.A01, r3, this.A03, this.A04, i), i);
    }
}
