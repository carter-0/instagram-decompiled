package com.instagram.feed.ui.text;

import X.AnonymousClass0fD;
import X.AnonymousClass3Z0;
import X.AnonymousClass41N;
import X.C17107VId;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeProvider;

public class IgLikeTextView extends BulletAwareTextView {
    public AnonymousClass41N A00 = new AnonymousClass3Z0(this);

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.A00.A05(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return (AccessibilityNodeProvider) this.A00.A00;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.41N, X.3Z0] */
    public IgLikeTextView(Context context) {
        super(context);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = AnonymousClass0fD.A05(-726500127);
        Layout layout = getLayout();
        boolean z = false;
        if ((layout != null && !(layout.getText() instanceof String) && C17107VId.A00(layout, motionEvent, this)) || super.onTouchEvent(motionEvent)) {
            z = true;
        }
        AnonymousClass0fD.A0C(1462814487, A05);
        return z;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.41N, X.3Z0] */
    public IgLikeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.41N, X.3Z0] */
    public IgLikeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
