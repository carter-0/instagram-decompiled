package X;

import com.google.android.material.textfield.TextInputLayout;

public class U7E extends 02Z {
    public final TextInputLayout A00;

    public U7E(TextInputLayout textInputLayout) {
        this.A00 = textInputLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
        if (r9 != null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0036, code lost:
        if (android.text.TextUtils.isEmpty(r12) == false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Y(android.view.View r14, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r15) {
        /*
            r13 = this;
            X.U7E.super.A0Y(r14, r15)
            com.google.android.material.textfield.TextInputLayout r0 = r13.A00
            android.widget.EditText r2 = r0.A0F
            if (r2 == 0) goto L_0x009f
            android.text.Editable r5 = r2.getText()
        L_0x000d:
            java.lang.CharSequence r6 = r0.getHint()
            java.lang.CharSequence r3 = r0.getError()
            java.lang.CharSequence r9 = r0.getPlaceholderText()
            int r4 = r0.A07
            java.lang.CharSequence r12 = r0.getCounterOverflowDescription()
            boolean r11 = X.C13990Tnq.A1a(r5)
            boolean r1 = X.C13990Tnq.A1a(r6)
            boolean r0 = r0.A0R
            r10 = r0 ^ 1
            boolean r8 = X.C13990Tnq.A1a(r3)
            if (r8 != 0) goto L_0x0038
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r7 = 0
            if (r0 != 0) goto L_0x0039
        L_0x0038:
            r7 = 1
        L_0x0039:
            if (r1 == 0) goto L_0x009c
            java.lang.String r6 = r6.toString()
        L_0x003f:
            java.lang.String r1 = ", "
            if (r11 == 0) goto L_0x007c
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.mInfo
            r0.setText(r5)
        L_0x0048:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x005a
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.mInfo
            r0.setHintText(r6)
            r1 = r11 ^ 1
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.mInfo
            r0.setShowingHintText(r1)
        L_0x005a:
            if (r5 == 0) goto L_0x007a
            int r0 = r5.length()
            if (r0 != r4) goto L_0x007a
        L_0x0062:
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.mInfo
            r0.setMaxTextLength(r4)
            if (r7 == 0) goto L_0x0071
            if (r8 != 0) goto L_0x006c
            r3 = r12
        L_0x006c:
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.mInfo
            r0.setError(r3)
        L_0x0071:
            if (r2 == 0) goto L_0x0079
            r0 = 2131442664(0x7f0b3be8, float:1.8507374E38)
            r2.setLabelFor(r0)
        L_0x0079:
            return
        L_0x007a:
            r4 = -1
            goto L_0x0062
        L_0x007c:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0099
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.mInfo
            r0.setText(r6)
            if (r10 == 0) goto L_0x0048
            if (r9 == 0) goto L_0x0048
            java.lang.StringBuilder r0 = X.AnonymousClass7TF.A0n(r6)
            java.lang.String r9 = X.AnonymousClass7TG.A0m(r9, r1, r0)
        L_0x0093:
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.mInfo
            r0.setText(r9)
            goto L_0x0048
        L_0x0099:
            if (r9 == 0) goto L_0x0048
            goto L_0x0093
        L_0x009c:
            java.lang.String r6 = ""
            goto L_0x003f
        L_0x009f:
            r5 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7E.A0Y(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
    }
}
