package X;

import android.graphics.Rect;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.61X  reason: invalid class name */
public final class AnonymousClass61X extends AnonymousClass3Z0 {
    public static final Rect A01 = new Rect();
    public static final int[] A02 = new int[2];
    public final boolean A00;

    public final void A03(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        0qQ.A0B(accessibilityNodeInfoCompat, 0);
        View view = this.A02;
        SearchEditText searchEditText = (SearchEditText) view;
        if (searchEditText.A0I && searchEditText.A0H && searchEditText.A00 != null) {
            accessibilityNodeInfoCompat.mInfo.addChild(view, -2147483647);
        }
    }

    public final void A04(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        Rect rect;
        if (i == -2147483647) {
            View view = this.A02;
            SearchEditText searchEditText = (SearchEditText) view;
            if (searchEditText.A0I && searchEditText.A0H && searchEditText.A00 != null) {
                int clearButtonWidth = searchEditText.getClearButtonWidth();
                int clearButtonHeight = searchEditText.getClearButtonHeight();
                int[] iArr = A02;
                searchEditText.getLocationOnScreen(iArr);
                int height = iArr[1] + ((searchEditText.getHeight() - clearButtonHeight) / 2);
                boolean z = this.A00;
                int i2 = iArr[0];
                if (z) {
                    int paddingLeft = i2 + searchEditText.getPaddingLeft();
                    rect = A01;
                    rect.set(paddingLeft, height, clearButtonWidth + paddingLeft, clearButtonHeight + height);
                } else {
                    int width = (i2 + searchEditText.getWidth()) - searchEditText.getPaddingRight();
                    rect = A01;
                    rect.set(width - clearButtonWidth, height, width, clearButtonHeight + height);
                }
                accessibilityNodeInfoCompat.setParent(view);
                accessibilityNodeInfoCompat.mInfo.setBoundsInScreen(rect);
                accessibilityNodeInfoCompat.setContentDescription(searchEditText.getResources().getString(2131955150));
                accessibilityNodeInfoCompat.setClassName("android.widget.Button");
                accessibilityNodeInfoCompat.mInfo.setVisibleToUser(true);
                accessibilityNodeInfoCompat.mInfo.setFocusable(true);
                accessibilityNodeInfoCompat.setClickable(true);
                accessibilityNodeInfoCompat.setEnabled(true);
            }
        }
    }

    public final int A01(float f, float f2) {
        SearchEditText searchEditText = (SearchEditText) this.A02;
        if (!searchEditText.A0I || !searchEditText.A0H || searchEditText.A00 == null || !searchEditText.A0D(f)) {
            return AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        return -2147483647;
    }

    public AnonymousClass61X(SearchEditText searchEditText) {
        super(searchEditText);
        this.A00 = 0mk.A02(searchEditText.getContext());
    }
}
