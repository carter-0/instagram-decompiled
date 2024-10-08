package X;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.JavaModuleWrapper;
import java.lang.reflect.Method;

public final class SQp {
    public static final C10877Rzd A09 = new QZD(6);
    public static final C10877Rzd A0A = new QZD(1);
    public static final C10877Rzd A0B = new QZD(9);
    public static final C10877Rzd A0C = new QZD(2);
    public static final C10877Rzd A0D = new QZD(7);
    public static final C10877Rzd A0E = new QZD(3);
    public static final C10877Rzd A0F = new QZD(4);
    public static final C10877Rzd A0G = new QZD(8);
    public static final C10877Rzd A0H = new QZD(0);
    public static final C10877Rzd A0I = new QZD(5);
    public int A00;
    public String A01;
    public String A02 = BaseJavaModule.METHOD_TYPE_ASYNC;
    public boolean A03 = false;
    public C10877Rzd[] A04;
    public Object[] A05;
    public final JavaModuleWrapper A06;
    public final Method A07;
    public final Class[] A08;

    public static char A00(Class cls) {
        if (cls == Boolean.TYPE) {
            return 'z';
        }
        if (cls == Boolean.class) {
            return 'Z';
        }
        if (cls == Integer.TYPE) {
            return 'i';
        }
        if (cls == Integer.class) {
            return 'I';
        }
        if (cls == Double.TYPE) {
            return 'd';
        }
        if (cls == Double.class) {
            return 'D';
        }
        if (cls == Float.TYPE) {
            return 'f';
        }
        if (cls == Float.class) {
            return 'F';
        }
        if (cls == String.class) {
            return 'S';
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067 A[Catch:{ all -> 0x0174 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a6 A[Catch:{ all -> 0x0174 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.SQp r9) {
        /*
            boolean r0 = r9.A03
            if (r0 != 0) goto L_0x0179
            java.lang.String r3 = "processArguments"
            r1 = 8192(0x2000, double:4.0474E-320)
            X.0eu r0 = com.facebook.systrace.SystraceMessage.A00
            X.0et r4 = com.facebook.systrace.SystraceMessage.A00(r0, r3, r1)
            com.facebook.react.bridge.JavaModuleWrapper r0 = r9.A06
            com.facebook.react.bridge.ModuleHolder r0 = r0.mModuleHolder
            java.lang.String r3 = r0.mName
            java.lang.String r1 = "."
            java.lang.reflect.Method r2 = r9.A07
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = X.002.A0g(r3, r1, r0)
            java.lang.String r0 = "method"
            r4.A00(r1, r0)
            r4.A02()
            r8 = 1
            r9.A03 = r8     // Catch:{ all -> 0x0174 }
            java.lang.Class[] r7 = r9.A08     // Catch:{ all -> 0x0174 }
            int r6 = r7.length     // Catch:{ all -> 0x0174 }
            X.Rzd[] r4 = new X.C10877Rzd[r6]     // Catch:{ all -> 0x0174 }
            r3 = 0
        L_0x0033:
            if (r3 >= r6) goto L_0x00a9
            r5 = r7[r3]     // Catch:{ all -> 0x0174 }
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r5 == r0) goto L_0x00a1
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0174 }
            if (r5 == r0) goto L_0x00a1
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r5 == r0) goto L_0x009e
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0174 }
            if (r5 == r0) goto L_0x009e
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r5 == r0) goto L_0x009b
            java.lang.Class r0 = java.lang.Double.TYPE     // Catch:{ all -> 0x0174 }
            if (r5 == r0) goto L_0x009b
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r5 == r0) goto L_0x0098
            java.lang.Class r0 = java.lang.Float.TYPE     // Catch:{ all -> 0x0174 }
            if (r5 == r0) goto L_0x0098
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r5 != r0) goto L_0x0068
            X.Rzd r0 = A0I     // Catch:{ all -> 0x0174 }
        L_0x005d:
            r4[r3] = r0     // Catch:{ all -> 0x0174 }
        L_0x005f:
            r0 = r4[r3]     // Catch:{ all -> 0x0174 }
            X.QZD r0 = (X.QZD) r0     // Catch:{ all -> 0x0174 }
            int r0 = r0.A00     // Catch:{ all -> 0x0174 }
            if (r0 == 0) goto L_0x00a6
            goto L_0x00a4
        L_0x0068:
            java.lang.Class<com.facebook.react.bridge.Callback> r0 = com.facebook.react.bridge.Callback.class
            if (r5 != r0) goto L_0x006f
            X.Rzd r0 = A0B     // Catch:{ all -> 0x0174 }
            goto L_0x005d
        L_0x006f:
            java.lang.Class<X.TjR> r0 = X.C13904TjR.class
            if (r5 != r0) goto L_0x0083
            X.Rzd r0 = A0H     // Catch:{ all -> 0x0174 }
            r4[r3] = r0     // Catch:{ all -> 0x0174 }
            r1 = 1
            int r0 = r6 - r8
            if (r3 == r0) goto L_0x007d
            r1 = 0
        L_0x007d:
            java.lang.String r0 = "Promise must be used as last parameter only"
            X.0Sd.A03(r1, r0)     // Catch:{ all -> 0x0174 }
            goto L_0x005f
        L_0x0083:
            java.lang.Class<com.facebook.react.bridge.ReadableMap> r0 = com.facebook.react.bridge.ReadableMap.class
            if (r5 != r0) goto L_0x008a
            X.Rzd r0 = A0G     // Catch:{ all -> 0x0174 }
            goto L_0x005d
        L_0x008a:
            java.lang.Class<com.facebook.react.bridge.ReadableArray> r0 = com.facebook.react.bridge.ReadableArray.class
            if (r5 != r0) goto L_0x0091
            X.Rzd r0 = A09     // Catch:{ all -> 0x0174 }
            goto L_0x005d
        L_0x0091:
            java.lang.Class<com.facebook.react.bridge.Dynamic> r0 = com.facebook.react.bridge.Dynamic.class
            if (r5 != r0) goto L_0x0140
            X.Rzd r0 = A0D     // Catch:{ all -> 0x0174 }
            goto L_0x005d
        L_0x0098:
            X.Rzd r0 = A0E     // Catch:{ all -> 0x0174 }
            goto L_0x005d
        L_0x009b:
            X.Rzd r0 = A0C     // Catch:{ all -> 0x0174 }
            goto L_0x005d
        L_0x009e:
            X.Rzd r0 = A0F     // Catch:{ all -> 0x0174 }
            goto L_0x005d
        L_0x00a1:
            X.Rzd r0 = A0A     // Catch:{ all -> 0x0174 }
            goto L_0x005d
        L_0x00a4:
            r0 = 1
            goto L_0x00a7
        L_0x00a6:
            r0 = 2
        L_0x00a7:
            int r3 = r3 + r0
            goto L_0x0033
        L_0x00a9:
            r9.A04 = r4     // Catch:{ all -> 0x0174 }
            java.lang.String r1 = r9.A02     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = "sync"
            boolean r1 = r1.equals(r0)     // Catch:{ all -> 0x0174 }
            int r0 = r6 + 2
            java.lang.StringBuilder r5 = X.Pxe.A14(r0)     // Catch:{ all -> 0x0174 }
            if (r1 == 0) goto L_0x00ef
            java.lang.Class r2 = r2.getReturnType()     // Catch:{ all -> 0x0174 }
            char r0 = A00(r2)     // Catch:{ all -> 0x0174 }
            if (r0 != 0) goto L_0x00e6
            java.lang.Class r0 = java.lang.Void.TYPE     // Catch:{ all -> 0x0174 }
            if (r2 != r0) goto L_0x00cd
            r0 = 118(0x76, float:1.65E-43)
            goto L_0x00e6
        L_0x00cd:
            java.lang.Class<X.Tm8> r0 = X.C13948Tm8.class
            if (r2 != r0) goto L_0x00d4
            r0 = 77
            goto L_0x00e6
        L_0x00d4:
            java.lang.Class<X.Tm7> r0 = X.C13947Tm7.class
            if (r2 != r0) goto L_0x00db
            r0 = 65
            goto L_0x00e6
        L_0x00db:
            java.lang.String r1 = "Got unknown return class: "
            java.lang.String r0 = r2.getSimpleName()     // Catch:{ all -> 0x0174 }
            java.lang.RuntimeException r0 = X.Pxg.A0k(r1, r0)     // Catch:{ all -> 0x0174 }
            goto L_0x014a
        L_0x00e6:
            r5.append(r0)     // Catch:{ all -> 0x0174 }
            r0 = 46
            r5.append(r0)     // Catch:{ all -> 0x0174 }
            goto L_0x00f5
        L_0x00ef:
            java.lang.String r0 = "v."
            r5.append(r0)     // Catch:{ all -> 0x0174 }
        L_0x00f5:
            r4 = 0
        L_0x00f6:
            if (r4 >= r6) goto L_0x014b
            r3 = r7[r4]     // Catch:{ all -> 0x0174 }
            java.lang.Class<X.TjR> r2 = X.C13904TjR.class
            if (r3 != r2) goto L_0x0109
            r1 = 1
            int r0 = r6 - r8
            if (r4 == r0) goto L_0x0104
            r1 = 0
        L_0x0104:
            java.lang.String r0 = "Promise must be used as last parameter only"
            X.0Sd.A03(r1, r0)     // Catch:{ all -> 0x0174 }
        L_0x0109:
            char r0 = A00(r3)     // Catch:{ all -> 0x0174 }
            if (r0 != 0) goto L_0x012f
            java.lang.Class<com.facebook.react.bridge.Callback> r0 = com.facebook.react.bridge.Callback.class
            if (r3 != r0) goto L_0x0116
            r0 = 88
            goto L_0x012f
        L_0x0116:
            if (r3 != r2) goto L_0x011b
            r0 = 80
            goto L_0x012f
        L_0x011b:
            java.lang.Class<com.facebook.react.bridge.ReadableMap> r0 = com.facebook.react.bridge.ReadableMap.class
            if (r3 != r0) goto L_0x0122
            r0 = 77
            goto L_0x012f
        L_0x0122:
            java.lang.Class<com.facebook.react.bridge.ReadableArray> r0 = com.facebook.react.bridge.ReadableArray.class
            if (r3 != r0) goto L_0x0129
            r0 = 65
            goto L_0x012f
        L_0x0129:
            java.lang.Class<com.facebook.react.bridge.Dynamic> r0 = com.facebook.react.bridge.Dynamic.class
            if (r3 != r0) goto L_0x0135
            r0 = 89
        L_0x012f:
            r5.append(r0)     // Catch:{ all -> 0x0174 }
            int r4 = r4 + 1
            goto L_0x00f6
        L_0x0135:
            java.lang.String r1 = "Got unknown param class: "
            java.lang.String r0 = r3.getSimpleName()     // Catch:{ all -> 0x0174 }
            java.lang.RuntimeException r0 = X.Pxg.A0k(r1, r0)     // Catch:{ all -> 0x0174 }
            goto L_0x014a
        L_0x0140:
            java.lang.String r1 = "Got unknown argument class: "
            java.lang.String r0 = r5.getSimpleName()     // Catch:{ all -> 0x0174 }
            java.lang.RuntimeException r0 = X.Pxg.A0k(r1, r0)     // Catch:{ all -> 0x0174 }
        L_0x014a:
            throw r0     // Catch:{ all -> 0x0174 }
        L_0x014b:
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0174 }
            r9.A01 = r0     // Catch:{ all -> 0x0174 }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x0174 }
            r9.A05 = r0     // Catch:{ all -> 0x0174 }
            X.Rzd[] r4 = r9.A04     // Catch:{ all -> 0x0174 }
            X.0Sd.A00(r4)     // Catch:{ all -> 0x0174 }
            int r3 = r4.length     // Catch:{ all -> 0x0174 }
            r2 = 0
            r1 = 0
        L_0x015d:
            if (r2 >= r3) goto L_0x016e
            r0 = r4[r2]     // Catch:{ all -> 0x0174 }
            X.QZD r0 = (X.QZD) r0     // Catch:{ all -> 0x0174 }
            int r0 = r0.A00     // Catch:{ all -> 0x0174 }
            if (r0 == 0) goto L_0x0169
            r0 = 1
            goto L_0x016a
        L_0x0169:
            r0 = 2
        L_0x016a:
            int r1 = r1 + r0
            int r2 = r2 + 1
            goto L_0x015d
        L_0x016e:
            r9.A00 = r1     // Catch:{ all -> 0x0174 }
            X.Pxg.A1A()
            return
        L_0x0174:
            r0 = move-exception
            X.Pxg.A1A()
            throw r0
        L_0x0179:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SQp.A01(X.SQp):void");
    }

    public SQp(JavaModuleWrapper javaModuleWrapper, Method method, boolean z) {
        String str;
        this.A06 = javaModuleWrapper;
        this.A07 = method;
        method.setAccessible(true);
        Class<C13904TjR>[] parameterTypes = method.getParameterTypes();
        this.A08 = parameterTypes;
        int length = parameterTypes.length;
        if (z) {
            str = BaseJavaModule.METHOD_TYPE_SYNC;
        } else if (length > 0 && parameterTypes[length - 1] == C13904TjR.class) {
            str = BaseJavaModule.METHOD_TYPE_PROMISE;
        } else {
            return;
        }
        this.A02 = str;
    }
}
