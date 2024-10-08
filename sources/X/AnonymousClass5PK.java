package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import com.instagram.android.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5PK  reason: invalid class name */
public abstract class AnonymousClass5PK {
    public static final Map A00 = new LinkedHashMap();

    /* JADX WARNING: type inference failed for: r6v0, types: [X.0rm, java.lang.Object] */
    public static final Recomposer A03(View view, C262094Cc r9) {
        PausableMonotonicFrameClock pausableMonotonicFrameClock;
        AnonymousClass07V lifecycle;
        C262094Cc r0;
        if (r9.get(C262104Cd.A00) == null || r9.get(AnonymousClass5PR.A00) == null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                r0 = (C262094Cc) AnonymousClass5PM.A0B.getValue();
            } else {
                r0 = (C262094Cc) AnonymousClass5PM.A0A.get();
                if (r0 == null) {
                    throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                }
            }
            r9 = r0.plus(r9);
        }
        AnonymousClass5PR r02 = (AnonymousClass5PR) r9.get(AnonymousClass5PR.A00);
        PausableMonotonicFrameClock pausableMonotonicFrameClock2 = null;
        if (r02 != null) {
            pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(r02);
            AnonymousClass5PU r2 = pausableMonotonicFrameClock2.A00;
            synchronized (r2.A03) {
                r2.A02 = false;
            }
        }
        ? obj = new Object();
        C262094Cc r1 = r9.get(AnonymousClass5PV.A00);
        if (r1 == null) {
            r1 = new AnonymousClass5PX();
            obj.A00 = r1;
        }
        if (pausableMonotonicFrameClock2 != null) {
            pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
        } else {
            pausableMonotonicFrameClock = 19B.A00;
        }
        C262094Cc plus = r9.plus(pausableMonotonicFrameClock).plus(r1);
        Recomposer recomposer = new Recomposer(plus);
        synchronized (recomposer.A0D) {
            recomposer.A07 = true;
        }
        AnonymousClass19S A02 = 19E.A02(plus);
        View view2 = view;
        AnonymousClass07Z A002 = C71362ch.A00(view);
        if (A002 == null || (lifecycle = A002.getLifecycle()) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewTreeLifecycleOwner not found from ");
            sb.append(view);
            I2E.A02(sb.toString());
            throw AnonymousClass00P.createAndThrow();
        }
        view.addOnAttachStateChangeListener(new C285065Pn(view, recomposer));
        lifecycle.A09(new C285075Po(view2, pausableMonotonicFrameClock2, recomposer, obj, A02));
        return recomposer;
    }

    public static final AnonymousClass5PL A00(View view) {
        AnonymousClass5PL A01 = A01(view);
        if (A01 == null) {
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                A01 = A01((View) parent);
                parent = parent.getParent();
                if (A01 != null) {
                    break;
                }
            }
        }
        return A01;
    }

    public static final AnonymousClass5PL A01(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AnonymousClass5PL) {
            return (AnonymousClass5PL) tag;
        }
        return null;
    }

    public static final Recomposer A02(View view) {
        if (!view.isAttachedToWindow()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot locate windowRecomposer; View ");
            sb.append(view);
            sb.append(" is not attached to a window");
            I2E.A01(sb.toString());
            throw AnonymousClass00P.createAndThrow();
        }
        ViewParent viewParent = view.getParent();
        while (viewParent instanceof View) {
            View view2 = (View) viewParent;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            viewParent = view2.getParent();
        }
        AnonymousClass5PL A01 = A01(view);
        if (A01 == null) {
            Recomposer A03 = A03(view, 19B.A00);
            view.setTag(R.id.androidx_compose_ui_view_composition_context, A03);
            C67391tE r4 = C67391tE.A00;
            Handler handler = view.getHandler();
            Choreographer choreographer = AnonymousClass131.choreographer;
            view.addOnAttachStateChangeListener(new C285145Px(1Eo.A03(AnonymousClass05K.A00, new 132(handler, "windowRecomposer cleanup", false).A01, new MH2((Object) view, (Object) A03, (AnonymousClass4D7) null, 20), r4)));
            return A03;
        } else if (A01 instanceof Recomposer) {
            return (Recomposer) A01;
        } else {
            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
        }
    }
}
