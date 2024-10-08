package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;

public final class FOY implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ 0lg A01;
    public final /* synthetic */ E3X A02;
    public final /* synthetic */ G68 A03;
    public final /* synthetic */ EXD A04;
    public final /* synthetic */ C46634DiE A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public FOY(AnonymousClass4DH r1, 0lg r2, E3X e3x, G68 g68, EXD exd, C46634DiE diE, String str, String str2) {
        this.A02 = e3x;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = diE;
        this.A04 = exd;
        this.A03 = g68;
        this.A06 = str;
        this.A07 = str2;
    }

    public final void onClick(View view) {
        1OC A002;
        1P0 ebt;
        int i;
        int A052 = AnonymousClass0fD.A05(-1232583374);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        E3X e3x = this.A02;
        if (elapsedRealtime - e3x.A00 < 30000) {
            AnonymousClass4DH r4 = this.A00;
            C49952FGh.A05(r4.requireContext(), DbV.A0z(r4, 30, 2131974070), r4.getString(2131974071));
            i = -2049441818;
        } else {
            1Q0 r0 = 1Q0.A1O;
            0lg r11 = this.A01;
            FGI A022 = r0.A02(r11);
            C46634DiE diE = this.A05;
            FGI.A02(A022, this.A04, diE);
            G68 g68 = this.A03;
            if (g68 != null) {
                FGJ.A03.A03(this.A00.requireActivity(), r11, g68, diE, C49958FGq.A00(this.A06, this.A07));
            }
            AnonymousClass4DH r02 = this.A00;
            Context context = e3x.getContext();
            String A003 = 0qv.A00(context);
            String A0s = DbT.A0s(context);
            C11032S6k s6k = LQc.A07;
            LQc lQc = new LQc(e3x.requireContext());
            if (e3x.A0E) {
                A002 = FCI.A00(context, e3x.A01, C49958FGq.A00(e3x.A09, e3x.A0B), A003, A0s);
                ebt = new C47929ENg(e3x, e3x, e3x.A07);
            } else if (!e3x.A0F || e3x.A0A == null || context == null) {
                C49944FFx.A00.A02(e3x.A01, e3x.BzS().A01, "user_clicked_on_resend_code_link");
                A002 = FHA.A00(context, e3x.A01, (Boolean) null, (Boolean) null, e3x.A0A, (String) null, true, false);
                ebt = new EBT(e3x);
            } else {
                C49944FFx fFx = C49944FFx.A00;
                fFx.A02(e3x.A01, e3x.BzS().A01, "user_clicked_on_resend_code_link");
                AnonymousClass0aP r10 = e3x.A01;
                String str = e3x.A0A;
                C46634DiE BzS = e3x.BzS();
                EBT ebt2 = new EBT(e3x);
                EMT emt = new EMT(context, e3x);
                String str2 = BzS.A01;
                fFx.A02(r10, str2, AnonymousClass000.A00(1172));
                if (lQc.A01.A00() >= 1) {
                    fFx.A02(r10, str2, AnonymousClass000.A00(1168));
                    A002 = new KHC((View) null, e3x, ebt2, r10, emt, lQc, BzS, true, str);
                } else {
                    fFx.A02(r10, str2, AnonymousClass000.A00(1169));
                    A002 = FHA.A00(lQc.A00, r10, (Boolean) null, (Boolean) null, str, (String) null, true, false);
                    A002.A00 = ebt2;
                }
                r02.schedule(A002);
                e3x.A00 = SystemClock.elapsedRealtime();
                i = -988586882;
            }
            A002.A00 = ebt;
            r02.schedule(A002);
            e3x.A00 = SystemClock.elapsedRealtime();
            i = -988586882;
        }
        AnonymousClass0fD.A0C(i, A052);
    }
}
