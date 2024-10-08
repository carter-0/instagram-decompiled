package X;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.Map;

public final class UF6 extends C14284TtI {
    public static final String[] A01 = {"android:visibility:visibility", "android:visibility:parent"};
    public int A00 = 3;

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.Va3] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (r9 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (r5.A01 == 0) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        if (r1 == 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006c, code lost:
        if (r5.A03 == null) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C17550Va3 A01(X.C14286TtK r8, X.C14286TtK r9) {
        /*
            X.Va3 r5 = new X.Va3
            r5.<init>()
            r6 = 0
            r5.A05 = r6
            r5.A04 = r6
            java.lang.String r7 = "android:visibility:parent"
            r4 = 0
            r3 = -1
            java.lang.String r2 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x0072
            java.util.Map r1 = r8.A02
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x0072
            int r0 = X.Pxg.A06(r2, r1)
            r5.A01 = r0
            java.lang.Object r0 = r1.get(r7)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5.A03 = r0
        L_0x0028:
            if (r9 == 0) goto L_0x006f
            java.util.Map r1 = r9.A02
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x006f
            int r0 = X.Pxg.A06(r2, r1)
            r5.A00 = r0
            java.lang.Object r4 = r1.get(r7)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
        L_0x003e:
            r5.A02 = r4
            r3 = 1
            if (r8 == 0) goto L_0x0050
            if (r9 == 0) goto L_0x0056
            int r2 = r5.A01
            int r1 = r5.A00
            if (r2 != r1) goto L_0x005f
            android.view.ViewGroup r0 = r5.A03
            if (r0 != r4) goto L_0x005f
        L_0x004f:
            return r5
        L_0x0050:
            int r0 = r5.A00
            if (r0 == 0) goto L_0x0065
            if (r9 != 0) goto L_0x004f
        L_0x0056:
            int r0 = r5.A01
            if (r0 != 0) goto L_0x004f
        L_0x005a:
            r5.A04 = r6
        L_0x005c:
            r5.A05 = r3
            return r5
        L_0x005f:
            if (r2 == r1) goto L_0x0068
            if (r2 == 0) goto L_0x005a
            if (r1 != 0) goto L_0x004f
        L_0x0065:
            r5.A04 = r3
            goto L_0x005c
        L_0x0068:
            if (r4 == 0) goto L_0x005a
            android.view.ViewGroup r0 = r5.A03
            if (r0 != 0) goto L_0x004f
            goto L_0x0065
        L_0x006f:
            r5.A00 = r3
            goto L_0x003e
        L_0x0072:
            r5.A01 = r3
            r5.A03 = r4
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UF6.A01(X.TtK, X.TtK):X.Va3");
    }

    public static void A02(C14286TtK ttK) {
        View view = ttK.A00;
        int visibility = view.getVisibility();
        Map map = ttK.A02;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public final ObjectAnimator A0d(View view, C14286TtK ttK, C14286TtK ttK2) {
        Number A14;
        Property property = C17158VKk.A00;
        float f = 1.0f;
        Number A142 = C51966G9m.A14("android:fade:transitionAlpha", ttK.A02);
        if (A142 != null) {
            f = A142.floatValue();
        }
        if (f == 0.0f) {
            float f2 = 1.0f;
            if (!(ttK2 == null || (A14 = C51966G9m.A14("android:fade:transitionAlpha", ttK2.A02)) == null)) {
                f2 = A14.floatValue();
            }
            C17158VKk.A02.A03(view, f2);
            return null;
        }
        C17158VKk.A02.A03(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C17158VKk.A01, new float[]{0.0f});
        U0O u0o = new U0O(view);
        ofFloat.addListener(u0o);
        A07().A0A(u0o);
        return ofFloat;
    }
}
