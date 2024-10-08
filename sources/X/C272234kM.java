package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.4kM  reason: invalid class name and case insensitive filesystem */
public final class C272234kM extends C272244kN {
    public final Class A00;
    public final Constructor A01;
    public final Method A02;
    public final Method A03;
    public final Method A04;
    public final Method A05;
    public final Method A06;

    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r11.A03.invoke(r2, new java.lang.Object[0]);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface A03(android.content.Context r12, android.os.CancellationSignal r13, X.26x[] r14, int r15) {
        /*
            r11 = this;
            r7 = 0
            int r6 = r14.length
            r0 = 1
            r10 = 0
            if (r6 < r0) goto L_0x00e3
            java.lang.reflect.Method r2 = r11.A04
            if (r2 != 0) goto L_0x0011
            java.lang.String r1 = "TypefaceCompatApi26Impl"
            java.lang.String r0 = "Unable to collect necessary private methods. Fallback to legacy implementation."
            android.util.Log.w(r1, r0)
        L_0x0011:
            r0 = 0
            if (r2 == 0) goto L_0x0015
            r0 = 1
        L_0x0015:
            if (r0 != 0) goto L_0x0050
            X.26x r3 = r11.A04(r14, r15)
            android.content.ContentResolver r2 = r12.getContentResolver()
            android.net.Uri r1 = r3.A03     // Catch:{  }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r2 = r2.openFileDescriptor(r1, r0, r7)     // Catch:{  }
            if (r2 == 0) goto L_0x00e3
            java.io.FileDescriptor r0 = r2.getFileDescriptor()     // Catch:{ all -> 0x0046 }
            android.graphics.Typeface$Builder r1 = new android.graphics.Typeface$Builder     // Catch:{ all -> 0x0046 }
            r1.<init>(r0)     // Catch:{ all -> 0x0046 }
            int r0 = r3.A02     // Catch:{ all -> 0x0046 }
            android.graphics.Typeface$Builder r1 = r1.setWeight(r0)     // Catch:{ all -> 0x0046 }
            boolean r0 = r3.A04     // Catch:{ all -> 0x0046 }
            android.graphics.Typeface$Builder r0 = r1.setItalic(r0)     // Catch:{ all -> 0x0046 }
            android.graphics.Typeface r0 = r0.build()     // Catch:{ all -> 0x0046 }
            r2.close()     // Catch:{  }
            return r0
        L_0x0046:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{  }
        L_0x004f:
            throw r1     // Catch:{  }
        L_0x0050:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r2 = 0
        L_0x0056:
            if (r2 >= r6) goto L_0x0070
            r1 = r14[r2]
            int r0 = r1.A00
            if (r0 != 0) goto L_0x006d
            android.net.Uri r1 = r1.A03
            boolean r0 = r3.containsKey(r1)
            if (r0 != 0) goto L_0x006d
            java.nio.MappedByteBuffer r0 = X.2BV.A01(r12, r1)
            r3.put(r1, r0)
        L_0x006d:
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0070:
            java.util.Map r8 = java.util.Collections.unmodifiableMap(r3)
            java.lang.reflect.Constructor r1 = r11.A01     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x007f }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x007f }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x007f }
            r2 = r0
            goto L_0x0081
        L_0x007f:
            r0 = 0
            r2 = r7
        L_0x0081:
            if (r0 == 0) goto L_0x00e3
            r1 = 0
            r5 = 0
        L_0x0085:
            if (r5 >= r6) goto L_0x00bb
            r4 = r14[r5]
            android.net.Uri r0 = r4.A03
            java.lang.Object r9 = r8.get(r0)
            if (r9 == 0) goto L_0x00b8
            int r3 = r4.A01
            int r1 = r4.A02
            boolean r0 = r4.A04
            java.lang.reflect.Method r4 = r11.A05     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b4 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b4 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b4 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b4 }
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r3, r7, r1, r0}     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b4 }
            java.lang.Object r0 = r4.invoke(r2, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b4 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b4 }
            boolean r0 = r0.booleanValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b4 }
            goto L_0x00b5
        L_0x00b4:
            r0 = 0
        L_0x00b5:
            if (r0 == 0) goto L_0x00db
            r1 = 1
        L_0x00b8:
            int r5 = r5 + 1
            goto L_0x0085
        L_0x00bb:
            if (r1 == 0) goto L_0x00db
            r0 = 0
            java.lang.reflect.Method r1 = r11.A06     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00cd }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00cd }
            java.lang.Object r0 = r1.invoke(r2, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00cd }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00cd }
            boolean r0 = r0.booleanValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00cd }
            goto L_0x00ce
        L_0x00cd:
            r0 = 0
        L_0x00ce:
            if (r0 == 0) goto L_0x00e3
            android.graphics.Typeface r0 = r11.A05(r2)
            if (r0 == 0) goto L_0x00e3
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r0, r15)
            return r10
        L_0x00db:
            java.lang.reflect.Method r1 = r11.A03     // Catch:{ IOException -> 0x00e3 }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IOException -> 0x00e3 }
            r1.invoke(r2, r0)     // Catch:{ IOException -> 0x00e3 }
        L_0x00e3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C272234kM.A03(android.content.Context, android.os.CancellationSignal, X.26x[], int):android.graphics.Typeface");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.reflect.Constructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.reflect.Constructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.reflect.Constructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Class} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C272234kM() {
        /*
            r19 = this;
            r4 = r19
            r4.<init>()
            r3 = 0
            java.lang.String r0 = "android.graphics.FontFamily"
            java.lang.Class r9 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0064 }
            r2 = 0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0064 }
            java.lang.reflect.Constructor r8 = r9.getConstructor(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0064 }
            java.lang.Class<android.content.res.AssetManager> r11 = android.content.res.AssetManager.class
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0064 }
            java.lang.Class r14 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0064 }
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r5 = android.graphics.fonts.FontVariationAxis[].class
            r15 = r13
            r16 = r13
            r17 = r13
            r18 = r5
            java.lang.Class[] r1 = new java.lang.Class[]{r11, r12, r13, r14, r15, r16, r17, r18}     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0064 }
            java.lang.String r0 = "addFontFromAssetManager"
            java.lang.reflect.Method r11 = r9.getMethod(r0, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0064 }
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            java.lang.Class[] r1 = new java.lang.Class[]{r0, r13, r5, r13, r13}     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0064 }
            java.lang.String r0 = "addFontFromBuffer"
            java.lang.reflect.Method r10 = r9.getMethod(r0, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0064 }
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0064 }
            java.lang.String r0 = "freeze"
            java.lang.reflect.Method r7 = r9.getMethod(r0, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0064 }
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0064 }
            java.lang.String r0 = "abortCreation"
            java.lang.reflect.Method r6 = r9.getMethod(r0, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0064 }
            r5 = 1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r9, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0064 }
            java.lang.Class<android.graphics.Typeface> r2 = android.graphics.Typeface.class
            java.lang.Class r0 = r0.getClass()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0064 }
            java.lang.Class[] r1 = new java.lang.Class[]{r0, r12, r13, r13}     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0064 }
            java.lang.String r0 = "createFromFamiliesWithDefault"
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r0, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0064 }
            r0.setAccessible(r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0064 }
            r3 = r9
            goto L_0x007e
        L_0x0064:
            r2 = move-exception
            java.lang.String r1 = "Unable to collect necessary methods for class "
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "TypefaceCompatApi26Impl"
            android.util.Log.e(r0, r1, r2)
            r0 = r3
            r8 = r3
            r11 = r3
            r10 = r3
            r7 = r3
            r6 = r3
        L_0x007e:
            r4.A00 = r3
            r4.A01 = r8
            r4.A04 = r11
            r4.A05 = r10
            r4.A06 = r7
            r4.A03 = r6
            r4.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C272234kM.<init>():void");
    }

    public final Typeface A01(Context context, Resources resources, C21356XYj xYj, int i) {
        Object obj;
        boolean z;
        boolean z2;
        Method method = this.A04;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        boolean z3 = false;
        if (method != null) {
            z3 = true;
        }
        Context context2 = context;
        C21356XYj xYj2 = xYj;
        if (!z3) {
            return super.A01(context2, resources, xYj2, i);
        }
        try {
            obj = this.A01.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            C21438Xaq[] xaqArr = xYj2.A00;
            int length = xaqArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    C21438Xaq xaq = xaqArr[i2];
                    String str = xaq.A03;
                    int i3 = xaq.A01;
                    int i4 = xaq.A02;
                    boolean z4 = xaq.A05;
                    try {
                        z2 = ((Boolean) method.invoke(obj, new Object[]{context2.getAssets(), str, 0, false, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(z4 ? 1 : 0), FontVariationAxis.fromFontVariationSettings(xaq.A04)})).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z2 = false;
                    }
                    if (!z2) {
                        try {
                            this.A03.invoke(obj, new Object[0]);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused3) {
                        }
                    } else {
                        i2++;
                    }
                } else {
                    try {
                        z = ((Boolean) this.A06.invoke(obj, new Object[0])).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused4) {
                        z = false;
                    }
                    if (z) {
                        return A05(obj);
                    }
                }
            }
        }
        return null;
    }

    public final Typeface A02(Context context, Resources resources, String str, int i, int i2) {
        Object obj;
        boolean z;
        boolean z2;
        Method method = this.A04;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        boolean z3 = false;
        if (method != null) {
            z3 = true;
        }
        String str2 = str;
        if (!z3) {
            return C272234kM.super.A02(context, resources, str, i, i2);
        }
        try {
            obj = this.A01.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        try {
            z = ((Boolean) method.invoke(obj, new Object[]{context.getAssets(), str2, 0, false, null, -1, -1, null})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            z = false;
        }
        if (!z) {
            try {
                this.A03.invoke(obj, new Object[0]);
                return null;
            } catch (IllegalAccessException | InvocationTargetException unused3) {
                return null;
            }
        } else {
            try {
                z2 = ((Boolean) this.A06.invoke(obj, new Object[0])).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused4) {
                z2 = false;
            }
            if (z2) {
                return A05(obj);
            }
            return null;
        }
    }

    public final Typeface A05(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.A00, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.A02.invoke((Object) null, new Object[]{newInstance, "sans-serif", -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
