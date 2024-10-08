package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.WkD  reason: case insensitive filesystem */
public final /* synthetic */ class C20053WkD implements Runnable {
    public final /* synthetic */ C15607UfZ A00;

    public /* synthetic */ C20053WkD(C15607UfZ ufZ) {
        this.A00 = ufZ;
    }

    public final void run() {
        Integer num;
        C15607UfZ ufZ = this.A00;
        C15397Uc0 uc0 = ufZ.A04;
        SQH.A01(uc0.getChildFragmentManager());
        AnonymousClass1Nd.A00(uc0.A03).A00(new C321776uj(ufZ.A02));
        uc0.A00.A0T();
        F25 f25 = uc0.A05;
        EVG evg = uc0.A06;
        Integer num2 = ufZ.A01;
        ArrayList arrayList = new ArrayList(ufZ.A03);
        boolean A1U = AnonymousClass7TF.A1U(0, evg, num2);
        int intValue = num2.intValue();
        if (intValue == 0) {
            num = AnonymousClass05K.A1I;
        } else if (intValue == A1U) {
            num = AnonymousClass05K.A15;
        } else if (intValue == 2) {
            num = AnonymousClass05K.A0N;
        } else if (intValue == 3) {
            num = AnonymousClass05K.A0Y;
        } else {
            throw new RuntimeException();
        }
        f25.A00(evg, num, "", arrayList);
        Context context = uc0.getContext();
        if (context != null && num2 == AnonymousClass05K.A0C) {
            AnonymousClass1pc.A00().Cnc(context, uc0.A01, uc0.A03, C54660HMr.MULTI_UNTAG, ufZ.A00);
        }
    }
}
