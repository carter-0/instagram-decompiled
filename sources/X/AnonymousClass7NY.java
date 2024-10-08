package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.webrtc.CameraCapturer;

/* renamed from: X.7NY  reason: invalid class name */
public final class AnonymousClass7NY implements AnonymousClass7NK {
    public final AccelerateInterpolator A00 = new AccelerateInterpolator();
    public final DecelerateInterpolator A01 = new DecelerateInterpolator();
    public final AnonymousClass7NA A02;
    public final AnonymousClass5FV A03 = AnonymousClass5FV.Fire;

    public final boolean A00(C39752A7s a7s, boolean z, boolean z2) {
        Object obj;
        C16491Uvm uvm;
        C226492gu r1;
        C226492gu r0;
        C71532dv r12;
        C226492gu r13;
        C39752A7s a7s2 = a7s;
        View view = a7s2.A04;
        0qQ.A0A(view);
        View view2 = a7s2.A01;
        0qQ.A0C(view2, "null cannot be cast to non-null type com.facebook.xac.powerups.fire.FireUnderlayWithBigFlareView");
        U3F u3f = (U3F) view2;
        AnonymousClass763 r02 = a7s2.A07;
        TransitionDrawable transitionDrawable = null;
        if (r02 != null) {
            obj = r02.A00;
        } else {
            obj = null;
        }
        if (obj instanceof TransitionDrawable) {
            transitionDrawable = (TransitionDrawable) obj;
        }
        U1L u1l = u3f.A00;
        if (u1l.getBounds().width() < C18092VlM.A00(u1l.A0A, 50.0f)) {
            uvm = C16491Uvm.SMALL;
        } else {
            uvm = C16491Uvm.LARGE;
        }
        if (u1l.A02 != uvm) {
            u1l.A02 = uvm;
            Drawable drawable = u1l.A01;
            if (drawable != null) {
                if ((drawable instanceof C226492gu) && (r13 = (C226492gu) drawable) != null) {
                    r13.stop();
                }
                u1l.A01 = null;
                u1l.invalidateSelf();
            }
            u1l.A07 = false;
        }
        Drawable drawable2 = u1l.A01;
        if (drawable2 == null) {
            if (!u1l.A07) {
                u1l.A06 = true;
                AnonymousClass7NA r2 = u1l.A03;
                if (r2 != null) {
                    C16491Uvm uvm2 = u1l.A02;
                    C17765Vfc vfc = u1l.A0C;
                    AnonymousClass7N9 r22 = (AnonymousClass7N9) r2;
                    synchronized (r22) {
                        0qQ.A0B(uvm2, 0);
                        0qQ.A0B(vfc, 1);
                        Map map = r22.A03;
                        Object obj2 = map.get(uvm2);
                        if (obj2 == null) {
                            obj2 = new C17417VUw();
                            map.put(uvm2, obj2);
                        }
                        C17417VUw vUw = (C17417VUw) obj2;
                        WeakReference weakReference = vUw.A00;
                        if (weakReference == null || (r12 = (C71532dv) weakReference.get()) == null) {
                            vUw.A01.add(new WeakReference(vfc));
                            if (!vUw.A02) {
                                vUw.A02 = true;
                                r22.A05.execute(new C20167WmR(uvm2, r22));
                            }
                        } else {
                            vfc.A00(new AnonymousClass61R(r12), uvm2);
                        }
                    }
                }
            }
            return false;
        } else if ((drawable2 instanceof C226492gu) && (r0 = (C226492gu) drawable2) != null && r0.isPlaying()) {
            return false;
        } else {
            if ((drawable2 instanceof C226492gu) && (r1 = (C226492gu) drawable2) != null) {
                r1.E2p();
            }
        }
        DecelerateInterpolator decelerateInterpolator = this.A01;
        0qQ.A0B(decelerateInterpolator, 3);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.05f, 1.0f, 1.05f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setDuration(500);
        scaleAnimation.setInterpolator(decelerateInterpolator);
        scaleAnimation.setAnimationListener(new C71455Oku(transitionDrawable, view, this));
        if (transitionDrawable != null) {
            transitionDrawable.startTransition(CameraCapturer.OPEN_CAMERA_DELAY_MS);
        }
        view.startAnimation(scaleAnimation);
        if (!z) {
            return true;
        }
        Context context = view.getContext();
        0qQ.A07(context);
        Object systemService = context.getSystemService("vibrator");
        0qQ.A0C(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        Vibrator vibrator = (Vibrator) systemService;
        long[] jArr = new long[20];
        for (int i = 0; i < 20; i++) {
            jArr[i] = 50;
        }
        if (vibrator.hasAmplitudeControl()) {
            vibrator.vibrate(VibrationEffect.createWaveform(jArr, new int[]{7, 10, 7, 10, 15, 20, 15, 20, 30, 35, 20, 15, 20, 15, 10, 15, 10, 15, 10, 7}, -1));
            return true;
        } else if (z2) {
            vibrator.vibrate(jArr, -1);
            return true;
        } else {
            vibrator.vibrate(50);
            return true;
        }
    }

    public final void ADP(C39752A7s a7s, AnonymousClass7NZ r9, String str, boolean z) {
        0qQ.A0B(a7s, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(r9, 2);
        int A012 = AnonymousClass1GB.A01(r9.A00);
        View view = a7s.A02;
        0qQ.A0C(view, "null cannot be cast to non-null type com.facebook.xac.powerups.fire.FireOverlayView");
        ((U3D) view).setCornerRadiusPx(A012);
        View view2 = a7s.A01;
        0qQ.A0C(view2, "null cannot be cast to non-null type com.facebook.xac.powerups.fire.FireUnderlayWithBigFlareView");
        U3F u3f = (U3F) view2;
        u3f.setTargetId(str);
        u3f.setCornerRadiusPx(A012);
        AnonymousClass763 r5 = a7s.A07;
        float f = r9.A00;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{Color.parseColor("#FF8600"), Color.parseColor("#FFA800")});
        gradientDrawable.setCornerRadius(f);
        float f2 = r9.A00;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{Color.parseColor("#FF6C00"), Color.parseColor("#FFE27D")});
        gradientDrawable2.setCornerRadius(f2);
        TransitionDrawable transitionDrawable = new TransitionDrawable(new GradientDrawable[]{gradientDrawable, gradientDrawable2});
        if (r5 != null) {
            r5.A01(transitionDrawable);
        }
        if (!z) {
            A00(a7s, false, false);
        }
    }

    public final C39752A7s CrU(Context context, ShapeDrawable shapeDrawable, View view, ViewGroup viewGroup, ImageView imageView, AnonymousClass763 r15) {
        0qQ.A0B(context, 0);
        U3F u3f = new U3F(context, new U1F(context));
        u3f.setFlareDrawableFactory(this.A02);
        return new C39752A7s(shapeDrawable, u3f, new U3D(context, new U1F(context)), (View) null, view, viewGroup, (ImageView) null, r15);
    }

    public final boolean D27(C39752A7s a7s, AnonymousClass7NZ r3, String str, boolean z) {
        0qQ.A0B(a7s, 0);
        return A00(a7s, true, z);
    }

    public final /* synthetic */ void FIO(C39752A7s a7s, String str) {
    }

    public final AnonymousClass5FV CAI() {
        return this.A03;
    }

    public AnonymousClass7NY(AnonymousClass7NA r2) {
        this.A02 = r2;
    }

    public final /* synthetic */ boolean CQX(String str) {
        return false;
    }
}
