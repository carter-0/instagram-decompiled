package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeSet;

/* renamed from: X.8Of  reason: invalid class name and case insensitive filesystem */
public abstract class C355008Of {
    public static final void A00(Matrix matrix, Drawable drawable, C369458un r18, LinkedHashMap linkedHashMap, int i, int i2, int i3, boolean z, boolean z2) {
        Drawable drawable2 = drawable;
        if (drawable != null) {
            C369458un r6 = r18;
            if (r18 == null) {
                return;
            }
            if (z2 || z || AnonymousClass9SF.A04(drawable2)) {
                AnonymousClass9X8 A01 = AnonymousClass9SF.A01(drawable2);
                TreeSet treeSet = new TreeSet();
                RectF rectF = new RectF(drawable2.getBounds());
                Matrix matrix2 = matrix;
                matrix2.reset();
                float f = r6.A06;
                matrix2.preScale(f, f, r6.A03, r6.A04);
                matrix2.preTranslate(r6.A01, r6.A02);
                matrix2.mapRect(rectF);
                int i4 = i;
                int i5 = i2;
                int i6 = i3;
                treeSet.add(new C282765Eq(rectF, r6.A05, i4, i5, i6));
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                linkedHashMap2.put(drawable2, treeSet);
                if (A01 != null && A01 != drawable2) {
                    float f2 = r6.A06;
                    float height = f2 * ((float) (drawable2.getBounds().height() - A01.getBounds().height()));
                    float exactCenterY = f2 * (A01.getBounds().exactCenterY() - drawable2.getBounds().exactCenterY());
                    double radians = Math.toRadians((double) r6.A05);
                    C282765Eq r10 = new C282765Eq(rectF.centerX() + ((float) (((double) (-exactCenterY)) * Math.sin(radians))), rectF.centerY() + ((float) (((double) exactCenterY) * Math.cos(radians))), rectF.width(), rectF.height() - height, r6.A05, i4, i5, i6);
                    TreeSet treeSet2 = new TreeSet();
                    treeSet2.add(r10);
                    linkedHashMap2.put(A01, treeSet2);
                }
            }
        }
    }

    public static final boolean A01(InteractiveDrawableContainer interactiveDrawableContainer) {
        List<Drawable> allDrawables = interactiveDrawableContainer.getAllDrawables();
        if (!(allDrawables instanceof Collection) || !allDrawables.isEmpty()) {
            for (Drawable drawable : allDrawables) {
                if ((drawable instanceof AnonymousClass9XH) || (drawable instanceof AnonymousClass9XG)) {
                    return true;
                }
                if (!AnonymousClass9SF.A04(drawable) && AnonymousClass9SF.A01(drawable) == null) {
                    return true;
                }
            }
        }
        return false;
    }
}
