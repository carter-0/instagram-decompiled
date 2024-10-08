package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.api.schemas.VisualSearchSuggestedProductContainer;
import com.instagram.clips.model.metadata.ClipsFanClubMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.publishscreen.fragment.clips.ClipsProfileVisibilityFragment;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;
import com.instagram.modal.ModalActivity;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.shopping.video.ShoppingCreationConfig;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.user.model.Product;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.user.model.User;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.LoZ  reason: case insensitive filesystem */
public final class C65170LoZ implements C66576MXh {
    public final UserSession A00;
    public final C60259JiG A01;
    public final C61829KNs A02;
    public final FragmentActivity A03;
    public final C60132JgD A04;
    public final AnonymousClass0iw A05;
    public final L4G A06;
    public final LMT A07;
    public final C17990VjS A08;

    public C65170LoZ(FragmentActivity fragmentActivity, C60132JgD jgD, AnonymousClass0iw r4, UserSession userSession, L4G l4g, C60259JiG jiG, LMT lmt, C61829KNs kNs, C17990VjS vjS) {
        C51974G9v.A0d(2, userSession, jgD, jiG, lmt);
        AnonymousClass7TF.A1G(l4g, 7, r4);
        this.A03 = fragmentActivity;
        this.A00 = userSession;
        this.A02 = kNs;
        this.A04 = jgD;
        this.A01 = jiG;
        this.A07 = lmt;
        this.A06 = l4g;
        this.A08 = vjS;
        this.A05 = r4;
    }

    public final void CnK(IgSimpleImageView igSimpleImageView) {
        0qQ.A0B(igSimpleImageView, 0);
        LMT lmt = this.A07;
        if (!lmt.A00) {
            UserSession userSession = lmt.A01;
            1Av A002 = 1Au.A00(userSession);
            0s0 r0 = A002.A7g;
            AnonymousClass0YZ[] r4 = 1Av.A8a;
            if (!AnonymousClass7TG.A1a(A002, r0, r4, 182)) {
                1Av A003 = 1Au.A00(userSession);
                AnonymousClass7TF.A1J(A003, A003.A7g, r4, 182, true);
                lmt.A00 = true;
                LMT.A00(igSimpleImageView, lmt, (C234222xL) null, C226262fy.ABOVE_ANCHOR, AnonymousClass7TF.A0d(igSimpleImageView.getResources(), 2131955225));
            }
        }
    }

    public final void CnO(View view) {
        0qQ.A0B(view, 0);
        if (this.A02.A0U.A07) {
            LMT lmt = this.A07;
            if (!lmt.A00) {
                lmt.A00 = true;
                LMT.A00(view, lmt, (C234222xL) null, C226262fy.ABOVE_ANCHOR, AnonymousClass7TF.A0d(view.getResources(), 2131955315));
            }
        }
    }

