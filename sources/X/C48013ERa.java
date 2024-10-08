package X;

import android.content.res.Resources;
import com.instagram.android.R;

/* renamed from: X.ERa  reason: case insensitive filesystem */
public final class C48013ERa extends C47518E6c {
    public static final String __redex_internal_original_name = "DailyLimitRemindAgainMenuFragment";
    public C49430EvW A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final String A02 = "time_spent";

    public final String getModuleName() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    private final FGF A06(long j) {
        Resources A05 = DbV.A05(this);
        0qQ.A07(A05);
        String A0z = DbV.A0z(this, C49927FFd.A02(A05, j), 2131957347);
        0qQ.A07(A0z);
        FNG fng = new FNG(this, j, 0);
        FGF fgf = new FGF((CharSequence) A0z);
        fgf.A01 = R.style.control_option_title_text;
        fgf.A02 = R.dimen.account_discovery_bottom_gap;
        fgf.A04 = fng;
        fgf.A00 = R.drawable.daily_reminder_interval_bottomsheet_menu_item_background;
        return fgf;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1260732697);
        super.onResume();
        FGF A06 = A06(300);
        FGF A062 = A06(900);
        String A0m = DbU.A0m(this, 2131957346);
        C50109FOz fOz = new C50109FOz((Object) this, 15);
        FGF fgf = new FGF((CharSequence) A0m);
        fgf.A01 = R.style.control_option_title_text;
        fgf.A02 = R.dimen.account_discovery_bottom_gap;
        fgf.A04 = fOz;
        fgf.A00 = R.drawable.daily_reminder_interval_bottomsheet_menu_item_background;
        setItems(0sr.A1P(new FGF[]{A06, A062, fgf}));
        AnonymousClass0fD.A09(1389339505, A022);
    }
}
