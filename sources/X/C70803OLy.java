package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.Date;

/* renamed from: X.OLy  reason: case insensitive filesystem */
public final class C70803OLy {
    public int A00;
    public C74441Puw A01;
    public C15365UbI A02;
    public C331147Pt A03;
    public Integer A04;
    public String A05;
    public String A06;
    public String A07;
    public Date A08;
    public Date A09;
    public Date A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public C331127Pr A0E;
    public final Activity A0F;
    public final Context A0G;
    public final UserSession A0H;

    public final C70670OFr A00() {
        this.A02 = new C15365UbI();
        C331127Pr A0W = DbS.A0W(this.A0H);
        boolean z = this.A0C;
        A0W.A0k = z;
        A0W.A0q = !z;
        A0W.A1O = z;
        A0W.A11 = z;
        String str = this.A07;
        int i = this.A00;
        A0W.A0d = str;
        A0W.A0D = i;
        this.A0E = A0W;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("extra_show_all_day_toggle", false);
        A0a.putSerializable("extra_selected_date", this.A09);
        A0a.putSerializable("extra_date_range_start", this.A0A);
        A0a.putSerializable("extra_date_range_end", this.A08);
        A0a.putSerializable("extra_show_done_button", Boolean.valueOf(this.A0D));
        A0a.putString("extra_hint_text", this.A06);
        A0a.putBoolean("extra_listen_for_past_dates", this.A0B);
        Integer num = this.A04;
        if (num != null) {
            A0a.putInt("extra_minute_interval_length", num.intValue());
        }
        C15365UbI ubI = this.A02;
        if (ubI == null) {
            0qQ.A0F("bottomSheetFragment");
        } else {
            ubI.setArguments(A0a);
            C74441Puw puw = this.A01;
            if (puw != null) {
                ubI.A03 = puw;
            }
            boolean z2 = this.A0D;
            if (z2) {
                C331127Pr r2 = this.A0E;
                if (r2 != null) {
                    r2.A0g = this.A05;
                    r2.A0K = new C71403Ok2(this, 25);
                }
                0qQ.A0F("bottomSheetBuilder");
            }
            C331147Pt r1 = this.A03;
            if (r1 != null) {
                C331127Pr r0 = this.A0E;
                if (r0 != null) {
                    r0.A0Q = r1;
                }
                0qQ.A0F("bottomSheetBuilder");
            }
            Activity activity = this.A0F;
            C331127Pr r12 = this.A0E;
            if (r12 != null) {
                return new C70670OFr(activity, ubI, r12, z2);
            }
            0qQ.A0F("bottomSheetBuilder");
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public C70803OLy(Activity activity, Context context, UserSession userSession) {
        this.A0H = userSession;
        this.A0G = context;
        this.A0F = activity;
        this.A05 = AnonymousClass7TE.A16(context, 2131960992);
    }
}
