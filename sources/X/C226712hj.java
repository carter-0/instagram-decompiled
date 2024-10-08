package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.2hj  reason: invalid class name and case insensitive filesystem */
public abstract class C226712hj {
    public static final void A00(View view, C226702hi r8, 1U1 r9, C226662he r10, Object obj) {
        Drawable drawable;
        C226742hm r6;
        Runnable BlC;
        0qQ.A0B(r9, 1);
        C226722hk.A01();
        View view2 = view;
        Resources resources = view.getResources();
        0qQ.A07(resources);
        new Rect(0, 0, view.getWidth(), view.getHeight());
        C226732hl r7 = new C226732hl(resources, r9, r10, false);
        if (view2 instanceof ImageView) {
            ImageView imageView = (ImageView) view2;
            drawable = imageView.getDrawable();
            if (!(drawable instanceof C226742hm)) {
                r6 = (C226742hm) C226722hk.A00().ALv();
                if (((Boolean) AnonymousClass1TB.A03.get()).booleanValue()) {
                    r6.Eqj(new C279734zD(r6));
                }
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                0qQ.A0C(r6, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                imageView.setImageDrawable((Drawable) r6);
            }
            r6 = (C226742hm) drawable;
        } else {
            drawable = view2.getBackground();
            if (!(drawable instanceof C226742hm)) {
                r6 = (C226742hm) C226722hk.A00().ALv();
                if (((Boolean) AnonymousClass1TB.A03.get()).booleanValue()) {
                    r6.Eqj(new C279734zD(r6));
                }
                0qQ.A0C(r6, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                view2.setBackground((Drawable) r6);
            }
            r6 = (C226742hm) drawable;
        }
        C226732hl BGF = r6.BGF();
        if (BGF != null && !BGF.equals(r7)) {
            C226722hk.A00().ECf(r6);
        }
        r6.EiD(new AnonymousClass2i0(view2, r6, r7, r8, obj));
        if ((((Boolean) AnonymousClass1TB.A02.get()).booleanValue() || view2.isAttachedToWindow()) && (BlC = r6.BlC()) != null) {
            BlC.run();
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = AnonymousClass1TB.A04;
        view2.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        view2.addOnAttachStateChangeListener(onAttachStateChangeListener);
    }
}
