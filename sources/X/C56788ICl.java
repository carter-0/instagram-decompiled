package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import java.util.List;

/* renamed from: X.ICl  reason: case insensitive filesystem */
public final class C56788ICl implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ 1Xj A04;
    public final /* synthetic */ IntentAwareAdPivotState A05;
    public final /* synthetic */ AnonymousClass3W1 A06;
    public final /* synthetic */ C230292pL A07;
    public final /* synthetic */ C54077Gz1 A08;
    public final /* synthetic */ C230282pK A09;
    public final /* synthetic */ C227802jw A0A;
    public final /* synthetic */ Integer A0B;
    public final /* synthetic */ List A0C;

    public C56788ICl(View view, AnonymousClass0iw r2, UserSession userSession, 1Xj r4, IntentAwareAdPivotState intentAwareAdPivotState, AnonymousClass3W1 r6, C230292pL r7, C54077Gz1 gz1, C230282pK r9, C227802jw r10, Integer num, List list, int i) {
        this.A05 = intentAwareAdPivotState;
        this.A03 = userSession;
        this.A04 = r4;
        this.A08 = gz1;
        this.A0A = r10;
        this.A06 = r6;
        this.A01 = view;
        this.A02 = r2;
        this.A0C = list;
        this.A07 = r7;
        this.A09 = r9;
        this.A00 = i;
        this.A0B = num;
    }

    public final void onClick(View view) {
        IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum;
        IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum2;
        C255123tc BF5;
        ClipsViewerSource clipsViewerSource;
        C255123tc BF52;
        int A052 = AnonymousClass0fD.A05(-804277525);
        IntentAwareAdPivotState intentAwareAdPivotState = this.A05;
        UserSession userSession = this.A03;
        1Xj r3 = this.A04;
        intentAwareAdPivotState.A06 = C231122qu.A07(userSession, r3);
        C54077Gz1 gz1 = this.A08;
        int i = gz1.A00;
        AnonymousClass4I5 r7 = AnonymousClass59V.A00;
        if (((!r7.A01(Integer.valueOf(i)) || !182.A06(0Tu.A06, userSession, 36312887644653066L)) && (i != 3 || !182.A06(0Tu.A06, userSession, 36312887644718603L))) || !r3.CeS()) {
            this.A0A.A0H(r3, intentAwareAdPivotState, gz1, this.A0C);
        } else {
            C250513lZ A0w = C51966G9m.A0w(r3);
            if (A0w == null || (BF52 = A0w.BF5()) == null) {
                iGAdsFeedVideoWBViewerTypeEnum = null;
            } else {
                iGAdsFeedVideoWBViewerTypeEnum = BF52.BEn();
            }
            if (iGAdsFeedVideoWBViewerTypeEnum == IGAdsFeedVideoWBViewerTypeEnum.POST_TAP_WATCH_AND_BROWSE_VIEWER_ON_REELS_VIEWER_WITH_CHAINING) {
                C227802jw r9 = this.A0A;
                AnonymousClass3W1 r15 = this.A06;
                View view2 = this.A01;
                AnonymousClass0iw r10 = this.A02;
                0qQ.A0C(r10, C66579MXk.A00(2));
                AnonymousClass4DU r102 = (AnonymousClass4DU) r10;
                int i2 = gz1.A00;
                String id = gz1.getId();
                DbW.A1N(r102, 3, id);
                HnZ A012 = r9.A09().A01();
                Integer valueOf = Integer.valueOf(i2);
                if (r7.A01(valueOf)) {
                    clipsViewerSource = ClipsViewerSource.FEED_PAE_MULTI_ADS_WATCH_AND_BROWSE;
                } else {
                    clipsViewerSource = ClipsViewerSource.FEED_SA_MULTI_ADS_WATCH_AND_BROWSE;
                }
                AnonymousClass337 A002 = C55173HdP.A00(clipsViewerSource);
                if (A002 != null) {
                    C263264Jy r1 = C263264Jy.A00;
                    UserSession userSession2 = A012.A00;
                    C227802jw r27 = A012.A02;
                    C55174HdQ A0B2 = r1.A0B(r27.requireContext(), userSession2, r3, A002);
                    0qQ.A0C(A0B2, "null cannot be cast to non-null type com.instagram.watchandbrowse.model.ClipsWatchAndBrowseConfig");
                    XQ7 xq7 = (XQ7) A0B2;
                    Integer num = AnonymousClass05K.A00;
                    View view3 = view2;
                    C238833Dp.A00(userSession2).A0A(view3, new C246153e7(new AnonymousClass4HH(r27.requireContext(), r15, userSession2, r3), userSession2, r3, r102, "in_app_browser_v2", 0sl.A00));
                    C238833Dp.A00(userSession2).A07(view2, C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON, new String[0], 1);
                    FragmentActivity requireActivity = r27.requireActivity();
                    C270634h3 A0V = C51975G9x.A0V(clipsViewerSource, userSession2, r3);
                    A0V.A1g = false;
                    A0V.A1c = false;
                    Integer num2 = xq7.A0B;
                    0qQ.A0B(num2, 0);
                    A0V.A0S = num2;
                    A0V.A0Y = Integer.valueOf(xq7.A0A);
                    A0V.A01(XXu.A00(xq7));
                    0qQ.A0B(num, 0);
                    A0V.A0Q = num;
                    A0V.A1D = r102.getModuleName();
                    A0V.A17 = C231122qu.A07(userSession2, r3);
                    A0V.A1A = C231122qu.A0F(userSession2, r3);
                    C51986GAj A003 = IntentAwareAdsInfoIntf.A00.A00();
                    A003.A02 = valueOf;
                    A003.A06 = id;
                    A0V.A0D = A003.A00();
                    I6Y.A01(requireActivity, A0V, userSession2, false);
                }
            } else {
                C250513lZ A0w2 = C51966G9m.A0w(r3);
                if (A0w2 == null || (BF5 = A0w2.BF5()) == null) {
                    iGAdsFeedVideoWBViewerTypeEnum2 = null;
                } else {
                    iGAdsFeedVideoWBViewerTypeEnum2 = BF5.BEn();
                }
                boolean A1W = AnonymousClass7TF.A1W(iGAdsFeedVideoWBViewerTypeEnum2, IGAdsFeedVideoWBViewerTypeEnum.POST_TAP_REELS_VIEWER_WITH_CHAINING);
                C227802jw r72 = this.A0A;
                if (A1W) {
                    r72.A0M(r3, gz1.getId(), gz1.A00);
                } else {
                    r72.A0I(r3, intentAwareAdPivotState, gz1, this.A0C);
                }
            }
        }
        I73.A04(userSession, r3, this.A07, gz1);
        this.A09.A0F(intentAwareAdPivotState, gz1, this.A0B, this.A00);
        AnonymousClass0fD.A0C(924183251, A052);
    }
}
