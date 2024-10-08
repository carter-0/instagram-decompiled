package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig;
import com.facebook.common.dextricks.Constants;
import com.facebook.iabadscontext.IABAdsBwIntegrationExtension;
import com.facebook.iabadscontext.IABAdsContext;
import com.facebook.iabadscontext.IABDummyContext;
import com.facebook.iabbwpextension.IABBwPContext;
import com.facebook.privacy.zone.api.ZonedValue;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDict;
import com.instagram.common.session.UserSession;
import com.instagram.inappbrowser.launcher.ExternalBrowserLauncher;
import java.util.Collections;
import java.util.List;

public final class SUL {
    public static final 0TC A1N = new Object();
    public double A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public Parcelable A06;
    public Parcelable A07;
    public Parcelable A08;
    public RIg A09;
    public 1yd A0A;
    public IABAdsContext A0B;
    public IABBwPContext A0C;
    public ZonePolicy A0D;
    public IGAdsIABScreenshotDataDict A0E;
    public C273494mf A0F;
    public C273414mX A0G;
    public C13678Ten A0H;
    public C13823Tht A0I;
    public C262944Gp A0J;
    public S6e A0K;
    public SHR A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public List A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public boolean A1A;
    public boolean A1B;
    public boolean A1C;
    public boolean A1D;
    public boolean A1E;
    public int[] A1F;
    public ExternalBrowserLauncher A1G;
    public final Activity A1H;
    public final Context A1I;
    public final ZonedValue A1J;
    public final UserSession A1K;
    public final C7572QKn A1L;
    public final 2EG A1M;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.QKn, X.SDT] */
    public SUL(Context context, UserSession userSession, 2EG r10, String str, boolean z) {
        ZonedValue zonedValue;
        ExternalBrowserLauncher externalBrowserLauncher;
        boolean z2;
        int A022 = DbW.A02(1, context, userSession);
        0qQ.A0B(r10, 4);
        this.A1L = new SDT();
        this.A1K = userSession;
        Activity activity = null;
        if (str != null) {
            zonedValue = new ZonedValue(ZonePolicy.A0F, str);
        } else {
            zonedValue = null;
        }
        this.A1J = zonedValue;
        this.A1M = r10;
        activity = context instanceof Activity ? (Activity) context : activity;
        this.A1H = activity;
        this.A1I = context;
        this.A0T = Collections.emptyList();
        int i = 1;
        this.A0r = true;
        this.A0O = "";
        this.A0c = true;
        this.A03 = 0.5f;
        this.A04 = A022;
        this.A0y = true;
        this.A0Z = true;
        this.A19 = true;
        this.A05 = 4;
        this.A02 = 0.5f;
        this.A0A = new 1yd(userSession);
        if (activity != null) {
            this.A1G = externalBrowserLauncher;
            Window window = activity.getWindow();
            if (window != null) {
                View decorView = window.getDecorView();
                0qQ.A07(decorView);
                z2 = !2db.A0B(decorView, window);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else {
            externalBrowserLauncher = new ExternalBrowserLauncher(context, userSession);
            this.A1G = externalBrowserLauncher;
            z2 = false;
        }
        this.A0o = z2;
        UserSession userSession2 = this.A1K;
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession2, 36321284292093163L)) {
            i = 3;
        } else if (!182.A06(r3, this.A1K, 36321284291896553L)) {
            i = 2;
        }
        this.A04 = i;
    }

    public static final void A03(C340017kY r8, SUL sul) {
        View view;
        C7572QKn qKn = sul.A1L;
        C12800T7n t7n = new C12800T7n(qKn.A00(), (String) null);
        UserSession userSession = sul.A1K;
        1Xj A022 = 1E7.A00(userSession).A02(SDT.A00(qKn));
        IL7 il7 = new IL7(sul, 1);
        if (A022 != null && (view = r8.A0B) != null) {
            C238833Dp.A00(userSession).A0A(view, new C246153e7(il7, userSession, A022, t7n));
            C238833Dp.A00(userSession).A07(view, C238863Ds.STORY, new String[0], 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r0 != true) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A07(android.view.MotionEvent r5, X.SUL r6, boolean r7) {
        /*
            r4 = 0
            if (r5 == 0) goto L_0x0036
            if (r7 != 0) goto L_0x0036
            X.SHR r3 = r6.A0L
            r2 = 1
            if (r3 == 0) goto L_0x0019
            float r1 = r5.getRawX()
            float r0 = r5.getRawY()
            boolean r0 = r3.A01(r1, r0)
            r3 = 1
            if (r0 == r2) goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            float r2 = r5.getRawY()
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r6.A03
            float r1 = r1 - r0
            android.content.Context r0 = r6.A1I
            int r0 = X.AnonymousClass0nB.A00(r0)
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1R(r0)
            if (r3 != 0) goto L_0x0036
            if (r0 != 0) goto L_0x0036
            r4 = 1
        L_0x0036:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUL.A07(android.view.MotionEvent, X.SUL, boolean):boolean");
    }

    public final void A0A() {
        A02((Fragment) null, this, 0);
    }

    private final String A00(Uri uri) {
        String queryParameter;
        if (uri == null) {
            return null;
        }
        String queryParameter2 = uri.getQueryParameter("fbclid");
        if (queryParameter2 != null || (queryParameter = uri.getQueryParameter("u")) == null) {
            return queryParameter2;
        }
        return A00(0cp.A00(A1N, queryParameter));
    }

    public static final void A01(Intent intent, Fragment fragment, C11038S6q s6q, SUL sul, int i) {
        SPF A002;
        FragmentActivity fragmentActivity;
        AnonymousClass37D A0i2;
        IABAdsBwIntegrationExtension iABAdsBwIntegrationExtension;
        if (sul.A0Q == null && ((A002 = SPF.A08.A00(intent)) == null || !A002.A03())) {
            IABAdsContext iABAdsContext = sul.A0B;
            Integer num = null;
            if (!(iABAdsContext == null || (iABAdsBwIntegrationExtension = iABAdsContext.A00) == null)) {
                num = iABAdsBwIntegrationExtension.A01;
            }
            if (num != AnonymousClass05K.A0N && !sul.A0w && (((fragmentActivity = sul.A1H) == null || (A0i2 = DbT.A0i(fragmentActivity)) == null || !((AnonymousClass37F) A0i2).A0g) && sul.A05())) {
                UserSession userSession = sul.A1K;
                if (182.A06(0Tu.A05, userSession, 36322564192086262L)) {
                    if (fragmentActivity != null) {
                        intent.putExtras(s6q.A00());
                        Bundle A0a2 = AnonymousClass7TE.A0a();
                        A0a2.putParcelable("BrowserLiteIntent.ACTIVITY_INTENT", intent);
                        A0a2.putBoolean("arg_should_hide_tab_widget", true);
                        AnonymousClass0Dg.A00(A0a2, userSession);
                        Uri data = intent.getData();
                        if (data == null) {
                            data = Uri.EMPTY;
                        }
                        0qQ.A0A(data);
                        IABViewModeLaunchConfig.FullScreen fullScreen = IABViewModeLaunchConfig.FullScreen.A00;
                        IabCommonTrait iabCommonTrait = sul.A0B;
                        if (iabCommonTrait == null) {
                            iabCommonTrait = new IABDummyContext(0sn.A00);
                        }
                        C340017kY A003 = A0O.A00(data, iabCommonTrait, fullScreen, intent.getLongExtra("BrowserLiteIntent.IABLoggingExtras.IAB_USER_CLICK_TS", -1));
                        A003.setArguments(A0a2);
                        0qQ.A0C(fragmentActivity, AnonymousClass000.A00(22));
                        C309516Yo A0M2 = DbS.A0M(fragmentActivity, userSession);
                        A0M2.A0D(A003);
                        A0M2.A04();
                        return;
                    }
                    return;
                }
            }
        }
        intent.putExtras(s6q.A00());
        intent.setFlags(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
        Activity activity = sul.A1H;
        if (activity != null) {
            C71342cb.A00(sul.A1K).A06(activity);
        } else {
            C71342cb.A00(sul.A1K).A0D(new T61(sul), "button", 0);
        }
        if (fragment != null && fragment.getContext() != null) {
            0kR.A05(fragment, intent, i);
        } else if (i == 0) {
            0kR.A0B(sul.A1I, intent);
        } else if (activity != null) {
            0kR.A07(activity, intent, i);
        } else {
            throw AnonymousClass7TE.A0y();
        }
    }

    public static final void A04(C340017kY r4, SUL sul, int i) {
        AnonymousClass37D r0;
        float f;
        if (182.A06(0Tu.A05, sul.A1K, 36321284292289774L)) {
            Activity activity = sul.A1H;
            if (activity != null) {
                r0 = DbT.A0i(activity);
            } else {
                r0 = null;
            }
            QLA C8U = r4.C8U();
            if (C8U != null && r0 != null) {
                C7218Pzn pzn = ((AnonymousClass37F) r0).A0D;
                if (pzn != null) {
                    f = pzn.A0E(i);
                } else {
                    f = 0.0f;
                }
                int round = Math.round(f);
                int A082 = 0nA.A08(sul.A1I) - round;
                C10729Rx8 rx8 = C8U.A0G;
                rx8.A01 = A082;
                QLA.A00(C8U);
                if (rx8.A04 && rx8.A03) {
                    C8U.A0F(002.A0c("(function () { window.__screen_top_override__ = ", "; })()", A082));
                }
                C10729Rx8 rx82 = C8U.A0G;
                rx82.A00 = round;
                QLA.A00(C8U);
                if (rx82.A04 && rx82.A03) {
                    C8U.A0F(002.A0c("(function () { window.__outer_height_override__ = ", "; })()", round));
                }
            }
        }
    }

    private final boolean A05() {
        C7572QKn qKn = this.A1L;
        if (qKn.A00.getString("TrackingInfo.ARG_AD_ID") == null || qKn.A00.getString("TrackingInfo.ARG_TRACKING_TOKEN") == null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (X.182.A06(X.0Tu.A05, r9.A1K, 36315022229769161L) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (X.182.A06(X.0Tu.A05, r9.A1K, 36315022229638088L) == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A06() {
        /*
            r9 = this;
            com.facebook.privacy.zone.policy.ZonePolicy r1 = r9.A0D
            r8 = 0
            if (r1 == 0) goto L_0x0097
            com.facebook.privacy.zone.policy.ZonePolicy r0 = com.facebook.privacy.zone.policy.ZonePolicy.A0D
            if (r1 != r0) goto L_0x0019
            com.instagram.common.session.UserSession r3 = r9.A1K
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315022229638088(0x81045200020bc8, double:3.0291045146559454E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r7 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r7 = 0
        L_0x001a:
            com.facebook.privacy.zone.policy.ZonePolicy r1 = r9.A0D
            com.facebook.privacy.zone.policy.ZonePolicy r0 = com.facebook.privacy.zone.policy.ZonePolicy.A0F
            if (r1 != r0) goto L_0x0030
            com.instagram.common.session.UserSession r3 = r9.A1K
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315022229769161(0x81045200040bc9, double:3.0291045147388365E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r6 = 1
            if (r0 != 0) goto L_0x0031
        L_0x0030:
            r6 = 0
        L_0x0031:
            java.lang.String r5 = r9.A09()
            if (r5 == 0) goto L_0x006d
            com.instagram.common.session.UserSession r4 = r9.A1K
            X.1Av r3 = X.1Au.A00(r4)
            X.0s0 r2 = r3.A7C
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 168(0xa8, float:2.35E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r3, r2, r1, r0)
            if (r0 == 0) goto L_0x006d
            X.2EG r1 = r9.A1M
            X.2EG r0 = X.2EG.A1V
            if (r1 != r0) goto L_0x006d
            if (r6 == 0) goto L_0x006d
            X.T60 r0 = new X.T60
            r0.<init>(r9)
            X.0wc r1 = X.AnonymousClass0kN.A01(r0, r4)
            java.lang.String r0 = "mwb_safe_browsing_warning_events"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = "message_url_clicked"
            X.Pxh.A19(r1, r0, r5)
        L_0x006d:
            com.instagram.common.session.UserSession r4 = r9.A1K
            X.1Av r3 = X.1Au.A00(r4)
            X.0s0 r2 = r3.A7C
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 168(0xa8, float:2.35E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r3, r2, r1, r0)
            if (r0 == 0) goto L_0x0097
            X.2EG r1 = r9.A1M
            X.2EG r0 = X.2EG.A1V
            if (r1 != r0) goto L_0x0097
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313579122395260(0x810302001d087c, double:3.0281918878246545E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x0096
            if (r7 != 0) goto L_0x0096
            if (r6 == 0) goto L_0x0097
        L_0x0096:
            r8 = 1
        L_0x0097:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUL.A06():boolean");
    }

    public static final boolean A08(SUL sul) {
        return 182.A06(0Tu.A05, sul.A1K, 36321284292224237L);
    }

    public final String A09() {
        if (this.A1J == null) {
            return null;
        }
        ZonePolicy zonePolicy = ZonePolicy.A0F;
        Integer num = AnonymousClass05K.A08;
        C9011RLf EJX = Pxg.A0R().EJX(new C12191Sog(this), zonePolicy, "UNKNOWN");
        0qQ.A07(EJX);
        Object A002 = RWG.A00(EJX);
        0qQ.A07(A002);
        ZonedValue zonedValue = (ZonedValue) A002;
        0qQ.A0B(zonedValue, 0);
        return (String) Pxg.A0R().FJK(zonedValue, num);
    }

    public final void A0B(String str) {
        this.A1L.A00.putString("TrackingInfo.ARG_AD_ID", str);
    }

    public final void A0C(String str) {
        this.A1L.A00.putString("TrackingInfo.ARG_MEDIA_ID", str);
    }

    public final void A0D(String str) {
        this.A1L.A00.putString("TrackingInfo.ARG_TRACKING_TOKEN", str);
    }

    public final void A0E(String str) {
        this.A1L.A00.putString("TrackingInfo.ARG_USER_ID", str);
    }

    public final void A0F(String str) {
        this.A1L.A00.putString("TrackingInfo.ARG_REEL_VIEWER_SESSION_ID", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        if (X.182.A06(X.0Tu.A06, r4.A1K, 36320579917718161L) == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G(boolean r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0012
            com.instagram.common.session.UserSession r3 = r4.A1K
            X.0Tu r2 = X.0Tu.A06
            r0 = 36320579917718161(0x81096000082291, double:3.032619218976797E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            r4.A0n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUL.A0G(boolean):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0728: MOVE  (r0v448 java.lang.Integer) = (r40v0 java.lang.Integer)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0169 A[RETURN] */
    public static final void A02(androidx.fragment.app.Fragment r45, X.SUL r46, int r47) {
        /*
            r4 = r46
            X.QKn r11 = r4.A1L
            boolean r2 = r4.A0o
            android.os.Bundle r1 = r11.A00
            java.lang.String r0 = "TrackingInfo.ARG_HIDE_SYSTEM_BAR"
            r1.putBoolean(r0, r2)
            java.lang.String r2 = r4.A0S
            boolean r0 = r4.A05()
            if (r0 != 0) goto L_0x1108
            java.lang.String r2 = "N/A"
        L_0x0017:
            android.os.Bundle r1 = r11.A00
            java.lang.String r0 = "TrackingInfo.ARG_MODULE_NAME"
            r1.putString(r0, r2)
            X.2EG r0 = r4.A1M
            r44 = r0
            boolean r0 = r4.A05()
            if (r0 != 0) goto L_0x1102
            java.lang.String r2 = ""
        L_0x002a:
            android.os.Bundle r1 = r11.A00
            java.lang.String r0 = "Tracking.ARG_CLICK_SOURCE"
            r1.putString(r0, r2)
            java.lang.String r16 = r4.A09()
            if (r16 == 0) goto L_0x0094
            com.instagram.common.session.UserSession r6 = r4.A1K
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313579123706000(0x81030200310890, double:3.028191888653572E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0094
            android.net.Uri r5 = X.Pxg.A0L(r16)
            if (r5 == 0) goto L_0x006f
            java.lang.String r1 = r5.getScheme()
            if (r1 == 0) goto L_0x006f
            java.lang.String r0 = "instagram"
            boolean r3 = r1.equals(r0)
        L_0x0058:
            r0 = 2342156588337662100(0x2081030200350894, double:4.06014152203E-152)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 != 0) goto L_0x0071
            if (r3 == 0) goto L_0x0094
        L_0x0065:
            android.content.Intent r1 = X.DbX.A09(r16)
            android.content.Context r0 = r4.A1I
            X.0kR.A0A(r0, r1)
        L_0x006e:
            return
        L_0x006f:
            r3 = 0
            goto L_0x0058
        L_0x0071:
            r2 = 0
            if (r3 == 0) goto L_0x0094
            if (r5 == 0) goto L_0x00c3
            java.lang.String r1 = r5.getHost()
        L_0x007a:
            java.lang.String r0 = "extbrowser"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0065
            X.0wj r1 = X.0wj.A01
            r0 = 817894891(0x30c015eb, float:1.3976068E-9)
            if (r5 == 0) goto L_0x008d
            java.lang.String r2 = r5.getHost()
        L_0x008d:
            X.0f9 r0 = r1.AEf(r2, r0)
            r0.report()
        L_0x0094:
            com.instagram.inappbrowser.launcher.ExternalBrowserLauncher r9 = r4.A1G
            X.0qQ.A0A(r9)
            java.lang.String r12 = r4.A0P
            android.os.Bundle r1 = r11.A00
            java.lang.String r22 = "TrackingInfo.ARG_MEDIA_ID"
            r0 = r22
            r1.getString(r0)
            android.os.Bundle r1 = r11.A00
            java.lang.String r29 = "TrackingInfo.ARG_AD_ID"
            r0 = r29
            java.lang.String r2 = r1.getString(r0)
            android.os.Bundle r1 = r11.A00
            java.lang.String r0 = "TrackingInfo.ARG_TRACKING_TOKEN"
            java.lang.String r8 = r1.getString(r0)
            boolean r7 = r4.A0v
            boolean r6 = r4.A0u
            r10 = r16
            r15 = 0
            if (r16 == 0) goto L_0x0262
            r5 = 0
            if (r2 == 0) goto L_0x00d6
            goto L_0x00c5
        L_0x00c3:
            r1 = r2
            goto L_0x007a
        L_0x00c5:
            long r0 = java.lang.Long.parseLong(r2)     // Catch:{ NullPointerException | NumberFormatException -> 0x00ce }
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch:{ NullPointerException | NumberFormatException -> 0x00ce }
            goto L_0x00d6
        L_0x00ce:
            r2 = move-exception
            java.lang.String r1 = "com.instagram.inappbrowser.launcher.ExternalBrowserLauncher"
            java.lang.String r0 = "Can't parse AdId invalid format"
            X.0wb.A06(r1, r0, r2)
        L_0x00d6:
            if (r5 == 0) goto L_0x021d
            r14 = 1
            java.lang.Integer r2 = r9.A02()
        L_0x00dd:
            java.lang.Integer r0 = X.AnonymousClass05K.A0F
            boolean r0 = r2.equals(r0)
            r13 = r0 ^ 1
            if (r13 == 0) goto L_0x021a
            r0 = 1
            r9.A02 = r0
            if (r14 == 0) goto L_0x01c3
            boolean r12 = r9.A03(r12, r10)
            com.instagram.common.session.UserSession r0 = r9.A05
            X.1Av r3 = X.1Au.A00(r0)
            long r0 = java.lang.System.currentTimeMillis()
            X.0xa r3 = r3.A01
            X.0xY r10 = r3.AR4()
            java.lang.String r3 = "sys_browser_last_open_time"
            r10.E5c(r3, r0)
            r10.apply()
        L_0x0109:
            if (r12 != 0) goto L_0x021a
            if (r14 == 0) goto L_0x01bf
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unable to launch external browser for Ad Id:"
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r5, r0, r1)
        L_0x0117:
            java.lang.String r0 = "com.instagram.inappbrowser.launcher.ExternalBrowserLauncher"
            X.0wb.A03(r0, r1)
        L_0x011c:
            com.instagram.common.session.UserSession r1 = r9.A05
            X.T5w r0 = new X.T5w
            r0.<init>()
            X.0wc r1 = X.AnonymousClass0kN.A01(r0, r1)
            java.lang.String r0 = "iab_browser_choice_selection"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0167
            if (r15 == 0) goto L_0x01bb
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x0137:
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x01b5;
                case 1: goto L_0x01b8;
                default: goto L_0x013e;
            }
        L_0x013e:
            java.lang.String r1 = "EXTERNAL_BROWSER_FLOW_WITH_DEFAULT_BROWSER_CHOSEN"
        L_0x0140:
            java.lang.String r0 = "selection_experience"
            r3.AAJ(r0, r1)
            if (r14 != 0) goto L_0x0149
            r5 = 0
        L_0x0149:
            java.lang.String r0 = "ad_id"
            r3.A9F(r0, r5)
            X.C51965G9l.A1L(r3, r8)
            if (r6 == 0) goto L_0x01ac
            java.lang.Integer r2 = X.AnonymousClass05K.A0E
        L_0x0155:
            int r0 = r2.intValue()
            switch(r0) {
                case 0: goto L_0x016a;
                case 1: goto L_0x016d;
                case 2: goto L_0x0170;
                case 3: goto L_0x0173;
                case 4: goto L_0x0176;
                case 5: goto L_0x0179;
                case 6: goto L_0x017c;
                case 7: goto L_0x017f;
                case 8: goto L_0x0182;
                case 9: goto L_0x0185;
                case 10: goto L_0x0188;
                case 11: goto L_0x018b;
                case 12: goto L_0x018e;
                case 13: goto L_0x0191;
                case 14: goto L_0x0194;
                case 15: goto L_0x0197;
                case 16: goto L_0x019a;
                case 17: goto L_0x019d;
                case 18: goto L_0x01a0;
                case 19: goto L_0x01a3;
                case 20: goto L_0x01a6;
                case 21: goto L_0x01a9;
                default: goto L_0x015c;
            }
        L_0x015c:
            java.lang.String r1 = "NONE"
        L_0x015e:
            java.lang.String r0 = "reason"
            r3.AAJ(r0, r1)
            r3.Cgf()
        L_0x0167:
            if (r15 == 0) goto L_0x0262
            return
        L_0x016a:
            java.lang.String r1 = "SHOULD_OVERRIDE_TO_EXTERNAL_BROWSER_FOR_AD"
            goto L_0x015e
        L_0x016d:
            java.lang.String r1 = "SHOULD_OVERRIDE_TO_EXTERNAL_BROWSER_FOR_ORGANIC"
            goto L_0x015e
        L_0x0170:
            java.lang.String r1 = "ENABLE_EXTERNAL_BROWSER_FOR_AD"
            goto L_0x015e
        L_0x0173:
            java.lang.String r1 = "ENABLE_EXTERNAL_BROWSER_FOR_ORGANIC"
            goto L_0x015e
        L_0x0176:
            java.lang.String r1 = "INSTAGRAM_EXTBROWSER_DEEPLINK_URL_HANDLER"
            goto L_0x015e
        L_0x0179:
            java.lang.String r1 = "REDIRECT_ONCE_EVERY_N_DAYS"
            goto L_0x015e
        L_0x017c:
            java.lang.String r1 = "HORIZON_LINK"
            goto L_0x015e
        L_0x017f:
            java.lang.String r1 = "CHROME_CUSTOM_TABS"
            goto L_0x015e
        L_0x0182:
            java.lang.String r1 = "CHROME_MEASUREMENT_SUPPORT_EXP"
            goto L_0x015e
        L_0x0185:
            java.lang.String r1 = "BROWSER_IPC_FORCE_IN_APP_BROWSER"
            goto L_0x015e
        L_0x0188:
            java.lang.String r1 = "BROWSER_IPC_FORCE_EXTERNAL_BROWSER"
            goto L_0x015e
        L_0x018b:
            java.lang.String r1 = "ACTIVITY_EXTRAS_SKIP_IN_APP_BROWSER"
            goto L_0x015e
        L_0x018e:
            java.lang.String r1 = "ENABLE_EXTERNAL_LOW_SPACE"
            goto L_0x015e
        L_0x0191:
            java.lang.String r1 = "BROWSER_DISABLED_PREF"
            goto L_0x015e
        L_0x0194:
            java.lang.String r1 = "BROWSER_DISABLED_INSIDE_MESSAGING_PREF"
            goto L_0x015e
        L_0x0197:
            java.lang.String r1 = "NO_INTENT_DATA"
            goto L_0x015e
        L_0x019a:
            java.lang.String r1 = "EXTERNAL_BROWSER_BLOCKLIST_EXTERNAL_BROWSER_URI_RESOLVER"
            goto L_0x015e
        L_0x019d:
            java.lang.String r1 = "IAB_DISABLED"
            goto L_0x015e
        L_0x01a0:
            java.lang.String r1 = "FB_WATCH_AND_BROWSE"
            goto L_0x015e
        L_0x01a3:
            java.lang.String r1 = "PACKAGE_NOT_FOUND_FALLBACK"
            goto L_0x015e
        L_0x01a6:
            java.lang.String r1 = "STORY_SWIPE_SHOULD_OVERRIDE_DBD"
            goto L_0x015e
        L_0x01a9:
            java.lang.String r1 = "STORY_CTA_TAP_WITH_SWIPE_RELAXATION_SHOULD_OVERRIDE_DBD"
            goto L_0x015e
        L_0x01ac:
            if (r7 == 0) goto L_0x01b1
            java.lang.Integer r2 = X.AnonymousClass05K.A0D
            goto L_0x0155
        L_0x01b1:
            if (r15 != 0) goto L_0x0155
            r1 = 0
            goto L_0x015e
        L_0x01b5:
            java.lang.String r1 = "IAW"
            goto L_0x0140
        L_0x01b8:
            java.lang.String r1 = "WATCH_AND_BROWSE_IAW"
            goto L_0x0140
        L_0x01bb:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0137
        L_0x01bf:
            java.lang.String r1 = "Unable to launch external browser."
            goto L_0x0117
        L_0x01c3:
            boolean r0 = com.instagram.inappbrowser.launcher.ExternalBrowserLauncher.A00(r16)
            if (r0 == 0) goto L_0x0214
            boolean r0 = com.instagram.inappbrowser.launcher.ExternalBrowserLauncher.A00(r16)
            if (r0 == 0) goto L_0x0214
            android.net.Uri r1 = X.Pxg.A0L(r16)
            if (r1 == 0) goto L_0x0214
            java.lang.String r3 = "instagram"
            boolean r0 = X.C11324SMy.A01(r1)
            if (r0 != 0) goto L_0x01ec
            java.lang.String r0 = "u"
            java.lang.String r0 = r1.getQueryParameter(r0)     // Catch:{ Exception -> 0x01f9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x01f9 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01f9
        L_0x01ec:
            java.lang.String r0 = "u"
            java.lang.String r0 = r1.getQueryParameter(r0)
            if (r0 == 0) goto L_0x01f9
            android.net.Uri r1 = X.Pxg.A0L(r0)
        L_0x01f9:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0210
            java.lang.String r0 = "UTF-8"
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r0)     // Catch:{ UnsupportedEncodingException -> 0x0205 }
        L_0x0205:
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.lang.String r0 = "r"
            android.net.Uri r1 = X.DbV.A08(r1, r0, r3)
        L_0x0210:
            java.lang.String r10 = r1.toString()
        L_0x0214:
            boolean r12 = r9.A03(r10, r10)
            goto L_0x0109
        L_0x021a:
            r15 = r13
            goto L_0x011c
        L_0x021d:
            r14 = 0
            com.instagram.common.session.UserSession r3 = r9.A05
            X.1Av r13 = X.1Au.A00(r3)
            X.0s0 r2 = r13.A15
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 476(0x1dc, float:6.67E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r13, r2, r1, r0)
            if (r0 == 0) goto L_0x0234
            java.lang.Integer r2 = X.AnonymousClass05K.A06
            goto L_0x00dd
        L_0x0234:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313579120691300(0x81030200030864, double:3.0281918867470633E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0245
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            goto L_0x00dd
        L_0x0245:
            r0 = 36313579120953448(0x81030200070868, double:3.028191886912847E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0254
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            goto L_0x00dd
        L_0x0254:
            boolean r0 = com.instagram.inappbrowser.launcher.ExternalBrowserLauncher.A00(r16)
            if (r0 == 0) goto L_0x025e
            java.lang.Integer r2 = X.AnonymousClass05K.A0u
            goto L_0x00dd
        L_0x025e:
            java.lang.Integer r2 = X.AnonymousClass05K.A0F
            goto L_0x00dd
        L_0x0262:
            com.instagram.common.session.UserSession r3 = r4.A1K
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329788327084361(0x8111c000004149, double:3.0384426541392704E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0286
            r0 = 36329788327215434(0x8111c00002414a, double:3.0384426542221615E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0286
            android.content.Context r1 = r4.A1I
            X.S2I r0 = new X.S2I
            r0.<init>(r1)
            r0.A00()
        L_0x0286:
            r8 = 1
            X.SSR.A07 = r8
            X.02m r12 = X.02m.A0p
            r6 = 19791876(0x12e0004, float:3.1958764E-38)
            r9 = 0
            long r26 = java.lang.System.nanoTime()
            java.util.concurrent.TimeUnit r28 = java.util.concurrent.TimeUnit.NANOSECONDS
            r23 = r12
            r24 = r6
            r25 = r9
            r23.markerStart(r24, r25, r26, r28)
            boolean r1 = r4.A05()
            java.lang.String r0 = "is_ads_traffic"
            r12.markerAnnotate(r6, r0, r1)
            if (r16 == 0) goto L_0x1122
            r21 = 0
            android.net.Uri r20 = X.0cp.A03(r16)     // Catch:{ RuntimeException -> 0x1127 }
            java.lang.String r5 = X.C51972G9s.A0n()
            com.facebook.iabadscontext.IABAdsContext r7 = r4.A0B
            r0 = 36315992892510045(0x81053400060f5d, double:3.0297183657647167E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x035a
            if (r7 == 0) goto L_0x035a
            com.google.common.collect.ImmutableList r1 = r7.A06
            X.RFY r0 = X.RFY.IAB_META_CHECKOUT_SDK
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x035a
            r0 = 36315992892444508(0x81053400050f5c, double:3.029718365723271E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x035a
            r17 = 1
            android.content.Context r1 = r4.A1I
            java.lang.String r0 = "LITE_CHECKOUT"
            X.QKY r13 = new X.QKY
            r13.<init>(r1, r3, r0)
            r0 = r20
            X.0qQ.A0B(r0, r8)
            android.net.Uri$Builder r1 = r20.buildUpon()
            java.lang.String r0 = "mcst"
            r1.appendQueryParameter(r0, r5)
            android.net.Uri r20 = r1.build()
            java.lang.String r10 = X.DbT.A10(r20)
            java.lang.String r14 = r7.A09
            if (r14 != 0) goto L_0x02ff
            java.lang.String r14 = ""
        L_0x02ff:
            r0 = 2
            X.0qQ.A0B(r14, r0)
            X.0wc r1 = r13.A0C()
            java.lang.String r0 = "client_add_metacheckoututm_success"
            X.0Aj r7 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r7.isSampled()
            if (r0 == 0) goto L_0x035c
            java.lang.String r1 = ""
            java.lang.String r0 = X.C46326Dbu.A00()
            r7.AAJ(r0, r1)
            X.2M7 r0 = X.2M7.A0G
            X.Pxh.A18(r0, r7)
            X.QIV r1 = new X.QIV
            r1.<init>()
            java.lang.String r0 = X.SUF.A04(r13)
            X.SUF.A09(r1, r13, r0)
            java.lang.String r0 = "target_url"
            r1.A06(r0, r10)
            X.Pxe.A1Q(r7, r1)
            X.QHZ r1 = new X.QHZ
            r1.<init>()
            X.QKY.A01(r1, r13)
            java.lang.String r0 = r13.A01
            X.SUF.A0A(r1, r13, r0, r5)
            java.lang.Long r10 = X.DbV.A0q(r14)
            java.lang.String r0 = "ad_id"
            r1.A05(r0, r10)
            java.lang.String r0 = "iaw_session_id"
            r1.A06(r0, r5)
            java.lang.String r0 = "custom_fields"
            r7.AAK(r1, r0)
            r7.Cgf()
            goto L_0x035c
        L_0x035a:
            r17 = 0
        L_0x035c:
            java.lang.String r1 = "refresh_on_back"
            r0 = r20
            java.lang.String r7 = r0.getQueryParameter(r1)     // Catch:{ RuntimeException -> 0x0366 }
            goto L_0x0367
        L_0x0366:
            r7 = 0
        L_0x0367:
            X.1E8 r10 = X.1E7.A00(r3)
            android.os.Bundle r1 = r11.A00
            r0 = r22
            java.lang.String r0 = r1.getString(r0)
            X.1Xj r18 = r10.A02(r0)
            boolean r0 = r4.A05()
            if (r0 != 0) goto L_0x0389
            r0 = 36324763215540588(0x810d2e0003316c, double:3.035264753364488E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r10 = 1
            if (r0 != 0) goto L_0x038a
        L_0x0389:
            r10 = 0
        L_0x038a:
            boolean r0 = r4.A05()
            if (r0 == 0) goto L_0x039c
            r0 = 36324763215409514(0x810d2e0001316a, double:3.0352647532815966E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x039d
        L_0x039c:
            r0 = 0
        L_0x039d:
            if (r10 != 0) goto L_0x03a2
            r10 = 0
            if (r0 == 0) goto L_0x03a3
        L_0x03a2:
            r10 = 1
        L_0x03a3:
            r0 = 36313579123837074(0x81030200330892, double:3.0281918887364635E-306)
            boolean r28 = X.182.A06(r2, r3, r0)
            android.content.Context r0 = r4.A1I
            r43 = r0
            java.lang.Class<com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity> r1 = com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity.class
            android.content.Intent r1 = X.C66580MXl.A0A(r0, r1)
            r0 = r20
            android.content.Intent r26 = r1.setData(r0)
            X.0qQ.A07(r26)
            java.lang.String r13 = r3.getToken()
            java.lang.String r1 = "IgSessionManager.SESSION_TOKEN_KEY"
            r0 = r26
            r0.putExtra(r1, r13)
            boolean r13 = X.2R8.A00(r3)
            if (r7 == 0) goto L_0x03d9
            java.lang.String r0 = "1"
            boolean r0 = r7.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x03da
        L_0x03d9:
            r1 = 0
        L_0x03da:
            X.FEP.A00()
            X.2E0 r0 = X.AnonymousClass2E0.A05()
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x03e8
            X.AnonymousClass2E0.A05()
        L_0x03e8:
            X.1Av r15 = X.1Au.A00(r3)
            X.0s0 r7 = r15.A4R
            X.0YZ[] r19 = X.1Av.A8a
            r14 = 417(0x1a1, float:5.84E-43)
            r0 = r19
            boolean r27 = X.AnonymousClass7TG.A1a(r15, r7, r0, r14)
            if (r27 != 0) goto L_0x0403
            X.1Av r15 = X.1Au.A00(r3)
            X.0s0 r7 = r15.A4R
            X.AnonymousClass7TF.A1J(r15, r7, r0, r14, r8)
        L_0x0403:
            X.S6q r25 = new X.S6q
            r25.<init>()
            java.lang.String r14 = r11.A00()
            r0 = r25
            android.content.Intent r7 = r0.A02
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_MODULE_NAME"
            r7.putExtra(r0, r14)
            boolean r0 = r4.A05()
            if (r0 != 0) goto L_0x087e
            java.lang.String r14 = ""
        L_0x041d:
            java.lang.String r0 = "iab_click_source"
            r7.putExtra(r0, r14)
            java.lang.String r0 = "BrowserLiteIntent.IABLoggingExtras.IAB_SESSION_ID"
            r7.putExtra(r0, r5)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_SHOULD_REFRESH_ON_RESUME"
            r7.putExtra(r0, r1)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IS_RAGE_SHAKE_AVAILABLE"
            r7.putExtra(r0, r13)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_LOGCAT"
            r7.putExtra(r0, r13)
            java.lang.String r1 = "THEME_INSTAGRAM"
            java.lang.String r24 = "BrowserLiteIntent.EXTRA_BROWSER_THEME"
            r0 = r24
            r7.putExtra(r0, r1)
            boolean r1 = r4.A0o
            java.lang.String r0 = "extra_hide_system_status_bar"
            r7.putExtra(r0, r1)
            java.util.Locale r1 = X.AnonymousClass1Q2.A02()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_LOCALE"
            r7.putExtra(r0, r1)
            java.lang.String r0 = r4.A0O
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0870
            java.lang.String r0 = X.1Ch.A00()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = " %s"
        L_0x0461:
            java.lang.String r1 = X.0mp.A06(r0, r1)
            java.lang.String r41 = "BrowserLiteIntent.EXTRA_UA"
            r0 = r41
            r7.putExtra(r0, r1)
            boolean r1 = r4.A1D
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_USE_DEFAULT_USER_AGENT"
            r7.putExtra(r0, r1)
            java.lang.String r1 = "http://instagram.com/"
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_REFERER"
            r7.putExtra(r0, r1)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_MIXED_CONTENT_COMPATABILITY_MODE"
            r7.putExtra(r0, r8)
            java.lang.String r0 = "BrowserLiteIntent.InstagramExtras.EXTRA_SHOULD_FORCE_SOFT_KEYBOARD_CLOSE_ON_BROWSER_EXIT"
            r7.putExtra(r0, r9)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_USE_WIDE_VIEW_PORT"
            r7.putExtra(r0, r8)
            java.lang.String r0 = "BrowserLiteIntent.PERFORMANCE_LOGGER_USE_NANOSECS_MODE"
            r7.putExtra(r0, r8)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r23 = "BrowserLiteIntent.IABLoggingExtras.IAB_USER_CLICK_TS"
            r5 = r23
            r7.putExtra(r5, r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IS_IN_APP_BROWSER_PROFILING_ENABLED"
            r7.putExtra(r0, r13)
            java.lang.String r1 = "BrowserLiteIntent.BrowserAppSurfaceExtras.IG4A"
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_BROWSER_APP_SURFACE"
            r7.putExtra(r0, r1)
            java.lang.String r0 = "BrowserLiteIntent.IAB_PERMISSION_DIALOG_ENABLED"
            r7.putExtra(r0, r8)
            r0 = 36316843295707823(0x8105fa000112af, double:3.03025616417129E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.lang.String r0 = "BrowserLiteIntent.IAB_SIGNAL_DATA_LOGGING_ENABLED"
            r7.putExtra(r0, r1)
            java.lang.String r0 = "BrowserLiteIntent.IAB_IG_EXPANDABLE_FOOTER_ENABLED"
            r7.putExtra(r0, r10)
            java.lang.String r1 = "BrowserLiteIntent.IAB_IG_EXTENSIONS_ENABLED"
            r0 = r28
            r7.putExtra(r1, r0)
            boolean r1 = X.C9837Rhz.A00(r3)
            java.lang.String r0 = "BrowserLiteIntent.IAB_UX_FEATURES_ENABLED"
            r7.putExtra(r0, r1)
            r0 = 36316843296559797(0x8105fa000e12b5, double:3.030256164710082E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.lang.String r0 = "BrowserLiteIntent.IAB_LINK_HISTORY_OPT_IN_NUX_ORGANIC_ONLY_ENABLED"
            r7.putExtra(r0, r1)
            java.lang.String r0 = "BrowserLiteIntent.IAB_HTML_MEDIA_CAPTURE_ENABLED"
            r7.putExtra(r0, r8)
            r0 = 36313579123378315(0x810302002c088b, double:3.0281918884463425E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.lang.String r0 = "BrowserLiteIntent.IAB_CAMERA_PERMISSION_DIALOG_ENABLED"
            r7.putExtra(r0, r1)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IAB_NEW_URL_CHECK_ENABLED_FOR_SSL_ERROR"
            r7.putExtra(r0, r8)
            java.lang.String r0 = "BrowserLiteIntent.InstagramExtras.EXTRA_SSL_ERROR_DIALOG_GO_BACK_FIX_ENABLED"
            r7.putExtra(r0, r8)
            java.lang.Integer r40 = X.AnonymousClass05K.A0N
            r0 = 36313579121739891(0x81030200130873, double:3.0281918874101965E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.lang.String r0 = "EXTRA_BE_IG_CALL_EXTENSION_ENABLED"
            r7.putExtra(r0, r1)
            android.os.Parcelable r1 = r4.A06
            if (r1 == 0) goto L_0x0511
            java.lang.String r0 = "BrowserLiteIntent.InstagramExtras.EXTRA_IG_CALL_EXTENSION_MODEL"
            r7.putExtra(r0, r1)
        L_0x0511:
            android.os.Parcelable r1 = r4.A08
            if (r1 == 0) goto L_0x051a
            java.lang.String r0 = "BrowserLiteIntent.InstagramExtras.EXTRA_IG_LEAD_FORM_EXTENSION_MODEL"
            r7.putExtra(r0, r1)
        L_0x051a:
            android.os.Parcelable r1 = r4.A07
            if (r1 == 0) goto L_0x0523
            java.lang.String r0 = "BrowserLiteIntent.InstagramExtras.EXTRA_CTWA_BROWSER_CTA_EXTENSION_MODEL"
            r7.putExtra(r0, r1)
        L_0x0523:
            boolean r1 = r4.A0r
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IS_LOGGING_ENABLED"
            r7.putExtra(r0, r1)
            r1 = r27 ^ 1
            java.lang.String r0 = "BrowserLiteIntent.InstagramExtras.ORGANIC_IAB_MESSAGE_EXT_IS_ENABLED"
            r7.putExtra(r0, r1)
            boolean r1 = X.C9837Rhz.A00(r3)
            java.lang.String r0 = "BrowserLiteIntent.InstagramExtras.EXTRA_LINK_HISTORY_HEADER_ICON_ENABLED"
            r7.putExtra(r0, r1)
            android.os.Bundle r1 = r11.A00
            r0 = r29
            java.lang.String r0 = r1.getString(r0)
            boolean r1 = X.AnonymousClass7TF.A1V(r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IS_AD_CLICK"
            r7.putExtra(r0, r1)
            com.facebook.iabadscontext.IABAdsContext r1 = r4.A0B
            java.lang.String r0 = "EXTRA_ADS_CONTEXT"
            r7.putExtra(r0, r1)
            com.facebook.iabbwpextension.IABBwPContext r1 = r4.A0C
            java.lang.String r0 = "EXTRA_POST_CLICK_CONTEXT"
            r7.putExtra(r0, r1)
            com.facebook.iabadscontext.IABAdsContext r0 = r4.A0B
            if (r0 == 0) goto L_0x0562
            com.facebook.iabadscontext.IgPromoAdsExtension r0 = r0.A04
            r1 = 1
            if (r0 != 0) goto L_0x0563
        L_0x0562:
            r1 = 0
        L_0x0563:
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_PROMO_EXTENSION_ENABLED"
            r7.putExtra(r0, r1)
            com.facebook.privacy.zone.policy.ZonePolicy r0 = r4.A0D
            if (r0 != 0) goto L_0x056e
            com.facebook.privacy.zone.policy.ZonePolicy r0 = com.facebook.privacy.zone.policy.ZonePolicy.A05
        L_0x056e:
            java.lang.String r1 = r0.name()
            if (r1 != 0) goto L_0x0576
            java.lang.String r1 = "ALLOW_ALL_POLICY"
        L_0x0576:
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_ZONE_POLICY"
            r7.putExtra(r0, r1)
            java.lang.String r0 = "BrowserLiteIntent.InstagramExtras.EXTRA_WEB_TITLE_ON_PARTIAL_SHEET_ENABLED"
            r7.putExtra(r0, r9)
            boolean r1 = r4.A1E
            java.lang.String r0 = "WATCH_AND_BROWSE_HIDE_BROWSER_HEADER"
            r7.putExtra(r0, r1)
            boolean r1 = r4.A11
            java.lang.String r0 = "BrowserLiteIntent.InstagramExtras.EXTRA_OPEN_MENU_AFTER_EXPANSION_ON_PARTIAL_SHEET_THREE_DOTS_CLICKED"
            r7.putExtra(r0, r1)
            boolean r1 = r4.A19
            java.lang.String r0 = "BrowserLiteIntent.InstagramExtras.EXTRA_SHOULD_SHOW_INSTAGRAM_AND_URL_ON_PARTIAL_SHEET"
            r7.putExtra(r0, r1)
            boolean r1 = r4.A16
            java.lang.String r0 = "BrowserLiteIntent.InstagramExtras.EXTRA_KEEP_BROWSER_OPEN_ON_BACK_PRESSED"
            r7.putExtra(r0, r1)
            com.instagram.api.schemas.IGAdsIABScreenshotDataDict r1 = r4.A0E
            if (r1 == 0) goto L_0x05a5
            java.lang.String r0 = "BrowserLiteIntent.InstagramExtras.EXTRA_IG_SCRENSHOT_PREVIEW_DATA"
            r7.putExtra(r0, r1)
        L_0x05a5:
            boolean r0 = X.C9837Rhz.A00(r3)
            if (r0 == 0) goto L_0x05b9
            java.lang.String r0 = "link_history_ux"
            r12.markerAnnotate(r6, r0, r8)
            java.lang.String r1 = r4.A0Q
            if (r1 == 0) goto L_0x05b9
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_BROWSER_HISTORY_ITEM_ID"
            r7.putExtra(r0, r1)
        L_0x05b9:
            r0 = 36320979349414900(0x8109bd000423f4, double:3.032871821190197E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x05cf
            r0 = 36320979350463478(0x8109bd001423f6, double:3.032871821853322E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x071e
        L_0x05cf:
            com.facebook.iabadscontext.IABAdsContext r0 = r4.A0B
            if (r0 == 0) goto L_0x086d
            com.facebook.iabbwpextension.IABBwPExtension r0 = r0.A05
            if (r0 == 0) goto L_0x086d
            java.lang.Integer r1 = r0.A01
        L_0x05d9:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            boolean r5 = X.AnonymousClass7TF.A1W(r1, r0)
            r0 = 36320979349414900(0x8109bd000423f4, double:3.032871821190197E-306)
            boolean r10 = X.182.A06(r2, r3, r0)
            r0 = 36320979350463478(0x8109bd001423f6, double:3.032871821853322E-306)
            boolean r39 = X.182.A06(r2, r3, r0)
            r0 = 36320979351577596(0x8109bd002523fc, double:3.032871822557895E-306)
            boolean r38 = X.182.A06(r2, r3, r0)
            r0 = 36883929303220769(0x8309bd000a0221, double:3.388883638794545E-306)
            java.lang.String r15 = X.182.A04(r2, r3, r0)
            r0 = 36602454325858947(0x8209bd00001283, double:3.210877729702169E-306)
            long r36 = X.182.A01(r2, r3, r0)
            r0 = 36883929302893086(0x8309bd0005021e, double:3.388883638587317E-306)
            java.lang.String r35 = X.182.A04(r2, r3, r0)
            r0 = 36883929302696477(0x8309bd0002021d, double:3.3888836384629805E-306)
            java.lang.String r34 = X.182.A04(r2, r3, r0)
            r0 = 36883929302630940(0x8309bd0001021c, double:3.3888836384215347E-306)
            java.lang.String r33 = X.182.A04(r2, r3, r0)
            r0 = 36883929303024160(0x8309bd00070220, double:3.3888836386702086E-306)
            java.lang.String r32 = X.182.A04(r2, r3, r0)
            r0 = 36883929302958623(0x8309bd0006021f, double:3.388883638628763E-306)
            java.lang.String r31 = X.182.A04(r2, r3, r0)
            r0 = 36883929303548451(0x8309bd000f0223, double:3.388883639001772E-306)
            java.lang.String r30 = X.182.A04(r2, r3, r0)
            r0 = 36883929303613988(0x8309bd00100224, double:3.388883639043218E-306)
            java.lang.String r29 = X.182.A04(r2, r3, r0)
            r0 = 36883929304465958(0x8309bd001d0226, double:3.3888836395820074E-306)
            java.lang.String r28 = X.182.A04(r2, r3, r0)
            r0 = 36883929304531495(0x8309bd001e0227, double:3.388883639623453E-306)
            java.lang.String r27 = X.182.A04(r2, r3, r0)
            r0 = 36883929303417378(0x8309bd000d0222, double:3.388883638918881E-306)
            java.lang.String r12 = X.182.A04(r2, r3, r0)
            if (r5 == 0) goto L_0x086a
            r0 = 36883929304072741(0x8309bd00170225, double:3.3888836393333354E-306)
            java.lang.String r14 = X.182.A04(r2, r3, r0)
        L_0x0671:
            java.lang.String r0 = r4.A0R
            r42 = r0
            java.lang.String r13 = ""
            r5 = 0
            java.lang.String r0 = "IS_BWP_1P_ENABLED"
            android.content.Intent r10 = r7.putExtra(r0, r10)
            java.lang.String r1 = "IS_BWP_3P_ENABLED"
            r0 = r39
            android.content.Intent r10 = r10.putExtra(r1, r0)
            java.lang.String r1 = "IS_ERASE_API_KEY_1P_ENABLED"
            r0 = r38
            android.content.Intent r10 = r10.putExtra(r1, r0)
            java.lang.String r1 = "BWP_API_KEY_COOKIE_NAME"
            android.content.Intent r15 = r10.putExtra(r1, r15)
            java.lang.String r10 = "BWP_API_KEY_TTL"
            r0 = r36
            android.content.Intent r10 = r15.putExtra(r10, r0)
            java.lang.String r1 = "BWP_ACCESS_TOKEN_COOKIE_NAME"
            r0 = r35
            android.content.Intent r10 = r10.putExtra(r1, r0)
            java.lang.String r1 = "BWP_1P_COOKIE_DOMAIN"
            r0 = r34
            android.content.Intent r10 = r10.putExtra(r1, r0)
            java.lang.String r1 = "BWP_3P_COOKIE_DOMAIN"
            r0 = r33
            android.content.Intent r10 = r10.putExtra(r1, r0)
            java.lang.String r1 = "BWP_1P_ALLOWED_DOMAINS"
            r0 = r32
            android.content.Intent r10 = r10.putExtra(r1, r0)
            java.lang.String r1 = "BWP_3P_ALLOWED_DOMAINS"
            r0 = r31
            android.content.Intent r10 = r10.putExtra(r1, r0)
            java.lang.String r1 = "BWP_1P_EXTERNAL_LINK_OPEN_ALLOWED_DOMAINS"
            r0 = r30
            android.content.Intent r10 = r10.putExtra(r1, r0)
            java.lang.String r1 = "BWP_3P_EXTERNAL_LINK_OPEN_ALLOWED_DOMAINS"
            r0 = r29
            android.content.Intent r10 = r10.putExtra(r1, r0)
            java.lang.String r1 = "BWP_1P_SUBTITLE_URL"
            r0 = r28
            android.content.Intent r10 = r10.putExtra(r1, r0)
            java.lang.String r1 = "BWP_3P_SUBTITLE_URL"
            r0 = r27
            android.content.Intent r1 = r10.putExtra(r1, r0)
            java.lang.String r0 = "BWP_REQUEST_HEADER_IP_ADDRESS"
            android.content.Intent r1 = r1.putExtra(r0, r12)
            java.lang.String r0 = "BWP_CACHED_ACCESS_TOKEN_VALUE"
            android.content.Intent r1 = r1.putExtra(r0, r13)
            java.lang.String r0 = "BWP_CACHED_ACCESS_TOKEN_TTL"
            android.content.Intent r5 = r1.putExtra(r0, r5)
            java.lang.String r1 = "BWP_MEDIA_ID"
            r0 = r42
            r5.putExtra(r1, r0)
            if (r14 == 0) goto L_0x071e
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            r0 = r41
            java.lang.String r0 = r7.getStringExtra(r0)
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            r1.append(r14)
            java.lang.String r1 = X.C51967G9n.A0r(r1, r0)
            r0 = r41
            r7.putExtra(r0, r1)
        L_0x071e:
            com.facebook.iabadscontext.IABAdsContext r0 = r4.A0B
            if (r0 == 0) goto L_0x074d
            com.facebook.iabadscontext.IABAdsBwIntegrationExtension r5 = r0.A00
            if (r5 == 0) goto L_0x074d
            java.lang.Integer r1 = r5.A01
            r0 = r40
            if (r1 != r0) goto L_0x074d
            java.lang.Integer r1 = r5.A02
            if (r1 != r0) goto L_0x074d
            r0 = 36891131962786698(0x83104a0001038a, double:3.3934386297068205E-306)
            java.lang.String r5 = X.182.A04(r2, r3, r0)
            r0 = 36891131962721161(0x83104a00000389, double:3.3934386296653747E-306)
            java.lang.String r1 = X.182.A04(r2, r3, r0)
            java.lang.String r0 = "BWI_ACCESS_TOKEN_COOKIE_NAME"
            android.content.Intent r5 = r7.putExtra(r0, r5)
            java.lang.String r0 = "BWI_1P_COOKIE_DOMAIN"
            r5.putExtra(r0, r1)
        L_0x074d:
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IS_STICKY_UTM_ENABLED"
            r7.putExtra(r0, r8)
            java.lang.String r0 = "BrowserLiteIntent.IAB_EXTERNAL_INTERSTITIAL_ENABLED"
            r7.putExtra(r0, r8)
            r0 = 36313579124426907(0x810302003c089b, double:3.028191889109476E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = r0 ^ 1
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_ALLOW_THIRD_PARTY_COOKIES"
            r7.putExtra(r0, r1)
            android.content.res.Resources r5 = r43.getResources()
            boolean r0 = r4.A0W
            if (r0 != 0) goto L_0x077e
            X.0qQ.A0A(r5)
            java.lang.String r10 = X.Ri0.A00(r5, r11)
            java.lang.String r6 = "ACTION_REPORT"
            r1 = -1
            r0 = r25
            r0.A01(r10, r6, r1)
        L_0x077e:
            r0 = 2131964210(0x7f133132, float:1.9565195E38)
            java.lang.String r10 = r5.getString(r0)
            java.lang.String r6 = "REFRESH"
            r1 = -1
            r0 = r25
            r0.A01(r10, r6, r1)
            boolean r0 = r4.A0U
            if (r0 != 0) goto L_0x079a
            java.lang.String r10 = "MENU_OPEN_WITH"
            r6 = r21
            r0 = r25
            r0.A01(r10, r6, r9)
        L_0x079a:
            r0 = 2131964207(0x7f13312f, float:1.956519E38)
            java.lang.String r10 = r5.getString(r0)
            java.lang.String r6 = "COPY_LINK"
            r0 = r25
            r0.A01(r10, r6, r1)
            boolean r0 = r4.A0X
            if (r0 != 0) goto L_0x07ba
            r0 = 2131964213(0x7f133135, float:1.9565201E38)
            java.lang.String r10 = r5.getString(r0)
            java.lang.String r6 = "ACTION_SHARE_VIA"
            r0 = r25
            r0.A01(r10, r6, r1)
        L_0x07ba:
            boolean r0 = r4.A0Y
            if (r0 != 0) goto L_0x07d0
            X.1as r0 = X.1as.A04
            if (r0 == 0) goto L_0x07d0
            r0 = 2131964211(0x7f133133, float:1.9565197E38)
            java.lang.String r6 = r5.getString(r0)
            java.lang.String r5 = "ACTION_SEND_IN_DIRECT"
            r0 = r25
            r0.A01(r6, r5, r1)
        L_0x07d0:
            java.lang.String r1 = r4.A0P
            if (r1 != 0) goto L_0x07d6
            r1 = r16
        L_0x07d6:
            java.lang.String r0 = "BrowserLiteIntent.OPEN_WITH_URL"
            r7.putExtra(r0, r1)
            java.lang.String r0 = r4.A0M
            boolean r0 = X.0mp.A0B(r0)
            if (r0 != 0) goto L_0x0805
            boolean r0 = X.0mp.A0B(r21)
            if (r0 != 0) goto L_0x0853
            java.lang.String r1 = r4.A0M
            java.lang.String r0 = "OAUTH_BASE_URI"
            r7.putExtra(r0, r1)
            java.lang.String r0 = "OAUTH_REDIRECT_URI"
            r1 = r21
            r7.putExtra(r0, r1)
            java.lang.String r0 = "OAUTH_STRICT_URI_MATCHING"
            r7.putExtra(r0, r9)
        L_0x07fc:
            boolean r0 = r4.A0j
            if (r0 == 0) goto L_0x0805
            java.lang.String r0 = "OAUTH_DO_NOT_REMOVE_PREVIOUS_SESSION"
            r7.putExtra(r0, r8)
        L_0x0805:
            com.facebook.privacy.zone.policy.ZonePolicy r1 = r4.A0D
            if (r1 == 0) goto L_0x080d
            com.facebook.privacy.zone.policy.ZonePolicy r0 = com.facebook.privacy.zone.policy.ZonePolicy.A0D
            if (r1 == r0) goto L_0x0814
        L_0x080d:
            android.os.Bundle r1 = r11.A00
            java.lang.String r0 = "TrackingInfo.ARG_ENABLE_SAFE_BROWSING_SETTING_LOGGING"
            r1.putBoolean(r0, r8)
        L_0x0814:
            android.os.Parcelable r0 = r4.A08
            if (r0 != 0) goto L_0x0898
            X.2EG r1 = X.2EG.A0w
            r0 = r44
            if (r0 == r1) goto L_0x0898
            X.2EG r1 = X.2EG.A0u
            if (r0 == r1) goto L_0x0898
            java.lang.String r5 = X.DbT.A10(r20)
            r0 = 36879793250238749(0x8305fa0012011d, double:3.386267982234167E-306)
            java.lang.String r1 = X.182.A04(r2, r3, r0)
            java.lang.String r0 = "__-__"
            java.util.List r0 = X.DbV.A18(r1, r0)
            if (r0 == 0) goto L_0x0989
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r0.iterator()
        L_0x083f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x097f
            java.lang.Object r1 = r10.next()
            java.lang.String r0 = ""
            boolean r0 = X.0qQ.A0K(r1, r0)
            X.DbV.A1U(r1, r6, r0)
            goto L_0x083f
        L_0x0853:
            java.lang.String r0 = r4.A0N
            boolean r0 = X.0mp.A0B(r0)
            if (r0 != 0) goto L_0x07fc
            java.lang.String r5 = r4.A0M
            java.lang.String r1 = r4.A0N
            java.lang.String r0 = "OAUTH_BASE_URI"
            r7.putExtra(r0, r5)
            java.lang.String r0 = "OAUTH_REDIRECT_SCHEME"
            r7.putExtra(r0, r1)
            goto L_0x07fc
        L_0x086a:
            r14 = 0
            goto L_0x0671
        L_0x086d:
            r1 = 0
            goto L_0x05d9
        L_0x0870:
            java.lang.String r1 = X.1Ch.A00()
            java.lang.String r0 = r4.A0O
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = " %s %s"
            goto L_0x0461
        L_0x087e:
            java.lang.String r14 = r44.toString()
            goto L_0x041d
        L_0x0884:
            java.util.Iterator r1 = r6.iterator()
        L_0x0888:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0989
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            boolean r0 = X.C66580MXl.A1a(r0, r8, r5)
            if (r0 == 0) goto L_0x0888
        L_0x0898:
            r5 = 1
        L_0x0899:
            android.os.Bundle r1 = r11.A00
            java.lang.String r15 = "TrackingInfo.ARG_FORCE_DISABLE_LINK_HISTORY_OPT_IN_NUX"
            r1.putBoolean(r15, r5)
            android.os.Bundle r0 = r11.A00
            android.os.Bundle r1 = X.Pxe.A0J(r0)
            java.lang.String r20 = "BrowserLiteIntent.EXTRA_TRACKING"
            r0 = r20
            android.os.Bundle r0 = r7.getBundleExtra(r0)
            if (r0 == 0) goto L_0x0974
            r0.putAll(r1)
        L_0x08b3:
            r0 = 36313579120560226(0x81030200010862, double:3.0281918866641716E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IS_GOOGLE_OAUTH2_LOGGING_ENABLED"
            r7.putExtra(r0, r1)
            boolean r1 = r4.A06()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IS_E2EE_BLACK_HOLE_ENABLED"
            r7.putExtra(r0, r1)
            r0 = 36313579120625763(0x81030200020863, double:3.0281918867056175E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IS_E2EE_BLACK_HOLE_LOGGING_ENABLED"
            r7.putExtra(r0, r1)
            r0 = 36310740147175671(0x81006d000100f7, double:3.026396508464151E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_INTEGRITY_LOGGING"
            r7.putExtra(r0, r1)
            r0 = 36310740147110134(0x81006d000000f6, double:3.026396508422705E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_PAGE_SIZE_LOGGING"
            r7.putExtra(r0, r1)
            r0 = 36310740147372282(0x81006d000400fa, double:3.0263965085884884E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_SIM_HASH_LOGGING"
            r7.putExtra(r0, r1)
            r0 = 36873690100858898(0x83006d00050012, double:3.382408325990939E-306)
            java.lang.String r1 = X.182.A04(r2, r3, r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_REQUEST_LOG_LEVEL"
            r7.putExtra(r0, r1)
            r0 = 36310740147306745(0x81006d000300f9, double:3.0263965085470425E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IMAGES_SIZES_LOGGING"
            r7.putExtra(r0, r1)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            X.4jr r0 = X.C271944jq.A00(r3)
            java.util.List r0 = r0.A00
            X.0qQ.A07(r0)
            r1.addAll(r0)
            java.util.List r0 = r4.A0T
            X.0qQ.A06(r0)
            r1.addAll(r0)
            java.util.Iterator r10 = r1.iterator()
        L_0x093a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x098c
            java.lang.String r1 = X.AnonymousClass7TE.A18(r10)
            java.util.List r0 = java.net.HttpCookie.parse(r1)
            java.lang.String r6 = "Required value was null."
            if (r0 == 0) goto L_0x1113
            java.util.ArrayList r5 = X.DbV.A14(r1)
            java.lang.Object r1 = r0.get(r9)
            java.net.HttpCookie r1 = (java.net.HttpCookie) r1
            java.lang.String r1 = r1.getDomain()
            if (r1 == 0) goto L_0x110e
            java.lang.Object r0 = r0.get(r9)
            java.net.HttpCookie r0 = (java.net.HttpCookie) r0
            boolean r0 = r0.getSecure()
            if (r0 == 0) goto L_0x096e
            java.lang.String r0 = "https://"
            java.lang.String r1 = X.002.A0R(r0, r1)
        L_0x096e:
            r0 = r25
            r0.A02(r1, r5)
            goto L_0x093a
        L_0x0974:
            r0 = r20
            android.content.Intent r0 = r7.putExtra(r0, r1)
            X.0qQ.A07(r0)
            goto L_0x08b3
        L_0x097f:
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0884
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0884
        L_0x0989:
            r5 = 0
            goto L_0x0899
        L_0x098c:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = X.1Q5.A00(r3)
            r5.addAll(r0)
            java.util.List r0 = X.F7c.A01(r3)
            r5.addAll(r0)
            boolean r0 = X.DbT.A1b(r5)
            if (r0 == 0) goto L_0x09cb
            java.util.ArrayList r1 = X.Pxg.A14(r5)
            java.util.Iterator r5 = X.AnonymousClass7TE.A1G(r5)
        L_0x09ac:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x09c0
            java.lang.Object r0 = X.AnonymousClass7TF.A0a(r5)
            java.net.HttpCookie r0 = (java.net.HttpCookie) r0
            java.lang.String r0 = X.RhY.A00(r0)
            r1.add(r0)
            goto L_0x09ac
        L_0x09c0:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1D(r1)
            java.lang.String r1 = ".www.instagram.com"
            r0 = r25
            r0.A02(r1, r5)
        L_0x09cb:
            r27 = r45
            if (r45 == 0) goto L_0x09de
            r0 = r27
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x09de
            java.lang.String r0 = "clips_ad_cta_fragment"
            java.lang.Object r0 = r1.get(r0)
            r6 = 1
            if (r0 != 0) goto L_0x09e1
        L_0x09de:
            r6 = 0
            if (r45 == 0) goto L_0x09f0
        L_0x09e1:
            r0 = r27
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x09f0
            java.lang.String r0 = "clips_ad_cta_non_animation_swipe"
            java.lang.Object r0 = r1.get(r0)
            r5 = 1
            if (r0 != 0) goto L_0x09f1
        L_0x09f0:
            r5 = 0
        L_0x09f1:
            android.app.Activity r10 = r4.A1H
            if (r10 == 0) goto L_0x0a26
            if (r6 == 0) goto L_0x0a07
            boolean r0 = r4.A10
            if (r0 != 0) goto L_0x0a07
            X.0b6.A00()
            X.NEU r1 = X.C69817Nse.A00(r10)
            r0 = r43
            X.0b6.A02(r0, r1)
        L_0x0a07:
            boolean r0 = X.AnonymousClass2Rc.A00
            if (r0 == 0) goto L_0x0a53
            if (r6 == 0) goto L_0x0a38
            r6 = 2130772077(0x7f01006d, float:1.7147262E38)
            r0 = 2130772097(0x7f010081, float:1.7147303E38)
            int[] r1 = new int[]{r6, r6, r6, r0}
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_ANIMATION"
            r7.putExtra(r0, r1)
        L_0x0a1c:
            android.app.Activity r0 = X.C61190ls.A00(r10)
            r5 = 2130772079(0x7f01006f, float:1.7147266E38)
        L_0x0a23:
            r0.overridePendingTransition(r5, r6)
        L_0x0a26:
            boolean r0 = X.23d.A00
            if (r0 == 0) goto L_0x0af7
            X.0Tu r5 = X.0Tu.A06
            r0 = 36310430911299660(0x810025001c004c, double:3.0262009464509685E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 == 0) goto L_0x0a8e
            goto L_0x0a6a
        L_0x0a38:
            r1 = 2130772079(0x7f01006f, float:1.7147266E38)
            r6 = 2130772077(0x7f01006d, float:1.7147262E38)
            r0 = 2130772078(0x7f01006e, float:1.7147264E38)
            if (r5 == 0) goto L_0x0a49
            r1 = 2130772095(0x7f01007f, float:1.7147299E38)
            r0 = 2130772097(0x7f010081, float:1.7147303E38)
        L_0x0a49:
            int[] r1 = new int[]{r1, r6, r6, r0}
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_ANIMATION"
            r7.putExtra(r0, r1)
            goto L_0x0a1c
        L_0x0a53:
            r5 = 2130771974(0x7f010006, float:1.7147053E38)
            r6 = 2130772085(0x7f010075, float:1.7147278E38)
            r0 = 2130771975(0x7f010007, float:1.7147055E38)
            int[] r1 = new int[]{r5, r6, r6, r0}
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_ANIMATION"
            r7.putExtra(r0, r1)
            android.app.Activity r0 = X.C61190ls.A00(r10)
            goto L_0x0a23
        L_0x0a6a:
            X.2IS r12 = X.C41845B3m.A04()     // Catch:{ IOException -> 0x0a88 }
            java.lang.Class<X.QNY> r6 = X.QNY.class
            java.lang.String r1 = "IABAutofillMultiData"
            X.3Fa r0 = new X.3Fa     // Catch:{ IOException -> 0x0a88 }
            r0.<init>(r12, r6, r1, r9)     // Catch:{ IOException -> 0x0a88 }
            X.1OC r6 = X.SQF.A00(r0, r3)     // Catch:{ IOException -> 0x0a88 }
            X.R8r r1 = new X.R8r     // Catch:{ IOException -> 0x0a88 }
            r0 = r43
            r1.<init>(r9, r0, r3)     // Catch:{ IOException -> 0x0a88 }
            r6.A00 = r1     // Catch:{ IOException -> 0x0a88 }
            X.SQF.A02(r6)     // Catch:{ IOException -> 0x0a88 }
            goto L_0x0ad1
        L_0x0a88:
            r6 = move-exception
            java.lang.String r1 = "AutofillGraphQLRequest"
            java.lang.String r0 = "Error creating query multiple entries autofill request"
            goto L_0x0ace
        L_0x0a8e:
            X.0K0 r12 = com.facebook.graphql.calls.GraphQlCallInput.A02     // Catch:{ IOException -> 0x0ac9 }
            java.lang.String r1 = ""
            java.lang.String r0 = "sensitive_string_value"
            X.0Df r6 = X.C41845B3m.A03(r12, r1, r0)     // Catch:{ IOException -> 0x0ac9 }
            java.lang.String r0 = "access_token"
            X.0Df r1 = r12.A02()     // Catch:{ IOException -> 0x0ac9 }
            r1.A0E(r6, r0)     // Catch:{ IOException -> 0x0ac9 }
            X.2IS r12 = X.C41845B3m.A04()     // Catch:{ IOException -> 0x0ac9 }
            r0 = 180(0xb4, float:2.52E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ IOException -> 0x0ac9 }
            X.DbW.A18(r1, r12, r0)     // Catch:{ IOException -> 0x0ac9 }
            java.lang.Class<X.QNU> r6 = X.QNU.class
            java.lang.String r1 = "IABAutofillData"
            X.3Fa r0 = new X.3Fa     // Catch:{ IOException -> 0x0ac9 }
            r0.<init>(r12, r6, r1, r9)     // Catch:{ IOException -> 0x0ac9 }
            X.1OC r6 = X.SQF.A00(r0, r3)     // Catch:{ IOException -> 0x0ac9 }
            X.R8r r1 = new X.R8r     // Catch:{ IOException -> 0x0ac9 }
            r0 = r43
            r1.<init>(r8, r0, r3)     // Catch:{ IOException -> 0x0ac9 }
            r6.A00 = r1     // Catch:{ IOException -> 0x0ac9 }
            X.SQF.A02(r6)     // Catch:{ IOException -> 0x0ac9 }
            goto L_0x0ad1
        L_0x0ac9:
            r6 = move-exception
            java.lang.String r1 = "AutofillGraphQLRequest"
            java.lang.String r0 = "Error creating query autofill request"
        L_0x0ace:
            X.0wb.A06(r1, r0, r6)
        L_0x0ad1:
            r1 = 2
            X.R8p r0 = new X.R8p
            r0.<init>((com.instagram.common.session.UserSession) r3, (int) r1)
            X.SRr.A00(r0, r3)
            r0 = r21
            X.SRr.A03(r3, r0)
            r0 = 2342153440123224124(0x208100250001003c, double:4.057472103242133E-152)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 == 0) goto L_0x0af5
            r1 = 4
            X.R8r r0 = new X.R8r
            r5 = r21
            r0.<init>(r1, r5, r3)
            X.SRr.A00(r0, r3)
        L_0x0af5:
            X.23d.A00 = r9
        L_0x0af7:
            X.0Tu r6 = X.0Tu.A06
            r0 = 2342153440123813952(0x20810025000a0040, double:4.057472103742257E-152)
            boolean r14 = X.182.A06(r6, r3, r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_ENABLED"
            r7.putExtra(r0, r8)
            X.0xa r0 = X.AnonymousClass7TE.A0q(r3)
            java.lang.String r5 = "browser_consecutive_decline_autofill"
            int r1 = r0.getInt(r5, r9)
            X.1yd r0 = r4.A0A
            r21 = r0
            int r0 = X.RUW.A00(r21)
            if (r1 < r0) goto L_0x10fe
            X.RF6 r0 = X.RF6.OPT_OUT
        L_0x0b1d:
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_CONTACT_OPT_IN_STATUS"
            r7.putExtra(r0, r1)
            X.0xi r0 = X.0tS.A4E
            X.0tS r13 = r0.A00()
            X.0s0 r12 = r13.A2b
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 188(0xbc, float:2.63E-43)
            boolean r1 = X.AnonymousClass7TG.A1a(r13, r12, r1, r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_DEBUG_KEY"
            r7.putExtra(r0, r1)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_SHOW_CONSENT"
            r7.putExtra(r0, r14)
            boolean r0 = r4.A0V
            if (r0 != 0) goto L_0x0b53
            r1 = 2131964212(0x7f133134, float:1.95652E38)
            r0 = r43
            java.lang.String r13 = r0.getString(r1)
            java.lang.String r12 = "OPEN_BROWSER_SETTINGS"
            r1 = -1
            r0 = r25
            r0.A01(r13, r12, r1)
        L_0x0b53:
            android.os.Bundle r0 = r11.A00
            r1 = r22
            java.lang.String r0 = r0.getString(r1)
            X.1Xj r0 = X.DbV.A0U(r3, r0)
            if (r0 == 0) goto L_0x0b9a
            X.1Xy r1 = r0.A0C
            X.3ky r1 = r1.BDz()
            if (r1 == 0) goto L_0x0b9a
            X.1Xy r1 = r0.A0C
            X.3ky r1 = r1.BDz()
            if (r1 == 0) goto L_0x111d
            java.lang.String r13 = r1.getDomain()
            if (r13 == 0) goto L_0x111d
            X.1Xy r0 = r0.A0C
            X.3ky r0 = r0.BDz()
            if (r0 == 0) goto L_0x10fb
            java.lang.Boolean r0 = r0.CUr()
            boolean r12 = X.AnonymousClass7TF.A1Y(r0, r8)
        L_0x0b87:
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_DOMAIN_KEY"
            r1.putString(r0, r13)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_IS_OPTOUT_KEY"
            r1.putBoolean(r0, r12)
            java.lang.String r0 = "BrowserLiteIntent.InstagramExtras.EXTRA_AUTOFILL_OPTOUT_INFO"
            r7.putExtra(r0, r1)
        L_0x0b9a:
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_SHOULD_SHOW_FBPAY_DISCLOSURE"
            r7.putExtra(r0, r8)
            r0 = 36310430911103050(0x8100250019004a, double:3.0262009463266316E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_SHOULD_REMOVE_AUTOFILL_DOMAIN_OPT_OUT"
            r7.putExtra(r0, r1)
            r0 = 36873380864589832(0x830025001a0008, double:3.382212763729187E-306)
            java.lang.String r1 = X.182.A04(r2, r3, r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_CONTACT_AUTOFILL_BLOCK_LIST"
            r7.putExtra(r0, r1)
            X.1Av r13 = X.1Au.A00(r3)
            X.0s0 r12 = r13.A0P
            r1 = 166(0xa6, float:2.33E-43)
            r0 = r19
            java.lang.Object r0 = X.Pxe.A0s(r13, r12, r0, r1)
            int r1 = X.AnonymousClass7TE.A0M(r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_SUPPRESS_NUX_EXPERIMENT_VERSION_ID"
            r7.putExtra(r0, r1)
            r0 = 2342153440123224124(0x208100250001003c, double:4.057472103242133E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0c15
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_PAYMENT_ENABLED"
            r7.putExtra(r0, r8)
            java.util.ArrayList r1 = X.23d.A02()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IG_FBPAY_BUTTON_AUTOFILL_DATA"
            r7.putStringArrayListExtra(r0, r1)
            r0 = 36873380864393223(0x83002500170007, double:3.382212763604851E-306)
            java.lang.String r1 = X.182.A04(r2, r3, r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_PAYMENT_AUTOFILL_BLOCK_LIST"
            r7.putExtra(r0, r1)
            r0 = 36591905888862260(0x82002500290034, double:3.2042068556703174E-306)
            int r1 = X.DbS.A04(r6, r3, r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_PAYMENT_PROMPT_AUTOFILL_DECLINED_THRESHOLD_PER_SESSION"
            r7.putExtra(r0, r1)
            r0 = 36310430912479318(0x810025002e0056, double:3.026200947196989E-306)
            boolean r1 = X.182.A06(r6, r3, r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_UPPER_FUNNEL_LOGGING_ENABLED"
            r7.putExtra(r0, r1)
        L_0x0c15:
            r0 = 36322860551187061(0x810b7300612a75, double:3.0340615007659034E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0c35
            X.0xa r0 = X.AnonymousClass7TE.A0q(r3)
            int r1 = r0.getInt(r5, r9)
            int r0 = X.RUW.A00(r21)
            boolean r1 = X.JTQ.A1P(r1, r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_USER_META_DISABLED"
            r7.putExtra(r0, r1)
        L_0x0c35:
            r0 = 36313579123181704(0x81030200290888, double:3.028191888322005E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0c53
            android.content.res.Resources r1 = r43.getResources()
            r0 = 2131964209(0x7f133131, float:1.9565193E38)
            java.lang.String r12 = r1.getString(r0)
            java.lang.String r5 = "ACTION_PRIVACY_POLICY"
            r1 = -1
            r0 = r25
            r0.A01(r12, r5, r1)
        L_0x0c53:
            X.2IL r0 = X.2IL.A01(r3)
            X.0qQ.A07(r0)
            X.2IO r12 = r0.A01
            java.util.concurrent.atomic.AtomicReference r5 = r12.A02
            java.lang.Object r0 = r5.get()
            X.3sn r0 = (X.C254633sn) r0
            if (r0 != 0) goto L_0x10f7
            r1 = 0
        L_0x0c67:
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_CLICK_IDS"
            r7.putExtra(r0, r1)
            java.util.concurrent.atomic.AtomicInteger r0 = r12.A01
            int r1 = r0.get()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_CLICK_ID_POOL_FETCH_STATE"
            r7.putExtra(r0, r1)
            r0 = 36313579121281133(0x810302000c086d, double:3.028191887120076E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0c91
            r0 = 36313579122264186(0x810302001b087a, double:3.028191887741763E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x10f4
            boolean r0 = X.2IP.A00
            if (r0 != 0) goto L_0x10f4
        L_0x0c91:
            r1 = 1
        L_0x0c92:
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_ENABLE_BROWSER_PROPERTY_CLICK_ID"
            r7.putExtra(r0, r1)
            boolean r1 = X.2IP.A00
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IS_EPD_OPT_OUT"
            r7.putExtra(r0, r1)
            r0 = 36313579123640463(0x8103020030088f, double:3.028191888612126E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_GET_CLICKID_FROM_IAB_ADS_CONTEXT"
            r7.putExtra(r0, r1)
            java.lang.Object r0 = r5.get()
            X.3sn r0 = (X.C254633sn) r0
            if (r0 != 0) goto L_0x10de
            byte[] r1 = new byte[r9]
            r0 = r25
            r0.A03(r1, r9, r9)
        L_0x0cbb:
            r0 = 36327924311341877(0x81100e00013b35, double:3.0372638430779346E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_SHOULD_BUFFER_PIXEL_REQUESTS"
            r7.putExtra(r0, r1)
            if (r18 == 0) goto L_0x0ce0
            r0 = r18
            X.1Xy r0 = r0.A0C
            java.lang.String r1 = r0.AnT()
            if (r1 == 0) goto L_0x0ce0
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0ce0
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IAB_CLICKID"
            r7.putExtra(r0, r1)
        L_0x0ce0:
            boolean r0 = r4.A0t
            if (r0 == 0) goto L_0x0d05
            android.net.Uri r0 = r26.getData()
            if (r18 == 0) goto L_0x0cfa
            r1 = r18
            X.1Xy r1 = r1.A0C
            java.lang.String r5 = r1.AnT()
            if (r5 == 0) goto L_0x0cfa
            int r1 = r5.length()
            if (r1 != 0) goto L_0x0cfe
        L_0x0cfa:
            java.lang.String r5 = r4.A00(r0)
        L_0x0cfe:
            android.os.Bundle r1 = r11.A00
            java.lang.String r0 = "TrackingInfo.ARG_CLICK_ID"
            r1.putString(r0, r5)
        L_0x0d05:
            r0 = 36330342377931336(0x81124100014248, double:3.038793038125881E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_ENABLE_DDV2_IAB_OPEN_EXTERNAL_BROWSER"
            r7.putExtra(r0, r1)
            r0 = 36313514695985188(0x8102f300000824, double:3.0281511443035007E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.String r5 = "BrowserLiteIntent.EXTRA_IG_FBPAY_BUTTON_SUPPORT"
            r7.putExtra(r5, r0)
            r0 = 36315992892444508(0x81053400050f5c, double:3.029718365723271E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IG_META_CHECKOUT_SDK_ENABLED"
            r7.putExtra(r0, r1)
            r12 = 2
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_LE_DESIGN_EXPERIMENT_STYLE"
            r7.putExtra(r0, r12)
            int r0 = X.2Yn.A00()
            int[] r1 = new int[]{r0}
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_ACTIVITY_THEME_STYLES"
            r7.putExtra(r0, r1)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_SHOULD_DISABLE_SWIPE_TO_CLOSE"
            r7.putExtra(r0, r8)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r13 = "BrowserLiteIntent.HANDLE_INTENT_START_TIME"
            r7.putExtra(r13, r0)
            boolean r0 = r4.A0z
            if (r0 == 0) goto L_0x0f8d
            if (r10 == 0) goto L_0x0f3e
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_SHOW_MENU_ITEM"
            r7.putExtra(r0, r8)
            r0 = 36321284291831016(0x810a04000024e8, double:3.0330646680020536E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0d6b
            boolean r0 = r4.A0Z
            r1 = 1
            if (r0 != 0) goto L_0x0d6c
        L_0x0d6b:
            r1 = 0
        L_0x0d6c:
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_SHOW_PARTIAL_MENU_ITEM"
            r7.putExtra(r0, r1)
            java.lang.String r1 = "THEME_INSTAGRAM_WATCH_AND_BROWSE"
            r0 = r24
            r7.putExtra(r0, r1)
            r0 = 36313514697230381(0x8102f30013082d, double:3.028151145090966E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0d8f
            r0 = 36313514695985188(0x8102f300000824, double:3.0281511443035007E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0d90
        L_0x0d8f:
            r0 = 0
        L_0x0d90:
            r7.putExtra(r5, r0)
            boolean r0 = r4.A0s
            if (r0 == 0) goto L_0x0da5
            X.RIg r1 = r4.A09
            if (r1 == 0) goto L_0x0f84
            java.lang.String r0 = "BrowserLiteIntent.IABLoggingExtras.IAB_IS_NON_VIEWABLE_SYSTEM_ENABLED"
            r7.putExtra(r0, r8)
            java.lang.String r0 = "BrowserLiteIntent.IABLoggingExtras.IAB_NV_SOURCE"
            r7.putExtra(r0, r1)
        L_0x0da5:
            android.os.Bundle r0 = r11.A00
            r0.putBoolean(r15, r8)
            android.os.Bundle r0 = r11.A00
            android.os.Bundle r1 = X.Pxe.A0J(r0)
            r0 = r20
            android.os.Bundle r0 = r7.getBundleExtra(r0)
            if (r0 == 0) goto L_0x0f79
            r0.putAll(r1)
        L_0x0dbb:
            android.content.Intent r1 = r25.A00()
            r0 = r26
            r0.putExtras(r1)
            boolean r0 = r4.A0t
            if (r0 == 0) goto L_0x0de9
            java.lang.String r1 = "BrowserLiteIntent.EXTRA_IS_PERSISTENT_IAB"
            r0 = r26
            r0.putExtra(r1, r8)
            r0 = 36321593530000978(0x810a4c00082652, double:3.03326023146594E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0de1
            java.lang.String r1 = "BrowserLiteIntent.EXTRA_IS_NON_VIEWABLE_SYSTEM_ENABLED"
            r0 = r26
            r0.putExtra(r1, r8)
        L_0x0de1:
            boolean r1 = r4.A0k
            r0 = 4
            if (r1 == 0) goto L_0x0de7
            r0 = 2
        L_0x0de7:
            r4.A05 = r0
        L_0x0de9:
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "BrowserLiteIntent.ACTIVITY_INTENT"
            r0 = r26
            r6.putParcelable(r1, r0)
            X.AnonymousClass0Dg.A00(r6, r3)
            android.net.Uri r5 = r26.getData()
            if (r5 != 0) goto L_0x0dff
            android.net.Uri r5 = android.net.Uri.EMPTY
        L_0x0dff:
            X.0qQ.A0A(r5)
            boolean r0 = r4.A0q
            if (r0 != 0) goto L_0x0e27
            r0 = 37169316995662317(0x840d4c001201ed, double:3.569363964658579E-306)
            double r18 = X.182.A00(r2, r3, r0)
            r13 = 4599976659288850432(0x3fd6666660000000, double:0.3499999940395355)
            int r0 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0f75
            r0 = 36324892064559551(0x810d4c000331bf, double:3.035346238002914E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r9)
            if (r0 == 0) goto L_0x0f75
        L_0x0e27:
            com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig$HalfSheet r11 = com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig.HalfSheet.A00
        L_0x0e29:
            com.facebook.iabadscontext.IABAdsContext r13 = r4.A0B
            if (r13 != 0) goto L_0x0e34
            X.0sn r0 = X.0sn.A00
            com.facebook.iabadscontext.IABDummyContext r13 = new com.facebook.iabadscontext.IABDummyContext
            r13.<init>(r0)
        L_0x0e34:
            com.facebook.browser.iabcontext.IabCommonTrait r13 = (com.facebook.browser.iabcontext.IabCommonTrait) r13
            r0 = -1
            r15 = r23
            r14 = r26
            long r0 = r14.getLongExtra(r15, r0)
            X.7kY r5 = X.A0O.A00(r5, r13, r11, r0)
            r5.setArguments(r6)
            X.4mf r0 = r4.A0F
            if (r0 == 0) goto L_0x0e4d
            r5.A05 = r0
        L_0x0e4d:
            X.S6e r1 = r4.A0K
            if (r1 == 0) goto L_0x0e58
            X.Rq9 r0 = new X.Rq9
            r0.<init>(r5)
            r1.A00 = r0
        L_0x0e58:
            X.37D r1 = X.DbT.A0i(r10)
            if (r1 == 0) goto L_0x0e8e
            X.T8L r0 = new X.T8L
            r0.<init>(r5, r4, r1)
            r1.A0Q(r0)
            X.RvU r0 = new X.RvU
            r0.<init>(r5, r4, r1)
            r5.A0f = r0
            boolean r0 = r4.A1C
            if (r0 == 0) goto L_0x0e7b
            X.91D r6 = new X.91D
            r6.<init>(r5)
            r0 = r1
            X.37F r0 = (X.AnonymousClass37F) r0
            r0.A0B = r6
        L_0x0e7b:
            boolean r0 = r4.A0x
            if (r0 == 0) goto L_0x0e8e
            boolean r0 = A08(r4)
            if (r0 == 0) goto L_0x0e8e
            X.RqA r0 = new X.RqA
            r0.<init>(r5)
            X.37F r1 = (X.AnonymousClass37F) r1
            r1.A0C = r0
        L_0x0e8e:
            X.IZe r13 = new X.IZe
            r13.<init>(r8, r5, r4)
            X.IZt r1 = new X.IZt
            r1.<init>(r4, r12)
            X.T8I r11 = new X.T8I
            r11.<init>(r9, r5, r4)
            X.7Pr r6 = new X.7Pr
            r6.<init>(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r6.A0a = r0
            r6.A1H = r8
            boolean r0 = r4.A0y
            r6.A1A = r0
            boolean r0 = r4.A0l
            r6.A13 = r0
            float r0 = r4.A03
            r6.A03 = r0
            boolean r0 = r4.A14
            r6.A1O = r0
            boolean r12 = r4.A0c
            r0 = r12 ^ 1
            r6.A0q = r0
            r6.A0k = r12
            boolean r0 = r4.A1B
            r6.A1F = r0
            boolean r0 = r4.A0t
            r6.A1D = r0
            boolean r0 = r4.A0q
            r6.A18 = r0
            boolean r0 = r4.A15
            r6.A1P = r0
            boolean r0 = r4.A17
            r6.A1Q = r0
            r6.A1I = r8
            r6.A11 = r8
            r6.A0U = r13
            r6.A0t = r9
            boolean r0 = r4.A12
            r6.A1L = r0
            boolean r0 = r4.A0d
            r6.A0l = r0
            X.4mf r0 = r4.A0F
            r6.A0T = r0
            r6.A0u = r9
            boolean r0 = r4.A18
            r6.A1R = r0
            boolean r0 = r4.A0k
            r6.A0s = r0
            float r0 = r4.A01
            r6.A01 = r0
            boolean r0 = r4.A0a
            r6.A0i = r0
            r6.A0V = r1
            r6.A0W = r11
            int[] r0 = r4.A1F
            r6.A1T = r0
            boolean r0 = r4.A0f
            r6.A0n = r0
            boolean r0 = r4.A0i
            r6.A0r = r0
            boolean r0 = r4.A0g
            r6.A0o = r0
            boolean r0 = r4.A13
            r6.A1M = r0
            X.SHR r0 = r4.A0L
            r6.A0Y = r0
            float r0 = r4.A02
            r6.A02 = r0
            boolean r0 = r4.A0b
            r6.A0j = r0
            double r0 = r4.A00
            r6.A00 = r0
            boolean r0 = r4.A0e
            r6.A0m = r0
            int r0 = r4.A04
            r6.A07 = r0
            boolean r0 = r4.A0p
            r6.A15 = r0
            X.7Pu r0 = r6.A00()
            r0.A02(r10, r5)
            boolean r0 = r4.A0m
            if (r0 == 0) goto L_0x0f3e
            A03(r5, r4)
        L_0x0f3e:
            boolean r0 = r4.A0m
            if (r0 == 0) goto L_0x0f4c
            X.3GX r1 = X.AnonymousClass3GX.A00(r3)
            java.lang.String r0 = "webview"
            r1.A06(r0)
        L_0x0f4c:
            r0 = 36318209095309305(0x810738000117f9, double:3.031119901338901E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0f5e
            java.lang.String r1 = "in_app_browser_v2"
            r0 = r16
            X.SCL.A00(r3, r0, r1, r8)
        L_0x0f5e:
            if (r17 != 0) goto L_0x006e
            boolean r0 = X.C249103j8.A01(r43)
            if (r0 == 0) goto L_0x006e
            r0 = 36876529074962546(0x83030200100072, double:3.384203704645717E-306)
            java.lang.String r1 = X.182.A04(r2, r3, r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IS_WEBVIEW_HOT_INSTANCE_EXPERIMENT_TYPE"
            r7.putExtra(r0, r1)
            return
        L_0x0f75:
            com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig$Peek r11 = com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig.Peek.A00
            goto L_0x0e29
        L_0x0f79:
            r0 = r20
            android.content.Intent r0 = r7.putExtra(r0, r1)
            X.0qQ.A07(r0)
            goto L_0x0dbb
        L_0x0f84:
            java.lang.String r1 = "BrowserLauncher"
            java.lang.String r0 = "isNonViewableSystemEnabled is set to true but iabNVSource is null. This should never happen. Please ensure to supply a valid IABNVSource when using Non Viewable Event System!"
            X.0KC.A0E(r1, r0)
            goto L_0x0da5
        L_0x0f8d:
            boolean r0 = r4.A10
            if (r0 == 0) goto L_0x100f
            if (r10 == 0) goto L_0x0f4c
            boolean r0 = r10 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x0f4c
            java.lang.String r1 = "THEME_INSTAGRAM_SIDE_PANEL"
            r0 = r24
            r7.putExtra(r0, r1)
            r0 = 36317543379572026(0x81069d0041153a, double:3.030698900026024E-306)
            boolean r1 = X.182.A06(r6, r3, r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_SHOULD_LOG_IAB_LAUNCH_WHEN_FULLY_VISIBLE"
            r7.putExtra(r0, r1)
            android.content.Intent r1 = r25.A00()
            r0 = r26
            r0.putExtras(r1)
            android.os.Bundle r9 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "BrowserLiteIntent.ACTIVITY_INTENT"
            r9.putParcelable(r1, r0)
            X.AnonymousClass0Dg.A00(r9, r3)
            android.net.Uri r6 = r26.getData()
            if (r6 != 0) goto L_0x0fc9
            android.net.Uri r6 = android.net.Uri.EMPTY
        L_0x0fc9:
            X.0qQ.A0A(r6)
            com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig$FullScreen r5 = com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig.FullScreen.A00
            com.facebook.iabadscontext.IABAdsContext r4 = r4.A0B
            if (r4 != 0) goto L_0x0fd9
            X.0sn r0 = X.0sn.A00
            com.facebook.iabadscontext.IABDummyContext r4 = new com.facebook.iabadscontext.IABDummyContext
            r4.<init>(r0)
        L_0x0fd9:
            com.facebook.browser.iabcontext.IabCommonTrait r4 = (com.facebook.browser.iabcontext.IabCommonTrait) r4
            r0 = -1
            r12 = r23
            r11 = r26
            long r0 = r11.getLongExtra(r12, r0)
            X.7kY r5 = X.A0O.A00(r6, r4, r5, r0)
            r5.setArguments(r9)
            r0 = 7
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r10, r0)
            androidx.fragment.app.FragmentActivity r10 = (androidx.fragment.app.FragmentActivity) r10
            X.0hq r0 = r10.getSupportFragmentManager()
            X.0qQ.A07(r0)
            X.0s1 r4 = new X.0s1
            r4.<init>(r0)
            r1 = 2131435213(0x7f0b1ecd, float:1.8492262E38)
            java.lang.String r0 = "fragment_clips_ad_cta_panel"
            r4.A0C(r5, r0, r1)
            r4.A0K()
            goto L_0x0f4c
        L_0x100f:
            r0 = 36322851954895397(0x810b7100002a25, double:3.0340560644364406E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r6 = r47
            if (r0 == 0) goto L_0x1071
            r0 = 18
            X.Plm r1 = new X.Plm
            r1.<init>(r3, r0)
            java.lang.Class<X.5xb> r0 = X.C300675xb.class
            java.lang.Object r0 = r3.A01(r0, r1)
            X.5xb r0 = (X.C300675xb) r0
            X.Rxf r9 = new X.Rxf
            r10 = r26
            r11 = r27
            r12 = r25
            r13 = r4
            r14 = r6
            r9.<init>(r10, r11, r12, r13, r14)
            X.6EV r1 = X.AnonymousClass6EU.A05
            com.instagram.common.session.UserSession r0 = r0.A00
            X.6EU r0 = r1.A00(r0)
            X.Onz r1 = r0.A01()
            if (r1 == 0) goto L_0x10b9
            X.1a8 r5 = X.1a8.A00()
            X.NAV r0 = new X.NAV
            r0.<init>(r1)
            X.1aU r1 = X.1aU.A09(r0)
            r0 = 1092(0x444, float:1.53E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.4fh r0 = X.AnonymousClass6F9.A00(r0)
            X.1aU r1 = r1.A0O(r0)
            X.OwQ r0 = X.C72106OwQ.A00
            X.1aU r1 = r1.A0M(r0)
            X.T8o r0 = new X.T8o
            r0.<init>(r9, r8)
        L_0x106c:
            r5.A02(r1, r0)
            goto L_0x0f4c
        L_0x1071:
            boolean r0 = r4.A06()
            if (r0 == 0) goto L_0x10d3
            X.09i r0 = X.08y.A00()
            com.instagram.common.session.UserSession r11 = r0.A00()
            if (r11 == 0) goto L_0x1118
            X.1a8 r5 = X.1a8.A00()
            X.Rxg r10 = new X.Rxg
            r18 = r10
            r19 = r26
            r20 = r27
            r21 = r25
            r22 = r4
            r23 = r6
            r18.<init>(r19, r20, r21, r22, r23)
            com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession r4 = X.1y0.A00(r11)
            r0 = 17
            X.Plm r1 = new X.Plm
            r1.<init>(r11, r0)
            java.lang.Class<X.O83> r0 = X.O83.class
            java.lang.Object r0 = r4.A01(r0, r1)
            X.O83 r0 = (X.O83) r0
            X.O82 r0 = r0.A00
            X.1aU r1 = r0.A00
            X.OwO r0 = X.OwO.A00
            X.1aU r1 = r1.A0M(r0)
            X.T8o r0 = new X.T8o
            r0.<init>(r10, r9)
            goto L_0x106c
        L_0x10b9:
            java.util.HashSet r4 = X.AnonymousClass7TE.A1F()
            X.S6q r6 = r9.A03
            android.content.Intent r1 = r6.A02
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_BLACK_HOLE_LIST"
            r1.putExtra(r0, r4)
            X.SUL r5 = r9.A04
            androidx.fragment.app.Fragment r4 = r9.A02
            android.content.Intent r1 = r9.A01
            int r0 = r9.A00
            A01(r1, r4, r6, r5, r0)
            goto L_0x0f4c
        L_0x10d3:
            r5 = r26
            r1 = r27
            r0 = r25
            A01(r5, r1, r0, r4, r6)
            goto L_0x0f4c
        L_0x10de:
            X.3sm r0 = r0.A00
            int r12 = r0.A01
            int r5 = r0.A00
            java.lang.String r0 = r0.A02
            byte[] r1 = android.util.Base64.decode(r0, r9)
            X.0qQ.A0A(r1)
            r0 = r25
            r0.A03(r1, r12, r5)
            goto L_0x0cbb
        L_0x10f4:
            r1 = 0
            goto L_0x0c92
        L_0x10f7:
            java.lang.String[] r1 = r0.A01
            goto L_0x0c67
        L_0x10fb:
            r12 = 0
            goto L_0x0b87
        L_0x10fe:
            X.RF6 r0 = X.RF6.OPT_IN
            goto L_0x0b1d
        L_0x1102:
            java.lang.String r2 = r44.toString()
            goto L_0x002a
        L_0x1108:
            if (r2 != 0) goto L_0x0017
            java.lang.String r2 = "in_app_browser_v2"
            goto L_0x0017
        L_0x110e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x1113:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x1118:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x111d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x1122:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ RuntimeException -> 0x1127 }
            throw r0     // Catch:{ RuntimeException -> 0x1127 }
        L_0x1127:
            android.content.Context r1 = r4.A1I
            r0 = 2131976820(0x7f136274, float:1.9590771E38)
            X.C59689JTv.A07(r1, r0)
            java.lang.String r1 = "BrowserLauncher called with invalid mUrl: "
            r0 = r16
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "BrowserLauncher"
            X.0wb.A03(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUL.A02(androidx.fragment.app.Fragment, X.SUL, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SUL(Context context, UserSession userSession, 2EG r9, String str) {
        this(context, userSession, r9, str, false);
        AnonymousClass7TG.A1O(context, userSession);
    }
}
