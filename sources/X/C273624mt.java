package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.tabs.TabLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: X.4mt  reason: invalid class name and case insensitive filesystem */
public final class C273624mt extends AnonymousClass4DH implements C61110lV, AnonymousClass4DR, C249453jo, 2bC, C273634mu, C227252iu, AnonymousClass0j6, C227262iv, C273434mZ, C2356430q, C273644mv, C70992Zi, C240423Kv {
    public static final String __redex_internal_original_name = "DirectInboxFragment";
    public 1Ng A00;
    public TouchInterceptorFrameLayout A01;
    public C66934MfT A02;
    public C67150Mj8 A03;
    public MeY A04;
    public C66633Ma2 A05;
    public C67263Mkx A06;
    public AnonymousClass38U A07;
    public C67089Mi7 A08;
    public C228312lJ A09;
    public C231002qi A0A;
    public AnonymousClass2qU A0B;
    public 2Zg A0C;
    public Integer A0D = AnonymousClass05K.A00;
    public String A0E = "all";
    public boolean A0F;
    public long A0G;
    public C67301Mlb A0H;
    public GVI A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final C67088Mi6 A0M;
    public final DcB A0N;
    public final AnonymousClass0eM A0O;
    public final long A0P;
    public final AnonymousClass9HB A0Q = new AnonymousClass9HB();
    public final AnonymousClass0eM A0R = C227642jf.A02(this);

    public static final void A05(C273624mt r8) {
        C273624mt r3 = r8;
        UserSession A012 = A01(r8);
        0qQ.A0B(A012, 0);
        if (!2Ek.A03(0eE.A00(A012).A00())) {
            r8.A06 = null;
        } else if (r8.A06 == null) {
            FragmentActivity requireActivity = r8.requireActivity();
            UserSession A013 = A01(r8);
            C67264Mky mky = new C67264Mky(r8);
            0qQ.A0B(A013, 1);
            C67492Mom mom = new C67492Mom(requireActivity, A013, new C67490Mok(requireActivity, r8, A013), new C67491Mol(requireActivity, r8, A013));
            C67263Mkx mkx = new C67263Mkx(requireActivity, r3, A013, mom, new C67521MpG(requireActivity, r8, A013, mom), mky, new C358248ab((Context) requireActivity));
            r3.A06 = mkx;
            View view = r3.mView;
            if (view != null) {
                mkx.A09(view);
            }
        }
        C66633Ma2 ma2 = r3.A05;
        if (ma2 != null) {
            C67263Mkx mkx2 = r3.A06;
            if (ma2.A0d == null && mkx2 != null) {
                2Dm A0v = ma2.A0v();
                0qQ.A0B(A0v, 0);
                mkx2.A02 = A0v;
                if (C67263Mkx.A08(mkx2)) {
                    UserSession userSession = mkx2.A0A;
                    mkx2.A01 = new C67496Moq(mkx2.A08, mkx2.A09, userSession, new C67495Mop(mkx2));
                }
            }
            ma2.A0d = mkx2;
        }
    }

    public final /* synthetic */ void CJK(MotionEvent motionEvent, Long l, boolean z) {
    }

    public final /* synthetic */ void DU7() {
    }

    public final void Dhq(View view, Integer num) {
        DirectShareTarget directShareTarget;
        DirectShareTarget directShareTarget2;
        AnonymousClass9B2 r1;
        DirectShareTarget A002;
        String str;
        AnonymousClass9B2 r12;
        0qQ.A0B(view, 0);
        Integer num2 = num;
        if (num2 == AnonymousClass05K.A0j) {
            if (System.currentTimeMillis() - this.A0G >= this.A0P && getActivity() != null) {
                this.A0G = System.currentTimeMillis();
                UserSession A012 = A01(this);
                0Tu r4 = 0Tu.A05;
                String A042 = 182.A04(r4, A012, 36882348756763071L);
                AiAgentThreadLauncher aiAgentThreadLauncher = new AiAgentThreadLauncher(A01(this));
                FragmentActivity requireActivity = requireActivity();
                C66633Ma2 ma2 = this.A05;
                DirectShareTarget directShareTarget3 = null;
                if (ma2 != null) {
                    AnonymousClass9B2 r13 = ma2.A0J;
                    if (r13 != null) {
                        directShareTarget2 = r13.A00();
                    } else {
                        directShareTarget2 = null;
                    }
                } else {
                    directShareTarget2 = null;
                }
                UserSession A013 = A01(this);
                0qQ.A0B(A013, 0);
                boolean A062 = 182.A06(r4, A013, 36324831934820747L);
                String A003 = C66579MXk.A00(136);
                if (!aiAgentThreadLauncher.A0B(requireActivity, (C68112N1a) null, this, (C51869G5g) null, directShareTarget2, (C273414mX) null, A003, (String) null, A062, false, false, false)) {
                    String str2 = AnonymousClass1QI.A00.A02.A00;
                    if (str2 == null) {
                        str2 = "";
                    }
                    0wc A014 = AnonymousClass0kN.A01(this, A01(this));
                    String stackTraceString = Log.getStackTraceString(new Exception());
                    0qQ.A07(stackTraceString);
                    C66633Ma2 ma22 = this.A05;
                    if (!(ma22 == null || (r12 = ma22.A0J) == null)) {
                        directShareTarget3 = r12.A00();
                    }
                    C69836Nsy.A00(A014, directShareTarget3, str2, A003, stackTraceString, __redex_internal_original_name, A042, "", "");
                }
                UserSession A015 = A01(this);
                0qQ.A0B(A015, 0);
                if (AnonymousClass9B8.A02(A015) && 182.A06(r4, A015, 36320416710271394L)) {
                    AnonymousClass7I3 r2 = new AnonymousClass7I3(A01(this));
                    C66633Ma2 ma23 = this.A05;
                    if (!(ma23 == null || (r1 = ma23.A0J) == null || (A002 = r1.A00()) == null || (str = (String) A002.A0B().get(0)) == null)) {
                        A042 = str;
                    }
                    1Ln A0J2 = 1Ln.A0J(r2.A01);
                    if (A0J2.A00.isSampled()) {
                        A0J2.A0Z(14);
                        A0J2.A0X(0);
                        A0J2.A0R("selected_item", "meta_ai");
                        A0J2.A0R("agent_id", A042);
                        A0J2.Cgf();
                    }
                }
            }
        } else if (num2 != AnonymousClass05K.A0u) {
            C66633Ma2 ma24 = this.A05;
            if (ma24 != null) {
                UserSession A0p = ma24.A0p();
                AnonymousClass4DH r6 = ma24.A1J;
                0qQ.A0B(A0p, 0);
                AnonymousClass0kM r3 = new AnonymousClass0kM(A0p);
                r3.A01 = "direct_inbox";
                0wc A004 = r3.A00();
                0Aj A005 = A004.A00(A004.A00, C273654mx.A00(655));
                A005.AAJ("action", C66579MXk.A00(851));
                A005.Cgf();
                C327977Cy.A00((C69489NmX) null, C69462Nm6.CLICK, C69487NmV.FILTER_ENTRYPOINT, new C327977Cy(r6, A0p), (String) null, A0p.A06);
                C67488Moi moi = ma24.A0b;
                if (moi != null) {
                    UserSession userSession = moi.A03;
                    0qQ.A0B(userSession, 0);
                    if (2Ek.A01(0eE.A00(userSession).A00())) {
                        182.A06(0Tu.A05, userSession, 36322293609605174L);
                    }
                    moi.A01 = C67488Moi.A00(moi);
                    C331127Pr r14 = new C331127Pr(userSession);
                    Context context = moi.A02;
                    r14.A0d = context.getString(2131962426);
                    List list = C67813MvH.A00;
                    list.clear();
                    C331157Pu A006 = r14.A00();
                    if (2El.A06(userSession)) {
                        List asList = Arrays.asList(new C67304Mle[]{C67304Mle.A0M, C67304Mle.A07, C67304Mle.A09});
                        list.add(new C46448DfA(2131962417));
                        for (C67304Mle mle : moi.A01) {
                            if (!asList.contains(mle)) {
                                C67488Moi.A01(moi, mle, A006);
                            }
                        }
                        list.add(new Object());
                        list.add(new C46448DfA(2131962418));
                        for (C67304Mle mle2 : moi.A01) {
                            if (asList.contains(mle2)) {
                                C67488Moi.A01(moi, mle2, A006);
                            }
                        }
                    } else {
                        for (C67304Mle A016 : moi.A01) {
                            C67488Moi.A01(moi, A016, A006);
                        }
                    }
                    A006.A03(context, new AnonymousClass4DH());
                    C331137Ps r15 = new C331137Ps();
                    r15.A06 = context.getString(2131962425);
                    r15.A0A = true;
                    r15.A05 = new C71309OiF(moi, A006);
                    A006.A0K(r15.A00(), true);
                }
            }
        } else if (System.currentTimeMillis() - this.A0G >= this.A0P && getActivity() != null) {
            this.A0G = System.currentTimeMillis();
            C66633Ma2 ma25 = this.A05;
            if (ma25 != null) {
                0wc r32 = (0wc) ma25.A2r.getValue();
                0qQ.A0B(r32, 0);
                C48798EkM.A00(r32, new GLV(0, 13));
                AnonymousClass4DH r7 = ma25.A1J;
                Context requireContext = r7.requireContext();
                UserSession A0p2 = ma25.A0p();
                FragmentActivity requireActivity2 = r7.requireActivity();
                AnonymousClass9B2 r0 = ma25.A0J;
                if (r0 != null) {
                    directShareTarget = r0.A00();
                } else {
                    directShareTarget = null;
                }
                C49951FGg.A02(requireContext, requireActivity2, r7, A0p2, C69287Nin.UNIVERSAL_SEARCH, directShareTarget);
            }
        }
    }

    public final void Dhs(View view, C67301Mlb mlb) {
        ArrayList arrayList;
        DirectShareTarget A002;
        this.A0H = mlb;
        C66633Ma2 ma2 = this.A05;
        if (ma2 != null) {
            ((C230882qT) ma2.A2V.getValue()).A00(view, QPTooltipAnchor.INBOX_SEARCH_BAR, (2bu) ma2.A2U.getValue());
            AnonymousClass9B2 r0 = ma2.A0J;
            if (r0 == null || (A002 = r0.A00()) == null) {
                arrayList = null;
            } else {
                arrayList = A002.A0B();
            }
            if (AnonymousClass9B8.A02(ma2.A0p())) {
                UserSession A0p = ma2.A0p();
                0qQ.A0B(A0p, 0);
                if (AnonymousClass9B8.A02(A0p) && 182.A06(0Tu.A05, A0p, 36320416710271394L) && arrayList != null && !arrayList.isEmpty()) {
                    AnonymousClass7I3 r02 = new AnonymousClass7I3(ma2.A0p());
                    Object obj = arrayList.get(0);
                    0qQ.A07(obj);
                    String str = (String) obj;
                    0qQ.A0B(str, 0);
                    1Ln A0J2 = 1Ln.A0J(r02.A01);
                    if (A0J2.A00.isSampled()) {
                        A0J2.A0Z(14);
                        A0J2.A0X(1);
                        A0J2.A0R("selected_item", "meta_ai");
                        A0J2.A0R("agent_id", str);
                        A0J2.Cgf();
                    }
                }
            }
            if (AnonymousClass9B8.A0A(ma2.A0p())) {
                0nY.A00().ATE(new NRM(ma2));
            }
        }
    }

    public final void EIL() {
    }

    public final void FHS(MotionEvent motionEvent) {
    }

    public final String getModuleName() {
        return "direct_inbox";
    }

