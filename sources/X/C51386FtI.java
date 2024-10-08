package X;

import com.google.common.collect.ImmutableList;
import java.util.BitSet;
import java.util.LinkedHashMap;

/* renamed from: X.FtI  reason: case insensitive filesystem */
public final class C51386FtI implements Runnable {
    public final /* synthetic */ C229382nI A00;
    public final /* synthetic */ FGH A01;

    public C51386FtI(C229382nI r1, FGH fgh) {
        this.A01 = fgh;
        this.A00 = r1;
    }

    public final void run() {
        FGH fgh = this.A01;
        ImmutableList A0K = DbU.A0K(fgh.A02.A06);
        C63040xi r10 = 0tS.A4E;
        String A08 = r10.A00().A08();
        if (0mp.A0B(A08)) {
            A08 = AnonymousClass7TF.A0c();
            r10.A00().A0G(A08);
        }
        C60820jg r0 = 0jh.A04;
        AnonymousClass0aP r8 = fgh.A0D;
        String A02 = r0.A01(r8).A02(19f.A20);
        if (A02 == null) {
            A02 = "";
        }
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        BitSet A0w = DbS.A0w(0);
        String A002 = 0qv.A00(fgh.A08);
        0qQ.A07(A002);
        A1H.put(Dbj.A01(), A002);
        A1H.put("family_device_id", A02);
        0tS A003 = r10.A00();
        A1H.put("logged_out_user", A003.A09.CDM(A003, 0tS.A4G[185]));
        A1H.put("offline_experiment_group", "caa_iteration_v3_perf_ig_4");
        A1H.put("show_internal_settings", false);
        A1H.put("waterfall_id", A08);
        0qQ.A0C(A0K, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, java.lang.Object>>");
        A1H.put("account_list", A0K);
        A1H.put(AnonymousClass000.A00(2967), AnonymousClass1Q2.A00());
        if (A0w.nextClearBit(0) >= 0) {
            FRC frc = new FRC(0Yt.A0B(A1H), 0Yt.A0E());
            C229382nI r3 = this.A00;
            C46471DfZ A012 = C49940FFt.A01(C49940FFt.A00(), fgh, 4);
            frc.E3a(A012, C48721Ej6.A00(r8, false), new FVU(frc, r3, fgh, A012), true);
            return;
        }
        throw DbT.A0n();
    }
}
