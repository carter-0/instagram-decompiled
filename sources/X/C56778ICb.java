package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.ICb  reason: case insensitive filesystem */
public final class C56778ICb implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ IgFrameLayout A01;
    public final /* synthetic */ C52672Gak A02;
    public final /* synthetic */ C255773uh A03;
    public final /* synthetic */ C309686Zf A04;
    public final /* synthetic */ AnonymousClass6PN A05;
    public final /* synthetic */ String A06;

    public C56778ICb(UserSession userSession, IgFrameLayout igFrameLayout, C52672Gak gak, C255773uh r4, C309686Zf r5, AnonymousClass6PN r6, String str) {
        this.A05 = r6;
        this.A03 = r4;
        this.A00 = userSession;
        this.A01 = igFrameLayout;
        this.A06 = str;
        this.A04 = r5;
        this.A02 = gak;
    }

    public final void onClick(View view) {
        long j;
        int A052 = AnonymousClass0fD.A05(2092349363);
        AnonymousClass6PN r10 = this.A05;
        IgLinearLayout igLinearLayout = r10.A08;
        if (igLinearLayout != null) {
            0kx r2 = new 0kx(igLinearLayout);
            while (r2.hasNext()) {
                ((View) r2.next()).setSelected(false);
            }
            Long l = r10.A0B;
            Long l2 = null;
            if (l != null) {
                long longValue = l.longValue();
                long currentTimeMillis = System.currentTimeMillis();
                r10.A0B = null;
                r10.A0D = false;
                l2 = Long.valueOf(currentTimeMillis - longValue);
            }
            C255773uh r5 = this.A03;
            UserSession userSession = this.A00;
            if (r5.A1f() || r5.A1Z() || r5.A1O()) {
                j = -1;
            } else {
                j = 182.A01(0Tu.A05, userSession, 36610438670129148L);
            }
            boolean z = false;
            if (j > 0 && l2 != null && l2.longValue() >= j) {
                z = true;
            }
            if (!z) {
                r10.A02(false);
            }
            IgFrameLayout igFrameLayout = this.A01;
            igFrameLayout.setSelected(true);
            String str = this.A06;
            0qQ.A0B(str, 0);
            r10.A0C = str;
            r5.A0I = str;
            C309686Zf r9 = this.A04;
            r9.Ded();
            if (z) {
                r10.A0E = true;
                C52672Gak.A03(this.A02, l2, "lead_ads_stories_first_question", "lead_ads_first_question_one_tap_dwell_option_click");
                r9.DL4(r5, 2EG.A3e, igFrameLayout.getPivotX(), igFrameLayout.getPivotY());
                C238833Dp.A00(userSession).A07(igFrameLayout, C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON, new String[]{r5.A0k}, 1);
            } else {
                C52672Gak.A03(this.A02, l2, "lead_ads_stories_first_question", "lead_ads_first_question_option_click");
            }
            AnonymousClass0fD.A0C(843471508, A052);
            return;
        }
        0qQ.A0F("optionsListView");
        throw AnonymousClass00P.createAndThrow();
    }
}
