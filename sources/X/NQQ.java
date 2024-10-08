package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import java.io.File;

public final class NQQ extends 2Cn {
    public final /* synthetic */ XSV A00;
    public final /* synthetic */ C71872OsF A01;
    public final /* synthetic */ 1iA A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        C71872OsF osF = this.A01;
        osF.A04();
        boolean z = this.A05;
        1iA r6 = this.A02;
        String str = this.A03;
        String str2 = this.A04;
        XSV xsv = this.A00;
        UserSession userSession = osF.A02;
        if (z) {
            String obj = exc.toString();
            AnonymousClass0iw r0 = osF.A01;
            if (r0 == null) {
                r0 = osF;
            }
            0Aj A0e = AnonymousClass7TE.A0e(C51972G9s.A0a(r0, userSession), "armadillo_save_media");
            if (!A0e.isSampled()) {
                return;
            }
            if (r6 == null) {
                throw AnonymousClass7TE.A0y();
            } else if (r6 == 1iA.A0Q || r6 == 1iA.A0a) {
                A0e.AAJ("media_type", AnonymousClass7TF.A0j(r6.name()));
                A0e.AAJ(RealtimeConstants.SEND_SUCCESS, "failure");
                A0e.AAJ("reason", obj);
                DbV.A1J(A0e, str);
            } else {
                throw DbT.A0m();
            }
        } else {
            AnonymousClass0iw r4 = osF.A01;
            if (r4 == null) {
                r4 = osF;
            }
            C3265677h.A0B(xsv, r4, userSession, r6, exc.toString(), str2, false);
        }
    }

    public NQQ(XSV xsv, C71872OsF osF, 1iA r3, String str, String str2, boolean z) {
        this.A01 = osF;
        this.A02 = r3;
        this.A05 = z;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = xsv;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        File file = (File) obj;
        0qQ.A0B(file, 0);
        C71872OsF osF = this.A01;
        Activity activity = osF.A00;
        C59730JVo.A08(activity, file);
        1iA r8 = this.A02;
        1iA r4 = 1iA.A0a;
        int i = 2131969418;
        if (r8 == r4) {
            i = 2131976517;
        }
        C59689JTv.A01(activity, (String) null, i, 0);
        boolean z = this.A05;
        String str = this.A03;
        String str2 = this.A04;
        XSV xsv = this.A00;
        UserSession userSession = osF.A02;
        if (z) {
            AnonymousClass0iw r0 = osF.A01;
            if (r0 == null) {
                r0 = osF;
            }
            0Aj A0e = AnonymousClass7TE.A0e(C51972G9s.A0a(r0, userSession), "armadillo_save_media");
            if (!A0e.isSampled()) {
                return;
            }
            if (r8 == null) {
                throw AnonymousClass7TE.A0y();
            } else if (r8 == 1iA.A0Q || r8 == r4) {
                A0e.AAJ("media_type", AnonymousClass7TF.A0j(r8.name()));
                A0e.AAJ(RealtimeConstants.SEND_SUCCESS, RealtimeConstants.SEND_SUCCESS);
                DbV.A1J(A0e, str);
            } else {
                throw DbT.A0m();
            }
        } else {
            AnonymousClass0iw r6 = osF.A01;
            if (r6 == null) {
                r6 = osF;
            }
            C3265677h.A0B(xsv, r6, userSession, r8, (String) null, str2, true);
        }
    }
}
