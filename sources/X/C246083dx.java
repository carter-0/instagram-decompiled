package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;

/* renamed from: X.3dx  reason: invalid class name and case insensitive filesystem */
public final class C246083dx implements C246053du {
    public final float AWv(AnonymousClass2VT r2) {
        0qQ.A0B(r2, 0);
        return (float) r2.A02.height();
    }

    public final float AWw(Object obj) {
        int height;
        0qQ.A0B(obj, 0);
        if (obj instanceof View) {
            height = ((View) obj).getHeight();
        } else if (obj instanceof Drawable) {
            height = ((Drawable) obj).getBounds().height();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Getting height from unsupported mount content: ");
            sb.append(obj);
            throw new UnsupportedOperationException(sb.toString());
        }
        return (float) height;
    }

    public final void EHt(Object obj) {
    }

    public final void ENI(Object obj, float f) {
        Object obj2 = obj;
        0qQ.A0B(obj, 0);
        if (obj instanceof C70682Ty) {
            if (obj instanceof 2UB) {
                ((2UB) obj2).setAnimatedHeight((int) f);
            } else {
                View view = (View) obj2;
                int top = view.getTop();
                C246173e9.A00((Rect) null, (C249753kJ) null, obj2, view.getLeft(), top, view.getRight(), (int) (((float) top) + f), false);
            }
            C70682Ty r2 = (C70682Ty) obj2;
            ArrayList A03 = C246033ds.A03(r2);
            if (A03 != null) {
                int width = r2.getWidth();
                int i = (int) f;
                int size = A03.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AnonymousClass4F8.A00((Drawable) A03.get(i2), width, i);
                }
            }
        } else if (obj instanceof View) {
            View view2 = (View) obj2;
            int top2 = view2.getTop();
            C246173e9.A00((Rect) null, (C249753kJ) null, obj2, view2.getLeft(), top2, view2.getRight(), (int) (((float) top2) + f), false);
        } else if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj2;
            AnonymousClass4F8.A00(drawable, drawable.getBounds().width(), (int) f);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting height on unsupported mount content: ");
            sb.append(obj);
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    public final String getName() {
        return IgReactMediaPickerNativeModule.HEIGHT;
    }
}
