package X;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7kF  reason: invalid class name and case insensitive filesystem */
public abstract class C339837kF {
    public static final void A01(Drawable drawable, C339807kC r4, float f) {
        IgSimpleImageView igSimpleImageView = r4.A07;
        ViewGroup.LayoutParams layoutParams = igSimpleImageView.getLayoutParams();
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.width = (int) (((float) drawable.getIntrinsicWidth()) * f);
        igSimpleImageView.setLayoutParams(layoutParams);
    }

    public static final void A00(Animator.AnimatorListener animatorListener, Drawable drawable, C339807kC r12, C62320sa r13, C62320sa r14, C62320sa r15, C62320sa r16, C62320sa r17, float f, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        IgTextView igTextView;
        TextView textView;
        List list;
        ViewGroup viewGroup;
        C339807kC r0 = r12;
        View view = r12.A04;
        C390029qc r2 = null;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            if (z4) {
                viewGroup.setTranslationZ(1.0f);
            }
        }
        boolean booleanValue = ((Boolean) r15.invoke()).booleanValue();
        C339817kD.A00(r12, r16, booleanValue);
        boolean booleanValue2 = ((Boolean) r13.invoke()).booleanValue();
        int i3 = i;
        if (booleanValue2) {
            r12.A07.setImageResource(i3);
        } else {
            Drawable drawable2 = drawable;
            C62320sa r11 = r17;
            float f2 = f;
            if (((Boolean) r14.invoke()).booleanValue()) {
                if (!z5) {
                    A01(drawable2, r0, f2);
                }
                IgSimpleImageView igSimpleImageView = r0.A07;
                igSimpleImageView.setImageResource(i3);
                if (z) {
                    igTextView = r0.A08;
                } else {
                    igTextView = null;
                }
                if (!booleanValue || !z2) {
                    textView = null;
                } else {
                    textView = (TextView) r0.A09.getView();
                }
                if (z5) {
                    list = Collections.singletonList(new C390039qd(drawable2, r0, f2));
                    0qQ.A07(list);
                } else {
                    list = null;
                }
                if (z5) {
                    r2 = new C390029qc(r0);
                }
                C339917kN r4 = new C339917kN(drawable2, igSimpleImageView, igTextView, textView, list, 0sr.A1P(new Animator.AnimatorListener[]{animatorListener, r2}), r11, f2, i3, -1, 500, z3, false, true);
                ((Animator) r4.A0C.getValue()).start();
                r0.A00 = r4;
            } else {
                A01(drawable2, r0, f2);
                IgSimpleImageView igSimpleImageView2 = r0.A07;
                if (!igSimpleImageView2.isLaidOut() || igSimpleImageView2.isLayoutRequested()) {
                    igSimpleImageView2.addOnLayoutChangeListener(new C379179Su(drawable2, r0, r11, f2));
                } else {
                    AnonymousClass9SA.A00(drawable2, igSimpleImageView2, 1.0f, f2, false);
                    r11.invoke();
                }
            }
        }
        IgTextView igTextView2 = r0.A08;
        igTextView2.setEllipsize(TextUtils.TruncateAt.END);
        igTextView2.setText(i2);
        igTextView2.setVisibility(0);
    }
}
