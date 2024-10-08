package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class MJE extends 0Yg implements C62320sa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ LPH A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ 1Xj A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MJE(Context context, LPH lph, UserSession userSession, 1Xj r5, int i, boolean z) {
        super(0);
        this.A00 = i;
        this.A05 = z;
        this.A01 = context;
        this.A03 = userSession;
        this.A04 = r5;
        this.A02 = lph;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = this.A00;
        long j = ((long) i) * 1000;
        Locale locale = Locale.US;
        String format = new SimpleDateFormat("EEE, LLL d", locale).format(new Date(j));
        String format2 = new SimpleDateFormat("h:mm a z", locale).format(new Date(j));
        int i2 = 2131956682;
        if (this.A05) {
            i2 = 2131956683;
        }
        Context context = this.A01;
        C59689JTv.A09(context, DbV.A0u(context, format, format2, i2));
        UserSession userSession = this.A03;
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        1Xj r3 = this.A04;
        A002.A00(new C64666Lfs(r3, i));
        DSX Aqj = r3.A0C.Aqj();
        if (Aqj != null) {
            r3.A0C.ESl(new C61100JxB(Integer.valueOf(i), Aqj.CDB()));
        }
        1E7.A00(userSession).A01(r3, true, false);
        LPH lph = this.A02;
        0Aj A0e = AnonymousClass7TE.A0e(lph.A01, "content_scheduling_submit");
        if (A0e.isSampled()) {
            DbS.A1N(A0e, lph.A00.A00);
            DbS.A1H(A0e, "schedule_picker");
            A0e.Cgf();
        }
        return C60340gF.A00;
    }
}
