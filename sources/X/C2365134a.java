package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.systrace.Systrace;
import com.instagram.api.schemas.HallpassDetailsDict;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.store.ReelStore;
import com.instagram.ui.swipenavigation.PositionConfig;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.34a  reason: invalid class name and case insensitive filesystem */
public final class C2365134a implements AnonymousClass0iw, C252243on, C228132kq, C230222pE, C2365234b {
    public static final Handler A0d = new Handler(Looper.getMainLooper());
    public static final String __redex_internal_original_name = "MainFeedReelTrayController";
    public View A00;
    public Reel A01;
    public ReelViewerConfig A02;
    public C230252pH A03;
    public C317766nn A04;
    public AnonymousClass6UX A05;
    public AnonymousClass6VJ A06;
    public boolean A07;
    public boolean A08 = true;
    public boolean A09;
    public C51914G7i A0A;
    public boolean A0B = true;
    public final Context A0C;
    public final C227812jx A0D;
    public final AnonymousClass0iw A0E;
    public final UserSession A0F;
    public final AnonymousClass4D6 A0G;
    public final C228162kt A0H;
    public final AnonymousClass2rI A0I;
    public final AnonymousClass351 A0J;
    public final C228322lL A0K;
    public final AnonymousClass2l3 A0L;
    public final C228302lG A0M;
    public final AnonymousClass1GX A0N;
    public final C228102kn A0O;
    public final C2365334c A0P;
    public final C2365934i A0Q;
    public final 2Zg A0R;
    public final boolean A0S;
    public final 1Ng A0T;
    public final 1wn A0U;
    public final 1wn A0V;
    public final 1wn A0W;
    public final AnonymousClass0qK A0X;
    public final C2366734q A0Y;
    public final C2367234v A0Z;
    public final C2366834r A0a;
    public final AnonymousClass34W A0b;
    public final AnonymousClass34T A0c;

    public C2365134a(Activity activity, Context context, C227812jx r24, AnonymousClass0iw r25, UserSession userSession, 2el r27, AnonymousClass34Y r28, C228162kt r29, AnonymousClass2rI r30, C228322lL r31, AnonymousClass2l3 r32, C228302lG r33, AnonymousClass34T r34, 2Zg r35) {
        C228162kt r2 = r29;
        0qQ.A0B(r2, 4);
        Context context2 = context;
        this.A0C = context2;
        C227812jx r1 = r24;
        this.A0D = r1;
        this.A0H = r2;
        this.A0I = r30;
        UserSession userSession2 = userSession;
        this.A0F = userSession2;
        this.A0R = r35;
        this.A0L = r32;
        AnonymousClass34T r3 = r34;
        this.A0c = r3;
        C228322lL r4 = r31;
        this.A0K = r4;
        this.A0M = r33;
        AnonymousClass0iw r7 = r25;
        this.A0E = r7;
        this.A0T = AnonymousClass1Nd.A00(userSession2);
        Activity activity2 = activity;
        C2365334c r10 = new C2365334c(activity2, context2, this, userSession2, r28, this);
        this.A0P = r10;
        C2365834h r22 = r10.A0C;
        this.A0Q = r22;
        this.A03 = new C230252pH(this, userSession2, (String) null, (String) null, (String) null);
        this.A0Y = new C2366734q(r7, userSession2);
        C228102kn A002 = C228092km.A00(userSession2);
        0qQ.A07(A002);
        this.A0O = A002;
        this.A0a = new C2366834r(r27, r4, this.A03, A002);
        this.A0Z = new C2367234v(activity2, context2, r7, userSession2, this);
        this.A02 = ReelViewerConfig.A00();
        this.A0V = new C2367334w(this);
        this.A0W = new C2367434x(this);
        this.A0b = new C2367534y(this);
        this.A0N = new C2367634z(this);
        this.A0U = new AnonymousClass350(this);
        r3.A00 = r10;
        r4.A02 = r22;
        r4.A01 = r10;
        r22.A03 = A002;
        Activity requireActivity = this.A0D.requireActivity();
        Activity parent = requireActivity.getParent();
        this.A0J = new AnonymousClass351(parent == null ? requireActivity : parent, userSession2, this, r10, this.A0E.getModuleName());
        this.A0G = r1;
        this.A0X = new AnonymousClass352(this);
        this.A0S = 182.A06(0Tu.A05, userSession2, 36310542583398575L);
    }

