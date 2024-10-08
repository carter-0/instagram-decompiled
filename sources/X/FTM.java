package X;

public final class FTM implements 2IR {
    public final /* synthetic */ 2MP A00;

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
    }

    public FTM(2MP r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        C49433EvZ evZ = (C49433EvZ) obj;
        if (evZ != null) {
            C49432EvY evY = evZ.A00;
            if (evY != null) {
                C49612EzV ezV = evY.A00;
                if (ezV != null) {
                    Integer num = ezV.A03;
                    Integer num2 = ezV.A02;
                    2MP.A00(ezV.A00, this.A00, ezV.A01, num, num2);
                    return;
                }
                str = "screenTimeSettings";
            } else {
                str = "data";
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
