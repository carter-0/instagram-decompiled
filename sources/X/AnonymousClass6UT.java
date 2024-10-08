package X;

import android.view.View;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* renamed from: X.6UT  reason: invalid class name */
public final class AnonymousClass6UT implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ C255773uh A02;
    public final /* synthetic */ C316236lK A03;
    public final /* synthetic */ C317186mr A04;
    public final /* synthetic */ AnonymousClass2fS A05;

    public AnonymousClass6UT(UserSession userSession, Reel reel, C255773uh r3, C316236lK r4, C317186mr r5, AnonymousClass2fS r6) {
        this.A05 = r6;
        this.A02 = r3;
        this.A00 = userSession;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = reel;
    }

    public final void onClick(View view) {
        C243363Yl r5;
        String str;
        int A052 = AnonymousClass0fD.A05(-936070631);
        AnonymousClass2fS r1 = this.A05;
        C255773uh r7 = this.A02;
        1Xj r0 = r7.A0b;
        r0.getClass();
        boolean A0M = r1.A0M(r0);
        if (A0M) {
            r5 = C243363Yl.NOT_LIKED;
        } else {
            r5 = C243363Yl.LIKED;
        }
        1QP A002 = AnonymousClass1QO.A00(this.A00);
        A002.flowStartIfNotOngoing(18943093, new UserFlowConfig("story_viewer_like_button", false));
        C243363Yl r2 = C243363Yl.LIKED;
        if (r5 == r2) {
            str = "story_like_button_tapped";
        } else {
            str = "story_unlike_button_tapped";
        }
        A002.flowMarkPoint(18943093, str);
        C316236lK r12 = this.A03;
        if (!C317336n6.A00(r12.A01)) {
            r12.A05.A02(A0M, false, false);
        }
        if (r5 == r2) {
            IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = r12.A04;
            igBouncyUfiButtonImageView.setHapticFeedbackEnabled(true);
            igBouncyUfiButtonImageView.performHapticFeedback(1);
        }
        this.A04.DNS(r5, this.A01, r7);
        AnonymousClass0fD.A0C(-84150288, A052);
    }
}
