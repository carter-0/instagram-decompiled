package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.instagram.creation.capture.quickcapture.colourpicker.ColorPalette;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.8BZ  reason: invalid class name */
public final class AnonymousClass8BZ extends AnonymousClass3Z0 {
    public static final Rect A00 = new Rect();
    public static final RectF A01 = new RectF();
    public static final int[] A02 = new int[2];

    public final void A03(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        0qQ.A0B(accessibilityNodeInfoCompat, 0);
        ColorPalette colorPalette = (ColorPalette) this.A02;
        if (colorPalette != null) {
            ArrayList arrayList = colorPalette.A0F;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((A9X) arrayList.get(i)).A08) {
                    accessibilityNodeInfoCompat.mInfo.addChild(colorPalette, i);
                }
            }
        }
    }

    public final void A04(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        ColorPalette colorPalette = (ColorPalette) this.A02;
        if (colorPalette != null) {
            ArrayList arrayList = colorPalette.A0F;
            if (i < arrayList.size() && i >= 0) {
                A9X a9x = (A9X) arrayList.get(i);
                int[] iArr = A02;
                colorPalette.getLocationInWindow(iArr);
                RectF rectF = A01;
                rectF.set(a9x.A05);
                rectF.offset((float) iArr[0], (float) iArr[1]);
                Rect rect = A00;
                rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                Resources resources = colorPalette.getResources();
                accessibilityNodeInfoCompat.setParent(colorPalette);
                Number number = (Number) AnonymousClass8BR.A06.get(Integer.valueOf(a9x.A07.A00));
                if (number == null) {
                    number = 2131956337;
                }
                accessibilityNodeInfoCompat.setContentDescription(resources.getString(number.intValue()));
                accessibilityNodeInfoCompat.setRoleDescription(resources.getString(2131954408));
                accessibilityNodeInfoCompat.mInfo.setBoundsInScreen(rect);
                accessibilityNodeInfoCompat.mInfo.setVisibleToUser(true);
                accessibilityNodeInfoCompat.mInfo.setFocusable(true);
                accessibilityNodeInfoCompat.setClickable(true);
                accessibilityNodeInfoCompat.setEnabled(true);
            }
        }
    }

    public final int A01(float f, float f2) {
        ColorPalette colorPalette = (ColorPalette) this.A02;
        int i = AnonymousClass972.MUTABLE_FLAG_MASK;
        if (colorPalette != null) {
            Iterator it = colorPalette.A0F.iterator();
            while (it.hasNext()) {
                A9X a9x = (A9X) it.next();
                if (a9x.A01(f, f2)) {
                    i = a9x.A07.A00;
                }
            }
        }
        return i;
    }
}
