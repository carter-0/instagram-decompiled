package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;

public abstract class W38 {
    public static final void A01(Activity activity) {
        A04(activity, (Drawable) null, (X8Y) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2131974228, false, false);
    }

    public static final void A02(Activity activity, int i) {
        0qQ.A0B(activity, 0);
        A03(activity, i);
    }

    public static final void A03(Activity activity, int i) {
        A04(activity, (Drawable) null, (X8Y) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, i, false, false);
    }

    public static final void A04(Activity activity, Drawable drawable, X8Y x8y, Integer num, Integer num2, Integer num3, Integer num4, int i, boolean z, boolean z2) {
        int i2;
        0qQ.A0B(activity, 0);
        Resources resources = activity.getResources();
        String A0e = AnonymousClass7TF.A0e(resources, AnonymousClass7TF.A0d(resources, i), 2131974920);
        0qQ.A07(A0e);
        C358248ab r1 = new C358248ab(activity);
        r1.A0q(A0e);
        if (num3 != null) {
            i2 = num3.intValue();
        } else {
            i2 = 2131974918;
        }
        r1.A0I(new W5R(2, (Object) activity, (Object) x8y, (Object) num4), i2);
        r1.A0s(z2);
        r1.A0B(new W4V(x8y, 2));
        W5b.A00(r1, x8y, 4);
        r1.A0g(new C18844W5n(x8y, 7));
        if (z) {
            r1.A0C(new W5U(x8y, 30));
        }
        if (num != null) {
            r1.A05 = resources.getString(num.intValue());
        }
        if (num2 != null) {
            r1.A0q(resources.getString(num2.intValue()));
        }
        if (drawable != null) {
            r1.A0j(drawable);
        }
        DbT.A1V(r1);
    }

    public static final void A06(Activity activity, Integer num) {
        0qQ.A0B(activity, 0);
        A07(activity, num, Pxd.A00(31));
    }

    public static final Dialog A00(Activity activity, X8Y x8y, int i, boolean z) {
        Resources resources = activity.getResources();
        String A0e = AnonymousClass7TF.A0e(resources, AnonymousClass7TF.A0d(resources, i), 2131974920);
        0qQ.A07(A0e);
        C358248ab r3 = new C358248ab(activity);
        r3.A0q(A0e);
        r3.A0I(new C18833W4v(10, activity, x8y), 2131974918);
        r3.A0r(z);
        r3.A0s(z);
        r3.A0B(new W4V(x8y, 1));
        W5b.A00(r3, x8y, 3);
        r3.A0g(new C18844W5n(x8y, 6));
        return r3.A02();
    }

    public static final void A05(Activity activity, X8Y x8y) {
        0qQ.A0B(activity, 0);
        A04(activity, (Drawable) null, x8y, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2131965506, false, false);
    }

    public static final void A07(Activity activity, Integer num, String str) {
        Uri A09 = DbT.A09(002.A0R("package:", activity.getPackageName()));
        Intent intent = new Intent(str);
        intent.setData(A09);
        if (num != null) {
            0kR.A08(activity, intent, num.intValue());
        } else {
            0kR.A0D(activity, intent);
        }
    }
}
