package X;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.FragmentActivity;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4DH  reason: invalid class name */
public abstract class AnonymousClass4DH extends AnonymousClass4DI implements AnonymousClass0iw, AnonymousClass4D6, AnonymousClass4DJ, AnonymousClass4DK, C60660ix, AnonymousClass4DL, AnonymousClass4DM, AnonymousClass4DN, AnonymousClass4DO, AnonymousClass4DP, AnonymousClass4DQ {
    public static final C227832jz Companion = new Object();
    public static final String KEY_CONTENT_INSETS = "contentInsets";
    public static final String __redex_internal_original_name = "IgFragment";
    public AnonymousClass378 _fragmentVisibilityDetector;
    public final AnonymousClass2k1 analyticsModuleV2Helper = new AnonymousClass2k1();
    public final boolean canShowVoiceMessageBar = true;
    public Rect contentInsets;
    public AnonymousClass2k4 dayNightMode = AnonymousClass2k4.DEFAULT;
    public final MessageQueue.IdleHandler eventDropIdleHandler = new AnonymousClass2k0(this);
    public final C227632je fragmentVisibilityListenerController = new C227632je();
    public final boolean isContainerFragment;
    public final C227622jd lifecycleListenerSet = new C227622jd();
    public final AnonymousClass0eM lifecycleLogger$delegate = AnonymousClass1YB.A00(new C377119Kp(this, 6));
    public final C227842k3 statusBarType = C227842k3.DEFAULT;
    public final AnonymousClass0eM themedContext$delegate = AnonymousClass1YB.A00(new C377119Kp(this, 7));
    public final AnonymousClass2k2 volumeKeyPressController = new AnonymousClass2k2();

    public void addFragmentVisibilityListener(C238693Db r2) {
        0qQ.A0B(r2, 0);
        this.fragmentVisibilityListenerController.addFragmentVisibilityListener(r2);
    }

    public final void addLoggerListener(0k8 r2) {
        0qQ.A0B(r2, 0);
        getLifecycleLogger().A00 = r2;
    }

