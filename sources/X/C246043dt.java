package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.3dt  reason: invalid class name and case insensitive filesystem */
public final class C246043dt implements C246053du {
    public final float AWv(AnonymousClass2VT r2) {
        0qQ.A0B(r2, 0);
        return (float) r2.A02.left;
    }

    public final float AWw(Object obj) {
        0qQ.A0B(obj, 0);
        if ((obj instanceof C70682Ty) && (obj instanceof 2UB)) {
            return ((View) obj).getX();
        }
        if (obj instanceof View) {
            return C246033ds.A00((View) obj, true);
        }
        if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            return ((float) drawable.getBounds().left) + C246033ds.A00(C246033ds.A01(drawable), true);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Getting X from unsupported mount content: ");
        sb.append(obj);
        throw new UnsupportedOperationException(sb.toString());
    }

    public final void EHt(Object obj) {
        0qQ.A0B(obj, 0);
        if (obj instanceof View) {
            ((View) obj).setTranslationX(0.0f);
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
            f -= C246033ds.A00(view2, true);
        } else if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            int A00 = (int) (f - C246033ds.A00(C246033ds.A01(drawable), true));
            int i = drawable.getBounds().top;
            Rect bounds = drawable.getBounds();
            0qQ.A07(bounds);
            drawable.setBounds(A00, i, bounds.width() + A00, bounds.height() + i);
            return;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting X on unsupported mount content: ");
            sb.append(obj);
            throw new UnsupportedOperationException(sb.toString());
        }
        view.setX(f);
    }

    public final String getName() {
        return "x";
    }
}
