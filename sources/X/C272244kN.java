package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.4kN  reason: invalid class name and case insensitive filesystem */
public abstract class C272244kN extends 272 {
    public static Class A00;
    public static Constructor A01;
    public static Method A02;
    public static Method A03;
    public static boolean A04;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.reflect.Constructor<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.reflect.Constructor<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.reflect.Constructor<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.reflect.Constructor<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Class<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.reflect.Method} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00() {
        /*
            boolean r0 = A04
            if (r0 != 0) goto L_0x0054
            r7 = 1
            A04 = r7
            r6 = 0
            java.lang.String r0 = "android.graphics.FontFamily"
            java.lang.Class r5 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003b }
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003b }
            java.lang.reflect.Constructor r4 = r5.getConstructor(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003b }
            java.lang.String r3 = "addFontWeightStyle"
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003b }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003b }
            java.lang.Class[] r0 = new java.lang.Class[]{r2, r1, r0}     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003b }
            java.lang.reflect.Method r3 = r5.getMethod(r3, r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003b }
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r5, r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003b }
            java.lang.Class<android.graphics.Typeface> r2 = android.graphics.Typeface.class
            java.lang.String r1 = "createFromFamiliesWithDefault"
            java.lang.Class r0 = r0.getClass()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003b }
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003b }
            java.lang.reflect.Method r0 = r2.getMethod(r1, r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003b }
            r6 = r4
            goto L_0x004c
        L_0x003b:
            r2 = move-exception
            java.lang.Class r0 = r2.getClass()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = "TypefaceCompatApi21Impl"
            android.util.Log.e(r0, r1, r2)
            r0 = r6
            r5 = r6
            r3 = r6
        L_0x004c:
            A01 = r6
            A00 = r5
            A02 = r3
            A03 = r0
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C272244kN.A00():void");
    }

    public Typeface A01(Context context, Resources resources, C21356XYj xYj, int i) {
        A00();
        try {
            Object newInstance = A01.newInstance(new Object[0]);
            C21438Xaq[] xaqArr = xYj.A00;
            int length = xaqArr.length;
            int i2 = 0;
            while (i2 < length) {
                C21438Xaq xaq = xaqArr[i2];
                File A002 = 2BV.A00(context);
                if (A002 == null) {
                    return null;
                }
                try {
                    if (2BV.A02(resources, A002, xaq.A00)) {
                        String path = A002.getPath();
                        int i3 = xaq.A02;
                        boolean z = xaq.A05;
                        A00();
                        if (((Boolean) A02.invoke(newInstance, new Object[]{path, Integer.valueOf(i3), Boolean.valueOf(z)})).booleanValue()) {
                            A002.delete();
                            i2++;
                        }
                    }
                    A002.delete();
                    return null;
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                } catch (RuntimeException unused) {
                    A002.delete();
                    return null;
                } catch (Throwable th) {
                    A002.delete();
                    throw th;
                }
            }
            A00();
            try {
                Object newInstance2 = Array.newInstance(A00, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) A03.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
