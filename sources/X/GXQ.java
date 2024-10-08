package X;

public final class GXQ {
    public final /* synthetic */ AnonymousClass32L A00;
    public final /* synthetic */ GWY A01;

    public GXQ(AnonymousClass32L r1, GWY gwy) {
        this.A00 = r1;
        this.A01 = gwy;
    }

    public final void A00(boolean z) {
        C15812Uiv[] uivArr;
        AnonymousClass32L r3 = this.A00;
        C14074TpO tpO = r3.A06;
        if (tpO != null) {
            tpO.A02();
            C14074TpO tpO2 = r3.A06;
            if (z) {
                if (tpO2 != null) {
                    uivArr = tpO2.A0K;
                }
            } else if (tpO2 != null) {
                01N A1H = 0jo.A1H();
                int i = 0;
                do {
                    A1H.add(new C14386TvF(C14411Tvf.MEMORY_GRID_MEDIA_GRID));
                    i++;
                } while (i < 5);
                uivArr = (C15812Uiv[]) 0jo.A1I(A1H).toArray(new C15812Uiv[0]);
            }
            C14227TsA tsA = tpO2.A0E;
            tsA.A06 = uivArr;
            C14227TsA.A00(tsA);
            AnonymousClass4DH r1 = tpO2.A0A;
            if (r1 instanceof C227252iu) {
                0qQ.A0C(r1, AnonymousClass000.A00(331));
                ((C227252iu) r1).EKl();
            }
            GWY gwy = this.A01;
            gwy.A02 = !z;
            gwy.A01 = Long.valueOf(gwy.A04.now());
            gwy.A09.A00(new C3723390k(gwy.A08, AnonymousClass05K.A00, gwy.A0E, gwy.A0D.getModuleName(), (String) null, gwy.A0F, 31360, true, true, false, false, false, gwy.A02));
            return;
        }
        0qQ.A0F("grid");
        throw AnonymousClass00P.createAndThrow();
    }
}
