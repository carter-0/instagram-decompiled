package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Uu9  reason: case insensitive filesystem */
public final class C16391Uu9 extends C51086FoG {
    public final /* synthetic */ C19199WPf A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public C16391Uu9(C19199WPf wPf, String str, boolean z) {
        this.A00 = wPf;
        this.A01 = str;
        this.A02 = z;
    }

    public final void Cyb(boolean z) {
        C312266e6 r0 = this.A00.A0E;
        if (r0 != null) {
            r0.De6();
        }
    }

    public final void De7() {
        C59689JTv.A0F(this.A00.A05, "reporting_options_fail", 2131972221);
    }

    public final void DeA(String str) {
        C19199WPf wPf = this.A00;
        String str2 = this.A01;
        if (wPf.A0C.A04) {
            str2 = "";
        }
        02m r2 = 02m.A0p;
        r2.markerStart(17629204);
        r2.markerAnnotate(17629204, "effect_id", str2);
        if (str == null) {
            str = "unknown";
        }
        r2.markerAnnotate(17629204, "report_tag", str);
    }

    public final void Do0(String str, String str2, String str3) {
        C19199WPf wPf = this.A00;
        String str4 = this.A01;
        if (wPf.A0C.A04) {
            str4 = "";
        }
        02m r2 = 02m.A0p;
        r2.markerAnnotate(17629204, "effect_id", str4);
        if (str == null) {
            str = "unknown";
        }
        r2.markerAnnotate(17629204, "report_tag", str);
        r2.markerEnd(17629204, 3);
    }

    public final void Do1(String str) {
        C19199WPf wPf = this.A00;
        String str2 = this.A01;
        String str3 = str2;
        if (wPf.A0C.A04) {
            str3 = "";
        }
        02m r2 = 02m.A0p;
        r2.markerAnnotate(17629204, "effect_id", str3);
        if (str == null) {
            str = "unknown";
        }
        r2.markerAnnotate(17629204, "report_tag", str);
        r2.markerEnd(17629204, 2);
        boolean z = this.A02;
        C312266e6 r0 = wPf.A0E;
        if (r0 != null && !z) {
            r0.De5(str2);
            UserSession userSession = wPf.A0B;
            0qQ.A0B(userSession, 0);
            C16909VAm.A00(new C19137WMt(userSession, str2), userSession, str2);
        }
        Context context = wPf.A0D.getContext();
        if (context != null) {
            C59689JTv.A08(context, 2131972213, 1);
        }
    }
}
