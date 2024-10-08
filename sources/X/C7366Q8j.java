package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* renamed from: X.Q8j  reason: case insensitive filesystem */
public final class C7366Q8j extends ViewGroup implements C13773Tgo {
    public Dialog A00;
    public DialogInterface.OnShowListener A01;
    public C13438TaR A02;
    public boolean A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C7844QbS A08;

    public final void addChildrenForAccessibility(ArrayList arrayList) {
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        0qQ.A0B(viewStructure, 0);
        this.A08.dispatchProvideStructure(viewStructure);
    }

    public final void onHostPause() {
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    private final void A00() {
        C11474Sad sad;
        Dialog dialog = this.A00;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                Activity currentActivity = getCurrentActivity();
                if (currentActivity != null && !currentActivity.isFinishing() && window.isActive()) {
                    Window window2 = currentActivity.getWindow();
                    if (window2 != null) {
                        if ((window2.getAttributes().flags & 1024) != 0) {
                            window.addFlags(1024);
                        } else {
                            window.clearFlags(1024);
                        }
                    }
                    boolean z = this.A07;
                    View decorView = window.getDecorView();
                    if (z) {
                        sad = C11474Sad.A00;
                    } else {
                        sad = null;
                    }
                    decorView.setOnApplyWindowInsetsListener(sad);
                    window.getDecorView().requestApplyInsets();
                    if (this.A03) {
                        window.clearFlags(2);
                        return;
                    }
                    window.setDimAmount(0.5f);
                    window.setFlags(2, 2);
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0z("dialog must have window when we call updateProperties");
        }
        throw AnonymousClass7TE.A0z("dialog must exist when we call updateProperties");
    }

    public static final void A01(C7366Q8j q8j) {
        ViewGroup viewGroup;
        Context context;
        Dialog dialog = q8j.A00;
        if (dialog != null) {
            if (dialog.isShowing()) {
                Context context2 = dialog.getContext();
                Class<Activity> cls = Activity.class;
                while (true) {
                    Context context3 = context2;
                    if (cls.isInstance(context2)) {
                        context = context2;
                        break;
                    }
                    context = null;
                    if (context2 instanceof ContextWrapper) {
                        context2 = ((ContextWrapper) context2).getBaseContext();
                        if (context3 == context2) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                Activity activity = (Activity) context;
                if (activity == null || !activity.isFinishing()) {
                    dialog.dismiss();
                }
            }
            q8j.A00 = null;
            q8j.A05 = true;
            ViewParent parent = q8j.A08.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                viewGroup.removeViewAt(0);
            }
        }
    }

    public final void A02() {
        int i;
        Context context;
        Window window;
        if (this.A05) {
            A01(this);
            this.A05 = false;
            String str = this.A04;
            if (0qQ.A0K(str, "fade")) {
                i = 2132018365;
            } else {
                boolean A0K = 0qQ.A0K(str, "slide");
                i = 2132018364;
                if (A0K) {
                    i = 2132018366;
                }
            }
            Activity currentActivity = getCurrentActivity();
            if (currentActivity != null) {
                context = currentActivity;
            } else {
                context = getContext();
            }
            Dialog dialog = new Dialog(context, i);
            this.A00 = dialog;
            Window window2 = dialog.getWindow();
            window2.getClass();
            window2.setFlags(8, 8);
            dialog.setContentView(getContentView());
            A00();
            dialog.setOnShowListener(this.A01);
            dialog.setOnKeyListener(new SVJ(this, 0));
            Window window3 = dialog.getWindow();
            if (window3 != null) {
                window3.setSoftInputMode(16);
            }
            if (this.A06 && (window = dialog.getWindow()) != null) {
                window.addFlags(16777216);
            }
            if (currentActivity != null && !currentActivity.isFinishing()) {
                AnonymousClass0fN.A00(dialog);
                Activity currentActivity2 = getCurrentActivity();
                if (currentActivity2 != null) {
                    Dialog dialog2 = this.A00;
                    if (dialog2 != null) {
                        Window window4 = dialog2.getWindow();
                        if (window4 != null) {
                            Window window5 = currentActivity2.getWindow();
                            if (Build.VERSION.SDK_INT > 30) {
                                WindowInsetsController insetsController = window5.getInsetsController();
                                if (insetsController != null) {
                                    int systemBarsAppearance = insetsController.getSystemBarsAppearance() & 8;
                                    WindowInsetsController insetsController2 = window4.getInsetsController();
                                    if (insetsController2 != null) {
                                        insetsController2.setSystemBarsAppearance(systemBarsAppearance, 8);
                                    }
                                } else {
                                    throw AnonymousClass7TE.A0y();
                                }
                            } else {
                                window4.getDecorView().setSystemUiVisibility(window5.getDecorView().getSystemUiVisibility());
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("dialog must have window when we call updateProperties");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("dialog must exist when we call updateProperties");
                    }
                }
                Window window6 = dialog.getWindow();
                if (window6 != null) {
                    window6.clearFlags(8);
                    return;
                }
                return;
            }
            return;
        }
        A00();
    }

    public final void addView(View view, int i) {
        this.A08.addView(view, i);
    }

    public final String getAnimationType() {
        return this.A04;
    }

    public final View getChildAt(int i) {
        return this.A08.getChildAt(i);
    }

    public int getChildCount() {
        return this.A08.getChildCount();
    }

    public final Dialog getDialog() {
        return this.A00;
    }

    public final C20877X2e getEventDispatcher() {
        return this.A08.A03;
    }

    public final boolean getHardwareAccelerated() {
        return this.A06;
    }

    public final C13438TaR getOnRequestCloseListener() {
        return this.A02;
    }

    public final DialogInterface.OnShowListener getOnShowListener() {
        return this.A01;
    }

    public final C20831X0g getStateWrapper() {
        return null;
    }

    public final boolean getStatusBarTranslucent() {
        return this.A07;
    }

    public final boolean getTransparent() {
        return this.A03;
    }

    public final void removeView(View view) {
        if (view != null) {
            this.A08.removeView(view);
        }
    }

    public final void removeViewAt(int i) {
        C7844QbS qbS = this.A08;
        qbS.removeView(qbS.getChildAt(i));
    }

    public final void setAnimationType(String str) {
        this.A04 = str;
        this.A05 = true;
    }

    public final void setEventDispatcher(C20877X2e x2e) {
        this.A08.A03 = x2e;
    }

    public final void setHardwareAccelerated(boolean z) {
        this.A06 = z;
        this.A05 = true;
    }

    public final void setOnRequestCloseListener(C13438TaR taR) {
        this.A02 = taR;
    }

    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.A01 = onShowListener;
    }

    public final void setStateWrapper(C20831X0g x0g) {
        this.A08.A02 = x0g;
    }

    public final void setStatusBarTranslucent(boolean z) {
        this.A07 = z;
        this.A05 = true;
    }

    public final void setTransparent(boolean z) {
        this.A03 = z;
    }

    public C7366Q8j(QZL qzl) {
        super(qzl);
        qzl.A09(this);
        this.A08 = new C7844QbS(qzl);
    }

    private final View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.A08);
        return frameLayout;
    }

    private final Activity getCurrentActivity() {
        Context context = getContext();
        0qQ.A0C(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        return ((Q6H) context).A00();
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-1638196554);
        super.onDetachedFromWindow();
        A01(this);
        AnonymousClass0fD.A0D(618305628, A062);
    }

    public final void onHostDestroy() {
        Context context = getContext();
        0qQ.A0C(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((Q6H) context).A0A(this);
        A01(this);
    }

    public final void onHostResume() {
        A02();
    }

    public void setId(int i) {
        super.setId(i);
        this.A08.setId(i);
    }
}
