package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lam  reason: case insensitive filesystem */
public abstract class C64370Lam implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A01(__redex_internal_original_name);
    public static final String __redex_internal_original_name = "FacebookAutoShareDialogHelper";

    public static final void A00(Context context, UserSession userSession, C363008it r13, C66461MSp mSp, String str) {
        CharSequence string;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        C363008it r9 = r13;
        String str2 = str;
        AnonymousClass7TG.A1Q(r13, str);
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131961892);
        C299935wF A002 = C363388je.A00(userSession).A00(A00);
        String str3 = A002.A04;
        String A003 = C367158qH.A00(context, userSession, A002);
        int length = str3.length();
        if (length == 0) {
            A01(C368278sM.SUPPRESS, userSession, str, "empty_name");
        }
        if (A003 == null || A003.length() == 0) {
            A01(C368278sM.SUPPRESS, userSession, str, "empty_audience");
        }
        if (length <= 0 || A003 == null || A003.length() == 0) {
            string = context.getResources().getString(2131961889);
        } else {
            Resources resources = context.getResources();
            int i = 2131961890;
            if (27u.A00(userSession).A01()) {
                i = 2131961891;
            }
            string = 0bC.A00(resources, new Object[]{str3, A003}, i);
        }
        0qQ.A0A(string);
        A0Y.A0q(string);
        A0Y.A0r(true);
        A0Y.A0s(true);
        A0Y.A0I(new LUX(mSp, userSession2, r9, str2, 2), 2131972566);
        A0Y.A0H(new LUW(mSp, userSession, str, 2), 2131968513);
        A0Y.A0B(new LU0(userSession, mSp, str, 1));
        DbT.A1V(A0Y);
        0xa A0q = AnonymousClass7TE.A0q(userSession);
        JTS.A1S(A0q, "direct_sharesheet_auto_share_to_fb_dialog_display_count", 0);
        long A0L = JTR.A0L();
        0xY AR4 = A0q.AR4();
        AR4.E5c("last_seen_direct_sharesheet_auto_share_to_fb_dialog_sec", A0L);
        AR4.apply();
        A01(C368278sM.VIEW, userSession, str, (String) null);
        C367998ru.A01(AnonymousClass818.IG_STORY_AFTER_SHARE_SHEET, AnonymousClass819.DIALOG_STORY, userSession);
    }

    public static final void A01(C368278sM r5, UserSession userSession, String str, String str2) {
        AnonymousClass818 r4 = AnonymousClass818.IG_STORY_AFTER_SHARE_SHEET;
        AnonymousClass819 r3 = AnonymousClass819.DIALOG_STORY;
        AnonymousClass81A A0O = JTO.A0O();
        JTT.A1C(A0O, (long) DbT.A00(AnonymousClass7TE.A0q(userSession), "direct_sharesheet_auto_share_to_fb_dialog_display_count"));
        JTQ.A19(A0O, "waterfall_id", str, str2);
        C368288sN.A00(r4, r5, r3, A0O, userSession);
    }
}
