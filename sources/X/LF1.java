package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.CancellationException;

public final class LF1 {
    public final View A00;
    public final LN8 A01;
    public final Context A02;

    public LF1(Context context, View view, AnonymousClass7SR r6) {
        0qQ.A0B(view, 3);
        this.A02 = context;
        this.A00 = view;
        LN8 ln8 = new LN8(view, r6);
        this.A01 = ln8;
        View view2 = ln8.A09;
        ln8.A01 = JTP.A0T(view2, R.id.invitation_channel_icon);
        ln8.A00 = JTP.A0T(view2, R.id.invitation_cancel_icon);
        ln8.A03 = DbT.A0a(view2, R.id.invitation_text_title);
        ln8.A02 = DbT.A0a(view2, R.id.invitation_text);
        ln8.A05 = DbU.A0b(view2, R.id.invitation_primary_cta_button);
        ln8.A06 = DbU.A0b(view2, R.id.invitation_secondary_button);
    }

    public final void A01(FragmentActivity fragmentActivity, AnonymousClass7GV r24, 2Er r25) {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        List BIq;
        Context context = this.A02;
        AnonymousClass7GV r2 = r24;
        05G r8 = r2.A05;
        r8.getValue();
        String str5 = null;
        2Er r1 = r25;
        if (r25 != null) {
            str = r1.Asi();
            str2 = r1.C6C();
            str3 = r1.C6k();
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        boolean z = false;
        if (r25 != null) {
            i = r1.AdN();
        } else {
            i = 0;
        }
        AnonymousClass7GW r6 = new AnonymousClass7GW(str, str2, str3, i);
        Integer num = (Integer) ((AnonymousClass9IV) r8.getValue()).A00;
        0qQ.A0B(num, 0);
        r8.Epw(new AnonymousClass9IV(r6, num));
        05G r0 = r2.A07;
        if (r25 != null) {
            z = r1.COP();
        }
        AnonymousClass7TF.A1O(r0, z);
        05G r9 = r2.A08;
        UserSession userSession = r2.A00;
        boolean z2 = false;
        if (r25 != null && r1.COP() && (BIq = r1.BIq()) != null && BIq.contains(userSession.A06)) {
            z2 = true;
        }
        AnonymousClass7TF.A1O(r9, z2);
        05G r62 = r2.A0B;
        AnonymousClass7TF.A1O(r62, AnonymousClass7OU.A00(userSession, r1));
        r2.A09.Epw(context.getString(2131960632));
        String str6 = ((AnonymousClass7GW) ((AnonymousClass9IV) r8.getValue()).A01).A01;
        if (DbX.A1b(r62)) {
            str5 = context.getString(2131954240);
        } else if (str6 != null) {
            str5 = DbW.A0h(context, str6, 2131954234);
        }
        boolean A1b = DbX.A1b(r62);
        String A16 = AnonymousClass7TE.A16(context, 2131954232);
        int i2 = 2131954233;
        if (A1b) {
            i2 = 2131954239;
        }
        SpannableStringBuilder A0C = DbS.A0C(DbY.A0c(context, A16, i2));
        int A022 = DbV.A02(context);
        AnonymousClass7AV.A03(A0C, new C47562E8a(new 04x(16, A16), userSession, AnonymousClass05K.A01, A16, A022), A16);
        Drawable drawable = context.getDrawable(R.drawable.instagram_shield_star_pano_outline_24);
        int i3 = 2131954218;
        if (DbX.A1b(r62)) {
            i3 = 2131954238;
        }
        String A0p = C51967G9n.A0p(context, i3);
        if (!DbX.A1b(r62)) {
            str4 = context.getString(2131954221);
        } else {
            str4 = null;
        }
        r2.A06.Epw(new AnonymousClass9JI(A0C, drawable, str5, A0p, str4, 1));
        JTS.A11(fragmentActivity, new C66172MGj(r2, r1, this, (AnonymousClass4D7) null, 17), r2.A0E);
    }

    public final void A00() {
        LN8 ln8 = this.A01;
        ln8.A03 = null;
        ln8.A02 = null;
        ln8.A01 = null;
        ln8.A00 = null;
        ln8.A05 = null;
        ln8.A06 = null;
        C262204Co r0 = ln8.A07;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        ln8.A04 = null;
    }
}
