package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.8jQ  reason: invalid class name and case insensitive filesystem */
public final class C363258jQ extends AnonymousClass3Z0 {
    public static final Matrix A00 = new Matrix();
    public static final Rect A01 = new Rect();
    public static final RectF A02 = new RectF();
    public static final int[] A03 = new int[2];

    public final int A01(float f, float f2) {
        for (B3f b3f : ((InteractiveDrawableContainer) this.A02).getInteractiveDrawables()) {
            C378669Qs r1 = (C378669Qs) b3f;
            if (r1.A0P && r1.A0O && b3f.AJc(f, f2) == 0) {
                return r1.A0g;
            }
        }
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final void A03(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        View view = this.A02;
        for (B3f b3f : ((InteractiveDrawableContainer) view).getInteractiveDrawables()) {
            C378669Qs r1 = (C378669Qs) b3f;
            if (r1.A0P && r1.A0O) {
                accessibilityNodeInfoCompat.mInfo.addChild(view, r1.A0g);
            }
        }
    }

    public final void A04(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        View view = this.A02;
        InteractiveDrawableContainer interactiveDrawableContainer = (InteractiveDrawableContainer) view;
        for (B3f b3f : interactiveDrawableContainer.getInteractiveDrawables()) {
            C378669Qs r8 = (C378669Qs) b3f;
            if (r8.A0P && r8.A0O && r8.A0g == i) {
                Matrix matrix = A00;
                b3f.C9R(matrix);
                RectF rectF = A02;
                rectF.set(r8.A0B.getBounds());
                matrix.mapRect(rectF);
                int[] iArr = A03;
                interactiveDrawableContainer.getLocationOnScreen(iArr);
                rectF.offset((float) (iArr[0] + interactiveDrawableContainer.getPaddingLeft()), (float) (iArr[1] + interactiveDrawableContainer.getPaddingTop()));
                Rect rect = A01;
                rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                CharSequence charSequence = r8.A0F;
                if (charSequence == null) {
                    charSequence = interactiveDrawableContainer.getResources().getString(2131974208);
                }
                accessibilityNodeInfoCompat.setParent(view);
                accessibilityNodeInfoCompat.setContentDescription(charSequence);
                accessibilityNodeInfoCompat.mInfo.setBoundsInScreen(rect);
                accessibilityNodeInfoCompat.mInfo.setVisibleToUser(true);
                accessibilityNodeInfoCompat.mInfo.setFocusable(true);
                accessibilityNodeInfoCompat.setClickable(true);
                accessibilityNodeInfoCompat.setEnabled(true);
                return;
            }
        }
    }
}
