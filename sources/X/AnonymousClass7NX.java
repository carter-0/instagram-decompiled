package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: X.7NX  reason: invalid class name */
public final class AnonymousClass7NX implements AnonymousClass7NK {
    public final OvershootInterpolator A00 = new OvershootInterpolator();
    public final DecelerateInterpolator A01 = new DecelerateInterpolator();
    public final AnonymousClass5FV A02 = AnonymousClass5FV.Celebration;

    public final void A00(C39752A7s a7s, boolean z) {
        C14669U0p u0p;
        View view;
        C39752A7s a7s2 = a7s;
        ViewGroup viewGroup = a7s2.A05;
        if (viewGroup != null) {
            AnonymousClass763 r0 = a7s2.A07;
            Drawable drawable = null;
            if (r0 != null) {
                drawable = r0.A00;
            }
            if ((drawable instanceof C14669U0p) && (u0p = (C14669U0p) drawable) != null && (view = a7s2.A04) != null) {
                Context context = viewGroup.getContext();
                viewGroup.setVisibility(0);
                0qQ.A07(context);
                U3J u3j = new U3J(context);
                viewGroup.addView(u3j);
                u3j.setListener(new C19092WKz(viewGroup, u3j));
                u3j.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                DecelerateInterpolator decelerateInterpolator = this.A01;
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.95f, 1.0f, 0.95f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setFillAfter(true);
                scaleAnimation.setDuration(400);
                scaleAnimation.setInterpolator(decelerateInterpolator);
                View view2 = view;
                Context context2 = context;
                scaleAnimation.setAnimationListener(new WCW(context2, view2, u0p, this, u3j, z));
                if (z) {
                    Object systemService = context.getSystemService("vibrator");
                    0qQ.A0C(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                    Vibrator vibrator = (Vibrator) systemService;
                    if (vibrator.hasAmplitudeControl()) {
                        vibrator.vibrate(VibrationEffect.createOneShot(300, 5));
                    }
                }
                view.startAnimation(scaleAnimation);
            }
        }
    }

    public final void ADP(C39752A7s a7s, AnonymousClass7NZ r8, String str, boolean z) {
        0qQ.A0B(a7s, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(r8, 2);
        AnonymousClass763 r3 = a7s.A07;
        View view = a7s.A04;
        if (view != null) {
            Context context = view.getContext();
            0qQ.A07(context);
            C14669U0p u0p = new C14669U0p(context);
            float f = r8.A00;
            if (u0p.A00 != f) {
                u0p.A00 = f;
                u0p.A05 = true;
                u0p.invalidateSelf();
            }
            if (!0qQ.A0K(u0p.A03, str)) {
                u0p.A03 = str;
                u0p.A0G.clear();
                u0p.invalidateSelf();
            }
            u0p.A0C.removeMessages(1);
            if (!u0p.A04) {
                u0p.A04 = true;
            }
            if (r3 != null) {
                r3.A01(u0p);
            }
        }
        if (!z) {
            A00(a7s, false);
        }
    }

    public final C39752A7s CrU(Context context, ShapeDrawable shapeDrawable, View view, ViewGroup viewGroup, ImageView imageView, AnonymousClass763 r15) {
        0qQ.A0B(context, 0);
        return new C39752A7s(shapeDrawable, (View) null, (View) null, (View) null, view, viewGroup, (ImageView) null, r15);
    }

    public final boolean D27(C39752A7s a7s, AnonymousClass7NZ r3, String str, boolean z) {
        0qQ.A0B(a7s, 0);
        A00(a7s, true);
        return true;
    }

    public final void FIO(C39752A7s a7s, String str) {
        C14669U0p u0p;
        0qQ.A0B(a7s, 0);
        AnonymousClass763 r0 = a7s.A07;
        Drawable drawable = null;
        if (r0 != null) {
            drawable = r0.A00;
        }
        if ((drawable instanceof C14669U0p) && (u0p = (C14669U0p) drawable) != null) {
            u0p.A0C.sendEmptyMessage(1);
        }
    }

    public final AnonymousClass5FV CAI() {
        return this.A02;
    }

    public final /* synthetic */ boolean CQX(String str) {
        return false;
    }
}
