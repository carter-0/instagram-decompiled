package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: X.3U3  reason: invalid class name */
public abstract class AnonymousClass3U3 {
    public static final Object A00 = new Object();
    public static final ThreadLocal A01 = new ThreadLocal();
    public static final WeakHashMap A02 = new WeakHashMap(0);

    public static Typeface A02(Context context, int i) {
        Context context2 = context;
        if (context.isRestricted()) {
            return null;
        }
        return A03(context2, new TypedValue(), (AnonymousClass3U1) null, i, 0, false, false);
    }

    public static float A00(Resources resources, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C9158RRj.A00(resources, i);
        }
        ThreadLocal threadLocal = A01;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException(002.A11(C66579MXk.A00(607), Integer.toHexString(i), " type #0x", Integer.toHexString(i2), AnonymousClass000.A00(834)));
    }

    public static ColorStateList A01(Resources.Theme theme, Resources resources, int i) {
        WeakHashMap weakHashMap;
        ColorStateList colorStateList;
        C2803251h r5;
        Resources.Theme theme2;
        C273074lv r4 = new C273074lv(theme, resources);
        Object obj = A00;
        synchronized (obj) {
            weakHashMap = A02;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(r4);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (r5 = (C2803251h) sparseArray.get(i)) == null)) {
                if (!r5.A02.equals(r4.A01.getConfiguration()) || (!((theme2 = r4.A00) == null && r5.A00 == 0) && (theme2 == null || r5.A00 != theme2.hashCode()))) {
                    sparseArray.remove(i);
                } else {
                    colorStateList = r5.A01;
                }
            }
            colorStateList = null;
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = A01;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            z = false;
        }
        ColorStateList colorStateList2 = null;
        if (!z) {
            try {
                colorStateList2 = AnonymousClass51g.A01(theme, resources, resources.getXml(i));
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList2 == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (obj) {
            SparseArray sparseArray2 = (SparseArray) weakHashMap.get(r4);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                weakHashMap.put(r4, sparseArray2);
            }
            sparseArray2.append(i, new C2803251h(colorStateList2, r4.A01.getConfiguration(), theme));
        }
        return colorStateList2;
    }

    /* JADX WARNING: type inference failed for: r0v31, types: [X.U77, java.lang.Object, X.9Dx] */
    /* JADX WARNING: type inference failed for: r0v41, types: [X.WhB, java.lang.Object, java.lang.Runnable] */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:121|122) */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        r10.A00(new X.SE3(-3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0318, code lost:
        if (r7 != null) goto L_0x031a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d4, code lost:
        if (r33 == null) goto L_0x01d6;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x0251 */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01f9 A[Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x025b A[Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01d9 A[Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01dc A[Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface A03(android.content.Context r31, android.util.TypedValue r32, X.AnonymousClass3U1 r33, int r34, int r35, boolean r36, boolean r37) {
        /*
            android.content.res.Resources r4 = r31.getResources()
            r3 = 1
            r7 = r32
            r9 = r34
            r4.getValue(r9, r7, r3)
            java.lang.String r23 = "ResourcesCompat"
            java.lang.CharSequence r0 = r7.string
            if (r0 == 0) goto L_0x034d
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r8.startsWith(r0)
            r2 = -3
            r22 = 0
            r6 = r33
            if (r0 == 0) goto L_0x0345
            int r0 = r7.assetCookie
            X.01e r21 = X.270.A00
            r5 = r35
            java.lang.String r1 = X.270.A00(r4, r8, r9, r0, r5)
            r0 = r21
            java.lang.Object r0 = r0.A02(r1)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x0056
            if (r33 == 0) goto L_0x003c
            r6.A03(r0)
        L_0x003c:
            r22 = r0
        L_0x003e:
            if (r22 != 0) goto L_0x034c
            if (r33 != 0) goto L_0x034c
            if (r37 != 0) goto L_0x034c
            java.lang.String r2 = "Font resource ID #0x"
            java.lang.String r1 = java.lang.Integer.toHexString(r9)
            java.lang.String r0 = " could not be retrieved."
            java.lang.String r1 = X.002.A0g(r2, r1, r0)
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            r0.<init>(r1)
            throw r0
        L_0x0056:
            if (r37 != 0) goto L_0x003e
            java.lang.String r1 = r8.toLowerCase()     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            java.lang.String r0 = ".xml"
            boolean r0 = r1.endsWith(r0)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            if (r0 == 0) goto L_0x02fd
            android.content.res.XmlResourceParser r20 = r4.getXml(r9)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
        L_0x0068:
            int r0 = r20.next()     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r11 = 2
            if (r0 == r11) goto L_0x0073
            if (r0 != r3) goto L_0x0068
            goto L_0x02d0
        L_0x0073:
            r10 = 0
            java.lang.String r1 = "font-family"
            r0 = r20
            r0.require(r11, r10, r1)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            java.lang.String r0 = r20.getName()     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            if (r0 == 0) goto L_0x018b
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r20)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            int[] r0 = X.AnonymousClass026.A01     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            android.content.res.TypedArray r13 = r4.obtainAttributes(r1, r0)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r0 = 0
            java.lang.String r15 = r13.getString(r0)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r0 = 4
            java.lang.String r14 = r13.getString(r0)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r0 = 5
            java.lang.String r12 = r13.getString(r0)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r1 = 0
            int r19 = r13.getResourceId(r3, r1)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            int r18 = r13.getInteger(r11, r3)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r10 = 3
            r0 = 500(0x1f4, float:7.0E-43)
            int r17 = r13.getInteger(r10, r0)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r16 = 6
            r0 = r16
            java.lang.String r0 = r13.getString(r0)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r13.recycle()     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            if (r15 == 0) goto L_0x00df
            if (r14 == 0) goto L_0x00df
            if (r12 == 0) goto L_0x00df
        L_0x00bf:
            int r1 = r20.next()     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            if (r1 == r10) goto L_0x00c9
            X.C375529Dy.A01(r20)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            goto L_0x00bf
        L_0x00c9:
            r1 = r19
            java.util.List r1 = X.C375529Dy.A00(r4, r1)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            X.1rR r3 = new X.1rR     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r3.<init>(r15, r14, r12, r1)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            X.Rvg r10 = new X.Rvg     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r11 = r18
            r1 = r17
            r10.<init>(r3, r0, r11, r1)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            goto L_0x0190
        L_0x00df:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r14.<init>()     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
        L_0x00e4:
            int r0 = r20.next()     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            if (r0 == r10) goto L_0x0176
            int r0 = r20.getEventType()     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            if (r0 != r11) goto L_0x00e4
            java.lang.String r12 = r20.getName()     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            java.lang.String r0 = "font"
            boolean r0 = r12.equals(r0)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            if (r0 == 0) goto L_0x0171
            android.util.AttributeSet r12 = android.util.Xml.asAttributeSet(r20)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            int[] r0 = X.AnonymousClass026.A02     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            android.content.res.TypedArray r0 = r4.obtainAttributes(r12, r0)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r12 = 8
            boolean r12 = r0.hasValue(r12)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r13 = 1
            if (r12 == 0) goto L_0x0111
            r13 = 8
        L_0x0111:
            r12 = 400(0x190, float:5.6E-43)
            int r27 = r0.getInt(r13, r12)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r12 = r16
            boolean r13 = r0.hasValue(r12)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r12 = 2
            if (r13 == 0) goto L_0x0121
            r12 = 6
        L_0x0121:
            int r12 = r0.getInt(r12, r1)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r30 = 0
            if (r3 != r12) goto L_0x012b
            r30 = 1
        L_0x012b:
            r12 = 9
            boolean r12 = r0.hasValue(r12)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r13 = 3
            if (r12 == 0) goto L_0x0136
            r13 = 9
        L_0x0136:
            r12 = 7
            boolean r15 = r0.hasValue(r12)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r12 = 4
            if (r15 == 0) goto L_0x013f
            r12 = 7
        L_0x013f:
            java.lang.String r26 = r0.getString(r12)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            int r28 = r0.getInt(r13, r1)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r12 = 5
            boolean r13 = r0.hasValue(r12)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r12 = 0
            if (r13 == 0) goto L_0x0150
            r12 = 5
        L_0x0150:
            int r29 = r0.getResourceId(r12, r1)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            java.lang.String r25 = r0.getString(r12)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r0.recycle()     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
        L_0x015b:
            int r0 = r20.next()     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            if (r0 == r10) goto L_0x0165
            X.C375529Dy.A01(r20)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            goto L_0x015b
        L_0x0165:
            X.Xaq r0 = new X.Xaq     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r24 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r14.add(r0)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            goto L_0x00e4
        L_0x0171:
            X.C375529Dy.A01(r20)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            goto L_0x00e4
        L_0x0176:
            boolean r0 = r14.isEmpty()     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            if (r0 == 0) goto L_0x017d
            goto L_0x018f
        L_0x017d:
            X.Xaq[] r0 = new X.C21438Xaq[r1]     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            java.lang.Object[] r0 = r14.toArray(r0)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            X.Xaq[] r0 = (X.C21438Xaq[]) r0     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            X.XYj r10 = new X.XYj     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r10.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            goto L_0x0190
        L_0x018b:
            X.C375529Dy.A01(r20)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            goto L_0x0190
        L_0x018f:
            r10 = 0
        L_0x0190:
            if (r10 != 0) goto L_0x01a0
            java.lang.String r1 = "Failed to find font-family tag"
            r0 = r23
            android.util.Log.e(r0, r1)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            if (r33 == 0) goto L_0x003e
            r6.A00(r2)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            goto L_0x003e
        L_0x01a0:
            int r3 = r7.assetCookie     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            boolean r0 = r10 instanceof X.C10647Rvg     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            if (r0 == 0) goto L_0x02dc
            X.Rvg r10 = (X.C10647Rvg) r10     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            java.lang.String r1 = r10.A03     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r7 = 0
            if (r1 == 0) goto L_0x01c7
            boolean r0 = r1.isEmpty()     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            if (r0 != 0) goto L_0x01c7
            r11 = 0
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r11)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r11)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            if (r1 == 0) goto L_0x01c7
            boolean r0 = r1.equals(r0)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            if (r0 != 0) goto L_0x01c7
            r7 = r1
        L_0x01c7:
            if (r7 == 0) goto L_0x01cd
            if (r33 == 0) goto L_0x0321
            goto L_0x031a
        L_0x01cd:
            if (r36 == 0) goto L_0x01d4
            int r0 = r10.A00     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            if (r0 != 0) goto L_0x01da
            goto L_0x01d6
        L_0x01d4:
            if (r33 != 0) goto L_0x01da
        L_0x01d6:
            r11 = 1
        L_0x01d7:
            if (r36 == 0) goto L_0x01dc
            goto L_0x01de
        L_0x01da:
            r11 = 0
            goto L_0x01d7
        L_0x01dc:
            r12 = -1
            goto L_0x01e0
        L_0x01de:
            int r12 = r10.A01     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
        L_0x01e0:
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            android.os.Handler r7 = new android.os.Handler     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r7.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            X.U77 r0 = new X.U77     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r0.A00 = r6     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            X.1rR r1 = r10.A02     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            X.S0v r10 = new X.S0v     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r10.<init>(r7, r0)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            if (r11 == 0) goto L_0x025b
            java.util.concurrent.ExecutorService r0 = X.C11163SCx.A03     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            java.lang.String r7 = r1.A01     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            java.lang.String r0 = "-"
            java.lang.String r11 = X.002.A0b(r7, r0, r5)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            X.01e r0 = X.C11163SCx.A00     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            java.lang.Object r7 = r0.A02(r11)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            if (r7 == 0) goto L_0x0213
            X.SE3 r0 = new X.SE3     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r0.<init>((android.graphics.Typeface) r7)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            goto L_0x0274
        L_0x0213:
            r0 = -1
            if (r12 != r0) goto L_0x0223
            r0 = r31
            X.SE3 r0 = X.C11163SCx.A00(r0, r1, r11, r5)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r10.A00(r0)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            android.graphics.Typeface r7 = r0.A01     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            goto L_0x02ed
        L_0x0223:
            X.TNZ r7 = new X.TNZ     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r0 = r31
            r7.<init>(r0, r1, r11, r5)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            java.util.concurrent.ExecutorService r0 = X.C11163SCx.A03     // Catch:{ InterruptedException -> 0x0251 }
            java.util.concurrent.Future r11 = r0.submit(r7)     // Catch:{ InterruptedException -> 0x0251 }
            long r0 = (long) r12     // Catch:{ InterruptedException -> 0x0251 }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x024a, InterruptedException -> 0x0248, TimeoutException -> 0x0240 }
            java.lang.Object r0 = r11.get(r0, r7)     // Catch:{ ExecutionException -> 0x024a, InterruptedException -> 0x0248, TimeoutException -> 0x0240 }
            X.SE3 r0 = (X.SE3) r0     // Catch:{ InterruptedException -> 0x0251 }
            r10.A00(r0)     // Catch:{ InterruptedException -> 0x0251 }
            android.graphics.Typeface r7 = r0.A01     // Catch:{ InterruptedException -> 0x0251 }
            goto L_0x02ed
        L_0x0240:
            java.lang.String r0 = "timeout"
            java.lang.InterruptedException r1 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x0251 }
            r1.<init>(r0)     // Catch:{ InterruptedException -> 0x0251 }
            goto L_0x0250
        L_0x0248:
            r1 = move-exception
            goto L_0x0250
        L_0x024a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x0251 }
            r1.<init>(r0)     // Catch:{ InterruptedException -> 0x0251 }
        L_0x0250:
            throw r1     // Catch:{ InterruptedException -> 0x0251 }
        L_0x0251:
            X.SE3 r0 = new X.SE3     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r0.<init>((int) r2)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r10.A00(r0)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            goto L_0x02eb
        L_0x025b:
            java.util.concurrent.ExecutorService r0 = X.C11163SCx.A03     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            java.lang.String r7 = r1.A01     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            java.lang.String r0 = "-"
            java.lang.String r12 = X.002.A0b(r7, r0, r5)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            X.01e r0 = X.C11163SCx.A00     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            java.lang.Object r7 = r0.A02(r12)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            if (r7 == 0) goto L_0x0278
            X.SE3 r0 = new X.SE3     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r0.<init>((android.graphics.Typeface) r7)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
        L_0x0274:
            r10.A00(r0)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            goto L_0x02ed
        L_0x0278:
            X.Sd9 r11 = new X.Sd9     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r11.<init>(r10)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            java.lang.Object r10 = X.C11163SCx.A02     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            monitor-enter(r10)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            X.01r r7 = X.C11163SCx.A01     // Catch:{ all -> 0x02cd }
            java.lang.Object r0 = r7.get(r12)     // Catch:{ all -> 0x02cd }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x02cd }
            if (r0 == 0) goto L_0x028f
            r0.add(r11)     // Catch:{ all -> 0x02cd }
            monitor-exit(r10)     // Catch:{ all -> 0x02cd }
            goto L_0x02eb
        L_0x028f:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x02cd }
            r0.<init>()     // Catch:{ all -> 0x02cd }
            r0.add(r11)     // Catch:{ all -> 0x02cd }
            r7.put(r12, r0)     // Catch:{ all -> 0x02cd }
            monitor-exit(r10)     // Catch:{ all -> 0x02cd }
            X.TNa r10 = new X.TNa     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r0 = r31
            r10.<init>(r0, r1, r12, r5)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            java.util.concurrent.ExecutorService r11 = X.C11163SCx.A03     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            X.SdA r7 = new X.SdA     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r7.<init>(r12)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            if (r0 != 0) goto L_0x02c7
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            android.os.Handler r1 = new android.os.Handler     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
        L_0x02b8:
            X.WhB r0 = new X.WhB     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r0.A02 = r10     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r0.A01 = r7     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r0.A00 = r1     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r11.execute(r0)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            goto L_0x02eb
        L_0x02c7:
            android.os.Handler r1 = new android.os.Handler     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            goto L_0x02b8
        L_0x02cd:
            r1 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x02cd }
            goto L_0x02db
        L_0x02d0:
            r0 = 990(0x3de, float:1.387E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
        L_0x02db:
            throw r1     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
        L_0x02dc:
            X.272 r1 = X.270.A01     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            X.XYj r10 = (X.C21356XYj) r10     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r0 = r31
            android.graphics.Typeface r7 = r1.A01(r0, r4, r10, r5)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            if (r33 == 0) goto L_0x02ed
            if (r7 == 0) goto L_0x031e
            goto L_0x02f0
        L_0x02eb:
            r7 = r22
        L_0x02ed:
            if (r7 == 0) goto L_0x0321
            goto L_0x02f3
        L_0x02f0:
            r6.A03(r7)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
        L_0x02f3:
            java.lang.String r1 = X.270.A00(r4, r8, r9, r3, r5)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r0 = r21
            r0.A05(r1, r7)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            goto L_0x0321
        L_0x02fd:
            int r0 = r7.assetCookie     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            X.272 r10 = X.270.A01     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r11 = r31
            r12 = r4
            r13 = r8
            r14 = r9
            r15 = r5
            android.graphics.Typeface r7 = r10.A02(r11, r12, r13, r14, r15)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            if (r7 == 0) goto L_0x0316
            java.lang.String r1 = X.270.A00(r4, r8, r9, r0, r5)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            r0 = r21
            r0.A05(r1, r7)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
        L_0x0316:
            if (r33 == 0) goto L_0x0321
            if (r7 == 0) goto L_0x031e
        L_0x031a:
            r6.A03(r7)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
            goto L_0x0321
        L_0x031e:
            r6.A00(r2)     // Catch:{ XmlPullParserException -> 0x0325, IOException -> 0x032e }
        L_0x0321:
            r22 = r7
            goto L_0x003e
        L_0x0325:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Failed to parse xml resource "
            goto L_0x0336
        L_0x032e:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Failed to read xml resource "
        L_0x0336:
            r1.append(r0)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0 = r23
            android.util.Log.e(r0, r1, r3)
        L_0x0345:
            if (r33 == 0) goto L_0x003e
            r6.A00(r2)
            goto L_0x003e
        L_0x034c:
            return r22
        L_0x034d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Resource \""
            r1.append(r0)
            java.lang.String r0 = r4.getResourceName(r9)
            r1.append(r0)
            java.lang.String r0 = "\" ("
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r9)
            r1.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U3.A03(android.content.Context, android.util.TypedValue, X.3U1, int, int, boolean, boolean):android.graphics.Typeface");
    }
}
