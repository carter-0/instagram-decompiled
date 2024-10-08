package X;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

public final class U7M extends 02Z {
    public final int A00;
    public final Object A01;

    public U7M(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A0S(View view, AccessibilityEvent accessibilityEvent) {
        if (2 - this.A00 != 0) {
            U7M.super.A0S(view, accessibilityEvent);
            return;
        }
        U7M.super.A0S(view, accessibilityEvent);
        accessibilityEvent.setChecked(((CheckableImageButton) this.A01).isChecked());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006f, code lost:
        r0 = r1.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0082, code lost:
        X.C13989Tnp.A1C(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0085, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ad, code lost:
        r10.setRoleDescription(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0139, code lost:
        r10.mInfo.setCollectionItemInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, r4, 1, false, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0146, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Y(android.view.View r9, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r10) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0147;
                case 1: goto L_0x0100;
                case 2: goto L_0x00e8;
                case 3: goto L_0x00d9;
                case 4: goto L_0x00b1;
                case 5: goto L_0x0086;
                case 6: goto L_0x0074;
                case 7: goto L_0x005c;
                case 8: goto L_0x0056;
                case 9: goto L_0x0049;
                case 10: goto L_0x0039;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x002a;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r2 = X.AnonymousClass7TG.A1Z(r9, r10)
            java.lang.Object r0 = r8.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L_0x0021
            r0 = 2131963306(0x7f132daa, float:1.9563362E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.Integer r0 = X.C226302gX.A00(r0)
            X.2eS.A05(r10, r0)
        L_0x0021:
            X.U7M.super.A0Y(r9, r10)
            android.view.accessibility.AccessibilityNodeInfo r0 = r10.mInfo
            r0.setHeading(r2)
            return
        L_0x002a:
            X.U7M.super.A0Y(r9, r10)
            X.04x r0 = X.04x.A08
            java.lang.Object r0 = r8.A01
            X.EGE r0 = (X.EGE) r0
            android.content.Context r1 = r0.A00
            r0 = 2131952033(0x7f1301a1, float:1.9540497E38)
            goto L_0x006f
        L_0x0039:
            X.AnonymousClass7TG.A1N(r9, r10)
            java.lang.Object r1 = r8.A01
            android.view.View r1 = (android.view.View) r1
            android.view.accessibility.AccessibilityNodeInfo r0 = r10.mInfo
            r0.setTraversalAfter(r1)
            X.U7M.super.A0Y(r9, r10)
            return
        L_0x0049:
            X.U7M.super.A0Y(r9, r10)
            java.lang.String r0 = "android.widget.Button"
            r10.setClassName(r0)
            r0 = 1
            r10.setClickable(r0)
            return
        L_0x0056:
            X.U7M.super.A0Y(r9, r10)
            java.lang.String r0 = "Button"
            goto L_0x00ad
        L_0x005c:
            X.AnonymousClass7TG.A1N(r9, r10)
            X.U7M.super.A0Y(r9, r10)
            X.04x r0 = X.04x.A08
            java.lang.Object r0 = r8.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 2131959107(0x7f131d43, float:1.9554845E38)
        L_0x006f:
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0082
        L_0x0074:
            X.U7M.super.A0Y(r9, r10)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131973082(0x7f1353da, float:1.958319E38)
            java.lang.CharSequence r0 = r1.getText(r0)
        L_0x0082:
            X.C13989Tnp.A1C(r10, r0)
            return
        L_0x0086:
            boolean r1 = X.AnonymousClass7TG.A1Z(r9, r10)
            X.U7M.super.A0Y(r9, r10)
            android.view.accessibility.AccessibilityNodeInfo r0 = r10.mInfo
            r0.setFocusable(r1)
            X.04x r0 = X.04x.A0f
            r10.addAction(r0)
            java.lang.String r0 = "android.view.View"
            r10.setClassName(r0)
            java.lang.Object r0 = r8.A01
            X.L03 r0 = (X.L03) r0
            android.widget.TextView r0 = r0.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131965095(0x7f1334a7, float:1.956699E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x00ad:
            r10.setRoleDescription(r0)
            return
        L_0x00b1:
            X.U7M.super.A0Y(r9, r10)
            r0 = 2131435869(0x7f0b215d, float:1.8493592E38)
            java.lang.Object r0 = r9.getTag(r0)
            int r4 = X.AnonymousClass7TE.A0M(r0)
            if (r4 <= 0) goto L_0x00d4
            java.lang.Object r0 = r8.A01
            com.google.android.material.timepicker.ClockFaceView r0 = (com.google.android.material.timepicker.ClockFaceView) r0
            android.util.SparseArray r1 = r0.A07
            int r0 = r4 + -1
            java.lang.Object r1 = r1.get(r0)
            android.view.View r1 = (android.view.View) r1
            android.view.accessibility.AccessibilityNodeInfo r0 = r10.mInfo
            r0.setTraversalAfter(r1)
        L_0x00d4:
            boolean r7 = r9.isSelected()
            goto L_0x0139
        L_0x00d9:
            X.U7M.super.A0Y(r9, r10)
            java.lang.Object r0 = r8.A01
            com.google.android.material.internal.NavigationMenuItemView r0 = (com.google.android.material.internal.NavigationMenuItemView) r0
            boolean r1 = r0.A04
            android.view.accessibility.AccessibilityNodeInfo r0 = r10.mInfo
            r0.setCheckable(r1)
            return
        L_0x00e8:
            X.U7M.super.A0Y(r9, r10)
            java.lang.Object r2 = r8.A01
            com.google.android.material.internal.CheckableImageButton r2 = (com.google.android.material.internal.CheckableImageButton) r2
            boolean r1 = r2.A00
            android.view.accessibility.AccessibilityNodeInfo r0 = r10.mInfo
            r0.setCheckable(r1)
            boolean r1 = r2.isChecked()
            android.view.accessibility.AccessibilityNodeInfo r0 = r10.mInfo
            r0.setChecked(r1)
            return
        L_0x0100:
            X.U7M.super.A0Y(r9, r10)
            java.lang.Object r3 = r8.A01
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            boolean r0 = r9 instanceof com.google.android.material.button.MaterialButton
            if (r0 == 0) goto L_0x0132
            r2 = 0
            r4 = 0
        L_0x010d:
            int r0 = r3.getChildCount()
            if (r2 >= r0) goto L_0x0132
            android.view.View r0 = r3.getChildAt(r2)
            if (r0 == r9) goto L_0x0133
            android.view.View r0 = r3.getChildAt(r2)
            boolean r0 = r0 instanceof com.google.android.material.button.MaterialButton
            if (r0 == 0) goto L_0x012f
            android.view.View r0 = r3.getChildAt(r2)
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x012f
            int r4 = r4 + 1
        L_0x012f:
            int r2 = r2 + 1
            goto L_0x010d
        L_0x0132:
            r4 = -1
        L_0x0133:
            com.google.android.material.button.MaterialButton r9 = (com.google.android.material.button.MaterialButton) r9
            boolean r7 = r9.isChecked()
        L_0x0139:
            r2 = 0
            r3 = 1
            r5 = r3
            r6 = r2
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r1 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r2, r3, r4, r5, r6, r7)
            android.view.accessibility.AccessibilityNodeInfo r0 = r10.mInfo
            r0.setCollectionItemInfo(r1)
            return
        L_0x0147:
            X.U7M.super.A0Y(r9, r10)
            r1 = 0
            android.view.accessibility.AccessibilityNodeInfo r0 = r10.mInfo
            r0.setFocusable(r1)
            r10.setClickable(r1)
            X.04x r0 = X.04x.A0I
            r10.removeAction(r0)
            X.04x r0 = X.04x.A08
            r10.removeAction(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7M.A0Y(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
    }
}
