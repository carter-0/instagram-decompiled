package X;

import java.util.HashMap;

public abstract class EDM extends 1P0 {
    public final 1P0 A00;

    public final void A00(C61284K0v k0v) {
        0wc r5;
        String str;
        String str2;
        String str3;
        if (this instanceof C48065EUj) {
            C48065EUj eUj = (C48065EUj) this;
            if (k0v != null) {
                k0v.FH3();
                r5 = eUj.A00;
                str = eUj.A02;
                str2 = eUj.A01;
                AnonymousClass7TG.A1T(r5, str, str2);
                str3 = "mutation_success_instagram_only";
            } else {
                r5 = eUj.A00;
                str = eUj.A02;
                str2 = eUj.A01;
                AnonymousClass7TG.A1T(r5, str, str2);
                str3 = "mutation_fail_instagram_only";
            }
        } else {
            C48064EUi eUi = (C48064EUi) this;
            if (k0v != null) {
                C47154DrV A002 = k0v.FH3();
                boolean A1S = AnonymousClass7TF.A1S(A002.A01 ? 1 : 0, 1);
                HashMap hashMap = A002.A00;
                if (hashMap == null || !AnonymousClass7TF.A1Y(hashMap.get("FB"), true)) {
                    if (A1S) {
                        r5 = eUi.A00;
                        str = eUi.A02;
                        str2 = eUi.A01;
                        0qQ.A0B(r5, 0);
                        AnonymousClass7TF.A1B(str, 1, str2);
                        str3 = "mutation_fail_facebook_only";
                    }
                } else if (A1S) {
                    r5 = eUi.A00;
                    str = eUi.A02;
                    str2 = eUi.A01;
                    0qQ.A0B(r5, 0);
                    AnonymousClass7TF.A1B(str, 1, str2);
                    str3 = "mutation_success_both";
                } else {
                    return;
                }
            }
            r5 = eUi.A00;
            str = eUi.A02;
            str2 = eUi.A01;
            AnonymousClass7TG.A1T(r5, str, str2);
            str3 = "mutation_fail_both";
        }
        FEM.A00(r5, str, str2, str3);
    }

    public EDM(1P0 r1) {
        this.A00 = r1;
    }

    public final void onFail(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, -1744628563);
        1P0 r0 = this.A00;
        if (r0 != null) {
            r0.onFail(r3);
        }
        AnonymousClass0fD.A0A(-1877725371, A0D);
    }

    public final void onFailInBackground(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, 109344693);
        A00((C61284K0v) r3.A00());
        1P0 r0 = this.A00;
        if (r0 != null) {
            r0.onFailInBackground(r3);
        }
        AnonymousClass0fD.A0A(-1229030608, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-1063453639);
        1P0 r0 = this.A00;
        if (r0 != null) {
            r0.onFinish();
        }
        AnonymousClass0fD.A0A(-765423945, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-1473931779);
        1P0 r0 = this.A00;
        if (r0 != null) {
            r0.onStart();
        }
        AnonymousClass0fD.A0A(-1368367227, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1672381386);
        int A0D = AnonymousClass7TG.A0D(obj, 1091590520);
        1P0 r0 = this.A00;
        if (r0 != null) {
            r0.onSuccess(obj);
        }
        AnonymousClass0fD.A0A(-102075554, A0D);
        AnonymousClass0fD.A0A(-1069194958, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(171054826);
        C61284K0v k0v = (C61284K0v) obj;
        int A0D = AnonymousClass7TG.A0D(k0v, -1084403144);
        A00(k0v);
        1P0 r0 = this.A00;
        if (r0 != null) {
            r0.onSuccessInBackground(k0v);
        }
        AnonymousClass0fD.A0A(506401421, A0D);
        AnonymousClass0fD.A0A(8412982, A03);
    }
}
