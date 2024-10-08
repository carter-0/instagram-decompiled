package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;

/* renamed from: X.90O  reason: invalid class name */
public final class AnonymousClass90O implements Cloneable {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02 = 0.0f;
    public float A03 = Float.MAX_VALUE;
    public float A04 = 1.0f;
    public float A05 = 0.0f;
    public float A06 = 0.0f;
    public float A07 = 0.0f;
    public float A08 = 0.0f;
    public int A09 = -1;
    public int A0A = 0;
    public int A0B = 0;
    public int A0C = 0;
    public int A0D = 0;
    public int A0E = -16776961;
    public int A0F = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A0G = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A0H = -1;
    public int A0I = Integer.MAX_VALUE;
    public int A0J = Integer.MAX_VALUE;
    public int A0K = -1;
    public int A0L = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A0M = 0;
    public int A0N = -7829368;
    public int A0O = -16777216;
    public int A0P = -1;
    public int A0Q = Typeface.DEFAULT.getStyle();
    public ColorStateList A0R;
    public Typeface A0S;
    public TextUtils.TruncateAt A0T;
    public C245253cZ A0U;
    public AnonymousClass90N A0V = AnonymousClass90N.TEXT_START;
    public C3727192c A0W = null;
    public AnonymousClass90P A0X = AnonymousClass90P.TOP;
    public CharSequence A0Y;
    public String A0Z;
    public boolean A0a = true;
    public boolean A0b = false;
    public boolean A0c;
    public boolean A0d = false;
    public boolean A0e = false;

    public static void A01(AnonymousClass90O r2, Integer num) {
        AnonymousClass90N r0;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                r0 = AnonymousClass90N.CENTER;
            } else if (intValue == 8388611 || intValue != 8388613) {
                r0 = AnonymousClass90N.TEXT_START;
            } else {
                r0 = AnonymousClass90N.TEXT_END;
            }
            r2.A0V = r0;
        }
    }

    public static AnonymousClass90O A00(Context context) {
        AnonymousClass90O A022 = AnonymousClass90M.A01(context).A02();
        A022.A0d = true;
        A022.A0A = 0;
        return A022;
    }

    public final AnonymousClass90O A02() {
        try {
            return (AnonymousClass90O) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
