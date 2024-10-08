package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.List;

/* renamed from: X.4aW  reason: invalid class name and case insensitive filesystem */
public abstract class C266894aW {
    public static boolean A00(View view) {
        ViewParent parentForAccessibility = view.getParentForAccessibility();
        if (parentForAccessibility instanceof View) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain());
            View view2 = (View) parentForAccessibility;
            view2.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat.mInfo);
            if (A01(view2, accessibilityNodeInfoCompat) && accessibilityNodeInfoCompat.mInfo.getChildCount() > 0) {
                return false;
            }
            if (A02(view2, accessibilityNodeInfoCompat) || A00(view2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A02(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        View view2;
        Integer A00;
        if (!accessibilityNodeInfoCompat.mInfo.isVisibleToUser()) {
            return false;
        }
        if (!accessibilityNodeInfoCompat.mInfo.isClickable() && !accessibilityNodeInfoCompat.mInfo.isLongClickable() && !accessibilityNodeInfoCompat.mInfo.isFocusable()) {
            List actionList = accessibilityNodeInfoCompat.getActionList();
            actionList.getClass();
            if (!actionList.contains(16) && !actionList.contains(32) && !actionList.contains(1)) {
                View view3 = (View) view.getParentForAccessibility();
                if (view3 == null) {
                    return false;
                }
                if (!accessibilityNodeInfoCompat.mInfo.isScrollable()) {
                    List actionList2 = accessibilityNodeInfoCompat.getActionList();
                    actionList2.getClass();
                    if (!actionList2.contains(4096) && !actionList2.contains(8192) && !(((view2 = (View) view3.getParentForAccessibility()) != null && 2eS.A00(view2) == AnonymousClass05K.A1I) || (A00 = 2eS.A00(view3)) == AnonymousClass05K.A1F || A00 == AnonymousClass05K.A0j || A00 == AnonymousClass05K.A0O || A00 == AnonymousClass05K.A0P)) {
                        return false;
                    }
                }
                return A03(view, accessibilityNodeInfoCompat);
            }
        }
        return true;
    }

    public static boolean A03(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        boolean z = false;
        0lp A00 = 0lq.A00("AccessibilityEvaluationUtil.isSpeakingNode");
        try {
            int importantForAccessibility = view.getImportantForAccessibility();
            if (importantForAccessibility != 4 && (importantForAccessibility != 2 || accessibilityNodeInfoCompat.mInfo.getChildCount() > 0)) {
                if (!accessibilityNodeInfoCompat.mInfo.isCheckable()) {
                    if (accessibilityNodeInfoCompat.mInfo.getCollectionInfo() == null) {
                        if (TextUtils.isEmpty(accessibilityNodeInfoCompat.getText())) {
                            if (!TextUtils.isEmpty(accessibilityNodeInfoCompat.mInfo.getContentDescription())) {
                            }
                        }
                    }
                }
                z = true;
                A00.close();
                return z;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != null) {
                        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain());
                        childAt.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat2.mInfo);
                        if (accessibilityNodeInfoCompat2.mInfo.isVisibleToUser() && !A02(childAt, accessibilityNodeInfoCompat2) && A03(childAt, accessibilityNodeInfoCompat2)) {
                            break;
                        }
                    }
                    i++;
                }
                z = true;
            }
            A00.close();
            return z;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                C9153RRe.A00(th, th2);
                throw th;
            }
        }
    }

    public static boolean A01(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Window window = null;
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                window = ((Activity) context).getWindow();
            }
        }
        if (window == null) {
            return false;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.x;
        int i2 = attributes.y;
        Rect rect = new Rect(i, i2, i + attributes.width, attributes.height + i2);
        Rect rect2 = new Rect();
        accessibilityNodeInfoCompat.mInfo.getBoundsInScreen(rect2);
        return rect.equals(rect2);
    }
}
