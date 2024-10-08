package X;

import android.content.Context;
import android.os.SystemClock;

public final class EHY extends 2Cl {
    public long A00;
    public final /* synthetic */ 0lg A01;
    public final /* synthetic */ FV8 A02;
    public final /* synthetic */ C46634DiE A03;

    public final int getRunnableId() {
        return 262;
    }

    public EHY(0lg r1, FV8 fv8, C46634DiE diE) {
        this.A02 = fv8;
        this.A01 = r1;
        this.A03 = diE;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1xE, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        FV8 fv8 = this.A02;
        fv8.A01 = (C376149Gs) obj;
        1xC.A01.A00(new Object());
        C376149Gs r5 = fv8.A01;
        long currentTimeMillis = System.currentTimeMillis();
        long A002 = 1Q0.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(this.A01), "facebook_first_party_auth");
        if (A0e.isSampled()) {
            double d = (double) currentTimeMillis;
            DbW.A13(A0e, d);
            double d2 = (double) A002;
            DbY.A1D(A0e, d, d2);
            DbZ.A1F(A0e, d2);
            A0e.A7p("has_facebook_session", Boolean.valueOf(AnonymousClass7TF.A1V(r5)));
            A0e.A7p("is_facebook_app_installed", Boolean.valueOf(AnonymousClass1G3.A03()));
            DbT.A1P(A0e);
            A0e.A9F("ts", Long.valueOf(SystemClock.elapsedRealtime() - this.A00));
            DbY.A1B(A0e);
            A0e.AAJ("release_channel", DbX.A0s(0la.A00()));
            DbY.A1A(A0e);
            String str2 = null;
            if (r5 == null) {
                str = null;
            } else {
                str = r5.A01.A01;
            }
            A0e.AAJ("sso_package_name", str);
            C46634DiE diE = this.A03;
            if (diE != null) {
                str2 = diE.A01;
            }
            DbS.A1H(A0e, str2);
            DbW.A10(A0e);
            A0e.Cgf();
        }
    }

    public final /* bridge */ /* synthetic */ Object call() {
        String str;
        C376159Gt r0;
        this.A00 = SystemClock.elapsedRealtime();
        FV8 fv8 = this.A02;
        Context context = fv8.A00;
        0lg r4 = this.A01;
        Boolean bool = (Boolean) ((2XO) AnonymousClass2Xh.A01.CDM(AnonymousClass2Xh.A00, AnonymousClass2Xh.A02[0])).A01(r4);
        C376149Gs r02 = fv8.A01;
        if (r02 == null || (r0 = r02.A00) == null) {
            str = null;
        } else {
            str = r0.A01;
        }
        return C368048rz.A00(context, r4, bool, str);
    }
}
