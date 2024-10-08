package X;

import android.view.View;

/* renamed from: X.4Zi  reason: invalid class name and case insensitive filesystem */
public abstract class C266524Zi {
    public static int A00(View view, View view2, AnonymousClass3BB r4, C252553pI r5, AnonymousClass3AW r6, boolean z) {
        if (r5.A0T() == 0 || r6.A00() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(C252553pI.A06(view) - C252553pI.A06(view2)) + 1;
        }
        return Math.min(r4.A07(), r4.A08(view2) - r4.A0D(view));
    }

    public static int A01(View view, View view2, AnonymousClass3BB r5, C252553pI r6, AnonymousClass3AW r7, boolean z) {
        int A00;
        if (r6.A0T() == 0 || (A00 = r7.A00()) == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return A00;
        }
        return (int) ((((float) (r5.A08(view2) - r5.A0D(view))) / ((float) (Math.abs(C252553pI.A06(view) - C252553pI.A06(view2)) + 1))) * ((float) r7.A00()));
    }

    public static int A02(View view, View view2, AnonymousClass3BB r6, C252553pI r7, AnonymousClass3AW r8, boolean z, boolean z2) {
        int max;
        if (r7.A0T() == 0 || r8.A00() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(C252553pI.A06(view), C252553pI.A06(view2));
        int max2 = Math.max(C252553pI.A06(view), C252553pI.A06(view2));
        if (z2) {
            max = Math.max(0, (r8.A00() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(r6.A08(view2) - r6.A0D(view))) / ((float) (Math.abs(C252553pI.A06(view) - C252553pI.A06(view2)) + 1)))) + ((float) (r6.A06() - r6.A0D(view))));
    }
}
