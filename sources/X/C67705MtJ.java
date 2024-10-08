package X;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.instagram.rtc.presentation.arsidebar.RtcCallArSidebarTouchUpSlider;

/* renamed from: X.MtJ  reason: case insensitive filesystem */
public final class C67705MtJ extends 02Z {
    public AccessibilityManager A00;
    public Integer A01;
    public final RtcCallArSidebarTouchUpSlider A02;
    public final View A03;

    public C67705MtJ(View view, RtcCallArSidebarTouchUpSlider rtcCallArSidebarTouchUpSlider) {
        AccessibilityManager accessibilityManager;
        0qQ.A0B(view, 1);
        this.A03 = view;
        this.A02 = rtcCallArSidebarTouchUpSlider;
        03v.A0B(view, this);
        03v.A0B(rtcCallArSidebarTouchUpSlider, this);
        Object systemService = rtcCallArSidebarTouchUpSlider.getContext().getSystemService("accessibility");
        if (systemService instanceof AccessibilityManager) {
            accessibilityManager = (AccessibilityManager) systemService;
        } else {
            accessibilityManager = null;
        }
        this.A00 = accessibilityManager;
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AnonymousClass7TG.A1N(view, accessibilityNodeInfoCompat);
        C67705MtJ.super.A0Y(view, accessibilityNodeInfoCompat);
        boolean equals = view.equals(this.A03);
        04x r0 = 04x.A04;
        Context context = view.getContext();
        int i = 2131976452;
        if (equals) {
            i = 2131976449;
        }
        accessibilityNodeInfoCompat.addAction(new 04x(32, context.getString(i)));
    }
}
