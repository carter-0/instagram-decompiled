package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.instagram.android.R;

public final class U7K extends 02Z {
    public final void A0S(View view, AccessibilityEvent accessibilityEvent) {
        boolean A08;
        View childAt;
        ReadableMap readableMap;
        U7K.super.A0S(view, accessibilityEvent);
        boolean z = view instanceof U5c;
        if (z || (view instanceof C14727U4v)) {
            ReadableMap readableMap2 = (ReadableMap) view.getTag(R.id.accessibility_collection);
            if (readableMap2 != null) {
                accessibilityEvent.setItemCount(readableMap2.getInt("itemCount"));
                if (view instanceof ViewGroup) {
                    View childAt2 = ((ViewGroup) view).getChildAt(0);
                    if (childAt2 instanceof ViewGroup) {
                        Integer num = null;
                        Integer num2 = null;
                        int i = 0;
                        while (true) {
                            ViewGroup viewGroup = (ViewGroup) childAt2;
                            if (i < viewGroup.getChildCount()) {
                                View childAt3 = viewGroup.getChildAt(i);
                                if (z) {
                                    A08 = ((U5c) view).A04(childAt3);
                                } else if (view instanceof C14727U4v) {
                                    A08 = ((C14727U4v) view).A08(childAt3);
                                } else {
                                    return;
                                }
                                ReadableMap readableMap3 = (ReadableMap) childAt3.getTag(R.id.accessibility_collection_item);
                                if (childAt3 instanceof ViewGroup) {
                                    ViewGroup viewGroup2 = (ViewGroup) childAt3;
                                    if (viewGroup2.getChildCount() > 0 && readableMap3 == null && (childAt = viewGroup2.getChildAt(0)) != null && (readableMap = (ReadableMap) childAt.getTag(R.id.accessibility_collection_item)) != null) {
                                        readableMap3 = readableMap;
                                    }
                                    if (A08 && readableMap3 != null) {
                                        if (num == null) {
                                            num = Integer.valueOf(readableMap3.getInt("itemIndex"));
                                        }
                                        num2 = Integer.valueOf(readableMap3.getInt("itemIndex"));
                                    }
                                    if (!(num == null || num2 == null)) {
                                        accessibilityEvent.setFromIndex(num.intValue());
                                        accessibilityEvent.setToIndex(num2.intValue());
                                    }
                                    i++;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
        } else {
            ReactSoftExceptionLogger.logSoftException("ReactScrollViewAccessibilityDelegate", new RuntimeException(002.A0R("ReactScrollViewAccessibilityDelegate should only be used with ReactScrollView or ReactHorizontalScrollView, not with class: ", C51968G9o.A16(view))));
        }
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        boolean z;
        U7K.super.A0Y(view, accessibilityNodeInfoCompat);
        boolean z2 = view instanceof U5c;
        if (z2 || (view instanceof C14727U4v)) {
            C16684Uze A00 = C16684Uze.A00(view);
            if (A00 != null) {
                C14750U7h.A01(view.getContext(), accessibilityNodeInfoCompat, A00);
            }
            ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_collection);
            if (readableMap != null) {
                accessibilityNodeInfoCompat.mInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(readableMap.getInt("rowCount"), readableMap.getInt("columnCount"), readableMap.getBoolean("hierarchical")));
            }
            if (z2) {
                z = ((U5c) view).A0E;
            } else if (view instanceof C14727U4v) {
                z = ((C14727U4v) view).A0C;
            } else {
                return;
            }
            accessibilityNodeInfoCompat.mInfo.setScrollable(z);
            return;
        }
        ReactSoftExceptionLogger.logSoftException("ReactScrollViewAccessibilityDelegate", new RuntimeException(002.A0R("ReactScrollViewAccessibilityDelegate should only be used with ReactScrollView or ReactHorizontalScrollView, not with class: ", C51968G9o.A16(view))));
    }
}
