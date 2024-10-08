package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

public final class U7J extends 02Z {
    public final /* synthetic */ View A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AnonymousClass7TF.A1H(view, accessibilityNodeInfoCompat);
        U7J.super.A0Y(view, accessibilityNodeInfoCompat);
        2eS.A05(accessibilityNodeInfoCompat, this.A01);
        this.A00.setSelected(this.A05);
        if (!this.A06) {
            String str = this.A02;
            if (str == null || str.length() == 0) {
                accessibilityNodeInfoCompat.setClickable(false);
                accessibilityNodeInfoCompat.removeAction(04x.A08);
            } else {
                C13989Tnp.A1C(accessibilityNodeInfoCompat, str);
            }
        }
        String str2 = this.A03;
        if (str2 != null) {
            accessibilityNodeInfoCompat.mInfo.setHintText(str2);
        }
        String str3 = this.A04;
        if (str3 != null) {
            accessibilityNodeInfoCompat.mInfo.setText(str3);
        }
    }

    public U7J(View view, Integer num, String str, String str2, String str3, boolean z, boolean z2) {
        this.A01 = num;
        this.A00 = view;
        this.A05 = z;
        this.A06 = z2;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
    }
}
