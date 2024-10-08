package X;

import java.util.List;

public final class CHD extends 1P0 {
    public final /* synthetic */ C45454Cwl A00;

    public CHD(C45454Cwl cwl) {
        this.A00 = cwl;
    }

    public final void onFail(C268654dm r6) {
        Integer num;
        int i;
        int A0D = AnonymousClass7TG.A0D(r6, -15797692);
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
            i = -1115635530;
        } else {
            this.A00.A00(Integer.valueOf(((C69248NiA) A01).A00), (String) null);
            i = 814795202;
        }
        AnonymousClass0fD.A0A(i, A0D);
    }

    public final void onFinish() {
        AnonymousClass0fD.A0A(-2045704220, AnonymousClass0fD.A03(-2089375046));
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(114387864);
        C45454Cwl cwl = this.A00;
        cwl.A03.A2W = true;
        C18487Vsi.A00(cwl.A01, (Integer) null, "start", (String) null);
        AnonymousClass0fD.A0A(-1474073592, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(-1620716888);
        CEM cem = (CEM) obj;
        int A0D = AnonymousClass7TG.A0D(cem, -1593770559);
        BBB bbb = cem.A00;
        if (bbb == null) {
            C41845B3m.A0v();
            throw AnonymousClass00P.createAndThrow();
        }
        List list = bbb.A01;
        if (list != null) {
            C45454Cwl cwl = this.A00;
            boolean z = bbb.A02;
            Integer valueOf = Integer.valueOf(cem.mStatusCode);
            Integer num = bbb.A00;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            cwl.A01(valueOf, list, i, z);
        }
        AnonymousClass0fD.A0A(-251310547, A0D);
        AnonymousClass0fD.A0A(819873240, A03);
    }
}
