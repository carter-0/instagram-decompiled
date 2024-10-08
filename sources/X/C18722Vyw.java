package X;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.Vyw  reason: case insensitive filesystem */
public abstract class C18722Vyw {
    public static final Path A00 = new Path();
    public static final Rect A01 = new Rect();
    public static final RectF A02 = new RectF();
    public static final int[] A03 = new int[2];

    public static final void A00(Layout layout, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Spanned spanned;
        0qQ.A0B(accessibilityNodeInfoCompat, 0);
        if (layout != null) {
            CharSequence text = layout.getText();
            if ((text instanceof Spanned) && (spanned = (Spanned) text) != null) {
                0sC A002 = 0pe.A00(spanned.getSpans(0, spanned.length(), ClickableSpan.class));
                while (A002.hasNext()) {
                    accessibilityNodeInfoCompat.mInfo.addChild(view, spanned.getSpanStart(A002.next()));
                }
            }
        }
    }

    public static final void A01(Layout layout, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        Spanned spanned;
        AnonymousClass7TF.A1B(accessibilityNodeInfoCompat, 1, view);
        if (layout != null) {
            CharSequence text = layout.getText();
            if ((text instanceof Spanned) && (spanned = (Spanned) text) != null) {
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(i, i, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    ClickableSpan clickableSpan = clickableSpanArr[0];
                    int spanStart = spanned.getSpanStart(clickableSpan);
                    int spanEnd = spanned.getSpanEnd(clickableSpan);
                    int lineForOffset = layout.getLineForOffset(spanStart);
                    boolean A1O = JTQ.A1O(lineForOffset, layout.getLineForOffset(spanEnd));
                    accessibilityNodeInfoCompat.setParent(view);
                    if (clickableSpan instanceof C252983q1) {
                        C252983q1 r6 = (C252983q1) clickableSpan;
                        CharSequence charSequence = r6.A02;
                        if (charSequence == null) {
                            charSequence = spanned.subSequence(spanStart, spanEnd);
                        }
                        accessibilityNodeInfoCompat.setContentDescription(charSequence);
                        Integer num = r6.A01;
                        if (num == null) {
                            num = AnonymousClass05K.A01;
                        }
                        accessibilityNodeInfoCompat.setClassName(C226302gX.A01(num));
                        04x r0 = r6.A00;
                        if (r0 != null) {
                            accessibilityNodeInfoCompat.addAction(r0);
                        }
                    } else {
                        accessibilityNodeInfoCompat.setContentDescription(spanned.subSequence(spanStart, spanEnd));
                    }
                    accessibilityNodeInfoCompat.mInfo.setVisibleToUser(true);
                    if (A1O) {
                        spanEnd = layout.getLineVisibleEnd(lineForOffset);
                    }
                    Path path = A00;
                    layout.getSelectionPath(spanStart, spanEnd, path);
                    RectF rectF = A02;
                    path.computeBounds(rectF, true);
                    int[] iArr = A03;
                    view.getLocationOnScreen(iArr);
                    int paddingLeft = iArr[0] + view.getPaddingLeft();
                    int paddingTop = iArr[1] + view.getPaddingTop();
                    Rect rect = A01;
                    rect.set(((int) rectF.left) + paddingLeft, ((int) rectF.top) + paddingTop, paddingLeft + ((int) rectF.right), paddingTop + ((int) rectF.bottom));
                    accessibilityNodeInfoCompat.mInfo.setBoundsInScreen(rect);
                    accessibilityNodeInfoCompat.mInfo.setFocusable(true);
                    accessibilityNodeInfoCompat.setClickable(true);
                    accessibilityNodeInfoCompat.setEnabled(true);
                }
            }
        }
    }
}
