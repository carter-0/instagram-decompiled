package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;

/* renamed from: X.0od  reason: invalid class name */
public abstract class AnonymousClass0od {
    public static final float A00(Context context, float f, int i) {
        float f2;
        if (!C61670oa.A02()) {
            return f;
        }
        float A01 = 0nA.A01(context, (float) i);
        if (A01 > 0.0f && A01 <= 40.0f) {
            f2 = 1.8f;
        } else if (A01 <= 56.0f) {
            f2 = 2.3f;
        } else if (A01 <= 64.0f) {
            f2 = 2.7f;
        } else if (A01 <= 64.0f) {
            return 0.0f;
        } else {
            f2 = 3.2f;
        }
        return C61380mr.A00(context, f2);
    }

    public static final float A01(Context context, float f, int i) {
        float f2;
        if (!C61670oa.A02()) {
            return f;
        }
        float A01 = 0nA.A01(context, (float) i);
        if (A01 > 0.0f && A01 <= 40.0f) {
            f2 = 1.8f;
        } else if (A01 <= 56.0f) {
            f2 = 2.3f;
        } else if (A01 <= 64.0f) {
            f2 = 2.7f;
        } else if (A01 <= 64.0f) {
            return 0.0f;
        } else {
            f2 = 3.2f;
        }
        return C61380mr.A00(context, f2);
    }

    public static final float A02(Context context, int i) {
        float f;
        boolean A02 = C61670oa.A02();
        Resources resources = context.getResources();
        if (!A02) {
            return resources.getDimension(R.dimen.account_recs_header_image_margin);
        }
        float A01 = 0nA.A01(context, resources.getDimension(i));
        if (A01 > 0.0f && A01 <= 40.0f) {
            f = 1.8f;
        } else if (A01 <= 56.0f) {
            f = 2.3f;
        } else if (A01 <= 64.0f) {
            f = 2.7f;
        } else if (A01 <= 64.0f) {
            return 0.0f;
        } else {
            f = 3.2f;
        }
        return C61380mr.A00(context, f);
    }

    public static final float A03(Context context, int i, int i2) {
        float f;
        boolean A02 = C61670oa.A02();
        Resources resources = context.getResources();
        if (!A02) {
            return resources.getDimension(i2);
        }
        float A01 = 0nA.A01(context, resources.getDimension(i));
        if (A01 > 0.0f && A01 <= 40.0f) {
            f = 1.8f;
        } else if (A01 <= 56.0f) {
            f = 2.3f;
        } else if (A01 <= 64.0f) {
            f = 2.7f;
        } else if (A01 <= 64.0f) {
            return 0.0f;
        } else {
            f = 3.2f;
        }
        return C61380mr.A00(context, f);
    }

    public static final float A04(Context context, int i, int i2) {
        float f;
        boolean A02 = C61670oa.A02();
        Resources resources = context.getResources();
        if (!A02) {
            return resources.getDimension(i2);
        }
        float A01 = 0nA.A01(context, resources.getDimension(i));
        if (A01 > 0.0f && A01 <= 40.0f) {
            f = 8.0f;
        } else if (A01 <= 56.0f) {
            f = 10.0f;
        } else if (A01 <= 64.0f) {
            f = 12.0f;
        } else if (A01 <= 64.0f) {
            return 0.0f;
        } else {
            f = 14.0f;
        }
        return C61380mr.A00(context, A01 + f);
    }

    public static final int A05(Context context, int i, int i2) {
        float f;
        if (!C61670oa.A02()) {
            return i2;
        }
        float A01 = 0nA.A01(context, (float) i);
        if (A01 > 0.0f && A01 <= 40.0f) {
            f = 8.0f;
        } else if (A01 <= 56.0f) {
            f = 10.0f;
        } else if (A01 <= 64.0f) {
            f = 12.0f;
        } else if (A01 <= 64.0f) {
            return 0;
        } else {
            f = 14.0f;
        }
        return (int) C61380mr.A00(context, A01 + f);
    }
}
