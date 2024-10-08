package X;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.instagram.android.R;
import java.io.PrintWriter;
import java.lang.reflect.Method;

public final class W2D {
    public static W2D A05;
    public static Method A06;
    public static Method A07;
    public Method A00;
    public Method A01;
    public final C17305VQg A02 = new C17305VQg();
    public final OL2 A03 = new Object();
    public final VLR A04 = new VLR(this);

    public static boolean A03(String str, String[] strArr) {
        for (String equalsIgnoreCase : strArr) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                return true;
            }
        }
        return false;
    }

    public static WebView A00(View view) {
        if (view instanceof WebView) {
            return (WebView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            WebView A002 = A00(viewGroup.getChildAt(i));
            if (A002 != null) {
                return A002;
            }
        }
        return null;
    }

    public static String A01(CharSequence charSequence, int i) {
        if (charSequence == null || charSequence.length() < 1) {
            return "";
        }
        String replace = charSequence.toString().replace(" \n", " ").replace("\n", " ").replace("\"", "");
        if (charSequence.length() > i) {
            return 002.A0R(replace.substring(0, i), "...");
        }
        return replace;
    }

    public static void A02(View view, PrintWriter printWriter) {
        Object tag = view.getTag(R.id.testing_id_view_tag_key);
        if (tag == null) {
            tag = view.getTag();
        }
        if (tag instanceof String) {
            String str = (String) tag;
            if (str.length() > 0) {
                printWriter.print(" app:tag/");
                printWriter.print(str.replace(' ', '_'));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0531, code lost:
        if (r4 != false) goto L_0x0533;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        if (r1.canScrollHorizontally(1) != false) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0535  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x057d A[Catch:{ Exception -> 0x0590 }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x05b6  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0632  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x067a  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x069b  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0524 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:264:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x019b A[Catch:{ Exception -> 0x0232 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ac A[Catch:{ Exception -> 0x0232 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c0 A[Catch:{ Exception -> 0x0232 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(android.view.View r44, java.io.PrintWriter r45, java.lang.String r46, int r47, int r48, boolean r49, boolean r50, boolean r51, boolean r52, boolean r53) {
        /*
            r43 = this;
            r0 = r45
            r42 = r46
            r1 = r42
            r0.print(r1)
            r1 = r44
            if (r44 != 0) goto L_0x0013
            java.lang.String r1 = "null"
            r0.println(r1)
        L_0x0012:
            return
        L_0x0013:
            java.lang.Class r20 = r1.getClass()
            java.lang.String r2 = r20.getName()
            r0.print(r2)
            java.lang.String r2 = "{"
            r0.print(r2)
            int r2 = r1.hashCode()
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r0.print(r2)
            java.lang.String r8 = " "
            r0.print(r8)
            int r3 = r1.getVisibility()
            java.lang.String r9 = "V"
            java.lang.String r4 = "."
            if (r3 == 0) goto L_0x0139
            r2 = 4
            if (r3 == r2) goto L_0x0132
            r2 = 8
            if (r3 == r2) goto L_0x012f
            r0.print(r4)
        L_0x0047:
            boolean r3 = r1.isFocusable()
            java.lang.String r6 = "F"
            r2 = r4
            if (r3 == 0) goto L_0x0051
            r2 = r6
        L_0x0051:
            r0.print(r2)
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L_0x012c
            java.lang.String r2 = "E"
        L_0x005c:
            r0.print(r2)
            r0.print(r4)
            boolean r3 = r1.isHorizontalScrollBarEnabled()
            r2 = 1
            r7 = -1
            java.lang.String r5 = "H"
            if (r3 != 0) goto L_0x0079
            boolean r3 = r1.canScrollHorizontally(r7)
            if (r3 != 0) goto L_0x0079
            boolean r10 = r1.canScrollHorizontally(r2)
            r3 = r4
            if (r10 == 0) goto L_0x007a
        L_0x0079:
            r3 = r5
        L_0x007a:
            r0.print(r3)
            boolean r3 = r1.isVerticalScrollBarEnabled()
            if (r3 != 0) goto L_0x0090
            boolean r3 = r1.canScrollVertically(r7)
            if (r3 != 0) goto L_0x0090
            boolean r3 = r1.canScrollVertically(r2)
            if (r3 != 0) goto L_0x0090
            r9 = r4
        L_0x0090:
            r0.print(r9)
            boolean r3 = r1.isClickable()
            if (r3 == 0) goto L_0x0129
            java.lang.String r3 = "C"
        L_0x009b:
            r0.print(r3)
            boolean r3 = r1.isLongClickable()
            if (r3 == 0) goto L_0x0126
            java.lang.String r3 = "L"
        L_0x00a6:
            r0.print(r3)
            r0.print(r8)
            boolean r3 = r1.isFocused()
            if (r3 != 0) goto L_0x00b3
            r6 = r4
        L_0x00b3:
            r0.print(r6)
            boolean r3 = r1.isSelected()
            if (r3 == 0) goto L_0x0124
            java.lang.String r3 = "S"
        L_0x00be:
            r0.print(r3)
            boolean r3 = r1.isHovered()
            if (r3 != 0) goto L_0x00c8
            r5 = r4
        L_0x00c8:
            r0.print(r5)
            boolean r3 = r1.isActivated()
            if (r3 == 0) goto L_0x0122
            java.lang.String r3 = "A"
        L_0x00d3:
            r0.print(r3)
            boolean r3 = r1.isDirty()
            if (r3 == 0) goto L_0x00de
            java.lang.String r4 = "D"
        L_0x00de:
            r0.print(r4)
            r16 = 2
            r3 = r16
            int[] r9 = new int[r3]
            r1.getLocationOnScreen(r9)
            r0.print(r8)
            r3 = 0
            r4 = r9[r3]
            int r4 = r4 - r47
            r0.print(r4)
            java.lang.String r6 = ","
            r0.print(r6)
            r4 = r9[r2]
            int r4 = r4 - r48
            r0.print(r4)
            java.lang.String r4 = "-"
            r0.print(r4)
            r5 = r9[r3]
            int r4 = r1.getWidth()
            int r5 = r5 + r4
            int r5 = r5 - r47
            r0.print(r5)
            r0.print(r6)
            r5 = r9[r2]
            int r4 = r1.getHeight()
            int r5 = r5 + r4
            int r5 = r5 - r48
            r0.print(r5)
            goto L_0x013e
        L_0x0122:
            r3 = r4
            goto L_0x00d3
        L_0x0124:
            r3 = r4
            goto L_0x00be
        L_0x0126:
            r3 = r4
            goto L_0x00a6
        L_0x0129:
            r3 = r4
            goto L_0x009b
        L_0x012c:
            r2 = r4
            goto L_0x005c
        L_0x012f:
            java.lang.String r2 = "G"
            goto L_0x0134
        L_0x0132:
            java.lang.String r2 = "I"
        L_0x0134:
            r0.print(r2)
            goto L_0x0047
        L_0x0139:
            r0.print(r9)
            goto L_0x0047
        L_0x013e:
            int r6 = r1.getId()     // Catch:{ Exception -> 0x0191 }
            if (r6 == r7) goto L_0x018d
            java.lang.String r4 = " #"
            r0.append(r4)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r4 = java.lang.Integer.toHexString(r6)     // Catch:{ Exception -> 0x0191 }
            r0.append(r4)     // Catch:{ Exception -> 0x0191 }
            android.content.res.Resources r5 = r1.getResources()     // Catch:{ Exception -> 0x0191 }
            if (r6 <= 0) goto L_0x018d
            if (r5 == 0) goto L_0x018d
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r7 = r7 & r6
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r7 == r4) goto L_0x0167
            r4 = 2130706432(0x7f000000, float:1.7014118E38)
            if (r7 == r4) goto L_0x0164
            goto L_0x016a
        L_0x0164:
            java.lang.String r4 = "app"
            goto L_0x016e
        L_0x0167:
            java.lang.String r4 = "android"
            goto L_0x016e
        L_0x016a:
            java.lang.String r4 = r5.getResourcePackageName(r6)     // Catch:{ Exception -> 0x0191 }
        L_0x016e:
            r0.print(r8)     // Catch:{ Exception -> 0x0191 }
            r0.print(r4)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r4 = ":"
            r0.print(r4)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r4 = r5.getResourceTypeName(r6)     // Catch:{ Exception -> 0x0191 }
            r0.print(r4)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r4 = "/"
            r0.print(r4)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r4 = r5.getResourceEntryName(r6)     // Catch:{ Exception -> 0x0191 }
            r0.print(r4)     // Catch:{ Exception -> 0x0191 }
            goto L_0x0194
        L_0x018d:
            A02(r1, r0)     // Catch:{ Exception -> 0x0191 }
            goto L_0x0194
        L_0x0191:
            A02(r1, r0)
        L_0x0194:
            r5 = 0
            r25 = r53
            boolean r4 = r1 instanceof android.widget.TextView     // Catch:{ Exception -> 0x0232 }
            if (r4 == 0) goto L_0x01c0
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ Exception -> 0x0232 }
            java.lang.CharSequence r4 = r4.getText()     // Catch:{ Exception -> 0x0232 }
            java.lang.String r5 = r4.toString()     // Catch:{ Exception -> 0x0232 }
        L_0x01a6:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0232 }
            if (r4 != 0) goto L_0x0232
            java.lang.String r4 = " text=\""
            r0.print(r4)     // Catch:{ Exception -> 0x0232 }
            r4 = 600(0x258, float:8.41E-43)
            java.lang.String r4 = A01(r5, r4)     // Catch:{ Exception -> 0x0232 }
            r0.print(r4)     // Catch:{ Exception -> 0x0232 }
            java.lang.String r4 = "\""
            r0.print(r4)     // Catch:{ Exception -> 0x0232 }
            goto L_0x0232
        L_0x01c0:
            java.lang.String r6 = r20.getSimpleName()     // Catch:{ Exception -> 0x0232 }
            java.lang.String r4 = "RCTextView"
            boolean r4 = r6.equals(r4)     // Catch:{ Exception -> 0x0232 }
            if (r4 == 0) goto L_0x01e9
            java.lang.reflect.Method r5 = A07     // Catch:{ Exception -> 0x0232 }
            if (r5 != 0) goto L_0x01dc
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0232 }
            java.lang.String r5 = "getText"
            r4 = r20
            java.lang.reflect.Method r5 = r4.getDeclaredMethod(r5, r6)     // Catch:{ Exception -> 0x0232 }
            A07 = r5     // Catch:{ Exception -> 0x0232 }
        L_0x01dc:
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0232 }
            java.lang.Object r4 = r5.invoke(r1, r4)     // Catch:{ Exception -> 0x0232 }
            if (r4 == 0) goto L_0x020e
            java.lang.String r5 = r4.toString()     // Catch:{ Exception -> 0x0232 }
            goto L_0x01a6
        L_0x01e9:
            java.lang.String r4 = "GlyphView"
            boolean r4 = r6.equals(r4)     // Catch:{ Exception -> 0x0232 }
            if (r4 == 0) goto L_0x0210
            java.lang.reflect.Method r5 = A06     // Catch:{ Exception -> 0x0232 }
            if (r5 != 0) goto L_0x0201
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0232 }
            java.lang.String r5 = "getText"
            r4 = r20
            java.lang.reflect.Method r5 = r4.getDeclaredMethod(r5, r6)     // Catch:{ Exception -> 0x0232 }
            A06 = r5     // Catch:{ Exception -> 0x0232 }
        L_0x0201:
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0232 }
            java.lang.Object r4 = r5.invoke(r1, r4)     // Catch:{ Exception -> 0x0232 }
            if (r4 == 0) goto L_0x020e
            java.lang.String r5 = r4.toString()     // Catch:{ Exception -> 0x0232 }
            goto L_0x01a6
        L_0x020e:
            r5 = 0
            goto L_0x01a6
        L_0x0210:
            java.lang.CharSequence r4 = r1.getContentDescription()     // Catch:{ Exception -> 0x0232 }
            if (r4 == 0) goto L_0x021c
            if (r53 != 0) goto L_0x021c
            java.lang.String r5 = r4.toString()     // Catch:{ Exception -> 0x0232 }
        L_0x021c:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0232 }
            if (r4 == 0) goto L_0x01a6
            java.lang.Object r4 = r1.getTag()     // Catch:{ Exception -> 0x0232 }
            if (r4 == 0) goto L_0x01a6
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0232 }
            java.lang.String r5 = r4.trim()     // Catch:{ Exception -> 0x0232 }
            goto L_0x01a6
        L_0x0232:
            r22 = r50
            if (r50 == 0) goto L_0x050d
            java.lang.reflect.Field r4 = X.VJV.A00
            android.view.accessibility.AccessibilityNodeInfo r14 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            r1.onInitializeAccessibilityNodeInfo(r14)     // Catch:{ NullPointerException -> 0x0240 }
            goto L_0x0247
        L_0x0240:
            if (r14 == 0) goto L_0x050d
            r14.recycle()
            goto L_0x050d
        L_0x0247:
            if (r14 == 0) goto L_0x050d
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            r8 = 50
            boolean r4 = r1 instanceof android.widget.TextView     // Catch:{ Exception -> 0x04ec }
            if (r4 == 0) goto L_0x027d
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "textColor"
            android.content.res.ColorStateList r4 = r7.getTextColors()     // Catch:{ Exception -> 0x04ec }
            int r4 = r4.getDefaultColor()     // Catch:{ Exception -> 0x04ec }
            r9.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r6 = "textSize"
            float r4 = r7.getTextSize()     // Catch:{ Exception -> 0x04ec }
            double r4 = (double) r4     // Catch:{ Exception -> 0x04ec }
            r9.put(r6, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r6 = "hint"
            java.lang.CharSequence r5 = r7.getHint()     // Catch:{ Exception -> 0x04ec }
            r4 = 100
            java.lang.String r4 = A01(r5, r4)     // Catch:{ Exception -> 0x04ec }
            r9.put(r6, r4)     // Catch:{ Exception -> 0x04ec }
        L_0x027d:
            java.lang.reflect.Field r4 = X.VJV.A00     // Catch:{ Exception -> 0x0324 }
            if (r4 != 0) goto L_0x028e
            java.lang.Class<android.view.View> r5 = android.view.View.class
            java.lang.String r4 = "mKeyedTags"
            java.lang.reflect.Field r4 = r5.getDeclaredField(r4)     // Catch:{ Exception -> 0x0324 }
            X.VJV.A00 = r4     // Catch:{ Exception -> 0x0324 }
            r4.setAccessible(r2)     // Catch:{ Exception -> 0x0324 }
        L_0x028e:
            java.lang.reflect.Field r4 = X.VJV.A00     // Catch:{ Exception -> 0x0324 }
            java.lang.Object r11 = r4.get(r1)     // Catch:{ Exception -> 0x0324 }
            android.util.SparseArray r11 = (android.util.SparseArray) r11     // Catch:{ Exception -> 0x0324 }
            if (r11 == 0) goto L_0x0324
            int r4 = r11.size()     // Catch:{ Exception -> 0x0324 }
            if (r4 <= 0) goto L_0x0324
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Exception -> 0x0324 }
            r12.<init>()     // Catch:{ Exception -> 0x0324 }
            r10 = 0
            int r19 = r11.size()     // Catch:{ Exception -> 0x031f }
        L_0x02a8:
            r4 = r19
            if (r10 >= r4) goto L_0x031f
            android.content.res.Resources r4 = r1.getResources()     // Catch:{ Exception -> 0x031f }
            int r7 = r11.keyAt(r10)     // Catch:{ Exception -> 0x031f }
            if (r4 != 0) goto L_0x02c1
            java.lang.String r5 = "#"
            java.lang.String r4 = java.lang.Integer.toHexString(r7)     // Catch:{ NotFoundException -> 0x030b }
            java.lang.String r5 = X.002.A0R(r5, r4)     // Catch:{ NotFoundException -> 0x030b }
            goto L_0x0315
        L_0x02c1:
            int r5 = r7 >>> 24
            r13 = r5 & 255(0xff, float:3.57E-43)
            r5 = 127(0x7f, float:1.78E-43)
            java.lang.String r6 = ""
            if (r13 == r5) goto L_0x0308
            java.lang.String r6 = r4.getResourcePackageName(r7)     // Catch:{ NotFoundException -> 0x030b }
            java.lang.String r18 = ":"
        L_0x02d1:
            java.lang.String r17 = r4.getResourceTypeName(r7)     // Catch:{ NotFoundException -> 0x030b }
            java.lang.String r15 = r4.getResourceEntryName(r7)     // Catch:{ NotFoundException -> 0x030b }
            int r4 = r6.length()     // Catch:{ NotFoundException -> 0x030b }
            int r5 = r4 + 1
            int r4 = r18.length()     // Catch:{ NotFoundException -> 0x030b }
            int r5 = r5 + r4
            int r4 = r17.length()     // Catch:{ NotFoundException -> 0x030b }
            int r5 = r5 + r4
            int r4 = r5 + 1
            int r5 = r15.length()     // Catch:{ NotFoundException -> 0x030b }
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NotFoundException -> 0x030b }
            r5.<init>(r4)     // Catch:{ NotFoundException -> 0x030b }
            java.lang.String r13 = "@"
            r4 = r18
            X.Pxg.A1P(r13, r6, r4, r5)     // Catch:{ NotFoundException -> 0x030b }
            r4 = r17
            r5.append(r4)     // Catch:{ NotFoundException -> 0x030b }
            java.lang.String r4 = "/"
            java.lang.String r5 = X.Pxg.A0s(r4, r15, r5)     // Catch:{ NotFoundException -> 0x030b }
            goto L_0x0315
        L_0x0308:
            r18 = r6
            goto L_0x02d1
        L_0x030b:
            java.lang.String r4 = "#"
            java.lang.String r5 = java.lang.Integer.toHexString(r7)     // Catch:{ Exception -> 0x031f }
            java.lang.String r5 = X.002.A0R(r4, r5)     // Catch:{ Exception -> 0x031f }
        L_0x0315:
            java.lang.Object r4 = r11.valueAt(r10)     // Catch:{ JSONException -> 0x031c }
            r12.put(r5, r4)     // Catch:{ JSONException -> 0x031c }
        L_0x031c:
            int r10 = r10 + 1
            goto L_0x02a8
        L_0x031f:
            java.lang.String r4 = "keyedTags"
            r9.put(r4, r12)     // Catch:{ Exception -> 0x04ec }
        L_0x0324:
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Exception -> 0x04ec }
            r5.<init>()     // Catch:{ Exception -> 0x04ec }
            java.util.List r4 = r14.getActionList()     // Catch:{ Exception -> 0x04ec }
            java.util.Iterator r6 = r4.iterator()     // Catch:{ Exception -> 0x04ec }
        L_0x0331:
            boolean r4 = r6.hasNext()     // Catch:{ Exception -> 0x04ec }
            if (r4 == 0) goto L_0x034d
            java.lang.Object r4 = r6.next()     // Catch:{ Exception -> 0x04ec }
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r4 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r4     // Catch:{ Exception -> 0x04ec }
            java.lang.CharSequence r4 = r4.getLabel()     // Catch:{ Exception -> 0x04ec }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x04ec }
            if (r4 == 0) goto L_0x0331
            java.lang.String r4 = A01(r4, r8)     // Catch:{ Exception -> 0x04ec }
            r5.put(r4)     // Catch:{ Exception -> 0x04ec }
            goto L_0x0331
        L_0x034d:
            int r4 = r5.length()     // Catch:{ Exception -> 0x04ec }
            if (r4 <= 0) goto L_0x0358
            java.lang.String r4 = "actions"
            r9.put(r4, r5)     // Catch:{ Exception -> 0x04ec }
        L_0x0358:
            java.lang.CharSequence r4 = r14.getContentDescription()     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = A01(r4, r8)     // Catch:{ Exception -> 0x04ec }
            if (r5 == 0) goto L_0x036d
            int r4 = r5.length()     // Catch:{ Exception -> 0x04ec }
            if (r4 <= 0) goto L_0x036d
            java.lang.String r4 = "content-description"
            r9.put(r4, r5)     // Catch:{ Exception -> 0x04ec }
        L_0x036d:
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x04ec }
            r11.<init>()     // Catch:{ Exception -> 0x04ec }
            android.graphics.drawable.Drawable r10 = r1.getBackground()     // Catch:{ Exception -> 0x04ec }
            boolean r4 = r10 instanceof android.graphics.drawable.ColorDrawable     // Catch:{ Exception -> 0x04ec }
            java.lang.String r7 = "alpha"
            if (r4 == 0) goto L_0x03a3
            android.graphics.drawable.ColorDrawable r10 = (android.graphics.drawable.ColorDrawable) r10     // Catch:{ Exception -> 0x04ec }
            int r4 = r10.getAlpha()     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r11.put(r7, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "color"
            int r4 = r10.getColor()     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "level"
            int r4 = r10.getLevel()     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r5 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r4 = "opacity"
            int r6 = r10.getOpacity()     // Catch:{ Exception -> 0x04ec }
            r5.put(r4, r6)     // Catch:{ Exception -> 0x04ec }
        L_0x03a3:
            java.lang.String r5 = "accessibility-focused"
            boolean r4 = r14.isAccessibilityFocused()     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r5 = r9.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            float r4 = r1.getAlpha()     // Catch:{ Exception -> 0x04ec }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r5 = r5.put(r7, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r4 = "background"
            org.json.JSONObject r6 = r5.put(r4, r11)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "checkable"
            boolean r4 = r14.isCheckable()     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "checked"
            boolean r4 = r14.isChecked()     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "class-name"
            java.lang.CharSequence r4 = r14.getClassName()     // Catch:{ Exception -> 0x04ec }
            java.lang.String r4 = A01(r4, r8)     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "clickable"
            boolean r4 = r14.isClickable()     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "content-invalid"
            boolean r4 = r14.isContentInvalid()     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "dismissable"
            boolean r4 = r14.isDismissable()     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "editable"
            boolean r4 = r14.isEditable()     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "elevation"
            float r4 = r1.getElevation()     // Catch:{ Exception -> 0x04ec }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "enabled"
            boolean r4 = r14.isEnabled()     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "focusable"
            boolean r4 = r14.isFocusable()     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "focused"
            boolean r4 = r14.isFocused()     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "height"
            int r4 = r1.getHeight()     // Catch:{ Exception -> 0x04ec }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "is-layout-requested"
            boolean r4 = r1.isLayoutRequested()     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "long-clickable"
            boolean r4 = r14.isLongClickable()     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "multiline"
            boolean r4 = r14.isMultiLine()     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "measured-height"
            int r4 = r1.getMeasuredWidth()     // Catch:{ Exception -> 0x04ec }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "measured-width"
            int r4 = r1.getMeasuredHeight()     // Catch:{ Exception -> 0x04ec }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "password"
            boolean r4 = r14.isPassword()     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "scrollable"
            boolean r4 = r14.isScrollable()     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "selected"
            boolean r4 = r14.isSelected()     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "translation-x"
            float r4 = r1.getTranslationX()     // Catch:{ Exception -> 0x04ec }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "translation-y"
            float r4 = r1.getTranslationY()     // Catch:{ Exception -> 0x04ec }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "visible-to-user"
            boolean r4 = r14.isVisibleToUser()     // Catch:{ Exception -> 0x04ec }
            org.json.JSONObject r6 = r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            java.lang.String r5 = "width"
            int r4 = r1.getWidth()     // Catch:{ Exception -> 0x04ec }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x04ec }
            r6.put(r5, r4)     // Catch:{ Exception -> 0x04ec }
            boolean r5 = r14.isContextClickable()     // Catch:{ Exception -> 0x04ec }
            java.lang.String r4 = "context-clickable"
            org.json.JSONObject r6 = r9.put(r4, r5)     // Catch:{ Exception -> 0x04ec }
            int r5 = r14.getDrawingOrder()     // Catch:{ Exception -> 0x04ec }
            java.lang.String r4 = "drawing-order"
            org.json.JSONObject r6 = r6.put(r4, r5)     // Catch:{ Exception -> 0x04ec }
            boolean r5 = r14.isImportantForAccessibility()     // Catch:{ Exception -> 0x04ec }
            java.lang.String r4 = "important-for-accessibility"
            r6.put(r4, r5)     // Catch:{ Exception -> 0x04ec }
            goto L_0x04fa
        L_0x04ec:
            r4 = move-exception
            java.lang.String r5 = "DUMP-ERROR"
            java.lang.String r4 = r4.getMessage()     // Catch:{ JSONException -> 0x04fa }
            java.lang.String r4 = A01(r4, r8)     // Catch:{ JSONException -> 0x04fa }
            r9.put(r5, r4)     // Catch:{ JSONException -> 0x04fa }
        L_0x04fa:
            java.lang.String r4 = " props=\""
            java.io.PrintWriter r5 = r0.append(r4)
            java.lang.String r4 = r9.toString()
            java.io.PrintWriter r5 = r5.append(r4)
            java.lang.String r4 = "\""
            r5.append(r4)
        L_0x050d:
            java.lang.String r4 = "}"
            r0.println(r4)
            r6 = r20
        L_0x0514:
            java.lang.String r5 = r6.getName()
            java.lang.String r4 = "com.facebook.litho.BaseMountingView"
            boolean r4 = r5.equals(r4)
            r5 = r43
            r23 = r51
            if (r4 == 0) goto L_0x0535
            java.lang.String r4 = "exclude_litho_props"
            java.lang.String r4 = com.facebook.endtoend.EndToEnd.A00(r4, r2, r2)
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            if (r50 == 0) goto L_0x0533
            r11 = 1
            if (r4 == 0) goto L_0x053c
        L_0x0533:
            r11 = 0
            goto L_0x053c
        L_0x0535:
            java.lang.Class r6 = r6.getSuperclass()
            if (r6 == 0) goto L_0x05ae
            goto L_0x0514
        L_0x053c:
            java.lang.reflect.Method r4 = r5.A01     // Catch:{ Exception -> 0x0590 }
            if (r4 != 0) goto L_0x055e
            java.lang.String r4 = "com.facebook.litho.LithoViewTestHelper"
            java.lang.Class r9 = java.lang.Class.forName(r4)     // Catch:{ Exception -> 0x0590 }
            java.lang.String r4 = "com.facebook.litho.DebugComponentDescriptionHelper$ExtraDescription"
            java.lang.Class r10 = java.lang.Class.forName(r4)     // Catch:{ Exception -> 0x0590 }
            java.lang.String r8 = "viewToStringForE2E"
            java.lang.Class<android.view.View> r7 = android.view.View.class
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0590 }
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0590 }
            java.lang.Class[] r4 = new java.lang.Class[]{r7, r6, r4, r10}     // Catch:{ Exception -> 0x0590 }
            java.lang.reflect.Method r4 = r9.getDeclaredMethod(r8, r4)     // Catch:{ Exception -> 0x0590 }
            r5.A01 = r4     // Catch:{ Exception -> 0x0590 }
        L_0x055e:
            if (r51 == 0) goto L_0x056b
            java.lang.String r4 = "com.facebook.analytics.adslogging.context.trackingnodedumper.LogContextTrackingNodeDumper"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ Exception -> 0x056b }
            java.lang.Object r9 = r4.newInstance()     // Catch:{ Exception -> 0x056b }
            goto L_0x056c
        L_0x056b:
            r9 = 0
        L_0x056c:
            java.lang.reflect.Method r8 = r5.A01     // Catch:{ Exception -> 0x0590 }
            r7 = 0
            int r4 = r42.length()     // Catch:{ Exception -> 0x0590 }
            int r4 = r4 / r16
            int r4 = r4 + 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0590 }
            if (r9 == 0) goto L_0x057e
            r11 = 0
        L_0x057e:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x0590 }
            java.lang.Object[] r4 = new java.lang.Object[]{r1, r6, r4, r9}     // Catch:{ Exception -> 0x0590 }
            java.lang.Object r4 = r8.invoke(r7, r4)     // Catch:{ Exception -> 0x0590 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0590 }
            r0.append(r4)     // Catch:{ Exception -> 0x0590 }
            goto L_0x05ae
        L_0x0590:
            r8 = move-exception
            r4 = r42
            java.io.PrintWriter r6 = r0.append(r4)
            java.lang.String r4 = "Failed litho view sub hierarch dump: "
            java.io.PrintWriter r7 = r6.append(r4)
            java.lang.String r6 = r8.getMessage()
            r4 = 100
            java.lang.String r4 = A01(r6, r4)
            java.io.PrintWriter r4 = r7.append(r4)
            r4.println()
        L_0x05ae:
            java.lang.String r11 = "  "
            r21 = r49
            r24 = r52
            if (r52 == 0) goto L_0x062e
            java.lang.Class[] r8 = r20.getInterfaces()
            int r9 = r8.length
            r7 = 0
        L_0x05bc:
            if (r7 >= r9) goto L_0x062e
            r4 = r8[r7]
            java.lang.String r6 = r4.getName()
            java.lang.String r4 = "androidx.compose.ui.platform.ViewRootForTest"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x05d5
            r4 = r42
            java.lang.String r35 = X.002.A0R(r4, r11)
            X.VLR r8 = r5.A04
            goto L_0x05d8
        L_0x05d5:
            int r7 = r7 + 1
            goto L_0x05bc
        L_0x05d8:
            java.lang.reflect.Method r4 = r5.A00     // Catch:{ Exception -> 0x062e }
            if (r4 != 0) goto L_0x0600
            java.lang.String r4 = "com.facebook.compose.dumpsys.ComposeDumpHelper"
            java.lang.Class r6 = java.lang.Class.forName(r4)     // Catch:{ Exception -> 0x062e }
            java.lang.String r4 = "dump"
            java.lang.Class<java.io.PrintWriter> r26 = java.io.PrintWriter.class
            java.lang.Class<android.view.View> r27 = android.view.View.class
            java.lang.Class<java.lang.String> r28 = java.lang.String.class
            java.lang.Class r29 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x062e }
            java.lang.Class r31 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x062e }
            java.lang.Class<X.VLR> r34 = X.VLR.class
            r30 = r29
            r32 = r31
            r33 = r31
            java.lang.Class[] r7 = new java.lang.Class[]{r26, r27, r28, r29, r30, r31, r32, r33, r34}     // Catch:{ Exception -> 0x062e }
            java.lang.reflect.Method r4 = r6.getMethod(r4, r7)     // Catch:{ Exception -> 0x062e }
            r5.A00 = r4     // Catch:{ Exception -> 0x062e }
        L_0x0600:
            r6 = 0
            java.lang.Integer r36 = java.lang.Integer.valueOf(r47)     // Catch:{ Exception -> 0x062e }
            java.lang.Integer r37 = java.lang.Integer.valueOf(r48)     // Catch:{ Exception -> 0x062e }
            java.lang.Boolean r38 = java.lang.Boolean.valueOf(r21)     // Catch:{ Exception -> 0x062e }
            java.lang.Boolean r39 = java.lang.Boolean.valueOf(r22)     // Catch:{ Exception -> 0x062e }
            java.lang.Boolean r40 = java.lang.Boolean.valueOf(r23)     // Catch:{ Exception -> 0x062e }
            r33 = r0
            r34 = r1
            r41 = r8
            java.lang.Object[] r7 = new java.lang.Object[]{r33, r34, r35, r36, r37, r38, r39, r40, r41}     // Catch:{ Exception -> 0x062e }
            java.lang.Object r6 = r4.invoke(r6, r7)     // Catch:{ Exception -> 0x062e }
            boolean r4 = r6 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x062e }
            if (r4 == 0) goto L_0x0012
            boolean r4 = X.AnonymousClass7TE.A1a(r6)     // Catch:{ Exception -> 0x062e }
            if (r4 == 0) goto L_0x062e
            goto L_0x06a0
        L_0x062e:
            boolean r4 = r1 instanceof android.webkit.WebView
            if (r4 == 0) goto L_0x069b
            r10 = r1
            android.webkit.WebView r10 = (android.webkit.WebView) r10
        L_0x0635:
            if (r49 == 0) goto L_0x066d
            if (r10 == 0) goto L_0x066d
            X.VQg r9 = r5.A02
            X.Vsk r8 = new X.Vsk
            r8.<init>(r10)
            java.util.Set r4 = r9.A01
            r4.add(r8)
            android.util.DisplayMetrics r4 = X.C13988Tno.A0F(r10)
            int r6 = r8.A01
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            int r6 = r8.A02
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            float r4 = r4.scaledDensity
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Object[] r6 = new java.lang.Object[]{r7, r6, r4}
            java.lang.String r4 = "(function() {  try {    const leftOf = %d;    const topOf = %d;    const density = %f;    const elements = Array.from(document.querySelectorAll('body, body *'));    for (const el of elements) {      const rect = el.getBoundingClientRect();      const left = Math.round(leftOf + rect.left * density);      const top = Math.round(topOf + rect.top * density);      const width = Math.round(rect.width * density);      const height = Math.round(rect.height * density);      el.setAttribute('data-rect', `${left},${top},${width},${height}`);      const style = window.getComputedStyle(el);      const hidden = style.display === 'none' || style.visibility !== 'visible' || el.getAttribute('hidden') === 'true';      const disabled = el.disabled || el.getAttribute('aria-disabled') === 'true';      const focused = el === document.activeElement;      if (hidden || disabled || focused) {        el.setAttribute('data-flag', `${hidden ? 'H' : ''}${disabled ? 'D' : ''}${focused ? 'F' : ''}`);      } else {        el.removeAttribute('data-flag');      }    }    document.activeElement.setAttribute('focused', 'true');    const doc = document.cloneNode(true);    for (const el of Array.from(doc.querySelectorAll('script, link'))) {      el.remove();    }    for (const el of Array.from(doc.querySelectorAll('*'))) {      el.removeAttribute('class');    }    return doc.getElementsByTagName('body')[0].outerHTML.trim();  } catch (e) {    return 'Failed: ' + e;  }})();"
            java.lang.String r6 = java.lang.String.format(r4, r6)
            X.WCb r4 = new X.WCb
            r4.<init>(r8, r9)
            r10.evaluateJavascript(r6, r4)
        L_0x066d:
            boolean r4 = r1 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x0012
            r7 = r1
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r6 = r7.getChildCount()
            if (r6 <= 0) goto L_0x0012
            r4 = r42
            java.lang.String r18 = X.002.A0R(r4, r11)
            r4 = r16
            int[] r4 = new int[r4]
            r1.getLocationOnScreen(r4)
            r1 = 0
        L_0x0688:
            android.view.View r16 = r7.getChildAt(r1)
            r19 = r4[r3]
            r20 = r4[r2]
            r15 = r5
            r17 = r0
            r15.A04(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            int r1 = r1 + 1
            if (r1 >= r6) goto L_0x0012
            goto L_0x0688
        L_0x069b:
            android.webkit.WebView r10 = A00(r1)
            goto L_0x0635
        L_0x06a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W2D.A04(android.view.View, java.io.PrintWriter, java.lang.String, int, int, boolean, boolean, boolean, boolean, boolean):void");
    }
}