    public final boolean CnW() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CnY(com.instagram.common.ui.base.IgSimpleImageView r9, int r10) {
        /*
            r8 = this;
            r0 = 0
            X.0qQ.A0B(r9, r0)
            X.LMT r5 = r8.A07
            X.KNs r0 = r8.A02
            X.KOS r0 = r0.A0U
            boolean r2 = r0.A05
            boolean r1 = r0.A06
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0047
            if (r2 == 0) goto L_0x0047
            r4 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0048
            com.instagram.common.session.UserSession r7 = r5.A01
            X.1Av r1 = X.1Au.A00(r7)
            X.0s0 r0 = r1.A2h
            X.0YZ[] r6 = X.1Av.A8a
            r2 = 427(0x1ab, float:5.98E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r1, r0, r6, r2)
            if (r0 != 0) goto L_0x0048
            X.1Av r1 = X.1Au.A00(r7)
            X.0s0 r0 = r1.A2h
            X.AnonymousClass7TF.A1J(r1, r0, r6, r2, r3)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131964509(0x7f13325d, float:1.9565802E38)
            java.lang.String r1 = X.JTS.A0i(r1, r10, r0)
        L_0x003e:
            if (r1 == 0) goto L_0x0047
            r5.A00 = r3
            X.2fy r0 = X.C226262fy.ABOVE_ANCHOR
            X.LMT.A00(r9, r5, r4, r0, r1)
        L_0x0047:
            return
        L_0x0048:
            com.instagram.common.session.UserSession r7 = r5.A01
            X.1Av r1 = X.1Au.A00(r7)
            X.0s0 r0 = r1.A2d
            X.0YZ[] r6 = X.1Av.A8a
            r2 = 425(0x1a9, float:5.96E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r1, r0, r6, r2)
            if (r0 != 0) goto L_0x006f
            X.1Av r1 = X.1Au.A00(r7)
            X.0s0 r0 = r1.A2d
            X.AnonymousClass7TF.A1J(r1, r0, r6, r2, r3)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131964508(0x7f13325c, float:1.95658E38)
        L_0x006a:
            java.lang.String r1 = r1.getString(r0)
            goto L_0x003e
        L_0x006f:
            if (r10 != 0) goto L_0x0047
            X.1Av r1 = X.1Au.A00(r7)
            X.0s0 r0 = r1.A2g
            r2 = 426(0x1aa, float:5.97E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r1, r0, r6, r2)
            if (r0 != 0) goto L_0x0047
            X.1Av r1 = X.1Au.A00(r7)
            X.0s0 r0 = r1.A2g
            X.AnonymousClass7TF.A1J(r1, r0, r6, r2, r3)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131969758(0x7f1346de, float:1.9576448E38)
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65170LoZ.CnY(com.instagram.common.ui.base.IgSimpleImageView, int):void");
    }

    public final void Cnp(boolean z) {
    }

    public final void Cns() {
    }

    public final void Cu6(AnonymousClass4DH r5) {
        AnonymousClass3QO r1;
        AnonymousClass3Q2 r0 = this.A02.A02;
        if (r0 != null) {
            r1 = r0.A1F;
        } else {
            r1 = null;
        }
        if (r1 == AnonymousClass3QO.CLOSE_FRIENDS || r1 == AnonymousClass3QO.OPAL) {
            A00(r5, r1);
            return;
        }
        LTV.A0B(this.A03, this.A00, "REELS", false);
    }

    public final void Cuh(C60076JfA jfA) {
        LMT lmt = this.A07;
        IgSimpleImageView igSimpleImageView = jfA.A0B;
        0qQ.A0B(igSimpleImageView, 0);
        if (!lmt.A00) {
            UserSession userSession = lmt.A01;
            if (C319116q4.A08(userSession, true)) {
                1Av A002 = 1Au.A00(userSession);
                0s0 r0 = A002.A2w;
                AnonymousClass0YZ[] r3 = 1Av.A8a;
                if (!AnonymousClass7TG.A1a(A002, r0, r3, 153)) {
                    1Av A003 = 1Au.A00(userSession);
                    AnonymousClass7TF.A1J(A003, A003.A2w, r3, 153, true);
                    lmt.A00 = true;
                    LMT.A00(igSimpleImageView, lmt, (C234222xL) null, C226262fy.ABOVE_ANCHOR, AnonymousClass7TF.A0d(igSimpleImageView.getResources(), 2131956695));
                }
            }
        }
        UserSession userSession2 = this.A00;
        27p.A01(userSession2).A15(C279294yP.CLIPS, AnonymousClass80P.ADVANCED_SETTINGS);
        1Z0 A004 = AnonymousClass2BF.A00();
        C64824Lik lik = (C64824Lik) userSession2.A01(C64824Lik.class, new C73670Phj((String) null, userSession2, 41));
        if (A004.A03().A02(userSession2)) {
            UserSession userSession3 = lik.A00;
            MHA.A03(new LCv(userSession3, 1vm.A01(userSession3), lik.A01), DbY.A0r(AnonymousClass12T.A00, 909209444), 46);
        }
    }

    public final void Cx3(List list, long j) {
    }

    public final void Cz1(AnonymousClass4DH r15) {
        C61829KNs kNs = this.A02;
        AnonymousClass3Q2 r2 = kNs.A02;
        if (r2 == null) {
            return;
        }
        if (kNs.A0O.A02 != null) {
            C358248ab A0U = DbW.A0U(r15);
            A0U.A09(2131963713);
            int i = 2131963711;
            if (AnonymousClass2o3.A00(this.A00).A05(UserMonetizationProductType.INCENTIVE_PLATFORM)) {
                i = 2131963712;
            }
            A0U.A08(i);
            Dba.A1L(A0U);
            return;
        }
        FragmentActivity fragmentActivity = this.A03;
        UserSession userSession = this.A00;
        C309516Yo A0M = DbS.A0M(fragmentActivity, userSession);
        0sn r8 = r2.A4C;
        if (r8 == null) {
            r8 = 0sn.A00;
        }
        BrandedContentProjectMetadata brandedContentProjectMetadata = r2.A0t;
        A0M.A0D(LLA.A00(r2.A0s, brandedContentProjectMetadata, userSession, r2.A3t, "reel", r8, false, false, false, false, r2.A5i));
        A0M.A04();
        JVF.A02(this.A05, userSession, AnonymousClass05K.A0H, AnonymousClass05K.A1F, LPL.A00(userSession));
    }

    public final void DEv(AnonymousClass818 r4, AnonymousClass4DH r5) {
        0qQ.A0B(r4, 1);
        C49912FEk.A00(r4, r5, this.A00, (Integer) null, "com.bloks.www.ig.reel.xpost.migration_v_three_upsell_launcher");
    }

    public final void DHk(String str, ArrayList arrayList, boolean z) {
        Bundle A0B = DbV.A0B(arrayList, 0);
        A0B.putBoolean("enableGeoGating", z);
        A0B.putStringArrayList("selectedRegions", arrayList);
        A0B.putString("settingType", str);
        1WM.getInstance();
        T8B t8b = new T8B(this.A00, "IgMediaGeoGatingSettingsApp");
        FragmentActivity fragmentActivity = this.A03;
        t8b.A07 = fragmentActivity.getString(2131973426);
        t8b.A00(A0B);
        t8b.F08(fragmentActivity).A04();
    }

    public final void DLU(boolean z) {
    }

    public final void DVF(String str) {
    }

    public final void DVH(boolean z) {
    }

    public final void DVS(MUQ muq, UpcomingEvent upcomingEvent) {
        0qQ.A0B(muq, 0);
        L4G l4g = this.A06;
        AnonymousClass36R.A01();
        C62569Khz khz = C62569Khz.CLIPS_SHARE;
        K6D k6d = new K6D();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putSerializable("prior_surface", khz);
        A0a.putParcelable("initial_upcoming_event", upcomingEvent);
        k6d.A06 = muq;
        k6d.setArguments(A0a);
        DbY.A14(k6d, l4g.A00, l4g.A01);
    }

    public final void DVT(MUQ muq, List list) {
        0qQ.A0B(muq, 0);
        L4G l4g = this.A06;
        AnonymousClass36R.A01();
        C62569Khz khz = C62569Khz.CLIPS_SHARE;
        K4S k4s = new K4S();
        k4s.A01 = muq;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putSerializable("prior_surface", khz);
        A0a.putStringArrayList("upcoming_event_ids", AnonymousClass7TE.A1D(list));
        k4s.setArguments(A0a);
        DbY.A14(k4s, l4g.A00, l4g.A01);
    }

    public final void DvG() {
    }

    public final void E0Y(boolean z) {
    }

    public final void E14(L13 l13) {
        0qQ.A0B(l13, 0);
        27p.A01(this.A00).A1X(AnonymousClass80P.LINK_TO_HIGHLIGHT);
        L4G l4g = this.A06;
        UserSession userSession = l4g.A01;
        L4H A002 = C63209KtG.A00(userSession);
        A002.A01.flowMarkPoint(A002.A00, "LINK_HIGHLIGHTS_LIST_ENTERED");
        AnonymousClass36R.A01();
        K7W k7w = new K7W();
        Bundle A09 = DbY.A09(userSession);
        A09.putBoolean("uses_creation_state_machine", false);
        k7w.A00 = l13;
        k7w.setArguments(A09);
        DbY.A14(k7w, l4g.A00, userSession);
    }

    public final void EuY(C295095nZ r1, String str, String str2, boolean z) {
    }

    public final void Ev2(View view, String str) {
        boolean A1U = AnonymousClass7TF.A1U(0, view, str);
        LMT lmt = this.A07;
        UserSession userSession = lmt.A01;
        2D6 A002 = 2D5.A00(userSession);
        if (C367288qV.A01.A0F(userSession)) {
            0xa r1 = A002.A04;
            if (r1.getBoolean("PREFERENCE_Always_Show_Panavision_CCP_Nux", false) || !r1.getBoolean("PREFERENCE_HAS_SEEN_SHARE_TO_FACEBOOK_TOOLTIP_ON_PANAVISION_M15", false)) {
                if (C367998ru.A03(AnonymousClass818.IG_REELS_COMPOSER, AnonymousClass819.TOOLTIP_SHARE_SHEET_CCP_REELS, userSession)) {
                    lmt.A00 = A1U;
                    view.postDelayed(new M9V(view, lmt, A002, str), 400);
                }
            }
        }
    }

    public final void EvB(GAX gax, C62320sa r5) {
        int i;
        LV3 A002;
        0qQ.A0B(gax, 0);
        C358248ab A0X = DbS.A0X(this.A03);
        A0X.A09(gax.A02);
        A0X.A08(gax.A01);
        Number number = (Number) gax.A05;
        if (number != null) {
            i = number.intValue();
            A002 = LV3.A00(gax, 58);
        } else {
            i = 2131968772;
            A002 = LV3.A00(r5, 59);
        }
        A0X.A0I(A002, i);
        Number number2 = (Number) gax.A03;
        if (number2 != null) {
            A0X.A0H((DialogInterface.OnClickListener) null, number2.intValue());
        }
        DbT.A1V(A0X);
    }

    private final void A00(AnonymousClass4DH r3, AnonymousClass3QO r4) {
        C358248ab A0U;
        int i;
        if (r4 == AnonymousClass3QO.CLOSE_FRIENDS) {
            A0U = DbW.A0U(r3);
            A0U.A09(2131953241);
            i = 2131953240;
        } else if (r4 == AnonymousClass3QO.OPAL && C318996ps.A01() && C318996ps.A00().A05(this.A00)) {
            A0U = DbW.A0U(r3);
            C51967G9n.A0v();
            A0U.A09(2131968866);
            C51967G9n.A0v();
            i = 2131968865;
        } else {
            return;
        }
        A0U.A08(i);
        Dba.A1L(A0U);
    }

    private final void A01(AnonymousClass4DH r19, ShoppingCreationConfig shoppingCreationConfig) {
        String str;
        String str2;
        ArrayList A0r;
        User user;
        String A002;
        BrandedContentTag A082;
        BrandedContentTag A083;
        long size;
        C61829KNs kNs = this.A02;
        AnonymousClass3Q2 r10 = kNs.A02;
        if (r10 != null) {
            UserSession userSession = this.A00;
            String str3 = kNs.A0k;
            C61062Jw0 jw0 = r10.A0q;
            AnonymousClass0iw r8 = this.A05;
            if (C367088qA.A03(userSession)) {
                if (jw0 == null) {
                    size = 0;
                } else {
                    size = (long) LTX.A04(jw0).size();
                }
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r8, userSession), "ig_suggested_tags_open_tagging");
                String str4 = userSession.A06;
                LTQ.A06(A0e, str4, str3);
                A0e.AAJ(AnonymousClass9PN.A01(), str3);
                A0e.A9F("ig_user_id", AnonymousClass7TE.A10(str4));
                A0e.AAJ("user_tag_type", "seller");
                JTQ.A17(A0e, false);
                A0e.A9F("high_confidence_suggestions_count", Long.valueOf(size));
                Long A0m = C51971G9r.A0m();
                A0e.A9F("medium_confidence_suggestions_count", A0m);
                A0e.A9F("low_confidence_suggestions_count", A0m);
                A0e.AAK((0bb) null, "suggested_tags_info");
                A0e.AAJ("media_format", "reels");
                A0e.Cgf();
            }
            ArrayList arrayList = null;
            if (r10.A08() == null || (A083 = r10.A08()) == null) {
                str = null;
            } else {
                str = A083.A01;
            }
            if (r10.A08() == null || (A082 = r10.A08()) == null) {
                str2 = null;
            } else {
                str2 = A082.A02;
            }
            C17053VGb.A00(userSession).A05(str3, r8.getModuleName(), DbT.A0j(userSession).A1x(), "reels");
            TaggingFeedMultiSelectState taggingFeedMultiSelectState = kNs.A0V.A02;
            if (182.A06(0Tu.A05, userSession, 36319879837523650L)) {
                L4G l4g = this.A06;
                String str5 = r10.A35;
                0qQ.A0B(str5, 0);
                UserSession userSession2 = l4g.A01;
                K55 k55 = new K55();
                Bundle A0F = JTP.A0F(userSession2);
                A0F.putString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_PENDING_MEDIA_KEY", str5);
                A0F.putString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_WATERFALL_ID", str3);
                A0F.putString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_BRANDED_CONTENT_TAG_USER_ID", str);
                A0F.putString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_BRANDED_CONTENT_TAG_USERNAME", str2);
                A0F.putParcelable("ClipsConstants.ARG_CLIPS_SHARE_SHEET_SHOPPING_CREATION_CONFIG", shoppingCreationConfig);
                k55.setArguments(A0F);
                C309516Yo A0M = DbS.A0M(l4g.A00, userSession2);
                A0M.A0B((Bundle) null, k55);
                A0M.A04();
                return;
            }
            Long A0j = DbS.A0j(JTO.A09(r10.A1N));
            if (C63447KxC.A00(userSession)) {
                A0r = null;
            } else {
                List A09 = LTX.A09(r10.A43);
                A0r = AnonymousClass7TG.A0r(A09);
                Iterator it = A09.iterator();
                while (it.hasNext()) {
                    A0r.add(JTU.A0Q(it).A0H);
                }
            }
            if (C63447KxC.A00(userSession)) {
                List A072 = LTX.A07(r10.A43);
                arrayList = AnonymousClass7TE.A1C();
                Iterator it2 = A072.iterator();
                while (it2.hasNext()) {
                    Product A0Q = JTU.A0Q(it2);
                    if (!(A0Q == null || (user = A0Q.A0B) == null || (A002 = AnonymousClass3ZA.A00(user)) == null)) {
                        String str6 = A0Q.A0H;
                        0qQ.A0B(str6, 0);
                        arrayList.add(new VisualSearchSuggestedProductContainer(JTR.A0M(A002), DbY.A04(00y.A0n(10, str6))));
                    }
                }
            }
            C63503KyE.A00(r19, userSession, r10, taggingFeedMultiSelectState, A0j, str3, str, (String) null, A0r, arrayList);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
        if (r1.length() <= 0) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
        if (X.182.A06(X.0Tu.A05, r6, 36324977963774497L) == false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (X.JTR.A1Y(r6) != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cb, code lost:
        if (X.C61075JwD.A0M(r3) == X.AnonymousClass3QO.DEFAULT) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f8, code lost:
        if (r1.A01 != true) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0118, code lost:
        if (r3.A06().A09 == com.instagram.api.schemas.MediaGenAIDetectionMethod.MANUAL_OVERRIDE_LABEL_OFF) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x012e, code lost:
        if (r1.A5O != true) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x013f, code lost:
        if (r3.A06().A0K != null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r1.A5t != true) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures CBv() {
        /*
            r23 = this;
            r2 = r23
            X.KNs r1 = r2.A02
            X.KOn r0 = r1.A0i
            X.Drk r0 = X.LSR.A04(r0)
            X.KOm r3 = r1.A0Y
            com.instagram.common.session.UserSession r6 = r2.A00
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0019
            boolean r0 = X.JTR.A1Y(r6)
            r7 = 1
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r7 = 0
        L_0x001a:
            X.JwD r0 = r3.A06()
            X.JVf r5 = r0.A03
            X.3Q2 r1 = r3.A00
            r0 = 1
            if (r1 == 0) goto L_0x002a
            boolean r1 = r1.A5t
            r8 = 1
            if (r1 == r0) goto L_0x002b
        L_0x002a:
            r8 = 0
        L_0x002b:
            X.JwD r1 = r3.A06()
            X.JwH r1 = r1.A06
            if (r1 == 0) goto L_0x0037
            java.lang.String r1 = r1.A02
            if (r1 != 0) goto L_0x004f
        L_0x0037:
            X.JwD r1 = r3.A06()
            X.JwH r1 = r1.A06
            if (r1 == 0) goto L_0x0043
            java.lang.Object r1 = r1.A00
            if (r1 != 0) goto L_0x004f
        L_0x0043:
            X.JwD r1 = r3.A06()
            X.JwH r1 = r1.A06
            if (r1 == 0) goto L_0x0146
            java.lang.Object r1 = r1.A01
            if (r1 == 0) goto L_0x0146
        L_0x004f:
            r9 = 1
        L_0x0050:
            X.JwD r1 = r3.A06()
            X.Jw0 r1 = r1.A07
            if (r1 == 0) goto L_0x0143
            boolean r1 = r1.A01()
        L_0x005c:
            r10 = r1 ^ 1
            X.JwD r1 = r3.A06()
            com.instagram.user.model.UpcomingEvent r1 = r1.A0I
            boolean r11 = X.AnonymousClass7TF.A1V(r1)
            X.JwD r1 = r3.A06()
            java.lang.String r1 = r1.A0M
            if (r1 == 0) goto L_0x0077
            int r1 = r1.length()
            r12 = 1
            if (r1 > 0) goto L_0x0078
        L_0x0077:
            r12 = 0
        L_0x0078:
            X.JwD r1 = r3.A06()
            java.util.List r1 = r1.A0V
            if (r1 == 0) goto L_0x009a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x009a
            boolean r1 = X.C271174i4.A04(r6, r0)
            if (r1 != 0) goto L_0x009a
            X.0Tu r4 = X.0Tu.A05
            r1 = 36324977963774497(0x810d6000013221, double:3.035400561012334E-306)
            boolean r1 = X.182.A06(r4, r6, r1)
            r13 = 1
            if (r1 != 0) goto L_0x009b
        L_0x009a:
            r13 = 0
        L_0x009b:
            if (r5 == 0) goto L_0x0138
            java.lang.Object r2 = r5.A01
            X.L7w r2 = (X.C63815L7w) r2
            if (r2 == 0) goto L_0x0138
            java.util.List r1 = r2.A02
            boolean r1 = X.AnonymousClass7TE.A1b(r1)
            if (r1 == r0) goto L_0x00bd
            com.instagram.api.schemas.BrandedContentProjectMetadata r1 = r2.A01
            if (r1 != 0) goto L_0x00bd
            java.util.List r1 = r2.A02
            java.lang.Object r1 = X.00k.A0J(r1)
            com.instagram.pendingmedia.model.BrandedContentTag r1 = (com.instagram.pendingmedia.model.BrandedContentTag) r1
            if (r1 == 0) goto L_0x0138
            boolean r1 = r1.A04
            if (r1 != r0) goto L_0x0138
        L_0x00bd:
            r14 = 1
        L_0x00be:
            X.3QO r1 = X.C61075JwD.A0M(r3)
            if (r1 == 0) goto L_0x00cd
            X.3QO r2 = X.C61075JwD.A0M(r3)
            X.3QO r1 = X.AnonymousClass3QO.DEFAULT
            r15 = 1
            if (r2 != r1) goto L_0x00ce
        L_0x00cd:
            r15 = 0
        L_0x00ce:
            X.3QO r2 = X.C61075JwD.A0M(r3)
            X.3QO r1 = X.AnonymousClass3QO.CLOSE_FRIENDS
            boolean r16 = X.AnonymousClass7TF.A1W(r2, r1)
            X.3QO r2 = X.C61075JwD.A0M(r3)
            X.3QO r1 = X.AnonymousClass3QO.FAN_CLUB
            boolean r17 = X.AnonymousClass7TF.A1W(r2, r1)
            X.JwD r1 = r3.A06()
            X.JwI r1 = r1.A01
            boolean r18 = X.AnonymousClass7TF.A1V(r1)
            X.JwD r1 = r3.A06()
            X.Jw4 r1 = r1.A02
            if (r1 == 0) goto L_0x00fa
            boolean r1 = r1.A01
            r19 = 1
            if (r1 == r0) goto L_0x00fc
        L_0x00fa:
            r19 = 0
        L_0x00fc:
            X.JwD r1 = r3.A06()
            com.instagram.api.schemas.MediaGenAIDetectionMethod r1 = r1.A09
            if (r1 == 0) goto L_0x011a
            X.JwD r1 = r3.A06()
            com.instagram.api.schemas.MediaGenAIDetectionMethod r2 = r1.A09
            com.instagram.api.schemas.MediaGenAIDetectionMethod r1 = com.instagram.api.schemas.MediaGenAIDetectionMethod.A0B
            if (r2 == r1) goto L_0x011a
            X.JwD r1 = r3.A06()
            com.instagram.api.schemas.MediaGenAIDetectionMethod r2 = r1.A09
            com.instagram.api.schemas.MediaGenAIDetectionMethod r1 = com.instagram.api.schemas.MediaGenAIDetectionMethod.MANUAL_OVERRIDE_LABEL_OFF
            r20 = 1
            if (r2 != r1) goto L_0x011c
        L_0x011a:
            r20 = 0
        L_0x011c:
            X.JwD r1 = r3.A06()
            X.4jy r1 = r1.A0H
            boolean r21 = X.AnonymousClass7TF.A1V(r1)
            X.3Q2 r1 = r3.A00
            if (r1 == 0) goto L_0x0130
            boolean r1 = r1.A5O
            r22 = 1
            if (r1 == r0) goto L_0x0132
        L_0x0130:
            r22 = 0
        L_0x0132:
            com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures r6 = new com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r6
        L_0x0138:
            X.JwD r1 = r3.A06()
            java.lang.String r1 = r1.A0K
            r14 = 0
            if (r1 == 0) goto L_0x00be
            goto L_0x00bd
        L_0x0143:
            r1 = 1
            goto L_0x005c
        L_0x0146:
            r9 = 0
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65170LoZ.CBv():com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures");
    }

    public final void CkT(String str) {
        UserSession userSession = this.A00;
        27p.A01(userSession).A1X(AnonymousClass80P.DEAL_SELECTOR);
        AnonymousClass0iw r4 = this.A05;
        C59793JYm A022 = C64191LSy.A02(this.A02.A02);
        0qQ.A0B(A022, 2);
        29Z r1 = 27p.A01(userSession).A0F;
        0Aj A0d = JTR.A0d(r1);
        if (A0d.isSampled()) {
            JTO.A1O(AnonymousClass80P.FUNDED_CONTENT, A0d);
            JTO.A1S(A0d, JTS.A0j(A0d, r1, "IG_CAMERA_CLIPS_FUNDED_CONTENT_SELECTION"));
            JTS.A15(28D.A0h, A0d, 2);
            JTP.A1F(A0d);
            JTO.A1P(28t.A06, A0d);
            A0d.A8M(A022, "media_source");
            A0d.A8M(C360948fP.CLIPS, "capture_type");
            DbW.A15(A0d, r4);
            A0d.AAJ("dialog_selection", str);
            AnonymousClass7TH.A0V(A0d);
        }
    }

    public final void CnS(String str) {
        C63815L7w l7w;
        C59721JVf jVf;
        C63815L7w l7w2;
        KOZ koz = this.A02.A0O;
        C59721JVf jVf2 = koz.A06().A03;
        GAX gax = null;
        if (!(jVf2 == null || (l7w = (C63815L7w) jVf2.A01) == null || l7w.A02.isEmpty() || (jVf = koz.A06().A03) == null || (l7w2 = (C63815L7w) jVf.A01) == null || l7w2.A01 == null)) {
            gax = new GAX(2131963723, 2131963724);
        }
        if (gax != null) {
            EvB(gax, (C62320sa) null);
            return;
        }
        CkT((String) null);
        L4G l4g = this.A06;
        AnonymousClass36R.A01();
        UserSession userSession = l4g.A01;
        Bundle A09 = DbY.A09(userSession);
        A09.putString("ClipsConstants.ARG_CLIPS_FUNDED_CONTENT_DEAL_ID", str);
        A09.putBoolean("ClipsConstants.ARG_CLIPS_SHOULD_SHOW_BONUSES_DEAL", false);
        FragmentActivity fragmentActivity = l4g.A00;
        DbS.A0b(fragmentActivity, A09, userSession, ModalActivity.class, C273654mx.A00(925)).A0A(fragmentActivity, 97);
    }

    public final void CuH(AnonymousClass4DH r18, User user) {
        AnonymousClass3QO r1;
        AnonymousClass3Q2 r0 = this.A02.A02;
        if (r0 != null) {
            r1 = r0.A1F;
        } else {
            r1 = null;
        }
        if (r1 == AnonymousClass3QO.CLOSE_FRIENDS || r1 == AnonymousClass3QO.OPAL) {
            A00(r18, r1);
            return;
        }
        User user2 = user;
        String id = user2.getId();
        String Amu = user2.A03.Amu();
        UserSession userSession = this.A00;
        0Tu r3 = 0Tu.A06;
        String A042 = 182.A04(r3, userSession, 36881077444346224L);
        int A043 = DbS.A04(r3, userSession, 36599602467573339L);
        FKr(new NewFundraiserInfo(id, A042, user2.B8Q(), "", (String) null, Amu, (String) null, "ONBOARDED", AnonymousClass7TE.A1C(), A043, 182.A06(r3, userSession, 36318127490996097L)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        if (X.182.A06(X.0Tu.A06, r5.A01, 36319106743540638L) == false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cug(X.AnonymousClass4DH r19) {
        /*
            r18 = this;
            r16 = 0
            r4 = r18
            X.KNs r3 = r4.A02
            X.3Q2 r2 = r3.A02
            if (r2 == 0) goto L_0x009f
            X.5kq r0 = X.C61829KNs.A01(r3)
            if (r0 == 0) goto L_0x009f
            X.JYm r1 = X.C64191LSy.A02(r2)
            X.JYm r0 = X.C59793JYm.CAPTURE
            boolean r1 = X.AnonymousClass7TF.A1W(r1, r0)
            X.Jw0 r0 = r2.A0q
            r12 = 0
            if (r0 == 0) goto L_0x00a0
            java.lang.String r11 = r0.A02
        L_0x0021:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            boolean r14 = r2.A5i
            java.util.List r13 = r2.A4C
            if (r13 != 0) goto L_0x002f
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
        L_0x002f:
            com.instagram.api.schemas.BrandedContentProjectMetadata r9 = r2.A0t
            com.instagram.api.schemas.BrandedContentGatingInfo r8 = r2.A0s
            com.instagram.common.session.UserSession r2 = r4.A00
            android.content.Context r1 = r19.requireContext()
            com.instagram.monetization.repository.MonetizationRepository r0 = X.AnonymousClass2o3.A00(r2)
            X.LFB r5 = new X.LFB
            r5.<init>(r1, r2, r0)
            com.instagram.monetization.repository.MonetizationRepository r1 = r5.A02
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.IGTV_REVSHARE
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x005c
            com.instagram.common.session.UserSession r6 = r5.A01
            X.0Tu r5 = X.0Tu.A06
            r0 = 36319106743540638(0x81080900021b9e, double:3.0316875776949354E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            r15 = 1
            if (r0 != 0) goto L_0x005d
        L_0x005c:
            r15 = 0
        L_0x005d:
            boolean r0 = r3.A0l
            com.instagram.creation.sharesheet.advancedsettings.config.ClipsAdvancedSettingsConfig r7 = new com.instagram.creation.sharesheet.advancedsettings.config.ClipsAdvancedSettingsConfig
            r17 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.L4H r0 = X.C63209KtG.A00(r2)
            X.1QP r6 = r0.A01
            long r0 = r0.A00
            java.lang.String r5 = "ADVANCED_SETTINGS_ENTERED"
            r6.flowMarkPoint(r0, r5)
            X.27r r5 = X.27p.A01(r2)
            X.80P r1 = X.AnonymousClass80P.ADVANCED_SETTINGS
            X.Kka r0 = X.C62674Kka.A05
            r5.A1B(r0, r1)
            android.os.Bundle r5 = r19.requireArguments()
            java.lang.String r1 = r3.A0k
            java.lang.String r0 = "ClipsConstants.ARG_CLIPS_ADVANCED_SETTINGS"
            r5.putParcelable(r0, r7)
            java.lang.String r0 = "ClipsConstants.ARGS_WATERFALL_ID"
            r5.putString(r0, r1)
            X.K53 r1 = new X.K53
            r1.<init>()
            r1.setArguments(r5)
            androidx.fragment.app.FragmentActivity r0 = r4.A03
            X.6Yo r0 = X.DbS.A0M(r0, r2)
            X.Dba.A0w(r12, r1, r0)
        L_0x009f:
            return
        L_0x00a0:
            r11 = r12
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65170LoZ.Cug(X.4DH):void");
    }

    public final void CwL() {
        UserSession userSession = this.A00;
        27p.A01(userSession).A1n(this.A05.getModuleName());
        27p.A01(userSession).A1B(C62674Kka.A07, AnonymousClass80P.AUDIENCE_CONTROL);
        if (this.A02.A02 != null) {
            K7V k7v = new K7V();
            C331127Pr A0V = DbV.A0V(JTP.A0F(userSession), k7v, userSession);
            A0V.A0T = k7v;
            FragmentActivity fragmentActivity = this.A03;
            DbZ.A0z(fragmentActivity, A0V, 2131955221);
            DbS.A1S(A0V, false);
            C65745Lyz.A00(A0V, this, 8);
            C331157Pu A002 = A0V.A00();
            A002.A02(fragmentActivity, k7v);
            k7v.A03 = A002;
            KHW khw = k7v.A01;
            if (khw != null) {
                khw.A01 = A002;
            }
        }
    }

    public final void Cwv() {
        C293505kq A012 = C61829KNs.A01(this.A02);
        if (A012 != null) {
            C309516Yo A0Q = DbU.A0Q(this.A03, this.A00);
            String str = A012.A0T;
            C61066Jw4 jw4 = A012.A03;
            Bundle A0B = DbV.A0B(str, 0);
            A0B.putString(AnonymousClass000.A00(2810), str);
            if (jw4 != null) {
                A0B.putBoolean(AnonymousClass000.A00(2802), jw4.A01);
                A0B.putBoolean(AnonymousClass000.A00(2801), jw4.A02);
                A0B.putInt(AnonymousClass000.A00(2809), DbS.A05(jw4.A00));
            }
            DbW.A0x(A0B, new C54133H0c(), A0Q);
        }
    }

    public final void D1t(AnonymousClass4DH r4) {
        C293505kq A012 = C61829KNs.A01(this.A02);
        if (A012 != null) {
            27p.A01(this.A00).A1Y(AnonymousClass80P.ADD_FUNDRAISER);
            if (A012.A0R != null) {
                FKr((NewFundraiserInfo) null);
                FKU((ExistingStandaloneFundraiserForFeedModel) null);
                return;
            }
            C358248ab A0U = DbW.A0U(r4);
            A0U.A09(2131972061);
            A0U.A08(2131972059);
            A0U.A0K(LV3.A00(this, 57), 2131972051);
            A0U.A05();
            DbT.A1V(A0U);
        }
    }

    public final void DBI(NewFundraiserInfo newFundraiserInfo) {
        NewFundraiserInfo newFundraiserInfo2 = newFundraiserInfo;
        String str = newFundraiserInfo2.A01;
        if (str != null) {
            UserSession userSession = this.A00;
            if (182.A06(0Tu.A05, userSession, 36317474655835306L)) {
                LTM.A07(this.A05, userSession, "draft_fundraiser_row", "REELS", (String) null, (Map) null);
                FragmentActivity fragmentActivity = this.A03;
                String str2 = newFundraiserInfo2.A07;
                LTV.A07(fragmentActivity, userSession, Integer.valueOf(newFundraiserInfo2.A00), str, "REELS", str2, newFundraiserInfo2.A05, newFundraiserInfo2.A03, (String) AnonymousClass7TE.A14(this.A02.A0P.A02), newFundraiserInfo2.A08);
            }
        }
    }

    public final void DNi(AnonymousClass4DH r12, boolean z, boolean z2) {
        AnonymousClass80P r1;
        UserSession userSession = this.A00;
        27p.A01(userSession).A1V(C59725JVj.SHARE_SHEET, r12.getModuleName(), "SHARE_TO_FACEBOOK", true, C367288qV.A06(userSession));
        27r A012 = 27p.A01(userSession);
        boolean z3 = z;
        if (z) {
            r1 = AnonymousClass80P.SHARE_TO_FACEBOOK_ON;
        } else {
            r1 = AnonymousClass80P.SHARE_TO_FACEBOOK_OFF;
        }
        A012.A1B(C62674Kka.A0I, r1);
        C61829KNs kNs = this.A02;
        C61848KOn kOn = kNs.A0i;
        if (kOn.A06().A08 == null || JTR.A1Y(kOn.A01)) {
            LPW.A01(r12.requireContext(), userSession, C51967G9n.A0l(z2 ? 1 : 0), AnonymousClass05K.A01, AnonymousClass8PU.A00(userSession), AnonymousClass7TF.A0g(userSession), z3, kNs.A0l);
            return;
        }
        EvB(new GAX(2131961792, 2131961828), (C62320sa) null);
    }

    public final void DWK() {
        Fragment k5f;
        AnonymousClass3Q2 r1 = this.A02.A02;
        if (r1 != null) {
            UserSession userSession = this.A00;
            boolean A022 = LPL.A02(userSession);
            C309516Yo A002 = C49892FBu.A00(this.A03, userSession);
            if (A022) {
                List list = r1.A4C;
                if (list == null) {
                    list = AnonymousClass7TE.A1C();
                }
                BrandedContentProjectMetadata brandedContentProjectMetadata = r1.A0t;
                k5f = LSU.A04(r1.A0s, brandedContentProjectMetadata, "reel", r1.A3t, list, false, false, r1.A5i, false, false, false, true, r1.A51);
            } else {
                boolean z = r1.A51;
                List list2 = r1.A4C;
                if (list2 == null) {
                    list2 = AnonymousClass7TE.A1C();
                }
                BrandedContentProjectMetadata brandedContentProjectMetadata2 = r1.A0t;
                BrandedContentGatingInfo brandedContentGatingInfo = r1.A0s;
                boolean z2 = r1.A5i;
                String str = r1.A3t;
                boolean A1Y = DbW.A1Y(list2);
                k5f = new K5F();
                k5f.setArguments(LSU.A00(brandedContentGatingInfo, brandedContentProjectMetadata2, "reel", str, list2, z, A1Y, z2));
            }
            A002.A0D(k5f);
            A002.A04();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        if (r7 != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0097, code lost:
        if (r6.A00 == null) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DWe() {
        /*
            r32 = this;
            r8 = r32
            X.KNs r10 = r8.A02
            X.3Q2 r5 = r10.A02
            X.5kq r7 = X.C61829KNs.A01(r10)
            if (r5 == 0) goto L_0x00d4
            if (r7 == 0) goto L_0x00d4
            com.instagram.common.session.UserSession r9 = r8.A00
            X.L4H r0 = X.C63209KtG.A00(r9)
            X.1QP r3 = r0.A01
            long r0 = r0.A00
            java.lang.String r2 = "PEOPLE_TAGGING_ENTERED"
            r3.flowMarkPoint(r0, r2)
            java.lang.String r4 = r5.A2X
            if (r4 != 0) goto L_0x0023
            java.lang.String r4 = ""
        L_0x0023:
            X.0iw r0 = r8.A05
            java.lang.String r0 = r0.getModuleName()
            X.28D r11 = X.28D.A0h
            X.C56246HvD.A00(r11, r9, r0)
            X.27r r1 = X.27p.A01(r9)
            X.80P r6 = X.AnonymousClass80P.TAG_PERSON
            X.Kka r3 = X.C62674Kka.A0L
            r0 = 2303(0x8ff, float:3.227E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r0 = 1
            X.29Z r1 = r1.A0F
            r1.A0V(r3, r6, r2, r0)
            X.27r r1 = X.27p.A01(r9)
            r1.A0j()
            X.L4G r3 = r8.A06
            java.util.List r2 = r7.A0q
            if (r2 != 0) goto L_0x0051
            X.0sn r2 = X.0sn.A00
        L_0x0051:
            java.lang.String r9 = r7.A0U
            java.util.List r1 = r7.A0n
            if (r1 != 0) goto L_0x0059
            X.0sn r1 = X.0sn.A00
        L_0x0059:
            X.3QO r14 = r7.A0K
            if (r14 != 0) goto L_0x005f
            X.3QO r14 = X.AnonymousClass3QO.DEFAULT
        L_0x005f:
            java.lang.String r6 = r7.A0W
            r8 = 0
            if (r6 == 0) goto L_0x00d5
            X.28D r12 = X.28D.valueOf(r6)
        L_0x0068:
            com.instagram.music.common.model.AudioOverlayTrack r6 = r7.A0N
            if (r6 == 0) goto L_0x006e
            java.lang.String r8 = r6.A0B
        L_0x006e:
            boolean r6 = r10.A0l
            r10 = r6 ^ 1
            X.JwI r6 = r7.A02
            boolean r29 = X.AnonymousClass7TF.A1V(r6)
            java.util.List r6 = r7.A0m
            if (r6 == 0) goto L_0x0083
            boolean r7 = r6.isEmpty()
            r6 = 0
            if (r7 == 0) goto L_0x0084
        L_0x0083:
            r6 = 1
        L_0x0084:
            r30 = r6 ^ 1
            r28 = 0
            X.0qQ.A0B(r2, r0)
            r6 = 3
            X.C51973G9u.A0r(r6, r1, r14, r4)
            X.JxB r6 = r5.A0v
            if (r6 == 0) goto L_0x0099
            java.lang.Integer r6 = r6.A00
            r27 = 1
            if (r6 != 0) goto L_0x009b
        L_0x0099:
            r27 = 0
        L_0x009b:
            com.instagram.common.session.UserSession r13 = r3.A01
            java.lang.String r6 = r5.A35
            X.3QO r7 = r5.A1F
            X.3QO r5 = X.AnonymousClass3QO.FAN_CLUB
            boolean r26 = X.AnonymousClass7TF.A1W(r7, r5)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r10)
            r18 = 0
            X.0sn r5 = X.0sn.A00
            X.0qQ.A0B(r6, r0)
            r0 = 15
            X.0qQ.A0B(r5, r0)
            r19 = r6
            r20 = r8
            r21 = r18
            r22 = r2
            r23 = r1
            r24 = r18
            r25 = r5
            r31 = r28
            r16 = r9
            r17 = r4
            X.K67 r1 = X.C63211KtI.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            androidx.fragment.app.FragmentActivity r0 = r3.A00
            X.DbZ.A18(r1, r0, r13)
        L_0x00d4:
            return
        L_0x00d5:
            r12 = r8
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65170LoZ.DWe():void");
    }

    public final void Da3() {
        FragmentActivity fragmentActivity;
        int i;
        C293505kq A012 = C61829KNs.A01(this.A02);
        if (A012 != null) {
            UserSession userSession = this.A00;
            boolean z = A012.A0y;
            AnonymousClass3QO r5 = A012.A0K;
            Fragment clipsProfileVisibilityFragment = new ClipsProfileVisibilityFragment();
            Bundle A0F = JTP.A0F(userSession);
            A0F.putBoolean("HIDE_FROM_PROFILE_GRID", z);
            if (r5 != null) {
                A0F.putString("AUDIENCE", r5.A00);
            }
            C331127Pr A0V = DbV.A0V(A0F, clipsProfileVisibilityFragment, userSession);
            if (r5 != AnonymousClass3QO.OPAL || !C318996ps.A01()) {
                fragmentActivity = this.A03;
                i = 2131955633;
            } else {
                fragmentActivity = this.A03;
                C51967G9n.A0v();
                i = 2131968849;
            }
            DbZ.A0z(fragmentActivity, A0V, i);
            DbS.A1S(A0V, false);
            A0V.A0U = new C19679Wdh(1);
            C331157Pu A002 = A0V.A00();
            A002.A02(fragmentActivity, clipsProfileVisibilityFragment);
            if (clipsProfileVisibilityFragment.isAdded()) {
                AnonymousClass0eM r4 = clipsProfileVisibilityFragment.A00;
                JTS.A11(clipsProfileVisibilityFragment, new MG9(A002, (AnonymousClass4D7) null, 18), ((C60124Jg5) r4.getValue()).A01);
                JTS.A11(clipsProfileVisibilityFragment, new MG9(this, (AnonymousClass4D7) null, 19), ((C60124Jg5) r4.getValue()).A00);
            }
        }
    }

    public final void Dax(AnonymousClass4DH r8, PublishScreenCategoryType publishScreenCategoryType) {
        L4G l4g = this.A06;
        String moduleName = r8.getModuleName();
        Bundle requireArguments = r8.requireArguments();
        String str = this.A02.A0k;
        0qQ.A0B(moduleName, 0);
        C62462KgC kgC = C62462KgC.CLIPS;
        requireArguments.putString("publish_screen_category_parent_module_name", moduleName);
        requireArguments.putParcelable("publish_screen_category_type", publishScreenCategoryType);
        requireArguments.putString("ClipsConstants.ARGS_WATERFALL_ID", str);
        requireArguments.putSerializable("publish_screen_type", kgC);
        requireArguments.putBoolean("should_show_customized_action_bar", false);
        C61401K5v k5v = new C61401K5v();
        k5v.setArguments(requireArguments);
        Dbb.A11(k5v, l4g.A00, l4g.A01);
    }

    public final void Dby(AnonymousClass4DH r20, boolean z, boolean z2) {
        AnonymousClass80P r1;
        C46401DeO deO;
        String str;
        int i;
        UserSession userSession = this.A00;
        27r A012 = 27p.A01(userSession);
        boolean z3 = z;
        if (z) {
            r1 = AnonymousClass80P.RECOMMEND_ON_FB_ON;
        } else {
            r1 = AnonymousClass80P.RECOMMEND_ON_FB_OFF;
        }
        A012.A1B(C62674Kka.A0G, r1);
        C61829KNs kNs = this.A02;
        C61848KOn kOn = kNs.A0i;
        UserSession userSession2 = kOn.A01;
        ClipsFanClubMetadata A002 = C48792EkF.A00(userSession2, kOn.A00, kOn.A09, kOn.A0A);
        if (A002 != null) {
            deO = A002.A00;
        } else {
            deO = null;
        }
        if (deO == C46401DeO.WELCOME) {
            i = 2131976842;
        } else if (C61075JwD.A0M(kOn) == AnonymousClass3QO.FAN_CLUB) {
            i = 2131961800;
        } else if (kOn.A06().A08 == null || JTR.A1Y(userSession2)) {
            if (z2) {
                str = "SHARE_TO_FACEBOOK";
            } else {
                str = "RECOMMEND_TO_FACEBOOK";
            }
            27p.A01(userSession).A1V(C59725JVj.SHARE_SHEET, this.A05.getModuleName(), str, false, 2D5.A00(userSession).A0C());
            LPW.A01(r20.requireContext(), userSession, C51967G9n.A0l(z2 ? 1 : 0), AnonymousClass05K.A00, AnonymousClass8PU.A00(userSession), AnonymousClass7TF.A0g(userSession), z3, kNs.A0l);
            return;
        } else {
            i = 2131961791;
        }
        EvB(new GAX(i, 2131961827), (C62320sa) null);
    }

    public final void Ddh() {
        String str;
        C293505kq A012 = C61829KNs.A01(this.A02);
        if (A012 == null || (str = A012.A0g) == null) {
            str = AnonymousClass7TE.A16(this.A03, 2131955706);
        }
        AnonymousClass0iw r0 = this.A05;
        UserSession userSession = this.A00;
        C63991LHj.A01(r0, userSession, (Long) null, (String) null);
        27p.A01(userSession).A1B(C62674Kka.A0H, AnonymousClass80P.RENAME_AUDIO);
        L4H A002 = C63209KtG.A00(userSession);
        A002.A01.flowMarkPoint(A002.A00, "RENAME_AUDIO_ENTERED");
        Dba.A0w((Bundle) null, C63102KrV.A00(str, (String) null, (String) null, "0", false), DbS.A0M(this.A03, userSession));
    }

    public final void Dp4(AnonymousClass4DH r3, ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel) {
        AnonymousClass3QO r1;
        AnonymousClass3Q2 r0 = this.A02.A02;
        if (r0 != null) {
            r1 = r0.A1F;
        } else {
            r1 = null;
        }
        if (r1 == AnonymousClass3QO.CLOSE_FRIENDS || r1 == AnonymousClass3QO.OPAL) {
            A00(r3, r1);
        } else {
            FKU(existingStandaloneFundraiserForFeedModel);
        }
    }

    public final void Dp8(boolean z, int i) {
        String str;
        C61829KNs kNs = this.A02;
        AnonymousClass3Q2 r3 = kNs.A02;
        if (r3 != null) {
            UserSession userSession = this.A00;
            AnonymousClass0iw r5 = this.A05;
            String str2 = kNs.A0k;
            ArrayList arrayList = r3.A43;
            if (arrayList != null && !arrayList.isEmpty() && (str = r3.A2g) != null) {
                int i2 = i;
                LTQ.A05(LTQ.A00(arrayList), C64832Lit.A04.A00(userSession).A00(str2, str), r5, userSession, str, i2, r3.A0u(), z);
            }
        }
    }

    public final void DqW(View view) {
        LMT lmt = this.A07;
        if (!lmt.A00) {
            UserSession userSession = lmt.A01;
            if (C63447KxC.A00(userSession)) {
                1Av A002 = 1Au.A00(userSession);
                0s0 r0 = A002.A0f;
                AnonymousClass0YZ[] r4 = 1Av.A8a;
                if (!AnonymousClass7TG.A1a(A002, r0, r4, 185)) {
                    1Av A003 = 1Au.A00(userSession);
                    AnonymousClass7TF.A1J(A003, A003.A0f, r4, 185, true);
                    lmt.A00 = true;
                    LMT.A00(view, lmt, (C234222xL) null, C226262fy.ABOVE_ANCHOR, AnonymousClass7TF.A0d(view.getResources(), 2131974945));
                }
            }
        }
        C17990VjS vjS = this.A08;
        if (vjS != null) {
            UserSession userSession2 = this.A00;
            String moduleName = this.A05.getModuleName();
            0qQ.A0B(moduleName, 2);
            JZM.A00(userSession2).A0B(C16581Uxb.CLIPS_COMPOSER, moduleName, C63447KxC.A00(userSession2));
            vjS.A01((1Xj) null);
        }
    }

    public final void DqX(AnonymousClass4DH r6, ShoppingCreationConfig shoppingCreationConfig) {
        int i;
        UserSession userSession = this.A00;
        String moduleName = r6.getModuleName();
        0qQ.A0B(moduleName, 1);
        JZM.A00(userSession).A0C(C16581Uxb.CLIPS_COMPOSER, moduleName, C63447KxC.A00(userSession));
        27p.A01(userSession).A1B(C62674Kka.A0M, AnonymousClass80P.TAG_PRODUCT);
        C61844KOi kOi = this.A02.A0V;
        if (C61075JwD.A0M(kOi) == AnonymousClass3QO.CLOSE_FRIENDS) {
            i = 2131953892;
        } else if (kOi.A06().A08 != null) {
            i = 2131953893;
        } else {
            A01(r6, shoppingCreationConfig);
            return;
        }
        EvB(new GAX(i, 2131969875), (C62320sa) null);
    }

    public final void Dv2(AnonymousClass4DH r11, boolean z, boolean z2) {
        UserSession userSession = this.A00;
        27r A012 = 27p.A01(userSession);
        C59725JVj jVj = C59725JVj.SHARE_SHEET;
        A012.A1V(jVj, r11.getModuleName(), "SHARE_TO_FACEBOOK", true, C367288qV.A06(userSession));
        27r A013 = 27p.A01(userSession);
        A013.A0F.A0U(C62674Kka.A0I, jVj, r11.getModuleName());
        C61848KOn kOn = this.A02.A0i;
        GAX gax = null;
        if (kOn.A06().A08 != null && !JTR.A1Y(kOn.A01)) {
            gax = new GAX(2131961792, 2131961828);
        }
        if (gax != null) {
            EvB(gax, (C62320sa) null);
            return;
        }
        C48920EmK.A00().A01(r11, userSession, new M1F(r11, this, z, z2)).A06(EXN.A0G.A01(), (List) null);
    }

    public final void DvC(UpcomingEvent upcomingEvent) {
        this.A02.A0g.A0B(upcomingEvent);
    }

    public final void DvD(UpcomingEvent upcomingEvent) {
        this.A02.A0g.A0A(upcomingEvent);
    }

    public final void DvF() {
        this.A02.A0g.A0B((UpcomingEvent) null);
    }

    public final void E17(Location location, long j) {
        C293505kq A012 = C61829KNs.A01(this.A02);
        if (A012 != null) {
            L4G l4g = this.A06;
            String str = A012.A0T;
            UserSession userSession = l4g.A01;
            L4H A002 = C63209KtG.A00(userSession);
            A002.A01.flowMarkPoint(A002.A00, "ADD_LOCATION_ENTERED");
            AnonymousClass36R.A01();
            K5H A003 = K5H.A00((Location) null, "CLIPS", str, -1, true, false);
            C309516Yo A0M = DbS.A0M(l4g.A00, userSession);
            A0M.A0B((Bundle) null, A003);
            A0M.A04();
        }
    }

    public final void E3e(NewFundraiserInfo newFundraiserInfo) {
        NewFundraiserInfo newFundraiserInfo2 = newFundraiserInfo;
        String str = newFundraiserInfo2.A01;
        if (str != null) {
            UserSession userSession = this.A00;
            if (182.A06(0Tu.A06, userSession, 36317474655835306L)) {
                FragmentActivity fragmentActivity = this.A03;
                String str2 = newFundraiserInfo2.A07;
                Integer valueOf = Integer.valueOf(newFundraiserInfo2.A00);
                String str3 = newFundraiserInfo2.A05;
                List list = newFundraiserInfo2.A08;
                DbY.A1S(userSession, str);
                C55175HdR.A00(DbT.A05(fragmentActivity), userSession, "com.instagram.social_impact.fundraiser.nonprofit_creation_details_for_feed.component.view", LTV.A00(valueOf, str, "REELS", str2, str3, newFundraiserInfo2.A03, (String) AnonymousClass7TE.A14(this.A02.A0P.A02), list), 60);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.JwH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FKU(com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel r6) {
        /*
            r5 = this;
            X.KNs r0 = r5.A02
            X.KOJ r4 = r0.A0P
            X.JwD r0 = r4.A06()
            X.JwH r1 = r0.A06
            r3 = 0
            if (r1 == 0) goto L_0x001d
            if (r6 == 0) goto L_0x0013
            com.instagram.common.session.UserSession r0 = r4.A00
            java.lang.String r3 = r0.A06
        L_0x0013:
            java.lang.Object r2 = r1.A01
            r1 = 11
            X.JwH r0 = new X.JwH
            r0.<init>((java.lang.Object) r2, (java.lang.Object) r6, (java.lang.String) r3, (int) r1)
            r3 = r0
        L_0x001d:
            X.JwD r0 = r4.A06()
            X.JwD r0 = X.C61075JwD.A00((X.AnonymousClass9J6) null, (X.C61080JwI) null, (X.C61066Jw4) null, (X.C59721JVf) null, (X.C61046Jvk) null, (X.C61077JwF) null, r3, (X.C61062Jw0) null, (X.C61100JxB) null, (com.instagram.api.schemas.MediaGenAIDetectionMethod) null, (X.C61000Juw) null, (X.Jv3) null, r0, (X.AnonymousClass3QO) null, (com.instagram.model.venue.Venue) null, (com.instagram.music.common.model.AudioOverlayTrack) null, (com.instagram.pendingmedia.model.ClipInfo) null, (X.C272024jy) null, (com.instagram.user.model.UpcomingEvent) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (X.0eP) null, -524289, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false)
            r4.A09(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65170LoZ.FKU(com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.JwH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FKr(com.instagram.model.fundraiser.NewFundraiserInfo r6) {
        /*
            r5 = this;
            X.KNs r0 = r5.A02
            X.KOJ r4 = r0.A0P
            X.JwD r0 = r4.A06()
            X.JwH r1 = r0.A06
            r3 = 0
            if (r1 == 0) goto L_0x001d
            if (r6 == 0) goto L_0x0013
            com.instagram.common.session.UserSession r0 = r4.A00
            java.lang.String r3 = r0.A06
        L_0x0013:
            java.lang.Object r2 = r1.A00
            r1 = 11
            X.JwH r0 = new X.JwH
            r0.<init>((java.lang.Object) r6, (java.lang.Object) r2, (java.lang.String) r3, (int) r1)
            r3 = r0
        L_0x001d:
            X.JwD r0 = r4.A06()
            X.JwD r0 = X.C61075JwD.A00((X.AnonymousClass9J6) null, (X.C61080JwI) null, (X.C61066Jw4) null, (X.C59721JVf) null, (X.C61046Jvk) null, (X.C61077JwF) null, r3, (X.C61062Jw0) null, (X.C61100JxB) null, (com.instagram.api.schemas.MediaGenAIDetectionMethod) null, (X.C61000Juw) null, (X.Jv3) null, r0, (X.AnonymousClass3QO) null, (com.instagram.model.venue.Venue) null, (com.instagram.music.common.model.AudioOverlayTrack) null, (com.instagram.pendingmedia.model.ClipInfo) null, (X.C272024jy) null, (com.instagram.user.model.UpcomingEvent) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (X.0eP) null, -524289, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false)
            r4.A09(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65170LoZ.FKr(com.instagram.model.fundraiser.NewFundraiserInfo):void");
    }

    public final void FMK(UpcomingEvent upcomingEvent) {
        AnonymousClass3Q2 r1 = this.A02.A02;
        if (r1 != null) {
            UpcomingEventImpl upcomingEventImpl = null;
            if (upcomingEvent != null) {
                upcomingEventImpl = upcomingEvent.FGz((1E6) null);
            }
            r1.A1p = upcomingEventImpl;
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C61062Jw0 jw0;
        ArrayList arrayList;
        String str;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List list;
        List<BBU> list2;
        ArrayList arrayList4;
        int i3 = i;
        Intent intent2 = intent;
        if (i3 != 16) {
            if (i3 != 97) {
                if (i3 == 2002) {
                    this.A01.A00(intent2);
                }
            } else if (intent != null) {
                String stringExtra = intent2.getStringExtra("ClipsConstants.ARG_CLIPS_FUNDED_CONTENT_DEAL_ID");
                KOZ koz = this.A02.A0O;
                koz.A02 = intent2.getStringExtra("ClipsConstants.ARG_CLIPS_FUNDED_CONTENT_DEAL_NAME");
                koz.A0A(stringExtra);
            }
        } else if (intent != null) {
            C61844KOi kOi = this.A02.A0V;
            AnonymousClass0iw r9 = this.A05;
            AnonymousClass3Q2 r0 = kOi.A01;
            ArrayList arrayList5 = null;
            if (r0 != null) {
                jw0 = r0.A0q;
            } else {
                jw0 = null;
            }
            C64182LSo lSo = C63550Kyz.A00;
            String str2 = kOi.A08;
            C61062Jw0 A002 = LTX.A00(jw0, lSo.A04(intent2, str2));
            UserSession userSession = kOi.A06;
            if (jw0 == null || A002 == null) {
                arrayList = 0sn.A00;
            } else {
                List<String> A042 = LTX.A04(jw0);
                List A043 = LTX.A04(A002);
                arrayList = AnonymousClass7TE.A1C();
                for (String str3 : A042) {
                    if (!A043.contains(str3)) {
                        arrayList.add(str3);
                        LTQ.A04((PointF) null, (C60762Jqt) null, r9, userSession, C62565Khv.AUTO_TAG, (Float) null, (Integer) null, str2, "remove", str3, str3, (String) null, "reels", "seller", 0, false);
                    }
                }
            }
            kOi.A05 = arrayList;
            kOi.A02 = C64182LSo.A00(intent2);
            AnonymousClass3Q2 r02 = kOi.A01;
            if (r02 != null) {
                r02.A0q = A002;
            }
            kOi.A09(C61075JwD.A00((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, A002, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, (Jv3) null, kOi.A06(), (AnonymousClass3QO) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, -1025, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false));
            AnonymousClass3Q2 r03 = kOi.A01;
            if (!(r03 == null || (arrayList4 = r03.A43) == null)) {
                C61844KOi.A00(kOi, arrayList4);
            }
            AnonymousClass3Q2 r04 = kOi.A01;
            if (r04 != null) {
                arrayList5 = r04.A43;
            }
            if (C63447KxC.A00(userSession)) {
                str = "opt";
            } else {
                str = "seller";
            }
            List<MediaSuggestedProductTag> A072 = LTX.A07(arrayList5);
            if (!A072.isEmpty()) {
                if (A002 == null || (list2 = (List) A002.A01) == null) {
                    arrayList2 = 0sn.A00;
                } else {
                    arrayList2 = AnonymousClass7TF.A0p(list2);
                    for (BBU bbu : list2) {
                        arrayList2.add(bbu.A05);
                    }
                }
                if (A002 == null || (list = (List) A002.A01) == null) {
                    arrayList3 = 0sn.A00;
                } else {
                    arrayList3 = AnonymousClass7TF.A0p(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        JTU.A1K(arrayList3, it);
                    }
                }
                for (MediaSuggestedProductTag mediaSuggestedProductTag : A072) {
                    String A044 = mediaSuggestedProductTag.A04();
                    String A0n = JTT.A0n(mediaSuggestedProductTag);
                    if (arrayList3.contains(A0n) || arrayList2.contains(A044)) {
                        LTQ.A04((PointF) null, (C60762Jqt) null, r9, userSession, C62565Khv.AUTO_PLACE, (Float) null, (Integer) null, str2, "add", A0n, A0n, (String) null, "reels", str, 0, false);
                    }
                }
            }
            if (A002 != null) {
                C64834Liw A003 = C17053VGb.A00(userSession);
                int i4 = 0;
                int A0H = C51971G9r.A0H((List) A002.A01);
                if (A002.A03 != null) {
                    i4 = 1;
                }
                A003.A01(A0H, i4, r9.getModuleName());
            }
        }
    }

    public final void DI9(C63757L5p l5p, String str) {
        boolean A1X = DbW.A1X(l5p);
        LTO.A04(l5p.A00, AnonymousClass05K.A02, AnonymousClass05K.A08, (String) null, AnonymousClass2o3.A00(l5p.A02).A05(UserMonetizationProductType.CONTENT_APPRECIATION), A1X);
        FragmentActivity fragmentActivity = this.A03;
        UserSession userSession = this.A00;
        Dba.A0w((Bundle) null, AnonymousClass2BF.A00().A02().A00(userSession, "ADVANCED_SETTINGS", (String) null, str, A1X), DbS.A0M(fragmentActivity, userSession));
    }

    public final void Dp7(AnonymousClass4DH r11, ShoppingCreationConfig shoppingCreationConfig, MediaSuggestedProductTag mediaSuggestedProductTag, int i) {
        String str;
        String str2;
        A01(r11, shoppingCreationConfig);
        AnonymousClass3Q2 r0 = this.A02.A02;
        if (r0 != null) {
            str = r0.A2g;
        } else {
            str = null;
        }
        UserSession userSession = this.A00;
        AnonymousClass0iw r1 = this.A05;
        String str3 = null;
        Product A072 = mediaSuggestedProductTag.A07();
        if (!(str == null || A072 == null)) {
            String str4 = A072.A0H;
            User user = A072.A0B;
            if (user != null) {
                str3 = AnonymousClass3ZA.A00(user);
            }
            Float A082 = mediaSuggestedProductTag.A08();
            if (C63447KxC.A00(userSession)) {
                str2 = "opt";
            } else {
                str2 = "seller";
            }
            LTQ.A07(r1, userSession, A082, str, str4, str3, "reels", str2, i);
        }
        27r A012 = 27p.A01(userSession);
        A012.A0F.A0U(C62674Kka.A0M, C59725JVj.SHARE_SHEET, r1.getModuleName());
    }
}
