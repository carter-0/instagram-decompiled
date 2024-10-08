package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.WeakHashMap;

/* renamed from: X.90M  reason: invalid class name */
public abstract class AnonymousClass90M {
    public static final AnonymousClass90N A00 = AnonymousClass90N.TEXT_START;
    public static final WeakHashMap A01 = new WeakHashMap();
    public static final TextUtils.TruncateAt[] A02 = TextUtils.TruncateAt.values();

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r1 != 8388613) goto L_0x0003;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        return X.AnonymousClass90N.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0029, code lost:
        return X.AnonymousClass90N.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0032, code lost:
        return X.AnonymousClass90N.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        return A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass90N A00(int r0, int r1) {
        /*
            switch(r0) {
                case 0: goto L_0x0006;
                case 1: goto L_0x0006;
                case 2: goto L_0x0021;
                case 3: goto L_0x001e;
                case 4: goto L_0x0030;
                case 5: goto L_0x0027;
                case 6: goto L_0x0024;
                default: goto L_0x0003;
            }
        L_0x0003:
            X.90N r0 = A00
            return r0
        L_0x0006:
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r1 & r0
            r0 = 1
            if (r1 == r0) goto L_0x0030
            r0 = 3
            if (r1 == r0) goto L_0x002d
            r0 = 5
            if (r1 == r0) goto L_0x002a
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r1 == r0) goto L_0x0027
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r1 == r0) goto L_0x0024
            goto L_0x0003
        L_0x001e:
            X.90N r0 = X.AnonymousClass90N.TEXT_END
            return r0
        L_0x0021:
            X.90N r0 = X.AnonymousClass90N.TEXT_START
            return r0
        L_0x0024:
            X.90N r0 = X.AnonymousClass90N.LAYOUT_END
            return r0
        L_0x0027:
            X.90N r0 = X.AnonymousClass90N.LAYOUT_START
            return r0
        L_0x002a:
            X.90N r0 = X.AnonymousClass90N.RIGHT
            return r0
        L_0x002d:
            X.90N r0 = X.AnonymousClass90N.LEFT
            return r0
        L_0x0030:
            X.90N r0 = X.AnonymousClass90N.CENTER
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass90M.A00(int, int):X.90N");
    }

    public static AnonymousClass90O A01(Context context) {
        AnonymousClass90O r4;
        Resources.Theme theme = context.getTheme();
        WeakHashMap weakHashMap = A01;
        synchronized (weakHashMap) {
            r4 = (AnonymousClass90O) weakHashMap.get(theme);
        }
        if (r4 != null) {
            return r4;
        }
        AnonymousClass90O r42 = new AnonymousClass90O();
        1KZ.A01("LoadTextStyle");
        Resources.Theme theme2 = context.getTheme();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, AnonymousClass90Q.A01, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            TypedArray obtainStyledAttributes2 = theme2.obtainStyledAttributes(resourceId, AnonymousClass90Q.A00);
            A02(obtainStyledAttributes2, r42);
            obtainStyledAttributes2.recycle();
        }
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes((AttributeSet) null, AnonymousClass90Q.A02, 0, 0);
        int resourceId2 = obtainStyledAttributes3.getResourceId(0, -1);
        obtainStyledAttributes3.recycle();
        if (resourceId2 != -1) {
            TypedArray obtainStyledAttributes4 = theme2.obtainStyledAttributes(resourceId2, AnonymousClass90Q.A00);
            A02(obtainStyledAttributes4, r42);
            obtainStyledAttributes4.recycle();
        }
        1KZ.A00();
        synchronized (weakHashMap) {
            weakHashMap.put(theme, r42);
        }
        return r42;
    }

    public static void A02(TypedArray typedArray, AnonymousClass90O r10) {
        AnonymousClass90P r0;
        int indexCount = typedArray.getIndexCount();
        int i = 1;
        int i2 = 0;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArray.getIndex(i3);
            if (index == 2) {
                r10.A0R = typedArray.getColorStateList(index);
                r10.A0O = 0;
            } else if (index == 0) {
                r10.A0P = typedArray.getDimensionPixelSize(index, 0);
            } else if (index == 5) {
                int integer = typedArray.getInteger(index, 0);
                if (integer > 0) {
                    r10.A0T = A02[integer - 1];
                }
            } else if (index == 25) {
                i = typedArray.getInt(index, -1);
                r10.A0V = A00(i, i2);
            } else if (index == 6) {
                i2 = typedArray.getInt(index, -1);
                r10.A0V = A00(i, i2);
                int i4 = i2 & 112;
                if (i4 == 16) {
                    r0 = AnonymousClass90P.CENTER;
                } else if (i4 == 48 || i4 != 80) {
                    r0 = AnonymousClass90P.TOP;
                } else {
                    r0 = AnonymousClass90P.BOTTOM;
                }
                r10.A0X = r0;
            } else if (index == 15) {
                r10.A0a = typedArray.getBoolean(index, false);
            } else if (index == 11) {
                r10.A0L = typedArray.getInteger(index, -1);
            } else if (index == 10) {
                r10.A0I = typedArray.getInteger(index, -1);
            } else if (index == 14) {
                r10.A0b = typedArray.getBoolean(index, false);
            } else if (index == 4) {
                r10.A0E = typedArray.getColor(index, 0);
            } else if (index == 3) {
                r10.A0A = typedArray.getColor(index, 0);
            } else if (index == 1) {
                r10.A0Q = typedArray.getInteger(index, 0);
            } else if (index == 20) {
                r10.A05 = (float) typedArray.getDimensionPixelOffset(index, 0);
            } else if (index == 21) {
                r10.A04 = typedArray.getFloat(index, 0.0f);
            } else if (index == 17) {
                r10.A06 = typedArray.getFloat(index, 0.0f);
            } else if (index == 18) {
                r10.A07 = typedArray.getFloat(index, 0.0f);
            } else if (index == 19) {
                r10.A08 = typedArray.getFloat(index, 0.0f);
            } else if (index == 16) {
                r10.A0N = typedArray.getColor(index, 0);
            } else if (index == 13) {
                r10.A0K = typedArray.getInteger(index, -1);
            } else if (index == 12) {
                r10.A0H = typedArray.getInteger(index, -1);
            } else if (index == 8) {
                r10.A0M = typedArray.getDimensionPixelSize(index, 0);
            } else if (index == 7) {
                r10.A0J = typedArray.getDimensionPixelSize(index, Integer.MAX_VALUE);
            } else if (index == 24) {
                String string = typedArray.getString(index);
                if (string != null) {
                    r10.A0S = Typeface.create(string, 0);
                }
            } else if (index == 26) {
                r10.A09 = typedArray.getInt(index, 0);
            } else if (index == 27) {
                r10.A0C = typedArray.getInt(index, 0);
            } else if (index == 28) {
                r10.A0D = typedArray.getInt(index, 0);
            }
        }
    }
}
