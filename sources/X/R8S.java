package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.WritableNativeMap;
import com.instagram.android.R;
import com.instagram.react.delegate.IgReactDelegate;
import com.instagram.react.delegate.IgReactDelegateLifecycleUtil;
import com.instagram.react.modules.exceptionmanager.IgReactExceptionManager;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Iterator;

public class R8S extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, C227272iw, C227562jX {
    public static final String __redex_internal_original_name = "IgReactFragmentProxy";
    public C8817RAt A00 = 1WM.getInstance().newIgReactDelegate(this);
    public AnonymousClass0wW A01;

    public final boolean CIn(int i, KeyEvent keyEvent) {
        return this.A00.CIn(i, keyEvent);
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    public final boolean onBackPressed() {
        if (this instanceof RBH) {
            return true;
        }
        return this.A00.onBackPressed();
    }

    public final boolean COC() {
        return requireArguments().getBoolean("IgReactFragment.ARGUMENT_IS_FULLSCREEN");
    }

    public final void configureActionBar(2da r6) {
        if (requireArguments().getBoolean("IgReactFragment.ARGUMENT_IS_FULLSCREEN")) {
            r6.Etr(false);
            return;
        }
        boolean z = requireArguments().getBoolean("IgReactFragment.ARGUMENT_IS_MODAL");
        String string = requireArguments().getString("IgReactFragment.ARGUMENT_TITLE");
        boolean z2 = requireArguments().getBoolean("IgReactFragment.ARGUMENT_LOGO_AS_TITLE", false);
        if (z) {
            r6.ErN(string);
            return;
        }
        if (z2) {
            r6.ETj(0Gl.A01(this.A01), R.layout.action_bar_title_logo, C51972G9s.A08(requireContext()), 0);
        } else {
            r6.setTitle(string);
        }
        r6.Eu4(true);
    }

    public final String getModuleName() {
        String string = requireArguments().getString("IgReactFragment.ARGUMENT_ANALYTICS_MODULE");
        if (TextUtils.isEmpty(string)) {
            return 002.A0R("rn_", requireArguments().getString("IgReactFragment.ARGUMENT_APP_KEY"));
        }
        return string;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Q6H A04;
        super.onActivityResult(i, i2, intent);
        IgReactDelegate igReactDelegate = (IgReactDelegate) this.A00;
        if (!igReactDelegate.A09 && (A04 = igReactDelegate.A06.A01().A04()) != null) {
            Iterator it = A04.A0B.iterator();
            while (it.hasNext()) {
                try {
                    Sp6 sp6 = (Sp6) ((C13430TaH) it.next());
                    if (i == 1) {
                        WritableNativeMap A0U = Pxe.A0U();
                        if (i2 != -1 || intent == null) {
                            A0U.putBoolean(RealtimeConstants.SEND_SUCCESS, false);
                        } else {
                            A0U.putBoolean(RealtimeConstants.SEND_SUCCESS, RealtimeConstants.SEND_SUCCESS.equals(intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS)));
                            A0U.putString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE));
                            A0U.putString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE));
                            String A012 = C46367Ddj.A01(9, 10, 65);
                            A0U.putString(A012, intent.getStringExtra(A012));
                        }
                        C13904TjR tjR = sp6.A00.mShopPayPromise;
                        if (tjR != null) {
                            tjR.resolve(A0U);
                        }
                    }
                } catch (RuntimeException e) {
                    A04.A0C(e);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass1WN A002;
        Bundle A0a;
        int A02 = AnonymousClass0fD.A02(647684239);
        R8S.super.onCreate(bundle);
        this.A01 = DbX.A0T(this);
        IgReactDelegate igReactDelegate = (IgReactDelegate) this.A00;
        Fragment fragment = igReactDelegate.A00;
        igReactDelegate.A05 = 09i.A0A.A04(fragment.mArguments);
        igReactDelegate.A0C = fragment.mArguments.getBoolean("IgReactFragment.ARGUMENT_IS_INLINE_NAV_BAR_ENABLED");
        synchronized (AnonymousClass1WN.class) {
            A002 = AnonymousClass1WN.A02.A00();
        }
        igReactDelegate.A06 = A002.A00(igReactDelegate.A05);
        igReactDelegate.A04 = new C12223SpZ(igReactDelegate);
        IgReactExceptionManager A003 = SAV.A00(igReactDelegate.A05);
        igReactDelegate.A07 = A003;
        A003.addExceptionHandler(igReactDelegate);
        if (igReactDelegate.A01 == null) {
            if (bundle != null) {
                A0a = bundle.getBundle("IgReactFragment.SAVED_RN_BUNDLE");
            } else {
                A0a = AnonymousClass7TE.A0a();
            }
            igReactDelegate.A01 = A0a;
        }
        igReactDelegate.A06.A00++;
        String string = fragment.mArguments.getString("IgReactFragment.TTI_EVENT_NAME");
        int i = fragment.mArguments.getInt("IgReactFragment.TTI_EVENT_ID", 0);
        Bundle bundle2 = fragment.mArguments.getBundle("IgReactFragment.TTI_EVENT_ANNOTATIONS");
        if (string != null) {
            1WM.getInstance().getPerformanceLogger(igReactDelegate.A05).EwU(bundle2, AnonymousClass05K.A01, (Integer) null, string, i);
        }
        AnonymousClass0fD.A09(1142474185, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-25043463);
        R8S.super.onCreateView(layoutInflater, viewGroup, bundle);
        IgReactDelegate igReactDelegate = (IgReactDelegate) this.A00;
        Fragment fragment = igReactDelegate.A00;
        FrameLayout frameLayout = new FrameLayout(fragment.getContext());
        igReactDelegate.mFrameLayout = frameLayout;
        C66581MXm.A1A(frameLayout, -1);
        C7372Q9d q9d = igReactDelegate.A03;
        if (q9d == null) {
            q9d = new C7372Q9d(fragment.getActivity());
            igReactDelegate.A03 = q9d;
        }
        q9d.A06 = new Sp3(igReactDelegate);
        FrameLayout frameLayout2 = igReactDelegate.mFrameLayout;
        AnonymousClass0fD.A09(-2038747028, A02);
        return frameLayout2;
    }

    public final void onDestroy() {
        Q6H q6h;
        int A02 = AnonymousClass0fD.A02(-595431062);
        IgReactDelegate igReactDelegate = (IgReactDelegate) this.A00;
        1WM.getInstance().getPerformanceLogger(igReactDelegate.A05).Dq8();
        igReactDelegate.A07.removeExceptionHandler(igReactDelegate);
        if (!igReactDelegate.A09) {
            C7372Q9d q9d = igReactDelegate.A03;
            if (q9d != null) {
                SSW ssw = q9d.A05;
                if (ssw != null && q9d.A0A) {
                    if (ssw.A0F.remove(q9d) && (q6h = ssw.A0G) != null && q6h.A0F()) {
                        SSW.A03(q6h, q9d);
                    }
                    q9d.A0A = false;
                }
                q9d.A05 = null;
                q9d.A0B = false;
                igReactDelegate.A03 = null;
            }
            SSW A012 = igReactDelegate.A06.A01();
            if (igReactDelegate.A00.getActivity() == A012.A00) {
                SSW.A01(A012);
                A012.A00 = null;
            }
        }
        T7S t7s = igReactDelegate.A06;
        int i = t7s.A00 - 1;
        t7s.A00 = i;
        if (i < 0) {
            0wb.A03(T7S.class.getName(), "Negative count of active fragments");
        }
        super.onDestroy();
        AnonymousClass0fD.A09(341609362, A02);
    }

    public final void onDestroyView() {
        int A02 = AnonymousClass0fD.A02(196522243);
        IgReactDelegate igReactDelegate = (IgReactDelegate) this.A00;
        if (igReactDelegate.A02 != null) {
            SSW A012 = igReactDelegate.A06.A01();
            A012.A0D.remove(igReactDelegate.A02);
            igReactDelegate.A02 = null;
        }
        C7372Q9d q9d = igReactDelegate.A03;
        if (!igReactDelegate.A09 && q9d != null) {
            igReactDelegate.mFrameLayout.removeView(q9d);
            q9d.A06 = null;
        }
        IgReactDelegateLifecycleUtil.cleanupReferences(igReactDelegate);
        super.onDestroyView();
        AnonymousClass0fD.A09(1902799669, A02);
    }

    public final void onPause() {
        int A02 = AnonymousClass0fD.A02(1608681833);
        R8S.super.onPause();
        IgReactDelegate igReactDelegate = (IgReactDelegate) this.A00;
        1WM.getInstance().getPerformanceLogger(igReactDelegate.A05).Dq8();
        Fragment fragment = igReactDelegate.A00;
        0nA.A0N(C66581MXm.A0A(fragment.getActivity()));
        fragment.getActivity().getWindow().setSoftInputMode(48);
        if (!igReactDelegate.A09 && !igReactDelegate.A05.hasEnded()) {
            SSW A012 = igReactDelegate.A06.A01();
            Activity activity = fragment.getActivity();
            boolean z = true;
            Activity activity2 = A012.A00;
            if (activity2 != null) {
                if (activity != activity2) {
                    z = false;
                }
                0Sd.A03(z, 002.A0u("Pausing an activity that is not the current activity, this is incorrect! Current activity: ", C51968G9o.A16(activity2), " Paused activity: ", C51968G9o.A16(activity)));
            }
            A012.A03 = null;
            synchronized (A012) {
                Q6H A04 = A012.A04();
                if (A04 != null) {
                    if (A012.A0I == AnonymousClass05K.A00) {
                        A04.A08(A012.A00);
                    } else if (A012.A0I == AnonymousClass05K.A0C) {
                    }
                    A04.A07();
                }
                A012.A0I = AnonymousClass05K.A01;
            }
        }
        if (igReactDelegate.A0D) {
            AnonymousClass2ZP activity3 = fragment.getActivity();
            if (activity3 instanceof AnonymousClass2ZP) {
                activity3.Enj(0);
            }
        }
        C2594141p.A00(fragment.getActivity(), igReactDelegate.A00);
        AnonymousClass0fD.A09(1277653628, A02);
    }

    public final void onResume() {
        int i;
        int A02 = AnonymousClass0fD.A02(1447143849);
        super.onResume();
        IgReactDelegate igReactDelegate = (IgReactDelegate) this.A00;
        if (!igReactDelegate.A09) {
            SSW A012 = igReactDelegate.A06.A01();
            FragmentActivity activity = igReactDelegate.A00.getActivity();
            A012.A03 = igReactDelegate.A04;
            A012.A00 = activity;
            synchronized (A012) {
                Q6H A04 = A012.A04();
                if (A04 != null && (A012.A0I == AnonymousClass05K.A01 || A012.A0I == AnonymousClass05K.A00)) {
                    A04.A08(A012.A00);
                }
                A012.A0I = AnonymousClass05K.A0C;
            }
            Q6H A042 = igReactDelegate.A06.A01().A04();
            if (!igReactDelegate.A0B && A042 != null) {
                IgReactDelegate.RCTViewEventEmitter rCTViewEventEmitter = (IgReactDelegate.RCTViewEventEmitter) A042.A02(IgReactDelegate.RCTViewEventEmitter.class);
                C7372Q9d q9d = igReactDelegate.A03;
                if (q9d != null) {
                    i = q9d.A01;
                } else {
                    i = 0;
                }
                rCTViewEventEmitter.emit("viewDidAppear", Integer.valueOf(i));
            }
        }
        Fragment fragment = igReactDelegate.A00;
        fragment.getActivity().getWindow().setSoftInputMode(16);
        boolean z = fragment.mArguments.getBoolean("IgReactFragment.ARGUMENT_SHOULD_HIDE_MAIN_TAB");
        igReactDelegate.A0D = z;
        if (z) {
            AnonymousClass2ZP activity2 = fragment.getActivity();
            if (activity2 instanceof AnonymousClass2ZP) {
                activity2.Enj(8);
            }
        }
        igReactDelegate.A00 = fragment.getActivity().getRequestedOrientation();
        C2594141p.A00(fragment.getActivity(), fragment.mArguments.getInt("IgReactFragment.ARGUMENT_ORIENTATION"));
        AnonymousClass0fD.A09(-789331928, A02);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = ((IgReactDelegate) this.A00).A01;
        if (bundle2 != null) {
            bundle.putBundle("IgReactFragment.SAVED_RN_BUNDLE", bundle2);
        }
    }

    /* JADX INFO: finally extract failed */
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        super.onViewCreated(view, bundle);
        IgReactDelegate igReactDelegate = (IgReactDelegate) this.A00;
        if (igReactDelegate.A09) {
            IgReactDelegate.A01(igReactDelegate);
        } else if (igReactDelegate.A0B) {
            Fragment fragment = igReactDelegate.A00;
            Bundle bundle3 = fragment.mArguments.getBundle("IgReactFragment.ARGUMENT_INITIAL_PROPS");
            if (bundle3 == null) {
                bundle3 = AnonymousClass7TE.A0a();
            }
            bundle3.putBundle("fragmentSavedInstanceState", igReactDelegate.A01);
            SSW ssw = igReactDelegate.A06.A01;
            if (ssw == null || !ssw.A0K) {
                SpinnerImageView spinnerImageView = new SpinnerImageView(fragment.getContext());
                igReactDelegate.mLoadingIndicator = spinnerImageView;
                spinnerImageView.setImageResource(R.drawable.spinner_large);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                igReactDelegate.mFrameLayout.addView(igReactDelegate.mLoadingIndicator, layoutParams);
                igReactDelegate.A02 = new C12205Sp0(igReactDelegate);
                SSW A012 = igReactDelegate.A06.A01();
                A012.A0D.add(igReactDelegate.A02);
            } else {
                IgReactDelegate.A00(igReactDelegate);
            }
            String string = fragment.mArguments.getString("IgReactFragment.ARGUMENT_APP_KEY");
            C7372Q9d q9d = igReactDelegate.A03;
            SSW A013 = igReactDelegate.A06.A01();
            0fc.A01(8192, "startReactApplication", -84855720);
            try {
                0Sd.A03(DbW.A1a(q9d.A05), "This root view has already been attached to a catalyst instance manager");
                q9d.A05 = A013;
                q9d.A09 = string;
                q9d.A04 = bundle3;
                A013.A05();
                if (C18401Vr3.A00.enableEagerRootViewAttachment()) {
                    if (!q9d.A0C) {
                        DisplayMetrics A0E = AnonymousClass7TF.A0E(q9d.getContext());
                        q9d.A03 = View.MeasureSpec.makeMeasureSpec(A0E.widthPixels, AnonymousClass972.MUTABLE_FLAG_MASK);
                        q9d.A00 = View.MeasureSpec.makeMeasureSpec(A0E.heightPixels, AnonymousClass972.MUTABLE_FLAG_MASK);
                    }
                    C7372Q9d.A00(q9d);
                }
                0fc.A00(8192, 655522556);
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(new T65(igReactDelegate), igReactDelegate.A05), "ig_react_launch_app");
                if (A0e.isSampled()) {
                    if ("FacebookAppRouteHandler".endsWith(string) && (bundle2 = fragment.mArguments.getBundle("IgReactFragment.ARGUMENT_INITIAL_PROPS")) != null && bundle2.containsKey("routeName")) {
                        string = bundle2.getString("routeName");
                    }
                    A0e.AAJ("app_key", string);
                    A0e.Cgf();
                }
            } catch (Throwable th) {
                0fc.A00(8192, -842277342);
                throw th;
            }
        } else {
            SSW ssw2 = igReactDelegate.A06.A01;
            if (ssw2 != null && ssw2.A0K) {
                IgReactDelegate.A00(igReactDelegate);
            }
        }
    }
}
