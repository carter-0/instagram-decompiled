package X;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.6eW  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C312496eW implements C62320sa {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C312156dv A01;
    public final /* synthetic */ 0lg A02;
    public final /* synthetic */ Executor A03;
    public final /* synthetic */ Executor A04;
    public final /* synthetic */ Executor A05;

    public /* synthetic */ C312496eW(Context context, C312156dv r2, 0lg r3, Executor executor, Executor executor2, Executor executor3) {
        this.A00 = context;
        this.A02 = r3;
        this.A03 = executor;
        this.A04 = executor2;
        this.A05 = executor3;
        this.A01 = r2;
    }

    public final Object invoke() {
        Context context = this.A00;
        0lg r4 = this.A02;
        Executor executor = this.A04;
        C312156dv r2 = this.A01;
        Map map = C312426eP.A01;
        return new C312426eP(context.getApplicationContext(), r2, r4, executor);
    }
}
