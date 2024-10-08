package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;

/* renamed from: X.9H7  reason: invalid class name */
public final class AnonymousClass9H7 implements AnonymousClass4DR, C249453jo, C273434mZ {
    public static boolean A1f;
    public float A00;
    public int A01;
    public Context A02;
    public FrameLayout A03;
    public 2dZ A04;
    public A72 A05;
    public AnonymousClass3E6 A06;
    public TouchInterceptorFrameLayout A07;
    public A9F A08;
    public LF1 A09;
    public LRE A0A;
    public AnonymousClass7GV A0B;
    public ADD A0C;
    public AnonymousClass7H6 A0D;
    public AnonymousClass7TI A0E;
    public C273474md A0F;
    public C328917Gt A0G;
    public AnonymousClass7GT A0H;
    public AnonymousClass7GM A0I;
    public C331787Sj A0J;
    public AnonymousClass7SG A0K;
    public NIE A0L;
    public C328927Gu A0M;
    public C39743A7j A0N;
    public C39744A7k A0O;
    public AnonymousClass38U A0P;
    public C67089Mi7 A0Q;
    public C329067Hl A0R;
    public C49586Eyv A0S;
    public C328757Gc A0T;
    public C328887Gq A0U;
    public AnonymousClass7H1 A0V;
    public C331037Pg A0W;
    public A90 A0X;
    public C39758A7y A0Y;
    public ADC A0Z;
    public C328737Ga A0a;
    public C254743sy A0b;
    public Integer A0c;
    public String A0d;
    public String A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public F0C A0m;
    public ADB A0n;
    public C39721A6m A0o;
    public boolean A0p;
    public final int A0q;
    public final Bundle A0r;
    public final AnonymousClass06Q A0s;
    public final AnonymousClass4DS A0t;
    public final AnonymousClass4DH A0u;
    public final 1Ng A0v;
    public final 1wn A0w;
    public final 1wn A0x;
    public final AnonymousClass4DJ A0y;
    public final C252243on A0z;
    public final UserSession A10;
    public final AnonymousClass4D6 A11;
    public final C252213ok A12;
    public final Capabilities A13;
    public final AnonymousClass7SR A14;
    public final AnonymousClass7SY A15;
    public final AnonymousClass7SZ A16;
    public final C331757Sg A17;
    public final C331697Sa A18;
    public final AnonymousClass7SU A19;
    public final AnonymousClass7SQ A1A;
    public final AnonymousClass7SM A1B;
    public final C331747Sf A1C;
    public final AnonymousClass9H6 A1D;
    public final AnonymousClass7SE A1E;
    public final AnonymousClass9HO A1F;
    public final AnonymousClass7ST A1G;
    public final AnonymousClass9HC A1H;
    public final AnonymousClass7S2 A1I;
    public final AnonymousClass9HS A1J;
    public final C2597342w A1K;
    public final C331617Rr A1L;
    public final AnonymousClass9H3 A1M;
    public final 2B7 A1N;
    public final AnonymousClass9H5 A1O;
    public final AnonymousClass7SX A1P;
    public final AnonymousClass4DU A1Q = new Object();
    public final DirectThreadKey A1R;
    public final C254783t2 A1S;
    public final AnonymousClass9HB A1T;
    public final String A1U;
    public final String A1V;
    public final String A1W;
    public final AnonymousClass0eK A1X;
    public final AnonymousClass0eM A1Y;
    public final AnonymousClass0eM A1Z;
    public final AnonymousClass0eM A1a;
    public final 02m A1b;
    public final AnonymousClass7SL A1c;
    public final C331717Sc A1d;
    public final AnonymousClass0eM A1e;

