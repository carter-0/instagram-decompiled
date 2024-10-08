package X;

import android.view.View;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.H7m  reason: case insensitive filesystem */
public final class C54317H7m extends AnonymousClass3NK {
    public final /* synthetic */ ClipsViewerConfig A00;
    public final /* synthetic */ C267324bN A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ GFJ A03;
    public final /* synthetic */ 0sP A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public C54317H7m(ClipsViewerConfig clipsViewerConfig, C267324bN r2, User user, GFJ gfj, 0sP r5, boolean z, boolean z2) {
        this.A00 = clipsViewerConfig;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = user;
        this.A06 = z;
        this.A03 = gfj;
        this.A05 = z2;
    }

    public final boolean Dqe(View view) {
        IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf;
        String str;
        long j;
        Long A10;
        OnFeedMessagesIntf BTY;
        String A012;
        ClipsViewerConfig clipsViewerConfig = this.A00;
        C267324bN r4 = this.A01;
        if (!AnonymousClass3ZC.A07(clipsViewerConfig, r4)) {
            return false;
        }
        this.A04.invoke(this.A02);
        if (this.A06) {
            C52672Gak gak = this.A03.A0E;
            if (gak == null || (A012 = C52672Gak.A01(r4.A06().A0L)) == null) {
                return true;
            }
            C52672Gak.A03(gak, (Long) null, A012, "lead_ads_first_question_profile_click");
            return true;
        } else if (!this.A05) {
            return true;
        } else {
            1Xj r1 = r4.A02;
            Long l = null;
            if (r1 != null) {
                iGCTMessagingAdsInfoDictIntf = C231122qu.A00(this.A03.A0A, r1);
                if (!(iGCTMessagingAdsInfoDictIntf == null || (BTY = iGCTMessagingAdsInfoDictIntf.BTY()) == null)) {
                    str = AnonymousClass3ZN.A00(BTY);
                }
                str = "";
            } else {
                iGCTMessagingAdsInfoDictIntf = null;
                str = "";
            }
            GFJ gfj = this.A03;
            C52673Gal gal = gfj.A0B;
            if (gal == null) {
                return true;
            }
            String A1B = C51966G9m.A1B(r4);
            if (iGCTMessagingAdsInfoDictIntf != null) {
                l = Long.valueOf(C16947VBz.A00(iGCTMessagingAdsInfoDictIntf));
            }
            1Xj r8 = r4.A02;
            UserSession userSession = gfj.A0A;
            0qQ.A0B(userSession, 4);
            0Aj A0e = AnonymousClass7TE.A0e(gal.A01, "faqs_sticker_avatar_tap");
            if (!A0e.isSampled()) {
                return true;
            }
            if (A1B == null || (A10 = AnonymousClass7TE.A10(A1B)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            C51970G9q.A17(A0e, j);
            C52673Gal.A01(A0e, userSession, r8, C51967G9n.A08(l, 0));
            C52673Gal.A02(A0e, gal, Dbn.A00(42, 10, 73), gal.A02, str);
            return true;
        }
    }
}
