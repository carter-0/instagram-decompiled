package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

public final class H4S extends 1P0 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1pl A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public H4S(Context context, AnonymousClass4DH r2, UserSession userSession, 1pl r4, String str, String str2) {
        this.A02 = userSession;
        this.A00 = context;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = str;
        this.A05 = str2;
    }

    public final void onFail(C268654dm r5) {
        int A032 = AnonymousClass0fD.A03(1458939554);
        02m.A0p.markerPoint(387850546, C66579MXk.A00(978));
        02m.A0p.markerEnd(387850546, 3);
        AnonymousClass0fD.A0A(411366299, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1161786413);
        C54043GyS gyS = (C54043GyS) obj;
        int A0D = AnonymousClass7TG.A0D(gyS, -815301523);
        UserSession userSession = this.A02;
        02m.A0p.markerPoint(387850546, AnonymousClass000.A00(712));
        C59635JRd jRd = gyS.A00;
        if (jRd == null) {
            C41845B3m.A0v();
            throw AnonymousClass00P.createAndThrow();
        }
        if (!((C53462Gou) jRd).A00) {
            0tS A012 = 0tS.A4E.A01(this.A00);
            if (!AnonymousClass7TG.A1a(A012, A012.A1F, 0tS.A4G, 115)) {
                02m.A0p.markerEnd(387850546, 2);
                AnonymousClass0fD.A0A(2034892830, A0D);
                AnonymousClass0fD.A0A(238852141, A032);
            }
        }
        AnonymousClass4DH r9 = this.A01;
        String str = this.A04;
        String str2 = this.A05;
        02m.A0p.markerPoint(387850546, "nudge_will_show");
        LinkedHashMap A0q = DbY.A0q(Py7.A00(), str2, AnonymousClass7TE.A1L("location", str), AnonymousClass7TE.A1L("analytics_module", "app_start"));
        new AnonymousClass32W(userSession).A00(r9, (JOC) null, new C55539HjL(userSession), "com.bloks.www.ig.account_status.nudge.async", A0q);
        AnonymousClass0fD.A0A(2034892830, A0D);
        AnonymousClass0fD.A0A(238852141, A032);
    }
}
