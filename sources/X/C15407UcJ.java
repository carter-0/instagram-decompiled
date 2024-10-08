package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.instagram.android.R;

/* renamed from: X.UcJ  reason: case insensitive filesystem */
public final class C15407UcJ extends AnonymousClass3M4 implements AnonymousClass4DR, AnonymousClass4DS, AnonymousClass4DT, XBO, C240433Kw, C20942X5l, AnonymousClass0j7 {
    public static final String __redex_internal_original_name = "IgBloksScreenQueryFragment";
    public WF5 A00;
    public C14608TzE A01;
    public C15166UTr A02;
    public C307756Ri A03;
    public AnonymousClass3E6 A04;
    public 2el A05;
    public Integer A06;
    public Integer A07;
    public boolean A08;
    public boolean A09;
    public final C50120FPk A0A = new C50120FPk(this, 0);
    public final C252213ok A0B = new WTW(this, 0);
    public final AnonymousClass0eM A0C = C227642jf.A01(this);

    /* renamed from: A02 */
    public final void D5Q(WF5 wf5) {
        WF5 wf52;
        Window window;
        Integer num;
        0qQ.A0B(wf5, 0);
        WF5 wf53 = this.A00;
        if (wf53 != null) {
            C17668Vbz vbz = wf53.A00;
            if (vbz != null) {
                C17668Vbz vbz2 = wf5.A00;
                if (vbz2 != null) {
                    String str = vbz2.A05;
                    if (str == null) {
                        str = vbz.A05;
                    }
                    String str2 = vbz2.A04;
                    if (str2 == null) {
                        str2 = vbz.A04;
                    }
                    Integer num2 = vbz2.A03;
                    if (num2 == null) {
                        num2 = vbz.A03;
                    }
                    Integer num3 = vbz2.A02;
                    if (num3 == null) {
                        num3 = vbz.A02;
                    }
                    vbz = new C17668Vbz(vbz2.A00, vbz2.A01, num2, num3, str, str2, vbz2.A06, vbz2.A08, vbz2.A07);
                }
            } else {
                vbz = wf5.A00;
            }
            Boolean bool = wf5.A02;
            if (bool == null) {
                bool = wf53.A02;
            }
            C277014uI r2 = wf5.A01;
            if (r2 == null) {
                r2 = wf53.A01;
            }
            Integer num4 = wf5.A03;
            if (num4 == null) {
                num4 = wf53.A03;
            }
            wf52 = new WF5(vbz, r2, bool, num4);
        } else {
            wf52 = wf5;
        }
        this.A00 = wf52;
        if (getContext() != null && isAdded()) {
            WF5 wf54 = this.A00;
            if (wf54 != null) {
                Activity rootActivity = getRootActivity();
                if (!(rootActivity == null || (window = rootActivity.getWindow()) == null || (num = wf54.A03) == null)) {
                    Integer num5 = this.A06;
                    if (num5 == null) {
                        num5 = Integer.valueOf(window.getAttributes().softInputMode);
                    }
                    this.A06 = num5;
                    window.setSoftInputMode(num.intValue());
                }
                Boolean bool2 = wf54.A02;
                if (bool2 != null) {
                    Dbc.A0q(this, DbW.A00(bool2.booleanValue() ? 1 : 0));
                }
            }
            View view = this.mView;
            if (wf5.A00 != null && view != null && view.getViewTreeObserver().isAlive()) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                C50120FPk fPk = this.A0A;
                viewTreeObserver.removeOnPreDrawListener(fPk);
                view.getViewTreeObserver().addOnPreDrawListener(fPk);
            }
        }
    }

    public final void DDJ(Integer num) {
        Integer num2;
        int A032 = C51967G9n.A03(num, 0);
        C14608TzE tzE = this.A01;
        if (A032 != 1) {
            if (tzE != null) {
                num2 = AnonymousClass05K.A0C;
            } else {
                return;
            }
        } else if (tzE != null) {
            num2 = AnonymousClass05K.A01;
        } else {
            return;
        }
        tzE.A02(num2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r14) {
        /*
            r13 = this;
            r8 = 0
            X.0qQ.A0B(r14, r8)
            X.WF5 r0 = r13.A00
            r3 = 0
            if (r0 == 0) goto L_0x009a
            X.Vbz r4 = r0.A00
        L_0x000b:
            r12 = 0
            if (r4 == 0) goto L_0x0097
            boolean r1 = r4.A08
        L_0x0010:
            r0 = r1 ^ 1
            r14.Etr(r0)
            if (r1 != 0) goto L_0x0159
            if (r4 == 0) goto L_0x0094
            X.ULk r2 = r4.A00
            if (r2 == 0) goto L_0x0095
            X.3Jb r1 = r13.A00(r2, r8)
        L_0x0021:
            r9 = 1
            if (r1 == 0) goto L_0x005b
            java.lang.String r0 = r2.A05
            if (r0 == 0) goto L_0x0086
            r14.A8p(r1)
            boolean r0 = r2.A06
            r14.ARS(r8, r0)
        L_0x0030:
            r11 = 1
        L_0x0031:
            r0 = r11 ^ 1
            r14.Eu4(r0)
            if (r4 == 0) goto L_0x011d
            java.util.List r0 = r4.A06
            if (r0 == 0) goto L_0x00e1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0045:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x009d
            java.lang.Object r1 = r2.next()
            X.ULk r1 = (X.ULk) r1
            X.3Jb r0 = r13.A00(r1, r9)
            if (r0 == 0) goto L_0x0045
            X.AnonymousClass7TF.A1I(r1, r0, r5)
            goto L_0x0045
        L_0x005b:
            if (r4 == 0) goto L_0x0062
            boolean r0 = r4.A07
            if (r0 != r9) goto L_0x0062
            goto L_0x0030
        L_0x0062:
            X.WF5 r0 = r13.A00
            if (r0 == 0) goto L_0x0092
            X.4uI r5 = r0.A01
            if (r5 == 0) goto L_0x0092
            X.3JR r2 = new X.3JR
            r2.<init>()
            r1 = 20
            X.WBH r0 = new X.WBH
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r13)
            r2.A0G = r0
            r0 = 2131237915(0x7f081c1b, float:1.8092094E38)
            r2.A01 = r0
            X.3Jb r0 = new X.3Jb
            r0.<init>(r2)
            r14.ErG(r0)
            goto L_0x0092
        L_0x0086:
            java.lang.Integer r0 = r2.A02
            if (r0 == 0) goto L_0x0092
            r14.ErG(r1)
            boolean r0 = r2.A06
            r14.EVS(r0)
        L_0x0092:
            r11 = 0
            goto L_0x0031
        L_0x0094:
            r2 = r3
        L_0x0095:
            r1 = r3
            goto L_0x0021
        L_0x0097:
            r1 = 0
            goto L_0x0010
        L_0x009a:
            r4 = r3
            goto L_0x000b
        L_0x009d:
            java.util.Iterator r10 = r5.iterator()
            r7 = 0
        L_0x00a2:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r0 = r10.next()
            int r6 = r7 + 1
            if (r7 >= 0) goto L_0x00b8
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00b8:
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r5 = r0.A00
            X.ULk r5 = (X.ULk) r5
            java.lang.Object r0 = r0.A01
            X.3Jb r0 = (X.AnonymousClass3Jb) r0
            android.view.View r2 = r14.AA3(r0)
            java.lang.Integer r0 = r5.A02
            if (r0 == 0) goto L_0x00da
            int r1 = r5.A00
            if (r1 <= 0) goto L_0x00da
            boolean r0 = r2 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x00da
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r2.setActivated(r9)
            r2.setImageLevel(r1)
        L_0x00da:
            boolean r0 = r5.A06
            r14.ARb(r7, r0)
            r7 = r6
            goto L_0x00a2
        L_0x00e1:
            X.4tV r7 = r4.A01
            if (r7 == 0) goto L_0x014f
            android.content.Context r0 = r13.getContext()
            if (r0 == 0) goto L_0x014f
            if (r11 != 0) goto L_0x014a
            r6 = 0
        L_0x00ee:
            X.UTr r5 = r13.A02
            if (r5 != 0) goto L_0x00fd
            android.content.Context r0 = r13.requireContext()
            X.UTr r5 = new X.UTr
            r5.<init>(r0)
            r13.A02 = r5
        L_0x00fd:
            X.TzE r0 = r13.A01
            if (r0 == 0) goto L_0x010a
            X.6NS r0 = r0.A04
            X.6Rm r3 = r0.A02()
            X.0qQ.A07(r3)
        L_0x010a:
            android.content.Context r2 = r13.requireContext()
            X.3dB[] r1 = X.C307806Ro.A00(r3)
            X.WJr r0 = new X.WJr
            r0.<init>(r2, r3, r7, r1)
            r5.setLazyRenderTreeProvider(r0)
            r14.ETi(r5, r6, r8, r8)
        L_0x011d:
            android.content.Context r0 = r13.getContext()
            if (r0 == 0) goto L_0x012e
            android.content.Context r0 = r13.requireContext()
            boolean r0 = X.AnonymousClass3HA.A00(r0)
            if (r0 == 0) goto L_0x012e
            r12 = 1
        L_0x012e:
            if (r4 == 0) goto L_0x0159
            java.lang.Integer r0 = r4.A02
            if (r0 == 0) goto L_0x0143
            if (r12 == 0) goto L_0x0143
        L_0x0136:
            int r1 = r0.intValue()
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r14.ENd(r0)
            return
        L_0x0143:
            java.lang.Integer r0 = r4.A03
            if (r0 == 0) goto L_0x0159
            if (r12 != 0) goto L_0x0159
            goto L_0x0136
        L_0x014a:
            int r6 = X.DbZ.A02(r13)
            goto L_0x00ee
        L_0x014f:
            java.lang.String r1 = r4.A05
            if (r1 == 0) goto L_0x011d
            java.lang.String r0 = r4.A04
            r14.EfN(r1, r0)
            goto L_0x011d
        L_0x0159:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15407UcJ.configureActionBar(X.2da):void");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        C14608TzE tzE = this.A01;
        if (tzE != null) {
            tzE.A01(bundle);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View findViewById;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Activity rootActivity = getRootActivity();
        if (!(rootActivity == null || (findViewById = rootActivity.findViewById(R.id.layout_container_center_right_coordinator_layout)) == null)) {
            view = findViewById;
        }
        2el r0 = this.A05;
        if (r0 != null) {
            Dba.A0z(view, r0, this);
        }
    }

    private final AnonymousClass3Jb A00(ULk uLk, boolean z) {
        String str;
        C307786Rm r1;
        AnonymousClass3JR r3;
        int i;
        WBH wbh = new WBH(21, (Object) uLk, (Object) this);
        String str2 = uLk.A05;
        if (str2 != null) {
            boolean A0K = 0qQ.A0K(uLk.A04, "regular");
            r3 = new AnonymousClass3JR();
            r3.A0K = str2;
            r3.A0G = wbh;
            r3.A0M = uLk.A03;
            if (A0K) {
                i = R.style.ActionBarTextButton;
            } else {
                Context requireContext = requireContext();
                i = 0;
                if (1QE.A0E().A00) {
                    i = requireContext.getColor(1QE.A00(R.color.igds_primary_button));
                }
            }
            r3.A0D = i;
        } else {
            Integer num = uLk.A02;
            if (num != null) {
                r3 = new AnonymousClass3JR();
                r3.A0M = uLk.A03;
                r3.A0G = wbh;
                if (z) {
                    int A012 = Tt3.A01(num);
                    r3.A06 = A012;
                    r3.A05 = Tt3.A00(num);
                    if (uLk.A00 > 0) {
                        AnonymousClass3JS r0 = new AnonymousClass3JS(requireContext(), A012);
                        r0.A01();
                        r3.A0F = r0;
                    }
                } else {
                    r3.A01(Tt3.A01(num));
                }
            } else {
                if (z) {
                    str = "right";
                } else {
                    str = "left";
                }
                String A0g = 002.A0g("Custom ", str, " navbar button must have an icon or title specified");
                C14608TzE tzE = this.A01;
                if (tzE != null) {
                    r1 = tzE.A04.A02();
                    0qQ.A07(r1);
                } else {
                    r1 = null;
                }
                1Kn.A00(r1, __redex_internal_original_name, A0g, (Throwable) null);
                return null;
            }
        }
        return new AnonymousClass3Jb(r3);
    }

    public static final boolean A01(C15407UcJ ucJ, C277014uI r6, boolean z) {
        C14608TzE tzE = ucJ.A01;
        if (tzE != null) {
            C307786Rm A022 = tzE.A04.A02();
            0qQ.A07(A022);
            C276544tV r2 = C307476Qg.A02(A022).A06;
            if (r2 != null) {
                if (z) {
                    ucJ.A09 = true;
                }
                C307886Rw.A03(A022, r2, DbY.A0Q(A022), r6);
                if (z) {
                    ucJ.A09 = false;
                }
                return true;
            }
        }
        return false;
    }

    public final C227762js BD0() {
        C307756Ri r0 = this.A03;
        if (r0 != null) {
            return r0.A02;
        }
        return null;
    }

    public final String BTx() {
        String str;
        C14608TzE tzE = this.A01;
        if (tzE != null) {
            str = tzE.A03.A05;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = "bloks_unknown_class";
        }
        0qQ.A07(str);
        return str;
    }

    public final boolean CbJ() {
        C307756Ri r0 = this.A03;
        if (r0 != null) {
            return r0.A01;
        }
        return false;
    }

    public final void DCH() {
        C14608TzE tzE = this.A01;
        if (tzE != null) {
            tzE.A00();
        }
    }

    public final void Ee0(C14644Tzq tzq) {
        C14608TzE tzE = this.A01;
        if (tzE != null) {
            tzE.A00 = tzq;
            if (tzq != null) {
                tzE.A00();
            }
        }
    }

    public final String getModuleName() {
        Bundle bundle;
        String string;
        String str;
        C14608TzE tzE = this.A01;
        Bundle bundle2 = this.mArguments;
        if (tzE != null && (str = tzE.A03.A04) != null) {
            return str;
        }
        if (bundle2 == null || (bundle = bundle2.getBundle("key_screen_container_props_bundle")) == null || (string = bundle.getString("key_analytics_module")) == null) {
            return "bloks_unknown";
        }
        return string;
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public final String getUrl() {
        String str;
        C14608TzE tzE = this.A01;
        if (tzE != null) {
            str = tzE.A03.A05;
        } else {
            str = null;
        }
        return 0mp.A06("instagram://bloks_screen_query/?app_id=%s", new Object[]{str});
    }

    public final boolean onBackPressed() {
        C277014uI r1;
        WF5 wf5 = this.A00;
        if (wf5 == null || (r1 = wf5.A01) == null || this.A09) {
            return false;
        }
        return A01(this, r1, true);
    }

    public final void afterOnResume() {
        super.afterOnResume();
        WF5 wf5 = this.A00;
        if (wf5 != null) {
            D5Q(wf5);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1445417828);
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = requireArguments();
        }
        try {
            C18972WEz A012 = C18972WEz.A0A.A01(bundle);
            C307756Ri r0 = null;
            this.A05 = C71682ef.A01((0lg) null, C18425VrU.A01.A00);
            C229382nI A023 = C229382nI.A02(this, this, getSession(), this.A05);
            C13690Tf8 tf8 = A012.A01;
            0qQ.A0C(tf8, "null cannot be cast to non-null type com.instagram.bloks.screenquery.IgBloksFullScreenContainerConfig");
            this.A00 = (WF5) tf8;
            this.A01 = C14608TzE.A05.A01(requireContext(), bundle, this, A023);
            new C18505Vt2(this, this);
            C14608TzE tzE = this.A01;
            if (tzE != null) {
                C307786Rm A024 = tzE.A04.A02();
                0qQ.A07(A024);
                r0 = (C307756Ri) A024.A01.get(R.id.bloks_ig_scrollable_navigation_helper);
            }
            this.A03 = r0;
            if (getRootActivity() instanceof AnonymousClass2ZP) {
                Activity rootActivity = getRootActivity();
                0qQ.A0C(rootActivity, C66579MXk.A00(16));
                this.A07 = Integer.valueOf(((AnonymousClass2ZP) rootActivity).C3p());
            }
            this.A04 = AnonymousClass3E4.A01(this, false, true);
            AnonymousClass0fD.A09(-429075308, A022);
        } catch (V1c e) {
            1Kn.A03(__redex_internal_original_name, e);
            this.A08 = true;
            AnonymousClass0fD.A09(1935611107, A022);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        int A022 = AnonymousClass0fD.A02(-806930329);
        if (this.A08) {
            if (isAdded() && getParentFragmentManager().A0M() > 0 && !getParentFragmentManager().A0G) {
                DbT.A1I(this);
            } else if (getActivity() != null) {
                DbT.A1K(this);
            } else {
                throw new IllegalStateException("Tried to exit screen but could not find an activity or fragment manager");
            }
            view = new View(requireContext());
        } else {
            C14608TzE tzE = this.A01;
            if (tzE != null) {
                Context context = tzE.A02;
                AnonymousClass6NS r2 = tzE.A04;
                0qQ.A0B(r2, 1);
                C273694n2 r1 = new C273694n2(context);
                C51968G9o.A1D(r1, -1);
                r2.A07(r1);
                view = r1;
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A09(977703376, A022);
                throw A0y;
            }
        }
        AnonymousClass0fD.A09(-1486793311, A022);
        return view;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1804083104);
        super.onDestroyView();
        View view = this.mView;
        if (view != null && view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.A0A);
        }
        this.A02 = null;
        C14608TzE tzE = this.A01;
        if (tzE != null) {
            tzE.A04.A04();
        }
        AnonymousClass0fD.A09(-894469576, A022);
    }

    public final void onPause() {
        Window window;
        int A022 = AnonymousClass0fD.A02(-945267295);
        C15407UcJ.super.onPause();
        Integer num = this.A06;
        if (num != null) {
            int intValue = num.intValue();
            Activity rootActivity = getRootActivity();
            if (!(rootActivity == null || (window = rootActivity.getWindow()) == null)) {
                window.setSoftInputMode(intValue);
            }
        }
        Integer num2 = this.A07;
        if (num2 != null) {
            Dbc.A0q(this, num2.intValue());
        }
        AnonymousClass0fD.A09(-1772745643, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1870192875);
        C15407UcJ.super.onStart();
        AnonymousClass3E6 r1 = this.A04;
        if (r1 != null) {
            r1.DmJ(getRootActivity());
        }
        AnonymousClass3E6 r12 = this.A04;
        if (r12 != null) {
            r12.A9Y(this.A0B);
        }
        AnonymousClass0fD.A09(-928872832, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(547742261);
        C15407UcJ.super.onStop();
        AnonymousClass3E6 r1 = this.A04;
        if (r1 != null) {
            r1.EEH(this.A0B);
        }
        AnonymousClass3E6 r0 = this.A04;
        if (r0 != null) {
            r0.onStop();
        }
        AnonymousClass0fD.A09(1083828243, A022);
    }
}
