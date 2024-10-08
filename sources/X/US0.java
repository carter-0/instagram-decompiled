package X;

import android.app.Activity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class US0 extends C69678Nq0 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass9JE A01;
    public final /* synthetic */ UserSession A02;

    public US0(Activity activity, AnonymousClass9JE r2, UserSession userSession) {
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = r2;
    }

    public final void A03() {
        Activity activity = this.A00;
        UserSession userSession = this.A02;
        AnonymousClass9JE r13 = this.A01;
        C66581MXm.A11("EDIT_POST", "POST").contains(r13.A03);
        C19198WPe A002 = VFP.A00(userSession);
        String str = r13.A04;
        if (str == null) {
            str = C51972G9s.A0n();
        }
        try {
            A002.A01.A02(activity, (AnonymousClass4OA) r13.A00, new WKC(activity, r13, A002, str));
        } catch (Throwable th) {
            AnonymousClass4O6 A012 = A002.A01(activity);
            Long A003 = AnonymousClass4O7.A00(A002.A00);
            C69499Nmh nmh = C69499Nmh.A03;
            V1R v1r = V1R.APP_PERMISSION;
            List list = (List) r13.A02;
            String str2 = r13.A03;
            String A16 = C51968G9o.A16(th);
            0qQ.A07(A16);
            String message = th.getMessage();
            if (message == null) {
                message = "null";
            }
            C61037Jvb jvb = new C61037Jvb(A16, message, 2Og.A00(th), 1);
            String obj = r13.A00.toString();
            C51972G9s.A1D(list, str2);
            if (182.A06(0Tu.A05, A012.A01, 36318041591518989L)) {
                1Ln r10 = new 1Ln(AnonymousClass7TE.A0e(A012.A00, "device_permissions"), 139);
                if (DbT.A1Y(r10)) {
                    0bb r9 = new 0bb();
                    r9.A06("access_level", obj);
                    r9.A06("data_type", "LOCATION_FOREGROUND");
                    r9.A06("auth_status", (String) null);
                    r9.A06("listener", (String) null);
                    String str3 = jvb.A02;
                    0bb r2 = new 0bb();
                    r2.A06(TraceFieldType.ErrorCode, jvb.A00);
                    r2.A06("error_message", jvb.A01);
                    if (str3 != null) {
                        r2.A06("error_stack", str3);
                    }
                    r9.A02(r2, "error");
                    C13990Tnq.A0z(v1r, nmh, r10, list);
                    C13990Tnq.A16(r9, r10, A003, str, str2);
                }
            }
        }
    }
}
