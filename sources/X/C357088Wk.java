package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.archive.fragment.InlineAddHighlightFragment;
import com.instagram.archive.intf.ArchivePendingUpload;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.reels.fragment.model.ReelMoreOptionsModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Wk  reason: invalid class name and case insensitive filesystem */
public final class C357088Wk {
    public final Activity A00;
    public final ViewGroup A01;
    public final AnonymousClass4DH A02;
    public final AnonymousClass847 A03;
    public final C2355930l A04;
    public final UserSession A05;
    public final TouchInterceptorFrameLayout A06;
    public final AnonymousClass8QA A07;
    public final AnonymousClass8QN A08;
    public final AnonymousClass8K4 A09;
    public final AnonymousClass8BA A0A;
    public final AnonymousClass8L1 A0B;
    public final AnonymousClass8LU A0C;
    public final AnonymousClass8MC A0D;
    public final C3499582p A0E;
    public final AnonymousClass80D A0F;
    public final AnonymousClass81T A0G;
    public final AnonymousClass817 A0H;
    public final AnonymousClass80U A0I;
    public final AnonymousClass846 A0J;
    public final AnonymousClass0eK A0K;
    public final AnonymousClass0eM A0L;
    public final C357058Wh A0M;
    public final C71662eb A0N;
    public final C356848Vl A0O;
    public final AnonymousClass842 A0P;
    public final C353788Jb A0Q;
    public final AnonymousClass81B A0R;
    public final C357128Wq A0S;
    public final AnonymousClass8Wm A0T;

