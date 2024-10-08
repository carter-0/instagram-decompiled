package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import java.util.ArrayList;

/* renamed from: X.7PT  reason: invalid class name */
public abstract class AnonymousClass7PT {
    public static final void A00(Drawable drawable, int i) {
        boolean z = drawable instanceof AnonymousClass7OE;
        Object obj = drawable;
        if (!z) {
            if (drawable instanceof ShapeDrawable) {
                Object shader = ((ShapeDrawable) drawable).getPaint().getShader();
                boolean z2 = shader instanceof AnonymousClass7OE;
                obj = shader;
                if (!z2) {
                    return;
                }
            } else if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                2HY A0C = C229632nm.A0C(0, layerDrawable.getNumberOfLayers());
                ArrayList arrayList = new ArrayList(0Yv.A1E(A0C, 10));
                0sh it = A0C.iterator();
                while (it.hasNext()) {
                    arrayList.add(layerDrawable.getDrawable(it.A00()));
                }
                ArrayList<ShapeDrawable> arrayList2 = new ArrayList<>();
                for (Object next : arrayList) {
                    if (next instanceof ShapeDrawable) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(0Yv.A1E(arrayList2, 10));
                for (ShapeDrawable paint : arrayList2) {
                    arrayList3.add(paint.getPaint().getShader());
                }
                ArrayList<AnonymousClass7OE> arrayList4 = new ArrayList<>();
                for (Object next2 : arrayList3) {
                    if (next2 instanceof AnonymousClass7OE) {
                        arrayList4.add(next2);
                    }
                }
                for (AnonymousClass7OE Eov : arrayList4) {
                    Eov.Eov(i);
                }
                return;
            } else {
                return;
            }
        }
        ((AnonymousClass7OE) obj).Eov(i);
    }
}
