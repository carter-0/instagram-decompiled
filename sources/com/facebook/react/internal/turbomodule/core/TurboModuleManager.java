package com.facebook.react.internal.turbomodule.core;

import X.002;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C13904TjR;
import X.C13947Tm7;
import X.C13948Tm8;
import X.Pxe;
import X.SMk;
import X.TQS;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.NativeMethodCallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public abstract class TurboModuleManager {
    public final HybridData mHybridData;

    private native HybridData initHybrid(RuntimeExecutor runtimeExecutor, CallInvokerHolderImpl callInvokerHolderImpl, NativeMethodCallInvokerHolderImpl nativeMethodCallInvokerHolderImpl, TurboModuleManagerDelegate turboModuleManagerDelegate);

    private native void installJSIBindings(boolean z);

    static {
        SMk.A00();
    }

    private CxxModuleWrapper getLegacyCxxModule(String str) {
        throw AnonymousClass00P.createAndThrow();
    }

    private NativeModule getLegacyJavaModule(String str) {
        throw AnonymousClass00P.createAndThrow();
    }

    public static List getMethodDescriptorsFromModule(NativeModule nativeModule) {
        String A0E;
        String str;
        String A0E2;
        Class<?> cls = nativeModule.getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (TurboModule.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        ArrayList A1C = AnonymousClass7TE.A1C();
        HashSet A1F = AnonymousClass7TE.A1F();
        for (Method method : declaredMethods) {
            Annotation annotation = method.getAnnotation(ReactMethod.class);
            String name = nativeModule.getName();
            String name2 = method.getName();
            if (annotation != null || "getConstants".equals(name2)) {
                if (!A1F.contains(name2)) {
                    A1F.add(name2);
                    Class<Dynamic>[] parameterTypes = method.getParameterTypes();
                    Class<?> returnType = method.getReturnType();
                    StringBuilder A16 = Pxe.A16("(");
                    for (Class<Dynamic> cls2 : parameterTypes) {
                        if (cls2 == Boolean.TYPE) {
                            A0E2 = "Z";
                        } else if (cls2 == Integer.TYPE) {
                            A0E2 = "I";
                        } else if (cls2 == Double.TYPE) {
                            A0E2 = "D";
                        } else if (cls2 == Float.TYPE) {
                            A0E2 = "F";
                        } else if (cls2 == Boolean.class || cls2 == Integer.class || cls2 == Double.class || cls2 == Float.class || cls2 == String.class || cls2 == Callback.class || cls2 == C13904TjR.class || cls2 == ReadableMap.class || cls2 == ReadableArray.class || cls2 == Dynamic.class) {
                            A0E2 = 002.A0E(cls2.getCanonicalName().replace('.', '/'), 'L', ';');
                        } else {
                            throw new TQS(name, name2, 002.A0R("Unable to parse JNI signature. Detected unsupported parameter class: ", cls2.getCanonicalName()));
                        }
                        A16.append(A0E2);
                    }
                    A16.append(")");
                    if (returnType == Boolean.TYPE) {
                        A0E = "Z";
                    } else if (returnType == Integer.TYPE) {
                        A0E = "I";
                    } else if (returnType == Double.TYPE) {
                        A0E = "D";
                    } else if (returnType == Float.TYPE) {
                        A0E = "F";
                    } else if (returnType == Void.TYPE) {
                        A0E = "V";
                    } else if (returnType == Boolean.class || returnType == Integer.class || returnType == Double.class || returnType == Float.class || returnType == String.class || returnType == C13948Tm8.class || returnType == C13947Tm7.class || returnType == Map.class) {
                        A0E = 002.A0E(returnType.getCanonicalName().replace('.', '/'), 'L', ';');
                    } else {
                        throw new TQS(name, name2, 002.A0R("Unable to parse JNI signature. Detected unsupported return class: ", returnType.getCanonicalName()));
                    }
                    String A0l = AnonymousClass7TF.A0l(A0E, A16);
                    int i = 0;
                    while (true) {
                        if (i < r4) {
                            if (parameterTypes[i] != C13904TjR.class) {
                                i++;
                            } else if (i == r4 - 1) {
                                str = "PromiseKind";
                            } else {
                                throw new TQS(name, name2, "Unable to parse JSI return kind. Promises must be used as last parameter only.");
                            }
                        } else if (returnType == Boolean.TYPE || returnType == Boolean.class) {
                            str = "BooleanKind";
                        } else if (returnType == Double.TYPE || returnType == Double.class || returnType == Float.TYPE || returnType == Float.class || returnType == Integer.TYPE || returnType == Integer.class) {
                            str = "NumberKind";
                        } else if (returnType == String.class) {
                            str = "StringKind";
                        } else if (returnType == Void.TYPE) {
                            str = "VoidKind";
                        } else if (returnType == C13948Tm8.class || returnType == Map.class) {
                            str = "ObjectKind";
                        } else if (returnType == C13947Tm7.class) {
                            str = "ArrayKind";
                        } else {
                            throw new TQS(name, name2, 002.A0R("Unable to parse JSI return kind. Detected unsupported return class: ", returnType.getCanonicalName()));
                        }
                    }
                    int i2 = 0;
                    while (true) {
                        if (i2 >= r4) {
                            break;
                        } else if (parameterTypes[i2] == C13904TjR.class) {
                            r4--;
                            if (i2 != r4) {
                                throw new TQS(name, name2, "Unable to parse JavaScript arg count. Promises must be used as last parameter only.");
                            }
                        } else {
                            i2++;
                        }
                    }
                    A1C.add(new TurboModuleInteropUtils$MethodDescriptor(name2, A0l, str, r4));
                } else {
                    throw new RuntimeException(002.A0u("Unable to parse @ReactMethod annotations from native module: ", name, ". Details: ", 002.A0R("Module exports two methods to JavaScript with the same name: \"", name2)));
                }
            }
        }
        return A1C;
    }

    private TurboModule getTurboJavaModule(String str) {
        throw AnonymousClass00P.createAndThrow();
    }

    private CxxModuleWrapper getTurboLegacyCxxModule(String str) {
        throw AnonymousClass00P.createAndThrow();
    }
}
