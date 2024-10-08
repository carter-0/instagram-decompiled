package X;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;

public final class ICW implements View.OnClickListener {
    public final /* synthetic */ IGCTMessagingAdsInfoDictIntf A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C52673Gal A02;
    public final /* synthetic */ C255773uh A03;
    public final /* synthetic */ AnonymousClass6PV A04;
    public final /* synthetic */ C309836Zu A05;

    public ICW(IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf, UserSession userSession, C52673Gal gal, C255773uh r4, AnonymousClass6PV r5, C309836Zu r6) {
        this.A05 = r6;
        this.A01 = userSession;
        this.A04 = r5;
        this.A02 = gal;
        this.A03 = r4;
        this.A00 = iGCTMessagingAdsInfoDictIntf;
    }

    public final void onClick(View view) {
        String str;
        Long l;
        int A052 = AnonymousClass0fD.A05(883832762);
        C309836Zu r1 = this.A05;
        UserSession userSession = this.A01;
        AnonymousClass6PV r3 = this.A04;
        r1.DH3(userSession, r3.A0B);
        try {
            Animation loadAnimation = AnimationUtils.loadAnimation(r3.A00().getContext(), R.anim.button_slide_up_0_to_100);
            loadAnimation.setAnimationListener(new IE5(r3, 5));
            ConstraintLayout constraintLayout = r3.A08;
            if (constraintLayout != null) {
                constraintLayout.startAnimation(loadAnimation);
                r3.A0C = true;
                IgLinearLayout igLinearLayout = r3.A09;
                if (igLinearLayout != null) {
                    0kx r2 = new 0kx(igLinearLayout);
                    while (r2.hasNext()) {
                        AnonymousClass7TF.A0G((View) r2.next(), R.id.option_text).setOnClickListener((View.OnClickListener) null);
                    }
                    C52673Gal gal = this.A02;
                    C255773uh r32 = this.A03;
                    AnonymousClass3OA r12 = r32.A0g;
                    OnFeedMessagesIntf onFeedMessagesIntf = null;
                    if (r12 != null) {
                        str = r12.A0S;
                    } else {
                        str = null;
                    }
                    IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf = this.A00;
                    if (iGCTMessagingAdsInfoDictIntf != null) {
                        l = Long.valueOf(C16947VBz.A00(iGCTMessagingAdsInfoDictIntf));
                        onFeedMessagesIntf = iGCTMessagingAdsInfoDictIntf.BTY();
                    } else {
                        l = null;
                    }
                    gal.A04(userSession, r32.A0b, l, str, AnonymousClass3ZN.A00(onFeedMessagesIntf));
                    AnonymousClass0fD.A0C(53451541, A052);
                    return;
                }
                0qQ.A0F("optionsListView");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("ctaButtonLayout");
            throw AnonymousClass00P.createAndThrow();
        } catch (Resources.NotFoundException unused) {
        }
    }
}
