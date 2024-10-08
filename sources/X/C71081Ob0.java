package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Ob0  reason: case insensitive filesystem */
public final class C71081Ob0 {
    public static final C71081Ob0 A00 = new Object();

    public static final void A00(IgImageView igImageView, IgImageView igImageView2, boolean z) {
        igImageView.setVisibility(8);
        igImageView.setImageDrawable((Drawable) null);
        igImageView.setPivotX(50.0f);
        igImageView.setPivotY(50.0f);
        if (z) {
            igImageView2.setScaleY(1.0f);
            igImageView2.setScaleX(1.0f);
            igImageView2.setAlpha(1.0f);
        }
    }

    public final C70648OEv A02(Drawable drawable, IgImageView igImageView, IgImageView igImageView2, String str, C62320sa r28, boolean z) {
        Drawable drawable2 = drawable;
        IgImageView igImageView3 = igImageView2;
        0qQ.A0B(igImageView3, 1);
        String str2 = str;
        AnonymousClass7TF.A1C(drawable2, 2, str2);
        C62320sa r10 = r28;
        if (!(drawable2 instanceof C321006tQ)) {
            r10.invoke();
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(igImageView3, View.SCALE_Y, new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(igImageView3, View.SCALE_X, new float[]{0.0f, 1.0f});
        Property property = View.ALPHA;
        IgImageView igImageView4 = igImageView;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(igImageView4, property, new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(igImageView3, property, new float[]{0.0f, 1.0f});
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250);
        animatorSet.playTogether(new Animator[]{ofFloat2, ofFloat, ofFloat3, ofFloat4});
        C41567AwZ awZ = new C41567AwZ(37, igImageView3, r10, igImageView4);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(igImageView3, View.SCALE_Y, new float[]{0.0f});
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(igImageView3, property2, new float[]{0.0f});
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(igImageView4, property, new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(igImageView3, property, new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(igImageView4, property2, new float[]{1.0f});
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(igImageView4, View.SCALE_Y, new float[]{1.0f});
        animatorSet2.setInterpolator(new AccelerateInterpolator());
        animatorSet2.setDuration(250);
        animatorSet2.playTogether(new Animator[]{ofFloat6, ofFloat5, ofFloat7, ofFloat8, ofFloat9, ofFloat10});
        animatorSet2.addListener(new C67626Mqz(awZ, 1));
        igImageView3.setPivotY(100.0f);
        igImageView3.setPivotX(50.0f);
        A01(igImageView3, (C321006tQ) drawable2, C66580MXl.A15(animatorSet, 4), C66580MXl.A15(animatorSet2, 5));
        return new C70648OEv(igImageView3, igImageView4, str2, z);
    }

    public final void A03(Drawable drawable, View view, IgImageView igImageView, IgImageView igImageView2) {
        Drawable drawable2 = drawable;
        IgImageView igImageView3 = igImageView;
        IgImageView igImageView4 = igImageView2;
        int A1U = AnonymousClass7TF.A1U(0, igImageView3, igImageView4);
        if (drawable2 instanceof C321006tQ) {
            igImageView3.setVisibility(8);
            igImageView4.setImageDrawable(drawable2);
            igImageView4.setVisibility(0);
            View view2 = view;
            view2.setVisibility(0);
            view2.setScaleX(0.0f);
            view2.setScaleY(0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.TRANSLATION_Y;
            float[] fArr = new float[A1U];
            fArr[0] = -120.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(igImageView4, property, fArr);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(igImageView4, View.SCALE_Y, new float[]{1.0f, 4.0f});
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(igImageView4, View.SCALE_X, new float[]{1.0f, 4.0f});
            Property property2 = View.TRANSLATION_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, property, new float[]{0.0f, 1.0f});
            Property property3 = View.SCALE_X;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, property3, new float[]{0.0f, 1.0f});
            animatorSet.setDuration(280);
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat3, ofFloat2, ofFloat5, ofFloat4});
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property4 = View.SCALE_Y;
            float[] fArr2 = new float[A1U];
            fArr2[0] = 1.0f;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(igImageView4, property4, fArr2);
            float[] fArr3 = new float[A1U];
            fArr3[0] = 1.0f;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(igImageView4, property3, fArr3);
            Property property5 = View.TRANSLATION_Y;
            float[] fArr4 = new float[2];
            fArr4[0] = igImageView4.getTranslationY() - 0.03515625f;
            fArr4[A1U] = -12.0f;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(igImageView4, property5, fArr4);
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(view2, View.SCALE_Y, new float[]{1.0f, 0.0f});
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(view2, property3, new float[]{1.0f, 0.0f});
            animatorSet2.setDuration(280);
            animatorSet2.setInterpolator(new AccelerateInterpolator());
            animatorSet2.playTogether(new Animator[]{ofFloat8, ofFloat7, ofFloat6, ofFloat10, ofFloat9});
            animatorSet2.addListener(new C52777GcU(2, igImageView3, igImageView4));
            A01(igImageView4, (C321006tQ) drawable2, C66580MXl.A15(animatorSet, 2), C66580MXl.A15(animatorSet2, 3));
            igImageView4.post(new PV1(igImageView4));
        }
    }

    public static final void A01(IgImageView igImageView, C321006tQ r2, C62320sa r3, C62320sa r4) {
        igImageView.setImageDrawable(r2);
        igImageView.setVisibility(0);
        r2.A06();
        r2.A0A(1);
        r2.A0I = r4;
        if (r2.isLoading()) {
            r2.A9D(new C40281AYw(1, r3, r2));
            return;
        }
        r2.A08();
        r3.invoke();
    }
}
