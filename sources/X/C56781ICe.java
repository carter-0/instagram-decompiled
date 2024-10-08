package X;

import android.view.View;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.IceBreakerMessageIntf;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.ICe  reason: case insensitive filesystem */
public final class C56781ICe implements View.OnClickListener {
    public final /* synthetic */ IGCTMessagingAdsInfoDictIntf A00;
    public final /* synthetic */ IceBreakerMessageIntf A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ IgFrameLayout A03;
    public final /* synthetic */ C52673Gal A04;
    public final /* synthetic */ C255773uh A05;
    public final /* synthetic */ AnonymousClass6PV A06;
    public final /* synthetic */ C309836Zu A07;

    public C56781ICe(IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf, IceBreakerMessageIntf iceBreakerMessageIntf, UserSession userSession, IgFrameLayout igFrameLayout, C52673Gal gal, C255773uh r6, AnonymousClass6PV r7, C309836Zu r8) {
        this.A06 = r7;
        this.A03 = igFrameLayout;
        this.A01 = iceBreakerMessageIntf;
        this.A07 = r8;
        this.A04 = gal;
        this.A05 = r6;
        this.A00 = iGCTMessagingAdsInfoDictIntf;
        this.A02 = userSession;
    }

    public final void onClick(View view) {
        String str;
        Long l;
        int A052 = AnonymousClass0fD.A05(-1355876260);
        AnonymousClass6PV r3 = this.A06;
        IgLinearLayout igLinearLayout = r3.A09;
        if (igLinearLayout != null) {
            0kx r2 = new 0kx(igLinearLayout);
            while (r2.hasNext()) {
                ((View) r2.next()).setSelected(false);
            }
            r3.A02();
            this.A03.setSelected(true);
            String message = this.A01.getMessage();
            if (message == null) {
                message = "";
            }
            r3.A0B = message;
            this.A07.Ded();
            C52673Gal gal = this.A04;
            C255773uh r32 = this.A05;
            AnonymousClass3OA r1 = r32.A0g;
            OnFeedMessagesIntf onFeedMessagesIntf = null;
            if (r1 != null) {
                str = r1.A0S;
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
            gal.A03(this.A02, r32.A0b, l, str, AnonymousClass3ZN.A00(onFeedMessagesIntf));
            AnonymousClass0fD.A0C(487501530, A052);
            return;
        }
        0qQ.A0F("optionsListView");
        throw AnonymousClass00P.createAndThrow();
    }
}
