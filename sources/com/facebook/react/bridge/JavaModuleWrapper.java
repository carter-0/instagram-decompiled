package com.facebook.react.bridge;

import X.002;
import X.0et;
import X.0fc;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C10877Rzd;
import X.C13568Tco;
import X.Pxe;
import X.Pxg;
import X.QZD;
import X.RH1;
import X.SQp;
import com.facebook.systrace.SystraceMessage;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JavaModuleWrapper {
    public final ArrayList mDescs = AnonymousClass7TE.A1C();
    public final C13568Tco mJSInstance;
    public final ArrayList mMethods = AnonymousClass7TE.A1C();
    public final ModuleHolder mModuleHolder;

    public class MethodDescriptor {
        public Method method;
        public String name;
        public String signature;
        public String type;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Class<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Class<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Class<?>} */
    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebook.react.bridge.JavaModuleWrapper$MethodDescriptor, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void findMethods() {
        /*
            r10 = this;
            r1 = 8192(0x2000, double:4.0474E-320)
            java.lang.String r3 = "findMethods"
            r0 = -165039546(0xfffffffff629b246, float:-8.604629E32)
            X.0fc.A01(r1, r3, r0)
            com.facebook.react.bridge.ModuleHolder r0 = r10.mModuleHolder
            com.facebook.react.bridge.NativeModule r0 = r0.getModule()
            java.lang.Class r4 = r0.getClass()
            java.lang.Class r3 = r4.getSuperclass()
            java.lang.Class<com.facebook.react.turbomodule.core.interfaces.TurboModule> r0 = com.facebook.react.turbomodule.core.interfaces.TurboModule.class
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 == 0) goto L_0x0021
            r4 = r3
        L_0x0021:
            java.lang.reflect.Method[] r8 = r4.getDeclaredMethods()
            int r7 = r8.length
            r6 = 0
        L_0x0027:
            if (r6 >= r7) goto L_0x0073
            r9 = r8[r6]
            java.lang.Class<com.facebook.react.bridge.ReactMethod> r0 = com.facebook.react.bridge.ReactMethod.class
            java.lang.annotation.Annotation r0 = r9.getAnnotation(r0)
            com.facebook.react.bridge.ReactMethod r0 = (com.facebook.react.bridge.ReactMethod) r0
            if (r0 == 0) goto L_0x0070
            java.lang.String r3 = r9.getName()
            com.facebook.react.bridge.JavaModuleWrapper$MethodDescriptor r5 = new com.facebook.react.bridge.JavaModuleWrapper$MethodDescriptor
            r5.<init>()
            boolean r0 = r0.isBlockingSynchronousMethod()
            X.SQp r4 = new X.SQp
            r4.<init>(r10, r9, r0)
            r5.name = r3
            java.lang.String r3 = r4.A02
            r5.type = r3
            java.lang.String r0 = "sync"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0066
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x005d
            X.SQp.A01(r4)
        L_0x005d:
            java.lang.String r0 = r4.A01
            X.0Sd.A00(r0)
            r5.signature = r0
            r5.method = r9
        L_0x0066:
            java.util.ArrayList r0 = r10.mMethods
            r0.add(r4)
            java.util.ArrayList r0 = r10.mDescs
            r0.add(r5)
        L_0x0070:
            int r6 = r6 + 1
            goto L_0x0027
        L_0x0073:
            r0 = 960541033(0x3940b169, float:1.8376637E-4)
            X.0fc.A00(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.JavaModuleWrapper.findMethods():void");
    }

    public NativeMap getConstants() {
        String str = this.mModuleHolder.mName;
        0et A00 = SystraceMessage.A00(SystraceMessage.A00, "JavaModuleWrapper.getConstants", 8192);
        A00.A00(str, "moduleName");
        A00.A02();
        ReactMarker.logMarker(RH1.A0o, str, 0);
        BaseJavaModule module = getModule();
        0fc.A01(8192, "module.getConstants", -359872348);
        Map constants = module.getConstants();
        0fc.A00(8192, 1074781008);
        0fc.A01(8192, "create WritableNativeMap", -2004406670);
        ReactMarker.logMarker(RH1.A0D, str, 0);
        try {
            return Arguments.makeNativeMap(constants);
        } finally {
            ReactMarker.logMarker(RH1.A0C, str, 0);
            0fc.A00(8192, -600930734);
            ReactMarker.logMarker(RH1.A0n, str, 0);
            Pxg.A1A();
        }
    }

    public List getMethodDescriptors() {
        if (this.mDescs.isEmpty()) {
            findMethods();
        }
        return this.mDescs;
    }

    public BaseJavaModule getModule() {
        return (BaseJavaModule) this.mModuleHolder.getModule();
    }

    public String getName() {
        return this.mModuleHolder.mName;
    }

    public void invoke(int i, ReadableNativeArray readableNativeArray) {
        Throwable th;
        char c;
        StringBuilder A0n;
        int i2;
        ArrayList arrayList = this.mMethods;
        if (i < arrayList.size()) {
            SQp sQp = (SQp) arrayList.get(i);
            C13568Tco tco = this.mJSInstance;
            JavaModuleWrapper javaModuleWrapper = sQp.A06;
            String str = javaModuleWrapper.mModuleHolder.mName;
            Method method = sQp.A07;
            String A0g = 002.A0g(str, ".", method.getName());
            0et A00 = SystraceMessage.A00(SystraceMessage.A00, "callJavaModuleMethod", 8192);
            A00.A00(A0g, "method");
            A00.A02();
            int i3 = 0;
            try {
                if (!sQp.A03) {
                    SQp.A01(sQp);
                }
                if (sQp.A05 == null || sQp.A04 == null) {
                    th = new Error("processArguments failed");
                } else if (sQp.A00 == readableNativeArray.size()) {
                    int i4 = 0;
                    while (true) {
                        try {
                            C10877Rzd[] rzdArr = sQp.A04;
                            if (i3 < rzdArr.length) {
                                sQp.A05[i3] = rzdArr[i3].A00(tco, readableNativeArray, i4);
                                if (((QZD) sQp.A04[i3]).A00 != 0) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                i4 += i2;
                                i3++;
                            } else {
                                method.invoke(javaModuleWrapper.getModule(), sQp.A05);
                                Pxg.A1A();
                                return;
                            }
                        } catch (UnexpectedNativeTypeException | NullPointerException e) {
                            String message = e.getMessage();
                            if (((QZD) sQp.A04[i3]).A00 != 0) {
                                c = 1;
                            } else {
                                c = 2;
                            }
                            if (c > 1) {
                                A0n = AnonymousClass7TF.A0n("");
                                A0n.append(i4);
                                A0n.append("-");
                                A0n.append((i4 + 2) - 1);
                            } else {
                                A0n = AnonymousClass7TF.A0n("");
                                A0n.append(i4);
                            }
                            th = new RuntimeException(002.A13(message, " (constructing arguments for ", A0g, " at argument index ", A0n.toString(), ")"), e);
                        }
                    }
                } else {
                    th = new RuntimeException(002.A0o(A0g, " got ", " arguments, expected ", readableNativeArray.size(), sQp.A00));
                }
            } catch (IllegalAccessException | IllegalArgumentException e2) {
                th = Pxe.A0u(002.A0R("Could not invoke ", A0g), e2);
            } catch (InvocationTargetException e3) {
                if (e3.getCause() instanceof RuntimeException) {
                    th = (RuntimeException) e3.getCause();
                } else {
                    th = Pxe.A0u(002.A0R("Could not invoke ", A0g), e3);
                }
            } catch (Throwable th2) {
                Pxg.A1A();
                throw th2;
            }
            throw th;
        }
    }

    public JavaModuleWrapper(C13568Tco tco, ModuleHolder moduleHolder) {
        this.mJSInstance = tco;
        this.mModuleHolder = moduleHolder;
    }
}
