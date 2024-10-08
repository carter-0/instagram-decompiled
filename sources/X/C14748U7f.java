package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.chip.Chip;
import java.util.List;

/* renamed from: X.U7f  reason: case insensitive filesystem */
public final class C14748U7f extends 2Vy {
    public final /* synthetic */ Chip A00;

    public final void A0e(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.A00;
            chip.A05 = z;
            chip.refreshDrawableState();
        }
    }

    public final void A0i(List list) {
        G9w.A0x(0, list);
        Chip chip = this.A00;
        UWU uwu = chip.A04;
        if (uwu != null && uwu.A0T != null && uwu.A0d && chip.A02 != null) {
            G9w.A0x(1, list);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14748U7f(Chip chip, Chip chip2) {
        super(chip2);
        this.A00 = chip;
    }

    public final int A0a(float f, float f2) {
        Chip chip = this.A00;
        UWU uwu = chip.A04;
        if (uwu == null || uwu.A0T == null || !chip.getCloseIconTouchBounds().contains(f, f2)) {
            return 0;
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r0.A0b == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0g(androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4) {
        /*
            r3 = this;
            com.google.android.material.chip.Chip r2 = r3.A00
            X.UWU r0 = r2.A04
            if (r0 == 0) goto L_0x000b
            boolean r0 = r0.A0b
            r1 = 1
            if (r0 != 0) goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            android.view.accessibility.AccessibilityNodeInfo r0 = r4.mInfo
            r0.setCheckable(r1)
            boolean r0 = r2.isClickable()
            r4.setClickable(r0)
            X.UWU r0 = r2.A04
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.A0b
            if (r0 != 0) goto L_0x0035
        L_0x0020:
            boolean r0 = r2.isClickable()
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "android.view.View"
        L_0x0028:
            r4.setClassName(r0)
            java.lang.CharSequence r1 = r2.getText()
            android.view.accessibility.AccessibilityNodeInfo r0 = r4.mInfo
            r0.setText(r1)
            return
        L_0x0035:
            X.UWU r0 = r2.A04
            if (r0 == 0) goto L_0x0040
            boolean r0 = r0.A0b
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "android.widget.CompoundButton"
            goto L_0x0028
        L_0x0040:
            java.lang.String r0 = "android.widget.Button"
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14748U7f.A0g(androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
    }

    public final void A0h(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        CharSequence charSequence = "";
        if (i == 1) {
            Chip chip = this.A00;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription == null) {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                closeIconContentDescription = DbW.A0h(context, charSequence, 2131967670).trim();
            }
            accessibilityNodeInfoCompat.setContentDescription(closeIconContentDescription);
            accessibilityNodeInfoCompat.mInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            accessibilityNodeInfoCompat.addAction(04x.A08);
            accessibilityNodeInfoCompat.setEnabled(chip.isEnabled());
            return;
        }
        accessibilityNodeInfoCompat.setContentDescription(charSequence);
        accessibilityNodeInfoCompat.mInfo.setBoundsInParent(Chip.A0G);
    }

    public final boolean A0m(int i, int i2, Bundle bundle) {
        if (i2 != 16) {
            return false;
        }
        if (i == 0) {
            return this.A00.performClick();
        }
        if (i != 1) {
            return false;
        }
        Chip chip = this.A00;
        boolean z = false;
        chip.playSoundEffect(0);
        View.OnClickListener onClickListener = chip.A02;
        if (onClickListener != null) {
            onClickListener.onClick(chip);
            z = true;
        }
        chip.A0C.A0d(1, 1);
        return z;
    }
}
