package com.instagram.common.accessibility;

import X.AnonymousClass3Z0;
import X.C267024ao;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.instagram.common.ui.base.IgTextView;

public class AccessibleTextView extends IgTextView {
    public C267024ao A00 = new AnonymousClass3Z0(this);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.accessibility.AccessibleTextView, android.view.View] */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.A00.A05(motionEvent)) {
            return true;
        }
        return AccessibleTextView.super.dispatchHoverEvent(motionEvent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return (AccessibilityNodeProvider) this.A00.A00;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4ao, X.3Z0] */
    public AccessibleTextView(Context context) {
        super(context);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4ao, X.3Z0] */
    public AccessibleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4ao, X.3Z0] */
    public AccessibleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
