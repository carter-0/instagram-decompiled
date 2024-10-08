package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.3dv  reason: invalid class name and case insensitive filesystem */
public final class C246063dv implements C246053du {
    public final float AWv(AnonymousClass2VT r2) {
        0qQ.A0B(r2, 0);
        return (float) r2.A02.top;
    }

    public final float AWw(Object obj) {
        0qQ.A0B(obj, 0);
        if ((obj instanceof C70682Ty) && (obj instanceof 2UB)) {
            return ((View) obj).getY();
        }
        if (obj instanceof View) {
            return C246033ds.A00((View) obj, false);
        }
        if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            return ((float) drawable.getBounds().top) + C246033ds.A00(C246033ds.A01(drawable), false);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Getting Y from unsupported mount content: ");
        sb.append(obj);
        throw new UnsupportedOperationException(sb.toString());
    }

    public final void EHt(Object obj) {
        0qQ.A0B(obj, 0);
        if (obj instanceof View) {
            ((View) obj).setTranslationY(0.0f);
        }
    }

    public final void ENI(Object obj, float f) {
        View view;
        View view2;
        0qQ.A0B(obj, 0);
        if ((obj instanceof C70682Ty) && (obj instanceof 2UB)) {
            view = (View) obj;
        } else if (obj instanceof View) {
            view = (View) obj;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view2 = (View) parent;
            } else {
                view2 = null;
            }
            f -= C246033ds.A00(view2, false);
        } else if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            float A00 = C246033ds.A00(C246033ds.A01(drawable), false);
            int i = drawable.getBounds().left;
            int i2 = (int) (f - A00);
            Rect bounds = drawable.getBounds();
            0qQ.A07(bounds);
            drawable.setBounds(i, i2, bounds.width() + i, bounds.height() + i2);
            return;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting Y on unsupported mount content: ");
            sb.append(obj);
            throw new UnsupportedOperationException(sb.toString());
        }
        view.setY(f);
    }

    public final String getName() {
        return "y";
    }
}
