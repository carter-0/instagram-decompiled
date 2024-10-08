package X;

import android.app.Activity;
import android.view.Window;
import com.instagram.android.R;

/* renamed from: X.2uJ  reason: invalid class name */
public abstract class AnonymousClass2uJ {
    public static int A00;
    public static int A01;
    public static Integer A02;
    public static Integer A03;

    public static void A02(Activity activity) {
        Integer num = A02;
        if (num == null) {
            num = Integer.valueOf(activity.getColor(R.color.igds_transparent_navigation_bar));
            A02 = num;
        }
        A04(activity, num.intValue());
        A06(activity, false);
    }

    public static int A00(Activity activity) {
        activity.getClass();
        Window window = activity.getWindow();
        window.getClass();
        return window.getNavigationBarColor();
    }

    public static void A01(Activity activity) {
        int color;
        if (!AnonymousClass1GD.A03()) {
            Integer num = A03;
            if (num == null) {
                if (activity.getClass().getName().equals("com.instagram.mainactivity.InstagramMainActivity")) {
                    color = 2Yu.A0F(activity, 16843858);
                } else {
                    color = activity.getColor(2Yu.A0C(activity));
                }
                num = Integer.valueOf(color);
                A03 = num;
            }
            A04(activity, num.intValue());
            A06(activity, true);
            return;
        }
        A02(activity);
    }

    public static void A03(Activity activity) {
        Window window = activity.getWindow();
        window.getClass();
        window.addFlags(134217728);
        window.addFlags(AnonymousClass972.MUTABLE_FLAG_MASK);
    }

    public static void A04(Activity activity, int i) {
        if (0lz.A02(activity)) {
            A05(activity, i);
        }
        while (activity.getParent() != null) {
            activity = activity.getParent();
        }
        Window window = activity.getWindow();
        window.getClass();
        window.addFlags(AnonymousClass972.MUTABLE_FLAG_MASK);
        window.setNavigationBarColor(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r5 == r3) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(android.app.Activity r4, int r5) {
        /*
            r0 = 2131100482(0x7f060342, float:1.7813347E38)
            int r3 = r4.getColor(r0)
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            int r2 = r4.getColor(r0)
        L_0x000e:
            android.app.Activity r0 = r4.getParent()
            if (r0 == 0) goto L_0x0019
            android.app.Activity r4 = r4.getParent()
            goto L_0x000e
        L_0x0019:
            android.view.Window r1 = r4.getWindow()
            r1.getClass()
            if (r5 == r2) goto L_0x0025
            r0 = 1
            if (r5 != r3) goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r1.setNavigationBarContrastEnforced(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2uJ.A05(android.app.Activity, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (X.AnonymousClass1GD.A03() != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(android.app.Activity r2, boolean r3) {
        /*
            android.view.Window r1 = r2.getWindow()
            r1.getClass()
            android.view.View r0 = r1.getDecorView()
            X.04n r2 = new X.04n
            r2.<init>(r0, r1)
            if (r3 == 0) goto L_0x0019
            boolean r0 = X.AnonymousClass1GD.A03()
            r1 = 1
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            X.04l r0 = r2.A00
            r0.A04(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2uJ.A06(android.app.Activity, boolean):void");
    }
}