    public static void A05(C357088Wk r15, AnonymousClass8VT r16, UserStoryTarget userStoryTarget, String str, String str2, boolean z) {
        ShareType shareType;
        27p.A01(r15.A05).A04.A09();
        UserStoryTarget userStoryTarget2 = userStoryTarget;
        if (userStoryTarget2 == UserStoryTarget.A07) {
            shareType = ShareType.HIGHLIGHTS;
        } else {
            shareType = ShareType.REEL_SHARE;
        }
        LD4 ld4 = new LD4((DirectShareTarget) null, userStoryTarget2, shareType);
        int ordinal = A00(r15).ordinal();
        AnonymousClass8VT r10 = r16;
        String str3 = str;
        String str4 = str2;
        boolean z2 = z;
        if (ordinal == 0) {
            AnonymousClass8K4 r2 = r15.A09;
            Integer num = AnonymousClass05K.A00;
            r2.A0J((B1O) null, ld4, (C381779cJ) null, new L8M("auto_xpost", (String) null, z2, false), r10, num, str3, str4, (String) null, false, r15.A0A.A1D.A03.A0G);
        } else if (ordinal == 1) {
            r15.A0C.A0O(ld4, (C381779cJ) null, new L8M("auto_xpost", (String) null, z2, false), r10, (Boolean) null, AnonymousClass05K.A00, str3, str4, (String) null, (String) null, (List) null, (List) null, 1, false);
        } else {
            throw new UnsupportedOperationException("Unknown media type");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((!X.AnonymousClass8BA.A0L(r1)) == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(X.C357088Wk r7, X.AnonymousClass8VT r8, java.lang.String r9, java.lang.String r10) {
        /*
            r2 = r7
            X.8QA r1 = r7.A07
            r0 = 0
            r1.A0D(r0)
            X.8BA r1 = r7.A0A
            X.8it r0 = r1.A1q
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x001a
            boolean r0 = X.AnonymousClass8BA.A0L(r1)
            r0 = r0 ^ 1
            r7 = 1
            if (r0 != 0) goto L_0x001b
        L_0x001a:
            r7 = 0
        L_0x001b:
            r1.A0a()
            r1.A0X()
            com.instagram.pendingmedia.model.UserStoryTarget r4 = com.instagram.pendingmedia.model.UserStoryTarget.A01
            r3 = r8
            r5 = r9
            r6 = r10
            A05(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357088Wk.A06(X.8Wk, X.8VT, java.lang.String, java.lang.String):void");
    }

    public static void A09(C357088Wk r16, String str, boolean z) {
        C357088Wk r1 = r16;
        r1.A07.A0D(false);
        int ordinal = A00(r1).ordinal();
        String str2 = str;
        if (ordinal == 0) {
            AnonymousClass8K4.A0A(r1.A09, new LD4((DirectShareTarget) null, UserStoryTarget.A06, ShareType.REEL_SHARE), (C381539bv) null, (C15023UKc) null, Boolean.valueOf(z), (String) null, str2);
        } else if (ordinal == 1) {
            r1.A0C.A0O(new LD4((DirectShareTarget) null, UserStoryTarget.A06, ShareType.REEL_SHARE), (C381779cJ) null, (L8M) null, (AnonymousClass8VT) null, Boolean.valueOf(z), AnonymousClass05K.A00, (String) null, (String) null, str2, (String) null, (List) null, (List) null, 1, false);
        } else {
            throw new UnsupportedOperationException("Unknown media type");
        }
    }

    public static C365758nd A00(C357088Wk r1) {
        if (r1.A09.A0K()) {
            return C365758nd.A04;
        }
        return r1.A0E.A02.A02();
    }

    private AnonymousClass3Q2 A01() {
        C357058Wh r2 = this.A0M;
        C3499482o r4 = this.A0E.A02;
        CameraAREffect A002 = this.A0Q.A00();
        AnonymousClass8BA r1 = this.A0A;
        return r2.A03(A002, r4, r1.A1D.A03.A00(), r1.A0V(), r1.A0U());
    }

    public static void A02(C368278sM r6, C357088Wk r7, String str, boolean z) {
        String str2;
        UserSession userSession = r7.A05;
        AnonymousClass818 r4 = AnonymousClass818.IG_STORY_COMPOSER_YOUR_STORY_BUTTON;
        AnonymousClass819 r3 = AnonymousClass819.BOTTOMSHEET_DUAL_DESTPICKER_STORIES;
        0bb r2 = new 0bb();
        if (z) {
            str2 = "is_sharing";
        } else {
            str2 = "not_sharing";
        }
        r2.A06(C273654mx.A00(402), str2);
        r2.A09(true);
        r2.A06("waterfall_id", str);
        C368288sN.A00(r4, r6, r3, r2, userSession);
    }

    public static void A03(C357088Wk r11) {
        String A062;
        int i;
        int i2;
        int i3;
        boolean z;
        Activity activity = r11.A00;
        AnonymousClass37D A012 = AnonymousClass37D.A00.A01(activity);
        if (A012 != null) {
            AnonymousClass2S0.A01.A03();
            A012.A0Q(new C389849qK(r11));
            String str = r11.A05.A05;
            C3499482o r4 = r11.A0E.A02;
            int ordinal = r4.A01().ordinal();
            boolean z2 = false;
            if (ordinal != 0) {
                z2 = true;
                if (ordinal == 1) {
                    C349307zv A042 = r4.A01.A04();
                    A042.getClass();
                    A062 = A042.A0k;
                    i = A042.A0K;
                    i2 = A042.A08;
                    i3 = A042.A09;
                    z = A042.A1D;
                } else {
                    throw new UnsupportedOperationException("Unknown media type");
                }
            } else {
                C352218Cl A032 = r4.A01.A03();
                A032.getClass();
                A062 = A032.A06();
                i = A032.A09;
                i2 = A032.A06;
                i3 = A032.A07;
                z = A032.A13;
            }
            InlineAddHighlightFragment A033 = LT8.A03(new ArchivePendingUpload(A062, i, i2, i3, z2, z), (IngestSessionShim) null, str);
            0qQ.A0B(activity, 1);
            A012.A0H(activity, A033, AnonymousClass05K.A00, true);
        }
    }

    public static void A04(C357088Wk r4) {
        AnonymousClass8MC r3 = r4.A0D;
        if (r3.A01().A09 != null) {
            Iterator it = r3.A01().A09.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r2 = (Drawable) it.next();
                if (r2 instanceof B3d) {
                    break;
                }
            }
        }
        if (r3.A01().A0K != null) {
            for (Drawable drawable : r3.A01().A0K.keySet()) {
                if (drawable instanceof B3d) {
                    29I r32 = 27p.A01(r4.A05).A02;
                    MusicOverlayStickerModel BUu = ((B3d) drawable).BUu();
                    r32.A03(BUu.A0S, BUu.A0T, BUu.A0m);
                    return;
                }
            }
        }
        27p.A01(r4.A05).A02.A03((String) null, (String) null, (String) null);
    }

    public static void A07(C357088Wk r5, AnonymousClass8VT r6, String str, String str2) {
        C39938AKe aKe = new C39938AKe(r5, r6, str, str2);
        AnonymousClass8BA r1 = r5.A0A;
        r1.A0Z();
        if (A0C(aKe, r5)) {
            return;
        }
        if (!(!AnonymousClass8BA.A0L(r1))) {
            A06(r5, r6, str, str2);
            return;
        }
        AfR afR = new AfR(r5, r6, str, str2);
        UserSession userSession = r5.A05;
        C367188qK r3 = new C367188qK(userSession);
        LEO A002 = C63435Kwv.A00(r5.A00, AnonymousClass818.IG_STORY_COMPOSER_YOUR_STORY_BUTTON, userSession);
        A002.A05 = afR;
        A002.A0A = str;
        AnonymousClass4DH r12 = r5.A02;
        0qQ.A0B(r12, 0);
        A002.A01 = r12;
        r3.A01((C376569Im) null, A002, new AfU(r5, r6, str, str2));
    }

    public static void A08(C357088Wk r3, String str, String str2) {
        C39891ADp aDp = C39891ADp.A00;
        aDp.A01("sink", "story");
        aDp.A00();
        A07(r3, (AnonymousClass8VT) null, str, str2);
    }

    public static void A0A(C357088Wk r19, List list, int i) {
        C357088Wk r3 = r19;
        r3.A07.A0D(false);
        int ordinal = A00(r3).ordinal();
        List list2 = list;
        int i2 = i;
        if (ordinal == 0) {
            AnonymousClass8K4 r32 = r3.A09;
            UserStoryTarget userStoryTarget = UserStoryTarget.A09;
            AnonymousClass8K4.A08(r32, (B1O) null, new LD4((DirectShareTarget) null, userStoryTarget, ShareType.REEL_SHARE), (C381539bv) null, (C381779cJ) null, (L8M) null, (AnonymousClass8VT) null, (C15023UKc) null, (Boolean) null, AnonymousClass05K.A00, (String) null, (String) null, (String) null, (String) null, list2, (List) null, i2, false, false);
        } else if (ordinal == 1) {
            r3.A0C.A0O(new LD4((DirectShareTarget) null, UserStoryTarget.A09, ShareType.REEL_SHARE), (C381779cJ) null, (L8M) null, (AnonymousClass8VT) null, (Boolean) null, AnonymousClass05K.A00, (String) null, (String) null, (String) null, (String) null, list2, (List) null, i2, false);
        } else {
            throw new UnsupportedOperationException("Unknown media type");
        }
    }

    private boolean A0B() {
        AnonymousClass8C9 r3 = this.A0A.A1D;
        ReelMoreOptionsModel reelMoreOptionsModel = r3.A03;
        if (reelMoreOptionsModel.A0E || (reelMoreOptionsModel.A00() != null && ((BrandedContentTag) r3.A03.A00().get(0)).A04)) {
            return true;
        }
        return false;
    }

    public static boolean A0C(DialogInterface.OnClickListener onClickListener, C357088Wk r13) {
        AnonymousClass8BA r3 = r13.A0A;
        AnonymousClass8C9 r1 = r3.A1D;
        if (r1.A03.A0H) {
            return false;
        }
        AnonymousClass847 r4 = r13.A03;
        if (r4.A00) {
            return false;
        }
        UserSession userSession = r13.A05;
        if (!AnonymousClass430.A00(userSession)) {
            return false;
        }
        List A002 = r1.A03.A00();
        ArrayList A0V = r3.A0V();
        String A003 = r3.A0Q().A00();
        if (A002 == null) {
            A002 = Collections.emptyList();
        }
        List A022 = r4.A02(userSession, A003, A0V, A002);
        if (A022.isEmpty()) {
            return false;
        }
        r4.A03(r13.A02.requireContext(), new C39926AJs(r13), onClickListener, userSession, AnonymousClass05K.A00, "story", A022);
        return true;
    }

    public final void A0D() {
        UserSession userSession = this.A05;
        AnonymousClass817 r6 = this.A0H;
        C64029LJs.A01(userSession, AnonymousClass000.A00(3777), "cf_story_button", r6.A01);
        A04(this);
        AnonymousClass8BA r3 = this.A0A;
        C351998Bg r9 = r3.A1p;
        C39891ADp aDp = C39891ADp.A00;
        aDp.A01("sink", "close_friend");
        aDp.A00();
        r3.A0Z();
        C2355930l r8 = this.A04;
        UserSession userSession2 = r8.A01;
        int A002 = C63112Krf.A00(userSession2);
        boolean z = !AnonymousClass8BA.A0L(r3);
        if (A002 > 0) {
            if (z && !2D5.A00(r9.A00).A04.getBoolean("PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_STORY_CLOSE_FRIENDS_EDUCATION_HAS_SHOWN", false)) {
                CallerContext callerContext = AnonymousClass8PU.A00;
            }
            C64029LJs.A01(userSession, AnonymousClass000.A00(1702), "cf_story_button", r6.A01);
            this.A07.A0D(false);
            r3.A0a();
            r3.A0X();
            A05(this, (AnonymousClass8VT) null, UserStoryTarget.A02, (String) null, (String) null, true);
            return;
        }
        if (z) {
            CallerContext callerContext2 = AnonymousClass8PU.A00;
        }
        LPM.A01(r8.A00, C62574Ki7.STORY_SHARE_SHORTCUT, userSession2, false, false);
    }

    public final void A0E() {
        if (C271404in.A0E(this.A0A.A0V())) {
            FGM.A04(this.A05, this.A02.requireContext());
            return;
        }
        this.A07.A0D(false);
        int ordinal = A00(this).ordinal();
        if (ordinal == 0) {
            AnonymousClass8K4 r2 = this.A09;
            B1O b1o = this.A0F.A0h;
            UserStoryTarget userStoryTarget = UserStoryTarget.A03;
            r2.A0J(b1o, new LD4((DirectShareTarget) null, userStoryTarget, ShareType.REEL_SHARE), (C381779cJ) null, (L8M) null, (AnonymousClass8VT) null, AnonymousClass05K.A00, (String) null, (String) null, (String) null, false, false);
        } else if (ordinal == 1) {
            this.A0C.A0P(new LD4((DirectShareTarget) null, UserStoryTarget.A03, ShareType.REEL_SHARE), (C381779cJ) null, AnonymousClass05K.A00, (String) null, (String) null, false);
        } else {
            throw new UnsupportedOperationException("Unknown media type");
        }
    }

    public final void A0F(String str) {
        UserSession userSession = this.A05;
        27p.A01(userSession).A1i((Long) null, "SHARED_LISTS_SHARE_CUT_BUTTON", (String) null);
        C49957FGp.A02(this.A00, userSession, new C40528Adb(this), str, (String) null);
    }

    public final void A0G(String str, String str2) {
        AnonymousClass817 r0 = this.A0H;
        r0.A01 = str;
        r0.A00 = str2;
        A04(this);
        if (A0B()) {
            this.A0M.A04(A01(), new C41427Atn(this));
        } else if (A0B() || !this.A0A.A1D.A03.A0G) {
            C357128Wq r1 = this.A0S;
            r1.A07(this.A0T.getContent());
            r1.A04();
        } else {
            this.A0M.A05(A01(), new C41428Ato(this));
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.8Wp, java.lang.Object] */
    public C357088Wk(ViewGroup viewGroup, C357058Wh r9, AnonymousClass847 r10, TouchInterceptorFrameLayout touchInterceptorFrameLayout, C71662eb r12, AnonymousClass8QA r13, AnonymousClass8QN r14, AnonymousClass8K4 r15, AnonymousClass8BA r16, AnonymousClass8L1 r17, AnonymousClass8LU r18, AnonymousClass8MC r19, C3499582p r20, AnonymousClass80D r21, AnonymousClass81T r22, C356848Vl r23, AnonymousClass817 r24, AnonymousClass842 r25, C353788Jb r26, AnonymousClass80U r27, AnonymousClass846 r28, AnonymousClass81B r29, AnonymousClass0eK r30, AnonymousClass0eM r31) {
        AnonymousClass80D r2 = r21;
        this.A0F = r2;
        UserSession userSession = r2.A0S;
        this.A05 = userSession;
        Activity activity = r2.A05;
        this.A00 = activity;
        r2.A0M.getClass();
        AnonymousClass4DH r3 = r2.A0M;
        this.A02 = r3;
        this.A0E = r20;
        this.A0G = r22;
        this.A0I = r27;
        this.A0A = r16;
        this.A03 = r10;
        this.A0P = r25;
        this.A0O = r23;
        this.A07 = r13;
        this.A09 = r15;
        this.A0C = r18;
        this.A0M = r9;
        this.A0Q = r26;
        this.A0N = r12;
        this.A0H = r24;
        this.A0D = r19;
        this.A06 = touchInterceptorFrameLayout;
        this.A04 = new C2355930l(activity, userSession);
        this.A0R = r29;
        this.A08 = r14;
        this.A0B = r17;
        this.A0J = r28;
        this.A01 = viewGroup;
        this.A0K = r30;
        this.A0L = r31;
        C357098Wl r6 = new C357098Wl(this);
        this.A0T = r6;
        1Yl A002 = C357108Wn.A00();
        C357108Wn.A00();
        this.A0S = A002.A00((ViewStub) touchInterceptorFrameLayout.requireViewById(R.id.warning_nudge), r3, userSession, new Object(), r6);
    }
}
