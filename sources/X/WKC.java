package X;

import android.app.Activity;
import java.util.List;

public final class WKC implements C20882X2k {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass9JE A01;
    public final /* synthetic */ C19198WPe A02;
    public final /* synthetic */ String A03;

    public WKC(Activity activity, AnonymousClass9JE r2, C19198WPe wPe, String str) {
        this.A02 = wPe;
        this.A00 = activity;
        this.A01 = r2;
        this.A03 = str;
    }

    public final void DWn(AnonymousClass4OB r19, Integer num) {
        C69499Nmh nmh;
        String str;
        Integer num2 = num;
        0qQ.A0B(num2, 1);
        C19198WPe wPe = this.A02;
        AnonymousClass4O6 A012 = wPe.A01(this.A00);
        Long A002 = AnonymousClass4O7.A00(wPe.A00);
        AnonymousClass4OB r7 = r19;
        if (r7 == AnonymousClass4OB.GRANTED) {
            nmh = C69499Nmh.A04;
        } else if (r7 == AnonymousClass4OB.LOCATION_PARTIAL) {
            nmh = C69499Nmh.A05;
        } else {
            nmh = C69499Nmh.A02;
        }
        V1R v1r = V1R.APP_PERMISSION;
        AnonymousClass9JE r8 = this.A01;
        List list = (List) r8.A02;
        String str2 = r8.A03;
        String str3 = this.A03;
        String obj = r8.A00.toString();
        if (r7 == AnonymousClass4OB.LOCATION_PARTIAL) {
            str = "location_partial";
        } else {
            str = null;
        }
        C51972G9s.A1D(list, str2);
        if (182.A06(0Tu.A05, A012.A01, 36318041591518989L)) {
            if (str3 == null) {
                str3 = C51972G9s.A0n();
            }
            1Ln r2 = new 1Ln(AnonymousClass7TE.A0e(A012.A00, "device_permissions"), 139);
            if (DbT.A1Y(r2)) {
                0bb r1 = new 0bb();
                r1.A06("access_level", obj);
                r1.A06("data_type", "LOCATION_FOREGROUND");
                r1.A06("auth_status", str);
                r1.A06("listener", (String) null);
                C13990Tnq.A0z(v1r, nmh, r2, list);
                C13990Tnq.A16(r1, r2, A002, str3, str2);
            }
        }
        ((C20882X2k) r8.A01).DWn(r7, num2);
    }
}
