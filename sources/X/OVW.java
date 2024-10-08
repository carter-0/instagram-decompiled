package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Date;

public final class OVW {
    public C331157Pu A00;
    public final Context A01;
    public final C74441Puw A02;
    public final boolean A03;
    public final boolean A04;
    public final Activity A05;
    public final UserSession A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    public OVW(Activity activity, UserSession userSession, C74441Puw puw, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(userSession, 2);
        this.A05 = activity;
        this.A06 = userSession;
        this.A07 = str;
        this.A0A = z;
        this.A04 = z2;
        this.A08 = str2;
        this.A02 = puw;
        this.A09 = z3;
        this.A03 = z4;
        this.A01 = z3 ? 2Yn.A01(activity) : activity;
    }

    private final C331127Pr A00(String str, boolean z) {
        C331127Pr A0W = DbS.A0W(this.A06);
        A0W.A0k = z;
        A0W.A0q = !z;
        A0W.A1O = z;
        A0W.A11 = z;
        if (str == null) {
            str = this.A07;
        }
        A0W.A0d = str;
        A0W.A0U = new C72959PQr(this, 0);
        if (this.A09) {
            AnonymousClass2k4 r0 = AnonymousClass2k4.NIGHT;
            0qQ.A0B(r0, 0);
            A0W.A0O = r0;
        }
        return A0W;
    }

    public final void A01(Boolean bool, String str, Date date, Date date2, Date date3, boolean z) {
        C331157Pu A002;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("extra_show_all_day_toggle", this.A0A);
        A0a.putSerializable("extra_selected_date", date);
        A0a.putSerializable("extra_date_range_start", date2);
        A0a.putSerializable("extra_date_range_end", date3);
        boolean z2 = this.A04;
        A0a.putSerializable("extra_show_done_button", Boolean.valueOf(z2));
        boolean z3 = this.A03;
        A0a.putSerializable("extra_show_clear_button", Boolean.valueOf(z3));
        A0a.putString("extra_hint_text", this.A08);
        C15365UbI ubI = new C15365UbI();
        ubI.setArguments(A0a);
        ubI.A03 = this.A02;
        if (this.A09) {
            ubI.setDayNightMode(AnonymousClass2k4.NIGHT);
        }
        boolean A1Y = AnonymousClass7TF.A1Y(bool, true);
        C331127Pr A003 = A00(str, z);
        if (A1Y) {
            if (z2) {
                Context context = this.A01;
                A003.A0P = new C55639Hky(AnonymousClass7TF.A03(context, R.attr.igds_color_primary_button), AnonymousClass7TF.A03(context, R.attr.igds_color_selected_text_background));
                C331137Ps r8 = new C331137Ps((View.OnClickListener) null, (CharSequence) null, "", 0, 0);
                r8.A06 = context.getString(2131960992);
                r8.A05 = new C71403Ok2(ubI, 28);
                r8.A0A = true;
                A003.A07(r8.A00());
            }
            if (z3) {
                A003.A0h = this.A01.getString(2131955133);
                A003.A0L = new C71403Ok2(ubI, 29);
            }
            A002 = A003.A00();
        } else {
            if (z2) {
                A003.A0g = this.A01.getString(2131960992);
                A003.A0K = new C71403Ok2(ubI, 26);
            }
            if (z3) {
                A003.A0h = this.A01.getString(2131955133);
                A003.A0L = new C71403Ok2(ubI, 27);
            }
            A002 = A003.A00();
            if (z2) {
                A002.A0R(true, z3);
            }
        }
        this.A00 = A002;
        C331157Pu.A00(this.A05, this.A01, ubI, A002, (AnonymousClass37D) null);
    }
}
