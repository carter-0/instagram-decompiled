package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.fragment.followersshare.FollowersShareFragment;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.shopping.video.ShoppingCreationConfig;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.user.model.User;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Loa  reason: case insensitive filesystem */
public final class C65171Loa implements C66576MXh, MT7 {
    public LFW A00;
    public C65229LpZ A01;
    public C65222LpS A02;
    public C363658k8 A03 = new C65240Lpk(this, 1);
    public C60058JeZ A04;
    public final 28D A05;
    public final AnonymousClass4DH A06;
    public final UserSession A07;
    public final C61822KNl A08;
    public final C61828KNr A09;
    public final C60259JiG A0A;
    public final L15 A0B;
    public final C65174Lod A0C;

    public final void A04(String str) {
        0qQ.A0B(str, 0);
        if (str.equals(EXN.SHARE_PHOTO.A01())) {
            C363388je.A00(this.A07).A01(FollowersShareFragment.A10, this.A03, "feed_composer");
        }
    }

    public final void CkT(String str) {
    }

    public final void CnK(IgSimpleImageView igSimpleImageView) {
        0qQ.A0B(igSimpleImageView, 0);
        1Av A002 = 1Au.A00(this.A07);
        if (!AnonymousClass7TG.A1a(A002, A002.A1F, 1Av.A8a, 183)) {
            AnonymousClass5Gt A0e = AnonymousClass7TG.A0e(this.A06.requireActivity(), 2131962271);
            A0e.A03(igSimpleImageView);
            A0e.A02();
            A0e.A0A = true;
            igSimpleImageView.postDelayed(new M72(this, KSP.A00(A0e, this, 5)), 500);
        }
    }

    public final void CnO(View view) {
    }

    public final void CnS(String str) {
    }

    public final void CnY(IgSimpleImageView igSimpleImageView, int i) {
    }

    public final void Cu6(AnonymousClass4DH r1) {
    }

    public final void CuH(AnonymousClass4DH r1, User user) {
    }

