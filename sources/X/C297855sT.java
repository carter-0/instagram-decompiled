package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.instagram.android.R;

/* renamed from: X.5sT  reason: invalid class name and case insensitive filesystem */
public abstract class C297855sT {
    public static final int[] A00 = {R.attr.colorPrimary};
    public static final int[] A01 = {R.attr.colorPrimaryVariant};

    public static void A01(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C297865sU.A0e, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                A03(context, "Theme.MaterialComponents", A01);
            }
        }
        A03(context, "Theme.AppCompat", A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r6.getResourceId(0, -1) != -1) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.content.Context r7, android.util.AttributeSet r8, int[] r9, int[] r10, int r11, int r12) {
        /*
            int[] r0 = X.C297865sU.A0e
            android.content.res.TypedArray r6 = r7.obtainStyledAttributes(r8, r0, r11, r12)
            r0 = 2
            r5 = 0
            boolean r0 = r6.getBoolean(r0, r5)
            if (r0 != 0) goto L_0x0012
            r6.recycle()
        L_0x0011:
            return
        L_0x0012:
            int r4 = r10.length
            if (r4 != 0) goto L_0x002a
            r1 = -1
            int r0 = r6.getResourceId(r5, r1)
            if (r0 == r1) goto L_0x001d
        L_0x001c:
            r5 = 1
        L_0x001d:
            r6.recycle()
            if (r5 != 0) goto L_0x0011
            java.lang.String r1 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x002a:
            android.content.res.TypedArray r3 = r7.obtainStyledAttributes(r8, r9, r11, r12)
            r2 = 0
        L_0x002f:
            r0 = r10[r2]
            r1 = -1
            int r0 = r3.getResourceId(r0, r1)
            if (r0 != r1) goto L_0x003c
            r3.recycle()
            goto L_0x001d
        L_0x003c:
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x002f
            r3.recycle()
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C297855sT.A02(android.content.Context, android.util.AttributeSet, int[], int[], int, int):void");
    }

    public static TypedArray A00(Context context, AttributeSet attributeSet, int[] iArr, int[] iArr2, int i, int i2) {
        A01(context, attributeSet, i, i2);
        A02(context, attributeSet, iArr, iArr2, i, i2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static void A03(Context context, String str, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(0)) {
            obtainStyledAttributes.recycle();
            throw new IllegalArgumentException(002.A0g("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        } else {
            obtainStyledAttributes.recycle();
        }
    }
}
