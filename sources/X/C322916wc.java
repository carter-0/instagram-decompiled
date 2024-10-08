package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.6wc  reason: invalid class name and case insensitive filesystem */
public final class C322916wc extends C48203Eaj {
    public Integer A00 = AnonymousClass05K.A0C;
    public final Context A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final 1Av A04;
    public final C322906wb A05;
    public final C273414mX A06 = new C322926wd(this);
    public final User A07;
    public final boolean A08;

    public C322916wc(Context context, FragmentActivity fragmentActivity, UserSession userSession, C322906wb r5, User user, boolean z) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A03 = userSession;
        this.A07 = user;
        this.A08 = z;
        this.A02 = fragmentActivity;
        this.A05 = r5;
        this.A04 = 1Au.A00(userSession);
    }

    public static final List A01(String str) {
        try {
            C250873mC r5 = C250863mB.A03;
            return 00k.A0g((Iterable) r5.A00(str, C360038dt.A02(0tm.A01(List.class, new 0Dj(AnonymousClass05K.A00, 0tm.A00(Integer.TYPE))), r5.A02)), new C41282ArN());
        } catch (C66601pa unused) {
            return 0sn.A00;
        }
    }

    public static final void A02(C322916wc r7) {
        C319976rX r1 = C319976rX.A00;
        UserSession userSession = r7.A03;
        r1.A0E(userSession, C319986rY.SELF, A00(r7.A00), "impression_highlights_nux_bottomsheet", userSession.A06, (String) null);
    }

    public static final void A03(C322916wc r6, boolean z) {
        String str;
        C319976rX r1 = C319976rX.A00;
        UserSession userSession = r6.A03;
        String A002 = A00(r6.A00);
        if (z) {
            str = "tap_highlights_nux_bottomsheet_primary_button";
        } else {
            str = "tap_highlights_nux_bottomsheet_secondary_button";
        }
        r1.A0E(userSession, C319986rY.SELF, A002, str, userSession.A06, (String) null);
    }

    public static final String A00(Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            return "highlights_in_grid_opt_in_nux";
        }
        if (intValue == 1) {
            return "highlights_in_grid_forced_migration_nux";
        }
        if (intValue == 2) {
            return "";
        }
        throw new RuntimeException();
    }
}
