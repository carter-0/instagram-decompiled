package X;

import android.content.Context;
import com.facebook.endtoend.EndToEnd;

public final class TP1 implements AnonymousClass0eK {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 2FU A01;
    public final /* synthetic */ AnonymousClass0eK A02;

    public TP1(Context context, 2FU r2, AnonymousClass0eK r3) {
        this.A00 = context;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        Context context = this.A00;
        0xc r3 = new 0xc(1Al.A00(1An.A1N, "0"));
        AnonymousClass0eK r2 = this.A02;
        SSZ A002 = SSZ.A00(context, r3, (AnonymousClass5A3) r2.get(), new C10305Rq3(r2), "0");
        C10490Rt5 rt5 = new C10490Rt5("0", r2);
        return new SOC(this.A01, A002, (AnonymousClass5A3) r2.get(), rt5, EndToEnd.isRunningEndToEndTest());
    }
}
