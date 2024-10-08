package X;

import android.content.Context;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.sharelater.ShareLaterMedia;

/* renamed from: X.Laq  reason: case insensitive filesystem */
public final class C64374Laq implements CallerContextable {
    public static 1wn A00 = null;
    public static final CallerContext A01 = CallerContext.A01(__redex_internal_original_name);
    public static final C64374Laq A02 = new Object();
    public static final String __redex_internal_original_name = "FeedShareToFbRowViewBinder";

    public static final void A01(Context context, AnonymousClass4DH r11, UserSession userSession, 1Xj r13, LB7 lb7, C47522E6i e6i, String str, boolean z) {
        1Xj r5 = r13;
        if (r13 != null) {
            String str2 = str;
            H4V h4v = new H4V(context, userSession, r5, lb7, e6i, str2, 1, z);
            ShareLaterMedia shareLaterMedia = new ShareLaterMedia(r13);
            shareLaterMedia.A07 = true;
            r13.A49(AnonymousClass3YP.SHARING);
            1OC A002 = C63413KwZ.A00(userSession, shareLaterMedia, str2, "likes_sheet");
            A002.A00 = h4v;
            r11.schedule(A002);
        }
    }

    public static final void A02(Context context, AnonymousClass4DH r13, UserSession userSession, C61149Jy0 jy0, L75 l75, LB7 lb7, C47522E6i e6i) {
        boolean z;
        L75 l752 = l75;
        1Xj r7 = l752.A02;
        String A0n = C51972G9s.A0n();
        Integer num = jy0.A00;
        Context context2 = context;
        AnonymousClass4DH r5 = r13;
        UserSession userSession2 = userSession;
        LB7 lb72 = lb7;
        C47522E6i e6i2 = e6i;
        if (num != null) {
            z = true;
            if (num.intValue() == 0) {
                C363548ju.A03.A01(userSession, (Integer) null, "after_new_fbc", true, true);
                LJr.A00(userSession).A01(userSession, "after_new_fbc", true);
                C363388je.A00(userSession).A01(A01, new C65247Lpr(context2, r5, userSession2, r7, l752, lb72, e6i2, A0n, z), "likes_sheet");
            }
        }
        z = false;
        C363388je.A00(userSession).A01(A01, new C65247Lpr(context2, r5, userSession2, r7, l752, lb72, e6i2, A0n, z), "likes_sheet");
    }

    public static final void A03(C368278sM r7, UserSession userSession, L75 l75, String str) {
        JZY jzy;
        AnonymousClass818 r6 = AnonymousClass818.IG_SELF_FEED_LIKES_SHEET;
        AnonymousClass819 r3 = AnonymousClass819.ROWSHARE_SINGLE_FEED;
        AnonymousClass81A A0O = JTO.A0O();
        A0O.A06("suppress_reason", str);
        1Xj r5 = l75.A02;
        A0O.A06("ig_media_id", r5.getId());
        C368288sN.A00(r6, r7, r3, A0O, userSession);
        if (r7 == C368278sM.VIEW) {
            jzy = JZY.VIEW;
        } else if (r7 == C368278sM.ACCEPT) {
            jzy = JZY.SHARE_CLICK;
        } else {
            return;
        }
        JZZ jzz = JZZ.FEED;
        0bb r2 = new 0bb();
        r2.A06("media_id", r5.getId());
        JZX.A00(jzy, jzz, r6, r2, userSession);
    }

    public static final void A00(Context context, AnonymousClass4DH r5, UserSession userSession, 1Xj r7, LB7 lb7, C47522E6i e6i, String str, boolean z) {
        if (!DbT.A0j(userSession).CPm()) {
            C363388je.A00(userSession).A01(A01, new C65246Lpq(context, r5, userSession, r7, lb7, e6i, str, z), "likes_sheet");
        } else {
            A01(context, r5, userSession, r7, lb7, e6i, str, z);
        }
    }

    public static final void A04(IgdsButton igdsButton, boolean z) {
        igdsButton.setLoading(z);
        igdsButton.setEnabled(!z);
        Context A0S = AnonymousClass7TE.A0S(igdsButton);
        Object systemService = A0S.getSystemService("accessibility");
        0qQ.A0C(systemService, AnonymousClass000.A00(327));
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        if (2eO.A02(accessibilityManager, true)) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
            obtain.getText().add(A0S.getResources().getString(2131965494));
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }
}
