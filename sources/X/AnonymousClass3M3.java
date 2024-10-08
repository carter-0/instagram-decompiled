package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableMap;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3M3  reason: invalid class name */
public final class AnonymousClass3M3 extends AnonymousClass3M4 implements AnonymousClass4DR, AnonymousClass4DS, AnonymousClass4DT, AnonymousClass3M5, C240433Kw, C227562jX, C262304De, AnonymousClass0j7, AnonymousClass3M6, AnonymousClass3M7 {
    public static final ImmutableMap A0U;
    public static final String __redex_internal_original_name = "IgBloksScreenFragment";
    public View A00;
    public FrameLayout A01;
    public FrameLayout A02;
    public FragmentActivity A03;
    public C46583DhP A04 = null;
    public C46645DiQ A05;
    public G8K A06 = null;
    public C15166UTr A07;
    public C273694n2 A08;
    public C229382nI A09;
    public IgBloksScreenConfig A0A;
    public F3o A0B;
    public AnonymousClass6NS A0C;
    public UserSession A0D;
    public C71662eb A0E;
    public C71662eb A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I = true;
    public int A0J;
    public int A0K;
    public X6J A0L;
    public C307756Ri A0M;
    public AnonymousClass0wW A0N;
    public AnonymousClass3E6 A0O;
    public 2el A0P;
    public final List A0Q = new ArrayList();
    public final 1wn A0R = new C46652DiX(this);
    public final C252213ok A0S = new C46593DhZ(this);
    public final List A0T = new ArrayList(5);

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.put(1, "bind_initial_content_start");
        builder.put(2, "bind_initial_content_end");
        builder.put(3, "bind_initial_data_on_mount");
        builder.put(4, "receive_additional");
        builder.put(6, "bind_network_content_start");
        builder.put(8, "bind_network_content_pending");
        builder.put(7, "bind_network_content_end");
        builder.put(9, "bind_data_on_mount");
        builder.put(10, "bind_network_content_on_attach");
        builder.put(11, "bind_network_content_action_attach");
        A0U = builder.build();
    }

    public final void DTY(C20880X2h x2h, C307786Rm r3, C276544tV r4) {
        C46615Dhv A002 = C46616Dhw.A00(x2h, r3, (C307896Rx) null, r4);
        if (A002 != null) {
            A07(A002);
        }
    }

    public static String A00(C276544tV r2) {
        String str = "";
        String A0K2 = r2.A0K(43);
        if (A0K2 != null) {
            str = A0K2;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    private void A01() {
        List<C19868Wgv> list = this.A0Q;
        if (list != null && !list.isEmpty()) {
            for (C19868Wgv wgv : list) {
                UserSession userSession = this.A0D;
                if (userSession != null) {
                    AnonymousClass1Nd.A00(userSession).A02(wgv.A02, C323956yN.class);
                }
                wgv.A00 = null;
            }
        }
    }

    public static void A03(C46615Dhv dhv, AnonymousClass3M3 r3) {
        AnonymousClass6NS r0 = r3.A0C;
        if (r0 != null) {
            r0.A03();
            r3.A0C = null;
        }
        FrameLayout frameLayout = r3.A02;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            r3.A02 = null;
            r3.A08 = null;
            r3.A07 = null;
        }
        r3.A0A.A07(dhv);
        if (r3.getContext() != null && r3.isAdded()) {
            FragmentActivity fragmentActivity = r3.A03;
            if (fragmentActivity instanceof BaseFragmentActivity) {
                BaseFragmentActivity baseFragmentActivity = (BaseFragmentActivity) fragmentActivity;
                baseFragmentActivity.A0Z();
                baseFragmentActivity.A0d();
                return;
            }
            2dZ.A0t.A03(fragmentActivity).A0T();
        }
    }

    public static void A04(AnonymousClass3M3 r4, C276544tV r5, C277014uI r6) {
        C307786Rm r3;
        String str;
        AnonymousClass6NS r0;
        C46583DhP dhP = r4.A04;
        if (dhP == null || (r0 = dhP.A04.A01) == null) {
            r3 = null;
        } else {
            r3 = r0.A02();
        }
        if (r3 == null) {
            str = AnonymousClass000.A00(2137);
        } else {
            C308276Tl r1 = new C308276Tl();
            r1.A03(r5, 0);
            r1.A03(r3, 1);
            AnonymousClass6Tm A002 = r1.A00();
            C46583DhP dhP2 = r4.A04;
            if (dhP2 != null) {
                AnonymousClass6NS r02 = dhP2.A04.A01;
                if (r02 != null) {
                    C307886Rw.A03(r02.A02(), r5, A002, r6);
                    return;
                } else if (r4.mView != null) {
                    str = "runExpression failed on Surface Core.";
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        1Kn.A02(__redex_internal_original_name, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        r1 = r0.A02();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(X.AnonymousClass3M3 r4, X.C277014uI r5) {
        /*
            if (r5 == 0) goto L_0x0019
            X.DhP r0 = r4.A04
            if (r0 == 0) goto L_0x0019
            X.DhO r0 = r0.A04
            X.6NS r0 = r0.A01
            if (r0 == 0) goto L_0x0046
            X.6Rm r2 = r0.A02()
        L_0x0010:
            java.lang.String r3 = "IgBloksScreenFragment"
            if (r2 != 0) goto L_0x001a
            java.lang.String r0 = "Cannot run expression on root model without valid context"
        L_0x0016:
            X.1Kn.A02(r3, r0)
        L_0x0019:
            return
        L_0x001a:
            X.6Tl r1 = new X.6Tl
            r1.<init>()
            r0 = 0
            r1.A03(r2, r0)
            X.6Tm r2 = r1.A00()
            X.DhP r0 = r4.A04
            X.DhO r0 = r0.A04
            X.6NS r0 = r0.A01
            if (r0 == 0) goto L_0x003f
            X.6Rm r1 = r0.A02()
            X.6Qd r0 = X.C307476Qg.A02(r1)
            if (r0 == 0) goto L_0x003f
            X.4tV r0 = r0.A06
            X.C307886Rw.A03(r1, r0, r2, r5)
            return
        L_0x003f:
            android.view.View r0 = r4.mView
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = "runExpressionOnRootModel failed on Surface Core."
            goto L_0x0016
        L_0x0046:
            r2 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3M3.A05(X.3M3, X.4uI):void");
    }

    public final void A07(C46615Dhv dhv) {
        View view = this.mView;
        if (view == null) {
            return;
        }
        if (view.isInLayout()) {
            view.post(new C46618Dhy(dhv, this));
        } else {
            A03(dhv, this);
        }
    }

    public final boolean A08() {
        IgBloksScreenConfig igBloksScreenConfig = this.A0A;
        if ((igBloksScreenConfig.A0f || igBloksScreenConfig.A0g) && !A06(this)) {
            return true;
        }
        return false;
    }

    public final C227762js BD0() {
        C307756Ri r0 = this.A0M;
        if (r0 != null) {
            return r0.A02;
        }
        return null;
    }

    public final String BTx() {
        String str = this.A0G;
        if (TextUtils.isEmpty(str)) {
            return "bloks_unknown_class";
        }
        return str;
    }

    public final boolean CbJ() {
        C307756Ri r0 = this.A0M;
        if (r0 != null) {
            return r0.A01;
        }
        return false;
    }

    public final void Ddp(int i) {
        Runnable dhd;
        ImmutableMap immutableMap = A0U;
        Integer valueOf = Integer.valueOf(i);
        if (immutableMap.containsKey(valueOf)) {
            String str = (String) immutableMap.get(valueOf);
            G8K g8k = this.A06;
            if (g8k != null) {
                g8k.CmM(str);
            }
            this.A04.getClass();
            C46583DhP dhP = this.A04;
            C360018dr r0 = (C360018dr) Pair.create(dhP.A0A.get(), dhP.A03).first;
            if (r0 == null) {
                G8K g8k2 = this.A06;
                if (g8k2 != null) {
                    g8k2.CmF("response_source", "UNKNOWN");
                }
            } else {
                int i2 = 0;
                if (r0.A00.A00 == 0) {
                    i2 = 1;
                }
                G8K g8k3 = this.A06;
                if (g8k3 != null) {
                    g8k3.CmD("prefetched_data_exists", i2);
                }
            }
            if (i == 4) {
                G8K g8k4 = this.A06;
                if (g8k4 != null) {
                    g8k4.CmM("request_end");
                }
                dhd = new C46594Dha(this);
                11Z.A02(dhd);
            }
        }
        if (i != 0) {
            if (i != 4) {
                if (i == 5) {
                    dhd = new C51166Fpc(this);
                } else if (i == 6) {
                    dhd = new C46595Dhb(this);
                } else if (i == 7) {
                    dhd = new C46596Dhc(this);
                } else {
                    return;
                }
            }
            dhd = new C46594Dha(this);
        } else {
            dhd = new C46597Dhd(this);
        }
        11Z.A02(dhd);
    }

    public final String getModuleName() {
        String str;
        IgBloksScreenConfig igBloksScreenConfig = this.A0A;
        if (igBloksScreenConfig != null) {
            str = igBloksScreenConfig.A0R;
        } else {
            str = null;
        }
        String str2 = this.A0G;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return "bloks_unknown";
    }

    public final AnonymousClass0wW getSession() {
        return this.A0N;
    }

    public final String getUrl() {
        String str = this.A0G;
        if (str == null) {
            return null;
        }
        return 0mp.A06("instagram://bloks/?app_id=%s", new Object[]{str});
    }

    public final boolean isScrolledToTop() {
        C307786Rm A022;
        this.A04.getClass();
        AnonymousClass6NS r0 = this.A04.A04.A01;
        if (r0 == null || (A022 = r0.A02()) == null || RhN.A00(A022)) {
            return true;
        }
        return false;
    }

    public final boolean onBackPressed() {
        C277014uI r1;
        IgBloksScreenConfig igBloksScreenConfig = this.A0A;
        if (igBloksScreenConfig == null || (r1 = igBloksScreenConfig.A09) == null || this.A0H) {
            return false;
        }
        this.A0H = true;
        A05(this, r1);
        this.A0H = false;
        return true;
    }

    private void A02(Bundle bundle) {
        Bundle bundle2;
        G8K g8k;
        C307786Rm A022;
        AnonymousClass0wW A042 = 09i.A0A.A04(requireArguments());
        this.A0N = A042;
        this.A0D = 0Gl.A01(A042);
        this.A0P = C71682ef.A01((0lg) null, C18425VrU.A01.A00);
        if (bundle == null) {
            bundle2 = requireArguments();
        } else {
            bundle2 = bundle;
        }
        C46645DiQ A012 = C46583DhP.A01(bundle2);
        this.A05 = A012;
        this.A0G = A012.A09;
        try {
            IgBloksScreenConfig A013 = IgBloksScreenConfig.A01(this.mArguments, this.A0N);
            A013.getClass();
            this.A0A = A013;
        } catch (NullPointerException e) {
            String str = this.A0G;
            boolean z = false;
            if (bundle != null) {
                z = true;
            }
            1Kn.A00((C307786Rm) null, __redex_internal_original_name, 002.A19("Unexpected null screen config for screen with appId: ", str, " | fromConfigChange: ", z), e);
            this.A0A = new IgBloksScreenConfig((0lg) this.A0N);
        }
        this.A09 = C229382nI.A02(this, this, this.A0N, this.A0P);
        this.A03 = requireActivity();
        IgBloksScreenConfig igBloksScreenConfig = this.A0A;
        this.A0B = igBloksScreenConfig.A05;
        C229382nI r1 = this.A09;
        if (igBloksScreenConfig.A0c) {
            r1.A00 = true;
        }
        Context requireContext = requireContext();
        C229382nI r7 = this.A09;
        C359618dD A052 = this.A0A.A05();
        C46583DhP A002 = C46583DhP.A00(requireContext, new SparseArray(), this.A05, this.A0A.A07, r7, A052);
        this.A04 = A002;
        if (A002.A08(requireContext(), this)) {
            String A003 = C273654mx.A00(942);
            G8K g8k2 = this.A06;
            if (g8k2 != null) {
                g8k2.CmM(A003);
            }
            F3o f3o = this.A0B;
            if (f3o != null) {
                f3o.A02();
            }
        }
        G8K g8k3 = this.A04.A00;
        g8k3.getClass();
        this.A06 = g8k3;
        g8k3.CmM("fragment_create");
        this.A0O = AnonymousClass3E4.A01(this, false, true);
        UserSession userSession = this.A0D;
        if (userSession != null) {
            AnonymousClass1Nd.A00(userSession).A03(this.A0R, C312466eT.class, "support_personalized_ads_sticker_shared_event");
        }
        this.A0J = AnonymousClass2uJ.A00(getRootActivity());
        AnonymousClass6NS r0 = this.A04.A04.A01;
        if (!(r0 == null || (A022 = r0.A02()) == null)) {
            this.A0M = (C307756Ri) A022.A01.get(R.id.bloks_ig_scrollable_navigation_helper);
        }
        String moduleName = getModuleName();
        G8K g8k4 = this.A06;
        if (g8k4 != null) {
            g8k4.CmF("analytics_module", moduleName);
        }
        String str2 = this.A0G;
        if (str2 != null && (g8k = this.A06) != null) {
            g8k.CmF("app_id", str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A06(X.AnonymousClass3M3 r1) {
        /*
            android.app.Activity r0 = r1.getRootActivity()
            boolean r0 = r0 instanceof com.instagram.modal.ModalActivity
            if (r0 == 0) goto L_0x0024
            android.app.Activity r1 = r1.getRootActivity()
            com.instagram.modal.ModalActivity r1 = (com.instagram.modal.ModalActivity) r1
            android.view.View r0 = r1.A00
            if (r0 != 0) goto L_0x001d
            r0 = 2131435212(0x7f0b1ecc, float:1.849226E38)
            android.view.View r0 = r1.findViewById(r0)
            r1.A00 = r0
            if (r0 == 0) goto L_0x0024
        L_0x001d:
            boolean r1 = r0.getFitsSystemWindows()
            r0 = 1
            if (r1 != 0) goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3M3.A06(X.3M3):boolean");
    }

    public final boolean CcT() {
        if (!isAdded()) {
            return false;
        }
        Activity rootActivity = getRootActivity();
        rootActivity.getClass();
        if (!0nA.A0x(rootActivity) || A06(this) || C61290mR.A07()) {
            return false;
        }
        IgBloksScreenConfig igBloksScreenConfig = this.A0A;
        if (igBloksScreenConfig.A0f || igBloksScreenConfig.A0h) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01cb, code lost:
        if (r5.intValue() <= 0) goto L_0x01cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r15) {
        /*
            r14 = this;
            boolean r0 = r14.CcT()
            if (r0 == 0) goto L_0x001e
            boolean r0 = X.2db.A09()
            if (r0 != 0) goto L_0x001e
            android.app.Activity r2 = r14.getRootActivity()
            android.content.Context r1 = r14.requireContext()
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            int r0 = r1.getColor(r0)
            X.2db.A02(r2, r0)
        L_0x001e:
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = r14.A0A
            X.XCK r0 = r1.A04
            if (r0 == 0) goto L_0x0053
            X.X6J r1 = r14.A0L
            if (r1 != 0) goto L_0x002e
            X.X6J r1 = r0.AL9(r14)
            r14.A0L = r1
        L_0x002e:
            android.content.Context r0 = r14.requireContext()
            r1.AJ3(r0, r15)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r14.A0A
            X.XCK r0 = r0.A04
            boolean r0 = r0.CYT()
            if (r0 == 0) goto L_0x004b
            X.X6J r0 = r14.A0L
            r0.onDestroy()
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = r14.A0A
            r0 = 0
            r1.A04 = r0
            r14.A0L = r0
        L_0x004b:
            java.util.List r0 = r14.A0Q
            if (r0 == 0) goto L_0x0052
            r14.A01()
        L_0x0052:
            return
        L_0x0053:
            boolean r0 = r1.A0k
            r15.Etr(r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = r14.A0A
            boolean r0 = r1.A0k
            if (r0 == 0) goto L_0x0052
            X.4tV r4 = r1.A08
            r3 = 1
            r2 = 0
            if (r4 == 0) goto L_0x023a
            X.FM0 r5 = new X.FM0
            r5.<init>(r14, r4)
            java.lang.String r6 = ""
            r0 = 40
            r4.A0K(r0)
            r0 = 36
            java.lang.String r0 = r4.A0K(r0)
            if (r0 == 0) goto L_0x01fc
            X.3JR r1 = new X.3JR
            r1.<init>()
            java.lang.String r0 = r4.A0F()
            if (r0 == 0) goto L_0x0084
            r6 = r0
        L_0x0084:
            r1.A0K = r6
            r0 = 2132017160(0x7f140008, float:1.967259E38)
            r1.A0D = r0
            r1.A0G = r5
            java.lang.String r0 = A00(r4)
            r1.A0M = r0
            X.3Jb r0 = new X.3Jb
            r0.<init>(r1)
            r15.A8p(r0)
        L_0x009b:
            r14.A0I = r2
        L_0x009d:
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r14.A0A
            java.util.List r0 = r0.A0X
            if (r0 == 0) goto L_0x026c
            r8 = 0
        L_0x00a4:
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r14.A0A
            java.util.List r0 = r0.A0X
            int r0 = r0.size()
            if (r8 >= r0) goto L_0x026c
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r14.A0A
            java.util.List r0 = r0.A0X
            java.lang.Object r7 = r0.get(r8)
            X.4tV r7 = (X.C276544tV) r7
            X.FM1 r5 = new X.FM1
            r5.<init>(r14, r7)
            java.lang.String r1 = ""
            r11 = 40
            r7.A0K(r11)
            r4 = 36
            java.lang.String r0 = r7.A0K(r4)
            if (r0 == 0) goto L_0x00fb
            X.3JR r9 = new X.3JR
            r9.<init>()
            java.lang.String r0 = r7.A0K(r4)
            if (r0 == 0) goto L_0x00d8
            r1 = r0
        L_0x00d8:
            r9.A0K = r1
            r0 = 2132017160(0x7f140008, float:1.967259E38)
            r9.A0D = r0
            r9.A0G = r5
            java.lang.String r0 = A00(r7)
            r9.A0M = r0
        L_0x00e7:
            X.3Jb r0 = new X.3Jb
            r0.<init>(r9)
            r15.AA3(r0)
        L_0x00ef:
            r0 = 44
            boolean r0 = r7.A0R(r0, r3)
            r15.ARb(r8, r0)
            int r8 = r8 + 1
            goto L_0x00a4
        L_0x00fb:
            r12 = 38
            java.lang.String r0 = r7.A0K(r12)
            if (r0 == 0) goto L_0x00ef
            java.lang.String r0 = r7.A0K(r12)
            if (r0 == 0) goto L_0x010a
            r1 = r0
        L_0x010a:
            java.lang.Integer r13 = X.C46616Dhw.A03(r1)
            if (r13 == 0) goto L_0x00ef
            int r6 = X.Tt3.A01(r13)
            r10 = 41
            X.4tV r1 = r7.A07(r10)
            if (r1 == 0) goto L_0x01f9
            int r9 = r1.A04
            r0 = 14145(0x3741, float:1.9821E-41)
            if (r9 != r0) goto L_0x01f9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r0 = 35
            java.lang.String r0 = r1.A0K(r0)
            X.C46616Dhw.A04(r0)
            java.lang.String r0 = r1.A0K(r12)
            X.C46616Dhw.A04(r0)
            java.lang.String r0 = r1.A0K(r4)
            X.C46616Dhw.A04(r0)
            java.lang.String r4 = r1.A0K(r11)
            r0 = -1
            int r0 = r1.A03(r10, r0)
            X.VVE r1 = new X.VVE
            r1.<init>(r4, r0, r9)
        L_0x014b:
            X.3JR r9 = new X.3JR
            r9.<init>()
            r9.A06 = r6
            int r0 = X.Tt3.A00(r13)
            r9.A05 = r0
            r9.A0G = r5
            r0 = 2132017160(0x7f140008, float:1.967259E38)
            r9.A0D = r0
            java.lang.String r0 = A00(r7)
            r9.A0M = r0
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r14.A0A
            X.FpL r0 = r0.A02
            if (r0 == 0) goto L_0x00e7
            if (r1 == 0) goto L_0x00e7
            java.lang.String r5 = r1.A02
            if (r5 == 0) goto L_0x00e7
            java.lang.String r0 = "shop_cart_data"
            boolean r0 = X.00l.A0d(r5, r0, r2)
            if (r0 == 0) goto L_0x00e7
            X.Wgv r6 = new X.Wgv
            r6.<init>()
            boolean r0 = r14.isAdded()
            if (r0 == 0) goto L_0x00e7
            android.content.Context r10 = r14.requireContext()
            com.instagram.common.session.UserSession r4 = r14.A0D
            r6.A01 = r1
            java.lang.String r0 = "cart"
            boolean r0 = X.00l.A0d(r5, r0, r2)
            if (r0 == 0) goto L_0x01da
            if (r4 == 0) goto L_0x01da
            int r1 = r1.A00
            r0 = -1
            if (r1 == r0) goto L_0x01e5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
        L_0x019f:
            X.VVE r0 = r6.A01
            if (r0 == 0) goto L_0x01e1
            java.lang.Integer r0 = r0.A01
            if (r0 == 0) goto L_0x01e1
            int r1 = r0.intValue()
        L_0x01ab:
            X.3JS r0 = new X.3JS
            r0.<init>(r10, r1)
            r0.A01()
            r9.A0F = r0
            X.3Jb r0 = new X.3Jb
            r0.<init>(r9)
            android.view.View r4 = r15.AA3(r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r6.A00 = r4
            if (r4 == 0) goto L_0x01da
            if (r5 == 0) goto L_0x01cd
            int r1 = r5.intValue()
            r0 = 1
            if (r1 > 0) goto L_0x01ce
        L_0x01cd:
            r0 = 0
        L_0x01ce:
            r4.setActivated(r0)
            if (r5 == 0) goto L_0x01da
            int r0 = r5.intValue()
            r4.setImageLevel(r0)
        L_0x01da:
            java.util.List r0 = r14.A0Q
            r0.add(r6)
            goto L_0x00ef
        L_0x01e1:
            r1 = 2131238793(0x7f081f89, float:1.8093875E38)
            goto L_0x01ab
        L_0x01e5:
            X.6xT r0 = X.C323426xT.A00(r4)
            java.lang.Integer r5 = r0.A06()
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r4)
            java.lang.Class<X.6yN> r1 = X.C323956yN.class
            X.WQb r0 = r6.A02
            r4.A01(r0, r1)
            goto L_0x019f
        L_0x01f9:
            r1 = 0
            goto L_0x014b
        L_0x01fc:
            r1 = 38
            java.lang.String r0 = r4.A0K(r1)
            if (r0 == 0) goto L_0x009d
            java.lang.String r0 = r4.A0K(r1)
            if (r0 == 0) goto L_0x020b
            r6 = r0
        L_0x020b:
            java.lang.Integer r0 = X.C46616Dhw.A03(r6)
            if (r0 == 0) goto L_0x009d
            X.3JR r1 = new X.3JR
            r1.<init>()
            int r0 = X.Tt3.A01(r0)
            r1.A01(r0)
            r1.A0G = r5
            java.lang.String r0 = A00(r4)
            r1.A0M = r0
            X.3Jb r0 = new X.3Jb
            r0.<init>(r1)
            r15.ErG(r0)
            r0 = 44
            boolean r0 = r4.A0R(r0, r3)
            r15.EVS(r0)
            r14.A0I = r3
            goto L_0x009d
        L_0x023a:
            boolean r0 = r1.A0j
            if (r0 != 0) goto L_0x009b
            X.4uI r0 = r1.A09
            if (r0 == 0) goto L_0x025d
            X.3JR r1 = new X.3JR
            r1.<init>()
            r0 = 2131237915(0x7f081c1b, float:1.8092094E38)
            r1.A01 = r0
            X.FKq r0 = new X.FKq
            r0.<init>(r14)
            r1.A0G = r0
        L_0x0253:
            X.3Jb r0 = new X.3Jb
            r0.<init>(r1)
            r15.ErG(r0)
            goto L_0x009d
        L_0x025d:
            boolean r0 = r1.A0i
            if (r0 == 0) goto L_0x009d
            X.3JR r1 = new X.3JR
            r1.<init>()
            r0 = 2131239025(0x7f082071, float:1.8094345E38)
            r1.A01 = r0
            goto L_0x0253
        L_0x026c:
            boolean r0 = r14.A0I
            r15.Eu4(r0)
            boolean r0 = r14.A0I
            if (r0 != 0) goto L_0x039e
            android.content.Context r0 = r14.requireContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r5 = r1.getDimensionPixelSize(r0)
        L_0x0284:
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r14.A0A
            X.X2h r0 = r0.A01
            r6 = -1
            r4 = -2
            if (r0 == 0) goto L_0x032a
            android.content.Context r0 = r14.getContext()
            if (r0 == 0) goto L_0x032a
            X.UTr r0 = r14.A07
            if (r0 != 0) goto L_0x02c4
            android.content.Context r1 = r14.getContext()
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r1)
            r14.A02 = r0
            android.content.Context r0 = r14.getContext()
            X.UTr r1 = new X.UTr
            r1.<init>(r0)
            r14.A07 = r1
            android.widget.FrameLayout r0 = r14.A02
            r0.addView(r1)
            X.UTr r1 = r14.A07
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r4, r6)
            r1.setLayoutParams(r0)
            X.UTr r1 = r14.A07
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r14.A0A
            X.X2h r0 = r0.A01
            r1.setLazyRenderTreeProvider(r0)
        L_0x02c4:
            android.widget.FrameLayout r0 = r14.A02
            if (r0 == 0) goto L_0x02cb
            r15.ETi(r0, r5, r2, r2)
        L_0x02cb:
            android.content.Context r0 = r14.getContext()
            if (r0 == 0) goto L_0x0328
            android.content.Context r0 = r14.getContext()
            boolean r0 = X.AnonymousClass3HA.A00(r0)
            if (r0 == 0) goto L_0x0328
        L_0x02db:
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = r14.A0A
            java.lang.Integer r0 = r1.A0D
            if (r0 == 0) goto L_0x0321
            if (r3 == 0) goto L_0x0321
        L_0x02e3:
            int r1 = r0.intValue()
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r15.ENd(r0)
        L_0x02ef:
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r14.A0A
            java.util.HashMap r0 = r0.A0W
            if (r0 == 0) goto L_0x03a1
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x02fd:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03a1
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r2.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r15.ARb(r1, r0)
            goto L_0x02fd
        L_0x0321:
            java.lang.Integer r0 = r1.A0E
            if (r0 == 0) goto L_0x02ef
            if (r3 != 0) goto L_0x02ef
            goto L_0x02e3
        L_0x0328:
            r3 = 0
            goto L_0x02db
        L_0x032a:
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r14.A0A
            X.68u r0 = r0.A06
            if (r0 == 0) goto L_0x0388
            android.content.Context r0 = r14.getContext()
            if (r0 == 0) goto L_0x0388
            X.2nI r0 = r14.A09
            if (r0 == 0) goto L_0x0388
            X.4n2 r0 = r14.A08
            if (r0 != 0) goto L_0x0366
            android.content.Context r1 = r14.getContext()
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r1)
            r14.A02 = r0
            android.content.Context r0 = r14.getContext()
            X.0qQ.A0B(r0, r3)
            X.4n2 r1 = new X.4n2
            r1.<init>(r0)
            r14.A08 = r1
            android.widget.FrameLayout r0 = r14.A02
            r0.addView(r1)
            X.4n2 r1 = r14.A08
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r4, r6)
            r1.setLayoutParams(r0)
        L_0x0366:
            X.6NS r0 = r14.A0C
            if (r0 == 0) goto L_0x036d
            r0.A03()
        L_0x036d:
            android.content.Context r4 = r14.getContext()
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r14.A0A
            X.68u r1 = r0.A06
            X.2nI r0 = r14.A09
            X.6NR r0 = X.AnonymousClass6NS.A00(r4, r1, r0)
            X.6NS r1 = r0.A00()
            r14.A0C = r1
            X.4n2 r0 = r14.A08
            r1.A07(r0)
            goto L_0x02c4
        L_0x0388:
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r14.A0A
            java.lang.String r1 = r0.A0U
            if (r1 == 0) goto L_0x0395
            java.lang.String r0 = r0.A0T
            r15.EfN(r1, r0)
            goto L_0x02cb
        L_0x0395:
            java.lang.String r1 = "BLOKS"
            java.lang.String r0 = "Screen showing action bar without a title!"
            X.0wb.A03(r1, r0)
            goto L_0x02cb
        L_0x039e:
            r5 = 0
            goto L_0x0284
        L_0x03a1:
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r14.A0A
            java.util.HashMap r0 = r0.A0V
            if (r0 == 0) goto L_0x0052
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x03af:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r2.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r15.ARS(r1, r0)
            goto L_0x03af
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3M3.configureActionBar(X.2da):void");
    }

    public final C227842k3 getStatusBarType() {
        if (CcT()) {
            return C227842k3.TRANSPARENT;
        }
        return C227842k3.DEFAULT;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1891871661);
        super.onCreate(bundle);
        this.A0T.add("ON_CREATE");
        A02(bundle);
        AnonymousClass0fD.A09(-820291927, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-146108340);
        this.A0T.add("ON_CREATE_VIEW");
        View inflate = layoutInflater.inflate(R.layout.bloks_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-972454627, A022);
        return inflate;
    }

    public final void onDestroy() {
        int i;
        int A022 = AnonymousClass0fD.A02(-420573117);
        super.onDestroy();
        this.A0T.add("ON_DESTROY");
        C46583DhP dhP = this.A04;
        if (dhP != null) {
            dhP.A06();
        }
        this.A09 = null;
        X6J x6j = this.A0L;
        if (x6j != null) {
            x6j.onDestroy();
        }
        if (this.A0Q != null) {
            A01();
        }
        IgBloksScreenConfig igBloksScreenConfig = this.A0A;
        if (igBloksScreenConfig == null) {
            i = 858753766;
        } else {
            F1F f1f = igBloksScreenConfig.A03;
            if (f1f != null) {
                f1f.A00(this.A0D);
            }
            if (requireActivity().isFinishing() || !requireActivity().isChangingConfigurations()) {
                this.A0A.A06();
            }
            i = 1261094315;
        }
        AnonymousClass0fD.A09(i, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(204769635);
        super.onDestroyView();
        this.A0T.add("ON_DESTROY_VIEW");
        C46583DhP dhP = this.A04;
        if (dhP != null) {
            dhP.A07();
        }
        this.A01 = null;
        this.A0F = null;
        this.A00 = null;
        AnonymousClass6NS r0 = this.A0C;
        if (r0 != null) {
            r0.A03();
            this.A0C = null;
        }
        this.A08 = null;
        this.A07 = null;
        this.A02 = null;
        UserSession userSession = this.A0D;
        if (userSession != null) {
            AnonymousClass1Nd.A00(userSession).A02(this.A0R, C312466eT.class);
        }
        AnonymousClass0fD.A09(-319279992, A022);
    }

    public final void onPause() {
        G8K g8k;
        int A022 = AnonymousClass0fD.A02(1323028920);
        AnonymousClass3M3.super.onPause();
        this.A0T.add("ON_PAUSE");
        getRootActivity().getClass();
        if (getRootActivity().getWindow() != null) {
            getRootActivity().getWindow().setSoftInputMode(this.A0K);
        }
        if (!this.A0A.A0Z) {
            2dZ.A0t.A03(this.A03).A0W.remove(this);
        }
        boolean isFinishing = requireActivity().isFinishing();
        G8K g8k2 = this.A06;
        if (g8k2 != null) {
            g8k2.CmD("is_finishing", isFinishing ? 1 : 0);
        }
        boolean z = this.mRemoving;
        G8K g8k3 = this.A06;
        if (g8k3 != null) {
            g8k3.CmD("is_removing", z ? 1 : 0);
        }
        F3o f3o = this.A0B;
        if (f3o != null) {
            f3o.A00();
        }
        AnonymousClass2uJ.A04(getRootActivity(), this.A0J);
        C46583DhP dhP = this.A04;
        if (!(dhP == null || (g8k = dhP.A00) == null)) {
            g8k.Cft("BloksSurfaceController_onPause");
        }
        AnonymousClass0fD.A09(476915104, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1925495189);
        super.onResume();
        this.A0T.add("ON_RESUME");
        if (!(getRootActivity() == null || getRootActivity().getWindow() == null)) {
            this.A0K = getRootActivity().getWindow().getAttributes().softInputMode;
            getRootActivity().getWindow().setSoftInputMode(this.A0A.A00 | 2);
        }
        if (!this.A0A.A0Z) {
            2dZ.A0t.A03(requireActivity()).A0W.put(this, (Object) null);
        }
        if (A08()) {
            Activity rootActivity = getRootActivity();
            rootActivity.getClass();
            AnonymousClass2uJ.A04(rootActivity, getRootActivity().getColor(R.color.fds_transparent));
        }
        AnonymousClass0fD.A09(604721443, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.A0T.add("ON_SAVE_INSTANCE_STATE");
        boolean booleanValue = C46648DiT.A00(this.A0N).booleanValue();
        C46583DhP dhP = this.A04;
        if (dhP != null) {
            C46645DiQ diQ = dhP.A05;
            bundle.putString(AnonymousClass000.A00(1063), "legacy_screen");
            if (booleanValue) {
                bundle.putBoolean(AnonymousClass000.A00(2116), true);
                bundle.putAll(C46645DiQ.A00(diQ, true));
                return;
            }
            bundle.putBundle("BloksSurfaceProps", C46645DiQ.A00(diQ, true));
        }
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-177808060);
        AnonymousClass3M3.super.onStart();
        this.A0T.add("ON_START");
        IgBloksScreenConfig igBloksScreenConfig = this.A0A;
        if (igBloksScreenConfig != null && !igBloksScreenConfig.A0l && (getRootActivity() instanceof AnonymousClass2ZP)) {
            ((AnonymousClass2ZP) getRootActivity()).Enj(8);
        }
        AnonymousClass3E6 r1 = this.A0O;
        if (r1 == null) {
            0wb.A03(__redex_internal_original_name, "KHCD should already be initialized");
            r1 = AnonymousClass3E4.A01(this, false, true);
            this.A0O = r1;
        }
        r1.DmJ(getRootActivity());
        this.A0O.A9Y(this.A0S);
        AnonymousClass0fD.A09(-2122557893, A022);
    }

    public final void onStop() {
        int i;
        int A022 = AnonymousClass0fD.A02(1082412251);
        AnonymousClass3M3.super.onStop();
        this.A0T.add("ON_STOP");
        if (getRootActivity() instanceof AnonymousClass2ZP) {
            ((AnonymousClass2ZP) getRootActivity()).Enj(0);
        }
        AnonymousClass3E6 r1 = this.A0O;
        if (r1 == null) {
            0wb.A03(__redex_internal_original_name, "KHCD should have been initialized");
            i = -1579484603;
        } else {
            r1.EEH(this.A0S);
            this.A0O.onStop();
            i = -1031934192;
        }
        AnonymousClass0fD.A09(i, A022);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: X.DhP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.util.List} */
    /* JADX WARNING: type inference failed for: r3v0, types: [X.9jr, android.view.View, android.view.ViewGroup, com.instagram.common.ui.base.IgFrameLayout] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005a, code lost:
        if (r3 != null) goto L_0x005c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            r9 = this;
            super.onViewCreated(r10, r11)
            java.util.List r2 = r9.A0T
            java.lang.String r0 = "ON_VIEW_CREATED"
            r2.add(r0)
            r0 = 2131428795(0x7f0b05bb, float:1.8479245E38)
            android.view.View r0 = r10.requireViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r9.A01 = r0
            r0 = 2131432467(0x7f0b1413, float:1.8486692E38)
            android.view.View r1 = r10.findViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r9.A0F = r0
            r0 = 2131431345(0x7f0b0fb1, float:1.8484417E38)
            android.view.View r1 = r10.findViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r9.A0E = r0
            X.DhP r0 = r9.A04     // Catch:{ NullPointerException -> 0x003e }
            r0.getClass()     // Catch:{ NullPointerException -> 0x003e }
            X.DhP r2 = r9.A04     // Catch:{ NullPointerException -> 0x003e }
            goto L_0x00e3
        L_0x003e:
            java.lang.String r1 = "Expected non-null BloksSurfaceController | Lifecycles: "
            java.lang.String r0 = " -> "
            java.lang.String r0 = android.text.TextUtils.join(r0, r2)
            java.lang.String r3 = X.002.A0R(r1, r0)
            X.DiQ r0 = r9.A05
            java.lang.String r1 = " | appId: "
            if (r0 != 0) goto L_0x0188
            java.lang.String r0 = " | BloksSurfaceProps is null"
            java.lang.String r4 = X.002.A0R(r3, r0)
            if (r11 != 0) goto L_0x0185
            android.os.Bundle r3 = r9.mArguments
            if (r3 == 0) goto L_0x0084
        L_0x005c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r1)
            r0 = 2116(0x844, float:2.965E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 0
            boolean r0 = r3.getBoolean(r1, r0)
            if (r0 != 0) goto L_0x0179
            java.lang.String r0 = "BloksSurfaceProps"
            android.os.Bundle r3 = r3.getBundle(r0)
            if (r3 != 0) goto L_0x0179
            r0 = 0
        L_0x007d:
            r2.append(r0)
            java.lang.String r4 = r2.toString()
        L_0x0084:
            X.2nI r0 = r9.A09
            if (r0 != 0) goto L_0x008e
            java.lang.String r0 = " | Host is null"
            java.lang.String r4 = X.002.A0R(r4, r0)
        L_0x008e:
            X.0wW r0 = r9.A0N
            if (r0 != 0) goto L_0x0098
            java.lang.String r0 = " | MainSession is null"
            java.lang.String r4 = X.002.A0R(r4, r0)
        L_0x0098:
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r9.A0A
            if (r0 != 0) goto L_0x00a2
            java.lang.String r0 = " | Screen Config is null"
            java.lang.String r4 = X.002.A0R(r4, r0)
        L_0x00a2:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r4)
            java.lang.String r0 = "IgBloksScreenFragment"
            X.1Kn.A03(r0, r1)
            X.0Tu r2 = X.0Tu.A05
            r0 = 18310098417889398(0x410cf000003076, double:1.8969352197837663E-307)
            boolean r0 = X.1AW.A06(r2, r0)
            if (r0 != 0) goto L_0x00d9
            X.0hq r1 = r9.getParentFragmentManager()
            int r0 = r1.A0M()
            if (r0 <= 0) goto L_0x00cb
            boolean r0 = r1.A0G
            if (r0 != 0) goto L_0x00cb
            r1.A0c()
        L_0x00ca:
            return
        L_0x00cb:
            androidx.fragment.app.FragmentActivity r0 = r9.getActivity()
            if (r0 == 0) goto L_0x00ca
            androidx.fragment.app.FragmentActivity r0 = r9.requireActivity()
            r0.finish()
            return
        L_0x00d9:
            r9.A02(r11)
            X.DhP r0 = r9.A04
            r0.getClass()
            X.DhP r2 = r9.A04
        L_0x00e3:
            android.widget.FrameLayout r1 = r9.A01
            android.content.Context r0 = r9.requireContext()
            android.util.Pair r0 = r2.A04(r0)
            java.lang.Object r0 = r0.first
            android.view.View r0 = (android.view.View) r0
            r1.addView(r0)
            android.app.Activity r1 = r9.getRootActivity()
            r1.getClass()
            r0 = 2131435206(0x7f0b1ec6, float:1.8492248E38)
            android.view.View r2 = r1.findViewById(r0)
            if (r2 != 0) goto L_0x0106
            android.widget.FrameLayout r2 = r9.A01
        L_0x0106:
            X.2el r1 = r9.A0P
            X.3DZ r0 = X.AnonymousClass3DZ.A00(r9)
            r1.A06(r2, r0)
            X.0tS r2 = X.0tS.A00()
            X.0s0 r1 = r2.A1P
            X.0YZ[] r8 = X.0tS.A4G
            r7 = 162(0xa2, float:2.27E-43)
            r0 = r8[r7]
            java.lang.Object r0 = r1.CDM(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00ca
            android.content.Context r5 = r9.requireContext()
            r6 = 0
            r4 = 0
            X.9jr r3 = new X.9jr
            r3.<init>(r5, r6, r4, r4)
            X.0xi r0 = X.0tS.A4E
            X.0tS r2 = r0.A00()
            X.0s0 r1 = r2.A1P
            r0 = r8[r7]
            java.lang.Object r0 = r1.CDM(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0173
            r0 = 2131100333(0x7f0602ad, float:1.7813044E38)
            r3.setBackgroundResource(r0)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            r0 = 2131626054(0x7f0e0846, float:1.8879333E38)
            r1.inflate(r0, r3)
            int[] r0 = X.C71382cm.A1Q
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0)
            X.0qQ.A07(r0)
            java.lang.String r0 = X.C71622eP.A00(r5, r0, r4)
            r3.setTitle(r0)
        L_0x0168:
            java.lang.String r0 = "Bloks"
            r3.setTitle(r0)
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r10.addView(r3)
            return
        L_0x0173:
            r0 = 8
            r3.setVisibility(r0)
            goto L_0x0168
        L_0x0179:
            r0 = 4314(0x10da, float:6.045E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r3.getString(r0)
            goto L_0x007d
        L_0x0185:
            r3 = r11
            goto L_0x005c
        L_0x0188:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r0 = r0.A09
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3M3.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final boolean CIn(int i, KeyEvent keyEvent) {
        return false;
    }
}
