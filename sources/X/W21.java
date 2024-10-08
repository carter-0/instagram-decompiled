package X;

import android.view.View;
import java.io.PrintWriter;

public final class W21 {
    public static final 02Z A00 = new 02Z();
    public static final W21 A01 = new Object();

    public static final String A00(CharSequence charSequence, int i) {
        if (charSequence == null || charSequence.length() == 0) {
            return "";
        }
        String A0g = 00p.A0g(00p.A0g(charSequence.toString(), " \n", " ", false), "\n", " ", false);
        if (charSequence.length() > i) {
            return 002.A0R(C51967G9n.A0q(A0g, 0, i), "...");
        }
        return A0g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x0206 A[Catch:{ Exception -> 0x0384 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0257 A[Catch:{ Exception -> 0x0384 }, LOOP:1: B:114:0x0251->B:116:0x0257, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0275 A[Catch:{ Exception -> 0x0384 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x028c A[Catch:{ Exception -> 0x0384 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03df  */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0176 A[Catch:{ Exception -> 0x01e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0182 A[Catch:{ Exception -> 0x01e7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.view.View r11, X.W21 r12, java.io.PrintWriter r13, int r14, int r15, int r16) {
        /*
            r5 = r11
            r3 = 1
            if (r11 != 0) goto L_0x000a
            java.lang.String r0 = "null"
            r13.println(r0)
        L_0x0009:
            return
        L_0x000a:
            java.lang.String r0 = "  "
            r4 = r16
            java.lang.String r0 = X.00p.A0f(r0, r4)
            r13.print(r0)
            java.lang.String r0 = X.C66581MXm.A0y(r11)
            r13.print(r0)
            java.lang.String r0 = "{"
            r13.print(r0)
            java.lang.String r8 = " "
            r13.print(r8)
            int r2 = r11.getVisibility()
            java.lang.String r9 = "V"
            java.lang.String r1 = "."
            if (r2 == 0) goto L_0x010a
            r0 = 4
            if (r2 == r0) goto L_0x0103
            r0 = 8
            if (r2 == r0) goto L_0x0100
            r13.print(r1)
        L_0x003a:
            boolean r2 = r11.isFocusable()
            java.lang.String r6 = "F"
            r0 = r1
            if (r2 == 0) goto L_0x0044
            r0 = r6
        L_0x0044:
            r13.print(r0)
            boolean r0 = r11.isEnabled()
            if (r0 == 0) goto L_0x00fd
            java.lang.String r0 = "E"
        L_0x004f:
            r13.print(r0)
            r13.print(r1)
            boolean r7 = r11.isHorizontalScrollBarEnabled()
            java.lang.String r2 = "H"
            r0 = r1
            if (r7 == 0) goto L_0x005f
            r0 = r2
        L_0x005f:
            r13.print(r0)
            boolean r0 = r11.isVerticalScrollBarEnabled()
            if (r0 != 0) goto L_0x0069
            r9 = r1
        L_0x0069:
            r13.print(r9)
            boolean r0 = r11.isClickable()
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = "C"
        L_0x0074:
            r13.print(r0)
            boolean r0 = r11.isLongClickable()
            if (r0 == 0) goto L_0x00f8
            java.lang.String r0 = "L"
        L_0x007f:
            r13.print(r0)
            r13.print(r8)
            boolean r0 = r11.isFocused()
            if (r0 != 0) goto L_0x008c
            r6 = r1
        L_0x008c:
            r13.print(r6)
            boolean r0 = r11.isSelected()
            if (r0 == 0) goto L_0x00f6
            java.lang.String r0 = "S"
        L_0x0097:
            r13.print(r0)
            boolean r0 = r11.isHovered()
            if (r0 != 0) goto L_0x00a1
            r2 = r1
        L_0x00a1:
            r13.print(r2)
            boolean r0 = r11.isActivated()
            if (r0 == 0) goto L_0x00f4
            java.lang.String r0 = "A"
        L_0x00ac:
            r13.print(r0)
            boolean r0 = r11.isDirty()
            if (r0 == 0) goto L_0x00b7
            java.lang.String r1 = "D"
        L_0x00b7:
            r13.print(r1)
            r6 = 2
            int[] r7 = new int[r6]
            r11.getLocationOnScreen(r7)
            r13.print(r8)
            r10 = 0
            r0 = r7[r10]
            int r0 = r0 - r14
            r13.print(r0)
            java.lang.String r2 = ","
            r13.print(r2)
            r0 = r7[r3]
            int r0 = r0 - r15
            r13.print(r0)
            java.lang.String r0 = "-"
            r13.print(r0)
            r1 = r7[r10]
            int r0 = r11.getWidth()
            int r1 = r1 + r0
            int r1 = r1 - r14
            r13.print(r1)
            r13.print(r2)
            r1 = r7[r3]
            int r0 = r11.getHeight()
            int r1 = r1 + r0
            int r1 = r1 - r15
            r13.print(r1)
            goto L_0x010f
        L_0x00f4:
            r0 = r1
            goto L_0x00ac
        L_0x00f6:
            r0 = r1
            goto L_0x0097
        L_0x00f8:
            r0 = r1
            goto L_0x007f
        L_0x00fa:
            r0 = r1
            goto L_0x0074
        L_0x00fd:
            r0 = r1
            goto L_0x004f
        L_0x0100:
            java.lang.String r0 = "G"
            goto L_0x0105
        L_0x0103:
            java.lang.String r0 = "I"
        L_0x0105:
            r13.print(r0)
            goto L_0x003a
        L_0x010a:
            r13.print(r9)
            goto L_0x003a
        L_0x010f:
            int r7 = r11.getId()     // Catch:{ Exception -> 0x0166 }
            r0 = -1
            if (r7 == r0) goto L_0x0162
            java.lang.String r0 = " #"
            r13.append(r0)     // Catch:{ Exception -> 0x0166 }
            java.lang.String r0 = java.lang.Integer.toHexString(r7)     // Catch:{ Exception -> 0x0166 }
            r13.append(r0)     // Catch:{ Exception -> 0x0166 }
            android.content.res.Resources r2 = r11.getResources()     // Catch:{ Exception -> 0x0166 }
            if (r7 <= 0) goto L_0x0162
            if (r2 == 0) goto L_0x0162
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r7
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 == r0) goto L_0x0139
            r0 = 2130706432(0x7f000000, float:1.7014118E38)
            if (r1 == r0) goto L_0x0136
            goto L_0x013c
        L_0x0136:
            java.lang.String r0 = "app"
            goto L_0x0143
        L_0x0139:
            java.lang.String r0 = "android"
            goto L_0x0143
        L_0x013c:
            java.lang.String r0 = r2.getResourcePackageName(r7)     // Catch:{ Exception -> 0x0166 }
            X.0qQ.A07(r0)     // Catch:{ Exception -> 0x0166 }
        L_0x0143:
            r13.print(r8)     // Catch:{ Exception -> 0x0166 }
            r13.print(r0)     // Catch:{ Exception -> 0x0166 }
            java.lang.String r0 = ":"
            r13.print(r0)     // Catch:{ Exception -> 0x0166 }
            java.lang.String r0 = r2.getResourceTypeName(r7)     // Catch:{ Exception -> 0x0166 }
            r13.print(r0)     // Catch:{ Exception -> 0x0166 }
            java.lang.String r0 = "/"
            r13.print(r0)     // Catch:{ Exception -> 0x0166 }
            java.lang.String r0 = r2.getResourceEntryName(r7)     // Catch:{ Exception -> 0x0166 }
            r13.print(r0)     // Catch:{ Exception -> 0x0166 }
            goto L_0x0171
        L_0x0162:
            r12.A02(r11, r13)     // Catch:{ Exception -> 0x0166 }
            goto L_0x0171
        L_0x0166:
            r2 = move-exception
            java.lang.String r1 = "ViewHierarchyDumper"
            java.lang.String r0 = "Failed to write view test id"
            X.0KC.A0F(r1, r0, r2)
            r12.A02(r11, r13)
        L_0x0171:
            r1 = 0
            boolean r0 = r11 instanceof android.widget.TextView     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x0182
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x01e7 }
            java.lang.CharSequence r0 = r0.getText()     // Catch:{ Exception -> 0x01e7 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x01e7 }
            goto L_0x01cb
        L_0x0182:
            java.lang.CharSequence r0 = r11.getContentDescription()     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x0194
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x01e7 }
            if (r1 == 0) goto L_0x0194
            int r0 = r1.length()     // Catch:{ Exception -> 0x01e7 }
            if (r0 != 0) goto L_0x01cb
        L_0x0194:
            java.lang.Object r0 = r11.getTag()     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x01cb
            java.lang.String r9 = r0.toString()     // Catch:{ Exception -> 0x01e7 }
            int r8 = r9.length()     // Catch:{ Exception -> 0x01e7 }
            int r8 = r8 - r3
            r7 = 0
            r2 = 0
        L_0x01a5:
            if (r7 > r8) goto L_0x01c7
            r0 = r8
            if (r2 != 0) goto L_0x01ab
            r0 = r7
        L_0x01ab:
            char r1 = r9.charAt(r0)     // Catch:{ Exception -> 0x01e7 }
            r0 = 32
            int r0 = X.0qQ.A00(r1, r0)     // Catch:{ Exception -> 0x01e7 }
            boolean r0 = X.Dba.A1U(r0)
            if (r2 != 0) goto L_0x01c2
            if (r0 != 0) goto L_0x01bf
            r2 = 1
            goto L_0x01a5
        L_0x01bf:
            int r7 = r7 + 1
            goto L_0x01a5
        L_0x01c2:
            if (r0 == 0) goto L_0x01c7
            int r8 = r8 + -1
            goto L_0x01a5
        L_0x01c7:
            java.lang.String r1 = X.Dba.A0c(r9, r8, r7)     // Catch:{ Exception -> 0x01e7 }
        L_0x01cb:
            if (r1 == 0) goto L_0x01ef
            int r0 = r1.length()     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x01ef
            java.lang.String r0 = " text=\""
            r13.print(r0)     // Catch:{ Exception -> 0x01e7 }
            r0 = 600(0x258, float:8.41E-43)
            java.lang.String r0 = A00(r1, r0)     // Catch:{ Exception -> 0x01e7 }
            r13.print(r0)     // Catch:{ Exception -> 0x01e7 }
            java.lang.String r0 = "\""
            r13.print(r0)     // Catch:{ Exception -> 0x01e7 }
            goto L_0x01ef
        L_0x01e7:
            r2 = move-exception
            java.lang.String r1 = "ViewHierarchyDumper"
            java.lang.String r0 = "Failed to get view text"
            X.0KC.A0F(r1, r0, r2)
        L_0x01ef:
            android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r8 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat
            r8.<init>(r0)
            X.02Z r0 = A00     // Catch:{ NullPointerException -> 0x03a7 }
            r0.A0Y(r11, r8)     // Catch:{ NullPointerException -> 0x03a7 }
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            boolean r0 = r11 instanceof android.widget.TextView     // Catch:{ Exception -> 0x0384 }
            if (r0 == 0) goto L_0x0244
            java.lang.String r1 = "textColor"
            java.lang.String r7 = "#%08x"
            r9 = r5
            android.widget.TextView r9 = (android.widget.TextView) r9     // Catch:{ Exception -> 0x0384 }
            android.content.res.ColorStateList r0 = r9.getTextColors()     // Catch:{ Exception -> 0x0384 }
            int r0 = r0.getDefaultColor()     // Catch:{ Exception -> 0x0384 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0384 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ Exception -> 0x0384 }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)     // Catch:{ Exception -> 0x0384 }
            java.lang.String r0 = java.lang.String.format(r7, r0)     // Catch:{ Exception -> 0x0384 }
            X.0qQ.A07(r0)     // Catch:{ Exception -> 0x0384 }
            r2.put(r1, r0)     // Catch:{ Exception -> 0x0384 }
            java.lang.String r7 = "textSize"
            float r0 = r9.getTextSize()     // Catch:{ Exception -> 0x0384 }
            double r0 = (double) r0     // Catch:{ Exception -> 0x0384 }
            r2.put(r7, r0)     // Catch:{ Exception -> 0x0384 }
            java.lang.String r7 = "hint"
            java.lang.CharSequence r1 = r9.getHint()     // Catch:{ Exception -> 0x0384 }
            r0 = 100
            java.lang.String r0 = A00(r1, r0)     // Catch:{ Exception -> 0x0384 }
            r2.put(r7, r0)     // Catch:{ Exception -> 0x0384 }
        L_0x0244:
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ Exception -> 0x0384 }
            r7.<init>()     // Catch:{ Exception -> 0x0384 }
            java.util.List r0 = r8.getActionList()     // Catch:{ Exception -> 0x0384 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ Exception -> 0x0384 }
        L_0x0251:
            boolean r0 = r9.hasNext()     // Catch:{ Exception -> 0x0384 }
            if (r0 == 0) goto L_0x026f
            java.lang.Object r0 = r9.next()     // Catch:{ Exception -> 0x0384 }
            X.04x r0 = (X.04x) r0     // Catch:{ Exception -> 0x0384 }
            java.lang.Object r0 = r0.A03     // Catch:{ Exception -> 0x0384 }
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r0     // Catch:{ Exception -> 0x0384 }
            java.lang.CharSequence r1 = r0.getLabel()     // Catch:{ Exception -> 0x0384 }
            r0 = 50
            java.lang.String r0 = A00(r1, r0)     // Catch:{ Exception -> 0x0384 }
            r7.put(r0)     // Catch:{ Exception -> 0x0384 }
            goto L_0x0251
        L_0x026f:
            int r0 = r7.length()     // Catch:{ Exception -> 0x0384 }
            if (r0 <= 0) goto L_0x027a
            java.lang.String r0 = "actions"
            r2.put(r0, r7)     // Catch:{ Exception -> 0x0384 }
        L_0x027a:
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo     // Catch:{ Exception -> 0x0384 }
            java.lang.CharSequence r0 = r0.getContentDescription()     // Catch:{ Exception -> 0x0384 }
            r9 = 50
            java.lang.String r1 = A00(r0, r9)     // Catch:{ Exception -> 0x0384 }
            int r0 = r1.length()     // Catch:{ Exception -> 0x0384 }
            if (r0 <= 0) goto L_0x0291
            java.lang.String r0 = "content-description"
            r2.put(r0, r1)     // Catch:{ Exception -> 0x0384 }
        L_0x0291:
            java.lang.String r1 = "accessibility-focused"
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo     // Catch:{ Exception -> 0x0384 }
            boolean r0 = r0.isAccessibilityFocused()     // Catch:{ Exception -> 0x0384 }
            org.json.JSONObject r7 = r2.put(r1, r0)     // Catch:{ Exception -> 0x0384 }
            java.lang.String r1 = "checkable"
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo     // Catch:{ Exception -> 0x0384 }
            boolean r0 = r0.isCheckable()     // Catch:{ Exception -> 0x0384 }
            org.json.JSONObject r7 = r7.put(r1, r0)     // Catch:{ Exception -> 0x0384 }
            java.lang.String r1 = "checked"
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo     // Catch:{ Exception -> 0x0384 }
            boolean r0 = r0.isChecked()     // Catch:{ Exception -> 0x0384 }
            org.json.JSONObject r7 = r7.put(r1, r0)     // Catch:{ Exception -> 0x0384 }
            java.lang.String r1 = "class-name"
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo     // Catch:{ Exception -> 0x0384 }
            java.lang.CharSequence r0 = r0.getClassName()     // Catch:{ Exception -> 0x0384 }
            java.lang.String r0 = A00(r0, r9)     // Catch:{ Exception -> 0x0384 }
            org.json.JSONObject r7 = r7.put(r1, r0)     // Catch:{ Exception -> 0x0384 }
            java.lang.String r1 = "clickable"
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo     // Catch:{ Exception -> 0x0384 }
            boolean r0 = r0.isClickable()     // Catch:{ Exception -> 0x0384 }
            org.json.JSONObject r7 = r7.put(r1, r0)     // Catch:{ Exception -> 0x0384 }
            java.lang.String r1 = "content-invalid"
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo     // Catch:{ Exception -> 0x0384 }
            boolean r0 = r0.isContentInvalid()     // Catch:{ Exception -> 0x0384 }
            org.json.JSONObject r7 = r7.put(r1, r0)     // Catch:{ Exception -> 0x0384 }
            java.lang.String r1 = "dismissable"
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo     // Catch:{ Exception -> 0x0384 }
            boolean r0 = r0.isDismissable()     // Catch:{ Exception -> 0x0384 }
            org.json.JSONObject r7 = r7.put(r1, r0)     // Catch:{ Exception -> 0x0384 }
            java.lang.String r1 = "editable"
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo     // Catch:{ Exception -> 0x0384 }
            boolean r0 = r0.isEditable()     // Catch:{ Exception -> 0x0384 }
            org.json.JSONObject r7 = r7.put(r1, r0)     // Catch:{ Exception -> 0x0384 }
            java.lang.String r1 = "enabled"
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo     // Catch:{ Exception -> 0x0384 }
            boolean r0 = r0.isEnabled()     // Catch:{ Exception -> 0x0384 }
            org.json.JSONObject r7 = r7.put(r1, r0)     // Catch:{ Exception -> 0x0384 }
            java.lang.String r1 = "focusable"
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo     // Catch:{ Exception -> 0x0384 }
            boolean r0 = r0.isFocusable()     // Catch:{ Exception -> 0x0384 }
            org.json.JSONObject r7 = r7.put(r1, r0)     // Catch:{ Exception -> 0x0384 }
            java.lang.String r1 = "focused"
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo     // Catch:{ Exception -> 0x0384 }
            boolean r0 = r0.isFocused()     // Catch:{ Exception -> 0x0384 }
            org.json.JSONObject r7 = r7.put(r1, r0)     // Catch:{ Exception -> 0x0384 }
            java.lang.String r1 = "long-clickable"
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo     // Catch:{ Exception -> 0x0384 }
            boolean r0 = r0.isLongClickable()     // Catch:{ Exception -> 0x0384 }
            org.json.JSONObject r7 = r7.put(r1, r0)     // Catch:{ Exception -> 0x0384 }
            java.lang.String r1 = "multiline"
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo     // Catch:{ Exception -> 0x0384 }
            boolean r0 = r0.isMultiLine()     // Catch:{ Exception -> 0x0384 }
            org.json.JSONObject r7 = r7.put(r1, r0)     // Catch:{ Exception -> 0x0384 }
            java.lang.String r1 = "password"
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo     // Catch:{ Exception -> 0x0384 }
            boolean r0 = r0.isPassword()     // Catch:{ Exception -> 0x0384 }
            org.json.JSONObject r7 = r7.put(r1, r0)     // Catch:{ Exception -> 0x0384 }
            java.lang.String r1 = "scrollable"
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo     // Catch:{ Exception -> 0x0384 }
            boolean r0 = r0.isScrollable()     // Catch:{ Exception -> 0x0384 }
            org.json.JSONObject r7 = r7.put(r1, r0)     // Catch:{ Exception -> 0x0384 }
            java.lang.String r1 = "selected"
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo     // Catch:{ Exception -> 0x0384 }
            boolean r0 = r0.isSelected()     // Catch:{ Exception -> 0x0384 }
            org.json.JSONObject r7 = r7.put(r1, r0)     // Catch:{ Exception -> 0x0384 }
            java.lang.String r1 = "visible-to-user"
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo     // Catch:{ Exception -> 0x0384 }
            boolean r0 = r0.isVisibleToUser()     // Catch:{ Exception -> 0x0384 }
            r7.put(r1, r0)     // Catch:{ Exception -> 0x0384 }
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo     // Catch:{ Exception -> 0x0384 }
            boolean r1 = r0.isContextClickable()     // Catch:{ Exception -> 0x0384 }
            java.lang.String r0 = "context-clickable"
            org.json.JSONObject r7 = r2.put(r0, r1)     // Catch:{ Exception -> 0x0384 }
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo     // Catch:{ Exception -> 0x0384 }
            int r1 = r0.getDrawingOrder()     // Catch:{ Exception -> 0x0384 }
            java.lang.String r0 = "drawing-order"
            org.json.JSONObject r7 = r7.put(r0, r1)     // Catch:{ Exception -> 0x0384 }
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.mInfo     // Catch:{ Exception -> 0x0384 }
            boolean r1 = r0.isImportantForAccessibility()     // Catch:{ Exception -> 0x0384 }
            java.lang.String r0 = "important-for-accessibility"
            r7.put(r0, r1)     // Catch:{ Exception -> 0x0384 }
            goto L_0x0394
        L_0x0384:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            r0 = 50
            java.lang.String r1 = A00(r1, r0)
            java.lang.String r0 = "DUMP-ERROR"
            r2.put(r0, r1)
        L_0x0394:
            java.lang.String r0 = " props=\""
            java.io.PrintWriter r1 = r13.append(r0)
            java.lang.String r0 = r2.toString()
            java.io.PrintWriter r1 = r1.append(r0)
            java.lang.String r0 = "\""
            r1.append(r0)
        L_0x03a7:
            java.lang.String r0 = "}"
            r13.println(r0)
            boolean r0 = r11 instanceof com.facebook.litho.LithoView
            if (r0 == 0) goto L_0x03d3
            int r1 = r16 + 1
            r0 = 0
            java.lang.String r0 = com.facebook.litho.LithoViewTestHelper.viewToStringForE2E(r11, r1, r3, r0)     // Catch:{ Exception -> 0x03bb }
            r13.append(r0)     // Catch:{ Exception -> 0x03bb }
            goto L_0x03d3
        L_0x03bb:
            r1 = move-exception
            java.lang.String r0 = "Failed litho view sub hierarch dump: "
            java.io.PrintWriter r2 = r13.append(r0)
            java.lang.String r1 = r1.getMessage()
            r0 = 100
            java.lang.String r0 = A00(r1, r0)
            java.io.PrintWriter r0 = r2.append(r0)
            r0.println()
        L_0x03d3:
            boolean r0 = r11 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0009
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r2 = r5.getChildCount()
            if (r2 <= 0) goto L_0x0009
            int[] r1 = new int[r6]
            r5.getLocationOnScreen(r1)
            r0 = 0
        L_0x03e5:
            android.view.View r11 = r5.getChildAt(r0)
            r14 = r1[r10]
            r15 = r1[r3]
            int r16 = r4 + 1
            A01(r11, r12, r13, r14, r15, r16)
            int r0 = r0 + 1
            if (r0 >= r2) goto L_0x0009
            goto L_0x03e5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W21.A01(android.view.View, X.W21, java.io.PrintWriter, int, int, int):void");
    }

    private final void A02(View view, PrintWriter printWriter) {
        String str;
        Object tag = view.getTag();
        if ((tag instanceof String) && (str = (String) tag) != null && str.length() != 0) {
            printWriter.print(" app:tag/");
            printWriter.print(A00(str, 60));
        }
    }
}
