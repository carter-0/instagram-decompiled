package X;

import android.graphics.Rect;
import android.graphics.RectF;

public abstract class JW0 {
    public static Rect A01(int i, int i2) {
        return A02(new Rect(0, 0, i, i2));
    }

    public static Rect A03(Rect rect, float f, int i, int i2, int i3) {
        if (i3 % 180 == 0) {
            return A04(rect, f, i, i2, i3);
        }
        return A04(rect, 1.0f / f, i, i2, i3);
    }

    public static Rect A05(RectF rectF) {
        return new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public static RectF A07(Rect rect) {
        return new RectF((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
    }

    public static AnonymousClass34S A09(float f, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5;
        int i6;
        if (i3 % 180 != 0) {
            int i7 = i2;
            i2 = i;
            i = i7;
        }
        if (z2 || i > i2) {
            if (z) {
                f = Math.min(((float) i) / ((float) i2), 1.91f);
            }
            float f2 = (float) i4;
            if (f >= 1.0f) {
                i5 = (int) (f2 / f);
            } else {
                int i8 = (int) (f2 * f);
                i5 = i4;
                i4 = i8;
            }
            i6 = i4;
            i4 = i5;
        } else {
            i6 = (int) (((float) i4) * f);
        }
        return new AnonymousClass34S(Integer.valueOf(i6), Integer.valueOf(i4));
    }

    public static Rect A00(float f, int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        Rect A0W = AnonymousClass7TE.A0W();
        int i6 = i3 % 180;
        if (i6 != 0) {
            int i7 = i2;
            i2 = i;
            i = i7;
        }
        float f2 = (float) i;
        float f3 = (float) i2;
        float f4 = f2 / f3;
        if (i > i2) {
            if (z) {
                f = Math.min(f4, 1.91f);
            }
            int i8 = (int) (f3 * f);
            int i9 = (i - i8) / 2;
            i4 = Math.max(i9, 0);
            A0W.left = i4;
            A0W.top = 0;
            i5 = Math.min(i9 + i8, i);
        } else if (f4 > f) {
            int i10 = (int) (f3 * f);
            i4 = (i - i10) / 2;
            A0W.left = i4;
            A0W.top = 0;
            i5 = i10 + i4;
        } else {
            if (f4 < f) {
                int i11 = (int) (f2 / f);
                A0W.left = 0;
                int i12 = (i2 - i11) / 2;
                A0W.top = i12;
                A0W.right = i;
                int i13 = i11 + i12;
                A0W.bottom = i13;
                if (i6 != 0) {
                    A0W.left = i12;
                    A0W.top = 0;
                    A0W.right = i13;
                }
                return A0W;
            }
            A0W = new Rect(0, 0, i, i2);
            if (i6 != 0) {
                A0W.right = i2;
            }
            return A0W;
            A0W.bottom = i;
            return A0W;
        }
        A0W.right = i5;
        A0W.bottom = i2;
        if (i6 != 0) {
            A0W.top = i4;
            A0W.left = 0;
            A0W.bottom = i5;
            A0W.right = i2;
        }
        return A0W;
    }

    public static Rect A02(Rect rect) {
        if (rect.width() == rect.height()) {
            return new Rect(rect);
        }
        if (rect.width() > rect.height()) {
            int width = rect.left + ((rect.width() - rect.height()) / 2);
            return new Rect(width, rect.top, rect.height() + width, rect.bottom);
        }
        int height = rect.top + ((rect.height() - rect.width()) / 2);
        return new Rect(rect.left, height, rect.right, rect.width() + height);
    }

    public static Rect A04(Rect rect, float f, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Rect A0W = AnonymousClass7TE.A0W();
        if (i > i2) {
            int i9 = (rect.left + rect.right) / 2;
            i6 = (int) (((float) i2) * f);
            if (i6 > i) {
                i5 = (int) (((float) i) / f);
                i6 = i;
            } else {
                i5 = i2;
            }
            int i10 = i6 / 2;
            i8 = i9 - i10;
            int i11 = i9 + i10;
            if (i8 < 0) {
                i11 = i6;
                i8 = 0;
            } else if (i11 > i) {
                i8 = i - i6;
                i11 = i;
            }
            A0W.left = i8;
            A0W.right = i11;
            A0W.top = 0;
            i7 = 0;
            A0W.bottom = i5;
        } else {
            int i12 = (rect.top + rect.bottom) / 2;
            int i13 = (int) (((float) i) / f);
            if (i13 > i2) {
                i4 = (int) (((float) i2) * f);
                i13 = i2;
            } else {
                i4 = i;
            }
            int i14 = i5 / 2;
            i7 = i12 - i14;
            int i15 = i12 + i14;
            if (i7 < 0) {
                i15 = i5;
                i7 = 0;
            } else if (i15 > i2) {
                i7 = i2 - i5;
                i15 = i2;
            }
            A0W.left = 0;
            i8 = 0;
            A0W.right = i6;
            A0W.top = i7;
            A0W.bottom = i15;
        }
        if (i3 == 90 || i3 == 270) {
            int i16 = i - i8;
            A0W.right = i16;
            int i17 = i2 - i7;
            A0W.bottom = i17;
            A0W.left = i16 - i6;
            A0W.top = i17 - i5;
        }
        return A0W;
    }

    public static Rect A06(RectF rectF, int i, int i2, int i3, int i4) {
        Rect A0W = AnonymousClass7TE.A0W();
        double d = ((double) i) / ((double) i3);
        int round = (int) Math.round(((double) rectF.left) * d);
        A0W.left = round;
        int round2 = (int) Math.round(((double) rectF.right) * d);
        A0W.right = round2;
        double d2 = ((double) i2) / ((double) i4);
        int round3 = (int) Math.round(((double) rectF.top) * d2);
        A0W.top = round3;
        int round4 = (int) Math.round(((double) rectF.bottom) * d2);
        A0W.bottom = round4;
        A0W.left = Math.max(0, round);
        A0W.right = Math.min(i, round2);
        A0W.top = Math.max(0, round3);
        A0W.bottom = Math.min(i2, round4);
        return A0W;
    }

    public static RectF A08(Rect rect, int i, int i2) {
        RectF A0Y = AnonymousClass7TE.A0Y();
        float f = 1.0f / ((float) i);
        float f2 = ((float) rect.left) * f;
        A0Y.left = f2;
        float f3 = ((float) rect.right) * f;
        A0Y.right = f3;
        float f4 = 1.0f / ((float) i2);
        float f5 = ((float) rect.top) * f4;
        A0Y.top = f5;
        float f6 = ((float) rect.bottom) * f4;
        A0Y.bottom = f6;
        A0Y.left = Math.max(0.0f, f2);
        A0Y.right = Math.min(1.0f, f3);
        A0Y.top = Math.max(0.0f, f5);
        A0Y.bottom = Math.min(1.0f, f6);
        return A0Y;
    }
}
