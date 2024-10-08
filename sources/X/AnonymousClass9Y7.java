package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.9Y7  reason: invalid class name */
public final class AnonymousClass9Y7 extends 02Z {
    public final /* synthetic */ AnonymousClass5R6 A00;
    public final /* synthetic */ AndroidComposeView A01;
    public final /* synthetic */ AndroidComposeView A02;

    public AnonymousClass9Y7(AnonymousClass5R6 r1, AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.A02 = androidComposeView;
        this.A00 = r1;
        this.A01 = androidComposeView2;
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Integer num;
        int i;
        int i2;
        AnonymousClass9Y7.super.A0Y(view, accessibilityNodeInfoCompat);
        AndroidComposeView androidComposeView = this.A02;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = androidComposeView.A0f;
        if (androidComposeViewAccessibilityDelegateCompat.A0b()) {
            accessibilityNodeInfoCompat.mInfo.setVisibleToUser(false);
        }
        AnonymousClass5R6 r3 = this.A00;
        AnonymousClass5R6 A002 = C290085ej.A00(r3, C41673AyQ.A00);
        if (A002 != null) {
            num = Integer.valueOf(A002.A01);
        } else {
            num = null;
        }
        if (num == null || num.intValue() == androidComposeView.A0l.A00().A02) {
            num = -1;
        }
        AndroidComposeView androidComposeView2 = this.A01;
        int intValue = num.intValue();
        accessibilityNodeInfoCompat.mParentVirtualDescendantId = intValue;
        accessibilityNodeInfoCompat.mInfo.setParent(androidComposeView2, intValue);
        int i3 = r3.A01;
        C63120yJ r0 = androidComposeViewAccessibilityDelegateCompat.A05;
        int A03 = r0.A03(i3);
        if (A03 >= 0 && (i2 = r0.A03[A03]) != -1) {
            C52849Gdi A022 = C290115em.A02(androidComposeView.getAndroidViewsHandler$ui_release(), i2);
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.mInfo;
            if (A022 != null) {
                accessibilityNodeInfo.setTraversalBefore(A022);
            } else {
                accessibilityNodeInfo.setTraversalBefore(androidComposeView2, i2);
            }
            AndroidComposeView.A08(accessibilityNodeInfoCompat.mInfo, androidComposeView, C273654mx.A00(538), i3);
        }
        C63120yJ r02 = androidComposeViewAccessibilityDelegateCompat.A04;
        int A032 = r02.A03(i3);
        if (A032 >= 0 && (i = r02.A03[A032]) != -1) {
            C52849Gdi A023 = C290115em.A02(androidComposeView.getAndroidViewsHandler$ui_release(), i);
            AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfoCompat.mInfo;
            if (A023 != null) {
                accessibilityNodeInfo2.setTraversalAfter(A023);
            } else {
                accessibilityNodeInfo2.setTraversalAfter(androidComposeView2, i);
            }
            AndroidComposeView.A08(accessibilityNodeInfoCompat.mInfo, androidComposeView, C273654mx.A00(537), i3);
        }
    }
}
