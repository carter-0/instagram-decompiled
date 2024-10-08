package X;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.HRa  reason: case insensitive filesystem */
public abstract class C54742HRa {
    public static final void A00(AnonymousClass5SX r3, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (C54743HRb.A00(r3)) {
            AnonymousClass5SV r32 = r3.A05;
            C290145ep r0 = (C290145ep) C285765So.A00(r32, C290125en.A0G);
            if (r0 != null) {
                accessibilityNodeInfoCompat.addAction(new 04x(16908358, r0.A00));
            }
            C290145ep r02 = (C290145ep) C285765So.A00(r32, C290125en.A0D);
            if (r02 != null) {
                accessibilityNodeInfoCompat.addAction(new 04x(16908359, r02.A00));
            }
            C290145ep r03 = (C290145ep) C285765So.A00(r32, C290125en.A0E);
            if (r03 != null) {
                accessibilityNodeInfoCompat.addAction(new 04x(16908360, r03.A00));
            }
            C290145ep r04 = (C290145ep) C285765So.A00(r32, C290125en.A0F);
            if (r04 != null) {
                accessibilityNodeInfoCompat.addAction(new 04x(16908361, r04.A00));
            }
        }
    }
}
