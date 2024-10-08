package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.creatormessaging.intf.CategorySelectionScreenArgs;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import com.instagram.modal.ModalActivity;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.HashMap;

public final class FmA implements C273414mX {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public FmA(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.2jA] */
    public final void Cyc() {
        UserSession userSession;
        28D r6;
        Activity activity;
        Activity activity2;
        int i;
        C62320sa r0;
        switch (this.A00) {
            case 0:
                if (((C357058Wh) this.A02).A00) {
                    r0 = (C62320sa) this.A01;
                    break;
                } else {
                    return;
                }
            case 1:
                boolean A0C = 2D5.A00((UserSession) this.A02).A0C();
                C66461MSp mSp = ((LBK) this.A01).A08;
                if (mSp != null) {
                    mSp.afterSelection(A0C);
                    return;
                }
                return;
            case 2:
                C49945FFy fFy = (C49945FFy) this.A02;
                View view = fFy.A01;
                int i2 = fFy.A00;
                if (i2 < 0 || view == null) {
                    AnonymousClass6ZA r02 = fFy.A03.A03;
                    if (r02 != null && i2 == -2) {
                        r02.D9e();
                    }
                } else {
                    ((C67293MlS) fFy.A04.A05.A01.get(i2)).A0A.onClick(view);
                    AnonymousClass6ZA r1 = fFy.A03.A03;
                    if (r1 != null) {
                        r1.Din(view, fFy.A00);
                    }
                }
                fFy.A01 = null;
                fFy.A00 = -2;
                return;
            case 3:
                return;
            case 4:
                E6X e6x = (E6X) this.A02;
                Fragment fragment = (Fragment) this.A01;
                User user = e6x.A02;
                if (user != null) {
                    String id = user.getId();
                    AnonymousClass0eM r2 = e6x.A0L;
                    if (0qQ.A0K(id, DbU.A0u(r2))) {
                        e6x.A02 = null;
                        1E8 A0d = DbX.A0d(r2);
                        String str = e6x.A07;
                        if (str == null) {
                            0qQ.A0F("mediaId");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        1Xj A022 = A0d.A02(str);
                        if (A022 != null) {
                            C46447Df9.A03().A00(fragment, AnonymousClass07i.A00(fragment), e6x, (1P0) null, (1P0) null, AnonymousClass7TE.A0l(r2), A022.A1e(AnonymousClass7TE.A0l(r2)));
                            return;
                        }
                        C59689JTv.A03(e6x.getContext(), e6x.getString(2131965895), "media_cache_retrieval_failed", 0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                C49697F2i f2i = (C49697F2i) this.A02;
                ? obj = new Object();
                Integer num = f2i.A01;
                if (num != null) {
                    boolean z = true;
                    switch (num.intValue()) {
                        case 0:
                            userSession = f2i.A04;
                            C319976rX.A05(f2i.A03, userSession, C319986rY.SELF, "post_creation_tap", userSession.A06);
                            C59728JVm A002 = AnonymousClass9PJ.A00(userSession);
                            r6 = 28D.A42;
                            A002.A07(r6, true);
                            activity = f2i.A02;
                            z = false;
                            break;
                        case 1:
                            UserSession userSession2 = f2i.A04;
                            C319976rX.A05(f2i.A03, userSession2, C319986rY.SELF, "story_creation_tap", userSession2.A06);
                            C59728JVm A003 = AnonymousClass9PJ.A00(userSession2);
                            28D r5 = 28D.A42;
                            A003.A07(r5, true);
                            C49805F7r.A00(f2i.A02, r5, userSession2, (AnonymousClass80E) null, (PendingRecipient) null, 17452);
                            break;
                        case 2:
                            UserSession userSession3 = f2i.A04;
                            C319976rX.A06(f2i.A03, userSession3, C319986rY.SELF, C273654mx.A00(298), userSession3.A06, "user_profile_header");
                            JZV.A07(f2i.A02, Ki3.UNIVERSAL_CREATION_MENU, userSession3, true);
                            break;
                        case 3:
                            UserSession userSession4 = f2i.A04;
                            C319976rX.A05(f2i.A03, userSession4, C319986rY.SELF, "reel_creation_tap", userSession4.A06);
                            C59728JVm A004 = AnonymousClass9PJ.A00(userSession4);
                            28D r12 = 28D.A42;
                            A004.A07(r12, true);
                            C56044Hrt A0C2 = C250563lf.A0C(r12);
                            A0C2.A0m = true;
                            A0C2.A0B = null;
                            A0C2.A0v = !182.A06(0Tu.A05, userSession4, 36329461909569670L);
                            Bundle A005 = A0C2.A00();
                            A005.putBoolean("modal_dismiss_on_cancel", true);
                            if (2cg.A01(userSession4)) {
                                A005.putBoolean(AnonymousClass000.A00(407), true);
                            }
                            Dba.A0l(f2i.A02, A005, userSession4, "clips_camera");
                            break;
                        case 4:
                            UserSession userSession5 = f2i.A04;
                            C319976rX.A05(f2i.A03, userSession5, C319986rY.SELF, "live_creation_tap", userSession5.A06);
                            AnonymousClass9PJ.A00(userSession5).A07(28D.A42, true);
                            Dba.A0l(f2i.A02, AnonymousClass7TE.A0a(), userSession5, "universal_creation_live_camera");
                            break;
                        case 5:
                            UserSession userSession6 = f2i.A04;
                            C319976rX.A05(f2i.A03, userSession6, C319986rY.SELF, "ai_creation_tap", userSession6.A06);
                            boolean A06 = 182.A06(AnonymousClass7TF.A0H(userSession6), userSession6, 36330204939305483L);
                            String A006 = C273654mx.A00(1192);
                            Class<ModalActivity> cls = ModalActivity.class;
                            Bundle A0a = AnonymousClass7TE.A0a();
                            if (A06) {
                                A0a.putString(A006, "universal_create_menu");
                                activity2 = f2i.A02;
                                i = 1180;
                            } else {
                                A0a.putString(A006, "universal_create_menu");
                                A0a.putBoolean("is_ai_creation_template_prefetched", 182.A06(0Tu.A05, userSession6, 36330204939108872L));
                                activity2 = f2i.A02;
                                i = 1182;
                            }
                            AnonymousClass6W8 A03 = AnonymousClass6W8.A03(activity2, A0a, userSession6, cls, C273654mx.A00(i));
                            A03.A08();
                            A03.A0C(activity2);
                            break;
                        case 6:
                            UserSession userSession7 = f2i.A04;
                            C319976rX.A05(f2i.A03, userSession7, C319986rY.SELF, "made_for_you_creation_tap", userSession7.A06);
                            Activity activity3 = f2i.A02;
                            C63142KsA.A00(activity3, DbT.A05(activity3), C48143EZl.ACR_BROWSER_ENTRY_POINT_PROFILE_CREATION_MENU, 28D.A3u, userSession7, obj);
                            break;
                        case 7:
                            1Yh A007 = C18138VmE.A00();
                            UserSession userSession8 = f2i.A04;
                            FragmentActivity fragmentActivity = f2i.A02;
                            0qQ.A0C(fragmentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                            A007.A09(fragmentActivity, userSession8, "universal_creation_menu");
                            break;
                        case 8:
                            UserSession userSession9 = f2i.A04;
                            C319976rX.A05(f2i.A03, userSession9, C319986rY.SELF, "fundraiser_creation_tap", userSession9.A06);
                            Activity activity4 = f2i.A02;
                            HashMap A1E = AnonymousClass7TE.A1E();
                            A1E.put("source_name", "PROFILE_COMPOSER");
                            C46649DiU A04 = C46649DiU.A04("com.instagram.social_impact.standalone_fundraiser_creation.view", A1E);
                            IgBloksScreenConfig A0N = DbS.A0N(userSession9);
                            A0N.A0l = false;
                            A0N.A0U = "";
                            A0N.A0i = true;
                            Dbb.A0i(activity4, C49891FBs.A00(A0N, A04), userSession9, ModalActivity.class, "bloks");
                            break;
                        case 10:
                            C51901G6v A012 = FC2.A01(f2i.A04, new ChannelCreationFlowExtraArgs((CategorySelectionScreenArgs) null, (String) null, (String) null), ChannelCreationSource.PROFILE, (EV0) null, false);
                            FragmentActivity fragmentActivity2 = f2i.A02;
                            0qQ.A0C(fragmentActivity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                            A012.CfS(fragmentActivity2);
                            break;
                        case 11:
                            userSession = f2i.A04;
                            C319976rX.A05(f2i.A03, userSession, C319986rY.SELF, "quiet_post_creation_tap", userSession.A06);
                            C59728JVm A008 = AnonymousClass9PJ.A00(userSession);
                            r6 = 28D.A42;
                            A008.A07(r6, true);
                            activity = f2i.A02;
                            break;
                    }
                    C49805F7r.A01(activity, r6, userSession, (PendingRecipient) null, z, z);
                    f2i.A01 = null;
                    return;
                }
                return;
            default:
                2Aq.A03((UserSession) this.A02).A0R();
                r0 = ((C49431EvX) this.A01).A00;
                break;
        }
        r0.invoke();
    }

    public final void Cyf() {
        if (3 - this.A00 == 0 && !((0r1) this.A01).A00) {
            FGY.A04((FGY) this.A02, "DISMISSAL");
        }
    }
}
