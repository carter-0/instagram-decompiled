package X;

import java.util.List;

public final class CHC extends 1P0 {
    public final /* synthetic */ C45454Cwl A00;

    public CHC(C45454Cwl cwl) {
        this.A00 = cwl;
    }

    public final void onFail(C268654dm r6) {
        Integer num;
        int i;
        int A0D = AnonymousClass7TG.A0D(r6, 1296033102);
        Throwable A01 = r6.A01();
        String str = null;
        if (A01 == null || !(A01 instanceof C69248NiA)) {
            C45454Cwl cwl = this.A00;
            1XQ r0 = (1XQ) r6.A00();
            if (r0 != null) {
                num = Integer.valueOf(r0.mStatusCode);
            } else {
                num = null;
            }
            if (A01 != null) {
                str = A01.getMessage();
            }
            cwl.A00(num, str);
            i = -861251599;
        } else {
            this.A00.A00(Integer.valueOf(((C69248NiA) A01).A00), (String) null);
            i = 417837650;
        }
        AnonymousClass0fD.A0A(i, A0D);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-1180496628);
        C45454Cwl cwl = this.A00;
        cwl.A03.A2W = true;
        C18487Vsi.A00(cwl.A01, (Integer) null, "start", (String) null);
        AnonymousClass0fD.A0A(1437726218, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-85929351);
        C43789CDh cDh = (C43789CDh) obj;
        int A032 = AnonymousClass0fD.A03(-1708247630);
        0qQ.A0B(cDh, 0);
        C42022BAx bAx = cDh.A00;
        if (bAx == null) {
            C41845B3m.A0v();
            throw AnonymousClass00P.createAndThrow();
        }
        List list = bAx.A00;
        if (list != null) {
            this.A00.A01(Integer.valueOf(cDh.mStatusCode), list, 0, bAx.A01);
        }
        AnonymousClass0fD.A0A(1669279948, A032);
        AnonymousClass0fD.A0A(1769724423, A03);
    }
}
