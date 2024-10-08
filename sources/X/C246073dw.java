package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;

/* renamed from: X.3dw  reason: invalid class name and case insensitive filesystem */
public final class C246073dw implements C246053du {
    public final float AWv(AnonymousClass2VT r2) {
        0qQ.A0B(r2, 0);
        return (float) r2.A02.width();
    }

    public final float AWw(Object obj) {
        int width;
        0qQ.A0B(obj, 0);
        if (obj instanceof View) {
            width = ((View) obj).getWidth();
        } else if (obj instanceof Drawable) {
            width = ((Drawable) obj).getBounds().width();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Getting width from unsupported mount content: ");
            sb.append(obj);
            throw new UnsupportedOperationException(sb.toString());
        }
        return (float) width;
    }

    public final void EHt(Object obj) {
    }

    public final void ENI(Object obj, float f) {
        Object obj2 = obj;
        0qQ.A0B(obj, 0);
        if (obj instanceof C70682Ty) {
            if (obj instanceof 2UB) {
                ((2UB) obj2).setAnimatedWidth((int) f);
            } else {
                View view = (View) obj2;
                int left = view.getLeft();
                C246173e9.A00((Rect) null, (C249753kJ) null, obj2, left, view.getTop(), (int) (((float) left) + f), view.getBottom(), false);
            }
            C70682Ty r2 = (C70682Ty) obj2;
            ArrayList A03 = C246033ds.A03(r2);
            if (A03 != null) {
                int i = (int) f;
                int height = r2.getHeight();
                int size = A03.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AnonymousClass4F8.A00((Drawable) A03.get(i2), i, height);
                }
            }
        } else if (obj instanceof View) {
            View view2 = (View) obj2;
            int left2 = view2.getLeft();
            C246173e9.A00((Rect) null, (C249753kJ) null, obj2, left2, view2.getTop(), (int) (((float) left2) + f), view2.getBottom(), false);
        } else if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj2;
            AnonymousClass4F8.A00(drawable, (int) f, drawable.getBounds().height());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting width on unsupported mount content: ");
            sb.append(obj);
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    public final String getName() {
        return IgReactMediaPickerNativeModule.WIDTH;
    }
}
