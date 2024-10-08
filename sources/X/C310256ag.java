package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6ag  reason: invalid class name and case insensitive filesystem */
public final class C310256ag {
    public AnonymousClass61R A00;
    public String A01;
    public float A02 = 1.0f;
    public float A03 = 1.0f;
    public ImageView A04;
    public final Context A05;
    public final Map A06 = new HashMap();
    public final Set A07 = new HashSet();
    public final UserSession A08;

    public C310256ag(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A05 = context;
        this.A08 = userSession;
    }

    public final void A03(Animator.AnimatorListener animatorListener, View view) {
        Set set = this.A07;
        if (!set.contains(view)) {
            set.add(view);
            this.A02 = view.getScaleX();
            this.A03 = view.getScaleY();
            ObjectAnimator A002 = A00(view, "scaleX", true);
            ObjectAnimator A003 = A00(view, "scaleY", true);
            ObjectAnimator A004 = A00(view, "scaleX", false);
            ObjectAnimator A005 = A00(view, "scaleY", false);
            float rotation = view.getRotation();
            float f = 0.0f + rotation;
            float f2 = -5.0f + rotation;
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, "rotation", new float[]{f, f2, rotation + 5.0f, f2, f}).setDuration(500);
            0qQ.A07(duration);
            duration.setInterpolator(new AccelerateInterpolator());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(A002).with(A003).with(duration);
            animatorSet.play(A004).with(A005).after(A002);
            animatorSet.addListener(animatorListener);
            animatorSet.addListener(new FHK(view, this));
            animatorSet.start();
            this.A06.put(view, animatorSet);
        }
    }

    public final void A04(Animator.AnimatorListener animatorListener, View view, boolean z, boolean z2) {
        long j;
        View view2 = view;
        0qQ.A0B(view, 0);
        Set set = this.A07;
        if (!set.contains(view)) {
            set.add(view);
            this.A02 = view.getScaleX();
            this.A03 = view.getScaleY();
            ObjectAnimator A002 = A00(view, "scaleX", true);
            ObjectAnimator A003 = A00(view, "scaleY", true);
            Animator.AnimatorListener animatorListener2 = animatorListener;
            boolean z3 = z;
            boolean z4 = z2;
            A003.addListener(new FHL(animatorListener2, view2, this, z4, z3));
            ObjectAnimator A004 = A00(view, "scaleX", false);
            ObjectAnimator A005 = A00(view, "scaleY", false);
            AnimatorSet animatorSet = new AnimatorSet();
            if (z) {
                j = 600;
            } else {
                j = 0;
            }
            animatorSet.setStartDelay(j);
            animatorSet.play(A002).with(A003);
            animatorSet.play(A004).with(A005).after(A002);
            animatorSet.addListener(new FHM(animatorListener2, view2, this, z4, z3));
            animatorSet.start();
            this.A06.put(view, animatorSet);
        }
    }

    private final ObjectAnimator A00(View view, String str, boolean z) {
        float f;
        long j;
        TimeInterpolator accelerateInterpolator;
        if ("scaleX".equals(str)) {
            f = this.A02;
        } else {
            f = this.A03;
        }
        float[] fArr = new float[2];
        float f2 = 1.0f;
        float f3 = 1.15f;
        if (z) {
            f3 = 1.0f;
        }
        fArr[0] = f3 * f;
        if (z) {
            f2 = 1.15f;
        }
        fArr[1] = f * f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
        if (z) {
            j = 400;
        } else {
            j = 200;
        }
        ofFloat.setDuration(j);
        if (z) {
            accelerateInterpolator = new DecelerateInterpolator();
        } else {
            accelerateInterpolator = new AccelerateInterpolator();
        }
        ofFloat.setInterpolator(accelerateInterpolator);
        return ofFloat;
    }

    public final void A01() {
        AnonymousClass61R r0 = this.A00;
        if (r0 != null) {
            r0.pause();
            AnonymousClass61R r1 = this.A00;
            if (r1 != null) {
                r1.EL2(0.0f);
            }
        }
        ImageView imageView = this.A04;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public final void A02(Animator.AnimatorListener animatorListener) {
        AnonymousClass61R r0;
        AnonymousClass61R r02;
        if (this.A00 == null) {
            if (182.A06(0Tu.A05, this.A08, 36326781849974749L)) {
                AnonymousClass61R A002 = C303756Aq.A00(this.A05, R.raw.countdown_sticker_confetti);
                this.A00 = A002;
                if (A002 != null) {
                    A002.A8s(new C46507DgA(this));
                }
                ImageView imageView = this.A04;
                if (imageView != null) {
                    imageView.setImageDrawable(this.A00);
                }
            }
        }
        ImageView imageView2 = this.A04;
        if (imageView2 != null && (r0 = this.A00) != null && !r0.A03.isRunning()) {
            imageView2.setVisibility(0);
            if (!(animatorListener == null || (r02 = this.A00) == null)) {
                r02.A8s(animatorListener);
            }
            AnonymousClass61R r1 = this.A00;
            if (r1 != null) {
                r1.EL2(0.0f);
            }
            AnonymousClass61R r03 = this.A00;
            if (r03 != null) {
                r03.E2p();
            }
        }
    }

    public final void A05(ImageView imageView, C249693kD r6) {
        String str;
        this.A04 = imageView;
        if (!182.A06(0Tu.A05, this.A08, 36326781849974749L)) {
            AnonymousClass61R A002 = C303756Aq.A00(this.A05, R.raw.countdown_sticker_confetti);
            this.A00 = A002;
            if (A002 != null) {
                A002.A8s(new C46507DgA(this));
            }
            ImageView imageView2 = this.A04;
            if (imageView2 != null) {
                imageView2.setImageDrawable(this.A00);
            }
        }
        1Xj BPf = r6.BPf();
        if (BPf != null) {
            str = BPf.A30();
        } else {
            str = null;
        }
        this.A01 = str;
    }

    public final void A06(C249693kD r5) {
        String str;
        if (this.A00 != null) {
            String str2 = this.A01;
            if (str2 != null) {
                1Xj BPf = r5.BPf();
                if (BPf != null) {
                    str = BPf.A30();
                } else {
                    str = null;
                }
                if (str2.equals(str)) {
                    return;
                }
            }
            A01();
            HashSet hashSet = new HashSet();
            for (Object obj : this.A07) {
                hashSet.add(this.A06.get(obj));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Animator animator = (Animator) it.next();
                if (animator != null) {
                    animator.cancel();
                    animator.removeAllListeners();
                }
            }
        }
    }
}
