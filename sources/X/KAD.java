package X;

import java.io.IOException;
import java.io.StringWriter;

public final class KAD extends 1P0 {
    public final /* synthetic */ 2Ix A00;

    public KAD(2Ix r1) {
        this.A00 = r1;
    }

    public final void onFail(C268654dm r5) {
        String str;
        int A03 = AnonymousClass0fD.A03(1086264630);
        if (r5 instanceof C268674do) {
            Object A002 = r5.A00();
            A002.getClass();
            Integer valueOf = Integer.valueOf(((1XR) A002).getStatusCode());
            String status = ((AnonymousClass1XT) A002).getStatus();
            if (!(valueOf == null || status == null)) {
                0KC.A0C("DirectInteropGatingManager", 0mp.A06("[Interop] Server Failure for getting `has_interop_upgraded` with status code (%d): and error %s", new Object[]{valueOf, status}));
                AnonymousClass0fD.A0A(574486420, A03);
            }
        }
        Throwable A01 = r5.A01();
        if (A01 != null) {
            str = A01.getMessage();
        } else {
            str = "gating_manager_unknown_error";
        }
        0KC.A0O("DirectInteropGatingManager", "[Interop] Local Failure for getting `has_interop_upgraded` value with error message %s", new Object[]{str});
        AnonymousClass0fD.A0A(574486420, A03);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.1qK, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-35725828);
        K19 k19 = (K19) obj;
        int A032 = AnonymousClass0fD.A03(-1779313248);
        2Ix r9 = this.A00;
        long currentTimeMillis = System.currentTimeMillis();
        1Av r7 = r9.A04;
        boolean z = k19.A00;
        0xa r6 = r7.A01;
        0xY AR4 = r6.AR4();
        AR4.E5T("has_interop_enable", z);
        AR4.apply();
        0xY AR42 = r6.AR4();
        AR42.E5c("last_interop_sync_time", currentTimeMillis);
        AR42.apply();
        1Ng r2 = r9.A01;
        0qQ.A0B(r9.A01(), 1);
        r2.A00(new Object());
        0KC.A0P("DirectInteropGatingManager", "[Interop] Successfully fetched new `has_interop_upgraded` value: %b", new Object[]{Boolean.valueOf(k19.A00)});
        if (!k19.A00) {
            try {
                StringWriter A0v = JTO.A0v();
                17W A0K = AnonymousClass7TF.A0K(A0v);
                A0K.A0S("has_interop_upgraded", k19.A00);
                1XY.A00(A0K, k19);
                DbS.A1a(r7, AnonymousClass7TG.A0k(A0K, A0v), r7.A5y, 1Av.A8a, 297);
            } catch (IOException e) {
                0KC.A0M("DirectInteropGatingManager", "DirectInteropUpgradeStatusResponse unable to be parsed due to exception: %s. Will use locally strings to display interstitial", e, new Object[]{e.getMessage()});
            }
        }
        AnonymousClass0fD.A0A(1248297534, A032);
        AnonymousClass0fD.A0A(1181358050, A03);
    }
}
