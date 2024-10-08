package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.ICf  reason: case insensitive filesystem */
public final class C56782ICf implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ IgFrameLayout A02;
    public final /* synthetic */ C52672Gak A03;
    public final /* synthetic */ C255773uh A04;
    public final /* synthetic */ C309686Zf A05;
    public final /* synthetic */ AnonymousClass6PT A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public C56782ICf(UserSession userSession, IgFrameLayout igFrameLayout, C52672Gak gak, C255773uh r4, C309686Zf r5, AnonymousClass6PT r6, String str, int i, boolean z) {
        this.A06 = r6;
        this.A00 = i;
        this.A08 = z;
        this.A04 = r4;
        this.A05 = r5;
        this.A01 = userSession;
        this.A02 = igFrameLayout;
        this.A07 = str;
        this.A03 = gak;
    }

    public final void onClick(View view) {
        String str;
        int A052 = AnonymousClass0fD.A05(381571719);
        AnonymousClass6PT r4 = this.A06;
        IgLinearLayout igLinearLayout = r4.A08;
        if (igLinearLayout != null) {
            0kx r2 = new 0kx(igLinearLayout);
            while (r2.hasNext()) {
                ((View) r2.next()).setSelected(false);
            }
            if (this.A00 == 0) {
                if (this.A08) {
                    C255773uh r7 = this.A04;
                    C309686Zf r6 = this.A05;
                    UserSession userSession = this.A01;
                    IgFrameLayout igFrameLayout = this.A02;
                    r6.DL4(r7, 2EG.A3e, igFrameLayout.getPivotX(), igFrameLayout.getPivotY());
                    C238833Dp.A00(userSession).A07(igFrameLayout, C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON, new String[]{r7.A0k}, 1);
                } else {
                    r4.A03();
                    this.A02.setSelected(true);
                    String str2 = this.A07;
                    0qQ.A0B(str2, 0);
                    r4.A0B = str2;
                    this.A04.A0I = str2;
                }
                C52672Gak.A04(this.A03, C273654mx.A00(328), "lead_ads_stories_offsite_generic_question_option_yes_click");
                this.A05.Ded();
            } else {
                if (r4.A0B.length() > 0) {
                    ConstraintLayout constraintLayout = r4.A05;
                    if (constraintLayout != null) {
                        DbU.A11(r4.A00().getContext(), constraintLayout, R.drawable.reel_ctwa_story_messaging_card_rounded_corner_background);
                    } else {
                        str = "cardViewWithoutCta";
                    }
                }
                r4.A0B = "";
                r4.A02();
                C52672Gak.A04(this.A03, C273654mx.A00(328), "lead_ads_stories_offsite_generic_question_option_no_click");
                this.A05.Evm();
            }
            AnonymousClass0fD.A0C(1691981897, A052);
            return;
        }
        str = "optionsListView";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
