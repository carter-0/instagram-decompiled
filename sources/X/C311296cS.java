package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* renamed from: X.6cS  reason: invalid class name and case insensitive filesystem */
public final class C311296cS {
    public 1wn A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final DialogInterface.OnDismissListener A04;
    public final DialogInterface.OnDismissListener A05;
    public final CallerContext A06 = CallerContext.A01("ReelViewerFBShareManager");
    public final UserSession A07;
    public final C311396cc A08;
    public final C311376ca A09;
    public final C273384mU A0A;
    public final WeakReference A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass07i A0D;
    public final AnonymousClass0iw A0E;
    public final C311336cW A0F;
    public final C311316cU A0G;

    public C311296cS(AnonymousClass0iw r3, UserSession userSession, C273384mU r5, WeakReference weakReference) {
        0qQ.A0B(userSession, 1);
        this.A07 = userSession;
        this.A0B = weakReference;
        this.A0E = r3;
        this.A0A = r5;
        Object obj = weakReference.get();
        if (obj != null) {
            this.A0D = AnonymousClass07i.A00((AnonymousClass07Z) obj);
            this.A0C = AnonymousClass0eN.A01(new AnonymousClass9LF(this, 4));
            this.A0G = new C311306cT(this);
            this.A0F = new C311326cV(this);
            this.A04 = new C311346cX(this);
            this.A05 = new C311356cY(this);
            this.A09 = new C311366cZ(this);
            this.A08 = new C311386cb(this);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A00(AnonymousClass818 r5, C368278sM r6, C255773uh r7, C311296cS r8) {
        String str;
        1Xj r0;
        if (r5 != null) {
            UserSession userSession = r8.A07;
            AnonymousClass819 r3 = AnonymousClass819.DIALOG_3_OPTION_STORY;
            0bb r2 = new 0bb();
            r2.A0A(Boolean.valueOf(r8.A01));
            if (r7 == null || (r0 = r7.A0b) == null) {
                str = null;
            } else {
                str = r0.getId();
            }
            r2.A06("ig_media_id", str);
            C368288sN.A00(r5, r6, r3, r2, userSession);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r5.A12() == 19) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass818 r15, X.C255773uh r16, X.C311296cS r17) {
        /*
            r0 = r17
            java.lang.ref.WeakReference r7 = r0.A0B
            java.lang.Object r4 = r7.get()
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r11 = r16
            X.1Xj r5 = r11.A0b
            r6 = 0
            r8 = r15
            if (r5 == 0) goto L_0x004d
            boolean r1 = r5.A5O()
            if (r1 != 0) goto L_0x0021
            int r2 = r5.A12()
            r1 = 19
            r3 = 0
            if (r2 != r1) goto L_0x0022
        L_0x0021:
            r3 = 1
        L_0x0022:
            X.3QO r2 = r5.A1t()
            X.3QO r1 = X.AnonymousClass3QO.CLOSE_FRIENDS
            if (r2 != r1) goto L_0x002b
            r6 = 1
        L_0x002b:
            if (r3 != 0) goto L_0x00ad
            if (r6 == 0) goto L_0x004d
            java.lang.Object r1 = r7.get()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L_0x004c
            androidx.fragment.app.FragmentActivity r6 = r1.getActivity()
            if (r6 == 0) goto L_0x004c
            com.instagram.common.session.UserSession r10 = r0.A07
            X.819 r9 = X.AnonymousClass819.ACTIONSHEET_SINGLE_SHARE_STORY
            boolean r14 = r0.A01
            X.6ca r13 = r0.A09
            android.content.DialogInterface$OnDismissListener r7 = r0.A05
            X.6cc r12 = r0.A08
            X.W2A.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x004c:
            return
        L_0x004d:
            java.lang.Object r9 = r7.get()
            X.4DH r9 = (X.AnonymousClass4DH) r9
            r4 = 0
            if (r9 == 0) goto L_0x004c
            androidx.fragment.app.FragmentActivity r7 = r9.getActivity()
            if (r7 == 0) goto L_0x004c
            r1 = 1
            r0.A03 = r1
            X.4mU r2 = r0.A0A
            java.lang.String r1 = "dialog"
            r2.EHY(r1)
            boolean r1 = r0.A01
            if (r1 != 0) goto L_0x0092
            com.instagram.common.session.UserSession r1 = r0.A07
            X.8qK r3 = new X.8qK
            r3.<init>(r1)
            X.LEO r2 = X.C63435Kwv.A00(r7, r15, r1)
            if (r5 == 0) goto L_0x007b
            java.lang.String r4 = r5.getId()
        L_0x007b:
            r2.A08 = r4
            X.LxL r1 = new X.LxL
            r1.<init>(r15, r9, r11, r0)
            r2.A05 = r1
            r2.A01 = r9
            X.Lxg r6 = new X.Lxg
            r10 = r11
            r11 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            r0 = 0
            r3.A01(r0, r2, r6)
            return
        L_0x0092:
            com.instagram.common.session.UserSession r2 = r0.A07
            android.content.Context r13 = r9.getContext()
            X.LxL r1 = new X.LxL
            r1.<init>(r15, r9, r11, r0)
            r16 = r2
            r17 = r1
            r12 = r7
            r14 = r9
            boolean r1 = X.C63427Kwn.A00(r12, r13, r14, r15, r16, r17)
            if (r1 != 0) goto L_0x004c
            A02(r15, r11, r0)
            return
        L_0x00ad:
            X.0iw r7 = r0.A0E
            com.instagram.common.session.UserSession r8 = r0.A07
            java.lang.String r10 = ""
            r9 = 0
            java.lang.String r12 = "one_tap_share"
            r11 = r9
            X.0xI r3 = X.LT0.A00(r7, r8, r9, r10, r11, r12)
            java.lang.String r2 = "event"
            java.lang.String r1 = "fb_ig_client_already_shared_one_tap_share"
            r3.A0C(r2, r1)
            X.0xN r1 = X.C60510iO.A00(r8)
            r1.EFq(r3)
            r2 = 2131969736(0x7f1346c8, float:1.9576403E38)
            if (r6 == 0) goto L_0x00d1
            r2 = 2131969735(0x7f1346c7, float:1.9576401E38)
        L_0x00d1:
            if (r4 == 0) goto L_0x00e0
            android.content.Context r1 = r4.getContext()
        L_0x00d7:
            X.C59689JTv.A07(r1, r2)
            X.4mU r0 = r0.A0A
            r0.EHd()
            return
        L_0x00e0:
            r1 = 0
            goto L_0x00d7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C311296cS.A01(X.818, X.3uh, X.6cS):void");
    }

    public static final void A02(AnonymousClass818 r9, C255773uh r10, C311296cS r11) {
        FragmentActivity activity;
        UserSession userSession = r11.A07;
        int i = 1Au.A00(userSession).A01.getInt("self_story_sharing_option_dialog_show_times", 0);
        AnonymousClass818 r3 = r9;
        C255773uh r6 = r10;
        if (!C363018iu.A00(userSession)) {
            0xY AR4 = 1Au.A00(userSession).A01.AR4();
            AR4.E5Z("self_story_sharing_option_dialog_show_times", i + 1);
            AR4.apply();
            Object obj = r11.A0B.get();
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment");
            new C64372Lao(r3, (AnonymousClass4DH) obj, userSession, r6, r11.A0G, AnonymousClass05K.A01, C363018iu.A00(userSession), ((C363008it) r11.A0C.getValue()).A06()).A01();
            A00(r3, C368278sM.VIEW, r6, r11);
            return;
        }
        Fragment fragment = (Fragment) r11.A0B.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            AnonymousClass819 r4 = AnonymousClass819.ACTIONSHEET_SINGLE_SHARE_STORY;
            boolean z = r11.A01;
            W2A.A00(activity, r11.A05, r3, r4, userSession, r6, r11.A08, r11.A09, z);
        }
    }

    public static final void A03(C255773uh r3, C61149Jy0 jy0, C311296cS r5) {
        Integer num;
        Integer num2 = jy0.A00;
        if (num2 != null) {
            int intValue = num2.intValue();
            if (intValue == 0) {
                ((C363008it) r5.A0C.getValue()).A05(true, "ig_self_story");
                num = AnonymousClass05K.A0C;
            } else if (intValue == 1) {
                num = AnonymousClass05K.A0j;
            } else if (intValue == 2) {
                r5.A05(AnonymousClass05K.A00);
                return;
            } else {
                return;
            }
            r5.A05(num);
            0qQ.A07(AnonymousClass0HM.A00().toString());
            A04(r3, r5);
        }
    }

    private final void A05(Integer num) {
        Context context;
        if (this.A02) {
            this.A02 = false;
            this.A0A.EHd();
        }
        Fragment fragment = (Fragment) this.A0B.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            CallerContext callerContext = C62052KYa.A02;
            LRS.A01(context, num, 0);
        }
    }

    public final void A06(C255773uh r9, Integer num) {
        AnonymousClass818 r6;
        String str;
        EXN exn;
        UserSession userSession = this.A07;
        if (!C363388je.A03(C363388je.A00(userSession).A00(this.A06)) && this.A00 == null) {
            C64689LgK lgK = new C64689LgK(r9, this);
            this.A00 = lgK;
            AnonymousClass1Nd.A00(userSession).A01(lgK, C61149Jy0.class);
        }
        if (num == AnonymousClass05K.A01) {
            r6 = AnonymousClass818.IG_SELF_STORY_VIEW_OVERFLOW_MENU;
        } else if (this.A01) {
            r6 = AnonymousClass818.IG_SELF_STORY_VIEW_FB_BUTTON_POST_ACCOUNT_LINK;
        } else {
            r6 = AnonymousClass818.IG_SELF_STORY_VIEW_FB_BUTTON;
        }
        JZY jzy = JZY.SHARE_CLICK;
        JZZ jzz = JZZ.STORY;
        0bb r3 = new 0bb();
        1Xj r2 = r9.A0b;
        if (r2 != null) {
            str = r2.getId();
        } else {
            str = null;
        }
        r3.A06("media_id", str);
        JZX.A00(jzy, jzz, r6, r3, userSession);
        if (r2 != null) {
            1Av A002 = 1Au.A00(userSession);
            long currentTimeMillis = System.currentTimeMillis();
            0xY AR4 = A002.A01.AR4();
            AR4.E5c("self_story_fb_button_last_action_time_stamp", currentTimeMillis);
            AR4.apply();
            if (!AnonymousClass8PU.A07(userSession)) {
                A00(r6, C368278sM.ACCEPT, r9, this);
                if (182.A06(0Tu.A05, userSession, 2342168167566029476L)) {
                    this.A02 = true;
                }
                Fragment fragment = (Fragment) this.A0B.get();
                this.A0A.EHY("dialog");
                C65629Lx6 lx6 = new C65629Lx6(r6, r9, this);
                if (r6 == AnonymousClass818.IG_SELF_STORY_VIEW_OVERFLOW_MENU) {
                    exn = EXN.A0L;
                } else {
                    exn = EXN.REEL_VIEWER_SELF_STORY;
                }
                C48153EZv eZv = C48153EZv.A05;
                0qQ.A0C(fragment, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                eZv.A04(fragment, userSession, lx6, exn);
                return;
            }
            A01(r6, r9, this);
        }
    }

    public static final void A04(C255773uh r15, C311296cS r16) {
        LinkedHashMap linkedHashMap;
        Context context;
        String obj = AnonymousClass0HM.A00().toString();
        0qQ.A07(obj);
        C311296cS r2 = r16;
        UserSession userSession = r2.A07;
        String str = 27p.A01(userSession).A04.A0L;
        C255773uh r6 = r15;
        PromptStickerModel A0K = r15.A0K();
        if (A0K != null) {
            linkedHashMap = A0K.A06();
        } else {
            linkedHashMap = null;
        }
        C63394KwF.A00(userSession, "primary_click", "self_story", str, obj, linkedHashMap);
        if (!AnonymousClass8PU.A03(userSession)) {
            0wc A012 = AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession);
            0Aj A002 = A012.A00(A012.A00, "ig_business_story_to_fb_page");
            A002.AAJ("logging_event_name", "story_cross_posted_from_biz_to_fb_without_page_linked");
            A002.Cgf();
        }
        AnonymousClass3YP r1 = AnonymousClass3YP.SHARING;
        1Xj r0 = r6.A0b;
        if (r0 != null) {
            r0.A49(r1);
            r2.A0A.ADX(false);
            Fragment fragment = (Fragment) r2.A0B.get();
            if (fragment != null && (context = fragment.getContext()) != null) {
                AnonymousClass07i r12 = r2.A0D;
                1OC A003 = C64371Lan.A00(context, r2.A0E, userSession, r6, r2.A0F, Boolean.valueOf(!r2.A01), AnonymousClass05K.A0Y, obj, false);
                0qQ.A07(A003);
                1ES.A00(context, r12, A003);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