    public final void Cvj(C48153EZv eZv) {
        C60058JeZ jeZ;
        C48153EZv eZv2 = eZv;
        0qQ.A0B(eZv, 0);
        UserSession userSession = this.A07;
        if (!LTP.A09(userSession)) {
            0Tu r2 = 0Tu.A05;
            if (!182.A06(r2, userSession, 36328435412385117L) && !182.A06(r2, userSession, 36328435412450654L)) {
                A00(eZv, eZv.A0A(LP2.A01(this.A08)));
            }
            C61822KNl kNl = this.A08;
            if (eZv.A08(userSession, kNl.A07().A00)) {
                AnonymousClass3Q2 A012 = LP2.A01(kNl);
                AnonymousClass4DH r4 = this.A06;
                G7M g7m = kNl.A0A;
                if (g7m != null) {
                    eZv2.A03(r4, userSession, A012, g7m, (Boolean) null, new C66218MIz(this, 15));
                    if (!LTP.A09(userSession) && (jeZ = this.A04) != null) {
                        jeZ.A06(LP2.A01(kNl));
                        return;
                    }
                    return;
                }
                0qQ.A0F("authorizeListener");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final void Cwv() {
    }

    public final void Cz1(AnonymousClass4DH r1) {
    }

    public final void D1t(AnonymousClass4DH r1) {
    }

    public final void DBI(NewFundraiserInfo newFundraiserInfo) {
    }

    public final void DEv(AnonymousClass818 r1, AnonymousClass4DH r2) {
    }

    public final void DI9(C63757L5p l5p, String str) {
    }

    public final void DNi(AnonymousClass4DH r1, boolean z, boolean z2) {
    }

    public final void DVS(MUQ muq, UpcomingEvent upcomingEvent) {
        0qQ.A0B(muq, 0);
        UserSession userSession = this.A07;
        if (182.A06(0Tu.A05, userSession, 36322486882871512L)) {
            AnonymousClass36R.A01();
            C62569Khz khz = C62569Khz.EDIT_MEDIA;
            K6D k6d = new K6D();
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putSerializable("prior_surface", khz);
            A0a.putParcelable("initial_upcoming_event", upcomingEvent);
            k6d.A06 = muq;
            C331127Pr A0V = DbV.A0V(A0a, k6d, userSession);
            DbS.A1S(A0V, true);
            A0V.A03 = 0.9f;
            A0V.A1E = true;
            DbU.A1I(this.A06, k6d, A0V.A00());
            return;
        }
        C59888JbD.A01(userSession, new KPW(muq, upcomingEvent, false));
    }

    public final void DVT(MUQ muq, List list) {
        0qQ.A0B(muq, 0);
        C59888JbD.A01(this.A07, new KPU(muq, list));
    }

    public final void Da3() {
    }

    public final void Dby(AnonymousClass4DH r1, boolean z, boolean z2) {
    }

    public final void Ddh() {
    }

    public final void Dp4(AnonymousClass4DH r1, ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel) {
    }

    public final void Dp7(AnonymousClass4DH r1, ShoppingCreationConfig shoppingCreationConfig, MediaSuggestedProductTag mediaSuggestedProductTag, int i) {
    }

    public final void Dp8(boolean z, int i) {
    }

    public final void DqW(View view) {
    }

    public final void DqX(AnonymousClass4DH r1, ShoppingCreationConfig shoppingCreationConfig) {
    }

    public final void Dv2(AnonymousClass4DH r1, boolean z, boolean z2) {
    }

    public final void E14(L13 l13) {
    }

    public final void E3e(NewFundraiserInfo newFundraiserInfo) {
    }

    public final void EuY(C295095nZ r6, String str, String str2, boolean z) {
        K51 A002 = C63224KtV.A00(str2);
        A002.A01 = new C65255Lpz(0, this, r6);
        C331127Pr A0e = DbX.A0e(this.A07, false);
        AnonymousClass4DH r1 = this.A06;
        A0e.A0F = ViewConfiguration.get(r1.requireActivity()).getScaledPagingTouchSlop();
        A0e.A0U = new C65742Lyw(this, r6, str, str2);
        C331157Pu A003 = A0e.A00();
        if (z) {
            AnonymousClass7TF.A0D().postDelayed(new C66031M8q(this, A002, A003), 500);
        } else {
            DbU.A1I(r1, A002, A003);
        }
    }

    public final void Ev2(View view, String str) {
    }

    public final void EvB(GAX gax, C62320sa r5) {
        int i;
        LV3 A002;
        0qQ.A0B(gax, 0);
        C358248ab A0H = Dba.A0H(this.A06);
        A0H.A09(gax.A02);
        A0H.A08(gax.A01);
        Number number = (Number) gax.A05;
        if (number != null) {
            i = number.intValue();
            A002 = LV3.A00(gax, 52);
        } else {
            i = 2131968772;
            A002 = LV3.A00(r5, 53);
        }
        A0H.A0I(A002, i);
        Number number2 = (Number) gax.A03;
        if (number2 != null) {
            A0H.A0H((DialogInterface.OnClickListener) null, number2.intValue());
        }
        DbT.A1V(A0H);
    }

    public final void FKU(ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel) {
    }

    public final void FKr(NewFundraiserInfo newFundraiserInfo) {
    }

    public final void FMK(UpcomingEvent upcomingEvent) {
    }

    private final void A00(C48153EZv eZv, boolean z) {
        if (eZv == C48153EZv.A05) {
            UserSession userSession = this.A07;
            if (C52345GOp.A00.A0K(userSession)) {
                return;
            }
            if (!z) {
                C367188qK r4 = this.A08.A0L;
                AnonymousClass4DH r3 = this.A06;
                LEO A002 = C63435Kwv.A00(r3.requireActivity(), AnonymousClass818.IG_FEED_COMPOSER_SHARE_TO_FACEBOOK_TOGGLE_ENABLE, userSession);
                A002.A00 = r3.requireContext();
                A002.A0A = AnonymousClass6SR.A02();
                A002.A01 = r3;
                r4.A01((C376569Im) null, A002, new C65663Lxe(this, 0));
            } else if (AnonymousClass7TE.A0q(userSession).getInt("fb_feed_crossposting_advanced_settings_tooltip", 0) < 3 && C363558jv.A00(userSession)) {
                KOQ koq = this.A09.A0G;
                MH9.A04(koq, koq.A02, 30);
            }
        }
    }

    public final void A01() {
        LFW lfw;
        if (!LTP.A09(this.A07) && (lfw = this.A00) != null) {
            lfw.A00();
        }
    }

    public final void A02() {
        C60058JeZ jeZ;
        if (!LTP.A09(this.A07) && (jeZ = this.A04) != null) {
            jeZ.A06(LP2.A01(this.A08));
        }
        A01();
    }

    public final void A03() {
        C65229LpZ lpZ;
        IgTextView igTextView;
        if (this.A04 != null) {
            UserSession userSession = this.A07;
            if (!LTP.A09(userSession)) {
                C48153EZv eZv = C48153EZv.A05;
                Iterator it = C63418Kwe.A00(userSession).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    C48153EZv eZv2 = (C48153EZv) it.next();
                    C61822KNl kNl = this.A08;
                    if (eZv2.A08(userSession, kNl.A07().A00)) {
                        z = true;
                    } else {
                        eZv2.A06(LP2.A01(kNl), false);
                    }
                }
                C60058JeZ jeZ = this.A04;
                0qQ.A0A(jeZ);
                jeZ.A07 = this;
                C60058JeZ jeZ2 = this.A04;
                0qQ.A0A(jeZ2);
                jeZ2.A06(LP2.A01(this.A08));
                float f = 0.3f;
                if (z) {
                    f = 1.0f;
                }
                AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
                if (!(AnonymousClass5w9.A01(userSession) || (lpZ = this.A01) == null || (igTextView = lpZ.A07) == null)) {
                    igTextView.setAlpha(f);
                }
            }
        }
        A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A07, 36325596439000136L) != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures CBv() {
        /*
            r6 = this;
            X.KNl r5 = r6.A08
            X.3Q2 r0 = X.LP2.A01(r5)
            boolean r0 = r0.A5T
            r4 = 0
            if (r0 == 0) goto L_0x001b
            com.instagram.common.session.UserSession r3 = r6.A07
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325596439000136(0x810df000003448, double:3.035791687235428E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r3 = 1
            if (r0 == 0) goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            com.instagram.common.session.UserSession r2 = r6.A07
            X.3Q2 r1 = X.LP2.A01(r5)
            r0 = 0
            com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures r0 = X.C319116q4.A00(r2, r0, r1, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65171Loa.CBv():com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures");
    }

    public final boolean CnW() {
        int i;
        C61828KNr kNr = this.A09;
        AnonymousClass3Q2 A042 = kNr.A03.A04();
        LM3 lm3 = new LM3(this.A06.requireContext());
        boolean A1b = AnonymousClass7TE.A1b(00k.A0a(JTO.A0x(C63270KuF.A00(this.A07).A02)));
        boolean z = A042.A5T;
        boolean z2 = A042.A5i;
        boolean z3 = ((C61042Jvg) kNr.A0N.A05.getValue()).A00;
        boolean z4 = false;
        boolean A1V = AnonymousClass7TF.A1V(A042.A2d);
        boolean A1V2 = AnonymousClass7TF.A1V(A042.A1J);
        if (A042.A1F == AnonymousClass3QO.CLOSE_FRIENDS) {
            z4 = true;
        }
        boolean z5 = A042.A67;
        if (A1b) {
            i = 2131961813;
        } else if (z) {
            i = 2131961815;
        } else if (z2) {
            i = 2131961807;
        } else if (z3) {
            i = 2131961806;
        } else if (A1V) {
            i = 2131961810;
        } else if (A1V2) {
            i = 2131961814;
        } else if (z4) {
            i = 2131961809;
        } else if (!z5) {
            return false;
        } else {
            i = 2131961818;
        }
        LM3.A00(lm3, 2131961820, i);
        return true;
    }

    public final void Cns() {
        C60058JeZ jeZ;
        C60058JeZ jeZ2;
        AnonymousClass3Q2 A012 = LP2.A01(this.A08);
        if (!LTP.A09(this.A07) && (jeZ2 = this.A04) != null) {
            jeZ2.A06(A012);
        }
        C65222LpS lpS = this.A02;
        if (!(lpS == null || (jeZ = lpS.A00) == null)) {
            jeZ.A0D = AnonymousClass7TF.A1W(A012.AdG(), AnonymousClass3QO.FAN_CLUB);
        }
        A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0074, code lost:
        if (r4.A04().A67 != false) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cug(X.AnonymousClass4DH r11) {
        /*
            r10 = this;
            com.instagram.common.session.UserSession r1 = r10.A07
            X.AE4 r2 = X.C59847JaN.A00(r1)
            java.lang.String r0 = "ADVANCED_SETTINGS_TAPPED"
            r2.A04(r0)
            X.27r r2 = X.27p.A01(r1)
            X.80P r0 = X.AnonymousClass80P.ADVANCED_SETTINGS
            r2.A1X(r0)
            X.KNr r5 = r10.A09
            X.KO3 r4 = r5.A03
            X.3Q2 r0 = r4.A04()
            java.util.List r8 = r0.A4C
            if (r8 != 0) goto L_0x0024
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
        L_0x0024:
            X.3Q2 r0 = r4.A04()
            X.JxB r0 = r0.A0v
            r7 = 0
            if (r0 == 0) goto L_0x004d
            java.lang.Integer r0 = r0.A00
            if (r0 == 0) goto L_0x004d
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            X.3Q2 r0 = r4.A00
            X.0qQ.A0A(r0)
            X.JxB r0 = r0.A0v
            X.0qQ.A0A(r0)
            java.lang.Integer r0 = r0.A00
            int r0 = X.JTP.A09(r0)
            long r2 = (long) r0
            long r2 = r6.toMillis(r2)
            java.util.Date r7 = new java.util.Date
            r7.<init>(r2)
        L_0x004d:
            r4.A04()
            r4.A04()
            X.3Q2 r0 = r4.A04()
            java.lang.String r6 = r0.A3t
            X.3Q2 r0 = r4.A04()
            r0.A0o()
            X.3Q2 r0 = r4.A04()
            r0.A0p()
            boolean r0 = r5.A0G()
            if (r0 != 0) goto L_0x0076
            X.3Q2 r0 = r4.A04()
            boolean r0 = r0.A67
            r9 = 0
            if (r0 == 0) goto L_0x0077
        L_0x0076:
            r9 = 1
        L_0x0077:
            X.3Q2 r0 = r4.A04()
            com.instagram.api.schemas.BrandedContentGatingInfo r5 = r0.A0s
            X.28D r4 = r10.A05
            X.KPY r3 = new X.KPY
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.C59888JbD.A01(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65171Loa.Cug(X.4DH):void");
    }

    public final void Cuh(C60076JfA jfA) {
        TextView textView = jfA.A0A;
        C65174Lod lod = this.A0C;
        lod.EBQ(textView, QPTooltipAnchor.ADVANCED_SETTINGS_ROW);
        if (this.A09.A03.A04().A12()) {
            lod.EBQ(textView, QPTooltipAnchor.ADVANCED_SETTINGS_VIDEO_ROW);
        }
        UserSession userSession = this.A07;
        1Av A002 = 1Au.A00(userSession);
        0s0 r0 = A002.A33;
        AnonymousClass0YZ[] r6 = 1Av.A8a;
        if (!AnonymousClass7TG.A1a(A002, r0, r6, 154)) {
            0nA.A0t(textView, new MB7(4, textView, this));
        }
        1Av A003 = 1Au.A00(userSession);
        if (!(!AnonymousClass7TG.A1a(A003, A003.A33, r6, 154)) && C319116q4.A00.A09(userSession)) {
            1Av A004 = 1Au.A00(userSession);
            if (!AnonymousClass7TG.A1a(A004, A004.A2w, r6, 153)) {
                Context A0C2 = JTP.A0C(textView, 1);
                JTO.A1Z(A0C2);
                AnonymousClass5Gt A0e = AnonymousClass7TG.A0e((Activity) A0C2, 2131956695);
                A0e.A0F = true;
                A0e.A03(textView);
                A0e.A02();
                A0e.A0A = true;
                A0e.A0B = true;
                textView.getViewTreeObserver().addOnScrollChangedListener(new C50124FPo(0, textView, KSP.A00(A0e, userSession, 7)));
            }
        }
    }

    public final void CwL() {
        UserSession userSession = this.A07;
        27r A012 = 27p.A01(userSession);
        AnonymousClass4DH r4 = this.A06;
        A012.A1n(r4.getModuleName());
        27p.A01(userSession).A1B(C62674Kka.A07, AnonymousClass80P.AUDIENCE_CONTROL);
        K7V k7v = new K7V();
        C331127Pr A0V = DbV.A0V(JTP.A0F(userSession), k7v, userSession);
        A0V.A0T = k7v;
        DbZ.A0z(r4.requireContext(), A0V, 2131953243);
        DbS.A1S(A0V, false);
        C65745Lyz.A00(A0V, this, 7);
        C331157Pu A002 = A0V.A00();
        DbU.A1I(r4, k7v, A002);
        k7v.A03 = A002;
        KHW khw = k7v.A01;
        if (khw != null) {
            khw.A01 = A002;
        }
    }

    public final void Cx3(List list, long j) {
        C61839KOd kOd = this.A09.A0Q;
        1NY A0b = AnonymousClass7TG.A0b(kOd.A00);
        A0b.A0A("upcoming_events/add_event_from_product/");
        A0b.A9m(AnonymousClass000.A00(1874), C51970G9q.A0k(list));
        A0b.A0D("tagged_merchant_id", j);
        1OC A0S = DbU.A0S(A0b, CGC.class, C45693D1s.class);
        C61500KAf.A00(A0S, kOd, 19);
        1ES.A06(A0S, -5, false);
    }

    public final void DHk(String str, ArrayList arrayList, boolean z) {
        C59888JbD.A01(this.A07, new KPI());
    }

    public final void DLU(boolean z) {
        this.A09.A03.A04().A5Z = z;
    }

    public final void DVF(String str) {
        FragmentActivity requireActivity = this.A06.requireActivity();
        UserSession userSession = this.A07;
        C61433K7i k7i = new C61433K7i();
        DbZ.A1B(k7i, AnonymousClass000.A00(461), str);
        C331127Pr A0W = DbS.A0W(userSession);
        DbZ.A0z(requireActivity, A0W, 2131968999);
        A0W.A11 = false;
        A0W.A0T = k7i;
        A0W.A0U = k7i;
        A0W.A0g = requireActivity.getString(2131968996);
        A0W.A1J = false;
        A0W.A0K = new LY3((Object) k7i, 33);
        A0W.A0h = requireActivity.getString(2131968998);
        A0W.A1N = true;
        A0W.A0w = true;
        A0W.A14 = false;
        C331157Pu A002 = A0W.A00();
        k7i.A01 = A002;
        A002.A02(requireActivity, k7i);
    }

    public final void DVH(boolean z) {
        AnonymousClass80P r0;
        Context requireContext = this.A06.requireContext();
        UserSession userSession = this.A07;
        LRh lRh = new LRh(userSession, requireContext);
        27r A002 = 27p.A00(lRh.A01, lRh.A07, (String) null, (String) null, (String) null, (String) null);
        C279294yP r4 = C279294yP.FEED;
        Boolean valueOf = Boolean.valueOf(z);
        29Z r2 = A002.A0F;
        boolean booleanValue = valueOf.booleanValue();
        0Aj A0d = JTR.A0d(r2);
        if (A0d.isSampled()) {
            if (booleanValue) {
                r0 = AnonymousClass80P.ALLOW_TO_ADD_TO_THIS_POST;
            } else {
                r0 = AnonymousClass80P.NOT_ALLOW_TO_ADD_TO_THIS_POST;
            }
            JTO.A1O(r0, A0d);
            JTO.A1T(A0d, "IG_CAMERA_CLIPS_SHARE_SHEET_ENTITY_TAP");
            AnonymousClass283 r22 = r2.A04;
            A0d.AAJ("camera_session_id", JTP.A0p(r22));
            A0d.A8M(r4, "camera_destination");
            AnonymousClass7TE.A1V(A0d, r22);
            AnonymousClass7TH.A0U(A0d);
            C51965G9l.A1A(C59725JVj.SHARE_SHEET, A0d);
            A0d.AAJ("camera_session_id", AnonymousClass7TF.A0b());
            AnonymousClass7TE.A1W(A0d, "event_type", 2);
            AnonymousClass7TH.A0V(A0d);
        }
        ENZ.A04.A02(requireContext, userSession, (C51911G7f) null, false, true);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.KPC, X.JbE] */
    public final void DWK() {
        C59889JbE jbE;
        C358248ab A0U;
        C61828KNr kNr = this.A09;
        KOU kou = kNr.A0I;
        if (kou.A0A().A1J != null) {
            if (!182.A06(0Tu.A06, this.A07, 36313987142453592L)) {
                A0U = DbW.A0U(this.A06);
                A0U.A09(2131952280);
                A0U.A08(2131952279);
                A0U.A0H((DialogInterface.OnClickListener) null, 2131968772);
                DbT.A1V(A0U);
                return;
            }
        }
        if (kNr.A0G()) {
            A0U = DbW.A0U(this.A06);
            A0U.A09(2131956175);
            A0U.A08(2131956174);
            A0U.A06();
            DbT.A1V(A0U);
            return;
        }
        UserSession userSession = this.A07;
        if (LPL.A02(userSession)) {
            LBY lby = LLA.A00;
            boolean z = kou.A0A().A5i;
            0sn r9 = kou.A0A().A4C;
            if (r9 == null) {
                r9 = 0sn.A00;
            }
            jbE = lby.A00(kou.A0A().A0s, kou.A0A().A0t, userSession, (User) null, r9, z, kou.A0A().A51);
        } else {
            boolean z2 = kou.A0A().A51;
            boolean z3 = kou.A0A().A5i;
            0sn r3 = kou.A0A().A4C;
            if (r3 == null) {
                r3 = 0sn.A00;
            }
            BrandedContentProjectMetadata brandedContentProjectMetadata = kou.A0A().A0t;
            BrandedContentGatingInfo brandedContentGatingInfo = kou.A0A().A0s;
            ? jbE2 = new C59889JbE(AnonymousClass000.A00(3720));
            jbE2.A03 = z2;
            jbE2.A04 = z3;
            jbE2.A02 = r3;
            jbE2.A01 = brandedContentProjectMetadata;
            jbE2.A00 = brandedContentGatingInfo;
            jbE = jbE2;
        }
        C59888JbD.A01(userSession, jbE);
        C59847JaN.A00(userSession).A04("PARTNERSHIP_LABEL_AND_ADS_TAPPED");
    }

    public final void Dax(AnonymousClass4DH r5, PublishScreenCategoryType publishScreenCategoryType) {
        C59888JbD.A01(this.A07, new KPV(r5.requireArguments(), publishScreenCategoryType, r5.getModuleName()));
    }

    public final void DvC(UpcomingEvent upcomingEvent) {
        this.A09.A0Q.A0B(upcomingEvent);
    }

    public final void DvD(UpcomingEvent upcomingEvent) {
        this.A09.A0Q.A0A(upcomingEvent);
    }

    public final void DvF() {
        this.A09.A0Q.A0B((UpcomingEvent) null);
        AnonymousClass6SR.A01();
    }

    public final void DvG() {
        27p.A01(this.A07).A1X(AnonymousClass80P.ADD_UPCOMING_EVENT);
    }

    public final void E0Y(boolean z) {
        C48153EZv eZv = ((C60995Jur) this.A09.A0D.A05.getValue()).A01;
        if (eZv != null) {
            UserSession userSession = this.A07;
            0Tu r2 = 0Tu.A05;
            if (!182.A06(r2, userSession, 36328435412385117L) && !182.A06(r2, userSession, 36328435412450654L)) {
                A00(eZv, z);
            }
            C61822KNl kNl = this.A08;
            if (eZv.A08(userSession, kNl.A07().A00)) {
                AnonymousClass3Q2 A012 = LP2.A01(kNl);
                AnonymousClass4DH r4 = this.A06;
                Boolean valueOf = Boolean.valueOf(z);
                G7M g7m = kNl.A0A;
                if (g7m != null) {
                    eZv.A03(r4, userSession, A012, g7m, valueOf, MKY.A00);
                } else {
                    0qQ.A0F("authorizeListener");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        AE4 A002;
        String str;
        C48153EZv eZv;
        if (i == 1000) {
            if (i2 != -1) {
                A002 = C59847JaN.A00(this.A07);
                str = "TAG_PEOPLE_CANCELED";
            } else if (intent != null) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("media_tagging_info_list");
                if (parcelableArrayListExtra != null) {
                    ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta = (ProductCollectionFeedTaggingMeta) intent.getParcelableExtra("tagged_collection_info");
                    C61828KNr kNr = this.A09;
                    C61837KOb kOb = kNr.A08;
                    kOb.A01 = intent.getBooleanExtra("has_seen_OPT_tooltip", false);
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("tagged_seller_ids");
                    if (stringArrayListExtra != null) {
                        kOb.A00 = stringArrayListExtra;
                    }
                    kOb.A0A(parcelableArrayListExtra);
                    kNr.A0A.A0B(productCollectionFeedTaggingMeta, parcelableArrayListExtra, false);
                    A002 = C59847JaN.A00(this.A07);
                    str = "TAG_PEOPLE_SAVED";
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            A002.A04(str);
        } else if (i != 1001) {
            if (i != 1004) {
                if (i == 2002) {
                    this.A0A.A00(intent);
                } else if (i != 5152) {
                    C61822KNl kNl = this.A08;
                    if (kNl.A07().A00 != null) {
                        UserSession userSession = this.A07;
                        AnonymousClass3Q2 A012 = LP2.A01(kNl);
                        CallerContext callerContext = C64367Laj.A00;
                        if (i == 64206) {
                            eZv = C48153EZv.A05;
                        } else {
                            eZv = null;
                        }
                        if (i2 == -1 && eZv != null && eZv != C48153EZv.A05 && !(!eZv.A07(userSession))) {
                            eZv.A06(A012, true);
                        }
                    }
                    A02();
                } else if (i2 != -1) {
                } else {
                    if (intent != null) {
                        UpcomingEvent upcomingEvent = (UpcomingEvent) intent.getParcelableExtra("upcoming_live");
                        C61822KNl kNl2 = this.A08;
                        AnonymousClass3Q2 A013 = LP2.A01(kNl2);
                        UpcomingEventImpl upcomingEventImpl = null;
                        if (upcomingEvent != null) {
                            upcomingEventImpl = upcomingEvent.FGz((1E6) null);
                        }
                        A013.A1p = upcomingEventImpl;
                        this.A09.A0Q.A0B(LP2.A01(kNl2).A1p);
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else if (i2 == -1) {
                C63877LAg lAg = this.A08.A02;
                if (lAg == null) {
                    0qQ.A0F("addMusicRowViewController");
                    throw AnonymousClass00P.createAndThrow();
                } else if (intent != null) {
                    lAg.A07.invoke(new M76(intent, lAg));
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
        } else if (i2 != -1) {
        } else {
            if (intent != null) {
                ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("media_tagging_info_list");
                if (parcelableArrayListExtra2 != null) {
                    ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta2 = (ProductCollectionFeedTaggingMeta) intent.getParcelableExtra("tagged_collection_info");
                    C61828KNr kNr2 = this.A09;
                    C61837KOb kOb2 = kNr2.A08;
                    kOb2.A01 = intent.getBooleanExtra("has_seen_OPT_tooltip", false);
                    ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("tagged_seller_ids");
                    if (stringArrayListExtra2 != null) {
                        kOb2.A00 = stringArrayListExtra2;
                    }
                    kNr2.A0A.A0B(productCollectionFeedTaggingMeta2, parcelableArrayListExtra2, true);
                    kOb2.A0A(parcelableArrayListExtra2);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public C65171Loa(28D r3, AnonymousClass4DH r4, UserSession userSession, C61822KNl kNl, C65174Lod lod, C61828KNr kNr, C60259JiG jiG, L15 l15) {
        C51972G9s.A1B(userSession, kNr);
        AnonymousClass7TF.A1F(lod, 6, r3);
        this.A07 = userSession;
        this.A06 = r4;
        this.A08 = kNl;
        this.A09 = kNr;
        this.A0A = jiG;
        this.A0C = lod;
        this.A0B = l15;
        this.A05 = r3;
    }

    public final void Cnp(boolean z) {
        C60058JeZ jeZ;
        A03();
        if (!LTP.A09(this.A07) && (jeZ = this.A04) != null) {
            jeZ.A0C = this.A09.A0G();
        }
        if (z) {
            CnW();
            Cns();
        }
    }

    public final void DWe() {
        AnonymousClass3QO r15;
        AnonymousClass6SR.A01().A0S = true;
        UserSession userSession = this.A07;
        27p.A01(userSession).A1X(AnonymousClass80P.TAG_PERSON);
        C59847JaN.A00(userSession).A04("TAG_PEOPLE_TAPPED");
        27p.A01(userSession).A0j();
        AnonymousClass4DH r6 = this.A06;
        C61822KNl kNl = this.A08;
        C3499682q A062 = kNl.A06();
        KO3 A072 = kNl.A07();
        AnonymousClass3Q2 r3 = kNl.A07().A00;
        C60102Jfi A042 = kNl.A04();
        0qQ.A0C(A042, "null cannot be cast to non-null type com.instagram.creation.publishscreen.viewmodel.FeedPublishScreenViewModel");
        boolean z = ((C61828KNr) A042).A08.A01;
        boolean z2 = ((C61028JvS) this.A09.A07.A04.getValue()).A04;
        List list = LP2.A00(kNl).A08.A04;
        C60102Jfi A043 = kNl.A04();
        0qQ.A0C(A043, "null cannot be cast to non-null type com.instagram.creation.publishscreen.viewmodel.FeedPublishScreenViewModel");
        ArrayList arrayList = ((C61828KNr) A043).A08.A00;
        LP7 A082 = kNl.A08();
        0qQ.A0B(list, 7);
        C71342cb.A00(userSession).A06(r6.getActivity());
        C64167LRj lRj = new C64167LRj(r6.requireContext(), C62630Kj1.PEOPLE);
        boolean z3 = false;
        lRj.A02 = false;
        AnonymousClass3QO r14 = null;
        if (r3 != null) {
            r15 = r3.A1F;
        } else {
            r15 = null;
        }
        lRj.A0D = AnonymousClass7TF.A1W(r15, AnonymousClass3QO.FAN_CLUB);
        if (r3 != null) {
            r14 = r3.A1F;
        }
        lRj.A0C = AnonymousClass7TF.A1W(r14, AnonymousClass3QO.CLOSE_FRIENDS);
        if (r3 != null && r3.A67) {
            z3 = true;
        }
        lRj.A0G = z3;
        lRj.A0A = z;
        lRj.A03(userSession);
        lRj.A0J = LRu.A03(userSession, A062, r3, A082);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DbY.A1W(A0r, it);
        }
        lRj.A07 = AnonymousClass7TE.A1D(A0r);
        lRj.A08 = AnonymousClass7TE.A1D(arrayList);
        lRj.A0H = true;
        if (A062.COf()) {
            List Co4 = A062.Co4();
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it2 = Co4.iterator();
            while (it2.hasNext()) {
                AnonymousClass3Q2 BbQ = A072.A03.BbQ(JTO.A0Z(it2).BbR());
                if (BbQ != null) {
                    A1C.add(BbQ);
                }
            }
            lRj.A05(A062, A1C);
            lRj.A0E = z2;
        } else if (r3 != null) {
            lRj.A04(A062, r3);
        }
        0kR.A05(r6, lRj.A02(), IgNetworkConsentStorage.MAX_ENTRIES);
    }

    public final void E17(Location location, long j) {
        AnonymousClass6SR.A01().A0O = true;
        UserSession userSession = this.A07;
        C59847JaN.A00(userSession).A04("LOCATION_TAPPED");
        27p.A01(userSession).A1X(AnonymousClass80P.ADD_LOCATION);
        Location location2 = location;
        long j2 = j;
        if (182.A06(0Tu.A05, userSession, 36322486882674903L)) {
            AnonymousClass36R.A01();
            K5H A002 = K5H.A00(location2, "POST", (String) null, j2, true, true);
            C331127Pr A0e = DbX.A0e(userSession, true);
            A0e.A03 = 0.9f;
            A0e.A1E = true;
            AnonymousClass4DH r1 = this.A06;
            A0e.A0d = r1.getString(2131973022);
            0qQ.A0C(A002, AnonymousClass000.A00(7));
            A0e.A0T = A002;
            DbY.A13(r1, A002, A0e);
            return;
        }
        C59888JbD.A01(userSession, new KPT(location, j));
    }
}
