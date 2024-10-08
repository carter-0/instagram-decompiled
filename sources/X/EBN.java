package X;

import android.content.Context;
import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import com.instagram.nux.cal.model.DpActionContent;
import java.util.List;

public final class EBN extends 1P0 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ 0lg A02;
    public final /* synthetic */ FRM A03;
    public final /* synthetic */ EXD A04;

    public EBN(Context context, 0lg r2, FRM frm, EXD exd, long j) {
        this.A03 = frm;
        this.A01 = context;
        this.A02 = r2;
        this.A04 = exd;
        this.A00 = j;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.1xE, X.FVn, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        DpActionContent dpActionContent;
        int A032 = AnonymousClass0fD.A03(1035997533);
        C47349Dvj dvj = (C47349Dvj) obj;
        int A033 = AnonymousClass0fD.A03(-1012837832);
        0qQ.A0B(dvj, 0);
        FRM frm = this.A03;
        C47944ENv A002 = C49045EoP.A00(frm, dvj.A01);
        C49885FBl fBl = C47938ENp.A03;
        Context context = this.A01;
        0lg r6 = this.A02;
        fBl.A03(context, r6, frm, this.A04).A02(A002, false);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
        double A012 = DbS.A01();
        double A003 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01((AnonymousClass0iw) null, r6), "ig_dynamic_onboarding_updated_steps_from_server");
        DbZ.A1G(A0e, A012, A003);
        FH8.A05(A0e);
        FH8.A06(A0e);
        DbW.A12(A0e, A003);
        A0e.A9F(AnonymousClass000.A00(4157), Long.valueOf(elapsedRealtime));
        DbZ.A1E(A0e);
        FH8.A0C(A0e, r6);
        1xC r3 = 1xC.A01;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        List list = A002.A01;
        int size = list.size();
        int i = 0;
        while (i < size) {
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            int i2 = i + 1;
            A1A2.append(i2);
            A1A2.append(". ");
            A1A2.append(((C48155EZx) ((C49722F3l) list.get(i)).A00).name());
            A1A2.append(' ');
            A1A.append(A1A2.toString());
            i = i2;
        }
        String A10 = DbT.A10(A1A);
        ? obj2 = new Object();
        obj2.A00 = A10;
        r3.A00(obj2);
        if ((r6 instanceof UserSession) && (dpActionContent = dvj.A00) != null) {
            DbS.A1Z(r6);
            r6.A04(DpActionContent.class, dpActionContent);
        }
        AnonymousClass0fD.A0A(-498226056, A033);
        AnonymousClass0fD.A0A(-1386193166, A032);
    }
}
