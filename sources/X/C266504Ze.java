package X;

import android.view.View;

/* renamed from: X.4Ze  reason: invalid class name and case insensitive filesystem */
public final class C266504Ze implements Runnable {
    public final /* synthetic */ View A00;

    public C266504Ze(View view) {
        this.A00 = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat(android.view.accessibility.AccessibilityNodeInfo.obtain());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r3.onInitializeAccessibilityNodeInfo(r1.mInfo);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
        if (X.C266894aW.A01(r3, r1) == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006d, code lost:
        if (r1.mInfo.getChildCount() <= 0) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0076, code lost:
        if (r1.mInfo.isVisibleToUser() == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007c, code lost:
        if (X.C266894aW.A02(r3, r1) == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0084, code lost:
        if (r1.mInfo.getChildCount() <= 0) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008a, code lost:
        if (X.C266894aW.A03(r3, r1) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0093, code lost:
        if (r1.mInfo.getCollectionInfo() != null) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009d, code lost:
        if (android.text.TextUtils.isEmpty(r1.getText()) == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a9, code lost:
        if (android.text.TextUtils.isEmpty(r1.mInfo.getContentDescription()) != false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00af, code lost:
        if (X.C266894aW.A00(r3) != false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            java.lang.String r0 = "ViewAccessibilityHelper.setAccessibilityFocusRunnable"
            X.0lp r5 = X.0lq.A00(r0)
            android.view.View r3 = r6.A00     // Catch:{ all -> 0x00bc }
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch:{ all -> 0x00bc }
            r2.<init>()     // Catch:{ all -> 0x00bc }
        L_0x000d:
            boolean r0 = r3 instanceof android.view.ViewGroup     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x0025
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3     // Catch:{ all -> 0x00bc }
            int r1 = r3.getChildCount()     // Catch:{ all -> 0x00bc }
        L_0x0017:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0025
            android.view.View r0 = r3.getChildAt(r1)     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x0017
            r2.addFirst(r0)     // Catch:{ all -> 0x00bc }
            goto L_0x0017
        L_0x0025:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x00bc }
            if (r0 != 0) goto L_0x00b4
            java.lang.Object r3 = r2.removeFirst()     // Catch:{ all -> 0x00bc }
            android.view.View r3 = (android.view.View) r3     // Catch:{ all -> 0x00bc }
            if (r3 == 0) goto L_0x000d
            int r1 = r3.getImportantForAccessibility()     // Catch:{ all -> 0x00bc }
            r0 = 2
            if (r1 == r0) goto L_0x000d
            r4 = 4
            if (r1 == r4) goto L_0x000d
            android.view.ViewParent r1 = r3.getParent()     // Catch:{ all -> 0x00bc }
        L_0x0041:
            boolean r0 = r1 instanceof android.view.View     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x0053
            r0 = r1
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x00bc }
            int r0 = r0.getImportantForAccessibility()     // Catch:{ all -> 0x00bc }
            if (r0 == r4) goto L_0x000d
            android.view.ViewParent r1 = r1.getParent()     // Catch:{ all -> 0x00bc }
            goto L_0x0041
        L_0x0053:
            android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain()     // Catch:{  }
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r1 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat     // Catch:{  }
            r1.<init>(r0)     // Catch:{  }
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo     // Catch:{ IllegalArgumentException -> 0x000d }
            r3.onInitializeAccessibilityNodeInfo(r0)     // Catch:{ IllegalArgumentException -> 0x000d }
            boolean r0 = X.C266894aW.A01(r3, r1)     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x0070
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo     // Catch:{ all -> 0x00bc }
            int r0 = r0.getChildCount()     // Catch:{ all -> 0x00bc }
            if (r0 <= 0) goto L_0x0070
            goto L_0x000d
        L_0x0070:
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo     // Catch:{ all -> 0x00b2 }
            boolean r0 = r0.isVisibleToUser()     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x000d
            boolean r0 = X.C266894aW.A02(r3, r1)     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x008d
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo     // Catch:{ all -> 0x00b2 }
            int r0 = r0.getChildCount()     // Catch:{ all -> 0x00b2 }
            if (r0 <= 0) goto L_0x00b5
            boolean r0 = X.C266894aW.A03(r3, r1)     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x000d
            goto L_0x00b5
        L_0x008d:
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo     // Catch:{ all -> 0x00b2 }
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r0 = r0.getCollectionInfo()     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x000d
            java.lang.CharSequence r0 = r1.getText()     // Catch:{ all -> 0x00b2 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x00ab
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.mInfo     // Catch:{ all -> 0x00b2 }
            java.lang.CharSequence r0 = r0.getContentDescription()     // Catch:{ all -> 0x00b2 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x000d
        L_0x00ab:
            boolean r0 = X.C266894aW.A00(r3)     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x000d
            goto L_0x00b5
        L_0x00b2:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00bc }
        L_0x00b4:
            r3 = 0
        L_0x00b5:
            X.2eQ.A02(r3)     // Catch:{ all -> 0x00bc }
            r5.close()
            return
        L_0x00bc:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x00c1 }
            throw r1
        L_0x00c1:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C266504Ze.run():void");
    }
}
