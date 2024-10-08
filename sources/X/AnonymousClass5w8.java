package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.ViewConfiguration;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.crossposting.feed.graphql.FetchFBToIGDefaultAudienceApi;

/* renamed from: X.5w8  reason: invalid class name */
public final class AnonymousClass5w8 implements AnonymousClass0lh, CallerContextable {
    public static final CallerContext A04 = CallerContext.A00(AnonymousClass5w8.class);
    public static final AnonymousClass5w9 A05 = new Object();
    public static final String __redex_internal_original_name = "FeedCrosspostingAudienceSettingManager";
    public AnonymousClass3Q2 A00;
    public C295095nZ A01;
    public final UserSession A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9L5(this, 36));

    public AnonymousClass5w8(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
    }

    public final synchronized C295095nZ A04() {
        return this.A01;
    }

    public final void A06(Context context, FragmentActivity fragmentActivity, UserSession userSession, MSE mse, String str) {
        0qQ.A0B(userSession, 4);
        K51 A002 = C63224KtV.A00(str);
        MSE mse2 = mse;
        A002.A01 = new C65254Lpy(mse, this);
        C331127Pr r1 = new C331127Pr(userSession);
        r1.A0a = false;
        Context context2 = context;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        r1.A0U = new C65744Lyy(context2, fragmentActivity2, userSession, mse2, this, str);
        r1.A0F = ViewConfiguration.get(fragmentActivity).getScaledPagingTouchSlop();
        r1.A00().A02(fragmentActivity, A002);
    }

    public final synchronized void A07(Context context, String str) {
        C44645CiP.A00(this.A02, new Lq2(context, this, str));
    }

    public final synchronized void A08(C3034168s r7) {
        String str;
        AnonymousClass619 r4;
        UserSession userSession = this.A02;
        if (182.A06(0Tu.A05, userSession, 36323015163652850L)) {
            AnonymousClass614 A002 = A00(this);
            if (!(A002 == null || A002.getOptionalStringField(0, "fb_feed_default_audience") == null)) {
                str = A002.getOptionalStringField(0, "fb_feed_default_audience");
                r4 = new Lq4(r7, this);
            }
        } else {
            str = null;
            r4 = new AnonymousClass618(r7, this);
        }
        1vn A012 = 1vm.A01(userSession);
        1Ef A003 = FetchFBToIGDefaultAudienceApi.A00(userSession);
        A012.ATL(new AnonymousClass61E(r4), new AnonymousClass61D(userSession, r4, str), A003);
    }

    public final synchronized void A09(C3034168s r3, String str) {
        C295095nZ r0 = this.A01;
        if (r0 == null || !r0.A00) {
            C44645CiP.A00(this.A02, new Lq1(r3, this, str));
        }
    }

    public final synchronized void A0A(C295095nZ r2) {
        this.A01 = r2;
    }

    public final synchronized boolean A0B() {
        boolean z;
        C295095nZ r0 = this.A01;
        z = true;
        if (r0 == null || !r0.A00) {
            z = false;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (A0B() != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A0C(com.instagram.common.session.UserSession r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            X.0qQ.A0B(r3, r0)     // Catch:{ all -> 0x0015 }
            boolean r0 = X.AnonymousClass5w9.A01(r3)     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0012
            boolean r1 = r2.A0B()     // Catch:{ all -> 0x0015 }
            r0 = 1
            if (r1 == 0) goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            monitor-exit(r2)
            return r0
        L_0x0015:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5w8.A0C(com.instagram.common.session.UserSession):boolean");
    }

    public static final AnonymousClass614 A00(AnonymousClass5w8 r4) {
        C299945wG r42 = ((C363378jd) r4.A03.getValue()).A00(A04).A00;
        if (r42 != null) {
            return (AnonymousClass614) r42.getOptionalTreeField(1, "fb_feed_privacy_setting_service_data", AnonymousClass614.class, -2058546846);
        }
        return null;
    }

    public static final synchronized void A01(UserSession userSession, Context context, String str) {
        synchronized (AnonymousClass5w8.class) {
            A05.A03(userSession, context, str);
        }
    }

    public final SpannableStringBuilder A02(Context context, FragmentActivity fragmentActivity) {
        UserSession userSession = this.A02;
        String string = context.getString(2131973565);
        0qQ.A07(string);
        Spanned A002 = 0bC.A00(context.getResources(), new Object[]{string}, 2131962274);
        0qQ.A07(A002);
        return C59912Jbb.A01(A002, fragmentActivity, userSession, string, "fb_to_ig_feed_default_audience", "https://www.facebook.com/help/2808345489420767?ref=learn_more");
    }

    public final String A05(Context context, UserSession userSession) {
        AnonymousClass0eM r2 = this.A03;
        CallerContext callerContext = A04;
        ((C363378jd) r2.getValue()).A00(callerContext);
        boolean A022 = C363388je.A02(((C363378jd) r2.getValue()).A00(callerContext));
        AnonymousClass5w9.A00(userSession);
        return C59912Jbb.A02(context, AnonymousClass5w9.A00(userSession).A01, A022);
    }

    public final void onSessionWillEnd() {
        this.A02.A03(AnonymousClass5w8.class);
    }

    public final SpannableStringBuilder A03(Context context, FragmentActivity fragmentActivity, MSE mse, String str) {
        String string = context.getString(2131952006);
        0qQ.A07(string);
        String string2 = context.getString(2131973685, new Object[]{string});
        0qQ.A07(string2);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        MSE mse2 = mse;
        C62145Kay kay = new C62145Kay(context, fragmentActivity2, mse2, this, str, context.getColor(2Yu.A06(context)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        AnonymousClass7AV.A04(spannableStringBuilder, kay, string);
        return spannableStringBuilder;
    }
}