    public static final void A03(C2365134a r3, String str, String str2) {
        r3.A0B = false;
        FragmentActivity requireActivity = r3.A0D.requireActivity();
        UserSession userSession = r3.A0F;
        C309516Yo r2 = new C309516Yo(requireActivity, userSession);
        r2.A08();
        r2.A09 = new C22346Xzv(str2);
        r2.A0B((Bundle) null, C46447Df9.A03().A01.A02(userSession, C46548Dgp.A01(userSession, str, "reel_tray_user_options", str2).A04()));
        r2.A04();
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final void CLl(String str) {
        0qQ.A0B(str, 0);
        1OP.A05(this.A0F).A0c(str);
        A0D(false);
    }

    public final void D0J(Reel reel) {
        String str;
        EZX ezx;
        28D r0;
        0qQ.A0B(reel, 0);
        HallpassDetailsDict hallpassDetailsDict = reel.A08;
        String str2 = null;
        if (hallpassDetailsDict != null) {
            str = hallpassDetailsDict.BAL();
            str2 = hallpassDetailsDict.getName();
        } else {
            str = null;
        }
        C2366734q r1 = this.A0Y;
        Integer num = AnonymousClass05K.A0C;
        String str3 = this.A03.A04;
        if (1OP.A05(this.A0O.A07).A05) {
            ezx = EZX.GROUP_STORY_TRAY;
        } else {
            ezx = EZX.STORY_TRAY;
        }
        r1.A00(ezx, num, (Integer) null, (String) null, (String) null, str3, (String) null, str, str2, AnonymousClass000.A00(3302));
        if (str != null && str2 != null) {
            UserSession userSession = this.A0F;
            C227812jx r12 = this.A0D;
            if (reel.A0O(userSession).isEmpty()) {
                r0 = 28D.A33;
            } else {
                r0 = 28D.A32;
            }
            C49957FGp.A07(r0, r12, userSession, str, str2);
        }
    }

    public final void D6z(View view) {
        IllegalStateException illegalStateException;
        boolean A0E2;
        View view2;
        ViewTreeObserver viewTreeObserver;
        0qQ.A0B(view, 0);
        if (Systrace.A0E(1)) {
            0fS.A01("MainFeedReelTrayController.onCreateView", 1715255876);
        }
        try {
            C2365334c r5 = this.A0P;
            r5.A03();
            RecyclerView recyclerView = r5.A03;
            this.A00 = recyclerView;
            if (recyclerView != null) {
                0nA.A0o(recyclerView, new AnonymousClass3BF(this), new AnonymousClass3BE(this));
                View view3 = this.A00;
                if (view3 != null) {
                    0nA.A0o(view3, new AnonymousClass3BH(this), new AnonymousClass3BG(this));
                    UserSession userSession = this.A0F;
                    UserSession userSession2 = 1NM.A00(userSession).A00;
                    0Tu r4 = 0Tu.A05;
                    boolean A062 = 182.A06(r4, userSession2, 36319115333671846L);
                    boolean A063 = 182.A06(r4, 1NM.A00(userSession).A00, 36325867022398771L);
                    if (!((!A062 && !A063) || (view2 = this.A00) == null || (viewTreeObserver = view2.getViewTreeObserver()) == null)) {
                        viewTreeObserver.addOnGlobalLayoutListener(new C279394yZ(this, A062, A063));
                    }
                    A0D(false);
                    AnonymousClass2rI r2 = this.A0I;
                    r2.A02 = r5.A03;
                    r2.A0A(-1);
                    C228102kn r1 = this.A0O;
                    r5.A08(r1);
                    r2.A01 = r5.A02;
                    C2367234v r6 = this.A0Z;
                    r6.A01 = this.A00;
                    boolean z = 1OP.A05(r1.A07).A05;
                    View view4 = r6.A01;
                    if (view4 != null) {
                        UserSession userSession3 = r6.A06;
                        if (182.A06(r4, userSession3, 36320313630531826L) && !z) {
                            long A002 = (long) 182.A00(r4, userSession3, 37164738561573203L);
                            if (A002 > 0) {
                                view4.postDelayed(new C51374Ft6(view4, r6), 1000 * A002);
                            }
                        }
                    }
                    if (!A0E2) {
                        return;
                    }
                    return;
                }
                illegalStateException = new IllegalStateException("Required value was null.");
            } else {
                illegalStateException = new IllegalStateException("Required value was null.");
            }
            throw illegalStateException;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1374608838);
            }
        }
    }

    public final void DFj(Reel reel, AnonymousClass6UY r6) {
        String str;
        1Wj r2;
        0qQ.A0B(r6, 1);
        if (r6.A00) {
            str = C273654mx.A00(1173);
        } else {
            str = null;
        }
        C227812jx r1 = this.A0D;
        if (r1.isAdded() && str != null && (r2 = 1Wj.A00) != null) {
            r2.A03(this.A0F, r1.getActivity(), str);
        }
    }

    public final void DIR() {
        A08(true);
        this.A0Y.A03(this.A03.A04, AnonymousClass000.A00(1437));
    }

    public final void DVw() {
        A04(this, false);
    }

    public final /* synthetic */ void DcC(Reel reel) {
    }

    public final void DcY(C62539KhV khV, String str) {
    }

    public final /* synthetic */ void DcZ(Reel reel, AnonymousClass3BN r2, int i) {
    }

    public final void Dca(C249703kE r8, AnonymousClass3O9 r9, Integer num, String str, String str2, List list, int i, boolean z) {
        0qQ.A0B(str, 0);
        UserSession userSession = this.A0F;
        1OI A002 = 1OH.A00(userSession);
        Integer num2 = AnonymousClass05K.A0C;
        A002.A0D(num2);
        this.A0M.A00("REEL_ITEM_CLICKED");
        if (!AnonymousClass2Rc.A00 || this.A0D.isVisible()) {
            Reel A012 = this.A0P.A01(str);
            if (A012 == null) {
                AnonymousClass6VJ r0 = this.A06;
                if (r0 != null) {
                    r0.A05(num2);
                }
                C59689JTv.A07(this.A0C, 2131965437);
            } else if (!182.A06(0Tu.A05, userSession, 36329663773032692L) || (!A012.A0a() && ((!A012.A15(userSession) && !A012.A0k()) || !A012.A1a))) {
                boolean A0a2 = A012.A0a();
                if (A0a2 || ((A012.A15(userSession) || A012.A0k()) && A012.A1a)) {
                    A04(this, A0a2);
                } else {
                    A05(A012, AnonymousClass3BQ.MAIN_FEED_TRAY, i);
                }
            } else {
                Context context = this.A0C;
                CharSequence[] charSequenceArr = {context.getString(2131952420), context.getString(2131952421)};
                C358248ab r1 = new C358248ab(context);
                r1.A0l(this.A0D, userSession);
                r1.A0e(new FIO(this, A012, charSequenceArr), charSequenceArr);
                r1.A0s(true);
                AnonymousClass0fN.A00(r1.A02());
            }
        }
    }

    public final /* synthetic */ void Dcb(C249703kE r1, AnonymousClass3O9 r2, Integer num, String str, String str2, String str3, List list, float f, int i, int i2, boolean z) {
    }

    public final void Dcd(Reel reel, AnonymousClass3BN r9, Integer num, int i) {
        0qQ.A0B(reel, 0);
        0qQ.A0B(r9, 2);
        this.A03.A02(reel, r9, (Boolean) null, (Boolean) null, (Integer) null, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dcf(java.util.List r24, int r25, java.lang.String r26) {
        /*
            r23 = this;
            r6 = 0
            r7 = r26
            X.0qQ.A0B(r7, r6)
            r0 = 2
            r5 = r24
            X.0qQ.A0B(r5, r0)
            r4 = r23
            com.instagram.common.session.UserSession r3 = r4.A0F
            com.instagram.reels.store.ReelStore r8 = X.1OP.A05(r3)
            com.instagram.model.reels.Reel r0 = r8.A0M(r7)
            if (r0 != 0) goto L_0x0033
            java.lang.String r9 = "add_to_story"
            boolean r0 = r9.equals(r7)
            if (r0 == 0) goto L_0x02d1
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r3)
            X.1Nr r2 = new X.1Nr
            r2.<init>(r0)
            r1 = 1
            com.instagram.model.reels.Reel r0 = new com.instagram.model.reels.Reel
            r0.<init>(r2, r9, r1)
        L_0x0033:
            boolean r1 = r0.A0g()
            if (r1 == 0) goto L_0x00a4
            X.34v r8 = r4.A0Z
            com.instagram.api.schemas.HallpassDetailsDict r1 = r0.A08
            if (r1 == 0) goto L_0x0076
            java.lang.String r7 = r1.BAL()
            java.lang.String r6 = r1.getName()
            if (r7 == 0) goto L_0x0076
            if (r6 == 0) goto L_0x0076
            X.34q r9 = r8.A07
            java.lang.Integer r11 = X.AnonymousClass05K.A0Y
            r12 = 0
            X.34a r2 = r8.A08
            X.2pH r1 = r2.A03
            java.lang.String r15 = r1.A04
            boolean r1 = r2.A0A()
            if (r1 == 0) goto L_0x00a1
            X.EZX r10 = X.EZX.GROUP_STORY_TRAY
        L_0x005e:
            r1 = 3300(0xce4, float:4.624E-42)
            java.lang.String r19 = X.AnonymousClass000.A00(r1)
            r13 = r12
            r14 = r12
            r16 = r12
            r18 = r6
            r17 = r7
            r9.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.instagram.common.session.UserSession r2 = r8.A06
            android.app.Activity r1 = r8.A03
            X.C49957FGp.A05(r1, r2, r7, r6)
        L_0x0076:
            boolean r0 = r0.A0a()
            if (r0 != 0) goto L_0x00a0
            int r0 = r5.size()
            r6 = r25
            if (r6 >= r0) goto L_0x0310
            X.0iw r0 = r4.A0E
            X.0wc r2 = X.AnonymousClass0kN.A01(r0, r3)
            java.lang.String r1 = "longpress_story_tray_item"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            java.lang.Object r1 = r5.get(r6)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "target_id"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x00a0:
            return
        L_0x00a1:
            X.EZX r10 = X.EZX.STORY_TRAY
            goto L_0x005e
        L_0x00a4:
            X.34c r1 = r4.A0P
            com.instagram.model.reels.Reel r22 = r1.A01(r7)
            r2 = 1
            if (r22 == 0) goto L_0x0076
            boolean r1 = r22.A0t()
            if (r1 == r2) goto L_0x0076
            X.2jx r7 = r4.A0D
            androidx.fragment.app.FragmentActivity r17 = r7.requireActivity()
            android.content.Context r15 = r4.A0C
            X.EuE r2 = new X.EuE
            r2.<init>(r4)
            X.RqD r1 = new X.RqD
            r1.<init>(r4)
            X.FAY r14 = new X.FAY
            r19 = r3
            r20 = r2
            r21 = r1
            r18 = r4
            r16 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            androidx.fragment.app.FragmentActivity r8 = r14.A02
            android.content.res.Resources r10 = r8.getResources()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.instagram.model.reels.Reel r7 = r14.A07
            com.instagram.user.model.User r2 = r7.A0D()
            boolean r1 = r7.A0r()
            if (r1 == 0) goto L_0x0217
            r1 = 2131974572(0x7f1359ac, float:1.9586212E38)
            java.lang.String r1 = r10.getString(r1)
        L_0x00f2:
            X.0qQ.A07(r1)
        L_0x00f5:
            r9.add(r1)
        L_0x00f8:
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r6]
            java.lang.Object[] r1 = r9.toArray(r1)
            java.lang.CharSequence[] r1 = (java.lang.CharSequence[]) r1
            int r1 = r1.length
            if (r1 != 0) goto L_0x0109
            java.lang.String r1 = X.FAY.A00(r14)
            if (r1 == 0) goto L_0x0076
        L_0x0109:
            com.instagram.common.session.UserSession r9 = r14.A04
            X.Dg1 r6 = new X.Dg1
            r6.<init>(r8, r9)
            java.lang.String r1 = X.FAY.A00(r14)
            if (r1 == 0) goto L_0x0119
            r6.A08(r1)
        L_0x0119:
            android.content.res.Resources r10 = r8.getResources()
            com.instagram.user.model.User r11 = r7.A0D()
            boolean r1 = r7.A0r()
            if (r1 == 0) goto L_0x0148
            r2 = 2131974572(0x7f1359ac, float:1.9586212E38)
            X.FLj r1 = new X.FLj
            r1.<init>(r14)
        L_0x012f:
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r6.A04(r1, r2)
        L_0x0134:
            java.util.List r1 = r6.A09
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0076
            X.FFy r1 = new X.FFy
            r1.<init>(r6)
            r1.A03(r8)
            goto L_0x0076
        L_0x0148:
            boolean r1 = r7.A1a
            if (r1 != 0) goto L_0x01b3
            boolean r1 = r7.A0a()
            if (r1 != 0) goto L_0x01b3
            boolean r1 = r7.A1P
            if (r1 != 0) goto L_0x0179
            if (r11 == 0) goto L_0x0179
            r2 = 2131976660(0x7f1361d4, float:1.9590447E38)
            X.FNE r1 = new X.FNE
            r1.<init>(r14, r11)
            r6.A04(r1, r2)
            boolean r1 = r7.A1Y
            if (r1 == 0) goto L_0x0170
            r2 = 2131967920(0x7f133fb0, float:1.957272E38)
            X.FLg r1 = new X.FLg
            r1.<init>(r14)
            goto L_0x012f
        L_0x0170:
            r2 = 2131967919(0x7f133faf, float:1.9572718E38)
            X.FLh r1 = new X.FLh
            r1.<init>(r14)
            goto L_0x012f
        L_0x0179:
            boolean r1 = X.AnonymousClass3PQ.A07(r7)
            if (r1 == 0) goto L_0x0134
            boolean r1 = r7.A0o()
            if (r1 == 0) goto L_0x01aa
            r1 = 2131972413(0x7f13513d, float:1.9581833E38)
            java.lang.String r9 = r10.getString(r1)
        L_0x018c:
            boolean r1 = r7.A1Y
            r2 = 2131967921(0x7f133fb1, float:1.9572722E38)
            if (r1 == 0) goto L_0x0196
            r2 = 2131975958(0x7f135f16, float:1.9589023E38)
        L_0x0196:
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            java.lang.String r2 = r10.getString(r2, r1)
            X.0qQ.A0A(r2)
            X.FLi r1 = new X.FLi
            r1.<init>(r14)
            r6.A0C(r2, r1)
            goto L_0x0134
        L_0x01aa:
            X.1Ns r1 = r7.A0W
            if (r1 == 0) goto L_0x0322
            java.lang.String r9 = r1.getName()
            goto L_0x018c
        L_0x01b3:
            r2 = 2131952406(0x7f130316, float:1.9541254E38)
            X.FLk r1 = new X.FLk
            r1.<init>(r14)
            r6.A04(r1, r2)
            X.0Tu r12 = X.0Tu.A05
            r1 = 36319901312425678(0x8108c200011ece, double:3.032190066257307E-306)
            boolean r10 = X.182.A06(r12, r9, r1)
            if (r10 == 0) goto L_0x01d6
            r11 = 2131961517(0x7f1326ad, float:1.9559733E38)
            X.LWz r10 = new X.LWz
            r10.<init>(r14)
            r6.A04(r10, r11)
        L_0x01d6:
            boolean r1 = X.182.A06(r12, r9, r1)
            if (r1 != 0) goto L_0x01e7
            r2 = 2131961451(0x7f13266b, float:1.95596E38)
            X.LX0 r1 = new X.LX0
            r1.<init>(r14)
            r6.A04(r1, r2)
        L_0x01e7:
            boolean r1 = X.2R8.A00(r9)
            if (r1 == 0) goto L_0x0134
            X.FLl r2 = new X.FLl
            r2.<init>(r14)
            java.lang.String r1 = "[INTERNAL] Open Stories Switcher Tool"
            r6.A0C(r1, r2)
            X.FLm r2 = new X.FLm
            r2.<init>(r14)
            java.lang.String r1 = "[INTERNAL] Open Home Delivery Debug Tool"
            r6.A0C(r1, r2)
            java.util.List r1 = r7.A0O(r9)
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0134
            X.FLn r2 = new X.FLn
            r2.<init>(r14)
            java.lang.String r1 = "[INTERNAL] Delete All Of Your Active Stories"
            r6.A0C(r1, r2)
            goto L_0x0134
        L_0x0217:
            boolean r1 = r7.A1a
            if (r1 != 0) goto L_0x0277
            boolean r1 = r7.A0a()
            if (r1 != 0) goto L_0x0277
            boolean r1 = r7.A1P
            if (r1 != 0) goto L_0x0247
            if (r2 == 0) goto L_0x0247
            r1 = 2131976660(0x7f1361d4, float:1.9590447E38)
            java.lang.String r1 = r10.getString(r1)
            X.0qQ.A07(r1)
            r9.add(r1)
            boolean r2 = r7.A1Y
            r1 = 2131967919(0x7f133faf, float:1.9572718E38)
            if (r2 == 0) goto L_0x023e
            r1 = 2131967920(0x7f133fb0, float:1.957272E38)
        L_0x023e:
            java.lang.String r1 = r10.getString(r1)
            X.0qQ.A0A(r1)
            goto L_0x00f5
        L_0x0247:
            boolean r1 = X.AnonymousClass3PQ.A07(r7)
            if (r1 == 0) goto L_0x00f8
            boolean r1 = r7.A0o()
            if (r1 == 0) goto L_0x026e
            r1 = 2131972413(0x7f13513d, float:1.9581833E38)
            java.lang.String r11 = r10.getString(r1)
        L_0x025a:
            boolean r1 = r7.A1Y
            r2 = 2131967921(0x7f133fb1, float:1.9572722E38)
            if (r1 == 0) goto L_0x0264
            r2 = 2131975958(0x7f135f16, float:1.9589023E38)
        L_0x0264:
            java.lang.Object[] r1 = new java.lang.Object[]{r11}
            java.lang.String r1 = r10.getString(r2, r1)
            goto L_0x00f2
        L_0x026e:
            X.1Ns r1 = r7.A0W
            if (r1 == 0) goto L_0x032a
            java.lang.String r11 = r1.getName()
            goto L_0x025a
        L_0x0277:
            r1 = 2131952406(0x7f130316, float:1.9541254E38)
            java.lang.String r1 = r10.getString(r1)
            X.0qQ.A07(r1)
            r9.add(r1)
            com.instagram.common.session.UserSession r11 = r14.A04
            X.0Tu r13 = X.0Tu.A05
            r1 = 36319901312425678(0x8108c200011ece, double:3.032190066257307E-306)
            boolean r12 = X.182.A06(r13, r11, r1)
            if (r12 == 0) goto L_0x02a0
            r12 = 2131961517(0x7f1326ad, float:1.9559733E38)
            java.lang.String r12 = r10.getString(r12)
            X.0qQ.A07(r12)
            r9.add(r12)
        L_0x02a0:
            boolean r1 = X.182.A06(r13, r11, r1)
            if (r1 != 0) goto L_0x02b3
            r1 = 2131961451(0x7f13266b, float:1.95596E38)
            java.lang.String r1 = r10.getString(r1)
            X.0qQ.A07(r1)
            r9.add(r1)
        L_0x02b3:
            boolean r1 = X.2R8.A00(r11)
            if (r1 == 0) goto L_0x00f8
            java.lang.String r1 = "[INTERNAL] Open Stories Switcher Tool"
            r9.add(r1)
            java.lang.String r1 = "[INTERNAL] Open Home Delivery Debug Tool"
            r9.add(r1)
            java.util.List r1 = r7.A0O(r11)
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00f8
            java.lang.String r1 = "[INTERNAL] Delete All Of Your Active Stories"
            goto L_0x00f5
        L_0x02d1:
            java.lang.String r0 = "story_interstitial_roll_call"
            boolean r0 = r7.equals(r0)
            r1 = 0
            if (r0 == 0) goto L_0x02e6
            X.3BK r0 = X.AnonymousClass3BJ.A00(r3)
            boolean r0 = r0.A02
            com.instagram.model.reels.Reel r0 = X.C49098EpN.A00(r1, r0)
            goto L_0x0033
        L_0x02e6:
            java.lang.String r0 = "election:hallpass"
            boolean r0 = X.00p.A0k(r7, r0, r6)
            if (r0 == 0) goto L_0x00a0
            monitor-enter(r8)
            java.util.ArrayList r0 = r8.A04     // Catch:{ all -> 0x0334 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0334 }
        L_0x02f5:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0334 }
            if (r0 == 0) goto L_0x0332
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0334 }
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0     // Catch:{ all -> 0x0334 }
            java.lang.String r1 = r0.getId()     // Catch:{ all -> 0x0334 }
            if (r1 == 0) goto L_0x02f5
            boolean r1 = r1.equals(r7)     // Catch:{ all -> 0x0334 }
            if (r1 == 0) goto L_0x02f5
            monitor-exit(r8)
            goto L_0x0033
        L_0x0310:
            java.lang.String r2 = "position out of bounds, position="
            java.lang.String r1 = ", sourceIdsSize="
            int r0 = r5.size()
            java.lang.String r1 = X.002.A02(r6, r0, r2, r1)
            java.lang.String r0 = "MainFeedReelTrayController"
            X.0wb.A03(r0, r1)
            return
        L_0x0322:
            java.lang.String r1 = "Mutable multi-author story should have an owner"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x032a:
            java.lang.String r1 = "Mutable multi-author story should have an owner"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0332:
            monitor-exit(r8)
            return
        L_0x0334:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2365134a.Dcf(java.util.List, int, java.lang.String):void");
    }

    public final void Dcg(Integer num, int i, long j, boolean z) {
        Integer num2 = num;
        0qQ.A0B(num, 3);
        View view = this.A00;
        if (view != null) {
            view.postDelayed(new C283675It(this), 250);
        }
        C230252pH r3 = this.A03;
        UserSession userSession = this.A0F;
        r3.A04(new AnonymousClass3BN(userSession, 1OP.A05(userSession).A0U(false)), this.A0O, num2, i, j, z);
        this.A0M.A00("REEL_TRAY_REQUEST_FAILED");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (X.182.A06(X.0Tu.A05, X.1NM.A00(r14).A00, 36317234137994173L) != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dch(X.1OE r19, java.lang.String r20, int r21, long r22, boolean r24, boolean r25) {
        /*
            r18 = this;
            r4 = 0
            r3 = r19
            X.0qQ.A0B(r3, r4)
            r1 = 1
            r6 = r20
            X.0qQ.A0B(r6, r1)
            r0 = -1
            r13 = r18
            r2 = r21
            if (r2 == r0) goto L_0x00c6
            if (r2 == r1) goto L_0x00c6
        L_0x0015:
            if (r2 == r0) goto L_0x002f
            com.instagram.common.session.UserSession r14 = r13.A0F
            r0 = 2
            if (r2 == r0) goto L_0x002f
            X.1NN r0 = X.1NM.A00(r14)
            com.instagram.common.session.UserSession r5 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317234137994173(0x810655000513bd, double:3.0305033344069736E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x008b
        L_0x002f:
            com.instagram.common.session.UserSession r14 = r13.A0F
            r15 = 0
            java.lang.String r0 = r3.A07
            X.2pH r12 = new X.2pH
            r16 = r6
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            r13.A03 = r12
            X.34r r1 = r13.A0a
            X.34s r0 = r1.A06
            r0.A00 = r12
            X.34t r0 = r1.A05
            r0.A00 = r12
            X.34u r0 = r1.A04
            r0.A00 = r12
            X.3N2 r2 = A00(r13)
            android.view.View r1 = r13.A00
            if (r2 == 0) goto L_0x00b1
            if (r1 == 0) goto L_0x00b1
            X.2pH r5 = r13.A03
            com.instagram.reels.store.ReelStore r0 = X.1OP.A05(r14)
            java.util.List r0 = r0.A0U(r4)
            X.3BN r6 = new X.3BN
            r6.<init>(r14, r0)
            X.2kn r7 = r13.A0O
            java.lang.Integer r9 = r3.A04
            int r0 = r1.getWidth()
            double r0 = (double) r0
            android.view.View r2 = r2.AeH()
            int r2 = r2.getWidth()
            double r2 = (double) r2
            double r0 = r0 / r2
            java.lang.Double r8 = java.lang.Double.valueOf(r0)
        L_0x007d:
            r10 = r22
            r12 = r24
            r5.A03(r6, r7, r8, r9, r10, r12)
            X.2lG r1 = r13.A0M
            java.lang.String r0 = "REEL_TRAY_REQUEST_FINISHED"
            r1.A00(r0)
        L_0x008b:
            X.34c r0 = r13.A0P
            X.2kn r4 = r13.A0O
            r0.A08(r4)
            X.1NN r0 = X.1NM.A00(r14)
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319115333540772(0x81080b00031ba4, double:3.031693010045609E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00b0
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x00b0
            X.2LK r0 = X.2LI.A00(r14)
            r0.A01()
        L_0x00b0:
            return
        L_0x00b1:
            X.2pH r5 = r13.A03
            com.instagram.reels.store.ReelStore r0 = X.1OP.A05(r14)
            java.util.List r0 = r0.A0U(r4)
            X.3BN r6 = new X.3BN
            r6.<init>(r14, r0)
            X.2kn r7 = r13.A0O
            java.lang.Integer r9 = r3.A04
            r8 = 0
            goto L_0x007d
        L_0x00c6:
            r13.A07()
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2365134a.Dch(X.1OE, java.lang.String, int, long, boolean, boolean):void");
    }

    public final void Dci(String str) {
        0qQ.A0B(str, 0);
        A03(this, str, C273654mx.A00(3383));
    }

    public final void Dcj() {
        A09(true, true);
    }

    public final /* synthetic */ void Dcl(Reel reel) {
    }

    public final void E0D(C249703kE r1, Reel reel, Integer num, String str, String str2, List list) {
    }

    public final void EBe(View view, int i, boolean z) {
        0qQ.A0B(view, 0);
        C2366834r r5 = this.A0a;
        C21400Xa8 xa8 = new C21400Xa8(i, z);
        Object obj = new Object();
        AnonymousClass30Y r0 = AnonymousClass30Y.A07;
        C2354830a r1 = new C2354830a(obj, xa8, "campfire_group_story_peek");
        r1.A00(r5.A04);
        r5.A01.A05(view, r1.A01());
    }

    public final void ECI(View view, Reel reel, AnonymousClass3BN r10, int i) {
        0qQ.A0B(view, 0);
        this.A0a.A00(view, reel, r10, Boolean.valueOf(reel.A0g()), i);
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public static final AnonymousClass3N2 A00(C2365134a r7) {
        C249703kE A0X2;
        C249703kE A0X3;
        AnonymousClass3N2 r3;
        User user;
        C2365934i r6 = r7.A0Q;
        C2365834h r1 = (C2365834h) r6;
        int A042 = r1.A04();
        int i = A042;
        if ((r6 instanceof C2365834h) && r1.A04()) {
            A042--;
        }
        C2365334c r2 = r7.A0P;
        RecyclerView recyclerView = r2.A03;
        if (recyclerView == null) {
            A0X2 = null;
        } else {
            A0X2 = recyclerView.A0X(i, false);
        }
        if (A0X2 instanceof AnonymousClass3N2) {
            RecyclerView recyclerView2 = r2.A03;
            if (recyclerView2 == null) {
                A0X3 = null;
            } else {
                A0X3 = recyclerView2.A0X(i, false);
            }
            if (A0X3 instanceof AnonymousClass3N2) {
                r3 = (AnonymousClass3N2) A0X3;
            } else {
                r3 = null;
            }
            List list = r6.A04;
            if (!list.isEmpty()) {
                User A012 = AnonymousClass0t1.A01.A01(r7.A0F);
                1Ns r0 = ((AnonymousClass3BT) list.get(A042)).A03.A0W;
                if (r0 != null) {
                    user = r0.CCd();
                } else {
                    user = null;
                }
                if (!0qQ.A0K(A012, user) || r3 == null) {
                    return null;
                }
                return r3;
            }
        }
        return null;
    }

    public static final ArrayList A01(C2365134a r2) {
        Reel reel = r2.A01;
        if (reel == null) {
            return r2.A0Q.A02();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(reel);
        arrayList.addAll(r2.A0Q.A02());
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.0rk] */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d4, code lost:
        if (r1 == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0111, code lost:
        if (r14 != null) goto L_0x0113;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C2365134a r12, X.C238133Ar r13, X.AnonymousClass3K2 r14) {
        /*
            X.0rk r5 = new X.0rk
            r5.<init>()
            r1 = -1
            r5.A00 = r1
            X.FkP r0 = new X.FkP
            r0.<init>(r12, r5)
            r12.A0A = r0
            X.3s4 r0 = X.C254183s4.REEL_TRAY
            int r0 = X.C253923rd.A02(r0, r13)
            if (r0 == r1) goto L_0x0111
            if (r14 == 0) goto L_0x0083
            X.3BQ r1 = r14.A0H
            X.3BQ r0 = X.AnonymousClass3BQ.PUSH_NOTIFICATION
            if (r1 != r0) goto L_0x002f
            com.instagram.model.reels.Reel r1 = r14.A0E
            if (r1 == 0) goto L_0x0113
            boolean r0 = r1.A0d()
            if (r0 != 0) goto L_0x002f
            boolean r0 = r1.A0c()
            if (r0 == 0) goto L_0x0113
        L_0x002f:
            X.34c r8 = r12.A0P
            X.G7i r2 = r12.A0A
            X.3BQ r7 = X.AnonymousClass3BQ.MAIN_FEED_TRAY
            com.instagram.model.reels.ReelViewerConfig r1 = r12.A02
            X.0iw r6 = r12.A0E
            r0 = 3
            X.0qQ.A0B(r1, r0)
            java.lang.Integer r1 = r14.A0S
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x0083
            android.view.View r0 = X.AnonymousClass3K2.A03(r14)
            r9 = 2
            r3 = 0
            r0.setLayerType(r9, r3)
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r0 = r14.A0v
            r0.setLayerType(r9, r3)
            r14.A0I = r2
            X.34h r2 = r8.A0C
            com.instagram.model.reels.Reel r0 = r14.A0D
            if (r0 == 0) goto L_0x0102
            int r4 = r2.CMG(r0)
        L_0x005d:
            r11 = r4
            boolean r2 = r14.A0U
            com.instagram.common.session.UserSession r10 = r14.A0u
            X.2kn r0 = X.C228092km.A00(r10)
            X.0qQ.A0B(r7, r9)
            r1 = 1
            if (r0 == 0) goto L_0x00ed
            java.util.ArrayList r0 = r0.A0R
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r1) goto L_0x00ed
            if (r2 == 0) goto L_0x00ed
            int r4 = r4 + 1
        L_0x007a:
            androidx.recyclerview.widget.RecyclerView r9 = r8.A03
            X.G7i r0 = r14.A0I
            if (r9 != 0) goto L_0x00b1
            X.AnonymousClass3K2.A0P(r6, r0, r14, r3)
        L_0x0083:
            com.instagram.common.session.UserSession r4 = r12.A0F
            X.1NN r0 = X.1NM.A00(r4)
            com.instagram.common.session.UserSession r2 = r0.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 36317517609637116(0x810697003f14fc, double:3.0306826030154194E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x00b0
            X.1NN r0 = X.1NM.A00(r4)
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 36598992586280273(0x820697003e0d51, double:3.208688511653309E-306)
            long r2 = X.182.A01(r3, r2, r0)
            int r1 = (int) r2
            int r0 = r5.A00
            if (r1 < r0) goto L_0x00b0
            r0 = 1
            r12.A0D(r0)
        L_0x00b0:
            return
        L_0x00b1:
            if (r0 == 0) goto L_0x00e4
            X.3BQ r1 = r14.A0H
            if (r1 == 0) goto L_0x00d6
            if (r11 == 0) goto L_0x00d6
            X.3BQ r0 = X.AnonymousClass3BQ.IN_FEED_STORIES_TRAY
            if (r1 == r0) goto L_0x00d6
            X.3BQ r0 = X.AnonymousClass3BQ.IN_FEED_HIGHLIGHTS_TRAY
            if (r1 == r0) goto L_0x00d6
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328663045783047(0x8110ba00023e07, double:3.037731021713175E-306)
            boolean r1 = X.182.A06(r2, r10, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.0qQ.A0A(r0)
            r2 = 1
            if (r1 != 0) goto L_0x00d7
        L_0x00d6:
            r2 = 0
        L_0x00d7:
            X.G7i r1 = r14.A0I
            com.instagram.model.reels.Reel r0 = r14.A0D
            if (r0 == 0) goto L_0x00e1
            java.lang.String r3 = r0.getId()
        L_0x00e1:
            r1.DYb(r4, r3, r2)
        L_0x00e4:
            X.FvZ r0 = new X.FvZ
            r0.<init>(r6, r7, r8, r14)
            X.0nA.A0p(r9, r0)
            goto L_0x0083
        L_0x00ed:
            if (r4 != 0) goto L_0x00f1
            r4 = 0
            goto L_0x007a
        L_0x00f1:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328663045651973(0x8110ba00003e05, double:3.0377310216302836E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 != 0) goto L_0x007a
            int r4 = r4 + -1
            goto L_0x007a
        L_0x0102:
            com.instagram.model.reels.Reel r1 = r14.A0E
            if (r1 == 0) goto L_0x010e
            X.3uh r0 = r14.A0F
            int r4 = r2.CMH(r1, r0)
            goto L_0x005d
        L_0x010e:
            r4 = -1
            goto L_0x005d
        L_0x0111:
            if (r14 == 0) goto L_0x0083
        L_0x0113:
            X.G7i r1 = r12.A0A
            r0 = 0
            r14.A0W(r0, r0, r12, r1)
            goto L_0x0083
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2365134a.A02(X.34a, X.3Ar, X.3K2):void");
    }

    public static final void A04(C2365134a r22, boolean z) {
        String str;
        if (Systrace.A0E(1)) {
            0fS.A01("MainFeedReelTrayController.launchReelCamera", 862749426);
        }
        try {
            C249813kP.A00.A06(AnonymousClass000.A00(5285), "reelTrayLaunchCamera", false);
            C2365134a r2 = r22;
            AnonymousClass6VJ r1 = r2.A06;
            if (r1 != null) {
                r1.A05(AnonymousClass05K.A0C);
            }
            if (z) {
                str = AnonymousClass000.A00(2751);
            } else {
                str = "your_story_placeholder";
            }
            2Zg r3 = r2.A0R;
            if (r3 != null) {
                AnonymousClass9PJ.A00(r2.A0F).A07(C348017xk.A00(str), true);
                r3.FLD(new PositionConfig((AnonymousClass57C) null, C358098aM.A00(AnonymousClass9QA.A00, new C358088aL[0]), (AnonymousClass3QO) null, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1.0f, 0, true));
            }
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(1004162266);
            }
        }
    }

    private final void A05(Reel reel, AnonymousClass3BQ r14, int i) {
        int i2;
        int i3;
        String str;
        AnonymousClass3K2 A042;
        if (Systrace.A0E(1)) {
            0fS.A01("MainFeedReelTrayController.maybePreloadAndLaunchViewer", -709997374);
        }
        try {
            boolean z = true;
            C249813kP.A00.A06("stories_viewer", "reelTrayLaunchViewer", true);
            FragmentActivity activity = this.A0D.getActivity();
            if (1OP.A0B(reel, this.A06)) {
                if (activity == null || (A042 = AnonymousClass3K2.A04(activity)) == null || !A042.A0a()) {
                    AnonymousClass6VJ r1 = this.A06;
                    if (r1 != null) {
                        r1.A05(AnonymousClass05K.A0C);
                    }
                    C2365334c r2 = this.A0P;
                    RecyclerView recyclerView = r2.A03;
                    if (recyclerView != null) {
                        recyclerView.A0o(r2.A0C.CMG(reel));
                    }
                    int i4 = 0;
                    if (r2.A00(reel) == null) {
                        z = false;
                    }
                    if (!reel.A1a && !reel.A0d() && !reel.A0c()) {
                        C2366334m.A00(this.A0F).A03(reel, r14, i);
                    }
                    AnonymousClass6VC A002 = AnonymousClass6VB.A00(this.A0F);
                    UserSession userSession = A002.A01;
                    if (reel.A0O(userSession).isEmpty()) {
                        i3 = -1;
                    } else {
                        i3 = reel.A03(userSession);
                    }
                    C255773uh A0B2 = reel.A0B(userSession, i3);
                    String id = reel.getId();
                    0qQ.A07(id);
                    if (A0B2 != null) {
                        str = AnonymousClass6VC.A02(A0B2);
                    } else {
                        str = null;
                    }
                    long A003 = AnonymousClass6VC.A00(A002, id, str);
                    1QP r5 = A002.A00;
                    r5.flowStart(A003, new UserFlowConfig(AnonymousClass000.A00(3348), true));
                    r5.flowAnnotate(A003, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "feed_timeline");
                    if (A0B2 != null) {
                        AnonymousClass6VC.A04(reel, A0B2, A002);
                    }
                    AnonymousClass6VC.A03(reel, A0B2, A002);
                    View view = this.A00;
                    0qQ.A0A(view);
                    AnonymousClass6UK r22 = new AnonymousClass6UK(this, reel, r14, i);
                    if (!z) {
                        i4 = 100;
                    }
                    view.postDelayed(r22, (long) i4);
                    if (Systrace.A0E(1)) {
                        i2 = -1371098754;
                        0fS.A00(i2);
                    }
                    return;
                }
            }
            if (Systrace.A0E(1)) {
                i2 = -709011859;
                0fS.A00(i2);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1)) {
                0fS.A00(-650417640);
            }
            throw th;
        }
    }

    public static final boolean A06(Fragment fragment, C2365134a r4) {
        Fragment parent;
        if (fragment.mParentFragment instanceof 2ZS) {
            parent = r4.A0D.requireParentFragment();
        } else {
            Fragment requireActivity = r4.A0D.requireActivity();
            parent = requireActivity.getParent();
            if (parent == null) {
                parent = requireActivity;
            }
        }
        0qQ.A0C(parent, "null cannot be cast to non-null type com.instagram.mainactivity.delegate.IgNavigator");
        2b7 r0 = ((2ZS) parent).A09;
        r0.getClass();
        2bB r42 = r0.A02;
        1QK r3 = 1QK.A0C;
        if (r42.A0F.getPosition() != 0.0f || !r42.A0Q.A0C(r3)) {
            return false;
        }
        return true;
    }

    public final void A07() {
        UserSession userSession = this.A0F;
        UserSession userSession2 = 1NM.A00(userSession).A00;
        0Tu r3 = 0Tu.A05;
        boolean A062 = 182.A06(r3, userSession2, 36325867022529845L);
        int i = 1;
        if (!A062 || !this.A0O.A0S.get() || this.A0Q.getItemCount() <= 1) {
            i = 0;
        }
        if (!1NN.A00(1NM.A00(userSession)) || 182.A06(r3, userSession, 2342165053715785640L)) {
            RecyclerView recyclerView = this.A0P.A03;
            if (recyclerView != null) {
                recyclerView.A0o(i);
                return;
            }
            return;
        }
        this.A0P.A07(i);
    }

    public final void A08(boolean z) {
        Integer num;
        ViewGroup viewGroup;
        View findViewById;
        if (z) {
            0xY AR4 = 1Au.A00(this.A0F).A01.AR4();
            AR4.E5c("group_stories_cold_fetch_last_time", 0);
            AR4.apply();
        }
        C2367234v r5 = this.A0Z;
        if (r5.A02) {
            r5.A02 = false;
            View view = r5.A01;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof IgFrameLayout) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    viewGroup = null;
                }
                if (!(r5.A09 || viewGroup == null || (findViewById = viewGroup.findViewById(r5.A00)) == null)) {
                    findViewById.setOnClickListener((View.OnClickListener) null);
                    viewGroup.removeView(findViewById);
                }
                view.setTranslationX(0.0f);
            }
        }
        C2365334c r0 = this.A0P;
        if (z) {
            num = AnonymousClass05K.A0j;
        } else {
            num = AnonymousClass05K.A00;
        }
        r0.A0C.A08 = num;
        A07();
        C228102kn r7 = this.A0O;
        ReelStore A052 = 1OP.A05(r7.A07);
        A052.A05 = z;
        AnonymousClass1Nd.A00(A052.A09).A05(new AnonymousClass376((1OE) null, A052.A0U(false), -1, false));
        if (z) {
            r7.A0D();
            UserSession userSession = r5.A06;
            if (AnonymousClass37B.A00(userSession)) {
                if (182.A06(0Tu.A05, 1NM.A00(userSession).A00, 36320313630400752L) && !1Au.A00(userSession).A01.getBoolean("has_seen_group_stories_nux", false)) {
                    r5.A07.A01(EZX.GROUP_STORY_TRAY, AnonymousClass1QI.A00.A02.A00);
                    C49957FGp.A03(r5.A03, userSession, new Fm8(r5, z));
                    0xY AR42 = 1Au.A00(userSession).A01.AR4();
                    AR42.E5T("has_seen_group_stories_nux", true);
                    AR42.apply();
                    return;
                }
            }
        }
        C2367234v.A01(r5, z);
    }

    public final void A09(boolean z, boolean z2) {
        if (this.A00 != null) {
            C2365934i r4 = this.A0Q;
            if (r4.getItemCount() > 0) {
                if (!182.A06(0Tu.A05, this.A0F, 36322044501370784L)) {
                    r4.notifyDataSetChanged();
                }
            }
            A0d.post(new AnonymousClass3KS(this, z, z2));
        }
    }

    public final boolean A0A() {
        return 1OP.A05(this.A0O.A07).A05;
    }

    public final boolean A0B() {
        int i;
        LinearLayoutManager linearLayoutManager;
        RecyclerView recyclerView = this.A0P.A03;
        if (recyclerView == null || (linearLayoutManager = (LinearLayoutManager) recyclerView.A0D) == null) {
            i = -1;
        } else {
            i = linearLayoutManager.A1a();
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf == null || valueOf.intValue() > 0) {
            return false;
        }
        return true;
    }

    public final boolean A0C(AnonymousClass2l3 r4, Integer num) {
        UserSession userSession = this.A0F;
        if (1OP.A05(userSession).A0d()) {
            LS4.A01(userSession, this.A0E.getModuleName(), "reel_tray_empty_on_refresh");
        }
        return this.A0O.A0I(this.A0G, r4, num);
    }

    public final boolean A0D(boolean z) {
        if (this.A00 != null) {
            return this.A0O.A0J(false, false, z);
        }
        return false;
    }

    public final int C8o() {
        return this.A0Q.getItemCount();
    }

    public final void DJL(boolean z) {
        C228102kn r2 = this.A0O;
        ArrayList arrayList = r2.A0B;
        if (arrayList == null || arrayList.isEmpty()) {
            this.A0P.A09(r2, true);
        }
    }

    public final void DR6() {
        Iterator it = this.A0Q.A02().iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (((Reel) it.next()).A1a) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Reel A002 = C241023No.A00(this.A0F, C241003Nm.A00, false);
        if (A002 != null) {
            A05(A002, AnonymousClass3BQ.MAIN_FEED_TRAY, i);
        }
    }

    public final void DU2() {
        C2367234v r4 = this.A0Z;
        r4.A07.A03(r4.A08.A03.A04, AnonymousClass000.A00(3299));
        C49957FGp.A04(r4.A03, r4.A06, AnonymousClass05K.A00, (String) null, (String) null);
    }

    public final void DcK(int i) {
        this.A03.A01(i);
    }

    public final void DcX(boolean z, boolean z2) {
        if (this.A00 != null) {
            UserSession userSession = this.A0F;
            List A0U2 = 1OP.A05(userSession).A0U(false);
            AnonymousClass3BJ.A00(userSession);
            C2365334c r4 = this.A0P;
            r4.A0C.Ei9(A0U2, false, r4.A0B);
            1OP.A03(userSession).A08(AnonymousClass3BU.MAIN_TRAY_RESORT, A0U2);
            if (182.A06(0Tu.A05, 1NM.A00(userSession).A00, 36317517606819038L)) {
                if (z) {
                    A07();
                }
            } else if (z) {
                r4.A06();
            }
        }
    }

    public final void Du3(int i) {
        if (this.A07 && i == ((C2365834h) this.A0Q).A04()) {
            View view = this.A00;
            if (view != null) {
                view.post(new C51228Fqj(this));
            }
            this.A07 = false;
        }
    }

    public final void EC6(View view, int i) {
        Integer num;
        C2366834r r4 = this.A0a;
        C228102kn r1 = this.A0O;
        if (r1.A0H) {
            num = AnonymousClass05K.A0C;
        } else if (r1.A0E) {
            num = AnonymousClass05K.A0Y;
        } else if (r1.A0G) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        UserSession userSession = this.A0F;
        0qQ.A0B(num, 2);
        C255953uz r5 = new C255953uz(i, num);
        Object obj = new Object();
        AnonymousClass30Y r0 = AnonymousClass30Y.A07;
        C2354830a r12 = new C2354830a(obj, r5, "spinner");
        r12.A00(r4.A05);
        AnonymousClass30Y A012 = r12.A01();
        if (182.A06(0Tu.A05, userSession, 36317517606950112L)) {
            Set set = r4.A07;
            if (!set.contains(view)) {
                r4.A01.A05(view, A012);
                set.add(view);
                return;
            }
            return;
        }
        r4.A01.A05(view, A012);
    }

    public final void EGP(long j, int i) {
        C230252pH r2 = this.A03;
        UserSession userSession = this.A0F;
        r2.A04(new AnonymousClass3BN(userSession, 1OP.A05(userSession).A0U(false)), this.A0O, AnonymousClass05K.A0u, i, j, false);
    }

    public final void EGQ(long j) {
        C230252pH r2 = this.A03;
        UserSession userSession = this.A0F;
        r2.A03(new AnonymousClass3BN(userSession, 1OP.A05(userSession).A0U(false)), this.A0O, (Double) null, AnonymousClass05K.A0u, j, false);
    }

    public final String getModuleName() {
        return this.A0E.getModuleName();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0095, code lost:
        if (X.C228102kn.A02(r4, r3, r6, r5) != X.AnonymousClass05K.A01) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7 A[Catch:{ all -> 0x0111, all -> 0x011f }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fd A[Catch:{ all -> 0x0111, all -> 0x011f }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
            r13 = this;
            r11 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r11)
            if (r0 == 0) goto L_0x0010
            r1 = -950964321(0xffffffffc7516f9f, float:-53615.62)
            java.lang.String r0 = "MainFeedReelTrayController.onCreate"
            X.0fS.A01(r0, r1)
        L_0x0010:
            X.2kn r6 = r13.A0O     // Catch:{ all -> 0x011f }
            r6.A0F(r13)     // Catch:{ all -> 0x011f }
            X.2jx r7 = r13.A0D     // Catch:{ all -> 0x011f }
            java.lang.Integer r5 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x011f }
            X.4D6 r4 = r13.A0G     // Catch:{ all -> 0x011f }
            X.2l3 r3 = r13.A0L     // Catch:{ all -> 0x011f }
            r2 = 0
            r0 = 2
            X.0qQ.A0B(r4, r0)     // Catch:{ all -> 0x011f }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r11)     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x0030
            r1 = 1431348807(0x5550a647, float:1.43382859E13)
            java.lang.String r0 = "ReelTrayManager.fetchReelTray"
            X.0fS.A01(r0, r1)     // Catch:{ all -> 0x011f }
        L_0x0030:
            r10 = 0
            r6.A0G = r2     // Catch:{ all -> 0x0111 }
            com.instagram.common.session.UserSession r8 = r6.A07     // Catch:{ all -> 0x0111 }
            X.1NN r0 = X.1NM.A00(r8)     // Catch:{ all -> 0x0111 }
            com.instagram.common.session.UserSession r9 = r0.A00     // Catch:{ all -> 0x0111 }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x0111 }
            r0 = 36317234137928636(0x810655000413bc, double:3.030503334365528E-306)
            boolean r0 = X.182.A06(r2, r9, r0)     // Catch:{ all -> 0x0111 }
            if (r0 != 0) goto L_0x0075
            X.1NN r0 = X.1NM.A00(r8)     // Catch:{ all -> 0x0111 }
            com.instagram.common.session.UserSession r9 = r0.A00     // Catch:{ all -> 0x0111 }
            r0 = 36317517606884575(0x810697001514df, double:3.0306826012747014E-306)
            boolean r0 = X.182.A06(r2, r9, r0)     // Catch:{ all -> 0x0111 }
            if (r0 != 0) goto L_0x0075
            r0 = 36327370260756869(0x810f8d00043985, double:3.036913459256993E-306)
            boolean r0 = X.182.A06(r2, r8, r0)     // Catch:{ all -> 0x0111 }
            if (r0 != 0) goto L_0x0075
            X.1NN r0 = X.1NM.A00(r8)     // Catch:{ all -> 0x0111 }
            com.instagram.common.session.UserSession r9 = r0.A00     // Catch:{ all -> 0x0111 }
            r0 = 36317517610554631(0x810697004d1507, double:3.0306826035956596E-306)
            boolean r0 = X.182.A06(r2, r9, r0)     // Catch:{ all -> 0x0111 }
            if (r0 == 0) goto L_0x0076
        L_0x0075:
            r10 = 1
        L_0x0076:
            boolean r9 = X.C228102kn.A0C(r6, r5)     // Catch:{ all -> 0x0111 }
            X.1NN r0 = X.1NM.A00(r8)     // Catch:{ all -> 0x0111 }
            com.instagram.common.session.UserSession r8 = r0.A00     // Catch:{ all -> 0x0111 }
            r0 = 36325867023316285(0x810e2f0015353d, double:3.035962805846516E-306)
            boolean r0 = X.182.A06(r2, r8, r0)     // Catch:{ all -> 0x0111 }
            if (r10 != 0) goto L_0x009e
            if (r9 != 0) goto L_0x0097
            if (r0 == 0) goto L_0x009b
            java.lang.Integer r1 = X.C228102kn.A02(r4, r3, r6, r5)     // Catch:{ all -> 0x0111 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0111 }
            if (r1 == r0) goto L_0x00a1
        L_0x0097:
            X.C228102kn.A05(r7, r3, r6, r5)     // Catch:{ all -> 0x0111 }
            goto L_0x00a1
        L_0x009b:
            X.C228102kn.A05(r7, r3, r6, r5)     // Catch:{ all -> 0x0111 }
        L_0x009e:
            X.C228102kn.A02(r4, r3, r6, r5)     // Catch:{ all -> 0x0111 }
        L_0x00a1:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r11)     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x00ad
            r0 = 878225130(0x3458a6ea, float:2.017729E-7)
            X.0fS.A00(r0)     // Catch:{ all -> 0x011f }
        L_0x00ad:
            com.instagram.common.session.UserSession r4 = r13.A0F     // Catch:{ all -> 0x011f }
            r0 = 36320313631711485(0x810922002620fd, double:3.0324508186339276E-306)
            boolean r0 = X.182.A06(r2, r4, r0)     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x00e0
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x011f }
            X.1Av r0 = X.1Au.A00(r4)     // Catch:{ all -> 0x011f }
            X.0xa r5 = r0.A01     // Catch:{ all -> 0x011f }
            java.lang.String r3 = "group_stories_cold_fetch_last_time"
            r0 = 0
            long r0 = r5.getLong(r3, r0)     // Catch:{ all -> 0x011f }
            long r7 = r7 - r0
            r0 = 36601788608549207(0x82092200281157, double:3.210456727394861E-306)
            long r2 = X.182.A01(r2, r4, r0)     // Catch:{ all -> 0x011f }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e0
            r6.A0D()     // Catch:{ all -> 0x011f }
        L_0x00e0:
            X.1Ng r3 = r13.A0T     // Catch:{ all -> 0x011f }
            java.lang.Class<X.376> r1 = X.AnonymousClass376.class
            X.1wn r0 = r13.A0V     // Catch:{ all -> 0x011f }
            r3.A01(r0, r1)     // Catch:{ all -> 0x011f }
            java.lang.Class<X.377> r1 = X.AnonymousClass377.class
            X.1wn r0 = r13.A0U     // Catch:{ all -> 0x011f }
            r3.A01(r0, r1)     // Catch:{ all -> 0x011f }
            X.0Tu r2 = X.0Tu.A06     // Catch:{ all -> 0x011f }
            r0 = 36329663773032692(0x8111a3000040f4, double:3.038363885655456E-306)
            boolean r0 = X.182.A06(r2, r4, r0)     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x0104
            java.lang.Class<X.2Cy> r1 = X.2Cy.class
            X.1wn r0 = r13.A0W     // Catch:{ all -> 0x011f }
            r3.A01(r0, r1)     // Catch:{ all -> 0x011f }
        L_0x0104:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r11)
            if (r0 == 0) goto L_0x0110
            r0 = -1594227570(0xffffffffa0fa048e, float:-4.2354661E-19)
            X.0fS.A00(r0)
        L_0x0110:
            return
        L_0x0111:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r11)     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x011e
            r0 = -904114539(0xffffffffca1c4e95, float:-2560933.2)
            X.0fS.A00(r0)     // Catch:{ all -> 0x011f }
        L_0x011e:
            throw r1     // Catch:{ all -> 0x011f }
        L_0x011f:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r11)
            if (r0 == 0) goto L_0x012c
            r0 = -741216367(0xffffffffd3d1ef91, float:-1.80333484E12)
            X.0fS.A00(r0)
        L_0x012c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2365134a.onCreate():void");
    }

    public final void onDestroy() {
        if (Systrace.A0E(1)) {
            0fS.A01("MainFeedReelTrayController.onDestroy", -1219163236);
        }
        try {
            this.A0O.A0G(this);
            C61940qJ.A00(this.A0X);
            1Ng r4 = this.A0T;
            r4.A02(this.A0V, AnonymousClass376.class);
            r4.A02(this.A0U, AnonymousClass377.class);
            if (182.A06(0Tu.A06, this.A0F, 36329663773032692L)) {
                r4.A02(this.A0W, 2Cy.class);
            }
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(1980196483);
            }
        }
    }

    public final void onDestroyView() {
        if (Systrace.A0E(1)) {
            0fS.A01("MainFeedReelTrayController.onDestroyView", -889244018);
        }
        try {
            this.A0P.A04();
            AnonymousClass6VJ r1 = this.A06;
            if (r1 != null) {
                this.A0H.FJ2(r1);
            }
            this.A05 = null;
            this.A04 = null;
            AnonymousClass351 r0 = this.A0J;
            Runnable runnable = r0.A00;
            if (runnable != null) {
                r0.A02.removeCallbacks(runnable);
            }
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-760422122);
            }
        }
    }

    public final void onPause() {
        if (Systrace.A0E(1)) {
            0fS.A01("MainFeedReelTrayController.onPause", 851211330);
        }
        try {
            FragmentActivity activity = this.A0D.getActivity();
            if (activity != null) {
                1OP r0 = 1OP.$redex_init_class;
                AnonymousClass3K2 A042 = AnonymousClass3K2.A04(activity);
                if (A042 != null) {
                    A042.A0S();
                    C51914G7i g7i = this.A0A;
                    if (g7i != null && A042.A0I == g7i) {
                        A042.A0I = null;
                        A042.A0J = null;
                    }
                }
            }
            C228102kn r3 = this.A0O;
            r3.A02 = System.currentTimeMillis();
            C2365334c r2 = this.A0P;
            AnonymousClass34W r1 = this.A0b;
            0qQ.A0B(r1, 0);
            RecyclerView recyclerView = r2.A03;
            if (recyclerView != null) {
                recyclerView.A16(r1);
            }
            r2.A05();
            AnonymousClass6VJ r12 = this.A06;
            if (r12 != null) {
                r12.A05(AnonymousClass05K.A0N);
            }
            C61940qJ.A00(this.A0X);
            r3.A0G(this);
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-2100797324);
            }
        }
    }

    public final void onResume() {
        AnonymousClass3K2 r9;
        if (Systrace.A0E(1)) {
            0fS.A01("MainFeedReelTrayController.onResume", 579388549);
        }
        try {
            C227812jx r6 = this.A0D;
            FragmentActivity activity = r6.getActivity();
            this.A0Q.notifyDataSetChanged();
            if (activity != null) {
                1OP r0 = 1OP.$redex_init_class;
                r9 = AnonymousClass3K2.A04(activity);
            } else {
                r9 = null;
            }
            UserSession userSession = this.A0F;
            UserSession userSession2 = 1NM.A00(userSession).A00;
            0Tu r7 = 0Tu.A05;
            if (182.A06(r7, userSession2, 36317517606819038L)) {
                this.A0O.A0F(this);
            }
            boolean z = true;
            if (r9 == null || !r9.A0Z() || r9.A0H == AnonymousClass3BQ.FEED_ITEM_HEADER) {
                z = false;
            }
            if (z) {
                C238133Ar scrollingViewProxy = r6.getScrollingViewProxy();
                ViewGroup CEd = scrollingViewProxy.CEd();
                0qQ.A07(CEd);
                if (CEd.isLaidOut()) {
                    A02(this, scrollingViewProxy, r9);
                } else {
                    0nA.A0p(CEd, new C51462FuW(this, scrollingViewProxy, r9));
                }
            } else if (this.A09 || !this.A0B || !this.A0O.A0J(true, true, true)) {
                A09(false, false);
            }
            if (!182.A06(r7, 1NM.A00(userSession).A00, 36317517606819038L)) {
                this.A0O.A0F(this);
            }
            C2365334c r02 = this.A0P;
            AnonymousClass34W r1 = this.A0b;
            0qQ.A0B(r1, 0);
            RecyclerView recyclerView = r02.A03;
            if (recyclerView != null) {
                recyclerView.A15(r1);
            }
            C62670v5.A0B.A03(this.A0X);
            this.A09 = false;
            this.A0B = true;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-375682853);
            }
        }
    }

    public final void onViewStateRestored(Bundle bundle) {
        C2365334c r3 = this.A0P;
        if (bundle != null && bundle.containsKey("stories_tray_instance_state")) {
            r3.A00 = bundle.getParcelable("stories_tray_instance_state");
        }
        Parcelable parcelable = r3.A00;
        RecyclerView recyclerView = r3.A03;
        if (recyclerView != null && parcelable != null) {
            C252553pI r0 = recyclerView.A0D;
            if (r0 != null) {
                r0.A1P(parcelable);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void DWD(long j, int i) {
        EGP(j, i);
        this.A0P.A09(this.A0O, false);
        this.A0Q.notifyDataSetChanged();
        C59689JTv.A01(this.A0C, C273654mx.A00(3372), 2131974345, 0);
    }

    public final void DWE(long j) {
        EGQ(j);
        C228102kn r4 = this.A0O;
        if (!(!r4.A0R.isEmpty())) {
            if (182.A06(0Tu.A05, this.A0F, 36329973010678158L)) {
                r4.Cmq();
            } else {
                this.A0P.A09(r4, true);
            }
        }
    }
}