    /* JADX WARNING: type inference failed for: r9v29, types: [X.0sa, X.7Hg] */
    public final void A0H(View view, Bundle bundle) {
        2dZ r4;
        int i;
        0fh.A01("DirectThreadToggleController.onViewCreated", 286541589);
        try {
            AnonymousClass9HS r1 = this.A1J;
            AnonymousClass9HS r54 = r1;
            C2366634p r12 = r1.A07;
            C2366634p r66 = r12;
            r12.A08((String) null);
            AnonymousClass9H3 r7 = this.A1M;
            AnonymousClass9H4 r13 = r7.A06;
            AnonymousClass9H4 r65 = r13;
            r13.A01((String) null);
            View view2 = view;
            this.A07 = view2.requireViewById(R.id.thread_fragment_container);
            View rootView = view2.getRootView();
            0qQ.A0C(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) rootView;
            Context context = this.A02;
            String str = "context";
            if (context != null) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setId(R.id.powerups_foreground_fullscreen);
                frameLayout.setVisibility(8);
                this.A03 = frameLayout;
                viewGroup.addView(frameLayout, -1, -1);
                UserSession userSession = this.A10;
                if (!AnonymousClass7S3.A00(userSession)) {
                    View requireViewById = view2.requireViewById(R.id.direct_thread_toggle_action_bar);
                    0qQ.A07(requireViewById);
                    r4 = 2dY.A01(new C39971AMd(this), (ViewGroup) requireViewById);
                } else {
                    r4 = null;
                }
                this.A04 = r4;
                AnonymousClass0eM r64 = this.A1Z;
                C328807Gh r6 = (C328807Gh) r64.getValue();
                if (r6.A09) {
                    view2.requireViewById(R.id.direct_thread_toggle_action_bar).setVisibility(8);
                    View requireViewById2 = view2.requireViewById(R.id.intercept_follows_message_header);
                    0qQ.A07(requireViewById2);
                    ((ViewStub) requireViewById2).inflate();
                    view2.requireViewById(R.id.intercept_follows_message_header).setVisibility(0);
                    r6.A02 = (StackedAvatarView) view2.requireViewById(R.id.intercept_follows_message_stacked_avatar_view);
                    r6.A01 = view2.requireViewById(R.id.title_intercept_follows_message_textview);
                }
                AnonymousClass4DH r63 = this.A0u;
                this.A0k = r63.requireArguments().getBoolean("bundle_extra_omnipicker_is_chat_preview", false);
                this.A0i = r63.requireArguments().getBoolean("bundle_extra_omnipicker_creating_new_group", false);
                if (this.A0k) {
                    2dZ r42 = this.A04;
                    if (r42 != null) {
                        r42.Etr(false);
                    }
                    2dZ r43 = this.A04;
                    if (r43 != null) {
                        ViewGroup viewGroup2 = r43.A0P;
                        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                        layoutParams.height = 0;
                        viewGroup2.setLayoutParams(layoutParams);
                    }
                    View requireViewById3 = view2.requireViewById(R.id.direct_thread_content_below_action_bar);
                    0qQ.A07(requireViewById3);
                    ViewGroup.LayoutParams layoutParams2 = requireViewById3.getLayoutParams();
                    0qQ.A0C(layoutParams2, AnonymousClass000.A00(1));
                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                    layoutParams3.topMargin = 0;
                    requireViewById3.setLayoutParams(layoutParams3);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    C328817Gi A002 = AnonymousClass3E4.A00(view2);
                    A002.A9Y(this.A12);
                    this.A06 = A002;
                } else {
                    this.A06 = AnonymousClass3E4.A01(this, false, false);
                }
                0hq childFragmentManager = r63.getChildFragmentManager();
                String A003 = AnonymousClass000.A00(2239);
                C273474md A0R2 = childFragmentManager.A0R(A003);
                if (A0R2 != null) {
                    this.A0F = A0R2;
                } else {
                    this.A0F = A02(this.A0r, this, false);
                    0s1 r9 = new 0s1(r63.getChildFragmentManager());
                    C273474md r5 = this.A0F;
                    0qQ.A0A(r5);
                    r9.A0C(r5, A003, R.id.thread_toggle_child_fragment_container);
                    r9.A00();
                }
                0fh.A01("DirectThreadToggleController.initializeControllers", -1313758372);
                AnonymousClass9H4 r11 = r7.A03;
                r11.A01((String) null);
                try {
                    View view3 = 2b1.A01(view2.findViewById(R.id.direct_thread_command_picker_container), false, false).getView();
                    View requireViewById4 = view2.requireViewById(R.id.direct_command_picker_constraint_layout);
                    0qQ.A07(requireViewById4);
                    View requireViewById5 = view2.requireViewById(R.id.commands_list);
                    0qQ.A07(requireViewById5);
                    AnonymousClass4DU r44 = this.A1Q;
                    AnonymousClass4DU r62 = r44;
                    this.A0U = new C328887Gq(view3, requireViewById4, (RecyclerView) requireViewById5, r44);
                    AnonymousClass7TI A012 = A01(this);
                    Context context2 = this.A02;
                    if (context2 == null) {
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    FragmentActivity requireActivity = r63.requireActivity();
                    TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A07;
                    if (touchInterceptorFrameLayout != null) {
                        Bundle bundle2 = this.A0r;
                        String string = bundle2.getString("DirectFragment.ENTRY_POINT");
                        if (string != null) {
                            String str2 = this.A1U;
                            Capabilities capabilities = this.A13;
                            String string2 = bundle2.getString("direct_story_creator_id");
                            AnonymousClass4DJ r132 = this.A0y;
                            AnonymousClass7SX r18 = this.A1P;
                            try {
                                AnonymousClass7SZ r17 = this.A16;
                                AnonymousClass9H5 r16 = this.A1O;
                                UserSession userSession2 = userSession;
                                this.A0G = new C328917Gt(context2, view2, requireActivity, r132, userSession2, touchInterceptorFrameLayout, capabilities, new C328907Gs(A012), this.A14, this.A15, r17, r16, r18, r62, string, str2, string2, new C377109Ko(this, 37), new C377109Ko(this, 38));
                                r11.A02((String) null);
                                0fh.A00(-944845384);
                                this.A0M = (C328927Gu) userSession.A01(C328927Gu.class, new C328937Gv(userSession));
                                AnonymousClass3U9 A052 = A05(this);
                                FragmentActivity requireActivity2 = r63.requireActivity();
                                AnonymousClass4DU r45 = r62;
                                C328967Gz r92 = new C328967Gz(r45, userSession);
                                C328887Gq r10 = this.A0U;
                                C377109Ko r67 = new C377109Ko(this, 42);
                                0qQ.A0B(r45, 4);
                                this.A0V = new AnonymousClass7H0(requireActivity2, r62, userSession, r92, r10, r67);
                                AnonymousClass7H5 r46 = new AnonymousClass7H5(this);
                                AnonymousClass7TI A013 = A01(this);
                                boolean z = r63.requireArguments().getBoolean("DirectThreadFragment.ARGUMENT_IS_BOTTOM_SHEET", false);
                                View requireViewById6 = view2.requireViewById(R.id.thread_fragment_container);
                                0qQ.A07(requireViewById6);
                                ViewGroup viewGroup3 = (ViewGroup) requireViewById6;
                                if (Systrace.A0E(1)) {
                                    0fS.A01("DirectAggregatedMediaViewerController.init", 1502284033);
                                }
                                try {
                                    AnonymousClass7H6 r452 = new AnonymousClass7H6(r63.requireActivity(), userSession, this.A06, 96, true, z);
                                    this.A0D = r452;
                                    r132.registerLifecycleListener(r452);
                                    if (Systrace.A0E(1)) {
                                        0fS.A00(-81931457);
                                    }
                                    if (Systrace.A0E(1)) {
                                        0fS.A01("DirectThreadComposerController.init", 377885560);
                                    }
                                    Context context3 = this.A02;
                                    Context context4 = context3;
                                    if (context3 == null) {
                                        0qQ.A0F(str);
                                    } else {
                                        AnonymousClass7H1 r47 = this.A0V;
                                        C331617Rr r442 = this.A1L;
                                        C331697Sa r39 = this.A18;
                                        AnonymousClass3E6 r36 = this.A06;
                                        AnonymousClass7H6 r93 = this.A0D;
                                        AnonymousClass7H6 r23 = r93;
                                        if (r93 == null) {
                                            0qQ.A0F("directAggregatedMediaViewerController");
                                        } else {
                                            boolean z2 = false;
                                            if (this.A0q != 0) {
                                                z2 = true;
                                            }
                                            C331717Sc r48 = this.A1d;
                                            AnonymousClass7HX r94 = new AnonymousClass7HX(A052);
                                            C328887Gq r462 = this.A0U;
                                            boolean z3 = false;
                                            if (A013.A0F != null) {
                                                z3 = true;
                                            }
                                            AnonymousClass7HY r95 = new AnonymousClass7HY(A013);
                                            AnonymousClass7HZ r56 = AnonymousClass7HZ.A00;
                                            C328977Ha r96 = new C328977Ha(A013);
                                            C328987Hb r97 = new C328987Hb(A013);
                                            C328997Hc r98 = new C328997Hc(A013);
                                            String str3 = this.A1V;
                                            C254783t2 A004 = AnonymousClass9H9.A00(bundle2);
                                            Boolean valueOf = Boolean.valueOf(z);
                                            C328757Gc r99 = this.A0T;
                                            C328757Gc r172 = r99;
                                            if (r99 == null) {
                                                0qQ.A0F("selectedMediaViewModel");
                                            } else {
                                                AnonymousClass9HP r122 = (AnonymousClass9HP) this.A1a.getValue();
                                                AnonymousClass7SL r38 = this.A1c;
                                                UserSession userSession3 = A013.A0d;
                                                C329027Hh r910 = new C329027Hh(userSession3, new C331937Ta(new C329017Hg(A013)));
                                                C329057Hk r14 = new C329057Hk(userSession3, new C329037Hi(A013), new C329047Hj(A013), A013.A0L);
                                                C331037Pg r102 = this.A0W;
                                                if (r102 == null) {
                                                    0qQ.A0F("audioPlayer");
                                                } else {
                                                    C329067Hl r30 = new C329067Hl(context4, viewGroup3, this, r62, userSession2, r36, r23, r38, r39, r14, r910, r122, r54, r442, r172, r462, r47, r48, r102, A004, r46, valueOf, str3, r94, r95, r56, r96, r97, r98, z2, z3);
                                                    if (Systrace.A0E(1)) {
                                                        0fS.A00(-1912284119);
                                                    }
                                                    this.A0R = r30;
                                                    r30.A18 = this.A0k;
                                                    r30.A12 = this.A0i;
                                                    r30.A0x = bundle2.getString("direct_story_creator_id", (String) null);
                                                    this.A0d = bundle2.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CHALLENGE_SUBMISSION_ID", (String) null);
                                                    r30.A0O = new AnonymousClass7IW(A013, this);
                                                    r30.A0P = new AnonymousClass7IX(A013, this);
                                                    AnonymousClass7S2 r68 = this.A1I;
                                                    0qQ.A0B(viewGroup3, 0);
                                                    for (C331647Ru A042 : r68.A00) {
                                                        A042.A04(viewGroup3);
                                                    }
                                                    A0I(AnonymousClass7GK.A08.A03(r63.requireContext(), userSession, A03(this).A0H, A052));
                                                    if (A052 != null) {
                                                        C328917Gt r2 = this.A0G;
                                                        if (r2 == null) {
                                                            str = "lazyControllers";
                                                        } else {
                                                            ((C3261175l) r2.A0O.getValue()).A02(A052);
                                                        }
                                                    }
                                                    if (!((C328807Gh) r64.getValue()).A09) {
                                                        AnonymousClass386.A00();
                                                        Integer num = AnonymousClass05K.A00;
                                                        Context context5 = this.A02;
                                                        if (context5 != null) {
                                                            FragmentActivity requireActivity3 = r63.requireActivity();
                                                            View requireViewById7 = view2.requireViewById(R.id.direct_thread_content_below_action_bar);
                                                            0qQ.A07(requireViewById7);
                                                            View requireViewById8 = view2.requireViewById(R.id.ongoing_call_notification_bar_stub);
                                                            0qQ.A07(requireViewById8);
                                                            ViewStub viewStub = (ViewStub) requireViewById8;
                                                            C377429Lu r49 = new C377429Lu(41, view2, this);
                                                            C377429Lu r22 = new C377429Lu(42, view2, this);
                                                            0qQ.A0B(viewStub, 5);
                                                            this.A0P = new AnonymousClass38U(context5, r62, userSession, new AnonymousClass388(requireActivity3, requireViewById7, viewStub, userSession, num, r49, r22), num);
                                                        }
                                                    }
                                                    1Ng r410 = this.A0v;
                                                    r410.A01(this.A0x, C331067Pj.class);
                                                    r410.A01(this.A0w, C329917Ks.class);
                                                    Bundle bundle3 = bundle;
                                                    if (bundle != null) {
                                                        String string3 = bundle3.getString(AnonymousClass000.A00(2109));
                                                        this.A0e = string3;
                                                        if (string3 != null) {
                                                            C329067Hl r24 = this.A0R;
                                                            if (r24 != null) {
                                                                r24.A1R((List) C394279xp.A00(userSession).A00(string3));
                                                            }
                                                            this.A0e = null;
                                                        }
                                                    }
                                                    r66.A05();
                                                    r65.A02((String) null);
                                                    0fh.A00(497241201);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    throw AnonymousClass00P.createAndThrow();
                                } catch (Throwable th) {
                                    th = th;
                                    if (Systrace.A0E(1)) {
                                        i = -1715667078;
                                        0fS.A00(i);
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r11.A02((String) null);
                                0fh.A00(1806934905);
                                throw th;
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        try {
                            throw new IllegalStateException("Required value was null.");
                        } catch (Throwable th3) {
                            th = th3;
                            r11.A02((String) null);
                            0fh.A00(1806934905);
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r11.A02((String) null);
                    0fh.A00(1806934905);
                    throw th;
                }
            }
            0qQ.A0F(str);
            th = AnonymousClass00P.createAndThrow();
        } catch (Throwable th5) {
            0fh.A00(326332684);
            throw th5;
        }
        throw th;
    }

    /* JADX WARNING: type inference failed for: r11v12, types: [X.LqG, java.lang.Object, X.B2v] */
    /* JADX WARNING: type inference failed for: r18v4, types: [X.KQO] */
    /* JADX WARNING: type inference failed for: r18v5, types: [X.EIq] */
    /* JADX WARNING: type inference failed for: r11v47 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02e1, code lost:
        r3 = r4.requireViewById(com.instagram.android.R.id.permissions_choice_buttons_container);
        X.0qQ.A07(r3);
        r3 = (android.view.ViewGroup) r3;
        X.0qQ.A0B(r3, 0);
        r9.A00 = r3;
        X.AnonymousClass2uJ.A06(r8.A04, true);
        r4 = r8.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02f9, code lost:
        if (r4 == null) goto L_0x063f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02fb, code lost:
        X.0nA.A0r(r4, new X.C40883Akr(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0303, code lost:
        r9 = r8.A03;
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0312, code lost:
        if (X.C66640Ma9.A05(r6.BRZ(), r6.CUG()) == false) goto L_0x0319;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0316, code lost:
        if (X.1YZ.A02 == null) goto L_0x0319;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0318, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0319, code lost:
        r14 = r9.A02;
        r4 = r14.getApplicationContext();
        r3 = 2131959992;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0322, code lost:
        if (r10 == false) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006a, code lost:
        if (r9.C6a() == 1014) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0324, code lost:
        r3 = 2131975971;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0327, code lost:
        r4 = r4.getString(r3);
        X.0qQ.A07(r4);
        r3 = new X.C71324OiV(r6, r9);
        r10 = r9.A06;
        r10.A02(r4, r3);
        r11 = r14.getApplicationContext().getString(2131959994);
        X.0qQ.A07(r11);
        r4 = new X.C71323OiU(r6, r9);
        r12 = r9.A01;
        X.OZD.A00(r4, r10, r11, com.instagram.android.R.id.permissions_choice_button_mid, r12);
        r13 = r6.CUG();
        r4 = r14.getApplicationContext();
        r11 = r6.BSJ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0363, code lost:
        if (r6.AqP() == false) goto L_0x061a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0365, code lost:
        if (r13 != false) goto L_0x062c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0367, code lost:
        r4 = r4.getString(2131958651);
        r3 = new X.C40005ANl(r9, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0373, code lost:
        X.0qQ.A0B(r4, 0);
        X.OZD.A00(r3, r10, r4, com.instagram.android.R.id.permissions_choice_button_left, r12);
        r3 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x037e, code lost:
        if (r3 == null) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0380, code lost:
        r3.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0383, code lost:
        r3 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0385, code lost:
        if (r3 == null) goto L_0x038a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0387, code lost:
        r3.removeAllViews();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x038a, code lost:
        r4 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x038c, code lost:
        if (r4 == null) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x038e, code lost:
        r4.addView(r10.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0393, code lost:
        r9.A07.DKM(X.C391629tO.A0I, r6);
        r3 = r8.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x039c, code lost:
        if (r3 == null) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x039e, code lost:
        r3.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03ad, code lost:
        if (X.C66640Ma9.A05(r6.BRZ(), r6.CUG()) == false) goto L_0x03f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03b1, code lost:
        if (X.1YZ.A02 == null) goto L_0x03f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03b3, code lost:
        r12 = r8.A07;
        r5 = r8.A04;
        r12.A00((android.view.View.OnClickListener) null, r5.getString(2131972360, new java.lang.Object[]{X.AnonymousClass50n.A07((X.AnonymousClass177) r6.BRZ().get(0))}), (java.lang.Integer) null, (java.lang.Integer) null);
        r1 = 2131972359;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03d7, code lost:
        r1 = r5.getString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03db, code lost:
        r12.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03de, code lost:
        r1 = r8.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03e0, code lost:
        if (r1 == null) goto L_0x0639;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03e2, code lost:
        r1.removeAllViews();
        r3 = r8.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03e7, code lost:
        if (r3 == null) goto L_0x1491;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03e9, code lost:
        r3.addView(r8.A07.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03f6, code lost:
        if (r6.CUG() == false) goto L_0x040c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03fc, code lost:
        if (r6.BSJ() == null) goto L_0x040c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03fe, code lost:
        r4 = r6.BRZ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0404, code lost:
        if ((r4 instanceof java.util.Collection) == false) goto L_0x0478;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x040a, code lost:
        if (r4.isEmpty() == false) goto L_0x0478;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0410, code lost:
        if (r6.CVr() == false) goto L_0x04f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0412, code lost:
        r12 = r8.A07;
        r5 = r8.A04;
        r10 = r6.BRZ();
        r11 = r6.AZs().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0428, code lost:
        if (r11.hasNext() == false) goto L_0x046a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x042a, code lost:
        r9 = r11.next();
        r6 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0436, code lost:
        if (r6.hasNext() == false) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0438, code lost:
        r4 = (com.instagram.user.model.User) r6.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0446, code lost:
        if (X.0qQ.A0K(r4.getId(), r9) == false) goto L_0x0432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0448, code lost:
        r1 = r4.getFullName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x044c, code lost:
        r3 = r5.getString(2131959922, new java.lang.Object[]{r1});
        X.0qQ.A07(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x045a, code lost:
        r12.A00((android.view.View.OnClickListener) null, r3, (java.lang.Integer) null, (java.lang.Integer) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x045e, code lost:
        r1 = r5.getString(2131959976);
        X.0qQ.A07(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x046a, code lost:
        r1 = r10.get(0);
        X.0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.user.model.HasFullName");
        r1 = ((X.AnonymousClass17D) r1).getFullName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0478, code lost:
        r4 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0480, code lost:
        if (r4.hasNext() == false) goto L_0x040c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x048c, code lost:
        if (1 != ((com.instagram.user.model.User) r4.next()).BIW()) goto L_0x047c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x048e, code lost:
        r4 = r6.BSJ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0492, code lost:
        if (r4 == null) goto L_0x03de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0498, code lost:
        if (r4.BIW() != 1) goto L_0x04bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x049a, code lost:
        r12 = r8.A07;
        r5 = r8.A04;
        r3 = r8.A06;
        r4 = r4.getFullName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04a4, code lost:
        if (r4 == null) goto L_0x04bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04a6, code lost:
        r1 = X.182.A05(X.0Tu.A05, r3);
        r3 = 2131959925;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04af, code lost:
        if (r1 == false) goto L_0x04b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04b1, code lost:
        r3 = 2131959923;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04b4, code lost:
        r3 = r5.getString(r3, new java.lang.Object[]{r4});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04bd, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04bf, code lost:
        r3 = X.AnonymousClass50n.A07(r4);
        X.0qQ.A07(r3);
        r6 = X.ADC.A00(r8, r4, r3);
        r12 = r8.A07;
        r5 = r8.A04;
        r3 = 2131959926;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04d9, code lost:
        if (X.182.A05(X.0Tu.A05, r8.A06) == false) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04db, code lost:
        r3 = 2131959924;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04de, code lost:
        r12.A00((android.view.View.OnClickListener) null, android.text.TextUtils.expandTemplate(r5.getString(r3), new java.lang.CharSequence[]{r6}), 0, (java.lang.Integer) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04f8, code lost:
        if (r6.CUG() != false) goto L_0x0569;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04fa, code lost:
        r9 = r8.A06;
        r4 = X.2Ix.A00(r9).A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0506, code lost:
        if (r4 == X.AnonymousClass05K.A0C) goto L_0x050c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x050a, code lost:
        if (r4 != X.AnonymousClass05K.A01) goto L_0x0569;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x050c, code lost:
        r10 = (com.instagram.user.model.User) r6.BRZ().get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x051a, code lost:
        if (X.C272094k5.A05(r9) == false) goto L_0x0525;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x051c, code lost:
        r12 = r8.A07;
        r5 = r8.A04;
        r1 = 2131959985;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0525, code lost:
        r9 = r10.getFullName();
        r6 = r10.getUsername();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x052d, code lost:
        if (r9 == null) goto L_0x0542;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0533, code lost:
        if (r9.length() == 0) goto L_0x0542;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0535, code lost:
        r6 = r8.A04.getString(2131959981, new java.lang.Object[]{r9, r6});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0542, code lost:
        X.0qQ.A0A(r6);
        r12 = r8.A07;
        r5 = r8.A04;
        r12.A00((android.view.View.OnClickListener) null, android.text.TextUtils.expandTemplate(r5.getString(2131959927), new java.lang.CharSequence[]{X.ADC.A00(r8, r10, r6)}), 0, (java.lang.Integer) null);
        r1 = 2131959980;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0569, code lost:
        r4 = r8.A06;
        r9 = X.2El.A0C(r4);
        r3 = r6.CUG();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0573, code lost:
        if (r9 == false) goto L_0x0615;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0575, code lost:
        if (r3 == false) goto L_0x0610;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0577, code lost:
        r11 = 2131964266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0580, code lost:
        if (X.182.A05(X.0Tu.A05, r4) == false) goto L_0x0585;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0582, code lost:
        r11 = 2131964265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0585, code lost:
        r13 = r6.CUG();
        r10 = r6.BSJ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x058d, code lost:
        if (r10 != null) goto L_0x05ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x058f, code lost:
        r12 = r8.A07;
        r6 = r8.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0593, code lost:
        if (r13 == false) goto L_0x05ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0595, code lost:
        r3 = 2131959978;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x059e, code lost:
        if (X.182.A05(X.0Tu.A05, r4) == false) goto L_0x05a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05a0, code lost:
        r3 = 2131959977;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x05a3, code lost:
        r12.A00((android.view.View.OnClickListener) null, android.text.TextUtils.expandTemplate(r6.getString(r3), new java.lang.CharSequence[]{r6.getString(2131959982)}), (java.lang.Integer) null, (java.lang.Integer) null);
        r6 = r6.getResources();
        r4 = new java.lang.Object[1];
        r3 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05c2, code lost:
        r4[0] = r3;
        r1 = r6.getString(r11, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05ca, code lost:
        r3 = 2131959979;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05ce, code lost:
        r3 = X.AnonymousClass50n.A07(r10);
        X.0qQ.A07(r3);
        r6 = X.ADC.A00(r8, r10, r3);
        r12 = r8.A07;
        r9 = r8.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05dd, code lost:
        if (r13 == false) goto L_0x060c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05df, code lost:
        r3 = 2131959978;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05e8, code lost:
        if (X.182.A05(X.0Tu.A05, r4) == false) goto L_0x05ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x05ea, code lost:
        r3 = 2131959977;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05ed, code lost:
        r12.A00((android.view.View.OnClickListener) null, android.text.TextUtils.expandTemplate(r9.getString(r3), new java.lang.CharSequence[]{r6}), 0, (java.lang.Integer) null);
        r6 = r9.getResources();
        r4 = new java.lang.Object[1];
        r3 = X.AnonymousClass50n.A07(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x060c, code lost:
        r3 = 2131959979;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0610, code lost:
        r11 = 2131964267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0615, code lost:
        r11 = 2131959975;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x061a, code lost:
        if (r13 != false) goto L_0x062c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x061c, code lost:
        r4 = r4.getString(2131959993);
        r3 = new X.C71322OiT(r6, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0628, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x062c, code lost:
        r4 = r4.getString(2131959998);
        r3 = new X.C40006ANm(r6, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x063e, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0644, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x064a, code lost:
        throw new java.lang.IllegalArgumentException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0650, code lost:
        throw new java.lang.IllegalArgumentException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d4, code lost:
        r7 = new X.A83(r11);
        X.0qQ.A0B(r12, 0);
        r7.A07 = r12;
        r7.A05 = null;
        X.0qQ.A0B(r4, 0);
        r7.A02 = r4;
        X.0qQ.A0B(r3, 0);
        r7.A06 = r3;
        r7.A01 = r9;
        r7.A04 = r8;
        r7.A08 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0a12, code lost:
        if (X.182.A06(X.0Tu.A05, r8, 36316512583487916L) == false) goto L_0x0a14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0a27, code lost:
        if (X.182.A06(X.0Tu.A05, r8, 36328723175259702L) != false) goto L_0x0a29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0125, code lost:
        r7 = r4.getString(r3);
        r3 = 2131960503;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0139, code lost:
        r4 = r4.getString(r3);
        r8 = null;
        r9 = null;
        r3 = r12;
        r12 = r7;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0d9d, code lost:
        r16 = "ctaButtonContainerRowDivider";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0de0, code lost:
        r1 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0e69, code lost:
        if (r6 == null) goto L_0x0e48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01c2, code lost:
        r4 = r4.getString(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x1117, code lost:
        X.0qQ.A0F("broadcastChannelModeratorInvitationViewModel");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0207, code lost:
        r3 = r12;
        r8 = null;
        r9 = null;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x11cf, code lost:
        X.0qQ.A0F(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x11d6, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:0x12e9, code lost:
        r3.setVisibility(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:638:0x13b9, code lost:
        r1 = new X.A84(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:659:0x148e, code lost:
        A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:660:0x1491, code lost:
        r1 = A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:661:0x1495, code lost:
        if (r1 == null) goto L_0x14c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:663:0x149d, code lost:
        if (r1.C6a() != 29) goto L_0x14c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:664:0x149f, code lost:
        r1 = A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:665:0x14a3, code lost:
        if (r1 == null) goto L_0x14c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:666:0x14a5, code lost:
        r3 = r1.AsX();
        r5 = r0.A10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:667:0x14b1, code lost:
        if (X.0qQ.A0K(r3, r5.A06) == false) goto L_0x14c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:668:0x14b3, code lost:
        r4 = A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:669:0x14b8, code lost:
        if (r4 == null) goto L_0x14cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:670:0x14ba, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:671:0x14c6, code lost:
        if (r3.equals(r4.Amk()) == false) goto L_0x14cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:672:0x14c8, code lost:
        r0.A1N.A00 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:673:0x14cc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:675:0x14d8, code lost:
        if (X.182.A06(X.0Tu.A05, r5, 36322727400909173L) == false) goto L_0x14c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:676:0x14da, code lost:
        A06(r0).A1D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02ae, code lost:
        r3 = r0.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02b0, code lost:
        if (r3 == null) goto L_0x11cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02b2, code lost:
        r8 = (X.ADC) r3.A0Z.getValue();
        r0.A0Z = r8;
        r6 = r2.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02c4, code lost:
        if (r8.A00 != null) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02c6, code lost:
        r4 = r8.A02.inflate();
        r8.A00 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02ce, code lost:
        if (r4 == null) goto L_0x064b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02d0, code lost:
        r8.A01 = (android.view.ViewGroup) r4.requireViewById(com.instagram.android.R.id.permissions_choice_text_container);
        r9 = r8.A03;
        r4 = r8.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02df, code lost:
        if (r4 == null) goto L_0x0645;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x084a  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x086f  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x0a73  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0adc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(X.AnonymousClass7GK r29) {
        /*
            r28 = this;
            r1 = 0
            r2 = r29
            X.0qQ.A0B(r2, r1)
            X.7GM r6 = r2.A02
            r0 = r28
            r0.A0I = r6
            int r3 = r6.ordinal()
            java.lang.String r17 = "broadcastChannelModeratorInvitationViewModel"
            r5 = 1
            java.lang.String r16 = "lazyControllers"
            switch(r3) {
                case 0: goto L_0x0299;
                case 1: goto L_0x02a4;
                case 2: goto L_0x002f;
                case 3: goto L_0x1088;
                case 4: goto L_0x0760;
                case 5: goto L_0x1323;
                case 6: goto L_0x1323;
                case 7: goto L_0x0890;
                case 8: goto L_0x0954;
                case 9: goto L_0x09d1;
                case 10: goto L_0x0c9c;
                case 11: goto L_0x0d35;
                case 12: goto L_0x0d4e;
                case 13: goto L_0x0d0c;
                case 14: goto L_0x0da1;
                case 15: goto L_0x0651;
                case 16: goto L_0x11a4;
                case 17: goto L_0x111c;
                case 18: goto L_0x1415;
                case 19: goto L_0x0f6e;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Invalid Mode: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x002f:
            X.7Hl r4 = A06(r0)
            X.4DH r3 = r0.A0u
            androidx.fragment.app.FragmentActivity r3 = r3.requireActivity()
            r4.A1J(r3)
            X.0eK r3 = r0.A1X
            java.lang.Object r10 = r3.get()
            X.A5T r10 = (X.A5T) r10
            X.2Er r9 = r2.A00()
            X.7SZ r8 = r0.A16
            X.0qQ.A0B(r8, r5)
            com.instagram.common.session.UserSession r7 = r10.A01
            boolean r3 = X.AnonymousClass7LU.A00(r7, r9)
            if (r3 == 0) goto L_0x0217
            X.9tO r11 = X.C391629tO.A04
        L_0x0057:
            boolean r6 = r9.CUG()
            int r4 = r9.C6a()
            r3 = 1012(0x3f4, float:1.418E-42)
            if (r4 == r3) goto L_0x006c
            int r4 = r9.C6a()
            r3 = 1014(0x3f6, float:1.421E-42)
            r13 = 0
            if (r4 != r3) goto L_0x006d
        L_0x006c:
            r13 = 1
        L_0x006d:
            int r4 = r9.C6a()
            r3 = 1003(0x3eb, float:1.406E-42)
            if (r4 != r3) goto L_0x00a0
            com.instagram.user.model.User r4 = r9.BZK()
            if (r4 == 0) goto L_0x00a0
            X.6oA r3 = new X.6oA
            r3.<init>(r7)
            boolean r3 = r4.CQp(r3)
            if (r3 != r5) goto L_0x00a0
            java.lang.String r3 = r11.toString()
            X.GPq r5 = new X.GPq
            r5.<init>(r7, r3)
            java.lang.String r4 = r9.BZP()
            if (r4 == 0) goto L_0x0214
            r3 = 10
            java.lang.Long r4 = X.00y.A0n(r3, r4)
        L_0x009b:
            java.lang.String r3 = "fan_onboarding_chat_unavailable"
            X.C52369GPq.A03(r5, r4, r3)
        L_0x00a0:
            java.lang.String r12 = ""
            r4 = r12
            int r3 = r11.ordinal()
            r5 = 0
            switch(r3) {
                case 3: goto L_0x01bd;
                case 4: goto L_0x01b1;
                case 5: goto L_0x01ab;
                case 13: goto L_0x01b7;
                case 14: goto L_0x0193;
                case 15: goto L_0x0193;
                case 16: goto L_0x0142;
                case 22: goto L_0x0120;
                case 25: goto L_0x012d;
                case 26: goto L_0x00ff;
                case 27: goto L_0x01a5;
                case 28: goto L_0x01a5;
                case 30: goto L_0x00f2;
                case 57: goto L_0x0105;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            if (r13 == 0) goto L_0x01c7
            android.content.Context r10 = r10.A00
            X.AnonymousClass9B9.A00()
            r3 = 2131960444(0x7f13227c, float:1.9557557E38)
            java.lang.String r12 = r10.getString(r3)
            X.AnonymousClass9B9.A00()
            r3 = 2131957531(0x7f13171b, float:1.9551649E38)
            java.lang.String r3 = r10.getString(r3)
            X.AO8 r9 = new X.AO8
            r9.<init>(r11, r8, r6)
            int r7 = X.2Yu.A03(r10)
            int r7 = r10.getColor(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
        L_0x00d4:
            X.A83 r7 = new X.A83
            r7.<init>(r11)
            X.0qQ.A0B(r12, r1)
            r7.A07 = r12
            r7.A05 = r5
            X.0qQ.A0B(r4, r1)
            r7.A02 = r4
            X.0qQ.A0B(r3, r1)
            r7.A06 = r3
            r7.A01 = r9
            r7.A04 = r8
            r7.A08 = r6
            goto L_0x13b9
        L_0x00f2:
            android.content.Context r4 = r10.A00
            r3 = 2131960515(0x7f1322c3, float:1.95577E38)
            java.lang.String r7 = r4.getString(r3)
            r3 = 2131960505(0x7f1322b9, float:1.955768E38)
            goto L_0x0139
        L_0x00ff:
            android.content.Context r4 = r10.A00
            r3 = 2131960513(0x7f1322c1, float:1.9557697E38)
            goto L_0x0125
        L_0x0105:
            android.content.Context r7 = r10.A00
            r4 = 2131958779(0x7f131bfb, float:1.955418E38)
            com.instagram.user.model.User r3 = r9.Ash()
            if (r3 == 0) goto L_0x011e
            java.lang.String r3 = r3.getUsername()
        L_0x0114:
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = r7.getString(r4, r3)
            goto L_0x0207
        L_0x011e:
            r3 = r5
            goto L_0x0114
        L_0x0120:
            android.content.Context r4 = r10.A00
            r3 = 2131960514(0x7f1322c2, float:1.9557699E38)
        L_0x0125:
            java.lang.String r7 = r4.getString(r3)
            r3 = 2131960503(0x7f1322b7, float:1.9557677E38)
            goto L_0x0139
        L_0x012d:
            android.content.Context r4 = r10.A00
            r3 = 2131960516(0x7f1322c4, float:1.9557703E38)
            java.lang.String r7 = r4.getString(r3)
            r3 = 2131960506(0x7f1322ba, float:1.9557683E38)
        L_0x0139:
            java.lang.String r4 = r4.getString(r3)
            r8 = r5
            r9 = r5
            r3 = r12
            r12 = r7
            goto L_0x00d4
        L_0x0142:
            X.0Tu r13 = X.0Tu.A05
            r3 = 36312995005597263(0x81027a000a064f, double:3.0278224900095517E-306)
            boolean r3 = X.182.A06(r13, r7, r3)
            if (r3 == 0) goto L_0x0181
            com.instagram.monetization.repository.MonetizationRepository r4 = X.AnonymousClass2o3.A00(r7)
            com.instagram.api.schemas.UserMonetizationProductType r3 = com.instagram.api.schemas.UserMonetizationProductType.BRANDED_CONTENT_DEAL_CREATOR
            boolean r3 = r4.A06(r3)
            if (r3 == 0) goto L_0x0181
            android.content.Context r9 = r10.A00
            r3 = 2131963066(0x7f132cba, float:1.9562875E38)
            java.lang.String r7 = r9.getString(r3)
            X.0qQ.A07(r7)
            r4 = 2131960498(0x7f1322b2, float:1.9557666E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r7}
            java.lang.String r3 = r9.getString(r4, r3)
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>(r3)
            X.9Xf r3 = new X.9Xf
            r3.<init>(r11, r8, r6)
            X.AnonymousClass7AV.A05(r4, r3, r7)
            goto L_0x0207
        L_0x0181:
            android.content.Context r7 = r10.A00
            r4 = 2131960500(0x7f1322b4, float:1.955767E38)
            java.lang.String r3 = r9.BZN()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = r7.getString(r4, r3)
            goto L_0x0207
        L_0x0193:
            android.content.Context r7 = r10.A00
            r4 = 2131960499(0x7f1322b3, float:1.9557668E38)
            java.lang.String r3 = r9.BZN()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = r7.getString(r4, r3)
            goto L_0x0207
        L_0x01a5:
            android.content.Context r4 = r10.A00
            r3 = 2131960509(0x7f1322bd, float:1.9557689E38)
            goto L_0x01c2
        L_0x01ab:
            android.content.Context r4 = r10.A00
            r3 = 2131960510(0x7f1322be, float:1.955769E38)
            goto L_0x01c2
        L_0x01b1:
            android.content.Context r4 = r10.A00
            r3 = 2131960508(0x7f1322bc, float:1.9557687E38)
            goto L_0x01c2
        L_0x01b7:
            android.content.Context r4 = r10.A00
            r3 = 2131960504(0x7f1322b8, float:1.9557679E38)
            goto L_0x01c2
        L_0x01bd:
            android.content.Context r4 = r10.A00
            r3 = 2131960501(0x7f1322b5, float:1.9557672E38)
        L_0x01c2:
            java.lang.String r4 = r4.getString(r3)
            goto L_0x0207
        L_0x01c7:
            java.lang.Integer r4 = r9.BMT()
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            android.content.Context r10 = r10.A00
            if (r4 != r3) goto L_0x020c
            r3 = 2131960496(0x7f1322b0, float:1.9557662E38)
            java.lang.String r3 = r10.getString(r3)
            android.text.SpannableString r9 = android.text.SpannableString.valueOf(r3)
            r3 = 2130970270(0x7f04069e, float:1.7549245E38)
            int r3 = X.2Yu.A0H(r10, r3)
            int r3 = r10.getColor(r3)
            X.9qQ r7 = new X.9qQ
            r7.<init>(r11, r8, r3, r6)
            int r4 = r9.length()
            r3 = 33
            r9.setSpan(r7, r1, r4, r3)
            r3 = 2131960497(0x7f1322b1, float:1.9557664E38)
            java.lang.String r4 = r10.getString(r3)
            java.lang.CharSequence[] r3 = new java.lang.CharSequence[]{r9}
            java.lang.CharSequence r4 = android.text.TextUtils.expandTemplate(r4, r3)
        L_0x0204:
            X.0qQ.A07(r4)
        L_0x0207:
            r3 = r12
            r8 = r5
            r9 = r5
            goto L_0x00d4
        L_0x020c:
            r3 = 2131960502(0x7f1322b6, float:1.9557674E38)
            java.lang.String r4 = r10.getString(r3)
            goto L_0x0204
        L_0x0214:
            r4 = 0
            goto L_0x009b
        L_0x0217:
            boolean r3 = X.C377809Ni.A00(r9)
            if (r3 == 0) goto L_0x0221
            X.9tO r11 = X.C391629tO.A0R
            goto L_0x0057
        L_0x0221:
            boolean r3 = X.C377819Nj.A03(r7, r9)
            if (r3 == 0) goto L_0x022b
            X.9tO r11 = X.C391629tO.A09
            goto L_0x0057
        L_0x022b:
            boolean r3 = X.C377819Nj.A02(r7, r9)
            if (r3 == 0) goto L_0x0235
            X.9tO r11 = X.C391629tO.A08
            goto L_0x0057
        L_0x0235:
            boolean r3 = X.C377819Nj.A00(r7, r9)
            if (r3 == 0) goto L_0x023f
            X.9tO r11 = X.C391629tO.A07
            goto L_0x0057
        L_0x023f:
            boolean r3 = X.C377819Nj.A01(r7, r9)
            if (r3 == 0) goto L_0x0249
            X.9tO r11 = X.C391629tO.A0A
            goto L_0x0057
        L_0x0249:
            boolean r3 = X.C377829Nk.A00(r7, r9)
            if (r3 == 0) goto L_0x0253
            X.9tO r11 = X.C391629tO.A0J
            goto L_0x0057
        L_0x0253:
            X.7LW r3 = X.AnonymousClass7LV.A00
            boolean r3 = r3.A01(r7, r9)
            if (r3 == 0) goto L_0x025f
            X.9tO r11 = X.C391629tO.A0U
            goto L_0x0057
        L_0x025f:
            int r3 = r9.BHS()
            java.lang.String r6 = "Invalid ThreadInputMode:"
            java.lang.String r4 = "ThreadInputMode"
            switch(r3) {
                case 1: goto L_0x0279;
                case 2: goto L_0x027d;
                case 3: goto L_0x0281;
                case 4: goto L_0x0285;
                case 5: goto L_0x0289;
                case 6: goto L_0x028d;
                case 7: goto L_0x026a;
                case 8: goto L_0x0291;
                case 9: goto L_0x0295;
                default: goto L_0x026a;
            }
        L_0x026a:
            int r3 = r9.BHS()
            java.lang.String r3 = X.002.A0O(r6, r3)
            X.0wb.A03(r4, r3)
            X.9tO r11 = X.C391629tO.A0V
            goto L_0x0057
        L_0x0279:
            X.9tO r11 = X.C391629tO.A06
            goto L_0x0057
        L_0x027d:
            X.9tO r11 = X.C391629tO.A05
            goto L_0x0057
        L_0x0281:
            X.9tO r11 = X.C391629tO.A0M
            goto L_0x0057
        L_0x0285:
            X.9tO r11 = X.C391629tO.A0L
            goto L_0x0057
        L_0x0289:
            X.9tO r11 = X.C391629tO.A0K
            goto L_0x0057
        L_0x028d:
            X.9tO r11 = X.C391629tO.A0G
            goto L_0x0057
        L_0x0291:
            X.9tO r11 = X.C391629tO.A0H
            goto L_0x0057
        L_0x0295:
            X.9tO r11 = X.C391629tO.A0B
            goto L_0x0057
        L_0x0299:
            r0.A08()
            X.7Hl r3 = A06(r0)
            r3.A1B()
            goto L_0x02ae
        L_0x02a4:
            r0.A08()
            X.2Er r3 = r2.A00()
            r0.A0E(r3)
        L_0x02ae:
            X.7Gt r3 = r0.A0G
            if (r3 == 0) goto L_0x11cf
            X.0eM r3 = r3.A0Z
            java.lang.Object r8 = r3.getValue()
            X.ADC r8 = (X.ADC) r8
            r0.A0Z = r8
            X.2Er r6 = r2.A00()
            android.view.View r3 = r8.A00
            java.lang.String r7 = "Required value was null."
            if (r3 != 0) goto L_0x0303
            android.view.ViewStub r3 = r8.A02
            android.view.View r4 = r3.inflate()
            r8.A00 = r4
            if (r4 == 0) goto L_0x064b
            r3 = 2131437595(0x7f0b281b, float:1.8497093E38)
            android.view.View r3 = r4.requireViewById(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r8.A01 = r3
            X.OTp r9 = r8.A03
            android.view.View r4 = r8.A00
            if (r4 == 0) goto L_0x0645
            r3 = 2131437594(0x7f0b281a, float:1.8497091E38)
            android.view.View r3 = r4.requireViewById(r3)
            X.0qQ.A07(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            X.0qQ.A0B(r3, r1)
            r9.A00 = r3
            androidx.fragment.app.FragmentActivity r3 = r8.A04
            X.AnonymousClass2uJ.A06(r3, r5)
            android.view.View r4 = r8.A00
            if (r4 == 0) goto L_0x063f
            X.Akr r3 = new X.Akr
            r3.<init>(r8)
            X.0nA.A0r(r4, r3)
        L_0x0303:
            X.OTp r9 = r8.A03
            boolean r4 = r6.CUG()
            java.util.List r3 = r6.BRZ()
            boolean r3 = X.C66640Ma9.A05(r3, r4)
            r10 = 0
            if (r3 == 0) goto L_0x0319
            X.1YZ r3 = X.1YZ.A02
            if (r3 == 0) goto L_0x0319
            r10 = 1
        L_0x0319:
            androidx.fragment.app.FragmentActivity r14 = r9.A02
            android.content.Context r4 = r14.getApplicationContext()
            r3 = 2131959992(0x7f1320b8, float:1.955664E38)
            if (r10 == 0) goto L_0x0327
            r3 = 2131975971(0x7f135f23, float:1.958905E38)
        L_0x0327:
            java.lang.String r4 = r4.getString(r3)
            X.0qQ.A07(r4)
            X.OiV r3 = new X.OiV
            r3.<init>(r6, r9)
            X.OZD r10 = r9.A06
            r10.A02(r4, r3)
            android.content.Context r4 = r14.getApplicationContext()
            r3 = 2131959994(0x7f1320ba, float:1.9556644E38)
            java.lang.String r11 = r4.getString(r3)
            X.0qQ.A07(r11)
            X.OiU r4 = new X.OiU
            r4.<init>(r6, r9)
            int r12 = r9.A01
            r3 = 2131437592(0x7f0b2818, float:1.8497087E38)
            X.OZD.A00(r4, r10, r11, r3, r12)
            boolean r13 = r6.CUG()
            android.content.Context r4 = r14.getApplicationContext()
            com.instagram.user.model.User r11 = r6.BSJ()
            boolean r3 = r6.AqP()
            if (r3 == 0) goto L_0x061a
            if (r13 != 0) goto L_0x062c
            r3 = 2131958651(0x7f131b7b, float:1.955392E38)
            java.lang.String r4 = r4.getString(r3)
            X.ANl r3 = new X.ANl
            r3.<init>(r9, r11)
        L_0x0373:
            X.0qQ.A0B(r4, r1)
            r11 = 2131437591(0x7f0b2817, float:1.8497085E38)
            X.OZD.A00(r3, r10, r4, r11, r12)
            android.view.ViewGroup r3 = r9.A00
            if (r3 == 0) goto L_0x0383
            r3.setVisibility(r1)
        L_0x0383:
            android.view.ViewGroup r3 = r9.A00
            if (r3 == 0) goto L_0x038a
            r3.removeAllViews()
        L_0x038a:
            android.view.ViewGroup r4 = r9.A00
            if (r4 == 0) goto L_0x0393
            android.view.ViewGroup r3 = r10.A00
            r4.addView(r3)
        L_0x0393:
            X.7SX r4 = r9.A07
            X.9tO r3 = X.C391629tO.A0I
            r4.DKM(r3, r6)
            android.view.View r3 = r8.A00
            if (r3 == 0) goto L_0x03a1
            r3.setVisibility(r1)
        L_0x03a1:
            boolean r4 = r6.CUG()
            java.util.List r3 = r6.BRZ()
            boolean r3 = X.C66640Ma9.A05(r3, r4)
            if (r3 == 0) goto L_0x03f2
            X.1YZ r3 = X.1YZ.A02
            if (r3 == 0) goto L_0x03f2
            java.util.List r3 = r6.BRZ()
            java.lang.Object r1 = r3.get(r1)
            X.177 r1 = (X.AnonymousClass177) r1
            X.A9a r12 = r8.A07
            androidx.fragment.app.FragmentActivity r5 = r8.A04
            r3 = 2131972360(0x7f135108, float:1.9581725E38)
            java.lang.String r1 = X.AnonymousClass50n.A07(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r3 = r5.getString(r3, r1)
            r1 = 0
            r12.A00(r1, r3, r1, r1)
            r1 = 2131972359(0x7f135107, float:1.9581723E38)
        L_0x03d7:
            java.lang.String r1 = r5.getString(r1)
        L_0x03db:
            r12.A01(r1)
        L_0x03de:
            android.view.ViewGroup r1 = r8.A01
            if (r1 == 0) goto L_0x0639
            r1.removeAllViews()
            android.view.ViewGroup r3 = r8.A01
            if (r3 == 0) goto L_0x1491
            X.A9a r1 = r8.A07
            android.view.ViewGroup r1 = r1.A00
            r3.addView(r1)
            goto L_0x1491
        L_0x03f2:
            boolean r3 = r6.CUG()
            if (r3 == 0) goto L_0x040c
            com.instagram.user.model.User r3 = r6.BSJ()
            if (r3 == 0) goto L_0x040c
            java.util.List r4 = r6.BRZ()
            boolean r3 = r4 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0478
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L_0x0478
        L_0x040c:
            boolean r3 = r6.CVr()
            if (r3 == 0) goto L_0x04f4
            X.A9a r12 = r8.A07
            androidx.fragment.app.FragmentActivity r5 = r8.A04
            java.util.List r10 = r6.BRZ()
            java.util.List r3 = r6.AZs()
            java.util.Iterator r11 = r3.iterator()
        L_0x0422:
            boolean r4 = r11.hasNext()
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.user.model.HasFullName"
            if (r4 == 0) goto L_0x046a
            java.lang.Object r9 = r11.next()
            java.util.Iterator r6 = r10.iterator()
        L_0x0432:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x0422
            java.lang.Object r4 = r6.next()
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            java.lang.String r3 = r4.getId()
            boolean r3 = X.0qQ.A0K(r3, r9)
            if (r3 == 0) goto L_0x0432
            java.lang.String r1 = r4.getFullName()
        L_0x044c:
            r3 = 2131959922(0x7f132072, float:1.9556498E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r3 = r5.getString(r3, r1)
            X.0qQ.A07(r3)
        L_0x045a:
            r1 = 0
            r12.A00(r1, r3, r1, r1)
        L_0x045e:
            r1 = 2131959976(0x7f1320a8, float:1.9556608E38)
            java.lang.String r1 = r5.getString(r1)
            X.0qQ.A07(r1)
            goto L_0x03db
        L_0x046a:
            java.lang.Object r1 = r10.get(r1)
            X.0qQ.A0C(r1, r3)
            X.17D r1 = (X.AnonymousClass17D) r1
            java.lang.String r1 = r1.getFullName()
            goto L_0x044c
        L_0x0478:
            java.util.Iterator r4 = r4.iterator()
        L_0x047c:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x040c
            java.lang.Object r3 = r4.next()
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            int r3 = r3.BIW()
            if (r5 != r3) goto L_0x047c
            com.instagram.user.model.User r4 = r6.BSJ()
            if (r4 == 0) goto L_0x03de
            int r3 = r4.BIW()
            if (r3 != r5) goto L_0x04bf
            X.A9a r12 = r8.A07
            androidx.fragment.app.FragmentActivity r5 = r8.A04
            com.instagram.common.session.UserSession r3 = r8.A06
            java.lang.String r4 = r4.getFullName()
            if (r4 == 0) goto L_0x04bd
            X.0Tu r1 = X.0Tu.A05
            boolean r1 = X.182.A05(r1, r3)
            r3 = 2131959925(0x7f132075, float:1.9556504E38)
            if (r1 == 0) goto L_0x04b4
            r3 = 2131959923(0x7f132073, float:1.95565E38)
        L_0x04b4:
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.lang.String r3 = r5.getString(r3, r1)
            goto L_0x045a
        L_0x04bd:
            r3 = 0
            goto L_0x045a
        L_0x04bf:
            java.lang.String r3 = X.AnonymousClass50n.A07(r4)
            X.0qQ.A07(r3)
            android.text.SpannableString r6 = X.ADC.A00(r8, r4, r3)
            X.A9a r12 = r8.A07
            androidx.fragment.app.FragmentActivity r5 = r8.A04
            com.instagram.common.session.UserSession r4 = r8.A06
            X.0Tu r3 = X.0Tu.A05
            boolean r4 = X.182.A05(r3, r4)
            r3 = 2131959926(0x7f132076, float:1.9556506E38)
            if (r4 == 0) goto L_0x04de
            r3 = 2131959924(0x7f132074, float:1.9556502E38)
        L_0x04de:
            java.lang.String r4 = r5.getString(r3)
            java.lang.CharSequence[] r3 = new java.lang.CharSequence[]{r6}
            java.lang.CharSequence r4 = android.text.TextUtils.expandTemplate(r4, r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r1 = 0
            r12.A00(r1, r4, r3, r1)
            goto L_0x045e
        L_0x04f4:
            boolean r3 = r6.CUG()
            if (r3 != 0) goto L_0x0569
            com.instagram.common.session.UserSession r9 = r8.A06
            X.2Ix r3 = X.2Ix.A00(r9)
            java.lang.Integer r4 = r3.A01()
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            if (r4 == r3) goto L_0x050c
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            if (r4 != r3) goto L_0x0569
        L_0x050c:
            java.util.List r3 = r6.BRZ()
            java.lang.Object r10 = r3.get(r1)
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
            boolean r3 = X.C272094k5.A05(r9)
            if (r3 == 0) goto L_0x0525
            X.A9a r12 = r8.A07
            androidx.fragment.app.FragmentActivity r5 = r8.A04
            r1 = 2131959985(0x7f1320b1, float:1.9556626E38)
            goto L_0x03d7
        L_0x0525:
            java.lang.String r9 = r10.getFullName()
            java.lang.String r6 = r10.getUsername()
            if (r9 == 0) goto L_0x0542
            int r3 = r9.length()
            if (r3 == 0) goto L_0x0542
            androidx.fragment.app.FragmentActivity r5 = r8.A04
            r4 = 2131959981(0x7f1320ad, float:1.9556618E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r9, r6}
            java.lang.String r6 = r5.getString(r4, r3)
        L_0x0542:
            X.0qQ.A0A(r6)
            X.A9a r12 = r8.A07
            androidx.fragment.app.FragmentActivity r5 = r8.A04
            r3 = 2131959927(0x7f132077, float:1.9556508E38)
            java.lang.String r4 = r5.getString(r3)
            android.text.SpannableString r3 = X.ADC.A00(r8, r10, r6)
            java.lang.CharSequence[] r3 = new java.lang.CharSequence[]{r3}
            java.lang.CharSequence r4 = android.text.TextUtils.expandTemplate(r4, r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r1 = 0
            r12.A00(r1, r4, r3, r1)
            r1 = 2131959980(0x7f1320ac, float:1.9556616E38)
            goto L_0x03d7
        L_0x0569:
            com.instagram.common.session.UserSession r4 = r8.A06
            boolean r9 = X.2El.A0C(r4)
            boolean r3 = r6.CUG()
            if (r9 == 0) goto L_0x0615
            if (r3 == 0) goto L_0x0610
            X.0Tu r3 = X.0Tu.A05
            boolean r3 = X.182.A05(r3, r4)
            r11 = 2131964266(0x7f13316a, float:1.9565309E38)
            if (r3 == 0) goto L_0x0585
            r11 = 2131964265(0x7f133169, float:1.9565307E38)
        L_0x0585:
            boolean r13 = r6.CUG()
            com.instagram.user.model.User r10 = r6.BSJ()
            if (r10 != 0) goto L_0x05ce
            X.A9a r12 = r8.A07
            androidx.fragment.app.FragmentActivity r6 = r8.A04
            if (r13 == 0) goto L_0x05ca
            X.0Tu r3 = X.0Tu.A05
            boolean r4 = X.182.A05(r3, r4)
            r3 = 2131959978(0x7f1320aa, float:1.9556612E38)
            if (r4 == 0) goto L_0x05a3
            r3 = 2131959977(0x7f1320a9, float:1.955661E38)
        L_0x05a3:
            java.lang.String r4 = r6.getString(r3)
            r3 = 2131959982(0x7f1320ae, float:1.955662E38)
            java.lang.String r3 = r6.getString(r3)
            java.lang.CharSequence[] r3 = new java.lang.CharSequence[]{r3}
            java.lang.CharSequence r4 = android.text.TextUtils.expandTemplate(r4, r3)
            r3 = 0
            r12.A00(r3, r4, r3, r3)
            android.content.res.Resources r6 = r6.getResources()
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.String r3 = ""
        L_0x05c2:
            r4[r1] = r3
            java.lang.String r1 = r6.getString(r11, r4)
            goto L_0x03db
        L_0x05ca:
            r3 = 2131959979(0x7f1320ab, float:1.9556614E38)
            goto L_0x05a3
        L_0x05ce:
            java.lang.String r3 = X.AnonymousClass50n.A07(r10)
            X.0qQ.A07(r3)
            android.text.SpannableString r6 = X.ADC.A00(r8, r10, r3)
            X.A9a r12 = r8.A07
            androidx.fragment.app.FragmentActivity r9 = r8.A04
            if (r13 == 0) goto L_0x060c
            X.0Tu r3 = X.0Tu.A05
            boolean r4 = X.182.A05(r3, r4)
            r3 = 2131959978(0x7f1320aa, float:1.9556612E38)
            if (r4 == 0) goto L_0x05ed
            r3 = 2131959977(0x7f1320a9, float:1.955661E38)
        L_0x05ed:
            java.lang.String r4 = r9.getString(r3)
            java.lang.CharSequence[] r3 = new java.lang.CharSequence[]{r6}
            java.lang.CharSequence r6 = android.text.TextUtils.expandTemplate(r4, r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r3 = 0
            r12.A00(r3, r6, r4, r3)
            android.content.res.Resources r6 = r9.getResources()
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.String r3 = X.AnonymousClass50n.A07(r10)
            goto L_0x05c2
        L_0x060c:
            r3 = 2131959979(0x7f1320ab, float:1.9556614E38)
            goto L_0x05ed
        L_0x0610:
            r11 = 2131964267(0x7f13316b, float:1.956531E38)
            goto L_0x0585
        L_0x0615:
            r11 = 2131959975(0x7f1320a7, float:1.9556606E38)
            goto L_0x0585
        L_0x061a:
            if (r13 != 0) goto L_0x062c
            r3 = 2131959993(0x7f1320b9, float:1.9556642E38)
            java.lang.String r4 = r4.getString(r3)
            X.OiT r3 = new X.OiT
            r3.<init>(r6, r9)
        L_0x0628:
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            goto L_0x0373
        L_0x062c:
            r3 = 2131959998(0x7f1320be, float:1.9556652E38)
            java.lang.String r4 = r4.getString(r3)
            X.ANm r3 = new X.ANm
            r3.<init>(r6, r9)
            goto L_0x0628
        L_0x0639:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x063f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0645:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r7)
            throw r0
        L_0x064b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r7)
            throw r0
        L_0x0651:
            X.0eK r3 = r0.A1X
            java.lang.Object r10 = r3.get()
            X.A5T r10 = (X.A5T) r10
            int r11 = r2.A00
            X.7SZ r4 = r0.A16
            X.0qQ.A0B(r4, r5)
            android.content.Context r9 = r10.A00
            r3 = 2130970310(0x7f0406c6, float:1.7549327E38)
            if (r11 <= 0) goto L_0x066a
            r3 = 2130970215(0x7f040667, float:1.7549134E38)
        L_0x066a:
            int r3 = X.2Yu.A0H(r9, r3)
            int r7 = r9.getColor(r3)
            X.ANj r6 = new X.ANj
            r6.<init>(r4, r11)
            X.9tO r3 = X.C391629tO.A0V
            X.A83 r8 = new X.A83
            r8.<init>(r3)
            r4 = 2131958903(0x7f131c77, float:1.9554431E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = r9.getString(r4, r3)
            X.0qQ.A07(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r8.A07 = r4
            r8.A05 = r3
            r8.A00 = r6
            com.instagram.common.session.UserSession r7 = r10.A01
            X.0Tu r6 = X.0Tu.A05
            r3 = 36320932104643544(0x8109b2000223d8, double:3.032841943406552E-306)
            boolean r3 = X.182.A06(r6, r7, r3)
            if (r3 == 0) goto L_0x06b5
            r3 = 2131958904(0x7f131c78, float:1.9554433E38)
            java.lang.String r3 = r9.getString(r3)
            X.0qQ.A07(r3)
            r8.A03 = r3
        L_0x06b5:
            X.A84 r6 = new X.A84
            r6.<init>(r8)
            X.7Gt r3 = r0.A0G
            if (r3 == 0) goto L_0x11cf
            X.0eM r3 = r3.A0U
            java.lang.Object r7 = r3.getValue()
            X.A90 r7 = (X.A90) r7
            r0.A0X = r7
            X.0eM r8 = r7.A03
            boolean r3 = r8.CVQ()
            if (r3 == 0) goto L_0x071d
            java.lang.Object r3 = r8.getValue()
            android.view.View r3 = (android.view.View) r3
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x071d
            boolean r1 = r8.CVQ()
            if (r1 == 0) goto L_0x1491
            java.lang.Object r1 = r8.getValue()
            android.view.View r1 = (android.view.View) r1
            android.view.View$OnClickListener r8 = r6.A00
            X.AnonymousClass0fU.A00(r8, r1)
            X.A9a r1 = r7.A00
            if (r1 == 0) goto L_0x06fd
            android.view.ViewGroup r3 = r1.A00
            r1 = 2131434047(0x7f0b1a3f, float:1.8489897E38)
            android.view.View r1 = r3.requireViewById(r1)
            X.0qQ.A07(r1)
        L_0x06fd:
            X.A9a r3 = r7.A00
            if (r3 == 0) goto L_0x0706
            java.lang.CharSequence r1 = r6.A05
            r3.A02(r1)
        L_0x0706:
            X.A9a r3 = r7.A00
            if (r3 == 0) goto L_0x070f
            java.lang.CharSequence r1 = r6.A04
            r3.A01(r1)
        L_0x070f:
            X.A9a r5 = r7.A00
            if (r5 == 0) goto L_0x1491
            java.lang.String r4 = r6.A08
            r3 = 0
            java.lang.Integer r1 = r6.A01
            r5.A00(r8, r4, r3, r1)
            goto L_0x1491
        L_0x071d:
            r0.A08()
            X.7Hl r4 = A06(r0)
            r3 = 4
            X.C329067Hl.A0f(r4, r3)
            boolean r3 = r4.A18
            if (r3 != 0) goto L_0x0731
            android.widget.FrameLayout r3 = r4.A07
            X.0nA.A0N(r3)
        L_0x0731:
            X.C329067Hl.A0V(r4)
            X.7Hl r3 = A06(r0)
            X.C329067Hl.A0m(r3, r5, r1)
            X.C329067Hl.A0T(r3)
            X.C329067Hl.A0j(r3, r5)
            r3.A15()
            X.C329067Hl.A0W(r3)
            X.C329067Hl.A0U(r3)
            r7.A00(r6)
            X.7TI r4 = A01(r0)
            java.lang.Object r3 = r8.getValue()
            android.view.View r3 = (android.view.View) r3
            int r3 = r3.getHeight()
            r4.A0T(r3, r1, r1, r5)
            goto L_0x1491
        L_0x0760:
            X.7Hl r4 = A06(r0)
            X.4DH r3 = r0.A0u
            androidx.fragment.app.FragmentActivity r3 = r3.requireActivity()
            r4.A1J(r3)
            X.2Er r8 = r2.A00()
            boolean r3 = r8.CUG()
            r0.A0j = r3
            r0.A08()
            X.7Hl r3 = A06(r0)
            r3.A1B()
            X.3sy r3 = r0.A0b
            boolean r4 = r3 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            boolean r3 = r0.A0j
            X.76k r10 = X.C3263476j.A00(r4, r3)
            boolean r4 = r8.CVr()
            boolean r3 = r0.A0j
            if (r4 == 0) goto L_0x088c
            if (r3 == 0) goto L_0x088c
            X.Nlp r9 = X.C69445Nlp.GXAC
        L_0x0797:
            X.7Gt r3 = r0.A0G
            if (r3 == 0) goto L_0x11cf
            X.0eM r3 = r3.A0J
            java.lang.Object r6 = r3.getValue()
            X.A7y r6 = (X.C39758A7y) r6
            r0.A0Y = r6
            java.util.List r3 = r8.BRZ()
            java.lang.Object r3 = r3.get(r1)
            X.17A r3 = (X.AnonymousClass17A) r3
            java.lang.String r12 = r3.getFullName()
            java.lang.String r11 = r3.getUsername()
            int r3 = r3.BIW()
            r7 = 0
            if (r3 != r5) goto L_0x07bf
            r7 = 1
        L_0x07bf:
            java.lang.Integer r4 = r8.BMT()
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            r13 = 0
            if (r4 != r3) goto L_0x07c9
            r13 = 1
        L_0x07c9:
            android.view.View r3 = r6.A00
            if (r3 != 0) goto L_0x0807
            android.view.ViewStub r3 = r6.A06
            android.view.View r4 = r3.inflate()
            r6.A00 = r4
            r3 = 2131428791(0x7f0b05b7, float:1.8479236E38)
            android.view.View r3 = r4.requireViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r6.A04 = r3
            android.view.View r4 = r6.A00
            r3 = 2131428790(0x7f0b05b6, float:1.8479234E38)
            android.view.View r3 = r4.requireViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r6.A03 = r3
            android.view.View r4 = r6.A00
            r3 = 2131428788(0x7f0b05b4, float:1.847923E38)
            android.view.View r3 = r4.requireViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r6.A01 = r3
            android.view.View r4 = r6.A00
            r3 = 2131428789(0x7f0b05b5, float:1.8479232E38)
            android.view.View r3 = r4.requireViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r6.A02 = r3
        L_0x0807:
            android.widget.TextView r4 = r6.A04
            r4.getClass()
            r3 = 2131958661(0x7f131b85, float:1.955394E38)
            r4.setText(r3)
            if (r7 == 0) goto L_0x0875
            android.content.Context r7 = r6.A05
            r4 = 2131958658(0x7f131b82, float:1.9553934E38)
            java.lang.Object[] r3 = new java.lang.Object[r5]
        L_0x081b:
            r3[r1] = r12
        L_0x081d:
            java.lang.String r4 = r7.getString(r4, r3)
            android.widget.TextView r3 = r6.A03
            r3.getClass()
            r3.setText(r4)
            android.widget.TextView r3 = r6.A01
            r3.getClass()
            android.widget.TextView r3 = r6.A02
            r3.getClass()
            android.widget.TextView r5 = r6.A01
            X.AOK r4 = new X.AOK
            r4.<init>(r10, r9, r8, r6)
            r3 = 2131958657(0x7f131b81, float:1.9553932E38)
            r5.setVisibility(r1)
            r5.setText(r3)
            X.AnonymousClass0fU.A00(r4, r5)
            android.widget.TextView r5 = r6.A02
            if (r13 == 0) goto L_0x086f
            X.ANk r4 = new X.ANk
            r4.<init>(r8, r6)
            r3 = 2131958655(0x7f131b7f, float:1.9553928E38)
            r5.setVisibility(r1)
            r5.setText(r3)
            X.AnonymousClass0fU.A00(r4, r5)
            android.widget.TextView r4 = r6.A02
            int r3 = X.2Yu.A03(r7)
            int r3 = r7.getColor(r3)
            r4.setTextColor(r3)
        L_0x0868:
            android.view.View r3 = r6.A00
            r3.getClass()
            goto L_0x12e9
        L_0x086f:
            r3 = 8
            r5.setVisibility(r3)
            goto L_0x0868
        L_0x0875:
            boolean r3 = X.0mp.A0B(r12)
            android.content.Context r7 = r6.A05
            if (r3 != 0) goto L_0x0885
            r4 = 2131958659(0x7f131b83, float:1.9553936E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r12, r11}
            goto L_0x081d
        L_0x0885:
            r4 = 2131958660(0x7f131b84, float:1.9553938E38)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r12 = r11
            goto L_0x081b
        L_0x088c:
            X.Nlp r9 = X.C69445Nlp.DEFAULT
            goto L_0x0797
        L_0x0890:
            X.7Hl r4 = A06(r0)
            X.4DH r3 = r0.A0u
            androidx.fragment.app.FragmentActivity r3 = r3.requireActivity()
            r4.A1J(r3)
            r0.A08()
            X.7Hl r3 = A06(r0)
            r3.A1B()
            X.7Gt r3 = r0.A0G
            if (r3 == 0) goto L_0x11cf
            X.0eM r3 = r3.A0I
            java.lang.Object r9 = r3.getValue()
            X.A7j r9 = (X.C39743A7j) r9
            r0.A0N = r9
            X.2Er r3 = r2.A00()
            java.util.List r3 = r3.BRZ()
            java.lang.Object r8 = r3.get(r1)
            com.instagram.user.model.User r8 = (com.instagram.user.model.User) r8
            r3 = 2
            X.0qQ.A0B(r8, r3)
            android.widget.TextView r4 = r9.A03
            r3 = 2131958630(0x7f131b66, float:1.9553878E38)
            r4.setText(r3)
            java.lang.String r7 = r8.getFullName()
            boolean r3 = X.0mp.A0B(r7)
            if (r3 == 0) goto L_0x08dd
            java.lang.String r7 = r8.getUsername()
        L_0x08dd:
            android.widget.TextView r6 = r9.A02
            android.content.Context r5 = r9.A00
            r4 = 2131958629(0x7f131b65, float:1.9553876E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r7}
            java.lang.String r3 = r5.getString(r4, r3)
            r6.setText(r3)
            android.view.View r3 = r9.A01
            r3.setVisibility(r1)
            X.A5O r6 = r9.A04
            java.lang.String r9 = r8.getId()
            boolean r8 = r8.A2L()
            X.0wc r4 = r6.A00
            java.lang.String r3 = "direct_armadillo_professional_feature_limited_events"
            X.0kJ r1 = r4.A00
            X.0Aj r5 = r4.A00(r1, r3)
            java.lang.String r3 = "direct_armadillo_feature_limited_composer_impression"
            r1 = 2323(0x913, float:3.255E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r5.AAJ(r1, r3)
            X.0eE r7 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r6 = r6.A01
            com.instagram.user.model.User r1 = r7.A01(r6)
            java.lang.String r1 = r1.getId()
            long r3 = java.lang.Long.parseLong(r1)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r1 = "ig_userid"
            r5.A9F(r1, r3)
            java.util.List r3 = java.util.Collections.singletonList(r9)
            java.lang.String r1 = "recipient_ids"
            r5.AAe(r1, r3)
            com.instagram.user.model.User r1 = r7.A01(r6)
            boolean r1 = r1.A2L()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = "is_logged_in_user_professional"
            r5.A7p(r1, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
            java.lang.String r1 = "is_other_user_professional"
            r5.A7p(r1, r3)
            r5.Cgf()
            goto L_0x1491
        L_0x0954:
            X.7Hl r4 = A06(r0)
            X.4DH r3 = r0.A0u
            androidx.fragment.app.FragmentActivity r3 = r3.requireActivity()
            r4.A1J(r3)
            r0.A08()
            X.7Hl r3 = A06(r0)
            r3.A1B()
            X.7Gt r3 = r0.A0G
            if (r3 == 0) goto L_0x11cf
            X.0eM r3 = r3.A0P
            java.lang.Object r7 = r3.getValue()
            X.A7k r7 = (X.C39744A7k) r7
            r0.A0O = r7
            android.content.Context r5 = r7.A00
            r3 = 2131963481(0x7f132e59, float:1.9563717E38)
            java.lang.String r3 = r5.getString(r3)
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>(r3)
            r3 = 2131963479(0x7f132e57, float:1.9563713E38)
            java.lang.String r4 = r5.getString(r3)
            X.0qQ.A07(r4)
            java.lang.String r3 = " "
            r8.append(r3)
            int r6 = r8.length()
            r8.append(r4)
            int r3 = X.2Yu.A06(r5)
            int r3 = r5.getColor(r3)
            X.9ot r5 = new X.9ot
            r5.<init>(r7, r3)
            int r4 = r8.length()
            r3 = 33
            r8.setSpan(r5, r6, r4, r3)
            android.widget.TextView r4 = r7.A02
            r4.setText(r8)
            android.text.method.MovementMethod r3 = android.text.method.LinkMovementMethod.getInstance()
            r4.setMovementMethod(r3)
            android.view.View r3 = r7.A01
            r3.setVisibility(r1)
            com.instagram.common.session.UserSession r6 = r7.A05
            X.0iw r5 = r7.A04
            java.lang.String r4 = "business_inbox_hmps_disabled_composer_impression"
            r3 = 2
            r1 = 0
            X.C3265677h.A0P(r5, r6, r1, r4, r3)
            goto L_0x1491
        L_0x09d1:
            X.7Hl r4 = A06(r0)
            X.4DH r15 = r0.A0u
            androidx.fragment.app.FragmentActivity r3 = r15.requireActivity()
            r4.A1J(r3)
            r0.A08()
            X.7Hl r3 = A06(r0)
            r3.A1B()
            X.2Er r9 = r2.A01()
            com.instagram.common.session.UserSession r8 = r0.A10
            if (r9 == 0) goto L_0x0a8c
            int r4 = r9.C6a()
            r3 = 29
            if (r4 != r3) goto L_0x0a14
            java.util.List r4 = r9.BIp()
            if (r4 == 0) goto L_0x0a14
            java.lang.String r3 = r8.A06
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x0a14
            X.0Tu r6 = X.0Tu.A05
            r3 = 36316512583487916(0x8105ad000511ac, double:3.03004702043175E-306)
            boolean r3 = X.182.A06(r6, r8, r3)
            r11 = 1
            if (r3 != 0) goto L_0x0a15
        L_0x0a14:
            r11 = 0
        L_0x0a15:
            boolean r3 = r9.COP()
            if (r3 != r5) goto L_0x0a29
            X.0Tu r6 = X.0Tu.A05
            r3 = 36328723175259702(0x8110c800013e36, double:3.037769047836334E-306)
            boolean r3 = X.182.A06(r6, r8, r3)
            r10 = 1
            if (r3 == 0) goto L_0x0a2a
        L_0x0a29:
            r10 = 0
        L_0x0a2a:
            boolean r4 = r9.COP()
            r3 = 1
            if (r4 == r5) goto L_0x0a32
            r3 = 0
        L_0x0a32:
            r7 = r3 ^ 1
            boolean r3 = r9.COP()
            if (r3 != r5) goto L_0x0a8a
            X.0Tu r6 = X.0Tu.A05
            r3 = 36328723175194165(0x8110c800003e35, double:3.037769047794888E-306)
            boolean r3 = X.182.A06(r6, r8, r3)
            if (r3 == 0) goto L_0x0a8a
        L_0x0a47:
            if (r11 != 0) goto L_0x0a8c
            if (r10 != 0) goto L_0x0a8c
            if (r7 != 0) goto L_0x0a8c
            if (r5 == 0) goto L_0x0a6f
            X.7Gt r1 = r0.A0G
            if (r1 == 0) goto L_0x11cf
            X.0eM r1 = r1.A0Y
            java.lang.Object r5 = r1.getValue()
            X.LRE r5 = (X.LRE) r5
            androidx.fragment.app.FragmentActivity r4 = r5.A0C
            com.instagram.common.session.UserSession r3 = r5.A0E
            X.LBH r1 = new X.LBH
            r1.<init>(r4, r3, r9)
            r5.A09 = r1
            X.A8Y r1 = new X.A8Y
            r1.<init>(r0)
            r5.A0A = r1
            r0.A0A = r5
        L_0x0a6f:
            X.7Gt r1 = r0.A0G
            if (r1 == 0) goto L_0x11cf
            X.0eM r1 = r1.A0K
            java.lang.Object r4 = r1.getValue()
            X.LF1 r4 = (X.LF1) r4
            r0.A09 = r4
            androidx.fragment.app.FragmentActivity r3 = r15.requireActivity()
            X.7GV r1 = r0.A0B
            if (r1 == 0) goto L_0x1117
            r4.A01(r3, r1, r9)
            goto L_0x1491
        L_0x0a8a:
            r5 = 0
            goto L_0x0a47
        L_0x0a8c:
            X.7Gt r3 = r0.A0G
            if (r3 == 0) goto L_0x11cf
            X.0eM r3 = r3.A0L
            java.lang.Object r8 = r3.getValue()
            X.A9F r8 = (X.A9F) r8
            r0.A08 = r8
            android.view.View r3 = r8.A04
            r3.setVisibility(r1)
            if (r9 == 0) goto L_0x0aa4
            r9.COP()
        L_0x0aa4:
            com.instagram.common.session.UserSession r12 = r8.A06
            if (r9 == 0) goto L_0x0c6c
            int r4 = r9.C6a()
            r3 = 29
            if (r4 != r3) goto L_0x0c4c
            java.util.List r4 = r9.BIp()
            if (r4 == 0) goto L_0x0c4c
            java.lang.String r3 = r12.A06
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x0c4c
            X.0Tu r5 = X.0Tu.A05
            r3 = 36316512583487916(0x8105ad000511ac, double:3.03004702043175E-306)
            boolean r3 = X.182.A06(r5, r12, r3)
            if (r3 == 0) goto L_0x0c4c
            androidx.fragment.app.FragmentActivity r4 = r8.A05
            android.content.Context r3 = r8.A03
            X.KQN r11 = new X.KQN
            r11.<init>(r4, r3, r12, r9)
        L_0x0ad4:
            X.LqG r3 = r8.A00
            boolean r3 = X.0qQ.A0K(r3, r11)
            if (r3 != 0) goto L_0x0a6f
            X.9oQ r10 = r8.A07
            r10.A06(r11)
            boolean r3 = r11 instanceof X.EIq
            if (r3 == 0) goto L_0x0b55
            android.view.ViewGroup r1 = r10.A01()
            r3 = 8
            r1.setVisibility(r3)
            android.view.ViewGroup r1 = r10.A02()
            r1.setVisibility(r3)
            android.view.ViewGroup r1 = r10.A03()
            r1.setVisibility(r3)
            X.AcQ r1 = new X.AcQ
            r1.<init>(r10)
            r11.A06(r1)
            android.view.ViewGroup r1 = r10.A02()
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0b1d
            android.view.animation.Animation r3 = r10.A05
            boolean r1 = r3.hasStarted()
            if (r1 != 0) goto L_0x0b1d
            android.view.ViewGroup r1 = r10.A02()
            r1.startAnimation(r3)
        L_0x0b1d:
            android.view.ViewGroup r1 = r10.A02()
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0b36
            android.view.animation.Animation r3 = r10.A06
            boolean r1 = r3.hasStarted()
            if (r1 != 0) goto L_0x0b36
            android.view.ViewGroup r1 = r10.A03()
            r1.startAnimation(r3)
        L_0x0b36:
            X.4Cq r7 = r10.A09
            r6 = 0
            r3 = 34
            X.ImQ r1 = new X.ImQ
            r1.<init>(r11, r10, r6, r3)
            X.19B r5 = X.19B.A00
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            X.1Eo.A03(r4, r5, r1, r7)
            r3 = 35
            X.ImQ r1 = new X.ImQ
            r1.<init>(r11, r10, r6, r3)
            X.1Eo.A03(r4, r5, r1, r7)
            r8.A00 = r11
            goto L_0x0a6f
        L_0x0b55:
            android.view.ViewGroup r3 = r10.A01()
            r4 = 8
            r3.setVisibility(r4)
            android.view.ViewGroup r3 = r10.A03()
            r3.setVisibility(r4)
            android.view.ViewGroup r3 = r10.A02()
            r3.setVisibility(r1)
            boolean r3 = r10.A0A
            if (r3 == 0) goto L_0x0b77
            android.view.View r3 = r10.A00
            if (r3 == 0) goto L_0x0c95
            r3.setVisibility(r1)
        L_0x0b77:
            X.B2v r5 = r10.A07
            boolean r3 = r5 instanceof X.KQO
            r19 = 0
            if (r3 == 0) goto L_0x0bdd
            X.KQO r5 = (X.KQO) r5
        L_0x0b81:
            android.view.ViewStub r3 = r10.A00
            java.lang.String r4 = "socialContextView"
            if (r3 == 0) goto L_0x0c97
            android.view.ViewParent r3 = r3.getParent()
            if (r3 == 0) goto L_0x0b36
            if (r5 == 0) goto L_0x0b36
            java.util.List r7 = r5.A05
            if (r7 == 0) goto L_0x0b36
            boolean r3 = r7.isEmpty()
            if (r3 != 0) goto L_0x0b36
            android.view.ViewStub r3 = r10.A00
            if (r3 == 0) goto L_0x0c97
            android.view.View r4 = r3.inflate()
            X.0qQ.A0A(r4)
            r6 = 1
            X.0qQ.A0B(r4, r6)
            r3 = 2131441533(0x7f0b377d, float:1.850508E38)
            android.view.View r5 = r4.requireViewById(r3)
            X.0qQ.A07(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r3 = 2131441532(0x7f0b377c, float:1.8505078E38)
            android.view.View r4 = r4.requireViewById(r3)
            X.0qQ.A07(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r13 = r7.iterator()
        L_0x0bc9:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x0be0
            java.lang.Object r3 = r13.next()
            X.JwJ r3 = (X.C61081JwJ) r3
            java.lang.Object r3 = r3.A00
            if (r3 == 0) goto L_0x0bc9
            r12.add(r3)
            goto L_0x0bc9
        L_0x0bdd:
            r5 = r19
            goto L_0x0b81
        L_0x0be0:
            android.content.Context r3 = r10.A03
            android.content.res.Resources r14 = r3.getResources()
            r13 = 2131165204(0x7f070014, float:1.7944619E38)
            int r25 = r14.getDimensionPixelSize(r13)
            java.lang.Integer r20 = X.AnonymousClass05K.A00
            java.lang.String r23 = "BroadcastChannelPreview"
            r21 = r19
            r22 = r19
            r24 = r12
            r26 = r6
            r18 = r3
            X.3b0 r12 = X.C244283aw.A05(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r5.setImageDrawable(r12)
            r5.setVisibility(r1)
            int r5 = r7.size()
            if (r5 <= r6) goto L_0x0c38
            android.content.res.Resources r13 = r3.getResources()
            r12 = 2131820596(0x7f110034, float:1.9273911E38)
            int r5 = r7.size()
            int r5 = r5 - r6
            java.lang.Object r3 = r7.get(r1)
            X.JwJ r3 = (X.C61081JwJ) r3
            java.lang.String r14 = r3.A01
            int r3 = r7.size()
            int r3 = r3 - r6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r14, r3}
            java.lang.String r3 = r13.getQuantityString(r12, r5, r3)
        L_0x0c30:
            r4.setText(r3)
            r4.setVisibility(r1)
            goto L_0x0b36
        L_0x0c38:
            r6 = 2131954260(0x7f130a54, float:1.9545014E38)
            java.lang.Object r5 = r7.get(r1)
            X.JwJ r5 = (X.C61081JwJ) r5
            java.lang.String r5 = r5.A01
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r3 = r3.getString(r6, r5)
            goto L_0x0c30
        L_0x0c4c:
            r4 = 1
            boolean r3 = r9.COP()
            if (r3 != r4) goto L_0x0c6c
            androidx.fragment.app.FragmentActivity r5 = r8.A05
            android.content.Context r4 = r8.A03
            java.lang.String r3 = r8.A09
            X.EIq r11 = new X.EIq
            r22 = r9
            r23 = r3
            r18 = r11
            r19 = r4
            r20 = r5
            r21 = r12
            r18.<init>(r19, r20, r21, r22, r23)
            goto L_0x0ad4
        L_0x0c6c:
            androidx.fragment.app.FragmentActivity r13 = r8.A05
            android.content.Context r10 = r8.A03
            java.lang.String r7 = r8.A09
            boolean r6 = r8.A01
            boolean r5 = r8.A02
            java.lang.String r4 = r8.A0A
            java.lang.String r3 = r8.A08
            X.KQO r11 = new X.KQO
            r22 = r9
            r23 = r7
            r24 = r4
            r25 = r3
            r26 = r6
            r27 = r5
            r18 = r11
            r19 = r10
            r20 = r13
            r21 = r12
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0ad4
        L_0x0c95:
            java.lang.String r4 = "ctaButtonContainerRowDivider"
        L_0x0c97:
            X.0qQ.A0F(r4)
            goto L_0x11d2
        L_0x0c9c:
            X.7Hl r4 = A06(r0)
            X.4DH r3 = r0.A0u
            androidx.fragment.app.FragmentActivity r3 = r3.requireActivity()
            r4.A1J(r3)
            r0.A08()
            X.7Hl r3 = A06(r0)
            r3.A1B()
            X.7Gt r3 = r0.A0G
            if (r3 == 0) goto L_0x11cf
            X.0eM r3 = r3.A0a
            java.lang.Object r6 = r3.getValue()
            X.A7w r6 = (X.C39756A7w) r6
            X.2Er r8 = r2.A01()
            android.view.View r3 = r6.A01
            r3.setVisibility(r1)
            X.9oP r7 = r6.A04
            androidx.fragment.app.FragmentActivity r5 = r6.A02
            android.content.Context r4 = r6.A00
            com.instagram.common.session.UserSession r3 = r6.A03
            if (r8 == 0) goto L_0x0cd5
            r8.CbG()
        L_0x0cd5:
            X.KQM r6 = new X.KQM
            r6.<init>(r4, r5, r3, r8)
            r7.A06(r6)
            android.view.ViewGroup r3 = r7.A01()
            r4 = 8
            r3.setVisibility(r4)
            android.view.ViewGroup r3 = r7.A03()
            r3.setVisibility(r4)
            android.view.ViewGroup r3 = r7.A02()
            r3.setVisibility(r1)
            android.view.View r3 = r7.A00
            if (r3 == 0) goto L_0x0d9d
            r3.setVisibility(r1)
            X.4Cq r5 = r7.A01
            r4 = 0
            r1 = 36
            X.ImQ r3 = new X.ImQ
            r3.<init>(r6, r7, r4, r1)
            X.19B r1 = X.19B.A00
            X.1Eo.A05(r1, r3, r5)
            goto L_0x1491
        L_0x0d0c:
            X.7Hl r4 = A06(r0)
            X.4DH r3 = r0.A0u
            androidx.fragment.app.FragmentActivity r3 = r3.requireActivity()
            r4.A1J(r3)
            r0.A08()
            X.7Hl r3 = A06(r0)
            r3.A1B()
            X.7Gt r3 = r0.A0G
            if (r3 == 0) goto L_0x11cf
            X.0eM r3 = r3.A0c
            java.lang.Object r3 = r3.getValue()
            X.Eyv r3 = (X.C49586Eyv) r3
            r0.A0S = r3
            android.view.View r3 = r3.A01
            goto L_0x12e9
        L_0x0d35:
            X.7Hl r3 = A06(r0)
            X.4DH r1 = r0.A0u
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            r3.A1J(r1)
            r0.A08()
            X.7Hl r1 = A06(r0)
            r1.A1B()
            goto L_0x1491
        L_0x0d4e:
            X.7Hl r4 = A06(r0)
            X.4DH r3 = r0.A0u
            androidx.fragment.app.FragmentActivity r3 = r3.requireActivity()
            r4.A1J(r3)
            r0.A08()
            X.7Hl r3 = A06(r0)
            r3.A1B()
            X.7Gt r3 = r0.A0G
            if (r3 == 0) goto L_0x11cf
            X.0eM r3 = r3.A0b
            java.lang.Object r4 = r3.getValue()
            X.A72 r4 = (X.A72) r4
            r0.A05 = r4
            X.2Er r7 = r2.A01()
            android.view.View r3 = r4.A01
            r3.setVisibility(r1)
            X.AE5 r6 = r4.A03
            android.content.Context r5 = r4.A00
            X.6iu r4 = r4.A02
            X.P0i r3 = new X.P0i
            r3.<init>(r5, r4, r7)
            r6.A06(r3)
            android.view.ViewGroup r3 = r6.A02()
            r3.setVisibility(r1)
            android.view.View r3 = r6.A00
            if (r3 == 0) goto L_0x0d9d
            r3.setVisibility(r1)
            android.view.ViewGroup r3 = r6.A03()
            goto L_0x0de0
        L_0x0d9d:
            java.lang.String r16 = "ctaButtonContainerRowDivider"
            goto L_0x11cf
        L_0x0da1:
            X.7Hl r4 = A06(r0)
            X.4DH r3 = r0.A0u
            androidx.fragment.app.FragmentActivity r3 = r3.requireActivity()
            r4.A1J(r3)
            r0.A08()
            X.7Hl r3 = A06(r0)
            r3.A1B()
            X.7Gt r3 = r0.A0G
            if (r3 == 0) goto L_0x11cf
            X.0eM r3 = r3.A0V
            java.lang.Object r7 = r3.getValue()
            X.ADD r7 = (X.ADD) r7
            r0.A0C = r7
            X.2Er r6 = r2.A01()
            X.7SD r3 = A03(r0)
            X.3Tu r8 = r3.A0H
            X.A8G r4 = X.ADD.A08
            com.instagram.common.session.UserSession r3 = r7.A02
            r16 = r3
            X.9sY r9 = r4.A00(r3, r8, r6)
            boolean r3 = r9.A03
            if (r3 == 0) goto L_0x0de4
            android.view.View r3 = r7.A01
        L_0x0de0:
            r1 = 8
            goto L_0x12e9
        L_0x0de4:
            com.instagram.common.ui.base.IgTextView r8 = r7.A04
            java.lang.Integer r3 = r9.A01
            if (r3 != 0) goto L_0x0e95
            r3 = 8
        L_0x0dec:
            r8.setVisibility(r3)
            com.instagram.common.ui.base.IgTextView r8 = r7.A03
            java.lang.Integer r3 = r9.A00
            if (r3 != 0) goto L_0x0e83
            r3 = 8
        L_0x0df7:
            r8.setVisibility(r3)
            java.lang.Integer r8 = r9.A02
            if (r8 != 0) goto L_0x0e7d
            r3 = -1
        L_0x0dff:
            r12 = 0
            if (r3 == r1) goto L_0x0e72
            if (r3 == r5) goto L_0x0e75
            r3 = r12
        L_0x0e05:
            com.instagram.igds.components.button.IgdsButton r10 = r7.A06
            r4 = 2131960935(0x7f132467, float:1.9558553E38)
            r10.setText((int) r4)
            X.AMb r4 = new X.AMb
            r4.<init>(r3)
            X.AnonymousClass0fU.A00(r4, r10)
            com.instagram.igds.components.button.IgdsButton r4 = r7.A07
            boolean r13 = r9.A04
            if (r13 == 0) goto L_0x0e6c
            r3 = 2131960936(0x7f132468, float:1.9558555E38)
            r4.setText((int) r3)
            X.AMc r3 = new X.AMc
            r3.<init>(r7)
            X.AnonymousClass0fU.A00(r3, r4)
            r4.setVisibility(r1)
        L_0x0e2c:
            X.9sY r3 = r7.A00
            if (r3 == 0) goto L_0x0e32
            if (r3 == r9) goto L_0x0f5a
        L_0x0e32:
            if (r6 == 0) goto L_0x0e67
            java.lang.String r10 = r6.C6C()
            X.4li r3 = r6.Axk()
            if (r3 == 0) goto L_0x0e68
            java.lang.Integer r14 = r3.A02
        L_0x0e40:
            X.4li r3 = r6.Axk()
            if (r3 == 0) goto L_0x0e48
            java.lang.Integer r12 = r3.A03
        L_0x0e48:
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            if (r8 != r4) goto L_0x0f3e
            int r6 = r9.ordinal()
            r3 = 2
            if (r6 == r3) goto L_0x0e64
            r3 = 3
            if (r6 == r3) goto L_0x0e58
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
        L_0x0e58:
            X.7Gs r3 = r7.A05
            X.7TI r6 = r3.A00
            X.7Zg r3 = r6.A08
            if (r3 != 0) goto L_0x0ea7
            java.lang.String r16 = "clientInfra"
            goto L_0x11cf
        L_0x0e64:
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            goto L_0x0e58
        L_0x0e67:
            r10 = r12
        L_0x0e68:
            r14 = r12
            if (r6 == 0) goto L_0x0e48
            goto L_0x0e40
        L_0x0e6c:
            r3 = 8
            r4.setVisibility(r3)
            goto L_0x0e2c
        L_0x0e72:
            r4 = 29
            goto L_0x0e77
        L_0x0e75:
            r4 = 30
        L_0x0e77:
            X.Ay7 r3 = new X.Ay7
            r3.<init>(r7, r4)
            goto L_0x0e05
        L_0x0e7d:
            int r3 = r8.intValue()
            goto L_0x0dff
        L_0x0e83:
            android.content.Context r4 = r8.getContext()
            int r3 = r3.intValue()
            java.lang.String r3 = r4.getString(r3)
            r8.setText(r3)
            r3 = 0
            goto L_0x0df7
        L_0x0e95:
            android.content.Context r4 = r8.getContext()
            int r3 = r3.intValue()
            java.lang.String r3 = r4.getString(r3)
            r8.setText(r3)
            r3 = 0
            goto L_0x0dec
        L_0x0ea7:
            X.7S7 r3 = r3.C6l()
            X.7Kc r8 = r6.A0I(r1)
            com.instagram.common.session.UserSession r6 = r6.A0d
            X.7SD r3 = r3.C6Q()
            X.0qQ.A07(r3)
            boolean r3 = r8.COV(r6, r3)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            r6 = 0
            java.lang.String r8 = "turn_off"
            if (r13 == 0) goto L_0x0f6b
            java.lang.String r3 = "upgrade_app"
        L_0x0ec7:
            java.lang.String[] r3 = new java.lang.String[]{r8, r3}
            X.0qQ.A0B(r3, r1)
            java.util.List r13 = X.03t.A0I(r3)
            java.lang.String r8 = "-"
            java.lang.String r3 = ""
            java.lang.String r13 = X.00k.A0P(r8, r3, r3, r13, r6)
            X.0wc r15 = X.AnonymousClass0kN.A02(r16)
            java.lang.String r8 = "direct_disappearing_messages_composer_disabled_impression"
            X.0kJ r3 = r15.A00
            X.0Aj r15 = r15.A00(r3, r8)
            r3 = 142(0x8e, float:1.99E-43)
            X.1Ln r8 = new X.1Ln
            r8.<init>(r15, r3)
            java.lang.String r3 = "open_thread_id"
            r8.A0R(r3, r10)
            int r3 = r4.intValue()
            switch(r3) {
                case 0: goto L_0x0f68;
                case 1: goto L_0x0f65;
                default: goto L_0x0ef9;
            }
        L_0x0ef9:
            java.lang.String r4 = "unknown"
        L_0x0efb:
            java.lang.String r3 = "composer_type"
            r8.A0R(r3, r4)
            java.lang.String r3 = "composer_block_reason"
            r8.A0R(r3, r13)
            if (r14 == 0) goto L_0x0f63
            int r3 = r14.intValue()
            long r3 = (long) r3
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            long r3 = r13.toMillis(r3)
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
        L_0x0f16:
            java.lang.String r3 = "ephemeral_lifetime_ms"
            r8.A0Q(r3, r4)
            if (r12 == 0) goto L_0x0f36
            int r4 = r12.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            boolean r3 = X.C395049z7.A00(r11, r3)
            if (r3 == 0) goto L_0x0f36
            long r3 = (long) r4
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            long r3 = r6.toMillis(r3)
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
        L_0x0f36:
            java.lang.String r3 = "after_view_lifetime_ms"
            r8.A0Q(r3, r6)
            r8.Cgf()
        L_0x0f3e:
            X.9sY r3 = X.C391229sY.A07
            if (r9 != r3) goto L_0x0f5a
            if (r10 == 0) goto L_0x0f5a
            X.OVs r11 = X.C69881Ntj.A00(r16)
            com.instagram.common.session.UserSession r8 = r11.A00
            X.0Tu r6 = X.0Tu.A05
            r3 = 36325665159722105(0x810e0000133479, double:3.0358351464967173E-306)
            boolean r3 = X.182.A06(r6, r8, r3)
            if (r3 == 0) goto L_0x0f5a
            X.C70997OVs.A00(r11, r10, r5)
        L_0x0f5a:
            android.view.View r3 = r7.A01
            r3.setVisibility(r1)
            r7.A00 = r9
            goto L_0x1491
        L_0x0f63:
            r4 = r6
            goto L_0x0f16
        L_0x0f65:
            java.lang.String r4 = "eligibility_block"
            goto L_0x0efb
        L_0x0f68:
            java.lang.String r4 = "app_version_block"
            goto L_0x0efb
        L_0x0f6b:
            r3 = r6
            goto L_0x0ec7
        L_0x0f6e:
            X.7Hl r4 = A06(r0)
            X.4DH r3 = r0.A0u
            androidx.fragment.app.FragmentActivity r3 = r3.requireActivity()
            r4.A1J(r3)
            r0.A08()
            X.7Hl r3 = A06(r0)
            r3.A1B()
            X.7Gt r3 = r0.A0G
            if (r3 == 0) goto L_0x11cf
            X.0eM r3 = r3.A0S
            java.lang.Object r9 = r3.getValue()
            X.ADB r9 = (X.ADB) r9
            r0.A0n = r9
            X.2Er r15 = r2.A00()
            android.view.View r8 = r9.A02
            r3 = 2131439227(0x7f0b2e7b, float:1.8500403E38)
            android.view.View r3 = r8.requireViewById(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r9.A01 = r3
            r3 = 2131439225(0x7f0b2e79, float:1.85004E38)
            android.view.View r3 = r8.requireViewById(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r9.A00 = r3
            X.A9a r6 = r9.A06
            androidx.fragment.app.FragmentActivity r11 = r9.A03
            r4 = 2131960517(0x7f1322c5, float:1.9557705E38)
            com.instagram.user.model.User r3 = r15.BZK()
            if (r3 == 0) goto L_0x1085
            X.4Cl r3 = r3.A03
            java.lang.String r3 = r3.getUsername()
        L_0x0fc2:
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r3 = r11.getString(r4, r3)
            r7 = 0
            r6.A00(r7, r3, r7, r7)
            r3 = 2131960507(0x7f1322bb, float:1.9557685E38)
            java.lang.String r3 = r11.getString(r3)
            r6.A01(r3)
            android.view.ViewGroup r4 = r9.A01
            if (r4 == 0) goto L_0x0fe4
            r4.removeAllViews()
            android.view.ViewGroup r3 = r6.A00
            r4.addView(r3)
        L_0x0fe4:
            com.instagram.user.model.User r12 = r15.BZK()
            if (r12 == 0) goto L_0x1081
            java.lang.Integer r3 = r12.Bjj()
            if (r3 == 0) goto L_0x1081
            int r4 = r3.intValue()
            r3 = 9
            if (r4 != r3) goto L_0x1081
            X.9tO r13 = X.C391629tO.A0F
        L_0x0ffa:
            int r3 = X.2Yu.A03(r11)
            int r14 = r11.getColor(r3)
            r3 = 2131960511(0x7f1322bf, float:1.9557693E38)
            java.lang.String r10 = r11.getString(r3)
            X.0qQ.A07(r10)
            X.AOA r4 = new X.AOA
            r4.<init>(r13, r9, r12)
            X.OZD r6 = r9.A05
            r3 = 2131437591(0x7f0b2817, float:1.8497085E38)
            X.OZD.A00(r4, r6, r10, r3, r14)
            X.AOB r4 = new X.AOB
            r4.<init>(r13, r9, r12)
            r3 = 2131960512(0x7f1322c0, float:1.9557695E38)
            java.lang.String r3 = r11.getString(r3)
            X.0qQ.A07(r3)
            r6.A02(r3, r4)
            android.view.ViewGroup r4 = r9.A00
            if (r4 == 0) goto L_0x1037
            r4.removeAllViews()
            android.view.ViewGroup r3 = r6.A00
            r4.addView(r3)
        L_0x1037:
            r8.setVisibility(r1)
            X.7SY r4 = r9.A04
            com.instagram.user.model.User r1 = r15.BZK()
            r13 = 0
            if (r1 == 0) goto L_0x107e
            java.lang.Integer r1 = r1.Bjj()
            if (r1 == 0) goto L_0x107e
            int r3 = r1.intValue()
            r1 = 9
            if (r3 != r1) goto L_0x107e
            X.9tO r9 = X.C391629tO.A0F
        L_0x1053:
            com.instagram.user.model.User r1 = r15.BZK()
            if (r1 == 0) goto L_0x105d
            java.lang.String r13 = r1.getId()
        L_0x105d:
            X.9H7 r3 = r4.A00
            com.instagram.common.session.UserSession r8 = r3.A10
            java.lang.String r14 = A07(r3)
            X.3sy r1 = r3.A0b
            boolean r6 = r1 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            boolean r4 = r3.A0j
            X.4DU r3 = r3.A1Q
            r1 = 6
            X.0qQ.A0B(r3, r1)
            r15 = r5
            r16 = r6
            r17 = r4
            r10 = r7
            r11 = r3
            r12 = r8
            X.C3265677h.A05(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x1491
        L_0x107e:
            X.9tO r9 = X.C391629tO.A0V
            goto L_0x1053
        L_0x1081:
            X.9tO r13 = X.C391629tO.A0V
            goto L_0x0ffa
        L_0x1085:
            r3 = 0
            goto L_0x0fc2
        L_0x1088:
            r0.A08()
            X.2Er r3 = r2.A01()
            r0.A0E(r3)
            X.2Er r6 = r2.A01()
            if (r6 == 0) goto L_0x10a8
            java.util.List r4 = r6.BIp()
            if (r4 == 0) goto L_0x10a8
            com.instagram.common.session.UserSession r3 = r0.A10
            java.lang.String r3 = r3.A06
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L_0x10b0
        L_0x10a8:
            com.instagram.common.session.UserSession r3 = r0.A10
            boolean r3 = X.AnonymousClass7OU.A00(r3, r6)
            if (r3 == 0) goto L_0x10cf
        L_0x10b0:
            X.7Gt r3 = r0.A0G
            if (r3 == 0) goto L_0x11cf
            X.0eM r3 = r3.A0K
            java.lang.Object r7 = r3.getValue()
            X.LF1 r7 = (X.LF1) r7
            r0.A09 = r7
            X.4DH r3 = r0.A0u
            androidx.fragment.app.FragmentActivity r6 = r3.requireActivity()
            X.7GV r4 = r0.A0B
            if (r4 == 0) goto L_0x1117
            X.2Er r3 = r2.A01()
            r7.A01(r6, r4, r3)
        L_0x10cf:
            X.4DH r3 = r0.A0u
            boolean r3 = r3.isResumed()
            if (r3 == 0) goto L_0x1491
            A09(r0)
            X.7Hl r7 = A06(r0)
            X.7Ij r3 = r7.A0b
            boolean r3 = r3.A07()
            if (r3 == 0) goto L_0x1491
            com.instagram.common.session.UserSession r6 = r7.A1Z
            X.1Av r3 = X.1Au.A00(r6)
            X.0xa r4 = r3.A01
            r3 = 323(0x143, float:4.53E-43)
            java.lang.String r3 = X.C66579MXk.A00(r3)
            boolean r1 = r4.getBoolean(r3, r1)
            if (r1 != 0) goto L_0x1491
            boolean r1 = X.C329067Hl.A0v(r7)
            if (r1 == 0) goto L_0x1491
            android.content.Context r1 = r7.A1R
            X.C49951FGg.A03(r1, r6)
            X.1Av r1 = X.1Au.A00(r6)
            X.0xa r1 = r1.A01
            X.0xY r1 = r1.AR4()
            r1.E5T(r3, r5)
            r1.apply()
            goto L_0x1491
        L_0x1117:
            X.0qQ.A0F(r17)
            goto L_0x11d2
        L_0x111c:
            X.4DH r8 = r0.A0u
            boolean r3 = r8.isAdded()
            if (r3 == 0) goto L_0x1491
            X.7Hl r4 = A06(r0)
            androidx.fragment.app.FragmentActivity r3 = r8.requireActivity()
            r4.A1J(r3)
            r0.A08()
            X.7Hl r3 = A06(r0)
            r3.A16()
            X.37E r4 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r3 = r8.requireActivity()
            X.37D r5 = r4.A01(r3)
            android.os.Bundle r4 = r8.requireArguments()
            java.lang.String r3 = "DirectThreadFragment.ARGUMENT_IS_BOTTOM_SHEET"
            r4.getBoolean(r3, r1)
            X.7Pu r6 = X.C48943Emh.A00(r5)
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            android.os.Handler r5 = new android.os.Handler
            r5.<init>(r3)
            com.instagram.common.session.UserSession r7 = r0.A10
            android.content.Context r4 = r8.requireContext()
            X.AcP r3 = new X.AcP
            r3.<init>(r5, r0, r6)
            X.HqV r6 = new X.HqV
            r6.<init>(r4, r7, r3)
            X.0Tu r5 = X.0Tu.A05
            r3 = 36886463333532364(0x830c0b000402cc, double:3.3904861697673186E-306)
            java.lang.String r3 = X.182.A04(r5, r7, r3)
            r6.A00(r3, r1)
            X.7Hl r3 = A06(r0)
            r3.A1B()
            X.7Gt r3 = r0.A0G
            if (r3 == 0) goto L_0x11cf
            X.0eM r3 = r3.A0X
            java.lang.Object r5 = r3.getValue()
            X.F0C r5 = (X.F0C) r5
            r0.A0m = r5
            android.content.Context r6 = r5.A00
            com.instagram.common.session.UserSession r7 = r5.A01
            r12 = 2130970246(0x7f040686, float:1.7549197E38)
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            r4 = 4
            X.PqZ r3 = new X.PqZ
            r3.<init>(r5, r4)
            r9 = 0
            r10 = r9
            r13 = r1
            r11 = r3
            X.C49951FGg.A05(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x1491
        L_0x11a4:
            X.7Hl r4 = A06(r0)
            X.4DH r3 = r0.A0u
            androidx.fragment.app.FragmentActivity r3 = r3.requireActivity()
            r4.A1J(r3)
            r0.A08()
            X.7Hl r3 = A06(r0)
            r3.A1B()
            X.7Gt r3 = r0.A0G
            if (r3 == 0) goto L_0x11cf
            X.0eM r3 = r3.A0Q
            java.lang.Object r7 = r3.getValue()
            X.A6m r7 = (X.C39721A6m) r7
            r0.A0o = r7
            X.7Ga r6 = r0.A0a
            if (r6 != 0) goto L_0x11d7
            java.lang.String r16 = "directReachabilityComposerBlockViewModel"
        L_0x11cf:
            X.0qQ.A0F(r16)
        L_0x11d2:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x11d7:
            X.2Er r13 = r2.A00()
            java.util.List r3 = r13.BRZ()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x12b0
            java.util.List r3 = r13.BRZ()
            java.lang.Object r9 = r3.get(r1)
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            X.05G r11 = r6.A02
            java.lang.Object r3 = r11.getValue()
            X.9IA r3 = (X.AnonymousClass9IA) r3
            boolean r3 = r3.A01
            if (r3 == 0) goto L_0x120e
            X.6oS r10 = X.C318116oQ.A00(r6)
            r4 = 0
            r3 = 45
            X.9Jz r8 = new X.9Jz
            r8.<init>((java.lang.Object) r6, (java.lang.Object) r9, (X.AnonymousClass4D7) r4, (int) r3)
            X.19B r4 = X.19B.A00
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            X.1Eo.A03(r3, r4, r8, r10)
        L_0x120e:
            java.lang.Object r12 = r11.getValue()
            r3 = r12
            X.9IA r3 = (X.AnonymousClass9IA) r3
            boolean r10 = r9.A2D()
            boolean r8 = r3.A01
            boolean r4 = r3.A02
            X.9IA r3 = new X.9IA
            r3.<init>(r10, r8, r4, r5)
            boolean r3 = r11.AIY(r12, r3)
            if (r3 == 0) goto L_0x120e
            java.lang.Object r3 = r11.getValue()
            X.9IA r3 = (X.AnonymousClass9IA) r3
            boolean r3 = r3.A02
            if (r3 == 0) goto L_0x12b0
        L_0x1232:
            java.lang.Object r10 = r11.getValue()
            r3 = r10
            X.9IA r3 = (X.AnonymousClass9IA) r3
            boolean r8 = r3.A03
            boolean r4 = r3.A01
            X.9IA r3 = new X.9IA
            r3.<init>(r8, r4, r1, r5)
            boolean r3 = r11.AIY(r10, r3)
            if (r3 == 0) goto L_0x1232
            boolean r3 = r9.A2D()
            if (r3 == 0) goto L_0x1309
            X.9tO r3 = X.C391629tO.A0P
        L_0x1250:
            int r8 = r13.C6a()
            r4 = 1003(0x3eb, float:1.406E-42)
            if (r8 != r4) goto L_0x127f
            com.instagram.common.session.UserSession r8 = r6.A00
            X.6oA r4 = new X.6oA
            r4.<init>(r8)
            boolean r4 = r9.CQp(r4)
            if (r4 == 0) goto L_0x127f
            java.lang.String r4 = r3.toString()
            X.GPq r9 = new X.GPq
            r9.<init>(r8, r4)
            java.lang.String r8 = r13.BZP()
            if (r8 == 0) goto L_0x1306
            r4 = 10
            java.lang.Long r8 = X.00y.A0n(r4, r8)
        L_0x127a:
            java.lang.String r4 = "fan_onboarding_chat_unavailable"
            X.C52369GPq.A03(r9, r8, r4)
        L_0x127f:
            com.instagram.common.session.UserSession r11 = r6.A00
            java.lang.String r10 = r13.BZP()
            X.3sy r8 = r13.BJz()
            boolean r4 = r8 instanceof com.instagram.model.direct.DirectThreadKey
            if (r4 == 0) goto L_0x1303
            com.instagram.model.direct.DirectThreadKey r8 = X.C66647MaG.A04(r8)
            if (r8 == 0) goto L_0x1303
            X.2Dm r4 = X.2L2.A00(r11)
            X.2Dr r4 = (X.2Dr) r4
            X.3U9 r8 = X.2Dr.A03(r4, r8)
            if (r8 == 0) goto L_0x1303
            com.instagram.user.model.User r9 = r8.BZK()
            if (r9 == 0) goto L_0x1303
            boolean r4 = r9.A2A()
            if (r4 == 0) goto L_0x12ee
            X.9tG r4 = X.C391549tG.FOLLOWED_BY_RECIPIENT
        L_0x12ad:
            X.AIh.A01(r3, r4, r11, r10, r5)
        L_0x12b0:
            X.A7D r8 = r7.A03
            android.content.Context r10 = r7.A00
            com.instagram.common.session.UserSession r12 = r7.A02
            java.util.List r3 = r13.BRZ()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x12e7
            java.util.List r3 = r13.BRZ()
            java.lang.Object r4 = r3.get(r1)
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            java.lang.String r3 = "direct_reachability_composer_block"
            X.0xG r11 = new X.0xG
            r11.<init>(r3)
            X.6oS r5 = X.C318116oQ.A00(r6)
            r17 = 0
            X.MGq r9 = new X.MGq
            r14 = r8
            r15 = r6
            r16 = r4
            r9.<init>((android.content.Context) r10, (X.0xG) r11, (com.instagram.common.session.UserSession) r12, (X.2Er) r13, (X.A7D) r14, (X.C328737Ga) r15, (com.instagram.user.model.User) r16, (X.AnonymousClass4D7) r17)
            X.19B r4 = X.19B.A00
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            X.1Eo.A03(r3, r4, r9, r5)
        L_0x12e7:
            android.view.View r3 = r7.A01
        L_0x12e9:
            r3.setVisibility(r1)
            goto L_0x1491
        L_0x12ee:
            X.3su r4 = r8.BLG()
            if (r4 == 0) goto L_0x1303
            java.lang.String r8 = r4.A1u
            java.lang.String r4 = r9.getId()
            boolean r4 = X.0qQ.A0K(r8, r4)
            if (r4 == 0) goto L_0x1303
            X.9tG r4 = X.C391549tG.HAS_MESSAGES_FROM_RECIPIENT
            goto L_0x12ad
        L_0x1303:
            X.9tG r4 = X.C391549tG.A05
            goto L_0x12ad
        L_0x1306:
            r8 = 0
            goto L_0x127a
        L_0x1309:
            com.instagram.user.model.FollowStatus r3 = r9.B6o()
            int r4 = r3.ordinal()
            r3 = 4
            if (r4 == r3) goto L_0x131f
            r3 = 5
            if (r4 == r3) goto L_0x131b
            X.9tO r3 = X.C391629tO.A0Q
            goto L_0x1250
        L_0x131b:
            X.9tO r3 = X.C391629tO.A0O
            goto L_0x1250
        L_0x131f:
            X.9tO r3 = X.C391629tO.A0N
            goto L_0x1250
        L_0x1323:
            X.7Hl r4 = r0.A0R
            if (r4 == 0) goto L_0x1491
            X.4DH r3 = r0.A0u
            androidx.fragment.app.FragmentActivity r3 = r3.requireActivity()
            r4.A1J(r3)
            X.2Er r3 = r2.A01()
            if (r3 == 0) goto L_0x133c
            boolean r3 = r3.CUG()
            r0.A0j = r3
        L_0x133c:
            X.7GM r3 = X.AnonymousClass7GM.FEATURE_LIMITED
            if (r6 != r3) goto L_0x13d5
            X.0eK r3 = r0.A1X
            java.lang.Object r8 = r3.get()
            X.A5T r8 = (X.A5T) r8
            long r5 = r2.A01
            boolean r11 = r0.A0j
            X.7SZ r4 = r0.A16
            r3 = 2
            X.0qQ.A0B(r4, r3)
            r10 = 0
            r12 = 0
            int r3 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r3 < 0) goto L_0x1491
            android.content.Context r9 = r8.A00
            r3 = 2131959283(0x7f131df3, float:1.9555202E38)
            java.lang.String r12 = r9.getString(r3)
            X.0qQ.A07(r12)
            X.9tO r3 = X.C391629tO.A03
            X.AO9 r15 = new X.AO9
            r15.<init>(r3, r4, r11)
        L_0x136c:
            X.A83 r7 = new X.A83
            r7.<init>(r3)
            double r3 = (double) r5
            r13 = 4725329023423479808(0x4193bdb600000000, double:8.28E7)
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x13c0
            r5 = 4704985352480227328(0x414b774000000000, double:3600000.0)
            double r3 = r3 / r5
            double r3 = java.lang.Math.ceil(r3)
            int r5 = (int) r3
            android.content.Context r3 = r8.A00
            android.content.res.Resources r6 = r3.getResources()
            r4 = 2131820657(0x7f110071, float:1.9274035E38)
        L_0x138f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r3 = r6.getQuantityString(r4, r5, r3)
            X.0qQ.A0A(r3)
            X.0qQ.A0B(r3, r1)
            r7.A07 = r3
            r7.A05 = r10
            r1 = 2131959284(0x7f131df4, float:1.9555204E38)
            java.lang.String r1 = r9.getString(r1)
            X.0qQ.A07(r1)
            r7.A02 = r1
            r7.A06 = r12
            r7.A01 = r15
            r7.A04 = r10
            r7.A08 = r11
        L_0x13b9:
            X.A84 r1 = new X.A84
            r1.<init>(r7)
            goto L_0x148e
        L_0x13c0:
            r5 = 4725570615333879808(0x4194997000000000, double:8.64E7)
            double r3 = r3 / r5
            double r3 = java.lang.Math.ceil(r3)
            int r5 = (int) r3
            android.content.Context r3 = r8.A00
            android.content.res.Resources r6 = r3.getResources()
            r4 = 2131820656(0x7f110070, float:1.9274033E38)
            goto L_0x138f
        L_0x13d5:
            X.7GM r3 = X.AnonymousClass7GM.ENFORCEMENT_NOTICE
            if (r6 != r3) goto L_0x1491
            X.0eK r3 = r0.A1X
            java.lang.Object r8 = r3.get()
            X.A5T r8 = (X.A5T) r8
            long r5 = r2.A01
            java.lang.String r13 = r2.A05
            java.lang.String r7 = r2.A06
            boolean r11 = r0.A0j
            X.7SZ r4 = r0.A16
            r3 = 4
            X.0qQ.A0B(r4, r3)
            r10 = 0
            r14 = 0
            int r3 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x1491
            android.content.Context r9 = r8.A00
            r3 = 2131959240(0x7f131dc8, float:1.9555115E38)
            java.lang.String r12 = r9.getString(r3)
            X.0qQ.A07(r12)
            X.9tO r3 = X.C391629tO.A02
            X.AON r15 = new X.AON
            r20 = r11
            r16 = r3
            r17 = r4
            r18 = r13
            r19 = r7
            r15.<init>(r16, r17, r18, r19, r20)
            goto L_0x136c
        L_0x1415:
            X.7Hl r3 = r0.A0R
            if (r3 == 0) goto L_0x1491
            X.4DH r1 = r0.A0u
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            r3.A1J(r1)
            X.2Er r1 = r2.A01()
            if (r1 == 0) goto L_0x142e
            boolean r1 = r1.CUG()
            r0.A0j = r1
        L_0x142e:
            X.0eK r1 = r0.A1X
            java.lang.Object r4 = r1.get()
            X.A5T r4 = (X.A5T) r4
            java.lang.String r9 = r2.A04
            java.lang.String r8 = r2.A07
            X.7SZ r3 = r0.A16
            r1 = 2
            X.0qQ.A0B(r3, r1)
            if (r9 == 0) goto L_0x1491
            int r1 = r9.length()
            if (r1 == 0) goto L_0x1491
            r7 = 0
            if (r8 == 0) goto L_0x1491
            int r1 = r8.length()
            if (r1 == 0) goto L_0x1491
            android.content.Context r6 = r4.A00
            r1 = 2131959823(0x7f13200f, float:1.9556297E38)
            java.lang.String r5 = r6.getString(r1)
            X.0qQ.A07(r5)
            X.9tO r1 = X.C391629tO.A0E
            X.AOJ r4 = new X.AOJ
            r4.<init>(r1, r3, r9, r8)
            X.A83 r3 = new X.A83
            r3.<init>(r1)
            r1 = 2131959825(0x7f132011, float:1.9556301E38)
            java.lang.String r1 = r6.getString(r1)
            X.0qQ.A07(r1)
            r3.A07 = r1
            r3.A05 = r7
            r1 = 2131959824(0x7f132010, float:1.95563E38)
            java.lang.String r1 = r6.getString(r1)
            X.0qQ.A07(r1)
            r3.A02 = r1
            r3.A06 = r5
            r3.A01 = r4
            r3.A04 = r7
            X.A84 r1 = new X.A84
            r1.<init>(r3)
        L_0x148e:
            r0.A0F(r1)
        L_0x1491:
            X.2Ep r1 = A04(r0)
            if (r1 == 0) goto L_0x14c8
            int r3 = r1.C6a()
            r1 = 29
            if (r3 != r1) goto L_0x14c8
            X.2Ep r1 = A04(r0)
            if (r1 == 0) goto L_0x14c8
            java.lang.String r3 = r1.AsX()
            com.instagram.common.session.UserSession r5 = r0.A10
            java.lang.String r1 = r5.A06
            boolean r1 = X.0qQ.A0K(r3, r1)
            if (r1 == 0) goto L_0x14c8
            X.2Ep r4 = A04(r0)
            r1 = 1
            if (r4 == 0) goto L_0x14cd
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r1 = r4.Amk()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x14cd
        L_0x14c8:
            X.2B7 r0 = r0.A1N
            r0.A00 = r2
            return
        L_0x14cd:
            X.0Tu r1 = X.0Tu.A05
            r3 = 36322727400909173(0x810b5400012975, double:3.033977295994014E-306)
            boolean r1 = X.182.A06(r1, r5, r3)
            if (r1 == 0) goto L_0x14c8
            X.7Hl r1 = A06(r0)
            r1.A1D()
            goto L_0x14c8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9H7.A0I(X.7GK):void");
    }

    public final void A0J(C254743sy r6) {
        0qQ.A0B(r6, 0);
        DirectThreadKey A042 = C66647MaG.A04(r6);
        if (A042 != null) {
            DirectThreadKey A043 = C66647MaG.A04(this.A0b);
            if (A043 == null || !0qQ.A0K(A043.A00, A042.A00) || !0qQ.A0K(A043.A01, A042.A01)) {
                this.A0b = r6;
                A0E(2L2.A00(this.A10).B33(C66647MaG.A03(this.A0b)));
                return;
            }
            return;
        }
        MsysThreadId A072 = C66647MaG.A07(r6);
        if (A072 != null) {
            MsysThreadId A073 = C66647MaG.A07(this.A0b);
            if (A073 == null || A073.A00 != A072.A00) {
                this.A0b = r6;
            }
            if (this.A0F != null) {
                A0I(A01(this).A0J());
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C66579MXk.A00(559));
        sb.append(r6);
        throw new IllegalStateException(sb.toString());
    }

    public final void EIL() {
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.4DU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v5, types: [com.instagram.model.direct.DirectThreadKey] */
    /* JADX WARNING: type inference failed for: r4v7, types: [com.instagram.model.direct.DirectThreadKey] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0166, code lost:
        if (X.182.A06(X.0Tu.A06, r0, 36315146783558682L) == false) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0120, code lost:
        if (X.182.A06(X.0Tu.A06, r8.A10, 36315146783558682L) == false) goto L_0x0122;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0257  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9H7(android.os.Bundle r28, X.AnonymousClass4DH r29, X.AnonymousClass4DJ r30, com.instagram.common.session.UserSession r31, X.AnonymousClass4D6 r32, com.instagram.direct.capabilities.Capabilities r33, X.AnonymousClass9H6 r34, X.AnonymousClass9H3 r35, X.AnonymousClass9H5 r36, boolean r37) {
        /*
            r27 = this;
            r8 = r27
            r8.<init>()
            r6 = r29
            r8.A0u = r6
            r5 = r31
            r8.A10 = r5
            r0 = r32
            r8.A11 = r0
            r26 = r30
            r0 = r26
            r8.A0y = r0
            r7 = r28
            r8.A0r = r7
            r0 = r36
            r8.A1O = r0
            r0 = r34
            r8.A1D = r0
            r14 = r33
            r8.A13 = r14
            r10 = r35
            r8.A1M = r10
            X.9H8 r0 = new X.9H8
            r0.<init>()
            r8.A1Q = r0
            X.3t2 r4 = X.AnonymousClass9H9.A00(r7)
            r8.A1S = r4
            X.9HA r0 = new X.9HA
            r0.<init>(r8)
            r8.A12 = r0
            X.9HB r0 = new X.9HB
            r0.<init>()
            r8.A1T = r0
            X.1Ng r0 = X.AnonymousClass1Nd.A00(r5)
            r8.A0v = r0
            java.lang.String r0 = "DirectFragment.ENTRY_POINT"
            java.lang.String r9 = r7.getString(r0)
            if (r9 == 0) goto L_0x030e
            r8.A1V = r9
            java.lang.String r0 = "ad_id"
            java.lang.String r0 = r7.getString(r0)
            r8.A1U = r0
            X.9HD r0 = X.AnonymousClass9HC.A1b
            X.9HC r0 = r0.A00(r5, r14)
            r8.A1H = r0
            android.content.Context r2 = X.C60960kU.A00
            X.0qQ.A07(r2)
            r1 = 28
            X.Ply r0 = new X.Ply
            r0.<init>(r2, r1)
            X.0t0 r1 = X.AnonymousClass0eN.A01(r0)
            X.9HO r0 = new X.9HO
            r0.<init>(r1)
            r8.A1F = r0
            r1 = 39
            X.9Ko r0 = new X.9Ko
            r0.<init>(r8, r1)
            X.0eM r0 = X.AnonymousClass1YB.A00(r0)
            r8.A1Z = r0
            X.02m r0 = X.02m.A0p
            r8.A1b = r0
            r12 = 43
            X.9Ko r11 = new X.9Ko
            r11.<init>(r8, r12)
            java.lang.Class<X.9HP> r0 = X.AnonymousClass9HP.class
            X.0Yh r3 = new X.0Yh
            r3.<init>(r0)
            r0 = 44
            X.9Ko r2 = new X.9Ko
            r2.<init>(r6, r0)
            r17 = 0
            X.9Lu r1 = new X.9Lu
            r0 = r17
            r1.<init>(r12, r0, r6)
            X.2kA r0 = new X.2kA
            r0.<init>(r2, r11, r1, r3)
            r8.A1a = r0
            r1 = 32
            X.9Ko r0 = new X.9Ko
            r0.<init>(r8, r1)
            X.0eM r0 = X.AnonymousClass1YB.A00(r0)
            r8.A1Y = r0
            X.9HQ r0 = X.AnonymousClass9HQ.A00
            X.0eM r0 = X.AnonymousClass1YB.A00(r0)
            r8.A1e = r0
            r0 = 15
            X.Pli r1 = new X.Pli
            r1.<init>(r5, r0)
            java.lang.Class<X.2B7> r0 = X.2B7.class
            java.lang.Object r0 = r5.A01(r0, r1)
            X.2B7 r0 = (X.2B7) r0
            r8.A1N = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            X.0qQ.A07(r0)
            r8.A1W = r0
            java.lang.String r1 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_LINKED_OPEN_THREAD_ID"
            r0 = r17
            java.lang.String r12 = r7.getString(r1, r0)
            if (r12 == 0) goto L_0x00f5
            com.instagram.model.direct.DirectThreadKey r0 = new com.instagram.model.direct.DirectThreadKey
            r0.<init>((java.lang.String) r12)
        L_0x00f5:
            r8.A1R = r0
            X.3tH r11 = X.AnonymousClass6W3.A00(r4)
            X.0eE r15 = X.AnonymousClass0t1.A01
            X.0t1 r0 = X.0eE.A00(r5)
            com.instagram.user.model.User r0 = r0.A00()
            boolean r1 = r0.A2L()
            java.lang.String r0 = "is_professional_account"
            r10.A02(r0, r1)
            X.3tH r2 = X.C254923tH.ACT
            if (r11 != r2) goto L_0x0122
            com.instagram.common.session.UserSession r13 = r8.A10
            X.0Tu r3 = X.0Tu.A06
            r0 = 36315146783558682(0x81046f00000c1a, double:3.0291832830568674E-306)
            boolean r0 = X.182.A06(r3, r13, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0123
        L_0x0122:
            r1 = 0
        L_0x0123:
            java.lang.String r0 = "is_tangerine"
            r10.A02(r0, r1)
            java.lang.String r0 = "has_linked_open_thread_id"
            r3 = 0
            r10.A02(r0, r3)
            r16 = 1
            r1 = 0
            if (r12 == 0) goto L_0x0134
            r1 = 1
        L_0x0134:
            boolean r0 = r4 instanceof X.AnonymousClass9HR
            if (r0 == 0) goto L_0x0147
            java.lang.String r0 = "is_vm"
            r10.A02(r0, r1)
            java.lang.String r0 = "is_mixvm"
            r10.A02(r0, r1)
            java.lang.String r0 = "is_mixvm_eligible"
            r10.A02(r0, r1)
        L_0x0147:
            boolean r13 = A1f
            com.instagram.common.session.UserSession r0 = r8.A10
            com.instagram.user.model.User r12 = r15.A01(r0)
            boolean r23 = r12.A2L()
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r13)
            if (r11 != r2) goto L_0x0168
            X.0Tu r2 = X.0Tu.A06
            r12 = 36315146783558682(0x81046f00000c1a, double:3.0291832830568674E-306)
            boolean r2 = X.182.A06(r2, r0, r12)
            r24 = 1
            if (r2 != 0) goto L_0x016a
        L_0x0168:
            r24 = 0
        L_0x016a:
            X.9HS r2 = new X.9HS
            r25 = r1
            r18 = r2
            r19 = r0
            r20 = r11
            r21 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r8.A1J = r2
            java.lang.String r0 = "via_push_notification"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x030a
            java.lang.String r0 = "push"
            X.0xG r11 = new X.0xG
            r11.<init>(r0)
        L_0x018a:
            X.18g r0 = r10.A08
            X.1Jv r0 = r0.A05
            if (r0 == 0) goto L_0x01a5
            X.1CS r0 = r0.A0O
            java.lang.String r0 = r0.name()
            if (r0 == 0) goto L_0x01a5
            X.0Tu r9 = X.0Tu.A05
            r0 = 2342161067986523964(0x208107150016173c, double:4.063939884266912E-152)
            boolean r0 = X.182.A06(r9, r5, r0)
            if (r0 == 0) goto L_0x01b4
        L_0x01a5:
            if (r37 != 0) goto L_0x01b4
            android.content.Context r9 = r6.requireContext()
            X.2cc r1 = X.C71342cb.A00(r5)
            r0 = r26
            r2.A0O(r9, r1, r11, r0)
        L_0x01b4:
            X.9HW r0 = X.AnonymousClass9HV.A00(r5)
            X.7Rr r0 = X.C331607Rq.A00(r5, r14, r0, r4)
            r8.A1L = r0
            com.instagram.common.session.UserSession r9 = r8.A10
            r0 = 35
            X.9Ko r2 = new X.9Ko
            r2.<init>(r6, r0)
            r1 = 36
            X.9Ko r0 = new X.9Ko
            r0.<init>(r6, r1)
            X.7Rs r11 = new X.7Rs
            r11.<init>(r2, r9, r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            X.4DU r2 = r8.A1Q
            android.os.Bundle r1 = r8.A0r
            java.lang.String r0 = "bundle_extra_omnipicker_is_chat_preview"
            boolean r1 = r1.getBoolean(r0, r3)
            X.7Rt r0 = new X.7Rt
            r0.<init>(r6, r2, r11, r1)
            r10.add(r0)
            r0 = 33
            X.9Ko r12 = new X.9Ko
            r12.<init>(r8, r0)
            r0 = 22
            X.9Km r9 = new X.9Km
            r9.<init>(r8, r0)
            r0 = 23
            X.9Km r2 = new X.9Km
            r2.<init>(r8, r0)
            r0 = 34
            X.9Ko r1 = new X.9Ko
            r1.<init>(r8, r0)
            X.7Rx r0 = new X.7Rx
            r19 = r6
            r20 = r11
            r21 = r12
            r22 = r1
            r23 = r9
            r24 = r2
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r10.add(r0)
            X.7S0 r0 = new X.7S0
            r0.<init>(r11)
            r10.add(r0)
            X.7S2 r0 = new X.7S2
            r0.<init>(r10)
            r8.A1I = r0
            boolean r0 = r4 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 != 0) goto L_0x023c
            boolean r0 = r4 instanceof X.C254763t0
            if (r0 == 0) goto L_0x02f7
            X.3t0 r4 = (X.C254763t0) r4
            java.lang.String r0 = r4.A00
            com.instagram.model.direct.DirectThreadKey r4 = new com.instagram.model.direct.DirectThreadKey
            r4.<init>((java.lang.String) r0)
        L_0x023c:
            if (r37 != 0) goto L_0x0244
            r0 = r4
            X.3sy r0 = (X.C254743sy) r0
            r8.A0J(r0)
        L_0x0244:
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CURRENT_THEME_ID"
            int r0 = r7.getInt(r0, r3)
            r8.A0q = r0
            X.7SE r2 = new X.7SE
            r2.<init>(r5)
            r8.A1E = r2
            boolean r0 = r4 instanceof com.instagram.model.direct.DirectThreadKey
            if (r0 == 0) goto L_0x0268
            X.3U9 r1 = A05(r8)
            if (r1 == 0) goto L_0x0261
            int r3 = r1.C6a()
        L_0x0261:
            X.7SG r0 = new X.7SG
            r0.<init>(r5, r2, r1, r3)
            r8.A0K = r0
        L_0x0268:
            A1f = r16
            X.7SI r0 = new X.7SI
            r0.<init>(r8)
            r8.A1K = r0
            X.7SJ r0 = new X.7SJ
            r0.<init>(r8)
            r8.A0z = r0
            X.7SK r0 = new X.7SK
            r0.<init>(r8)
            r8.A0s = r0
            X.7SL r0 = new X.7SL
            r0.<init>(r8)
            r8.A1c = r0
            X.7SM r0 = new X.7SM
            r0.<init>(r8)
            r8.A1B = r0
            X.7SP r0 = new X.7SP
            r0.<init>(r8)
            r8.A0t = r0
            X.7SQ r0 = new X.7SQ
            r0.<init>(r8)
            r8.A1A = r0
            X.7SR r0 = new X.7SR
            r0.<init>(r8)
            r8.A14 = r0
            X.7SS r0 = new X.7SS
            r0.<init>(r8)
            r8.A1G = r0
            X.7SU r0 = new X.7SU
            r0.<init>(r8)
            r8.A19 = r0
            X.7SV r0 = new X.7SV
            r0.<init>(r8)
            r8.A1X = r0
            X.7SW r0 = new X.7SW
            r0.<init>(r8)
            r8.A1P = r0
            X.7SY r0 = new X.7SY
            r0.<init>(r8)
            r8.A15 = r0
            X.7SZ r0 = new X.7SZ
            r0.<init>(r8)
            r8.A16 = r0
            X.7Sa r0 = new X.7Sa
            r0.<init>(r8)
            r8.A18 = r0
            X.7Sb r0 = new X.7Sb
            r0.<init>(r8)
            r8.A1d = r0
            X.7Sd r0 = new X.7Sd
            r0.<init>(r8)
            r8.A0x = r0
            X.7Se r0 = new X.7Se
            r0.<init>(r8)
            r8.A0w = r0
            X.7Sf r0 = new X.7Sf
            r0.<init>(r8)
            r8.A1C = r0
            X.7Sg r0 = new X.7Sg
            r0.<init>(r8)
            r8.A17 = r0
            return
        L_0x02f7:
            boolean r0 = r4 instanceof X.C291175gg
            if (r0 == 0) goto L_0x0306
            X.5gg r4 = (X.C291175gg) r4
            java.util.List r0 = r4.A00
            com.instagram.model.direct.DirectThreadKey r4 = new com.instagram.model.direct.DirectThreadKey
            r4.<init>((java.util.Collection) r0)
            goto L_0x023c
        L_0x0306:
            r4 = r17
            goto L_0x0244
        L_0x030a:
            r11 = r17
            goto L_0x018a
        L_0x030e:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9H7.<init>(android.os.Bundle, X.4DH, X.4DJ, com.instagram.common.session.UserSession, X.4D6, com.instagram.direct.capabilities.Capabilities, X.9H6, X.9H3, X.9H5, boolean):void");
    }

    public static final Activity A00(AnonymousClass9H7 r1) {
        Activity rootActivity = r1.A0u.getRootActivity();
        if (rootActivity != null) {
            return rootActivity;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final AnonymousClass7TI A01(AnonymousClass9H7 r1) {
        C273474md r0 = r1.A0F;
        if (r0 != null) {
            AnonymousClass7TI r02 = r0.A00;
            if (r02 != null) {
                return r02;
            }
            0qQ.A0F("threadController");
            throw AnonymousClass00P.createAndThrow();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final C273474md A02(Bundle bundle, AnonymousClass9H7 r37, boolean z) {
        C273474md r7 = new C273474md();
        r7.setArguments(bundle);
        AnonymousClass4DU r33 = r7.A03;
        AnonymousClass7TD r36 = r7.A02;
        AnonymousClass9H7 r10 = r37;
        C331617Rr r23 = r10.A1L;
        AnonymousClass9HC r16 = r10.A1H;
        C331787Sj r12 = r10.A0J;
        if (r12 == null) {
            0qQ.A0F("directThreadDataViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass7SM r18 = r10.A1B;
        AnonymousClass7SQ r17 = r10.A1A;
        C331747Sf r19 = r10.A1C;
        AnonymousClass54L r15 = new AnonymousClass54L(r10);
        AnonymousClass7ST r14 = r10.A1G;
        AnonymousClass7SU r13 = r10.A19;
        AnonymousClass9H6 r11 = r10.A1D;
        AnonymousClass7SE r9 = r10.A1E;
        AnonymousClass7SG r8 = r10.A0K;
        AnonymousClass9HS r6 = r10.A1J;
        AnonymousClass9H3 r5 = r10.A1M;
        C331757Sg r4 = r10.A17;
        AnonymousClass3E6 r3 = r10.A06;
        if (r3 == null) {
            r3 = AnonymousClass3E4.A01(r10, false, false);
        }
        AnonymousClass54L r142 = r15;
        C331757Sg r152 = r4;
        AnonymousClass7SU r162 = r13;
        AnonymousClass9H6 r232 = r11;
        C273474md r112 = r7;
        AnonymousClass3E6 r122 = r3;
        AnonymousClass7TD r132 = r36;
        AnonymousClass7TI r92 = new AnonymousClass7TI(r10, r112, r122, r132, r142, r152, r162, r17, r18, r19, r10, r10, r10, r232, r12, r9, r8, r10.A1F, r14, r16, r6, r23, r5, r33, r10, r10.A1U, z);
        r10.A0E = r92;
        0qQ.A0B(r6, 1);
        r7.A01 = r6;
        r7.A00 = r92;
        return r7;
    }

    public static final AnonymousClass2Ep A04(AnonymousClass9H7 r2) {
        C254743sy r0 = r2.A0b;
        if (r0 == null || !(r0 instanceof DirectThreadKey)) {
            return null;
        }
        return A05(r2);
    }

    public static final AnonymousClass3U9 A05(AnonymousClass9H7 r2) {
        DirectThreadKey A042;
        C254743sy r1 = r2.A0b;
        if (r1 == null || (A042 = C66647MaG.A04(r1)) == null) {
            return null;
        }
        return 2Dr.A03(2L2.A00(r2.A10), A042);
    }

    public static final C329067Hl A06(AnonymousClass9H7 r1) {
        C329067Hl r0 = r1.A0R;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Deprecated(message = "Please use [mUnifiedThreadKey] instead.")
    public static final String A07(AnonymousClass9H7 r1) {
        C254743sy r12 = r1.A0b;
        if (r12 instanceof DirectThreadKey) {
            return C66647MaG.A03(r12).A00;
        }
        if (r12 instanceof MsysThreadId) {
            return String.valueOf(C66647MaG.A06(r12).A00);
        }
        return null;
    }

    private final void A08() {
        View view;
        View view2;
        ADC adc = this.A0Z;
        if (!(adc == null || (view2 = adc.A00) == null)) {
            view2.setVisibility(8);
        }
        A90 a90 = this.A0X;
        if (a90 != null) {
            AnonymousClass0eM r1 = a90.A03;
            if (r1.CVQ()) {
                ((View) r1.getValue()).setVisibility(8);
            }
        }
        C39758A7y a7y = this.A0Y;
        if (!(a7y == null || (view = a7y.A00) == null)) {
            view.setVisibility(8);
        }
        C39743A7j a7j = this.A0N;
        if (a7j != null) {
            a7j.A01.setVisibility(8);
        }
        C39744A7k a7k = this.A0O;
        if (a7k != null) {
            a7k.A01.setVisibility(8);
        }
        A9F a9f = this.A08;
        if (a9f != null) {
            a9f.A04.setVisibility(8);
        }
        LRE lre = this.A0A;
        if (lre != null) {
            LRE.A01(lre, C62500Kgq.HIDDEN);
        }
        LF1 lf1 = this.A09;
        if (lf1 != null) {
            lf1.A00.setVisibility(8);
        }
        C39721A6m a6m = this.A0o;
        if (a6m != null) {
            a6m.A01.setVisibility(8);
        }
        C49586Eyv eyv = this.A0S;
        if (eyv != null) {
            eyv.A01.setVisibility(8);
        }
        A72 a72 = this.A05;
        if (a72 != null) {
            a72.A01.setVisibility(8);
        }
        ADD add = this.A0C;
        if (add != null) {
            add.A01.setVisibility(8);
        }
        ADB adb = this.A0n;
        if (adb != null) {
            adb.A02.setVisibility(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36320438185632202L) == false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0A(X.AnonymousClass9H7 r22) {
        /*
            r5 = r22
            boolean r0 = r5.A0h
            if (r0 != 0) goto L_0x008d
            com.instagram.common.session.UserSession r3 = r5.A10
            X.9HC r0 = r5.A1H
            X.7S4 r2 = new X.7S4
            r2.<init>(r3, r0)
            X.3U9 r1 = A05(r5)
            if (r1 == 0) goto L_0x008d
            java.lang.String r0 = r1.C6C()
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r1.C6k()
            if (r0 == 0) goto L_0x008d
            java.lang.String r1 = r1.C6C()
            X.3U9 r0 = A05(r5)
            r10 = 0
            X.7SD r1 = r2.A00(r0, r1, r10)
            boolean r9 = r1.A0o
            android.os.Bundle r6 = r5.A0r
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_AUTO_SEND_MESSAGE_DATA"
            android.os.Parcelable r7 = r6.getParcelable(r0)
            com.instagram.direct.model.launcher.AutoSendMessageData r7 = (com.instagram.direct.model.launcher.AutoSendMessageData) r7
            boolean r0 = r1.A13
            r4 = 1
            if (r0 == 0) goto L_0x005e
            X.1Av r0 = X.1Au.A00(r3)
            java.lang.String r1 = "meta_ai_in_thread_blocking_nux"
            X.0qQ.A0B(r1, r10)
            X.0xa r0 = r0.A01
            boolean r0 = r0.getBoolean(r1, r10)
            if (r0 != 0) goto L_0x005e
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320438185632202(0x81093f002421ca, double:3.0325295870349274E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r8 = 1
            if (r0 != 0) goto L_0x005f
        L_0x005e:
            r8 = 0
        L_0x005f:
            if (r7 != 0) goto L_0x008e
            X.4DH r0 = r5.A0u
            android.os.Bundle r1 = r0.requireArguments()
            java.lang.String r0 = "DirectThreadFragment.ARGUMENT_IS_BOTTOM_SHEET"
            boolean r4 = r1.getBoolean(r0, r10)
            if (r9 == 0) goto L_0x008d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324831934886284(0x810d3e0001318c, double:3.035308211755417E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x008d
            if (r4 == 0) goto L_0x008d
            boolean r0 = X.C331227Qb.A03(r3)
            if (r0 == 0) goto L_0x008d
            if (r8 != 0) goto L_0x008d
            X.7Hl r0 = A06(r5)
            r0.A1D()
        L_0x008d:
            return
        L_0x008e:
            if (r9 == 0) goto L_0x00aa
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324831934886284(0x810d3e0001318c, double:3.035308211755417E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00a4
            X.7Hl r0 = A06(r5)
            r0.A16()
        L_0x00a4:
            boolean r0 = X.C331227Qb.A03(r3)
            if (r0 == 0) goto L_0x008d
        L_0x00aa:
            if (r8 != 0) goto L_0x008d
            X.7TI r0 = A01(r5)
            X.7L9 r8 = r0.A0K()
            java.lang.String r3 = r7.A02
            if (r3 == 0) goto L_0x00df
            r9 = 0
            java.lang.String r2 = r7.A01
            java.lang.String r1 = r7.A00
            r0 = 2203(0x89b, float:3.087E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r22 = r6.getBoolean(r0)
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r18 = r9
            r19 = r2
            r20 = r1
            r21 = r9
            r17 = r3
            r8.A02(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r5.A0h = r4
            return
        L_0x00df:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9H7.A0A(X.9H7):void");
    }

    public static final void A0D(AnonymousClass9H7 r53, boolean z) {
        AnonymousClass2Ep A042;
        C299305uu r0;
        String str;
        AnonymousClass9H7 r7 = r53;
        C254743sy r1 = r7.A0b;
        boolean z2 = z;
        if (r1 instanceof MsysThreadId) {
            MsysThreadId A072 = C66647MaG.A07(r1);
            if (A072 != null) {
                0nY.A00().ATE(new 0vX(1567967727, new C73299PaK(r7, A072, z2)));
                return;
            }
            return;
        }
        DirectThreadKey A043 = C66647MaG.A04(r1);
        if (A043 != null && (A042 = A04(r7)) != null) {
            UserSession userSession = r7.A10;
            boolean A062 = 182.A06(0Tu.A06, userSession, 36324453977698399L);
            0qQ.A0A(Boolean.valueOf(A062));
            if (A062) {
                boolean A002 = C66682Map.A00(userSession, A042.CAt());
                02m r2 = r7.A1b;
                r2.markerStart(834879413);
                r2.markerAnnotate(834879413, "trigger_source", "IGDirectTypingStatusService");
                r2.markerAnnotate(834879413, "is_typing_indicator_enabled", A002);
                r2.markerEnd(834879413, 2);
                if (A002) {
                    C328927Gu r4 = r7.A0M;
                    if (r4 == null) {
                        0qQ.A0F("activityIndicatorSender");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    String str2 = A043.A00;
                    String str3 = A043.A01;
                    if (str2 == null && str3 == null) {
                        r0 = null;
                    } else {
                        r0 = new C299305uu(str2, str3);
                    }
                    if (!z) {
                        11Z.A00();
                        if (r4.A02 != null) {
                            r4.A03.removeMessages(1);
                            r4.A02 = null;
                        }
                    } else if (r0 != null && (str = r0.A01) != null) {
                        11Z.A00();
                        if (!2Ob.A00(str, r4.A02) || System.currentTimeMillis() - r4.A00 > r4.A01) {
                            11Z.A00();
                            RealtimeClientManager realtimeClientManager = r4.A06;
                            if (realtimeClientManager.isMqttConnected()) {
                                r4.A02 = str;
                                r4.A00 = System.currentTimeMillis();
                                String A003 = HZX.A00();
                                realtimeClientManager.sendCommand(A003, new C70990OVe((N49) null, (C70816OMl) null, (OW8) null, (2FW) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Long) null, r4.A04.BcO(), str, "indicate_activity", (String) null, (String) null, (String) null, A003, String.valueOf(1), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false).A00(), r4.A05);
                                r4.A03.removeMessages(1);
                                return;
                            }
                            return;
                        }
                        r4.A03.removeMessages(1);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (X.C66640Ma9.A04(r2.BRZ(), r2.BSK(), r5, r4) == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d5, code lost:
        if (((java.lang.Boolean) r0.A0Z.A07.getValue()).booleanValue() == false) goto L_0x00d7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0E(X.2Er r25) {
        /*
            r24 = this;
            r1 = r24
            X.7H1 r4 = r1.A0V
            r2 = r25
            if (r25 == 0) goto L_0x0026
            if (r4 == 0) goto L_0x0026
            boolean r0 = r2.CUG()
            if (r0 == 0) goto L_0x001b
            java.util.List r3 = r2.BRZ()
            java.util.Map r0 = r2.BWN()
            r4.A0C(r3, r0)
        L_0x001b:
            boolean r0 = r4 instanceof X.AnonymousClass7H0
            if (r0 == 0) goto L_0x0026
            X.7H0 r4 = (X.AnonymousClass7H0) r4
            r4.A02 = r2
            X.AnonymousClass7H0.A00(r4)
        L_0x0026:
            r8 = 1
            if (r25 == 0) goto L_0x0040
            boolean r5 = r2.isPending()
            boolean r4 = r2.CUG()
            int r3 = r2.BSK()
            java.util.List r0 = r2.BRZ()
            boolean r0 = X.C66640Ma9.A04(r0, r3, r5, r4)
            r3 = 1
            if (r0 != 0) goto L_0x0041
        L_0x0040:
            r3 = 0
        L_0x0041:
            X.7Hl r0 = r1.A0R
            if (r0 == 0) goto L_0x03d2
            if (r3 == 0) goto L_0x03d2
            com.instagram.common.session.UserSession r7 = r1.A10
            X.7GK r9 = X.AnonymousClass7GL.A00(r7, r2)
            X.4DH r6 = r1.A0u
            androidx.fragment.app.FragmentActivity r3 = r6.requireActivity()
            r0.A1J(r3)
        L_0x0056:
            X.7S2 r10 = r1.A1I
            java.lang.Class<X.7Ry> r5 = X.C331687Ry.class
            r4 = 24
            X.9Km r3 = new X.9Km
            r3.<init>(r9, r4)
            r10.A00(r5, r3)
            if (r0 == 0) goto L_0x0458
            if (r25 == 0) goto L_0x0458
            int r4 = r2.BHS()
            r3 = 6
            if (r4 == r3) goto L_0x0458
            if (r4 == r8) goto L_0x0458
            r3 = 2
            if (r4 == r3) goto L_0x0458
            r3 = 8
            if (r4 == r3) goto L_0x0458
            r3 = -1
            if (r4 == r3) goto L_0x0458
            r3 = 7
            if (r4 == r3) goto L_0x0458
            boolean r3 = r9.A03()
            if (r3 != 0) goto L_0x0458
            androidx.fragment.app.FragmentActivity r6 = r6.requireActivity()
            java.lang.String r13 = A07(r1)
            r0.A0W = r2
            X.9HW r5 = r0.A1x
            X.3t2 r9 = r0.A1z
            X.3t3 r4 = X.AnonymousClass6W3.A05(r9)
            r3 = 22
            boolean r3 = r5.A00(r4, r3)
            r0.A11 = r3
            com.instagram.common.session.UserSession r3 = r0.A1Z
            com.instagram.model.direct.DirectThreadKey r4 = X.C329067Hl.A09(r0)
            X.3t3 r4 = X.C66647MaG.A08(r4)
            boolean r4 = X.AnonymousClass7OI.A00(r3, r4)
            r0.A19 = r4
            X.2Er r4 = r0.A0W
            if (r4 == 0) goto L_0x00d7
            X.3sy r4 = r4.BJz()
            boolean r4 = r4 instanceof com.instagram.model.direct.DirectThreadKey
            if (r4 == 0) goto L_0x00d7
            X.2Er r4 = r0.A0W
            X.3sy r4 = r4.BJz()
            com.instagram.model.direct.DirectThreadKey r4 = (com.instagram.model.direct.DirectThreadKey) r4
            java.lang.String r4 = r4.A00
            if (r4 == 0) goto L_0x00d7
            X.7Rr r4 = r0.A0Z
            X.0eM r4 = r4.A07
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r10 = r4.booleanValue()
            r4 = 1
            if (r10 != 0) goto L_0x00d8
        L_0x00d7:
            r4 = 0
        L_0x00d8:
            r0.A14 = r4
            X.2Er r4 = r0.A0W
            if (r4 == 0) goto L_0x00f9
            X.3sy r4 = r4.BJz()
            boolean r4 = r4 instanceof com.instagram.model.direct.DirectThreadKey
            if (r4 == 0) goto L_0x00f9
            X.2Er r4 = r0.A0W
            X.3sy r4 = r4.BJz()
            com.instagram.model.direct.DirectThreadKey r4 = (com.instagram.model.direct.DirectThreadKey) r4
            java.lang.String r4 = r4.A00
            if (r4 == 0) goto L_0x00f9
            X.7Rr r4 = r0.A0Z
            X.0eM r4 = r4.A0F
            r4.getValue()
        L_0x00f9:
            X.3t3 r4 = X.AnonymousClass6W3.A05(r9)
            r15 = 66
            boolean r4 = r5.A00(r4, r15)
            r0.A13 = r4
            X.7Rr r4 = r0.A0Z
            r10 = 0
            X.0qQ.A0B(r3, r10)
            X.0qQ.A0B(r9, r8)
            com.instagram.direct.capabilities.Capabilities r5 = r4.A00
            X.9HW r4 = X.AnonymousClass9HV.A00(r3)
            X.7Rr r4 = X.C331607Rq.A00(r3, r5, r4, r9)
            r0.A0Z = r4
            r0.A1J(r6)
            r0.A1A()
            r14 = r13
            X.F2e r12 = r0.A0l
            if (r12 == 0) goto L_0x0151
            X.7Ij r4 = r0.A0b
            android.view.View r5 = r4.A0J
            X.2Er r4 = r0.A0W
            if (r4 == 0) goto L_0x0134
            boolean r4 = r4.CVr()
            if (r4 == 0) goto L_0x0134
            r14 = 0
        L_0x0134:
            java.util.List r11 = X.C329067Hl.A0I(r0)
            r4 = 2131440523(0x7f0b338b, float:1.8503032E38)
            android.view.View r5 = r5.findViewById(r4)
            if (r5 == 0) goto L_0x0151
            if (r14 == 0) goto L_0x0151
            boolean r4 = r12.A00
            if (r4 != 0) goto L_0x0151
            r12.A00 = r8
            X.AOI r4 = new X.AOI
            r4.<init>(r6, r12, r14, r11)
            X.AnonymousClass0fU.A00(r4, r5)
        L_0x0151:
            X.1wn r4 = r0.A0C
            if (r4 != 0) goto L_0x017c
            X.C329067Hl.A0a(r0)
            X.78k r11 = new X.78k
            r11.<init>(r6, r0)
            r0.A0C = r11
            X.78l r4 = new X.78l
            r4.<init>(r0)
            r0.A0D = r4
            X.1Ng r5 = X.AnonymousClass1Nd.A00(r3)
            java.lang.Class<X.7O5> r4 = X.AnonymousClass7O5.class
            r5.A01(r11, r4)
            X.1wn r11 = r0.A0D
            if (r11 == 0) goto L_0x017c
            X.1Ng r5 = X.AnonymousClass1Nd.A00(r3)
            java.lang.Class<X.78m> r4 = X.C3268778m.class
            r5.A01(r11, r4)
        L_0x017c:
            X.OZO r4 = r0.A0s
            if (r4 != 0) goto L_0x01b7
            int r5 = X.C329067Hl.A00(r0)
            r4 = 29
            if (r5 != r4) goto L_0x01b7
            X.2Er r4 = r0.A0W
            if (r4 == 0) goto L_0x01b7
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            java.lang.Boolean r4 = r4.CSS()
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01b7
            android.content.Context r14 = r0.A1R
            android.widget.FrameLayout r12 = r0.A07
            android.view.ViewGroup r11 = r0.A06
            X.7Zj r22 = X.C70172NyQ.A00(r3, r9)
            X.2Er r5 = r0.A0W
            X.OZO r4 = new X.OZO
            r18 = r12
            r19 = r11
            r20 = r3
            r21 = r5
            r16 = r4
            r17 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r0.A0s = r4
        L_0x01b7:
            com.instagram.model.direct.DirectThreadKey r5 = X.C329067Hl.A09(r0)
            X.ONc r4 = r0.A0m
            if (r4 == 0) goto L_0x0246
            if (r5 == 0) goto L_0x0246
            boolean r11 = r0.A19
            if (r11 == 0) goto L_0x01f0
            X.Nk5 r18 = X.C69365Nk5.QUESTIONS
            int r21 = X.C329067Hl.A00(r0)
            X.2Er r11 = r0.A0W
            if (r11 == 0) goto L_0x03ce
            int r22 = r11.AdN()
        L_0x01d3:
            X.7Ij r11 = r0.A0b
            android.view.View r12 = r11.A0J
            r17 = 0
            r11 = 2131440526(0x7f0b338e, float:1.8503038E38)
            android.view.View r11 = r12.findViewById(r11)
            if (r11 == 0) goto L_0x01f0
            X.OjH r12 = new X.OjH
            r19 = r4
            r20 = r5
            r16 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.AnonymousClass0fU.A00(r12, r11)
        L_0x01f0:
            boolean r11 = r0.A11
            if (r11 == 0) goto L_0x022d
            X.Nk5 r18 = X.C69365Nk5.CHALLENGES
            int r21 = X.C329067Hl.A00(r0)
            X.2Er r11 = r0.A0W
            if (r11 == 0) goto L_0x03ca
            int r22 = r11.AdN()
        L_0x0202:
            X.7Ij r11 = r0.A0b
            android.view.View r12 = r11.A0J
            X.0eK r11 = r0.A22
            java.lang.Object r11 = r11.get()
            X.2Es r11 = (X.AnonymousClass2Es) r11
            X.3U9 r11 = (X.AnonymousClass3U9) r11
            X.3S9 r11 = r11.A01
            X.Ja7 r14 = r11.A0a
            r11 = 2131440525(0x7f0b338d, float:1.8503036E38)
            android.view.View r12 = r12.findViewById(r11)
            if (r12 == 0) goto L_0x022d
            X.OjH r11 = new X.OjH
            r19 = r4
            r20 = r5
            r16 = r11
            r17 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.AnonymousClass0fU.A00(r11, r12)
        L_0x022d:
            boolean r11 = r0.A13
            if (r11 == 0) goto L_0x0246
            X.7Ij r11 = r0.A0b
            android.view.View r12 = r11.A0J
            r11 = 2131440517(0x7f0b3385, float:1.850302E38)
            android.view.View r12 = r12.findViewById(r11)
            if (r12 == 0) goto L_0x0246
            X.Oil r11 = new X.Oil
            r11.<init>(r0, r4, r5)
            X.AnonymousClass0fU.A00(r11, r12)
        L_0x0246:
            java.lang.String r5 = r2.AsX()
            java.lang.String r4 = r3.A06
            boolean r4 = X.2Ob.A00(r5, r4)
            if (r4 == 0) goto L_0x0274
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            java.lang.Boolean r4 = r2.Amk()
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0274
            X.1wn r4 = r0.A0B
            if (r4 != 0) goto L_0x0274
            X.AYD r4 = new X.AYD
            r4.<init>(r6, r2, r0)
            r0.A0B = r4
            X.1Ng r11 = X.AnonymousClass1Nd.A00(r3)
            java.lang.Class<X.AY4> r5 = X.AY4.class
            X.1wn r4 = r0.A0B
            r11.A01(r4, r5)
        L_0x0274:
            X.C329067Hl.A0f(r0, r10)
            X.C329067Hl.A0k(r0, r10)
            java.lang.String r4 = X.C329067Hl.A0E(r0)
            if (r4 == 0) goto L_0x03c0
            boolean r4 = r2.CUG()
            if (r4 != 0) goto L_0x03c0
            X.0Tu r11 = X.0Tu.A05
            r4 = 36320970759283694(0x8109bb000123ee, double:3.032866388756633E-306)
            boolean r4 = X.182.A06(r11, r3, r4)
            if (r4 == 0) goto L_0x03c0
            boolean r4 = r0.A10
            if (r4 != 0) goto L_0x02bb
            r0.A10 = r8
            X.1Av r18 = X.1Au.A00(r3)
            java.lang.String r19 = X.C329067Hl.A0F(r0)
            java.lang.String r4 = X.C329067Hl.A0E(r0)
            if (r4 == 0) goto L_0x03bc
            java.lang.String r4 = X.C329067Hl.A0E(r0)
        L_0x02ab:
            long r20 = java.lang.Long.parseLong(r4)
            X.AdG r4 = new X.AdG
            r4.<init>(r6, r2, r0, r13)
            r17 = r4
            r16 = r3
            X.C66832MdQ.A01(r16, r17, r18, r19, r20)
        L_0x02bb:
            r0.A1C()
            com.instagram.common.ui.base.IgTextView r4 = r0.A0G
            if (r4 != 0) goto L_0x0311
            boolean r4 = X.C329067Hl.A0v(r0)
            if (r4 == 0) goto L_0x0311
            X.0Tu r11 = X.0Tu.A05
            r4 = 36324831935082893(0x810d3e0004318d, double:3.0353082118797534E-306)
            boolean r4 = X.182.A06(r11, r3, r4)
            if (r4 == 0) goto L_0x0311
            r4 = 36320438185632202(0x81093f002421ca, double:3.0325295870349274E-306)
            boolean r4 = X.182.A06(r11, r3, r4)
            if (r4 != 0) goto L_0x0311
            X.2Er r4 = r0.A0W
            if (r4 == 0) goto L_0x03b8
            com.instagram.user.model.User r4 = r4.BZK()
            if (r4 == 0) goto L_0x03b8
            X.2Er r4 = r0.A0W
            com.instagram.user.model.User r4 = r4.BZK()
            java.lang.String r11 = r4.getId()
        L_0x02f4:
            android.content.Context r5 = r0.A1R
            r22 = 2130970246(0x7f040686, float:1.7549197E38)
            java.lang.Integer r18 = X.AnonymousClass05K.A01
            java.lang.String r19 = X.C329067Hl.A0D(r0)
            X.AuX r4 = new X.AuX
            r4.<init>(r0, r11)
            r21 = r4
            r23 = r8
            r20 = r11
            r17 = r3
            r16 = r5
            X.C49951FGg.A05(r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x0311:
            X.OMw r4 = r0.A0X
            if (r4 != 0) goto L_0x033f
            int r5 = r2.C6a()
            r4 = 29
            if (r5 != r4) goto L_0x033f
            android.widget.FrameLayout r5 = r0.A07
            r4 = 2131429084(0x7f0b06dc, float:1.847983E38)
            android.view.View r5 = r5.requireViewById(r4)
            X.OMw r4 = new X.OMw
            r4.<init>(r6, r5, r3)
            r0.A0X = r4
            X.AY7 r4 = new X.AY7
            r4.<init>(r0)
            r0.A0F = r4
            X.1Ng r11 = X.AnonymousClass1Nd.A00(r3)
            java.lang.Class<X.AY0> r5 = X.AY0.class
            X.1wn r4 = r0.A0F
            r11.A01(r4, r5)
        L_0x033f:
            X.OTl r4 = r0.A0M
            if (r4 != 0) goto L_0x0375
            int r5 = r2.C6a()
            r4 = 29
            if (r5 != r4) goto L_0x0375
            X.9HW r4 = X.AnonymousClass9HV.A00(r3)
            boolean r4 = r4.A00(r9, r15)
            if (r4 == 0) goto L_0x0375
            android.widget.FrameLayout r5 = r0.A07
            r4 = 2131429083(0x7f0b06db, float:1.8479829E38)
            android.view.View r5 = r5.requireViewById(r4)
            X.OTl r4 = new X.OTl
            r4.<init>(r6, r5, r3)
            r0.A0M = r4
            X.OtC r5 = new X.OtC
            r5.<init>(r2, r0)
            r0.A0E = r5
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r3)
            java.lang.Class<X.Osi> r3 = X.C71900Osi.class
            r4.A01(r5, r3)
        L_0x0375:
            X.C329067Hl.A0b(r0)
            X.7Ko r5 = r0.A0o
            if (r5 == 0) goto L_0x0389
            int r4 = r2.Bpc()
            int r3 = r5.A00
            if (r3 == r4) goto L_0x0389
            r5.A00 = r4
            r5.A01()
        L_0x0389:
            boolean r3 = r1.A0p
            if (r3 != 0) goto L_0x0458
            X.3sy r3 = r1.A0b
            boolean r3 = r3 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r3 != 0) goto L_0x0425
            boolean r3 = r2.CVr()
            if (r3 != 0) goto L_0x0425
            X.0Tu r5 = X.0Tu.A06
            r3 = 36315511855779075(0x8104c400000d03, double:3.029414156199072E-306)
            boolean r3 = X.182.A06(r5, r7, r3)
            if (r3 == 0) goto L_0x0425
            android.os.Bundle r5 = r1.A0r
            java.lang.String r4 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_PREFILL_FORMATTED_TEXT"
            r3 = 0
            java.lang.String r4 = r5.getString(r4, r3)
            if (r4 == 0) goto L_0x03ff
            int r3 = r4.length()
            if (r3 == 0) goto L_0x03ff
            goto L_0x03e8
        L_0x03b8:
            java.lang.String r11 = ""
            goto L_0x02f4
        L_0x03bc:
            java.lang.String r4 = "-1"
            goto L_0x02ab
        L_0x03c0:
            X.78o r4 = new X.78o
            r4.<init>(r6, r2, r0, r13)
            r6.runOnUiThread(r4)
            goto L_0x02bb
        L_0x03ca:
            r22 = 0
            goto L_0x0202
        L_0x03ce:
            r22 = 0
            goto L_0x01d3
        L_0x03d2:
            X.7GL r5 = X.AnonymousClass7GK.A08
            com.instagram.common.session.UserSession r7 = r1.A10
            X.4DH r6 = r1.A0u
            android.content.Context r4 = r6.requireContext()
            X.7SD r3 = A03(r1)
            X.3Tu r3 = r3.A0H
            X.7GK r9 = r5.A03(r4, r7, r3, r2)
            goto L_0x0056
        L_0x03e8:
            X.16F r3 = X.16P.A00(r4)     // Catch:{ IOException -> 0x03f3 }
            X.JwJ r3 = X.C63244Ktp.parseFromJson(r3)     // Catch:{ IOException -> 0x03f3 }
            if (r3 != 0) goto L_0x0405
            goto L_0x03ff
        L_0x03f3:
            r5 = move-exception
            r3 = 544(0x220, float:7.62E-43)
            java.lang.String r4 = X.C66579MXk.A00(r3)
            java.lang.String r3 = "Error parsing PersistableDraftText"
            X.0wb.A06(r4, r3, r5)
        L_0x03ff:
            X.JwJ r3 = r2.B7g(r7)
            if (r3 == 0) goto L_0x0458
        L_0x0405:
            r1.A0p = r8
            X.7Ij r4 = r0.A0b
            java.lang.String r2 = r3.A01
            X.7Iv r1 = r4.A0Y
            java.lang.String r0 = r1.A00
            boolean r0 = X.0mp.A0G(r2, r0)
            if (r0 != 0) goto L_0x0458
            X.0qQ.A0B(r2, r10)
            r1.A00 = r2
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r1 = r4.A0S
            X.Akq r0 = new X.Akq
            r0.<init>(r4)
            r1.post(r0)
            return
        L_0x0425:
            android.os.Bundle r4 = r1.A0r
            java.lang.String r3 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_PREFILL_TEXT"
            java.lang.String r3 = r4.getString(r3)
            if (r3 != 0) goto L_0x044b
            X.4md r3 = r1.A0F
            if (r3 == 0) goto L_0x0453
            X.7TI r3 = A01(r1)
            java.lang.String r3 = r3.A0F
            if (r3 == 0) goto L_0x0453
            X.7TI r2 = A01(r1)
            java.lang.String r2 = r2.A0F
            X.JwJ r2 = X.AnonymousClass7LX.A00(r7, r2)
            if (r2 == 0) goto L_0x0458
            java.lang.String r3 = r2.A01
        L_0x0449:
            if (r3 == 0) goto L_0x0458
        L_0x044b:
            r1.A0p = r8
            X.7Ij r0 = r0.A0b
            r0.A06(r3)
            return
        L_0x0453:
            java.lang.String r3 = r2.Ayt(r7)
            goto L_0x0449
        L_0x0458:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9H7.A0E(X.2Er):void");
    }

    public final 2dZ AYJ() {
        return this.A04;
    }

    public final AnonymousClass4DJ B7u() {
        return this.A0y;
    }

    public final TouchInterceptorFrameLayout C8v() {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A07;
        if (touchInterceptorFrameLayout != null) {
            return touchInterceptorFrameLayout;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        r1 = r0.A0U;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onBackPressed() {
        /*
            r5 = this;
            X.4DH r0 = r5.A0u
            androidx.fragment.app.FragmentActivity r4 = r0.getActivity()
            android.os.Bundle r1 = r5.A0r
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEARCH_QUERY"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x002d
            if (r4 == 0) goto L_0x002d
            int r1 = r0.length()
            com.instagram.common.session.UserSession r3 = r5.A10
            r0 = 2
            if (r1 < r0) goto L_0x002d
            X.1Wj r0 = X.1Wj.A00
            if (r0 == 0) goto L_0x002d
            X.1Wj r2 = X.DcL.A00()
            r1 = 0
            r0 = 464(0x1d0, float:6.5E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.A02(r4, r3, r0, r1)
        L_0x002d:
            X.NIE r2 = r5.A0L
            r3 = 0
            r1 = 1
            if (r2 == 0) goto L_0x003d
            boolean r0 = r2.isVisible()
            if (r0 != r1) goto L_0x003d
            r2.onBackPressed()
        L_0x003c:
            return r1
        L_0x003d:
            X.7H6 r0 = r5.A0D
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "directAggregatedMediaViewerController"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x004b:
            boolean r0 = r0.A0h()
            if (r0 != 0) goto L_0x003c
            X.7Hl r2 = r5.A0R
            if (r2 == 0) goto L_0x009b
            boolean r0 = r2.A1U()
            if (r0 != r1) goto L_0x009b
            r2.A16()
            X.7JI r0 = r2.A0u
            X.0eM r0 = r0.A0V
            java.lang.Object r0 = r0.getValue()
            X.Pvn r0 = (X.C74493Pvn) r0
            boolean r0 = r0.isRecording()
            if (r0 == 0) goto L_0x0074
            X.7JI r0 = r2.A0u
            r0.A0D()
            return r1
        L_0x0074:
            X.7Ij r0 = r2.A0b
            if (r0 == 0) goto L_0x008e
            X.7Iy r1 = r0.A0U
            X.8Ov r0 = r1.A01
            if (r0 == 0) goto L_0x008e
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x008e
            X.C329457Iy.A01(r1, r3)
            X.8Ov r0 = r1.A01
            if (r0 == 0) goto L_0x008e
            r0.dismiss()
        L_0x008e:
            X.OLs r0 = r2.A0g
            if (r0 == 0) goto L_0x009b
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x009b
            r2.A15()
        L_0x009b:
            r5.A0G()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9H7.onBackPressed():boolean");
    }

    public static final AnonymousClass7SD A03(AnonymousClass9H7 r4) {
        String str;
        AnonymousClass3U9 A052 = A05(r4);
        AnonymousClass7S4 r3 = new AnonymousClass7S4(r4.A10, r4.A1H);
        if (A052 != null) {
            str = A052.C6C();
        } else {
            str = null;
        }
        return r3.A00(A05(r4), str, false);
    }

    public static final void A09(AnonymousClass9H7 r9) {
        Integer num;
        String str;
        C254793t3 r5 = A03(r9).A0P;
        if (A03(r9).A13 && r5 != null) {
            AnonymousClass0eM r4 = r9.A1Y;
            A7B a7b = (A7B) r4.getValue();
            String str2 = r9.A1V;
            if (r9.A0u.requireArguments().getBoolean("DirectThreadFragment.ARGUMENT_IS_BOTTOM_SHEET", false)) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A01;
            }
            String A072 = C300965yF.A07(r5);
            if (str2 != null && A072 != null && a7b.A00 == AnonymousClass05K.A01) {
                if (a7b.A01 == null) {
                    a7b.A01 = UUID.randomUUID().toString();
                }
                a7b.A03 = false;
                0wc r52 = a7b.A04;
                0Aj A002 = r52.A00(r52.A00, "meta_ai_direct_enter_thread");
                if (A002.isSampled()) {
                    A002.AAJ(C66654MaN.A00(), a7b.A02);
                    A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
                    if (num.intValue() == 0) {
                        str = "bottom_sheet";
                    } else {
                        str = "full_screen";
                    }
                    A002.AAJ("layout_type", str);
                    A002.AAJ("open_thread_id", A072);
                    A002.AAJ("thread_session_id", a7b.A01);
                    A002.A9F(AnonymousClass000.A00(269), Long.valueOf(System.currentTimeMillis()));
                    A002.Cgf();
                }
                a7b.A00 = AnonymousClass05K.A00;
            } else if (a7b.A00 == AnonymousClass05K.A0C) {
                0wj.A01.AEf("Either entryPoint or threadId is null for opening the Meta AI thread", 20134884).report();
            }
            String str3 = ((A7B) r4.getValue()).A01;
            if (str2 != null && str3 != null) {
                ((A43) r9.A1e.getValue()).A00 = new 0eP(str2, str3);
            }
        }
    }

    public static final void A0B(AnonymousClass9H7 r1, int i) {
        if (A00(r1) instanceof AnonymousClass2ZP) {
            Activity A002 = A00(r1);
            0qQ.A0C(A002, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
            ((AnonymousClass2ZP) A002).Enj(i);
        }
    }

    public static final void A0C(AnonymousClass9H7 r7, boolean z) {
        Integer num;
        Integer num2;
        String str;
        C254793t3 r3 = A03(r7).A0P;
        if (A03(r7).A13 && r3 != null) {
            A7B a7b = (A7B) r7.A1Y.getValue();
            String str2 = r7.A1V;
            if (r7.A0u.requireArguments().getBoolean("DirectThreadFragment.ARGUMENT_IS_BOTTOM_SHEET", false)) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A01;
            }
            String A072 = C300965yF.A07(r3);
            if (str2 != null && A072 != null && a7b.A01 != null && a7b.A00 == AnonymousClass05K.A00) {
                0wc r32 = a7b.A04;
                0Aj A002 = r32.A00(r32.A00, "meta_ai_direct_exit_thread");
                if (A002.isSampled()) {
                    A002.AAJ(C66654MaN.A00(), a7b.A02);
                    A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
                    if (num.intValue() == 0) {
                        str = "bottom_sheet";
                    } else {
                        str = "full_screen";
                    }
                    A002.AAJ("layout_type", str);
                    A002.AAJ("open_thread_id", A072);
                    A002.AAJ("thread_session_id", a7b.A01);
                    A002.A7p("has_response_before_exit", Boolean.valueOf(a7b.A03));
                    A002.A7p("with_backgrounding", Boolean.valueOf(z));
                    A002.A9F(AnonymousClass000.A00(269), Long.valueOf(System.currentTimeMillis()));
                    A002.Cgf();
                }
                a7b.A02 = UUID.randomUUID().toString();
                if (!z) {
                    a7b.A01 = null;
                    num2 = AnonymousClass05K.A0C;
                } else {
                    num2 = AnonymousClass05K.A01;
                }
                a7b.A00 = num2;
            } else if (a7b.A00 == AnonymousClass05K.A00) {
                0wj.A01.AEf("Either entryPoint or threadId is null for exiting the Meta AI thread", 20134884).report();
            }
        }
    }

    private final void A0F(A84 a84) {
        A08();
        A06(this).A1B();
        C328917Gt r0 = this.A0G;
        if (r0 == null) {
            0qQ.A0F("lazyControllers");
            throw AnonymousClass00P.createAndThrow();
        }
        A90 a90 = (A90) r0.A0U.getValue();
        this.A0X = a90;
        a90.A00(a84);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x030f, code lost:
        if (r1.equals(r0) == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0311, code lost:
        r11 = X.AnonymousClass05K.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0316, code lost:
        r0 = X.C66579MXk.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x031e, code lost:
        if (r1.equals(r0) == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0320, code lost:
        r11 = X.AnonymousClass05K.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x032d, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36324831935607187L) == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x032f, code lost:
        r10 = X.1Wj.A00;
        r2 = r8.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0333, code lost:
        if (r2 == null) goto L_0x0366;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0335, code lost:
        r1 = X.0Yt.A06(new X.0eP[]{new X.0eP(com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r2.A00), new X.0eP("thread_session_id", r2.A01)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x034f, code lost:
        if (r10 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0351, code lost:
        r0 = r11.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0355, code lost:
        if (r0 == 0) goto L_0x0363;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0357, code lost:
        if (r0 == 1) goto L_0x0360;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0359, code lost:
        r0 = "465445865899960";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x035b, code lost:
        r10.A02(r7, r4, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0360, code lost:
        r0 = "1480260552857596";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0363, code lost:
        r0 = "807404137604288";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0366, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0269, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A0d, 36325952921482640L) == false) goto L_0x026b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G() {
        /*
            r14 = this;
            A00(r14)
            com.instagram.common.session.UserSession r4 = r14.A10
            boolean r0 = X.C66797Mcj.A00(r4)
            if (r0 == 0) goto L_0x0368
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325897087497565(0x810e36000c355d, double:3.0359818185558164E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0368
            android.app.Activity r5 = A00(r14)
            java.lang.String r2 = r14.A1V
            r0 = 2
            X.0qQ.A0B(r2, r0)
            r0 = 13
            X.Plp r1 = new X.Plp
            r1.<init>(r4, r0)
            java.lang.Class<X.Oxy> r0 = X.C72189Oxy.class
            java.lang.Object r3 = r4.A01(r0, r1)
            X.Oxy r3 = (X.C72189Oxy) r3
            X.1Wj r0 = X.1Wj.A00
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = "inbox"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004b
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x004b
            X.1Wj r2 = X.DcL.A00()
            r1 = 0
            java.lang.String r0 = "969617947967752"
            r2.A02(r5, r4, r0, r1)
        L_0x004b:
            r0 = 0
            r3.A00 = r0
        L_0x004e:
            X.0eM r1 = r14.A1e
            boolean r0 = r1.CVQ()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r8 = r1.getValue()
            X.A43 r8 = (X.A43) r8
            android.app.Activity r7 = A00(r14)
            r9 = 0
            r6 = 1
            X.0eP r0 = r8.A00
            r5 = 0
            if (r0 == 0) goto L_0x0074
            java.lang.Object r1 = r0.A00
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0074
            int r0 = r1.hashCode()
            switch(r0) {
                case -1962233258: goto L_0x0314;
                case -1322530904: goto L_0x0305;
                case -1066842987: goto L_0x0302;
                case -968320469: goto L_0x02ff;
                case 92073307: goto L_0x02fc;
                case 100344454: goto L_0x02f1;
                case 207788079: goto L_0x02ee;
                case 1032739510: goto L_0x02eb;
                case 1636197938: goto L_0x02e4;
                default: goto L_0x0074;
            }
        L_0x0074:
            r8.A00 = r5
        L_0x0076:
            r9 = 0
            A0C(r14, r9)
            X.A9F r0 = r14.A08
            if (r0 == 0) goto L_0x0081
            r0.A00()
        L_0x0081:
            X.LF1 r0 = r14.A09
            if (r0 == 0) goto L_0x0088
            r0.A00()
        L_0x0088:
            X.A6m r0 = r14.A0o
            if (r0 == 0) goto L_0x0097
            X.A7D r1 = r0.A03
            r0 = 0
            r1.A03 = r0
            r1.A01 = r0
            r1.A00 = r0
            r1.A02 = r0
        L_0x0097:
            X.A72 r0 = r14.A05
            if (r0 == 0) goto L_0x00a4
            X.AE5 r0 = r0.A03
            X.B2v r0 = r0.A07
            if (r0 == 0) goto L_0x00a4
            r0.D9U()
        L_0x00a4:
            X.7TI r2 = A01(r14)
            X.4DH r8 = r2.A0U
            java.lang.String r7 = r2.A12
            X.7Ue r0 = r2.A0i
            X.0eM r0 = r0.A0c
            java.lang.Object r0 = r0.getValue()
            X.7Vy r0 = (X.C332677Vy) r0
            boolean r10 = r0.A02
            boolean r11 = r2.A0O
            X.7Tw r0 = r2.A0j
            X.7UF r6 = r0.A0I
            r0 = 6
            X.9Lc r1 = new X.9Lc
            r1.<init>(r2, r0)
            X.0qQ.A0B(r8, r9)
            r5 = 1
            X.0qQ.A0B(r7, r5)
            r0 = 4
            X.0qQ.A0B(r6, r0)
            r0 = 380(0x17c, float:5.32E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r0.equals(r7)
            r3 = -1
            if (r0 != 0) goto L_0x00e8
            r0 = 742(0x2e6, float:1.04E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0119
        L_0x00e8:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r0 = "DirectFragment.ENTRY_POINT"
            android.content.Intent r13 = r2.putExtra(r0, r7)
            android.os.Bundle r12 = r8.requireArguments()
            r0 = 907(0x38b, float:1.271E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r12.getString(r2)
            android.content.Intent r2 = r13.putExtra(r2, r0)
            r0 = 229(0xe5, float:3.21E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            android.content.Intent r2 = r2.putExtra(r0, r11)
            X.0qQ.A07(r2)
            androidx.fragment.app.FragmentActivity r0 = r8.requireActivity()
            r0.setResult(r3, r2)
        L_0x0119:
            r0 = 1032(0x408, float:1.446E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x013c
            if (r10 == 0) goto L_0x013c
            androidx.fragment.app.FragmentActivity r0 = r8.requireActivity()
            android.content.ComponentName r0 = r0.getCallingActivity()
            if (r0 == 0) goto L_0x013c
            androidx.fragment.app.FragmentActivity r10 = r8.requireActivity()
            r2 = 512341(0x7d155, float:7.17943E-40)
            r0 = 0
            r10.setResult(r2, r0)
        L_0x013c:
            r0 = 767(0x2ff, float:1.075E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x016f
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            java.lang.Object r0 = r1.invoke()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            java.lang.String r2 = r0.C6C()
            r0 = 505(0x1f9, float:7.08E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            android.content.Intent r2 = r10.putExtra(r0, r2)
            X.0qQ.A07(r2)
            androidx.fragment.app.FragmentActivity r0 = r8.requireActivity()
            r0.setResult(r3, r2)
        L_0x016f:
            r0 = 1275(0x4fb, float:1.787E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0198
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x0198
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            r0 = 2237(0x8bd, float:3.135E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.content.Intent r2 = r2.putExtra(r0, r5)
            X.0qQ.A07(r2)
            androidx.fragment.app.FragmentActivity r0 = r8.requireActivity()
            r0.setResult(r3, r2)
        L_0x0198:
            r0 = 63
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x01eb
            java.lang.Object r0 = r1.invoke()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            X.3t3 r0 = r0.CBU()
            if (r0 == 0) goto L_0x01eb
            X.3t0 r0 = X.C300965yF.A02(r0)
            if (r0 == 0) goto L_0x01eb
            java.lang.String r10 = r0.A00
            if (r10 == 0) goto L_0x01eb
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.Object r0 = r1.invoke()
            X.7Zg r0 = (X.C333517Zg) r0
            X.2Er r1 = r0.Api()
            if (r1 == 0) goto L_0x02e0
            boolean r0 = r1.COP()
            if (r0 == r5) goto L_0x01db
            boolean r0 = r1.BJ3()
            if (r0 != r5) goto L_0x02e0
        L_0x01db:
            r0 = 539(0x21b, float:7.55E-43)
        L_0x01dd:
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.putExtra(r0, r10)
            androidx.fragment.app.FragmentActivity r0 = r8.requireActivity()
            r0.setResult(r3, r2)
        L_0x01eb:
            r0 = 136(0x88, float:1.9E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x020f
            r0 = 903(0x387, float:1.265E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x020f
            r0 = 900(0x384, float:1.261E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x022c
        L_0x020f:
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x022c
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r0 = 2577(0xa11, float:3.611E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.content.Intent r1 = r1.putExtra(r0, r5)
            X.0qQ.A07(r1)
            androidx.fragment.app.FragmentActivity r0 = r8.requireActivity()
            r0.setResult(r3, r1)
        L_0x022c:
            X.7TI r6 = A01(r14)
            X.4DH r7 = r6.A0U
            android.os.Bundle r1 = r7.requireArguments()
            r0 = 2205(0x89d, float:3.09E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0)
            if (r0 != 0) goto L_0x026b
            java.lang.String r1 = r6.A12
            java.lang.String r0 = "via_push_notification"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x027d
            android.os.Bundle r1 = r7.requireArguments()
            r0 = 2235(0x8bb, float:3.132E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r9)
            if (r0 == 0) goto L_0x027d
            com.instagram.common.session.UserSession r3 = r6.A0d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325952921482640(0x810e4300033590, double:3.036017128192803E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x027d
        L_0x026b:
            X.1pC r3 = X.C69997Nvb.A00()
            android.content.Context r2 = r7.requireContext()
            X.0iw r1 = r6.A0V
            java.lang.String r0 = "all"
            r3.A00(r2, r1, r0)
            A0B(r14, r9)
        L_0x027d:
            java.lang.Class<X.OTd> r2 = X.C70956OTd.class
            r1 = 19
            X.MYO r0 = new X.MYO
            r0.<init>(r4, r1)
            java.lang.Object r1 = r4.A01(r2, r0)
            X.OTd r1 = (X.C70956OTd) r1
            boolean r0 = X.C70956OTd.A00(r1)
            if (r0 == 0) goto L_0x02ad
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x02ad
            r1.A00 = r5
            X.0eM r0 = r1.A03
            java.lang.Object r2 = r0.getValue()
            X.Mex r2 = (X.C66913Mex) r2
            r2.A09()
            java.lang.String r1 = "END_REASON"
            java.lang.String r0 = "THREAD_EXIT"
            r2.A0D(r1, r0)
            r2.A08()
        L_0x02ad:
            X.65E r0 = X.AnonymousClass65D.A00(r4)
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x02d4
            X.65E r0 = X.AnonymousClass65D.A00(r4)
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 36326627231152009(0x810ee000003789, double:3.0364435643429393E-306)
            boolean r0 = X.AnonymousClass65A.A02(r2, r0)
            if (r0 == 0) goto L_0x02d4
            java.lang.Class<X.AYg> r1 = X.C40267AYg.class
            X.AxV r0 = X.C41617AxV.A00
            java.lang.Object r0 = r4.A01(r1, r0)
            X.AYg r0 = (X.C40267AYg) r0
            r0.A00 = r5
        L_0x02d4:
            X.1pL r0 = X.C66551pM.A00()
            X.1pK r0 = (X.1pK) r0
            java.lang.ref.WeakReference r0 = r0.A00
            r0.clear()
            return
        L_0x02e0:
            r0 = 540(0x21c, float:7.57E-43)
            goto L_0x01dd
        L_0x02e4:
            r0 = 1445(0x5a5, float:2.025E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x031a
        L_0x02eb:
            r0 = 904(0x388, float:1.267E-42)
            goto L_0x0316
        L_0x02ee:
            java.lang.String r0 = "inbox_new_message"
            goto L_0x030b
        L_0x02f1:
            java.lang.String r0 = "inbox"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0074
            java.lang.Integer r11 = X.AnonymousClass05K.A0C
            goto L_0x0322
        L_0x02fc:
            r0 = 136(0x88, float:1.9E-43)
            goto L_0x0316
        L_0x02ff:
            r0 = 902(0x386, float:1.264E-42)
            goto L_0x0316
        L_0x0302:
            r0 = 334(0x14e, float:4.68E-43)
            goto L_0x0316
        L_0x0305:
            r0 = 1282(0x502, float:1.796E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x030b:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0074
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            goto L_0x0322
        L_0x0314:
            r0 = 901(0x385, float:1.263E-42)
        L_0x0316:
            java.lang.String r0 = X.C66579MXk.A00(r0)
        L_0x031a:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0074
            java.lang.Integer r11 = X.AnonymousClass05K.A00
        L_0x0322:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324831935607187(0x810d3e000c3193, double:3.035308212211319E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0074
            X.1Wj r10 = X.1Wj.A00
            X.0eP r2 = r8.A00
            if (r2 == 0) goto L_0x0366
            java.lang.Object r1 = r2.A00
            java.lang.String r0 = "entry_point"
            X.0eP r3 = new X.0eP
            r3.<init>(r0, r1)
            java.lang.Object r2 = r2.A01
            java.lang.String r1 = "thread_session_id"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r2)
            X.0eP[] r0 = new X.0eP[]{r3, r0}
            java.util.LinkedHashMap r1 = X.0Yt.A06(r0)
        L_0x034f:
            if (r10 == 0) goto L_0x0074
            int r0 = r11.intValue()
            if (r0 == r9) goto L_0x0363
            if (r0 == r6) goto L_0x0360
            java.lang.String r0 = "465445865899960"
        L_0x035b:
            r10.A02(r7, r4, r0, r1)
            goto L_0x0074
        L_0x0360:
            java.lang.String r0 = "1480260552857596"
            goto L_0x035b
        L_0x0363:
            java.lang.String r0 = "807404137604288"
            goto L_0x035b
        L_0x0366:
            r1 = 0
            goto L_0x034f
        L_0x0368:
            r2 = 0
            r0 = 13
            X.Plp r1 = new X.Plp
            r1.<init>(r4, r0)
            java.lang.Class<X.Oxy> r0 = X.C72189Oxy.class
            java.lang.Object r0 = r4.A01(r0, r1)
            X.Oxy r0 = (X.C72189Oxy) r0
            r0.A00 = r2
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9H7.A0G():void");
    }
}
