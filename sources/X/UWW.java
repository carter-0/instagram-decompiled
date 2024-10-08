package X;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.instagram.android.R;

public final class UWW extends W1m {
    public static final int[] A01 = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    public final AccessibilityManager A00;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r1 == -1) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        r8 = (android.view.ViewGroup) r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063 A[EDGE_INSN: B:25:0x0063->B:21:0x0063 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.UWW A00(android.view.View r8, java.lang.CharSequence r9) {
        /*
            r1 = 0
        L_0x0001:
            boolean r0 = r8 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r0 != 0) goto L_0x0063
            boolean r0 = r8 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L_0x0015
            int r1 = r8.getId()
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            if (r1 == r0) goto L_0x0063
            r1 = r8
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L_0x0015:
            android.view.ViewParent r8 = r8.getParent()
            boolean r0 = r8 instanceof android.view.View
            if (r0 == 0) goto L_0x0021
            android.view.View r8 = (android.view.View) r8
            if (r8 != 0) goto L_0x0001
        L_0x0021:
            r8 = r1
        L_0x0022:
            if (r8 == 0) goto L_0x0066
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r7)
            int[] r0 = A01
            android.content.res.TypedArray r5 = r7.obtainStyledAttributes(r0)
            r4 = 0
            r3 = -1
            int r2 = r5.getResourceId(r4, r3)
            r0 = 1
            int r1 = r5.getResourceId(r0, r3)
            r5.recycle()
            if (r2 == r3) goto L_0x0047
            r0 = 2131627904(0x7f0e0f80, float:1.8883086E38)
            if (r1 != r3) goto L_0x004a
        L_0x0047:
            r0 = 2131624803(0x7f0e0363, float:1.8876796E38)
        L_0x004a:
            android.view.View r0 = r6.inflate(r0, r8, r4)
            com.google.android.material.snackbar.SnackbarContentLayout r0 = (com.google.android.material.snackbar.SnackbarContentLayout) r0
            X.UWW r1 = new X.UWW
            r1.<init>(r7, r0, r8, r0)
            X.U4W r0 = r1.A09
            android.view.View r0 = r0.getChildAt(r4)
            com.google.android.material.snackbar.SnackbarContentLayout r0 = (com.google.android.material.snackbar.SnackbarContentLayout) r0
            android.widget.TextView r0 = r0.A01
            r0.setText(r9)
            return r1
        L_0x0063:
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            goto L_0x0022
        L_0x0066:
            java.lang.String r1 = "No suitable parent found from the given view. Please provide a valid view."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UWW.A00(android.view.View, java.lang.CharSequence):X.UWW");
    }

    public final int A03() {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.A00.getRecommendedTimeoutMillis(0, 3);
        }
        return 0;
    }

    public UWW(Context context, View view, ViewGroup viewGroup, X1B x1b) {
        super(context, view, viewGroup, x1b);
        this.A00 = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }
}