    public final void onConfigurationChanged(Configuration configuration) {
        0qQ.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        Activity rootActivity = getRootActivity();
        if (rootActivity != null) {
            UserSession A012 = A01(this);
            int i = configuration.screenWidthDp;
            0qQ.A0B(A012, 1);
            C66732Mbd.A02(rootActivity, (View) null, A012, AnonymousClass2YH.A00(i), (int) 0nA.A04(rootActivity, i));
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        C66633Ma2 ma2 = this.A05;
        if (ma2 != null) {
            bundle.putStringArrayList("DirectInboxController.STATE_SEEN_THREAD_ID_LIST", new ArrayList(ma2.A1b));
            C67488Moi moi = ma2.A0b;
            if (moi != null) {
                bundle.putString("DirectInboxController.STATE_FILTER_TYPE", moi.A00.A01.A00);
            }
            C67095MiF miF = (C67095MiF) ma2.A1t.getValue();
            bundle.putString("DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_SESSION_ID", miF.A01);
            bundle.putParcelable("DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_THREAD_KEY", miF.A00);
        }
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.0rm, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        C66633Ma2 ma2;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout;
        OF6 of6;
        String string;
        View findViewById;
        TextView textView;
        int i;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout2;
        C231002qi r0;
        Mi9 A0u;
        C2366634p r02;
        String str;
        Mi9 A0u2;
        C2366634p r03;
        0qQ.A0B(view, 0);
        C66633Ma2 ma22 = this.A05;
        if (!(ma22 == null || (A0u2 = ma22.A0u()) == null || (r03 = A0u2.A06) == null)) {
            r03.A08((String) null);
        }
        super.onViewCreated(view, bundle);
        C66934MfT mfT = this.A02;
        if (mfT == null) {
            str = "actionBarController";
        } else {
            if (!C67057MhU.A01(mfT.A07)) {
                1xC.A01.A02(mfT.A06, AnonymousClass3H2.class);
            }
            MeY meY = this.A04;
            if (meY == null) {
                str = "actionBarRepository";
            } else {
                if (C67057MhU.A01(meY.A06)) {
                    1xC.A01.A02(meY.A05, AnonymousClass3H2.class);
                }
                C66633Ma2 ma23 = this.A05;
                if (ma23 != null) {
                    C2366634p r04 = C66633Ma2.A04(ma23).A0A;
                    if (r04 != null) {
                        r04.A08((String) null);
                    }
                    C2366634p r05 = C66633Ma2.A04(ma23).A0A;
                    if (r05 != null) {
                        r05.A05();
                    }
                }
                C67263Mkx mkx = this.A06;
                if (mkx != null) {
                    mkx.A09(view);
                }
                if (this.A0F && !this.A0J) {
                    this.A0J = true;
                    C66633Ma2 ma24 = this.A05;
                    if (ma24 != null) {
                        ma24.A12();
                    }
                }
                C66633Ma2 ma25 = this.A05;
                if (!(ma25 == null || (A0u = ma25.A0u()) == null || (r02 = A0u.A06) == null)) {
                    r02.A05();
                }
                UserSession A012 = A01(this);
                0qQ.A0B(A012, 0);
                0Tu r7 = 0Tu.A05;
                if (!182.A06(r7, A012, 36328285088529596L) && (r0 = this.A0A) != null) {
                    r0.Dh3();
                }
                Activity rootActivity = getRootActivity();
                if (rootActivity != null) {
                    C66732Mbd.A01(rootActivity, view, A01(this));
                }
                if (AnonymousClass39U.A00(A01(this))) {
                    C66633Ma2 ma26 = this.A05;
                    if (!(ma26 == null || (touchInterceptorFrameLayout2 = this.A01) == null)) {
                        View requireViewById = touchInterceptorFrameLayout2.requireViewById(R.id.direct_inbox_quick_snap_container_stub);
                        0qQ.A07(requireViewById);
                        View inflate = ((ViewStub) requireViewById).inflate();
                        View requireViewById2 = inflate.requireViewById(R.id.direct_quick_snap_creation_button);
                        0qQ.A07(requireViewById2);
                        AnonymousClass0fU.A00(new FLI(ma26), requireViewById2);
                        if (2El.A0G(ma26.A0p())) {
                            ViewGroup.LayoutParams layoutParams = requireViewById2.getLayoutParams();
                            0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                            Context context = touchInterceptorFrameLayout2.getContext();
                            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), context.getResources().getDimensionPixelSize(R.dimen.action_button_settings_height) + context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
                        }
                        View requireViewById3 = inflate.requireViewById(R.id.direct_quick_snap_consumption_preview);
                        0qQ.A07(requireViewById3);
                        Fragment fragment = ma26.A1J;
                        ma26.A0q = new C320256s4(new FLJ(ma26), requireViewById3, fragment, ma26.A0p());
                        0qQ.A0C(fragment, "null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
                        AnonymousClass36N A002 = new 2YN(new C385689jN(fragment.requireContext(), ma26.A0p()), fragment.getViewModelStore(), AnonymousClass2YP.A00).A00(AnonymousClass36N.class);
                        ma26.A0r = A002;
                        if (A002 != null) {
                            A002.A01.A06(fragment, new C64312LZm(ma26));
                        }
                        C66633Ma2.A0c(ma26, true);
                    }
                } else if (!(this.A01 == null || this.A05 == null || !182.A06(r7, A01(this), 36325433230242768L))) {
                    FrameLayout frameLayout = new FrameLayout(requireContext());
                    frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    boolean A062 = 182.A06(r7, A01(this), 36325433230439379L);
                    C66934MfT mfT2 = this.A02;
                    if (mfT2 == null) {
                        0qQ.A0F("actionBarController");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    C71001OVy oVy = (C71001OVy) mfT2.A08.A04.getValue();
                    ? obj = new Object();
                    AnonymousClass4DH r8 = oVy.A00;
                    ComposeView A013 = GTX.A01(r8, AnonymousClass5PI.A04(new J7N(3, obj, new C71310OiG(oVy, A062), !A062), -796365061, true), false, false);
                    obj.A00 = A013;
                    A013.setTag("conversation_starter_floating_action_button");
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 85);
                    int A042 = (int) 0nA.A04(r8.requireContext(), 12);
                    layoutParams2.bottomMargin = A042;
                    layoutParams2.rightMargin = A042;
                    ((View) obj.A00).setLayoutParams(layoutParams2);
                    frameLayout.addView((View) obj.A00);
                    frameLayout.bringToFront();
                    TouchInterceptorFrameLayout touchInterceptorFrameLayout3 = this.A01;
                    if (touchInterceptorFrameLayout3 != null) {
                        touchInterceptorFrameLayout3.addView(frameLayout);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                if (2El.A0G(A01(this)) && (ma2 = this.A05) != null && (touchInterceptorFrameLayout = this.A01) != null) {
                    View requireViewById4 = touchInterceptorFrameLayout.requireViewById(R.id.direct_inbox_folder_pill_selector_stub);
                    0qQ.A07(requireViewById4);
                    View inflate2 = ((ViewStub) requireViewById4).inflate();
                    ma2.A0D = inflate2;
                    if (inflate2 != null) {
                        ma2.A0H = (TabLayout) inflate2.requireViewById(R.id.tab_layout);
                    }
                    TabLayout tabLayout = ma2.A0H;
                    if (tabLayout != null && (of6 = ma2.A0e) != null) {
                        Context requireContext = ma2.A1J.requireContext();
                        O7N o7n = new O7N(ma2);
                        Map A0M2 = 0se.A0M(new 0eP(C67237MkX.A07, Integer.valueOf(ma2.A0o())));
                        for (C67237MkX mkX : of6.A03) {
                            C324746zp A063 = tabLayout.A06();
                            int ordinal = mkX.ordinal();
                            if (ordinal != 0) {
                                if (ordinal == 1 || ordinal == 4) {
                                    i = 2131964245;
                                } else if (ordinal == 2) {
                                    i = 2131959785;
                                } else if (ordinal == 3) {
                                    i = 2131964309;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Unrecognized twinbox mode: ");
                                    sb.append(mkX);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                                string = requireContext.getString(i);
                                0qQ.A07(string);
                            } else {
                                int i2 = 2131964268;
                                if (2El.A0L(of6.A02)) {
                                    i2 = 2131964312;
                                }
                                string = requireContext.getString(i2);
                                0qQ.A0A(string);
                            }
                            A063.A04(string);
                            A063.A03(LayoutInflater.from(requireContext).inflate(R.layout.pill_tab_title, (ViewGroup) null));
                            if (A0M2.containsKey(mkX)) {
                                Object obj2 = A0M2.get(mkX);
                                if (obj2 == null) {
                                    throw new IllegalStateException("Required value was null.");
                                } else if (((Number) obj2).intValue() > 0 && 2El.A04(of6.A02)) {
                                    View view2 = A063.A03;
                                    if (!(view2 == null || (textView = (TextView) view2.findViewById(R.id.tab_badge_count)) == null)) {
                                        textView.setText(String.valueOf(A0M2.get(mkX)));
                                        textView.setVisibility(0);
                                    }
                                    View view3 = A063.A03;
                                    if (!(view3 == null || (findViewById = view3.findViewById(R.id.tab_unread_dot)) == null)) {
                                        findViewById.setVisibility(0);
                                    }
                                }
                            }
                            tabLayout.A0E(A063, tabLayout.A0c.isEmpty());
                        }
                        C324746zp A072 = tabLayout.A07(of6.A00);
                        if (A072 != null) {
                            A072.A01();
                        }
                        tabLayout.A0D(new C71807Or8(o7n, of6));
                        return;
                    }
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final float A00() {
        2Zg r0 = this.A0C;
        if (r0 != null) {
            float f = r0.C3W().A01;
            2Zg r02 = this.A0C;
            if (r02 != null) {
                return r02.Apn().A00(f);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final UserSession A01(C273624mt r0) {
        return (UserSession) r0.A0R.getValue();
    }

    /* JADX WARNING: type inference failed for: r2v30, types: [X.OLL, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r30v1, types: [X.07Z] */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x043d, code lost:
        if ((java.lang.System.currentTimeMillis() - r16) < X.182.A01(r5, r3, 36609738590787500L)) goto L_0x043f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x07c2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:?, code lost:
        X.1zE.A00(r20, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x07c8, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0c1c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0c1d, code lost:
        X.1zE.A00(r17, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0c22, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0c67, code lost:
        if (X.182.A06(r3, r2, 36320438184845760L) != false) goto L_0x0c69;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02() {
        /*
            r32 = this;
            r15 = r32
            android.app.Activity r2 = r15.getRootActivity()
            if (r2 == 0) goto L_0x001d
            r0 = 2131435221(0x7f0b1ed5, float:1.8492278E38)
            android.view.View r1 = r2.findViewById(r0)
            if (r1 == 0) goto L_0x001a
            r0 = 2131442718(0x7f0b3c1e, float:1.8507484E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 != 0) goto L_0x001d
        L_0x001a:
            X.C66732Mbd.A00(r2)
        L_0x001d:
            boolean r0 = r15.A0L
            if (r0 != 0) goto L_0x0830
            X.2Zg r1 = r15.A0C
            r0 = 0
            if (r1 == 0) goto L_0x0037
            X.2bE r1 = r1.C3W()
            java.lang.String r2 = r1.A02
        L_0x002c:
            java.lang.String r1 = "on_launch_direct_inbox_from_notes_in_feed"
            boolean r24 = X.0qQ.A0K(r2, r1)
            X.Ma2 r7 = r15.A05
            if (r7 == 0) goto L_0x07f3
            goto L_0x0039
        L_0x0037:
            r2 = r0
            goto L_0x002c
        L_0x0039:
            java.lang.String r1 = "DirectInboxController.onResume"
            X.0lp r20 = X.0lq.A00(r1)     // Catch:{ all -> 0x07c9 }
            X.0eM r1 = r7.A2i     // Catch:{ all -> 0x07c0 }
            java.lang.Object r4 = r1.getValue()     // Catch:{ all -> 0x07c0 }
            X.MiE r4 = (X.C67094MiE) r4     // Catch:{ all -> 0x07c0 }
            java.lang.String r3 = "DIRECT_INBOX_RESUMED"
            X.0rq r1 = r4.A00     // Catch:{ all -> 0x07c0 }
            if (r1 != 0) goto L_0x0057
            X.18g r1 = r4.A01     // Catch:{ all -> 0x07c0 }
            X.1Gq r1 = r1.A0C()     // Catch:{ all -> 0x07c0 }
            X.02m r1 = X.1Gq.A00(r1)     // Catch:{ all -> 0x07c0 }
        L_0x0057:
            X.18g r2 = r4.A01     // Catch:{ all -> 0x07c0 }
            r2.A0M(r1, r4, r3)     // Catch:{ all -> 0x07c0 }
            X.Mi9 r3 = r7.A0u()     // Catch:{ all -> 0x07c0 }
            java.lang.String r2 = "is_network_connected"
            com.instagram.common.session.UserSession r1 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            X.1bO r1 = X.1bO.A00(r1)     // Catch:{ all -> 0x07c0 }
            boolean r1 = r1.A0C     // Catch:{ all -> 0x07c0 }
            r3.A0K(r2, r1)     // Catch:{ all -> 0x07c0 }
            X.Mi9 r3 = r7.A0u()     // Catch:{ all -> 0x07c0 }
            java.lang.String r2 = "is_mqtt_connected"
            com.instagram.common.session.UserSession r1 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            X.1bO r1 = X.1bO.A00(r1)     // Catch:{ all -> 0x07c0 }
            com.instagram.realtimeclient.RealtimeClientManager r1 = r1.A06     // Catch:{ all -> 0x07c0 }
            boolean r1 = r1.isMqttConnected()     // Catch:{ all -> 0x07c0 }
            r3.A0K(r2, r1)     // Catch:{ all -> 0x07c0 }
            X.Mi9 r1 = r7.A0u()     // Catch:{ all -> 0x07c0 }
            X.34p r1 = r1.A08     // Catch:{ all -> 0x07c0 }
            r8 = 1
            r1.A08(r0)     // Catch:{ all -> 0x07c0 }
            X.Mgq r1 = X.C66633Ma2.A04(r7)     // Catch:{ all -> 0x07c0 }
            X.34p r1 = r1.A05     // Catch:{ all -> 0x07c0 }
            r1.A08(r0)     // Catch:{ all -> 0x07c0 }
            X.Mgq r1 = X.C66633Ma2.A04(r7)     // Catch:{ all -> 0x07c0 }
            X.9HU r1 = r1.A08     // Catch:{ all -> 0x07c0 }
            r1.A00()     // Catch:{ all -> 0x07c0 }
            com.instagram.common.session.UserSession r1 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            X.1bO r6 = X.1bO.A00(r1)     // Catch:{ all -> 0x07c0 }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x07c0 }
            java.lang.Integer r2 = X.AnonymousClass43Z.A03     // Catch:{ all -> 0x07c0 }
            java.lang.Integer r5 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x07c0 }
            if (r2 != r5) goto L_0x00ec
            X.Mgq r3 = X.C66633Ma2.A04(r7)     // Catch:{ all -> 0x07c0 }
            long r1 = X.AnonymousClass43Z.A00     // Catch:{ all -> 0x07c0 }
            java.lang.Long r2 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x07c0 }
            r3.A01 = r2     // Catch:{ all -> 0x07c0 }
            java.lang.String r1 = "latest_server_seq_id"
            r3.A0I(r1, r2)     // Catch:{ all -> 0x07c0 }
            long r3 = X.AnonymousClass43Z.A01     // Catch:{ all -> 0x07c0 }
            long r1 = r6.A00     // Catch:{ all -> 0x07c0 }
            long r3 = java.lang.Math.max(r3, r1)     // Catch:{ all -> 0x07c0 }
            long r1 = X.AnonymousClass43Z.A00     // Catch:{ all -> 0x07c0 }
            long r1 = r1 - r3
            r3 = 0
            long r1 = java.lang.Math.max(r3, r1)     // Catch:{ all -> 0x07c0 }
            boolean r6 = X.C66633Ma2.A0j(r7)     // Catch:{ all -> 0x07c0 }
            if (r6 == 0) goto L_0x010d
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x00e0
            goto L_0x0102
        L_0x00e0:
            X.Mgq r3 = X.C66633Ma2.A04(r7)     // Catch:{ all -> 0x07c0 }
            X.34p r3 = r3.A07     // Catch:{ all -> 0x07c0 }
            if (r3 == 0) goto L_0x010d
            r3.A08(r0)     // Catch:{ all -> 0x07c0 }
            goto L_0x010d
        L_0x00ec:
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x07c0 }
            if (r2 != r1) goto L_0x0114
            boolean r1 = X.C66633Ma2.A0j(r7)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x0114
            X.Mgq r1 = X.C66633Ma2.A04(r7)     // Catch:{ all -> 0x07c0 }
            X.34p r1 = r1.A07     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x0114
            r1.A08(r0)     // Catch:{ all -> 0x07c0 }
            goto L_0x0114
        L_0x0102:
            X.Mgq r3 = X.C66633Ma2.A04(r7)     // Catch:{ all -> 0x07c0 }
            X.34p r3 = r3.A07     // Catch:{ all -> 0x07c0 }
            if (r3 == 0) goto L_0x010d
            r3.A03()     // Catch:{ all -> 0x07c0 }
        L_0x010d:
            X.Mgq r3 = X.C66633Ma2.A04(r7)     // Catch:{ all -> 0x07c0 }
            r3.A0T(r1)     // Catch:{ all -> 0x07c0 }
        L_0x0114:
            boolean r1 = X.C66633Ma2.A0j(r7)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x0138
            X.66d r1 = r7.A0G     // Catch:{ all -> 0x07c0 }
            if (r1 != 0) goto L_0x0138
            X.Opz r1 = new X.Opz     // Catch:{ all -> 0x07c0 }
            r1.<init>(r7)     // Catch:{ all -> 0x07c0 }
            r7.A0G = r1     // Catch:{ all -> 0x07c0 }
            com.instagram.common.session.UserSession r1 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            com.facebook.msys.mci.AccountSession r1 = X.C300345wy.A02(r1, r8)     // Catch:{ all -> 0x07c0 }
            com.facebook.msys.mci.SessionedNotificationCenter r3 = r1.getSessionedNotificationCenter()     // Catch:{ all -> 0x07c0 }
            X.66d r2 = r7.A0G     // Catch:{ all -> 0x07c0 }
            java.lang.String r1 = "MEMOfflineHandlingCompletionNotification"
            r3.addObserver(r2, r1, r8, r0)     // Catch:{ all -> 0x07c0 }
        L_0x0138:
            com.instagram.common.session.UserSession r1 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            r6 = 0
            boolean r1 = com.instagram.direct.lockedchat.LockedChatKillSwitch.isLockedChatEnabled(r1, r6)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x0185
            X.2EM r2 = r7.A0s()     // Catch:{ all -> 0x07c0 }
            X.MkK r1 = X.C67224MkK.A00     // Catch:{ all -> 0x07c0 }
            boolean r1 = X.0qQ.A0K(r2, r1)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x0185
            X.0eM r1 = r7.A2H     // Catch:{ all -> 0x07c0 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x07c0 }
            X.4gS r1 = (X.C270264gS) r1     // Catch:{ all -> 0x07c0 }
            boolean r1 = r1.A00(r0)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x0185
            X.NIF r3 = r7.A0g     // Catch:{ all -> 0x07c0 }
            if (r3 != 0) goto L_0x017b
            java.lang.String r1 = "inbox"
            X.NIF r3 = X.C70001Nvf.A00(r1, r0)     // Catch:{ all -> 0x07c0 }
            r7.A0g = r3     // Catch:{ all -> 0x07c0 }
            r2 = 46
            X.PhY r1 = new X.PhY     // Catch:{ all -> 0x07c0 }
            r1.<init>(r7, r2)     // Catch:{ all -> 0x07c0 }
            r3.A04 = r1     // Catch:{ all -> 0x07c0 }
            r2 = 47
            X.PhY r1 = new X.PhY     // Catch:{ all -> 0x07c0 }
            r1.<init>(r7, r2)     // Catch:{ all -> 0x07c0 }
            r3.A03 = r1     // Catch:{ all -> 0x07c0 }
        L_0x017b:
            android.app.Dialog r1 = r3.A01     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x01a5
            boolean r1 = r1.isShowing()     // Catch:{ all -> 0x07c0 }
            if (r1 != r8) goto L_0x01a5
        L_0x0185:
            com.instagram.common.session.UserSession r1 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            X.1bO r1 = X.1bO.A00(r1)     // Catch:{ all -> 0x07c0 }
            X.9IV r4 = r1.A0L     // Catch:{ all -> 0x07c0 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x07c0 }
            java.lang.Object r2 = r4.A01     // Catch:{ all -> 0x07c0 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x07c0 }
            java.lang.Integer r23 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x07c0 }
            r1 = r23
            if (r2 != r1) goto L_0x01be
            X.Mgq r1 = X.C66633Ma2.A04(r7)     // Catch:{ all -> 0x07c0 }
            X.34p r3 = r1.A05     // Catch:{ all -> 0x07c0 }
            java.lang.Object r1 = r4.A00     // Catch:{ all -> 0x07c0 }
            goto L_0x01b5
        L_0x01a5:
            X.NIF r3 = r7.A0g     // Catch:{ all -> 0x07c0 }
            if (r3 == 0) goto L_0x0185
            X.4DH r1 = r7.A1J     // Catch:{ all -> 0x07c0 }
            X.0hq r2 = r1.getParentFragmentManager()     // Catch:{ all -> 0x07c0 }
            java.lang.String r1 = "lockedChat"
            r3.A0B(r2, r1)     // Catch:{ all -> 0x07c0 }
            goto L_0x0185
        L_0x01b5:
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x01ca
            long r1 = r1.longValue()     // Catch:{ all -> 0x07c0 }
            goto L_0x01d0
        L_0x01be:
            if (r2 != r5) goto L_0x01d3
            X.Mgq r1 = X.C66633Ma2.A04(r7)     // Catch:{ all -> 0x07c0 }
            X.34p r1 = r1.A05     // Catch:{ all -> 0x07c0 }
            r1.A02()     // Catch:{ all -> 0x07c0 }
            goto L_0x01d3
        L_0x01ca:
            com.facebook.common.time.AwakeTimeSinceBootClock r1 = com.facebook.common.time.AwakeTimeSinceBootClock.INSTANCE     // Catch:{ all -> 0x07c0 }
            long r1 = r1.now()     // Catch:{ all -> 0x07c0 }
        L_0x01d0:
            r3.A06(r1)     // Catch:{ all -> 0x07c0 }
        L_0x01d3:
            X.Mi9 r1 = r7.A0u()     // Catch:{ all -> 0x07c0 }
            X.34p r5 = r1.A0C     // Catch:{ all -> 0x07c0 }
            if (r5 == 0) goto L_0x0216
            com.instagram.common.session.UserSession r4 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            X.0Tu r3 = X.0Tu.A05     // Catch:{ all -> 0x07c0 }
            r1 = 36313076611155678(0x81028d001c06de, double:3.0278740976932925E-306)
            boolean r1 = X.182.A06(r3, r4, r1)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x0216
            boolean r1 = com.instagram.direct.perf.navigation.MPLTamSyncGroupStateNotifyOnCompletionCallback.getIsCompletedValue()     // Catch:{ all -> 0x07c0 }
            java.lang.String r4 = "is_init_tam_sync_completed"
            if (r1 == 0) goto L_0x01f5
            goto L_0x020c
        L_0x01f5:
            X.1a8 r3 = r7.A1K     // Catch:{ all -> 0x07c0 }
            X.1aS r2 = com.instagram.direct.perf.navigation.MPLTamSyncGroupStateNotifyOnCompletionCallback.isCompleted     // Catch:{ all -> 0x07c0 }
            X.PSK r1 = new X.PSK     // Catch:{ all -> 0x07c0 }
            r1.<init>(r5, r7)     // Catch:{ all -> 0x07c0 }
            r3.A02(r2, r1)     // Catch:{ all -> 0x07c0 }
            r5.A08(r0)     // Catch:{ all -> 0x07c0 }
            X.Mi9 r1 = r7.A0u()     // Catch:{ all -> 0x07c0 }
            r1.A0K(r4, r6)     // Catch:{ all -> 0x07c0 }
            goto L_0x0216
        L_0x020c:
            r5.A02()     // Catch:{ all -> 0x07c0 }
            X.Mi9 r1 = r7.A0u()     // Catch:{ all -> 0x07c0 }
            r1.A0K(r4, r8)     // Catch:{ all -> 0x07c0 }
        L_0x0216:
            X.0eM r1 = r7.A1h     // Catch:{ all -> 0x07c0 }
            r31 = r1
            java.lang.Object r1 = r31.getValue()     // Catch:{ all -> 0x07c0 }
            X.Pvy r1 = (X.C74503Pvy) r1     // Catch:{ all -> 0x07c0 }
            X.Pw5 r1 = r1.BNZ()     // Catch:{ all -> 0x07c0 }
            r1.EIx()     // Catch:{ all -> 0x07c0 }
            X.0eM r1 = r7.A2a     // Catch:{ all -> 0x07c0 }
            java.lang.Object r5 = r1.getValue()     // Catch:{ all -> 0x07c0 }
            X.MhK r5 = (X.C67047MhK) r5     // Catch:{ all -> 0x07c0 }
            androidx.recyclerview.widget.RecyclerView r9 = r7.A0F     // Catch:{ all -> 0x07c0 }
            java.lang.String r22 = "Required value was null."
            if (r9 == 0) goto L_0x07b0
            androidx.recyclerview.widget.LinearLayoutManager r1 = r7.A0E     // Catch:{ all -> 0x07c0 }
            if (r1 != 0) goto L_0x0240
            java.lang.String r0 = "layoutManager"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x07c0 }
            goto L_0x05cb
        L_0x0240:
            X.Mku r12 = r5.A04     // Catch:{ all -> 0x07c0 }
            r12.A00 = r6     // Catch:{ all -> 0x07c0 }
            r5.A03 = r8     // Catch:{ all -> 0x07c0 }
            r5.A02 = r9     // Catch:{ all -> 0x07c0 }
            boolean r11 = r5.A05     // Catch:{ all -> 0x07c0 }
            java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x07c0 }
            r10.<init>(r5)     // Catch:{ all -> 0x07c0 }
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x07c0 }
            r4.<init>(r12)     // Catch:{ all -> 0x07c0 }
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x07c0 }
            r3.<init>(r9)     // Catch:{ all -> 0x07c0 }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x07c0 }
            r2.<init>(r1)     // Catch:{ all -> 0x07c0 }
            X.Mh3 r1 = new X.Mh3     // Catch:{ all -> 0x07c0 }
            r25 = r1
            r26 = r10
            r27 = r3
            r28 = r4
            r29 = r2
            r30 = r11
            r25.<init>(r26, r27, r28, r29, r30)     // Catch:{ all -> 0x07c0 }
            r5.A01 = r1     // Catch:{ all -> 0x07c0 }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x07c0 }
            r2.<init>(r12)     // Catch:{ all -> 0x07c0 }
            X.Mh2 r1 = new X.Mh2     // Catch:{ all -> 0x07c0 }
            r1.<init>(r2)     // Catch:{ all -> 0x07c0 }
            r5.A00 = r1     // Catch:{ all -> 0x07c0 }
            android.view.ViewTreeObserver r2 = r9.getViewTreeObserver()     // Catch:{ all -> 0x07c0 }
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r5.A01     // Catch:{ all -> 0x07c0 }
            r2.addOnGlobalLayoutListener(r1)     // Catch:{ all -> 0x07c0 }
            android.view.ViewTreeObserver r2 = r9.getViewTreeObserver()     // Catch:{ all -> 0x07c0 }
            android.view.ViewTreeObserver$OnDrawListener r1 = r5.A00     // Catch:{ all -> 0x07c0 }
            r2.addOnDrawListener(r1)     // Catch:{ all -> 0x07c0 }
            X.0eM r1 = r7.A0z     // Catch:{ all -> 0x07c0 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x07c0 }
            X.3AD r1 = (X.AnonymousClass3AD) r1     // Catch:{ all -> 0x07c0 }
            r1.setIsLoading(r6)     // Catch:{ all -> 0x07c0 }
            java.lang.Object r1 = r31.getValue()     // Catch:{ all -> 0x07c0 }
            X.Pvy r1 = (X.C74503Pvy) r1     // Catch:{ all -> 0x07c0 }
            X.Pvz r3 = r1.BzE()     // Catch:{ all -> 0x07c0 }
            X.Mgq r1 = X.C66633Ma2.A04(r7)     // Catch:{ all -> 0x07c0 }
            X.34p r1 = r1.A06     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x02af
            r1.A08(r0)     // Catch:{ all -> 0x07c0 }
        L_0x02af:
            r7.A17 = r6     // Catch:{ all -> 0x07c0 }
            X.1a8 r9 = r7.A1K     // Catch:{ all -> 0x07c0 }
            X.1aU r2 = r3.Ezk()     // Catch:{ all -> 0x07c0 }
            X.Mh4 r1 = new X.Mh4     // Catch:{ all -> 0x07c0 }
            r1.<init>(r7)     // Catch:{ all -> 0x07c0 }
            r9.A02(r2, r1)     // Catch:{ all -> 0x07c0 }
            X.4DH r1 = r7.A1J     // Catch:{ all -> 0x07c0 }
            r30 = r1
            X.0xx r4 = X.AnonymousClass07a.A00(r30)     // Catch:{ all -> 0x07c0 }
            r2 = 18
            X.Pfm r1 = new X.Pfm     // Catch:{ all -> 0x07c0 }
            r1.<init>(r7, r0, r2)     // Catch:{ all -> 0x07c0 }
            r21 = 3
            X.19B r13 = X.19B.A00     // Catch:{ all -> 0x07c0 }
            java.lang.Integer r10 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x07c0 }
            X.1Eo.A03(r10, r13, r1, r4)     // Catch:{ all -> 0x07c0 }
            boolean r1 = X.C66633Ma2.A0l(r7)     // Catch:{ all -> 0x07c0 }
            if (r1 != 0) goto L_0x02f0
            X.C66633Ma2.A0J(r7)     // Catch:{ all -> 0x07c0 }
            X.0eM r1 = r7.A2g     // Catch:{ all -> 0x07c0 }
            java.lang.Object r2 = r1.getValue()     // Catch:{ all -> 0x07c0 }
            X.9Hr r2 = (X.C376359Hr) r2     // Catch:{ all -> 0x07c0 }
            X.MhN r1 = new X.MhN     // Catch:{ all -> 0x07c0 }
            r1.<init>(r7)     // Catch:{ all -> 0x07c0 }
            r2.A01(r1)     // Catch:{ all -> 0x07c0 }
        L_0x02f0:
            java.lang.Object r1 = r31.getValue()     // Catch:{ all -> 0x07c0 }
            X.Pvy r1 = (X.C74503Pvy) r1     // Catch:{ all -> 0x07c0 }
            X.PvH r1 = r1.BbU()     // Catch:{ all -> 0x07c0 }
            X.1aU r2 = r1.BbW()     // Catch:{ all -> 0x07c0 }
            X.Mh6 r1 = new X.Mh6     // Catch:{ all -> 0x07c0 }
            r1.<init>(r3)     // Catch:{ all -> 0x07c0 }
            r9.A02(r2, r1)     // Catch:{ all -> 0x07c0 }
            X.1aU r2 = r3.E2O()     // Catch:{ all -> 0x07c0 }
            X.Mh7 r1 = new X.Mh7     // Catch:{ all -> 0x07c0 }
            r1.<init>(r7)     // Catch:{ all -> 0x07c0 }
            r9.A02(r2, r1)     // Catch:{ all -> 0x07c0 }
            com.instagram.common.session.UserSession r1 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            boolean r1 = X.2El.A04(r1)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x033a
            X.2Dm r1 = r7.A0v()     // Catch:{ all -> 0x07c0 }
            X.2Dr r1 = (X.2Dr) r1     // Catch:{ all -> 0x07c0 }
            X.2ED r1 = r1.A0C     // Catch:{ all -> 0x07c0 }
            X.1aS r2 = r1.A07     // Catch:{ all -> 0x07c0 }
            X.0eM r1 = r1.A0H     // Catch:{ all -> 0x07c0 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x07c0 }
            X.4fh r1 = (X.C269794fh) r1     // Catch:{ all -> 0x07c0 }
            X.1aU r2 = r2.A0P(r1)     // Catch:{ all -> 0x07c0 }
            X.PS8 r1 = new X.PS8     // Catch:{ all -> 0x07c0 }
            r1.<init>(r7)     // Catch:{ all -> 0x07c0 }
            r9.A02(r2, r1)     // Catch:{ all -> 0x07c0 }
        L_0x033a:
            X.0eM r1 = r7.A2t     // Catch:{ all -> 0x07c0 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x07c0 }
            X.Mbh r1 = (X.C66736Mbh) r1     // Catch:{ all -> 0x07c0 }
            X.1aS r2 = r1.A06     // Catch:{ all -> 0x07c0 }
            X.MhA r1 = new X.MhA     // Catch:{ all -> 0x07c0 }
            r1.<init>(r7)     // Catch:{ all -> 0x07c0 }
            r9.A02(r2, r1)     // Catch:{ all -> 0x07c0 }
            java.lang.Object r1 = r31.getValue()     // Catch:{ all -> 0x07c0 }
            X.Pvy r1 = (X.C74503Pvy) r1     // Catch:{ all -> 0x07c0 }
            X.PxF r1 = r1.C6W()     // Catch:{ all -> 0x07c0 }
            r1.EaU(r8)     // Catch:{ all -> 0x07c0 }
            com.instagram.common.session.UserSession r4 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            X.0Tu r5 = X.0Tu.A05     // Catch:{ all -> 0x07c0 }
            r1 = 36325892791743823(0x810e350000354f, double:3.0359791019038524E-306)
            boolean r1 = X.182.A06(r5, r4, r1)     // Catch:{ all -> 0x07c0 }
            if (r1 != 0) goto L_0x0377
            java.lang.Object r1 = r31.getValue()     // Catch:{ all -> 0x07c0 }
            X.Pvy r1 = (X.C74503Pvy) r1     // Catch:{ all -> 0x07c0 }
            X.PxF r1 = r1.C6W()     // Catch:{ all -> 0x07c0 }
            r1.AWs()     // Catch:{ all -> 0x07c0 }
        L_0x0377:
            X.1aU r2 = r3.AV8()     // Catch:{ all -> 0x07c0 }
            X.Mh9 r1 = new X.Mh9     // Catch:{ all -> 0x07c0 }
            r1.<init>(r7)     // Catch:{ all -> 0x07c0 }
            r9.A02(r2, r1)     // Catch:{ all -> 0x07c0 }
            X.1aU r2 = r3.AW9()     // Catch:{ all -> 0x07c0 }
            X.Mh8 r1 = new X.Mh8     // Catch:{ all -> 0x07c0 }
            r1.<init>(r7)     // Catch:{ all -> 0x07c0 }
            r9.A02(r2, r1)     // Catch:{ all -> 0x07c0 }
            X.0eM r1 = r7.A2R     // Catch:{ all -> 0x07c0 }
            java.lang.Object r4 = r1.getValue()     // Catch:{ all -> 0x07c0 }
            X.4A0 r4 = (X.AnonymousClass4A0) r4     // Catch:{ all -> 0x07c0 }
            boolean r1 = r4.A0B     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x03c5
            com.instagram.common.session.UserSession r11 = r4.A07     // Catch:{ all -> 0x07c0 }
            X.1Av r1 = X.1Au.A00(r11)     // Catch:{ all -> 0x07c0 }
            boolean r1 = r1.A21()     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x03c5
            long r1 = r4.A00     // Catch:{ all -> 0x07c0 }
            r16 = 0
            int r3 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r3 != 0) goto L_0x03c5
            boolean r1 = X.C265504Uf.A00(r11)     // Catch:{ all -> 0x07c0 }
            if (r1 != 0) goto L_0x03c5
            X.AnonymousClass4A0.A02(r4)     // Catch:{ all -> 0x07c0 }
            X.1NW r3 = r4.A05     // Catch:{ all -> 0x07c0 }
            r3.removeCallbacksAndMessages(r0)     // Catch:{ all -> 0x07c0 }
            r2 = 2032156175(0x79203e0f, float:5.2001637E34)
            java.lang.Runnable r1 = r4.A08     // Catch:{ all -> 0x07c0 }
            r3.A01(r2, r1)     // Catch:{ all -> 0x07c0 }
        L_0x03c5:
            X.0eM r1 = r7.A2N     // Catch:{ all -> 0x07c0 }
            java.lang.Object r4 = r1.getValue()     // Catch:{ all -> 0x07c0 }
            X.MgA r4 = (X.C66976MgA) r4     // Catch:{ all -> 0x07c0 }
            X.MkX r2 = r7.A0f     // Catch:{ all -> 0x07c0 }
            X.MkX r1 = X.C67237MkX.A03     // Catch:{ all -> 0x07c0 }
            if (r2 == r1) goto L_0x049f
            if (r4 == 0) goto L_0x049f
            com.instagram.common.session.UserSession r3 = r4.A06     // Catch:{ all -> 0x07c0 }
            boolean r1 = X.AnonymousClass4AJ.A03(r3)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x0492
            X.60k r11 = X.C3018660j.A01(r3)     // Catch:{ all -> 0x07c0 }
            X.0gd r12 = X.AnonymousClass0gd.A00()     // Catch:{ all -> 0x07c0 }
            X.0eM r1 = r11.A0E     // Catch:{ all -> 0x07c0 }
            java.lang.Object r2 = r1.getValue()     // Catch:{ all -> 0x07c0 }
            X.0gc r2 = (X.0gc) r2     // Catch:{ all -> 0x07c0 }
            if (r2 == 0) goto L_0x03f4
            java.util.concurrent.CopyOnWriteArrayList r1 = r12.A00     // Catch:{ all -> 0x07c0 }
            r1.add(r2)     // Catch:{ all -> 0x07c0 }
        L_0x03f4:
            X.C3018760k.A05(r11)     // Catch:{ all -> 0x07c0 }
            X.0eM r1 = r4.A08     // Catch:{ all -> 0x07c0 }
            java.lang.Object r11 = r1.getValue()     // Catch:{ all -> 0x07c0 }
            X.49u r11 = (X.C2614949u) r11     // Catch:{ all -> 0x07c0 }
            r1 = 2342171272828501163(0x2081105d00113cab, double:4.072592724611124E-152)
            boolean r1 = X.182.A06(r5, r3, r1)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x04dc
            X.1Av r1 = X.1Au.A00(r3)     // Catch:{ all -> 0x07c0 }
            X.0xa r14 = r1.A01     // Catch:{ all -> 0x07c0 }
            java.lang.String r12 = "last_media_note_stack_open_time"
            r1 = 0
            long r16 = r14.getLong(r12, r1)     // Catch:{ all -> 0x07c0 }
            X.2cc r12 = X.C71342cb.A00(r3)     // Catch:{ all -> 0x07c0 }
            java.lang.String r14 = r12.A03()     // Catch:{ all -> 0x07c0 }
            java.lang.String r12 = "clips_viewer_clips_media_notes_stack"
            boolean r12 = X.0qQ.A0K(r14, r12)     // Catch:{ all -> 0x07c0 }
            if (r12 == 0) goto L_0x04dc
            int r12 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r12 <= 0) goto L_0x04dc
            long r18 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x07c0 }
            long r18 = r18 - r16
            r1 = 36609738590787500(0x82105d000617ac, double:3.215484328174366E-306)
            long r16 = X.182.A01(r5, r3, r1)     // Catch:{ all -> 0x07c0 }
            int r1 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r1 >= 0) goto L_0x04dc
        L_0x043f:
            X.4AJ r1 = X.AnonymousClass4AJ.A00     // Catch:{ all -> 0x07c0 }
            r1.A0H(r3)     // Catch:{ all -> 0x07c0 }
            r1 = 36323255681887265(0x810bcf00012c21, double:3.034311383011776E-306)
            X.182.A06(r5, r3, r1)     // Catch:{ all -> 0x07c0 }
            X.0Tu r12 = X.0Tu.A06     // Catch:{ all -> 0x07c0 }
            r1 = 36324569942077603(0x810d01000430a3, double:3.035142526448247E-306)
            boolean r1 = X.182.A06(r12, r3, r1)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x046a
            X.1wS r11 = X.1wS.A01(r3)     // Catch:{ all -> 0x07c0 }
            r1 = 36606044918715744(0x820d0100031560, double:3.213148435082964E-306)
            long r1 = X.182.A01(r12, r3, r1)     // Catch:{ all -> 0x07c0 }
            int r12 = (int) r1     // Catch:{ all -> 0x07c0 }
            r11.A0C(r12)     // Catch:{ all -> 0x07c0 }
        L_0x046a:
            r1 = 36327344490690907(0x810f870000395b, double:3.036897162163511E-306)
            boolean r1 = X.182.A06(r5, r3, r1)     // Catch:{ all -> 0x07c0 }
            if (r1 != 0) goto L_0x047b
            boolean r1 = X.AnonymousClass4AJ.A0E(r3)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x0492
        L_0x047b:
            X.49x r1 = X.C2615149w.A00(r3)     // Catch:{ all -> 0x07c0 }
            X.0gd r3 = X.AnonymousClass0gd.A00()     // Catch:{ all -> 0x07c0 }
            X.0eM r1 = r1.A0D     // Catch:{ all -> 0x07c0 }
            java.lang.Object r2 = r1.getValue()     // Catch:{ all -> 0x07c0 }
            X.0gc r2 = (X.0gc) r2     // Catch:{ all -> 0x07c0 }
            if (r2 == 0) goto L_0x0492
            java.util.concurrent.CopyOnWriteArrayList r1 = r3.A00     // Catch:{ all -> 0x07c0 }
            r1.add(r2)     // Catch:{ all -> 0x07c0 }
        L_0x0492:
            X.0h9 r3 = r4.A01     // Catch:{ all -> 0x07c0 }
            X.07U r2 = r3.A00     // Catch:{ all -> 0x07c0 }
            X.07U r1 = X.07U.A02     // Catch:{ all -> 0x07c0 }
            if (r2 == r1) goto L_0x049f
            X.07U r1 = X.07U.A04     // Catch:{ all -> 0x07c0 }
            r3.A0C(r1)     // Catch:{ all -> 0x07c0 }
        L_0x049f:
            X.6s4 r3 = r7.A0q     // Catch:{ all -> 0x07c0 }
            if (r3 == 0) goto L_0x04b6
            boolean r1 = r3.A01     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x04b6
            android.view.View r1 = r3.A03     // Catch:{ all -> 0x07c0 }
            int r1 = r1.getVisibility()     // Catch:{ all -> 0x07c0 }
            if (r1 != 0) goto L_0x04b6
            X.8c0 r2 = r3.A05     // Catch:{ all -> 0x07c0 }
            int r1 = r3.A00     // Catch:{ all -> 0x07c0 }
            r2.A03(r1)     // Catch:{ all -> 0x07c0 }
        L_0x04b6:
            r7.A16(r0)     // Catch:{ all -> 0x07c0 }
            com.instagram.common.session.UserSession r1 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            boolean r1 = X.2El.A07(r1)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x04d0
            java.lang.Object r1 = r31.getValue()     // Catch:{ all -> 0x07c0 }
            X.Pvy r1 = (X.C74503Pvy) r1     // Catch:{ all -> 0x07c0 }
            X.PxE r1 = r1.B6g()     // Catch:{ all -> 0x07c0 }
            r1.AWs()     // Catch:{ all -> 0x07c0 }
        L_0x04d0:
            X.MiA r3 = r7.A1L     // Catch:{ all -> 0x07c0 }
            X.Ma2 r4 = r3.A00     // Catch:{ all -> 0x07c0 }
            X.2Dm r2 = r4.A0v()     // Catch:{ all -> 0x07c0 }
            X.2Dr r2 = (X.2Dr) r2     // Catch:{ all -> 0x07c0 }
            monitor-enter(r2)     // Catch:{ all -> 0x07c0 }
            goto L_0x052e
        L_0x04dc:
            X.49x r1 = r11.A04     // Catch:{ all -> 0x07c0 }
            com.instagram.direct.inbox.notes.NotesRepository r1 = r1.A06     // Catch:{ all -> 0x07c0 }
            boolean r1 = r1.A0R(r6)     // Catch:{ all -> 0x07c0 }
            if (r1 != 0) goto L_0x04e8
            if (r24 == 0) goto L_0x04ef
        L_0x04e8:
            X.4AE r1 = r4.A03     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x04ef
            r1.A00()     // Catch:{ all -> 0x07c0 }
        L_0x04ef:
            X.MhL r2 = new X.MhL     // Catch:{ all -> 0x07c0 }
            r1 = r24
            r2.<init>(r4, r1)     // Catch:{ all -> 0x07c0 }
            r11.A06(r10, r2, r6)     // Catch:{ all -> 0x07c0 }
            com.instagram.common.session.UserSession r1 = r11.A01     // Catch:{ all -> 0x07c0 }
            boolean r1 = X.AnonymousClass3HF.A02(r1)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x0527
            X.6oS r12 = X.C318116oQ.A00(r11)     // Catch:{ all -> 0x07c0 }
            r2 = 13
            X.9Ju r1 = new X.9Ju     // Catch:{ all -> 0x07c0 }
            r1.<init>(r11, r0, r2)     // Catch:{ all -> 0x07c0 }
            X.1Eo.A03(r10, r13, r1, r12)     // Catch:{ all -> 0x07c0 }
            com.instagram.friendmap.data.FriendMapRepository r12 = r11.A05     // Catch:{ all -> 0x07c0 }
            r2 = 28
            X.9Km r1 = new X.9Km     // Catch:{ all -> 0x07c0 }
            r1.<init>(r11, r2)     // Catch:{ all -> 0x07c0 }
            r24 = r12
            r25 = r0
            r26 = r0
            r27 = r1
            r28 = r8
            r29 = r6
            r24.A08(r25, r26, r27, r28, r29)     // Catch:{ all -> 0x07c0 }
        L_0x0527:
            com.instagram.spotlight.fetch.SpotlightFetchRepository r1 = r11.A06     // Catch:{ all -> 0x07c0 }
            r1.A02(r6)     // Catch:{ all -> 0x07c0 }
            goto L_0x043f
        L_0x052e:
            java.lang.Boolean r1 = r2.A03     // Catch:{ all -> 0x07ad }
            monitor-exit(r2)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x0546
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x0546
            com.instagram.common.session.UserSession r1 = r4.A0p()     // Catch:{ all -> 0x07c0 }
            boolean r1 = X.2El.A0M(r1, r8)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x0546
            X.C67090MiA.A00(r3)     // Catch:{ all -> 0x07c0 }
        L_0x0546:
            X.0eM r4 = r7.A22     // Catch:{ all -> 0x07c0 }
            java.lang.Object r11 = r4.getValue()     // Catch:{ all -> 0x07c0 }
            X.1Ng r11 = (X.1Ng) r11     // Catch:{ all -> 0x07c0 }
            java.lang.Class<X.2Kc> r2 = X.2Kc.class
            X.0eM r1 = r7.A27     // Catch:{ all -> 0x07c0 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x07c0 }
            X.1wn r1 = (X.1wn) r1     // Catch:{ all -> 0x07c0 }
            r11.A01(r1, r2)     // Catch:{ all -> 0x07c0 }
            java.lang.Object r11 = r4.getValue()     // Catch:{ all -> 0x07c0 }
            X.1Ng r11 = (X.1Ng) r11     // Catch:{ all -> 0x07c0 }
            java.lang.Class<X.FWA> r2 = X.FWA.class
            X.0eM r1 = r7.A2P     // Catch:{ all -> 0x07c0 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x07c0 }
            X.1wn r1 = (X.1wn) r1     // Catch:{ all -> 0x07c0 }
            r11.A01(r1, r2)     // Catch:{ all -> 0x07c0 }
            java.lang.Object r2 = r4.getValue()     // Catch:{ all -> 0x07c0 }
            X.1Ng r2 = (X.1Ng) r2     // Catch:{ all -> 0x07c0 }
            java.lang.Class<X.9Fv> r1 = X.C375939Fv.class
            r2.A01(r3, r1)     // Catch:{ all -> 0x07c0 }
            java.lang.Object r3 = r4.getValue()     // Catch:{ all -> 0x07c0 }
            X.1Ng r3 = (X.1Ng) r3     // Catch:{ all -> 0x07c0 }
            java.lang.Class<X.AY5> r2 = X.AY5.class
            X.0eM r1 = r7.A25     // Catch:{ all -> 0x07c0 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x07c0 }
            X.MlD r1 = (X.C67278MlD) r1     // Catch:{ all -> 0x07c0 }
            r3.A01(r1, r2)     // Catch:{ all -> 0x07c0 }
            X.2EM r2 = r7.A0r()     // Catch:{ all -> 0x07c0 }
            X.MkK r1 = X.C67224MkK.A00     // Catch:{ all -> 0x07c0 }
            boolean r1 = X.0qQ.A0K(r2, r1)     // Catch:{ all -> 0x07c0 }
            if (r1 != 0) goto L_0x05ba
            com.instagram.common.session.UserSession r3 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            r1 = 36326214914684515(0x810e8000063663, double:3.036182813748631E-306)
            boolean r1 = X.182.A06(r5, r3, r1)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x05ba
            java.lang.Object r3 = r4.getValue()     // Catch:{ all -> 0x07c0 }
            X.1Ng r3 = (X.1Ng) r3     // Catch:{ all -> 0x07c0 }
            java.lang.Class<X.OsR> r2 = X.C71883OsR.class
            X.0eM r1 = r7.A2o     // Catch:{ all -> 0x07c0 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x07c0 }
            X.1wn r1 = (X.1wn) r1     // Catch:{ all -> 0x07c0 }
            r3.A01(r1, r2)     // Catch:{ all -> 0x07c0 }
        L_0x05ba:
            X.0eM r1 = r7.A2n     // Catch:{ all -> 0x07c0 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x07c0 }
            X.42q r1 = (X.C2596742q) r1     // Catch:{ all -> 0x07c0 }
            X.PtF r2 = r7.A0h     // Catch:{ all -> 0x07c0 }
            if (r2 != 0) goto L_0x05d1
            java.lang.String r0 = "threadActivityUpdateListener"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x07c0 }
        L_0x05cb:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x07bf
        L_0x05d1:
            java.util.Set r1 = r1.A04     // Catch:{ all -> 0x07c0 }
            r1.add(r2)     // Catch:{ all -> 0x07c0 }
            X.0eM r1 = r7.A2V     // Catch:{ all -> 0x07c0 }
            r1.getValue()     // Catch:{ all -> 0x07c0 }
            com.instagram.common.session.UserSession r3 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            X.0qQ.A0B(r3, r6)     // Catch:{ all -> 0x07c0 }
            r1 = 36328285088529596(0x81106200003cbc, double:3.037492000024181E-306)
            boolean r1 = X.182.A06(r5, r3, r1)     // Catch:{ all -> 0x07c0 }
            if (r1 != 0) goto L_0x05f8
            X.0eM r1 = r7.A2U     // Catch:{ all -> 0x07c0 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x07c0 }
            X.2qi r1 = (X.C231002qi) r1     // Catch:{ all -> 0x07c0 }
            r1.Dh3()     // Catch:{ all -> 0x07c0 }
        L_0x05f8:
            java.lang.Integer r2 = r7.A1T     // Catch:{ all -> 0x07c0 }
            r1 = r23
            if (r2 == r1) goto L_0x060f
            com.instagram.common.session.UserSession r2 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            X.61K r1 = X.AnonymousClass61K.DIRECT_INBOX     // Catch:{ all -> 0x07c0 }
            X.Mh1 r1 = X.C67026Mgz.A00(r2, r1)     // Catch:{ all -> 0x07c0 }
            r7.A0l = r1     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x060f
            r1.A01(r6)     // Catch:{ all -> 0x07c0 }
        L_0x060f:
            com.instagram.common.session.UserSession r1 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            X.3K8 r2 = X.AnonymousClass3K7.A00(r1)     // Catch:{ all -> 0x07c0 }
            r1 = r30
            r2.A00(r1)     // Catch:{ all -> 0x07c0 }
            X.Dfq r1 = r7.A0p     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x07b8
            X.Mgq r1 = X.C66633Ma2.A04(r7)     // Catch:{ all -> 0x07c0 }
            X.34p r1 = r1.A05     // Catch:{ all -> 0x07c0 }
            r1.A05()     // Catch:{ all -> 0x07c0 }
            X.C66633Ma2.A0G(r7)     // Catch:{ all -> 0x07c0 }
            X.2EM r1 = r7.A0s()     // Catch:{ all -> 0x07c0 }
            X.2EX r4 = X.AnonymousClass2EX.A00     // Catch:{ all -> 0x07c0 }
            boolean r1 = X.0qQ.A0K(r1, r4)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x0675
            com.instagram.common.session.UserSession r3 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            r1 = 36317934218253986(0x8106f8000e16a2, double:3.030946067982276E-306)
            X.182.A06(r5, r3, r1)     // Catch:{ all -> 0x07c0 }
            com.instagram.common.session.UserSession r2 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            boolean r1 = r7.A1A(r4)     // Catch:{ all -> 0x07c0 }
            boolean r1 = X.2El.A0N(r2, r1)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x068e
            com.instagram.common.session.UserSession r3 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            r1 = 36317934218712744(0x8106f8001516a8, double:3.0309460682723967E-306)
            boolean r1 = X.182.A06(r5, r3, r1)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x068e
            X.Mgq r1 = X.C66633Ma2.A04(r7)     // Catch:{ all -> 0x07c0 }
            boolean r1 = r1.A01     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x068e
            X.MoZ r2 = r7.A0c     // Catch:{ all -> 0x07c0 }
            if (r2 == 0) goto L_0x0675
            X.43A r1 = X.AnonymousClass43A.A00     // Catch:{ all -> 0x07c0 }
            r2.A00(r1)     // Catch:{ all -> 0x07c0 }
            r7.A16(r0)     // Catch:{ all -> 0x07c0 }
        L_0x0675:
            boolean r1 = X.C66633Ma2.A0h(r7)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x0681
            X.C66633Ma2.A0P(r7)     // Catch:{ all -> 0x07c0 }
            X.C66633Ma2.A0O(r7)     // Catch:{ all -> 0x07c0 }
        L_0x0681:
            X.0eM r1 = r7.A2B     // Catch:{ all -> 0x07c0 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x07c0 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x07c0 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x07c0 }
            goto L_0x069a
        L_0x068e:
            com.instagram.common.session.UserSession r1 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            X.Odl r1 = X.OPT.A00(r1)     // Catch:{ all -> 0x07c0 }
            r1.A08()     // Catch:{ all -> 0x07c0 }
            goto L_0x0675
        L_0x069a:
            if (r1 == 0) goto L_0x06b3
            java.util.HashMap r3 = r7.A1V     // Catch:{ all -> 0x07c0 }
            com.instagram.common.session.UserSession r1 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            X.1Av r2 = X.1Au.A00(r1)     // Catch:{ all -> 0x07c0 }
            r1 = 589(0x24d, float:8.25E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)     // Catch:{ all -> 0x07c0 }
            java.util.HashMap r1 = X.1Av.A02(r2, r1)     // Catch:{ all -> 0x07c0 }
            r3.putAll(r1)     // Catch:{ all -> 0x07c0 }
        L_0x06b3:
            X.0eM r1 = r7.A2D     // Catch:{ all -> 0x07c0 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x07c0 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x07c0 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x06cb
            com.instagram.common.session.UserSession r1 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            X.MoE r1 = X.C67039MhC.A00(r1)     // Catch:{ all -> 0x07c0 }
            r1.A00 = r8     // Catch:{ all -> 0x07c0 }
        L_0x06cb:
            com.instagram.common.session.UserSession r3 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            X.0Tu r4 = X.0Tu.A06     // Catch:{ all -> 0x07c0 }
            r1 = 36320798960591716(0x81099300012364, double:3.032757742572048E-306)
            boolean r1 = X.182.A06(r4, r3, r1)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x06eb
            com.instagram.common.session.UserSession r3 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            r1 = 2342163808174416741(0x2081099300032365, double:4.0662633311563706E-152)
            boolean r1 = X.182.A06(r4, r3, r1)     // Catch:{ all -> 0x07c0 }
            if (r1 != 0) goto L_0x06f5
        L_0x06eb:
            com.instagram.common.session.UserSession r1 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            boolean r1 = com.instagram.direct.lockedchat.LockedChatKillSwitch.isLockedChatEnabled(r1, r6)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x070c
        L_0x06f5:
            X.12T r3 = X.AnonymousClass12T.A00     // Catch:{ all -> 0x07c0 }
            r2 = 480314591(0x1ca104df, float:1.0655345E-21)
            r1 = r21
            X.0nV r1 = r3.CO6(r2, r1)     // Catch:{ all -> 0x07c0 }
            X.19S r2 = X.19E.A02(r1)     // Catch:{ all -> 0x07c0 }
            X.MGs r1 = new X.MGs     // Catch:{ all -> 0x07c0 }
            r1.<init>(r7, r0, r8)     // Catch:{ all -> 0x07c0 }
            X.1Eo.A03(r10, r13, r1, r2)     // Catch:{ all -> 0x07c0 }
        L_0x070c:
            com.instagram.common.session.UserSession r3 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            r1 = 36322572783593740(0x810b300018290c, double:3.03387951538114E-306)
            boolean r1 = X.182.A06(r5, r3, r1)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x0721
            X.C66633Ma2.A0Y(r7, r0)     // Catch:{ all -> 0x07c0 }
            X.C66633Ma2.A0X(r7, r0)     // Catch:{ all -> 0x07c0 }
        L_0x0721:
            X.0ng r6 = r7.A0Y     // Catch:{ all -> 0x07c0 }
            if (r6 == 0) goto L_0x0739
            X.0no r4 = X.0no.A00()     // Catch:{ all -> 0x07c0 }
            com.instagram.common.session.UserSession r3 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            r1 = 36604047761085439(0x820b30002413ff, double:3.211885424555651E-306)
            long r1 = X.182.A01(r5, r3, r1)     // Catch:{ all -> 0x07c0 }
            r4.A01(r6, r1)     // Catch:{ all -> 0x07c0 }
        L_0x0739:
            com.instagram.common.session.UserSession r3 = r7.A0p()     // Catch:{ all -> 0x07c0 }
            r1 = 36322572783986961(0x810b30001e2911, double:3.0338795156298147E-306)
            boolean r1 = X.182.A06(r5, r3, r1)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x0754
            android.os.MessageQueue r2 = android.os.Looper.myQueue()     // Catch:{ all -> 0x07c0 }
            X.Mgp r1 = new X.Mgp     // Catch:{ all -> 0x07c0 }
            r1.<init>(r7)     // Catch:{ all -> 0x07c0 }
            r2.addIdleHandler(r1)     // Catch:{ all -> 0x07c0 }
        L_0x0754:
            X.0eM r1 = r7.A2v     // Catch:{ all -> 0x07c0 }
            java.lang.Object r2 = r1.getValue()     // Catch:{ all -> 0x07c0 }
            X.Pwh r2 = (X.C74548Pwh) r2     // Catch:{ all -> 0x07c0 }
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x07c0 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x07c0 }
            r2.EZm(r1)     // Catch:{ all -> 0x07c0 }
            X.2Dm r1 = r7.A0v()     // Catch:{ all -> 0x07c0 }
            X.2Dr r1 = (X.2Dr) r1     // Catch:{ all -> 0x07c0 }
            X.1aS r2 = r1.A07     // Catch:{ all -> 0x07c0 }
            X.0eM r1 = r1.A0L     // Catch:{ all -> 0x07c0 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x07c0 }
            X.4fh r1 = (X.C269794fh) r1     // Catch:{ all -> 0x07c0 }
            X.1aU r2 = r2.A0P(r1)     // Catch:{ all -> 0x07c0 }
            X.MhB r1 = new X.MhB     // Catch:{ all -> 0x07c0 }
            r1.<init>(r7)     // Catch:{ all -> 0x07c0 }
            r9.A02(r2, r1)     // Catch:{ all -> 0x07c0 }
            boolean r1 = X.C66633Ma2.A0l(r7)     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x07a9
            X.Mpb r1 = r7.A0k     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x0799
            X.2Fk r3 = r1.A01     // Catch:{ all -> 0x07c0 }
            X.MpN r2 = new X.MpN     // Catch:{ all -> 0x07c0 }
            r2.<init>(r7)     // Catch:{ all -> 0x07c0 }
            r1 = r30
            r3.A06(r1, r2)     // Catch:{ all -> 0x07c0 }
        L_0x0799:
            X.Mpb r1 = r7.A0k     // Catch:{ all -> 0x07c0 }
            if (r1 == 0) goto L_0x07a9
            X.2Fk r3 = r1.A00     // Catch:{ all -> 0x07c0 }
            X.MpO r2 = new X.MpO     // Catch:{ all -> 0x07c0 }
            r2.<init>(r7)     // Catch:{ all -> 0x07c0 }
            r1 = r30
            r3.A06(r1, r2)     // Catch:{ all -> 0x07c0 }
        L_0x07a9:
            r20.close()     // Catch:{ all -> 0x07c9 }
            goto L_0x07df
        L_0x07ad:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x07c0 }
            goto L_0x07bf
        L_0x07b0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x07c0 }
            r0 = r22
            r1.<init>(r0)     // Catch:{ all -> 0x07c0 }
            goto L_0x07bf
        L_0x07b8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x07c0 }
            r0 = r22
            r1.<init>(r0)     // Catch:{ all -> 0x07c0 }
        L_0x07bf:
            throw r1     // Catch:{ all -> 0x07c0 }
        L_0x07c0:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x07c2 }
        L_0x07c2:
            r1 = move-exception
            r0 = r20
            X.1zE.A00(r0, r2)     // Catch:{ all -> 0x07c9 }
            throw r1     // Catch:{ all -> 0x07c9 }
        L_0x07c9:
            r1 = move-exception
            X.Mi9 r0 = r7.A0u()
            X.34p r0 = r0.A08
            r0.A05()
            com.instagram.common.session.UserSession r0 = r7.A0p()
            X.2Ki r0 = X.2Kh.A00(r0)
            r0.A00()
            throw r1
        L_0x07df:
            X.Mi9 r1 = r7.A0u()
            X.34p r1 = r1.A08
            r1.A05()
            com.instagram.common.session.UserSession r1 = r7.A0p()
            X.2Ki r1 = X.2Kh.A00(r1)
            r1.A00()
        L_0x07f3:
            com.instagram.common.session.UserSession r1 = A01(r15)
            X.65E r1 = X.AnonymousClass65D.A00(r1)
            boolean r1 = r1.A00()
            if (r1 == 0) goto L_0x0826
            X.2Zg r1 = r15.A0C
            if (r1 == 0) goto L_0x080b
            X.2bE r0 = r1.C3W()
            java.lang.String r0 = r0.A02
        L_0x080b:
            java.lang.String r1 = "back"
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x0826
            com.instagram.common.session.UserSession r0 = A01(r15)
            X.MoE r0 = X.C67039MhC.A00(r0)
            X.0eM r0 = r0.A04
            java.lang.Object r1 = r0.getValue()
            X.ONk r1 = (X.C70838ONk) r1
            r0 = 1
            r1.A00 = r0
        L_0x0826:
            X.38U r0 = r15.A07
            if (r0 == 0) goto L_0x082d
            r0.A02()
        L_0x082d:
            r0 = 1
            r15.A0L = r0
        L_0x0830:
            X.Ma2 r11 = r15.A05
            if (r11 == 0) goto L_0x0c26
            java.lang.String r0 = "DirectInboxController.onViewEntryOnScreen"
            X.0lp r17 = X.0lq.A00(r0)
            boolean r0 = r11.A15     // Catch:{ all -> 0x0c1a }
            if (r0 != 0) goto L_0x0c23
            com.instagram.common.session.UserSession r3 = r11.A0p()     // Catch:{ all -> 0x0c1a }
            X.4DH r13 = r11.A1J     // Catch:{ all -> 0x0c1a }
            android.content.Context r1 = r13.requireContext()     // Catch:{ all -> 0x0c1a }
            r0 = 0
            X.0qQ.A0B(r3, r0)     // Catch:{ all -> 0x0c1a }
            X.6iv r2 = new X.6iv     // Catch:{ all -> 0x0c1a }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0c1a }
            X.0Tu r10 = X.0Tu.A05     // Catch:{ all -> 0x0c1a }
            r0 = 36318015821846266(0x81070b000216fa, double:3.0309976744226254E-306)
            boolean r0 = X.182.A06(r10, r3, r0)     // Catch:{ all -> 0x0c1a }
            if (r0 != 0) goto L_0x0869
            r0 = 36322473998231755(0x810b19000728cb, double:3.033817043120444E-306)
            boolean r0 = X.182.A06(r10, r3, r0)     // Catch:{ all -> 0x0c1a }
            if (r0 == 0) goto L_0x09bf
        L_0x0869:
            boolean r0 = r2.A00()     // Catch:{ all -> 0x0c1a }
            if (r0 == 0) goto L_0x09bf
            com.instagram.common.session.UserSession r4 = r11.A0p()     // Catch:{ all -> 0x0c1a }
            X.FLH r3 = new X.FLH     // Catch:{ all -> 0x0c1a }
            r3.<init>(r11)     // Catch:{ all -> 0x0c1a }
            r0 = 1
            X.0qQ.A0B(r4, r0)     // Catch:{ all -> 0x0c1a }
            X.OLL r2 = new X.OLL     // Catch:{ all -> 0x0c1a }
            r2.<init>()     // Catch:{ all -> 0x0c1a }
            r2.A04 = r4     // Catch:{ all -> 0x0c1a }
            android.content.Context r0 = r13.requireContext()     // Catch:{ all -> 0x0c1a }
            r2.A00 = r0     // Catch:{ all -> 0x0c1a }
            r2.A02 = r13     // Catch:{ all -> 0x0c1a }
            X.6it r1 = X.C314816it.INBOX     // Catch:{ all -> 0x0c1a }
            X.6iu r0 = new X.6iu     // Catch:{ all -> 0x0c1a }
            r0.<init>(r1, r4)     // Catch:{ all -> 0x0c1a }
            r2.A03 = r0     // Catch:{ all -> 0x0c1a }
            r2.A01 = r3     // Catch:{ all -> 0x0c1a }
            r11.A0I = r2     // Catch:{ all -> 0x0c1a }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0c1a }
            android.os.Handler r1 = new android.os.Handler     // Catch:{ all -> 0x0c1a }
            r1.<init>(r0)     // Catch:{ all -> 0x0c1a }
            X.PVb r0 = new X.PVb     // Catch:{ all -> 0x0c1a }
            r0.<init>(r2)     // Catch:{ all -> 0x0c1a }
            r1.post(r0)     // Catch:{ all -> 0x0c1a }
        L_0x08a9:
            X.C66633Ma2.A0N(r11)     // Catch:{ all -> 0x0c1a }
            X.0eM r0 = r11.A2D     // Catch:{ all -> 0x0c1a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0c1a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0c1a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0c1a }
            if (r0 == 0) goto L_0x0926
            androidx.fragment.app.FragmentActivity r0 = r13.getActivity()     // Catch:{ all -> 0x0c1a }
            if (r0 == 0) goto L_0x0926
            com.instagram.common.session.UserSession r0 = r11.A0p()     // Catch:{ all -> 0x0c1a }
            X.65E r0 = X.AnonymousClass65D.A00(r0)     // Catch:{ all -> 0x0c1a }
            com.instagram.common.session.UserSession r2 = r0.A00     // Catch:{ all -> 0x0c1a }
            r0 = 36326627231152009(0x810ee000003789, double:3.0364435643429393E-306)
            boolean r0 = X.AnonymousClass65A.A02(r2, r0)     // Catch:{ all -> 0x0c1a }
            if (r0 == 0) goto L_0x0910
            com.instagram.common.session.UserSession r0 = r11.A0p()     // Catch:{ all -> 0x0c1a }
            r3 = 0
            X.0qQ.A0B(r0, r3)     // Catch:{ all -> 0x0c1a }
            java.lang.Class<X.AYg> r2 = X.C40267AYg.class
            X.AxV r1 = X.C41617AxV.A00     // Catch:{ all -> 0x0c1a }
            java.lang.Object r0 = r0.A01(r2, r1)     // Catch:{ all -> 0x0c1a }
            X.AYg r0 = (X.C40267AYg) r0     // Catch:{ all -> 0x0c1a }
            boolean r0 = r0.A00     // Catch:{ all -> 0x0c1a }
            if (r0 == 0) goto L_0x0910
            com.instagram.common.session.UserSession r0 = r11.A0p()     // Catch:{ all -> 0x0c1a }
            X.0qQ.A0B(r0, r3)     // Catch:{ all -> 0x0c1a }
            java.lang.Object r0 = r0.A01(r2, r1)     // Catch:{ all -> 0x0c1a }
            X.AYg r0 = (X.C40267AYg) r0     // Catch:{ all -> 0x0c1a }
            r0.A00 = r3     // Catch:{ all -> 0x0c1a }
            com.instagram.common.session.UserSession r0 = r11.A0p()     // Catch:{ all -> 0x0c1a }
            X.MoE r3 = X.C67039MhC.A00(r0)     // Catch:{ all -> 0x0c1a }
            com.instagram.common.session.UserSession r2 = r11.A0p()     // Catch:{ all -> 0x0c1a }
            X.P0z r1 = new X.P0z     // Catch:{ all -> 0x0c1a }
            r1.<init>(r11)     // Catch:{ all -> 0x0c1a }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0c1a }
            r3.A00(r13, r2, r1, r0)     // Catch:{ all -> 0x0c1a }
        L_0x0910:
            com.instagram.common.session.UserSession r0 = r11.A0p()     // Catch:{ all -> 0x0c1a }
            X.MoE r3 = X.C67039MhC.A00(r0)     // Catch:{ all -> 0x0c1a }
            com.instagram.common.session.UserSession r2 = r11.A0p()     // Catch:{ all -> 0x0c1a }
            X.P10 r1 = new X.P10     // Catch:{ all -> 0x0c1a }
            r1.<init>(r11)     // Catch:{ all -> 0x0c1a }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0c1a }
            r3.A00(r13, r2, r1, r0)     // Catch:{ all -> 0x0c1a }
        L_0x0926:
            com.instagram.common.session.UserSession r0 = r11.A0p()     // Catch:{ all -> 0x0c1a }
            X.MoE r2 = X.C67039MhC.A00(r0)     // Catch:{ all -> 0x0c1a }
            android.content.Context r9 = r13.requireContext()     // Catch:{ all -> 0x0c1a }
            com.instagram.common.session.UserSession r0 = r2.A01     // Catch:{ all -> 0x0c1a }
            X.65E r1 = X.AnonymousClass65D.A00(r0)     // Catch:{ all -> 0x0c1a }
            boolean r0 = r1.A00()     // Catch:{ all -> 0x0c1a }
            if (r0 == 0) goto L_0x09e3
            com.instagram.common.session.UserSession r12 = r1.A00     // Catch:{ all -> 0x0c1a }
            r0 = 36326627231414156(0x810ee00004378c, double:3.036443564508722E-306)
            boolean r0 = X.AnonymousClass65A.A02(r12, r0)     // Catch:{ all -> 0x0c1a }
            if (r0 == 0) goto L_0x09e3
            X.0eM r0 = r2.A05     // Catch:{ all -> 0x0c1a }
            java.lang.Object r8 = r0.getValue()     // Catch:{ all -> 0x0c1a }
            X.OBN r8 = (X.OBN) r8     // Catch:{ all -> 0x0c1a }
            com.instagram.common.session.UserSession r0 = r8.A01     // Catch:{ all -> 0x0c1a }
            r18 = r0
            X.3HH r2 = X.AnonymousClass3HG.A00(r18)     // Catch:{ all -> 0x0c1a }
            r0 = 36608102208247449(0x820ee000061699, double:3.2144494732668544E-306)
            long r6 = X.AnonymousClass65A.A00(r12, r0)     // Catch:{ all -> 0x0c1a }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0c1a }
            X.0xa r0 = r2.A00     // Catch:{ all -> 0x0c1a }
            r16 = r0
            java.lang.String r14 = "EB_BLOCKSTORE_HEALTH_CHECK_TIME"
            r0 = -1
            r2 = r16
            long r0 = r2.getLong(r14, r0)     // Catch:{ all -> 0x0c1a }
            long r4 = r4 - r0
            double r2 = (double) r4     // Catch:{ all -> 0x0c1a }
            r0 = 4704985352480227328(0x414b774000000000, double:3600000.0)
            double r2 = r2 / r0
            double r0 = (double) r6     // Catch:{ all -> 0x0c1a }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x098e
            r0 = 36326627231479693(0x810ee00005378d, double:3.036443564550168E-306)
            boolean r0 = X.AnonymousClass65A.A02(r12, r0)     // Catch:{ all -> 0x0c1a }
            if (r0 == 0) goto L_0x09e3
        L_0x098e:
            X.02m r3 = X.02m.A0p     // Catch:{ all -> 0x0c1a }
            X.0qQ.A07(r3)     // Catch:{ all -> 0x0c1a }
            X.0BQ r1 = X.AnonymousClass0BO.A00(r18)     // Catch:{ all -> 0x0c1a }
            X.65E r0 = X.AnonymousClass65D.A00(r18)     // Catch:{ all -> 0x0c1a }
            X.NUW r2 = new X.NUW     // Catch:{ all -> 0x0c1a }
            r2.<init>(r3, r0, r1)     // Catch:{ all -> 0x0c1a }
            r2.A09()     // Catch:{ all -> 0x0c1a }
            java.lang.String r0 = "CHECK_BLOCK_STORE_SUPPORTED_ON_DEVICE"
            r2.A0B(r0)     // Catch:{ all -> 0x0c1a }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0c1a }
            X.0xY r3 = r16.AR4()     // Catch:{ all -> 0x0c1a }
            r3.E5c(r14, r0)     // Catch:{ all -> 0x0c1a }
            r3.apply()     // Catch:{ all -> 0x0c1a }
            java.lang.Integer r1 = X.AnonymousClass05K.A07     // Catch:{ all -> 0x0c1a }
            r0 = r18
            X.OO6 r3 = X.C69891Ntt.A00(r9, r0, r1)     // Catch:{ all -> 0x0c1a }
            goto L_0x09c4
        L_0x09bf:
            r0 = 0
            r11.A0I = r0     // Catch:{ all -> 0x0c1a }
            goto L_0x08a9
        L_0x09c4:
            X.MmN r0 = r3.A02     // Catch:{ RuntimeException -> 0x09de }
            boolean r0 = r0.A00(r9)     // Catch:{ RuntimeException -> 0x09de }
            if (r0 == 0) goto L_0x09de
            java.lang.String r0 = "CHECK_BLOCK_STORE_ENCRYPTION_SUPPORTED"
            r2.A0B(r0)     // Catch:{ all -> 0x0c1a }
            X.ObS r1 = r3.A00(r9)     // Catch:{ all -> 0x0c1a }
            X.OmP r0 = new X.OmP     // Catch:{ all -> 0x0c1a }
            r0.<init>(r9, r3, r8, r2)     // Catch:{ all -> 0x0c1a }
            r1.A04(r0)     // Catch:{ all -> 0x0c1a }
            goto L_0x09e3
        L_0x09de:
            java.lang.String r0 = "BLOCK_STORE_DEVICE_NOT_AVAILABLE"
            r2.A0H(r0)     // Catch:{ all -> 0x0c1a }
        L_0x09e3:
            com.instagram.common.session.UserSession r3 = r11.A0p()     // Catch:{ all -> 0x0c1a }
            android.content.Context r2 = r13.getContext()     // Catch:{ all -> 0x0c1a }
            r4 = 0
            X.0qQ.A0B(r3, r4)     // Catch:{ all -> 0x0c1a }
            X.02m r5 = X.02m.A0p     // Catch:{ all -> 0x0c1a }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x0c1a }
            X.0BQ r1 = X.AnonymousClass0BO.A00(r3)     // Catch:{ all -> 0x0c1a }
            X.65E r0 = X.AnonymousClass65D.A00(r3)     // Catch:{ all -> 0x0c1a }
            X.MhF r6 = new X.MhF     // Catch:{ all -> 0x0c1a }
            r6.<init>(r5, r3, r0, r1)     // Catch:{ all -> 0x0c1a }
            com.instagram.common.session.UserSession r7 = r6.A00     // Catch:{ all -> 0x0c1a }
            X.AnonymousClass65D.A00(r7)     // Catch:{ all -> 0x0c1a }
            X.0Tu r5 = X.0Tu.A04     // Catch:{ all -> 0x0c1a }
            X.0qQ.A08(r5)     // Catch:{ all -> 0x0c1a }
            r0 = 18308363251100038(0x410b5c00002986, double:1.8962493907434243E-307)
            boolean r0 = X.1AW.A06(r5, r0)     // Catch:{ all -> 0x0c1a }
            if (r0 == 0) goto L_0x0a56
            X.3HH r0 = X.AnonymousClass3HG.A00(r7)     // Catch:{ all -> 0x0c1a }
            X.0xa r9 = r0.A00     // Catch:{ all -> 0x0c1a }
            java.lang.String r8 = "EB_HAS_LOGGED_MULTI_ACCOUNT_FLOW"
            boolean r0 = r9.getBoolean(r8, r4)     // Catch:{ all -> 0x0c1a }
            if (r0 != 0) goto L_0x0a56
            X.0xi r16 = X.0tS.A4E     // Catch:{ all -> 0x0c1a }
            X.0tS r7 = r16.A00()     // Catch:{ all -> 0x0c1a }
            X.0s0 r1 = r7.A2e     // Catch:{ all -> 0x0c1a }
            X.0YZ[] r14 = X.0tS.A4G     // Catch:{ all -> 0x0c1a }
            r12 = 132(0x84, float:1.85E-43)
            r0 = r14[r12]     // Catch:{ all -> 0x0c1a }
            java.lang.Object r0 = r1.CDM(r7, r0)     // Catch:{ all -> 0x0c1a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0c1a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0c1a }
            if (r0 == 0) goto L_0x0aec
            r6.A09()     // Catch:{ all -> 0x0c1a }
            java.lang.String r1 = "SIMPLIFIED"
            java.lang.String r0 = "FLOW_TYPE"
            r6.A0D(r0, r1)     // Catch:{ all -> 0x0c1a }
            r6.A08()     // Catch:{ all -> 0x0c1a }
        L_0x0a4b:
            r1 = 1
            X.0xY r0 = r9.AR4()     // Catch:{ all -> 0x0c1a }
            r0.E5T(r8, r1)     // Catch:{ all -> 0x0c1a }
            r0.apply()     // Catch:{ all -> 0x0c1a }
        L_0x0a56:
            X.02m r6 = X.02m.A0p     // Catch:{ all -> 0x0c1a }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x0c1a }
            X.0BQ r1 = X.AnonymousClass0BO.A00(r3)     // Catch:{ all -> 0x0c1a }
            X.65E r0 = X.AnonymousClass65D.A00(r3)     // Catch:{ all -> 0x0c1a }
            X.MhG r7 = new X.MhG     // Catch:{ all -> 0x0c1a }
            r7.<init>(r6, r3, r0, r1)     // Catch:{ all -> 0x0c1a }
            X.0eM r9 = r7.A02     // Catch:{ all -> 0x0c1a }
            r9.getValue()     // Catch:{ all -> 0x0c1a }
            r0 = 18308363251231112(0x410b5c00022988, double:1.8962493907952316E-307)
            boolean r0 = X.1AW.A06(r5, r0)     // Catch:{ all -> 0x0c1a }
            if (r0 == 0) goto L_0x0b0b
            X.0eM r8 = r7.A03     // Catch:{ all -> 0x0c1a }
            java.lang.Object r0 = r8.getValue()     // Catch:{ all -> 0x0c1a }
            X.3HH r0 = (X.AnonymousClass3HH) r0     // Catch:{ all -> 0x0c1a }
            X.0xa r0 = r0.A00     // Catch:{ all -> 0x0c1a }
            java.lang.String r6 = "EB_HAS_LOGGED_DEVICE_ACCOUNT_IDS"
            boolean r0 = r0.getBoolean(r6, r4)     // Catch:{ all -> 0x0c1a }
            if (r0 != 0) goto L_0x0b0b
            r7.A09()     // Catch:{ all -> 0x0c1a }
            com.instagram.common.session.UserSession r0 = r7.A00     // Catch:{ all -> 0x0c1a }
            java.lang.String r1 = r0.A06     // Catch:{ all -> 0x0c1a }
            java.lang.String r0 = "FOREGROUNDED_ACCOUNT"
            r7.A0D(r0, r1)     // Catch:{ all -> 0x0c1a }
            X.0BQ r0 = r7.A01     // Catch:{ all -> 0x0c1a }
            X.0tB r0 = (X.0tB) r0     // Catch:{ all -> 0x0c1a }
            r14 = 0
            java.util.List r12 = r0.BNy(r14)     // Catch:{ all -> 0x0c1a }
            java.lang.String r1 = ","
            java.lang.String r0 = ""
            java.lang.String r1 = X.00k.A0P(r1, r0, r0, r12, r14)     // Catch:{ all -> 0x0c1a }
            java.lang.String r0 = "LIST_OF_ACCOUNTS"
            r7.A0D(r0, r1)     // Catch:{ all -> 0x0c1a }
            r9.getValue()     // Catch:{ all -> 0x0c1a }
            r0 = 18308363251296649(0x410b5c00032989, double:1.8962493908211353E-307)
            boolean r0 = X.1AW.A06(r5, r0)     // Catch:{ all -> 0x0c1a }
            if (r0 == 0) goto L_0x0ae9
            java.lang.String r1 = "3P"
        L_0x0abc:
            java.lang.String r0 = "KEY_SOLUTION"
            r7.A0D(r0, r1)     // Catch:{ all -> 0x0c1a }
            r9.getValue()     // Catch:{ all -> 0x0c1a }
            r0 = 18871313204970134(0x430b5c00070296, double:2.1187567767715275E-307)
            java.lang.String r1 = X.1AW.A04(r5, r0)     // Catch:{ all -> 0x0c1a }
            java.lang.String r0 = "EXPERIMENT_VERSION"
            r7.A0D(r0, r1)     // Catch:{ all -> 0x0c1a }
            r7.A08()     // Catch:{ all -> 0x0c1a }
            java.lang.Object r0 = r8.getValue()     // Catch:{ all -> 0x0c1a }
            X.3HH r0 = (X.AnonymousClass3HH) r0     // Catch:{ all -> 0x0c1a }
            r1 = 1
            X.0xa r0 = r0.A00     // Catch:{ all -> 0x0c1a }
            X.0xY r0 = r0.AR4()     // Catch:{ all -> 0x0c1a }
            r0.E5T(r6, r1)     // Catch:{ all -> 0x0c1a }
            r0.apply()     // Catch:{ all -> 0x0c1a }
            goto L_0x0b0b
        L_0x0ae9:
            java.lang.String r1 = "PIN"
            goto L_0x0abc
        L_0x0aec:
            r6.A09()     // Catch:{ all -> 0x0c1a }
            java.lang.String r1 = "FULL"
            java.lang.String r0 = "FLOW_TYPE"
            r6.A0D(r0, r1)     // Catch:{ all -> 0x0c1a }
            r6.A08()     // Catch:{ all -> 0x0c1a }
            X.0tS r7 = r16.A00()     // Catch:{ all -> 0x0c1a }
            r0 = 1
            X.0s0 r6 = r7.A2e     // Catch:{ all -> 0x0c1a }
            r1 = r14[r12]     // Catch:{ all -> 0x0c1a }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0c1a }
            r6.Epx(r7, r0, r1)     // Catch:{ all -> 0x0c1a }
            goto L_0x0a4b
        L_0x0b0b:
            if (r2 == 0) goto L_0x0b5d
            X.02m r5 = X.02m.A0p     // Catch:{ all -> 0x0c1a }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x0c1a }
            X.0BQ r1 = X.AnonymousClass0BO.A00(r3)     // Catch:{ all -> 0x0c1a }
            X.65E r0 = X.AnonymousClass65D.A00(r3)     // Catch:{ all -> 0x0c1a }
            X.MhH r6 = new X.MhH     // Catch:{ all -> 0x0c1a }
            r6.<init>(r5, r3, r0, r1)     // Catch:{ all -> 0x0c1a }
            com.instagram.common.session.UserSession r7 = r6.A00     // Catch:{ all -> 0x0c1a }
            X.65E r0 = X.AnonymousClass65D.A00(r7)     // Catch:{ all -> 0x0c1a }
            com.instagram.common.session.UserSession r3 = r0.A00     // Catch:{ all -> 0x0c1a }
            r0 = 36315949948735265(0x81052a00600f21, double:3.029691207948625E-306)
            boolean r0 = X.AnonymousClass65A.A02(r3, r0)     // Catch:{ all -> 0x0c1a }
            if (r0 == 0) goto L_0x0b5d
            X.3HH r0 = X.AnonymousClass3HG.A00(r7)     // Catch:{ all -> 0x0c1a }
            X.0xa r5 = r0.A00     // Catch:{ all -> 0x0c1a }
            java.lang.String r3 = "EB_HAS_LOGGED_BLOCKSTORE_AVAILABLE"
            boolean r0 = r5.getBoolean(r3, r4)     // Catch:{ all -> 0x0c1a }
            if (r0 != 0) goto L_0x0b5d
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0c1a }
            X.OO6 r0 = X.C69891Ntt.A00(r2, r7, r0)     // Catch:{ all -> 0x0c1a }
            X.ObS r1 = r0.A00(r2)     // Catch:{ all -> 0x0c1a }
            X.OmA r0 = new X.OmA     // Catch:{ all -> 0x0c1a }
            r0.<init>(r6)     // Catch:{ all -> 0x0c1a }
            r1.A04(r0)     // Catch:{ all -> 0x0c1a }
            r1 = 1
            X.0xY r0 = r5.AR4()     // Catch:{ all -> 0x0c1a }
            r0.E5T(r3, r1)     // Catch:{ all -> 0x0c1a }
            r0.apply()     // Catch:{ all -> 0x0c1a }
        L_0x0b5d:
            com.instagram.common.session.UserSession r0 = r11.A0p()     // Catch:{ all -> 0x0c1a }
            X.MhE r0 = X.C67040MhD.A00(r0)     // Catch:{ all -> 0x0c1a }
            r0.A01()     // Catch:{ all -> 0x0c1a }
            com.instagram.common.session.UserSession r0 = r11.A0p()     // Catch:{ all -> 0x0c1a }
            X.2De r0 = X.2Dd.A00(r0)     // Catch:{ all -> 0x0c1a }
            X.0eM r3 = r11.A2O     // Catch:{ all -> 0x0c1a }
            java.lang.Object r2 = r3.getValue()     // Catch:{ all -> 0x0c1a }
            X.MlE r2 = (X.C67279MlE) r2     // Catch:{ all -> 0x0c1a }
            X.0qQ.A0B(r2, r4)     // Catch:{ all -> 0x0c1a }
            java.util.List r1 = r0.A00     // Catch:{ all -> 0x0c1a }
            boolean r0 = r1.contains(r2)     // Catch:{ all -> 0x0c1a }
            if (r0 != 0) goto L_0x0b86
            r1.add(r2)     // Catch:{ all -> 0x0c1a }
        L_0x0b86:
            X.0eM r0 = r11.A22     // Catch:{ all -> 0x0c1a }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x0c1a }
            X.1Ng r2 = (X.1Ng) r2     // Catch:{ all -> 0x0c1a }
            java.lang.Class<X.3EK> r1 = X.AnonymousClass3EK.class
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x0c1a }
            X.MlE r0 = (X.C67279MlE) r0     // Catch:{ all -> 0x0c1a }
            r2.A01(r0, r1)     // Catch:{ all -> 0x0c1a }
            X.AnonymousClass1q4.A00()     // Catch:{ all -> 0x0c1a }
            androidx.fragment.app.FragmentActivity r7 = r13.requireActivity()     // Catch:{ all -> 0x0c1a }
            android.view.View r6 = r11.A0B     // Catch:{ all -> 0x0c1a }
            com.instagram.common.session.UserSession r5 = r11.A0p()     // Catch:{ all -> 0x0c1a }
            r2 = 1000(0x3e8, double:4.94E-321)
            r0 = 2
            X.0qQ.A0B(r5, r0)     // Catch:{ all -> 0x0c1a }
            X.0Tu r8 = X.0Tu.A06     // Catch:{ all -> 0x0c1a }
            r0 = 36321279997060323(0x810a03000324e3, double:3.0330619519717737E-306)
            boolean r0 = X.182.A06(r8, r5, r0)     // Catch:{ all -> 0x0c1a }
            if (r0 == 0) goto L_0x0bdb
            if (r6 == 0) goto L_0x0bdb
            X.1Av r9 = X.1Au.A00(r5)     // Catch:{ all -> 0x0c1a }
            X.0s0 r8 = r9.A14     // Catch:{ all -> 0x0c1a }
            X.0YZ[] r1 = X.1Av.A8a     // Catch:{ all -> 0x0c1a }
            r0 = 388(0x184, float:5.44E-43)
            r0 = r1[r0]     // Catch:{ all -> 0x0c1a }
            java.lang.Object r0 = r8.CDM(r9, r0)     // Catch:{ all -> 0x0c1a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0c1a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0c1a }
            if (r0 == 0) goto L_0x0bdb
            X.FuB r0 = new X.FuB     // Catch:{ all -> 0x0c1a }
            r0.<init>(r7, r6, r5)     // Catch:{ all -> 0x0c1a }
            r6.postDelayed(r0, r2)     // Catch:{ all -> 0x0c1a }
        L_0x0bdb:
            com.instagram.common.session.UserSession r0 = r11.A0p()     // Catch:{ all -> 0x0c1a }
            X.1Av r2 = X.1Au.A00(r0)     // Catch:{ all -> 0x0c1a }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0c1a }
            X.0xa r2 = r2.A01     // Catch:{ all -> 0x0c1a }
            X.0xY r3 = r2.AR4()     // Catch:{ all -> 0x0c1a }
            java.lang.String r2 = "direct_tab_tooltip_timestamp_ms"
            r3.E5c(r2, r0)     // Catch:{ all -> 0x0c1a }
            r3.apply()     // Catch:{ all -> 0x0c1a }
            r0 = 1
            r11.A15 = r0     // Catch:{ all -> 0x0c1a }
            com.instagram.common.session.UserSession r0 = r11.A0p()     // Catch:{ all -> 0x0c1a }
            X.0qQ.A0B(r0, r4)     // Catch:{ all -> 0x0c1a }
            X.GAW.A00(r0)     // Catch:{ all -> 0x0c1a }
            com.instagram.common.session.UserSession r2 = r11.A0p()     // Catch:{ all -> 0x0c1a }
            X.0qQ.A0B(r2, r4)     // Catch:{ all -> 0x0c1a }
            r0 = 36329564988784825(0x81118c000040b9, double:3.0383014140993327E-306)
            X.182.A06(r10, r2, r0)     // Catch:{ all -> 0x0c1a }
            r0 = 36329564988850362(0x81118c000140ba, double:3.0383014141407785E-306)
            X.182.A06(r10, r2, r0)     // Catch:{ all -> 0x0c1a }
            goto L_0x0c23
        L_0x0c1a:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0c1c }
        L_0x0c1c:
            r1 = move-exception
            r0 = r17
            X.1zE.A00(r0, r2)
            throw r1
        L_0x0c23:
            r17.close()
        L_0x0c26:
            com.instagram.common.session.UserSession r0 = A01(r15)
            boolean r0 = X.AnonymousClass9B8.A02(r0)
            if (r0 == 0) goto L_0x0cb6
            com.instagram.common.session.UserSession r2 = A01(r15)
            r4 = 0
            X.0qQ.A0B(r2, r4)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36320438183666097(0x81093f000621b1, double:3.032529585791555E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x0cb6
            com.instagram.common.session.UserSession r2 = A01(r15)
            X.0qQ.A0B(r2, r4)
            r0 = 36320438184780223(0x81093f001721bf, double:3.0325295864961325E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 != 0) goto L_0x0c69
            com.instagram.common.session.UserSession r2 = A01(r15)
            X.0qQ.A0B(r2, r4)
            r0 = 36320438184845760(0x81093f001821c0, double:3.0325295865375783E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x0cb6
        L_0x0c69:
            com.instagram.common.session.UserSession r2 = A01(r15)
            X.0qQ.A0B(r2, r4)
            r0 = 36320438185042370(0x81093f001b21c2, double:3.032529586661915E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 != 0) goto L_0x0cb6
            X.Mlb r5 = r15.A0H
            r7 = 1
            com.instagram.common.session.UserSession r2 = A01(r15)
            X.0qQ.A0B(r2, r4)
            r0 = 36320438184780223(0x81093f001721bf, double:3.0325295864961325E-306)
            boolean r8 = X.182.A06(r3, r2, r0)
            com.instagram.common.session.UserSession r2 = A01(r15)
            X.0qQ.A0B(r2, r4)
            r0 = 36320438184845760(0x81093f001821c0, double:3.0325295865375783E-306)
            boolean r9 = X.182.A06(r3, r2, r0)
            com.instagram.common.session.UserSession r2 = A01(r15)
            X.0qQ.A0B(r2, r4)
            r0 = 36601913161617783(0x82093f00191177, double:3.210535495256963E-306)
            long r0 = X.182.A01(r3, r2, r0)
            int r6 = (int) r0
            com.instagram.common.session.UserSession r4 = A01(r15)
            X.C67300Mla.A02(r4, r5, r6, r7, r8, r9)
        L_0x0cb6:
            boolean r0 = r15.A0F
            if (r0 == 0) goto L_0x0ccc
            boolean r0 = r15.A0J
            if (r0 == 0) goto L_0x0ccc
            r0 = 0
            r15.A0J = r0
            X.Ma2 r0 = r15.A05
            if (r0 == 0) goto L_0x0ccc
            X.Mgq r0 = X.C66633Ma2.A04(r0)
            r0.A0N()
        L_0x0ccc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273624mt.A02():void");
    }

    /* JADX WARNING: type inference failed for: r0v133, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r0v134, types: [X.07Z, X.4DH] */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0332, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0336, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0412, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0413, code lost:
        X.1zE.A00(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0416, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A03() {
        /*
            r10 = this;
            boolean r0 = r10.A0L
            if (r0 == 0) goto L_0x0367
            X.Ma2 r2 = r10.A05
            if (r2 == 0) goto L_0x035d
            java.lang.String r0 = "DirectInboxController.onPause"
            X.0lp r3 = X.0lq.A00(r0)     // Catch:{ all -> 0x0337 }
            X.Mi9 r0 = r2.A0u()     // Catch:{ all -> 0x0330 }
            X.34p r0 = r0.A07     // Catch:{ all -> 0x0330 }
            r4 = 0
            r0.A08(r4)     // Catch:{ all -> 0x0330 }
            X.Mgq r0 = X.C66633Ma2.A04(r2)     // Catch:{ all -> 0x0330 }
            X.34p r0 = r0.A04     // Catch:{ all -> 0x0330 }
            r0.A08(r4)     // Catch:{ all -> 0x0330 }
            com.instagram.common.session.UserSession r5 = r2.A0p()     // Catch:{ all -> 0x0330 }
            X.0Tu r7 = X.0Tu.A05     // Catch:{ all -> 0x0330 }
            r0 = 36318058774927188(0x81071500361754, double:3.0310248381239587E-306)
            boolean r0 = X.182.A06(r7, r5, r0)     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x0040
            X.Mi9 r0 = r2.A0u()     // Catch:{ all -> 0x0330 }
            r0.A08()     // Catch:{ all -> 0x0330 }
            X.Mgq r0 = X.C66633Ma2.A04(r2)     // Catch:{ all -> 0x0330 }
            r0.A08()     // Catch:{ all -> 0x0330 }
        L_0x0040:
            X.Pw5 r0 = r2.A0q()     // Catch:{ all -> 0x0330 }
            boolean r0 = r0.Cmi()     // Catch:{ all -> 0x0330 }
            r6 = 0
            if (r0 == 0) goto L_0x0056
            X.0eM r0 = r2.A0z     // Catch:{ all -> 0x0330 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0330 }
            X.3AD r0 = (X.AnonymousClass3AD) r0     // Catch:{ all -> 0x0330 }
            r0.setIsLoading(r6)     // Catch:{ all -> 0x0330 }
        L_0x0056:
            X.0eM r1 = r2.A1h     // Catch:{ all -> 0x0330 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x0330 }
            X.Pvy r0 = (X.C74503Pvy) r0     // Catch:{ all -> 0x0330 }
            X.Pw5 r0 = r0.BNZ()     // Catch:{ all -> 0x0330 }
            r0.pause()     // Catch:{ all -> 0x0330 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x0330 }
            X.Pvy r0 = (X.C74503Pvy) r0     // Catch:{ all -> 0x0330 }
            X.PxF r0 = r0.C6W()     // Catch:{ all -> 0x0330 }
            r0.EaU(r6)     // Catch:{ all -> 0x0330 }
            X.0eM r0 = r2.A22     // Catch:{ all -> 0x0330 }
            java.lang.Object r5 = r0.getValue()     // Catch:{ all -> 0x0330 }
            X.1Ng r5 = (X.1Ng) r5     // Catch:{ all -> 0x0330 }
            java.lang.Class<X.2Kc> r1 = X.2Kc.class
            X.0eM r0 = r2.A27     // Catch:{ all -> 0x0330 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0330 }
            X.1wn r0 = (X.1wn) r0     // Catch:{ all -> 0x0330 }
            r5.A02(r0, r1)     // Catch:{ all -> 0x0330 }
            java.lang.Class<X.FWA> r1 = X.FWA.class
            X.0eM r0 = r2.A2P     // Catch:{ all -> 0x0330 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0330 }
            X.1wn r0 = (X.1wn) r0     // Catch:{ all -> 0x0330 }
            r5.A02(r0, r1)     // Catch:{ all -> 0x0330 }
            java.lang.Class<X.9Fv> r1 = X.C375939Fv.class
            X.MiA r0 = r2.A1L     // Catch:{ all -> 0x0330 }
            r5.A02(r0, r1)     // Catch:{ all -> 0x0330 }
            java.lang.Class<X.AY5> r1 = X.AY5.class
            X.0eM r0 = r2.A25     // Catch:{ all -> 0x0330 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0330 }
            X.MlD r0 = (X.C67278MlD) r0     // Catch:{ all -> 0x0330 }
            r5.A02(r0, r1)     // Catch:{ all -> 0x0330 }
            java.lang.Class<X.OsR> r1 = X.C71883OsR.class
            X.0eM r0 = r2.A2o     // Catch:{ all -> 0x0330 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0330 }
            X.1wn r0 = (X.1wn) r0     // Catch:{ all -> 0x0330 }
            r5.A02(r0, r1)     // Catch:{ all -> 0x0330 }
            X.0eM r0 = r2.A2a     // Catch:{ all -> 0x0330 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0330 }
            X.MhK r0 = (X.C67047MhK) r0     // Catch:{ all -> 0x0330 }
            r0.A00()     // Catch:{ all -> 0x0330 }
            X.0eM r0 = r2.A1s     // Catch:{ all -> 0x0330 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x0330 }
            X.Mjt r1 = (X.C67197Mjt) r1     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "LEAVE_SURFACE"
            r1.A04(r0)     // Catch:{ all -> 0x0330 }
            X.0eM r0 = r2.A2n     // Catch:{ all -> 0x0330 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0330 }
            X.42q r0 = (X.C2596742q) r0     // Catch:{ all -> 0x0330 }
            X.PtF r1 = r2.A0h     // Catch:{ all -> 0x0330 }
            if (r1 != 0) goto L_0x00e4
            java.lang.String r0 = "threadActivityUpdateListener"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x0330 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x032f
        L_0x00e4:
            java.util.Set r0 = r0.A04     // Catch:{ all -> 0x0330 }
            r0.remove(r1)     // Catch:{ all -> 0x0330 }
            X.0eM r0 = r2.A2N     // Catch:{ all -> 0x0330 }
            java.lang.Object r8 = r0.getValue()     // Catch:{ all -> 0x0330 }
            X.MgA r8 = (X.C66976MgA) r8     // Catch:{ all -> 0x0330 }
            if (r8 == 0) goto L_0x013f
            X.0h9 r5 = r8.A01     // Catch:{ all -> 0x0330 }
            X.07U r1 = r5.A00     // Catch:{ all -> 0x0330 }
            X.07U r0 = X.07U.A02     // Catch:{ all -> 0x0330 }
            if (r1 == r0) goto L_0x0100
            X.07U r0 = X.07U.A05     // Catch:{ all -> 0x0330 }
            r5.A0C(r0)     // Catch:{ all -> 0x0330 }
        L_0x0100:
            com.instagram.common.session.UserSession r5 = r8.A06     // Catch:{ all -> 0x0330 }
            X.0Tu r8 = X.0Tu.A06     // Catch:{ all -> 0x0330 }
            r0 = 36324569942077603(0x810d01000430a3, double:3.035142526448247E-306)
            boolean r0 = X.182.A06(r8, r5, r0)     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x0117
            X.1wS r1 = X.1wS.A01(r5)     // Catch:{ all -> 0x0330 }
            r0 = 3
            r1.A0C(r0)     // Catch:{ all -> 0x0330 }
        L_0x0117:
            r0 = 36327344490690907(0x810f870000395b, double:3.036897162163511E-306)
            boolean r0 = X.182.A06(r7, r5, r0)     // Catch:{ all -> 0x0330 }
            if (r0 != 0) goto L_0x0128
            boolean r0 = X.AnonymousClass4AJ.A0E(r5)     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x013f
        L_0x0128:
            X.49x r0 = X.C2615149w.A00(r5)     // Catch:{ all -> 0x0330 }
            X.0gd r5 = X.AnonymousClass0gd.A00()     // Catch:{ all -> 0x0330 }
            X.0eM r0 = r0.A0D     // Catch:{ all -> 0x0330 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x0330 }
            X.0gc r1 = (X.0gc) r1     // Catch:{ all -> 0x0330 }
            if (r1 == 0) goto L_0x013f
            java.util.concurrent.CopyOnWriteArrayList r0 = r5.A00     // Catch:{ all -> 0x0330 }
            r0.remove(r1)     // Catch:{ all -> 0x0330 }
        L_0x013f:
            X.0eM r0 = r2.A2V     // Catch:{ all -> 0x0330 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0330 }
            X.2qT r0 = (X.C230882qT) r0     // Catch:{ all -> 0x0330 }
            r0.onPause()     // Catch:{ all -> 0x0330 }
            X.Dfq r0 = r2.A0p     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x0325
            r0.onPause()     // Catch:{ all -> 0x0330 }
            X.0eM r0 = r2.A2D     // Catch:{ all -> 0x0330 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0330 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0330 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x0178
            com.instagram.common.session.UserSession r0 = r2.A0p()     // Catch:{ all -> 0x0330 }
            X.MoE r7 = X.C67039MhC.A00(r0)     // Catch:{ all -> 0x0330 }
            X.0eM r0 = r7.A06     // Catch:{ all -> 0x0330 }
            java.lang.Object r5 = r0.getValue()     // Catch:{ all -> 0x0330 }
            X.NUX r5 = (X.NUX) r5     // Catch:{ all -> 0x0330 }
            java.lang.Integer r1 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "INBOX_NOT_VISIBLE"
            r5.A0H(r0, r1)     // Catch:{ all -> 0x0330 }
            r7.A00 = r6     // Catch:{ all -> 0x0330 }
        L_0x0178:
            X.0eM r8 = r2.A2t     // Catch:{ all -> 0x0330 }
            java.lang.Object r7 = r8.getValue()     // Catch:{ all -> 0x0330 }
            X.Mbh r7 = (X.C66736Mbh) r7     // Catch:{ all -> 0x0330 }
            X.Miz r5 = r7.A0E     // Catch:{ all -> 0x0330 }
            X.Oty r1 = r5.A05     // Catch:{ all -> 0x0330 }
            if (r1 == 0) goto L_0x01bb
            com.instagram.common.session.UserSession r0 = r7.A0B     // Catch:{ all -> 0x0330 }
            X.NUR r9 = X.C69899Nu1.A00(r0)     // Catch:{ all -> 0x0330 }
            X.Nit r0 = r1.A01     // Catch:{ all -> 0x0330 }
            int r1 = r0.ordinal()     // Catch:{ all -> 0x0330 }
            if (r1 == r6) goto L_0x01b0
            r0 = 1
            if (r1 == r0) goto L_0x01ad
            r0 = 2
            if (r1 == r0) goto L_0x01aa
            r0 = 3
            if (r1 == r0) goto L_0x01b3
            r0 = 4
            if (r1 != r0) goto L_0x01a3
            java.lang.String r0 = "MEX_EB_LOW_DISK_SPACE_BANNER_NAVIGATED_AWAY"
            goto L_0x01b5
        L_0x01a3:
            X.Wub r0 = new X.Wub     // Catch:{ all -> 0x0330 }
            r0.<init>()     // Catch:{ all -> 0x0330 }
            goto L_0x032f
        L_0x01aa:
            java.lang.String r0 = "WARN_BANNER_NAVIGATED_AWAY"
            goto L_0x01b5
        L_0x01ad:
            java.lang.String r0 = "SELL_BANNER_NAVIGATED_AWAY"
            goto L_0x01b5
        L_0x01b0:
            java.lang.String r0 = "INTRODUCE_BANNER_NAVIGATED_AWAY"
            goto L_0x01b5
        L_0x01b3:
            java.lang.String r0 = "MEX_EB_UPSELL_BANNER_NAVIGATED_AWAY"
        L_0x01b5:
            r9.A0B(r0)     // Catch:{ all -> 0x0330 }
            r9.A07()     // Catch:{ all -> 0x0330 }
        L_0x01bb:
            X.Oty r0 = r5.A05     // Catch:{ all -> 0x0330 }
            if (r4 == r0) goto L_0x01c4
            r5.A05 = r4     // Catch:{ all -> 0x0330 }
            X.C66736Mbh.A04(r7)     // Catch:{ all -> 0x0330 }
        L_0x01c4:
            java.lang.Object r1 = r8.getValue()     // Catch:{ all -> 0x0330 }
            X.Mbh r1 = (X.C66736Mbh) r1     // Catch:{ all -> 0x0330 }
            X.0eM r0 = r2.A2I     // Catch:{ all -> 0x0330 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0330 }
            X.Mld r0 = (X.C67303Mld) r0     // Catch:{ all -> 0x0330 }
            r1.A07(r0, r6, r6)     // Catch:{ all -> 0x0330 }
            X.2EM r1 = r2.A0s()     // Catch:{ all -> 0x0330 }
            X.2EX r0 = X.AnonymousClass2EX.A00     // Catch:{ all -> 0x0330 }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x01ec
            com.instagram.common.session.UserSession r0 = r2.A0p()     // Catch:{ all -> 0x0330 }
            X.Odl r0 = X.OPT.A00(r0)     // Catch:{ all -> 0x0330 }
            r0.A07()     // Catch:{ all -> 0x0330 }
        L_0x01ec:
            boolean r0 = X.C66633Ma2.A0l(r2)     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x0293
            X.Mpb r0 = r2.A0k     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x01fd
            X.2Fk r1 = r0.A01     // Catch:{ all -> 0x0330 }
            X.4DH r0 = r2.A1J     // Catch:{ all -> 0x0330 }
            r1.A05(r0)     // Catch:{ all -> 0x0330 }
        L_0x01fd:
            X.Mpb r0 = r2.A0k     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x0208
            X.2Fk r1 = r0.A00     // Catch:{ all -> 0x0330 }
            X.4DH r0 = r2.A1J     // Catch:{ all -> 0x0330 }
            r1.A05(r0)     // Catch:{ all -> 0x0330 }
        L_0x0208:
            X.1a8 r0 = r2.A1K     // Catch:{ all -> 0x0330 }
            r0.A01()     // Catch:{ all -> 0x0330 }
            r2.A16 = r6     // Catch:{ all -> 0x0330 }
            X.0eM r0 = r2.A2B     // Catch:{ all -> 0x0330 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0330 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0330 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x0321
            X.2Dm r0 = r2.A0v()     // Catch:{ all -> 0x0330 }
            java.util.HashSet r0 = r0.Bk6()     // Catch:{ all -> 0x0330 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0330 }
        L_0x0229:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x02a0
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x0330 }
            com.instagram.model.direct.DirectThreadKey r1 = (com.instagram.model.direct.DirectThreadKey) r1     // Catch:{ all -> 0x0330 }
            X.2Dm r8 = r2.A0v()     // Catch:{ all -> 0x0330 }
            X.2Dr r8 = (X.2Dr) r8     // Catch:{ all -> 0x0330 }
            monitor-enter(r8)     // Catch:{ all -> 0x0330 }
            X.0qQ.A0B(r1, r6)     // Catch:{ all -> 0x032d }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x032d }
            r7.<init>()     // Catch:{ all -> 0x032d }
            r0 = 1
            java.util.List r0 = r8.Bk4(r1, r0)     // Catch:{ all -> 0x032d }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x032d }
        L_0x024d:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x032d }
            if (r0 == 0) goto L_0x026d
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x032d }
            X.3su r4 = (X.C254703su) r4     // Catch:{ all -> 0x032d }
            java.lang.String r0 = r4.A0g()     // Catch:{ all -> 0x032d }
            if (r0 == 0) goto L_0x024d
            X.2FW r1 = r4.A10     // Catch:{ all -> 0x032d }
            X.2FW r0 = X.2FW.A0W     // Catch:{ all -> 0x032d }
            if (r1 == r0) goto L_0x0269
            X.2FW r0 = X.2FW.A1p     // Catch:{ all -> 0x032d }
            if (r1 != r0) goto L_0x024d
        L_0x0269:
            r7.add(r4)     // Catch:{ all -> 0x032d }
            goto L_0x024d
        L_0x026d:
            monitor-exit(r8)     // Catch:{ all -> 0x0330 }
            java.util.HashSet r5 = r2.A1X     // Catch:{ all -> 0x0330 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0330 }
            r4.<init>()     // Catch:{ all -> 0x0330 }
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x0330 }
        L_0x0279:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x028f
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0330 }
            X.3su r0 = (X.C254703su) r0     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = r0.A0g()     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x0279
            r4.add(r0)     // Catch:{ all -> 0x0330 }
            goto L_0x0279
        L_0x028f:
            r5.addAll(r4)     // Catch:{ all -> 0x0330 }
            goto L_0x0229
        L_0x0293:
            X.0eM r0 = r2.A2g     // Catch:{ all -> 0x0330 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0330 }
            X.9Hr r0 = (X.C376359Hr) r0     // Catch:{ all -> 0x0330 }
            r0.A00()     // Catch:{ all -> 0x0330 }
            goto L_0x0208
        L_0x02a0:
            java.util.HashMap r6 = r2.A1V     // Catch:{ all -> 0x0330 }
            java.util.Set r0 = r6.keySet()     // Catch:{ all -> 0x0330 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0330 }
            r7.<init>(r0)     // Catch:{ all -> 0x0330 }
            int r5 = r7.size()     // Catch:{ all -> 0x0330 }
            r8 = 0
            r4 = 0
        L_0x02b1:
            if (r4 >= r5) goto L_0x02c9
            java.util.HashSet r1 = r2.A1X     // Catch:{ all -> 0x0330 }
            java.lang.Object r0 = r7.get(r4)     // Catch:{ all -> 0x0330 }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0330 }
            if (r0 != 0) goto L_0x02c6
            java.lang.Object r0 = r7.get(r4)     // Catch:{ all -> 0x0330 }
            r6.remove(r0)     // Catch:{ all -> 0x0330 }
        L_0x02c6:
            int r4 = r4 + 1
            goto L_0x02b1
        L_0x02c9:
            com.instagram.common.session.UserSession r0 = r2.A0p()     // Catch:{ all -> 0x0330 }
            X.1Av r0 = X.1Au.A00(r0)     // Catch:{ all -> 0x0330 }
            X.0xa r1 = r0.A01     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "direct_reels_watched_set"
            java.util.Set r0 = r1.C1t(r0)     // Catch:{ all -> 0x0330 }
            java.util.Set r5 = X.00k.A0j(r0)     // Catch:{ all -> 0x0330 }
            java.util.List r7 = X.00k.A0a(r5)     // Catch:{ all -> 0x0330 }
            int r4 = r7.size()     // Catch:{ all -> 0x0330 }
        L_0x02e5:
            if (r8 >= r4) goto L_0x02fd
            java.util.HashSet r1 = r2.A1X     // Catch:{ all -> 0x0330 }
            java.lang.Object r0 = r7.get(r8)     // Catch:{ all -> 0x0330 }
            boolean r0 = X.00k.A0u(r1, r0)     // Catch:{ all -> 0x0330 }
            if (r0 != 0) goto L_0x02fa
            java.lang.Object r0 = r7.get(r8)     // Catch:{ all -> 0x0330 }
            r5.remove(r0)     // Catch:{ all -> 0x0330 }
        L_0x02fa:
            int r8 = r8 + 1
            goto L_0x02e5
        L_0x02fd:
            com.instagram.common.session.UserSession r0 = r2.A0p()     // Catch:{ all -> 0x0330 }
            X.1Av r1 = X.1Au.A00(r0)     // Catch:{ all -> 0x0330 }
            r0 = 589(0x24d, float:8.25E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0330 }
            X.1Av.A05(r1, r0, r6)     // Catch:{ all -> 0x0330 }
            com.instagram.common.session.UserSession r0 = r2.A0p()     // Catch:{ all -> 0x0330 }
            X.1Av r0 = X.1Au.A00(r0)     // Catch:{ all -> 0x0330 }
            r0.A19(r5)     // Catch:{ all -> 0x0330 }
            r6.clear()     // Catch:{ all -> 0x0330 }
            java.util.HashSet r0 = r2.A1X     // Catch:{ all -> 0x0330 }
            r0.clear()     // Catch:{ all -> 0x0330 }
        L_0x0321:
            r3.close()     // Catch:{ all -> 0x0337 }
            goto L_0x034b
        L_0x0325:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0330 }
            r0.<init>(r1)     // Catch:{ all -> 0x0330 }
            goto L_0x032f
        L_0x032d:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0330 }
        L_0x032f:
            throw r0     // Catch:{ all -> 0x0330 }
        L_0x0330:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0332 }
        L_0x0332:
            r0 = move-exception
            X.1zE.A00(r3, r1)     // Catch:{ all -> 0x0337 }
            throw r0     // Catch:{ all -> 0x0337 }
        L_0x0337:
            r1 = move-exception
            X.Mi9 r0 = r2.A0u()
            X.34p r0 = r0.A07
            r0.A05()
            X.Mgq r0 = X.C66633Ma2.A04(r2)
            X.34p r0 = r0.A04
            r0.A05()
            throw r1
        L_0x034b:
            X.Mi9 r0 = r2.A0u()
            X.34p r0 = r0.A07
            r0.A05()
            X.Mgq r0 = X.C66633Ma2.A04(r2)
            X.34p r0 = r0.A04
            r0.A05()
        L_0x035d:
            X.38U r0 = r10.A07
            if (r0 == 0) goto L_0x0364
            r0.A01()
        L_0x0364:
            r0 = 0
            r10.A0L = r0
        L_0x0367:
            com.instagram.common.session.UserSession r0 = A01(r10)
            boolean r0 = X.AnonymousClass72B.A01(r0)
            if (r0 == 0) goto L_0x037c
            com.instagram.common.session.UserSession r0 = A01(r10)
            X.72C r0 = X.AnonymousClass72B.A00(r0)
            r0.A00()
        L_0x037c:
            X.Ma2 r5 = r10.A05
            if (r5 == 0) goto L_0x041a
            java.lang.String r0 = "DirectInboxController.onViewExitFromScreen"
            X.0lp r4 = X.0lq.A00(r0)
            boolean r0 = r5.A15     // Catch:{ all -> 0x0410 }
            if (r0 == 0) goto L_0x03de
            com.instagram.common.session.UserSession r0 = r5.A0p()     // Catch:{ all -> 0x0410 }
            X.2De r2 = X.2Dd.A00(r0)     // Catch:{ all -> 0x0410 }
            X.0eM r3 = r5.A2O     // Catch:{ all -> 0x0410 }
            java.lang.Object r1 = r3.getValue()     // Catch:{ all -> 0x0410 }
            X.MlE r1 = (X.C67279MlE) r1     // Catch:{ all -> 0x0410 }
            r0 = 0
            X.0qQ.A0B(r1, r0)     // Catch:{ all -> 0x0410 }
            java.util.List r0 = r2.A00     // Catch:{ all -> 0x0410 }
            r0.remove(r1)     // Catch:{ all -> 0x0410 }
            X.0eM r0 = r5.A22     // Catch:{ all -> 0x0410 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x0410 }
            X.1Ng r2 = (X.1Ng) r2     // Catch:{ all -> 0x0410 }
            java.lang.Class<X.3EK> r1 = X.AnonymousClass3EK.class
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x0410 }
            X.MlE r0 = (X.C67279MlE) r0     // Catch:{ all -> 0x0410 }
            r2.A02(r0, r1)     // Catch:{ all -> 0x0410 }
            X.OCG r2 = r5.A0i     // Catch:{ all -> 0x0410 }
            if (r2 == 0) goto L_0x03ca
            android.view.View r1 = r2.A00     // Catch:{ all -> 0x0410 }
            if (r1 == 0) goto L_0x03ca
            java.lang.Runnable r0 = r2.A01     // Catch:{ all -> 0x0410 }
            if (r0 == 0) goto L_0x03ca
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x0410 }
            r0 = 0
            r2.A00 = r0     // Catch:{ all -> 0x0410 }
            r2.A01 = r0     // Catch:{ all -> 0x0410 }
        L_0x03ca:
            X.OCH r2 = r5.A0j     // Catch:{ all -> 0x0410 }
            if (r2 == 0) goto L_0x03de
            android.view.View r1 = r2.A00     // Catch:{ all -> 0x0410 }
            if (r1 == 0) goto L_0x03de
            java.lang.Runnable r0 = r2.A01     // Catch:{ all -> 0x0410 }
            if (r0 == 0) goto L_0x03de
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x0410 }
            r0 = 0
            r2.A00 = r0     // Catch:{ all -> 0x0410 }
            r2.A01 = r0     // Catch:{ all -> 0x0410 }
        L_0x03de:
            r5.A0y()     // Catch:{ all -> 0x0410 }
            com.instagram.common.session.UserSession r0 = r5.A0p()     // Catch:{ all -> 0x0410 }
            X.1Av r0 = X.1Au.A00(r0)     // Catch:{ all -> 0x0410 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0410 }
            X.0xa r0 = r0.A01     // Catch:{ all -> 0x0410 }
            X.0xY r1 = r0.AR4()     // Catch:{ all -> 0x0410 }
            java.lang.String r0 = "direct_tab_tooltip_timestamp_ms"
            r1.E5c(r0, r2)     // Catch:{ all -> 0x0410 }
            r1.apply()     // Catch:{ all -> 0x0410 }
            X.Dc2 r2 = r5.A0m     // Catch:{ all -> 0x0410 }
            if (r2 == 0) goto L_0x0409
            X.1xC r1 = X.1xC.A01     // Catch:{ all -> 0x0410 }
            X.3GR r0 = new X.3GR     // Catch:{ all -> 0x0410 }
            r0.<init>(r2)     // Catch:{ all -> 0x0410 }
            r1.A00(r0)     // Catch:{ all -> 0x0410 }
        L_0x0409:
            r0 = 0
            r5.A0m = r0     // Catch:{ all -> 0x0410 }
            r0 = 0
            r5.A15 = r0     // Catch:{ all -> 0x0410 }
            goto L_0x0417
        L_0x0410:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0412 }
        L_0x0412:
            r1 = move-exception
            X.1zE.A00(r4, r0)
            throw r1
        L_0x0417:
            r4.close()
        L_0x041a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273624mt.A03():void");
    }

    public static final void A04(C273624mt r4) {
        1Wj r3 = 1Wj.A00;
        GVI gvi = r4.A0I;
        if (gvi != null) {
            gvi.A00();
        }
        r4.A0I = null;
        if (r3 != null) {
            r3.A03(A01(r4), r4.getActivity(), "1170372060962789");
        }
    }

    private final boolean A06() {
        if (this.A0C == null || A00() == 1.0f) {
            return true;
        }
        return false;
    }

    public final 2dZ AYJ() {
        C66934MfT mfT = this.A02;
        if (mfT != null) {
            return mfT.A00;
        }
        return null;
    }

    public final GO6 Av1() {
        return null;
    }

    public final AnonymousClass4DJ B7u() {
        return this;
    }

    public final /* synthetic */ double BaQ() {
        return 0.0d;
    }

    public final /* synthetic */ boolean BuP() {
        return false;
    }

    public final boolean Ccw(MotionEvent motionEvent) {
        return "direct_inbox".equals(1Rm.A00().A00);
    }

    public final void DFX(View view) {
        C66633Ma2 ma2 = this.A05;
        if (ma2 != null) {
            ma2.A0A = view;
            ((C230882qT) ma2.A2V.getValue()).A00(view, QPTooltipAnchor.INBOX_FILTER_ICON, (2bu) ma2.A2U.getValue());
            C66633Ma2.A0N(ma2);
        }
    }

    public final void DS0() {
        C66633Ma2 ma2 = this.A05;
        if (ma2 != null) {
            0wc r3 = (0wc) ma2.A2r.getValue();
            0qQ.A0B(r3, 0);
            C48798EkM.A00(r3, new GLV(1, 13));
        }
    }

    public final void DSB() {
        if (this.mView == null) {
            0wb.A03("ModalListener#DirectInboxController", "Modal fragment closed while view does not exist");
        } else if (!C378789Rf.A00(A01(this))) {
            A02();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (r1 == X.AnonymousClass05K.A0C) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dhr() {
        /*
            r10 = this;
            X.Ma2 r1 = r10.A05
            if (r1 == 0) goto L_0x001a
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C66633Ma2.A0Y(r1, r0)
            X.C66633Ma2.A0X(r1, r0)
            X.0ng r1 = r1.A0Y
            if (r1 == 0) goto L_0x001a
            X.0no r0 = X.0no.A00()
            r0.A02(r1)
        L_0x001a:
            com.instagram.common.session.UserSession r7 = A01(r10)
            java.lang.Class<com.instagram.modal.ModalActivity> r8 = com.instagram.modal.ModalActivity.class
            X.Ma2 r2 = r10.A05
            if (r2 == 0) goto L_0x008d
            java.lang.Integer r1 = r10.A0D
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x002f
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r3 = 0
            if (r1 != r0) goto L_0x0030
        L_0x002f:
            r3 = 1
        L_0x0030:
            r4 = 0
            X.0eM r1 = r2.A1t
            java.lang.Object r0 = r1.getValue()
            X.MiF r0 = (X.C67095MiF) r0
            java.lang.String r5 = r0.A01
            java.lang.Object r0 = r1.getValue()
            X.MiF r0 = (X.C67095MiF) r0
            com.instagram.model.direct.DirectThreadKey r2 = r0.A00
            r1 = 0
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r0 = 218(0xda, float:3.05E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r6.putParcelable(r0, r1)
            java.lang.String r0 = "DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_SESSION_ID"
            r6.putString(r0, r5)
            com.facebook.base.activity.parcel.OpaqueParcelable r1 = X.0B0.A00(r2)
            java.lang.String r0 = "DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_THREAD_KEY"
            r6.putParcelable(r0, r1)
            r0 = 51
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r6.putInt(r0, r4)
            r0 = 506(0x1fa, float:7.09E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r6.putBoolean(r0, r3)
        L_0x0072:
            androidx.fragment.app.FragmentActivity r5 = r10.requireActivity()
            r0 = 2267(0x8db, float:3.177E-42)
            java.lang.String r9 = X.C273654mx.A00(r0)
            X.6W8 r4 = new X.6W8
            r4.<init>(r5, r6, r7, r8, r9)
            int[] r0 = com.instagram.modal.ModalActivity.A08
            r4.A0J = r0
            android.content.Context r0 = r10.requireContext()
            r4.A0C(r0)
            return
        L_0x008d:
            r6 = 0
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273624mt.Dhr():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r4.equals(r2) != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.0jB E4x() {
        /*
            r6 = this;
            X.0jB r5 = new X.0jB
            r5.<init>()
            X.2Zg r0 = r6.A0C
            if (r0 == 0) goto L_0x002c
            X.2bE r0 = r0.C3W()
            java.lang.String r4 = r0.A02
            int r3 = r4.hashCode()
            r0 = -399252132(0xffffffffe833e55c, float:-3.398138E24)
            java.lang.String r2 = "direct_tab_bar"
            java.lang.String r1 = "swipe"
            if (r3 == r0) goto L_0x0035
            r0 = 109854522(0x68c3f3a, float:5.275505E-35)
            if (r3 == r0) goto L_0x002d
            r0 = 286908947(0x1119e213, float:1.2139236E-28)
            if (r3 != r0) goto L_0x002c
            boolean r0 = r4.equals(r2)
            if (r0 != 0) goto L_0x003f
        L_0x002c:
            return r5
        L_0x002d:
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x002c
            r2 = r1
            goto L_0x003f
        L_0x0035:
            java.lang.String r0 = "on_launch_direct_inbox"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x002c
            java.lang.String r2 = "feed_timeline_tap_to_direct_inbox"
        L_0x003f:
            java.lang.String r0 = "click_point"
            r5.A0A(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273624mt.E4x():X.0jB");
    }

    public final void EKl() {
        C238143As r1;
        C66633Ma2 ma2 = this.A05;
        if (ma2 != null && (r1 = ma2.A0n) != null) {
            r1.EKm(ma2.A1J);
        }
    }

    public final void EVp(Bundle bundle) {
        C2611948q r2;
        this.A0E = bundle.getString("filter_type", "all");
        C66633Ma2 ma2 = this.A05;
        if (ma2 != null) {
            String string = bundle.getString("DirectFragment.INBOX_MODE");
            if (string != null) {
                2EM A002 = C67084Mhz.A00(string);
                C67479MoZ moZ = ma2.A0c;
                if (!(moZ == null || A002 == null || !C66633Ma2.A06(ma2).contains(A002))) {
                    moZ.A00(A002);
                }
            }
            String str = this.A0E;
            C67488Moi moi = ma2.A0b;
            if (moi != null) {
                C2611948q[] values = C2611948q.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        r2 = C2611948q.ALL;
                        break;
                    }
                    r2 = values[i];
                    if (00p.A0j(r2.A00, str, true)) {
                        break;
                    }
                    i++;
                }
                moi.A02(C67486Mog.A00(r2));
            }
            String string2 = bundle.getString("DIRECT_SOURCE_MODULE_NAME", (String) null);
            if (string2 != null) {
                C66633Ma2.A04(ma2).A0J("source_module", string2);
            }
        }
    }

    public final /* synthetic */ boolean Erl() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r15v1, types: [X.3Sa, X.3SZ, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014c, code lost:
        X.1zE.A00(r14, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x014f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r17, int r18, android.content.Intent r19) {
        /*
            r16 = this;
            r0 = r16
            r5 = r17
            r4 = r18
            r1 = r19
            super.onActivityResult(r5, r4, r1)
            X.Ma2 r13 = r0.A05
            if (r13 == 0) goto L_0x0032
            java.lang.String r0 = "DirectInboxController.onActivityResult"
            X.0lp r14 = X.0lq.A00(r0)
            r0 = 201(0xc9, float:2.82E-43)
            r3 = -1
            if (r5 == r0) goto L_0x00a8
            r0 = 13366(0x3436, float:1.873E-41)
            if (r5 == r0) goto L_0x0098
            r0 = 62577805(0x3badc8d, float:1.0982733E-36)
            if (r5 == r0) goto L_0x0089
            r0 = 13368(0x3438, float:1.8733E-41)
            r2 = 0
            if (r5 == r0) goto L_0x006b
            r0 = 13369(0x3439, float:1.8734E-41)
            if (r5 == r0) goto L_0x0067
            switch(r17) {
                case 13376: goto L_0x0063;
                case 13377: goto L_0x0033;
                case 13378: goto L_0x004f;
                default: goto L_0x002f;
            }
        L_0x002f:
            r14.close()
        L_0x0032:
            return
        L_0x0033:
            X.36N r4 = r13.A0r     // Catch:{ all -> 0x0149 }
            if (r4 == 0) goto L_0x0047
            X.6oS r3 = X.C318116oQ.A00(r4)     // Catch:{ all -> 0x0149 }
            r2 = 0
            r0 = 6
            X.MFx r1 = new X.MFx     // Catch:{ all -> 0x0149 }
            r1.<init>(r4, r2, r0)     // Catch:{ all -> 0x0149 }
            X.19B r0 = X.19B.A00     // Catch:{ all -> 0x0149 }
            X.1Eo.A05(r0, r1, r3)     // Catch:{ all -> 0x0149 }
        L_0x0047:
            X.36N r0 = r13.A0r     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x002f
            r0.A01()     // Catch:{ all -> 0x0149 }
            goto L_0x002f
        L_0x004f:
            if (r4 != r3) goto L_0x002f
            if (r19 == 0) goto L_0x002f
            r0 = 507(0x1fb, float:7.1E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ all -> 0x0149 }
            boolean r0 = r1.getBooleanExtra(r0, r2)     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x002f
            r0 = 1
            r13.A1D = r0     // Catch:{ all -> 0x0149 }
            goto L_0x002f
        L_0x0063:
            X.C66633Ma2.A0K(r13)     // Catch:{ all -> 0x0149 }
            goto L_0x002f
        L_0x0067:
            X.C66633Ma2.A0L(r13)     // Catch:{ all -> 0x0149 }
            goto L_0x002f
        L_0x006b:
            if (r4 != r3) goto L_0x002f
            if (r19 == 0) goto L_0x002f
            r0 = 509(0x1fd, float:7.13E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ all -> 0x0149 }
            boolean r0 = r1.getBooleanExtra(r0, r2)     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x002f
            X.Pw5 r3 = r13.A0q()     // Catch:{ all -> 0x0149 }
            java.lang.String r2 = "all_folder_refresh"
            X.2EY r1 = X.AnonymousClass2EY.A00     // Catch:{ all -> 0x0149 }
            X.48q r0 = X.C2611948q.ALL     // Catch:{ all -> 0x0149 }
            r3.AUu(r1, r0, r2)     // Catch:{ all -> 0x0149 }
            goto L_0x002f
        L_0x0089:
            r0 = 106183331(0x6543aa3, float:3.9915848E-35)
            if (r4 != r0) goto L_0x002f
            X.4DH r0 = r13.A1J     // Catch:{ all -> 0x0149 }
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()     // Catch:{ all -> 0x0149 }
            r0.onBackPressed()     // Catch:{ all -> 0x0149 }
            goto L_0x002f
        L_0x0098:
            if (r4 != r3) goto L_0x002f
            X.0eM r0 = r13.A1t     // Catch:{ all -> 0x0149 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x0149 }
            X.MiF r1 = (X.C67095MiF) r1     // Catch:{ all -> 0x0149 }
            r0 = 0
            r1.A01 = r0     // Catch:{ all -> 0x0149 }
            r1.A00 = r0     // Catch:{ all -> 0x0149 }
            goto L_0x002f
        L_0x00a8:
            if (r4 != r3) goto L_0x002f
            if (r19 == 0) goto L_0x002f
            java.lang.String r0 = "ClipsConstants.ARG_PLAY_PILE_THREAD_ID"
            java.lang.String r12 = r1.getStringExtra(r0)     // Catch:{ all -> 0x0149 }
            if (r12 == 0) goto L_0x002f
            X.2Dm r0 = r13.A0v()     // Catch:{ all -> 0x0149 }
            X.3U9 r11 = r0.C60(r12)     // Catch:{ all -> 0x0149 }
            if (r11 == 0) goto L_0x002f
            java.lang.String r0 = "ClipsConstants.ARG_PLAY_PILE_SEEN_IDS"
            java.util.ArrayList r10 = r1.getStringArrayListExtra(r0)     // Catch:{ all -> 0x0149 }
            java.lang.String r0 = "ClipsConstants.ARG_PLAY_PILE_SEEN_USER_IDS"
            java.util.ArrayList r9 = r1.getStringArrayListExtra(r0)     // Catch:{ all -> 0x0149 }
            java.lang.String r0 = "ClipsConstants.ARG_PLAY_PILE_SEEN_CLIENT_CONTEXTS"
            java.util.ArrayList r8 = r1.getStringArrayListExtra(r0)     // Catch:{ all -> 0x0149 }
            if (r10 == 0) goto L_0x002f
            if (r9 == 0) goto L_0x002f
            if (r8 == 0) goto L_0x002f
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0149 }
            r7.<init>()     // Catch:{ all -> 0x0149 }
            r6 = 0
            int r5 = r10.size()     // Catch:{ all -> 0x0149 }
        L_0x00e0:
            if (r6 >= r5) goto L_0x0115
            java.lang.Object r4 = r10.get(r6)     // Catch:{ all -> 0x0149 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0149 }
            java.lang.Object r3 = r8.get(r6)     // Catch:{ all -> 0x0149 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0149 }
            r2 = 0
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0149 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0149 }
            long r0 = r15.toMicros(r0)     // Catch:{ all -> 0x0149 }
            X.3SZ r15 = new X.3SZ     // Catch:{ all -> 0x0149 }
            r15.<init>()     // Catch:{ all -> 0x0149 }
            r15.A04 = r12     // Catch:{ all -> 0x0149 }
            r4.getClass()     // Catch:{ all -> 0x0149 }
            r15.A02 = r4     // Catch:{ all -> 0x0149 }
            r15.A03 = r2     // Catch:{ all -> 0x0149 }
            r15.A01 = r3     // Catch:{ all -> 0x0149 }
            r15.A00 = r0     // Catch:{ all -> 0x0149 }
            r15.A02 = r2     // Catch:{ all -> 0x0149 }
            r15.A01 = r2     // Catch:{ all -> 0x0149 }
            r7.add(r15)     // Catch:{ all -> 0x0149 }
            int r6 = r6 + 1
            goto L_0x00e0
        L_0x0115:
            X.2Dm r6 = r13.A0v()     // Catch:{ all -> 0x0149 }
            X.2Dr r6 = (X.2Dr) r6     // Catch:{ all -> 0x0149 }
            monitor-enter(r6)     // Catch:{ all -> 0x0149 }
            com.instagram.common.session.UserSession r0 = r6.A0A     // Catch:{ all -> 0x0146 }
            java.lang.String r5 = r0.A06     // Catch:{ all -> 0x0146 }
            int r4 = r7.size()     // Catch:{ all -> 0x0146 }
            r3 = 0
        L_0x0125:
            if (r3 >= r4) goto L_0x0140
            X.3U9 r2 = X.2Dr.A00(r11, r6)     // Catch:{ all -> 0x0146 }
            java.lang.Object r1 = r7.get(r3)     // Catch:{ all -> 0x0146 }
            X.3SZ r1 = (X.AnonymousClass3SZ) r1     // Catch:{ all -> 0x0146 }
            java.lang.Object r0 = r9.get(r3)     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0146 }
            boolean r0 = r2.A0O(r1, r5, r0)     // Catch:{ all -> 0x0146 }
            if (r0 == 0) goto L_0x0143
            int r3 = r3 + 1
            goto L_0x0125
        L_0x0140:
            X.2Dr.A0A(r11, r6)     // Catch:{ all -> 0x0146 }
        L_0x0143:
            monitor-exit(r6)     // Catch:{ all -> 0x0149 }
            goto L_0x002f
        L_0x0146:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0149 }
            throw r0     // Catch:{ all -> 0x0149 }
        L_0x0149:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x014b }
        L_0x014b:
            r0 = move-exception
            X.1zE.A00(r14, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273624mt.onActivityResult(int, int, android.content.Intent):void");
    }

    public C273624mt() {
        AnonymousClass9LO r6 = new AnonymousClass9LO(this, 14);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LO(new AnonymousClass9LO(this, 11), 12));
        this.A0O = new C227862kA(new AnonymousClass9LO(A002, 13), r6, new AnonymousClass9M3(12, A002, (Object) null), new 0Yh(C67710MtP.class));
        this.A0P = 2000;
        this.A0N = new DcB(this);
        this.A0M = new C67088Mi6(this);
    }

    public final TouchInterceptorFrameLayout C8v() {
        TouchInterceptorFrameLayout requireViewById = requireView().requireViewById(R.id.container);
        0qQ.A07(requireViewById);
        return requireViewById;
    }

    public final void DSC() {
        if (!C378789Rf.A00(A01(this))) {
            A03();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b5, code lost:
        if (r1.Cda() == false) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DV0(X.C71162bE r8) {
        /*
            r7 = this;
            r0 = -834039538(0xffffffffce49910e, float:-8.4543168E8)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.2Zg r0 = r7.A0C
            r5 = 0
            if (r0 == 0) goto L_0x0026
            java.lang.String r2 = "Required value was null."
            X.2bE r0 = r0.C3W()
            float r1 = r0.A01
            X.2Zg r0 = r7.A0C
            if (r0 == 0) goto L_0x0115
            X.2a4 r0 = r0.Apn()
            float r1 = r0.A00(r1)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0026
            r5 = 1
        L_0x0026:
            r4 = 0
            if (r5 == 0) goto L_0x0061
            boolean r0 = r7.A0L
            if (r0 == 0) goto L_0x0041
            X.Ma2 r0 = r7.A05
            if (r0 == 0) goto L_0x003e
            X.0eM r0 = r0.A1t
            java.lang.Object r1 = r0.getValue()
            X.MiF r1 = (X.C67095MiF) r1
            r0 = 0
            r1.A01 = r0
            r1.A00 = r0
        L_0x003e:
            r7.A03()
        L_0x0041:
            boolean r0 = r7.A0J
            if (r0 == 0) goto L_0x0052
            X.Ma2 r0 = r7.A05
            if (r0 == 0) goto L_0x0050
            X.Mgq r0 = X.C66633Ma2.A04(r0)
            r0.A08()
        L_0x0050:
            r7.A0J = r4
        L_0x0052:
            r7.A0K = r4
            X.Ma2 r0 = r7.A05
            if (r0 == 0) goto L_0x005a
            r0.A1B = r4
        L_0x005a:
            r0 = 54801897(0x34435e9, float:5.766111E-37)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x0061:
            X.Ma2 r1 = r7.A05
            if (r1 == 0) goto L_0x00c2
            android.view.View r6 = r7.requireView()
            X.4DH r0 = r1.A1J
            androidx.fragment.app.FragmentActivity r5 = r0.getActivity()
            if (r5 == 0) goto L_0x00c2
            com.instagram.common.session.UserSession r0 = r1.A0p()
            boolean r0 = X.2bA.A07(r0)
            if (r0 == 0) goto L_0x00c2
            X.0hq r1 = r5.getSupportFragmentManager()
            if (r1 == 0) goto L_0x00c2
            r0 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            androidx.fragment.app.Fragment r0 = r1.A0P(r0)
            if (r0 == 0) goto L_0x00c2
            X.0hq r0 = r0.getChildFragmentManager()
            if (r0 == 0) goto L_0x00c2
            X.06j r0 = r0.A0U
            java.util.List r1 = r0.A04()
            if (r1 == 0) goto L_0x00c2
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00c2
            java.lang.Object r1 = r1.get(r4)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L_0x00b7
            boolean r0 = r1 instanceof X.C227292iy
            if (r0 == 0) goto L_0x00b7
            boolean r0 = r1 instanceof X.AnonymousClass32L
            if (r0 == 0) goto L_0x00b7
            X.2iy r1 = (X.C227292iy) r1
            boolean r0 = r1.Cda()
            r2 = 1
            if (r0 != 0) goto L_0x00b8
        L_0x00b7:
            r2 = 0
        L_0x00b8:
            X.2ff r1 = X.C226112fe.A0B
            X.WfO r0 = new X.WfO
            r0.<init>(r6, r2)
            r1.A04(r5, r0, r4)
        L_0x00c2:
            com.instagram.common.session.UserSession r5 = A01(r7)
            X.0Tu r2 = X.0Tu.A05
            r0 = 37166997714174398(0x840b30001f01be, double:3.567897241706622E-306)
            double r0 = X.182.A00(r2, r5, r0)
            float r2 = (float) r0
            boolean r0 = r7.A0K
            r1 = 1
            if (r0 != 0) goto L_0x00e4
            float r0 = r7.A00()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x00e4
            r7.A0K = r1
            r7.A02()
        L_0x00e4:
            boolean r0 = r7.A06()
            if (r0 == 0) goto L_0x0103
            boolean r0 = r7.A0J
            if (r0 == 0) goto L_0x00fb
            X.Ma2 r0 = r7.A05
            if (r0 == 0) goto L_0x00f9
            X.Mgq r0 = X.C66633Ma2.A04(r0)
            r0.A0N()
        L_0x00f9:
            r7.A0J = r4
        L_0x00fb:
            X.Ma2 r0 = r7.A05
            if (r0 == 0) goto L_0x005a
            r0.A1B = r1
            goto L_0x005a
        L_0x0103:
            boolean r0 = r7.A0L
            if (r0 != 0) goto L_0x00fb
            boolean r0 = r7.A0J
            if (r0 != 0) goto L_0x00fb
            X.Ma2 r0 = r7.A05
            if (r0 == 0) goto L_0x0112
            r0.A12()
        L_0x0112:
            r7.A0J = r1
            goto L_0x00fb
        L_0x0115:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273624mt.DV0(X.2bE):void");
    }

    public final AnonymousClass0wW getSession() {
        return A01(this);
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(189549689);
        C66633Ma2 ma2 = this.A05;
        if (ma2 != null) {
            UserSession A0p = ma2.A0p();
            0qQ.A0B(A0p, 0);
            C63725L4j l4j = (C63725L4j) A0p.A01(C63725L4j.class, new MML(A0p, 3));
            boolean z = false;
            if (((C74503Pvy) ma2.A1h.getValue()).C6W().CBm() > 0) {
                z = true;
            }
            l4j.A00 = z;
        }
        AnonymousClass0fD.A0A(180313075, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(-1213796274, AnonymousClass0fD.A03(17317601));
    }

    public final boolean onBackPressed() {
        Bundle bundle;
        C67488Moi moi;
        UserSession A012 = A01(this);
        0Tu r4 = 0Tu.A05;
        boolean A062 = 182.A06(r4, A012, 36317766713611775L);
        if (this.A0I != null) {
            A04(this);
        }
        if (A06()) {
            C66633Ma2 ma2 = this.A05;
            if (ma2 != null) {
                if (!2El.A0H(ma2.A0p()) && (moi = ma2.A0b) != null) {
                    moi.A02(C67304Mle.A05);
                }
                OLL oll = ma2.A0I;
                if (oll != null) {
                    oll.A00();
                }
                C228312lJ r0 = ma2.A1R;
                if (r0 != null) {
                    r0.onPause();
                }
            }
            C67263Mkx mkx = this.A06;
            if (mkx != null && A062) {
                C67263Mkx.A07(mkx, false);
            }
        }
        C67263Mkx mkx2 = this.A06;
        if (mkx2 != null && !A062) {
            C67263Mkx.A07(mkx2, false);
        }
        2aN.A00(A01(this)).A00().A00.AHZ();
        UserSession A013 = A01(this);
        0qQ.A0B(A013, 0);
        if (182.A06(r4, A013, 36320416709222805L) && (bundle = this.mArguments) != null && bundle.getString("jl_hash") != null && bundle.getString("di_id") != null && bundle.getBoolean(C66579MXk.A00(263)) && getParentFragmentManager().A0M() == 0) {
            0kR.A0B(requireContext(), AnonymousClass14B.A00().A02(requireContext(), 335544320));
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.2qU] */
    /* JADX WARNING: type inference failed for: r23v4, types: [X.0sa] */
    /* JADX WARNING: type inference failed for: r24v3, types: [X.0sa] */
    /* JADX WARNING: type inference failed for: r24v4, types: [X.0sa] */
    /* JADX WARNING: type inference failed for: r25v2, types: [X.0sa] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x009d, code lost:
        if (X.2El.A0N(A01(r2), false) != false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x06fc, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:?, code lost:
        X.1zE.A00(r19, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0702, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e1, code lost:
        if (r5.getBoolean("direct_inbox_fragment_is_main_tab") != true) goto L_0x00e3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r34) {
        /*
            r33 = this;
            r0 = -1129923(0xffffffffffeec23d, float:NaN)
            int r18 = X.AnonymousClass0fD.A02(r0)
            r2 = r33
            r3 = r34
            X.C273624mt.super.onCreate(r3)
            com.instagram.common.session.UserSession r1 = A01(r2)     // Catch:{ all -> 0x0703 }
            r10 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x0703 }
            X.Mi7 r0 = X.C67089Mi7.A00(r1, r0)     // Catch:{ all -> 0x0703 }
            r2.A08 = r0     // Catch:{ all -> 0x0703 }
            com.instagram.common.session.UserSession r0 = A01(r2)     // Catch:{ all -> 0x0703 }
            X.1Ng r0 = X.AnonymousClass1Nd.A00(r0)     // Catch:{ all -> 0x0703 }
            r2.A00 = r0     // Catch:{ all -> 0x0703 }
            java.lang.String r1 = "DirectInboxFragment.onCreate"
            r0 = -2013617034(0xffffffff87faa476, float:-3.771248E-34)
            X.0fh.A01(r1, r0)     // Catch:{ all -> 0x0703 }
            X.1Ng r4 = r2.A00     // Catch:{ all -> 0x0703 }
            if (r4 == 0) goto L_0x003a
            java.lang.Class<X.2Cy> r1 = X.2Cy.class
            X.DcB r0 = r2.A0N     // Catch:{ all -> 0x0703 }
            r4.A01(r0, r1)     // Catch:{ all -> 0x0703 }
        L_0x003a:
            X.AnonymousClass2bO.A00()     // Catch:{ all -> 0x0703 }
            X.2qU r0 = new X.2qU     // Catch:{ all -> 0x0703 }
            r0.<init>()     // Catch:{ all -> 0x0703 }
            r2.A0B = r0     // Catch:{ all -> 0x0703 }
            X.1YN r4 = X.AnonymousClass2bO.A00()     // Catch:{ all -> 0x0703 }
            com.instagram.common.session.UserSession r7 = A01(r2)     // Catch:{ all -> 0x0703 }
            com.instagram.quickpromotion.intf.QuickPromotionSlot r9 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0J     // Catch:{ all -> 0x0703 }
            X.AnonymousClass2bO.A00()     // Catch:{ all -> 0x0703 }
            r15 = 0
            X.Dft r0 = new X.Dft     // Catch:{ all -> 0x0703 }
            r0.<init>(r2)     // Catch:{ all -> 0x0703 }
            r19 = r0
            r20 = r15
            r21 = r15
            r22 = r15
            r23 = r15
            r24 = r15
            r25 = r15
            r26 = r15
            r27 = r15
            r28 = r15
            r29 = r15
            r30 = r15
            r31 = r15
            X.2bW r8 = X.2bV.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x0703 }
            r5 = r2
            r6 = r2
            X.2qi r0 = r4.A01(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0703 }
            r2.A0A = r0     // Catch:{ all -> 0x0703 }
            com.instagram.common.session.UserSession r0 = A01(r2)     // Catch:{ all -> 0x0703 }
            boolean r0 = X.2El.A0G(r0)     // Catch:{ all -> 0x0703 }
            r32 = 0
            if (r0 != 0) goto L_0x00a1
            com.instagram.common.session.UserSession r0 = A01(r2)     // Catch:{ all -> 0x0703 }
            boolean r0 = X.2El.A0C(r0)     // Catch:{ all -> 0x0703 }
            if (r0 != 0) goto L_0x009f
            com.instagram.common.session.UserSession r0 = A01(r2)     // Catch:{ all -> 0x0703 }
            boolean r0 = X.2El.A0N(r0, r10)     // Catch:{ all -> 0x0703 }
            r32 = 1
            if (r0 == 0) goto L_0x00a1
        L_0x009f:
            r32 = 2
        L_0x00a1:
            android.os.Bundle r5 = r2.mArguments     // Catch:{ all -> 0x0703 }
            if (r5 == 0) goto L_0x00c6
            com.instagram.common.session.UserSession r0 = A01(r2)     // Catch:{ all -> 0x0703 }
            boolean r0 = com.instagram.direct.lockedchat.LockedChatKillSwitch.isLockedChatEnabled(r0, r10)     // Catch:{ all -> 0x0703 }
            if (r0 == 0) goto L_0x00c6
            java.lang.String r1 = "DirectFragment.INITIAL_MODE"
            java.lang.String r0 = "null"
            java.lang.String r1 = r5.getString(r1, r0)     // Catch:{ all -> 0x0703 }
            X.MkK r0 = X.C67224MkK.A00     // Catch:{ all -> 0x0703 }
            java.lang.String r0 = r0.A04     // Catch:{ all -> 0x0703 }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x0703 }
            if (r0 == 0) goto L_0x00c6
        L_0x00c1:
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0703 }
        L_0x00c3:
            r2.A0D = r0     // Catch:{ all -> 0x0703 }
            goto L_0x00d7
        L_0x00c6:
            com.instagram.common.session.UserSession r0 = A01(r2)     // Catch:{ all -> 0x0703 }
            X.2HN r0 = X.2HM.A00(r0)     // Catch:{ all -> 0x0703 }
            boolean r0 = r0.A03()     // Catch:{ all -> 0x0703 }
            if (r0 == 0) goto L_0x00c1
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0703 }
            goto L_0x00c3
        L_0x00d7:
            r4 = 1
            if (r5 == 0) goto L_0x00e3
            java.lang.String r0 = "direct_inbox_fragment_is_main_tab"
            boolean r1 = r5.getBoolean(r0)     // Catch:{ all -> 0x0703 }
            r0 = 1
            if (r1 == r4) goto L_0x00e4
        L_0x00e3:
            r0 = 0
        L_0x00e4:
            r2.A0F = r0     // Catch:{ all -> 0x0703 }
            if (r5 == 0) goto L_0x00ee
            java.lang.String r0 = "DirectFragment.TRIGGER_ACTION"
            java.lang.String r31 = r5.getString(r0)     // Catch:{ all -> 0x0703 }
        L_0x00ee:
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION     // Catch:{ all -> 0x0703 }
            android.content.Context r0 = r2.requireContext()     // Catch:{ all -> 0x0703 }
            android.content.Context r20 = r0.getApplicationContext()     // Catch:{ all -> 0x0703 }
            X.0qQ.A07(r20)     // Catch:{ all -> 0x0703 }
            java.lang.String r7 = "direct_inbox"
            com.instagram.common.session.UserSession r22 = A01(r2)     // Catch:{ all -> 0x0703 }
            A01(r2)     // Catch:{ all -> 0x0703 }
            X.02m r21 = X.02m.A0p     // Catch:{ all -> 0x0703 }
            X.0qQ.A07(r21)     // Catch:{ all -> 0x0703 }
            r24 = 498992870(0x1dbe06e6, float:5.0299714E-21)
            X.2lJ r0 = new X.2lJ     // Catch:{ all -> 0x0703 }
            r19 = r0
            r23 = r7
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0703 }
            r2.A09 = r0     // Catch:{ all -> 0x0703 }
            X.4fh r0 = X.C318146oT.A01     // Catch:{ all -> 0x0703 }
            X.1a8 r8 = new X.1a8     // Catch:{ all -> 0x0703 }
            r8.<init>(r0)     // Catch:{ all -> 0x0703 }
            com.instagram.common.session.UserSession r6 = A01(r2)     // Catch:{ all -> 0x0703 }
            X.0qQ.A0B(r6, r10)     // Catch:{ all -> 0x0703 }
            X.0Tu r11 = X.0Tu.A05     // Catch:{ all -> 0x0703 }
            r0 = 36327576419121683(0x810fbd00033a13, double:3.0370438346370343E-306)
            boolean r0 = X.182.A06(r11, r6, r0)     // Catch:{ all -> 0x0703 }
            X.C66633Ma2.A2z = r0     // Catch:{ all -> 0x0703 }
            java.lang.String r13 = r2.A0E     // Catch:{ all -> 0x0703 }
            java.lang.Integer r12 = r2.A0D     // Catch:{ all -> 0x0703 }
            X.2lJ r9 = r2.A09     // Catch:{ all -> 0x0703 }
            X.Mi7 r1 = r2.A08     // Catch:{ all -> 0x0703 }
            if (r1 != 0) goto L_0x0146
            java.lang.String r0 = "directOmnipickerLogger"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x0703 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x0703 }
            throw r0     // Catch:{ all -> 0x0703 }
        L_0x0146:
            X.Mi6 r0 = r2.A0M     // Catch:{ all -> 0x0703 }
            X.Ma2 r6 = new X.Ma2     // Catch:{ all -> 0x0703 }
            r19 = r6
            r20 = r2
            r21 = r8
            r22 = r0
            r23 = r2
            r24 = r1
            r25 = r2
            r26 = r2
            r27 = r9
            r28 = r2
            r29 = r12
            r30 = r13
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x0703 }
            X.Mi9 r0 = r6.A0u()     // Catch:{ all -> 0x0703 }
            X.34p r0 = r0.A02     // Catch:{ all -> 0x0703 }
            r0.A08(r15)     // Catch:{ all -> 0x0703 }
            java.lang.String r0 = "DirectInboxController.onCreate"
            X.0lp r19 = X.0lq.A00(r0)     // Catch:{ all -> 0x0703 }
            X.0wX r0 = X.C61170le.A00     // Catch:{ all -> 0x06fa }
            X.18g r8 = X.C638918c.A01(r0)     // Catch:{ all -> 0x06fa }
            X.0eM r1 = r6.A2i     // Catch:{ all -> 0x06fa }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x06fa }
            X.MiE r0 = (X.C67094MiE) r0     // Catch:{ all -> 0x06fa }
            r8.A0R(r0)     // Catch:{ all -> 0x06fa }
            java.lang.Object r8 = r1.getValue()     // Catch:{ all -> 0x06fa }
            X.MiE r8 = (X.C67094MiE) r8     // Catch:{ all -> 0x06fa }
            java.lang.String r1 = "DIRECT_INBOX_CREATED"
            X.0rq r0 = r8.A00     // Catch:{ all -> 0x06fa }
            if (r0 != 0) goto L_0x019b
            X.18g r0 = r8.A01     // Catch:{ all -> 0x06fa }
            X.1Gq r0 = r0.A0C()     // Catch:{ all -> 0x06fa }
            X.02m r0 = X.1Gq.A00(r0)     // Catch:{ all -> 0x06fa }
        L_0x019b:
            X.18g r9 = r8.A01     // Catch:{ all -> 0x06fa }
            r9.A0M(r0, r8, r1)     // Catch:{ all -> 0x06fa }
            X.Mgq r0 = X.C66633Ma2.A04(r6)     // Catch:{ all -> 0x06fa }
            X.34p r0 = r0.A02     // Catch:{ all -> 0x06fa }
            r0.A08(r15)     // Catch:{ all -> 0x06fa }
            boolean r0 = r6.A2x     // Catch:{ all -> 0x06fa }
            r20 = r0
            if (r0 == 0) goto L_0x01c1
            X.0eM r0 = r6.A1l     // Catch:{ all -> 0x06fa }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06fa }
            X.MpW r0 = (X.C67537MpW) r0     // Catch:{ all -> 0x06fa }
            X.02m r8 = r0.A01     // Catch:{ all -> 0x06fa }
            r1 = 31797299(0x1e53033, float:8.4190477E-38)
            java.lang.String r0 = "inbox_oncreate"
            r8.markerPoint(r1, r0)     // Catch:{ all -> 0x06fa }
        L_0x01c1:
            X.0eM r0 = r6.A1d     // Catch:{ all -> 0x06fa }
            java.lang.Object r8 = r0.getValue()     // Catch:{ all -> 0x06fa }
            X.72D r8 = (X.AnonymousClass72D) r8     // Catch:{ all -> 0x06fa }
            com.instagram.common.session.UserSession r9 = r8.A03     // Catch:{ all -> 0x06fa }
            X.1Av r0 = X.1Au.A00(r9)     // Catch:{ all -> 0x06fa }
            boolean r0 = r0.A21()     // Catch:{ all -> 0x06fa }
            if (r0 == 0) goto L_0x01fd
            r0 = 36314034388011386(0x81036c000f097a, double:3.0284797996335E-306)
            boolean r0 = X.182.A06(r11, r9, r0)     // Catch:{ all -> 0x06fa }
            if (r0 == 0) goto L_0x01fd
            long r0 = r8.A01     // Catch:{ all -> 0x06fa }
            r12 = 0
            int r9 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x01eb
            r8.A00()     // Catch:{ all -> 0x06fa }
        L_0x01eb:
            X.1QP r9 = r8.A02     // Catch:{ all -> 0x06fa }
            r1 = 639238145(0x261a0001, float:5.342949E-16)
            java.lang.String r0 = "direct_active_now_tray"
            long r0 = r9.flowStartForMarker(r1, r0, r4)     // Catch:{ all -> 0x06fa }
            r8.A01 = r0     // Catch:{ all -> 0x06fa }
            java.lang.String r4 = "navigation_start"
            r9.flowMarkPoint(r0, r4)     // Catch:{ all -> 0x06fa }
        L_0x01fd:
            com.instagram.common.session.UserSession r0 = r6.A0p()     // Catch:{ all -> 0x06fa }
            X.0qQ.A0B(r0, r10)     // Catch:{ all -> 0x06fa }
            X.2DU r0 = X.2DU.A00(r0)     // Catch:{ all -> 0x06fa }
            r0.A09(r7)     // Catch:{ all -> 0x06fa }
            X.Mi8 r7 = X.C66633Ma2.A30     // Catch:{ all -> 0x06fa }
            X.0eM r0 = r6.A2H     // Catch:{ all -> 0x06fa }
            r7.A01(r0)     // Catch:{ all -> 0x06fa }
            X.0eM r0 = r6.A23     // Catch:{ all -> 0x06fa }
            r7.A01(r0)     // Catch:{ all -> 0x06fa }
            X.0eM r0 = r6.A2n     // Catch:{ all -> 0x06fa }
            r7.A01(r0)     // Catch:{ all -> 0x06fa }
            X.0eM r0 = r6.A2q     // Catch:{ all -> 0x06fa }
            r7.A01(r0)     // Catch:{ all -> 0x06fa }
            X.0eM r0 = r6.A2r     // Catch:{ all -> 0x06fa }
            r7.A01(r0)     // Catch:{ all -> 0x06fa }
            com.instagram.common.session.UserSession r0 = r6.A0p()     // Catch:{ all -> 0x06fa }
            boolean r0 = X.2El.A0G(r0)     // Catch:{ all -> 0x06fa }
            if (r0 == 0) goto L_0x023b
            com.instagram.common.session.UserSession r1 = r6.A0p()     // Catch:{ all -> 0x06fa }
            X.OF6 r0 = new X.OF6     // Catch:{ all -> 0x06fa }
            r0.<init>(r1)     // Catch:{ all -> 0x06fa }
            r6.A0e = r0     // Catch:{ all -> 0x06fa }
        L_0x023b:
            X.0eM r0 = X.C67206Mk2.A00     // Catch:{ all -> 0x06fa }
            r0.getValue()     // Catch:{ all -> 0x06fa }
            X.4DH r14 = r6.A1J     // Catch:{ all -> 0x06fa }
            r1 = 37
            X.PmE r0 = new X.PmE     // Catch:{ all -> 0x06fa }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x06fa }
            X.0hq r4 = r14.getParentFragmentManager()     // Catch:{ all -> 0x06fa }
            X.9SH r1 = new X.9SH     // Catch:{ all -> 0x06fa }
            r1.<init>(r0)     // Catch:{ all -> 0x06fa }
            java.lang.String r0 = "direct_thread_exit_request_key"
            r4.A0v(r1, r14, r0)     // Catch:{ all -> 0x06fa }
            java.lang.Integer r13 = r6.A1T     // Catch:{ all -> 0x06fa }
            java.lang.Integer r12 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x06fa }
            java.lang.String r4 = "ig_advanced_crypto_transport"
            java.lang.String r1 = "ig_django"
            X.0i1 r0 = X.AnonymousClass0LO.A9x     // Catch:{ all -> 0x06fa }
            if (r13 != r12) goto L_0x0264
            r4 = r1
        L_0x0264:
            X.0LA.A05(r0, r4)     // Catch:{ all -> 0x06fa }
            X.0eM r0 = r6.A2t     // Catch:{ all -> 0x06fa }
            r23 = r0
            r7.A01(r0)     // Catch:{ all -> 0x06fa }
            if (r34 == 0) goto L_0x02a1
            X.0eM r0 = r6.A1t     // Catch:{ all -> 0x06fa }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x06fa }
            X.MiF r1 = (X.C67095MiF) r1     // Catch:{ all -> 0x06fa }
            java.lang.String r0 = "DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_SESSION_ID"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x06fa }
            r1.A01 = r0     // Catch:{ all -> 0x06fa }
            java.lang.String r0 = "DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_THREAD_KEY"
            android.os.Parcelable r0 = r3.getParcelable(r0)     // Catch:{ all -> 0x06fa }
            com.instagram.model.direct.DirectThreadKey r0 = (com.instagram.model.direct.DirectThreadKey) r0     // Catch:{ all -> 0x06fa }
            r1.A00 = r0     // Catch:{ all -> 0x06fa }
            java.lang.String r0 = "DirectInboxController.STATE_SEEN_THREAD_ID_LIST"
            java.util.ArrayList r1 = r3.getStringArrayList(r0)     // Catch:{ all -> 0x06fa }
            if (r1 == 0) goto L_0x0297
            java.util.Set r0 = r6.A1b     // Catch:{ all -> 0x06fa }
            r0.addAll(r1)     // Catch:{ all -> 0x06fa }
        L_0x0297:
            java.lang.String r1 = "DirectInboxController.STATE_FILTER_TYPE"
            java.lang.String r0 = "all"
            java.lang.String r0 = r3.getString(r1, r0)     // Catch:{ all -> 0x06fa }
            r6.A0w = r0     // Catch:{ all -> 0x06fa }
        L_0x02a1:
            java.lang.Object r3 = r23.getValue()     // Catch:{ all -> 0x06fa }
            X.Mbh r3 = (X.C66736Mbh) r3     // Catch:{ all -> 0x06fa }
            X.0eM r0 = r6.A1h     // Catch:{ all -> 0x06fa }
            r22 = r0
            java.lang.Object r0 = r22.getValue()     // Catch:{ all -> 0x06fa }
            X.Pvy r0 = (X.C74503Pvy) r0     // Catch:{ all -> 0x06fa }
            X.PxF r1 = r0.C6W()     // Catch:{ all -> 0x06fa }
            X.Ma3 r0 = new X.Ma3     // Catch:{ all -> 0x06fa }
            r0.<init>(r3, r6, r1)     // Catch:{ all -> 0x06fa }
            r6.A0V = r0     // Catch:{ all -> 0x06fa }
            java.lang.Object r0 = r22.getValue()     // Catch:{ all -> 0x06fa }
            X.Pvy r0 = (X.C74503Pvy) r0     // Catch:{ all -> 0x06fa }
            X.PxF r1 = r0.C6W()     // Catch:{ all -> 0x06fa }
            X.Miy r0 = new X.Miy     // Catch:{ all -> 0x06fa }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x06fa }
            r6.A0h = r0     // Catch:{ all -> 0x06fa }
            java.lang.Object r0 = r22.getValue()     // Catch:{ all -> 0x06fa }
            X.Pvy r0 = (X.C74503Pvy) r0     // Catch:{ all -> 0x06fa }
            X.PxF r1 = r0.C6W()     // Catch:{ all -> 0x06fa }
            X.MfY r0 = new X.MfY     // Catch:{ all -> 0x06fa }
            r0.<init>(r1)     // Catch:{ all -> 0x06fa }
            r6.A0U = r0     // Catch:{ all -> 0x06fa }
            X.Miv r0 = new X.Miv     // Catch:{ all -> 0x06fa }
            r0.<init>(r6)     // Catch:{ all -> 0x06fa }
            r6.A0L = r0     // Catch:{ all -> 0x06fa }
            boolean r0 = X.C66633Ma2.A0j(r6)     // Catch:{ all -> 0x06fa }
            if (r0 == 0) goto L_0x04ef
            X.MqS r0 = new X.MqS     // Catch:{ all -> 0x06fa }
            r0.<init>(r6)     // Catch:{ all -> 0x06fa }
        L_0x02f0:
            r6.A0P = r0     // Catch:{ all -> 0x06fa }
            X.Miu r0 = new X.Miu     // Catch:{ all -> 0x06fa }
            r0.<init>(r6)     // Catch:{ all -> 0x06fa }
            r6.A0T = r0     // Catch:{ all -> 0x06fa }
            X.Mix r0 = new X.Mix     // Catch:{ all -> 0x06fa }
            r0.<init>(r6)     // Catch:{ all -> 0x06fa }
            r6.A0N = r0     // Catch:{ all -> 0x06fa }
            X.Miw r0 = new X.Miw     // Catch:{ all -> 0x06fa }
            r0.<init>(r6)     // Catch:{ all -> 0x06fa }
            r6.A0O = r0     // Catch:{ all -> 0x06fa }
            java.lang.Object r0 = r22.getValue()     // Catch:{ all -> 0x06fa }
            X.Pvy r0 = (X.C74503Pvy) r0     // Catch:{ all -> 0x06fa }
            X.PxF r1 = r0.C6W()     // Catch:{ all -> 0x06fa }
            X.Mit r0 = new X.Mit     // Catch:{ all -> 0x06fa }
            r0.<init>(r1)     // Catch:{ all -> 0x06fa }
            r6.A0Q = r0     // Catch:{ all -> 0x06fa }
            X.Mj1 r0 = new X.Mj1     // Catch:{ all -> 0x06fa }
            r0.<init>(r6)     // Catch:{ all -> 0x06fa }
            r6.A0M = r0     // Catch:{ all -> 0x06fa }
            X.0eM r0 = r6.A22     // Catch:{ all -> 0x06fa }
            r21 = r0
            java.lang.Object r3 = r21.getValue()     // Catch:{ all -> 0x06fa }
            X.1Ng r3 = (X.1Ng) r3     // Catch:{ all -> 0x06fa }
            java.lang.Class<X.AXy> r1 = X.C40259AXy.class
            X.0eM r0 = r6.A1w     // Catch:{ all -> 0x06fa }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06fa }
            X.1wn r0 = (X.1wn) r0     // Catch:{ all -> 0x06fa }
            r3.A01(r0, r1)     // Catch:{ all -> 0x06fa }
            java.lang.Class<X.2Cy> r1 = X.2Cy.class
            X.1wn r0 = r6.A0V     // Catch:{ all -> 0x06fa }
            if (r0 != 0) goto L_0x0346
            java.lang.String r0 = "userUpdatedListener"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x06fa }
        L_0x0341:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x06fa }
            throw r0     // Catch:{ all -> 0x06fa }
        L_0x0346:
            r3.A01(r0, r1)     // Catch:{ all -> 0x06fa }
            java.lang.Class<X.36g> r1 = X.C2370836g.class
            X.1wn r0 = r6.A0U     // Catch:{ all -> 0x06fa }
            if (r0 != 0) goto L_0x0355
            java.lang.String r0 = "userFollowStatusUpdatedListener"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x06fa }
            goto L_0x0341
        L_0x0355:
            r3.A01(r0, r1)     // Catch:{ all -> 0x06fa }
            java.lang.Class<X.5gP> r1 = X.C291035gP.class
            X.1wn r0 = r6.A0L     // Catch:{ all -> 0x06fa }
            if (r0 != 0) goto L_0x0364
            java.lang.String r0 = "awaitingIrisDeltasUpdatedEventListener"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x06fa }
            goto L_0x0341
        L_0x0364:
            r3.A01(r0, r1)     // Catch:{ all -> 0x06fa }
            java.lang.Class<X.5gQ> r1 = X.C291045gQ.class
            X.1wn r0 = r6.A0T     // Catch:{ all -> 0x06fa }
            if (r0 != 0) goto L_0x0373
            java.lang.String r0 = "subIrisUpdateEventListener"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x06fa }
            goto L_0x0341
        L_0x0373:
            r3.A01(r0, r1)     // Catch:{ all -> 0x06fa }
            java.lang.Class<X.5lR> r1 = X.C293845lR.class
            X.1wn r0 = r6.A0N     // Catch:{ all -> 0x06fa }
            if (r0 != 0) goto L_0x0382
            java.lang.String r0 = "initialSnapshotUpdateEvent"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x06fa }
            goto L_0x0341
        L_0x0382:
            r3.A01(r0, r1)     // Catch:{ all -> 0x06fa }
            java.lang.Class<X.Osm> r1 = X.C71904Osm.class
            X.1wn r0 = r6.A0O     // Catch:{ all -> 0x06fa }
            if (r0 != 0) goto L_0x0391
            java.lang.String r0 = "irisErrorStatusUpdatedListener"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x06fa }
            goto L_0x0341
        L_0x0391:
            r3.A01(r0, r1)     // Catch:{ all -> 0x06fa }
            java.lang.Class<X.Mlz> r1 = X.C67323Mlz.class
            X.1wn r0 = r6.A0Q     // Catch:{ all -> 0x06fa }
            if (r0 != 0) goto L_0x03a0
            java.lang.String r0 = "latestReelMediaUpdatedEventListener"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x06fa }
            goto L_0x0341
        L_0x03a0:
            r3.A01(r0, r1)     // Catch:{ all -> 0x06fa }
            java.lang.Class<X.OsU> r1 = X.C71886OsU.class
            X.1wn r0 = r6.A0M     // Catch:{ all -> 0x06fa }
            if (r0 != 0) goto L_0x03af
            java.lang.String r0 = "generalFolderStatusUpdatedListener"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x06fa }
            goto L_0x0341
        L_0x03af:
            r3.A01(r0, r1)     // Catch:{ all -> 0x06fa }
            java.lang.Class<X.2Kg> r1 = X.C70222Kg.class
            X.0eM r0 = r6.A1g     // Catch:{ all -> 0x06fa }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06fa }
            X.1wn r0 = (X.1wn) r0     // Catch:{ all -> 0x06fa }
            r3.A01(r0, r1)     // Catch:{ all -> 0x06fa }
            java.lang.Class<X.5g2> r1 = X.C290835g2.class
            X.0eM r0 = r6.A2f     // Catch:{ all -> 0x06fa }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06fa }
            X.1wn r0 = (X.1wn) r0     // Catch:{ all -> 0x06fa }
            r3.A01(r0, r1)     // Catch:{ all -> 0x06fa }
            X.1wn r3 = r6.A0P     // Catch:{ all -> 0x06fa }
            if (r3 == 0) goto L_0x03db
            java.lang.Object r1 = r21.getValue()     // Catch:{ all -> 0x06fa }
            X.1Ng r1 = (X.1Ng) r1     // Catch:{ all -> 0x06fa }
            java.lang.Class<X.Mba> r0 = X.C66729Mba.class
            r1.A01(r3, r0)     // Catch:{ all -> 0x06fa }
        L_0x03db:
            com.instagram.common.session.UserSession r0 = r6.A0p()     // Catch:{ all -> 0x06fa }
            X.1bO r1 = X.1bO.A00(r0)     // Catch:{ all -> 0x06fa }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x06fa }
            java.lang.Integer r8 = X.AnonymousClass43Z.A03     // Catch:{ all -> 0x06fa }
            X.Mi9 r4 = r6.A0u()     // Catch:{ all -> 0x06fa }
            java.lang.String r3 = "initial_sub_iris_status"
            int r0 = r8.intValue()     // Catch:{ all -> 0x06fa }
            switch(r0) {
                case 0: goto L_0x0462;
                case 1: goto L_0x045f;
                default: goto L_0x03f5;
            }     // Catch:{ all -> 0x06fa }
        L_0x03f5:
            java.lang.String r0 = "COMPLETED"
        L_0x03f7:
            r4.A0J(r3, r0)     // Catch:{ all -> 0x06fa }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x06fa }
            r3 = 0
            if (r8 != r0) goto L_0x0426
            java.lang.Long r1 = X.AnonymousClass43Z.A04     // Catch:{ all -> 0x06fa }
            if (r1 == 0) goto L_0x041c
            X.Mi9 r0 = r6.A0u()     // Catch:{ all -> 0x06fa }
            X.34p r8 = r0.A0B     // Catch:{ all -> 0x06fa }
            long r0 = r1.longValue()     // Catch:{ all -> 0x06fa }
            r8.A06(r0)     // Catch:{ all -> 0x06fa }
        L_0x0411:
            X.2Dm r0 = r6.A0v()     // Catch:{ all -> 0x06fa }
            X.2Dr r0 = (X.2Dr) r0     // Catch:{ all -> 0x06fa }
            X.1bC r0 = r0.A0H     // Catch:{ all -> 0x06fa }
            boolean r0 = r0.A0F     // Catch:{ all -> 0x06fa }
            goto L_0x0465
        L_0x041c:
            X.Mi9 r0 = r6.A0u()     // Catch:{ all -> 0x06fa }
            X.34p r0 = r0.A0B     // Catch:{ all -> 0x06fa }
            r0.A08(r15)     // Catch:{ all -> 0x06fa }
            goto L_0x0411
        L_0x0426:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x06fa }
            if (r8 != r0) goto L_0x0411
            X.Mi9 r0 = r6.A0u()     // Catch:{ all -> 0x06fa }
            X.34p r0 = r0.A0B     // Catch:{ all -> 0x06fa }
            r0.A02()     // Catch:{ all -> 0x06fa }
            X.Mi9 r9 = r6.A0u()     // Catch:{ all -> 0x06fa }
            java.lang.String r8 = "latest_server_seq_id"
            long r16 = X.AnonymousClass43Z.A00     // Catch:{ all -> 0x06fa }
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x06fa }
            r9.A0I(r8, r0)     // Catch:{ all -> 0x06fa }
            long r8 = X.AnonymousClass43Z.A01     // Catch:{ all -> 0x06fa }
            long r0 = r1.A00     // Catch:{ all -> 0x06fa }
            long r8 = java.lang.Math.max(r8, r0)     // Catch:{ all -> 0x06fa }
            long r0 = X.AnonymousClass43Z.A00     // Catch:{ all -> 0x06fa }
            long r0 = r0 - r8
            long r16 = java.lang.Math.max(r3, r0)     // Catch:{ all -> 0x06fa }
            X.Mi9 r8 = r6.A0u()     // Catch:{ all -> 0x06fa }
            java.lang.String r1 = "total_delta_count"
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x06fa }
            r8.A0I(r1, r0)     // Catch:{ all -> 0x06fa }
            goto L_0x0411
        L_0x045f:
            java.lang.String r0 = "STARTED"
            goto L_0x03f7
        L_0x0462:
            java.lang.String r0 = "NONE"
            goto L_0x03f7
        L_0x0465:
            if (r0 == 0) goto L_0x0471
            X.Mi9 r0 = r6.A0u()     // Catch:{ all -> 0x06fa }
            X.34p r0 = r0.A09     // Catch:{ all -> 0x06fa }
            r0.A02()     // Catch:{ all -> 0x06fa }
            goto L_0x0492
        L_0x0471:
            X.2Dm r0 = r6.A0v()     // Catch:{ all -> 0x06fa }
            X.2Dr r0 = (X.2Dr) r0     // Catch:{ all -> 0x06fa }
            X.1bC r0 = r0.A0H     // Catch:{ all -> 0x06fa }
            long r0 = r0.A0D     // Catch:{ all -> 0x06fa }
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x0492
            X.Mi9 r0 = r6.A0u()     // Catch:{ all -> 0x06fa }
            X.34p r8 = r0.A09     // Catch:{ all -> 0x06fa }
            X.2Dm r0 = r6.A0v()     // Catch:{ all -> 0x06fa }
            X.2Dr r0 = (X.2Dr) r0     // Catch:{ all -> 0x06fa }
            X.1bC r0 = r0.A0H     // Catch:{ all -> 0x06fa }
            long r0 = r0.A0D     // Catch:{ all -> 0x06fa }
            r8.A06(r0)     // Catch:{ all -> 0x06fa }
        L_0x0492:
            X.2Dm r9 = r6.A0v()     // Catch:{ all -> 0x06fa }
            X.Mi9 r0 = r6.A0u()     // Catch:{ all -> 0x06fa }
            X.34p r8 = r0.A09     // Catch:{ all -> 0x06fa }
            X.9Np r1 = X.C377879Np.A00     // Catch:{ all -> 0x06fa }
            X.9SI r0 = new X.9SI     // Catch:{ all -> 0x06fa }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x06fa }
            X.2Dr r9 = (X.2Dr) r9     // Catch:{ all -> 0x06fa }
            r9.A01 = r0     // Catch:{ all -> 0x06fa }
            X.2Dm r8 = r6.A0v()     // Catch:{ all -> 0x06fa }
            X.Mi9 r0 = r6.A0u()     // Catch:{ all -> 0x06fa }
            X.34p r1 = r0.A0D     // Catch:{ all -> 0x06fa }
            X.9SJ r0 = new X.9SJ     // Catch:{ all -> 0x06fa }
            r0.<init>(r1)     // Catch:{ all -> 0x06fa }
            X.2Dr r8 = (X.2Dr) r8     // Catch:{ all -> 0x06fa }
            r8.A02 = r0     // Catch:{ all -> 0x06fa }
            if (r13 == r12) goto L_0x04f5
            if (r20 == 0) goto L_0x04f5
            X.Ot4 r0 = new X.Ot4     // Catch:{ all -> 0x06fa }
            r0.<init>(r6)     // Catch:{ all -> 0x06fa }
            r6.A0S = r0     // Catch:{ all -> 0x06fa }
            X.Ot3 r0 = new X.Ot3     // Catch:{ all -> 0x06fa }
            r0.<init>(r6)     // Catch:{ all -> 0x06fa }
            r6.A0R = r0     // Catch:{ all -> 0x06fa }
            java.lang.Object r8 = r21.getValue()     // Catch:{ all -> 0x06fa }
            X.1Ng r8 = (X.1Ng) r8     // Catch:{ all -> 0x06fa }
            java.lang.Class<X.OsZ> r1 = X.C71891OsZ.class
            X.1wn r0 = r6.A0S     // Catch:{ all -> 0x06fa }
            if (r0 != 0) goto L_0x04df
            java.lang.String r0 = "secureThreadsInitialLoadingStartedEventListener"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x06fa }
            goto L_0x0341
        L_0x04df:
            r8.A01(r0, r1)     // Catch:{ all -> 0x06fa }
            java.lang.Class<X.MhP> r1 = X.C67052MhP.class
            X.1wn r0 = r6.A0R     // Catch:{ all -> 0x06fa }
            if (r0 != 0) goto L_0x04f2
            java.lang.String r0 = "secureThreadsInitialLoadingEndedEventListener"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x06fa }
            goto L_0x0341
        L_0x04ef:
            r0 = r15
            goto L_0x02f0
        L_0x04f2:
            r8.A01(r0, r1)     // Catch:{ all -> 0x06fa }
        L_0x04f5:
            com.instagram.common.session.UserSession r8 = r6.A0p()     // Catch:{ all -> 0x06fa }
            X.2EX r0 = X.AnonymousClass2EX.A00     // Catch:{ all -> 0x06fa }
            boolean r1 = r6.A1A(r0)     // Catch:{ all -> 0x06fa }
            X.0qQ.A0B(r8, r10)     // Catch:{ all -> 0x06fa }
            boolean r0 = X.2El.A0C(r8)     // Catch:{ all -> 0x06fa }
            if (r0 != 0) goto L_0x050e
            boolean r0 = X.2El.A0N(r8, r1)     // Catch:{ all -> 0x06fa }
            if (r0 == 0) goto L_0x051d
        L_0x050e:
            com.instagram.common.session.UserSession r1 = r6.A0p()     // Catch:{ all -> 0x06fa }
            X.0eM r0 = r6.A21     // Catch:{ all -> 0x06fa }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06fa }
            X.2J4 r0 = (X.AnonymousClass2J4) r0     // Catch:{ all -> 0x06fa }
            X.2J7.A01(r1, r0)     // Catch:{ all -> 0x06fa }
        L_0x051d:
            X.0eM r0 = r6.A2b     // Catch:{ all -> 0x06fa }
            r7.A01(r0)     // Catch:{ all -> 0x06fa }
            X.0eM r0 = r6.A2c     // Catch:{ all -> 0x06fa }
            r7.A01(r0)     // Catch:{ all -> 0x06fa }
            androidx.fragment.app.FragmentActivity r8 = r14.requireActivity()     // Catch:{ all -> 0x06fa }
            com.instagram.common.session.UserSession r1 = r6.A0p()     // Catch:{ all -> 0x06fa }
            X.Mj5 r0 = new X.Mj5     // Catch:{ all -> 0x06fa }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x06fa }
            r6.A0Z = r0     // Catch:{ all -> 0x06fa }
            r14.registerLifecycleListener(r0)     // Catch:{ all -> 0x06fa }
            X.0eM r0 = r6.A2G     // Catch:{ all -> 0x06fa }
            r7.A01(r0)     // Catch:{ all -> 0x06fa }
            X.0eM r0 = r6.A26     // Catch:{ all -> 0x06fa }
            r7.A01(r0)     // Catch:{ all -> 0x06fa }
            java.lang.Object r1 = r23.getValue()     // Catch:{ all -> 0x06fa }
            X.Mbh r1 = (X.C66736Mbh) r1     // Catch:{ all -> 0x06fa }
            java.lang.Object r0 = r22.getValue()     // Catch:{ all -> 0x06fa }
            X.Pvy r0 = (X.C74503Pvy) r0     // Catch:{ all -> 0x06fa }
            X.PxF r0 = r0.C6W()     // Catch:{ all -> 0x06fa }
            boolean r8 = X.C66633Ma2.A0f(r1, r6, r0)     // Catch:{ all -> 0x06fa }
            java.lang.Object r1 = r23.getValue()     // Catch:{ all -> 0x06fa }
            X.Mbh r1 = (X.C66736Mbh) r1     // Catch:{ all -> 0x06fa }
            java.lang.Object r0 = r22.getValue()     // Catch:{ all -> 0x06fa }
            X.Pvy r0 = (X.C74503Pvy) r0     // Catch:{ all -> 0x06fa }
            X.PxF r0 = r0.C6W()     // Catch:{ all -> 0x06fa }
            X.C66633Ma2.A0g(r1, r6, r0)     // Catch:{ all -> 0x06fa }
            java.lang.Object r0 = r23.getValue()     // Catch:{ all -> 0x06fa }
            X.Mbh r0 = (X.C66736Mbh) r0     // Catch:{ all -> 0x06fa }
            r0.A0B(r8)     // Catch:{ all -> 0x06fa }
            boolean r0 = r6.A10     // Catch:{ all -> 0x06fa }
            if (r0 == 0) goto L_0x0582
            X.0eM r0 = r6.A1o     // Catch:{ all -> 0x06fa }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06fa }
            X.439 r0 = (X.AnonymousClass439) r0     // Catch:{ all -> 0x06fa }
            r0.A03()     // Catch:{ all -> 0x06fa }
        L_0x0582:
            com.instagram.common.session.UserSession r0 = r6.A0p()     // Catch:{ all -> 0x06fa }
            boolean r0 = X.DcI.A00(r0)     // Catch:{ all -> 0x06fa }
            if (r0 == 0) goto L_0x0597
            com.instagram.common.session.UserSession r0 = r6.A0p()     // Catch:{ all -> 0x06fa }
            X.McN r0 = X.C66778McO.A00(r0)     // Catch:{ all -> 0x06fa }
            r0.A05()     // Catch:{ all -> 0x06fa }
        L_0x0597:
            X.0eM r0 = r6.A2R     // Catch:{ all -> 0x06fa }
            r7.A01(r0)     // Catch:{ all -> 0x06fa }
            com.instagram.common.session.UserSession r7 = r6.A0p()     // Catch:{ all -> 0x06fa }
            X.0qQ.A0B(r7, r10)     // Catch:{ all -> 0x06fa }
            r0 = 36328285088857281(0x81106200053cc1, double:3.0374920002314105E-306)
            boolean r0 = X.182.A06(r11, r7, r0)     // Catch:{ all -> 0x06fa }
            if (r0 != 0) goto L_0x05c1
            com.instagram.common.session.UserSession r7 = r6.A0p()     // Catch:{ all -> 0x06fa }
            X.0qQ.A0B(r7, r10)     // Catch:{ all -> 0x06fa }
            r0 = 21
            X.MJ0 r1 = new X.MJ0     // Catch:{ all -> 0x06fa }
            r1.<init>(r7, r0)     // Catch:{ all -> 0x06fa }
            java.lang.Class<X.Mov> r0 = X.C67501Mov.class
            r7.A01(r0, r1)     // Catch:{ all -> 0x06fa }
        L_0x05c1:
            X.Mgq r0 = X.C66633Ma2.A04(r6)     // Catch:{ all -> 0x06fa }
            X.34p r0 = r0.A02     // Catch:{ all -> 0x06fa }
            r0.A05()     // Catch:{ all -> 0x06fa }
            com.instagram.common.session.UserSession r0 = r6.A0p()     // Catch:{ all -> 0x06fa }
            X.3Wh r0 = X.C242853Wg.A00(r0)     // Catch:{ all -> 0x06fa }
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x06fa }
            r1.<init>(r6)     // Catch:{ all -> 0x06fa }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x06fa }
            r0.add(r1)     // Catch:{ all -> 0x06fa }
            com.instagram.common.session.UserSession r7 = r6.A0p()     // Catch:{ all -> 0x06fa }
            r0 = 36604047761085439(0x820b30002413ff, double:3.211885424555651E-306)
            long r7 = X.182.A01(r11, r7, r0)     // Catch:{ all -> 0x06fa }
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x05f4
            X.MoW r0 = new X.MoW     // Catch:{ all -> 0x06fa }
            r0.<init>(r6)     // Catch:{ all -> 0x06fa }
            r6.A0Y = r0     // Catch:{ all -> 0x06fa }
        L_0x05f4:
            com.instagram.common.session.UserSession r7 = r6.A0p()     // Catch:{ all -> 0x06fa }
            X.0qQ.A0B(r7, r10)     // Catch:{ all -> 0x06fa }
            r0 = 36609760065755058(0x821062000817b2, double:3.215497909030323E-306)
            long r7 = X.182.A01(r11, r7, r0)     // Catch:{ all -> 0x06fa }
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0616
            X.Mq0 r0 = new X.Mq0     // Catch:{ all -> 0x06fa }
            r0.<init>(r6)     // Catch:{ all -> 0x06fa }
            r6.A0W = r0     // Catch:{ all -> 0x06fa }
            X.Mq1 r0 = new X.Mq1     // Catch:{ all -> 0x06fa }
            r0.<init>(r6)     // Catch:{ all -> 0x06fa }
            r6.A0X = r0     // Catch:{ all -> 0x06fa }
        L_0x0616:
            com.instagram.common.session.UserSession r0 = r6.A0p()     // Catch:{ all -> 0x06fa }
            boolean r0 = X.2El.A0J(r0)     // Catch:{ all -> 0x06fa }
            if (r0 == 0) goto L_0x0633
            X.0gd r3 = X.AnonymousClass0gd.A00()     // Catch:{ all -> 0x06fa }
            X.0eM r0 = r6.A2J     // Catch:{ all -> 0x06fa }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x06fa }
            X.0gc r1 = (X.0gc) r1     // Catch:{ all -> 0x06fa }
            if (r1 == 0) goto L_0x0633
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.A00     // Catch:{ all -> 0x06fa }
            r0.add(r1)     // Catch:{ all -> 0x06fa }
        L_0x0633:
            r19.close()     // Catch:{ all -> 0x0703 }
            r2.A05 = r6     // Catch:{ all -> 0x0703 }
            com.instagram.common.session.UserSession r21 = A01(r2)     // Catch:{ all -> 0x0703 }
            X.Mj6 r1 = new X.Mj6     // Catch:{ all -> 0x0703 }
            r1.<init>(r6)     // Catch:{ all -> 0x0703 }
            X.XEq r0 = new X.XEq     // Catch:{ all -> 0x0703 }
            r0.<init>(r2)     // Catch:{ all -> 0x0703 }
            X.MfU r7 = new X.MfU     // Catch:{ all -> 0x0703 }
            r19 = r7
            r20 = r2
            r22 = r6
            r23 = r1
            r24 = r0
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0703 }
            com.instagram.common.session.UserSession r22 = A01(r2)     // Catch:{ all -> 0x0703 }
            X.MfS r4 = new X.MfS     // Catch:{ all -> 0x0703 }
            r4.<init>(r6)     // Catch:{ all -> 0x0703 }
            X.XE9 r3 = new X.XE9     // Catch:{ all -> 0x0703 }
            r3.<init>(r2)     // Catch:{ all -> 0x0703 }
            boolean r1 = r2.A0F     // Catch:{ all -> 0x0703 }
            X.MfT r0 = new X.MfT     // Catch:{ all -> 0x0703 }
            r19 = r0
            r21 = r2
            r23 = r7
            r24 = r4
            r25 = r3
            r26 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0703 }
            r2.A02 = r0     // Catch:{ all -> 0x0703 }
            A05(r2)     // Catch:{ all -> 0x0703 }
            com.instagram.common.session.UserSession r6 = A01(r2)     // Catch:{ all -> 0x0703 }
            boolean r4 = r2.A0F     // Catch:{ all -> 0x0703 }
            X.Mkx r0 = r2.A06     // Catch:{ all -> 0x0703 }
            r1 = 0
            if (r0 == 0) goto L_0x0687
            r1 = 1
        L_0x0687:
            if (r5 == 0) goto L_0x068f
            java.lang.String r0 = "DirectFragment.INITIAL_MODE"
            java.lang.String r15 = r5.getString(r0)     // Catch:{ all -> 0x0703 }
        L_0x068f:
            X.2EM r0 = X.C67084Mhz.A00(r15)     // Catch:{ all -> 0x0703 }
            X.MeY r3 = new X.MeY     // Catch:{ all -> 0x0703 }
            r3.<init>(r6, r0, r4, r1)     // Catch:{ all -> 0x0703 }
            r2.A04 = r3     // Catch:{ all -> 0x0703 }
            com.instagram.common.session.UserSession r1 = A01(r2)     // Catch:{ all -> 0x0703 }
            X.Mj8 r0 = new X.Mj8     // Catch:{ all -> 0x0703 }
            r0.<init>(r2, r1, r7, r3)     // Catch:{ all -> 0x0703 }
            r2.A03 = r0     // Catch:{ all -> 0x0703 }
            X.14i r0 = X.14i.A08     // Catch:{ all -> 0x0703 }
            X.15Y r0 = X.15Y.A03     // Catch:{ all -> 0x0703 }
            X.14i.A03(r0, r2)     // Catch:{ all -> 0x0703 }
            X.Ma2 r0 = r2.A05     // Catch:{ all -> 0x0703 }
            if (r0 == 0) goto L_0x06bd
            X.Mi9 r0 = r0.A0u()     // Catch:{ all -> 0x0703 }
            if (r0 == 0) goto L_0x06bd
            X.34p r0 = r0.A02     // Catch:{ all -> 0x0703 }
            if (r0 == 0) goto L_0x06bd
            r0.A05()     // Catch:{ all -> 0x0703 }
        L_0x06bd:
            com.instagram.common.session.UserSession r3 = A01(r2)     // Catch:{ all -> 0x0703 }
            r0 = 36609442237650798(0x8210180000176e, double:3.2152969132573976E-306)
            long r0 = X.182.A01(r11, r3, r0)     // Catch:{ all -> 0x0703 }
            int r4 = (int) r0     // Catch:{ all -> 0x0703 }
            com.instagram.common.session.UserSession r3 = A01(r2)     // Catch:{ all -> 0x0703 }
            r0 = 36327967261014868(0x81101800013b54, double:3.0372910046240785E-306)
            boolean r0 = X.182.A06(r11, r3, r0)     // Catch:{ all -> 0x0703 }
            if (r0 == 0) goto L_0x06eb
            if (r4 == 0) goto L_0x06eb
            X.Mjp r1 = new X.Mjp     // Catch:{ all -> 0x0703 }
            r1.<init>(r2)     // Catch:{ all -> 0x0703 }
            X.GVI r0 = new X.GVI     // Catch:{ all -> 0x0703 }
            r0.<init>(r1, r4)     // Catch:{ all -> 0x0703 }
            r2.A0I = r0     // Catch:{ all -> 0x0703 }
            r0.A01()     // Catch:{ all -> 0x0703 }
        L_0x06eb:
            r0 = 1095465664(0x414b7ac0, float:12.717468)
            X.0fh.A00(r0)
            r1 = 2057307022(0x7aa0038e, float:4.154198E35)
            r0 = r18
            X.AnonymousClass0fD.A09(r1, r0)
            return
        L_0x06fa:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x06fc }
        L_0x06fc:
            r1 = move-exception
            r0 = r19
            X.1zE.A00(r0, r2)     // Catch:{ all -> 0x0703 }
            throw r1     // Catch:{ all -> 0x0703 }
        L_0x0703:
            r2 = move-exception
            r0 = 940945051(0x3815ae9b, float:3.5686982E-5)
            X.0fh.A00(r0)
            r1 = -176092164(0xfffffffff5810bfc, float:-3.2717254E32)
            r0 = r18
            X.AnonymousClass0fD.A09(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273624mt.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: X.3jo} */
    /* JADX WARNING: type inference failed for: r15v4, types: [X.MhI, android.os.MessageQueue$IdleHandler] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r26, android.view.ViewGroup r27, android.os.Bundle r28) {
        /*
            r25 = this;
            r0 = 1154742223(0x44d3f7cf, float:1695.744)
            int r11 = X.AnonymousClass0fD.A02(r0)
            r4 = 0
            r5 = r26
            X.0qQ.A0B(r5, r4)
            r1 = r25
            X.Ma2 r0 = r1.A05
            r9 = 0
            if (r0 == 0) goto L_0x0021
            X.Mi9 r0 = r0.A0u()
            if (r0 == 0) goto L_0x0021
            X.34p r0 = r0.A03
            if (r0 == 0) goto L_0x0021
            r0.A08(r9)
        L_0x0021:
            X.9HB r0 = r1.A0Q
            r3 = r27
            r0.A02(r3)
            com.instagram.common.session.UserSession r0 = A01(r1)
            boolean r0 = X.C378789Rf.A00(r0)
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout"
            if (r0 == 0) goto L_0x0054
            r15 = 2131625613(0x7f0e068d, float:1.8878439E38)
            r16 = r4
            r17 = r4
            r12 = r5
            r13 = r9
            r14 = r3
            android.view.View r0 = X.2Su.A01(r12, r13, r14, r15, r16, r17)
            X.0qQ.A0C(r0, r2)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r0
            r2 = 1
            X.AnonymousClass7PV.A00 = r2
        L_0x004a:
            r1.A01 = r0
            X.Ma2 r6 = r1.A05
            if (r6 == 0) goto L_0x0470
            X.0qQ.A0B(r0, r4)
            goto L_0x0068
        L_0x0054:
            r15 = 2131625612(0x7f0e068c, float:1.8878437E38)
            r16 = r4
            r17 = r4
            r12 = r5
            r13 = r9
            r14 = r3
            android.view.View r0 = X.2Su.A01(r12, r13, r14, r15, r16, r17)
            X.0qQ.A0C(r0, r2)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r0
            goto L_0x004a
        L_0x0068:
            java.lang.String r3 = "DirectInboxController.onCreateView"
            r2 = -384707604(0xffffffffe911d3ec, float:-1.1018439E25)
            X.0fh.A01(r3, r2)     // Catch:{ all -> 0x03fe }
            X.Mgq r2 = X.C66633Ma2.A04(r6)     // Catch:{ all -> 0x03fe }
            X.34p r2 = r2.A03     // Catch:{ all -> 0x03fe }
            r7 = 1
            r2.A08(r9)     // Catch:{ all -> 0x03fe }
            com.instagram.common.session.UserSession r2 = r6.A0p()     // Catch:{ all -> 0x03fe }
            boolean r2 = com.instagram.direct.lockedchat.LockedChatKillSwitch.isLockedChatEnabled(r2, r4)     // Catch:{ all -> 0x03fe }
            if (r2 == 0) goto L_0x00cd
            X.2EM r3 = r6.A0s()     // Catch:{ all -> 0x03fe }
            X.MkK r2 = X.C67224MkK.A00     // Catch:{ all -> 0x03fe }
            boolean r2 = X.0qQ.A0K(r3, r2)     // Catch:{ all -> 0x03fe }
            if (r2 == 0) goto L_0x00cd
            com.instagram.common.session.UserSession r5 = r6.A0p()     // Catch:{ all -> 0x03fe }
            java.lang.String r8 = "inbox"
            X.0qQ.A0B(r5, r4)     // Catch:{ all -> 0x03fe }
            java.lang.String r3 = "igd_locked_chat"
            X.0xG r2 = new X.0xG     // Catch:{ all -> 0x03fe }
            r2.<init>(r3)     // Catch:{ all -> 0x03fe }
            X.0wc r5 = X.AnonymousClass0kN.A01(r2, r5)     // Catch:{ all -> 0x03fe }
            java.lang.String r3 = "igd_locked_chat_events"
            X.0kJ r2 = r5.A00     // Catch:{ all -> 0x03fe }
            X.0Aj r5 = r5.A00(r2, r3)     // Catch:{ all -> 0x03fe }
            boolean r2 = r5.isSampled()     // Catch:{ all -> 0x03fe }
            if (r2 == 0) goto L_0x00c1
            java.lang.String r3 = "show_locked_thread_list"
            java.lang.String r2 = "action"
            r5.AAJ(r2, r3)     // Catch:{ all -> 0x03fe }
            java.lang.String r2 = "entry_point"
            r5.AAJ(r2, r8)     // Catch:{ all -> 0x03fe }
            r5.Cgf()     // Catch:{ all -> 0x03fe }
        L_0x00c1:
            android.view.ViewTreeObserver r3 = r0.getViewTreeObserver()     // Catch:{ all -> 0x03fe }
            X.Okr r2 = new X.Okr     // Catch:{ all -> 0x03fe }
            r2.<init>(r6)     // Catch:{ all -> 0x03fe }
            r3.addOnWindowFocusChangeListener(r2)     // Catch:{ all -> 0x03fe }
        L_0x00cd:
            X.0eM r2 = r6.A2t     // Catch:{ all -> 0x03fe }
            java.lang.Object r8 = r2.getValue()     // Catch:{ all -> 0x03fe }
            X.Mbh r8 = (X.C66736Mbh) r8     // Catch:{ all -> 0x03fe }
            com.instagram.common.session.UserSession r2 = r8.A0B     // Catch:{ all -> 0x03fe }
            boolean r2 = X.2El.A07(r2)     // Catch:{ all -> 0x03fe }
            if (r2 == 0) goto L_0x00f3
            X.1a8 r5 = r8.A0A     // Catch:{ all -> 0x03fe }
            X.1aU r3 = r8.A08     // Catch:{ all -> 0x03fe }
            boolean r2 = r8.A0M     // Catch:{ all -> 0x03fe }
            if (r2 == 0) goto L_0x00ee
            X.4fh r2 = X.C318146oT.A01     // Catch:{ all -> 0x03fe }
            X.1aU r3 = r3.A0P(r2)     // Catch:{ all -> 0x03fe }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x03fe }
        L_0x00ee:
            X.1aV r2 = r8.A0H     // Catch:{ all -> 0x03fe }
            r5.A02(r3, r2)     // Catch:{ all -> 0x03fe }
        L_0x00f3:
            X.1a8 r5 = r8.A0A     // Catch:{ all -> 0x03fe }
            X.1aU r12 = r8.A09     // Catch:{ all -> 0x03fe }
            boolean r10 = r8.A0M     // Catch:{ all -> 0x03fe }
            if (r10 == 0) goto L_0x0104
            X.4fh r2 = X.C318146oT.A01     // Catch:{ all -> 0x03fe }
            X.1aU r12 = r12.A0P(r2)     // Catch:{ all -> 0x03fe }
            X.0qQ.A0A(r12)     // Catch:{ all -> 0x03fe }
        L_0x0104:
            boolean r2 = r8.A0K     // Catch:{ all -> 0x03fe }
            if (r2 != 0) goto L_0x0116
            X.Mbf r3 = X.C66734Mbf.A00     // Catch:{ all -> 0x03fe }
            X.Mbn r2 = new X.Mbn     // Catch:{ all -> 0x03fe }
            r2.<init>(r3)     // Catch:{ all -> 0x03fe }
            X.1aU r12 = r12.A0I(r2)     // Catch:{ all -> 0x03fe }
            X.0qQ.A0A(r12)     // Catch:{ all -> 0x03fe }
        L_0x0116:
            X.1aV r2 = r8.A0I     // Catch:{ all -> 0x03fe }
            r5.A02(r12, r2)     // Catch:{ all -> 0x03fe }
            X.1aU r3 = r8.A07     // Catch:{ all -> 0x03fe }
            if (r10 == 0) goto L_0x0128
            X.4fh r2 = X.C318146oT.A01     // Catch:{ all -> 0x03fe }
            X.1aU r3 = r3.A0P(r2)     // Catch:{ all -> 0x03fe }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x03fe }
        L_0x0128:
            X.1aV r2 = r8.A0G     // Catch:{ all -> 0x03fe }
            r5.A02(r3, r2)     // Catch:{ all -> 0x03fe }
            com.instagram.common.session.UserSession r2 = r6.A0p()     // Catch:{ all -> 0x03fe }
            boolean r2 = X.2El.A07(r2)     // Catch:{ all -> 0x03fe }
            if (r2 == 0) goto L_0x0146
            X.0eM r2 = r6.A1h     // Catch:{ all -> 0x03fe }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x03fe }
            X.Pvy r2 = (X.C74503Pvy) r2     // Catch:{ all -> 0x03fe }
            X.PxE r2 = r2.B6g()     // Catch:{ all -> 0x03fe }
            r2.start()     // Catch:{ all -> 0x03fe }
        L_0x0146:
            X.0eM r8 = r6.A1h     // Catch:{ all -> 0x03fe }
            java.lang.Object r2 = r8.getValue()     // Catch:{ all -> 0x03fe }
            X.Pvy r2 = (X.C74503Pvy) r2     // Catch:{ all -> 0x03fe }
            X.PxF r2 = r2.C6W()     // Catch:{ all -> 0x03fe }
            r2.start()     // Catch:{ all -> 0x03fe }
            com.instagram.common.session.UserSession r10 = r6.A0p()     // Catch:{ all -> 0x03fe }
            X.0Tu r5 = X.0Tu.A05     // Catch:{ all -> 0x03fe }
            r2 = 36325892791809360(0x810e3500013550, double:3.035979101945298E-306)
            boolean r2 = X.182.A06(r5, r10, r2)     // Catch:{ all -> 0x03fe }
            if (r2 == 0) goto L_0x0173
            java.lang.Object r2 = r8.getValue()     // Catch:{ all -> 0x03fe }
            X.Pvy r2 = (X.C74503Pvy) r2     // Catch:{ all -> 0x03fe }
            X.PxF r2 = r2.C6W()     // Catch:{ all -> 0x03fe }
            r2.EaU(r7)     // Catch:{ all -> 0x03fe }
        L_0x0173:
            java.lang.Object r2 = r8.getValue()     // Catch:{ all -> 0x03fe }
            X.Pvy r2 = (X.C74503Pvy) r2     // Catch:{ all -> 0x03fe }
            X.Pw5 r2 = r2.BNZ()     // Catch:{ all -> 0x03fe }
            r2.start()     // Catch:{ all -> 0x03fe }
            java.lang.Object r2 = r8.getValue()     // Catch:{ all -> 0x03fe }
            X.Pvy r2 = (X.C74503Pvy) r2     // Catch:{ all -> 0x03fe }
            X.Pwb r2 = r2.B4p()     // Catch:{ all -> 0x03fe }
            r2.start()     // Catch:{ all -> 0x03fe }
            java.lang.Object r2 = r8.getValue()     // Catch:{ all -> 0x03fe }
            X.Pvy r2 = (X.C74503Pvy) r2     // Catch:{ all -> 0x03fe }
            X.PvH r2 = r2.BbU()     // Catch:{ all -> 0x03fe }
            r2.start()     // Catch:{ all -> 0x03fe }
            r6.A0C = r0     // Catch:{ all -> 0x03fe }
            X.0eM r2 = r6.A0z     // Catch:{ all -> 0x03fe }
            boolean r2 = r2.CVQ()     // Catch:{ all -> 0x03fe }
            if (r2 == 0) goto L_0x01b0
            r3 = 5
            X.Pll r2 = new X.Pll     // Catch:{ all -> 0x03fe }
            r2.<init>(r6, r3)     // Catch:{ all -> 0x03fe }
            X.0t0 r2 = X.AnonymousClass0eN.A01(r2)     // Catch:{ all -> 0x03fe }
            r6.A0z = r2     // Catch:{ all -> 0x03fe }
        L_0x01b0:
            com.instagram.common.session.UserSession r2 = r6.A0p()     // Catch:{ all -> 0x03fe }
            java.lang.Integer r10 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x03fe }
            android.view.View r8 = X.AnonymousClass2xO.A00(r0, r2, r10)     // Catch:{ all -> 0x03fe }
            android.content.Context r3 = r0.getContext()     // Catch:{ all -> 0x03fe }
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager     // Catch:{ all -> 0x03fe }
            r2.<init>(r3)     // Catch:{ all -> 0x03fe }
            r6.A0E = r2     // Catch:{ all -> 0x03fe }
            r2 = 2131434651(0x7f0b1c9b, float:1.8491122E38)
            android.view.View r12 = r8.requireViewById(r2)     // Catch:{ all -> 0x03fe }
            X.0qQ.A07(r12)     // Catch:{ all -> 0x03fe }
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12     // Catch:{ all -> 0x03fe }
            r12.setItemAnimator(r9)     // Catch:{ all -> 0x03fe }
            r12.A0S = r7     // Catch:{ all -> 0x03fe }
            com.instagram.common.session.UserSession r8 = r6.A0p()     // Catch:{ all -> 0x03fe }
            r2 = 36605508048327926(0x820c84000b14f6, double:3.2128089160879045E-306)
            long r2 = X.182.A01(r5, r8, r2)     // Catch:{ all -> 0x03fe }
            int r8 = (int) r2     // Catch:{ all -> 0x03fe }
            if (r8 < 0) goto L_0x01e9
            r12.setItemViewCacheSize(r8)     // Catch:{ all -> 0x03fe }
        L_0x01e9:
            X.4DH r8 = r6.A1J     // Catch:{ all -> 0x03fe }
            android.content.Context r3 = r8.getContext()     // Catch:{ all -> 0x03fe }
            if (r3 == 0) goto L_0x03f6
            com.instagram.common.session.UserSession r2 = r6.A0p()     // Catch:{ all -> 0x03fe }
            boolean r2 = X.2El.A0G(r2)     // Catch:{ all -> 0x03fe }
            if (r2 == 0) goto L_0x020c
            r12.setClipToPadding(r4)     // Catch:{ all -> 0x03fe }
            android.content.res.Resources r13 = r3.getResources()     // Catch:{ all -> 0x03fe }
            r2 = 2131165236(0x7f070034, float:1.7944683E38)
            int r2 = r13.getDimensionPixelSize(r2)     // Catch:{ all -> 0x03fe }
            r12.setPadding(r4, r4, r4, r2)     // Catch:{ all -> 0x03fe }
        L_0x020c:
            r2 = 2130970269(0x7f04069d, float:1.7549243E38)
            int r2 = X.2Yu.A0H(r3, r2)     // Catch:{ all -> 0x03fe }
            int r2 = r3.getColor(r2)     // Catch:{ all -> 0x03fe }
            r12.setBackgroundColor(r2)     // Catch:{ all -> 0x03fe }
            X.0eM r2 = r6.A1c     // Catch:{ all -> 0x03fe }
            r21 = r2
            java.lang.Object r2 = r21.getValue()     // Catch:{ all -> 0x03fe }
            X.Mhv r2 = (X.C67080Mhv) r2     // Catch:{ all -> 0x03fe }
            X.2t9 r14 = r2.A00     // Catch:{ all -> 0x03fe }
            X.3BD r13 = r12.getRecycledViewPool()     // Catch:{ all -> 0x03fe }
            X.0qQ.A07(r13)     // Catch:{ all -> 0x03fe }
            java.lang.Class<X.Mb9> r2 = X.C66702Mb9.class
            int r3 = r14.A01(r2)     // Catch:{ all -> 0x03fe }
            r2 = 20
            r13.A02(r3, r2)     // Catch:{ all -> 0x03fe }
            java.lang.Class<X.Dg3> r2 = X.C46500Dg3.class
            int r15 = r14.A01(r2)     // Catch:{ all -> 0x03fe }
            r2 = 10
            r13.A02(r15, r2)     // Catch:{ all -> 0x03fe }
            android.os.MessageQueue r2 = android.os.Looper.myQueue()     // Catch:{ all -> 0x03fe }
            X.MhI r15 = new X.MhI     // Catch:{ all -> 0x03fe }
            r16 = r13
            r17 = r12
            r18 = r14
            r19 = r6
            r20 = r3
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x03fe }
            r2.addIdleHandler(r15)     // Catch:{ all -> 0x03fe }
            r6.A0F = r12     // Catch:{ all -> 0x03fe }
            X.0eM r2 = r6.A2u     // Catch:{ all -> 0x03fe }
            java.lang.Object r13 = r2.getValue()     // Catch:{ all -> 0x03fe }
            X.2el r13 = (X.2el) r13     // Catch:{ all -> 0x03fe }
            if (r13 == 0) goto L_0x026e
            X.3DZ r3 = X.AnonymousClass3DZ.A00(r8)     // Catch:{ all -> 0x03fe }
            X.2eo[] r2 = new X.AnonymousClass2eo[r4]     // Catch:{ all -> 0x03fe }
            r13.A08(r12, r3, r2)     // Catch:{ all -> 0x03fe }
        L_0x026e:
            X.3Ar r3 = X.C238103Ao.A00(r12)     // Catch:{ all -> 0x03fe }
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.RefreshableScrollingViewProxy<com.instagram.direct.inbox.DirectInboxAdapter>"
            X.0qQ.A0C(r3, r2)     // Catch:{ all -> 0x03fe }
            X.3As r3 = (X.C238143As) r3     // Catch:{ all -> 0x03fe }
            r6.A0n = r3     // Catch:{ all -> 0x03fe }
            androidx.recyclerview.widget.LinearLayoutManager r2 = r6.A0E     // Catch:{ all -> 0x03fe }
            if (r2 != 0) goto L_0x0286
            java.lang.String r14 = "layoutManager"
        L_0x0281:
            X.0qQ.A0F(r14)     // Catch:{ all -> 0x03fe }
            goto L_0x03de
        L_0x0286:
            r12.setLayoutManager(r2)     // Catch:{ all -> 0x03fe }
            X.0eM r2 = r6.A0z     // Catch:{ all -> 0x03fe }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x03fe }
            X.3AD r2 = (X.AnonymousClass3AD) r2     // Catch:{ all -> 0x03fe }
            r2.Eou(r4)     // Catch:{ all -> 0x03fe }
            X.3As r2 = r6.A0n     // Catch:{ all -> 0x03fe }
            java.lang.String r14 = "inboxViewProxy"
            if (r2 == 0) goto L_0x0281
            r2.EUY(r4)     // Catch:{ all -> 0x03fe }
            X.3As r2 = r6.A0n     // Catch:{ all -> 0x03fe }
            if (r2 == 0) goto L_0x0281
            r2.Eq3(r7)     // Catch:{ all -> 0x03fe }
            X.3As r3 = r6.A0n     // Catch:{ all -> 0x03fe }
            if (r3 == 0) goto L_0x0281
            java.lang.Object r2 = r21.getValue()     // Catch:{ all -> 0x03fe }
            X.2rL r2 = (X.C231272rL) r2     // Catch:{ all -> 0x03fe }
            r3.ENw(r2)     // Catch:{ all -> 0x03fe }
            X.3As r3 = r6.A0n     // Catch:{ all -> 0x03fe }
            if (r3 == 0) goto L_0x0281
            X.Mhu r2 = new X.Mhu     // Catch:{ all -> 0x03fe }
            r2.<init>(r6)     // Catch:{ all -> 0x03fe }
            r3.ErF(r2)     // Catch:{ all -> 0x03fe }
            com.instagram.common.session.UserSession r2 = r6.A0p()     // Catch:{ all -> 0x03fe }
            boolean r2 = X.AnonymousClass39U.A00(r2)     // Catch:{ all -> 0x03fe }
            if (r2 == 0) goto L_0x02d6
            X.3As r3 = r6.A0n     // Catch:{ all -> 0x03fe }
            if (r3 == 0) goto L_0x0281
            X.0eM r2 = r6.A2W     // Catch:{ all -> 0x03fe }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x03fe }
            X.3je r2 = (X.C249383je) r2     // Catch:{ all -> 0x03fe }
            r3.AAD(r2)     // Catch:{ all -> 0x03fe }
        L_0x02d6:
            int r2 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION     // Catch:{ all -> 0x03fe }
            androidx.fragment.app.FragmentActivity r12 = r8.requireActivity()     // Catch:{ all -> 0x03fe }
            com.instagram.common.session.UserSession r3 = r6.A0p()     // Catch:{ all -> 0x03fe }
            r2 = 23592969(0x1680009, float:4.2611695E-38)
            X.Dfq r3 = X.C46486Dfp.A00(r12, r8, r3, r2)     // Catch:{ all -> 0x03fe }
            r6.A0p = r3     // Catch:{ all -> 0x03fe }
            X.3As r2 = r6.A0n     // Catch:{ all -> 0x03fe }
            if (r2 == 0) goto L_0x0281
            r2.AAD(r3)     // Catch:{ all -> 0x03fe }
            X.3As r12 = r6.A0n     // Catch:{ all -> 0x03fe }
            if (r12 == 0) goto L_0x0281
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.actionbar.ActionBarServiceProvider"
            X.0qQ.A0C(r8, r2)     // Catch:{ all -> 0x03fe }
            r3 = r8
            X.3jo r3 = (X.C249453jo) r3     // Catch:{ all -> 0x03fe }
            X.3Dv r2 = new X.3Dv     // Catch:{ all -> 0x03fe }
            r2.<init>(r3, r7)     // Catch:{ all -> 0x03fe }
            r12.AAD(r2)     // Catch:{ all -> 0x03fe }
            com.instagram.common.session.UserSession r2 = r6.A0p()     // Catch:{ all -> 0x03fe }
            boolean r2 = com.instagram.direct.lockedchat.LockedChatKillSwitch.isLockedChatEnabled(r2, r4)     // Catch:{ all -> 0x03fe }
            if (r2 == 0) goto L_0x034a
            X.0eM r2 = r6.A2G     // Catch:{ all -> 0x03fe }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x03fe }
            X.Q2C r2 = (X.Q2C) r2     // Catch:{ all -> 0x03fe }
            boolean r2 = r2.A02()     // Catch:{ all -> 0x03fe }
            if (r2 == 0) goto L_0x034a
            X.3As r13 = r6.A0n     // Catch:{ all -> 0x03fe }
            if (r13 == 0) goto L_0x0281
            com.instagram.common.session.UserSession r12 = r6.A0p()     // Catch:{ all -> 0x03fe }
            r2 = 38
            X.PmE r3 = new X.PmE     // Catch:{ all -> 0x03fe }
            r3.<init>(r6, r2)     // Catch:{ all -> 0x03fe }
            X.UoA r2 = new X.UoA     // Catch:{ all -> 0x03fe }
            r2.<init>(r3, r12)     // Catch:{ all -> 0x03fe }
            r13.EhT(r2)     // Catch:{ all -> 0x03fe }
            X.3As r13 = r6.A0n     // Catch:{ all -> 0x03fe }
            if (r13 == 0) goto L_0x0281
            com.instagram.common.session.UserSession r12 = r6.A0p()     // Catch:{ all -> 0x03fe }
            r2 = 39
            X.PmE r3 = new X.PmE     // Catch:{ all -> 0x03fe }
            r3.<init>(r6, r2)     // Catch:{ all -> 0x03fe }
            X.UoA r2 = new X.UoA     // Catch:{ all -> 0x03fe }
            r2.<init>(r3, r12)     // Catch:{ all -> 0x03fe }
            r13.AAD(r2)     // Catch:{ all -> 0x03fe }
        L_0x034a:
            com.instagram.common.session.UserSession r15 = r6.A0p()     // Catch:{ all -> 0x03fe }
            java.lang.Object r12 = r21.getValue()     // Catch:{ all -> 0x03fe }
            X.2rL r12 = (X.C231272rL) r12     // Catch:{ all -> 0x03fe }
            com.instagram.common.session.UserSession r13 = r6.A0p()     // Catch:{ all -> 0x03fe }
            r2 = 36592318203429307(0x820085000601bb, double:3.2044676050627755E-306)
            long r2 = X.182.A01(r5, r13, r2)     // Catch:{ all -> 0x03fe }
            int r13 = (int) r2     // Catch:{ all -> 0x03fe }
            X.0eM r2 = r6.A1e     // Catch:{ all -> 0x03fe }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x03fe }
            X.2mt r2 = (X.C229132mt) r2     // Catch:{ all -> 0x03fe }
            r21 = r7
            r16 = r2
            r17 = r12
            r18 = r9
            r19 = r10
            r20 = r13
            X.TsD r3 = X.C14293TtR.A00(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x03fe }
            r6.A0o = r3     // Catch:{ all -> 0x03fe }
            X.3As r2 = r6.A0n     // Catch:{ all -> 0x03fe }
            if (r2 == 0) goto L_0x0281
            r2.AAD(r3)     // Catch:{ all -> 0x03fe }
            X.3As r3 = r6.A0n     // Catch:{ all -> 0x03fe }
            if (r3 == 0) goto L_0x0281
            X.0eM r2 = r6.A28     // Catch:{ all -> 0x03fe }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x03fe }
            X.3je r2 = (X.C249383je) r2     // Catch:{ all -> 0x03fe }
            r3.AAD(r2)     // Catch:{ all -> 0x03fe }
            androidx.fragment.app.FragmentActivity r12 = r8.getActivity()     // Catch:{ all -> 0x03fe }
            if (r12 == 0) goto L_0x03b1
            com.instagram.common.session.UserSession r10 = r6.A0p()     // Catch:{ all -> 0x03fe }
            r2 = 36317560555443537(0x8106a100041551, double:3.030709762116329E-306)
            boolean r2 = X.182.A06(r5, r10, r2)     // Catch:{ all -> 0x03fe }
            if (r2 == 0) goto L_0x03b1
            X.2ff r3 = X.C226112fe.A0B     // Catch:{ all -> 0x03fe }
            X.WfJ r2 = new X.WfJ     // Catch:{ all -> 0x03fe }
            r2.<init>(r0)     // Catch:{ all -> 0x03fe }
            r3.A04(r12, r2, r4)     // Catch:{ all -> 0x03fe }
        L_0x03b1:
            X.C66633Ma2.A0G(r6)     // Catch:{ all -> 0x03fe }
            X.Mgq r2 = X.C66633Ma2.A04(r6)     // Catch:{ all -> 0x03fe }
            X.34p r2 = r2.A03     // Catch:{ all -> 0x03fe }
            r2.A05()     // Catch:{ all -> 0x03fe }
            X.0eM r2 = r6.A2N     // Catch:{ all -> 0x03fe }
            java.lang.Object r12 = r2.getValue()     // Catch:{ all -> 0x03fe }
            X.MgA r12 = (X.C66976MgA) r12     // Catch:{ all -> 0x03fe }
            if (r12 == 0) goto L_0x03e3
            com.instagram.common.session.UserSession r10 = r12.A06     // Catch:{ all -> 0x03fe }
            r2 = 36326451137492747(0x810eb70000370b, double:3.03633220200375E-306)
            boolean r2 = X.182.A06(r5, r10, r2)     // Catch:{ all -> 0x03fe }
            if (r2 == 0) goto L_0x03e3
            X.0h9 r2 = new X.0h9     // Catch:{ all -> 0x03fe }
            r2.<init>(r12)     // Catch:{ all -> 0x03fe }
            r12.A01 = r2     // Catch:{ all -> 0x03fe }
            r12.A00 = r2     // Catch:{ all -> 0x03fe }
            goto L_0x03e3
        L_0x03de:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x03fd
        L_0x03e3:
            r2 = 311414009(0x128fccf9, float:9.075098E-28)
            X.0fh.A00(r2)
            X.2lJ r3 = r6.A1R
            if (r3 == 0) goto L_0x0409
            X.3As r2 = r6.A0n
            if (r2 != 0) goto L_0x0406
            X.0qQ.A0F(r14)
            goto L_0x04a4
        L_0x03f6:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03fe }
            r1.<init>(r0)     // Catch:{ all -> 0x03fe }
        L_0x03fd:
            throw r1     // Catch:{ all -> 0x03fe }
        L_0x03fe:
            r1 = move-exception
            r0 = 1832104892(0x6d33b3bc, float:3.475944E27)
            X.0fh.A00(r0)
            throw r1
        L_0x0406:
            r2.AAD(r3)
        L_0x0409:
            boolean r2 = X.C66633Ma2.A0l(r6)
            if (r2 == 0) goto L_0x0470
            java.lang.String r2 = "null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner"
            X.0qQ.A0C(r8, r2)
            X.07f r8 = r8.getViewModelStore()
            com.instagram.common.session.UserSession r2 = r6.A0p()
            X.Mpa r5 = new X.Mpa
            r5.<init>(r2)
            X.2YP r2 = X.AnonymousClass2YP.A00
            X.2YN r3 = new X.2YN
            r3.<init>(r5, r8, r2)
            java.lang.Class<X.Mpb> r2 = X.C67541Mpb.class
            X.2YL r3 = r3.A00(r2)
            X.Mpb r3 = (X.C67541Mpb) r3
            r6.A0k = r3
            if (r3 == 0) goto L_0x0446
            X.6oS r8 = X.C318116oQ.A00(r3)
            r2 = 31
            X.MGt r5 = new X.MGt
            r5.<init>((java.lang.Object) r3, (X.AnonymousClass4D7) r9, (int) r2)
            X.19B r3 = X.19B.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.1Eo.A03(r2, r3, r5, r8)
        L_0x0446:
            X.Mpb r2 = r6.A0k
            if (r2 == 0) goto L_0x0470
            X.7Up r3 = r2.A03
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            boolean r2 = r3.A01()
            if (r2 == 0) goto L_0x0470
            X.7Uz r13 = r3.A02
            java.util.concurrent.atomic.AtomicBoolean r2 = r13.A02
            boolean r2 = r2.getAndSet(r7)
            if (r2 != 0) goto L_0x0470
            X.4Cq r3 = r13.A03
            r17 = 6
            X.9KZ r12 = new X.9KZ
            r14 = r5
            r15 = r9
            r16 = r9
            r12.<init>(r13, r14, r15, r16, r17)
            X.19B r2 = X.19B.A00
            X.1Eo.A03(r5, r2, r12, r3)
        L_0x0470:
            com.instagram.common.session.UserSession r6 = A01(r1)
            X.0qQ.A0B(r6, r4)
            X.0Tu r5 = X.0Tu.A05
            r2 = 36323358761626734(0x810be700092c6e, double:3.034376571054085E-306)
            boolean r2 = X.182.A06(r5, r6, r2)
            if (r2 == 0) goto L_0x049b
            X.07U r7 = X.07U.A05
            X.07Z r6 = r1.getViewLifecycleOwner()
            X.0xx r3 = X.AnonymousClass07a.A00(r6)
            r10 = 17
            X.MHI r5 = new X.MHI
            r8 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            X.19B r2 = X.19B.A00
            X.1Eo.A05(r2, r5, r3)
        L_0x049b:
            X.MfT r5 = r1.A02
            if (r5 != 0) goto L_0x04a9
            java.lang.String r0 = "actionBarController"
        L_0x04a1:
            X.0qQ.A0F(r0)
        L_0x04a4:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x04a9:
            X.0qQ.A0B(r0, r4)
            com.instagram.common.session.UserSession r2 = r5.A07
            boolean r2 = X.C67057MhU.A01(r2)
            if (r2 != 0) goto L_0x04d9
            r3 = 2131427520(0x7f0b00c0, float:1.8476659E38)
            android.view.View r2 = r0.requireViewById(r3)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            r2.inflate()
            android.view.View r3 = r0.requireViewById(r3)
            X.0qQ.A07(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            X.Mhw r2 = new X.Mhw
            r2.<init>(r5)
            X.2dZ r3 = X.2dY.A01(r2, r3)
            r5.A00 = r3
            X.4DS r2 = r5.A03
            r3.A0X(r2)
        L_0x04d9:
            X.Mj8 r6 = r1.A03
            if (r6 != 0) goto L_0x04e0
            java.lang.String r0 = "actionBarHost"
            goto L_0x04a1
        L_0x04e0:
            com.instagram.common.session.UserSession r2 = r6.A01
            boolean r2 = X.C67057MhU.A01(r2)
            if (r2 == 0) goto L_0x0580
            r2 = 2131427520(0x7f0b00c0, float:1.8476659E38)
            android.view.View r3 = r0.requireViewById(r2)
            X.0qQ.A07(r3)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            r2 = 2131626043(0x7f0e083b, float:1.8879311E38)
            r3.setLayoutResource(r2)
            android.view.View r5 = r3.inflate()
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.igds.components.actionbar.IgdsActionBar"
            X.0qQ.A0C(r5, r2)
            com.instagram.igds.components.actionbar.IgdsActionBar r5 = (com.instagram.igds.components.actionbar.IgdsActionBar) r5
            android.widget.TextView r10 = r5.A03
            android.content.res.Resources r8 = r5.getResources()
            r2 = 2131165305(0x7f070079, float:1.7944823E38)
            int r7 = r8.getDimensionPixelSize(r2)
            r2 = 2131165317(0x7f070085, float:1.7944848E38)
            int r3 = r8.getDimensionPixelSize(r2)
            r2 = 2131165585(0x7f070191, float:1.7945391E38)
            int r2 = r8.getDimensionPixelSize(r2)
            r10.setAutoSizeTextTypeUniformWithConfiguration(r7, r3, r2, r4)
            X.Mj7 r3 = r6.A02
            X.MeY r2 = r3.A02
            X.0Ud r2 = r2.A08
            java.lang.Object r2 = r2.getValue()
            X.MeZ r2 = (X.MeZ) r2
            if (r2 == 0) goto L_0x0563
            X.JwM r4 = X.C67149Mj7.A00(r2, r3)
            r7 = 1
            boolean r2 = com.facebook.systrace.Systrace.A0E(r7)
            if (r2 == 0) goto L_0x0545
            r3 = -1665963419(0xffffffff9cb36a65, float:-1.1872729E-21)
            java.lang.String r2 = "PrebindActionBar"
            X.0fS.A01(r2, r3)
        L_0x0545:
            r5.A01(r4)     // Catch:{ all -> 0x0549 }
            goto L_0x0557
        L_0x0549:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L_0x0612
            r0 = 1569063290(0x5d86017a, float:1.20701665E18)
            X.0fS.A00(r0)
            throw r1
        L_0x0557:
            boolean r2 = com.facebook.systrace.Systrace.A0E(r7)
            if (r2 == 0) goto L_0x0563
            r2 = 773806610(0x2e1f5a12, float:3.6232413E-11)
            X.0fS.A00(r2)
        L_0x0563:
            androidx.fragment.app.Fragment r2 = r6.A00
            X.07U r14 = X.07U.A05
            X.07Z r13 = r2.getViewLifecycleOwner()
            X.0xx r3 = X.AnonymousClass07a.A00(r13)
            r18 = 27
            X.MHF r12 = new X.MHF
            r15 = r5
            r16 = r6
            r17 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.19B r2 = X.19B.A00
            X.1Eo.A05(r2, r12, r3)
        L_0x0580:
            X.AnonymousClass386.A00()
            java.lang.Integer r17 = X.AnonymousClass05K.A01
            android.content.Context r20 = r1.requireContext()
            com.instagram.common.session.UserSession r5 = A01(r1)
            androidx.fragment.app.FragmentActivity r13 = r1.requireActivity()
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r3 = r1.A01
            java.lang.String r4 = "Required value was null."
            if (r3 == 0) goto L_0x0607
            r2 = 2131435549(0x7f0b201d, float:1.8492943E38)
            android.view.View r14 = r3.requireViewById(r2)
            X.0qQ.A07(r14)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r3 = r1.A01
            if (r3 == 0) goto L_0x05fe
            r2 = 2131437281(0x7f0b26e1, float:1.8496456E38)
            android.view.View r6 = r3.requireViewById(r2)
            X.0qQ.A07(r6)
            android.view.ViewStub r6 = (android.view.ViewStub) r6
            r2 = 10
            X.9M3 r4 = new X.9M3
            r4.<init>(r2, r1, r0)
            r3 = 11
            X.9M3 r2 = new X.9M3
            r2.<init>(r3, r1, r0)
            r0 = 2
            X.0qQ.A0B(r5, r0)
            r0 = 5
            X.0qQ.A0B(r6, r0)
            X.388 r12 = new X.388
            r15 = r6
            r16 = r5
            r18 = r4
            r19 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            X.38U r0 = new X.38U
            r21 = r1
            r22 = r5
            r23 = r12
            r24 = r17
            r19 = r0
            r19.<init>(r20, r21, r22, r23, r24)
            r1.A07 = r0
            X.Ma2 r0 = r1.A05
            if (r0 == 0) goto L_0x05f5
            X.Mi9 r0 = r0.A0u()
            if (r0 == 0) goto L_0x05f5
            X.34p r0 = r0.A03
            if (r0 == 0) goto L_0x05f5
            r0.A05()
        L_0x05f5:
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r1 = r1.A01
            r0 = -1300987733(0xffffffffb27480ab, float:-1.4231925E-8)
            X.AnonymousClass0fD.A09(r0, r11)
            return r1
        L_0x05fe:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r4)
            r0 = 1809754336(0x6bdea8e0, float:5.3835804E26)
            goto L_0x060f
        L_0x0607:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r4)
            r0 = -1943088613(0xffffffff8c2ed21b, float:-1.3467699E-31)
        L_0x060f:
            X.AnonymousClass0fD.A09(r0, r11)
        L_0x0612:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273624mt.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b1, code lost:
        X.1zE.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDestroy() {
        /*
            r8 = this;
            r0 = 813233226(0x3078f44a, float:9.056903E-10)
            int r3 = X.AnonymousClass0fD.A02(r0)
            super.onDestroy()
            X.1Ng r2 = r8.A00
            if (r2 == 0) goto L_0x0015
            java.lang.Class<X.2Cy> r1 = X.2Cy.class
            X.DcB r0 = r8.A0N
            r2.A02(r0, r1)
        L_0x0015:
            X.14i.A06(r8)
            X.Ma2 r5 = r8.A05
            if (r5 == 0) goto L_0x01b8
            java.lang.String r0 = "DirectInboxController.onDestroy"
            X.0lp r4 = X.0lq.A00(r0)
            X.0eM r7 = r5.A22     // Catch:{ all -> 0x01ae }
            java.lang.Object r2 = r7.getValue()     // Catch:{ all -> 0x01ae }
            X.1Ng r2 = (X.1Ng) r2     // Catch:{ all -> 0x01ae }
            java.lang.Class<X.AXy> r1 = X.C40259AXy.class
            X.0eM r0 = r5.A1w     // Catch:{ all -> 0x01ae }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01ae }
            X.1wn r0 = (X.1wn) r0     // Catch:{ all -> 0x01ae }
            r2.A02(r0, r1)     // Catch:{ all -> 0x01ae }
            java.lang.Class<X.2Cy> r1 = X.2Cy.class
            X.1wn r0 = r5.A0V     // Catch:{ all -> 0x01ae }
            r6 = 0
            if (r0 != 0) goto L_0x0048
            java.lang.String r0 = "userUpdatedListener"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x01ae }
        L_0x0043:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x01ae }
            throw r0     // Catch:{ all -> 0x01ae }
        L_0x0048:
            r2.A02(r0, r1)     // Catch:{ all -> 0x01ae }
            java.lang.Class<X.36g> r1 = X.C2370836g.class
            X.1wn r0 = r5.A0U     // Catch:{ all -> 0x01ae }
            if (r0 != 0) goto L_0x0057
            java.lang.String r0 = "userFollowStatusUpdatedListener"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x01ae }
            goto L_0x0043
        L_0x0057:
            r2.A02(r0, r1)     // Catch:{ all -> 0x01ae }
            java.lang.Class<X.5gP> r1 = X.C291035gP.class
            X.1wn r0 = r5.A0L     // Catch:{ all -> 0x01ae }
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = "awaitingIrisDeltasUpdatedEventListener"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x01ae }
            goto L_0x0043
        L_0x0066:
            r2.A02(r0, r1)     // Catch:{ all -> 0x01ae }
            java.lang.Class<X.Mba> r1 = X.C66729Mba.class
            X.1wn r0 = r5.A0P     // Catch:{ all -> 0x01ae }
            r2.A02(r0, r1)     // Catch:{ all -> 0x01ae }
            java.lang.Class<X.Osm> r1 = X.C71904Osm.class
            X.1wn r0 = r5.A0O     // Catch:{ all -> 0x01ae }
            if (r0 != 0) goto L_0x007c
            java.lang.String r0 = "irisErrorStatusUpdatedListener"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x01ae }
            goto L_0x0043
        L_0x007c:
            r2.A02(r0, r1)     // Catch:{ all -> 0x01ae }
            java.lang.Class<X.Mlz> r1 = X.C67323Mlz.class
            X.1wn r0 = r5.A0Q     // Catch:{ all -> 0x01ae }
            if (r0 != 0) goto L_0x008b
            java.lang.String r0 = "latestReelMediaUpdatedEventListener"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x01ae }
            goto L_0x0043
        L_0x008b:
            r2.A02(r0, r1)     // Catch:{ all -> 0x01ae }
            java.lang.Class<X.OsU> r1 = X.C71886OsU.class
            X.1wn r0 = r5.A0M     // Catch:{ all -> 0x01ae }
            if (r0 != 0) goto L_0x009a
            java.lang.String r0 = "generalFolderStatusUpdatedListener"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x01ae }
            goto L_0x0043
        L_0x009a:
            r2.A02(r0, r1)     // Catch:{ all -> 0x01ae }
            java.lang.Class<X.2Kg> r1 = X.C70222Kg.class
            X.0eM r0 = r5.A1g     // Catch:{ all -> 0x01ae }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01ae }
            X.1wn r0 = (X.1wn) r0     // Catch:{ all -> 0x01ae }
            r2.A02(r0, r1)     // Catch:{ all -> 0x01ae }
            java.lang.Class<X.5g2> r1 = X.C290835g2.class
            X.0eM r0 = r5.A2f     // Catch:{ all -> 0x01ae }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01ae }
            X.1wn r0 = (X.1wn) r0     // Catch:{ all -> 0x01ae }
            r2.A02(r0, r1)     // Catch:{ all -> 0x01ae }
            java.lang.Object r2 = r7.getValue()     // Catch:{ all -> 0x01ae }
            X.1Ng r2 = (X.1Ng) r2     // Catch:{ all -> 0x01ae }
            java.lang.Class<X.5gQ> r1 = X.C291045gQ.class
            X.1wn r0 = r5.A0T     // Catch:{ all -> 0x01ae }
            if (r0 != 0) goto L_0x00ca
            java.lang.String r0 = "subIrisUpdateEventListener"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x01ae }
            goto L_0x0043
        L_0x00ca:
            r2.A02(r0, r1)     // Catch:{ all -> 0x01ae }
            java.lang.Object r2 = r7.getValue()     // Catch:{ all -> 0x01ae }
            X.1Ng r2 = (X.1Ng) r2     // Catch:{ all -> 0x01ae }
            java.lang.Class<X.5lR> r1 = X.C293845lR.class
            X.1wn r0 = r5.A0N     // Catch:{ all -> 0x01ae }
            if (r0 != 0) goto L_0x00e0
            java.lang.String r0 = "initialSnapshotUpdateEvent"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x01ae }
            goto L_0x0043
        L_0x00e0:
            r2.A02(r0, r1)     // Catch:{ all -> 0x01ae }
            X.1wn r0 = r5.A0S     // Catch:{ all -> 0x01ae }
            if (r0 == 0) goto L_0x00fd
            java.lang.Object r2 = r7.getValue()     // Catch:{ all -> 0x01ae }
            X.1Ng r2 = (X.1Ng) r2     // Catch:{ all -> 0x01ae }
            java.lang.Class<X.OsZ> r1 = X.C71891OsZ.class
            X.1wn r0 = r5.A0S     // Catch:{ all -> 0x01ae }
            if (r0 != 0) goto L_0x00fa
            java.lang.String r0 = "secureThreadsInitialLoadingStartedEventListener"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x01ae }
            goto L_0x0043
        L_0x00fa:
            r2.A02(r0, r1)     // Catch:{ all -> 0x01ae }
        L_0x00fd:
            X.1wn r0 = r5.A0R     // Catch:{ all -> 0x01ae }
            if (r0 == 0) goto L_0x0117
            java.lang.Object r2 = r7.getValue()     // Catch:{ all -> 0x01ae }
            X.1Ng r2 = (X.1Ng) r2     // Catch:{ all -> 0x01ae }
            java.lang.Class<X.MhP> r1 = X.C67052MhP.class
            X.1wn r0 = r5.A0R     // Catch:{ all -> 0x01ae }
            if (r0 != 0) goto L_0x0114
            java.lang.String r0 = "secureThreadsInitialLoadingEndedEventListener"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x01ae }
            goto L_0x0043
        L_0x0114:
            r2.A02(r0, r1)     // Catch:{ all -> 0x01ae }
        L_0x0117:
            com.instagram.common.session.UserSession r1 = r5.A0p()     // Catch:{ all -> 0x01ae }
            X.0eM r0 = r5.A21     // Catch:{ all -> 0x01ae }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01ae }
            X.2J4 r0 = (X.AnonymousClass2J4) r0     // Catch:{ all -> 0x01ae }
            X.2J7.A02(r1, r0)     // Catch:{ all -> 0x01ae }
            X.2Dm r0 = r5.A0v()     // Catch:{ all -> 0x01ae }
            X.2Dr r0 = (X.2Dr) r0     // Catch:{ all -> 0x01ae }
            r0.A00 = r6     // Catch:{ all -> 0x01ae }
            X.0eM r0 = r5.A2V     // Catch:{ all -> 0x01ae }
            r0.getValue()     // Catch:{ all -> 0x01ae }
            X.4DH r1 = r5.A1J     // Catch:{ all -> 0x01ae }
            X.Mj5 r0 = r5.A0Z     // Catch:{ all -> 0x01ae }
            if (r0 != 0) goto L_0x0140
            java.lang.String r0 = "directIceBreakerSettingFragmentLifecycleListener"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x01ae }
            goto L_0x0043
        L_0x0140:
            r1.unregisterLifecycleListener(r0)     // Catch:{ all -> 0x01ae }
            X.0eM r0 = r5.A1c     // Catch:{ all -> 0x01ae }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01ae }
            X.Mhv r0 = (X.C67080Mhv) r0     // Catch:{ all -> 0x01ae }
            if (r0 == 0) goto L_0x0151
            X.2B9 r0 = r0.A01     // Catch:{ all -> 0x01ae }
            r0.A00 = r6     // Catch:{ all -> 0x01ae }
        L_0x0151:
            com.instagram.common.session.UserSession r0 = r5.A0p()     // Catch:{ all -> 0x01ae }
            X.3Wh r0 = X.C242853Wg.A00(r0)     // Catch:{ all -> 0x01ae }
            r0.A00(r5)     // Catch:{ all -> 0x01ae }
            X.0eM r0 = r5.A1h     // Catch:{ all -> 0x01ae }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01ae }
            X.Pvy r0 = (X.C74503Pvy) r0     // Catch:{ all -> 0x01ae }
            X.Pvz r1 = r0.BzE()     // Catch:{ all -> 0x01ae }
            boolean r0 = r1 instanceof X.C67014Mgn     // Catch:{ all -> 0x01ae }
            if (r0 == 0) goto L_0x0178
            X.Mgn r1 = (X.C67014Mgn) r1     // Catch:{ all -> 0x01ae }
            if (r1 == 0) goto L_0x0178
            X.Mau r0 = r1.A07     // Catch:{ all -> 0x01ae }
            r0.A01 = r6     // Catch:{ all -> 0x01ae }
            r0.A03 = r6     // Catch:{ all -> 0x01ae }
            r0.A00 = r6     // Catch:{ all -> 0x01ae }
        L_0x0178:
            X.66d r0 = r5.A0G     // Catch:{ all -> 0x01ae }
            if (r0 == 0) goto L_0x0190
            com.instagram.common.session.UserSession r1 = r5.A0p()     // Catch:{ all -> 0x01ae }
            r0 = 1
            com.facebook.msys.mci.AccountSession r0 = X.C300345wy.A02(r1, r0)     // Catch:{ all -> 0x01ae }
            com.facebook.msys.mci.SessionedNotificationCenter r2 = r0.getSessionedNotificationCenter()     // Catch:{ all -> 0x01ae }
            X.66d r1 = r5.A0G     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = "MEMOfflineHandlingCompletionNotification"
            r2.removeObserver(r1, r0, r6)     // Catch:{ all -> 0x01ae }
        L_0x0190:
            com.instagram.common.session.UserSession r0 = r5.A0p()     // Catch:{ all -> 0x01ae }
            boolean r0 = X.2El.A0J(r0)     // Catch:{ all -> 0x01ae }
            if (r0 == 0) goto L_0x01b5
            X.0gd r2 = X.AnonymousClass0gd.A00()     // Catch:{ all -> 0x01ae }
            X.0eM r0 = r5.A2J     // Catch:{ all -> 0x01ae }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x01ae }
            X.0gc r1 = (X.0gc) r1     // Catch:{ all -> 0x01ae }
            if (r1 == 0) goto L_0x01b5
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.A00     // Catch:{ all -> 0x01ae }
            r0.remove(r1)     // Catch:{ all -> 0x01ae }
            goto L_0x01b5
        L_0x01ae:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01b0 }
        L_0x01b0:
            r0 = move-exception
            X.1zE.A00(r4, r1)
            throw r0
        L_0x01b5:
            r4.close()
        L_0x01b8:
            X.MfT r0 = r8.A02
            if (r0 != 0) goto L_0x01c6
            java.lang.String r0 = "actionBarController"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01c6:
            r2 = 0
            r0.A01 = r2
            X.Mkx r0 = r8.A06
            if (r0 == 0) goto L_0x01da
            X.Moq r1 = r0.A01
            if (r1 == 0) goto L_0x01da
            X.7JI r0 = r1.A01
            if (r0 == 0) goto L_0x01d8
            r0.A0E()
        L_0x01d8:
            r1.A01 = r2
        L_0x01da:
            r0 = -384274733(0xffffffffe9186ed3, float:-1.1517505E25)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273624mt.onDestroy():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01a1, code lost:
        X.1zE.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01a4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDestroyView() {
        /*
            r10 = this;
            r0 = -41206224(0xfffffffffd8b3e30, float:-2.3135698E37)
            int r4 = X.AnonymousClass0fD.A02(r0)
            X.9HB r0 = r10.A0Q
            r0.A01()
            X.38U r0 = r10.A07
            r5 = 0
            if (r0 == 0) goto L_0x0016
            r0.A01()
            r10.A07 = r5
        L_0x0016:
            super.onDestroyView()
            X.Ma2 r7 = r10.A05
            if (r7 == 0) goto L_0x01cd
            java.lang.String r0 = "DirectInboxController.onDestroyView"
            X.0lp r6 = X.0lq.A00(r0)
            X.3As r0 = r7.A0n     // Catch:{ all -> 0x019e }
            java.lang.String r1 = "inboxViewProxy"
            if (r0 == 0) goto L_0x018e
            r0.AHq()     // Catch:{ all -> 0x019e }
            X.3As r0 = r7.A0n     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x018e
            r0.ENw(r5)     // Catch:{ all -> 0x019e }
            X.0eM r0 = r7.A2H     // Catch:{ all -> 0x019e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x019e }
            X.4gS r0 = (X.C270264gS) r0     // Catch:{ all -> 0x019e }
            r3 = 0
            r0.A00 = r3     // Catch:{ all -> 0x019e }
            r0.A01 = r3     // Catch:{ all -> 0x019e }
            X.0eM r0 = r7.A2B     // Catch:{ all -> 0x019e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x019e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x019e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x0053
            java.util.HashSet r0 = r7.A1Z     // Catch:{ all -> 0x019e }
            r0.clear()     // Catch:{ all -> 0x019e }
        L_0x0053:
            java.util.HashMap r0 = r7.A1U     // Catch:{ all -> 0x019e }
            r0.clear()     // Catch:{ all -> 0x019e }
            java.util.HashMap r0 = r7.A1W     // Catch:{ all -> 0x019e }
            r0.clear()     // Catch:{ all -> 0x019e }
            r7.A0y()     // Catch:{ all -> 0x019e }
            android.util.Pair r0 = r7.A08     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x0196
            X.2cs r0 = (X.2cs) r0     // Catch:{ all -> 0x019e }
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A0D     // Catch:{ all -> 0x019e }
            r0.clear()     // Catch:{ all -> 0x019e }
            r7.A08 = r5     // Catch:{ all -> 0x019e }
        L_0x0071:
            com.instagram.common.session.UserSession r0 = r7.A0p()     // Catch:{ all -> 0x019e }
            boolean r0 = X.2El.A07(r0)     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x008a
            X.0eM r0 = r7.A1h     // Catch:{ all -> 0x019e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x019e }
            X.Pvy r0 = (X.C74503Pvy) r0     // Catch:{ all -> 0x019e }
            X.PxE r0 = r0.B6g()     // Catch:{ all -> 0x019e }
            r0.cancel()     // Catch:{ all -> 0x019e }
        L_0x008a:
            X.0eM r1 = r7.A1h     // Catch:{ all -> 0x019e }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x019e }
            X.Pvy r0 = (X.C74503Pvy) r0     // Catch:{ all -> 0x019e }
            X.PxF r0 = r0.C6W()     // Catch:{ all -> 0x019e }
            r0.cancel()     // Catch:{ all -> 0x019e }
            X.0eM r0 = r7.A2t     // Catch:{ all -> 0x019e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x019e }
            X.Mbh r0 = (X.C66736Mbh) r0     // Catch:{ all -> 0x019e }
            X.1a8 r0 = r0.A0A     // Catch:{ all -> 0x019e }
            r0.A01()     // Catch:{ all -> 0x019e }
            X.0eM r0 = r7.A2V     // Catch:{ all -> 0x019e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x019e }
            X.2qT r0 = (X.C230882qT) r0     // Catch:{ all -> 0x019e }
            r0.onDestroyView()     // Catch:{ all -> 0x019e }
            android.os.Handler r0 = r7.A1I     // Catch:{ all -> 0x019e }
            r0.removeCallbacksAndMessages(r5)     // Catch:{ all -> 0x019e }
            X.0eM r0 = r7.A1v     // Catch:{ all -> 0x019e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x019e }
            X.34Y r0 = (X.AnonymousClass34Y) r0     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x00c5
            java.util.Set r0 = r0.A02     // Catch:{ all -> 0x019e }
            r0.clear()     // Catch:{ all -> 0x019e }
        L_0x00c5:
            r7.A0p = r5     // Catch:{ all -> 0x019e }
            r7.A0A = r5     // Catch:{ all -> 0x019e }
            r7.A09 = r5     // Catch:{ all -> 0x019e }
            X.7fy r0 = r7.A0s     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x00d2
            r0.DDU()     // Catch:{ all -> 0x019e }
        L_0x00d2:
            r7.A0s = r5     // Catch:{ all -> 0x019e }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x019e }
            X.Pvy r0 = (X.C74503Pvy) r0     // Catch:{ all -> 0x019e }
            X.Pw5 r0 = r0.BNZ()     // Catch:{ all -> 0x019e }
            r0.stop()     // Catch:{ all -> 0x019e }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x019e }
            X.Pvy r0 = (X.C74503Pvy) r0     // Catch:{ all -> 0x019e }
            X.Pwb r0 = r0.B4p()     // Catch:{ all -> 0x019e }
            r0.stop()     // Catch:{ all -> 0x019e }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x019e }
            X.Pvy r0 = (X.C74503Pvy) r0     // Catch:{ all -> 0x019e }
            X.PvH r0 = r0.BbU()     // Catch:{ all -> 0x019e }
            r0.stop()     // Catch:{ all -> 0x019e }
            X.0eM r0 = r7.A2D     // Catch:{ all -> 0x019e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x019e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x019e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x015c
            com.instagram.common.session.UserSession r0 = r7.A0p()     // Catch:{ all -> 0x019e }
            X.MoE r2 = X.C67039MhC.A00(r0)     // Catch:{ all -> 0x019e }
            X.0eM r0 = r2.A08     // Catch:{ all -> 0x019e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x019e }
            X.OTr r0 = (X.C70970OTr) r0     // Catch:{ all -> 0x019e }
            X.0eM r0 = r0.A08     // Catch:{ all -> 0x019e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x019e }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x019e }
            X.1a8 r0 = (X.1a8) r0     // Catch:{ all -> 0x019e }
            r0.A01()     // Catch:{ all -> 0x019e }
            X.0eM r0 = r2.A04     // Catch:{ all -> 0x019e }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x019e }
            X.ONk r1 = (X.C70838ONk) r1     // Catch:{ all -> 0x019e }
            X.OHj r0 = r1.A05     // Catch:{ all -> 0x019e }
            X.0eM r0 = r0.A07     // Catch:{ all -> 0x019e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x019e }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x019e }
            X.1a8 r0 = (X.1a8) r0     // Catch:{ all -> 0x019e }
            r0.A01()     // Catch:{ all -> 0x019e }
            X.OTo r0 = r1.A04     // Catch:{ all -> 0x019e }
            X.0eM r0 = r0.A07     // Catch:{ all -> 0x019e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x019e }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x019e }
            X.1a8 r0 = (X.1a8) r0     // Catch:{ all -> 0x019e }
            r0.A01()     // Catch:{ all -> 0x019e }
            X.0eM r0 = r2.A05     // Catch:{ all -> 0x019e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x019e }
            X.OBN r0 = (X.OBN) r0     // Catch:{ all -> 0x019e }
            X.1a8 r0 = r0.A00     // Catch:{ all -> 0x019e }
            r0.A01()     // Catch:{ all -> 0x019e }
        L_0x015c:
            X.0eM r0 = r7.A2N     // Catch:{ all -> 0x019e }
            java.lang.Object r9 = r0.getValue()     // Catch:{ all -> 0x019e }
            X.MgA r9 = (X.C66976MgA) r9     // Catch:{ all -> 0x019e }
            if (r9 == 0) goto L_0x0182
            com.instagram.common.session.UserSession r8 = r9.A06     // Catch:{ all -> 0x019e }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x019e }
            r0 = 36326451137492747(0x810eb70000370b, double:3.03633220200375E-306)
            boolean r0 = X.182.A06(r2, r8, r0)     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x0182
            X.0h9 r2 = r9.A01     // Catch:{ all -> 0x019e }
            X.07U r1 = r2.A00     // Catch:{ all -> 0x019e }
            X.07U r0 = X.07U.A03     // Catch:{ all -> 0x019e }
            if (r1 == r0) goto L_0x0182
            X.07U r0 = X.07U.A02     // Catch:{ all -> 0x019e }
            r2.A0C(r0)     // Catch:{ all -> 0x019e }
        L_0x0182:
            X.0ng r1 = r7.A0Y     // Catch:{ all -> 0x019e }
            if (r1 == 0) goto L_0x01a5
            X.0no r0 = X.0no.A00()     // Catch:{ all -> 0x019e }
            r0.A02(r1)     // Catch:{ all -> 0x019e }
            goto L_0x01a5
        L_0x018e:
            X.0qQ.A0F(r1)     // Catch:{ all -> 0x019e }
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x019d
        L_0x0196:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x019e }
            r1.<init>(r0)     // Catch:{ all -> 0x019e }
        L_0x019d:
            throw r1     // Catch:{ all -> 0x019e }
        L_0x019e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01a0 }
        L_0x01a0:
            r0 = move-exception
            X.1zE.A00(r6, r1)
            throw r0
        L_0x01a5:
            r6.close()
            boolean r0 = X.C66633Ma2.A0l(r7)
            if (r0 == 0) goto L_0x01cd
            X.Mpb r0 = r7.A0k
            if (r0 == 0) goto L_0x01cd
            X.7Up r1 = r0.A03
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x01cd
            X.7Uz r1 = r1.A02
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A02
            boolean r0 = r0.getAndSet(r3)
            if (r0 == 0) goto L_0x01cd
            X.4Cq r0 = r1.A03
            X.4Cc r0 = r0.ArX()
            X.AnonymousClass5H8.A02(r0)
        L_0x01cd:
            X.MfT r3 = r10.A02
            if (r3 != 0) goto L_0x01db
            java.lang.String r0 = "actionBarController"
        L_0x01d3:
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x01db:
            com.instagram.common.session.UserSession r0 = r3.A07
            boolean r0 = X.C67057MhU.A01(r0)
            if (r0 != 0) goto L_0x01ec
            X.1xC r2 = X.1xC.A01
            java.lang.Class<X.3H2> r1 = X.AnonymousClass3H2.class
            X.1wn r0 = r3.A06
            r2.A03(r0, r1)
        L_0x01ec:
            X.MeY r3 = r10.A04
            if (r3 != 0) goto L_0x01f3
            java.lang.String r0 = "actionBarRepository"
            goto L_0x01d3
        L_0x01f3:
            com.instagram.common.session.UserSession r0 = r3.A06
            boolean r0 = X.C67057MhU.A01(r0)
            if (r0 == 0) goto L_0x0204
            X.1xC r2 = X.1xC.A01
            java.lang.Class<X.3H2> r1 = X.AnonymousClass3H2.class
            X.1wn r0 = r3.A05
            r2.A03(r0, r1)
        L_0x0204:
            X.2gr r1 = X.C67300Mla.A01
            if (r1 == 0) goto L_0x021a
            android.animation.Animator$AnimatorListener r0 = X.C67300Mla.A00
            if (r0 == 0) goto L_0x021a
            r1.stop()
            X.2gr r1 = X.C67300Mla.A01
            if (r1 == 0) goto L_0x021a
            android.animation.Animator$AnimatorListener r0 = X.C67300Mla.A00
            if (r0 == 0) goto L_0x0227
            r1.EDp(r0)
        L_0x021a:
            X.C67300Mla.A01 = r5
            X.C67300Mla.A00 = r5
            r10.A0H = r5
            r0 = 1244280756(0x4a2a37b4, float:2788845.0)
            X.AnonymousClass0fD.A09(r0, r4)
            return
        L_0x0227:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273624mt.onDestroyView():void");
    }

    public final void onPause() {
        C66633Ma2 ma2;
        C228312lJ r0;
        int A022 = AnonymousClass0fD.A02(1533671550);
        C273624mt.super.onPause();
        2Zg r02 = this.A0C;
        if (r02 != null) {
            r02.C3W().A01(this);
        }
        if (!(!A06() || (ma2 = this.A05) == null || (r0 = ma2.A1R) == null)) {
            r0.onPause();
        }
        A03();
        C66633Ma2 ma22 = this.A05;
        if (ma22 != null) {
            ma22.A1B = false;
        }
        GVI gvi = this.A0I;
        if (gvi != null) {
            gvi.A00();
        }
        AnonymousClass0fD.A09(-1152062616, A022);
    }

    public final void onResume() {
        View view;
        View findViewById;
        Mi9 A0u;
        C2366634p r0;
        Mi9 A0u2;
        C2366634p r1;
        int A022 = AnonymousClass0fD.A02(-1748124861);
        C66633Ma2 ma2 = this.A05;
        if (!(ma2 == null || (A0u2 = ma2.A0u()) == null || (r1 = A0u2.A05) == null)) {
            r1.A08((String) null);
        }
        super.onResume();
        if (A06()) {
            A02();
        }
        2Zg r02 = this.A0C;
        if (r02 != null) {
            r02.C3W().A00(this);
        }
        C66633Ma2 ma22 = this.A05;
        if (!(ma22 == null || (A0u = ma22.A0u()) == null || (r0 = A0u.A05) == null)) {
            r0.A05();
        }
        GVI gvi = this.A0I;
        if (gvi != null) {
            gvi.A01();
        }
        if (!(!182.A06(0Tu.A06, A01(this), 36329393190092888L) || (view = this.mView) == null || (findViewById = view.findViewById(R.id.header_notification_settings_icon)) == null)) {
            int i = 8;
            if (!AnonymousClass0oH.A01(requireContext())) {
                i = 0;
            }
            findViewById.setVisibility(i);
        }
        AnonymousClass0fD.A09(-1591779454, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStart() {
        /*
            r5 = this;
            r0 = -800340148(0xffffffffd04bc74c, float:-1.36753439E10)
            int r2 = X.AnonymousClass0fD.A02(r0)
            X.C273624mt.super.onStart()
            X.Ma2 r4 = r5.A05
            if (r4 == 0) goto L_0x0042
            java.lang.String r0 = "DirectInboxController.onStart"
            X.0lp r3 = X.0lq.A00(r0)
            int r0 = r4.A03     // Catch:{ all -> 0x0038 }
            if (r0 <= 0) goto L_0x0029
            X.0wX r0 = X.C61170le.A00     // Catch:{ all -> 0x0038 }
            X.18g r1 = X.C638918c.A01(r0)     // Catch:{ all -> 0x0038 }
            X.0eM r0 = r4.A2i     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0038 }
            X.MiE r0 = (X.C67094MiE) r0     // Catch:{ all -> 0x0038 }
            r1.A0S(r0)     // Catch:{ all -> 0x0038 }
        L_0x0029:
            X.4DH r0 = r4.A1J     // Catch:{ all -> 0x0038 }
            android.view.View r1 = r0.mView     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x003f
            X.MgC r0 = new X.MgC     // Catch:{ all -> 0x0038 }
            r0.<init>(r4)     // Catch:{ all -> 0x0038 }
            r1.post(r0)     // Catch:{ all -> 0x0038 }
            goto L_0x003f
        L_0x0038:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            X.1zE.A00(r3, r1)
            throw r0
        L_0x003f:
            r3.close()
        L_0x0042:
            com.instagram.common.session.UserSession r0 = A01(r5)
            boolean r0 = X.AnonymousClass72B.A01(r0)
            if (r0 == 0) goto L_0x0059
            com.instagram.common.session.UserSession r0 = A01(r5)
            X.72C r0 = X.AnonymousClass72B.A00(r0)
            X.6W2 r0 = r0.A02
            r0.A03()
        L_0x0059:
            r0 = -393626338(0xffffffffe889bd1e, float:-5.2036224E24)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273624mt.onStart():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        X.1zE.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStop() {
        /*
            r7 = this;
            r0 = -925312385(0xffffffffc8d8da7f, float:-444115.97)
            int r5 = X.AnonymousClass0fD.A02(r0)
            X.C273624mt.super.onStop()
            X.Ma2 r6 = r7.A05
            if (r6 == 0) goto L_0x0039
            java.lang.String r0 = "DirectInboxController.onStop"
            X.0lp r4 = X.0lq.A00(r0)
            com.instagram.common.session.UserSession r3 = r6.A0p()     // Catch:{ all -> 0x002f }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x002f }
            r0 = 36325300086387546(0x810dab0002335a, double:3.03560427264991E-306)
            boolean r0 = X.182.A06(r2, r3, r0)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0028
            X.C66633Ma2.A0M(r6)     // Catch:{ all -> 0x002f }
        L_0x0028:
            int r0 = r6.A03     // Catch:{ all -> 0x002f }
            int r0 = r0 + 1
            r6.A03 = r0     // Catch:{ all -> 0x002f }
            goto L_0x0036
        L_0x002f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            X.1zE.A00(r4, r1)
            throw r0
        L_0x0036:
            r4.close()
        L_0x0039:
            com.instagram.common.session.UserSession r0 = A01(r7)
            boolean r0 = X.AnonymousClass72B.A01(r0)
            if (r0 == 0) goto L_0x004e
            com.instagram.common.session.UserSession r0 = A01(r7)
            X.72C r0 = X.AnonymousClass72B.A00(r0)
            r0.A00()
        L_0x004e:
            r0 = 2145725732(0x7fe52d24, float:NaN)
            X.AnonymousClass0fD.A09(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273624mt.onStop():void");
    }

    public final /* synthetic */ boolean Ccu(boolean z) {
        return false;
    }

    public final void Ene(2Zg r1) {
        this.A0C = r1;
    }
}