    public void afterOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, View view) {
        0qQ.A0B(layoutInflater, 0);
        AnonymousClass2kL.A00(getLifecycleLogger(), AnonymousClass05K.A01);
        if (view != null) {
            this.lifecycleListenerSet.A0C(view);
        }
    }

    public void beforeOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        0qQ.A0B(layoutInflater, 0);
        AnonymousClass2kL.A01(getLifecycleLogger(), AnonymousClass05K.A01);
    }

    public final Object getContextAs(Class cls) {
        0qQ.A0B(cls, 0);
        return 0mE.A00(getContext(), cls);
    }

    public abstract AnonymousClass0wW getSession();

    public void onConfigurationChanged(Configuration configuration) {
        0qQ.A0B(configuration, 0);
        AnonymousClass4DH.super.onConfigurationChanged(configuration);
        this.lifecycleListenerSet.A09(configuration);
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return C3253772d.A01(this, i2, z, false);
    }

    public void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        Rect rect = this.contentInsets;
        if (rect != null) {
            bundle.putParcelable(KEY_CONTENT_INSETS, rect);
        }
        this.lifecycleListenerSet.A0A(bundle);
    }

    public void onSetUserVisibleHint(boolean z, boolean z2) {
        AnonymousClass378 r0;
        boolean z3 = false;
        if (z2 != z) {
            z3 = true;
        }
        this.fragmentVisibilityListenerController.A00(this, z);
        if (z3 && (r0 = this._fragmentVisibilityDetector) != null) {
            r0.A00();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        Rect rect;
        0qQ.A0B(view, 0);
        this.lifecycleListenerSet.A0D(view, bundle);
        if (!(bundle == null || (rect = (Rect) bundle.getParcelable(KEY_CONTENT_INSETS)) == null)) {
            this.contentInsets = rect;
        }
        tryToApplyContentInset();
        if (AnonymousClass1YU.A00 != null) {
            C227622jd r3 = this.lifecycleListenerSet;
            FragmentActivity requireActivity = requireActivity();
            AtomicBoolean atomicBoolean = C238713Dd.A00;
            r3.A0E(new C238733Df(new C238723De(requireActivity)));
        }
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setTransitionGroup(true);
        }
        if (!isContainerFragment()) {
            view.post(new C238743Dg(view, this));
        }
        AnonymousClass0wW session = getSession();
        if (session != null) {
            AnonymousClass1Nd.A00(session).A05(new C238753Dh(this));
        }
    }

    public boolean onVolumeKeyPressed(AnonymousClass5FQ r5, KeyEvent keyEvent) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(keyEvent, 1);
        for (AnonymousClass4DM r1 : getChildFragmentManager().A0U.A04()) {
            if ((r1 instanceof AnonymousClass4DM) && r1.onVolumeKeyPressed(r5, keyEvent)) {
                return true;
            }
        }
        return this.volumeKeyPressController.onVolumeKeyPressed(r5, keyEvent);
    }

    public final void registerLifecycleListenerSet(C227622jd r4) {
        0qQ.A0B(r4, 0);
        C227622jd r2 = this.lifecycleListenerSet;
        Iterator it = r4.A00.iterator();
        while (it.hasNext()) {
            r2.A0E((C252243on) it.next());
        }
    }

    public void removeFragmentVisibilityListener(C238693Db r2) {
        0qQ.A0B(r2, 0);
        this.fragmentVisibilityListenerController.removeFragmentVisibilityListener(r2);
    }

    public final Object requireContextAs(Class cls) {
        0qQ.A0B(cls, 0);
        Object A00 = 0mE.A00(getContext(), cls);
        if (A00 != null) {
            return A00;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.07Z, androidx.fragment.app.Fragment, X.4DH] */
    public final int scheduleAndGetLoaderId(AnonymousClass11X r3) {
        0qQ.A0B(r3, 0);
        return 1ES.A00(requireContext(), AnonymousClass07i.A00(this), r3);
    }

    public final void setDayNightMode(AnonymousClass2k4 r2) {
        0qQ.A0B(r2, 0);
        this.dayNightMode = r2;
    }

    public final boolean setModuleNameV2(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass2k1 r1 = this.analyticsModuleV2Helper;
        if (r1.A00 != null) {
            return false;
        }
        r1.A00 = str;
        return true;
    }

    public final void unregisterLifecycleListenerSet(C227622jd r6) {
        0qQ.A0B(r6, 0);
        C227622jd r3 = this.lifecycleListenerSet;
        Iterator it = r6.A00.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            0qQ.A0B(next, 0);
            r3.A00.remove(next);
        }
    }

    public final boolean updateModuleNameV2_USE_WITH_CAUTION(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass0wW session = getSession();
        if (session == null) {
            return false;
        }
        AnonymousClass2k1 r1 = this.analyticsModuleV2Helper;
        if (!(this instanceof C60580id)) {
            return false;
        }
        r1.A00 = str;
        if (isResumed() && this.mUserVisibleHint) {
            C71342cb.A00(session).A0E("dynamic_analytics_module", this);
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final AnonymousClass2kL getLifecycleLogger() {
        return (AnonymousClass2kL) this.lifecycleLogger$delegate.getValue();
    }

    public void afterOnDestroy() {
        this.lifecycleListenerSet.A02();
    }

    public void afterOnDestroyView() {
        this.lifecycleListenerSet.A03();
    }

    public void afterOnPause() {
        this.lifecycleListenerSet.A04();
        AnonymousClass378 r0 = this._fragmentVisibilityDetector;
        if (r0 != null) {
            r0.A00();
        }
        try {
            C227642jf.A02(this).getValue();
            AnonymousClass0wW session = getSession();
            if (session != null) {
                C71342cb.A00(session).A0B = getModuleName();
            }
        } catch (IllegalStateException e) {
            0KC.A0F(getModuleName(), " failed to get user session", e);
        }
    }

    public void afterOnResume() {
        0fh.A01("IgFragment.afterOnResume", 2080887718);
        try {
            this.lifecycleListenerSet.A05();
            AnonymousClass378 r0 = this._fragmentVisibilityDetector;
            if (r0 != null) {
                r0.A00();
            }
            AnonymousClass2kL.A00(getLifecycleLogger(), AnonymousClass05K.A0Y);
        } finally {
            0fh.A00(518475348);
        }
    }

    public void afterOnStart() {
        this.lifecycleListenerSet.A06();
        AnonymousClass2kL.A00(getLifecycleLogger(), AnonymousClass05K.A0N);
    }

    public void afterOnStop() {
        this.lifecycleListenerSet.A07();
    }

    public void beforeOnDestroyView() {
        C227622jd r3 = this.lifecycleListenerSet;
        View view = this.mView;
        int size = r3.A00.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                C252243on A00 = C227622jd.A00(r3, size);
                if (A00 != null) {
                    A00.ADC(view);
                }
                if (i >= 0) {
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    public boolean getCanShowVoiceMessageBar() {
        return this.canShowVoiceMessageBar;
    }

    public final AnonymousClass2k4 getDayNightMode() {
        return this.dayNightMode;
    }

    public AnonymousClass378 getFragmentVisibilityDetector() {
        return this._fragmentVisibilityDetector;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        LayoutInflater from;
        if (this.dayNightMode == AnonymousClass2k4.DEFAULT) {
            from = super.getLayoutInflater(bundle);
        } else {
            from = LayoutInflater.from(getThemedContext());
        }
        0qQ.A07(from);
        return from;
    }

    public String getModuleNameV2() {
        return this.analyticsModuleV2Helper.A00;
    }

    public C227842k3 getStatusBarType() {
        return this.statusBarType;
    }

    public Context getThemedContext() {
        return (Context) this.themedContext$delegate.getValue();
    }

    public AnonymousClass2k2 getVolumeKeyPressController() {
        return this.volumeKeyPressController;
    }

    public boolean isContainerFragment() {
        return this.isContainerFragment;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.lifecycleListenerSet.A08(i, i2, intent);
    }

    public void onHiddenChanged(boolean z) {
        AnonymousClass378 r0 = this._fragmentVisibilityDetector;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void registerLifecycleListener(C252243on r2) {
        if (r2 != null) {
            this.lifecycleListenerSet.A0E(r2);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, androidx.fragment.app.Fragment, X.4DH] */
    public void schedule(AnonymousClass11X r4) {
        if (r4 == null) {
            return;
        }
        if (this.mFragmentManager == null) {
            0wb.A03("IG_FRAGMENT_SCHEDULE", 002.A0g("Can't schedule task: ", r4.getName(), " on detached fragment"));
        } else {
            1ES.A00(requireContext(), AnonymousClass07i.A00(this), r4);
        }
    }

    public final void setContentInset(int i, int i2, int i3, int i4) {
        this.contentInsets = new Rect(i, i2, i3, i4);
        tryToApplyContentInset();
    }

    public final void tryToApplyContentInset() {
        Rect rect;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = this.mView;
        if (view != null && (rect = this.contentInsets) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMargins(rect.left, rect.top, rect.right, rect.bottom);
            }
        }
    }

    public void unregisterLifecycleListener(C252243on r2) {
        if (r2 != null) {
            this.lifecycleListenerSet.A00.remove(r2);
        }
    }

    public void afterOnCreate(Bundle bundle) {
        AnonymousClass2kL.A00(getLifecycleLogger(), AnonymousClass05K.A00);
        this.lifecycleListenerSet.A01();
        AnonymousClass0wW session = getSession();
        if (session != null) {
            2cc A00 = C71342cb.A00(session);
            C3018560i r1 = A00.A01;
            if (r1 != null) {
                r1.A00 = getModuleName();
            }
            AnonymousClass378 r0 = new AnonymousClass378(this);
            r0.A01(A00);
            this._fragmentVisibilityDetector = r0;
        }
    }

    public void beforeOnCreate(Bundle bundle) {
        AnonymousClass2kL.A01(getLifecycleLogger(), AnonymousClass05K.A00);
        Looper.myQueue().addIdleHandler(this.eventDropIdleHandler);
    }

    public void beforeOnResume() {
        AnonymousClass2kL.A01(getLifecycleLogger(), AnonymousClass05K.A0Y);
        Looper.myQueue().removeIdleHandler(this.eventDropIdleHandler);
    }

    public void beforeOnStart() {
        AnonymousClass2kL.A01(getLifecycleLogger(), AnonymousClass05K.A0N);
    }

    public Activity getRootActivity() {
        Activity activity;
        Context context = getContext();
        if (!(context instanceof Activity) || (activity = (Activity) context) == null) {
            return null;
        }
        Activity parent = activity.getParent();
        if (parent != null) {
            return parent;
        }
        return activity;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return C3253772d.A00(this, i2, z);
    }

    public void onDestroy() {
        int A02 = AnonymousClass0fD.A02(-799703426);
        AnonymousClass4DH.super.onDestroy();
        C305926Kc.A00(this);
        AnonymousClass0fD.A09(-1092462541, A02);
    }

    public void onDestroyView() {
        View view;
        int A02 = AnonymousClass0fD.A02(-329702987);
        AnonymousClass4DH.super.onDestroyView();
        AnonymousClass0wW session = getSession();
        if (!(session == null || !0qQ.A0K(Boolean.valueOf(182.A06(0Tu.A05, session, 36311057974690219L)), true) || (view = this.mView) == null)) {
            C305926Kc.A01(view, 0se.A0M(new 0eP("additional_logged_classname", getClass().getName())));
        }
        AnonymousClass0fD.A09(1163185354, A02);
    }

    public void onResume() {
        int A02 = AnonymousClass0fD.A02(-833451044);
        AnonymousClass4DH.super.onResume();
        2db.A05(requireActivity(), getStatusBarType());
        AnonymousClass0fD.A09(-241399534, A02);
    }

    public void onViewStateRestored(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1337981550);
        AnonymousClass4DH.super.onViewStateRestored(bundle);
        this.lifecycleListenerSet.A0B(bundle);
        AnonymousClass0fD.A09(-982976163, A02);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.07Z, X.4DH] */
    public final void stopLoader(int i) {
        AnonymousClass07i.A00(this).A03(i);
    }

    public void schedule(AnonymousClass11X r1, int i, int i2, boolean z, boolean z2) {
        schedule(r1);
    }
}
