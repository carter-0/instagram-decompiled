package X;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.dextricks.Constants;
import com.facebook.rendercore.text.RCTextView;
import java.util.List;

/* renamed from: X.5ue  reason: invalid class name and case insensitive filesystem */
public final class C299145ue extends 2Vy {
    public 02Z A00;
    public final /* synthetic */ RCTextView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C299145ue(RCTextView rCTextView) {
        super(rCTextView);
        this.A01 = rCTextView;
        rCTextView.setFocusable(false);
        rCTextView.setImportantForAccessibility(1);
    }

    public final int A0a(float f, float f2) {
        RCTextView rCTextView = this.A01;
        CharSequence charSequence = rCTextView.A03;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i = 0;
            while (true) {
                ClickableSpan[] clickableSpanArr = rCTextView.A06;
                if (i >= clickableSpanArr.length) {
                    break;
                }
                ClickableSpan clickableSpan = clickableSpanArr[i];
                int spanStart = spanned.getSpanStart(clickableSpan);
                int spanEnd = spanned.getSpanEnd(clickableSpan);
                int A002 = RCTextView.A00(rCTextView, (int) f, (int) f2);
                if (A002 >= spanStart && A002 <= spanEnd) {
                    return i;
                }
                i++;
            }
        }
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final void A0e(int i, boolean z) {
        RCTextView rCTextView = this.A01;
        if (rCTextView.A06[i] instanceof AnonymousClass6TY) {
            rCTextView.invalidate();
        }
    }

    public final void A0h(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        int lineVisibleEnd;
        RCTextView rCTextView = this.A01;
        Spanned spanned = (Spanned) rCTextView.A03;
        Rect rect = new Rect();
        ClickableSpan[] clickableSpanArr = rCTextView.A06;
        if (clickableSpanArr == null || i >= clickableSpanArr.length) {
            accessibilityNodeInfoCompat.mInfo.setText("");
            accessibilityNodeInfoCompat.mInfo.setBoundsInParent(rect);
            return;
        }
        ClickableSpan clickableSpan = clickableSpanArr[i];
        int spanStart = spanned.getSpanStart(clickableSpan);
        int spanEnd = spanned.getSpanEnd(clickableSpan);
        int lineForOffset = rCTextView.A02.getLineForOffset(spanStart);
        int lineForOffset2 = rCTextView.A02.getLineForOffset(spanEnd);
        Path path = new Path();
        RectF rectF = new RectF();
        if (lineForOffset == lineForOffset2) {
            lineVisibleEnd = spanEnd;
        } else {
            lineVisibleEnd = rCTextView.A02.getLineVisibleEnd(lineForOffset);
        }
        rCTextView.A02.getSelectionPath(spanStart, lineVisibleEnd, path);
        path.computeBounds(rectF, true);
        rectF.offset(rCTextView.A00, rCTextView.A01);
        rectF.round(rect);
        accessibilityNodeInfoCompat.mInfo.setBoundsInParent(rect);
        accessibilityNodeInfoCompat.setClickable(true);
        accessibilityNodeInfoCompat.mInfo.setFocusable(true);
        accessibilityNodeInfoCompat.setEnabled(true);
        accessibilityNodeInfoCompat.mInfo.setVisibleToUser(true);
        accessibilityNodeInfoCompat.mInfo.setText(spanned.subSequence(spanStart, spanEnd));
        accessibilityNodeInfoCompat.setClassName("android.widget.Button");
        if (clickableSpan instanceof AnonymousClass6TY) {
            AnonymousClass6TY r4 = (AnonymousClass6TY) clickableSpan;
            String str = r4.A00;
            String str2 = r4.A01;
            if (str2 == null) {
                str2 = "Link";
            }
            if (str != null) {
                accessibilityNodeInfoCompat.setContentDescription(str);
            }
            V6J.A00(rCTextView.getContext(), (View) null, accessibilityNodeInfoCompat, str2);
        }
    }

    public final void A0i(List list) {
        ClickableSpan[] clickableSpanArr = this.A01.A06;
        if (clickableSpanArr != null) {
            int length = clickableSpanArr.length;
            for (int i = 0; i < length; i++) {
                list.add(Integer.valueOf(i));
            }
        }
    }

    public final boolean A0m(int i, int i2, Bundle bundle) {
        if (i2 != 16) {
            return false;
        }
        RCTextView rCTextView = this.A01;
        rCTextView.A06[i].onClick(rCTextView);
        return true;
    }

    public final void A0T(View view, AccessibilityEvent accessibilityEvent) {
        C299145ue.super.A0T(view, accessibilityEvent);
        RCTextView rCTextView = this.A01;
        if (!TextUtils.isEmpty(rCTextView.A03)) {
            accessibilityEvent.getText().add(rCTextView.getTextForAccessibility());
        }
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C299145ue.super.A0Y(view, accessibilityNodeInfoCompat);
        CharSequence A012 = ((RCTextView) view).getTextForAccessibility();
        if (!TextUtils.isEmpty(A012)) {
            accessibilityNodeInfoCompat.mInfo.setText(A012);
            accessibilityNodeInfoCompat.addAction(256);
            accessibilityNodeInfoCompat.addAction(512);
            accessibilityNodeInfoCompat.mInfo.setMovementGranularities(31);
            accessibilityNodeInfoCompat.addAction(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
        }
        02Z r0 = this.A00;
        if (r0 != null) {
            r0.A0Y(view, accessibilityNodeInfoCompat);
        }
    }
}
