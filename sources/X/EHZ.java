package X;

import android.content.Context;
import java.util.List;

public final class EHZ extends 2Cl {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ 0lg A02;
    public final /* synthetic */ AnonymousClass4D6 A03;
    public final /* synthetic */ C51961G9h A04;
    public final /* synthetic */ F3P A05;

    public final int getRunnableId() {
        return 261;
    }

    public EHZ(Context context, AnonymousClass0iw r2, 0lg r3, AnonymousClass4D6 r4, C51961G9h g9h, F3P f3p) {
        this.A05 = f3p;
        this.A00 = context;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = g9h;
        this.A03 = r4;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Context context = this.A00;
        if (context != null) {
            return FH1.A01(context, this.A01, this.A02, this.A04, "login");
        }
        throw new Exception(Pxd.A00(899));
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list = (List) obj;
        if (!list.isEmpty()) {
            F3P f3p = this.A05;
            0lg r5 = this.A02;
            AnonymousClass4D6 r4 = this.A03;
            C51961G9h g9h = this.A04;
            1OC A0E = FHA.A0E(r5, list);
            A0E.A00 = new C47692EDb(r5, g9h, f3p, 14);
            r4.schedule(A0E);
        }
    }
}
