package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.4at  reason: invalid class name and case insensitive filesystem */
public final class C267064at implements View.OnAttachStateChangeListener {
    public View.OnClickListener A00;
    public View.OnLongClickListener A01;
    public C243993aT A02;
    public 0xF A03;
    public 1Xj A04;
    public AnonymousClass3W1 A05;
    public UserDetailEntryInfo A06;
    public SearchContext A07;
    public C243873aF A08;
    public C243853aD A09;
    public C243913aJ A0A;
    public C243893aH A0B;
    public C243943aO A0C;
    public User A0D;
    public C249763kK A0E;
    public Long A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public C62320sa A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q = true;
    public final FollowButtonBase A0R;
    public final AnonymousClass0eM A0S = AnonymousClass1YB.A00(C267084av.A00);
    public final C267074au A0T = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.4au] */
    public C267064at(FollowButtonBase followButtonBase) {
        this.A0R = followButtonBase;
    }

    public static final void A02(UserSession userSession, C267064at r4, User user) {
        UserSession userSession2 = userSession;
        FollowStatus A0N2 = AnonymousClass2f1.A00(userSession).A0N(user);
        FollowButtonBase followButtonBase = r4.A0R;
        followButtonBase.A05(userSession2, A0N2, user, r4.A0Q, AnonymousClass3GL.A01(userSession2));
        followButtonBase.A06(A0N2);
    }

    public final void A03(AnonymousClass0iw r11, UserSession userSession, User user) {
        boolean z;
        boolean z2 = false;
        AnonymousClass0iw r8 = r11;
        UserSession userSession2 = userSession;
        User user2 = user;
        if (userSession == null) {
            z = true;
        } else if (user == null || r11 == null) {
            z = false;
        } else {
            this.A0D = user;
            FollowStatus A0N2 = AnonymousClass2f1.A00(userSession).A0N(user);
            FollowButtonBase followButtonBase = this.A0R;
            followButtonBase.A06(A0N2);
            if (2R8.A04(userSession, user)) {
                followButtonBase.setVisibility(8);
                return;
            }
            followButtonBase.setVisibility(0);
            followButtonBase.A05(userSession2, A0N2, user2, this.A0Q, AnonymousClass3GL.A01(userSession));
            View.OnClickListener onClickListener = this.A00;
            if (onClickListener == null) {
                onClickListener = new C267144b2(r8, userSession, this, A0N2, user);
            }
            AnonymousClass0fU.A00(onClickListener, followButtonBase);
            followButtonBase.setOnLongClickListener(this.A01);
            return;
        }
        Boolean valueOf = Boolean.valueOf(z);
        boolean z3 = false;
        if (user == null) {
            z3 = true;
        }
        Boolean valueOf2 = Boolean.valueOf(z3);
        if (r11 == null) {
            z2 = true;
        }
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Required params must not be null. Is userSession null: %b, is user null: %b, is analyticsModule null: %b", valueOf, valueOf2, Boolean.valueOf(z2));
        0qQ.A07(formatStrLocaleSafe);
        0wb.A03("FollowButtonHelper", formatStrLocaleSafe);
    }

    public final void A04(0xF r17, UserSession userSession, 1Xj r19, AnonymousClass3W1 r20, SearchContext searchContext, C243853aD r22, User user, C249763kK r24, Double d, String str) {
        0xG r2;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        User user2 = user;
        FollowStatus A0N2 = AnonymousClass2f1.A00(userSession2).A0N(user2);
        FollowButtonBase followButtonBase = this.A0R;
        followButtonBase.A06(A0N2);
        0xF r5 = r17;
        1Xj r7 = r19;
        AnonymousClass3W1 r8 = r20;
        SearchContext searchContext2 = searchContext;
        C243853aD r10 = r22;
        Double d2 = d;
        String str2 = str;
        if (A0N2 == FollowStatus.A06) {
            Integer B6m = user2.A03.B6m();
            if (B6m == null || B6m.intValue() <= 0) {
                AnonymousClass0eM r23 = this.A0S;
                Integer num = AnonymousClass05K.A0C;
                if (((C49714F2z) r23.getValue()).A01(userSession2, user2, num)) {
                    Context context = followButtonBase.getContext();
                    0qQ.A07(context);
                    ((C49714F2z) r23.getValue()).A00(context, userSession2, user2, num, "");
                    return;
                }
            } else {
                if (str != null) {
                    r2 = new 0xG(str2);
                } else {
                    r2 = null;
                }
                C50013FIy fIy = new C50013FIy(r5, userSession2, r7, r8, searchContext2, r10, this, user2, r24, d2, str2);
                C49173Eqe.A00(userSession2, user2, AnonymousClass000.A00(786));
                Context context2 = followButtonBase.getRootView().requireViewById(16908290).getContext();
                0qQ.A07(context2);
                FH6.A05(context2, fIy, new FIR(userSession2, this, user2), r2, this.A09, user2);
                return;
            }
        }
        A01(r5, userSession2, r7, r8, searchContext2, r10, this, user2, d2, str2);
    }

    public final void A05(UserSession userSession, User user) {
        FollowButtonBase followButtonBase = this.A0R;
        FollowStatus followStatus = FollowStatus.A06;
        followButtonBase.A06(followStatus);
        followButtonBase.setVisibility(0);
        followButtonBase.A05(userSession, followStatus, user, true, AnonymousClass3GL.A01(userSession));
    }

    public final void A06(UserSession userSession, User user) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        User user2 = user;
        FollowStatus A0N2 = AnonymousClass2f1.A00(userSession).A0N(user);
        FollowButtonBase followButtonBase = this.A0R;
        followButtonBase.A06(A0N2);
        if (2R8.A04(userSession, user)) {
            followButtonBase.setVisibility(8);
            return;
        }
        followButtonBase.setVisibility(0);
        followButtonBase.A05(userSession2, A0N2, user2, this.A0Q, AnonymousClass3GL.A01(userSession));
    }

    public static final void A00(AnonymousClass0iw r20, UserSession userSession, C267064at r22, FollowStatus followStatus, User user) {
        C267064at r14 = r22;
        C62320sa r0 = r14.A0L;
        if (r0 != null) {
            r0.invoke();
        }
        Double d = null;
        UserSession userSession2 = userSession;
        User user2 = user;
        if (followStatus != FollowStatus.A05 || user2.A0N() == AnonymousClass05K.A01) {
            C243853aD r8 = r14.A09;
            1Xj r7 = r14.A04;
            AnonymousClass3W1 r6 = r14.A05;
            0xF r5 = r14.A03;
            C249763kK r4 = r14.A0E;
            String str = r14.A0K;
            SearchContext searchContext = r14.A07;
            C243993aT r02 = r14.A02;
            if (r02 != null) {
                d = r02.A0B;
            }
            r14.A04(r5, userSession2, r7, r6, searchContext, r8, user2, r4, d, str);
            return;
        }
        C243853aD r13 = r14.A09;
        1Xj r10 = r14.A04;
        AnonymousClass3W1 r11 = r14.A05;
        0xF r82 = r14.A03;
        C249763kK r2 = r14.A0E;
        String str2 = r14.A0K;
        SearchContext searchContext2 = r14.A07;
        C243993aT r03 = r14.A02;
        if (r03 != null) {
            d = r03.A0B;
        }
        C249763kK r16 = r2;
        C50014FIz fIz = new C50014FIz(r82, userSession2, r10, r11, searchContext2, r13, r14, user2, r16, d, str2);
        Context context = r14.A0R.getRootView().requireViewById(16908290).getContext();
        0qQ.A07(context);
        FH6.A06(context, fIz, new C49987FHw(r14), r20, r14.A09, user2);
    }

    public static final void A01(0xF r21, UserSession userSession, 1Xj r23, AnonymousClass3W1 r24, SearchContext searchContext, C243853aD r26, C267064at r27, User user, Double d, String str) {
        Resources resources;
        int i;
        String string;
        Resources resources2;
        int i2;
        String string2;
        AnonymousClass5Gv r0;
        Handler handler;
        UserSession userSession2 = userSession;
        C267064at r7 = r27;
        User user2 = user;
        H4M h4m = new H4M(userSession2, r7, user2);
        FollowButtonBase followButtonBase = r7.A0R;
        Context context = followButtonBase.getContext();
        0qQ.A07(context);
        String str2 = r7.A0H;
        String str3 = r7.A0J;
        String str4 = r7.A0I;
        UserDetailEntryInfo userDetailEntryInfo = r7.A06;
        C243943aO r2 = r7.A0C;
        C243943aO r18 = r2;
        FH6.A07(context, r21, h4m, userSession2, r23, r24, userDetailEntryInfo, searchContext, r26, r18, user2, (Boolean) null, d, r7.A0F, str2, str3, str4, str, (String) null, (String) null, r7.A0G, (JSONObject) null);
        String username = user2.getUsername();
        int ordinal = user2.B6o().ordinal();
        if (ordinal != 4) {
            if (ordinal == 3) {
                resources = followButtonBase.getResources();
                i = 2131975873;
            } else if (ordinal != 5) {
                string = "";
            } else {
                resources = followButtonBase.getResources();
                i = 2131962626;
            }
            string = resources.getString(i, new Object[]{username});
        } else {
            resources = followButtonBase.getResources();
            i = 2131962617;
            string = resources.getString(i, new Object[]{username});
        }
        0qQ.A0A(string);
        followButtonBase.announceForAccessibility(string);
        FollowStatus A0N2 = AnonymousClass2f1.A00(userSession2).A0N(user2);
        followButtonBase.A05(userSession2, A0N2, user2, r7.A0Q, AnonymousClass3GL.A01(userSession2));
        C267074au r22 = r7.A0T;
        if (!C61970qY.A0E(context)) {
            1Av A002 = 1Au.A00(userSession2);
            if (!((Boolean) A002.A4I.CDM(A002, 1Av.A8a[98])).booleanValue() && (A0N2 == FollowStatus.A05 || A0N2 == FollowStatus.A06)) {
                C234222xL r72 = r22.A02;
                if (r72 == null) {
                    r72 = new FdV(userSession2, r22);
                    r22.A02 = r72;
                }
                if (A0N2 == FollowStatus.A06) {
                    Integer A0N3 = user2.A0N();
                    Integer num = AnonymousClass05K.A0C;
                    resources2 = context.getResources();
                    if (A0N3 == num) {
                        string2 = resources2.getString(2131968766);
                    } else {
                        i2 = 2131968765;
                        string2 = resources2.getString(i2, new Object[]{user2.B8Q()});
                    }
                } else {
                    resources2 = context.getResources();
                    i2 = 2131968769;
                    string2 = resources2.getString(i2, new Object[]{user2.B8Q()});
                }
                0qQ.A0A(string2);
                View findViewById = followButtonBase.getRootView().findViewById(16908290);
                if (findViewById != null) {
                    Context context2 = findViewById.getContext();
                    0qQ.A0C(context2, "null cannot be cast to non-null type android.app.Activity");
                    AnonymousClass5Gt r02 = new AnonymousClass5Gt((Activity) context2, new C315476jx((CharSequence) string2));
                    r02.A01();
                    r02.A0A = false;
                    r02.A04 = r72;
                    r02.A0F = false;
                    r02.A03(followButtonBase);
                    r0 = r02.A00();
                } else {
                    r0 = null;
                }
                r22.A01 = r0;
                if (r0 != null) {
                    Handler handler2 = r22.A00;
                    if (handler2 == null) {
                        handler2 = new Handler(Looper.getMainLooper());
                        r22.A00 = handler2;
                    }
                    Runnable runnable = r22.A03;
                    if (runnable == null) {
                        r22.A03 = new C51305Fry(r22);
                    } else if (handler2 != null) {
                        handler2.removeCallbacks(runnable);
                    }
                    Runnable runnable2 = r22.A03;
                    if (!(runnable2 == null || (handler = r22.A00) == null)) {
                        handler.postDelayed(runnable2, 500);
                    }
                }
            }
        }
        followButtonBase.A06(A0N2);
    }

    public final void A07(C243853aD r1) {
        this.A09 = r1;
        if (r1 != null) {
            r1.DGQ(this);
        }
    }

    public final void onViewAttachedToWindow(View view) {
        this.A0T.A04 = true;
    }

    public final void onViewDetachedFromWindow(View view) {
        C267074au r4 = this.A0T;
        r4.A04 = false;
        AnonymousClass5Gv r2 = r4.A01;
        if (r2 != null && r2.A09()) {
            Runnable runnable = r4.A03;
            Handler handler = r4.A00;
            if (!(handler == null || runnable == null)) {
                handler.removeCallbacks(runnable);
            }
            r2.A08(false);
        }
        r4.A01 = null;
    }
}
