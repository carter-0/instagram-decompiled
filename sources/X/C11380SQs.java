package X;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.SQs  reason: case insensitive filesystem */
public final class C11380SQs {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public View.OnAttachStateChangeListener A03;
    public View A04;
    public View A05;
    public int A06;
    public WindowManager A07;
    public final Set A08 = new CopyOnWriteArraySet();
    public final int[] A09 = new int[2];
    public final ViewTreeObserver.OnGlobalLayoutListener A0A = new C11512SbZ(this, 5);
    public final AnonymousClass03Q A0B = new C11611SdE(this, 2);

    public static final void A01(C11380SQs sQs) {
        WindowManager windowManager;
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        View view = sQs.A05;
        if (!(view == null || (onAttachStateChangeListener = sQs.A03) == null)) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        sQs.A03 = null;
        View view2 = sQs.A04;
        if (view2 != null) {
            view2.getViewTreeObserver().removeOnGlobalLayoutListener(sQs.A0A);
            AnonymousClass03j.A00(view2, (AnonymousClass03Q) null);
            if (view2.isAttachedToWindow() && (windowManager = sQs.A07) != null) {
                windowManager.removeView(view2);
            }
            sQs.A07 = null;
            sQs.A04 = null;
            sQs.A06 = 0;
        }
    }

    public static final void A02(C11380SQs sQs, int i) {
        for (C13611Tdd DMr : sQs.A08) {
            DMr.DMr(i, AnonymousClass7TF.A1S(sQs.A06, 48));
        }
    }

    public C11380SQs(Fragment fragment, boolean z) {
        if (z || C9666Rek.A00(fragment.getActivity())) {
            fragment.mLifecycleRegistry.A09(new C11626SdU(fragment, this, z));
        }
    }

    public static final void A00(Activity activity, C11380SQs sQs) {
        A01(sQs);
        View view = sQs.A05;
        if (view != null) {
            IBinder windowToken = view.getWindowToken();
            if (!activity.isFinishing() && !activity.isDestroyed() && windowToken != null && activity.getWindow() != null) {
                int i = activity.getWindow().getAttributes().type;
                if (i < 1000 || i > 1999) {
                    int i2 = 0;
                    if (activity.getWindow() != null) {
                        i2 = activity.getWindow().getAttributes().softInputMode & 240;
                    }
                    sQs.A06 = i2;
                    Object systemService = activity.getSystemService("window");
                    0qQ.A0C(systemService, AnonymousClass000.A00(14));
                    sQs.A07 = (WindowManager) systemService;
                    sQs.A04 = new View(activity);
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1003, 131096, -3);
                    layoutParams.softInputMode = 16;
                    layoutParams.token = windowToken;
                    try {
                        WindowManager windowManager = sQs.A07;
                        if (windowManager != null) {
                            windowManager.addView(sQs.A04, layoutParams);
                            View view2 = sQs.A04;
                            if (view2 != null) {
                                view2.getViewTreeObserver().addOnGlobalLayoutListener(sQs.A0A);
                                AnonymousClass03j.A00(view2, sQs.A0B);
                                return;
                            }
                            return;
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    } catch (WindowManager.BadTokenException unused) {
                        sQs.A07 = null;
                        sQs.A04 = null;
                        sQs.A06 = 0;
                    }
                }
            }
        }
    }
}
